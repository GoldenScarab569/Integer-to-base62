/**
 * Created by Spen's Beast on 02/03/2018.
 */
public class ImgurStyleLinksApp {
    private static String[] base62 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
    private static int[] input = {187621, 237860461,2187521,18752};
    public static void main(String[] args){
        convertBase62(input[0]);
        convertBase62(input[1]);
        convertBase62(input[2]);
        convertBase62(input[3]);

    }

    private static String convertBase62(int input){
        String output = "";
        int workingInput = input;
        while(workingInput > 62){
            int remainder = workingInput%62;
            output = output + base62[remainder];
            workingInput = workingInput/62;
        }
        output = output + base62[workingInput];
        System.out.println(output);
        return output;
    }
}
