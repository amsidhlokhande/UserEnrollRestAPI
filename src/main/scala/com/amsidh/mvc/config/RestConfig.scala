package com.amsidh.mvc.config

import org.springframework.context.annotation.{Bean, Configuration}
import org.springframework.web.cors.{CorsConfiguration, UrlBasedCorsConfigurationSource}
import org.springframework.web.filter.CorsFilter


@Configuration
class RestConfig {

  @Bean
  def corsFilter(): CorsFilter = {
    var source = new UrlBasedCorsConfigurationSource();
    var config = new CorsConfiguration();
    config.setAllowCredentials(true)
    config.addAllowedOrigin("*")
    config.addAllowedHeader("*")
    config.addAllowedMethod("OPTIONS")
    config.addAllowedMethod("GET")
    config.addAllowedMethod("POST")
    config.addAllowedMethod("PUT")
    config.addAllowedMethod("DELETE")
    source.registerCorsConfiguration("/**", config);
    var corsFilter: CorsFilter = new CorsFilter(source)
    corsFilter;
  }
}
