public class Dangdut{
    String penyanyi = "Ayu Ting Ting";
    String lagu = "Alamat palsu";
    
    Dangdut (){
        
    }
    void singer(String penyanyi){
        this.penyanyi = penyanyi;
    }
    
    public void song(String lagu){
        System.out.println(this.penyanyi +" <=>" +this.lagu);
}
}