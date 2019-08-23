package com.ss.android.ad.splash.utils;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.ss.android.ad.splash.a;
import com.ss.android.ad.splash.core.c.b;
import com.ss.android.ad.splash.core.c.d;
import com.ss.android.ad.splash.core.c.g;
import com.ss.android.ad.splash.core.c.h;
import com.ss.android.ad.splash.core.c.j;
import com.ss.android.ad.splash.core.e;
import com.ss.android.ad.splash.core.r;
import com.ss.android.ugc.aweme.C0906R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f27842a;

    public static boolean a(long j, long j2) {
        return j2 > j;
    }

    public static boolean a() {
        r a2 = r.a();
        int i = a2.i();
        return i > 0 && a2.l() >= i;
    }

    @WorkerThread
    @NonNull
    public static List<b> a(@Nullable JSONArray jSONArray, long j, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    b bVar = new b();
                    bVar.a(optJSONObject, j, z);
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    @WorkerThread
    @NonNull
    public static List<b> a(@Nullable JSONArray jSONArray, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    b bVar = new b();
                    bVar.a(optJSONObject);
                    if (!z) {
                        arrayList.add(bVar);
                    } else if (System.currentTimeMillis() <= bVar.e()) {
                        arrayList.add(bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    @WorkerThread
    @NonNull
    public static Map<String, b> a(List<b> list) {
        HashMap hashMap = new HashMap();
        if (d.a(list)) {
            return hashMap;
        }
        for (b next : list) {
            if (!TextUtils.isEmpty(next.k())) {
                hashMap.put(next.k(), next);
            }
        }
        return hashMap;
    }

    @NonNull
    public static <E extends h> List<b> a(@Nullable Map<String, b> map, @Nullable List<E> list) {
        ArrayList arrayList = new ArrayList();
        if (d.a(list) || map == null) {
            return arrayList;
        }
        for (E e2 : list) {
            b bVar = map.get(e2.w());
            if (bVar != null) {
                if (e2 instanceof g) {
                    bVar.f27613e = ((g) e2).f27638a;
                    bVar.r = true;
                }
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @WorkerThread
    @NonNull
    public static List<h> a(@Nullable JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(new h(optString));
                }
            }
        }
        return arrayList;
    }

    public static int b() {
        int h = h();
        if (h <= 0) {
            return i();
        }
        return h;
    }

    private static int h() {
        return (int) k.a(e.F(), (float) e.G());
    }

    public static int g() {
        int a2 = (int) k.a(e.F(), (float) e.O());
        if (a2 > 0) {
            return a2;
        }
        return (b() / 2) - e.F().getResources().getDimensionPixelSize(C0906R.dimen.lc);
    }

    @Nullable
    public static String c() {
        a e2 = e.e();
        e2.f22773f = true;
        HashMap<String, String> E = e.E();
        if (e2 == null) {
            return null;
        }
        String str = f27842a.get(e2.f22768a);
        if (g.a(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(5120);
        try {
            sb.append("/api/ad/splash/");
            sb.append(str);
            if (e.R()) {
                sb.append("/v14/");
            } else {
                sb.append("/v16/");
            }
            sb.append("?_unused=0");
            sb.append(j());
            sb.append(e2.toString());
            sb.append("&app_name=");
            sb.append(str);
            if (E != null) {
                sb.append(a(E));
            }
            if (e.Q() != -1) {
                sb.append("&is_cold_start=");
                sb.append(e.Q());
            }
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    @Nullable
    public static String d() {
        com.ss.android.ad.splash.core.c.f fVar = com.ss.android.ad.splash.core.h.a().f27696c;
        if (fVar == null) {
            return null;
        }
        List<b> list = fVar.f27633a;
        if (d.a(list)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String j = list.get(i).j();
            if (!TextUtils.isEmpty(j)) {
                sb.append(j);
                if (i != list.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    @Nullable
    public static String e() {
        StringBuilder sb = new StringBuilder(5120);
        a e2 = e.e();
        e2.f22773f = true;
        if (e2 != null) {
            try {
                String n = r.a().n();
                sb.append("/api/ad/v3/splash/creatives/");
                sb.append("?_unused=0");
                sb.append(j());
                sb.append(e2.toString());
                if (!TextUtils.isEmpty(n)) {
                    sb.append(n);
                }
                if (e.Q() != -1) {
                    sb.append("&is_cold_start=");
                    sb.append(e.Q());
                }
            } catch (Exception unused) {
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("getCommonParamsForRealtimeRequest is not allowed to assigned null");
    }

    @Nullable
    public static String f() {
        StringBuilder sb = new StringBuilder(5120);
        a e2 = e.e();
        e2.f22773f = true;
        if (e2 != null) {
            try {
                String n = r.a().n();
                sb.append("/api/ad/v2/ack/splash/");
                sb.append("?_unused=0");
                sb.append(j());
                sb.append(e2.toString());
                if (!TextUtils.isEmpty(n)) {
                    sb.append(n);
                }
                if (e.Q() != -1) {
                    sb.append("&is_cold_start=");
                    sb.append(e.Q());
                }
            } catch (Exception unused) {
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("getCommonParamsForRealtimeRequest is not allowed to assigned null");
    }

    private static int i() {
        int i;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) e.F().getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        double d2 = (double) e.F().getResources().getDisplayMetrics().density;
        if (d2 <= 1.1d) {
            i = 100;
        } else if (d2 <= 1.6d) {
            i = 960;
        } else {
            i = 1260;
        }
        return (((point.y - k.b(e.F())) * 200) / i) + ((int) k.a(e.F(), 25.0f));
    }

    static {
        HashMap hashMap = new HashMap();
        f27842a = hashMap;
        hashMap.put("1128", "aweme");
        f27842a.put("1180", "trill");
        f27842a.put("1233", "musical");
        f27842a.put("13", "news_article");
        f27842a.put("35", "news_article_lite");
        f27842a.put("32", "video_article");
        f27842a.put("1106", "topbuzz");
        f27842a.put("1116", "topbuzz");
        f27842a.put("1131", "topbuzz");
        f27842a.put("1184", "topbuzz");
        f27842a.put("1104", "topbuzz");
        f27842a.put("1117", "topbuzz");
        f27842a.put("1132", "topbuzz");
        f27842a.put("1185", "topbuzz");
        f27842a.put("1239", "topbuzz");
        f27842a.put("1197", "topbuzz");
        f27842a.put("1193", "topbuzz");
        f27842a.put("1222", "topbuzz");
        f27842a.put("1211", "topbuzz");
        f27842a.put("1194", "topbuzz");
        f27842a.put("1124", "topbuzz");
        f27842a.put("1125", "topbuzz");
        f27842a.put("1245", "topbuzz");
        f27842a.put("1113", "topbuzz");
        f27842a.put("1342", "topbuzz");
        f27842a.put("1346", "topbuzz");
        f27842a.put("1145", "live_i18n");
        f27842a.put("1164", "flipagram");
        f27842a.put("7", "neihan");
        f27842a.put("10001", "faceu");
        f27842a.put("1207", "learning");
        f27842a.put("36", "automobile");
        f27842a.put("150121", "beauty_me");
        f27842a.put("1372", "beauty_me_oversea");
        f27842a.put("1319", "super");
        f27842a.put("1370", "f100");
        f27842a.put("1353", "hively");
        f27842a.put("1354", "hively");
        f27842a.put("1112", "live_stream");
        f27842a.put("1350", "live_stream_lite");
    }

    @Nullable
    private static StringBuilder j() {
        StringBuilder sb = new StringBuilder(1024);
        TelephonyManager telephonyManager = (TelephonyManager) e.F().getSystemService("phone");
        if (telephonyManager != null) {
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            if (!g.a(networkOperatorName)) {
                sb.append("&carrier=");
                sb.append(Uri.encode(networkOperatorName));
            }
            String networkOperator = telephonyManager.getNetworkOperator();
            if (!g.a(networkOperator)) {
                sb.append("&mcc_mnc=");
                sb.append(Uri.encode(networkOperator));
            }
        }
        DisplayMetrics displayMetrics = e.F().getResources().getDisplayMetrics();
        sb.append("x");
        sb.append(displayMetrics.heightPixels - k.b(e.F()));
        sb.append("&sdk_version=");
        sb.append(e.K());
        sb.append("&os_api=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append("&device_platform=android");
        sb.append("&os_version=");
        sb.append(Build.VERSION.RELEASE);
        sb.append("&display_density=");
        sb.append(displayMetrics.widthPixels);
        sb.append("x");
        sb.append(displayMetrics.heightPixels);
        sb.append("&dpi=");
        sb.append(k.a(e.F()));
        sb.append("&device_brand=");
        sb.append(Uri.encode(Build.BRAND));
        sb.append("&device_type=");
        sb.append(Uri.encode(Build.MODEL));
        int b2 = b();
        if (b2 > 0) {
            sb.append("&bh=");
            sb.append(b2);
        }
        sb.append("&display_dpi=");
        sb.append(displayMetrics.densityDpi);
        sb.append("&density=");
        sb.append(displayMetrics.density);
        String d2 = NetworkUtils.d(e.F());
        if (!g.a(d2)) {
            sb.append("&ac=");
            sb.append(Uri.encode(d2));
        }
        return sb;
    }

    @Nullable
    public static String a(j jVar) {
        if (jVar == null || jVar.f27647c == null || jVar.f27647c.isEmpty()) {
            return null;
        }
        return j.a(jVar.f27647c.get(0));
    }

    @Nullable
    public static String b(d dVar) {
        if (dVar == null || !dVar.a()) {
            return null;
        }
        return c(dVar.f27628d);
    }

    public static boolean c(d dVar) {
        if (dVar == null || !dVar.a() || !d(dVar.f27628d)) {
            return false;
        }
        return true;
    }

    @Nullable
    public static String a(d dVar) {
        if (dVar == null) {
            return null;
        }
        List<String> list = dVar.f27625a;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String str = list.get(0);
        if (g.a(str) && list.size() >= 2) {
            str = list.get(1);
            if (g.a(str) && list.size() >= 3) {
                str = list.get(2);
            }
        }
        return str;
    }

    @Nullable
    public static String b(j jVar) {
        if (jVar == null || !jVar.a()) {
            return null;
        }
        return c(jVar.f27648d);
    }

    @Nullable
    private static String c(String str) {
        if (g.a(str)) {
            return null;
        }
        String A = e.A();
        if (TextUtils.isEmpty(A)) {
            return null;
        }
        try {
            File file = new File(A);
            if (!file.exists()) {
                file.mkdirs();
            }
            return A + a.a(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean d(String str) {
        if (g.a(str)) {
            return false;
        }
        String c2 = c(str);
        if (g.a(c2)) {
            return false;
        }
        if (new File(c2).exists()) {
            return r.a().g(str);
        }
        r.a().f(str);
        return false;
    }

    public static int a(String str) {
        if (g.a(str)) {
            return 0;
        }
        try {
            String scheme = Uri.parse(str).getScheme();
            if (g.a(scheme)) {
                return 0;
            }
            if (h.a(str)) {
                return 2;
            }
            if (e.e() != null && "13".equals(e.e().f22768a)) {
                if ("jdsdk".equalsIgnoreCase(scheme)) {
                    return 3;
                }
                if ("taobaosdk".equalsIgnoreCase(scheme)) {
                    return 4;
                }
            }
            return 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    @WorkerThread
    @NonNull
    public static JSONArray b(@NonNull List<b> list) {
        JSONArray jSONArray = new JSONArray();
        if (d.a(list)) {
            return jSONArray;
        }
        try {
            for (b next : list) {
                if (next.u != null) {
                    jSONArray.put(next.u);
                }
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    public static boolean b(String str) {
        if (g.a(str)) {
            return false;
        }
        try {
            switch (a(str)) {
                case 0:
                    return false;
                case 1:
                    Uri parse = Uri.parse(str);
                    if (com.ss.android.ugc.aweme.app.e.f34152b.equalsIgnoreCase(parse.getScheme())) {
                        return true;
                    }
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(parse);
                    List<ResolveInfo> queryIntentActivities = e.F().getPackageManager().queryIntentActivities(intent, 65536);
                    if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                        return false;
                    }
                    return true;
                case 2:
                case 3:
                case 4:
                    return true;
                default:
                    return false;
            }
        } catch (Exception e2) {
            com.ss.android.ad.splash.b.a.a().a(e2, "key_exception_open_url");
            return false;
        }
    }

    public static boolean c(j jVar) {
        if (jVar == null || !jVar.a() || !d(jVar.f27648d)) {
            return false;
        }
        return true;
    }

    private static String a(HashMap<String, String> hashMap) {
        if (hashMap == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : hashMap.entrySet()) {
            if (!g.a((String) next.getKey()) && !g.a((String) next.getValue())) {
                sb.append("&");
                sb.append(String.format("%s=%s", new Object[]{next.getKey(), next.getValue()}));
            }
        }
        return sb.toString();
    }

    @Nullable
    public static String a(boolean z) {
        a e2 = e.e();
        e2.f22773f = false;
        HashMap<String, String> E = e.E();
        if (e2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(5120);
        try {
            String n = r.a().n();
            sb.append("/api/ad/v1/splash/stock/");
            sb.append("?_unused=0");
            sb.append(j());
            sb.append(e2.toString());
            if (E != null) {
                sb.append(a(E));
            }
            if (z) {
                sb.append("&show_limit=1");
            } else {
                sb.append("&show_limit=0");
            }
            if (!TextUtils.isEmpty(n)) {
                sb.append(n);
            }
            if (e.Q() != -1) {
                sb.append("&is_cold_start=");
                sb.append(e.Q());
            }
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    @WorkerThread
    @NonNull
    public static List<b> a(@Nullable List<b> list, @Nullable List<b> list2) {
        if (list == null) {
            list = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            b bVar = list.get(i);
            if (bVar.e() > currentTimeMillis) {
                arrayList.add(bVar);
                new StringBuilder("预加载: 本地首刷广告 ad:").append(bVar.l());
            } else {
                new StringBuilder("预加载: 本地首刷广告过期 ad:").append(bVar.l());
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (d.a(list2)) {
            return arrayList;
        }
        for (b next : list2) {
            if (next.m == 1) {
                arrayList2.add(next);
                new StringBuilder("预加载: 拉取首刷广告 ad:").append(next.l());
            }
        }
        arrayList.removeAll(arrayList2);
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    @WorkerThread
    @NonNull
    public static com.ss.android.ad.splash.core.c.f a(@Nullable JSONArray jSONArray, @Nullable JSONArray jSONArray2, long j) {
        com.ss.android.ad.splash.core.c.f fVar = new com.ss.android.ad.splash.core.c.f();
        ArrayList<b> arrayList = new ArrayList<>();
        if (jSONArray2 != null) {
            int length = jSONArray2.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray2.optJSONObject(i);
                if (optJSONObject != null) {
                    b bVar = new b();
                    bVar.a(optJSONObject, j);
                    arrayList.add(bVar);
                }
            }
        }
        List<b> a2 = a(jSONArray, true);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (b next : a2) {
            if (!g.a(next.w())) {
                arrayList2.add(next);
            }
        }
        for (b bVar2 : arrayList) {
            if (!g.a(bVar2.w())) {
                arrayList3.add(bVar2);
            }
        }
        arrayList2.removeAll(arrayList3);
        arrayList2.addAll(arrayList3);
        Map<String, b> a3 = a((List<b>) arrayList2);
        fVar.f27633a = arrayList2;
        fVar.f27635c = a3;
        fVar.f27636d = arrayList;
        return fVar;
    }
}
