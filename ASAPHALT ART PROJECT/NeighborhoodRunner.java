import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

/*
* instantiate mural painter who paints the background
*/

    MuralPainter hajin = new MuralPainter();
    hajin.paintBackground("lightblue", 16);

   SmilePainter caleb = new SmilePainter();
     caleb.paintSmile("yellow");
  }
}