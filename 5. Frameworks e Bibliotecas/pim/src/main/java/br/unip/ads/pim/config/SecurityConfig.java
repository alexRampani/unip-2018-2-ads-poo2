package br.unip.ads.pim.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private AuthProvider authProvider;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// Configuracao do provider customizado de autenticacao
		auth.authenticationProvider(authProvider);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// Restringe acesso atravez do conceito Basic Authentication na API REST (HTTP)
		http.authorizeRequests().antMatchers("/api/**").authenticated().and().httpBasic();
		// Por simplicidade, desabilita o CSRF (Cross-Site Request Forgery)
		http.csrf().disable();
	}
}
