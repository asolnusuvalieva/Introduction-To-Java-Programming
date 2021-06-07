import java.util.Scanner;

public class ReadFileFromURL {
    public static void main(String[] args) {
        System.out.println("Enter a URL: ");
        String URLString = new Scanner(System.in).next();

        try{
            java.net.URL url = new java.net.URL(URLString);

        }catch(java.net.MalformedURLException ex){

        }
    }
}
