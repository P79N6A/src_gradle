package com.tencent.bugly.crashreport;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.CrashModule;
import com.tencent.bugly.b;
import com.tencent.bugly.crashreport.common.info.a;
import com.tencent.bugly.crashreport.crash.BuglyBroadcastRecevier;
import com.tencent.bugly.crashreport.crash.c;
import com.tencent.bugly.crashreport.crash.h5.H5JavaScriptInterface;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.bugly.proguard.q;
import com.tencent.bugly.proguard.w;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.z;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class CrashReport {

    /* renamed from: a  reason: collision with root package name */
    private static Context f79240a;

    public static class CrashHandleCallback extends BuglyStrategy.a {
    }

    public static class UserStrategy extends BuglyStrategy {

        /* renamed from: a  reason: collision with root package name */
        private CrashHandleCallback f79242a;

        public synchronized CrashHandleCallback getCrashHandleCallback() {
            return this.f79242a;
        }

        public UserStrategy(Context context) {
        }

        public synchronized void setCrashHandleCallback(CrashHandleCallback crashHandleCallback) {
            this.f79242a = crashHandleCallback;
        }
    }

    public interface WebViewInterface {
        void addJavascriptInterface(H5JavaScriptInterface h5JavaScriptInterface, String str);

        CharSequence getContentDescription();

        String getUrl();

        void loadUrl(String str);

        void setJavaScriptEnabled(boolean z);
    }

    public static void closeCrashReport() {
        if (b.f79235a && CrashModule.hasInitialized()) {
            c.a().d();
        }
    }

    public static void closeNativeReport() {
        if (b.f79235a && CrashModule.hasInitialized()) {
            c.a().f();
        }
    }

    public static String getAppChannel() {
        if (!b.f79235a) {
            return "unknown";
        }
        if (!CrashModule.hasInitialized()) {
            return "unknown";
        }
        return a.a(f79240a).l;
    }

    public static String getAppID() {
        if (!b.f79235a) {
            return "unknown";
        }
        if (!CrashModule.hasInitialized()) {
            return "unknown";
        }
        return a.a(f79240a).f();
    }

    public static String getAppVer() {
        if (!b.f79235a) {
            return "unknown";
        }
        if (!CrashModule.hasInitialized()) {
            return "unknown";
        }
        return a.a(f79240a).j;
    }

    public static Map<String, String> getSdkExtraData() {
        if (!b.f79235a) {
            return new HashMap();
        }
        if (!CrashModule.hasInitialized()) {
            return null;
        }
        return a.a(f79240a).A;
    }

    public static String getUserId() {
        if (!b.f79235a) {
            return "unknown";
        }
        if (!CrashModule.hasInitialized()) {
            return "unknown";
        }
        return a.a(f79240a).g();
    }

    public static boolean isLastSessionCrash() {
        if (b.f79235a && CrashModule.hasInitialized()) {
            return c.a().b();
        }
        return false;
    }

    public static void startCrashReport() {
        if (b.f79235a && CrashModule.hasInitialized()) {
            c.a().c();
        }
    }

    public static void testANRCrash() {
        if (b.f79235a && CrashModule.hasInitialized()) {
            x.a("start to create a anr crash for test!", new Object[0]);
            c.a().k();
        }
    }

    public static void testJavaCrash() {
        if (b.f79235a && CrashModule.hasInitialized()) {
            a b2 = a.b();
            if (b2 != null) {
                b2.b(24096);
            }
            throw new RuntimeException("This Crash create for Test! You can go to Bugly see more detail!");
        }
    }

    public static void testNativeCrash() {
        if (b.f79235a && CrashModule.hasInitialized()) {
            x.a("start to create a native crash for test!", new Object[0]);
            c.a().j();
        }
    }

    public static void closeBugly() {
        if (b.f79235a && CrashModule.hasInitialized() && f79240a != null) {
            BuglyBroadcastRecevier instance = BuglyBroadcastRecevier.getInstance();
            if (instance != null) {
                instance.unregister(f79240a);
            }
            closeCrashReport();
            com.tencent.bugly.crashreport.biz.b.a(f79240a);
            w a2 = w.a();
            if (a2 != null) {
                a2.b();
            }
        }
    }

    public static void enableBugly(boolean z) {
        b.f79235a = z;
    }

    public static void setContext(Context context) {
        f79240a = context;
    }

    public static void setBuglyDbName(String str) {
        if (b.f79235a) {
            q.f79504a = str;
        }
    }

    public static void setCrashFilter(String str) {
        if (b.f79235a) {
            c.m = str;
        }
    }

    public static void setCrashRegularFilter(String str) {
        if (b.f79235a) {
            c.n = str;
        }
    }

    public static void initCrashReport(Context context) {
        f79240a = context;
        b.a((com.tencent.bugly.a) CrashModule.getInstance());
        b.a(context);
    }

    public static void postCatchedException(Throwable th) {
        postCatchedException(th, Thread.currentThread(), false);
    }

    public static void setSessionIntervalMills(long j) {
        if (b.f79235a) {
            com.tencent.bugly.crashreport.biz.b.a(j);
        }
    }

    public static Set<String> getAllUserDataKeys(Context context) {
        if (!b.f79235a) {
            return new HashSet();
        }
        if (context == null) {
            return new HashSet();
        }
        return a.a(context).E();
    }

    public static String getBuglyVersion(Context context) {
        if (context == null) {
            x.d("Please call with context.", new Object[0]);
            return "unknown";
        }
        a.a(context);
        return a.c();
    }

    public static int getUserDatasSize(Context context) {
        if (b.f79235a && context != null) {
            return a.a(context).D();
        }
        return -1;
    }

    public static int getUserSceneTagId(Context context) {
        if (b.f79235a && context != null) {
            return a.a(context).H();
        }
        return -1;
    }

    public static void setUserId(String str) {
        if (b.f79235a && CrashModule.hasInitialized()) {
            setUserId(f79240a, str);
        }
    }

    public static Map<String, String> getSdkExtraData(Context context) {
        if (!b.f79235a) {
            return new HashMap();
        }
        if (context != null) {
            return a.a(context).A;
        }
        x.d("Context should not be null.", new Object[0]);
        return null;
    }

    public static void postCatchedException(Throwable th, Thread thread) {
        postCatchedException(th, thread, false);
    }

    public static boolean setJavascriptMonitor(WebView webView, boolean z) {
        return setJavascriptMonitor(webView, z, false);
    }

    public static void setAuditEnable(Context context, boolean z) {
        if (b.f79235a && context != null) {
            a.a(context).B = z;
        }
    }

    public static String getUserData(Context context, String str) {
        if (!b.f79235a) {
            return "unknown";
        }
        if (context == null) {
            return "unknown";
        }
        if (z.a(str)) {
            return null;
        }
        return a.a(context).g(str);
    }

    public static void initCrashReport(Context context, UserStrategy userStrategy) {
        f79240a = context;
        b.a((com.tencent.bugly.a) CrashModule.getInstance());
        b.a(context, userStrategy);
    }

    public static void setAppChannel(Context context, String str) {
        if (b.f79235a && context != null && str != null) {
            a.a(context).l = str;
            NativeCrashHandler instance = NativeCrashHandler.getInstance();
            if (instance != null) {
                instance.setNativeAppChannel(str);
            }
        }
    }

    public static void setAppPackage(Context context, String str) {
        if (b.f79235a && context != null && str != null) {
            a.a(context).f79276c = str;
            NativeCrashHandler instance = NativeCrashHandler.getInstance();
            if (instance != null) {
                instance.setNativeAppPackage(str);
            }
        }
    }

    public static void setAppVersion(Context context, String str) {
        if (b.f79235a && context != null && str != null) {
            a.a(context).j = str;
            NativeCrashHandler instance = NativeCrashHandler.getInstance();
            if (instance != null) {
                instance.setNativeAppVersion(str);
            }
        }
    }

    public static boolean setJavascriptMonitor(WebViewInterface webViewInterface, boolean z) {
        return setJavascriptMonitor(webViewInterface, z, false);
    }

    public static String removeUserData(Context context, String str) {
        if (!b.f79235a) {
            return "unknown";
        }
        if (context == null) {
            return "unknown";
        }
        if (z.a(str)) {
            return null;
        }
        x.b("[param] remove user data: %s", str);
        return a.a(context).f(str);
    }

    public static void setIsAppForeground(Context context, boolean z) {
        if (b.f79235a) {
            if (context == null) {
                x.d("Context should not be null.", new Object[0]);
                return;
            }
            if (z) {
                x.c("App is in foreground.", new Object[0]);
            } else {
                x.c("App is in background.", new Object[0]);
            }
            a.a(context).a(z);
        }
    }

    public static void setIsDevelopmentDevice(Context context, boolean z) {
        if (b.f79235a) {
            if (context == null) {
                x.d("Context should not be null.", new Object[0]);
                return;
            }
            if (z) {
                x.c("This is a development device.", new Object[0]);
            } else {
                x.c("This is not a development device.", new Object[0]);
            }
            a.a(context).y = z;
        }
    }

    public static void setUserSceneTag(Context context, int i) {
        if (b.f79235a && context != null) {
            if (i <= 0) {
                x.d("setTag args tagId should > 0", new Object[0]);
            }
            a.a(context).a(i);
            x.b("[param] set user scene tag: %d", Integer.valueOf(i));
        }
    }

    public static void setUserId(Context context, String str) {
        if (!b.f79235a || context == null) {
            return;
        }
        if (str == null) {
            x.d("userId should not be null", new Object[0]);
            return;
        }
        if (str.length() > 100) {
            String substring = str.substring(0, 100);
            x.d("userId %s length is over limit %d substring to %s", str, 100, substring);
            str = substring;
        }
        if (!str.equals(a.a(context).g())) {
            a.a(context).b(str);
            x.b("[user] set userId : %s", str);
            NativeCrashHandler instance = NativeCrashHandler.getInstance();
            if (instance != null) {
                instance.setNativeUserId(str);
            }
            if (CrashModule.hasInitialized()) {
                com.tencent.bugly.crashreport.biz.b.a();
            }
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(final WebView webView, boolean z, boolean z2) {
        if (webView == null) {
            return false;
        }
        return setJavascriptMonitor((WebViewInterface) new WebViewInterface() {

            /* renamed from: com.tencent.bugly.crashreport.CrashReport$1$_lancet */
            public class _lancet {
                private _lancet() {
                }

                @TargetClass
                @Proxy
                static void com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(WebView webView, String str) {
                    com.ss.android.ugc.aweme.lancet.c.a(str);
                    webView.loadUrl(str);
                }
            }

            public final CharSequence getContentDescription() {
                return webView.getContentDescription();
            }

            public final String getUrl() {
                return webView.getUrl();
            }

            public final void loadUrl(String str) {
                _lancet.com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(webView, str);
            }

            public final void setJavaScriptEnabled(boolean z) {
                WebSettings settings = webView.getSettings();
                if (!settings.getJavaScriptEnabled()) {
                    settings.setJavaScriptEnabled(true);
                }
            }

            public final void addJavascriptInterface(H5JavaScriptInterface h5JavaScriptInterface, String str) {
                webView.addJavascriptInterface(h5JavaScriptInterface, str);
            }
        }, z, z2);
    }

    public static void setSdkExtraData(Context context, String str, String str2) {
        if (b.f79235a && context != null && !z.a(str) && !z.a(str2)) {
            a.a(context).a(str, str2);
        }
    }

    public static void initCrashReport(Context context, String str, boolean z) {
        if (context != null) {
            f79240a = context;
            b.a((com.tencent.bugly.a) CrashModule.getInstance());
            b.a(context, str, z, null);
        }
    }

    public static void postCatchedException(Throwable th, Thread thread, boolean z) {
        if (!b.f79235a || !CrashModule.hasInitialized()) {
            return;
        }
        if (th == null) {
            x.d("throwable is null, just return", new Object[0]);
            return;
        }
        if (thread == null) {
            thread = Thread.currentThread();
        }
        c.a().a(thread, th, false, (String) null, (byte[]) null, z);
    }

    private static void putSdkData(Context context, String str, String str2) {
        if (context != null && !z.a(str) && !z.a(str2)) {
            String replace = str.replace("[a-zA-Z[0-9]]+", "");
            if (replace.length() > 100) {
                replace = replace.substring(0, 50);
            }
            if (str2.length() > 500) {
                str2 = str2.substring(0, 200);
            }
            a.a(context).c(replace, str2);
            x.b(String.format("[param] putSdkData data: %s - %s", new Object[]{replace, str2}), new Object[0]);
        }
    }

    public static void putUserData(Context context, String str, String str2) {
        if (!b.f79235a || context == null) {
            return;
        }
        if (str == null) {
            String.valueOf(str);
            x.d("putUserData args key should not be null or empty", new Object[0]);
        } else if (str2 == null) {
            String.valueOf(str2);
            x.d("putUserData args value should not be null", new Object[0]);
        } else if (!str.matches("[a-zA-Z[0-9]]+")) {
            x.d("putUserData args key should match [a-zA-Z[0-9]]+  {" + str + "}", new Object[0]);
        } else {
            if (str2.length() > 200) {
                x.d("user data value length over limit %d, it will be cutted!", 200);
                str2 = str2.substring(0, 200);
            }
            a a2 = a.a(context);
            if (a2.E().contains(str)) {
                NativeCrashHandler instance = NativeCrashHandler.getInstance();
                if (instance != null) {
                    instance.putKeyValueToNative(str, str2);
                }
                a.a(context).b(str, str2);
                x.c("replace KV %s %s", str, str2);
            } else if (a2.D() >= 10) {
                x.d("user data size is over limit %d, it will be cutted!", 10);
            } else {
                if (str.length() > 50) {
                    x.d("user data key length over limit %d , will drop this new key %s", 50, str);
                    str = str.substring(0, 50);
                }
                NativeCrashHandler instance2 = NativeCrashHandler.getInstance();
                if (instance2 != null) {
                    instance2.putKeyValueToNative(str, str2);
                }
                a.a(context).b(str, str2);
                x.b("[param] set user data: %s - %s", str, str2);
            }
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(WebViewInterface webViewInterface, boolean z, boolean z2) {
        if (webViewInterface == null) {
            return false;
        }
        if (!CrashModule.hasInitialized()) {
            x.e("CrashReport has not been initialed! please to call method 'initCrashReport' first!", new Object[0]);
            return false;
        }
        x.a("Set Javascript exception monitor of webview.", new Object[0]);
        if (!b.f79235a) {
            return false;
        }
        x.c("URL of webview is %s", webViewInterface.getUrl());
        if (z2 || Build.VERSION.SDK_INT >= 19) {
            x.a("Enable the javascript needed by webview monitor.", new Object[0]);
            webViewInterface.setJavaScriptEnabled(true);
            H5JavaScriptInterface instance = H5JavaScriptInterface.getInstance(webViewInterface);
            if (instance != null) {
                x.a("Add a secure javascript interface to the webview.", new Object[0]);
                webViewInterface.addJavascriptInterface(instance, "exceptionUploader");
            }
            if (z) {
                x.a("Inject bugly.js(v%s) to the webview.", com.tencent.bugly.crashreport.crash.h5.b.b());
                String a2 = com.tencent.bugly.crashreport.crash.h5.b.a();
                if (a2 == null) {
                    x.e("Failed to inject Bugly.js.", com.tencent.bugly.crashreport.crash.h5.b.b());
                    return false;
                }
                webViewInterface.loadUrl("javascript:".concat(String.valueOf(a2)));
            }
            return true;
        }
        x.e("This interface is only available for Android 4.4 or later.", new Object[0]);
        return false;
    }

    public static void initCrashReport(Context context, String str, boolean z, UserStrategy userStrategy) {
        if (context != null) {
            f79240a = context;
            b.a((com.tencent.bugly.a) CrashModule.getInstance());
            b.a(context, str, z, userStrategy);
        }
    }
}
