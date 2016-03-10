public long longExpression(int a, int b, int c) {
    return (100_000_000_000L%a>>b) | (100/c);
}