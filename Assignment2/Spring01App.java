package com.sunbeam.dmc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Spring01App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Arithmatic.class);
		
		arith a1 = (arith) ctx.getBean("a1");
		int add = a1.add();
		System.out.println("a1 addition : " +add);
		
		/*arith a2 = (arith) ctx.getBean("a2");
		int  add1 = a2.add();
		System.out.println("a2 addition :" +add1);
		*/
		//Substraction
		arith a2 = (arith) ctx.getBean("a1");
		int sub = a1.sub();
		System.out.println("a1 substration : " +sub);
		
		//Multiplication
		arith a3 = (arith) ctx.getBean("a1");
		int mul = a1.multiply();
		System.out.println("a1 Multipliction : " +mul);
		
		//Division
		arith a4 = (arith) ctx.getBean("a1");
		int div = a1.sub();
		System.out.println("a1 divide : " +div);
		
		
		}

}
