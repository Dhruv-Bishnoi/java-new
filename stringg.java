
public class stringg {
    public static void main(String[] args) {
        
        String name1 = "hello";
        String name2 = "hello";
        System.out.println(name1);
        if (name1.compareTo(name2)==0) {
            System.out.println("is equal");
            
        }

        String name3 = " hello my name is dhruv bishnoi ";
        String namesub = name3.substring(7,11);
        System.out.println(namesub);
        System.out.println(name1.charAt(0));


        StringBuilder sb = new StringBuilder("dhruv bishnoi");

        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'b');
        System.out.println(sb);
        sb.insert(0, "d");
        System.out.println(sb);
        sb.delete(0, 2);


        sb.append("h")
    }
}
