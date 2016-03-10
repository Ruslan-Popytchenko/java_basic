/**
 * Merges two given sorted arrays into one
 *
 * @param a1 first sorted array
 * @param a2 second sorted array
 * @return new array containing all elements from a1 and a2, sorted
 */
 public static int[] mergeArrays(int[] a1, int[] a2) {
      int[] a3 = new int[a1.length + a2.length];

        System.arraycopy(a1, 0, a3, 0, a1.length);
        System.arraycopy(a2, 0, a3, a1.length, a2.length);
        Arrays.sort(a3);
        return a3;
    }