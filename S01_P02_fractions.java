
class S02_P02_fractions{
    
    /* 
        .compiler value
             -> cmd line
        .run value
     */
    public static void main(String data[]) // cmd line args...
    {
        
        for(String x : data)
        {
            double f = Double.parseDouble(x);
            int n = (int)f;

            double ans = f - n;

            System.out.printf(f+" : "+ans);
        }
    }
}