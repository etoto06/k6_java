package J14;

import java.util.Arrays;

interface StringFunc2 {
    String[] modify(String s) throws EmptyStringException;
}

class EmptyStringException extends Exception {
    EmptyStringException() {
        super("빈 문자열");
    }
}

public class Test08_re {

    public static void main(String[] args) {

        String str = " korea, Australia, China, Germany , Spain, turkey";

        StringFunc2 sf = (s) -> {
            if (s.length() == 0)
                throw new EmptyStringException();
            return s.split(",");
        };

        try {
            String result[] = sf.modify(str);
            System.out.println(Arrays.toString(result));

            String str2 = "";
            String result2[] = sf.modify(str2);
            System.out.println(Arrays.toString(result2));
        } catch (EmptyStringException e) {
           // e.printStackTrace();
        	System.out.println(e.getMessage());
        }
    }
}
