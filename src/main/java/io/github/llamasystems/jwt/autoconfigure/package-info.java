/// Auto-configuration for JWT
///
/// Auto-configuration for enabling JWT support in Spring Boot applications.
///
/// Features
/// - Registers and binds [`JwtProperties`](../jwt/JwtProperties.java)
///   from `application.yml` / `application.properties`.
/// - Activates automatically when
///   `app.security.jwt.enabled=true` (default is enabled).
/// - Allows applications to inject JWT-related configuration without
///   additional setup.
///
/// Nullability
/// All classes in this package are [`@NonNull`](https://jspecify.dev)
/// by default, due to {@link org.jspecify.annotations.NullMarked}.
@NullMarked
package io.github.llamasystems.jwt.autoconfigure;

import org.jspecify.annotations.NullMarked;