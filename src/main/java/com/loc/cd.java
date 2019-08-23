package com.loc;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.loc.cz;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.ss.android.ugc.aweme.q.c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class cd {
    static int A = 3600000;
    static boolean B = true;
    static long C = 0;
    static long D = 0;
    static boolean E = false;
    static boolean F = true;
    static boolean G = false;
    static boolean H = true;
    static boolean I = false;
    static boolean J = false;
    private static boolean K = false;
    private static String L = "确认";
    private static boolean M = false;
    private static long N = 0;
    private static long O = 0;
    private static long P = 5000;
    private static int Q = 0;
    private static int R = 3600000;
    private static int S = 0;
    private static int T = 0;
    private static boolean U = true;
    private static int V = -1;
    private static long W = 0;
    private static ArrayList<String> X = new ArrayList<>();
    private static String Y = null;
    private static String Z = null;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f25634a = true;
    private static boolean aa = false;
    private static int ab = PushConstants.WORK_RECEIVER_EVENTCORE_ERROR;
    private static int ac = PushConstants.WORK_RECEIVER_EVENTCORE_ERROR;
    private static boolean ad = false;
    private static List<cg> ae = new ArrayList();
    private static boolean af = false;
    private static long ag = 0;
    private static int ah = 0;
    private static int ai = 0;
    private static List<String> aj = new ArrayList();
    private static int ak = 80;
    private static boolean al = false;
    private static int am = -1;

    /* renamed from: b  reason: collision with root package name */
    static String f25635b = "提示信息";

    /* renamed from: c  reason: collision with root package name */
    static String f25636c = "取消";

    /* renamed from: d  reason: collision with root package name */
    static String f25637d = "";

    /* renamed from: e  reason: collision with root package name */
    static String f25638e = "";

    /* renamed from: f  reason: collision with root package name */
    static String f25639f = "";
    static boolean g = false;
    static int h = 0;
    static boolean i = false;
    static boolean j = false;
    static boolean k = false;
    static boolean l = true;
    static int m = 1000;
    static int n = 200;
    static boolean o = false;
    static int p = 20;
    static boolean q = true;
    static boolean r = false;
    static int s = -1;
    static long t = 0;
    static ArrayList<String> u = new ArrayList<>();
    static boolean v = false;
    static boolean w = true;
    static long x = 300000;
    static boolean y = false;
    static boolean z = true;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f25640a;

        /* renamed from: b  reason: collision with root package name */
        String f25641b = PushConstants.PUSH_TYPE_NOTIFY;

        /* renamed from: c  reason: collision with root package name */
        boolean f25642c;

        /* renamed from: d  reason: collision with root package name */
        int f25643d = 5;

        a() {
        }
    }

    public static int a() {
        return Q;
    }

    private static a a(JSONObject jSONObject, String str) {
        a aVar;
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                if (jSONObject2 != null) {
                    aVar = new a();
                    try {
                        aVar.f25640a = cz.a(jSONObject2.optString("b"), false);
                        aVar.f25641b = jSONObject2.optString("t");
                        aVar.f25642c = cz.a(jSONObject2.optString(TimeDisplaySetting.START_SHOW_TIME), false);
                        aVar.f25643d = jSONObject2.optInt("i", 0);
                        return aVar;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                aVar = null;
                ce.a(th, "AuthUtil", "getLocateObj");
                return aVar;
            }
        }
        return null;
    }

    public static boolean a(long j2) {
        long b2 = cn.b();
        return M && b2 - O <= N && b2 - j2 >= P;
    }

    private static boolean a(Context context, cz.a.b bVar, String str, String str2) {
        if (bVar != null) {
            try {
                boolean z2 = bVar.f25750a;
                String str3 = bVar.f25751b;
                String str4 = bVar.f25752c;
                String str5 = bVar.f25753d;
                boolean z3 = bVar.f25754e;
                dh a2 = ce.a(str, str2);
                if (z2) {
                    if (z3 && !TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str5)) {
                        s sVar = new s(str3, str4);
                        sVar.j = K;
                        t.b(context, sVar, a2);
                    }
                } else if (cj.a(context, a2)) {
                    ck.a(context, str, "config|get dex able is false");
                }
                return z2 && z3;
            } catch (Throwable th) {
                ce.a(th, "AuthUtil", "downLoadPluginDex");
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:0x0240 A[Catch:{ Throwable -> 0x024a }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0242 A[Catch:{ Throwable -> 0x024a }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x028f A[SYNTHETIC, Splitter:B:149:0x028f] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02ca A[Catch:{ Throwable -> 0x0341 }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0362 A[Catch:{ Throwable -> 0x036f, Throwable -> 0x03ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x037f A[Catch:{ Throwable -> 0x036f, Throwable -> 0x03ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03a6 A[Catch:{ Throwable -> 0x036f, Throwable -> 0x03ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03da A[Catch:{ Throwable -> 0x0405 }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0411 A[Catch:{ Throwable -> 0x0441 }] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x044d A[Catch:{ Throwable -> 0x0458 }] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0464 A[Catch:{ Throwable -> 0x055d }] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x04af A[SYNTHETIC, Splitter:B:266:0x04af] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x053e A[Catch:{ Throwable -> 0x055d }] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0569 A[Catch:{ Throwable -> 0x0584 }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0590  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(android.content.Context r16, com.loc.cz.a r17) {
        /*
            r1 = r16
            r2 = r17
            r3 = 0
            org.json.JSONObject r4 = r2.g     // Catch:{ Throwable -> 0x00a0 }
            if (r4 == 0) goto L_0x00a8
            java.lang.String r0 = "at"
            r5 = 123(0x7b, float:1.72E-43)
            int r0 = r4.optInt(r0, r5)     // Catch:{ Throwable -> 0x0018 }
            int r0 = r0 * 60
            int r0 = r0 * 1000
            A = r0     // Catch:{ Throwable -> 0x0018 }
            goto L_0x0020
        L_0x0018:
            r0 = move-exception
            java.lang.String r5 = "AuthUtil"
            java.lang.String r6 = "requestSdkAuthInterval"
            com.loc.ce.a(r0, r5, r6)     // Catch:{ Throwable -> 0x00a0 }
        L_0x0020:
            java.lang.String r0 = "ila"
            java.lang.String r0 = r4.optString(r0)     // Catch:{ Throwable -> 0x002f }
            boolean r5 = al     // Catch:{ Throwable -> 0x002f }
            boolean r0 = com.loc.cz.a((java.lang.String) r0, (boolean) r5)     // Catch:{ Throwable -> 0x002f }
            al = r0     // Catch:{ Throwable -> 0x002f }
            goto L_0x0037
        L_0x002f:
            r0 = move-exception
            java.lang.String r5 = "AuthUtil"
            java.lang.String r6 = "loadConfigData_indoor"
            com.loc.ce.a(r0, r5, r6)     // Catch:{ Throwable -> 0x00a0 }
        L_0x0037:
            java.lang.String r0 = "icbd"
            java.lang.String r0 = r4.optString(r0)     // Catch:{ Throwable -> 0x004d }
            boolean r5 = y     // Catch:{ Throwable -> 0x004d }
            boolean r0 = com.loc.cz.a((java.lang.String) r0, (boolean) r5)     // Catch:{ Throwable -> 0x004d }
            y = r0     // Catch:{ Throwable -> 0x004d }
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = "loc"
            com.loc.t.a((android.content.Context) r1, (java.lang.String) r0)     // Catch:{ Throwable -> 0x004d }
            goto L_0x0055
        L_0x004d:
            r0 = move-exception
            java.lang.String r5 = "AuthUtil"
            java.lang.String r6 = "loadConfigData_CallBackDex"
            com.loc.ce.a(r0, r5, r6)     // Catch:{ Throwable -> 0x00a0 }
        L_0x0055:
            if (r1 == 0) goto L_0x007a
            if (r4 != 0) goto L_0x005a
            goto L_0x007a
        L_0x005a:
            java.lang.String r0 = "re"
            java.lang.String r0 = r4.optString(r0)     // Catch:{ Throwable -> 0x0072 }
            boolean r5 = F     // Catch:{ Throwable -> 0x0072 }
            boolean r0 = com.loc.cz.a((java.lang.String) r0, (boolean) r5)     // Catch:{ Throwable -> 0x0072 }
            F = r0     // Catch:{ Throwable -> 0x0072 }
            java.lang.String r0 = "pref"
            java.lang.String r5 = "fr"
            boolean r6 = F     // Catch:{ Throwable -> 0x0072 }
            com.loc.cl.a((android.content.Context) r1, (java.lang.String) r0, (java.lang.String) r5, (boolean) r6)     // Catch:{ Throwable -> 0x0072 }
            goto L_0x007a
        L_0x0072:
            r0 = move-exception
            java.lang.String r5 = "AuthUtil"
            java.lang.String r6 = "checkReLocationAble"
            com.loc.ce.a(r0, r5, r6)     // Catch:{ Throwable -> 0x00a0 }
        L_0x007a:
            java.lang.String r0 = "nla"
            java.lang.String r0 = r4.optString(r0)     // Catch:{ Throwable -> 0x0088 }
            boolean r5 = B     // Catch:{ Throwable -> 0x0088 }
            boolean r0 = com.loc.cz.a((java.lang.String) r0, (boolean) r5)     // Catch:{ Throwable -> 0x0088 }
            B = r0     // Catch:{ Throwable -> 0x0088 }
        L_0x0088:
            java.lang.String r0 = "oda"
            java.lang.String r0 = r4.optString(r0)     // Catch:{ Throwable -> 0x00a8 }
            boolean r4 = K     // Catch:{ Throwable -> 0x00a8 }
            boolean r0 = com.loc.cz.a((java.lang.String) r0, (boolean) r4)     // Catch:{ Throwable -> 0x00a8 }
            K = r0     // Catch:{ Throwable -> 0x00a8 }
            java.lang.String r0 = "pref"
            java.lang.String r4 = "oda"
            boolean r5 = K     // Catch:{ Throwable -> 0x00a8 }
            com.loc.cl.a((android.content.Context) r1, (java.lang.String) r0, (java.lang.String) r4, (boolean) r5)     // Catch:{ Throwable -> 0x00a8 }
            goto L_0x00a8
        L_0x00a0:
            r0 = move-exception
            java.lang.String r4 = "AuthUtil"
            java.lang.String r5 = "loadConfigAbleStatus"
            com.loc.ce.a(r0, r4, r5)     // Catch:{ Throwable -> 0x065b }
        L_0x00a8:
            r4 = 0
            r6 = -1
            r7 = 1
            org.json.JSONObject r0 = r2.h     // Catch:{ Throwable -> 0x012a }
            if (r0 == 0) goto L_0x0132
            java.lang.String r8 = "callamapflag"
            java.lang.String r8 = r0.optString(r8)     // Catch:{ Throwable -> 0x012a }
            boolean r9 = U     // Catch:{ Throwable -> 0x012a }
            boolean r8 = com.loc.cz.a((java.lang.String) r8, (boolean) r9)     // Catch:{ Throwable -> 0x012a }
            U = r8     // Catch:{ Throwable -> 0x012a }
            java.lang.String r8 = "co"
            java.lang.String r8 = r0.optString(r8)     // Catch:{ Throwable -> 0x012a }
            boolean r8 = com.loc.cz.a((java.lang.String) r8, (boolean) r3)     // Catch:{ Throwable -> 0x012a }
            if (r8 == 0) goto L_0x00d0
            boolean r8 = U     // Catch:{ Throwable -> 0x012a }
            if (r8 == 0) goto L_0x00d0
            r8 = 1
            goto L_0x00d1
        L_0x00d0:
            r8 = 0
        L_0x00d1:
            k = r8     // Catch:{ Throwable -> 0x012a }
            boolean r8 = U     // Catch:{ Throwable -> 0x012a }
            if (r8 == 0) goto L_0x0132
            java.lang.String r8 = "count"
            int r9 = V     // Catch:{ Throwable -> 0x012a }
            int r8 = r0.optInt(r8, r9)     // Catch:{ Throwable -> 0x012a }
            V = r8     // Catch:{ Throwable -> 0x012a }
            java.lang.String r8 = "sysTime"
            long r9 = W     // Catch:{ Throwable -> 0x012a }
            long r8 = r0.optLong(r8, r9)     // Catch:{ Throwable -> 0x012a }
            W = r8     // Catch:{ Throwable -> 0x012a }
            java.lang.String r8 = "sn"
            org.json.JSONArray r0 = r0.optJSONArray(r8)     // Catch:{ Throwable -> 0x012a }
            if (r0 == 0) goto L_0x010c
            int r8 = r0.length()     // Catch:{ Throwable -> 0x012a }
            if (r8 <= 0) goto L_0x010c
            r8 = 0
        L_0x00fa:
            int r9 = r0.length()     // Catch:{ Throwable -> 0x012a }
            if (r8 >= r9) goto L_0x010c
            java.util.ArrayList<java.lang.String> r9 = X     // Catch:{ Throwable -> 0x012a }
            java.lang.String r10 = r0.getString(r8)     // Catch:{ Throwable -> 0x012a }
            r9.add(r10)     // Catch:{ Throwable -> 0x012a }
            int r8 = r8 + 1
            goto L_0x00fa
        L_0x010c:
            int r0 = V     // Catch:{ Throwable -> 0x012a }
            if (r0 == r6) goto L_0x0132
            long r8 = W     // Catch:{ Throwable -> 0x012a }
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0132
            java.lang.String r0 = "pref"
            java.lang.String r8 = "nowtime"
            long r8 = com.loc.cl.b((android.content.Context) r1, (java.lang.String) r0, (java.lang.String) r8, (long) r4)     // Catch:{ Throwable -> 0x012a }
            long r10 = W     // Catch:{ Throwable -> 0x012a }
            boolean r0 = com.loc.cn.b((long) r10, (long) r8)     // Catch:{ Throwable -> 0x012a }
            if (r0 != 0) goto L_0x0132
            h(r16)     // Catch:{ Throwable -> 0x012a }
            goto L_0x0132
        L_0x012a:
            r0 = move-exception
            java.lang.String r8 = "AuthUtil"
            java.lang.String r9 = "loadConfigDataCallAMapSer"
            com.loc.ce.a(r0, r8, r9)     // Catch:{ Throwable -> 0x065b }
        L_0x0132:
            org.json.JSONObject r0 = r2.k     // Catch:{ Throwable -> 0x0199 }
            if (r0 == 0) goto L_0x01a1
            java.lang.String r8 = "amappushflag"
            java.lang.String r8 = r0.optString(r8)     // Catch:{ Throwable -> 0x0199 }
            boolean r9 = r     // Catch:{ Throwable -> 0x0199 }
            boolean r8 = com.loc.cz.a((java.lang.String) r8, (boolean) r9)     // Catch:{ Throwable -> 0x0199 }
            r = r8     // Catch:{ Throwable -> 0x0199 }
            if (r8 == 0) goto L_0x01a1
            java.lang.String r8 = "count"
            int r9 = s     // Catch:{ Throwable -> 0x0199 }
            int r8 = r0.optInt(r8, r9)     // Catch:{ Throwable -> 0x0199 }
            s = r8     // Catch:{ Throwable -> 0x0199 }
            java.lang.String r8 = "sysTime"
            long r9 = t     // Catch:{ Throwable -> 0x0199 }
            long r8 = r0.optLong(r8, r9)     // Catch:{ Throwable -> 0x0199 }
            t = r8     // Catch:{ Throwable -> 0x0199 }
            java.lang.String r8 = "sn"
            org.json.JSONArray r0 = r0.optJSONArray(r8)     // Catch:{ Throwable -> 0x0199 }
            if (r0 == 0) goto L_0x017b
            int r8 = r0.length()     // Catch:{ Throwable -> 0x0199 }
            if (r8 <= 0) goto L_0x017b
            r8 = 0
        L_0x0169:
            int r9 = r0.length()     // Catch:{ Throwable -> 0x0199 }
            if (r8 >= r9) goto L_0x017b
            java.util.ArrayList<java.lang.String> r9 = u     // Catch:{ Throwable -> 0x0199 }
            java.lang.String r10 = r0.getString(r8)     // Catch:{ Throwable -> 0x0199 }
            r9.add(r10)     // Catch:{ Throwable -> 0x0199 }
            int r8 = r8 + 1
            goto L_0x0169
        L_0x017b:
            int r0 = s     // Catch:{ Throwable -> 0x0199 }
            if (r0 == r6) goto L_0x01a1
            long r8 = t     // Catch:{ Throwable -> 0x0199 }
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01a1
            java.lang.String r0 = "pref"
            java.lang.String r8 = "pushSerTime"
            long r4 = com.loc.cl.b((android.content.Context) r1, (java.lang.String) r0, (java.lang.String) r8, (long) r4)     // Catch:{ Throwable -> 0x0199 }
            long r8 = t     // Catch:{ Throwable -> 0x0199 }
            boolean r0 = com.loc.cn.b((long) r8, (long) r4)     // Catch:{ Throwable -> 0x0199 }
            if (r0 != 0) goto L_0x01a1
            c(r16)     // Catch:{ Throwable -> 0x0199 }
            goto L_0x01a1
        L_0x0199:
            r0 = move-exception
            java.lang.String r4 = "AuthUtil"
            java.lang.String r5 = "loadConfigDataCallAMapPush"
            com.loc.ce.a(r0, r4, r5)     // Catch:{ Throwable -> 0x065b }
        L_0x01a1:
            org.json.JSONObject r0 = r2.l     // Catch:{ Throwable -> 0x024a }
            if (r0 == 0) goto L_0x0252
            java.lang.String r4 = "f"
            java.lang.String r4 = r0.optString(r4)     // Catch:{ Throwable -> 0x024a }
            boolean r5 = aa     // Catch:{ Throwable -> 0x024a }
            boolean r4 = com.loc.cz.a((java.lang.String) r4, (boolean) r5)     // Catch:{ Throwable -> 0x024a }
            aa = r4     // Catch:{ Throwable -> 0x024a }
            java.lang.String r4 = "mco"
            int r4 = r0.optInt(r4, r3)     // Catch:{ Throwable -> 0x024a }
            S = r4     // Catch:{ Throwable -> 0x024a }
            java.lang.String r4 = "co"
            int r4 = r0.optInt(r4, r3)     // Catch:{ Throwable -> 0x024a }
            T = r4     // Catch:{ Throwable -> 0x024a }
            java.lang.String r4 = "it"
            r5 = 3600(0xe10, float:5.045E-42)
            int r4 = r0.optInt(r4, r5)     // Catch:{ Throwable -> 0x024a }
            int r4 = r4 * 1000
            R = r4     // Catch:{ Throwable -> 0x024a }
            r5 = 3600000(0x36ee80, float:5.044674E-39)
            if (r4 >= r5) goto L_0x01d6
            R = r5     // Catch:{ Throwable -> 0x024a }
        L_0x01d6:
            java.lang.String r4 = "a"
            java.lang.String r5 = "提示信息"
            java.lang.String r4 = r0.optString(r4, r5)     // Catch:{ Throwable -> 0x024a }
            f25635b = r4     // Catch:{ Throwable -> 0x024a }
            java.lang.String r4 = "o"
            java.lang.String r5 = "确认"
            java.lang.String r4 = r0.optString(r4, r5)     // Catch:{ Throwable -> 0x024a }
            L = r4     // Catch:{ Throwable -> 0x024a }
            java.lang.String r4 = "c"
            java.lang.String r5 = "取消"
            java.lang.String r4 = r0.optString(r4, r5)     // Catch:{ Throwable -> 0x024a }
            f25636c = r4     // Catch:{ Throwable -> 0x024a }
            java.lang.String r4 = "i"
            java.lang.String r5 = ""
            java.lang.String r4 = r0.optString(r4, r5)     // Catch:{ Throwable -> 0x024a }
            f25637d = r4     // Catch:{ Throwable -> 0x024a }
            java.lang.String r4 = "u"
            java.lang.String r5 = ""
            java.lang.String r4 = r0.optString(r4, r5)     // Catch:{ Throwable -> 0x024a }
            f25638e = r4     // Catch:{ Throwable -> 0x024a }
            java.lang.String r4 = "t"
            java.lang.String r5 = ""
            java.lang.String r0 = r0.optString(r4, r5)     // Catch:{ Throwable -> 0x024a }
            f25639f = r0     // Catch:{ Throwable -> 0x024a }
            java.lang.String r0 = f25637d     // Catch:{ Throwable -> 0x024a }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x024a }
            if (r0 != 0) goto L_0x0224
            java.lang.String r0 = "null"
            java.lang.String r4 = f25637d     // Catch:{ Throwable -> 0x024a }
            boolean r0 = r0.equals(r4)     // Catch:{ Throwable -> 0x024a }
            if (r0 == 0) goto L_0x0237
        L_0x0224:
            java.lang.String r0 = f25638e     // Catch:{ Throwable -> 0x024a }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x024a }
            if (r0 != 0) goto L_0x0239
            java.lang.String r0 = "null"
            java.lang.String r4 = f25638e     // Catch:{ Throwable -> 0x024a }
            boolean r0 = r0.equals(r4)     // Catch:{ Throwable -> 0x024a }
            if (r0 == 0) goto L_0x0237
            goto L_0x0239
        L_0x0237:
            r0 = 0
            goto L_0x023a
        L_0x0239:
            r0 = 1
        L_0x023a:
            int r4 = T     // Catch:{ Throwable -> 0x024a }
            int r5 = S     // Catch:{ Throwable -> 0x024a }
            if (r4 <= r5) goto L_0x0242
            r4 = 1
            goto L_0x0243
        L_0x0242:
            r4 = 0
        L_0x0243:
            if (r0 != 0) goto L_0x0247
            if (r4 == 0) goto L_0x0252
        L_0x0247:
            aa = r3     // Catch:{ Throwable -> 0x024a }
            goto L_0x0252
        L_0x024a:
            r0 = move-exception
            java.lang.String r4 = "AuthUtil"
            java.lang.String r5 = "loadConfigDataOpenAMap"
            com.loc.ce.a(r0, r4, r5)     // Catch:{ Throwable -> 0x065b }
        L_0x0252:
            com.loc.dh r0 = com.loc.ce.b()     // Catch:{ Throwable -> 0x0283 }
            com.loc.cz$a$d r4 = r2.y     // Catch:{ Throwable -> 0x0283 }
            r5 = 0
            if (r4 == 0) goto L_0x027f
            java.lang.String r8 = r4.f25758b     // Catch:{ Throwable -> 0x0283 }
            java.lang.String r9 = r4.f25757a     // Catch:{ Throwable -> 0x0283 }
            java.lang.String r4 = r4.f25759c     // Catch:{ Throwable -> 0x0283 }
            boolean r10 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Throwable -> 0x0283 }
            if (r10 != 0) goto L_0x027f
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x0283 }
            if (r10 != 0) goto L_0x027f
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x0283 }
            if (r4 == 0) goto L_0x0274
            goto L_0x027f
        L_0x0274:
            com.loc.s r4 = new com.loc.s     // Catch:{ Throwable -> 0x0283 }
            r4.<init>(r9, r8)     // Catch:{ Throwable -> 0x0283 }
            r4.j = r7     // Catch:{ Throwable -> 0x0283 }
            com.loc.t.b(r1, r4, r0)     // Catch:{ Throwable -> 0x0283 }
            goto L_0x028b
        L_0x027f:
            com.loc.t.b(r1, r5, r0)     // Catch:{ Throwable -> 0x0283 }
            goto L_0x028b
        L_0x0283:
            r0 = move-exception
            java.lang.String r4 = "AuthUtil"
            java.lang.String r5 = "loadConfigDataSdkUpdate"
            com.loc.ce.a(r0, r4, r5)     // Catch:{ Throwable -> 0x065b }
        L_0x028b:
            boolean r0 = f25634a     // Catch:{ Throwable -> 0x065b }
            if (r0 == 0) goto L_0x02c6
            com.loc.cz$a$c r0 = r2.B     // Catch:{ Throwable -> 0x02be }
            if (r0 == 0) goto L_0x02c6
            java.lang.String r4 = r0.f25755a     // Catch:{ Throwable -> 0x02be }
            Y = r4     // Catch:{ Throwable -> 0x02be }
            java.lang.String r0 = r0.f25756b     // Catch:{ Throwable -> 0x02be }
            Z = r0     // Catch:{ Throwable -> 0x02be }
            java.lang.String r0 = Y     // Catch:{ Throwable -> 0x02be }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x02be }
            if (r0 != 0) goto L_0x02c6
            java.lang.String r0 = Z     // Catch:{ Throwable -> 0x02be }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x02be }
            if (r0 != 0) goto L_0x02c6
            com.loc.db r0 = new com.loc.db     // Catch:{ Throwable -> 0x02be }
            java.lang.String r4 = "loc"
            java.lang.String r5 = Y     // Catch:{ Throwable -> 0x02be }
            java.lang.String r8 = Z     // Catch:{ Throwable -> 0x02be }
            r0.<init>(r1, r4, r5, r8)     // Catch:{ Throwable -> 0x02be }
            boolean r4 = K     // Catch:{ Throwable -> 0x02be }
            r0.f25779a = r4     // Catch:{ Throwable -> 0x02be }
            r0.a()     // Catch:{ Throwable -> 0x02be }
            goto L_0x02c6
        L_0x02be:
            r0 = move-exception
            java.lang.String r4 = "AuthUtil"
            java.lang.String r5 = "loadConfigDataGroupOffset"
            com.loc.ce.a(r0, r4, r5)     // Catch:{ Throwable -> 0x065b }
        L_0x02c6:
            com.loc.cz$a$a r0 = r2.x     // Catch:{ Throwable -> 0x0341 }
            if (r0 == 0) goto L_0x0349
            boolean r4 = r0.f25747a     // Catch:{ Throwable -> 0x0341 }
            l = r4     // Catch:{ Throwable -> 0x0341 }
            java.lang.String r4 = "pref"
            java.lang.String r5 = "exception"
            boolean r8 = l     // Catch:{ Throwable -> 0x0341 }
            com.loc.cl.a((android.content.Context) r1, (java.lang.String) r4, (java.lang.String) r5, (boolean) r8)     // Catch:{ Throwable -> 0x0341 }
            org.json.JSONObject r0 = r0.f25749c     // Catch:{ Throwable -> 0x0341 }
            java.lang.String r4 = "fn"
            int r5 = m     // Catch:{ Throwable -> 0x0341 }
            int r4 = r0.optInt(r4, r5)     // Catch:{ Throwable -> 0x0341 }
            m = r4     // Catch:{ Throwable -> 0x0341 }
            java.lang.String r4 = "mpn"
            int r5 = n     // Catch:{ Throwable -> 0x0341 }
            int r4 = r0.optInt(r4, r5)     // Catch:{ Throwable -> 0x0341 }
            n = r4     // Catch:{ Throwable -> 0x0341 }
            r5 = 500(0x1f4, float:7.0E-43)
            if (r4 <= r5) goto L_0x02f3
            n = r5     // Catch:{ Throwable -> 0x0341 }
        L_0x02f3:
            int r4 = n     // Catch:{ Throwable -> 0x0341 }
            r5 = 30
            if (r4 >= r5) goto L_0x02fb
            n = r5     // Catch:{ Throwable -> 0x0341 }
        L_0x02fb:
            java.lang.String r4 = "igu"
            java.lang.String r4 = r0.optString(r4)     // Catch:{ Throwable -> 0x0341 }
            boolean r5 = o     // Catch:{ Throwable -> 0x0341 }
            boolean r4 = com.loc.cz.a((java.lang.String) r4, (boolean) r5)     // Catch:{ Throwable -> 0x0341 }
            o = r4     // Catch:{ Throwable -> 0x0341 }
            java.lang.String r4 = "ms"
            int r5 = p     // Catch:{ Throwable -> 0x0341 }
            int r0 = r0.optInt(r4, r5)     // Catch:{ Throwable -> 0x0341 }
            p = r0     // Catch:{ Throwable -> 0x0341 }
            int r0 = m     // Catch:{ Throwable -> 0x0341 }
            boolean r4 = o     // Catch:{ Throwable -> 0x0341 }
            int r5 = p     // Catch:{ Throwable -> 0x0341 }
            com.loc.at.a(r0, r4, r5)     // Catch:{ Throwable -> 0x0341 }
            java.lang.String r0 = "pref"
            java.lang.String r4 = "fn"
            int r5 = m     // Catch:{ Throwable -> 0x0341 }
            com.loc.cl.a((android.content.Context) r1, (java.lang.String) r0, (java.lang.String) r4, (int) r5)     // Catch:{ Throwable -> 0x0341 }
            java.lang.String r0 = "pref"
            java.lang.String r4 = "mpn"
            int r5 = n     // Catch:{ Throwable -> 0x0341 }
            com.loc.cl.a((android.content.Context) r1, (java.lang.String) r0, (java.lang.String) r4, (int) r5)     // Catch:{ Throwable -> 0x0341 }
            java.lang.String r0 = "pref"
            java.lang.String r4 = "igu"
            boolean r5 = o     // Catch:{ Throwable -> 0x0341 }
            com.loc.cl.a((android.content.Context) r1, (java.lang.String) r0, (java.lang.String) r4, (boolean) r5)     // Catch:{ Throwable -> 0x0341 }
            java.lang.String r0 = "pref"
            java.lang.String r4 = "ms"
            int r5 = p     // Catch:{ Throwable -> 0x0341 }
            com.loc.cl.a((android.content.Context) r1, (java.lang.String) r0, (java.lang.String) r4, (int) r5)     // Catch:{ Throwable -> 0x0341 }
            goto L_0x0349
        L_0x0341:
            r0 = move-exception
            java.lang.String r4 = "AuthUtil"
            java.lang.String r5 = "loadConfigDataUploadException"
            com.loc.ce.a(r0, r4, r5)     // Catch:{ Throwable -> 0x065b }
        L_0x0349:
            r4 = 2
            org.json.JSONObject r5 = r2.m     // Catch:{ Throwable -> 0x03ce }
            if (r5 == 0) goto L_0x03d6
            java.lang.String r0 = "able"
            java.lang.String r0 = r5.optString(r0)     // Catch:{ Throwable -> 0x03ce }
            boolean r0 = com.loc.cz.a((java.lang.String) r0, (boolean) r3)     // Catch:{ Throwable -> 0x03ce }
            if (r0 == 0) goto L_0x03d6
            java.lang.String r0 = "fs"
            com.loc.cd$a r0 = a((org.json.JSONObject) r5, (java.lang.String) r0)     // Catch:{ Throwable -> 0x03ce }
            if (r0 == 0) goto L_0x0377
            boolean r8 = r0.f25642c     // Catch:{ Throwable -> 0x03ce }
            g = r8     // Catch:{ Throwable -> 0x03ce }
            java.lang.String r0 = r0.f25641b     // Catch:{ Throwable -> 0x036f }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Throwable -> 0x036f }
            h = r0     // Catch:{ Throwable -> 0x036f }
            goto L_0x0377
        L_0x036f:
            r0 = move-exception
            java.lang.String r8 = "AuthUtil"
            java.lang.String r9 = "loadconfig part2"
            com.loc.ce.a(r0, r8, r9)     // Catch:{ Throwable -> 0x03ce }
        L_0x0377:
            java.lang.String r0 = "us"
            com.loc.cd$a r0 = a((org.json.JSONObject) r5, (java.lang.String) r0)     // Catch:{ Throwable -> 0x03ce }
            if (r0 == 0) goto L_0x039e
            boolean r8 = r0.f25642c     // Catch:{ Throwable -> 0x03ce }
            i = r8     // Catch:{ Throwable -> 0x03ce }
            boolean r8 = r0.f25640a     // Catch:{ Throwable -> 0x03ce }
            j = r8     // Catch:{ Throwable -> 0x03ce }
            java.lang.String r0 = r0.f25641b     // Catch:{ Throwable -> 0x0390 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Throwable -> 0x0390 }
            Q = r0     // Catch:{ Throwable -> 0x0390 }
            goto L_0x0398
        L_0x0390:
            r0 = move-exception
            java.lang.String r8 = "AuthUtil"
            java.lang.String r9 = "loadconfig part1"
            com.loc.ce.a(r0, r8, r9)     // Catch:{ Throwable -> 0x03ce }
        L_0x0398:
            int r0 = Q     // Catch:{ Throwable -> 0x03ce }
            if (r0 >= r4) goto L_0x039e
            i = r3     // Catch:{ Throwable -> 0x03ce }
        L_0x039e:
            java.lang.String r0 = "rs"
            com.loc.cd$a r0 = a((org.json.JSONObject) r5, (java.lang.String) r0)     // Catch:{ Throwable -> 0x03ce }
            if (r0 == 0) goto L_0x03d6
            boolean r5 = r0.f25642c     // Catch:{ Throwable -> 0x03ce }
            M = r5     // Catch:{ Throwable -> 0x03ce }
            if (r5 == 0) goto L_0x03b9
            long r8 = com.loc.cn.b()     // Catch:{ Throwable -> 0x03ce }
            O = r8     // Catch:{ Throwable -> 0x03ce }
            int r5 = r0.f25643d     // Catch:{ Throwable -> 0x03ce }
            int r5 = r5 * 1000
            long r8 = (long) r5     // Catch:{ Throwable -> 0x03ce }
            P = r8     // Catch:{ Throwable -> 0x03ce }
        L_0x03b9:
            java.lang.String r0 = r0.f25641b     // Catch:{ Throwable -> 0x03c5 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Throwable -> 0x03c5 }
            int r0 = r0 * 1000
            long r8 = (long) r0     // Catch:{ Throwable -> 0x03c5 }
            N = r8     // Catch:{ Throwable -> 0x03c5 }
            goto L_0x03d6
        L_0x03c5:
            r0 = move-exception
            java.lang.String r5 = "AuthUtil"
            java.lang.String r8 = "loadconfig part"
            com.loc.ce.a(r0, r5, r8)     // Catch:{ Throwable -> 0x03ce }
            goto L_0x03d6
        L_0x03ce:
            r0 = move-exception
            java.lang.String r5 = "AuthUtil"
            java.lang.String r8 = "loadConfigDataLocate"
            com.loc.ce.a(r0, r5, r8)     // Catch:{ Throwable -> 0x065b }
        L_0x03d6:
            org.json.JSONObject r0 = r2.o     // Catch:{ Throwable -> 0x0405 }
            if (r0 == 0) goto L_0x040d
            java.lang.String r5 = "able"
            java.lang.String r5 = r0.optString(r5)     // Catch:{ Throwable -> 0x0405 }
            boolean r8 = v     // Catch:{ Throwable -> 0x0405 }
            boolean r5 = com.loc.cz.a((java.lang.String) r5, (boolean) r8)     // Catch:{ Throwable -> 0x0405 }
            v = r5     // Catch:{ Throwable -> 0x0405 }
            if (r5 == 0) goto L_0x040d
            java.lang.String r5 = "c"
            int r5 = r0.optInt(r5, r3)     // Catch:{ Throwable -> 0x0405 }
            if (r5 != 0) goto L_0x03f7
            r5 = 3000(0xbb8, float:4.204E-42)
            ab = r5     // Catch:{ Throwable -> 0x0405 }
            goto L_0x03fb
        L_0x03f7:
            int r5 = r5 * 1000
            ab = r5     // Catch:{ Throwable -> 0x0405 }
        L_0x03fb:
            java.lang.String r5 = "t"
            int r0 = r0.getInt(r5)     // Catch:{ Throwable -> 0x0405 }
            int r0 = r0 / r4
            ac = r0     // Catch:{ Throwable -> 0x0405 }
            goto L_0x040d
        L_0x0405:
            r0 = move-exception
            java.lang.String r4 = "AuthUtil"
            java.lang.String r5 = "loadConfigDataNgps"
            com.loc.ce.a(r0, r4, r5)     // Catch:{ Throwable -> 0x065b }
        L_0x040d:
            org.json.JSONObject r0 = r2.p     // Catch:{ Throwable -> 0x0441 }
            if (r0 == 0) goto L_0x0449
            java.lang.String r4 = "able"
            java.lang.String r4 = r0.optString(r4)     // Catch:{ Throwable -> 0x0441 }
            boolean r5 = w     // Catch:{ Throwable -> 0x0441 }
            boolean r4 = com.loc.cz.a((java.lang.String) r4, (boolean) r5)     // Catch:{ Throwable -> 0x0441 }
            w = r4     // Catch:{ Throwable -> 0x0441 }
            if (r4 == 0) goto L_0x042e
            java.lang.String r4 = "c"
            r5 = 300(0x12c, float:4.2E-43)
            int r0 = r0.optInt(r4, r5)     // Catch:{ Throwable -> 0x0441 }
            int r0 = r0 * 1000
            long r4 = (long) r0     // Catch:{ Throwable -> 0x0441 }
            x = r4     // Catch:{ Throwable -> 0x0441 }
        L_0x042e:
            java.lang.String r0 = "pref"
            java.lang.String r4 = "ca"
            boolean r5 = w     // Catch:{ Throwable -> 0x0441 }
            com.loc.cl.a((android.content.Context) r1, (java.lang.String) r0, (java.lang.String) r4, (boolean) r5)     // Catch:{ Throwable -> 0x0441 }
            java.lang.String r0 = "pref"
            java.lang.String r4 = "ct"
            long r8 = x     // Catch:{ Throwable -> 0x0441 }
            com.loc.cl.a((android.content.Context) r1, (java.lang.String) r0, (java.lang.String) r4, (long) r8)     // Catch:{ Throwable -> 0x0441 }
            goto L_0x0449
        L_0x0441:
            r0 = move-exception
            java.lang.String r4 = "AuthUtil"
            java.lang.String r5 = "loadConfigDataCacheAble"
            com.loc.ce.a(r0, r4, r5)     // Catch:{ Throwable -> 0x065b }
        L_0x0449:
            com.loc.cz$a$b r0 = r2.E     // Catch:{ Throwable -> 0x0458 }
            if (r0 == 0) goto L_0x0460
            java.lang.String r4 = "HttpDNS"
            java.lang.String r5 = "1.0.0"
            boolean r0 = a(r1, r0, r4, r5)     // Catch:{ Throwable -> 0x0458 }
            ad = r0     // Catch:{ Throwable -> 0x0458 }
            goto L_0x0460
        L_0x0458:
            r0 = move-exception
            java.lang.String r4 = "AuthUtil"
            java.lang.String r5 = "loadConfigDataDnsDex"
            com.loc.ce.a(r0, r4, r5)     // Catch:{ Throwable -> 0x065b }
        L_0x0460:
            org.json.JSONObject r0 = r2.j     // Catch:{ Throwable -> 0x055d }
            if (r0 == 0) goto L_0x0565
            java.lang.String r4 = "able"
            java.lang.String r4 = r0.optString(r4)     // Catch:{ Throwable -> 0x055d }
            boolean r5 = af     // Catch:{ Throwable -> 0x055d }
            boolean r4 = com.loc.cz.a((java.lang.String) r4, (boolean) r5)     // Catch:{ Throwable -> 0x055d }
            af = r4     // Catch:{ Throwable -> 0x055d }
            java.lang.String r4 = "sysTime"
            long r8 = com.loc.cn.a()     // Catch:{ Throwable -> 0x055d }
            long r4 = r0.optLong(r4, r8)     // Catch:{ Throwable -> 0x055d }
            ag = r4     // Catch:{ Throwable -> 0x055d }
            java.lang.String r4 = "n"
            int r4 = r0.optInt(r4, r7)     // Catch:{ Throwable -> 0x055d }
            ah = r4     // Catch:{ Throwable -> 0x055d }
            java.lang.String r4 = "nh"
            int r4 = r0.optInt(r4, r7)     // Catch:{ Throwable -> 0x055d }
            ai = r4     // Catch:{ Throwable -> 0x055d }
            int r4 = ah     // Catch:{ Throwable -> 0x055d }
            if (r4 == r6) goto L_0x049b
            int r4 = ah     // Catch:{ Throwable -> 0x055d }
            int r5 = ai     // Catch:{ Throwable -> 0x055d }
            if (r4 < r5) goto L_0x0499
            goto L_0x049b
        L_0x0499:
            r4 = 0
            goto L_0x049c
        L_0x049b:
            r4 = 1
        L_0x049c:
            boolean r5 = af     // Catch:{ Throwable -> 0x055d }
            if (r5 == 0) goto L_0x0565
            if (r4 == 0) goto L_0x0565
            java.lang.String r4 = "l"
            org.json.JSONArray r4 = r0.optJSONArray(r4)     // Catch:{ Throwable -> 0x055d }
            r5 = 0
        L_0x04a9:
            int r8 = r4.length()     // Catch:{ Throwable -> 0x055d }
            if (r5 >= r8) goto L_0x0536
            org.json.JSONObject r8 = r4.optJSONObject(r5)     // Catch:{ Throwable -> 0x0531 }
            com.loc.cg r9 = new com.loc.cg     // Catch:{ Throwable -> 0x0531 }
            r9.<init>()     // Catch:{ Throwable -> 0x0531 }
            java.lang.String r10 = "able"
            java.lang.String r11 = "false"
            java.lang.String r10 = r8.optString(r10, r11)     // Catch:{ Throwable -> 0x0531 }
            boolean r10 = com.loc.cz.a((java.lang.String) r10, (boolean) r3)     // Catch:{ Throwable -> 0x0531 }
            r9.f25651a = r10     // Catch:{ Throwable -> 0x0531 }
            if (r10 != 0) goto L_0x04c9
            goto L_0x0531
        L_0x04c9:
            java.lang.String r10 = "pn"
            java.lang.String r11 = ""
            java.lang.String r10 = r8.optString(r10, r11)     // Catch:{ Throwable -> 0x0531 }
            r9.f25652b = r10     // Catch:{ Throwable -> 0x0531 }
            java.lang.String r10 = "cn"
            java.lang.String r11 = ""
            java.lang.String r10 = r8.optString(r10, r11)     // Catch:{ Throwable -> 0x0531 }
            r9.f25653c = r10     // Catch:{ Throwable -> 0x0531 }
            java.lang.String r10 = "a"
            java.lang.String r11 = ""
            java.lang.String r10 = r8.optString(r10, r11)     // Catch:{ Throwable -> 0x0531 }
            r9.f25655e = r10     // Catch:{ Throwable -> 0x0531 }
            java.lang.String r10 = "b"
            org.json.JSONArray r10 = r8.optJSONArray(r10)     // Catch:{ Throwable -> 0x0531 }
            if (r10 == 0) goto L_0x051e
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0531 }
            r11.<init>()     // Catch:{ Throwable -> 0x0531 }
            r12 = 0
        L_0x04f5:
            int r13 = r10.length()     // Catch:{ Throwable -> 0x0531 }
            if (r12 >= r13) goto L_0x051c
            org.json.JSONObject r13 = r10.optJSONObject(r12)     // Catch:{ Throwable -> 0x0531 }
            java.util.HashMap r14 = new java.util.HashMap     // Catch:{ Throwable -> 0x0531 }
            r15 = 16
            r14.<init>(r15)     // Catch:{ Throwable -> 0x0531 }
            java.lang.String r15 = "k"
            java.lang.String r15 = r13.optString(r15)     // Catch:{ Throwable -> 0x0518 }
            java.lang.String r7 = "v"
            java.lang.String r7 = r13.optString(r7)     // Catch:{ Throwable -> 0x0518 }
            r14.put(r15, r7)     // Catch:{ Throwable -> 0x0518 }
            r11.add(r14)     // Catch:{ Throwable -> 0x0518 }
        L_0x0518:
            int r12 = r12 + 1
            r7 = 1
            goto L_0x04f5
        L_0x051c:
            r9.f25654d = r11     // Catch:{ Throwable -> 0x0531 }
        L_0x051e:
            java.lang.String r7 = "is"
            java.lang.String r10 = "false"
            java.lang.String r7 = r8.optString(r7, r10)     // Catch:{ Throwable -> 0x0531 }
            boolean r7 = com.loc.cz.a((java.lang.String) r7, (boolean) r3)     // Catch:{ Throwable -> 0x0531 }
            r9.f25656f = r7     // Catch:{ Throwable -> 0x0531 }
            java.util.List<com.loc.cg> r7 = ae     // Catch:{ Throwable -> 0x0531 }
            r7.add(r9)     // Catch:{ Throwable -> 0x0531 }
        L_0x0531:
            int r5 = r5 + 1
            r7 = 1
            goto L_0x04a9
        L_0x0536:
            java.lang.String r4 = "sl"
            org.json.JSONArray r0 = r0.optJSONArray(r4)     // Catch:{ Throwable -> 0x055d }
            if (r0 == 0) goto L_0x0565
            r4 = 0
        L_0x053f:
            int r5 = r0.length()     // Catch:{ Throwable -> 0x055d }
            if (r4 >= r5) goto L_0x0565
            org.json.JSONObject r5 = r0.optJSONObject(r4)     // Catch:{ Throwable -> 0x055d }
            java.lang.String r7 = "pan"
            java.lang.String r5 = r5.optString(r7)     // Catch:{ Throwable -> 0x055d }
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x055d }
            if (r7 != 0) goto L_0x055a
            java.util.List<java.lang.String> r7 = aj     // Catch:{ Throwable -> 0x055d }
            r7.add(r5)     // Catch:{ Throwable -> 0x055d }
        L_0x055a:
            int r4 = r4 + 1
            goto L_0x053f
        L_0x055d:
            r0 = move-exception
            java.lang.String r4 = "AuthUtil"
            java.lang.String r5 = "loadConfigData_otherServiceList"
            com.loc.ce.a(r0, r4, r5)     // Catch:{ Throwable -> 0x065b }
        L_0x0565:
            org.json.JSONObject r0 = r2.i     // Catch:{ Throwable -> 0x0584 }
            if (r0 == 0) goto L_0x058c
            java.lang.String r4 = "able"
            java.lang.String r4 = r0.optString(r4)     // Catch:{ Throwable -> 0x0584 }
            boolean r5 = z     // Catch:{ Throwable -> 0x0584 }
            boolean r4 = com.loc.cz.a((java.lang.String) r4, (boolean) r5)     // Catch:{ Throwable -> 0x0584 }
            z = r4     // Catch:{ Throwable -> 0x0584 }
            if (r4 == 0) goto L_0x058c
            java.lang.String r4 = "c"
            int r5 = ak     // Catch:{ Throwable -> 0x0584 }
            int r0 = r0.optInt(r4, r5)     // Catch:{ Throwable -> 0x0584 }
            ak = r0     // Catch:{ Throwable -> 0x0584 }
            goto L_0x058c
        L_0x0584:
            r0 = move-exception
            java.lang.String r4 = "AuthUtil"
            java.lang.String r5 = "loadConfigDataGpsGeoAble"
            com.loc.ce.a(r0, r4, r5)     // Catch:{ Throwable -> 0x065b }
        L_0x058c:
            org.json.JSONObject r0 = r2.w     // Catch:{ Throwable -> 0x065b }
            if (r0 == 0) goto L_0x0659
            java.lang.String r2 = "157"
            org.json.JSONObject r0 = r0.optJSONObject(r2)     // Catch:{ Throwable -> 0x0651 }
            if (r0 == 0) goto L_0x0659
            java.lang.String r2 = "able"
            java.lang.String r2 = r0.optString(r2)     // Catch:{ Throwable -> 0x0651 }
            boolean r4 = G     // Catch:{ Throwable -> 0x0651 }
            boolean r2 = com.loc.cz.a((java.lang.String) r2, (boolean) r4)     // Catch:{ Throwable -> 0x0651 }
            G = r2     // Catch:{ Throwable -> 0x0651 }
            java.lang.String r2 = "co"
            java.lang.String r4 = "1.0.0"
            com.loc.dh r2 = com.loc.ce.a((java.lang.String) r2, (java.lang.String) r4)     // Catch:{ Throwable -> 0x0651 }
            boolean r4 = G     // Catch:{ Throwable -> 0x0651 }
            if (r4 == 0) goto L_0x0619
            java.lang.String r4 = "cv"
            int r4 = r0.optInt(r4, r6)     // Catch:{ Throwable -> 0x0651 }
            am = r4     // Catch:{ Throwable -> 0x0651 }
            java.lang.String r4 = "co"
            java.lang.String r4 = r0.optString(r4)     // Catch:{ Throwable -> 0x0651 }
            boolean r5 = H     // Catch:{ Throwable -> 0x0651 }
            boolean r4 = com.loc.cz.a((java.lang.String) r4, (boolean) r5)     // Catch:{ Throwable -> 0x0651 }
            H = r4     // Catch:{ Throwable -> 0x0651 }
            java.lang.String r4 = "oo"
            java.lang.String r4 = r0.optString(r4)     // Catch:{ Throwable -> 0x0651 }
            boolean r5 = I     // Catch:{ Throwable -> 0x0651 }
            boolean r4 = com.loc.cz.a((java.lang.String) r4, (boolean) r5)     // Catch:{ Throwable -> 0x0651 }
            I = r4     // Catch:{ Throwable -> 0x0651 }
            java.lang.String r4 = "v"
            java.lang.String r4 = r0.optString(r4)     // Catch:{ Throwable -> 0x0651 }
            java.lang.String r5 = "u"
            java.lang.String r5 = r0.optString(r5)     // Catch:{ Throwable -> 0x0651 }
            java.lang.String r6 = "m"
            java.lang.String r0 = r0.optString(r6)     // Catch:{ Throwable -> 0x0651 }
            boolean r6 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x0651 }
            if (r6 != 0) goto L_0x062c
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x0651 }
            if (r6 != 0) goto L_0x062c
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x0651 }
            if (r4 != 0) goto L_0x062c
            com.loc.s r4 = new com.loc.s     // Catch:{ Throwable -> 0x0651 }
            r4.<init>(r5, r0)     // Catch:{ Throwable -> 0x0651 }
            boolean r0 = K     // Catch:{ Throwable -> 0x0651 }
            r4.j = r0     // Catch:{ Throwable -> 0x0651 }
            boolean r0 = com.loc.t.a((android.content.Context) r1, (com.loc.s) r4, (com.loc.dh) r2)     // Catch:{ Throwable -> 0x0651 }
            r5 = r0 ^ 1
            J = r5     // Catch:{ Throwable -> 0x0651 }
            if (r0 == 0) goto L_0x062c
            java.lang.String r0 = "pref"
            java.lang.String r5 = "ok4"
            r6 = 1
            com.loc.cl.a((android.content.Context) r1, (java.lang.String) r0, (java.lang.String) r5, (boolean) r6)     // Catch:{ Throwable -> 0x0651 }
            com.loc.t.b(r1, r4, r2)     // Catch:{ Throwable -> 0x0651 }
            goto L_0x062c
        L_0x0619:
            J = r3     // Catch:{ Throwable -> 0x0651 }
            H = r3     // Catch:{ Throwable -> 0x0651 }
            I = r3     // Catch:{ Throwable -> 0x0651 }
            boolean r0 = com.loc.cj.a((android.content.Context) r1, (com.loc.dh) r2)     // Catch:{ Throwable -> 0x0651 }
            if (r0 == 0) goto L_0x062c
            java.lang.String r0 = "co"
            java.lang.String r2 = "config|coDex able is false"
            com.loc.ck.a(r1, r0, r2)     // Catch:{ Throwable -> 0x0651 }
        L_0x062c:
            java.lang.String r0 = "pref"
            java.lang.String r2 = "ok0"
            boolean r4 = G     // Catch:{ Throwable -> 0x0651 }
            com.loc.cl.a((android.content.Context) r1, (java.lang.String) r0, (java.lang.String) r2, (boolean) r4)     // Catch:{ Throwable -> 0x0651 }
            java.lang.String r0 = "pref"
            java.lang.String r2 = "ok1"
            boolean r4 = J     // Catch:{ Throwable -> 0x0651 }
            com.loc.cl.a((android.content.Context) r1, (java.lang.String) r0, (java.lang.String) r2, (boolean) r4)     // Catch:{ Throwable -> 0x0651 }
            java.lang.String r0 = "pref"
            java.lang.String r2 = "ok2"
            boolean r4 = H     // Catch:{ Throwable -> 0x0651 }
            com.loc.cl.a((android.content.Context) r1, (java.lang.String) r0, (java.lang.String) r2, (boolean) r4)     // Catch:{ Throwable -> 0x0651 }
            java.lang.String r0 = "pref"
            java.lang.String r2 = "ok3"
            boolean r4 = I     // Catch:{ Throwable -> 0x0651 }
            com.loc.cl.a((android.content.Context) r1, (java.lang.String) r0, (java.lang.String) r2, (boolean) r4)     // Catch:{ Throwable -> 0x0651 }
            goto L_0x0659
        L_0x0651:
            r0 = move-exception
            java.lang.String r1 = "AuthUtil"
            java.lang.String r2 = "loadConfigDataNewCollectionOffline"
            com.loc.ce.a(r0, r1, r2)     // Catch:{ Throwable -> 0x065b }
        L_0x0659:
            r1 = 1
            return r1
        L_0x065b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.cd.a(android.content.Context, com.loc.cz$a):boolean");
    }

    public static String b() {
        return L;
    }

    public static boolean b(long j2) {
        if (!w) {
            return false;
        }
        return x < 0 || cn.a() - j2 < x;
    }

    public static boolean b(Context context) {
        if (!U) {
            return false;
        }
        if (V == -1 || W == 0) {
            return true;
        }
        if (!cn.b(W, cl.b(context, "pref", "nowtime", 0))) {
            h(context);
            cl.a(context, "pref", "count", 1);
            return true;
        }
        int b2 = cl.b(context, "pref", "count", 0);
        if (b2 >= V) {
            return false;
        }
        cl.a(context, "pref", "count", b2 + 1);
        return true;
    }

    public static ArrayList<String> c() {
        return X;
    }

    static void c(Context context) {
        try {
            SharedPreferences.Editor edit = c.a(context, "pref", 0).edit();
            edit.putLong("pushSerTime", t);
            edit.putInt("pushCount", 0);
            cl.a(edit);
        } catch (Throwable th) {
            ce.a(th, "AuthUtil", "resetPrefsBind");
        }
    }

    public static boolean d() {
        return l;
    }

    public static boolean d(Context context) {
        if (!aa || T <= 0 || S <= 0 || T > S) {
            return false;
        }
        long b2 = cl.b(context, "abcd", "lct", 0);
        long b3 = cl.b(context, "abcd", "lst", 0);
        long b4 = cn.b();
        if (b4 < b2) {
            cl.a(context, "abcd", "lct", b4);
            return false;
        }
        if (b4 - b2 > 86400000) {
            cl.a(context, "abcd", "lct", b4);
            cl.a(context, "abcd", "t", 0);
        }
        if (b4 - b3 < ((long) R)) {
            return false;
        }
        int b5 = cl.b(context, "abcd", "t", 0) + 1;
        if (b5 > S) {
            return false;
        }
        cl.a(context, "abcd", "lst", b4);
        cl.a(context, "abcd", "t", b5);
        return true;
    }

    public static long e() {
        return x;
    }

    public static void e(Context context) {
        try {
            dh b2 = ce.b();
            b2.a(l);
            i.a(context, b2);
        } catch (Throwable unused) {
        }
    }

    public static boolean f() {
        return w;
    }

    public static boolean f(Context context) {
        boolean z2 = ah != -1 && ah < ai;
        if (!(!af || ah == 0 || ai == 0 || ag == 0 || z2)) {
            if (aj != null && aj.size() > 0) {
                for (String b2 : aj) {
                    if (cn.b(context, b2)) {
                        return false;
                    }
                }
            }
            if (ah == -1 && ai == -1) {
                return true;
            }
            long b3 = cl.b(context, "pref", "ots", 0);
            long b4 = cl.b(context, "pref", "otsh", 0);
            int b5 = cl.b(context, "pref", "otn", 0);
            int b6 = cl.b(context, "pref", "otnh", 0);
            if (ah != -1) {
                if (!cn.b(ag, b3)) {
                    try {
                        SharedPreferences.Editor edit = c.a(context, "pref", 0).edit();
                        edit.putLong("ots", ag);
                        edit.putLong("otsh", ag);
                        edit.putInt("otn", 0);
                        edit.putInt("otnh", 0);
                        cl.a(edit);
                    } catch (Throwable th) {
                        ce.a(th, "AuthUtil", "resetPrefsBind");
                    }
                    cl.a(context, "pref", "otn", 1);
                    cl.a(context, "pref", "otnh", 1);
                    return true;
                } else if (b5 < ah) {
                    if (ai == -1) {
                        cl.a(context, "pref", "otn", b5 + 1);
                        cl.a(context, "pref", "otnh", 0);
                        return true;
                    } else if (!cn.a(ag, b4)) {
                        cl.a(context, "pref", "otsh", ag);
                        cl.a(context, "pref", "otn", b5 + 1);
                        cl.a(context, "pref", "otnh", 1);
                        return true;
                    } else if (b6 < ai) {
                        cl.a(context, "pref", "otn", b5 + 1);
                        cl.a(context, "pref", "otnh", b6 + 1);
                        return true;
                    }
                }
            }
            if (ah == -1) {
                cl.a(context, "pref", "otn", 0);
                if (ai == -1) {
                    cl.a(context, "pref", "otnh", 0);
                    return true;
                } else if (!cn.a(ag, b4)) {
                    cl.a(context, "pref", "otsh", ag);
                    cl.a(context, "pref", "otnh", 1);
                    return true;
                } else if (b6 < ai) {
                    cl.a(context, "pref", "otnh", b6 + 1);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean g() {
        return ad;
    }

    public static boolean g(Context context) {
        if (context == null) {
            return false;
        }
        try {
            if (cn.b() - D >= ((long) A)) {
                E = true;
                return true;
            }
        } catch (Throwable th) {
            ce.a(th, "Aps", "isConfigNeedUpdate");
        }
        return false;
    }

    public static List<cg> h() {
        return ae;
    }

    private static void h(Context context) {
        try {
            SharedPreferences.Editor edit = c.a(context, "pref", 0).edit();
            edit.putLong("nowtime", W);
            edit.putInt("count", 0);
            cl.a(edit);
        } catch (Throwable th) {
            ce.a(th, "AuthUtil", "resetPrefsBind");
        }
    }

    public static int i() {
        return ak;
    }

    public static boolean j() {
        return G;
    }

    public static int k() {
        return am;
    }

    public static boolean l() {
        return J;
    }

    public static boolean a(Context context) {
        boolean z2;
        q = true;
        try {
            K = cl.b(context, "pref", "oda", false);
            z2 = a(context, cz.a(context, ce.b(), ce.f25646c, K));
        } catch (Throwable th) {
            ce.a(th, "AuthUtil", "getConfig");
            z2 = false;
        }
        D = cn.b();
        C = cn.b();
        return z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r7, long r8) {
        /*
            boolean r0 = v
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = com.loc.cn.a()
            long r8 = r2 - r8
            int r0 = ab
            long r4 = (long) r0
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            return r1
        L_0x0014:
            int r8 = ac
            r9 = -1
            r0 = 1
            if (r8 != r9) goto L_0x001b
            return r0
        L_0x001b:
            java.lang.String r8 = "pref"
            java.lang.String r9 = "ngpsTime"
            r4 = 0
            long r8 = com.loc.cl.b((android.content.Context) r7, (java.lang.String) r8, (java.lang.String) r9, (long) r4)
            boolean r4 = com.loc.cn.b((long) r2, (long) r8)
            if (r4 != 0) goto L_0x002d
        L_0x002b:
            r8 = 0
            goto L_0x004e
        L_0x002d:
            java.util.Locale r4 = java.util.Locale.CHINA
            java.util.Calendar r4 = java.util.Calendar.getInstance(r4)
            r4.setTimeInMillis(r2)
            r5 = 11
            int r6 = r4.get(r5)
            r4.setTimeInMillis(r8)
            int r8 = r4.get(r5)
            r9 = 12
            if (r6 <= r9) goto L_0x004b
            if (r8 <= r9) goto L_0x002b
        L_0x0049:
            r8 = 1
            goto L_0x004e
        L_0x004b:
            if (r8 > r9) goto L_0x002b
            goto L_0x0049
        L_0x004e:
            if (r8 != 0) goto L_0x0078
            java.lang.String r8 = "pref"
            android.content.SharedPreferences r8 = com.ss.android.ugc.aweme.q.c.a(r7, r8, r1)     // Catch:{ Throwable -> 0x0068 }
            android.content.SharedPreferences$Editor r8 = r8.edit()     // Catch:{ Throwable -> 0x0068 }
            java.lang.String r9 = "ngpsTime"
            r8.putLong(r9, r2)     // Catch:{ Throwable -> 0x0068 }
            java.lang.String r9 = "ngpsCount"
            r8.putInt(r9, r1)     // Catch:{ Throwable -> 0x0068 }
            com.loc.cl.a(r8)     // Catch:{ Throwable -> 0x0068 }
            goto L_0x0070
        L_0x0068:
            r8 = move-exception
            java.lang.String r9 = "AuthUtil"
            java.lang.String r1 = "resetPrefsNGPS"
            com.loc.ce.a(r8, r9, r1)
        L_0x0070:
            java.lang.String r8 = "pref"
            java.lang.String r9 = "ngpsCount"
            com.loc.cl.a((android.content.Context) r7, (java.lang.String) r8, (java.lang.String) r9, (int) r0)
            return r0
        L_0x0078:
            java.lang.String r8 = "pref"
            java.lang.String r9 = "ngpsCount"
            int r8 = com.loc.cl.b((android.content.Context) r7, (java.lang.String) r8, (java.lang.String) r9, (int) r1)
            int r9 = ac
            if (r8 >= r9) goto L_0x008d
            int r8 = r8 + r0
            java.lang.String r9 = "pref"
            java.lang.String r1 = "ngpsCount"
            com.loc.cl.a((android.content.Context) r7, (java.lang.String) r9, (java.lang.String) r1, (int) r8)
            return r0
        L_0x008d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.cd.a(android.content.Context, long):boolean");
    }
}
