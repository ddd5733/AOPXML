package kr.co.softcampus.advisor;


public class AdvisorClass {
	
	public void beforeMethod() {
		System.out.println("beforeMethod 호출");
	}
	
	public void afterMethod() {
		System.out.println("afterMethod 호출");
	}
	
	
	  public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
	  
	  System.out.println("aroundMethod 호출1");
	  
	  //원래의 매소드를 호출한다. 
	  Object obj = pjp.proceed();
	  
	  System.out.println("aroundMethod 호출2");
	   
	   return obj;
	  
	  }
	 
	
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod 호출");
	}
	
	public void afterThrowingMethod(Throwable e1) {
		System.out.println("afterThrowingMethod");
		System.out.println(e1);
	}
}
