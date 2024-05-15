package family.park.devops.cloud.messenger.config

import com.zaxxer.hikari.HikariDataSource
import org.apache.ibatis.session.SqlSessionFactory
import org.mybatis.spring.SqlSessionFactoryBean
import org.mybatis.spring.SqlSessionTemplate
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.io.ResourceLoader
import javax.sql.DataSource


@Configuration
class MybatisConfig {
    private val logger = LoggerFactory.getLogger(MybatisConfig::class.java)

    @Bean
    fun dataSource(dataSourceProperties : DataSourceProperties) = HikariDataSource().apply {
        jdbcUrl = dataSourceProperties.url
        username = dataSourceProperties.username
        password = dataSourceProperties.password
        driverClassName = dataSourceProperties.driverClassName
        maximumPoolSize = 10
        poolName = "member-pool"
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    fun dataSourceProperties() = DataSourceProperties()

    @Bean
    fun sqlSessionFactory(dataSource : DataSource
                          , applicationContext : ApplicationContext
                          , resourceLoader: ResourceLoader
    ) = SqlSessionFactoryBean().apply {
        logger.info(resourceLoader.getResource("classpath:/config/sql/mybatis.config.xml").file.absolutePath)
        setDataSource(dataSource)
        setConfigLocation( resourceLoader.getResource("classpath:/config/sql/mybatis.config.xml"))
        setMapperLocations(
            *applicationContext.getResources("classpath:/config/sql/mappers/**/*.mapper.xml")
        )


        //setConfiguration(configuratior())
        // setConfigLocation(applicationContext.getResource("classpath:/config/sql/mybatis.config.xml"))
    }.`object`


        @Bean
        @Throws(java.lang.Exception::class)
        fun sqlSessionTemplate(sqlSessionFactory : SqlSessionFactory) = SqlSessionTemplate(sqlSessionFactory)
}
/*

data class DataSourceProperties(
    *//**
     * Fully qualified name of the JDBC driver. Auto-detected based on the URL by default.
     *//*
    val driverClassName: String

    *//**
     * JDBC URL of the database.
     *//*
    , val url: String

    *//**
     * Login username of the database.
     *//*
    ,val username: String

    *//**
     * Login password of the database.
     *//*
    ,val password: String
)*/

//url: jdbc:mariadb://localhost:13306/sbapi
//username: sbapi
//password: 678678as
//driver-class-name: org.mariadb.jdbc.Driver
