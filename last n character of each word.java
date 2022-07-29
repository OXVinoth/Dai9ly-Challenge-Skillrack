public class Main {
    public static void main(String[] args) {
        int x=3;
         String s="apple mango orange";
        String[] k = s.split(" ");
        
        for(String a : k)
        {
            char[] t = a.toCharArray();
            for(int i=t.length-x;i<t.length;i++)
            {
                System.out.print(t[i]);
            }
            System.out.print(" ");
        }
    }
}
