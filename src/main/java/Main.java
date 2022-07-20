
public class Main {
    public static void main(String[] args) {


        Bus bus = new Bus(1);
        System.out.println("—————————————————————");
        bus.passengerride(2);        //탑승승객수  & 잔여승객수 & 요금확인
        System.out.println("—————————————————————");
        bus.operate(10);       //주유량
        System.out.println("—————————————————————");
        bus.oilwarn(10);    // 주유경고 기준 값.
        System.out.println("—————————————————————");
        bus.breaktime(0);    //  주유량에 따라 정해짐
        System.out.println("—————————————————————");

        System.out.println("*****************************");

        Taxi taxi = new Taxi(2);                        //택시 생성
        System.out.println("—————————————————————");
        taxi.operate(100);                              //주유 량
        taxi.oilwarn(10);                               //주유 경고
        taxi.passengerride(0);                          //택시 탑승 승객
        System.out.println("—————————————————————");
        taxi.distance(4);                               // 거리입력 >> 돈
        
    }
}

