public class BaublePattern extends Patterns{

    CircleStitch sCircle = new CircleStitch();
    ShortLineStitch sLine = new ShortLineStitch();

    public void printPattern(){

        for(int i=0; i<5; i++){

            sLine.sew();
            sLine.sew();
            sCircle.sew();
        }
    }

}
