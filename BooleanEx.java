public class BooleanEx
 {
    public static void main(String[] args)
 {
double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);
boolean r1 = (x < y) && (y < z);
  boolean r2 = (x > y) && (y > z);
boolean result = r1 || r2;
System.out.println("Result = "+result);
}
}
