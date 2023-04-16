public class Separator {
    int [] array;
    public Separator(int[] array) {
        this.array = array;
    }
    int [] even() {
        int k = 0;
        int now = 0;
        for (int i : array) {
            if (i % 2 == 0) k++;
        }
        int[] evens = new int[k];
        for (int i = 0; array.length > i; i++) {
            if (array[i] % 2 == 0)
                array[now] = evens[i];
            now += 1;
        }
        return evens;
    }
        int[] odd() {
            int k = 0, now = 0;
            for (int i : array) {
                if (i % 2 != 0) k++;
            }

            int[] odds = new int[k];
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    odds[now] = array[i];
                    now += 1;
                }
            }
            return odds;
            }
    }

