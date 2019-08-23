package cn.com.chinatelecom.a.a.c;

import android.text.TextUtils;
import android.util.Log;
import cn.com.chinatelecom.a.a.e.b;
import java.util.Locale;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f1689a = {1732584193, -271733879, -1732584194, 271733878, -1009589776};

    /* renamed from: b  reason: collision with root package name */
    private int[] f1690b = new int[5];

    /* renamed from: c  reason: collision with root package name */
    private int[] f1691c = new int[80];

    private static int a(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private static int a(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b2 : bArr) {
            String upperCase = Integer.toHexString(b2 & 255).toUpperCase(Locale.CHINA);
            if (upperCase.length() < 2) {
                sb.append(0);
            }
            sb.append(upperCase);
        }
        return sb.toString();
    }

    private byte[] b(byte[] bArr) {
        int i;
        byte[] bArr2 = bArr;
        System.arraycopy(this.f1689a, 0, this.f1690b, 0, this.f1689a.length);
        int length = bArr2.length;
        int i2 = length % 64;
        int i3 = 63;
        if (i2 < 56) {
            i3 = 55 - i2;
            i = (length - i2) + 64;
        } else if (i2 == 56) {
            i = length + 8 + 64;
        } else {
            i3 = (63 - i2) + 56;
            i = ((length + 64) - i2) + 64;
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(bArr2, 0, bArr3, 0, length);
        bArr3[length] = Byte.MIN_VALUE;
        int i4 = length + 1;
        int i5 = 0;
        while (i5 < i3) {
            bArr3[i4] = 0;
            i5++;
            i4++;
        }
        long j = ((long) length) * 8;
        byte b2 = 24;
        byte b3 = (byte) ((int) ((j >> 8) & 255));
        int i6 = i4 + 1;
        bArr3[i4] = (byte) ((int) (j >> 56));
        int i7 = i6 + 1;
        bArr3[i6] = (byte) ((int) (255 & (j >> 48)));
        int i8 = i7 + 1;
        bArr3[i7] = (byte) ((int) ((j >> 40) & 255));
        int i9 = i8 + 1;
        bArr3[i8] = (byte) ((int) ((j >> 32) & 255));
        int i10 = i9 + 1;
        bArr3[i9] = (byte) ((int) ((j >> 24) & 255));
        int i11 = i10 + 1;
        bArr3[i10] = (byte) ((int) ((j >> 16) & 255));
        bArr3[i11] = b3;
        bArr3[i11 + 1] = (byte) ((int) (j & 255));
        int length2 = bArr3.length / 64;
        int i12 = 0;
        while (i12 < length2) {
            for (int i13 = 0; i13 < 16; i13++) {
                int i14 = (i12 * 64) + (i13 * 4);
                this.f1691c[i13] = (bArr3[i14 + 3] & 255) | ((bArr3[i14] & 255) << b2) | ((bArr3[i14 + 1] & 255) << 16) | ((bArr3[i14 + 2] & 255) << 8);
            }
            for (int i15 = 16; i15 <= 79; i15++) {
                int[] iArr = this.f1691c;
                iArr[i15] = a(((iArr[i15 - 3] ^ this.f1691c[i15 - 8]) ^ this.f1691c[i15 - 14]) ^ this.f1691c[i15 - 16], 1);
            }
            int[] iArr2 = new int[5];
            for (int i16 = 0; i16 < 5; i16++) {
                iArr2[i16] = this.f1690b[i16];
            }
            for (int i17 = 0; i17 <= 19; i17++) {
                int a2 = a(iArr2[0], 5);
                int i18 = iArr2[1];
                iArr2[4] = iArr2[3];
                iArr2[3] = iArr2[2];
                iArr2[2] = a(iArr2[1], 30);
                iArr2[1] = iArr2[0];
                iArr2[0] = a2 + ((i18 & iArr2[2]) | ((i18 ^ -1) & iArr2[3])) + iArr2[4] + this.f1691c[i17] + 1518500249;
            }
            for (int i19 = 20; i19 <= 39; i19++) {
                iArr2[4] = iArr2[3];
                iArr2[3] = iArr2[2];
                iArr2[2] = a(iArr2[1], 30);
                iArr2[1] = iArr2[0];
                iArr2[0] = a(iArr2[0], 5) + a(iArr2[1], iArr2[2], iArr2[3]) + iArr2[4] + this.f1691c[i19] + 1859775393;
            }
            for (int i20 = 40; i20 <= 59; i20++) {
                int a3 = a(iArr2[0], 5);
                int i21 = iArr2[1];
                int i22 = iArr2[2];
                int i23 = iArr2[3];
                iArr2[4] = iArr2[3];
                iArr2[3] = iArr2[2];
                iArr2[2] = a(iArr2[1], 30);
                iArr2[1] = iArr2[0];
                iArr2[0] = (((a3 + (((i21 & i22) | (i21 & i23)) | (i22 & i23))) + iArr2[4]) + this.f1691c[i20]) - 1894007588;
            }
            for (int i24 = 60; i24 <= 79; i24++) {
                iArr2[4] = iArr2[3];
                iArr2[3] = iArr2[2];
                iArr2[2] = a(iArr2[1], 30);
                iArr2[1] = iArr2[0];
                iArr2[0] = (((a(iArr2[0], 5) + a(iArr2[1], iArr2[2], iArr2[3])) + iArr2[4]) + this.f1691c[i24]) - 899497514;
            }
            for (int i25 = 0; i25 < 5; i25++) {
                int[] iArr3 = this.f1690b;
                iArr3[i25] = iArr3[i25] + iArr2[i25];
            }
            for (int i26 = 0; i26 < this.f1691c.length; i26++) {
                this.f1691c[i26] = 0;
            }
            i12++;
            b2 = 24;
        }
        byte[] bArr4 = new byte[20];
        for (int i27 = 0; i27 < this.f1690b.length; i27++) {
            int i28 = this.f1690b[i27];
            int i29 = i27 * 4;
            bArr4[i29] = (byte) (i28 >>> 24);
            bArr4[i29 + 1] = (byte) (i28 >>> 16);
            bArr4[i29 + 2] = (byte) (i28 >>> 8);
            bArr4[i29 + 3] = (byte) i28;
        }
        return bArr4;
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[(bArr2.length + 64)];
        for (int i = 0; i < 64; i++) {
            bArr3[i] = bArr[i];
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            bArr3[i2 + 64] = bArr2[i2];
        }
        return bArr3;
    }

    public static byte[] a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            if (b.f1706a) {
                if (b.f1706a) {
                    cn.com.chinatelecom.a.a.e.f.a("HMAC_SHA1", "when getHmacSHA1,the key is null");
                }
                Log.d("HMAC_SHA1", "when getHmacSHA1,the key is null");
            }
            return null;
        }
        byte[] bArr = new byte[64];
        byte[] bArr2 = new byte[64];
        byte[] bArr3 = new byte[64];
        int length = str2.length();
        f fVar = new f();
        if (str2.length() > 64) {
            byte[] b2 = fVar.b(i.b(str2));
            for (int i = 0; i < 20; i++) {
                bArr3[i] = b2[i];
            }
            length = 20;
        } else {
            byte[] b3 = i.b(str2);
            for (int i2 = 0; i2 < b3.length; i2++) {
                bArr3[i2] = b3[i2];
            }
        }
        while (length < 64) {
            bArr3[length] = 0;
            length++;
        }
        for (int i3 = 0; i3 < 64; i3++) {
            bArr[i3] = (byte) (bArr3[i3] ^ 54);
            bArr2[i3] = (byte) (bArr3[i3] ^ 92);
        }
        return fVar.b(a(bArr2, fVar.b(a(bArr, i.b(str)))));
    }
}
