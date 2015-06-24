package homework2_borel_johnson;

public class Complex {
    private double imaginary;
    private double real;
    
    public Complex( double newReal, double newImaginary )
    {
        setImaginary( newImaginary );
        setReal( newReal );
    }
    
    @Override
    public boolean equals( Object o )
    {
     if( !( o instanceof ComplexPair ) )
         return false;
     else
     {
         Complex roots = (Complex) o;
            if( imaginary == roots.imaginary && real == roots.real )
                return true;
            else 
                return false;
        } 
    }
    
    public double getImaginary( )
    {
        return imaginary;
    }
    
    public double getReal( )
    {
        return real;
    }
    
    public boolean isReal()
    {
        /** Checks if it is the number is real.
         * If the number was squared it would need to be positive or zero to be real
        */
        if( Math.sqrt( real ) > 0 || Math.sqrt( real ) == 0)
            return true;
        else
            return false; 
    }
    
    public void setImaginary( double newImaginary )
    {
        imaginary = newImaginary;
    }
    
    public void setReal( double newReal )
    {
        real = newReal;
    }
    
    @Override
    public String toString( )
    {
        /**
            Prints the class fields as a string.
            I used ternary operator instead of if else 
            It checks if the imaginary number is negative or positive and
            prints according to that. I didn't put the minus sign because if the 
            number is negative it will act as the operator separating the numbers. 
        */
        
        return real + (imaginary > 0 ? " + " + imaginary + "i" : + imaginary + "i");
    }
    
}
