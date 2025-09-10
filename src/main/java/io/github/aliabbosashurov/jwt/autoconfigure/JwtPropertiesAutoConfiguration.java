package io.github.aliabbosashurov.jwt.autoconfigure;

import io.github.aliabbosashurov.jwt.JwtProperties;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Auto-configuration for enabling JWT support in Spring Boot applications.
 * <p>
 * The auto-configuration is lightweight and safe to include in any Spring Boot project.
 * It ensures that JWT properties are available for injection into services or components
 * that require them.
 *
 * @author Aliabbos Ashurov
 */
@AutoConfiguration
@EnableConfigurationProperties(JwtProperties.class)
@ConditionalOnProperty(prefix = "app.security.jwt", name = "enabled", havingValue = "true", matchIfMissing = true)
public class JwtPropertiesAutoConfiguration {
}
