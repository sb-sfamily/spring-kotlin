package family.park.devops.cloud.messenger.config

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.jdbc.datasource.SimpleDriverDataSource


@Configuration
class MybatisConfig {
    private val logger = LoggerFactory.getLogger(MybatisConfig::class.java)

    @Bean
    fun dataSource(dataSourceProperties : DataSourceProperties) = SimpleDriverDataSource().apply {
        setDriverClass(org.mariadb.jdbc.Driver::class.java)
        url = dataSourceProperties.url
        username = dataSourceProperties.username
        password = dataSourceProperties.password

        logger.info("url={}, username={}, password={}", url, username, password)
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    fun dataSourceProperties() = DataSourceProperties()


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
