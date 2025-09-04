package io.github.aliabbosashurov.jwt.autoconfigure;

import io.github.aliabbosashurov.jwt.JwtProperties;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author Aliabbos Ashurov
 * @since 2025-09-04
 */
@AutoConfiguration
@EnableConfigurationProperties(JwtProperties.class)
public class JwtPropertiesAutoConfiguration {
}
