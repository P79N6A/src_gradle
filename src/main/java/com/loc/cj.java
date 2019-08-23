package com.loc;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.autonavi.aps.amapapi.model.AMapLocationServer;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class cj {
    static JSONArray g = null;
    static AMapLocation h = null;
    private static List<au> i = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public SparseArray<Long> f25660a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public int f25661b = -1;

    /* renamed from: c  reason: collision with root package name */
    public long f25662c = 0;

    /* renamed from: d  reason: collision with root package name */
    String[] f25663d = {"ol", "cl", "gl", "ha", NotificationStyle.BASE_STYLE, "ds"};

    /* renamed from: e  reason: collision with root package name */
    public int f25664e = -1;

    /* renamed from: f  reason: collision with root package name */
    public long f25665f = -1;

    /* renamed from: com.loc.cj$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f25666a = new int[AMapLocationClientOption.AMapLocationMode.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.amap.api.location.AMapLocationClientOption$AMapLocationMode[] r0 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25666a = r0
                int[] r0 = f25666a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Battery_Saving     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f25666a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Device_Sensors     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f25666a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Hight_Accuracy     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.loc.cj.AnonymousClass1.<clinit>():void");
        }
    }

    public static void a(Context context) {
        if (context != null) {
            try {
                if (cd.d()) {
                    if (i != null && i.size() > 0) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(i);
                        av.a((List) arrayList, context);
                        i.clear();
                    }
                    e(context);
                }
            } catch (Throwable th) {
                ce.a(th, "ReportUtil", "destroy");
            }
        }
    }

    public static void a(Context context, ci ciVar) {
        String str;
        if (context != null) {
            try {
                if (cd.d()) {
                    AMapLocationServer aMapLocationServer = ciVar.f25659c;
                    if (cn.a(aMapLocationServer) && !"GPS".equalsIgnoreCase(aMapLocationServer.getProvider())) {
                        if (aMapLocationServer.getLocationType() != 1) {
                            int intValue = Long.valueOf(ciVar.f25658b - ciVar.f25657a).intValue();
                            boolean z = false;
                            int intValue2 = Long.valueOf(aMapLocationServer.k()).intValue();
                            switch (aMapLocationServer.getLocationType()) {
                                case 5:
                                case 6:
                                    str = "net";
                                    break;
                                default:
                                    str = "cache";
                                    z = true;
                                    break;
                            }
                            String str2 = a((AMapLocation) aMapLocationServer) ? "abroad" : "domestic";
                            if (!z) {
                                a(context, "O014", str2, null, intValue2, intValue);
                            }
                            a(context, "O013", str, str2, intValue, Integer.MAX_VALUE);
                        }
                    }
                }
            } catch (Throwable th) {
                ce.a(th, "ReportUtil", "reportLBSLocUseTime");
            }
        }
    }

    static void a(Context context, String str, int i2, String str2) {
        if (context != null) {
            try {
                if (cd.d()) {
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("param_string_first", str2);
                    }
                    if (i2 != Integer.MAX_VALUE) {
                        jSONObject.put("param_int_first", i2);
                    }
                    a(context, str, jSONObject);
                }
            } catch (Throwable th) {
                ce.a(th, "ReportUtil", "applyStatisticsEx");
            }
        }
    }

    static void a(Context context, String str, String str2, String str3, int i2, int i3) {
        if (context != null) {
            try {
                if (cd.d()) {
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("param_string_first", str2);
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        jSONObject.put("param_string_second", str3);
                    }
                    if (i2 != Integer.MAX_VALUE) {
                        jSONObject.put("param_int_first", i2);
                    }
                    if (i3 != Integer.MAX_VALUE) {
                        jSONObject.put("param_int_second", i3);
                    }
                    a(context, str, jSONObject);
                }
            } catch (Throwable th) {
                ce.a(th, "ReportUtil", "applyStatisticsEx");
            }
        }
    }

    static void a(Context context, String str, JSONObject jSONObject) {
        if (context != null) {
            try {
                if (cd.d()) {
                    au auVar = new au(context, "loc", "4.2.0", str);
                    auVar.a(jSONObject.toString());
                    i.add(auVar);
                    if (i.size() >= 100) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(i);
                        av.a((List) arrayList, context);
                        i.clear();
                    }
                }
            } catch (Throwable th) {
                ce.a(th, "ReportUtil", "applyStatistics");
            }
        }
    }

    public static void a(String str, int i2) {
        String valueOf = String.valueOf(i2);
        String str2 = "";
        switch (i2) {
            case 2011:
                str2 = "ContextIsNull";
                break;
            case 2021:
                str2 = "OnlyMainWifi";
                break;
            case 2022:
                str2 = "OnlyOneWifiButNotMain";
                break;
            case 2031:
                str2 = "CreateApsReqException";
                break;
            case 2041:
                str2 = "ResponseResultIsNull";
                break;
            case 2051:
                str2 = "NeedLoginNetWork\t";
                break;
            case 2052:
                str2 = "MaybeIntercepted";
                break;
            case 2053:
                str2 = "DecryptResponseException";
                break;
            case 2054:
                str2 = "ParserDataException";
                break;
            case 2061:
                str2 = "ServerRetypeError";
                break;
            case 2062:
                str2 = "ServerLocFail";
                break;
            case 2081:
                str2 = "LocalLocException";
                break;
            case 2091:
                str2 = "InitException";
                break;
            case 2101:
                str2 = "BindAPSServiceException";
                break;
            case 2102:
                str2 = "AuthClientScodeFail";
                break;
            case 2111:
                str2 = "ErrorCgiInfo";
                break;
            case 2121:
                str2 = "NotLocPermission";
                break;
            case 2131:
                str2 = "NoCgiOAndWifiInfo";
                break;
            case 2132:
                str2 = "AirPlaneModeAndWifiOff";
                break;
            case 2133:
                str2 = "NoCgiAndWifiOff";
                break;
            case 2141:
                str2 = "NoEnoughStatellites";
                break;
            case 2151:
                str2 = "MaybeMockNetLoc";
                break;
            case 2152:
                str2 = "MaybeMockGPSLoc";
                break;
        }
        a(str, valueOf, str2);
    }

    public static void a(String str, String str2) {
        try {
            i.b(ce.b(), str2, str);
        } catch (Throwable th) {
            ce.a(th, "ReportUtil", "reportLog");
        }
    }

    public static void a(String str, String str2, String str3) {
        try {
            i.a(ce.b(), "/mobile/binary", str3, str, str2);
        } catch (Throwable unused) {
        }
    }

    public static boolean a(Context context, dh dhVar) {
        try {
            return t.b(context, dhVar);
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean a(AMapLocation aMapLocation) {
        return cn.a(aMapLocation) ? !ce.a(aMapLocation.getLatitude(), aMapLocation.getLongitude()) : "http://abroad.apilocate.amap.com/mobile/binary".equals(ce.f25644a);
    }

    static void e(Context context) {
        try {
            if (g != null && g.length() > 0) {
                at.a(new as(context, ce.b(), g.toString()), context);
                g = null;
            }
        } catch (Throwable th) {
            ce.a(th, "ReportUtil", "writeOfflineLocLog");
        }
    }

    public final void a(Context context, int i2) {
        try {
            if (this.f25661b != i2) {
                if (!(this.f25661b == -1 || this.f25661b == i2)) {
                    this.f25660a.append(this.f25661b, Long.valueOf((cn.b() - this.f25662c) + this.f25660a.get(this.f25661b, 0L).longValue()));
                }
                this.f25662c = cn.b() - cl.b(context, "pref", this.f25663d[i2], 0);
                this.f25661b = i2;
            }
        } catch (Throwable th) {
            ce.a(th, "ReportUtil", "setLocationType");
        }
    }

    public final int b(Context context) {
        try {
            long b2 = cl.b(context, "pref", this.f25663d[2], 0);
            long b3 = cl.b(context, "pref", this.f25663d[0], 0);
            long b4 = cl.b(context, "pref", this.f25663d[1], 0);
            if (b2 == 0 && b3 == 0 && b4 == 0) {
                return -1;
            }
            long j = b3 - b2;
            long j2 = b4 - b2;
            return b2 > j ? b2 > j2 ? 2 : 1 : j > j2 ? 0 : 1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int c(Context context) {
        try {
            long b2 = cl.b(context, "pref", this.f25663d[3], 0);
            long b3 = cl.b(context, "pref", this.f25663d[4], 0);
            long b4 = cl.b(context, "pref", this.f25663d[5], 0);
            if (b2 == 0 && b3 == 0 && b4 == 0) {
                return -1;
            }
            return b2 > b3 ? b2 > b4 ? 3 : 5 : b3 > b4 ? 4 : 5;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final void d(Context context) {
        int i2 = 0;
        while (i2 < this.f25663d.length) {
            try {
                cl.a(context, "pref", this.f25663d[i2], 0);
                i2++;
            } catch (Throwable unused) {
                return;
            }
        }
    }
}
