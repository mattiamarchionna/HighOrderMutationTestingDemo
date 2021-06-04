/* LittleDarwin generated order-2 mutant
mutant type: NullifyReturnValue
----> before:             return TriangleType.EQUILATERAL;
----> after:             return null;
----> line number in original file: 8
----> mutated node: 264

mutant type: RelationalOperatorReplacement
----> before:         return a <= 0 || b <= 0 || c <= 0;
----> after:         return a <= 0 || b <= 0 || c > 0;
----> line number in original file: 21
----> mutated node: 177

*/

package it.unimi.di.vec;

public class Triangle {
    public static TriangleType classify(int a, int b, int c) {
        if (isNotValidTriangle(a, b, c) || areThereNegativeSides(a, b, c)) {
            return TriangleType.INVALID;
        } else if (a == b && b == c) {
            return null;
        } else if (a != b && b != c && a != c) {
            return TriangleType.SCALENE;
        } else {
            return TriangleType.ISOSCELES;
        }
    }

    private static boolean isNotValidTriangle(int a, int b, int c) {
        return a + b <= c || a + c <= b || b + c <= a;
    }

    private static boolean areThereNegativeSides(int a, int b, int c) {
        return a <= 0 || b <= 0 || c > 0;
    }
}
