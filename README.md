# Spring without Spring boot

Install tomcat, start tomcat and copy war file to tomcat

## Configuration database mysql

```java
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/Blog");
        dataSource.setUsername("duchinh"); // Replace your
        dataSource.setPassword("231132"); // Replace your
        return dataSource;
    }
```

## Configuration views controller

```java
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
```
