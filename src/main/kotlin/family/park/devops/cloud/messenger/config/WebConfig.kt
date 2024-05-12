package family.park.devops.cloud.messenger.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.Customizer
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.view.InternalResourceViewResolver
import kotlin.jvm.Throws


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = ["family.park.devops.cloud.messenger.web"])
class WebConfig {
    @Bean
    @Throws(Exception::class)
    fun securityFilterChain(http: HttpSecurity)=
        http.csrf{it -> it.disable()}.authorizeHttpRequests{
            it.requestMatchers("/**").permitAll()
        }.formLogin(Customizer.withDefaults()).build()

    @Bean
    fun viewResolver() = InternalResourceViewResolver().apply{
        setPrefix("/WEB-INF/jsp/")
        setSuffix(".jsp")
        order = 2
    }
}