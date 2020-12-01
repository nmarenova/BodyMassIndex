public class BmiService {
    public double calculate(double growth, double weight) {
        return weight / (growth * growth) * 100.00;
    }
}


