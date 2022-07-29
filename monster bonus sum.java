// monster problem askd in infosys
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
        int energy = sc.nextInt();
        int[] monst = new int[t];
        int[] bonus = new int[t];
        int count=0;
        for(int i=0;i<t;i++)
        {
            monst[i] = sc.nextInt();
        }
        for(int i=0;i<t;i++)
        {
            bonus[i] = sc.nextInt();
        }
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<t;i++)
        {
            map.put(monst[i],bonus[i]);
        }
        for(Integer i: map.keySet())
        {
            if(i<=energy)
            {
                count++;
                energy+=map.get(i);
            }
        }
        System.out.print(count);
    }
}
// input
// 2
// 123
// 78
// 130
// 10
// 0

// output
// 2
