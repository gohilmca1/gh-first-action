public class C {
    public static void main(String[] args) throws Exception {
//zinga
	  long start = System.currentTimeMillis();
        System.out.println("Jay Mataji... from Java file");

	 	String myVar = System.getenv("MY_VAR");
	  System.out.println("first:"+myVar);

      long end = System.currentTimeMillis();
      System.out.println("Time taken "+ (end - start));
    }
}
