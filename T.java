public class T {
    public static void main(String[] args) throws Exception {
		zinga
	  long start = System.currentTimeMillis();
        System.out.println("Jay Mataji... ");
		  //java.util.Map<String, String> env = System.getenv();
		  //env.forEach((k, v) -> System.out.println(k + ":" + v));
		
		  String myVar = System.getenv("MY_VAR");
		  System.out.println("first:"+myVar);
		String myVar1 = System.getenv("SECOND_VAR");
		System.out.println("second:"+myVar1);

		String myVar2 = System.getenv("MY_ACTIONS_SECRET");
		System.out.println("This is the secrets configuted on repository level:"+myVar2);


		String myVar3 = System.getenv("MY_ENVIRONMENT_ACTIONS_SECRET");
		System.out.println("This is the environment speficic secrets configuted:"+myVar3);	

      long end = System.currentTimeMillis();
      System.out.println("Time taken "+ (end - start));
    }
}
