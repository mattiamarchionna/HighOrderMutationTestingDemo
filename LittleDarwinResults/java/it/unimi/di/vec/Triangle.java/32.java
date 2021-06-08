/* LittleDarwin generated order-2 mutant
mutant type: RelationalOperatorReplacement
----> before:         if (a == c) {
----> after:         if (a != c) {
----> line number in original file: 13
----> mutated node: 132

mutant type: ArithmeticOperatorReplacementBinary
----> before:             if (((a + b) < c) || ((a + c) < b) || ((b + c) < a)) {
----> after:             if (((a + b) < c) || ((a - c) < b) || ((b + c) < a)) {
----> line number in original file: 20
----> mutated node: 567

*/

package it.unimi.di.vec;

public class Triangle {
    public static TriangleType classify(final int a, final int b, final int c) {
        int trian;
        if ((a <= 0) || (b <= 0) || (c <= 0)) {
            return TriangleType.INVALID;
        }
        trian = 0;
        if (a == b) {
            trian = trian + 1;
        }
        if (a != c) {
            trian = trian + 2;
        }
        if (b == c) {
            trian = trian + 3;
        }
        if (trian == 0) {
            if (((a + b) < c) || ((a - c) < b) || ((b + c) < a)) {
                return TriangleType.INVALID;
            } else {
                return TriangleType.SCALENE;
            }
        }
        if (trian > 3) {
            return TriangleType.EQUILATERAL;
        }
        if ((trian == 1) && ((a + b) > c)) {
            return TriangleType.ISOSCELES;
        } else if ((trian == 2) && ((a + c) > b)) {
            return TriangleType.ISOSCELES;
        } else if ((trian == 3) && ((b + c) > a)) {
            return TriangleType.ISOSCELES;
        }
        return TriangleType.INVALID;
    }
}
