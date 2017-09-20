import java.util.Iterator;
import java.lang.UnsupportedOperationException;
import java.util.NoSuchElementException;

public class PrimeNumberIterator implements Iterator<Integer>{

  private int n = 2;

  public Integer next(){
    while (!(isPrime(n))){
      n++;
    }

    return n++;

  }

  public boolean hasNext(){
    return true;

  }

  public void remove(){
    throw new UnsupportedOperationException("Prime numbers cannot be removed");
  }

  public boolean isPrime(int x){

    for (int k = x - 1; k != 0; k--){
      if (x % k == 0 && k != 1){
        return false;
      }
    }
    return true;
  }

}
