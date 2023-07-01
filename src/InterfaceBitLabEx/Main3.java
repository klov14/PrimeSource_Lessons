package InterfaceBitLabEx;

public class Main3 {
    public static void main(String[] args) {
        McDonalds mcD1 = new McDonalds();
        mcD1.addBurger(3);
        mcD1.addWorker(1);
        mcD1.addWorker(10);
        mcD1.addBurger(5);
        mcD1.addBurger(7);
        McDonalds mcD2 = new McDonalds();
        mcD1.addBurger(4);
        mcD2.addWorker(3);
        mcD2.addWorker(12);
        mcD2.addBurger(12);
        mcD2.addBurger(9);
        System.out.println("McDonald's/Total income: "+mcD2.getTotalIncome()+", Total Costs: " + mcD2.getTotalOutcome());
        System.out.println("McDonald's/Total income: "+mcD1.getTotalIncome()+", Total Costs: " + mcD1.getTotalOutcome());
        KFC kfc1 = new KFC();
        kfc1.addBasket(9);
        System.out.println("KFC/Total income: " + kfc1.getTotalIncome()+", Total Costs: " + kfc1.getTotalOutcome());
        City city1 = new City("Almaty");
        city1.addRestaurant(kfc1);
        city1.addRestaurant(mcD1);
        city1.addRestaurant(mcD2);
        System.out.println(city1.getTotalTax());
    }
}

interface Restaurant{
    public double getTotalIncome();
    public double getTotalOutcome();
}

class City {
    private Restaurant[] allRestaurants = new Restaurant[50];
    private int restaurantSize = 0;
    private String cityName;

    public City(String cityName) {
        this.cityName = cityName;
    }

    public City() {
    }

    public void addRestaurant(Restaurant restaurant) {
        allRestaurants[restaurantSize++] = restaurant;
    }


    public double getTotalTax() {
        double totalTax = 0;
        for (int i = 0; i < restaurantSize; i++) {
            totalTax = allRestaurants[i].getTotalIncome() - allRestaurants[i].getTotalOutcome()+totalTax;
        }
        return totalTax*0.15;
    }
}
    class McDonalds implements Restaurant {
        private double[] burgersPrices = new double[100];
        private double[] workersSalary = new double[20];
        private int burgersSize = 0;
        private int workersSize = 0;

        public McDonalds() {
        }

        public void addWorker(double workerSalary) {
            workersSalary[workersSize++] = workerSalary;
        }

        public void addBurger(double burgerPrice) {
            burgersPrices[burgersSize++] = burgerPrice;
        }


        @Override
        public double getTotalIncome() {
            double totalIncome = 0;
            for (double i : burgersPrices) {
                totalIncome = i + totalIncome;
            }
            return totalIncome;
        }

        @Override
        public double getTotalOutcome() {
            double totalCosts = 0;
            for (double i : workersSalary) {
                totalCosts = totalCosts + i;
            }
            return totalCosts;
        }
    }

    class KFC implements Restaurant {
        private double basketPrices[] = new double[100];
        private int basketSize = 0;

        public void addBasket(double basketPrice) {
            basketPrices[basketSize++] = basketPrice;
        }


        @Override
        public double getTotalIncome() {
            double totalIncome = 0;
            for (double i : basketPrices) {
                totalIncome = totalIncome + i;
            }
            return totalIncome;
        }

        @Override
        public double getTotalOutcome() {
            return 0;
        }
    }



