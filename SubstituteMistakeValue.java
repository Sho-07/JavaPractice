public class Main{
    public static void main(String[]args){
        double tax = 1.08;
        int fax = 5;
        System.out.println("5万円から4万円へ値下げします。");
        tax = 4;
        //代入すべきはfax変数
        System.out.println("FAXの新価格(税込)");
        System.out.println(fax*tax+"万円");
        //実行結果は20万円となる。
    }
}