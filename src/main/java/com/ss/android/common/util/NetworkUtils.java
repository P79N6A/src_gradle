package com.ss.android.common.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.CookieManager;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.linkselector.LinkSelector;
import com.ss.android.ugc.aweme.app.api.o;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URLConnection;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.SSLException;
import org.apache.http.client.RedirectHandler;
import org.apache.http.params.HttpParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NetworkUtils {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static int isForceHttps = 0;
    private static volatile boolean mAllowKeepAlive = true;
    private static volatile long mLocalTime = -1;
    private static volatile long mServerTime = -1;
    private static c sApiInterceptor = null;
    private static a sApiLibSelector = null;
    private static b sApiProcessHook = null;
    private static Context sAppContext = null;
    private static d sCommandListener = null;
    private static final Object sCookieLock = new Object();
    private static volatile boolean sCookieMgrInited = false;
    private static volatile boolean sHasRebuildSsl = false;
    private static g sMonitorProcessHook = null;
    private static ArrayList<String> sNoHttpWhiteList = new ArrayList<>();
    private static i sOldMonitorProcessHook = null;
    private static volatile k sServerTimeFromResponse = null;
    private static String sShareCookieHost = ".snssdk.com";
    private static volatile int sUseDnsMapping = -1;
    private static String sUserAgent = null;

    public interface b {
        String a(String str, boolean z);

        void a();

        void a(List<com.ss.android.http.a.b.e> list, boolean z);
    }

    public interface c {
        String filterUrl(String str);

        List<String> getShareCookie(CookieManager cookieManager, String str);

        List<String> getShareCookieHostList(String str);

        String tryDnsMapping(String str, String[] strArr);
    }

    public interface d {
        String a();

        void a(List<String> list);
    }

    public interface a {
    }

    public enum e {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        final int nativeInt;

        private e(int i) {
            this.nativeInt = i;
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public String f28330a;
    }

    public interface g {
        void a(long j, long j2, String str, String str2, f fVar);

        void a(long j, long j2, String str, String str2, f fVar, Throwable th);

        boolean a();
    }

    public enum h {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        final int nativeInt;

        public final int getValue() {
            return this.nativeInt;
        }

        private h(int i) {
            this.nativeInt = i;
        }
    }

    public interface i {
    }

    public interface j {
        URI a();

        void b();
    }

    public interface k {
        long a();
    }

    public static String executePost(int i2, String str, List list) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str, list}, null, changeQuickRedirect, true, 16058, new Class[]{Integer.TYPE, String.class, List.class}, String.class)) {
            return g.a(i2, str, list);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str, list}, null, changeQuickRedirect, true, 16058, new Class[]{Integer.TYPE, String.class, List.class}, String.class);
    }

    public static void handleTimeStampFromResponse(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 15990, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 15990, new Class[]{String.class}, Void.TYPE);
        }
    }

    public static boolean getAllowKeepAlive() {
        return mAllowKeepAlive;
    }

    public static c getApiRequestInterceptor() {
        return sApiInterceptor;
    }

    public static Context getAppContext() {
        return sAppContext;
    }

    public static d getCommandListener() {
        return sCommandListener;
    }

    public static boolean getHasRebuildSsl() {
        return sHasRebuildSsl;
    }

    public static int getIsForceHttps() {
        return isForceHttps;
    }

    public static String getShareCookieHost() {
        return sShareCookieHost;
    }

    public static String getUserAgent() {
        return sUserAgent;
    }

    public static String executeGet(int i2, String str) throws Exception {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str2}, null, changeQuickRedirect, true, 16021, new Class[]{Integer.TYPE, String.class}, String.class)) {
            return executeGet(0, i2, str2, true, true);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str2}, null, changeQuickRedirect, true, 16021, new Class[]{Integer.TYPE, String.class}, String.class);
    }

    public static String executeGet(int i2, String str, int i3, int i4) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4)}, null, changeQuickRedirect, true, 16023, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE}, String.class)) {
            return executeGet(0, i2, str, true, true, (List<com.ss.android.http.a.a>) null, (com.ss.android.http.a.b.f) null, true);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4)}, null, changeQuickRedirect, true, 16023, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE}, String.class);
    }

    public static String executeGet(int i2, int i3, String str, boolean z, boolean z2) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 16025, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE, Boolean.TYPE}, String.class)) {
            return executeGet(i2, i3, str, z, z2, (List<com.ss.android.http.a.a>) null, (com.ss.android.http.a.b.f) null, true);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, Byte.valueOf(z), Byte.valueOf(z2)}, null, changeQuickRedirect, true, 16025, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE, Boolean.TYPE}, String.class);
    }

    public static String executeGet(int i2, String str, boolean z) throws Exception {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 16026, new Class[]{Integer.TYPE, String.class, Boolean.TYPE}, String.class)) {
            return executeGet(0, i2, str2, z, true);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str2, Byte.valueOf(z)}, null, changeQuickRedirect, true, 16026, new Class[]{Integer.TYPE, String.class, Boolean.TYPE}, String.class);
    }

    public static String executeGet(int i2, String str, boolean z, boolean z2) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 16027, new Class[]{Integer.TYPE, String.class, Boolean.TYPE, Boolean.TYPE}, String.class)) {
            return executeGet(0, i2, str, z, z2, (List<com.ss.android.http.a.a>) null, (com.ss.android.http.a.b.f) null, true);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str, Byte.valueOf(z), Byte.valueOf(z2)}, null, changeQuickRedirect, true, 16027, new Class[]{Integer.TYPE, String.class, Boolean.TYPE, Boolean.TYPE}, String.class);
    }

    public static String executeGet(int i2, String str, boolean z, boolean z2, List<com.ss.android.http.a.a> list, com.ss.android.http.a.b.f fVar, boolean z3) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), list, fVar, Byte.valueOf(z3 ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 16028, new Class[]{Integer.TYPE, String.class, Boolean.TYPE, Boolean.TYPE, List.class, com.ss.android.http.a.b.f.class, Boolean.TYPE}, String.class)) {
            return executeGet(0, i2, str, z, z2, list, fVar, z3);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str, Byte.valueOf(z), Byte.valueOf(z2), list, fVar, Byte.valueOf(z3)}, null, changeQuickRedirect, true, 16028, new Class[]{Integer.TYPE, String.class, Boolean.TYPE, Boolean.TYPE, List.class, com.ss.android.http.a.b.f.class, Boolean.TYPE}, String.class);
    }

    public static String executeGet(int i2, int i3, String str, boolean z, boolean z2, List<com.ss.android.http.a.a> list, com.ss.android.http.a.b.f fVar, boolean z3) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), list, fVar, Byte.valueOf(z3 ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 16029, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE, Boolean.TYPE, List.class, com.ss.android.http.a.b.f.class, Boolean.TYPE}, String.class)) {
            return executeGet(i2, i3, str, z, z2, list, fVar, z3, null);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, Byte.valueOf(z), Byte.valueOf(z2), list, fVar, Byte.valueOf(z3)}, null, changeQuickRedirect, true, 16029, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE, Boolean.TYPE, List.class, com.ss.android.http.a.b.f.class, Boolean.TYPE}, String.class);
    }

    public static String executeGet(int i2, String str, List<com.ss.android.http.a.b.e> list) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str, list}, null, changeQuickRedirect, true, 16031, new Class[]{Integer.TYPE, String.class, List.class}, String.class)) {
            return executeGet(0, i2, str, true, true, list);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str, list}, null, changeQuickRedirect, true, 16031, new Class[]{Integer.TYPE, String.class, List.class}, String.class);
    }

    public static String executeGet(int i2, String str, int i3, int i4, List<com.ss.android.http.a.b.e> list) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4), list}, null, changeQuickRedirect, true, 16033, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, List.class}, String.class)) {
            return executeGet(0, i2, str, true, true, null, null, true, list);
        }
        Object[] objArr = {Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4), list};
        return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, 16033, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, List.class}, String.class);
    }

    public static String executeGet(int i2, int i3, String str, boolean z, boolean z2, List<com.ss.android.http.a.b.e> list) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), list}, null, changeQuickRedirect, true, 16035, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE, Boolean.TYPE, List.class}, String.class)) {
            return executeGet(i2, i3, str, z, z2, null, null, true, list);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, Byte.valueOf(z), Byte.valueOf(z2), list}, null, changeQuickRedirect, true, 16035, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE, Boolean.TYPE, List.class}, String.class);
    }

    public static String executeGet(int i2, String str, boolean z, List<com.ss.android.http.a.b.e> list) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str, Byte.valueOf(z ? (byte) 1 : 0), list}, null, changeQuickRedirect, true, 16036, new Class[]{Integer.TYPE, String.class, Boolean.TYPE, List.class}, String.class)) {
            return executeGet(0, i2, str, z, true, list);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str, Byte.valueOf(z), list}, null, changeQuickRedirect, true, 16036, new Class[]{Integer.TYPE, String.class, Boolean.TYPE, List.class}, String.class);
    }

    public static String executeGet(int i2, String str, boolean z, boolean z2, List<com.ss.android.http.a.b.e> list) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), list}, null, changeQuickRedirect, true, 16037, new Class[]{Integer.TYPE, String.class, Boolean.TYPE, Boolean.TYPE, List.class}, String.class)) {
            return executeGet(0, i2, str, z, z2, null, null, true, list);
        }
        Object[] objArr = {Integer.valueOf(i2), str, Byte.valueOf(z), Byte.valueOf(z2), list};
        return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, 16037, new Class[]{Integer.TYPE, String.class, Boolean.TYPE, Boolean.TYPE, List.class}, String.class);
    }

    public static String executeGet(int i2, String str, boolean z, boolean z2, List<com.ss.android.http.a.a> list, com.ss.android.http.a.b.f fVar, boolean z3, List<com.ss.android.http.a.b.e> list2) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), list, fVar, Byte.valueOf(z3 ? (byte) 1 : 0), list2}, null, changeQuickRedirect, true, 16038, new Class[]{Integer.TYPE, String.class, Boolean.TYPE, Boolean.TYPE, List.class, com.ss.android.http.a.b.f.class, Boolean.TYPE, List.class}, String.class)) {
            return executeGet(0, i2, str, z, z2, list, fVar, z3, list2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str, Byte.valueOf(z), Byte.valueOf(z2), list, fVar, Byte.valueOf(z3), list2}, null, changeQuickRedirect, true, 16038, new Class[]{Integer.TYPE, String.class, Boolean.TYPE, Boolean.TYPE, List.class, com.ss.android.http.a.b.f.class, Boolean.TYPE, List.class}, String.class);
    }

    public static String executeGet(int i2, int i3, String str, boolean z, boolean z2, List<com.ss.android.http.a.a> list, com.ss.android.http.a.b.f fVar, boolean z3, List<com.ss.android.http.a.b.e> list2) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), list, fVar, Byte.valueOf(z3 ? (byte) 1 : 0), list2}, null, changeQuickRedirect, true, 16039, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE, Boolean.TYPE, List.class, com.ss.android.http.a.b.f.class, Boolean.TYPE, List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str2, Byte.valueOf(z), Byte.valueOf(z2), list, fVar, Byte.valueOf(z3), list2}, null, changeQuickRedirect, true, 16039, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE, Boolean.TYPE, List.class, com.ss.android.http.a.b.f.class, Boolean.TYPE, List.class}, String.class);
        }
        try {
            return executeGetRetry(i2, i3, addGetRetryCountParam(filterUrl(str), "no_retry"), z, list, fVar, z3, list2, z2);
        } catch (Exception e2) {
            if (TextUtils.isEmpty(str) || !str2.startsWith("https") || (!(e2 instanceof SSLException) && !(e2 instanceof GeneralSecurityException))) {
                return executeGetRetry(i2, i3, addGetRetryCountParam(filterUrl(str), "first_retry"), z, list, fVar, z3, list2, z2);
            } else if (!isHitWhiteList(str)) {
                return executeGetRetry(i2, i3, addGetRetryCountParam(str2.replace("https", "http"), "retry_http"), z, list, fVar, z3, list2, z2);
            } else {
                return executeGetRetry(i2, i3, addGetRetryCountParam(filterUrl(str), "first_retry"), z, list, fVar, z3, list2, z2);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String executePost(int r22, java.lang.String r23, java.util.List<com.ss.android.http.a.b.e> r24, com.ss.android.common.http.d[] r25) throws java.lang.Exception {
        /*
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = 4
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r22)
            r11 = 0
            r4[r11] = r5
            r12 = 1
            r4[r12] = r0
            r13 = 2
            r4[r13] = r1
            r14 = 3
            r4[r14] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = changeQuickRedirect
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class r5 = java.lang.Integer.TYPE
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class<java.util.List> r5 = java.util.List.class
            r9[r13] = r5
            java.lang.Class<com.ss.android.common.http.d[]> r5 = com.ss.android.common.http.d[].class
            r9[r14] = r5
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r5 = 0
            r7 = 1
            r8 = 16055(0x3eb7, float:2.2498E-41)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x006c
            java.lang.Object[] r15 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
            r15[r11] = r4
            r15[r12] = r0
            r15[r13] = r1
            r15[r14] = r2
            r16 = 0
            com.meituan.robust.ChangeQuickRedirect r17 = changeQuickRedirect
            r18 = 1
            r19 = 16055(0x3eb7, float:2.2498E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r13] = r1
            java.lang.Class<com.ss.android.common.http.d[]> r1 = com.ss.android.common.http.d[].class
            r0[r14] = r1
            java.lang.Class<java.lang.String> r21 = java.lang.String.class
            r20 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x006c:
            r3 = r22
            java.lang.String r0 = executePost((int) r11, (int) r3, (java.lang.String) r0, (java.util.List<com.ss.android.http.a.b.e>) r1, (com.ss.android.common.http.d[]) r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.NetworkUtils.executePost(int, java.lang.String, java.util.List, com.ss.android.common.http.d[]):java.lang.String");
    }

    public static String executePost(String str, JSONObject jSONObject, String str2, List<com.ss.android.http.a.a> list) throws Exception {
        byte[] bytes;
        JSONObject jSONObject2 = jSONObject;
        String str3 = str2;
        if (PatchProxy.isSupport(new Object[]{str, jSONObject2, str3, list}, null, changeQuickRedirect, true, 16060, new Class[]{String.class, JSONObject.class, String.class, List.class}, String.class)) {
            Object[] objArr = {str, jSONObject2, str3, list};
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, 16060, new Class[]{String.class, JSONObject.class, String.class, List.class}, String.class);
        } else if (str3 == null || !str3.startsWith("application/json")) {
            ArrayList arrayList = new ArrayList();
            jsonObjectToBasicNameValuePairs(arrayList, jSONObject2, "");
            return executePost(0, 0, str, (List<com.ss.android.http.a.b.e>) arrayList, (com.ss.android.common.http.d[]) null, list);
        } else {
            if (jSONObject2 == null) {
                bytes = null;
            } else {
                bytes = jSONObject.toString().getBytes("UTF-8");
            }
            return executePost(-1, str, bytes, e.GZIP, str2, list);
        }
    }

    public static String executePost(int i2, String str, byte[] bArr, e eVar, String str2) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str, bArr, eVar, str2}, null, changeQuickRedirect, true, 16063, new Class[]{Integer.TYPE, String.class, byte[].class, e.class, String.class}, String.class)) {
            return executePost(i2, str, bArr, eVar, str2, (List<com.ss.android.http.a.a>) null);
        }
        Object[] objArr = {Integer.valueOf(i2), str, bArr, eVar, str2};
        return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, 16063, new Class[]{Integer.TYPE, String.class, byte[].class, e.class, String.class}, String.class);
    }

    public static String executePost(int i2, String str, byte[] bArr, e eVar, String str2, List<com.ss.android.http.a.a> list) throws Exception {
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str3, bArr, eVar, str2, list}, null, changeQuickRedirect, true, 16064, new Class[]{Integer.TYPE, String.class, byte[].class, e.class, String.class, List.class}, String.class)) {
            Object[] objArr = {Integer.valueOf(i2), str3, bArr, eVar, str2, list};
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, 16064, new Class[]{Integer.TYPE, String.class, byte[].class, e.class, String.class, List.class}, String.class);
        } else if (str3 == null) {
            return null;
        } else {
            return execute("post", i2, addCommonParams(str3, true), bArr, eVar, str2, list);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String executePost(int r22, java.lang.String r23, com.ss.android.common.http.a.a r24, com.ss.android.common.http.d[] r25) throws java.lang.Exception {
        /*
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = 4
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r22)
            r11 = 0
            r4[r11] = r5
            r12 = 1
            r4[r12] = r0
            r13 = 2
            r4[r13] = r1
            r14 = 3
            r4[r14] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = changeQuickRedirect
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class r5 = java.lang.Integer.TYPE
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class<com.ss.android.common.http.a.a> r5 = com.ss.android.common.http.a.a.class
            r9[r13] = r5
            java.lang.Class<com.ss.android.common.http.d[]> r5 = com.ss.android.common.http.d[].class
            r9[r14] = r5
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r5 = 0
            r7 = 1
            r8 = 16077(0x3ecd, float:2.2529E-41)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x006c
            java.lang.Object[] r15 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
            r15[r11] = r4
            r15[r12] = r0
            r15[r13] = r1
            r15[r14] = r2
            r16 = 0
            com.meituan.robust.ChangeQuickRedirect r17 = changeQuickRedirect
            r18 = 1
            r19 = 16077(0x3ecd, float:2.2529E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<com.ss.android.common.http.a.a> r1 = com.ss.android.common.http.a.a.class
            r0[r13] = r1
            java.lang.Class<com.ss.android.common.http.d[]> r1 = com.ss.android.common.http.d[].class
            r0[r14] = r1
            java.lang.Class<java.lang.String> r21 = java.lang.String.class
            r20 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x006c:
            r3 = r22
            java.lang.String r0 = executePost((int) r11, (int) r3, (java.lang.String) r0, (com.ss.android.common.http.a.a) r1, (com.ss.android.common.http.d[]) r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.NetworkUtils.executePost(int, java.lang.String, com.ss.android.common.http.a.a, com.ss.android.common.http.d[]):java.lang.String");
    }

    public static String executePost(int i2, String str, com.ss.android.common.http.a.a aVar) throws Exception {
        String str2 = str;
        com.ss.android.common.http.a.a aVar2 = aVar;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str2, aVar2}, null, changeQuickRedirect, true, 16078, new Class[]{Integer.TYPE, String.class, com.ss.android.common.http.a.a.class}, String.class)) {
            return executePost(0, i2, str2, aVar2, (com.ss.android.common.http.d[]) null);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str2, aVar2}, null, changeQuickRedirect, true, 16078, new Class[]{Integer.TYPE, String.class, com.ss.android.common.http.a.a.class}, String.class);
    }

    public static boolean getUseDnsMapping() {
        if (sUseDnsMapping > 0) {
            return true;
        }
        return false;
    }

    public static int getServerTime$___twin___() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 15987, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 15987, new Class[0], Integer.TYPE)).intValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (mServerTime > 0) {
            currentTimeMillis = (mServerTime + System.currentTimeMillis()) - mLocalTime;
        }
        return (int) (currentTimeMillis / 1000);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:10|11|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.webkit.CookieManager tryNecessaryInit() {
        /*
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<android.webkit.CookieManager> r7 = android.webkit.CookieManager.class
            r2 = 0
            r4 = 1
            r5 = 15995(0x3e7b, float:2.2414E-41)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0026
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            r5 = 1
            r6 = 15995(0x3e7b, float:2.2414E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<android.webkit.CookieManager> r8 = android.webkit.CookieManager.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            android.webkit.CookieManager r0 = (android.webkit.CookieManager) r0
            return r0
        L_0x0026:
            java.lang.Object r0 = sCookieLock
            monitor-enter(r0)
            boolean r1 = sCookieMgrInited     // Catch:{ all -> 0x004b }
            r2 = 1
            if (r1 != 0) goto L_0x0035
            r3 = 1500(0x5dc, double:7.41E-321)
            java.lang.Thread.sleep(r3)     // Catch:{ Exception -> 0x0033 }
        L_0x0033:
            sCookieMgrInited = r2     // Catch:{ all -> 0x004b }
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            com.ss.android.common.util.NetworkUtils$b r0 = sApiProcessHook
            if (r0 == 0) goto L_0x003d
            r0.a()
        L_0x003d:
            android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()
            boolean r1 = r0.acceptCookie()
            if (r1 != 0) goto L_0x004a
            r0.setAcceptCookie(r2)
        L_0x004a:
            return r0
        L_0x004b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.NetworkUtils.tryNecessaryInit():android.webkit.CookieManager");
    }

    public static int getServerTime() {
        Object[] objArr;
        Object obj;
        ChangeQuickRedirect changeQuickRedirect2;
        boolean z;
        int i2;
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 15986, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 15986, new Class[0], Integer.TYPE)).intValue();
        }
        if (PatchProxy.isSupport(new Object[0], null, g.f28334a, true, 16090, new Class[0], Integer.TYPE)) {
            objArr = new Object[0];
            obj = null;
            changeQuickRedirect2 = g.f28334a;
            z = true;
            i2 = 16090;
        } else if (PatchProxy.isSupport(new Object[0], null, o.f33866a, true, 23128, new Class[0], Integer.TYPE)) {
            objArr = new Object[0];
            obj = null;
            changeQuickRedirect2 = o.f33866a;
            z = true;
            i2 = 23128;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (o.f33867b > 0) {
                currentTimeMillis = (o.f33867b + currentTimeMillis) - o.f33868c;
            }
            return (int) (currentTimeMillis / 1000);
        }
        return ((Integer) PatchProxy.accessDispatch(objArr, obj, changeQuickRedirect2, z, i2, new Class[0], Integer.TYPE)).intValue();
    }

    public static void setAllowKeepAlive(boolean z) {
        mAllowKeepAlive = z;
    }

    public static void setApiLibrarySelector(a aVar) {
        sApiLibSelector = aVar;
    }

    public static void setApiProcessHook(b bVar) {
        sApiProcessHook = bVar;
    }

    public static void setApiRequestInterceptor(c cVar) {
        sApiInterceptor = cVar;
    }

    public static void setAppContext(Context context) {
        sAppContext = context;
    }

    public static void setCommandListener(d dVar) {
        sCommandListener = dVar;
    }

    public static void setHasRebuildSsl(boolean z) {
        sHasRebuildSsl = z;
    }

    public static void setIsForceHttps(int i2) {
        isForceHttps = i2;
    }

    public static void setMonitorProcessHook(g gVar) {
        sMonitorProcessHook = gVar;
    }

    public static void setNoHttpWhiteList(ArrayList<String> arrayList) {
        sNoHttpWhiteList = arrayList;
    }

    public static void setServerTimeFromResponse(k kVar) {
        sServerTimeFromResponse = kVar;
    }

    public static void setShareCookieHost(String str) {
        sShareCookieHost = str;
    }

    public static void setUseDnsMapping(int i2) {
        sUseDnsMapping = i2;
    }

    public static String getNetworkAccessType(Context context) {
        if (!PatchProxy.isSupport(new Object[]{context}, null, changeQuickRedirect, true, 16005, new Class[]{Context.class}, String.class)) {
            return getNetworkAccessType(getNetworkType(context));
        }
        return (String) PatchProxy.accessDispatch(new Object[]{context}, null, changeQuickRedirect, true, 16005, new Class[]{Context.class}, String.class);
    }

    public static List<String> getShareCookieHostList(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 16003, new Class[]{String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 16003, new Class[]{String.class}, List.class);
        }
        c cVar = sApiInterceptor;
        if (cVar != null) {
            return cVar.getShareCookieHostList(str2);
        }
        return null;
    }

    public static void safeClose(Closeable closeable) {
        Closeable closeable2 = closeable;
        if (PatchProxy.isSupport(new Object[]{closeable2}, null, changeQuickRedirect, true, 16013, new Class[]{Closeable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{closeable2}, null, changeQuickRedirect, true, 16013, new Class[]{Closeable.class}, Void.TYPE);
            return;
        }
        safeClose(closeable2, null);
    }

    public static void setTimeout(URLConnection uRLConnection) {
        URLConnection uRLConnection2 = uRLConnection;
        if (PatchProxy.isSupport(new Object[]{uRLConnection2}, null, changeQuickRedirect, true, 16007, new Class[]{URLConnection.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{uRLConnection2}, null, changeQuickRedirect, true, 16007, new Class[]{URLConnection.class}, Void.TYPE);
            return;
        }
        if (uRLConnection2 != null) {
            uRLConnection2.setConnectTimeout(15000);
            uRLConnection2.setReadTimeout(15000);
        }
    }

    public static long extractMaxAge(com.ss.android.http.a.b.f fVar) {
        com.ss.android.http.a.b.f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, null, changeQuickRedirect, true, 16046, new Class[]{com.ss.android.http.a.b.f.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{fVar2}, null, changeQuickRedirect, true, 16046, new Class[]{com.ss.android.http.a.b.f.class}, Long.TYPE)).longValue();
        } else if (fVar2 == null) {
            return -1;
        } else {
            com.ss.android.http.a.a a2 = fVar2.a("Cache-Control");
            if (a2 == null) {
                return -1;
            }
            try {
                com.ss.android.http.a.b[] c2 = a2.c();
                if (c2 != null) {
                    for (com.ss.android.http.a.b bVar : c2) {
                        if ("max-age".equals(bVar.a())) {
                            String b2 = bVar.b();
                            if (b2 != null) {
                                return Long.parseLong(b2);
                            }
                            return -1;
                        }
                    }
                }
            } catch (Exception unused) {
            }
            return -1;
        }
    }

    public static String filterUrl(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 16018, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 16018, new Class[]{String.class}, String.class);
        } else if (StringUtils.isEmpty(str)) {
            return str2;
        } else {
            c cVar = sApiInterceptor;
            if (cVar != null) {
                str2 = cVar.filterUrl(str2);
            }
            return str2;
        }
    }

    public static String getEtag(com.ss.android.http.a.b.f fVar) {
        com.ss.android.http.a.b.f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, null, changeQuickRedirect, true, 16044, new Class[]{com.ss.android.http.a.b.f.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{fVar2}, null, changeQuickRedirect, true, 16044, new Class[]{com.ss.android.http.a.b.f.class}, String.class);
        } else if (fVar2 == null) {
            return null;
        } else {
            com.ss.android.http.a.a a2 = fVar2.a("ETag");
            if (a2 != null) {
                return a2.b();
            }
            return null;
        }
    }

    public static String getLastModified(com.ss.android.http.a.b.f fVar) {
        com.ss.android.http.a.b.f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, null, changeQuickRedirect, true, 16045, new Class[]{com.ss.android.http.a.b.f.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{fVar2}, null, changeQuickRedirect, true, 16045, new Class[]{com.ss.android.http.a.b.f.class}, String.class);
        } else if (fVar2 == null) {
            return null;
        } else {
            com.ss.android.http.a.a a2 = fVar2.a("Last-Modified");
            if (a2 != null) {
                return a2.b();
            }
            return null;
        }
    }

    public static String getMacAddress(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, changeQuickRedirect, true, 16001, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, changeQuickRedirect, true, 16001, new Class[]{Context.class}, String.class);
        }
        try {
            WifiInfo connectionInfo = ((WifiManager) context2.getSystemService("wifi")).getConnectionInfo();
            if (connectionInfo != null) {
                return connectionInfo.getMacAddress();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static String getNetworkAccessType(h hVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{hVar}, null, changeQuickRedirect, true, 16006, new Class[]{h.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{hVar}, null, changeQuickRedirect, true, 16006, new Class[]{h.class}, String.class);
        }
        String str2 = "";
        try {
            switch (hVar) {
                case WIFI:
                    str = "wifi";
                    break;
                case MOBILE_2G:
                    str = "2g";
                    break;
                case MOBILE_3G:
                    str = "3g";
                    break;
                case MOBILE_4G:
                    str = "4g";
                    break;
                case MOBILE:
                    str2 = "mobile";
                    break;
            }
        } catch (Exception unused) {
        }
        str = str2;
        return str;
    }

    public static String getNetworkOperatorCode(Context context) {
        String str;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, changeQuickRedirect, true, 16082, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, changeQuickRedirect, true, 16082, new Class[]{Context.class}, String.class);
        }
        try {
            str = ((TelephonyManager) context2.getSystemService("phone")).getNetworkOperator();
        } catch (Exception unused) {
            str = "unkown";
        }
        return str;
    }

    public static void handleTimeStampFromResponse$___twin___(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 15991, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 15991, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            if (sServerTimeFromResponse != null) {
                long a2 = sServerTimeFromResponse.a();
                if (a2 > 0) {
                    mServerTime = a2;
                    mLocalTime = System.currentTimeMillis();
                }
                return;
            }
            try {
                long optLong = ((JSONObject) new JSONObject(str2).get(PushConstants.EXTRA)).optLong("now", -1);
                if (optLong >= 0) {
                    mServerTime = optLong;
                    mLocalTime = System.currentTimeMillis();
                }
            } catch (Exception unused) {
            }
        }
    }

    private static boolean isHitWhiteList(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 16085, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 16085, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (isForceHttps == 1) {
            return true;
        } else {
            if (TextUtils.isEmpty(str) || CollectionUtils.isEmpty(sNoHttpWhiteList)) {
                return false;
            }
            Iterator<String> it2 = sNoHttpWhiteList.iterator();
            while (it2.hasNext()) {
                if (str2.contains(it2.next())) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean isMobile(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, changeQuickRedirect, true, 15999, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, changeQuickRedirect, true, 15999, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        h networkType = getNetworkType(context);
        if (h.MOBILE_2G == networkType || h.MOBILE_3G == networkType || h.MOBILE_4G == networkType || h.MOBILE == networkType) {
            return true;
        }
        return false;
    }

    public static boolean isNetworkAvailable(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, changeQuickRedirect, true, 16000, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, changeQuickRedirect, true, 16000, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isWifi(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, changeQuickRedirect, true, 15998, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, changeQuickRedirect, true, 15998, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    if (1 == activeNetworkInfo.getType()) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static Pair<String, String> parseContentType(String str) {
        String str2 = str;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 16043, new Class[]{String.class}, Pair.class)) {
            return (Pair) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 16043, new Class[]{String.class}, Pair.class);
        }
        String str3 = null;
        if (str2 == null) {
            return null;
        }
        com.ss.android.http.a.b[] c2 = new com.ss.android.http.a.b.a("Content-Type", str2).c();
        if (c2.length == 0) {
            return null;
        }
        com.ss.android.http.a.b bVar = c2[0];
        String a2 = bVar.a();
        com.ss.android.http.a.d[] c3 = bVar.c();
        if (c3 != null) {
            int length = c3.length;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                com.ss.android.http.a.d dVar = c3[i2];
                if ("charset".equalsIgnoreCase(dVar.a())) {
                    str3 = dVar.b();
                    break;
                }
                i2++;
            }
        }
        return new Pair<>(a2, str3);
    }

    public static void setDefaultUserAgent(String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 15996, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 15996, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (str != null) {
            try {
                char[] charArray = str.toCharArray();
                int length = charArray.length;
                boolean z = false;
                for (int i2 = 0; i2 < length; i2++) {
                    if (charArray[i2] < ' ' || charArray[i2] > '~') {
                        charArray[i2] = '?';
                        z = true;
                    }
                }
                if (z) {
                    str2 = new String(charArray);
                    sUserAgent = str2;
                }
            } catch (Exception unused) {
            }
        }
        str2 = str;
        sUserAgent = str2;
    }

    public static void setUserAgent(HttpParams httpParams) {
        HttpParams httpParams2 = httpParams;
        if (PatchProxy.isSupport(new Object[]{httpParams2}, null, changeQuickRedirect, true, 15997, new Class[]{HttpParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{httpParams2}, null, changeQuickRedirect, true, 15997, new Class[]{HttpParams.class}, Void.TYPE);
            return;
        }
        String str = sUserAgent;
        if (!StringUtils.isEmpty(str)) {
            if (httpParams2 != null) {
                httpParams2.setParameter("http.useragent", str);
            } else {
                throw new IllegalArgumentException("HTTP parameters may not be null");
            }
        }
    }

    public static boolean testIsSSBinary(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 15994, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 15994, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (str2 == null) {
            return false;
        } else {
            int indexOf = str2.indexOf("application/octet-stream");
            if (indexOf >= 0) {
                indexOf = str2.indexOf("ssmix=", indexOf + 24);
            }
            if (indexOf > 0) {
                return true;
            }
            return false;
        }
    }

    public static h getNetworkType(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, changeQuickRedirect, true, 16004, new Class[]{Context.class}, h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[]{context2}, null, changeQuickRedirect, true, 16004, new Class[]{Context.class}, h.class);
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    int type = activeNetworkInfo.getType();
                    if (1 == type) {
                        return h.WIFI;
                    }
                    if (type != 0) {
                        return h.MOBILE;
                    }
                    switch (((TelephonyManager) context2.getSystemService("phone")).getNetworkType()) {
                        case 1:
                        case 2:
                        case 4:
                        case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*7*/:
                        case 11:
                            return h.MOBILE_2G;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                        case 14:
                        case 15:
                            return h.MOBILE_3G;
                        case 13:
                            return h.MOBILE_4G;
                        default:
                            return h.MOBILE;
                    }
                }
            }
            return h.NONE;
        } catch (Throwable unused) {
            return h.MOBILE;
        }
    }

    public static String addCommonParams(String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 16015, new Class[]{String.class, Boolean.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, null, changeQuickRedirect, true, 16015, new Class[]{String.class, Boolean.TYPE}, String.class);
        }
        b bVar = sApiProcessHook;
        if (bVar != null) {
            return bVar.a(str2, z);
        }
        return str2;
    }

    private static String addGetRetryCountParam(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, changeQuickRedirect, true, 16083, new Class[]{String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3, str4}, null, changeQuickRedirect, true, 16083, new Class[]{String.class, String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return str3;
        } else {
            i iVar = new i(str3);
            iVar.a("retry_type", str4);
            return iVar.toString();
        }
    }

    private static List<com.ss.android.http.a.b.e> addPostRetryCountParam(List<com.ss.android.http.a.b.e> list, String str) {
        List<com.ss.android.http.a.b.e> list2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{list, str2}, null, changeQuickRedirect, true, 16084, new Class[]{List.class, String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list, str2}, null, changeQuickRedirect, true, 16084, new Class[]{List.class, String.class}, List.class);
        }
        if (list == null) {
            list2 = new ArrayList<>();
        } else {
            list2 = list;
        }
        list2.add(new com.ss.android.http.a.b.e("retry_type", str2));
        return list2;
    }

    public static byte[] downloadFile(int i2, String str) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str2}, null, changeQuickRedirect, true, 16008, new Class[]{Integer.TYPE, String.class}, byte[].class)) {
            return (byte[]) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str2}, null, changeQuickRedirect, true, 16008, new Class[]{Integer.TYPE, String.class}, byte[].class);
        }
        com.ss.android.common.http.b a2 = com.ss.android.common.http.a.a();
        if (a2 != null) {
            return a2.a(i2, str2);
        }
        return null;
    }

    public static List<String> getShareCookie(CookieManager cookieManager, String str) {
        CookieManager cookieManager2 = cookieManager;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{cookieManager2, str2}, null, changeQuickRedirect, true, 16002, new Class[]{CookieManager.class, String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{cookieManager2, str2}, null, changeQuickRedirect, true, 16002, new Class[]{CookieManager.class, String.class}, List.class);
        }
        c cVar = sApiInterceptor;
        if (cVar != null) {
            return cVar.getShareCookie(cookieManager2, str2);
        }
        return null;
    }

    private static String joinCommonParams(String str, List<com.ss.android.http.a.b.e> list) {
        String str2 = str;
        List<com.ss.android.http.a.b.e> list2 = list;
        if (PatchProxy.isSupport(new Object[]{str2, list2}, null, changeQuickRedirect, true, 16016, new Class[]{String.class, List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, list2}, null, changeQuickRedirect, true, 16016, new Class[]{String.class, List.class}, String.class);
        } else if (StringUtils.isEmpty(str) || list2 == null || list.isEmpty()) {
            return str2;
        } else {
            StringBuilder sb = new StringBuilder(str2);
            if (str2.indexOf(63) < 0) {
                sb.append("?");
            } else {
                sb.append("&");
            }
            sb.append(com.ss.android.http.a.a.a.b.a(list2, "UTF-8"));
            return sb.toString();
        }
    }

    private static void putCommonParams(List<com.ss.android.http.a.b.e> list, boolean z) {
        List<com.ss.android.http.a.b.e> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 16017, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z)}, null, changeQuickRedirect, true, 16017, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        b bVar = sApiProcessHook;
        if (bVar != null) {
            bVar.a(list2, z);
        }
    }

    private static void safeClose(Closeable closeable, String str) {
        if (PatchProxy.isSupport(new Object[]{closeable, str}, null, changeQuickRedirect, true, 16014, new Class[]{Closeable.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{closeable, str}, null, changeQuickRedirect, true, 16014, new Class[]{Closeable.class, String.class}, Void.TYPE);
            return;
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
                Logger.debug();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String tryDnsMapping(java.lang.String r19, java.lang.String[] r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r11] = r4
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r4 = 0
            r6 = 1
            r7 = 16019(0x3e93, float:2.2447E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0046
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = changeQuickRedirect
            r15 = 1
            r16 = 16019(0x3e93, float:2.2447E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0046:
            int r3 = sUseDnsMapping
            if (r3 > 0) goto L_0x004b
            return r0
        L_0x004b:
            if (r1 == 0) goto L_0x0099
            int r3 = r1.length
            if (r3 > 0) goto L_0x0051
            goto L_0x0099
        L_0x0051:
            if (r0 == 0) goto L_0x005c
            java.lang.String r3 = "https://"
            boolean r3 = r0.startsWith(r3)
            if (r3 == 0) goto L_0x005c
            return r0
        L_0x005c:
            android.content.Context r3 = sAppContext
            r4 = 0
            if (r3 == 0) goto L_0x006c
            android.content.Context r3 = sAppContext
            android.content.Context r3 = r3.getApplicationContext()
            com.ss.android.common.util.NetworkUtils$h r3 = getNetworkType(r3)
            goto L_0x006d
        L_0x006c:
            r3 = r4
        L_0x006d:
            if (r3 != 0) goto L_0x0070
            return r0
        L_0x0070:
            int[] r5 = com.ss.android.common.util.NetworkUtils.AnonymousClass1.f28329a
            int r3 = r3.ordinal()
            r3 = r5[r3]
            switch(r3) {
                case 1: goto L_0x007f;
                case 2: goto L_0x007d;
                case 3: goto L_0x0080;
                case 4: goto L_0x0080;
                case 5: goto L_0x007d;
                default: goto L_0x007b;
            }
        L_0x007b:
            r2 = 0
            goto L_0x0080
        L_0x007d:
            r2 = 4
            goto L_0x0080
        L_0x007f:
            r2 = 1
        L_0x0080:
            int r3 = sUseDnsMapping
            r2 = r2 & r3
            if (r2 != 0) goto L_0x0086
            return r0
        L_0x0086:
            com.ss.android.common.util.NetworkUtils$c r2 = sApiInterceptor
            if (r2 == 0) goto L_0x0098
            java.lang.String r2 = r2.tryDnsMapping(r0, r1)
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x0097
            r1[r10] = r4
            return r0
        L_0x0097:
            return r2
        L_0x0098:
            return r0
        L_0x0099:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.NetworkUtils.tryDnsMapping(java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static void addCacheValidationHeaders(List<com.ss.android.http.a.a> list, String str, String str2) {
        List<com.ss.android.http.a.a> list2 = list;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{list2, str3, str4}, null, changeQuickRedirect, true, 16042, new Class[]{List.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, str3, str4}, null, changeQuickRedirect, true, 16042, new Class[]{List.class, String.class, String.class}, Void.TYPE);
        } else if (list2 != null) {
            if (!StringUtils.isEmpty(str)) {
                list2.add(new com.ss.android.http.a.b.a("If-None-Match", str3));
            }
            if (!StringUtils.isEmpty(str2)) {
                list2.add(new com.ss.android.http.a.b.a("If-Modified-Since", str4));
            }
        }
    }

    public static String executeGet(int i2, int i3, String str) throws Exception {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str2}, null, changeQuickRedirect, true, 16020, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, String.class)) {
            return executeGet(i2, i3, str2, true, true);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str2}, null, changeQuickRedirect, true, 16020, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, String.class);
    }

    public static String executePost$___twin___(int i2, String str, List<com.ss.android.http.a.b.e> list) throws Exception {
        String str2 = str;
        List<com.ss.android.http.a.b.e> list2 = list;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str2, list2}, null, changeQuickRedirect, true, 16059, new Class[]{Integer.TYPE, String.class, List.class}, String.class)) {
            return executePost(0, i2, str2, list2, (com.ss.android.common.http.d[]) null);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str2, list2}, null, changeQuickRedirect, true, 16059, new Class[]{Integer.TYPE, String.class, List.class}, String.class);
    }

    public static void handleApiOk(String str, long j2, f fVar) {
        String str2 = str;
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j3), fVar}, null, changeQuickRedirect, true, 15989, new Class[]{String.class, Long.TYPE, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, new Long(j3), fVar}, null, changeQuickRedirect, true, 15989, new Class[]{String.class, Long.TYPE, f.class}, Void.TYPE);
            return;
        }
        g gVar = sMonitorProcessHook;
        if (gVar != null) {
            gVar.a();
        }
        StringUtils.isEmpty(str);
        LinkSelector.a().b(str2);
    }

    private static String decodeSSBinary(byte[] bArr, int i2, String str) throws IOException {
        byte[] bArr2 = bArr;
        int i3 = i2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{bArr2, Integer.valueOf(i2), str2}, null, changeQuickRedirect, true, 16081, new Class[]{byte[].class, Integer.TYPE, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{bArr2, Integer.valueOf(i2), str2}, null, changeQuickRedirect, true, 16081, new Class[]{byte[].class, Integer.TYPE, String.class}, String.class);
        } else if (bArr2 == null || i3 <= 0) {
            return null;
        } else {
            byte[] bArr3 = {-99, -114, Byte.MAX_VALUE, 90};
            for (int i4 = 0; i4 < i3; i4++) {
                bArr2[i4] = (byte) (bArr2[i4] ^ bArr3[i4 % 4]);
            }
            return new String(bArr2, 0, i3, str2);
        }
    }

    private static void jsonObjectToBasicNameValuePairs(List<com.ss.android.http.a.b.e> list, JSONObject jSONObject, String str) throws JSONException {
        String str2;
        String str3;
        List<com.ss.android.http.a.b.e> list2 = list;
        JSONObject jSONObject2 = jSONObject;
        String str4 = str;
        if (PatchProxy.isSupport(new Object[]{list2, jSONObject2, str4}, null, changeQuickRedirect, true, 16061, new Class[]{List.class, JSONObject.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, jSONObject2, str4}, null, changeQuickRedirect, true, 16061, new Class[]{List.class, JSONObject.class, String.class}, Void.TYPE);
        } else if (jSONObject2 != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (TextUtils.isEmpty(str)) {
                    str2 = next;
                } else {
                    str2 = str4 + "[" + next + "]";
                }
                Object obj = jSONObject2.get(next);
                if (obj instanceof JSONObject) {
                    jsonObjectToBasicNameValuePairs(list2, (JSONObject) obj, str2);
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        jsonObjectToBasicNameValuePairs(list2, jSONArray.getJSONObject(i2), str2);
                    }
                } else {
                    if (obj == null) {
                        str3 = "";
                    } else {
                        str3 = obj.toString();
                    }
                    list2.add(new com.ss.android.http.a.b.e(str2, str3));
                }
            }
        }
    }

    public static byte[] stream2ByteArray(int i2, InputStream inputStream, long j2) throws IOException {
        int i3 = i2;
        InputStream inputStream2 = inputStream;
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), inputStream2, new Long(j3)}, null, changeQuickRedirect, true, 16009, new Class[]{Integer.TYPE, InputStream.class, Long.TYPE}, byte[].class)) {
            return (byte[]) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), inputStream2, new Long(j3)}, null, changeQuickRedirect, true, 16009, new Class[]{Integer.TYPE, InputStream.class, Long.TYPE}, byte[].class);
        } else if (inputStream2 == null) {
            return null;
        } else {
            if (j3 > 2147483647L) {
                inputStream.close();
                return null;
            }
            if (j3 < 0) {
                j3 = 4096;
            } else if (j3 > ((long) i3)) {
                inputStream.close();
                return null;
            }
            try {
                com.ss.android.http.a.d.a aVar = new com.ss.android.http.a.d.a((int) j3);
                byte[] bArr = new byte[4096];
                int i4 = 0;
                do {
                    int read = inputStream2.read(bArr);
                    if (read != -1) {
                        if (read >= 0) {
                            int i5 = read + 0;
                            if (i5 >= 0 && i5 <= 4096) {
                                if (read != 0) {
                                    int i6 = aVar.f29145b + read;
                                    if (i6 > aVar.f29144a.length) {
                                        byte[] bArr2 = new byte[Math.max(aVar.f29144a.length << 1, i6)];
                                        System.arraycopy(aVar.f29144a, 0, bArr2, 0, aVar.f29145b);
                                        aVar.f29144a = bArr2;
                                    }
                                    System.arraycopy(bArr, 0, aVar.f29144a, aVar.f29145b, read);
                                    aVar.f29145b = i6;
                                }
                                i4 += read;
                            }
                        }
                        throw new IndexOutOfBoundsException();
                    }
                    byte[] bArr3 = new byte[aVar.f29145b];
                    if (aVar.f29145b > 0) {
                        System.arraycopy(aVar.f29144a, 0, bArr3, 0, aVar.f29145b);
                    }
                    inputStream.close();
                    return bArr3;
                } while (i4 <= i3);
                return null;
            } finally {
                inputStream.close();
            }
        }
    }

    public static String executePost(int i2, int i3, String str, com.ss.android.common.http.a.a aVar) throws Exception {
        String str2 = str;
        com.ss.android.common.http.a.a aVar2 = aVar;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str2, aVar2}, null, changeQuickRedirect, true, 16076, new Class[]{Integer.TYPE, Integer.TYPE, String.class, com.ss.android.common.http.a.a.class}, String.class)) {
            return executePost(i2, i3, str2, aVar2, (com.ss.android.common.http.d[]) null);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str2, aVar2}, null, changeQuickRedirect, true, 16076, new Class[]{Integer.TYPE, Integer.TYPE, String.class, com.ss.android.common.http.a.a.class}, String.class);
    }

    public static String postFile(int i2, String str, String str2, String str3) throws Exception {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str4, str5, str6}, null, changeQuickRedirect, true, 16067, new Class[]{Integer.TYPE, String.class, String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str4, str5, str6}, null, changeQuickRedirect, true, 16067, new Class[]{Integer.TYPE, String.class, String.class, String.class}, String.class);
        }
        com.ss.android.common.http.a.a aVar = new com.ss.android.common.http.a.a();
        aVar.a(str5, new File(str6));
        return executePost(0, i2, str4, aVar);
    }

    public static void handleApiError(String str, Throwable th, long j2, f fVar) {
        String str2 = str;
        Throwable th2 = th;
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{str2, th2, new Long(j3), fVar}, null, changeQuickRedirect, true, 15988, new Class[]{String.class, Throwable.class, Long.TYPE, f.class}, Void.TYPE)) {
            Object[] objArr = {str2, th2, new Long(j3), fVar};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, 15988, new Class[]{String.class, Throwable.class, Long.TYPE, f.class}, Void.TYPE);
        } else if (!StringUtils.isEmpty(str) && th2 != null) {
            g gVar = sMonitorProcessHook;
            if (gVar != null) {
                gVar.a();
            }
            LinkSelector a2 = LinkSelector.a();
            new Exception(th2);
            a2.c(str2);
        }
    }

    public static String executePost(int i2, int i3, String str, List<com.ss.android.http.a.b.e> list) throws Exception {
        String str2 = str;
        List<com.ss.android.http.a.b.e> list2 = list;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str2, list2}, null, changeQuickRedirect, true, 16056, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class}, String.class)) {
            return executePost(i2, i3, str2, list2, (com.ss.android.common.http.d[]) null);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str2, list2}, null, changeQuickRedirect, true, 16056, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class}, String.class);
    }

    public static String executeGet(int i2, int i3, String str, List<com.ss.android.http.a.b.e> list) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, list}, null, changeQuickRedirect, true, 16030, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class}, String.class)) {
            return executeGet(i2, i3, str, true, true, list);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, list}, null, changeQuickRedirect, true, 16030, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class}, String.class);
    }

    public static String executePut(String str, JSONObject jSONObject, String str2, List<com.ss.android.http.a.a> list) throws Exception {
        byte[] bytes;
        JSONObject jSONObject2 = jSONObject;
        String str3 = str2;
        if (PatchProxy.isSupport(new Object[]{str, jSONObject2, str3, list}, null, changeQuickRedirect, true, 16062, new Class[]{String.class, JSONObject.class, String.class, List.class}, String.class)) {
            Object[] objArr = {str, jSONObject2, str3, list};
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, 16062, new Class[]{String.class, JSONObject.class, String.class, List.class}, String.class);
        } else if (str3 == null || !str3.startsWith("application/json")) {
            ArrayList arrayList = new ArrayList();
            jsonObjectToBasicNameValuePairs(arrayList, jSONObject2, "");
            return executePut(0, 0, str, (List<com.ss.android.http.a.b.e>) arrayList, (com.ss.android.common.http.d[]) null, list);
        } else {
            if (jSONObject2 == null) {
                bytes = null;
            } else {
                bytes = jSONObject.toString().getBytes("UTF-8");
            }
            return executePut(-1, str, bytes, e.GZIP, str2, list);
        }
    }

    public static String executeGet(int i2, int i3, String str, boolean z) throws Exception {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 16024, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE}, String.class)) {
            return executeGet(i2, i3, str2, z, true);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str2, Byte.valueOf(z)}, null, changeQuickRedirect, true, 16024, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE}, String.class);
    }

    public static String executeDelete(int i2, int i3, String str, List<com.ss.android.http.a.a> list, List<com.ss.android.http.a.b.e> list2) throws Exception {
        String str2 = str;
        List<com.ss.android.http.a.a> list3 = list;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str2, list3, list2}, null, changeQuickRedirect, true, 16041, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class, List.class}, String.class)) {
            Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), str2, list3, list2};
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, 16041, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class, List.class}, String.class);
        } else if (str2 == null) {
            return null;
        } else {
            String addCommonParams = addCommonParams(str2, true);
            com.ss.android.common.http.c b2 = com.ss.android.common.http.a.b();
            if (b2 != null) {
                addCommonParams = b2.a();
            }
            com.ss.android.common.http.b a2 = com.ss.android.common.http.a.a();
            if (a2 != null) {
                return a2.a(i2, i3, addCommonParams, list3);
            }
            return null;
        }
    }

    public static String executeGet(int i2, int i3, String str, int i4, int i5) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, Integer.valueOf(i4), Integer.valueOf(i5)}, null, changeQuickRedirect, true, 16022, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE}, String.class)) {
            return executeGet(i2, i3, str, true, true, (List<com.ss.android.http.a.a>) null, (com.ss.android.http.a.b.f) null, true);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, Integer.valueOf(i4), Integer.valueOf(i5)}, null, changeQuickRedirect, true, 16022, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE}, String.class);
    }

    public static String executePost(int i2, int i3, String str, com.ss.android.common.http.a.a aVar, com.ss.android.common.http.d[] dVarArr) throws Exception {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, aVar, dVarArr}, null, changeQuickRedirect, true, 16074, new Class[]{Integer.TYPE, Integer.TYPE, String.class, com.ss.android.common.http.a.a.class, com.ss.android.common.http.d[].class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, aVar, dVarArr}, null, changeQuickRedirect, true, 16074, new Class[]{Integer.TYPE, Integer.TYPE, String.class, com.ss.android.common.http.a.a.class, com.ss.android.common.http.d[].class}, String.class);
        }
        String filterUrl = filterUrl(str);
        try {
            return executePostRetry(i2, i3, filterUrl, aVar, dVarArr, addPostRetryCountParam(null, "no_retry"), true);
        } catch (Exception e2) {
            if (TextUtils.isEmpty(filterUrl) || !filterUrl.startsWith("https") || (!(e2 instanceof SSLException) && !(e2 instanceof GeneralSecurityException))) {
                return executePostRetry(i2, i3, filterUrl(filterUrl), aVar, dVarArr, addPostRetryCountParam(null, "first_retry"), false);
            }
            return executePostRetry(i2, i3, filterUrl.replace("https", "http"), aVar, dVarArr, addPostRetryCountParam(null, "retry_http"), false);
        }
    }

    public static String executePostFile(int i2, int i3, String str, com.ss.android.common.http.a.a aVar, List<com.ss.android.http.a.b.e> list) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, aVar, list}, null, changeQuickRedirect, true, 16069, new Class[]{Integer.TYPE, Integer.TYPE, String.class, com.ss.android.common.http.a.a.class, List.class}, String.class)) {
            return executePostFile(i2, i3, str, aVar, null, list);
        }
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), str, aVar, list};
        return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, 16069, new Class[]{Integer.TYPE, Integer.TYPE, String.class, com.ss.android.common.http.a.a.class, List.class}, String.class);
    }

    public static void monitorApiSample(long j2, long j3, String str, String str2, f fVar) {
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{new Long(j4), new Long(j5), str, str2, fVar}, null, changeQuickRedirect, true, 15993, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j4), new Long(j5), str, str2, fVar}, null, changeQuickRedirect, true, 15993, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, f.class}, Void.TYPE);
            return;
        }
        g gVar = sMonitorProcessHook;
        if (!StringUtils.isEmpty(str) && j4 > 0 && gVar != null) {
            gVar.a(j2, j3, str, str2, fVar);
        }
    }

    public static String postFile(int i2, String str, String str2, String str3, List<com.ss.android.http.a.b.e> list) throws Exception {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        List<com.ss.android.http.a.b.e> list2 = list;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str4, str5, str6, list2}, null, changeQuickRedirect, true, 16068, new Class[]{Integer.TYPE, String.class, String.class, String.class, List.class}, String.class)) {
            Object[] objArr = {Integer.valueOf(i2), str4, str5, str6, list2};
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, 16068, new Class[]{Integer.TYPE, String.class, String.class, String.class, List.class}, String.class);
        }
        com.ss.android.common.http.a.a aVar = new com.ss.android.common.http.a.a();
        aVar.a(str5, new File(str6));
        return executePostFile(0, i2, str4, aVar, list2);
    }

    public static String executePostRetry(int i2, int i3, String str, List<com.ss.android.http.a.b.e> list, com.ss.android.common.http.d[] dVarArr) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, list, dVarArr}, null, changeQuickRedirect, true, 16051, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class, com.ss.android.common.http.d[].class}, String.class)) {
            return executePostRetry(i2, i3, str, list, dVarArr, null);
        }
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), str, list, dVarArr};
        return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, 16051, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class, com.ss.android.common.http.d[].class}, String.class);
    }

    public static String response2String(boolean z, boolean z2, int i2, InputStream inputStream, String str) throws IOException {
        int i3;
        String str2;
        int i4;
        GZIPInputStream gZIPInputStream = inputStream;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i2), gZIPInputStream, str}, null, changeQuickRedirect, true, 16080, new Class[]{Boolean.TYPE, Boolean.TYPE, Integer.TYPE, InputStream.class, String.class}, String.class)) {
            Object[] objArr = {Byte.valueOf(z), Byte.valueOf(z2), Integer.valueOf(i2), gZIPInputStream, str};
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, 16080, new Class[]{Boolean.TYPE, Boolean.TYPE, Integer.TYPE, InputStream.class, String.class}, String.class);
        }
        if (i2 <= 0) {
            i3 = 5242880;
        } else {
            i3 = i2;
        }
        if (i3 < 1048576) {
            i3 = 1048576;
        }
        if (gZIPInputStream == null) {
            return null;
        }
        if (str == null) {
            str2 = "UTF-8";
        } else {
            str2 = str;
        }
        if (z) {
            try {
                gZIPInputStream = new GZIPInputStream(gZIPInputStream);
            } catch (EOFException e2) {
                if (!z || i4 <= 0) {
                    throw e2;
                }
            } catch (IOException e3) {
                String message = e3.getMessage();
                if (z && i4 > 0) {
                    if (!"CRC mismatch".equals(message)) {
                        if ("Size mismatch".equals(message)) {
                        }
                    }
                }
                throw e3;
            } catch (Throwable th) {
                safeClose(gZIPInputStream);
                throw th;
            }
        }
        byte[] bArr = new byte[8192];
        i4 = 0;
        while (true) {
            if (i4 + 4096 > bArr.length) {
                byte[] bArr2 = new byte[(bArr.length * 2)];
                System.arraycopy(bArr, 0, bArr2, 0, i4);
                bArr = bArr2;
            }
            int read = gZIPInputStream.read(bArr, i4, 4096);
            if (read <= 0) {
                break;
            }
            i4 += read;
            if (i3 > 0 && i4 > i3) {
                safeClose(gZIPInputStream);
                return null;
            }
        }
        if (i4 <= 0) {
            safeClose(gZIPInputStream);
            return null;
        } else if (z2) {
            String decodeSSBinary = decodeSSBinary(bArr, i4, str2);
            safeClose(gZIPInputStream);
            return decodeSSBinary;
        } else {
            String str3 = new String(bArr, 0, i4, str2);
            safeClose(gZIPInputStream);
            return str3;
        }
    }

    public static String executePost(int i2, int i3, String str, List<com.ss.android.http.a.b.e> list, com.ss.android.common.http.d[] dVarArr) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, list, dVarArr}, null, changeQuickRedirect, true, 16047, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class, com.ss.android.common.http.d[].class}, String.class)) {
            return executePost(i2, i3, str, list, dVarArr, (List<com.ss.android.http.a.a>) null);
        }
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), str, list, dVarArr};
        return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, 16047, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class, com.ss.android.common.http.d[].class}, String.class);
    }

    public static String executeGet(int i2, int i3, String str, boolean z, List<com.ss.android.http.a.b.e> list) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, Byte.valueOf(z ? (byte) 1 : 0), list}, null, changeQuickRedirect, true, 16034, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE, List.class}, String.class)) {
            return executeGet(i2, i3, str, z, true, list);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, Byte.valueOf(z), list}, null, changeQuickRedirect, true, 16034, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE, List.class}, String.class);
    }

    public static String executePut(int i2, int i3, String str, List<com.ss.android.http.a.b.e> list, com.ss.android.common.http.d[] dVarArr, List<com.ss.android.http.a.a> list2) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, list, dVarArr, list2}, null, changeQuickRedirect, true, 16049, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class, com.ss.android.common.http.d[].class, List.class}, String.class)) {
            return execute("put", i2, i3, str, list, dVarArr, list2);
        }
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), str, list, dVarArr, list2};
        return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, 16049, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class, com.ss.android.common.http.d[].class, List.class}, String.class);
    }

    public static String executePutRetry(int i2, int i3, String str, List<com.ss.android.http.a.b.e> list, com.ss.android.common.http.d[] dVarArr, List<com.ss.android.http.a.a> list2) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, list, dVarArr, list2}, null, changeQuickRedirect, true, 16053, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class, com.ss.android.common.http.d[].class, List.class}, String.class)) {
            return executetRetry("put", i2, i3, str, list, dVarArr, list2);
        }
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), str, list, dVarArr, list2};
        return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, 16053, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class, com.ss.android.common.http.d[].class, List.class}, String.class);
    }

    public static void monitorApiError(long j2, long j3, String str, String str2, f fVar, Throwable th) {
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{new Long(j4), new Long(j5), str, str2, fVar, th}, null, changeQuickRedirect, true, 15992, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, f.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j4), new Long(j5), str, str2, fVar, th}, null, changeQuickRedirect, true, 15992, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, f.class, Throwable.class}, Void.TYPE);
        } else if (!StringUtils.isEmpty(str) && th != null) {
            g gVar = sMonitorProcessHook;
            if (gVar != null) {
                gVar.a(j2, j3, str, str2, fVar, th);
            }
        }
    }

    public static String executeGet(int i2, int i3, String str, int i4, int i5, List<com.ss.android.http.a.b.e> list) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, Integer.valueOf(i4), Integer.valueOf(i5), list}, null, changeQuickRedirect, true, 16032, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, List.class}, String.class)) {
            return executeGet(i2, i3, str, true, true, null, null, true, list);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, Integer.valueOf(i4), Integer.valueOf(i5), list}, null, changeQuickRedirect, true, 16032, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, List.class}, String.class);
    }

    public static String executePostFile(int i2, int i3, String str, com.ss.android.common.http.a.a aVar, com.ss.android.common.http.d[] dVarArr, List<com.ss.android.http.a.b.e> list) throws Exception {
        List<com.ss.android.http.a.b.e> list2 = list;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, aVar, dVarArr, list2}, null, changeQuickRedirect, true, 16070, new Class[]{Integer.TYPE, Integer.TYPE, String.class, com.ss.android.common.http.a.a.class, com.ss.android.common.http.d[].class, List.class}, String.class)) {
            Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), str, aVar, dVarArr, list2};
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, 16070, new Class[]{Integer.TYPE, Integer.TYPE, String.class, com.ss.android.common.http.a.a.class, com.ss.android.common.http.d[].class, List.class}, String.class);
        }
        String filterUrl = filterUrl(str);
        try {
            return executePostFileRetry(i2, i3, filterUrl, aVar, dVarArr, addPostRetryCountParam(list2, "no_retry"), true);
        } catch (Exception e2) {
            if (TextUtils.isEmpty(filterUrl) || !filterUrl.startsWith("https") || (!(e2 instanceof SSLException) && !(e2 instanceof GeneralSecurityException))) {
                return executePostFileRetry(i2, i3, filterUrl(filterUrl), aVar, dVarArr, addPostRetryCountParam(list2, "first_retry"), false);
            }
            return executePostFileRetry(i2, i3, filterUrl.replace("https", "http"), aVar, dVarArr, addPostRetryCountParam(list2, "retry_http"), false);
        }
    }

    public static String executePut(int i2, String str, byte[] bArr, e eVar, String str2, List<com.ss.android.http.a.a> list) throws Exception {
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str3, bArr, eVar, str2, list}, null, changeQuickRedirect, true, 16065, new Class[]{Integer.TYPE, String.class, byte[].class, e.class, String.class, List.class}, String.class)) {
            Object[] objArr = {Integer.valueOf(i2), str3, bArr, eVar, str2, list};
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, 16065, new Class[]{Integer.TYPE, String.class, byte[].class, e.class, String.class, List.class}, String.class);
        } else if (str3 == null) {
            return null;
        } else {
            return execute("put", i2, addCommonParams(str3, true), bArr, eVar, str2, list);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String postFile(int r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.util.Map<java.lang.String, java.lang.String> r30, com.ss.android.common.http.d[] r31) throws java.lang.Exception {
        /*
            r0 = r27
            r1 = r28
            r2 = r29
            r4 = r31
            r5 = 6
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r26)
            r13 = 0
            r6[r13] = r7
            r14 = 1
            r6[r14] = r0
            r15 = 2
            r6[r15] = r1
            r16 = 3
            r6[r16] = r2
            r17 = 4
            r6[r17] = r30
            r18 = 5
            r6[r18] = r4
            com.meituan.robust.ChangeQuickRedirect r8 = changeQuickRedirect
            java.lang.Class[] r11 = new java.lang.Class[r5]
            java.lang.Class r7 = java.lang.Integer.TYPE
            r11[r13] = r7
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r11[r14] = r7
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r11[r15] = r7
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r11[r16] = r7
            java.lang.Class<java.util.Map> r7 = java.util.Map.class
            r11[r17] = r7
            java.lang.Class<com.ss.android.common.http.d[]> r7 = com.ss.android.common.http.d[].class
            r11[r18] = r7
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            r7 = 0
            r9 = 1
            r10 = 16072(0x3ec8, float:2.2522E-41)
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11, r12)
            if (r6 == 0) goto L_0x008d
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r26)
            r6[r13] = r7
            r6[r14] = r0
            r6[r15] = r1
            r6[r16] = r2
            r6[r17] = r30
            r6[r18] = r4
            r20 = 0
            com.meituan.robust.ChangeQuickRedirect r21 = changeQuickRedirect
            r22 = 1
            r23 = 16072(0x3ec8, float:2.2522E-41)
            java.lang.Class[] r0 = new java.lang.Class[r5]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r13] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r14] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r15] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r16] = r1
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            r0[r17] = r1
            java.lang.Class<com.ss.android.common.http.d[]> r1 = com.ss.android.common.http.d[].class
            r0[r18] = r1
            java.lang.Class<java.lang.String> r25 = java.lang.String.class
            r19 = r6
            r24 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r19, r20, r21, r22, r23, r24, r25)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x008d:
            com.ss.android.common.http.a.a r5 = new com.ss.android.common.http.a.a
            r5.<init>()
            java.io.File r6 = new java.io.File
            r6.<init>(r2)
            r5.a((java.lang.String) r1, (java.io.File) r6)
            if (r30 == 0) goto L_0x00c0
            java.util.Set r1 = r30.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x00a4:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00c0
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r5.a((java.lang.String) r3, (java.lang.String) r2)
            goto L_0x00a4
        L_0x00c0:
            r1 = r26
            java.lang.String r0 = executePost((int) r13, (int) r1, (java.lang.String) r0, (com.ss.android.common.http.a.a) r5, (com.ss.android.common.http.d[]) r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.NetworkUtils.postFile(int, java.lang.String, java.lang.String, java.lang.String, java.util.Map, com.ss.android.common.http.d[]):java.lang.String");
    }

    public static String executePostRetry(int i2, int i3, String str, List<com.ss.android.http.a.b.e> list, com.ss.android.common.http.d[] dVarArr, List<com.ss.android.http.a.a> list2) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, list, dVarArr, list2}, null, changeQuickRedirect, true, 16052, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class, com.ss.android.common.http.d[].class, List.class}, String.class)) {
            return executetRetry("post", i2, i3, str, list, dVarArr, list2);
        }
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), str, list, dVarArr, list2};
        return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, 16052, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class, com.ss.android.common.http.d[].class, List.class}, String.class);
    }

    public static String executePost(int i2, int i3, String str, List<com.ss.android.http.a.b.e> list, com.ss.android.common.http.d[] dVarArr, List<com.ss.android.http.a.a> list2) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, list, dVarArr, list2}, null, changeQuickRedirect, true, 16048, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class, com.ss.android.common.http.d[].class, List.class}, String.class)) {
            return execute("post", i2, i3, str, list, dVarArr, list2);
        }
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), str, list, dVarArr, list2};
        return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, 16048, new Class[]{Integer.TYPE, Integer.TYPE, String.class, List.class, com.ss.android.common.http.d[].class, List.class}, String.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x010d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String executePost(int r25, int r26, java.lang.String r27, byte[] r28, com.ss.android.common.util.NetworkUtils.e r29, java.lang.String r30) throws java.lang.Exception {
        /*
            r2 = r29
            r3 = 6
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r25)
            r5 = 0
            r7[r5] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r26)
            r14 = 1
            r7[r14] = r4
            r4 = 2
            r7[r4] = r27
            r15 = 3
            r7[r15] = r28
            r16 = 4
            r7[r16] = r2
            r17 = 5
            r7[r17] = r30
            com.meituan.robust.ChangeQuickRedirect r9 = changeQuickRedirect
            java.lang.Class[] r12 = new java.lang.Class[r3]
            java.lang.Class r8 = java.lang.Integer.TYPE
            r12[r5] = r8
            java.lang.Class r8 = java.lang.Integer.TYPE
            r12[r14] = r8
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r12[r4] = r8
            java.lang.Class<byte[]> r8 = byte[].class
            r12[r15] = r8
            java.lang.Class<com.ss.android.common.util.NetworkUtils$e> r8 = com.ss.android.common.util.NetworkUtils.e.class
            r12[r16] = r8
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r12[r17] = r8
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            r8 = 0
            r10 = 1
            r11 = 16079(0x3ecf, float:2.2531E-41)
            boolean r7 = com.meituan.robust.PatchProxy.isSupport(r7, r8, r9, r10, r11, r12, r13)
            if (r7 == 0) goto L_0x008e
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r25)
            r7[r5] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r26)
            r7[r14] = r8
            r7[r4] = r27
            r7[r15] = r28
            r7[r16] = r2
            r7[r17] = r30
            r19 = 0
            com.meituan.robust.ChangeQuickRedirect r20 = changeQuickRedirect
            r21 = 1
            r22 = 16079(0x3ecf, float:2.2531E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r5] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r14] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r4] = r1
            java.lang.Class<byte[]> r1 = byte[].class
            r0[r15] = r1
            java.lang.Class<com.ss.android.common.util.NetworkUtils$e> r1 = com.ss.android.common.util.NetworkUtils.e.class
            r0[r16] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r17] = r1
            java.lang.Class<java.lang.String> r24 = java.lang.String.class
            r18 = r7
            r23 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x008e:
            java.lang.String r3 = filterUrl(r27)
            r0 = 0
            if (r3 != 0) goto L_0x0096
            return r0
        L_0x0096:
            if (r28 != 0) goto L_0x009b
            byte[] r1 = new byte[r5]
            goto L_0x009d
        L_0x009b:
            r1 = r28
        L_0x009d:
            int r4 = r1.length
            com.ss.android.common.util.NetworkUtils$e r7 = com.ss.android.common.util.NetworkUtils.e.GZIP
            r8 = 8192(0x2000, float:1.14794E-41)
            if (r7 != r2) goto L_0x00c7
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>(r8)
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream
            r4.<init>(r2)
            r4.write(r1)     // Catch:{ Throwable -> 0x00c3, all -> 0x00bd }
            r4.close()
            byte[] r1 = r2.toByteArray()
            java.lang.String r2 = "gzip"
        L_0x00ba:
            r4 = r1
            r5 = r2
            goto L_0x00fb
        L_0x00bd:
            r0 = move-exception
            r1 = r0
            r4.close()
            throw r1
        L_0x00c3:
            r4.close()
            return r0
        L_0x00c7:
            com.ss.android.common.util.NetworkUtils$e r7 = com.ss.android.common.util.NetworkUtils.e.DEFLATER
            if (r7 != r2) goto L_0x00f9
            r2 = 128(0x80, float:1.794E-43)
            if (r4 <= r2) goto L_0x00f9
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>(r8)
            java.util.zip.Deflater r4 = new java.util.zip.Deflater
            r4.<init>()
            r4.setInput(r1)
            r4.finish()
            byte[] r1 = new byte[r8]
        L_0x00e1:
            boolean r7 = r4.finished()
            if (r7 != 0) goto L_0x00ef
            int r7 = r4.deflate(r1)
            r2.write(r1, r5, r7)
            goto L_0x00e1
        L_0x00ef:
            r4.end()
            byte[] r1 = r2.toByteArray()
            java.lang.String r2 = "deflate"
            goto L_0x00ba
        L_0x00f9:
            r5 = r0
            r4 = r1
        L_0x00fb:
            com.ss.android.common.http.b r1 = com.ss.android.common.http.a.a()
            if (r1 == 0) goto L_0x010d
            r0 = r1
            r1 = r25
            r2 = r26
            r6 = r30
            java.lang.String r0 = r0.a((int) r1, (int) r2, (java.lang.String) r3, (byte[]) r4, (java.lang.String) r5, (java.lang.String) r6)
            return r0
        L_0x010d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.NetworkUtils.executePost(int, int, java.lang.String, byte[], com.ss.android.common.util.NetworkUtils$e, java.lang.String):java.lang.String");
    }

    public static String executePostFileRetry(int i2, int i3, String str, com.ss.android.common.http.a.a aVar, com.ss.android.common.http.d[] dVarArr, List<com.ss.android.http.a.b.e> list, boolean z) throws Exception {
        List<com.ss.android.http.a.b.e> list2 = list;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, aVar, dVarArr, list2, Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 16071, new Class[]{Integer.TYPE, Integer.TYPE, String.class, com.ss.android.common.http.a.a.class, com.ss.android.common.http.d[].class, List.class, Boolean.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, aVar, dVarArr, list2, Byte.valueOf(z)}, null, changeQuickRedirect, true, 16071, new Class[]{Integer.TYPE, Integer.TYPE, String.class, com.ss.android.common.http.a.a.class, com.ss.android.common.http.d[].class, List.class, Boolean.TYPE}, String.class);
        }
        String filterUrl = filterUrl(str);
        if (filterUrl == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        putCommonParams(arrayList, true);
        String joinCommonParams = joinCommonParams(filterUrl, arrayList);
        list2.addAll(arrayList);
        com.ss.android.common.http.b a2 = com.ss.android.common.http.a.a();
        if (a2 != null) {
            return a2.a(i2, i3, joinCommonParams, list, aVar, dVarArr);
        }
        return null;
    }

    public static String executePostRetry(int i2, int i3, String str, com.ss.android.common.http.a.a aVar, com.ss.android.common.http.d[] dVarArr, List<com.ss.android.http.a.b.e> list, boolean z) throws Exception {
        List<com.ss.android.http.a.b.e> list2 = list;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, aVar, dVarArr, list2, Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 16075, new Class[]{Integer.TYPE, Integer.TYPE, String.class, com.ss.android.common.http.a.a.class, com.ss.android.common.http.d[].class, List.class, Boolean.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, aVar, dVarArr, list2, Byte.valueOf(z)}, null, changeQuickRedirect, true, 16075, new Class[]{Integer.TYPE, Integer.TYPE, String.class, com.ss.android.common.http.a.a.class, com.ss.android.common.http.d[].class, List.class, Boolean.TYPE}, String.class);
        }
        String filterUrl = filterUrl(str);
        if (filterUrl == null) {
            return null;
        }
        putCommonParams(list2, true);
        String joinCommonParams = joinCommonParams(filterUrl, list2);
        com.ss.android.common.http.b a2 = com.ss.android.common.http.a.a();
        if (a2 != null) {
            return a2.a(i2, i3, joinCommonParams, list, aVar, dVarArr);
        }
        return null;
    }

    public static String uploadFile(int i2, String str, String str2, String str3, d dVar, long j2, com.ss.android.common.http.d[] dVarArr) throws Exception {
        String str4 = str2;
        String str5 = str3;
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str, str4, str5, dVar, new Long(j3), dVarArr}, null, changeQuickRedirect, true, 16057, new Class[]{Integer.TYPE, String.class, String.class, String.class, d.class, Long.TYPE, com.ss.android.common.http.d[].class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str, str4, str5, dVar, new Long(j3), dVarArr}, null, changeQuickRedirect, true, 16057, new Class[]{Integer.TYPE, String.class, String.class, String.class, d.class, Long.TYPE, com.ss.android.common.http.d[].class}, String.class);
        }
        String filterUrl = filterUrl(str);
        if (filterUrl == null || StringUtils.isEmpty(str3)) {
            return null;
        }
        File file = new File(str5);
        com.ss.android.common.http.a.a aVar = new com.ss.android.common.http.a.a();
        aVar.a(str4, file);
        ArrayList arrayList = new ArrayList();
        putCommonParams(arrayList, true);
        String joinCommonParams = joinCommonParams(filterUrl, arrayList);
        com.ss.android.common.http.b a2 = com.ss.android.common.http.a.a();
        if (a2 != null) {
            return a2.a(i2, joinCommonParams, aVar, dVar, j2, dVarArr);
        }
        return null;
    }

    private static String execute(String str, int i2, int i3, String str2, List<com.ss.android.http.a.b.e> list, com.ss.android.common.http.d[] dVarArr, List<com.ss.android.http.a.a> list2) throws Exception {
        List<com.ss.android.http.a.b.e> list3 = list;
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3), str2, list3, dVarArr, list2}, null, changeQuickRedirect, true, 16050, new Class[]{String.class, Integer.TYPE, Integer.TYPE, String.class, List.class, com.ss.android.common.http.d[].class, List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3), str2, list3, dVarArr, list2}, null, changeQuickRedirect, true, 16050, new Class[]{String.class, Integer.TYPE, Integer.TYPE, String.class, List.class, com.ss.android.common.http.d[].class, List.class}, String.class);
        }
        String filterUrl = filterUrl(str2);
        try {
            return executetRetry(str, i2, i3, filterUrl, addPostRetryCountParam(list3, "no_retry"), dVarArr, list2);
        } catch (Exception unused) {
            if (TextUtils.isEmpty(filterUrl) || !filterUrl.startsWith("https")) {
                return executetRetry(str, i2, i3, filterUrl(filterUrl), addPostRetryCountParam(list3, "first_retry"), dVarArr, list2);
            } else if (!isHitWhiteList(filterUrl)) {
                return executetRetry(str, i2, i3, filterUrl.replace("https", "http"), addPostRetryCountParam(list3, "retry_http"), dVarArr, list2);
            } else {
                return executetRetry(str, i2, i3, filterUrl(filterUrl), addPostRetryCountParam(list3, "first_retry"), dVarArr, list2);
            }
        }
    }

    private static String executetRetry(String str, int i2, int i3, String str2, List<com.ss.android.http.a.b.e> list, com.ss.android.common.http.d[] dVarArr, List<com.ss.android.http.a.a> list2) throws Exception {
        String str3 = str;
        String str4 = str2;
        List<com.ss.android.http.a.b.e> list3 = list;
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i2), Integer.valueOf(i3), str4, list3, dVarArr, list2}, null, changeQuickRedirect, true, 16054, new Class[]{String.class, Integer.TYPE, Integer.TYPE, String.class, List.class, com.ss.android.common.http.d[].class, List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i2), Integer.valueOf(i3), str4, list3, dVarArr, list2}, null, changeQuickRedirect, true, 16054, new Class[]{String.class, Integer.TYPE, Integer.TYPE, String.class, List.class, com.ss.android.common.http.d[].class, List.class}, String.class);
        } else if (str4 == null || TextUtils.isEmpty(str)) {
            return null;
        } else {
            if ("get".equals(str3)) {
                throw new RuntimeException("executetRetry不支持get");
            } else if (!"delete".equals(str3)) {
                ArrayList arrayList = new ArrayList();
                putCommonParams(arrayList, true);
                String joinCommonParams = joinCommonParams(str4, arrayList);
                list3.addAll(arrayList);
                try {
                    if (Logger.debug()) {
                        Arrays.toString(list.toArray());
                    }
                } catch (Exception unused) {
                }
                com.ss.android.common.http.c b2 = com.ss.android.common.http.a.b();
                if (b2 != null) {
                    joinCommonParams = b2.a();
                }
                String str5 = joinCommonParams;
                com.ss.android.common.http.b a2 = com.ss.android.common.http.a.a();
                if (a2 == null) {
                    return null;
                }
                if ("put".equals(str3)) {
                    return a2.b(i2, i3, str5, list, true, dVarArr, list2);
                }
                return a2.a(i2, i3, str5, list, true, dVarArr, list2);
            } else {
                throw new RuntimeException("executetRetry不支持delete");
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String postData(int r24, java.lang.String r25, java.lang.String r26, byte[] r27, java.lang.String r28, java.util.Map<java.lang.String, java.lang.String> r29, com.ss.android.common.http.d[] r30) throws java.lang.Exception {
        /*
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            r5 = r30
            r6 = 7
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r24)
            r14 = 0
            r7[r14] = r8
            r15 = 1
            r7[r15] = r0
            r16 = 2
            r7[r16] = r1
            r13 = 3
            r7[r13] = r2
            r17 = 4
            r7[r17] = r3
            r18 = 5
            r7[r18] = r29
            r19 = 6
            r7[r19] = r5
            com.meituan.robust.ChangeQuickRedirect r9 = changeQuickRedirect
            java.lang.Class[] r12 = new java.lang.Class[r6]
            java.lang.Class r8 = java.lang.Integer.TYPE
            r12[r14] = r8
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r12[r15] = r8
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r12[r16] = r8
            java.lang.Class<byte[]> r8 = byte[].class
            r12[r13] = r8
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r12[r17] = r8
            java.lang.Class<java.util.Map> r8 = java.util.Map.class
            r12[r18] = r8
            java.lang.Class<com.ss.android.common.http.d[]> r8 = com.ss.android.common.http.d[].class
            r12[r19] = r8
            java.lang.Class<java.lang.String> r20 = java.lang.String.class
            r8 = 0
            r10 = 1
            r11 = 16073(0x3ec9, float:2.2523E-41)
            r13 = r20
            boolean r7 = com.meituan.robust.PatchProxy.isSupport(r7, r8, r9, r10, r11, r12, r13)
            if (r7 == 0) goto L_0x00a8
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r24)
            r7[r14] = r8
            r7[r15] = r0
            r7[r16] = r1
            r8 = 3
            r7[r8] = r2
            r7[r17] = r3
            r7[r18] = r29
            r7[r19] = r5
            r0 = 0
            com.meituan.robust.ChangeQuickRedirect r1 = changeQuickRedirect
            r2 = 1
            r3 = 16073(0x3ec9, float:2.2523E-41)
            java.lang.Class[] r4 = new java.lang.Class[r6]
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r14] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r15] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r16] = r5
            java.lang.Class<byte[]> r5 = byte[].class
            r4[r8] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r17] = r5
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            r4[r18] = r5
            java.lang.Class<com.ss.android.common.http.d[]> r5 = com.ss.android.common.http.d[].class
            r4[r19] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r24 = r7
            r25 = r0
            r26 = r1
            r27 = r2
            r28 = r3
            r29 = r4
            r30 = r5
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r24, r25, r26, r27, r28, r29, r30)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x00a8:
            r8 = 3
            com.ss.android.common.http.a.a r13 = new com.ss.android.common.http.a.a
            r13.<init>()
            java.lang.Object[] r6 = new java.lang.Object[r8]
            r6[r14] = r1
            r6[r15] = r2
            r6[r16] = r3
            com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.common.http.a.a.f28292a
            r20 = 0
            r21 = 15787(0x3dab, float:2.2122E-41)
            java.lang.Class[] r7 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r7[r14] = r9
            java.lang.Class<byte[]> r9 = byte[].class
            r7[r15] = r9
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r7[r16] = r9
            java.lang.Class r23 = java.lang.Void.TYPE
            r17 = r6
            r18 = r13
            r22 = r7
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r17, r18, r19, r20, r21, r22, r23)
            if (r6 == 0) goto L_0x00fb
            java.lang.Object[] r6 = new java.lang.Object[r8]
            r6[r14] = r1
            r6[r15] = r2
            r6[r16] = r3
            com.meituan.robust.ChangeQuickRedirect r1 = com.ss.android.common.http.a.a.f28292a
            r9 = 0
            r10 = 15787(0x3dab, float:2.2122E-41)
            java.lang.Class[] r11 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r11[r14] = r2
            java.lang.Class<byte[]> r2 = byte[].class
            r11[r15] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r11[r16] = r2
            java.lang.Class r12 = java.lang.Void.TYPE
            r7 = r13
            r8 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0105
        L_0x00fb:
            java.util.Set<com.ss.android.common.http.a.a$c> r6 = r13.f28293b
            com.ss.android.common.http.a.a$a r7 = new com.ss.android.common.http.a.a$a
            r7.<init>(r1, r2, r3)
            r6.add(r7)
        L_0x0105:
            if (r29 == 0) goto L_0x012b
            java.util.Set r1 = r29.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x010f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x012b
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r13.a((java.lang.String) r3, (java.lang.String) r2)
            goto L_0x010f
        L_0x012b:
            r1 = r24
            java.lang.String r0 = executePost((int) r14, (int) r1, (java.lang.String) r0, (com.ss.android.common.http.a.a) r13, (com.ss.android.common.http.d[]) r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.NetworkUtils.postData(int, java.lang.String, java.lang.String, byte[], java.lang.String, java.util.Map, com.ss.android.common.http.d[]):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0152 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String execute(java.lang.String r21, int r22, java.lang.String r23, byte[] r24, com.ss.android.common.util.NetworkUtils.e r25, java.lang.String r26, java.util.List<com.ss.android.http.a.a> r27) throws java.lang.Exception {
        /*
            r0 = r21
            r3 = r25
            r4 = 7
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r5 = 0
            r8[r5] = r0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r22)
            r15 = 1
            r8[r15] = r9
            r16 = 2
            r8[r16] = r23
            r17 = 3
            r8[r17] = r24
            r18 = 4
            r8[r18] = r3
            r19 = 5
            r8[r19] = r26
            r20 = 6
            r8[r20] = r27
            com.meituan.robust.ChangeQuickRedirect r10 = changeQuickRedirect
            java.lang.Class[] r13 = new java.lang.Class[r4]
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r13[r5] = r9
            java.lang.Class r9 = java.lang.Integer.TYPE
            r13[r15] = r9
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r13[r16] = r9
            java.lang.Class<byte[]> r9 = byte[].class
            r13[r17] = r9
            java.lang.Class<com.ss.android.common.util.NetworkUtils$e> r9 = com.ss.android.common.util.NetworkUtils.e.class
            r13[r18] = r9
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r13[r19] = r9
            java.lang.Class<java.util.List> r9 = java.util.List.class
            r13[r20] = r9
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            r9 = 0
            r11 = 1
            r12 = 16066(0x3ec2, float:2.2513E-41)
            boolean r8 = com.meituan.robust.PatchProxy.isSupport(r8, r9, r10, r11, r12, r13, r14)
            if (r8 == 0) goto L_0x00a0
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r8[r5] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            r8[r15] = r0
            r8[r16] = r23
            r8[r17] = r24
            r8[r18] = r3
            r8[r19] = r26
            r8[r20] = r27
            r0 = 0
            com.meituan.robust.ChangeQuickRedirect r1 = changeQuickRedirect
            r2 = 1
            r3 = 16066(0x3ec2, float:2.2513E-41)
            java.lang.Class[] r4 = new java.lang.Class[r4]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r4[r5] = r6
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r15] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r16] = r5
            java.lang.Class<byte[]> r5 = byte[].class
            r4[r17] = r5
            java.lang.Class<com.ss.android.common.util.NetworkUtils$e> r5 = com.ss.android.common.util.NetworkUtils.e.class
            r4[r18] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r19] = r5
            java.lang.Class<java.util.List> r5 = java.util.List.class
            r4[r20] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r21 = r8
            r22 = r0
            r23 = r1
            r24 = r2
            r25 = r3
            r26 = r4
            r27 = r5
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r21, r22, r23, r24, r25, r26, r27)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x00a0:
            java.lang.String r4 = "get"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x015c
            java.lang.String r4 = "delete"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0154
            java.lang.String r4 = filterUrl(r23)
            r1 = 0
            if (r4 == 0) goto L_0x0153
            boolean r8 = android.text.TextUtils.isEmpty(r21)
            if (r8 == 0) goto L_0x00bf
            goto L_0x0153
        L_0x00bf:
            if (r24 != 0) goto L_0x00c4
            byte[] r2 = new byte[r5]
            goto L_0x00c6
        L_0x00c4:
            r2 = r24
        L_0x00c6:
            int r8 = r2.length
            com.ss.android.common.util.NetworkUtils$e r9 = com.ss.android.common.util.NetworkUtils.e.GZIP
            r10 = 8192(0x2000, float:1.14794E-41)
            if (r9 != r3) goto L_0x00f0
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>(r10)
            java.util.zip.GZIPOutputStream r5 = new java.util.zip.GZIPOutputStream
            r5.<init>(r3)
            r5.write(r2)     // Catch:{ Throwable -> 0x00ec, all -> 0x00e6 }
            r5.close()
            byte[] r2 = r3.toByteArray()
            java.lang.String r3 = "gzip"
        L_0x00e3:
            r5 = r2
            r8 = r3
            goto L_0x0124
        L_0x00e6:
            r0 = move-exception
            r1 = r0
            r5.close()
            throw r1
        L_0x00ec:
            r5.close()
            return r1
        L_0x00f0:
            com.ss.android.common.util.NetworkUtils$e r9 = com.ss.android.common.util.NetworkUtils.e.DEFLATER
            if (r9 != r3) goto L_0x0122
            r3 = 128(0x80, float:1.794E-43)
            if (r8 <= r3) goto L_0x0122
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>(r10)
            java.util.zip.Deflater r8 = new java.util.zip.Deflater
            r8.<init>()
            r8.setInput(r2)
            r8.finish()
            byte[] r2 = new byte[r10]
        L_0x010a:
            boolean r9 = r8.finished()
            if (r9 != 0) goto L_0x0118
            int r9 = r8.deflate(r2)
            r3.write(r2, r5, r9)
            goto L_0x010a
        L_0x0118:
            r8.end()
            byte[] r2 = r3.toByteArray()
            java.lang.String r3 = "deflate"
            goto L_0x00e3
        L_0x0122:
            r8 = r1
            r5 = r2
        L_0x0124:
            com.ss.android.common.http.b r2 = com.ss.android.common.http.a.a()
            if (r2 == 0) goto L_0x0152
            java.lang.String r1 = "put"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0142
            r1 = 0
            r0 = r2
            r2 = r22
            r3 = r4
            r4 = r5
            r5 = r8
            r6 = r26
            r7 = r27
            java.lang.String r0 = r0.b((int) r1, (int) r2, (java.lang.String) r3, (byte[]) r4, (java.lang.String) r5, (java.lang.String) r6, (java.util.List<com.ss.android.http.a.a>) r7)
            return r0
        L_0x0142:
            r1 = 0
            r0 = r2
            r2 = r22
            r3 = r4
            r4 = r5
            r5 = r8
            r6 = r26
            r7 = r27
            java.lang.String r0 = r0.a((int) r1, (int) r2, (java.lang.String) r3, (byte[]) r4, (java.lang.String) r5, (java.lang.String) r6, (java.util.List<com.ss.android.http.a.a>) r7)
            return r0
        L_0x0152:
            return r1
        L_0x0153:
            return r1
        L_0x0154:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "此方法不支持delete"
            r0.<init>(r1)
            throw r0
        L_0x015c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "此方法不支持get"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.NetworkUtils.execute(java.lang.String, int, java.lang.String, byte[], com.ss.android.common.util.NetworkUtils$e, java.lang.String, java.util.List):java.lang.String");
    }

    public static String executeGetRetry(int i2, int i3, String str, boolean z, List<com.ss.android.http.a.a> list, com.ss.android.http.a.b.f fVar, boolean z2, List<com.ss.android.http.a.b.e> list2, boolean z3) throws Exception {
        String str2 = str;
        boolean z4 = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str2, Byte.valueOf(z ? (byte) 1 : 0), list, fVar, Byte.valueOf(z2 ? (byte) 1 : 0), list2, Byte.valueOf(z3 ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 16040, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE, List.class, com.ss.android.http.a.b.f.class, Boolean.TYPE, List.class, Boolean.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str2, Byte.valueOf(z), list, fVar, Byte.valueOf(z2), list2, Byte.valueOf(z3)}, null, changeQuickRedirect, true, 16040, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE, List.class, com.ss.android.http.a.b.f.class, Boolean.TYPE, List.class, Boolean.TYPE}, String.class);
        } else if (str2 == null) {
            return null;
        } else {
            if (z3) {
                str2 = addCommonParams(str2, true);
            }
            if (mAllowKeepAlive) {
                z4 = z;
            }
            Logger.debug();
            com.ss.android.common.http.c b2 = com.ss.android.common.http.a.b();
            if (b2 != null) {
                str2 = b2.a();
            }
            String str3 = str2;
            com.ss.android.common.http.b a2 = com.ss.android.common.http.a.a();
            if (a2 != null) {
                return a2.a(i2, i3, str3, list, z4, true, fVar, z2);
            }
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v16, resolved type: java.io.RandomAccessFile} */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.io.File] */
    /* JADX WARNING: type inference failed for: r2v21 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0226, code lost:
        r2 = r12;
        r1 = null;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0229, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x022a, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        r6.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0232, code lost:
        safeClose(null, "close instream exception ");
        safeClose(null, "close outstream exception ");
        safeClose(null, "close random file exception ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0242, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0243, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0244, code lost:
        r2 = null;
        r1 = null;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0248, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0249, code lost:
        r2 = null;
        r1 = null;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0253, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0255, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0256, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0261, code lost:
        r0 = th;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0262, code lost:
        r6 = r2;
        r14 = r6;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        r6.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x010a, code lost:
        if (r5 <= 0) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x010c, code lost:
        r0 = (r2 > ((long) r5) ? 1 : (r2 == ((long) r5) ? 0 : -1));
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x010f, code lost:
        if (r0 > 0) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0112, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0117, code lost:
        throw new com.ss.android.common.util.a(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0136, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x013b, code lost:
        if (com.bytedance.common.utility.StringUtils.isEmpty(r37) != false) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0143, code lost:
        r0 = new java.io.File(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x014c, code lost:
        if (r0.exists() == false) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x014e, code lost:
        r0.mkdirs();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0151, code lost:
        r0 = java.io.File.createTempFile("tempimage", ".tmp", new java.io.File(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0200, code lost:
        r31.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0203, code lost:
        if (r12 <= 0) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        r14.seek(0);
        r12 = new java.io.FileOutputStream(new java.io.File(r30, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        r1 = r14.read(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x021a, code lost:
        if (r1 == -1) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x021c, code lost:
        r12.write(r0, 0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0221, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0225, code lost:
        r0 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:15:0x0112, B:22:0x012a, B:118:0x0254] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0275 A[SYNTHETIC, Splitter:B:128:0x0275] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean stream2File(java.io.InputStream r31, long r32, com.ss.android.common.util.NetworkUtils.j r34, int r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, com.ss.android.common.util.c<java.lang.String> r39, java.lang.String r40, com.ss.android.common.util.h r41) throws java.lang.Exception {
        /*
            r1 = r31
            r2 = r32
            r5 = r35
            r6 = r36
            r7 = r37
            r8 = r38
            r9 = r39
            r10 = r40
            r11 = r41
            r0 = 10
            java.lang.Object[] r12 = new java.lang.Object[r0]
            r15 = 0
            r12[r15] = r1
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r2)
            r19 = 1
            r12[r19] = r13
            r20 = 2
            r12[r20] = r34
            java.lang.Integer r13 = java.lang.Integer.valueOf(r35)
            r21 = 3
            r12[r21] = r13
            r22 = 4
            r12[r22] = r6
            r23 = 5
            r12[r23] = r7
            r24 = 6
            r12[r24] = r8
            r25 = 7
            r12[r25] = r9
            r26 = 8
            r12[r26] = r10
            r27 = 9
            r12[r27] = r11
            com.meituan.robust.ChangeQuickRedirect r14 = changeQuickRedirect
            java.lang.Class[] r13 = new java.lang.Class[r0]
            java.lang.Class<java.io.InputStream> r16 = java.io.InputStream.class
            r13[r15] = r16
            java.lang.Class r16 = java.lang.Long.TYPE
            r13[r19] = r16
            java.lang.Class<com.ss.android.common.util.NetworkUtils$j> r16 = com.ss.android.common.util.NetworkUtils.j.class
            r13[r20] = r16
            java.lang.Class r16 = java.lang.Integer.TYPE
            r13[r21] = r16
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r13[r22] = r16
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r13[r23] = r16
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r13[r24] = r16
            java.lang.Class<com.ss.android.common.util.c> r16 = com.ss.android.common.util.c.class
            r13[r25] = r16
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r13[r26] = r16
            java.lang.Class<com.ss.android.common.util.h> r16 = com.ss.android.common.util.h.class
            r13[r27] = r16
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r16 = 0
            r17 = 1
            r28 = 16012(0x3e8c, float:2.2438E-41)
            r29 = r13
            r13 = r16
            r15 = r17
            r16 = r28
            r17 = r29
            boolean r12 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r12 == 0) goto L_0x00f5
            java.lang.Object[] r12 = new java.lang.Object[r0]
            r13 = 0
            r12[r13] = r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r2)
            r12[r19] = r1
            r12[r20] = r34
            java.lang.Integer r1 = java.lang.Integer.valueOf(r35)
            r12[r21] = r1
            r12[r22] = r6
            r12[r23] = r7
            r12[r24] = r8
            r12[r25] = r9
            r12[r26] = r10
            r12[r27] = r11
            r1 = 0
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 1
            r4 = 16012(0x3e8c, float:2.2438E-41)
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<java.io.InputStream> r5 = java.io.InputStream.class
            r0[r13] = r5
            java.lang.Class r5 = java.lang.Long.TYPE
            r0[r19] = r5
            java.lang.Class<com.ss.android.common.util.NetworkUtils$j> r5 = com.ss.android.common.util.NetworkUtils.j.class
            r0[r20] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r0[r21] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r0[r22] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r0[r23] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r0[r24] = r5
            java.lang.Class<com.ss.android.common.util.c> r5 = com.ss.android.common.util.c.class
            r0[r25] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r0[r26] = r5
            java.lang.Class<com.ss.android.common.util.h> r5 = com.ss.android.common.util.h.class
            r0[r27] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r31 = r12
            r32 = r1
            r33 = r2
            r34 = r3
            r35 = r4
            r36 = r0
            r37 = r5
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r31, r32, r33, r34, r35, r36, r37)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x00f5:
            r13 = 0
            if (r1 != 0) goto L_0x00f9
            return r13
        L_0x00f9:
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r12 = 0
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x0258
            r14 = 0
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x010a
            r2 = 4096(0x1000, double:2.0237E-320)
            goto L_0x0118
        L_0x010a:
            if (r5 <= 0) goto L_0x0118
            long r14 = (long) r5
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x0112
            goto L_0x0118
        L_0x0112:
            com.ss.android.common.util.a r0 = new com.ss.android.common.util.a     // Catch:{ all -> 0x0255 }
            r0.<init>(r5, r2)     // Catch:{ all -> 0x0255 }
            throw r0     // Catch:{ all -> 0x0255 }
        L_0x0118:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0255 }
            r0.<init>(r6)     // Catch:{ all -> 0x0255 }
            boolean r14 = r0.exists()     // Catch:{ all -> 0x0255 }
            if (r14 != 0) goto L_0x0126
            r0.mkdirs()     // Catch:{ all -> 0x0255 }
        L_0x0126:
            java.lang.String r0 = "tempimage"
            java.lang.String r14 = ".tmp"
            java.io.File r15 = new java.io.File     // Catch:{ IOException -> 0x0136 }
            r15.<init>(r6)     // Catch:{ IOException -> 0x0136 }
            java.io.File r0 = java.io.File.createTempFile(r0, r14, r15)     // Catch:{ IOException -> 0x0136 }
            r7 = r6
        L_0x0134:
            r6 = r0
            goto L_0x015f
        L_0x0136:
            r0 = move-exception
            boolean r14 = com.bytedance.common.utility.StringUtils.isEmpty(r37)     // Catch:{ all -> 0x0255 }
            if (r14 != 0) goto L_0x0253
            boolean r6 = r7.equals(r6)     // Catch:{ all -> 0x0255 }
            if (r6 != 0) goto L_0x0253
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0255 }
            r0.<init>(r7)     // Catch:{ all -> 0x0255 }
            boolean r6 = r0.exists()     // Catch:{ all -> 0x0255 }
            if (r6 != 0) goto L_0x0151
            r0.mkdirs()     // Catch:{ all -> 0x0255 }
        L_0x0151:
            java.lang.String r0 = "tempimage"
            java.lang.String r6 = ".tmp"
            java.io.File r14 = new java.io.File     // Catch:{ all -> 0x0255 }
            r14.<init>(r7)     // Catch:{ all -> 0x0255 }
            java.io.File r0 = java.io.File.createTempFile(r0, r6, r14)     // Catch:{ all -> 0x0255 }
            goto L_0x0134
        L_0x015f:
            if (r6 != 0) goto L_0x0176
            java.lang.String r0 = "close instream exception "
            safeClose(r1, r0)
            java.lang.String r0 = "close outstream exception "
            safeClose(r12, r0)
            java.lang.String r0 = "close random file exception "
            safeClose(r12, r0)
            if (r6 == 0) goto L_0x0175
            r6.delete()     // Catch:{ Exception -> 0x0175 }
        L_0x0175:
            return r13
        L_0x0176:
            java.io.RandomAccessFile r14 = new java.io.RandomAccessFile     // Catch:{ all -> 0x024f }
            java.lang.String r0 = "rw"
            r14.<init>(r6, r0)     // Catch:{ all -> 0x024f }
            r12 = 0
            r14.setLength(r12)     // Catch:{ all -> 0x024c }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x024c }
            r12 = 0
            r15 = 0
        L_0x0189:
            int r13 = r1.read(r0)     // Catch:{ all -> 0x024c }
            r30 = r7
            r7 = -1
            if (r13 == r7) goto L_0x0200
            if (r11 == 0) goto L_0x01ba
            boolean r7 = r11.f28335a     // Catch:{ all -> 0x024c }
            if (r7 == 0) goto L_0x01ba
            if (r34 == 0) goto L_0x01a0
            r34.a()     // Catch:{ all -> 0x024c }
            r34.b()     // Catch:{ all -> 0x024c }
        L_0x01a0:
            r14.close()     // Catch:{ all -> 0x024c }
            java.lang.String r0 = "close instream exception "
            safeClose(r1, r0)
            java.lang.String r0 = "close outstream exception "
            r1 = 0
            safeClose(r1, r0)
            java.lang.String r0 = "close random file exception "
            safeClose(r1, r0)
            if (r6 == 0) goto L_0x01b8
            r6.delete()     // Catch:{ Exception -> 0x01b8 }
        L_0x01b8:
            r1 = 0
            return r1
        L_0x01ba:
            int r12 = r12 + r13
            if (r5 <= 0) goto L_0x01ce
            if (r12 > r5) goto L_0x01c0
            goto L_0x01ce
        L_0x01c0:
            r14.close()     // Catch:{ all -> 0x024c }
            com.ss.android.common.util.a r0 = new com.ss.android.common.util.a     // Catch:{ all -> 0x01c9 }
            r0.<init>(r5, r2)     // Catch:{ all -> 0x01c9 }
            throw r0     // Catch:{ all -> 0x01c9 }
        L_0x01c9:
            r0 = move-exception
            r2 = 0
            r14 = 0
            goto L_0x0264
        L_0x01ce:
            r7 = 0
            r14.write(r0, r7, r13)     // Catch:{ all -> 0x024c }
            if (r9 == 0) goto L_0x01fb
            if (r10 == 0) goto L_0x01fb
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x024c }
            r7 = 0
            long r20 = r17 - r15
            r22 = 500(0x1f4, double:2.47E-321)
            int r7 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r7 < 0) goto L_0x01fb
            long r4 = (long) r12     // Catch:{ all -> 0x024c }
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x01ee
            int r4 = r12 * 100
            long r4 = (long) r4     // Catch:{ all -> 0x024c }
            long r4 = r4 / r2
            int r4 = (int) r4     // Catch:{ all -> 0x024c }
            goto L_0x01f0
        L_0x01ee:
            r4 = 80
        L_0x01f0:
            r5 = 99
            if (r4 < r5) goto L_0x01f6
            r4 = 99
        L_0x01f6:
            r9.a(r4, r10)     // Catch:{ all -> 0x024c }
            r15 = r17
        L_0x01fb:
            r7 = r30
            r5 = r35
            goto L_0x0189
        L_0x0200:
            r31.close()     // Catch:{ all -> 0x024c }
            if (r12 <= 0) goto L_0x022c
            r1 = 0
            r14.seek(r1)     // Catch:{ all -> 0x0229 }
            java.io.FileOutputStream r12 = new java.io.FileOutputStream     // Catch:{ all -> 0x0229 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0229 }
            r2 = r30
            r1.<init>(r2, r8)     // Catch:{ all -> 0x0229 }
            r12.<init>(r1)     // Catch:{ all -> 0x0229 }
        L_0x0216:
            int r1 = r14.read(r0)     // Catch:{ all -> 0x0225 }
            if (r1 == r7) goto L_0x0221
            r2 = 0
            r12.write(r0, r2, r1)     // Catch:{ all -> 0x0225 }
            goto L_0x0216
        L_0x0221:
            r12.close()     // Catch:{ all -> 0x0225 }
            goto L_0x022c
        L_0x0225:
            r0 = move-exception
            r2 = r12
            r1 = 0
            goto L_0x0264
        L_0x0229:
            r0 = move-exception
            r1 = 0
            goto L_0x024d
        L_0x022c:
            r14.close()     // Catch:{ all -> 0x0248 }
            r6.delete()     // Catch:{ all -> 0x0243 }
            java.lang.String r0 = "close instream exception "
            r2 = 0
            safeClose(r2, r0)
            java.lang.String r0 = "close outstream exception "
            safeClose(r2, r0)
            java.lang.String r0 = "close random file exception "
            safeClose(r2, r0)
            return r19
        L_0x0243:
            r0 = move-exception
            r2 = 0
            r1 = r2
            r14 = r1
            goto L_0x0264
        L_0x0248:
            r0 = move-exception
            r2 = 0
            r1 = r2
            goto L_0x0264
        L_0x024c:
            r0 = move-exception
        L_0x024d:
            r2 = 0
            goto L_0x0264
        L_0x024f:
            r0 = move-exception
            r2 = r12
            r14 = r2
            goto L_0x0264
        L_0x0253:
            r2 = r12
            throw r0     // Catch:{ all -> 0x0261 }
        L_0x0255:
            r0 = move-exception
            r2 = r12
            goto L_0x0262
        L_0x0258:
            r2 = r12
            com.ss.android.common.util.a r0 = new com.ss.android.common.util.a     // Catch:{ all -> 0x0261 }
            r3 = r35
            r0.<init>(r3, r14)     // Catch:{ all -> 0x0261 }
            throw r0     // Catch:{ all -> 0x0261 }
        L_0x0261:
            r0 = move-exception
        L_0x0262:
            r6 = r2
            r14 = r6
        L_0x0264:
            java.lang.String r3 = "close instream exception "
            safeClose(r1, r3)
            java.lang.String r1 = "close outstream exception "
            safeClose(r2, r1)
            java.lang.String r1 = "close random file exception "
            safeClose(r14, r1)
            if (r6 == 0) goto L_0x0278
            r6.delete()     // Catch:{ Exception -> 0x0278 }
        L_0x0278:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.NetworkUtils.stream2File(java.io.InputStream, long, com.ss.android.common.util.NetworkUtils$j, int, java.lang.String, java.lang.String, java.lang.String, com.ss.android.common.util.c, java.lang.String, com.ss.android.common.util.h):boolean");
    }

    public static boolean downloadFile(int i2, String str, String str2, String str3, String str4, c<String> cVar, String str5, h hVar, List<com.ss.android.http.a.b.e> list, String[] strArr, int[] iArr) throws Exception {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str, str2, str3, str4, cVar, str5, hVar, list, strArr, iArr}, null, changeQuickRedirect, true, 16010, new Class[]{Integer.TYPE, String.class, String.class, String.class, String.class, c.class, String.class, h.class, List.class, String[].class, int[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str, str2, str3, str4, cVar, str5, hVar, list, strArr, iArr}, null, changeQuickRedirect, true, 16010, new Class[]{Integer.TYPE, String.class, String.class, String.class, String.class, c.class, String.class, h.class, List.class, String[].class, int[].class}, Boolean.TYPE)).booleanValue();
        }
        com.ss.android.common.http.b a2 = com.ss.android.common.http.a.a();
        if (a2 != null) {
            return a2.a(i2, str, str2, str3, str4, cVar, str5, hVar, list, strArr, iArr);
        }
        return false;
    }

    public static boolean downloadVideo(int i2, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, c<String> cVar, String str2, h hVar, List<com.ss.android.http.a.b.e> list, String[] strArr, int[] iArr, RedirectHandler redirectHandler) throws Exception {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str, stringBuffer, stringBuffer2, stringBuffer3, cVar, str2, hVar, list, strArr, iArr, redirectHandler}, null, changeQuickRedirect, true, 16011, new Class[]{Integer.TYPE, String.class, StringBuffer.class, StringBuffer.class, StringBuffer.class, c.class, String.class, h.class, List.class, String[].class, int[].class, RedirectHandler.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str, stringBuffer, stringBuffer2, stringBuffer3, cVar, str2, hVar, list, strArr, iArr, redirectHandler}, null, changeQuickRedirect, true, 16011, new Class[]{Integer.TYPE, String.class, StringBuffer.class, StringBuffer.class, StringBuffer.class, c.class, String.class, h.class, List.class, String[].class, int[].class, RedirectHandler.class}, Boolean.TYPE)).booleanValue();
        }
        com.ss.android.common.http.b a2 = com.ss.android.common.http.a.a();
        if (a2 != null) {
            return a2.a(i2, str, stringBuffer, stringBuffer2, stringBuffer3, cVar, str2, hVar, list, strArr, iArr, redirectHandler);
        }
        return false;
    }
}
