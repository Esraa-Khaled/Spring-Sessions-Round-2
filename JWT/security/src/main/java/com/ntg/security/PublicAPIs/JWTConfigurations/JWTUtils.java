package com.ntg.security.PublicAPIs.JWTConfigurations;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Objects;

@Component
public class JWTUtils {

    private static long EXPIRATION = 10*60*1000;
    private static String SECRET_KEY = "RFDSCXZczxcPK";
    public AuthnticationResponse genrateToken(String username, String host, String agent) {
        HashMap<String, Object> claims = new HashMap<>();
        claims.put("tokenHost", host);
        claims.put("userAgent", agent);
        String token =
                Jwts.builder().setSubject(username)
                .setClaims(claims)
                .setIssuer(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION))
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                        .compact();
        return new AuthnticationResponse(token);
    }

    public boolean validateToken(String jwtToken, String host, String agent) {
       Claims claims = getInformationFromToken(jwtToken);
       Date expirationDate = getDateFromTokenClaims(claims);
       String requestAgent = getInfoFromTokenClaims(claims, "userAgent");
       String tokenHost = getInfoFromTokenClaims(claims, "tokenHost");
       return (Objects.equals(agent, requestAgent) && Objects.equals(host, tokenHost) && !expirationDate.before(new Date()));
    }

    private static Date getDateFromTokenClaims(Claims claims) {
        return claims.getExpiration();
    }

    private static String getInfoFromTokenClaims(Claims claims, String key) {
        return claims.get(key).toString();
    }

    private Claims getInformationFromToken(String jwtToken) {
        return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(jwtToken).getBody();
    }

    public String getUserFromToken(String token) {
        Claims claims = getInformationFromToken(token);
        return claims.getIssuer();
    }
}
