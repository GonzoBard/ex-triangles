package com.company;

import java.util.ArrayList;

public class Main
{

  public static void main(String[] args)
  {
    ArrayList<Triangle> triangles = new ArrayList<>();
    triangles.add(new Triangle(3d, 4d, 5d));
    triangles.add(new Triangle(3.1d, 4.2d, 5.3d));

    CalculatorTrianglesArea calculatorTrianglesArea = new CalculatorTrianglesArea(triangles);
    calculatorTrianglesArea.calculate();
  }
}
