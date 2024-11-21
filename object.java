class nilesh
{
    int abc;
    int efg;
}



public class object {
    public static void main(String args[]){
            nilesh a[]=new nilesh[2];
            a[0]=new nilesh();
            a[1]=new nilesh();


            a[0].abc=12;
            a[0].efg=13;
            System.out.println(a[0].abc);
            System.out.println(a[0].efg);
            a[1].abc=10;
            a[1].efg=9;
            System.out.println(a[1].abc);
            System.out.println(a[1].efg);
            
    }
}