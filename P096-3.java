public class Main{
    public static void main(String[]args){
        System.out.println("ようこそ占いの館へ");
        System.out.println("あなたの名前を入力してください");
        String name = new java.util.Scanner (System.in).nextLine();
        //キーボードから1行の文字入力を受け付けるString型の変数nameに格納する
        System.out.println("あなたの年齢を入力してください");
        String ageString = new java.util.Scanner (System.in).nextLine();
        //キーボードから1行の文字入力を受け付けてString型の変数ageStringに格納する
        int age = Integer.parseInt(ageString);
        //変数ageStringをint型の変数fortuneに変換する。
        int fortune = new java.util.Random().nextInt(4);
        //0から3の乱数を生成する。
        fortune++;
        //fortuneの値をインクリメントで1増やす。これによって1から4の乱数にする
        System.out.println("占いの結果が出ました");
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
        System.out.println("1:大吉 2:中吉 3:吉 4:凶");

    }
}