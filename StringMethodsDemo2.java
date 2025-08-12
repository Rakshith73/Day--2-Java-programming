public class StringMethodsDemo2 {
    public static void main(String[] args) {
        String str = "Hello World";
	String str2="Hello World";

        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring (0-5): " + str.substring(0, 5));
        System.out.println("Contains 'World': " + str.contains("World"));
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("Ends with 'World': " + str.endsWith("World"));
        System.out.println("Index of 'o': " + str.indexOf('o'));
        System.out.println("Char at index 4: " + str.charAt(4));
	System.out.println("equals: " + str.equals(str2));
    }
}
