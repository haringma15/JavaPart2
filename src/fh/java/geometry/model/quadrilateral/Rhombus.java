package fh.java.geometry.model.quadrilateral;

/**
 * Created by Martin on 11.11.2016.
 */
public class Rhombus extends QuadrangularShape {

    private double sideE;
    private double sideF;

    public Rhombus(int x, int y, double sideE, double sideF) {
        this.x=x;
        this.y=y;
        this.sideE = sideE;
        this.sideF = sideF;
    }

    public double getSideE() {
        return sideE;
    }

    public void setSideE(double sideE) {
        this.sideE = sideE;
    }

    public double getSideF() {
        return sideF;
    }

    public void setSideF(double sideF) {
        this.sideF = sideF;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rhombus rhombus = (Rhombus) o;

        if (Double.compare(rhombus.sideE, sideE) != 0) return false;
        return Double.compare(rhombus.sideF, sideF) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideE);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideF);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rhombus{");
        sb.append("sideE=").append(sideE);
        sb.append(", sideF=").append(sideF);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcPerimeter() {
        double a = calcSideA();
        return 4 * a;
    }

    @Override
    public double calcArea() {
        return (sideE * sideF) / 2;
    }

    private double calcSideA() {
        return Math.sqrt(sideE * sideE + sideF * sideF);
    }
}
