//package org.donie.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@EnableWebSecurity
//public class WebSecurityConfigTest extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    public void globalUserDetails(final AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("user").password("password").roles("USER");
//    }
//
//    @Override
//    @Bean
//    public AuthenticationManager authenticationManagerBean() throws Exception {
//        return super.authenticationManagerBean();
//    }
//
//    @Override
//    protected void configure(final HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/login").permitAll()
//                .antMatchers("/resources/**",	"/signup",	"/about").permitAll()
//                .antMatchers("/admin/**").hasRole("ADMIN")              //	以"/admin/"	开头的URL只能由拥有	"ROLEADMIN"角色的用户访问.
//                .antMatchers("/db/**").access("hasRole('ADMIN')	and	hasRole('DBA')")   //	任何以/db/开头的URL需要用户同时具有"ROLEADMIN"	和	"ROLE_DBA".
//                .anyRequest()
//                .authenticated()
//                .and()
//
//                .formLogin()
//                .permitAll();
//
//        http .logout()
//                .logoutUrl("/my/logout")
//                .logoutSuccessUrl("/my/index")
//                //.logoutSuccessHandler(logoutSuccessHandler)
//                .invalidateHttpSession(true);
//                //.addLogoutHandler(logoutHandler)
//                //.deleteCookies(cookieNamesToClear);
//
//    }
//
//
//
////  多个HttpSecurity
///*    @Configuration
//    @Order(1)
//    public static class ApiWebSecurityConfigurationAdapter extends WebSecurityConfigurerAdapter {
//        protected void configure(HttpSecurity http) throws Exception {
//            http.antMatcher("/api*//**")
//                    .authorizeRequests()
//                    .anyRequest().hasRole("ADMIN")
//                    .and()
//                    .httpBasic();
//        }
//    }
//
//    @Configuration
//    public static class FormLoginWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {
//        @Override
//        protected void configure(HttpSecurity http) throws Exception {
//            http.
//                    authorizeRequests()
//                    .anyRequest()
//                    .authenticated().
//                    and().
//                    formLogin();
//        }
//    }*/
//}
//
//
