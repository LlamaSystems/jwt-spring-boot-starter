package io.github.aliabbosashurov.jwt;

import lombok.Getter;
import lombok.Setter;
import org.jspecify.annotations.NonNull;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.time.Duration;

/**
 * Configuration properties for JSON Web Token.
 *
 * @author Aliabbos Ashurov
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "app.security.jwt")
public class JwtProperties {

    /**
     * Whether JWT support is enabled in the application.
     */
    private @NonNull Boolean enabled = true;

    /**
     * Secret key for signing and verifying JWTs.
     */
    private @NonNull String secretKey;

    /**
     * Duration after which the JWT expires.
     */
    private @NonNull Duration expiration = Duration.ofMinutes(60);

    /**
     * Duration after which the refresh token expires.
     */
    private @NonNull Duration refreshTokenExpiration = Duration.ofDays(7);

    /**
     * Prefix for the JWT in the HTTP Authorization header.
     */
    private @NonNull String tokenPrefix = "Bearer";

    /**
     * HTTP header name for transmitting the JWT.
     */
    private @NonNull String header = "Authorization";

    /**
     * Issuer claim for the JWT.
     */
    private @NonNull String issuer = "default-issuer";

    /**
     * Audience claim for the JWT.
     */
    private @NonNull String audience = "all";
}