public class SalaryCalculator {
    double salary = 1000.0;
    public double salaryMultiplier(int daysSkipped) {

       return (daysSkipped >=5) ? 0.85 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
       return (productsSold >=20) ? 13 : 10;
    }    
    
    public double bonusForProductsSold(int productsSold) {
        double g;
        g = (productsSold >=20) ? 13 : 10;
        return productsSold*g;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        salary = salaryMultiplier(daysSkipped) * salary;
        salary+= bonusForProductsSold(productsSold);
        return salary = (salary>2000.0)? 2000.0: salary; 
    } 
}
