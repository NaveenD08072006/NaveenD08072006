public class TrigonometryApproximation
{
public static void main(String[]args){
    double theta=Double.parseDouble(args[0]);
    double cossquaredtheta=Math.cos(theta)*Math.cos(theta);
    double sinSquaredtheta=Math.sin(theta)*Math.sin(theta);
    double result=cossquaredtheta+sinSquaredtheta;
    boolean isApproximatelyOne=Math.abs(result-1)<0.0001;
    System.out.println(isApproximatelyOne);
 }
}
