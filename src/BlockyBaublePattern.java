public class BlockyBaublePattern extends Patterns {

    CircleStitch sCircle = new CircleStitch();
    ShortLineStitch sLine = new ShortLineStitch();
    BlockStitch block = new BlockStitch();

    public void printPattern(){

        for(int i=0; i<3; i++){

            block.sew();
            sLine.sew();
            sLine.sew();
            sCircle.sew();
            sLine.sew();
            sLine.sew();
        }
    }



}
