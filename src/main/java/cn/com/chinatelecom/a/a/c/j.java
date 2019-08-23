package cn.com.chinatelecom.a.a.c;

public final class j {
    static byte[] a(int[] iArr, boolean z) {
        int i;
        int length = iArr.length << 2;
        if (z) {
            i = iArr[iArr.length - 1];
            if (i > length || i <= 0) {
                return null;
            }
        } else {
            i = length;
        }
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((iArr[i2 >>> 2] >>> ((i2 & 3) << 3)) & 255);
        }
        return bArr;
    }

    static int[] a(byte[] bArr, boolean z) {
        int i;
        int[] iArr;
        if ((bArr.length & 3) == 0) {
            i = bArr.length >>> 2;
        } else {
            i = (bArr.length >>> 2) + 1;
        }
        if (z) {
            iArr = new int[(i + 1)];
            iArr[i] = bArr.length;
        } else {
            iArr = new int[i];
        }
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 >>> 2;
            iArr[i3] = iArr[i3] | ((bArr[i2] & 255) << ((i2 & 3) << 3));
        }
        return iArr;
    }

    static int[] a(int[] iArr, int[] iArr2) {
        int length = iArr.length - 1;
        if (length <= 0) {
            return iArr;
        }
        if (iArr2.length < 4) {
            int[] iArr3 = new int[4];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            iArr2 = iArr3;
        }
        int i = iArr[0];
        for (int i2 = ((52 / (length + 1)) + 6) * -1640531527; i2 != 0; i2 -= -1640531527) {
            int i3 = (i2 >>> 2) & 3;
            int i4 = i;
            int i5 = length;
            while (i5 > 0) {
                int i6 = iArr[i5 - 1];
                i4 = iArr[i5] - (((i4 ^ i2) + (i6 ^ iArr2[(i5 & 3) ^ i3])) ^ (((i6 >>> 5) ^ (i4 << 2)) + ((i4 >>> 3) ^ (i6 << 4))));
                iArr[i5] = i4;
                i5--;
            }
            int i7 = iArr[length];
            i = iArr[0] - ((((i7 >>> 5) ^ (i4 << 2)) + ((i4 >>> 3) ^ (i7 << 4))) ^ ((i4 ^ i2) + (iArr2[(i5 & 3) ^ i3] ^ i7)));
            iArr[0] = i;
        }
        return iArr;
    }
}
