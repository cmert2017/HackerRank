package extra.from_nadir;

public class Test {
    public static void main(String[] args) {
        String str = "aa34bbb4ccc6d";
        int sum = 0;
        String temp ="";
        for (int i=0; i<str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                temp += str.charAt(i);
            }else{
                if (!temp.equals("")) {
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
        System.out.println(sum);
    }
}
