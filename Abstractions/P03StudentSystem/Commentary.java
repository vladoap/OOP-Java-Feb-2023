package Abstractions.P03StudentSystem;

public enum Commentary {
    Excellent("Excellent student"),
    Average("Average student"),
    Low("Very nice person");

    private String studentType;


    Commentary(String studentType) {
        this.studentType = studentType;
    }

    @Override
    public String toString() {
        return studentType;
    }
}
