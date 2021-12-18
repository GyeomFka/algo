package zerobase._3w;

import java.util.Scanner;

public class DistanceApplication {

    public static final int RANDOM_LOCATION_LENGTH = 5;
    public static final Scanner scan = new Scanner(System.in);

    private MyLocation myLocation;
    private RandomLocation randomLocation;
    private RandomLocation[] randomLocationList = new RandomLocation[RANDOM_LOCATION_LENGTH];
    private double[] distanceList = new double[RANDOM_LOCATION_LENGTH];

    public DistanceApplication() {
        setMyLocation();
        setRandomLocations();
        setDistanceList();
        findMinResult();
    }

    private void findMinResult() {
        double min = this.distanceList[0];
        for (int i = 0; i < distanceList.length; i++) {
            if(min > distanceList[i]) {
                min = distanceList[i];
            }
        }
        System.out.println("가장 가까운 거리 : " + min);
    }

    private void setDistanceList() {
        MyLocation myLocation = this.myLocation;
        RandomLocation[] randomLocationList = this.randomLocationList;
        int length = randomLocationList.length;
        for (int i = 0; i < length; i++) {
            distanceList[i] = calculateDistance(myLocation, randomLocationList[i]);
        }
        for (int i = 0; i < distanceList.length; i++) {
            System.out.println(distanceList[i]);
        }
    }

/*
* @param1 : MyLocation
* @param2 : RandomLocation[i]
* @return : distance between two points
* */
    public double calculateDistance(MyLocation myLocation, RandomLocation randomLocation) {
        int xDistance = randomLocation.getX() - myLocation.getX();
        int yDistance = randomLocation.getY() - myLocation.getY();
        //c^2 = a^2 + b^2
        int distance = (xDistance * xDistance) + (yDistance * yDistance);
        return Math.sqrt(distance);
    }


    private void setRandomLocations() {

        for(int i=0; i<RANDOM_LOCATION_LENGTH; i++) {
            System.out.print("location X 좌표 입력 → ");
            int locationX = scan.nextInt();
            System.out.print("location Y 좌표 입력 → ");
            int locationY = scan.nextInt();
            this.randomLocationList[i] = new RandomLocation(locationX, locationY);
            if(validateDuplicatea(randomLocationList[i], i) == false) {
                i--;
            }
            System.out.println(i+1 + "개 입력");
            System.out.println(randomLocationList.length + "개 입력");
        }

        for(int i=0; i<RANDOM_LOCATION_LENGTH; i++) {
            System.out.println(randomLocationList[i].getX() + "," + randomLocationList[i].getY());
        }

    }

    private boolean validateDuplicatea(RandomLocation nowCreated, int untilNumber) {
        for (int i = 0; i < untilNumber; i++) {
            if(randomLocationList[i].getX() == nowCreated.getX() && randomLocationList[i].getY() == nowCreated.getY()) {
                System.out.println("중복");
                return false;
            }
        }
        return true;
    }

    private void setMyLocation() {

        System.out.print("location X 좌표 입력 → ");
        int locationX = scan.nextInt();
        System.out.print("location Y 좌표 입력 → ");
        int locationY = scan.nextInt();

        this.myLocation = new MyLocation(locationX, locationY);

    }
}

