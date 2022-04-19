// ゲームを実行するmainクラス
import java.util.Scanner;
public class Othello {
  public static void main(String[] args){

    //Boardクラスを読み込む
    Board.initialize();
    Board.showBoard();

    
    //コンソールからの入力を受け付ける
    Scanner s = new Scanner(System.in);

    //ゲーム実行中フラグがtrueのあいだループさせる
    while(Board.game){

      System.out.print("駒をおくx座標を入力してください！:");
      int x = s.nextInt();

      System.out.print("駒をおくy座標を入力してください！:");
      int y = s.nextInt();

      Board.setStone(x, y);
    }
    // ゲームの終了
    s.close();
  }
}