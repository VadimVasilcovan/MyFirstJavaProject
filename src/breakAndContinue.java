public class breakAndContinue {
    public static void main(String[] args) throws InterruptedException {

        // break = break out of a loop (STOP)
        // continue = skip current iteration of a loop (SKIP)


        for(int i = 1; i <=10; i++){
            if(i==5){
                continue;
            }
                Thread.sleep(300);
            System.out.println(i + "");
        }
    }
}
