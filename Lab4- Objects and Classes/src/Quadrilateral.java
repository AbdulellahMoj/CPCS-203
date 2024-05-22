public class Quadrilateral {
    // Atributos
    Double side1;
    Double side2;
    Double side3;
    Double side4;

    public Quadrilateral() {
        this(1.0, 1.0, 1.0, 1.0);
    }

    public Quadrilateral(Double side1, Double side2, Double side3, Double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;

    }
    // --------------------------------------------------------------------------------------------

    // setters
    public void setSide1(Double Side) {
        this.side1 = Side;
    }

    public void setSide2(Double Side) {
        this.side2 = Side;
    }

    public void setSide3(Double Side) {
        this.side3 = Side;
    }

    public void setSide4(Double Side) {
        this.side4 = Side;
    }

    // --------------------------------------------------------------------------------------------

    // getters
    public Double getsSide1() {
        return this.side1;
    }

    public Double getsSide2() {
        return this.side2;
    }

    public Double getsSide3() {
        return this.side3;
    }

    public Double getsSide4() {
        return this.side4;
    }

    // --------------------------------------------------------------------------------------------

    public Double getPerimeter(Double side1, Double side2, Double side3, Double side4) {
        Double Perimeter = side1 + side2 + side3 + side4;

        return Perimeter;
    }

    public String toString() {

        return "Sides:\n" +
                "Side 1 = " + getsSide1() + "\n" +
                "Side 2 = " + getsSide2() + "\n" +
                "Side 3 = " + getsSide3() + "\n" +
                "Side 4 = " + getsSide4() + "\n" +
                "Perimeter = " + getPerimeter(side1, side2, side3, side4) + "\n";
    }

}
