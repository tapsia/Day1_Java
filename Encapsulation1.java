package oops;

public class Encapsulation1{
    private String Name;
    private int Age;
    private String BF;
    
    public String getEmpName(){
        return Name;
    }

    public int getEmpAge(){
        return Age;
    }

    public String getBFName() {
    	return BF;
    }
    public void setEmpAge(int newValue){
        Age = newValue;
    }

    public void setEmpName(String newValue){
        Name = newValue;
    }  
    
    public void setBFName(String BFName){
    	BF=BFName;
    }

}

