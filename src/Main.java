import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.util.Scanner;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;

public static void main(String[] args) {
    try {
        Scanner in = new Scanner(System.in);
        String city;
        do {
            System.out.println("===============================");
            System.out.println("Enter City (Say No to Quit): ");
            city = in.nextLine();

            // If the user doesn't want to quit
            if (city.equalsIgnoreCase("no")) {
                break;
            }

            //fetch weather data


        } while (!city.equalsIgnoreCase("no"));

        System.out.println("Goodbye!");
    } catch (Exception e) {
        e.printStackTrace();
    }
}
