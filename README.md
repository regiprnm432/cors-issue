# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.15/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.15/maven-plugin/reference/html/#build-image)

## `Case Study`

## 1. Cors Issue
CORS, atau Cross-Origin Resource Sharing, adalah mekanisme keamanan yang diterapkan oleh browser web untuk mengontrol permintaan HTTP dari satu asal (origin) ke asal yang berbeda. Asal (origin) adalah kombinasi dari protokol (seperti HTTP atau HTTPS), domain, dan port yang digunakan oleh aplikasi web. Mekanisme ini dirancang untuk mencegah ancaman keamanan yang disebabkan oleh permintaan lintas asal yang tidak sah
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange)

Problem

> Ketika User akan hit api yang telah dibuat oleh BE melalui Aplikasi FE/Browser permintaan untuk hit api akan terblok oleh cors Tetapi untuk hit api dari postman maka cors tidak akan berfungsi

DoD

> Api dapat berjalan dengan baik ketika di hit dari aplikasi FE/Browser maupun dari postman
