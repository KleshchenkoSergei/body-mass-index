public class BmiService {
    public double calculate(double weight, double height) {
        //BMI = m / H^2
        double bodyMassIndex = weight / height / height;
        return bodyMassIndex;
    }


}
