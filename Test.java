
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public void multiplesOffFive()
    {
        int multiples = 15;
        while (multiples < 95)
        { 
            System.out.println(multiples);
            multiples = multiples + 5;
        }
    }
    
    public void sumValues()
    {
        int index = 0;
        int sumValue = 0;
        int incremento = 1;
        
        while(index < 10 )
        {
            sumValue = sumValue + incremento;
            System.out.println(sumValue);
            index = index + 1;
            incremento = incremento + 1;
        }
    }
    
    public void sumValuesInterval(int a, int b)
    {
        int mayor = a;
        int suma = b;
        if(a < b)
        {
            suma = a;
            mayor = b;
        }
        int incremento = 1;
        int index = 0;
        while(index < mayor)
        {
            suma = suma + incremento;
            System.out.println(suma);
            incremento = incremento + 1;
            index = index + 1;
        }
    }
    
}
