public class Test {
    public static void main(String[] args)
    {
        MainClass main = new MainClass();

        System.out.println(main.overloadedMethod(100));
    }
    
}
 class MainClass {

    double overloadedMethod(double d) {
        return d *= d;
    }
    int overloadedMethod(int i){
        return overloadedMethod(i *= i);
    }
    float overloadedMethod(float f){
        return overloadedMethod(f *= f);
    }

}


