import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        BigInteger one = new BigInteger("1");
        Arrays.stream(digits).forEach(each->sb.append(each));
        BigInteger bi = new BigInteger(sb.toString());
        bi = bi.add(one);
        return bi.toString().chars().map(c->c-'0').toArray();
    }
}