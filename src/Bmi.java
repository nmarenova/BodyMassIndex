class BmiService {
    public double calculate(double growth, double weight) {
        return weight/(growth*growth)*100.00;
    }
}

public class Bmi {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 54;
        double growth = 16;
        double bmi = service.calculate(growth, weight);
        System.out.println(bmi);
    }
}

