class Sample {

  public static void main(String[] args) {
    System.out.print("Tesing args - ");
    String argStr = null;

    argStr = args[0];
    if(!argStr.equals("arg_without_space"))
      throw new IllegalArgumentException("Failed for : \"" + argStr + "\"");

    argStr = args[1];
    if(!argStr.equals("arg with space"))
      throw new IllegalArgumentException("Failed for : \"" + argStr + "\"");

    System.out.println("PASSED");
  }
}
