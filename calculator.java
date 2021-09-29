/* Steve Weon
*  Sept 29, 2021
*  Problem Set 2-A
*/

class calculator {
    public double QuadraticFormula1(double a, double b, double c) {
        return (-b-(Math.sqrt(Math.pow(b,2)-4*a*c)))/2*a; //returning first solution when -b is subracted by discriminant
    } 
    
    public double QuadraticFormula2(double a, double b, double c) {
        return (-b+(Math.sqrt(Math.pow(b,2)-4*a*c)))/2*a; //returning second solution when -b is added by discriminant
    } 
    
    public double SlopeFormula(double x1, double x2, double y1, double y2) {
        return (y2-y1)/(x2-x1); //returning slope
    }
    
    public double MidPointFormulaX(double x1, double x2, double y1, double y2) {
        return (x1+x2)/2; //returning x value of mid point between 2 points
    }
    
    public double MidPointFormulaY(double x1, double x2, double y1, double y2) {
        return (y1+y2)/2; //returning y value of mid point between 2 points
    }
    
    public double SumArithSeries(int nAri, double a1Ari, double d) {
        return (double)nAri*(a1Ari+(a1Ari + (double)(nAri-1)*d))/2; //returning the sum of the arithmetic series
    }
    
    public double SumFiniteGeoSeries(int nGeo, double a1Geo, double r) {
        return (a1Geo*(1-(Math.pow(r,nGeo)))/(1-r)); //returning the sum of the Finite Geometric Series
    }
    
    public void display() { //displays the answers
        double a = 1; //coeficient of x^2
        double b = 5; //coeficient of x
        double c = 6; //constant variable
        
        //Printing Answer for Quadratic Formula
        System.out.println("QUADRATIC FORMULA");
        System.out.println("The solutions for "+(int)a+"x^2 + "+(int)b+"x + "+(int)c+" are "+QuadraticFormula1(a,b,c)+" and "+QuadraticFormula2(a,b,c)+".");
        System.out.println();
        
        double x1 = 0; //x-value of first point
        double y1 = 0; //y-value of first point
        double x2 = 2; //x-value of second point
        double y2 = 3; //y-value of second point
        
        //Printing Answer for Slope Formula
        System.out.println("SLOPE FORMULA");
        System.out.println("A line connecting the points ("+(int)x1+", "+(int)y1+") and ("+(int)x2+", "+(int)y2+") has a slope of "+SlopeFormula(x1,x2,y1,y2));
        System.out.println();
        
        //Printing Answer for Midpoint Formula
        System.out.println("MIDPOINT FORMULA");
        System.out.println("The midpoint between ("+(int)x1+", "+(int)y1+") and ("+(int)x2+", "+(int)y2+") is ("+MidPointFormulaX(x1,x2,y1,y2)+", "+MidPointFormulaY(x1,x2,y1,y2)+")");
        System.out.println();
        
        int nAri = 5; //number of terms being added
        double a1Ari = 1.0; //first term in the sequence
        double d = 1.0; //common difference between terms
        
        //Printing Answer for the sum of the Arithmetic Series
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.println("The sum of the first "+nAri+" terms of an arithmetic series that starts with "+a1Ari);
        System.out.println("and increases by "+d+" is "+SumArithSeries(nAri, a1Ari, d));
        System.out.println();
        
        int nGeo = 3; //number of terms being multiplied
        double a1Geo = 3.0; //the first term of the geometric sequence
        double r = 2.0; //constant ratio where r isn't 1
        
        //Printing Answer for the sum of the Limited Geometric Series
        System.out.println("SUM OF A FINITE GEOMETRIC SERIES");
        System.out.println("The sum of the first "+nGeo+" terms of a finite geometric series that starts with "+a1Geo);
        System.out.println("and increases by a rate of "+r +" is "+SumFiniteGeoSeries(nGeo, a1Geo, r));
        System.out.println();
    }
}