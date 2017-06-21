package encapsulation;

public class Tree {

    private static final int GROWTH_STEP = 1;
    private static final int MAX_HEIGHT = 50;

    private int height = 0;

    public void grow(){
        if (height >= MAX_HEIGHT) return;
        this.height += GROWTH_STEP;
    }

    public int getHeight(){
        return height;
    }

}
