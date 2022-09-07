import java.util.Arrays;

public class Color {
    private int[] rgb=new int[3];
    private int r;
    private int g;
    private int b;
    public final static int[] WHITE = new int[]{255, 255, 255};
    public final static int[] LIGHT_GRAY = new int[]{192, 192, 192};
    public final static int[] GRAY = new int[]{128, 128, 128};
    public final static int[] DARK_GRAY = new int[]{64, 64, 64};
    public final static int[] BLACK = new int[]{0, 0, 0};
    public final static int[] RED = new int[]{255, 0, 0};
    public final static int[] PINK = new int[]{255, 175, 175};
    public final static int[] ORANGE = new int[]{255, 200, 0};
    public final static int[] YELLOW = new int[]{255, 255, 0};
    public final static int[] GREEN = new int[]{0, 255, 0};
    public final static int[] MAGENTA = new int[]{255, 0, 255};
    public final static int[] CYAN = new int[]{0, 255, 255};
    public final static int[] BLUE = new int[]{0, 0, 255};

    public Color(int r, int g, int b) {
       this.r=rgb[0];
       this.g=rgb[1];
       this.b=rgb[2];
    }
    public Color(){
        this.rgb=new int[]{255, 255, 255};
    }

    @Override
    public String toString() {
        if (Arrayequals){
            return "black";
        }
    }
}
