package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.q.c;
import java.util.ArrayList;
import java.util.List;

public class bm {

    /* renamed from: a  reason: collision with root package name */
    private static int f81866a;

    /* renamed from: a  reason: collision with other field name */
    private static bm f186a;

    /* renamed from: a  reason: collision with other field name */
    private static boolean f187a;

    /* renamed from: a  reason: collision with other field name */
    private Context f188a;

    /* renamed from: a  reason: collision with other field name */
    private SharedPreferences f189a = c.a(this.f188a, "config", 0);

    /* renamed from: a  reason: collision with other field name */
    private List f190a = new ArrayList();

    private bm(Context context) {
        this.f188a = context;
    }

    public static bm a() {
        return f186a;
    }

    public static void a(Context context) {
        synchronized (bm.class) {
            try {
                if (f186a == null) {
                    f186a = new bm(context);
                }
            } catch (Throwable th) {
                Class<bm> cls = bm.class;
                throw th;
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m123a() {
        return false;
    }

    /* renamed from: a  reason: collision with other method in class */
    public long m124a() {
        return this.f189a.getLong("d_m_i", Long.MAX_VALUE);
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m125a() {
        return this.f189a.getString("m_s_u", "https://metok.sys.miui.com");
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m126a() {
        synchronized (this.f190a) {
            for (cs a2 : this.f190a) {
                a2.a();
            }
        }
    }

    public void a(cs csVar) {
        if (csVar != null) {
            synchronized (this.f190a) {
                this.f190a.add(csVar);
            }
        }
    }

    public void a(String str) {
        SharedPreferences.Editor edit = this.f189a.edit();
        edit.putString("config_update_time", str);
        edit.commit();
    }

    public long b() {
        return this.f189a.getLong("d_s_t", Long.MAX_VALUE);
    }

    /* renamed from: b  reason: collision with other method in class */
    public String m127b() {
        return this.f189a.getString("config_update_time", PushConstants.PUSH_TYPE_NOTIFY);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011c, code lost:
        if (r4 != 5) goto L_0x011e;
     */
    /* renamed from: b  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m128b() {
        /*
            r11 = this;
            java.lang.String r0 = r11.b()
            java.lang.String r1 = com.xiaomi.push.br.f()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0010
            goto L_0x0174
        L_0x0010:
            java.lang.String r0 = com.xiaomi.push.br.d()
            java.lang.String r2 = "collect"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "t_"
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r2 = com.xiaomi.push.bt.a(r2, r3)
            r3 = 5
            r4 = 0
            if (r2 == 0) goto L_0x0032
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L_0x0057
        L_0x0032:
            r2 = 0
        L_0x0033:
            java.lang.String r5 = "collect"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "t_"
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r5 = com.xiaomi.push.bt.a(r5, r6)
            if (r5 == 0) goto L_0x0050
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x0050
            goto L_0x0054
        L_0x0050:
            int r2 = r2 + 1
            if (r2 != r3) goto L_0x0033
        L_0x0054:
            if (r2 == r3) goto L_0x0174
            r2 = r5
        L_0x0057:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x0174 }
            r5.<init>(r2)     // Catch:{ Exception -> 0x0174 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0174 }
            java.lang.String r6 = "data"
            java.lang.String r5 = r5.getString(r6)     // Catch:{ Exception -> 0x0174 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0174 }
            android.content.SharedPreferences r5 = r11.f189a     // Catch:{ Exception -> 0x0174 }
            java.lang.String r6 = "s_f"
            java.lang.String r7 = ""
            java.lang.String r5 = r5.getString(r6, r7)     // Catch:{ Exception -> 0x0174 }
            java.lang.String r6 = "s_f"
            java.lang.String r7 = ""
            java.lang.String r6 = r2.optString(r6, r7)     // Catch:{ Exception -> 0x0174 }
            java.lang.String r7 = "f_d_d"
            int r7 = r2.optInt(r7, r4)     // Catch:{ Exception -> 0x0174 }
            boolean r7 = com.xiaomi.push.br.a((int) r7)     // Catch:{ Exception -> 0x0174 }
            android.content.SharedPreferences r8 = r11.f189a     // Catch:{ Exception -> 0x0174 }
            android.content.SharedPreferences$Editor r8 = r8.edit()     // Catch:{ Exception -> 0x0174 }
            java.lang.String r9 = "s_f"
            r8.putString(r9, r6)     // Catch:{ Exception -> 0x0174 }
            java.lang.String r9 = "f_d_d"
            r8.putBoolean(r9, r7)     // Catch:{ Exception -> 0x0174 }
            java.lang.String r7 = "m_s_u"
            java.lang.String r9 = "m_s_u"
            java.lang.String r10 = "https://metok.sys.miui.com"
            java.lang.String r2 = r2.optString(r9, r10)     // Catch:{ Exception -> 0x0174 }
            r8.putString(r7, r2)     // Catch:{ Exception -> 0x0174 }
            r8.commit()     // Catch:{ Exception -> 0x0174 }
            java.util.Date r2 = new java.util.Date     // Catch:{ Exception -> 0x0174 }
            r2.<init>()     // Catch:{ Exception -> 0x0174 }
            java.util.Date r2 = new java.util.Date     // Catch:{ Exception -> 0x0174 }
            r2.<init>()     // Catch:{ Exception -> 0x0174 }
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0174 }
            java.lang.String r7 = "yyyyMMddHHmm"
            r2.<init>(r7)     // Catch:{ Exception -> 0x0174 }
            if (r5 == 0) goto L_0x00df
            boolean r7 = r5.isEmpty()     // Catch:{ Exception -> 0x0174 }
            if (r7 != 0) goto L_0x00df
            if (r6 == 0) goto L_0x00df
            boolean r7 = r6.isEmpty()     // Catch:{ Exception -> 0x0174 }
            if (r7 != 0) goto L_0x00df
            java.util.Date r5 = r2.parse(r5)     // Catch:{ Exception -> 0x0174 }
            java.util.Date r2 = r2.parse(r6)     // Catch:{ Exception -> 0x0174 }
            boolean r6 = r2.before(r5)     // Catch:{ Exception -> 0x0174 }
            if (r6 != 0) goto L_0x00d8
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x0174 }
            if (r2 == 0) goto L_0x00df
        L_0x00d8:
            r11.a((java.lang.String) r1)     // Catch:{ Exception -> 0x0174 }
            r11.a()     // Catch:{ Exception -> 0x0174 }
            return
        L_0x00df:
            java.lang.String r2 = "collect"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "f_"
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r2 = com.xiaomi.push.bt.a(r2, r5)
            if (r2 == 0) goto L_0x00fb
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L_0x011e
        L_0x00fb:
            java.lang.String r2 = "collect"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "f_"
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r2 = com.xiaomi.push.bt.a(r2, r5)
            if (r2 == 0) goto L_0x0118
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L_0x0118
            goto L_0x011c
        L_0x0118:
            int r4 = r4 + 1
            if (r4 != r3) goto L_0x00fb
        L_0x011c:
            if (r4 == r3) goto L_0x0174
        L_0x011e:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0174 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0174 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0174 }
            java.lang.String r3 = "data"
            java.lang.String r0 = r0.getString(r3)     // Catch:{ Exception -> 0x0174 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0174 }
            android.content.SharedPreferences r0 = r11.f189a     // Catch:{ Exception -> 0x0174 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Exception -> 0x0174 }
            java.lang.String r3 = "d_m_i"
            java.lang.String r4 = "d_m_i"
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r7 = r2.optLong(r4, r5)     // Catch:{ Exception -> 0x0174 }
            r0.putLong(r3, r7)     // Catch:{ Exception -> 0x0174 }
            java.lang.String r3 = "d_n_s"
            java.lang.String r4 = "d_n_s"
            int r7 = f81866a     // Catch:{ Exception -> 0x0174 }
            int r4 = r2.optInt(r4, r7)     // Catch:{ Exception -> 0x0174 }
            boolean r4 = com.xiaomi.push.br.a((int) r4)     // Catch:{ Exception -> 0x0174 }
            r0.putBoolean(r3, r4)     // Catch:{ Exception -> 0x0174 }
            java.lang.String r3 = "d_s_t"
            java.lang.String r4 = "d_s_t"
            long r7 = r2.optLong(r4, r5)     // Catch:{ Exception -> 0x0174 }
            r0.putLong(r3, r7)     // Catch:{ Exception -> 0x0174 }
            java.lang.String r3 = "d_s_c_t"
            java.lang.String r4 = "d_s_c_t"
            long r4 = r2.optLong(r4, r5)     // Catch:{ Exception -> 0x0174 }
            r0.putLong(r3, r4)     // Catch:{ Exception -> 0x0174 }
            r0.commit()     // Catch:{ Exception -> 0x0174 }
            r11.a((java.lang.String) r1)
            r11.a()
        L_0x0174:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.bm.m128b():void");
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m129b() {
        return this.f189a.getBoolean("f_d_d", true);
    }

    public long c() {
        return this.f189a.getLong("d_s_c_t", Long.MAX_VALUE);
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m130c() {
        return this.f189a.getBoolean("d_n_s", f187a);
    }
}
