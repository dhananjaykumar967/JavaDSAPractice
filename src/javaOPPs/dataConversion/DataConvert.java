package javaOPPs.dataConversion;

public class DataConvert {
    public static void main(String[] args) {
        String x = "100";
        System.out.println(x + 20);


        // Wrapper class
        int i = Integer.parseInt(x);
        System.out.println(i + 20);

//        String t = "200A";
//        int j = Integer.parseInt(t); // Exception: NumberFormatException----->
//        System.out.println(j+20);

        String y = "12.33";
        double s = Double.parseDouble(y);
        System.out.println(s + 20);

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        String execute = "true";
//        if(execute){ /// this will return the issue as execute is not the boolean and has to be boolean first.
//
//        }
        boolean flag = Boolean.parseBoolean(execute); // to convert it to boolean first and execute.
        if (flag) {
            System.out.println("execute the code");
        }

        int p = 200;
        System.out.println(p);
        // now convert to integer value into String
        String value = String.valueOf(p);
        System.out.println(value);

        boolean fg = true;
        String fgString = String.valueOf(fg); // Converting Boolean to String value.
        System.out.println(fgString);

        System.out.println("=============== isBlank && isEmpty ================");
        String tr = "";
        System.out.println(tr.isEmpty());
        System.out.println(tr.isBlank());
        tr = "a";
        System.out.println(tr.isEmpty());
        System.out.println(tr.isBlank());
    }
}
