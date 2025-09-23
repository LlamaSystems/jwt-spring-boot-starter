package io.github.aliabbosashurov.jwt;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.time.Duration;

/// Configuration properties for JSON Web Token.
///
/// @author Aliabbos Ashurov
@Getter
@Setter
@ConfigurationProperties(prefix = "app.security.jwt")
public class JwtProperties {

    /// Whether JWT support is enabled in the application.
    private Boolean enabled = true;

    /// Secret key for signing and verifying JWTs.
    private String secretKey;

    /// Duration after which the JWT expires.
    private Duration expiration = Duration.ofMinutes(60);

    /// Duration after which the refresh token expires.
    private Duration refreshTokenExpiration = Duration.ofDays(7);

    /// Prefix for the JWT in the HTTP Authorization header.
    private String tokenPrefix = "Bearer";

    /// HTTP header name for transmitting the JWT.
    private String header = "Authorization";

    /// Issuer claim for the JWT.
    private String issuer = "default-issuer";

    /// Audience claim for the JWT.
    private String audience = "all";
}