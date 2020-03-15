public class Scheduler {
    public static void main(String message,double delay) {
        SmsSender.send(message);
        try {
            Thread.sleep((long)(1000*60*60*(delay)));
        } catch(InterruptedException ex){
            System.exit(0);
        }
    }
}