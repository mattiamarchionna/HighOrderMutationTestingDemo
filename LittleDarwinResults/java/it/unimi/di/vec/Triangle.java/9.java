/* LittleDarwin generated order-2 mutant
mutant type: RelationalOperatorReplacement
----> before:         } else if (a != b && b != c && a != c) {
----> after:         } else if (a != b && b != c && a == c) {
----> line number in original file: 9
----> mutated node: 267

mutant type: ConditionalOperatorReplacement
----> before:         return a + b <= c || a + c <= b || b + c <= a;
----> after:         return a + b <= c && a + c <= b || b + c <= a;
----> line number in original file: 17
----> mutated node: 169

*/

package it.unimi.di.vec;

public class Triangle {
    public static TriangleType classify(int a, int b, int c) {
        if (isNotValidTriangle(a, b, c) || areThereNegativeSides(a, b, c)) {
            return TriangleType.INVALID;
        } else if (a == b && b == c) {
            return TriangleType.EQUILATERAL;
        } else if (a != b && b != c && a == c) {
            return TriangleType.SCALENE;
        } else {
            return TriangleType.ISOSCELES;
        }
    }

    private static boolean isNotValidTriangle(int a, int b, int c) {
        return a + b <= c && a + c <= b || b + c <= a;
    }

    private static boolean areThereNegativeSides(int a, int b, int c) {
        return a <= 0 || b <= 0 || c <= 0;
    }
}
