public class Null {

    static String str;

    public static void main(String[] args){

        try {

            System.out.println(str.length());

        }catch (Exception e){

            System.out.println(e);
            System.out.println(e.getMessage());
        }


    }
}
