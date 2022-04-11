public class Board {
  static boolean game = true;

  // 8*8のオセロ版を管理する多次元配列
  static String[][] board = new String[8][8];

  // オセロの駒を表示させるための変数宣言
  static final String EMPTY = "";
  static final String BLACK = "●";
  static final String WHITE = "◯";

  static String stone;
  static String rev_stone;

  static public void initialize() {
    
}