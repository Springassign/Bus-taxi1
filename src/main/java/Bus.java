
public class Bus extends Transportation implements Operatable, BreakTime, PassengerRide, OilWarn, Refuel{
    public Bus(int num, int oil, int speed, int speedVar, int max_passenger) {
        super(num, oil, speed, speedVar, max_passenger);
    }

    public Bus(int num){
        this(num, 100, 0, 0, 30);
        int[] bus_group = new int[num];
        for (int i = 0; i < num; i++) {
            bus_group[i] = (num % 2 == 0) ? 1000 + i : 10 + i;
            System.out.println("버스 " + bus_group[i] + " 이 생성되었습니다.");
        }
    }

    @Override
    public void passengerride(int x) {
        if(max_passenger-x<0){}else{
        System.out.println("--------------------");
        System.out.println("탑승 승객 수: "+ x);
        System.out.println("잔여 승객 수: "+ (max_passenger-x));
        int payment = x*1000;
        System.out.println("요금 확인: "+ (payment)+"원");
        System.out.println("--------------------");}
    }

    @Override
    public boolean status(int speedVar) {
        if (speedVar == 1) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void breaktime(int x) {
        oil += x;
        System.out.println("상태: 차고지행");
        System.out.println("주유량: "+ oil);
        speed_Var=0;
    }

    @Override
    public void oilwarn() {
        System.out.println("--------------------");
        System.out.println("주유 필요!!");
        System.out.println("--------------------");
        speed_Var=1;
    }

    @Override
    public void operate(int x) {
        oil -= x;
        System.out.println("--------------------");
        System.out.println("주유량: "+oil);
        if (oil<10){oilwarn();}else{
        speed_Var=1;
        System.out.println("--------------------");}
    }


    @Override
    public void refuel(int x) {

    }
}
