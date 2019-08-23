package com.ss.android.ugc.aweme.im.sdk.k;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51769a;

    /* renamed from: b  reason: collision with root package name */
    static final s f51770b = new e("UTF8");

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, a> f51771c;

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f51772d = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51773a;

        /* renamed from: b  reason: collision with root package name */
        private final char[] f51774b;

        /* renamed from: c  reason: collision with root package name */
        private i f51775c;

        public final synchronized i a() {
            if (PatchProxy.isSupport(new Object[0], this, f51773a, false, 54288, new Class[0], i.class)) {
                return (i) PatchProxy.accessDispatch(new Object[0], this, f51773a, false, 54288, new Class[0], i.class);
            }
            if (this.f51775c == null) {
                this.f51775c = new i(this.f51774b);
            }
            return this.f51775c;
        }

        a(char[] cArr) {
            this.f51774b = cArr;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        char[] cArr = new char[SearchJediMixFeedAdapter.f42517f];
        // fill-array-data instruction
        cArr[0] = 199;
        cArr[1] = 252;
        cArr[2] = 233;
        cArr[3] = 226;
        cArr[4] = 228;
        cArr[5] = 224;
        cArr[6] = 229;
        cArr[7] = 231;
        cArr[8] = 234;
        cArr[9] = 235;
        cArr[10] = 232;
        cArr[11] = 239;
        cArr[12] = 238;
        cArr[13] = 236;
        cArr[14] = 196;
        cArr[15] = 197;
        cArr[16] = 201;
        cArr[17] = 230;
        cArr[18] = 198;
        cArr[19] = 244;
        cArr[20] = 246;
        cArr[21] = 242;
        cArr[22] = 251;
        cArr[23] = 249;
        cArr[24] = 255;
        cArr[25] = 214;
        cArr[26] = 220;
        cArr[27] = 162;
        cArr[28] = 163;
        cArr[29] = 165;
        cArr[30] = 8359;
        cArr[31] = 402;
        cArr[32] = 225;
        cArr[33] = 237;
        cArr[34] = 243;
        cArr[35] = 250;
        cArr[36] = 241;
        cArr[37] = 209;
        cArr[38] = 170;
        cArr[39] = 186;
        cArr[40] = 191;
        cArr[41] = 8976;
        cArr[42] = 172;
        cArr[43] = 189;
        cArr[44] = 188;
        cArr[45] = 161;
        cArr[46] = 171;
        cArr[47] = 187;
        cArr[48] = 9617;
        cArr[49] = 9618;
        cArr[50] = 9619;
        cArr[51] = 9474;
        cArr[52] = 9508;
        cArr[53] = 9569;
        cArr[54] = 9570;
        cArr[55] = 9558;
        cArr[56] = 9557;
        cArr[57] = 9571;
        cArr[58] = 9553;
        cArr[59] = 9559;
        cArr[60] = 9565;
        cArr[61] = 9564;
        cArr[62] = 9563;
        cArr[63] = 9488;
        cArr[64] = 9492;
        cArr[65] = 9524;
        cArr[66] = 9516;
        cArr[67] = 9500;
        cArr[68] = 9472;
        cArr[69] = 9532;
        cArr[70] = 9566;
        cArr[71] = 9567;
        cArr[72] = 9562;
        cArr[73] = 9556;
        cArr[74] = 9577;
        cArr[75] = 9574;
        cArr[76] = 9568;
        cArr[77] = 9552;
        cArr[78] = 9580;
        cArr[79] = 9575;
        cArr[80] = 9576;
        cArr[81] = 9572;
        cArr[82] = 9573;
        cArr[83] = 9561;
        cArr[84] = 9560;
        cArr[85] = 9554;
        cArr[86] = 9555;
        cArr[87] = 9579;
        cArr[88] = 9578;
        cArr[89] = 9496;
        cArr[90] = 9484;
        cArr[91] = 9608;
        cArr[92] = 9604;
        cArr[93] = 9612;
        cArr[94] = 9616;
        cArr[95] = 9600;
        cArr[96] = 945;
        cArr[97] = 223;
        cArr[98] = 915;
        cArr[99] = 960;
        cArr[100] = 931;
        cArr[101] = 963;
        cArr[102] = 181;
        cArr[103] = 964;
        cArr[104] = 934;
        cArr[105] = 920;
        cArr[106] = 937;
        cArr[107] = 948;
        cArr[108] = 8734;
        cArr[109] = 966;
        cArr[110] = 949;
        cArr[111] = 8745;
        cArr[112] = 8801;
        cArr[113] = 177;
        cArr[114] = 8805;
        cArr[115] = 8804;
        cArr[116] = 8992;
        cArr[117] = 8993;
        cArr[118] = 247;
        cArr[119] = 8776;
        cArr[120] = 176;
        cArr[121] = 8729;
        cArr[122] = 183;
        cArr[123] = 8730;
        cArr[124] = 8319;
        cArr[125] = 178;
        cArr[126] = 9632;
        cArr[127] = 160;
        a aVar = new a(cArr);
        hashMap.put("CP437", aVar);
        hashMap.put("Cp437", aVar);
        hashMap.put("cp437", aVar);
        hashMap.put("IBM437", aVar);
        hashMap.put("ibm437", aVar);
        char[] cArr2 = new char[SearchJediMixFeedAdapter.f42517f];
        // fill-array-data instruction
        cArr2[0] = 199;
        cArr2[1] = 252;
        cArr2[2] = 233;
        cArr2[3] = 226;
        cArr2[4] = 228;
        cArr2[5] = 224;
        cArr2[6] = 229;
        cArr2[7] = 231;
        cArr2[8] = 234;
        cArr2[9] = 235;
        cArr2[10] = 232;
        cArr2[11] = 239;
        cArr2[12] = 238;
        cArr2[13] = 236;
        cArr2[14] = 196;
        cArr2[15] = 197;
        cArr2[16] = 201;
        cArr2[17] = 230;
        cArr2[18] = 198;
        cArr2[19] = 244;
        cArr2[20] = 246;
        cArr2[21] = 242;
        cArr2[22] = 251;
        cArr2[23] = 249;
        cArr2[24] = 255;
        cArr2[25] = 214;
        cArr2[26] = 220;
        cArr2[27] = 248;
        cArr2[28] = 163;
        cArr2[29] = 216;
        cArr2[30] = 215;
        cArr2[31] = 402;
        cArr2[32] = 225;
        cArr2[33] = 237;
        cArr2[34] = 243;
        cArr2[35] = 250;
        cArr2[36] = 241;
        cArr2[37] = 209;
        cArr2[38] = 170;
        cArr2[39] = 186;
        cArr2[40] = 191;
        cArr2[41] = 174;
        cArr2[42] = 172;
        cArr2[43] = 189;
        cArr2[44] = 188;
        cArr2[45] = 161;
        cArr2[46] = 171;
        cArr2[47] = 187;
        cArr2[48] = 9617;
        cArr2[49] = 9618;
        cArr2[50] = 9619;
        cArr2[51] = 9474;
        cArr2[52] = 9508;
        cArr2[53] = 193;
        cArr2[54] = 194;
        cArr2[55] = 192;
        cArr2[56] = 169;
        cArr2[57] = 9571;
        cArr2[58] = 9553;
        cArr2[59] = 9559;
        cArr2[60] = 9565;
        cArr2[61] = 162;
        cArr2[62] = 165;
        cArr2[63] = 9488;
        cArr2[64] = 9492;
        cArr2[65] = 9524;
        cArr2[66] = 9516;
        cArr2[67] = 9500;
        cArr2[68] = 9472;
        cArr2[69] = 9532;
        cArr2[70] = 227;
        cArr2[71] = 195;
        cArr2[72] = 9562;
        cArr2[73] = 9556;
        cArr2[74] = 9577;
        cArr2[75] = 9574;
        cArr2[76] = 9568;
        cArr2[77] = 9552;
        cArr2[78] = 9580;
        cArr2[79] = 164;
        cArr2[80] = 240;
        cArr2[81] = 208;
        cArr2[82] = 202;
        cArr2[83] = 203;
        cArr2[84] = 200;
        cArr2[85] = 305;
        cArr2[86] = 205;
        cArr2[87] = 206;
        cArr2[88] = 207;
        cArr2[89] = 9496;
        cArr2[90] = 9484;
        cArr2[91] = 9608;
        cArr2[92] = 9604;
        cArr2[93] = 166;
        cArr2[94] = 204;
        cArr2[95] = 9600;
        cArr2[96] = 211;
        cArr2[97] = 223;
        cArr2[98] = 212;
        cArr2[99] = 210;
        cArr2[100] = 245;
        cArr2[101] = 213;
        cArr2[102] = 181;
        cArr2[103] = 254;
        cArr2[104] = 222;
        cArr2[105] = 218;
        cArr2[106] = 219;
        cArr2[107] = 217;
        cArr2[108] = 253;
        cArr2[109] = 221;
        cArr2[110] = 175;
        cArr2[111] = 180;
        cArr2[112] = 173;
        cArr2[113] = 177;
        cArr2[114] = 8215;
        cArr2[115] = 190;
        cArr2[116] = 182;
        cArr2[117] = 167;
        cArr2[118] = 247;
        cArr2[119] = 184;
        cArr2[120] = 176;
        cArr2[121] = 168;
        cArr2[122] = 183;
        cArr2[123] = 185;
        cArr2[124] = 179;
        cArr2[125] = 178;
        cArr2[126] = 9632;
        cArr2[127] = 160;
        a aVar2 = new a(cArr2);
        hashMap.put("CP850", aVar2);
        hashMap.put("Cp850", aVar2);
        hashMap.put("cp850", aVar2);
        hashMap.put("IBM850", aVar2);
        hashMap.put("ibm850", aVar2);
        f51771c = Collections.unmodifiableMap(hashMap);
    }

    public static s a(String str) {
        String str2;
        String str3 = str;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str3}, null, f51769a, true, 54286, new Class[]{String.class}, s.class)) {
            return (s) PatchProxy.accessDispatch(new Object[]{str3}, null, f51769a, true, 54286, new Class[]{String.class}, s.class);
        }
        if (PatchProxy.isSupport(new Object[]{str3}, null, f51769a, true, 54287, new Class[]{String.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{str3}, null, f51769a, true, 54287, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else {
            if (str3 == null) {
                str2 = System.getProperty("file.encoding");
            } else {
                str2 = str3;
            }
            if (!"UTF8".equalsIgnoreCase(str2) && !"utf-8".equalsIgnoreCase(str2)) {
                z = false;
            }
        }
        if (z) {
            return f51770b;
        }
        if (str3 == null) {
            return new e();
        }
        a aVar = f51771c.get(str3);
        if (aVar != null) {
            return aVar.a();
        }
        try {
            return new h(Charset.forName(str));
        } catch (UnsupportedCharsetException unused) {
            return new e(str3);
        }
    }

    static ByteBuffer a(ByteBuffer byteBuffer, int i) {
        ByteBuffer byteBuffer2 = byteBuffer;
        if (PatchProxy.isSupport(new Object[]{byteBuffer2, Integer.valueOf(i)}, null, f51769a, true, 54284, new Class[]{ByteBuffer.class, Integer.TYPE}, ByteBuffer.class)) {
            return (ByteBuffer) PatchProxy.accessDispatch(new Object[]{byteBuffer2, Integer.valueOf(i)}, null, f51769a, true, 54284, new Class[]{ByteBuffer.class, Integer.TYPE}, ByteBuffer.class);
        }
        byteBuffer2.limit(byteBuffer.position());
        byteBuffer.rewind();
        int capacity = byteBuffer.capacity() * 2;
        int i2 = i;
        if (capacity < i2) {
            capacity = i2;
        }
        ByteBuffer allocate = ByteBuffer.allocate(capacity);
        allocate.put(byteBuffer2);
        return allocate;
    }

    static void a(ByteBuffer byteBuffer, char c2) {
        ByteBuffer byteBuffer2 = byteBuffer;
        if (PatchProxy.isSupport(new Object[]{byteBuffer2, Character.valueOf(c2)}, null, f51769a, true, 54285, new Class[]{ByteBuffer.class, Character.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{byteBuffer2, Character.valueOf(c2)}, null, f51769a, true, 54285, new Class[]{ByteBuffer.class, Character.TYPE}, Void.TYPE);
            return;
        }
        byteBuffer2.put((byte) 37);
        byteBuffer2.put((byte) 85);
        byteBuffer2.put(f51772d[(c2 >> 12) & 15]);
        byteBuffer2.put(f51772d[(c2 >> 8) & 15]);
        byteBuffer2.put(f51772d[(c2 >> 4) & 15]);
        byteBuffer2.put(f51772d[c2 & 15]);
    }
}
