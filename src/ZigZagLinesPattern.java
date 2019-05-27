public class ZigZagLinesPattern extends Patterns {

    ZigZagStitch zigzag = new ZigZagStitch();
    FillStitch fill = new FillStitch();

    public void printPattern(){

        for(int i=0; i<2; i++){
            zigzag.sew();
            zigzag.sew();
            zigzag.sew();
            fill.sew();
            fill.sew();
            fill.sew();

        }
    }
}
