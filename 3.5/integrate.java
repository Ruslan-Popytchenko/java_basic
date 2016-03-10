public static double integrate(DoubleUnaryOperator f, double a, double b) {
    double h = 0.000001;
    double sum = 0;
    double st = a;
    while (st < b)    {
        sum += f.applyAsDouble(st)*h;
        st += h;
    }
    return sum;
}