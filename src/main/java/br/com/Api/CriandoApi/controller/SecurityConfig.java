package br.com.Api.CriandoApi; // Verifique se seu package está correto

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            // 1. Habilita o CORS (ele vai usar a sua anotação @CrossOrigin no controller)
            .cors(withDefaults()) 
            
            // 2. Desabilita o CSRF (necessário para APIs com JS)
            .csrf(csrf -> csrf.disable()) 
            
            // 3. Autoriza todas as requisições (para permitir o POST e o OPTIONS)
            .authorizeHttpRequests(authz -> authz
                .requestMatchers("/**").permitAll() // Permite tudo
                .anyRequest().authenticated()
            );
            
        return http.build();
    }
}
