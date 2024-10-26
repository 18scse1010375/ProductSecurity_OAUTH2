package com.res.server.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {



//    @Bean
//    public JwtDecoder jwtDecoder() {
//
//
//
//        // Replace with your actual Keycloak JWK Set URI
//        String jwkSetUri = "http://localhost:8080/realms/YT-DEV/protocol/openid-connect/certs";
//        return NimbusJwtDecoder.withJwkSetUri(jwkSetUri).build();
//    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity security) throws Exception {

        security.cors(AbstractHttpConfigurer :: disable) ;
        security.csrf(AbstractHttpConfigurer :: disable) ;

        security.authorizeHttpRequests(request->request.requestMatchers("/api/v1/**").authenticated()
                                       .anyRequest().permitAll()   ) ;

        security.oauth2ResourceServer(authServer->authServer.jwt(Customizer.withDefaults())) ;

            return security.build();
    }
}
