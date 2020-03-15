import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.println("How frequently do you want to receive the updates? Enter delay between two updates(in hours)");
        double delay=sc.nextDouble();
        while(true){
            URL stockURL = new URL("https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_19-covid-Confirmed.csv");
            BufferedReader in = new BufferedReader(new InputStreamReader(stockURL.openStream()));
            String s;
            int i=0;
            while(!(s=in.readLine()).contains("India")) {
            }
            Scheduler.main("Number of confirmed cases in India: "+s.substring(s.lastIndexOf(",")+1),delay);
        }
    }
}