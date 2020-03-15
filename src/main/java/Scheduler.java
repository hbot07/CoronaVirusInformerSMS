public class Scheduler {
    public static void main(String message) {
        try {
            Thread.sleep(1000*60*60*(4)); //4 hour delayer
        } catch(InterruptedException ex){
            System.exit(0);
        }
        SmsSender.send(message);
    }
}