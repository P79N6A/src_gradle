package com.meizu.cloud.pushsdk.base;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f27064a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: b  reason: collision with root package name */
    private static final char f27065b = ((char) Integer.parseInt("00000011", 2));

    /* renamed from: c  reason: collision with root package name */
    private static final char f27066c = ((char) Integer.parseInt("00001111", 2));

    /* renamed from: d  reason: collision with root package name */
    private static final char f27067d = ((char) Integer.parseInt("00111111", 2));

    /* renamed from: e  reason: collision with root package name */
    private String f27068e;

    /* renamed from: f  reason: collision with root package name */
    private char[] f27069f;
    private int g;

    public d(String str) {
        this.f27068e = str;
        a();
    }

    private void a() {
        char[] cArr = new char[f27064a.length];
        this.g = this.f27068e.charAt(0) % 13;
        for (int i = 0; i < f27064a.length; i++) {
            cArr[i] = f27064a[(this.g + i) % f27064a.length];
        }
        this.f27069f = cArr;
    }

    public String a(byte[] bArr) {
        String str;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder(((bArr.length + 2) / 3) * 4);
        int i = 0;
        int length = bArr.length;
        while (true) {
            if (i >= length) {
                break;
            }
            int i2 = i + 1;
            char c2 = bArr[i] & 255;
            if (i2 == length) {
                sb.append(this.f27069f[c2 >>> 2]);
                sb.append(this.f27069f[(c2 & f27065b) << 4]);
                str = "==";
                break;
            }
            int i3 = i2 + 1;
            char c3 = bArr[i2] & 255;
            if (i3 == length) {
                sb.append(this.f27069f[c2 >>> 2]);
                sb.append(this.f27069f[((c2 & f27065b) << 4) | (c3 >>> 4)]);
                sb.append(this.f27069f[(f27066c & c3) << 2]);
                str = "=";
                break;
            }
            int i4 = i3 + 1;
            char c4 = bArr[i3] & 255;
            sb.append(this.f27069f[c2 >>> 2]);
            sb.append(this.f27069f[((c2 & f27065b) << 4) | (c3 >>> 4)]);
            sb.append(this.f27069f[((c3 & f27066c) << 2) | (c4 >>> 6)]);
            sb.append(this.f27069f[f27067d & c4]);
            i = i4;
        }
        sb.append(str);
        return sb.toString();
    }
}
