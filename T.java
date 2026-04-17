public class T {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello and welcome!");
		  //java.util.Map<String, String> env = System.getenv();
		  //env.forEach((k, v) -> System.out.println(k + ":" + v));
		
		  String myVar = System.getenv("MY_VAR");
		  System.out.println("first:"+myVar);
		String myVar1 = System.getenv("SECOND_VAR");
		System.out.println("second:"+myVar1);
      for (int i = 1; i <= 5; i++) {
          System.out.println("Jay Mataji... " + i);
      }
      long start = System.currentTimeMillis();
      long end = System.currentTimeMillis();
      System.out.println("Time taken "+ (end - start));
    }
}
