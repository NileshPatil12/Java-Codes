class a
{
    int abc;
    int sdf;
    a(){
        System.out.println(abc);
        System.out.println(sdf);
    }
    void getName(int data1,int data2){
        abc=data1;
        sdf=data2;
    }
    void printName(){
        System.out.println(abc);
        System.out.println(sdf);
    }
}

class b extends a
{
        b()
        {
            super();
            System.out.println(abc);
            System.out.println(sdf);
        }
}

public class ConstructorOperations {
    public static void main(String args[])
    {
        a nilesh=new b(); 
        nilesh.getName(12,23);
        nilesh.printName();
    }
}