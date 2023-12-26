
public class Review01 {

  static double tax_rate = 0.1;//税率を設定

    public static void main(String[] args) {
       int price = 59500; //価格を投入
       int result = (int) tax (price);//消費税額を反映
       int total = price + result;//合計額を計算

       System.out.println
       ((price) + "円の商品の税込み価格は" + (total) + "(消費税は" + (result) + "円)です。");
       //もともとの価格に対しての税込み額、税額を表示。
    }

    //taxメソッドで消費税を計算
    public static double tax(double price) {
        double result = Math.round(price * tax_rate);//価格に税率「10%」を乗算
        return result;//mainメソッドに返す
    }

}
