public class Figs {
    public static void main(String[] args){
        int tuna[]={3,4,5,6,7};
        change(tuna);

        for(int y:tuna)
            System.out.println(y);
    }

    public static void change(int x[]){
        for(int counter=0;counter<x.length;counter++)
            x[counter]+=5;
    }
}
