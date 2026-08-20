package javaOPPs.exceptionHandlingConcept;

public class ErrorExample {
    public static void main(String[] args) {
        System.out.println("Before Bye.....");
//
//        try{
//            int i=9/0;
//        }
////        catch (Error e){// not use Error class to handle Exception as it will not handle the Exception to the code
////            System.out.println("Error occurred....");
////        }
//        catch (Throwable e){ // Throwable is the super class of th Exception and Error Class.
//            System.out.println("throwable ....");
//            e.printStackTrace();
//        }

        ErrorExample errorExample=new ErrorExample();
//        try{
//            errorExample=null;
//            System.out.println(errorExample);
//        }catch (NullPointerException e){
//            System.out.println("NP exception....");
//            e.printStackTrace();
//        }
        errorExample=null;

        System.out.println("After Bye.....");
    }
}
