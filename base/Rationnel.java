package Base;
public class Rationnel {
    private int num;
    private int denom;

    public Rationnel(int num, int denom) {
        this.num = num;
        this.denom = denom;
    }

    public int getNum() {
        return num;
    }
    public Rationnel add(Rationnel other) {
        int newNum = this.num * other.denom + other.num * this.denom;
        int newDenom = this.denom * other.denom;
        return new Rationnel(newNum, newDenom);
    }
}
