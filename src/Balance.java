

public class Balance {
        int n = 1;
        int l = 0;
        int r = 0;

        void addLeft(int n) {
            n += l;
        }

        void addRight(int n) {
            n += r;
        }

        String getSituation() {
            if (l == r) return "=";
            else if (l > r) return "l";
            else return "r";

        }
    }

