public class HealthProfileTest {
    public static void main(String[] args) {
        HealthProfile patient = new HealthProfile("Carol","Smith","Female",2001,23,
                2, 66.9 ,136);
        System.out.println("Name: " + patient.getFirstName() + " " + patient.getLastName() + "\nGender: " + patient.getGender()+
                "\nDate of Birth: " + patient.DOB() + "\nAge: " + patient.getAge() + "\nGender: " + patient.getGender()+
                "\nHeight: " + patient.getHeight() + "\nWeight: " + patient.getWeight() + "\nMaximum Heart Rate: "
        + patient.maximumHeartRate() + "\nBMI: " + patient.calcBMI() + "\nTarget heart rate range is: " +
                patient.targetHeart1() + "-" + patient.targetHeart2());
        System.out.println(patient.BMITable());
    }
}
