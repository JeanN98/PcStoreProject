package net.jpnv.PcStoreProject.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;



@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter  {

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
            .loginPage("/PcStore")
            .permitAll()
            .successForwardUrl("/PcStore/private")
            .and()
            .logout()
            .permitAll()
            .logoutRequestMatcher(new AntPathRequestMatcher("/PcStore/logout"))
            .logoutSuccessUrl("/PcStore");
	    }
	 
	    @Autowired
	    public void configureGlobal(AuthenticationManagerBuilder auth) 
	      throws Exception {
	        auth
	          .inMemoryAuthentication()
	          .withUser("admin").password(passwordEncoder().encode("admin")).roles("ADMIN");
	        
	        auth
	        .inMemoryAuthentication()
	        .withUser("tecnico").password(passwordEncoder().encode("tecnico")).roles("TECNICO");
	        
	        auth
	        .inMemoryAuthentication()
	        .withUser("cliente").password(passwordEncoder().encode("cliente")).roles("CLIENTE");
	        }
	    
	      @Bean
	      public BCryptPasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	      }
}
