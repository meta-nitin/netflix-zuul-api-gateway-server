package org.self.netflixzuulapigatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class NetflixZuulApiGatewayServerApplication {

	/**
	 * In order to intercept a call via Zuul gateway use the url as  :
	 * 
	 * http://localhost:8765/{app-name}/uri
	 * where localhost:8765 is the host and port where zuul is deployed
	 * 		 app-name is the Eureka application-name
	 * 		 uri is the url of Eureka client which you want to access
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(NetflixZuulApiGatewayServerApplication.class, args);
	}

	/**
	 * Method for Sleuth to enable ALWAYS TRACING
	 * 
	 * @return
	 */
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
