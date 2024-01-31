package superKeyword;

class a{
    int x = 10;
}
class b extends a{
    int x= 20;
    public void print(){
        System.out.println(super.x);
    }

}
public class SuperKeyword  {
    public static void main(String args[]){
        b obj = new b();
        obj.print();
    }

}
