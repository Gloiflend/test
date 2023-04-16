public class Build {
    public static void main(String[] args) {
        String s1= "Hello";
        String s2= "world";
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append(s1).append(" ").append(s2);
        System.out.println(stringBuilder);
    }
}
