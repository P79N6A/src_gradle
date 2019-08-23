package com.bytedance.ttnet;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.concurrent.TTExecutors;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.frameworks.baselib.network.http.b.f;
import com.bytedance.frameworks.baselib.network.http.b.g;
import com.bytedance.frameworks.baselib.network.http.cronet.a.b;
import com.bytedance.frameworks.baselib.network.http.cronet.a.c;
import com.bytedance.frameworks.baselib.network.http.cronet.a.d;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.frameworks.baselib.network.http.util.g;
import com.bytedance.retrofit2.n;
import com.bytedance.ttnet.config.a;
import com.bytedance.ttnet.encrypt.TtTokenConfig;
import com.bytedance.ttnet.utils.e;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.File;
import java.net.CookieHandler;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UnknownFormatConversionException;
import java.util.concurrent.TimeUnit;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;

public class TTNetInit {
    private static long sCookieManagerInitStartTime = 0;
    private static long sFirstRequestWaitTime = 1500;
    private static boolean sHttpEncryptEnabled = true;
    private static c sITTNetDepend;
    private static volatile boolean sNotifiedColdStartFinsish;

    public static boolean httpEncryptEnabled() {
        return sHttpEncryptEnabled;
    }

    public static void useCustomizedCookieStoreName() {
        f.f19760a = "ttnetCookieStore";
    }

    public static c getTTNetDepend() {
        if (sITTNetDepend != null) {
            return sITTNetDepend;
        }
        throw new IllegalArgumentException("sITTNetDepend is null");
    }

    public static void notifyColdStartFinish() {
        if (sITTNetDepend != null && !sNotifiedColdStartFinsish) {
            sNotifiedColdStartFinsish = true;
        }
    }

    private static void setCookieMgrInited() {
        try {
            TTExecutors.getScheduledThreadPool().schedule(new Runnable() {
                public final void run() {
                    try {
                        System.currentTimeMillis();
                        e.b(true);
                        if (Logger.debug()) {
                            System.currentTimeMillis();
                        }
                    } catch (Throwable unused) {
                    }
                }
            }, sFirstRequestWaitTime, TimeUnit.MILLISECONDS);
        } catch (Throwable unused) {
        }
    }

    private static c getCronetHttpClient() throws Exception {
        if (!b.a()) {
            return null;
        }
        c a2 = c.a(getTTNetDepend().a());
        c.a(false, false, false, a.a(getTTNetDepend().a()).a());
        return a2;
    }

    public static d getTTNetDetectInfo() {
        if (b.a()) {
            try {
                Object obj = Reflect.on(Reflect.on("org.chromium.CronetAppProviderManager").call("inst").get()).field("mCronetAppProviderAdapter", new Class[0]).get();
                if (obj instanceof com.bytedance.ttnet.a.a) {
                    return ((com.bytedance.ttnet.a.a) obj).a();
                }
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public static boolean isWebViewProxyEnabled() {
        if (!b.a()) {
            return false;
        }
        try {
            return ((Boolean) Reflect.on(Reflect.on("com.ttnet.org.chromium.net.WebViewProxySettings").call("inst").get()).call("isWebViewProxyEnabled").get()).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void preInitCronetKernel() {
        a a2 = a.a(getTTNetDepend().a());
        a.c(true);
        if (b.a()) {
            c.a(getTTNetDepend().a());
            c.a(false, false, false, a2.a());
        }
    }

    public static Map<String, b> getGroupRttEstimates() throws Exception {
        c.a(getTTNetDepend().a());
        if (c.f19798b != null) {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : ((Map) Reflect.on((Object) c.f19798b).call("getGroupRTTEstimates").get()).entrySet()) {
                if (((int[]) entry.getValue()).length == 2) {
                    b bVar = new b();
                    bVar.f19794a = ((int[]) entry.getValue())[0];
                    bVar.f19795b = ((int[]) entry.getValue())[1];
                    bVar.f19796c = -1;
                    hashMap.put(entry.getKey(), bVar);
                } else {
                    throw new UnknownFormatConversionException("getGroupRttEstimates returns wrong format");
                }
            }
            return hashMap;
        }
        throw new UnsupportedOperationException("CronetEngine is not created.");
    }

    public static b getNetworkQuality() throws Exception {
        c.a(getTTNetDepend().a());
        if (c.f19798b != null) {
            int[] iArr = (int[]) Reflect.on((Object) c.f19798b).call("getNetworkQuality").get();
            if (iArr.length == 3) {
                b bVar = new b();
                bVar.f19794a = iArr[0];
                bVar.f19795b = iArr[1];
                bVar.f19796c = iArr[2];
                return bVar;
            }
            throw new UnknownFormatConversionException("getNetworkQuality returns wrong format");
        }
        throw new UnsupportedOperationException("CronetEngine is not created.");
    }

    public static void enableHttpEncrypt(boolean z) {
        sHttpEncryptEnabled = z;
    }

    public static void setFirstRequestWaitTime(long j) {
        sFirstRequestWaitTime = j;
    }

    public static void setTTNetDepend(c cVar) {
        sITTNetDepend = cVar;
    }

    public static void setNotAllowUseNetwork(boolean z) {
        com.bytedance.frameworks.baselib.network.http.c.a.e.f19778a = z;
        c.f19799c = z;
    }

    public static List<InetAddress> dnsLookup(String str) throws Exception {
        c.a(getTTNetDepend().a());
        if (c.f19798b != null) {
            return (List) Reflect.on((Object) c.f19798b).call("dnsLookup", new Class[]{String.class}, str).get();
        }
        throw new UnsupportedOperationException("CronetEngine is not created.");
    }

    public static void onActivityResume(Activity activity) {
        if (activity != null) {
            a.a((Context) activity).j();
            a.a((Context) activity);
            a aVar = a.f22577b;
            if (aVar != null) {
                if (g.a(activity)) {
                    aVar.a(true);
                } else {
                    aVar.h();
                }
            }
            if (sHttpEncryptEnabled) {
                TtTokenConfig a2 = TtTokenConfig.a();
                Logger.debug();
                a2.e();
            }
        }
    }

    public static void setEnableURLDispatcher(boolean z) throws Exception {
        if (getCronetHttpClient() == null) {
            return;
        }
        if (c.f19798b != null) {
            Reflect.on((Object) c.f19798b).call("setEnableURLDispatcher", new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
            return;
        }
        throw new UnsupportedOperationException("CronetEngine is not created.");
    }

    public static void setHostResolverRulesForTesting(String str) throws Exception {
        if (getCronetHttpClient() == null) {
            return;
        }
        if (c.f19798b != null) {
            Reflect.on((Object) c.f19798b).call("setHostResolverRules", new Class[]{String.class}, str);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine is not created.");
    }

    public static void setProxy(String str) throws Exception {
        c.a(getTTNetDepend().a());
        if (c.f19798b != null) {
            Reflect.on((Object) c.f19798b).call("setProxy", new Class[]{String.class}, str).get();
            return;
        }
        throw new UnsupportedOperationException("CronetEngine is not created.");
    }

    public static void trigerGetDomain(Context context) {
        c.a(context);
        try {
            if (c.f19798b != null) {
                if (c.f19797a != null) {
                    Reflect.on((Object) c.f19798b).call("triggerGetDomain", new Class[]{Context.class}, c.f19797a);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void trySetDefaultUserAgent(String str) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    char[] charArray = str.toCharArray();
                    int length = charArray.length;
                    boolean z = false;
                    for (int i = 0; i < length; i++) {
                        if (charArray[i] < ' ' || charArray[i] > '~') {
                            charArray[i] = '?';
                            z = true;
                        }
                    }
                    if (z) {
                        str = new String(charArray);
                    }
                }
            } catch (Exception unused) {
            }
        }
        e.f19855d = str;
    }

    public static void setCookieHandler(final Context context) {
        try {
            if (CookieHandler.getDefault() != null) {
                setCookieMgrInited();
            } else if (sCookieManagerInitStartTime <= 0) {
                setCookieMgrInited();
            } else {
                CookieHandler.setDefault(new com.bytedance.frameworks.baselib.network.http.b.g(context, CookieManager.getInstance(), new g.a() {
                }));
                long currentTimeMillis = System.currentTimeMillis() - sCookieManagerInitStartTime;
                if (currentTimeMillis >= sFirstRequestWaitTime) {
                    Logger.debug();
                    e.b(true);
                    return;
                }
                Logger.debug();
                e.b(false);
                final long currentTimeMillis2 = System.currentTimeMillis();
                Logger.debug();
                TTExecutors.getScheduledThreadPool().schedule(new Runnable() {
                    public final void run() {
                        if (Logger.debug()) {
                            System.currentTimeMillis();
                        }
                        System.currentTimeMillis();
                        e.b(true);
                        if (Logger.debug()) {
                            System.currentTimeMillis();
                        }
                    }
                }, sFirstRequestWaitTime - currentTimeMillis, TimeUnit.MILLISECONDS);
            }
        } catch (Throwable unused) {
        }
    }

    public static void setCustomizedInfraHost(String str, String str2) {
        if (str != null) {
            com.bytedance.ttnet.utils.a.f22658a = str;
        }
        if (str2 != null) {
            com.bytedance.ttnet.encrypt.a.f22632a = str2;
        }
    }

    public static void doCommand(Context context, String str) {
        c.a(context);
        try {
            if (c.f19798b != null) {
                if (c.f19797a != null) {
                    Reflect.on((Object) c.f19798b).call("doCommand", new Class[]{Context.class, String.class}, c.f19797a, str);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean enableWebViewProxy(Context context, boolean z) {
        if (!b.a()) {
            return false;
        }
        try {
            Object obj = Reflect.on("com.ttnet.org.chromium.net.WebViewProxySettings").call("inst").get();
            if (z) {
                return ((Boolean) Reflect.on(obj).call("setProxy", new Class[]{Context.class}, context).get()).booleanValue();
            }
            return ((Boolean) Reflect.on(obj).call("revertBackProxy", new Class[]{Context.class}, context).get()).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void tryInitCookieManager(final Context context, final boolean z) {
        try {
            sCookieManagerInitStartTime = System.currentTimeMillis();
            if (z) {
                CookieSyncManager.createInstance(context);
                CookieManager.getInstance().setAcceptCookie(true);
                setCookieHandler(context);
                Logger.debug();
                return;
            }
            setCookieMgrInited();
        } catch (Throwable th) {
            if (com.bytedance.frameworks.baselib.network.http.util.g.a(context) && Thread.currentThread() != Looper.getMainLooper().getThread()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        TTNetInit.tryInitCookieManager(context, z);
                    }
                });
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error", th.getMessage());
                } catch (JSONException unused) {
                }
                if (sITTNetDepend != null) {
                    sITTNetDepend.a("async_init_cookie_manager_fail", jSONObject);
                }
            }
        }
    }

    public static boolean tryStartTTNetDetect(String[] strArr, int i, int i2) {
        if (strArr == null || strArr.length <= 0 || i <= 0 || i > 180 || i2 < 0) {
            return false;
        }
        try {
            c.a(getTTNetDepend().a());
            if (c.f19798b != null) {
                Reflect.on((Object) c.f19798b).call("tryStartNetDetect", new Class[]{String[].class, Integer.TYPE, Integer.TYPE}, strArr, Integer.valueOf(i), Integer.valueOf(i2)).get();
                return true;
            }
            throw new UnsupportedOperationException("CronetEngine is not created.");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void tryInitTTNet(final Context context, Application application, e.b<com.bytedance.ttnet.b.b> bVar, e.k<com.bytedance.ttnet.b.b> kVar, e.f fVar, final boolean z, boolean... zArr) {
        boolean z2;
        if (context != null) {
            n.f21928a = Logger.getLogLevel();
            e.f19857f = bVar;
            com.bytedance.ttnet.b.b.b();
            boolean z3 = false;
            if (zArr == null || zArr.length <= 0) {
                z2 = false;
            } else {
                z2 = zArr[0];
            }
            com.bytedance.ttnet.c.c.a().a(context, com.bytedance.frameworks.baselib.network.http.util.g.a(context));
            String b2 = com.bytedance.frameworks.baselib.network.http.util.g.b(context);
            if (b2 != null && (b2.endsWith(":push") || b2.endsWith(":pushservice"))) {
                z3 = true;
            }
            if (z3 || (!com.bytedance.frameworks.baselib.network.http.util.g.a(context) && z2)) {
                tryInitCookieManager(context, z);
                a.a(context).j();
                a.a(context).h();
                if (sHttpEncryptEnabled) {
                    e.a((e.i) com.bytedance.ttnet.encrypt.c.c());
                }
            }
            if (com.bytedance.frameworks.baselib.network.http.util.g.a(context)) {
                new ThreadPlus("NetWork-AsyncInit") {
                    public final void run() {
                        TTNetInit.tryInitCookieManager(context, z);
                        try {
                            com.bytedance.ttnet.utils.a a2 = com.bytedance.ttnet.utils.a.a(context);
                            TTExecutors.getScheduledThreadPool().schedule(new Runnable() {
                                public final void run() {
                                    try {
                                        a aVar = a.this;
                                        if (!a.l.getAndSet(true)) {
                                            aVar.j = e.a(aVar.j, true);
                                            ArrayList arrayList = new ArrayList();
                                            ArrayList arrayList2 = new ArrayList();
                                            File file = new File(aVar.f22661d);
                                            if (file.exists() && file.isDirectory()) {
                                                File[] listFiles = file.listFiles();
                                                if (listFiles != null) {
                                                    int i = 0;
                                                    int i2 = 0;
                                                    for (File file2 : listFiles) {
                                                        if (file2.getName().contains(".dmp")) {
                                                            arrayList2.add(file2.getName());
                                                            arrayList.add(file2);
                                                            i2++;
                                                        }
                                                    }
                                                    if (i2 > aVar.f22663f) {
                                                        arrayList2.clear();
                                                        Collections.sort(arrayList, new C0237a());
                                                        Iterator it2 = arrayList.iterator();
                                                        while (it2.hasNext()) {
                                                            File file3 = (File) it2.next();
                                                            i++;
                                                            if (i <= aVar.f22663f) {
                                                                arrayList2.add(file3.getName());
                                                            } else {
                                                                a.a(file3.getAbsolutePath());
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            Iterator it3 = arrayList2.iterator();
                                            while (it3.hasNext()) {
                                                String str = (String) it3.next();
                                                try {
                                                    if (NetworkUtils.isWifi(aVar.k)) {
                                                        String str2 = aVar.f22661d + "/" + str;
                                                        if (new JSONObject(aVar.f22660c.newBuilder().connectTimeout(aVar.g, TimeUnit.SECONDS).writeTimeout(aVar.h, TimeUnit.SECONDS).readTimeout(aVar.i, TimeUnit.SECONDS).build().newCall(new Request.Builder().url(aVar.j).post(new MultipartBody.Builder().setType(MultipartBody.FORM).addFormDataPart("upfile", str, RequestBody.create(aVar.f22659b, new File(str2))).build()).build()).execute().body().string()).getString("code").contentEquals(PushConstants.PUSH_TYPE_NOTIFY)) {
                                                            a.a(str2);
                                                        }
                                                    }
                                                } catch (Throwable unused) {
                                                }
                                            }
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }, a2.f22662e, TimeUnit.MILLISECONDS);
                        } catch (Throwable unused) {
                        }
                    }
                }.start();
                e.f19856e = fVar;
                a.a(context);
                if (sHttpEncryptEnabled) {
                    e.a((e.i) com.bytedance.ttnet.encrypt.c.c());
                }
                e.g = kVar;
                if (com.bytedance.ttnet.utils.e.f22672a == null) {
                    com.bytedance.ttnet.utils.e.a((e.a) new e.a() {
                        public final void a(String str, String str2, int i, boolean z, JSONObject jSONObject) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put(PushConstants.WEB_URL, str2);
                                jSONObject2.put("value", i);
                                jSONObject2.put("ext_value", z ? 1 : 0);
                                jSONObject2.put("extraObject", jSONObject);
                                TTNetInit.getTTNetDepend().a(context, "set_cookie", str, jSONObject2);
                            } catch (Throwable unused) {
                            }
                        }
                    });
                }
                if (application != null) {
                    application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                        public final void onActivityCreated(Activity activity, Bundle bundle) {
                        }

                        public final void onActivityDestroyed(Activity activity) {
                        }

                        public final void onActivityPaused(Activity activity) {
                        }

                        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        }

                        public final void onActivityStarted(Activity activity) {
                        }

                        public final void onActivityStopped(Activity activity) {
                        }

                        public final void onActivityResumed(Activity activity) {
                            TTNetInit.onActivityResume(activity);
                        }
                    });
                }
                if (!b.a()) {
                    notifyColdStartFinish();
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("tryInitTTNet context is null");
    }
}
