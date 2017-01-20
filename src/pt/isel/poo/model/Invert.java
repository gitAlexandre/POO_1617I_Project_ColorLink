package pt.isel.poo.model;

/**
 * Created by Moreira on 12/11/2016.
 */
public class Invert extends Cell {

    public int color;
    @Override
    void setColor(int color) {
        this.color =color;
    }

    @Override
    public int getColor() {
        return color;
    }

    @Override
    public char getype() {
        return 'I';
    }

    @Override
    public Direction getDir() {
        return dir;
    }

    @Override
    public void setDir(Direction dir) {
        this.dir = dir;
    }
}
