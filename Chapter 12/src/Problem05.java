import java.io.File;

public class Problem05 {
    public static void main(String[] args) {
        if(args.length != 2){
            System.err.println("Usage: java Problem05 <Text To Remove> <File To Process>");
            System.exit(-1); //unsuccessful program completion (any other number than 0)
        }

        File fileToProcess = new File(args[1]);
        if(!fileToProcess.exists()){
            System.out.printf("File '%s' doesn't exist.%n", args[1]);
            System.exit(-1);
        }
    }
}
