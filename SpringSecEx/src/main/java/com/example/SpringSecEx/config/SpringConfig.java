package com.example.SpringSecEx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity // go with this configuration
public class SpringConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

      //  http.csrf(customizer -> customizer.disable());

        //******* BEHIND THE SCENES*****************//
//        Customizer<CsrfConfigurer<HttpSecurity>> custCsrf = new Customizer<CsrfConfigurer<HttpSecurity>>() {
//            @Override
//            public void customize(CsrfConfigurer<HttpSecurity> customizer) {
//                customizer.disable();
//            }
//        };
//        http.csrf(custCsrf);


//        http.authorizeHttpRequests(request -> request.anyRequest().authenticated());
////        http.formLogin(Customizer.withDefaults());
//        http.httpBasic(Customizer.withDefaults());
//        http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));


//        return http.build();

        //****** SHORT CUT ********//
        return http
                .csrf(customizer -> customizer.disable())
                .authorizeHttpRequests(request -> request.anyRequest().authenticated())
                .httpBasic(Customizer.withDefaults())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .build();
    }

    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user1 = User
                .withDefaultPasswordEncoder()  // it is deprecated, don't use it in production
                .username("mansi")
                .password("m")
                .roles("USER")
                .build();

        UserDetails user2 = User
                .withDefaultPasswordEncoder()  // it is deprecated, don't use it in production
                .username("manashvi")
                .password("man")
                .roles("ADMIN")
                .build();
        return new InMemoryUserDetailsManager(user1,user2);
    }

}
