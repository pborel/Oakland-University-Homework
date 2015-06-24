package homework2_borel_johnson;

public class ComplexPair {
    private Complex first, second;
    
    public ComplexPair( Complex newFirst, Complex newSecond )
    {
       setFirst( newFirst );
       setSecond( newSecond );
    }
    
    public boolean bothIdentical( )
    {
       if(first.getReal() == second.getReal() && first.getImaginary() == second.getImaginary() )
               return true;
       else
           return false; 
    }
    
    @Override
    public boolean equals( Object o)
    {
        if( !( o instanceof ComplexPair ) )
            return false;
        else
        {
            ComplexPair pair = (ComplexPair) o;
            if( first.equals( pair.first ) && second.equals( pair.second ) )
                return true;
            else 
                return false;
        }
    }
    
    public Complex getFirst( )
    {
        return first;
    }
    
    public Complex getSecond( )
    {
        return second;
    }
    
    public void setFirst( Complex newFirst )
    {   
        //possible validation
        first = newFirst;
    }
    
    public void setSecond( Complex newSecond )
    {
        //possible validation
        second = newSecond;
    }
    
    @Override
    public String toString( )
    {
      return "Solutions: first: " + 
              (first.getImaginary() == 0 ? first.getReal() : (first.getReal() == 0 ? 
              first.getImaginary() + "i" : (first.getImaginary() < 0 ? 
              first.getReal() + " - " + Math.abs( first.getImaginary() ) + "i" : first ) ) )
              
              + "; second: " + 
              (second.getImaginary() == 0 ? second.getReal() : (second.getReal() == 0 
              ? second.getImaginary() + "i": second) );  
    }
}
