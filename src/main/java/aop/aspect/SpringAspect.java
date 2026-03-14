package aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SpringAspect {

	@After("execution(* orm.dao.StudentDaoImpl.loadAll())")
	public void printAfter() {
		System.out.println("Method Ended");
	}

	@Before("execution(* orm.dao.StudentDaoImpl.loadAll())")
	public void printBefore() {
		System.out.println("Method Started");
	}
}
