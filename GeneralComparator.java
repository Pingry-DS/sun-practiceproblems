import java.util.Comparator;

public class GeneralComparator implements Comparator<T>{
  public int compare(String a, String b)
	{
		return a.length() - b.length();
	}
  public int compare(Integer a, Integer b){
    return a - b;
  }
  
}
