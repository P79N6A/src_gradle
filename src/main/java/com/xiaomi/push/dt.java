package com.xiaomi.push;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Process;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.push.service.module.PushChannelRegion;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class dt {

    /* renamed from: a  reason: collision with root package name */
    protected static Context f81953a;

    /* renamed from: a  reason: collision with other field name */
    private static a f277a;

    /* renamed from: a  reason: collision with other field name */
    private static dt f278a;

    /* renamed from: a  reason: collision with other field name */
    protected static boolean f279a = false;

    /* renamed from: b  reason: collision with root package name */
    protected static Map<String, dp> f81954b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static String f81955c;

    /* renamed from: d  reason: collision with root package name */
    private static String f81956d;

    /* renamed from: a  reason: collision with other field name */
    private long f280a;

    /* renamed from: a  reason: collision with other field name */
    private ds f281a;

    /* renamed from: a  reason: collision with other field name */
    protected b f282a;

    /* renamed from: a  reason: collision with other field name */
    private String f283a;

    /* renamed from: a  reason: collision with other field name */
    protected Map<String, dq> f284a;

    /* renamed from: b  reason: collision with other field name */
    private final long f285b;

    /* renamed from: b  reason: collision with other field name */
    private String f286b;

    /* renamed from: c  reason: collision with other field name */
    private long f287c;

    public interface a {
        dt a(Context context, ds dsVar, b bVar, String str);
    }

    public interface b {
        String a(String str);
    }

    protected dt(Context context, ds dsVar, b bVar, String str) {
        this(context, dsVar, bVar, str, null, null);
    }

    protected dt(Context context, ds dsVar, b bVar, String str, String str2, String str3) {
        this.f284a = new HashMap();
        this.f283a = PushConstants.PUSH_TYPE_NOTIFY;
        this.f280a = 0;
        this.f285b = 15;
        this.f287c = 0;
        this.f286b = "isp_prov_city_country_ip";
        this.f282a = bVar;
        this.f281a = dsVar == null ? new du(this) : dsVar;
        this.f283a = str;
        f81955c = str2 == null ? context.getPackageName() : str2;
        f81956d = str3 == null ? f() : str3;
    }

    public static dt a() {
        dt dtVar;
        synchronized (dt.class) {
            try {
                if (f278a != null) {
                    dtVar = f278a;
                } else {
                    throw new IllegalStateException("the host manager is not initialized yet.");
                }
            } catch (Throwable th) {
                Class<dt> cls = dt.class;
                throw th;
            }
        }
        return dtVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    static String m186a() {
        StringBuilder sb;
        String subtypeName;
        if (f81953a != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) f81953a.getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        if (activeNetworkInfo.getType() == 1) {
                            WifiManager wifiManager = (WifiManager) f81953a.getSystemService("wifi");
                            if (!(wifiManager == null || wifiManager.getConnectionInfo() == null)) {
                                sb = new StringBuilder();
                                sb.append("WIFI-");
                                subtypeName = wifiManager.getConnectionInfo().getSSID();
                            }
                        } else {
                            sb = new StringBuilder();
                            sb.append(activeNetworkInfo.getTypeName());
                            sb.append("-");
                            subtypeName = activeNetworkInfo.getSubtypeName();
                        }
                        sb.append(subtypeName);
                        return sb.toString();
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return "unknown";
    }

    static String a(String str) {
        try {
            int length = str.length();
            byte[] bytes = str.getBytes("UTF-8");
            for (int i = 0; i < bytes.length; i++) {
                byte b2 = bytes[i];
                byte b3 = b2 & 240;
                if (b3 != 240) {
                    bytes[i] = (byte) ((((byte) (((b2 >> 4) + length) & 15)) ^ (b2 & 15)) | b3);
                }
            }
            return new String(bytes);
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    private ArrayList<dp> a(ArrayList<String> arrayList) {
        boolean z;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        ArrayList<String> arrayList2 = arrayList;
        d();
        synchronized (this.f284a) {
            a();
            for (String next : this.f284a.keySet()) {
                if (!arrayList2.contains(next)) {
                    arrayList2.add(next);
                }
            }
        }
        boolean isEmpty = f81954b.isEmpty();
        synchronized (f81954b) {
            z = isEmpty;
            for (Object obj : f81954b.values().toArray()) {
                dp dpVar = (dp) obj;
                if (!dpVar.b()) {
                    f81954b.remove(dpVar.f274b);
                    z = true;
                }
            }
        }
        if (!arrayList2.contains(b())) {
            arrayList2.add(b());
        }
        ArrayList<dp> arrayList3 = new ArrayList<>(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList3.add(null);
        }
        try {
            String str = at.d(f81953a) ? "wifi" : "wap";
            String a2 = a(arrayList2, str, this.f283a, z);
            if (!TextUtils.isEmpty(a2)) {
                JSONObject jSONObject3 = new JSONObject(a2);
                com.xiaomi.channel.commonutils.logger.b.b(a2);
                if ("OK".equalsIgnoreCase(jSONObject3.getString("S"))) {
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("R");
                    String string = jSONObject4.getString("province");
                    String string2 = jSONObject4.getString("city");
                    String string3 = jSONObject4.getString("isp");
                    String string4 = jSONObject4.getString("ip");
                    String string5 = jSONObject4.getString("country");
                    JSONObject jSONObject5 = jSONObject4.getJSONObject(str);
                    com.xiaomi.channel.commonutils.logger.b.c("get bucket: ip = " + string4 + " net = " + string3 + " hosts = " + jSONObject5.toString());
                    int i2 = 0;
                    while (i2 < arrayList.size()) {
                        String str2 = arrayList2.get(i2);
                        JSONArray optJSONArray = jSONObject5.optJSONArray(str2);
                        if (optJSONArray == null) {
                            com.xiaomi.channel.commonutils.logger.b.a("no bucket found for " + str2);
                            jSONObject = jSONObject5;
                        } else {
                            dp dpVar2 = new dp(str2);
                            int i3 = 0;
                            while (i3 < optJSONArray.length()) {
                                String string6 = optJSONArray.getString(i3);
                                if (!TextUtils.isEmpty(string6)) {
                                    jSONObject2 = jSONObject5;
                                    dpVar2.a(new dy(string6, optJSONArray.length() - i3));
                                } else {
                                    jSONObject2 = jSONObject5;
                                }
                                i3++;
                                jSONObject5 = jSONObject2;
                            }
                            jSONObject = jSONObject5;
                            arrayList3.set(i2, dpVar2);
                            dpVar2.g = string5;
                            dpVar2.f81947c = string;
                            dpVar2.f81949e = string3;
                            dpVar2.f81950f = string4;
                            dpVar2.f81948d = string2;
                            if (jSONObject4.has("stat-percent")) {
                                dpVar2.a(jSONObject4.getDouble("stat-percent"));
                            }
                            if (jSONObject4.has("stat-domain")) {
                                dpVar2.b(jSONObject4.getString("stat-domain"));
                            }
                            if (jSONObject4.has("ttl")) {
                                dpVar2.a(((long) jSONObject4.getInt("ttl")) * 1000);
                            }
                            a(dpVar2.a());
                        }
                        i2++;
                        jSONObject5 = jSONObject;
                    }
                    JSONObject optJSONObject = jSONObject4.optJSONObject("reserved");
                    if (optJSONObject != null) {
                        long j = jSONObject4.has("reserved-ttl") ? ((long) jSONObject4.getInt("reserved-ttl")) * 1000 : 604800000;
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next2 = keys.next();
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray(next2);
                            if (optJSONArray2 == null) {
                                com.xiaomi.channel.commonutils.logger.b.a("no bucket found for " + next2);
                            } else {
                                dp dpVar3 = new dp(next2);
                                dpVar3.a(j);
                                for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                                    String string7 = optJSONArray2.getString(i4);
                                    if (!TextUtils.isEmpty(string7)) {
                                        dpVar3.a(new dy(string7, optJSONArray2.length() - i4));
                                    }
                                }
                                synchronized (f81954b) {
                                    if (this.f281a.a(next2)) {
                                        f81954b.put(next2, dpVar3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.b.a("failed to get bucket " + e2.getMessage());
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            dp dpVar4 = arrayList3.get(i5);
            if (dpVar4 != null) {
                a(arrayList2.get(i5), dpVar4);
            }
        }
        c();
        return arrayList3;
    }

    public static void a(Context context, ds dsVar, b bVar, String str, String str2, String str3) {
        synchronized (dt.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                f81953a = applicationContext;
                if (applicationContext == null) {
                    f81953a = context;
                }
                if (f278a == null) {
                    if (f277a == null) {
                        dt dtVar = new dt(context, dsVar, bVar, str, str2, str3);
                        f278a = dtVar;
                    } else {
                        f278a = f277a.a(context, dsVar, bVar, str);
                    }
                }
            } catch (Throwable th) {
                Class<dt> cls = dt.class;
                throw th;
            }
        }
    }

    public static void a(a aVar) {
        synchronized (dt.class) {
            try {
                f277a = aVar;
                f278a = null;
            } catch (Throwable th) {
                Class<dt> cls = dt.class;
                throw th;
            }
        }
    }

    public static void a(String str, String str2) {
        dp dpVar = f81954b.get(str);
        synchronized (f81954b) {
            if (dpVar == null) {
                try {
                    dp dpVar2 = new dp(str);
                    dpVar2.a(604800000);
                    dpVar2.a(str2);
                    f81954b.put(str, dpVar2);
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                dpVar.a(str2);
            }
        }
    }

    private String f() {
        try {
            PackageInfo packageInfo = f81953a.getPackageManager().getPackageInfo(f81953a.getPackageName(), 16384);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
        } catch (Exception unused) {
        }
        return PushConstants.PUSH_TYPE_NOTIFY;
    }

    /* renamed from: a  reason: collision with other method in class */
    public dp m187a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return a(new URL(str).getHost(), true);
        }
        throw new IllegalArgumentException("the url is empty");
    }

    public dp a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the host is empty");
        } else if (!this.f281a.a(str)) {
            return null;
        } else {
            dp c2 = c(str);
            if (c2 != null && c2.b()) {
                return c2;
            }
            if (z && at.b(f81953a)) {
                dp d2 = d(str);
                if (d2 != null) {
                    return d2;
                }
            }
            return new dv(this, str, c2);
        }
    }

    /* access modifiers changed from: protected */
    public String a(ArrayList<String> arrayList, String str, String str2, boolean z) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<as> arrayList3 = new ArrayList<>();
        arrayList3.add(new aq("type", str));
        if (str.equals("wap")) {
            arrayList3.add(new aq("conpt", a(at.a(f81953a))));
        }
        if (z) {
            arrayList3.add(new aq("reserved", PushConstants.PUSH_TYPE_THROUGH_MESSAGE));
        }
        arrayList3.add(new aq("uuid", str2));
        arrayList3.add(new aq("list", az.a((Collection<?>) arrayList, ",")));
        arrayList3.add(new aq("countrycode", com.xiaomi.push.service.a.a(f81953a).b()));
        dp c2 = c(b());
        String format = String.format(Locale.US, "http://%1$s/gslb/?ver=4.0", new Object[]{b()});
        if (c2 == null) {
            arrayList2.add(format);
            synchronized (f81954b) {
                dp dpVar = f81954b.get("resolver.msg.xiaomi.net");
                if (dpVar != null) {
                    Iterator<String> it2 = dpVar.a(true).iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(String.format(Locale.US, "http://%1$s/gslb/?ver=4.0", new Object[]{it2.next()}));
                    }
                }
            }
        } else {
            arrayList2 = c2.a(format);
        }
        Iterator<String> it3 = arrayList2.iterator();
        IOException e2 = null;
        while (it3.hasNext()) {
            Uri.Builder buildUpon = Uri.parse(it3.next()).buildUpon();
            for (as asVar : arrayList3) {
                buildUpon.appendQueryParameter(asVar.a(), asVar.b());
            }
            try {
                return this.f282a == null ? at.a(f81953a, new URL(buildUpon.toString())) : this.f282a.a(buildUpon.toString());
            } catch (IOException e3) {
                e2 = e3;
            }
        }
        if (e2 == null) {
            return null;
        }
        com.xiaomi.channel.commonutils.logger.b.a("network exception: " + e2.getMessage());
        throw e2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: collision with other method in class */
    public JSONObject m188a() {
        JSONObject jSONObject;
        synchronized (this.f284a) {
            jSONObject = new JSONObject();
            jSONObject.put("ver", 2);
            JSONArray jSONArray = new JSONArray();
            for (dq a2 : this.f284a.values()) {
                jSONArray.put(a2.a());
            }
            jSONObject.put("data", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (dp a3 : f81954b.values()) {
                jSONArray2.put(a3.a());
            }
            jSONObject.put("reserved", jSONArray2);
        }
        return jSONObject;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m189a() {
        synchronized (this.f284a) {
            this.f284a.clear();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m190a(String str) {
        this.f286b = str;
    }

    public void a(String str, dp dpVar) {
        if (TextUtils.isEmpty(str) || dpVar == null) {
            throw new IllegalArgumentException("the argument is invalid " + str + ", " + dpVar);
        } else if (this.f281a.a(str)) {
            synchronized (this.f284a) {
                a();
                if (this.f284a.containsKey(str)) {
                    this.f284a.get(str).a(dpVar);
                } else {
                    dq dqVar = new dq(str);
                    dqVar.a(dpVar);
                    this.f284a.put(str, dqVar);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m191a() {
        /*
            r4 = this;
            java.util.Map<java.lang.String, com.xiaomi.push.dq> r0 = r4.f284a
            monitor-enter(r0)
            boolean r1 = f279a     // Catch:{ all -> 0x003f }
            r2 = 1
            if (r1 != 0) goto L_0x0021
            f279a = r2     // Catch:{ all -> 0x003f }
            java.util.Map<java.lang.String, com.xiaomi.push.dq> r1 = r4.f284a     // Catch:{ all -> 0x003f }
            r1.clear()     // Catch:{ all -> 0x003f }
            java.lang.String r1 = r4.d()     // Catch:{ Throwable -> 0x0023 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x0023 }
            if (r3 != 0) goto L_0x003c
            r4.b((java.lang.String) r1)     // Catch:{ Throwable -> 0x0023 }
            java.lang.String r1 = "loading the new hosts succeed"
            com.xiaomi.channel.commonutils.logger.b.b(r1)     // Catch:{ Throwable -> 0x0023 }
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            goto L_0x003e
        L_0x0023:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x003f }
            r2.<init>()     // Catch:{ all -> 0x003f }
            java.lang.String r3 = "load bucket failure: "
            r2.append(r3)     // Catch:{ all -> 0x003f }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x003f }
            r2.append(r1)     // Catch:{ all -> 0x003f }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x003f }
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r1)     // Catch:{ all -> 0x003f }
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            r2 = 0
        L_0x003e:
            return r2
        L_0x003f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.dt.m191a():boolean");
    }

    public dp b(String str) {
        return a(str, true);
    }

    /* access modifiers changed from: protected */
    public String b() {
        String a2 = com.xiaomi.push.service.a.a(f81953a).a();
        return (TextUtils.isEmpty(a2) || PushChannelRegion.China.name().equals(a2)) ? "resolver.msg.xiaomi.net" : "resolver.msg.global.xiaomi.net";
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m192b() {
        ArrayList arrayList;
        synchronized (this.f284a) {
            a();
            arrayList = new ArrayList(this.f284a.keySet());
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                dq dqVar = this.f284a.get(arrayList.get(size));
                if (!(dqVar == null || dqVar.a() == null)) {
                    arrayList.remove(size);
                }
            }
        }
        ArrayList<dp> a2 = a(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (a2.get(i) != null) {
                a((String) arrayList.get(i), a2.get(i));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: collision with other method in class */
    public void m193b(String str) {
        synchronized (this.f284a) {
            this.f284a.clear();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("ver") == 2) {
                JSONArray optJSONArray = jSONObject.optJSONArray("data");
                for (int i = 0; i < optJSONArray.length(); i++) {
                    dq a2 = new dq().a(optJSONArray.getJSONObject(i));
                    this.f284a.put(a2.a(), a2);
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("reserved");
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    dp a3 = new dp("").a(optJSONArray2.getJSONObject(i2));
                    f81954b.put(a3.f274b, a3);
                }
            } else {
                throw new JSONException("Bad version");
            }
        }
    }

    /* access modifiers changed from: protected */
    public dp c(String str) {
        dq dqVar;
        synchronized (this.f284a) {
            a();
            dqVar = this.f284a.get(str);
        }
        if (dqVar != null) {
            dp a2 = dqVar.a();
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public String c() {
        StringBuilder sb = new StringBuilder();
        synchronized (this.f284a) {
            for (Map.Entry next : this.f284a.entrySet()) {
                sb.append((String) next.getKey());
                sb.append(":\n");
                sb.append(((dq) next.getValue()).toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    /* renamed from: c  reason: collision with other method in class */
    public void m194c() {
        synchronized (this.f284a) {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(f81953a.openFileOutput(e(), 0)));
                String jSONObject = a().toString();
                if (!TextUtils.isEmpty(jSONObject)) {
                    bufferedWriter.write(jSONObject);
                }
                bufferedWriter.close();
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.b.a("persist bucket failure: " + e2.getMessage());
            }
        }
    }

    /* access modifiers changed from: protected */
    public dp d(String str) {
        if (System.currentTimeMillis() - this.f287c > this.f280a * 60 * 1000) {
            this.f287c = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            dp dpVar = a(arrayList).get(0);
            if (dpVar != null) {
                this.f280a = 0;
                return dpVar;
            } else if (this.f280a < 15) {
                this.f280a++;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public String d() {
        Throwable th;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            File file = new File(f81953a.getFilesDir(), e());
            if (file.isFile()) {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            sb.append(readLine);
                        } else {
                            String sb2 = sb.toString();
                            z.a((Closeable) bufferedReader);
                            return sb2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        com.xiaomi.channel.commonutils.logger.b.a("load host exception " + th.getMessage());
                        z.a((Closeable) bufferedReader);
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader2 = bufferedReader;
                        z.a((Closeable) bufferedReader2);
                        throw th;
                    }
                }
            } else {
                z.a((Closeable) null);
                return null;
            }
        } catch (Throwable th4) {
            th = th4;
            z.a((Closeable) bufferedReader2);
            throw th;
        }
    }

    /* renamed from: d  reason: collision with other method in class */
    public void m195d() {
        synchronized (this.f284a) {
            for (dq a2 : this.f284a.values()) {
                a2.a(true);
            }
            while (true) {
                for (boolean z = false; !z; z = true) {
                    for (String next : this.f284a.keySet()) {
                        if (this.f284a.get(next).a().isEmpty()) {
                            this.f284a.remove(next);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public String e() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) f81953a.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.pid == Process.myPid()) {
                    return next.processName;
                }
            }
        }
        return "com.xiaomi";
    }
}
