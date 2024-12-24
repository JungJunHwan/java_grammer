package C10Annotation;

import com.sun.security.auth.NTDomainPrincipal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C1001Validation {
    public static void main(String[] args) throws IllegalAccessException {
        List<User> userList = new ArrayList<>();
        while (true) {
            Scanner sc = new Scanner(System.in);
//        아래 방식의 코딩은 사용자 입력의 필수 입력을 보장하지 못함
//        컴파일 타임에서는 사용자의 입력값을 예측하는 것이 불가
            System.out.println("이름을 입력하세요");
            String name = sc.nextLine();
            System.out.println("이메일을 입력하세요");
            String email = sc.nextLine();
            User user1 = new User(name, email);
            validate(user1);
            userList.add(user1);
            System.out.println(userList);
        }
    }
//    리플렉션 기술을 통해 런타임 시점에서 클래스에 접근하고, 필드 검증 및 수정까지도 가능
    static void validate(Object object) throws IllegalAccessException {
//        <?>는 제네릭 표현으로서 어떤 클래스 타입도 사용 가능하다는 표현
//        getClass 메서드를 통해 런타임시점에 user라는 객체의 타입을 가져올 수 있게 된다
        Class<?> myClass = object.getClass();
//        변수정보 조회 : 리플렉션 기술을 통해 필드 접근 및 수정
        Field[] fields = myClass.getDeclaredFields();
        for(Field f : fields){
            if(f.isAnnotationPresent(NotEmpty.class)){
//                필드에서 값을 꺼내거나 수정하려면 private 변수를 접근 가능하도록 설정해야함
                f.setAccessible(true);
                String value = (String)f.get(object);
                if(value == null || value.isEmpty()){
                    NotEmpty notEmpty = f.getAnnotation(NotEmpty.class);
                    throw new IllegalArgumentException(notEmpty.message());
                }
            }
        }
    }
}

class User{
    @NotEmpty(message = "name cannot be empty")
    private String name;
    @NotEmpty
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

//어노테이션 클래스를 통해, 해당 클래스명으로 특정 필드/클래스 검사, 특정 기능 주입 등에 활용
@Retention(RetentionPolicy.RUNTIME)
//ElementType.FIELD : 변수를 대상, METHOD : 메서드를 대상, TYPE : 클래스/인터페이스 등에 적용
@Target(ElementType.FIELD)
@interface NotEmpty {
    String message() default "this field cannot be empty";
}