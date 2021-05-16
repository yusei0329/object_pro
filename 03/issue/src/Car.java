public class Car {
    //constroctor
    double fuelEfficiency = 0.;
    double totalMileage   = 0.;
    double expendedFuel   = 0.;

    public double run(double mileage){
        double expended = 0.;
        totalMileage += mileage;
        expended = mileage/fuelEfficiency;
        expendedFuel += expended;
        return  expended;
    }

    public void printInfo(){
//        走行距離:00.00km 消費燃料:00.00L
        System.out.println("走行距離:"+totalMileage+"Km 消費燃料:"+expendedFuel);
    }
}
