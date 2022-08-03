import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    Scanner sc = new Scanner(System.in);

    public int getInt(String msg, int min, int max){
        int i;
        while(true){
            System.out.print(msg);
            try{
                i = Integer.parseInt(sc.nextLine());
                if(i>=min&&i<=max){
                    break;
                }
            }catch (NumberFormatException ex){
                ex.printStackTrace();
            }
        }
        return i;
    }

    public String getString(String msg, String pattern){
        String str;
        Pattern p = Pattern.compile(pattern);
        while(true){
            System.out.print(msg);
            str = sc.nextLine();
            if(p.matcher(str).find()){
                break;
            }
            System.out.println("Invalid input");
        }
        return str;
    }
}
