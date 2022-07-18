
public class Bus extends Transportation implements Operatable, BreakTime, PassengerRide, OilWarn {
    public Bus(int num, int oil, int speed, int speedVar, int max_passenger) {
        super(num, oil, speed, speedVar, max_passenger);
    }

    public Bus(int num) {
        this(num, 100, 0, 0, 30);
        int[] bus_group = new int[num];
        for (int i = 0; i < num; i++) {
            bus_group[i] = (num % 2 == 0) ? 1000 + i : 10 + i;
            System.out.println("버스 " + bus_group[i] + " 이 운행 중 입니다..");
        }
    }

    @Override
    public void passengerride(int x) {
        // 최대 승객 수 45명
        if (x > 45) {
            System.out.println("최대 승객 수 초과");
        } else {
            System.out.println("탑승 승객 수: " + x);
        }
        // 잔여 승객 수
        if (max_passenger - x < 0) {
            System.out.println("잔여 승객 수 : 0");
        } else {
            System.out.println("잔여 승객 수: " + (max_passenger - x));
        }
        // 요금
        if (x > 45) {
            System.out.println("표가 모두 매진 되었습니다.");
        }else {
            int payment = x * 1000;
            System.out.println("요금 확인: " + (payment) + "원");
        }
    }

    @Override
    public void breaktime() {
        if(oil < 10){
        System.out.println("차고지행");

        }

    }

    @Override
    public void oilwarn() {
        System.out.println("주유가 필요합니다!");
        breaktime();
    }

    @Override
    public void operate(int x) {

        if(oil == 100){
            oil -= x;
            System.out.println("주유량: " + x);
        }else if(oil < 10){
            oilwarn();
        }else {
            breaktime();
        }

    }
}
