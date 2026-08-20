package javaOPPs.records;

import org.jetbrains.annotations.NotNull;

///  records data created immutable variables.
public record Student(int id,String name, String mobileNumber, String address) {
    @NotNull
    @Override
    public String toString() {
        return "";
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
