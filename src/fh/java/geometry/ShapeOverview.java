package fh.java.geometry;

import fh.java.geometry.model.ThreeDimensionalShape;
import fh.java.geometry.model.TwoDimensionalShape;
import fh.java.geometry.model.curved.Circle;
import fh.java.geometry.model.curved.Cylinder;
import fh.java.geometry.model.curved.Salinon;
import fh.java.geometry.model.multilateral.PentagonalTrapezohedron;
import fh.java.geometry.model.quadrilateral.*;
import fh.java.geometry.model.trilateral.RightTriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin on 11.11.2016.
 */
public class ShapeOverview {

    public static void main(String[] args) {

        List<TwoDimensionalShape> twoDimShapeList = new ArrayList<>();
        fill2DList(twoDimShapeList);
        System.out.println(calcAllArea(twoDimShapeList, 0.0));
        System.out.println(calcAllPerimeter(twoDimShapeList, 0.0));

        List<ThreeDimensionalShape> ThreeDimList = new ArrayList<>();
        fil3DlList(ThreeDimList);
        System.out.println(calcAllSurfaceArea(ThreeDimList, 0.0));
        System.out.println(calcAllVolume(ThreeDimList, 0.0));
    }

    private static void fill2DList(List<TwoDimensionalShape> twoDimList) {
    // fills the 2D list with a bunch of 2D shapes.

        twoDimList.add(new Circle(1, 1, 1.5));
        twoDimList.add(new Circle(1, 2, 2.0));
        twoDimList.add(new Circle(1, 3, 2.5));

        twoDimList.add(new Rectangle(2, 1, 1.5, 2.5));
        twoDimList.add(new Rectangle(2, 2, 3.5, 2.5));
        twoDimList.add(new Rectangle(2, 3, 5.0, 2.5));

        twoDimList.add(new Square(3, 1, 1.5));
        twoDimList.add(new Square(3, 2, 2.0));
        twoDimList.add(new Square(3, 3, 3.5));

        twoDimList.add(new RightTriangle(4, 1, 1.5, 2.0));
        twoDimList.add(new RightTriangle(4, 2, 2.5, 2.0));
        twoDimList.add(new RightTriangle(4, 3, 4.5, 3.0));

        twoDimList.add(new Rhombus(5, 1, 1.5, 2.0));
        twoDimList.add(new Rhombus(5, 2, 2.5, 2.0));
        twoDimList.add(new Rhombus(5, 3, 3.5, 4.0));

        twoDimList.add(new Trapezium(6, 1, 3.5, 2.0, 4.0));
        twoDimList.add(new Trapezium(6, 2, 4.5, 3.0, 4.0));
        twoDimList.add(new Trapezium(6, 3, 5.5, 2.0, 5.0));

        twoDimList.add(new Salinon(7, 1, 1.5, 1.0));
        twoDimList.add(new Salinon(7, 2, 2.5, 1.5));
        twoDimList.add(new Salinon(7, 3, 5.0, 2.0));

    }

    private static String calcAllArea(List<TwoDimensionalShape> twoDimShapeList, double result) {
    // takes a 2D shape list and a result value, sums up all areas and returns a updated result for the print statement

        for (TwoDimensionalShape shape : twoDimShapeList) {
            result += shape.calcArea();
        }

        return "All areas summed up: " + result;
    }

    private static String calcAllPerimeter(List<TwoDimensionalShape> twoDimShapeList, double result) {
    // takes a 2D shape list and a result value, sums up all perimeters and returns a updated result for the print statement

        for (TwoDimensionalShape shape : twoDimShapeList) {
            result += shape.calcPerimeter();
        }

        return "All perimeters summed up: " + result;
    }

    private static void fil3DlList(List<ThreeDimensionalShape> threeDimList) {
    // fills the 3D list with a bunch of 3D shapes.

        threeDimList.add(new Cylinder(10, 1, 1.5, 3.0));
        threeDimList.add(new Cylinder(10, 2, 2.5, 5.0));
        threeDimList.add(new Cylinder(10, 3, 3.5, 7.0));

        threeDimList.add(new Cube(11, 1, 1.0));
        threeDimList.add(new Cube(11, 2, 5.0));
        threeDimList.add(new Cube(11, 3, 10.0));

        threeDimList.add(new PentagonalTrapezohedron(12, 1, 3.0));
        threeDimList.add(new PentagonalTrapezohedron(12, 2, 5.0));
        threeDimList.add(new PentagonalTrapezohedron(12, 3, 8.0));
    }

    private static String calcAllSurfaceArea(List<ThreeDimensionalShape> threeDimShapeList, double result) {
    // takes a 3D shape list and a result value, sums up all surface areas and returns a updated result for the print statement

        for (ThreeDimensionalShape shape : threeDimShapeList) {
            result += shape.calcSurfaceArea();
        }

        return "All surface areas summed up: " + result;
    }

    private static String calcAllVolume(List<ThreeDimensionalShape> threeDimShapeList, double result) {
    // takes a 3D shape list and a result value, sums up all volumes and prints a updated result for the print statement

        for (ThreeDimensionalShape shape : threeDimShapeList) {
            result += shape.calcVolume();
        }

        return "All volumes summed up: " + result;
    }
}
