package br.com.Api.CriandoApi; 

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Aplica a configuração para todos os endpoints da API
                
                // IMPORTANTE: Troque a URL abaixo pela URL do seu GitHub Pages
                .allowedOrigins("https://zxDuarte1github.io") 
                
                // Métodos HTTP permitidos
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                
                // Headers permitidos
                .allowedHeaders("*")
                
                // Define se o navegador pode enviar credenciais (como cookies)
                .allowCredentials(true); 
    }
}
