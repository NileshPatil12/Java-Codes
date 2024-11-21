
public class array {
    public static void main(String args[]){
            int a[][]={{1, 2, 3, 4, 5},
                        {5,6},
                        {7,8,9,0}};
            for(int l[] : a){
                for(int m:l){
                    System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}
