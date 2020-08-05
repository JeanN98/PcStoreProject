package net.PcStoreProject.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends  WebSecurityConfigurerAdapter {

	 @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http.authorizeRequests()
	            .antMatchers(
	                "/",
	            	"/registration**",
	                "/js/**",
	                "/css/**",
	                "/img/**",
	                "/h2-console/**",
	                "/webjars/**").permitAll()
	            .and().csrf().ignoringAntMatchers("/h2-console/**")
	            .and().headers().frameOptions().sameOrigin()
	            .and()
	            .formLogin()
	            .loginPage("/PcStore/login")
	            .permitAll()
	            .successForwardUrl("/PcStore/private")
	            .and()
	            .logout()
	            .permitAll()
	            .logoutRequestMatcher(new AntPathRequestMatcher("/PcStore/logout"))
	            .logoutSuccessUrl("/PcStore"); 
	    }
}
