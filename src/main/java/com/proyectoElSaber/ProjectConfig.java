
package com.proyectoElSaber;

import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class ProjectConfig implements WebMvcConfigurer {

    /* Los siguientes métodos son para incorporar el tema de internacionalización en el proyecto */

 /* localeResolver se utiliza para crear una sesión de cambio de idioma */

    @Autowired
    private UserDetailsService userDetailsService;

    /* Métodos para internacionalización */

    @Bean
    public LocaleResolver localeResolver() {
        var slr = new SessionLocaleResolver();
        slr.setDefaultLocale(Locale.getDefault());
        slr.setLocaleAttributeName("session.current.locale");
        slr.setTimeZoneAttributeName("session.current.timezone");
        return slr;
    }

    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        var lci = new LocaleChangeInterceptor();
        lci.setParamName("lang");
        return lci;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
    }

    @Bean("messageSource")
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasenames("messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

    /* Métodos de seguridad */

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/admisiones").setViewName("admisiones");
        registry.addViewController("/clubes").setViewName("clubes");
        registry.addViewController("/personal").setViewName("personal");
        registry.addViewController("/quienesSomos").setViewName("quienesSomos");
        registry.addViewController("/servicios").setViewName("servicios");
    }
    
    

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((request) -> request
                        .requestMatchers("/", "/index","/admisiones","/clubes",
                                "/personal","/quienesSomos","/servicios","/contacto",
                                "/errores/**",
                                "/js/**", "/webjars/**")
                        .permitAll()
                        .requestMatchers("/registroEstudiantes")
                        .hasRole("ADMIN")
                        .requestMatchers("/notas")
                        .hasRole("ESTUDIANTE")
                        .anyRequest().authenticated()
                )
                .formLogin((form) -> form
                        .loginPage("/login").permitAll())
                .logout((logout) -> logout.permitAll());
        return http.build();
    }
    
    /* El siguiente método se utiliza para completar la clase no es 
    realmente funcional, la próxima semana se reemplaza con usuarios de BD */    
    @Bean
    public UserDetailsService users() {
        UserDetails ADMIN = User.builder()
                .username("juan")
                .password("{noop}123")
                .roles( "ADMIN")
                .build();
        UserDetails PROFESOR = User.builder()
                .username("rebeca")
                .password("{noop}456")
                .roles("PROFESOR")
                .build();
        UserDetails ESTUDIANTE = User.builder()
                .username("pedro")
                .password("{noop}789")
                .roles("ESTUDIANTE")
                .build();
        return new InMemoryUserDetailsManager(ESTUDIANTE, PROFESOR, ADMIN);
    }
    
}

