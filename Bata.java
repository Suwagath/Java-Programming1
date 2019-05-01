public class Bata {
    private String girlName;

    public Bata(String name){
        girlName = name;
    }

    public void setName(String name){
        girlName=name;
    }
    public String getName(){
        return girlName;
    }
    public void saying(){
        System.out.printf("your first gf was %s", getName());
    }
}

