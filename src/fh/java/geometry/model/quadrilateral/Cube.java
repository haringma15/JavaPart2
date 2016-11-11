package fh.java.geometry.model.quadrilateral;

import fh.java.geometry.model.ThreeDimensionalShape;

/**
 * Created by Martin on 11.11.2016.
 */
public class Cube extends ThreeDimensionalShape {

    private double sideA;

    public Cube(int x, int y, double sideA) {
        this.x = x;
        this.y = y;
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cube cube = (Cube) o;

        return Double.compare(cube.sideA, sideA) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cube{");
        sb.append("sideA=").append(sideA);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcSurfaceArea() {
        return 6 * sideA * sideA;
    }

    @Override
    public double calcVolume() {
        return sideA * sideA * sideA;
    }
}
