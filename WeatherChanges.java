public class Main{
    public static void main(String[]args){
        boolean weather = false;
        /*このboolean weather　= がtrueであれば
        "散歩をします"と"洗濯をします"になる*/
        if(weather == true){
            System.out.println("散歩をします");
            System.out.println("洗濯をします");
        }else{
            if(weather == false){
                System.out.println("DVDを見ます");
            }
        }
    }
}