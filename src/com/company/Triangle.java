package com.company;

public class Triangle
{
  private Double a;
  private Double b;
  private Double c;

  public Triangle(Double a, Double b, Double c)
  {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public Double getA()
  {
    return a;
  }

  public void setA(Double a)
  {
    this.a = a;
  }

  public Double getB()
  {
    return b;
  }

  public void setB(Double b)
  {
    this.b = b;
  }

  public Double getC()
  {
    return c;
  }

  public void setC(Double c)
  {
    this.c = c;
  }

  @Override
  public boolean equals(Object o)
  {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Triangle triangle = (Triangle) o;

    if (Double.compare(triangle.a, a) != 0) return false;
    if (Double.compare(triangle.b, b) != 0) return false;
    return Double.compare(triangle.c, c) == 0;
  }

  @Override
  public int hashCode()
  {
    int result;
    long temp;
    temp = Double.doubleToLongBits(a);
    result = (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(b);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(c);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
  }
}
