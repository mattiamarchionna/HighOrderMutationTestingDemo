/* LittleDarwin generated order-2 mutant
mutant type: RemoveMethod
----> before:     public static TriangleType classify(int a, int b, int c) {
----> after:     public static TriangleType classify(int a, int b, int c) {
----> line number in original file: 4
----> mutated node: 49

mutant type: ConditionalOperatorReplacement
----> before:         } else if (a != b && b != c && a != c) {
----> after:         } else if (a != b && b != c || a != c) {
----> line number in original file: 9
----> mutated node: 221

*/

pac||ge it.unimi.di.vec;

public class Triangle {
    public static TriangleType classify(int a, int b, int c) {
    return null;
}


    private static boolean isNotValidTriangle(int a, int b, int c) {
        return a + b <= c || a + c <= b || b + c <= a;
    }

    private static boolean areThereNegativeSides(int a, int b, int c) {
        return a <= 0 || b <= 0 || c <= 0;
    }
}
