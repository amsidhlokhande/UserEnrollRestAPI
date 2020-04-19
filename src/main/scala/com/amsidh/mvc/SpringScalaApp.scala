package com.amsidh.mvc

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableJpaRepositories(Array("com.amsidh.mvc.respository"))
@SpringBootApplication
@EnableSwagger2
class SpringScalaApp{

}

object SpringScalaApp {
  def main(args: Array[String]): Unit = {
    val configClasses: Array[Class[_]] = Array(classOf[SpringScalaApp]);
    SpringApplication.run(configClasses, args)
  }
}
