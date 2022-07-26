import java.util.Scanner;

public class buoi3_bai2 {

    public static String removeSpace(String s) {
        String result = "";
        result += s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            result += (s.charAt(i) == ' '?s.charAt(i - 1) == ' '?"":' ':s.charAt(i));
        }
        return result;
    }

    public static String removeNumber(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result += ((s.charAt(i) < '0' || s.charAt(i) > '9')?s.charAt(i):"");
        }
        return result;
    }

    public static String upperFirstCharacter(String s) {
        String ss = ' ' + s;
        String result = "";
        for (int i = 1; i < ss.length(); i++) {
            result += ((ss.charAt(i) != ' ' && ss.charAt(i - 1) == ' ')?
                    toUpperCaseCharacter(ss.charAt(i)):toLowerCaseCharacter(ss.charAt(i)));
        }
        return result;
    }

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String s = scanner.nextLine();
        s = removeNumber(s); // xoa cac ki tu so
        s = trim(s); // xoa khoang trang dau cuoi
        s = removeSpace(s); // xoa khoang trang bi thua
        s = upperFirstCharacter(s); // in hoa cac ki tu dau
        System.out.println("Chuỗi sau khi được định dạng là: \n" + upperFirstCharacter(s));
    }
    public static String removeCharAt(int index, String s) {
        return getSubtringByLength(0, index, s)
                + getSubtringByLength(index + 1, s.length() - index - 1, s);
    }

    public static String insertCharAt(int index, char c, String s) {
        return getSubtringByLength(0, index, s) + c
                + getSubtringByLength(index, s.length() - index, s);
    }

    public static String getSubtringByIndex(int beginIndex, int endIndex, String s) {
        String result = "";
        for (int i = beginIndex; i <= endIndex; i++) {
            result += s.charAt(i);
        }
        return result;
    }
    public static String getSubtringByLength(int beginIndex, int length, String s) {
        String result = "";
        for (int i = beginIndex; length > 0; length--, i++) {
            result += s.charAt(i);
        }
        return result;
    }

    public static Character toUpperCaseCharacter(Character c) {
        return ((c >= 'a' && c <= 'z')? (char)((int)c - ('a' - 'A')):c);
    }

    public static Character toLowerCaseCharacter(Character c) {
        return ((c >= 'A' && c <= 'Z')? (char)((int)c + ('a' - 'A')):c);
    }

    public static String toUpperCase(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result += toUpperCaseCharacter(s.charAt(i));
        }
        return result;
    }

    public static String toLowerCase(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result += toLowerCaseCharacter(s.charAt(i));
        }
        return result;
    }

    public static String trim(String s) {
        String result = s;
        while(result.charAt(0) == ' ') {
            result = removeCharAt(0, result);
        }
        while (result.charAt(result.length() - 1) == ' ') {
            result =  removeCharAt(result.length() - 1, result);
        }
        return result;
    }
}


