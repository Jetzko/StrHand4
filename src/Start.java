public class Start {
    public static void main(String[] args) {
        String veryLongString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";
   veryLongString = veryLongString.replaceAll("um", "UM");

   String sub1 = veryLongString.substring(0, veryLongString.indexOf("aliquip"));
   String sub2 = veryLongString.substring(veryLongString.indexOf("aliquip"));
   System.out.println("First part: " + sub1);
   System.out.println(" ");
   System.out.println("Second part: " + sub2);
   System.out.println(" ");
   System.out.println();
    }
}
