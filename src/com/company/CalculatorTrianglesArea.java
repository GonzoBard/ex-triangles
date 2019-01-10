package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class CalculatorTrianglesArea
{
  private ArrayList<Triangle> triangles = new ArrayList<>();

  public CalculatorTrianglesArea(ArrayList<Triangle> triangles)
  {
    Objects.requireNonNull(triangles);
    this.triangles = triangles;
  }

  public void calculate()
  {
    for (int i = 0; i < triangles.size(); i++)
    {
      Triangle triangle = triangles.get(i);

      Double p = (triangle.getA() + triangle.getB() + triangle.getC()) / 2;

      Double area = Math.sqrt(
              p *
                      (p - triangle.getA()) *
                      (p - triangle.getB()) *
                      (p - triangle.getC())
      );

      System.out.println(String.format("треугольник #%s, площадь=%.20f", i + 1, area));
    }
  }

}
