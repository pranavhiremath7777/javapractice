public class strings{
    public void main(String args[]){
        // Strings are immutable in Java
        //string methods
        String name = "  Pranav          ";

        System.out.println(name.toUpperCase());

        System.out.println(name.toLowerCase());

        System.out.println(name.trim());

        System.out.println(name.substring(2, 5));

        System.out.println(name.length());

        System.out.println(name.replace('a', 'e'));

        System.out.println(name.charAt(0));
        
        System.out.println(name.startsWith("  P"));

        System.out.println(name.endsWith("  P"));

        System.out.println(name.indexOf("P\n"));

        System.out.println( name.lastIndexOf("a\n"));

        System.out.println(name.equals("Pranav\n"));

    }
}