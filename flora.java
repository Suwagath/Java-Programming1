public class flora{
    public static void main(String[] args){
        bucky buckyObject = new bucky();
        System.out.println(buckyObject.toMilitarry());
        System.out.println(buckyObject.toString());

        buckyObject.setTime(13,27,6);
        System.out.println(buckyObject.toMilitarry());
        System.out.println(buckyObject.toString());

    }
}