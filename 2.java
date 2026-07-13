
class calculator {

    public static void main(String args[]) {
        if (args.length >= 3) {

            float a, b, ans=0;
            a = Float.parseFloat(args[0]);
            b = Float.parseFloat(args[2]);

            Operator op = new Operator();

            switch (args[1]) {
                case "+":
                    ans = op.adder(a, b);

                    break;
                case "-":
                    ans = op.diff(a, b);

                    break;
                case "/":
                    ans = op.div(a, b);

                    break;
                case "x":
                    ans = op.mul(a, b);

                    break;

            }
            System.out.println("Ans is : "+ans);
        } else {
            System.out.println("Invalid set of arguments");
        }
    }
}

class Operator {

    public float adder(float a, float b) {
        return (a + b);
    }

    public float diff(float a, float b) {
        return (a - b);
    }

    public float mul(float a, float b) {
        return (a * b);
    }

    public float div(float a, float b) {
        if (b != 0) {

            return (a / b);
        } else {
            return 0;
        }
    }
}
