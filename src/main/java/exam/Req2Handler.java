package exam;

public class Req2Handler {
    public StringBuffer handle(StringBuffer str) {
        int i = 0;
        int j = 0;
        boolean isFound = false;
        for (i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                j = i + 3;
                while (j < str.length() && str.charAt(i) == str.charAt(j)) {
                    j++;
                    if (j >= str.length()) {
                        break;
                    }
                }
                str.delete(i, j);
                if (i != 0) {
                    str.insert(i, str.charAt(i - 1));
                }
                isFound = true;
            }
            if (isFound == true) {
                i = -1;
            }
            j = 0;
            isFound = false;
        }
        return str;
    }
}
