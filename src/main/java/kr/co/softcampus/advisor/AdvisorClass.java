package kr.co.softcampus.advisor;


public class AdvisorClass {
	
	public void beforeMethod() {
		System.out.println("beforeMethod ȣ��");
	}
	
	public void afterMethod() {
		System.out.println("afterMethod ȣ��");
	}
	
	
	  public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
	  
	  System.out.println("aroundMethod ȣ��1");
	  
	  //������ �żҵ带 ȣ���Ѵ�. 
	  Object obj = pjp.proceed();
	  
	  System.out.println("aroundMethod ȣ��2");
	   
	   return obj;
	  
	  }
	 
	
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod ȣ��");
	}
	
	public void afterThrowingMethod(Throwable e1) {
		System.out.println("afterThrowingMethod");
		System.out.println(e1);
	}
}
