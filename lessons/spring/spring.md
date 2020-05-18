# Spring: 

## Annotations: 
  - **@SpringBootApplication** : This annotation is used to mark the main class of a Spring Boot application.

  ```
  @SpringBootApplication
  class CarSalesApplication {
  
      public static void main(String[] args) {
          SpringApplication.run(CarSalesApplication.class, args);
      }
  }

  ```
- **@EnableAutoConfiguration** : Enables auto-configuration. It means that Spring Boot looks for auto-configuration beans on its classpath and automatically applies them.

```
  @Configuration
  @EnableAutoConfiguration
  class CarSalesConfig {}
```
- **@ConditionalOnClass and @ConditionalOnMissingClass** :  Using these conditions, Spring will only use the marked auto-configuration bean if the class in the annotation's argument is present/absent.

```
@Configuration
@ConditionalOnClass(DataSource.class)
class MySQLAutoconfiguration {
    //...
}
```

- @ConditionalOnBean and @ConditionalOnMissingBean
These annotations are used when the conditions need to be defined based on the presence or absence of a specific bean:

@Bean
@ConditionalOnBean(name = "mydataSource")
LocalContainerEntityManagerFactoryBean entityManagerFactory() {
    // ...
}

- @ConditionalOnProperty
This annotation is used to specify conditions surrounding the values of properties:

@Bean
@ConditionalOnProperty(
    name = "sqlDBA",
    havingValue = "local"
)
DataSource dataSource() {
    // ...
}

- @ConditionalOnResource
The ConditionalOnResource annotations instruct Spring to use a definition only when a specific resource is present:

@ConditionalOnResource(resources = "classpath:mysql.properties")
Properties additionalProperties() {
	// ...
}

- @ConditionalOnWebApplication and @ConditionalOnNotWebApplication
This instructs Spring to create conditions depending on whether the application is or is not a web application:

@ConditionalOnWebApplication
HealthCheckController healthCheckController() {
    // ...
}

- @ConditionalExpression
This annotation is used in more complex situations. In the following example, Spring will use the marked definition when the SpEL expression is evaluated to true:

@Bean
@ConditionalOnExpression("${usemysql} && ${mysqlserver == 'local'}")
DataSource dataSource() {
    // ...
}

- @Conditional
This annotation is for even more complex conditions where a developer could create a class that evaluates the custom condition. They would instruct Spring to use the custom condition with @Conditional:

@Conditional(HibernateCondition.class)
Properties additionalProperties() {
    //...
}