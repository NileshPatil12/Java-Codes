//variable argument means we can give number of input to the procedure as arguments ...a means it stores in an array of a[]={,,,,,};
class display
{
    public int add(int ...n){
        int sum=0;
        for(int j: n){
            sum=sum+j;
        }
        return sum;
    }
}


public class varargs {
    public static void main(String args[]){
        display d=new display();
        int a=d.add(1,2,3,4,10);
        System.out.println(a);
    }
    
}
