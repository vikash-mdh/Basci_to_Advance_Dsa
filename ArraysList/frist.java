package ArraysList;
import java.util.*;

public class frist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       ArrayList<Integer> list = new ArrayList<>();
       list.add(0, 20);
       list.add(1, 30);
       list.add(2, 40);
       list.add(3, 50);
       list.add(4, 60);

       for(int i = 0; i<list.size(); i++){
        System.out.print(list.get(i)+" "); // list.get(i);
       }
       System.out.println();
       list.add(5,90);
       list.add(2,87);

       for(int i = 0; i<list.size(); i++){
        System.out.print(list.get(i)+" "); // list.get(i);
       }

    }
}
