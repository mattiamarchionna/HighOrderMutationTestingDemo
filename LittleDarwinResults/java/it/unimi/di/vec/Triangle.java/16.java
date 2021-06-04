/* LittleDarwin generated order-1 mutant
mutant type: NullifyReturnValue
----> before:             return TriangleType.SCALENE;
----> after:             return null;
----> line number in original file: 10
----> mutated node: 315

*/

package it.unimi.di.vec;

public class Triangle {
    public static TriangleType classify(int a, int b, int c) {
        if (isNotValidTriangle(a, b, c) || areThereNegativeSides(a, b, c)) {
            return TriangleType.INVALID;
        } else if (a == b && b == c) {
            return TriangleType.EQUILATERAL;
        } else if (a != b && b != c && a != c) {
            return null;
        } else {
            return TriangleType.ISOSCELES;
        }
    }

    private static boolean isNotValidTriangle(int a, int b, int c) {
        return a + b <= c || a + c <= b || b + c <= a;
    }

    private static boolean areThereNegativeSides(int a, int b, int c) {
        return a <= 0 || b <= 0 || c <= 0;
    }
}
