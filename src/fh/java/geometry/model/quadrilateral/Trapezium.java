package fh.java.geometry.model.quadrilateral;

/**
 * Created by Martin on 11.11.2016.
 */
public class Trapezium extends QuadrangularShape{

    private double sideA;
    private double sideC;
    private double sideH;

    public Trapezium(int x, int y, double sideA, double sideC, double sideH) {
        this.x = x;
        this.y = y;
        this.sideA = sideA;
        this.sideC = sideC;
        this.sideH = sideH;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getSideH() {
        return sideH;
    }

    public void setSideH(double sideH) {
        this.sideH = sideH;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Trapezium trapezium = (Trapezium) o;

        if (Double.compare(trapezium.sideA, sideA) != 0) return false;
        if (Double.compare(trapezium.sideC, sideC) != 0) return false;
        return Double.compare(trapezium.sideH, sideH) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideH);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Trapezium{");
        sb.append("sideA=").append(sideA);
        sb.append(", sideC=").append(sideC);
        sb.append(", sideH=").append(sideH);
        sb.append('}');
        return sb.toString();
    }

    private double calcSide() {
        return Math.sqrt(sideH * sideH + (sideA-sideC) / 2 * (sideA-sideC) / 2);
    }

    @Override
    public double calcArea() {
        return ((sideA + sideC) / 2) * sideH;
    }

    @Override
    public double calcPerimeter() {
        return sideA + sideC + calcSide() * 2;
    }
}
