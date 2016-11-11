package fh.java.geometry.model.curved;

/**
 * Created by Martin on 11.11.2016.
 */
public class Salinon extends CurvedShape {

    private double radiusSmallSemicircle;
    private double radiusLargeSemicircle;

    public Salinon(int x, int y,double radiusSmallSemicircle, double radiusLargeSemicircle) {
        this.x=x;
        this.y=y;
        this.radiusSmallSemicircle = radiusSmallSemicircle;
        this.radiusLargeSemicircle = radiusLargeSemicircle;
    }

    public double getRadiusSmallSemicircle() {
        return radiusSmallSemicircle;
    }

    public void setRadiusSmallSemicircle(double radiusSmallSemicircle) {
        this.radiusSmallSemicircle = radiusSmallSemicircle;
    }

    public double getRadiusLargeSemicircle() {
        return radiusLargeSemicircle;
    }

    public void setRadiusLargeSemicircle(double radiusLargeSemicircle) {
        this.radiusLargeSemicircle = radiusLargeSemicircle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Salinon salinon = (Salinon) o;

        if (Double.compare(salinon.radiusSmallSemicircle, radiusSmallSemicircle) != 0) return false;
        return Double.compare(salinon.radiusLargeSemicircle, radiusLargeSemicircle) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radiusSmallSemicircle);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(radiusLargeSemicircle);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Salinon{");
        sb.append("radiusSmallSemicircle=").append(radiusSmallSemicircle);
        sb.append(", radiusLargeSemicircle=").append(radiusLargeSemicircle);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcArea() {
        return (1/4) * Math.PI * ((radiusLargeSemicircle + radiusSmallSemicircle) * (radiusLargeSemicircle + radiusSmallSemicircle));
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * radiusLargeSemicircle;
    }
}
