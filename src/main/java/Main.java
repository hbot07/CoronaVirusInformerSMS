import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {
        String st = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_19-covid-Confirmed.csv";
        URL stockURL = new URL(st);
        BufferedReader in = new BufferedReader(new InputStreamReader(stockURL.openStream()));
        String s;
        int i=0;
        while(!(s=in.readLine()).contains("India")) {
        }
        while(true)
            Scheduler.main("Number of confirmed cases in India: "+s.substring(s.lastIndexOf(",")+1));
    }
}