// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

class Main {
    public static void main(String[] args) {
      double[] weatherTemp = new double[5];
  
      weatherTemp[0] = 20.5;
      weatherTemp[1] = 30;
      weatherTemp[2] = 22.5;
      weatherTemp[3] = 27;
      weatherTemp[4] = 25.5;
  
      weatherTemp[2] = 12;
      
      for(double temp : weatherTemp){
        System.out.println(temp);
      }
      
      
    }
  
    // @Test
    // void addition() {
    //     assertEquals(2, 1 + 1);
    // }
  }