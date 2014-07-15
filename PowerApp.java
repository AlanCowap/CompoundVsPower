//What happens when you increase/improve by 1% per day
//@Author Alan Cowap
public class PowerApp{
  public static void main(String[] args){
  	double result = 1.0;
  	for(int i=0; i<366; ++i) result *=1.01;
  	System.out.println(result); //Compound value
  	System.out.println(Math.pow(1.01, 365.0)); //Power value
  }
}
