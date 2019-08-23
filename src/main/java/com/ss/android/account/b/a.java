package com.ss.android.account.b;

import android.support.annotation.Nullable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f2415a = {"flyme", "huawei", "sina_weibo", "telecom", "qq_weibo", "renren_sns", "kaixin_sns", "qzone_sns", "mobile", "live_stream", "aweme", "weixin", "xiaomi", "email", "google", "facebook", "twitter", "instagram", "line", "kakaotalk", "vk", "toutiao", "toutiao_v2", "flipchat"};

    /* renamed from: b  reason: collision with root package name */
    public final String f2416b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2417c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2418d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public String f2419e = "";
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public String f2420f;
    @Nullable
    public String g = "";
    public String h;
    public long i;
    public long j;

    public final void a() {
        this.f2418d = false;
        this.f2419e = "";
        this.f2420f = null;
        this.g = "";
        this.i = 0;
        this.j = 0;
    }

    public static a a(String str) {
        return a(str, 0);
    }

    public a(String str, int i2) {
        this.f2416b = str;
        this.f2417c = i2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.ss.android.account.b.a a(java.lang.String r1, int r2) {
        /*
            int r2 = r1.hashCode()
            r0 = 0
            switch(r2) {
                case -1530308138: goto L_0x0102;
                case -1429363305: goto L_0x00f7;
                case -1240244679: goto L_0x00ec;
                case -1206476313: goto L_0x00e1;
                case -1134307907: goto L_0x00d6;
                case -1068855134: goto L_0x00cc;
                case -1035863501: goto L_0x00c1;
                case -916346253: goto L_0x00b6;
                case -791575966: goto L_0x00ac;
                case -759499589: goto L_0x00a1;
                case -589445623: goto L_0x0096;
                case -471473230: goto L_0x008b;
                case 3765: goto L_0x007f;
                case 3321844: goto L_0x0073;
                case 93227207: goto L_0x0067;
                case 96619420: goto L_0x005b;
                case 97536331: goto L_0x0050;
                case 486515695: goto L_0x0044;
                case 497130182: goto L_0x0038;
                case 635922494: goto L_0x002c;
                case 730878681: goto L_0x0021;
                case 1766810787: goto L_0x0016;
                case 1851692357: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x010c
        L_0x000a:
            java.lang.String r2 = "flipchat"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x010c
            r2 = 22
            goto L_0x010d
        L_0x0016:
            java.lang.String r2 = "kaixin_sns"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x010c
            r2 = 3
            goto L_0x010d
        L_0x0021:
            java.lang.String r2 = "renren_sns"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x010c
            r2 = 2
            goto L_0x010d
        L_0x002c:
            java.lang.String r2 = "toutiao_v2"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x010c
            r2 = 21
            goto L_0x010d
        L_0x0038:
            java.lang.String r2 = "facebook"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x010c
            r2 = 15
            goto L_0x010d
        L_0x0044:
            java.lang.String r2 = "kakaotalk"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x010c
            r2 = 18
            goto L_0x010d
        L_0x0050:
            java.lang.String r2 = "flyme"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x010c
            r2 = 7
            goto L_0x010d
        L_0x005b:
            java.lang.String r2 = "email"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x010c
            r2 = 11
            goto L_0x010d
        L_0x0067:
            java.lang.String r2 = "aweme"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x010c
            r2 = 13
            goto L_0x010d
        L_0x0073:
            java.lang.String r2 = "line"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x010c
            r2 = 17
            goto L_0x010d
        L_0x007f:
            java.lang.String r2 = "vk"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x010c
            r2 = 19
            goto L_0x010d
        L_0x008b:
            java.lang.String r2 = "sina_weibo"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x010c
            r2 = 0
            goto L_0x010d
        L_0x0096:
            java.lang.String r2 = "qq_weibo"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x010c
            r2 = 1
            goto L_0x010d
        L_0x00a1:
            java.lang.String r2 = "xiaomi"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x010c
            r2 = 10
            goto L_0x010d
        L_0x00ac:
            java.lang.String r2 = "weixin"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x010c
            r2 = 6
            goto L_0x010d
        L_0x00b6:
            java.lang.String r2 = "twitter"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x010c
            r2 = 16
            goto L_0x010d
        L_0x00c1:
            java.lang.String r2 = "live_stream"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x010c
            r2 = 12
            goto L_0x010d
        L_0x00cc:
            java.lang.String r2 = "mobile"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x010c
            r2 = 5
            goto L_0x010d
        L_0x00d6:
            java.lang.String r2 = "toutiao"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x010c
            r2 = 20
            goto L_0x010d
        L_0x00e1:
            java.lang.String r2 = "huawei"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x010c
            r2 = 8
            goto L_0x010d
        L_0x00ec:
            java.lang.String r2 = "google"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x010c
            r2 = 14
            goto L_0x010d
        L_0x00f7:
            java.lang.String r2 = "telecom"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x010c
            r2 = 9
            goto L_0x010d
        L_0x0102:
            java.lang.String r2 = "qzone_sns"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x010c
            r2 = 4
            goto L_0x010d
        L_0x010c:
            r2 = -1
        L_0x010d:
            switch(r2) {
                case 0: goto L_0x0166;
                case 1: goto L_0x0162;
                case 2: goto L_0x015e;
                case 3: goto L_0x015a;
                case 4: goto L_0x0156;
                case 5: goto L_0x0152;
                case 6: goto L_0x014e;
                case 7: goto L_0x014a;
                case 8: goto L_0x0146;
                case 9: goto L_0x0142;
                case 10: goto L_0x013e;
                case 11: goto L_0x013a;
                case 12: goto L_0x0136;
                case 13: goto L_0x0132;
                case 14: goto L_0x012e;
                case 15: goto L_0x012a;
                case 16: goto L_0x0126;
                case 17: goto L_0x0122;
                case 18: goto L_0x011e;
                case 19: goto L_0x011a;
                case 20: goto L_0x0116;
                case 21: goto L_0x0116;
                case 22: goto L_0x0112;
                default: goto L_0x0110;
            }
        L_0x0110:
            goto L_0x0169
        L_0x0112:
            r0 = 2131562546(0x7f0d1032, float:1.8750524E38)
            goto L_0x0169
        L_0x0116:
            r0 = 2131562560(0x7f0d1040, float:1.8750552E38)
            goto L_0x0169
        L_0x011a:
            r0 = 2131562562(0x7f0d1042, float:1.8750556E38)
            goto L_0x0169
        L_0x011e:
            r0 = 2131562553(0x7f0d1039, float:1.8750538E38)
            goto L_0x0169
        L_0x0122:
            r0 = 2131562554(0x7f0d103a, float:1.875054E38)
            goto L_0x0169
        L_0x0126:
            r0 = 2131562561(0x7f0d1041, float:1.8750554E38)
            goto L_0x0169
        L_0x012a:
            r0 = 2131562545(0x7f0d1031, float:1.8750522E38)
            goto L_0x0169
        L_0x012e:
            r0 = 2131562548(0x7f0d1034, float:1.8750528E38)
            goto L_0x0169
        L_0x0132:
            r0 = 2131562543(0x7f0d102f, float:1.8750518E38)
            goto L_0x0169
        L_0x0136:
            r0 = 2131562550(0x7f0d1036, float:1.8750532E38)
            goto L_0x0169
        L_0x013a:
            r0 = 2131562544(0x7f0d1030, float:1.875052E38)
            goto L_0x0169
        L_0x013e:
            r0 = 2131562565(0x7f0d1045, float:1.8750562E38)
            goto L_0x0169
        L_0x0142:
            r0 = 2131562558(0x7f0d103e, float:1.8750548E38)
            goto L_0x0169
        L_0x0146:
            r0 = 2131562549(0x7f0d1035, float:1.875053E38)
            goto L_0x0169
        L_0x014a:
            r0 = 2131562547(0x7f0d1033, float:1.8750526E38)
            goto L_0x0169
        L_0x014e:
            r0 = 2131562564(0x7f0d1044, float:1.875056E38)
            goto L_0x0169
        L_0x0152:
            r0 = 2131562555(0x7f0d103b, float:1.8750542E38)
            goto L_0x0169
        L_0x0156:
            r0 = 2131562556(0x7f0d103c, float:1.8750544E38)
            goto L_0x0169
        L_0x015a:
            r0 = 2131562552(0x7f0d1038, float:1.8750536E38)
            goto L_0x0169
        L_0x015e:
            r0 = 2131562557(0x7f0d103d, float:1.8750546E38)
            goto L_0x0169
        L_0x0162:
            r0 = 2131562559(0x7f0d103f, float:1.875055E38)
            goto L_0x0169
        L_0x0166:
            r0 = 2131562563(0x7f0d1043, float:1.8750558E38)
        L_0x0169:
            com.ss.android.account.b.a r2 = new com.ss.android.account.b.a
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.account.b.a.a(java.lang.String, int):com.ss.android.account.b.a");
    }
}
