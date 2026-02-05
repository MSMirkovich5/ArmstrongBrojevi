public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            if (i < 10){
                if (Math.pow(i,3)==i){
                    System.out.println(i);
                }
            }
            else if (i < 100){
                if ((Math.pow(i/10,3)+Math.pow(i%10,3))==i){
                    System.out.println(i);
                }
            }
            else if (i < 1000){
                if ((Math.pow(i/100,3)+Math.pow(i%10,3)+Math.pow((i/10)%10,3))==i){
                    System.out.println(i);
                }
            }
            else if (i < 10000){
                if ((Math.pow(i/1000,3)+Math.pow(i%10,3)+Math.pow((i/10)%10,3)+Math.pow((i/100)%10,3)==i)){
                    System.out.println(i);
                }
            }
        }
    }
}
