package cn.com.chinatelecom.a.a.c;

public final class c {
    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        StringBuilder sb = new StringBuilder((length * 3) / 2);
        int i = length - 3;
        int i2 = 0;
        loop0:
        while (true) {
            int i3 = 0;
            while (i2 <= i) {
                byte b2 = ((bArr[i2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8) | (bArr[i2 + 2] & 255);
                sb.append(b.f1684a[(b2 >> 18) & 63]);
                sb.append(b.f1684a[(b2 >> 12) & 63]);
                sb.append(b.f1684a[(b2 >> 6) & 63]);
                sb.append(b.f1684a[b2 & 63]);
                i2 += 3;
                int i4 = i3 + 1;
                if (i3 >= 14) {
                    sb.append(" ");
                } else {
                    i3 = i4;
                }
            }
            break loop0;
        }
        int i5 = length + 0;
        if (i2 == i5 - 2) {
            int i6 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            sb.append(b.f1684a[(i6 >> 18) & 63]);
            sb.append(b.f1684a[(i6 >> 12) & 63]);
            sb.append(b.f1684a[(i6 >> 6) & 63]);
            sb.append("=");
        } else if (i2 == i5 - 1) {
            int i7 = (bArr[i2] & 255) << 16;
            sb.append(b.f1684a[(i7 >> 18) & 63]);
            sb.append(b.f1684a[(i7 >> 12) & 63]);
            sb.append("==");
        }
        return sb.toString();
    }
}
