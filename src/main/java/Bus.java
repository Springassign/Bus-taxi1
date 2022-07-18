
public class Bus extends Transportation implements Operatable, BreakTime, PassengerRide, OilWarn{
    public Bus(int num, int oil, int speed, int speedVar, int max_passenger) {
        super(num, oil, speed, speedVar, max_passenger);
    }

    public Bus(int num){
            this(num,100,0, 0,30);
        int[] bus_group = new int[num];
        for (int i = 0; i < num; i++) {
            bus_group[i] = (num % 2 == 0) ? 1000 + i : 10 + i;
        System.out.println("버스 " + bus_group[i] + " 이 생성되었습니다.");
        }
    }

    @Override
    public void passengerride(int x) {
        System.out.println("탑승 승객 수: "+ x);
        System.out.println("잔여 승객 수: "+ (max_passenger-x));
        int payment = x*1000;
        System.out.println("요금 확인: "+ (payment)+"원");
    }

    @Override
    public void breaktime() {
        oil+=10;

    }

    @Override
    public void oilwarn() {
        System.out.println("주유 필요!!");
        breaktime();
    }

    @Override
    public void operate(int x) {
        oil -= x;
        System.out.println("주유량: -"+x);
        if (oil<10){oilwarn();}
        breaktime();

    }


}
