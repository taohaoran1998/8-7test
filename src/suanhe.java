public class suanhe {
    public static void main(String[] args)throws Exception{
        YiDaoShi yidaoshi=new YiDaoShi();
        Thread thread1=new Thread(yidaoshi);
        ShiYiDaoErShi shiyidaoershi=new ShiYiDaoErShi();
        Thread thread2=new Thread(shiyidaoershi);
        thread1.start();
        thread2.start();
        while (yidaoshi.getsum1() == 0){
            Thread.sleep(1000);
        }
        System.out.println(yidaoshi.getsum1());
        while (shiyidaoershi.getsum2() == 0){
            Thread.sleep(1000);
        }
        System.out.println(shiyidaoershi.getsum2());
        System.out.println("运算结果"+(yidaoshi.getsum1()+shiyidaoershi.getsum2()));
    }

}
class YiDaoShi implements Runnable{
    private int sum1;
    public void run(){
        for(int i=0;i<11;i++){
            sum1=sum1+i;
        }
    }
    public int getsum1(){
        return sum1;
    }

}
class ShiYiDaoErShi implements Runnable{
    private int sum2;
    public void run(){
        for(int i=0;i<21;i++){
            sum2=sum2+i;
        }
    }
    public int getsum2(){
        return sum2;
    }
}