package javaOPPs.interfaceOOPs;

/** Here is proved that one class can extends one Parent CLASS, but implements multiple interfaces with "," separate.*/
public class FortisHospital extends Hospital implements UsMedical, UkMedical, IndianMedical{

    int MIN_FEE= 50;

    @Override
    public void physioServices() {
        System.out.println("fortis hospital -- physio services");
    }

    @Override
    public void physioServices(int a) {

    }

    @Override
    public void oncologyServices() {
        System.out.println("fortis hospital -- oncology services");
    }

    @Override
    public void dentalServices() {
        System.out.println("fortis hospital -- dental services");
    }

    @Override
    public void emergencyServices() {

    }

    @Override
    public void gynecServices() {
        System.out.println("fortis hospital -- gynec services");
    }

    @Override
    public void pediaServices() {
        System.out.println("fortis hospital -- pedia services");
    }

    // Common method
    @Override
    public void gastroServices() {
        System.out.println("fortis hospital -- gastro services");
    }

    @Override
    public void helpDesk(){
        System.out.println("US -- helpDesk");
    }

    public void pathologyServices(){
        System.out.println("Fortis hospital -- pathologyServices");
    }

    @Override
    public void covidVaccination() {
        System.out.println("fortis hospital -- covid vaccination");
    }
}
