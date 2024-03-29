/* LittleDarwin generated order-2 mutant
mutant type: RelationalOperatorReplacement
----> before:         } else if (a == b && b == c) {
----> after:         } else if (a != b && b == c) {
----> line number in original file: 7
----> mutated node: 214

mutant type: RemoveMethod
----> before:     private static boolean isNotValidTriangle(int a, int b, int c) {
----> after:     private static boolean isNotValidTriangle(int a, int b, int c) {
----> line number in original file: 16
----> mutated node: 55

*/

package it.unimi.di.vec;

public class Triangle {
    public static TriangleType classify(int a, int b, int c) {
        if (isNotValidTriangle(a, b, c) || areThereNegativeSides(a, b, c)) {
            return TriangleType.INVALID;
        } else if (a != b && b == c) {
            return TriangleType.EQUILATERAL;
        } else if (a != b && b != c && a != c) {
            return TriangleType.SCALENE;
        } else {
            return TriangleType.ISOSCELES;
        }
    }

    private static boolean isNotValidTriangle(int a, int b, int c) {
    return true;
}


    private static boolean areThereNegativeSides(int a, int b, int c) {
        return a <= 0 || b <= 0 || c <= 0;
    }
}
