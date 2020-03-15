public class Scheduler {
    public static void main(String message,int delay) {
        try {
            Thread.sleep(1000*60*60*(delay));
        } catch(InterruptedException ex){
            System.exit(0);
        }
        SmsSender.send(message);
    }
}