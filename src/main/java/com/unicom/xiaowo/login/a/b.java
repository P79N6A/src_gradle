package com.unicom.xiaowo.login.a;

import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static char[] f81414a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: b  reason: collision with root package name */
    private static byte[] f81415b;

    static {
        byte[] bArr = new byte[SearchJediMixFeedAdapter.f42517f];
        // fill-array-data instruction
        bArr[0] = -1;
        bArr[1] = -1;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = -1;
        bArr[5] = -1;
        bArr[6] = -1;
        bArr[7] = -1;
        bArr[8] = -1;
        bArr[9] = -1;
        bArr[10] = -1;
        bArr[11] = -1;
        bArr[12] = -1;
        bArr[13] = -1;
        bArr[14] = -1;
        bArr[15] = -1;
        bArr[16] = -1;
        bArr[17] = -1;
        bArr[18] = -1;
        bArr[19] = -1;
        bArr[20] = -1;
        bArr[21] = -1;
        bArr[22] = -1;
        bArr[23] = -1;
        bArr[24] = -1;
        bArr[25] = -1;
        bArr[26] = -1;
        bArr[27] = -1;
        bArr[28] = -1;
        bArr[29] = -1;
        bArr[30] = -1;
        bArr[31] = -1;
        bArr[32] = -1;
        bArr[33] = -1;
        bArr[34] = -1;
        bArr[35] = -1;
        bArr[36] = -1;
        bArr[37] = -1;
        bArr[38] = -1;
        bArr[39] = -1;
        bArr[40] = -1;
        bArr[41] = -1;
        bArr[42] = -1;
        bArr[43] = 62;
        bArr[44] = -1;
        bArr[45] = -1;
        bArr[46] = -1;
        bArr[47] = 63;
        bArr[48] = 52;
        bArr[49] = 53;
        bArr[50] = 54;
        bArr[51] = 55;
        bArr[52] = 56;
        bArr[53] = 57;
        bArr[54] = 58;
        bArr[55] = 59;
        bArr[56] = 60;
        bArr[57] = 61;
        bArr[58] = -1;
        bArr[59] = -1;
        bArr[60] = -1;
        bArr[61] = -1;
        bArr[62] = -1;
        bArr[63] = -1;
        bArr[64] = -1;
        bArr[65] = 0;
        bArr[66] = 1;
        bArr[67] = 2;
        bArr[68] = 3;
        bArr[69] = 4;
        bArr[70] = 5;
        bArr[71] = 6;
        bArr[72] = 7;
        bArr[73] = 8;
        bArr[74] = 9;
        bArr[75] = 10;
        bArr[76] = 11;
        bArr[77] = 12;
        bArr[78] = 13;
        bArr[79] = 14;
        bArr[80] = 15;
        bArr[81] = 16;
        bArr[82] = 17;
        bArr[83] = 18;
        bArr[84] = 19;
        bArr[85] = 20;
        bArr[86] = 21;
        bArr[87] = 22;
        bArr[88] = 23;
        bArr[89] = 24;
        bArr[90] = 25;
        bArr[91] = -1;
        bArr[92] = -1;
        bArr[93] = -1;
        bArr[94] = -1;
        bArr[95] = -1;
        bArr[96] = -1;
        bArr[97] = 26;
        bArr[98] = 27;
        bArr[99] = 28;
        bArr[100] = 29;
        bArr[101] = 30;
        bArr[102] = 31;
        bArr[103] = 32;
        bArr[104] = 33;
        bArr[105] = 34;
        bArr[106] = 35;
        bArr[107] = 36;
        bArr[108] = 37;
        bArr[109] = 38;
        bArr[110] = 39;
        bArr[111] = 40;
        bArr[112] = 41;
        bArr[113] = 42;
        bArr[114] = 43;
        bArr[115] = 44;
        bArr[116] = 45;
        bArr[117] = 46;
        bArr[118] = 47;
        bArr[119] = 48;
        bArr[120] = 49;
        bArr[121] = 50;
        bArr[122] = 51;
        bArr[123] = -1;
        bArr[124] = -1;
        bArr[125] = -1;
        bArr[126] = -1;
        bArr[127] = -1;
        f81415b = bArr;
    }

    public static String a(byte[] bArr) {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int i2 = i + 1;
            byte b2 = bArr[i] & 255;
            if (i2 == length) {
                stringBuffer.append(f81414a[b2 >>> 2]);
                stringBuffer.append(f81414a[(b2 & 3) << 4]);
                str = "==";
                break;
            }
            int i3 = i2 + 1;
            byte b3 = bArr[i2] & 255;
            if (i3 == length) {
                stringBuffer.append(f81414a[b2 >>> 2]);
                stringBuffer.append(f81414a[((b2 & 3) << 4) | ((b3 & 240) >>> 4)]);
                stringBuffer.append(f81414a[(b3 & 15) << 2]);
                str = "=";
                break;
            }
            int i4 = i3 + 1;
            byte b4 = bArr[i3] & 255;
            stringBuffer.append(f81414a[b2 >>> 2]);
            stringBuffer.append(f81414a[((b2 & 3) << 4) | ((b3 & 240) >>> 4)]);
            stringBuffer.append(f81414a[((b3 & 15) << 2) | ((b4 & 192) >>> 6)]);
            stringBuffer.append(f81414a[b4 & 63]);
            i = i4;
        }
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078 A[LOOP:0: B:1:0x000b->B:32:0x0078, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0082 A[EDGE_INSN: B:37:0x0082->B:33:0x0082 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0082 A[EDGE_INSN: B:38:0x0082->B:33:0x0082 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0082 A[EDGE_INSN: B:40:0x0082->B:33:0x0082 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0082 A[EDGE_INSN: B:41:0x0082->B:33:0x0082 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f A[LOOP:2: B:7:0x001f->B:10:0x002c, LOOP_START, PHI: r4 
      PHI: (r4v1 int) = (r4v0 int), (r4v8 int) binds: [B:6:0x001d, B:10:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(java.lang.String r8) {
        /*
            byte[] r8 = r8.getBytes()
            int r0 = r8.length
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>(r0)
            r2 = 0
        L_0x000b:
            if (r2 >= r0) goto L_0x0082
        L_0x000d:
            byte[] r3 = f81415b
            int r4 = r2 + 1
            byte r2 = r8[r2]
            byte r2 = r3[r2]
            r3 = -1
            if (r4 >= r0) goto L_0x001d
            if (r2 == r3) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r2 = r4
            goto L_0x000d
        L_0x001d:
            if (r2 == r3) goto L_0x0082
        L_0x001f:
            byte[] r5 = f81415b
            int r6 = r4 + 1
            byte r4 = r8[r4]
            byte r4 = r5[r4]
            if (r6 >= r0) goto L_0x002e
            if (r4 == r3) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r4 = r6
            goto L_0x001f
        L_0x002e:
            if (r4 == r3) goto L_0x0082
            int r2 = r2 << 2
            r5 = r4 & 48
            int r5 = r5 >>> 4
            r2 = r2 | r5
            r1.write(r2)
        L_0x003a:
            int r2 = r6 + 1
            byte r5 = r8[r6]
            r6 = 61
            if (r5 != r6) goto L_0x0047
            byte[] r8 = r1.toByteArray()
            return r8
        L_0x0047:
            byte[] r7 = f81415b
            byte r5 = r7[r5]
            if (r2 >= r0) goto L_0x0052
            if (r5 == r3) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r6 = r2
            goto L_0x003a
        L_0x0052:
            if (r5 == r3) goto L_0x0082
            r4 = r4 & 15
            int r4 = r4 << 4
            r7 = r5 & 60
            int r7 = r7 >>> 2
            r4 = r4 | r7
            r1.write(r4)
        L_0x0060:
            int r4 = r2 + 1
            byte r2 = r8[r2]
            if (r2 != r6) goto L_0x006b
            byte[] r8 = r1.toByteArray()
            return r8
        L_0x006b:
            byte[] r7 = f81415b
            byte r2 = r7[r2]
            if (r4 >= r0) goto L_0x0076
            if (r2 == r3) goto L_0x0074
            goto L_0x0076
        L_0x0074:
            r2 = r4
            goto L_0x0060
        L_0x0076:
            if (r2 == r3) goto L_0x0082
            r3 = r5 & 3
            int r3 = r3 << 6
            r2 = r2 | r3
            r1.write(r2)
            r2 = r4
            goto L_0x000b
        L_0x0082:
            byte[] r8 = r1.toByteArray()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unicom.xiaowo.login.a.b.a(java.lang.String):byte[]");
    }
}
