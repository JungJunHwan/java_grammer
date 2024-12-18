package C02ClassBasic;

public class C0205Constructor {
    public static void main(String[] args) {
        Calendar calendar = new Calendar(2024,12,11);
//        데이터의 안정성을 위해 일반적으로 setter를 사용하지 않음
        System.out.println("오늘은 " + calendar.getYear()+"년도 "+calendar.getMonth()+"월 "+calendar.getDay()+"일 입니다.");
    }
}

class Calendar{
    //    생성자는 메서드의 일종으로 클래스명과 동일한 이름을 갖는 메서드
//    생성자를 통해 객체변수값들을 객체가 만들어지는 시점에 초기화(세팅)
    private int year;
    private int month;
    private int day;

    //    별도의 생성자를 만들경우, 초기생성자는 더이상 사용할 수 없으며, 별도 추가 필요.
    public  Calendar(int year,int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;
    };
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
