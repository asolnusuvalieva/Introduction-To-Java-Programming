import java.io.File;

public class ReplaceText {
    public static void main(String[] args) {
        //Check command line parameter usage
        if(args.length != 4){
            System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
            System.exit(1);
        }

        // Check if source file exists
        File sourceFile = new File(args[0]);
        if(!sourceFile.exists()){
            System.out.println("Source file " + args[0] + " doesn't exist");
            System.exit(2);
        }
    }
}
