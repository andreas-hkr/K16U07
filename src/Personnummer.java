public class Personnummer {
    private String pNr;

    public Personnummer(String pNr) {
        if (pNr.length() != 11 || pNr.indexOf("-") != 6) {
            throw new IllegalArgumentException("Ogiltigt personnummer");
        }

        String stripped = pNr.substring(0, 6) + pNr.substring(7);
        try {
            int sum = 0;
            for (int i = 0; i < 9; i++) {
                int n = Integer.parseInt(stripped.substring(i, i + 1));

                if (i % 2 == 0) {
                    n = n * 2;
                }

                sum += n / 10 + n % 10;
            }
            sum += Integer.parseInt(stripped.substring(9));
            if (sum % 10 != 0) {
                throw new IllegalArgumentException("Ogiltigt personnummer");
            }
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Ogiltigt personnummer");
        }

        this.pNr = pNr;
    }

    public boolean isMan() {
        return Integer.parseInt(pNr.substring(9, 10)) % 2 != 0;
    }

    public boolean isKvinna() {
        return !isMan();
    }

    @Override
    public String toString() {
        return pNr;
    }
}
