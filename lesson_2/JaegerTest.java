public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Cherno Alpha");
        jaegerOne.setMark("Mark-1");
        jaegerOne.setStatus("Destroyed");
        jaegerOne.setOrigin("Russia");
        jaegerOne.setHeight(85.34f);
        jaegerOne.setWeight(2.412f);
        jaegerOne.setSpeed(3);

        System.out.println(jaegerOne.getModelName());
        System.out.println(jaegerOne.getMark());
        System.out.println(jaegerOne.getStatus());
        System.out.println(jaegerOne.getOrigin());
        System.out.println(jaegerOne.getHeight());
        System.out.println(jaegerOne.getWeight());
        System.out.println(jaegerOne.getSpeed());

        jaegerOne.drive();
        jaegerOne.move();
        jaegerOne.kill();

        Jaeger jaegerTwo = new Jaeger();
        jaegerTwo.setModelName("Striker Eureka");
        jaegerTwo.setMark("Mark-5");
        jaegerTwo.setStatus("Destroyed");
        jaegerTwo.setOrigin("Australia");
        jaegerTwo.setHeight(76.2f);
        jaegerTwo.setWeight(1.850f);
        jaegerTwo.setSpeed(10);

        System.out.println(jaegerTwo.getModelName());
        System.out.println(jaegerTwo.getMark());
        System.out.println(jaegerTwo.getStatus());
        System.out.println(jaegerTwo.getOrigin());
        System.out.println(jaegerTwo.getHeight());
        System.out.println(jaegerTwo.getWeight());
        System.out.println(jaegerTwo.getSpeed());

        jaegerTwo.drive();
        jaegerTwo.move();
        jaegerTwo.kill();
    }
}
