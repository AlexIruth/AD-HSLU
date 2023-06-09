package ch.hslu.ad.sw08.A1.Algorithem;

import java.util.Random;

public final class ArrayCreator {

    public static int[] newRandomIntArray(final int numberOfElements) {
        int[] created = new int[numberOfElements];
        Random random = new Random();
        for (int i = 0; i < numberOfElements; i++) {
            int randomIndex = random.nextInt(numberOfElements);
            if (created[randomIndex] == 0) {
                created[randomIndex] = i + 1;
            } else {
                i--;
            }
        }
        return created;
    }

    public static int[] newSortedIntArray(final int numberOfElements) {
        int[] created = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            created[i] = i + 1;
        }
        return created;
    }

    public static int[] newReverseSortedIntArray(final int numberOfElements) {
        int[] created = new int[numberOfElements];
        for (int i = 1; i <= numberOfElements; i++) {
            created[numberOfElements - i] = i;
        }
        return created;
    }
}
