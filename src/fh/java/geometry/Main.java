package fh.java.geometry;

import fh.java.geometry.model.GeometricShape;
import fh.java.geometry.model.curved.Circle;
import fh.java.geometry.model.quadrilateral.Rectangle;
import fh.java.geometry.model.trilateral.RightTriangle;


import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        main.doIt();

    }

    private void doIt() {

        List<GeometricShape> shapeList = new ArrayList<>();
        fillList(shapeList);
        printList(shapeList);

        List<Circle> circleList = new ArrayList<>();

        for (GeometricShape shape : shapeList) {
            if (shape instanceof Circle){
                circleList.add((Circle)shape);              // casting
            }
        }

    }


    public void fillList(List<GeometricShape> shapeList) {

        shapeList.add(new Circle(1,2,3.0));
        shapeList.add(new Circle(1,2,3.1));
        shapeList.add(new Circle(1,2,3.2));

        shapeList.add(new Rectangle(3,4,5.2,2.0));
        shapeList.add(new Rectangle(3,4,6.3,3.0));
        shapeList.add(new Rectangle(3,4,7.4,4.0));

        shapeList.add(new RightTriangle(55,44,3.3,4.4));
        shapeList.add(new RightTriangle(55,44,4.3,3.4));
        shapeList.add(new RightTriangle(55,44,1.3,1.4));

    }


    public void printList(List<GeometricShape> shapeList) {

        System.out.println("-----------for------------");
        for (int pos = 0; pos < shapeList.size(); pos++) {
            System.out.println(shapeList.get(pos));
        }

        System.out.println("-----------for each------------");
        for (GeometricShape shape : shapeList) {
            System.out.println(shape);
        }

        System.out.println("-----------stream 1------------");
        shapeList.stream().forEach(shape -> System.out.println(shape));

        System.out.println("-----------stream 2------------");
        shapeList.stream().forEach(System.out::println);

    }

}
