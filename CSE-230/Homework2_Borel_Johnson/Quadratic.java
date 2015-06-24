package homework2_borel_johnson;

 class Quadratic {
    private int a, b, c;
    private String comment = "unknown";
    
    /**
     * 
     * @param newA
     * @param newB
     * @param newC 
     */
    public Quadratic( int newA, int newB, int newC )
    {
        setA( newA );
        setB( newB );
        setC( newC );
    }
    
    /**
     * @return int - the discriminant based off of the 
     * values of variables a, b, and c.
     * Used to determine the type of answer (Complex, Real, # of Roots)
    */
    private int discriminant( )
    {
        return ( ( b * b ) - 4 * a * c );
    }
    
    /**
     * 
     * @param o
     * @return 
     */
    @Override
    public boolean equals( Object o )
    {
         if( !( o instanceof Quadratic) )
            return false;
        else
        {
            Quadratic equation = (Quadratic) o;
            if( a == equation.a && b == equation.b && c == equation.c )
                return true;
            else 
                return false;
        }
    }
    
    /**
     * 
     * @return 
     */
    public int getA( )
    {
        return a;
    }
    
    /**
     * 
     * @return 
     */
    public int getB( )
    {
        return b;
    }
    
    /**
     * 
     * @return 
     */
    public int getC( )
    {
        return c;
    }
    
    /**
     * 
     * @return 
     */
    public String getComment( )
    {
        return comment;
    }
    
    /**
     * 
     * @return 
     */
    public boolean hasDistinctRealRoots( )
    {
       return discriminant() > 0;
    }
    
    /**
     * 
     * @return 
     */
    public boolean hasDoubleRealRoots( )
    {
        return discriminant() == 0;
    }
    
    /**
     * 
     * @param newA 
     */
    public void setA( int newA )
    {
        a = newA;
    }
    
    /**
     * 
     * @param newB 
     */
    public void setB( int newB )
    {
        b = newB;
    }
    
    /**
     * 
     * @param newC 
     */
    public void setC( int newC )
    {
        c = newC;
    }
    
    /**
     * 
     * @return 
     */
    public ComplexPair solveQuadratic()
    {
        double root1, root2; 
        if( hasDistinctRealRoots() == true)
            {
                /*
                    gets the two distinct real roots for the equation then creates
                    a Complex object for each root. Which is then used to create
                    a ComplexPair object that has both real roots for the return. 
                */
                comment = "Two distinct real roots."; 
               if( a == 0 )
                    {
                        root1 = - c / (double) b;             
                        Complex num1 = new Complex(root1, 0);
                        Complex num2 = num1; 
                                    
                        ComplexPair num3 = new ComplexPair(num1, num2);
                        comment = " Linear equation: one real root.2"; 
                        return num3;
                        
                    }
                 else if( b == 0)
                    {
                        comment = "Double Real Root.3 ";
                        if( a > 0 )
                            {
                                if(c > 0)
                                    {                                            
                                        root1 = -b + Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                        root2 = -b - Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                        Complex num1 = new Complex(0, root1);
                                        Complex num2 = new Complex(0, root2);
                                            
                                        ComplexPair num3 = new ComplexPair(num1, num2);
                                        return num3; 
                                    }
                                
                                else
                                   {
                                        root1 = -b + Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                        root2 = -b - Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                        Complex num1 = new Complex(0, root1);
                                        Complex num2 = new Complex(0, root2);
                                            
                                        ComplexPair num3 = new ComplexPair(num1, num2);
                                        return num3; 
                                   }
 
                            }
                        
                        else if( a < 0)
                            {
                                if(c > 0)
                                    {                                
                                        root1 = ( -b + Math.sqrt( discriminant() ) ) / (2 * a);
                                        root2 = ( -b - Math.sqrt( discriminant() ) ) / (2 * a); 
                                        Complex num1 = new Complex(root1, 0);
                                        Complex num2 = new Complex(root2, 0);
                                                    
                                        ComplexPair num3 = new ComplexPair(num1, num2);
                                        return num3; 
                                    }
                                
                                    else
                                        {
                                            root1 = -b + Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                            root2 = -b - Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                            Complex num1 = new Complex(0, root1);
                                            Complex num2 = new Complex(0, root2);
                                        
                                            ComplexPair num3 = new ComplexPair(num1, num2);
                                            return num3;            
                                        }
                                }
                    }
               
                root1 = ( (-b + Math.sqrt( discriminant() ) ) / (2 * a) );
                root2 = ( (-b - Math.sqrt( discriminant() ) ) / (2 * a) );
                
                Complex num1 = new Complex(root1, 0);        
                Complex num2 = new Complex(root2, 0); 
                ComplexPair num3 = new ComplexPair(num1, num2);
                return num3;
                
            }
            else if(hasDoubleRealRoots() == true)
                {
                    /*
                        Creates an object that holds the double root for the
                        equation. Since the discriminant equals zero the roots
                        are the same. A Complex object was created for each root.
                        Which was used to create a ComplexPair object to return. 
                    */
                   comment = "Double real roots.4 "; 
                   if( a == 0 )
                    {
                        root1 = - c / (double) b; 
                                    
                        Complex num1 = new Complex(root1, 0);
                        Complex num2 = num1; 
                                    
                        ComplexPair num3 = new ComplexPair(num1, num2);
                        return num3;
                    }
                 else if( b == 0)
                    {
                        comment = "Double real roots.5 "; 
                        if( a > 0 )
                            {
                                if(c > 0)
                                    {                                            
                                        root1 = -b + Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                        root2 = -b - Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                        Complex num1 = new Complex(0, root1);
                                        Complex num2 = new Complex(0, root2);
                                            
                                        ComplexPair num3 = new ComplexPair(num1, num2);
                                        return num3; 
                                    }
                                
                                else
                                   {
                                        root1 = -b + Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                        root2 = -b - Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                        Complex num1 = new Complex(0, root1);
                                        Complex num2 = new Complex(0, root2);
                                            
                                        ComplexPair num3 = new ComplexPair(num1, num2);
                                        return num3; 
                                   }
 
                            }
                        
                        else if( a < 0)
                            {
                                if(c > 0)
                                    {                                
                                        root1 = ( -b + Math.sqrt( discriminant() ) ) / (2 * a);
                                        root2 = ( -b - Math.sqrt( discriminant() ) ) / (2 * a); 
                                        Complex num1 = new Complex(root1, 0);
                                        Complex num2 = new Complex(root2, 0);
                                                    
                                        ComplexPair num3 = new ComplexPair(num1, num2);
                                        return num3; 
                                    }
                                
                                    else
                                        {
                                            root1 = -b + Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                            root2 = -b - Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                            Complex num1 = new Complex(0, root1);
                                            Complex num2 = new Complex(0, root2);
                                        
                                            ComplexPair num3 = new ComplexPair(num1, num2);
                                            return num3;            
                                        }
                                }
                    }
                    root1 = ( (-b + Math.sqrt( discriminant() ) ) / (2 * a) );
                    root2 = root1;
                
                    Complex num1 = new Complex(root1, 0);
                    Complex num2 = new Complex(root2, 0); 
                   
                    ComplexPair num3 = new ComplexPair(num1, num2);
                    return num3; 
                }
                else if(discriminant() < 0) 
                    {   /*
                        This is for if the discriminant is a negative number or
                        complex. I used Math.abs to convert the discriminant to 
                        a positive number. So that the imaginary number is still
                        correct instead of giving NaN.
                    
                        Then I put each root into their own Complex object. With
                        those Complex objects I created a ComplexPair. 
                         */
                         comment = "Two distinct complex roots.6 ";
                        if( a == 0 )
                            {
                                root1 = - c / (double) b; 
                                    
                                Complex num1 = new Complex(root1, 0);
                                Complex num2 = new Complex(0, 0); 
                                    
                                ComplexPair num3 = new ComplexPair(num1, num2);
                                return num3;
                            }
                        else if( b == 0)
                            {
                                comment = "Double complex real roots.7 ";
                                if( a > 0 )
                                    {
                                        if(c > 0)
                                            {                                            
                                                root1 = -b + Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                                root2 = -b - Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                                Complex num1 = new Complex(0, root1);
                                                Complex num2 = new Complex(0, root2);
                                            
                                                ComplexPair num3 = new ComplexPair(num1, num2);
                                                return num3; 
                                            }
                                
                                        else
                                            {
                                                root1 = -b + Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                                root2 = -b - Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                                Complex num1 = new Complex(0, root1);
                                                Complex num2 = new Complex(0, root2);
                                            
                                                ComplexPair num3 = new ComplexPair(num1, num2);
                                                return num3; 
                                            }
                                    }
                        
                                else if( a < 0)
                                    {
                                        if(c > 0)
                                            {                                
                                                root1 = ( -b + Math.sqrt( discriminant() ) ) / (2 * a);
                                                root2 = ( -b - Math.sqrt( discriminant() ) ) / (2 * a); 
                                                Complex num1 = new Complex(root1, 0);
                                                Complex num2 = new Complex(root2, 0);
                                                    
                                                ComplexPair num3 = new ComplexPair(num1, num2);
                                                return num3; 
                                            }
                                
                                        else
                                            {
                                                root1 = -b + Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                                root2 = -b - Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                                Complex num1 = new Complex(0, root1);
                                                Complex num2 = new Complex(0, root2);
                                        
                                                ComplexPair num3 = new ComplexPair(num1, num2);
                                                return num3;            
                                            }
                                    }
                            }
                        
                        root1 = - b / ( 2 * a ); 
                        double i = Math.sqrt( Math.abs( discriminant() ) ) / (2 * a); 
                        
                        double i2 = - Math.sqrt( Math.abs( discriminant() ) ) / ( 2 * a); 
                       
                        Complex num1 = new Complex( root1, i);
                        Complex num2 = new Complex(root1, i2);
                        ComplexPair num3 = new ComplexPair( num1, num2);
                        return num3; 
                    }
                        
        root1 = 0.0;
        root2 = root1;
        Complex num1 = new Complex(root1, root2);
        Complex num2 = num1;
        ComplexPair num3 = new ComplexPair(num1, num2);
        return num3; 
    } //end solveQuadratic 
    
    /**
     * @return String determined by what the equation type is determined by the discrinimant's value
     */
    @Override
    public String toString( )
    {
        return "\n" + "Equation: " + (a == 1 ? "x^2" : (a == -1 ? "-x^2" : (a == 0 ? "" : a + "x^2") ) ) + 
                (b == 1 ? "x" : (b == -1 ? "-x" : (b > 0 ? " + " + b + "x" : (b == 0 ? "" : b + "x") ) ) )
                + " " + (c > 0 ? "+ " + c : c); 
    }
    
    
}
