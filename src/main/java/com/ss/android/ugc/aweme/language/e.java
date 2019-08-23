package com.ss.android.ugc.aweme.language;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53002a;

    /* renamed from: b  reason: collision with root package name */
    public static Set<String> f53003b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private static Set<String> f53004c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    private static HashSet<String> f53005d;

    public interface a {
        void a(String str);
    }

    public static boolean d() {
        if (PatchProxy.isSupport(new Object[0], null, f53002a, true, 55063, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f53002a, true, 55063, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return "ID".equalsIgnoreCase(b());
    }

    public static String b() {
        if (PatchProxy.isSupport(new Object[0], null, f53002a, true, 55057, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f53002a, true, 55057, new Class[0], String.class);
        }
        String a2 = a();
        if (TextUtils.isEmpty(a2)) {
            a2 = ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getSysRegion();
            if (TextUtils.isEmpty(a2)) {
                a2 = ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getRegion();
            }
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = "";
        }
        return a2.toUpperCase();
    }

    public static boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f53002a, true, 55059, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f53002a, true, 55059, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (Locale.JAPAN.getCountry() != null && Locale.JAPAN.getCountry().equalsIgnoreCase(b())) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c5, code lost:
        if (r1 != false) goto L_0x00c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a() {
        /*
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f53002a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r2 = 0
            r4 = 1
            r5 = 55055(0xd70f, float:7.7148E-41)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f53002a
            r5 = 1
            r6 = 55055(0xd70f, float:7.7148E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0028:
            boolean r1 = com.ss.android.ugc.aweme.g.a.a()
            if (r1 != 0) goto L_0x00c7
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.language.d.f53001a
            r5 = 1
            r6 = 55054(0xd70e, float:7.7147E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            r2 = 1
            if (r1 == 0) goto L_0x005a
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r4 = 0
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.language.d.f53001a
            r6 = 1
            r7 = 55054(0xd70e, float:7.7147E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class r9 = java.lang.Boolean.TYPE
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x00c5
        L_0x005a:
            com.ss.android.ugc.aweme.app.k r1 = com.ss.android.ugc.aweme.app.k.a()
            com.ss.android.ugc.aweme.app.services.h r1 = com.ss.android.ugc.aweme.app.services.h.a(r1)
            java.lang.String r10 = "enable_region_swtich"
            r11 = 2
            java.lang.Object[] r3 = new java.lang.Object[r11]
            r3[r0] = r10
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r3[r2] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.app.services.h.f34276a
            r6 = 0
            r7 = 23607(0x5c37, float:3.308E-41)
            java.lang.Class[] r8 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r0] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r2] = r4
            java.lang.Class r9 = java.lang.Integer.TYPE
            r4 = r1
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x00ae
            java.lang.Object[] r3 = new java.lang.Object[r11]
            r3[r0] = r10
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r3[r2] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.app.services.h.f34276a
            r6 = 0
            r7 = 23607(0x5c37, float:3.308E-41)
            java.lang.Class[] r8 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r0] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r2] = r4
            java.lang.Class r9 = java.lang.Integer.TYPE
            r4 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x00c0
        L_0x00ae:
            boolean r3 = android.text.TextUtils.isEmpty(r10)
            if (r3 != 0) goto L_0x00bf
            org.json.JSONObject r3 = r1.f34278b
            if (r3 == 0) goto L_0x00bf
            org.json.JSONObject r1 = r1.f34278b
            int r1 = r1.optInt(r10, r0)
            goto L_0x00c0
        L_0x00bf:
            r1 = 0
        L_0x00c0:
            if (r1 != r2) goto L_0x00c4
            r1 = 1
            goto L_0x00c5
        L_0x00c4:
            r1 = 0
        L_0x00c5:
            if (r1 == 0) goto L_0x00f2
        L_0x00c7:
            com.ss.android.ugc.aweme.app.k r1 = com.ss.android.ugc.aweme.app.k.a()
            java.lang.String r2 = "test_setting"
            android.content.SharedPreferences r0 = com.ss.android.ugc.aweme.q.c.a(r1, r2, r0)
            java.lang.String r1 = "pref_carrier"
            boolean r2 = com.ss.android.g.a.a()
            if (r2 == 0) goto L_0x00e5
            boolean r2 = com.ss.android.g.a.b()
            if (r2 == 0) goto L_0x00e2
            java.lang.String r2 = "US"
            goto L_0x00e7
        L_0x00e2:
            java.lang.String r2 = "ID"
            goto L_0x00e7
        L_0x00e5:
            java.lang.String r2 = ""
        L_0x00e7:
            java.lang.String r0 = r0.getString(r1, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x00f2
            return r0
        L_0x00f2:
            java.lang.String r0 = ""
            android.content.Context r1 = com.ss.android.ugc.aweme.base.utils.d.a()     // Catch:{ Exception -> 0x0105 }
            java.lang.String r2 = "phone"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ Exception -> 0x0105 }
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch:{ Exception -> 0x0105 }
            java.lang.String r1 = r1.getSimCountryIso()     // Catch:{ Exception -> 0x0105 }
            r0 = r1
        L_0x0105:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x010f
            java.lang.String r0 = r0.toUpperCase()
        L_0x010f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.language.e.a():java.lang.String");
    }

    static {
        f53004c.add("TW");
        f53004c.add("JP");
        f53004c.add("KR");
        f53004c.add("ID");
        f53004c.add("VN");
        f53004c.add("PH");
        f53004c.add("MY");
        f53004c.add("LA");
        f53004c.add("MM");
        f53004c.add("KH");
        f53004c.add("MO");
        f53004c.add("SG");
        f53004c.add("HK");
        f53004c.add("TH");
        f53004c.add("AU");
        f53004c.add("NZ");
        f53004c.add("SA");
        f53004c.add("AE");
        f53004c.add("KW");
        f53004c.add("BH");
        f53004c.add("QA");
        f53004c.add("OM");
        f53004c.add("MA");
        f53004c.add("DZ");
        f53004c.add("TN");
        f53004c.add("EG");
        f53004c.add("LB");
        f53004c.add("IQ");
        f53004c.add("JO");
        f53004c.add("SD");
        f53004c.add("DJ");
        f53004c.add("LY");
        f53004c.add("PS");
        f53004c.add("SY");
        f53004c.add("YE");
        f53004c.add("SO");
        f53004c.add("MR");
        f53004c.add("KM");
        f53004c.add("CZ");
        f53004c.add("RO");
        f53004c.add("HU");
        f53004c.add("SK");
        f53004c.add("SI");
        f53004c.add("HR");
        f53004c.add("BG");
        f53004c.add("ZA");
        f53004c.add("NG");
        f53004c.add("KE");
        f53004c.add("ET");
        f53004c.add("TZ");
        f53004c.add("UG");
        f53004c.add("GH");
        f53004c.add("SN");
        f53003b.add("BR");
        f53003b.add("US");
        f53003b.add("IN");
        f53003b.add("RU");
        f53003b.add("GB");
        f53003b.add("PT");
        f53003b.add("ES");
        f53003b.add("AU");
        f53003b.add("IT");
        f53003b.add("MX");
        f53003b.add("TR");
        f53003b.add("CA");
        f53003b.add("DE");
        f53003b.add("AR");
        f53003b.add("MN");
        f53003b.add("SA");
        f53003b.add("CO");
        f53003b.add("PL");
        f53003b.add("SE");
        f53003b.add("NO");
        f53003b.add("DK");
        f53003b.add("RO");
        f53003b.add("CZ");
        f53003b.add("FR");
        f53003b.add("NL");
        f53003b.add("BE");
        f53003b.add("IE");
        f53003b.add("LK");
        f53003b.add("PK");
        f53003b.add("BD");
        f53003b.add("TR");
        f53003b.add("EG");
        f53003b.add("AE");
        f53003b.add("KW");
        f53003b.add("MA");
        f53003b.add("DZ");
        f53003b.add("ZA");
        f53003b.addAll(f53004c);
        HashSet<String> hashSet = new HashSet<>();
        f53005d = hashSet;
        hashSet.add("EG");
        f53005d.add("SD");
        f53005d.add("DZ");
        f53005d.add("MA");
        f53005d.add("IQ");
        f53005d.add("SA");
        f53005d.add("YE");
        f53005d.add("SY");
        f53005d.add("TD");
        f53005d.add("TN");
        f53005d.add("SO");
        f53005d.add("LY");
        f53005d.add("JO");
        f53005d.add("ER");
        f53005d.add("AE");
        f53005d.add("LB");
        f53005d.add("MR");
        f53005d.add("KW");
        f53005d.add("OM");
        f53005d.add("QA");
        f53005d.add("DJ");
        f53005d.add("BH");
        f53005d.add("KM");
    }

    public static boolean a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f53002a, true, 55066, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, null, f53002a, true, 55066, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str)) {
            return false;
        } else {
            return Arrays.asList(new String[]{"AT", "BE", "BG", "HR", "CY", "CZ", "EE", "FI", "FR", "DE", "GR", "HU", "IE", "IT", "LV", "LT", "LU", "MT", "NL", "PL", "PT", "RO", "SK", "SI", "ES", "SE", "GB"}).contains(str.toUpperCase());
        }
    }
}
