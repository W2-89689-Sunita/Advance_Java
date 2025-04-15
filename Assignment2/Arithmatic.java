package com.sunbeam.dmc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Arithmatic {
	@Bean
	public arith a1 () {
		arith a1 = new arith();
		a1.setNum1(22);
		a1.setNum2(7);
		return a1;
	}
	@Bean
	public arith a2 () {
		arith a2 = new arith(22,7);
		return a2;
	}

	
}
