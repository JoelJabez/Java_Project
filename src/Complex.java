public class Complex {

    double real;
    double image;

    public void add(Complex number) {
        real = real + number.real;
        image = image + number.image;
    }
}
