public class AutoServiceCostCalculator {

    // Constants for standard charges
    static final double STANDARD_SERVICE_CHARGE = 200.00;
    static final double DEFAULT_OIL_CHANGE_FEE = 40.00;
    static final double DEFAULT_TIRE_ROTATION_FEE = 30.00;

    // yearlyService with no parameters
    public static double yearlyService() {
        return STANDARD_SERVICE_CHARGE;
    }

    // yearlyService with one parameter (oil change fee)
    public static double yearlyService(double oilChangeFee) {
        return STANDARD_SERVICE_CHARGE + oilChangeFee;
    }

    // yearlyService with two parameters (oil change fee, tire rotation fee)
    public static double yearlyService(double oilChangeFee, double tireRotationFee) {
        return STANDARD_SERVICE_CHARGE + oilChangeFee + tireRotationFee;
    }

    // yearlyService with three parameters (oil change fee, tire rotation fee, coupon)
    public static double yearlyService(double oilChangeFee, double tireRotationFee, double coupon) {
        return (STANDARD_SERVICE_CHARGE + oilChangeFee + tireRotationFee) - coupon;
    }

    public static void main(String[] args) {
        // Testing each method twice

        // Method with no parameters
        System.out.println("Test 1 - No parameters: $" + yearlyService());
        System.out.println("Test 2 - No parameters: $" + yearlyService());

        // Method with one parameter
        System.out.println("Test 1 - One parameter (oil change): $" + yearlyService(45.00));
        System.out.println("Test 2 - One parameter (oil change): $" + yearlyService(DEFAULT_OIL_CHANGE_FEE));

        // Method with two parameters
        System.out.println("Test 1 - Two parameters (oil change, tire rotation): $" + yearlyService(40.00, 35.00));
        System.out.println("Test 2 - Two parameters (oil change, tire rotation): $" + yearlyService(DEFAULT_OIL_CHANGE_FEE, DEFAULT_TIRE_ROTATION_FEE));

        // Method with three parameters
        System.out.println("Test 1 - Three parameters (oil change, tire rotation, coupon): $" + yearlyService(40.00, 30.00, 20.00));
        System.out.println("Test 2 - Three parameters (oil change, tire rotation, coupon): $" + yearlyService(DEFAULT_OIL_CHANGE_FEE, DEFAULT_TIRE_ROTATION_FEE, 25.00));
    }
}
