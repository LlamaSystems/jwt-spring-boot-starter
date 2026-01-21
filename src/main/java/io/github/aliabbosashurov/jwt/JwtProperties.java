package io.github.aliabbosashurov.jwt;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.time.Duration;

/// Configuration properties for JSON Web Token.
///
/// @author Aliabbos Ashurov
@ConfigurationProperties(prefix = "app.security.jwt")
public record JwtProperties(

        // Whether JWT support is enabled.
        @DefaultValue("true")
        boolean enabled,

        // Secret key for signing and verifying JWTs.
        String secretKey,

        // JWT expiration duration.
        @DefaultValue("60m")
        Duration expiration,

        // Refresh token expiration duration.
        @DefaultValue("7d")
        Duration refreshTokenExpiration,

        // Authorization header token prefix.
        @DefaultValue("Bearer")
        String tokenPrefix,

        //  HTTP header name.
        @DefaultValue("Authorization")
        String header,

        // JWT issuer.
        @DefaultValue("default-issuer")
        String issuer,

        //  JWT audience.
        @DefaultValue("all")
        String audience
) {
}