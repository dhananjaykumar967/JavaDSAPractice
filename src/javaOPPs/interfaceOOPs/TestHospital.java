package javaOPPs.interfaceOOPs;

public class TestHospital {
    public static void main(String[] args) {
        FortisHospital f = new FortisHospital();
        f.physioServices();
        f.oncologyServices();
        f.dentalServices();
        f.emergencyServices();
        f.gynecServices();
        f.pediaServices();
        f.gastroServices();
        f.pathologyServices();

        UsMedical usMedical = new FortisHospital();
        usMedical.physioServices();
        usMedical.oncologyServices();
        usMedical.dentalServices();
        usMedical.emergencyServices();

        System.out.println("US medical fee " + UsMedical.MIN_FEE);
        System.out.println("UK medical fee " + UkMedical.MIN_FEE);
        System.out.println("Indian medical fee " + IndianMedical.MIN_FEE);

        UkMedical ukMedical = (UkMedical) usMedical; // normal casting--- this means only UkMedical related methods will be accessed but
        //..... with casting usMedial; that also means that usMedical reference variable can still access its methods.
        // e.g.,
        usMedical.helpDesk();
        usMedical.oncologyServices();

//        FortisHospital fortisHospital = new usMedical(); ----> not possible to create object.
    }
}
