package cn.com.chinatelecom.a.a.c;

import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.UnsupportedEncodingException;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static char[] f1685a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: b  reason: collision with root package name */
    private static byte[] f1686b;

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
        f1686b = bArr;
    }

    public static byte[] a(String str) {
        int i;
        byte b2;
        int i2;
        byte b3;
        int i3;
        byte b4;
        int i4;
        byte b5;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            byte[] bytes = str.getBytes("US-ASCII");
            int length = bytes.length;
            int i5 = 0;
            while (i5 < length) {
                while (true) {
                    i = i5 + 1;
                    b2 = f1686b[bytes[i5]];
                    if (i >= length) {
                        break;
                    } else if (b2 != -1) {
                        break;
                    } else {
                        i5 = i;
                    }
                }
                if (b2 == -1) {
                    break;
                }
                while (true) {
                    i2 = i + 1;
                    b3 = f1686b[bytes[i]];
                    if (i2 >= length) {
                        break;
                    } else if (b3 != -1) {
                        break;
                    } else {
                        i = i2;
                    }
                }
                if (b3 == -1) {
                    break;
                }
                stringBuffer.append((char) ((b2 << 2) | ((b3 & 48) >>> 4)));
                while (true) {
                    i3 = i2 + 1;
                    byte b6 = bytes[i2];
                    if (b6 == 61) {
                        return stringBuffer.toString().getBytes("iso8859-1");
                    }
                    b4 = f1686b[b6];
                    if (i3 >= length) {
                        break;
                    } else if (b4 != -1) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
                if (b4 == -1) {
                    break;
                }
                stringBuffer.append((char) (((b3 & 15) << 4) | ((b4 & 60) >>> 2)));
                while (true) {
                    i4 = i3 + 1;
                    byte b7 = bytes[i3];
                    if (b7 == 61) {
                        return stringBuffer.toString().getBytes("iso8859-1");
                    }
                    b5 = f1686b[b7];
                    if (i4 >= length) {
                        break;
                    } else if (b5 != -1) {
                        break;
                    } else {
                        i3 = i4;
                    }
                }
                if (b5 == -1) {
                    break;
                }
                stringBuffer.append((char) (b5 | ((b4 & 3) << 6)));
                i5 = i4;
            }
            return stringBuffer.toString().getBytes("iso8859-1");
        } catch (UnsupportedEncodingException unused) {
            return new byte[0];
        }
    }
}
