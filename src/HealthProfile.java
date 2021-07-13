public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int yearOfBirth;
    private int dayOfBirth;
    private int monthOfBirth;
    private double height;
    private double weight;

    public HealthProfile(String firstName, String lastName, String gender, int yearOfBirth, int dayOfBirth, int monthOfBirth,
                         double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.height = height;
        this.weight = weight;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;

    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return 2021 - yearOfBirth;
    }

    public String DOB(){
        String DOB = getYearOfBirth() + "/" + getMonthOfBirth() + "/" + getDayOfBirth();
        return DOB;
    }

    public int maximumHeartRate() {
        return 220 - getAge();
    }

    public double targetHeart1() {
        return (0.5 * maximumHeartRate());
    }

    public double targetHeart2() {
        return (0.85 * maximumHeartRate());
    }

    public double calcBMI() {
        return (weight * 703)/ (height * height);
    }

    public String BMITable(){
       return ("BMI VALUES\nUnderweight: less than 18.5\nNormal: between 18.5 and 24.9\nOverweight: between 25 and 29.9\n" +
               "Obese: 30 or greater");
    }

}
