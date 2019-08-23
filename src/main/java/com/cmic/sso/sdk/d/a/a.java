package com.cmic.sso.sdk.d.a;

public class a extends d {

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f23049b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f23050c = new byte[256];

    /* renamed from: a  reason: collision with root package name */
    byte[] f23051a = new byte[4];

    /* access modifiers changed from: protected */
    public int a() {
        return 4;
    }

    /* access modifiers changed from: protected */
    public int b() {
        return 72;
    }

    static {
        for (int i = 0; i < 255; i++) {
            f23050c[i] = -1;
        }
        for (int i2 = 0; i2 < f23049b.length; i2++) {
            f23050c[f23049b[i2]] = (byte) i2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
        r9 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        r3 = f23050c[r8.f23051a[1] & 255];
        r4 = r9;
        r9 = r2;
        r2 = f23050c[r8.f23051a[0] & 255];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0078, code lost:
        switch(r11) {
            case 2: goto L_0x00ba;
            case 3: goto L_0x00a1;
            case 4: goto L_0x007c;
            default: goto L_0x007b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        r10.write((byte) (((r2 << 2) & 252) | ((r3 >>> 4) & 3)));
        r10.write((byte) (((r3 << 4) & 240) | ((r9 >>> 2) & 15)));
        r10.write((byte) (((r9 << 6) & 192) | (r4 & 63)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a1, code lost:
        r10.write((byte) (((r2 << 2) & 252) | (3 & (r3 >>> 4))));
        r10.write((byte) (((r9 >>> 2) & 15) | ((r3 << 4) & 240)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ba, code lost:
        r10.write((byte) (((r2 << 2) & 252) | ((r3 >>> 4) & 3)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c7, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.io.PushbackInputStream r9, java.io.OutputStream r10, int r11) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 2
            if (r11 < r0) goto L_0x00d4
        L_0x0003:
            int r1 = r9.read()
            r2 = -1
            if (r1 == r2) goto L_0x00ce
            r3 = 10
            if (r1 == r3) goto L_0x0003
            r3 = 13
            if (r1 == r3) goto L_0x0003
            byte[] r3 = r8.f23051a
            byte r1 = (byte) r1
            r4 = 0
            r3[r4] = r1
            byte[] r1 = r8.f23051a
            int r3 = r11 + -1
            r5 = 1
            int r9 = r8.a(r9, r1, r5, r3)
            if (r9 == r2) goto L_0x00c8
            r9 = 61
            r1 = 3
            if (r11 <= r1) goto L_0x002f
            byte[] r3 = r8.f23051a
            byte r3 = r3[r1]
            if (r3 != r9) goto L_0x002f
            r11 = 3
        L_0x002f:
            if (r11 <= r0) goto L_0x0038
            byte[] r3 = r8.f23051a
            byte r3 = r3[r0]
            if (r3 != r9) goto L_0x0038
            r11 = 2
        L_0x0038:
            switch(r11) {
                case 2: goto L_0x005f;
                case 3: goto L_0x0054;
                case 4: goto L_0x003f;
                default: goto L_0x003b;
            }
        L_0x003b:
            r9 = -1
            r3 = -1
            r4 = -1
            goto L_0x0078
        L_0x003f:
            byte[] r9 = f23050c
            byte[] r2 = r8.f23051a
            byte r2 = r2[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r9 = r9[r2]
            byte[] r2 = f23050c
            byte[] r3 = r8.f23051a
            byte r3 = r3[r0]
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r2 = r2[r3]
            goto L_0x0060
        L_0x0054:
            byte[] r9 = f23050c
            byte[] r3 = r8.f23051a
            byte r3 = r3[r0]
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r9 = r9[r3]
            r2 = r9
        L_0x005f:
            r9 = -1
        L_0x0060:
            byte[] r3 = f23050c
            byte[] r6 = r8.f23051a
            byte r5 = r6[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r3 = r3[r5]
            byte[] r5 = f23050c
            byte[] r6 = r8.f23051a
            byte r4 = r6[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = r5[r4]
            r7 = r4
            r4 = r9
            r9 = r2
            r2 = r7
        L_0x0078:
            switch(r11) {
                case 2: goto L_0x00ba;
                case 3: goto L_0x00a1;
                case 4: goto L_0x007c;
                default: goto L_0x007b;
            }
        L_0x007b:
            goto L_0x00c7
        L_0x007c:
            int r11 = r2 << 2
            r11 = r11 & 252(0xfc, float:3.53E-43)
            int r0 = r3 >>> 4
            r0 = r0 & r1
            r11 = r11 | r0
            byte r11 = (byte) r11
            r10.write(r11)
            int r11 = r3 << 4
            r11 = r11 & 240(0xf0, float:3.36E-43)
            int r0 = r9 >>> 2
            r0 = r0 & 15
            r11 = r11 | r0
            byte r11 = (byte) r11
            r10.write(r11)
            int r9 = r9 << 6
            r9 = r9 & 192(0xc0, float:2.69E-43)
            r11 = r4 & 63
            r9 = r9 | r11
            byte r9 = (byte) r9
            r10.write(r9)
            goto L_0x00c7
        L_0x00a1:
            int r11 = r2 << 2
            r11 = r11 & 252(0xfc, float:3.53E-43)
            int r2 = r3 >>> 4
            r1 = r1 & r2
            r11 = r11 | r1
            byte r11 = (byte) r11
            r10.write(r11)
            int r11 = r3 << 4
            r11 = r11 & 240(0xf0, float:3.36E-43)
            int r9 = r9 >>> r0
            r9 = r9 & 15
            r9 = r9 | r11
            byte r9 = (byte) r9
            r10.write(r9)
            return
        L_0x00ba:
            int r9 = r2 << 2
            r9 = r9 & 252(0xfc, float:3.53E-43)
            int r11 = r3 >>> 4
            r11 = r11 & r1
            r9 = r9 | r11
            byte r9 = (byte) r9
            r10.write(r9)
            return
        L_0x00c7:
            return
        L_0x00c8:
            com.cmic.sso.sdk.d.a.c r9 = new com.cmic.sso.sdk.d.a.c
            r9.<init>()
            throw r9
        L_0x00ce:
            com.cmic.sso.sdk.d.a.c r9 = new com.cmic.sso.sdk.d.a.c
            r9.<init>()
            throw r9
        L_0x00d4:
            com.cmic.sso.sdk.d.a.b r9 = new com.cmic.sso.sdk.d.a.b
            java.lang.String r10 = "BASE64Decoder: Not enough bytes for an atom."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmic.sso.sdk.d.a.a.a(java.io.PushbackInputStream, java.io.OutputStream, int):void");
    }
}
