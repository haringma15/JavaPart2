package fh.java.geometry.model.multilateral;

import fh.java.geometry.model.ThreeDimensionalShape;

/**
 * Created by Martin on 11.11.2016.
 */
public class PentagonalTrapezohedron extends ThreeDimensionalShape {

    private double edgeLength;
    // Length of those edges belonging to the antiprism part.


    public PentagonalTrapezohedron(int x, int y, double edgeLength) {
        this.x = x;
        this.y = y;
        this.edgeLength = edgeLength;
    }

    public double getEdgeLength() {
        return edgeLength;
    }

    public void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PentagonalTrapezohedron that = (PentagonalTrapezohedron) o;

        return Double.compare(that.edgeLength, edgeLength) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(edgeLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PentagonalTrapezohedron{");
        sb.append("edgeLength=").append(edgeLength);
        sb.append('}');
        return sb.toString();
    }


    @Override
    public double calcSurfaceArea() {
        return Math.sqrt(25/2 * (5 + Math.sqrt(5))) * (edgeLength * edgeLength);
    }

    @Override
    public double calcVolume() {
        return 5/12 * (3 * Math.sqrt(5)) * (edgeLength * edgeLength * edgeLength);
    }
}
