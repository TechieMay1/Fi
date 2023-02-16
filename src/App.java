public class App {
    public static void main(String[] args) throws Exception {
       // System.out.print(args[0]);

        int vv = 0;
        int vvr = 1;
        int vrr = 0;
        int am = Integer.parseInt(args[0]);  
            
        for(int i = 2;i <= am;i++)  
        {    
            vrr = vv+vvr;   
            vv = vvr;    
            vvr = vrr;  
        }    
        System.out.print(vrr);   
    }
}
