/*package com.task.transactions.service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    @Bean
    public void configure(HttpSecurity http) throws Exception {

        http.csrf().disable().authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers(HttpMethod.POST,"/api/*").permitAll()
                .antMatchers(HttpMethod.GET,"/api/*").permitAll()
                .antMatchers(HttpMethod.PUT,"/api/*").permitAll()
                .antMatchers(HttpMethod.DELETE,"/api/*").permitAll()
                .anyRequest().authenticated();
    }

}*/