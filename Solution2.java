class Dog{
    private String name;
    private String color;
    public Dog(){   //无参构造方法
        this.color = "red";
        this.name = "乖乖";
    }
    public Dog(String color,String name){   //有参构造方法
        this.color = color;
        this.name = name;
    }

    public void show(){
        System.out.println(name + color);
    }
}
public class Solution2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("balck","乐乐");   //此时应传入参数，实例化对象且赋值
        dog1.show();
        Dog dog2 = new Dog();
        dog2.show();
    }
}
