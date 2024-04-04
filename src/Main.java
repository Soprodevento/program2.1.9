import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode()+ " " + b.hashCode());
    }
    public static class ComplexNumber  {

        private double re;

        private double im;

        public ComplexNumber() {

        }

        public ComplexNumber(double re, double im) {

            this.re = re;

            this.im = im;

        }

        public double getRe() {

            return re;

        }

        public double getIm() {

            return im;

        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            ComplexNumber num = (ComplexNumber) obj;
            return re == num.re && im == num.im;
        }
        @Override
        public int hashCode(){
        return Objects.hash(re, im);
        }
    }
}