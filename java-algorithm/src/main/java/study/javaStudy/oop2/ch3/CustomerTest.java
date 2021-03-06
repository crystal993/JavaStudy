package study.javaStudy.oop2.ch3;

public class CustomerTest {
    public static void main(String[] args) {
        
        // 일반회원 
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        // vip 회원
        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());

        // 형변환
        // 상위클래스 = 하위클래스; // 하위클래스가 상위클래스로 묵시적 형변환
        // 상위클래스의 멤버변수와 메소드만 사용이 가능하다. 
        Customer vc = new VIPCustomer(12345,"noname");

    }
}
