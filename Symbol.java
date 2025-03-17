public class Symbol {
    
    private String x;
    private String o;
    
    public Symbol(String x, String o){
        this.x = new String(x);
        this.o = new String(o);
    }
    
    public String getX(){
        return x;
    }

    public String getO(){
        return o;
    }
}
