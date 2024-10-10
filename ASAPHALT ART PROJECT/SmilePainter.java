import org.code.neighborhood.*;

/*
 *SmilePainter is a PainterPlus that paints a smile
 * smile in The Neighborhood
 */
public class SmilePainter extends PainterPlus {
  /*
   * Paints a smile onto the painting
   */
  public void paintSmile(String color) {
   paintCircle("yellow");
   //paintFace();
    }

  //paints a circle or the yellow base of a smile
  public void paintCircle(String color) {
    turnRight();
    move();
    turnLeft();
    move();
    moveAndPaint("yellow", 8);
  }
//moves and paints depending on number
 public void moveAndPaint(String color, int size) {
     while (canMove()) {
      paintLine();
    }
 }
//paints a line
  public void paintLine(){
    move();
    paint("yellow");
  }
}