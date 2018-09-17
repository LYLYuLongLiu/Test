/**
 * <p>ClassName: Main</p>
 * <p>Description:</p>
 *
 * @author 刘玉龙
 * @version 1.0
 * @date 2018/9/9 11:16
 */
public class Main {

    public static void main(String[] args) {
        Digui d = new Digui();
        System.out.println(d.swit(7));
    }
}

class Digui{
    public int swit(int x){
        int sum=0;

        if(x==1) {
            sum +=10;
            return sum;
        }
        else {
            sum+=2;
            sum += swit(x-1);
        }
        return sum;

    }
}
