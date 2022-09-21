class triangular {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 0; i < n; i++) {
            for (int l = n - i; l > 0; l--) { 
                System.out.print("    ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%3d ", 1 << j);
            }
            for (int k = i - 1; k >= 0; k--) {
                System.out.printf("%3d ", 1 << k);
            }
            System.out.println();
        }
    }
}