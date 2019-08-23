package com.ss.android.newmedia;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.support.v4.content.FileProvider;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.common.util.JellyBeanMR1V17Compat;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.config.AppConfig;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.common.util.c;
import com.ss.android.common.util.h;
import com.ss.android.http.a.a;
import com.ss.android.http.a.a.b;
import com.ss.android.image.f;
import com.ss.android.image.i;
import com.ss.android.newmedia.ui.webview.SSWebView;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.io.File;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2507a;

    /* renamed from: b  reason: collision with root package name */
    public static Context f2508b;

    /* renamed from: c  reason: collision with root package name */
    private static String f2509c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f2510d;

    public static int a(int i) {
        switch (i) {
            case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                return C0906R.string.cae;
            case 13:
                return C0906R.string.caa;
            case 14:
                return C0906R.string.cad;
            case 15:
                return C0906R.string.cac;
            case SearchJediMixFeedAdapter.f42514c /*?: ONE_ARG  (16 int)*/:
                return C0906R.string.cai;
            case 17:
                return C0906R.string.ca_;
            case 19:
                return C0906R.string.caj;
            default:
                return C0906R.string.cak;
        }
    }

    public static boolean a(Context context, String str, BaseAppData baseAppData) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2, baseAppData}, null, f2507a, true, 18246, new Class[]{Context.class, String.class, BaseAppData.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str2, baseAppData}, null, f2507a, true, 18246, new Class[]{Context.class, String.class, BaseAppData.class}, Boolean.TYPE)).booleanValue();
        } else if (StringUtils.isEmpty(str)) {
            return false;
        } else {
            try {
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context2.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses();
                if (runningAppProcesses == null) {
                    return false;
                }
                for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                    if (!(next.importance != 100 || next.pkgList == null || next.pkgList.length == 0)) {
                        for (String equals : next.pkgList) {
                            if (str2.equals(equals) && baseAppData.f() != null) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
                return false;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f2507a, true, 18257, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f2507a, true, 18257, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (StringUtils.isEmpty(str)) {
            return false;
        } else {
            return str2.startsWith("http://") || str2.startsWith("https://");
        }
    }

    public static void a(String str, WebView webView) {
        String str2 = str;
        WebView webView2 = webView;
        if (PatchProxy.isSupport(new Object[]{str2, webView2}, null, f2507a, true, 18258, new Class[]{String.class, WebView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, webView2}, null, f2507a, true, 18258, new Class[]{String.class, WebView.class}, Void.TYPE);
            return;
        }
        a(str2, webView2, (HashMap<String, String>) null);
    }

    public static void a(String str, WebView webView, HashMap<String, String> hashMap) {
        String str2 = str;
        WebView webView2 = webView;
        HashMap<String, String> hashMap2 = hashMap;
        if (PatchProxy.isSupport(new Object[]{str2, webView2, hashMap2}, null, f2507a, true, 18259, new Class[]{String.class, WebView.class, HashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, webView2, hashMap2}, null, f2507a, true, 18259, new Class[]{String.class, WebView.class, HashMap.class}, Void.TYPE);
        } else if (webView2 != null && !StringUtils.isEmpty(str)) {
            boolean a2 = a(str);
            Context context = webView.getContext();
            if (!(webView2 instanceof SSWebView) && a2 && context != null) {
                str2 = AppConfig.getInstance(context).filterUrlOnUIThread(str2);
            }
            if (hashMap2 == null || hashMap.isEmpty()) {
                l.a(webView2, str2);
            } else {
                f.a(webView2, str2, hashMap2);
            }
        }
    }

    public static void a(HashMap<String, String> hashMap, String str, JSONObject jSONObject) {
        HashMap<String, String> hashMap2 = hashMap;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{hashMap2, null, jSONObject2}, null, f2507a, true, 18261, new Class[]{HashMap.class, String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hashMap2, null, jSONObject2}, null, f2507a, true, 18261, new Class[]{HashMap.class, String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (jSONObject2 != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys != null && keys.hasNext()) {
                try {
                    String next = keys.next();
                    String optString = jSONObject2.optString(next);
                    if (!StringUtils.isEmpty(next)) {
                        if (!StringUtils.isEmpty(optString)) {
                            hashMap2.put(next, optString);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (!StringUtils.isEmpty(null)) {
            hashMap2.put("User-Agent", null);
        }
    }

    public static String a(Context context, WebView webView) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, webView}, null, f2507a, true, 18262, new Class[]{Context.class, WebView.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2, webView}, null, f2507a, true, 18262, new Class[]{Context.class, WebView.class}, String.class);
        }
        if (webView != null) {
            String userAgentString = webView.getSettings().getUserAgentString();
            if (!StringUtils.isEmpty(userAgentString)) {
                f2509c = userAgentString;
                return userAgentString;
            }
        }
        if (!StringUtils.isEmpty(f2509c)) {
            return f2509c;
        }
        String webViewDefaultUserAgent = JellyBeanMR1V17Compat.getWebViewDefaultUserAgent(context);
        f2509c = webViewDefaultUserAgent;
        if (!StringUtils.isEmpty(webViewDefaultUserAgent)) {
            return f2509c;
        }
        if (!f2510d && webView == null && context2 != null && (context2 instanceof Activity)) {
            f2510d = true;
            try {
                WebView webView2 = new WebView(context2);
                f2509c = webView2.getSettings().getUserAgentString();
                webView2.destroy();
            } catch (Throwable unused) {
            }
        }
        return f2509c;
    }

    public static void a(Activity activity, Fragment fragment, int i) {
        Activity activity2 = activity;
        Fragment fragment2 = fragment;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{activity2, fragment2, Integer.valueOf(i)}, null, f2507a, true, 18266, new Class[]{Activity.class, Fragment.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, fragment2, Integer.valueOf(i)}, null, f2507a, true, 18266, new Class[]{Activity.class, Fragment.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        new String[1][0] = "android.permission.READ_EXTERNAL_STORAGE";
        new String[1][0] = activity.getResources().getString(C0906R.string.f4473b);
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            UIUtils.displayToastWithIcon((Context) activity2, 2130838336, (int) C0906R.string.bml);
            return;
        }
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        if (fragment2 != null) {
            try {
                fragment2.startActivityForResult(intent, i2);
            } catch (Exception unused) {
                UIUtils.displayToastWithIcon((Context) activity2, 2130838336, (int) C0906R.string.bmj);
            }
            return;
        }
        activity2.startActivityForResult(intent, i2);
    }

    public static void a(Activity activity, Fragment fragment, int i, String str, String str2) {
        Activity activity2 = activity;
        Fragment fragment2 = fragment;
        int i2 = i;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{activity2, fragment2, Integer.valueOf(i), str3, str4}, null, f2507a, true, 18267, new Class[]{Activity.class, Fragment.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {activity2, fragment2, Integer.valueOf(i), str3, str4};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f2507a, true, 18267, new Class[]{Activity.class, Fragment.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        String[] strArr = {"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};
        String[] strArr2 = {activity.getResources().getString(C0906R.string.f4472a), activity.getResources().getString(C0906R.string.f4473b)};
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            UIUtils.displayToastWithIcon((Context) activity2, 2130838336, (int) C0906R.string.bml);
            return;
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        File file = new File(str3);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str4);
        intent.addFlags(1);
        intent.putExtra("output", a((Context) activity2, file2));
        if (fragment2 != null) {
            try {
                fragment2.startActivityForResult(intent, i2);
            } catch (Exception unused) {
                UIUtils.displayToastWithIcon((Context) activity2, 2130838336, (int) C0906R.string.bmi);
            }
            return;
        }
        activity2.startActivityForResult(intent, i2);
    }

    public static boolean a(Context context, int i, String str, String str2, String str3, String str4, String str5, c<String> cVar, h hVar) throws Throwable {
        if (!PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i), str, null, str3, str4, str5, null, null}, null, f2507a, true, 18269, new Class[]{Context.class, Integer.TYPE, String.class, String.class, String.class, String.class, String.class, c.class, h.class}, Boolean.TYPE)) {
            return a(context, i, str, (String) null, str3, str4, str5, (c<String>) null, str5, (h) null);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i), str, null, str3, str4, str5, null, null}, null, f2507a, true, 18269, new Class[]{Context.class, Integer.TYPE, String.class, String.class, String.class, String.class, String.class, c.class, h.class}, Boolean.TYPE)).booleanValue();
    }

    public static boolean a(Context context, int i, String str, String str2, String str3, String str4, String str5, c<String> cVar, String str6, h hVar) throws Throwable {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i), str, str2, str3, str4, str5, cVar, str6, hVar}, null, f2507a, true, 18270, new Class[]{Context.class, Integer.TYPE, String.class, String.class, String.class, String.class, String.class, c.class, String.class, h.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i), str, str2, str3, str4, str5, cVar, str6, hVar}, null, f2507a, true, 18270, new Class[]{Context.class, Integer.TYPE, String.class, String.class, String.class, String.class, String.class, c.class, String.class, h.class}, Boolean.TYPE)).booleanValue();
        }
        return a(context, i, str, f.extractImageUrlList(str, str2), str3, str4, str5, cVar, str6, hVar);
    }

    private static boolean a(Context context, int i, String str, List<i> list, String str2, String str3, String str4, c<String> cVar, String str5, h hVar) throws Throwable {
        int i2;
        String str6 = str2;
        String str7 = str4;
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i), str, list, str6, str3, str7, cVar, str5, hVar}, null, f2507a, true, 18271, new Class[]{Context.class, Integer.TYPE, String.class, List.class, String.class, String.class, String.class, c.class, String.class, h.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i), str, list, str6, str3, str7, cVar, str5, hVar}, null, f2507a, true, 18271, new Class[]{Context.class, Integer.TYPE, String.class, List.class, String.class, String.class, String.class, c.class, String.class, h.class}, Boolean.TYPE)).booleanValue();
        }
        int i3 = 3;
        int i4 = 1;
        int i5 = i <= 0 ? 20971520 : i;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Context applicationContext = context == null ? f2508b.getApplicationContext() : context;
        int i6 = 0;
        for (i next : list) {
            if (next != null) {
                String str8 = next.f29264a;
                if (!StringUtils.isEmpty(str8)) {
                    int i7 = i6 + 1;
                    if (i7 > i3) {
                        return false;
                    }
                    Logger.debug();
                    String[] strArr = new String[i4];
                    int[] iArr = new int[i4];
                    System.currentTimeMillis();
                    if (applicationContext != null) {
                        try {
                            if (!NetworkUtils.isNetworkAvailable(applicationContext)) {
                                return false;
                            }
                        } catch (Throwable th) {
                            th = th;
                            i2 = i7;
                            if (!((th instanceof SocketException) || (th instanceof IOException) || (th instanceof SocketTimeoutException) || (th instanceof b))) {
                                throw th;
                            } else if (applicationContext == null || !NetworkUtils.isNetworkAvailable(applicationContext)) {
                                return false;
                            } else {
                                i6 = i2;
                                i3 = 3;
                                i4 = 1;
                            }
                        }
                    }
                    int[] iArr2 = iArr;
                    i2 = i7;
                    try {
                        boolean downloadFile = NetworkUtils.downloadFile(i5, str8, str2, str3, str4, cVar, str5, hVar, next.f29265b, strArr, iArr2);
                        System.currentTimeMillis();
                        if (!downloadFile) {
                            return downloadFile;
                        }
                        try {
                            File file = new File(str6, str7);
                            if (file.isFile()) {
                                long length = file.length();
                                if (length > 0) {
                                    BaseAppData.W.addAndGet(length);
                                    if (iArr2[0] <= 0 && length < 2147483647L) {
                                        iArr2[0] = (int) length;
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                        return applicationContext == null ? downloadFile : downloadFile;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
            i3 = 3;
            i4 = 1;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        if (r1 != null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009c, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a5, code lost:
        if (r1 == null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f4, code lost:
        if (r3 != null) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0105, code lost:
        if (r3 != null) goto L_0x00f6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:18:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009f A[SYNTHETIC, Splitter:B:34:0x009f] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0100 A[SYNTHETIC, Splitter:B:71:0x0100] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r16, android.net.Uri r17) {
        /*
            r1 = 2
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r15 = 0
            r8[r15] = r16
            r6 = 1
            r8[r6] = r17
            com.meituan.robust.ChangeQuickRedirect r10 = f2507a
            java.lang.Class[] r13 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r13[r15] = r2
            java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
            r13[r6] = r2
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            r9 = 0
            r11 = 1
            r12 = 18274(0x4762, float:2.5607E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r8, r9, r10, r11, r12, r13, r14)
            if (r2 == 0) goto L_0x0041
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r15] = r16
            r2[r6] = r17
            r8 = 0
            com.meituan.robust.ChangeQuickRedirect r9 = f2507a
            r10 = 1
            r11 = 18274(0x4762, float:2.5607E-41)
            java.lang.Class[] r12 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r12[r15] = r0
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            r12[r6] = r0
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            r7 = r2
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0041:
            r8 = 0
            if (r17 != 0) goto L_0x0045
            return r8
        L_0x0045:
            java.lang.String r1 = r17.getScheme()
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x010a
            java.lang.String r2 = "file"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0059
            goto L_0x010a
        L_0x0059:
            java.lang.String r2 = "http"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0066
            java.lang.String r0 = r17.toString()
            return r0
        L_0x0066:
            java.lang.String r2 = "content"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0109
            java.lang.String[] r11 = new java.lang.String[r6]
            java.lang.String r1 = "_data"
            r11[r15] = r1
            java.lang.String r9 = ""
            android.content.ContentResolver r1 = r16.getContentResolver()     // Catch:{ Exception -> 0x00a3, all -> 0x009b }
            r4 = 0
            r5 = 0
            r10 = 0
            r2 = r17
            r3 = r11
            r12 = 1
            r6 = r10
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00a4, all -> 0x009b }
            boolean r2 = r1.moveToFirst()     // Catch:{ Exception -> 0x00a5, all -> 0x0099 }
            if (r2 == 0) goto L_0x0091
            java.lang.String r2 = r1.getString(r15)     // Catch:{ Exception -> 0x00a5, all -> 0x0099 }
            r9 = r2
        L_0x0091:
            if (r1 == 0) goto L_0x0096
            r1.close()     // Catch:{ Exception -> 0x00a5, all -> 0x0099 }
        L_0x0096:
            if (r1 == 0) goto L_0x00aa
            goto L_0x00a7
        L_0x0099:
            r0 = move-exception
            goto L_0x009d
        L_0x009b:
            r0 = move-exception
            r1 = r8
        L_0x009d:
            if (r1 == 0) goto L_0x00a2
            r1.close()     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            throw r0
        L_0x00a3:
            r12 = 1
        L_0x00a4:
            r1 = r8
        L_0x00a5:
            if (r1 == 0) goto L_0x00aa
        L_0x00a7:
            r1.close()     // Catch:{ Exception -> 0x00aa }
        L_0x00aa:
            r2 = r1
            r1 = r9
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r1)
            if (r3 == 0) goto L_0x0108
            android.content.ContentResolver r9 = r16.getContentResolver()     // Catch:{ Exception -> 0x0104, all -> 0x00fd }
            java.lang.String r0 = "_id= ?"
            java.lang.String r3 = r17.getLastPathSegment()     // Catch:{ Exception -> 0x0104, all -> 0x00fd }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0104, all -> 0x00fd }
            r5 = 19
            if (r4 < r5) goto L_0x00d8
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0104, all -> 0x00fd }
            if (r4 != 0) goto L_0x00d8
            java.lang.String r4 = ":"
            boolean r4 = r3.contains(r4)     // Catch:{ Exception -> 0x0104, all -> 0x00fd }
            if (r4 == 0) goto L_0x00d8
            java.lang.String r4 = ":"
            java.lang.String[] r3 = r3.split(r4)     // Catch:{ Exception -> 0x0104, all -> 0x00fd }
            r3 = r3[r12]     // Catch:{ Exception -> 0x0104, all -> 0x00fd }
        L_0x00d8:
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ Exception -> 0x0104, all -> 0x00fd }
            r13[r15] = r3     // Catch:{ Exception -> 0x0104, all -> 0x00fd }
            android.net.Uri r10 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0104, all -> 0x00fd }
            r14 = 0
            r12 = r0
            android.database.Cursor r3 = r9.query(r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0104, all -> 0x00fd }
            boolean r0 = r3.moveToFirst()     // Catch:{ Exception -> 0x0105, all -> 0x00fa }
            if (r0 == 0) goto L_0x00ef
            java.lang.String r0 = r3.getString(r15)     // Catch:{ Exception -> 0x0105, all -> 0x00fa }
            r1 = r0
        L_0x00ef:
            if (r3 == 0) goto L_0x00f4
            r3.close()     // Catch:{ Exception -> 0x0105, all -> 0x00fa }
        L_0x00f4:
            if (r3 == 0) goto L_0x0108
        L_0x00f6:
            r3.close()     // Catch:{ Exception -> 0x0108 }
            goto L_0x0108
        L_0x00fa:
            r0 = move-exception
            r2 = r3
            goto L_0x00fe
        L_0x00fd:
            r0 = move-exception
        L_0x00fe:
            if (r2 == 0) goto L_0x0103
            r2.close()     // Catch:{ Exception -> 0x0103 }
        L_0x0103:
            throw r0
        L_0x0104:
            r3 = r2
        L_0x0105:
            if (r3 == 0) goto L_0x0108
            goto L_0x00f6
        L_0x0108:
            return r1
        L_0x0109:
            return r8
        L_0x010a:
            java.lang.String r0 = r17.getPath()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.e.a(android.content.Context, android.net.Uri):java.lang.String");
    }

    public static void a(StringBuilder sb) {
        StringBuilder sb2 = sb;
        if (PatchProxy.isSupport(new Object[]{sb2}, null, f2507a, true, 18290, new Class[]{StringBuilder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sb2}, null, f2507a, true, 18290, new Class[]{StringBuilder.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{sb2, (byte) 0}, null, f2507a, true, 18291, new Class[]{StringBuilder.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sb2, (byte) 0}, null, f2507a, true, 18291, new Class[]{StringBuilder.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        AppLog.appendCommonParams(sb2, false);
    }

    public static Uri a(Context context, File file) {
        Uri uri;
        Context context2 = context;
        File file2 = file;
        if (PatchProxy.isSupport(new Object[]{context2, file2}, null, f2507a, true, 18268, new Class[]{Context.class, File.class}, Uri.class)) {
            return (Uri) PatchProxy.accessDispatch(new Object[]{context2, file2}, null, f2507a, true, 18268, new Class[]{Context.class, File.class}, Uri.class);
        }
        if (context2 == null || Build.VERSION.SDK_INT < 24 || context.getApplicationInfo().targetSdkVersion < 24) {
            uri = Uri.fromFile(file);
        } else {
            uri = FileProvider.getUriForFile(context2, context.getPackageName() + ".fileprovider", file2);
        }
        return uri;
    }

    public static boolean b(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{context2, str2}, null, f2507a, true, 18279, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return com.ss.android.newmedia.a.b.a(context2, str2, null);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f2507a, true, 18279, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
    }

    public static int c(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, f2507a, true, 18282, new Class[]{Context.class, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context, str2}, null, f2507a, true, 18282, new Class[]{Context.class, String.class}, Integer.TYPE)).intValue();
        }
        int i = -1;
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                i = context.getPackageManager().getPackageInfo(str2, 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return i;
    }

    public static int a(Context context, Throwable th) {
        int i;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{context, th2}, null, f2507a, true, 18242, new Class[]{Context.class, Throwable.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context, th2}, null, f2507a, true, 18242, new Class[]{Context.class, Throwable.class}, Integer.TYPE)).intValue();
        }
        if (th2 instanceof ConnectTimeoutException) {
            i = 13;
        } else if (th2 instanceof SocketTimeoutException) {
            i = 14;
        } else {
            if (!(th2 instanceof SocketException)) {
                if (th2 instanceof SSLPeerUnverifiedException) {
                    i = 21;
                } else if (th2 instanceof b) {
                    if (((b) th2).getStatusCode() == 503) {
                        i = 19;
                    } else {
                        i = 16;
                    }
                } else if (!(th2 instanceof IOException)) {
                    i = 18;
                }
            }
            i = 15;
        }
        if (context != null && ((i == 15 || i == 14) && !NetworkUtils.isNetworkAvailable(context))) {
            i = 12;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007b, code lost:
        if (r1 != null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
        if (r1 != null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.net.Uri a(android.content.Context r19, java.lang.String r20) {
        /*
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r19
            r11 = 1
            r3[r11] = r20
            com.meituan.robust.ChangeQuickRedirect r5 = f2507a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class<android.net.Uri> r9 = android.net.Uri.class
            r4 = 0
            r6 = 1
            r7 = 18273(0x4761, float:2.5606E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0042
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r19
            r12[r11] = r20
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f2507a
            r15 = 1
            r16 = 18273(0x4761, float:2.5606E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<android.net.Uri> r18 = android.net.Uri.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            android.net.Uri r0 = (android.net.Uri) r0
            return r0
        L_0x0042:
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r20)
            r3 = 0
            if (r2 == 0) goto L_0x004a
            return r3
        L_0x004a:
            android.content.ContentResolver r4 = r19.getContentResolver()     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            java.lang.String r7 = "_data= ?"
            java.lang.String[] r8 = new java.lang.String[r11]     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            r8[r10] = r20     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            java.lang.String r0 = "_id"
            r6[r10] = r0     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            android.net.Uri r5 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            r9 = 0
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            boolean r0 = r1.moveToFirst()     // Catch:{ Exception -> 0x0089, all -> 0x007e }
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = r1.getString(r10)     // Catch:{ Exception -> 0x0089, all -> 0x007e }
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0089, all -> 0x007e }
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0089, all -> 0x007e }
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r2, r4)     // Catch:{ Exception -> 0x0089, all -> 0x007e }
            if (r1 == 0) goto L_0x007a
            r1.close()
        L_0x007a:
            return r0
        L_0x007b:
            if (r1 == 0) goto L_0x008e
            goto L_0x008b
        L_0x007e:
            r0 = move-exception
            r3 = r1
            goto L_0x0082
        L_0x0081:
            r0 = move-exception
        L_0x0082:
            if (r3 == 0) goto L_0x0087
            r3.close()
        L_0x0087:
            throw r0
        L_0x0088:
            r1 = r3
        L_0x0089:
            if (r1 == 0) goto L_0x008e
        L_0x008b:
            r1.close()
        L_0x008e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.e.a(android.content.Context, java.lang.String):android.net.Uri");
    }

    public static long a(String str, String str2, Context context, boolean z, JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{str, str2, context, Byte.valueOf(z ? (byte) 1 : 0), null}, null, f2507a, true, 18251, new Class[]{String.class, String.class, Context.class, Boolean.TYPE, JSONObject.class}, Long.TYPE)) {
            Object[] objArr = {str, str2, context, Byte.valueOf(z), null};
            return ((Long) PatchProxy.accessDispatch(objArr, null, f2507a, true, 18251, new Class[]{String.class, String.class, Context.class, Boolean.TYPE, JSONObject.class}, Long.TYPE)).longValue();
        }
        Object[] objArr2 = {str, str2, context, Byte.valueOf(z), null, null, null};
        if (!PatchProxy.isSupport(objArr2, null, f2507a, true, 18254, new Class[]{String.class, String.class, Context.class, Boolean.TYPE, String.class, List.class, JSONObject.class}, Long.TYPE)) {
            return a(str, str2, context, z, null, null, true, null);
        }
        Object[] objArr3 = {str, str2, context, Byte.valueOf(z), null, null, null};
        return ((Long) PatchProxy.accessDispatch(objArr3, null, f2507a, true, 18254, new Class[]{String.class, String.class, Context.class, Boolean.TYPE, String.class, List.class, JSONObject.class}, Long.TYPE)).longValue();
    }

    public static long a(String str, String str2, Context context, boolean z, String str3, List<a> list, boolean z2, JSONObject jSONObject) {
        if (!PatchProxy.isSupport(new Object[]{str, str2, context, Byte.valueOf(z ? (byte) 1 : 0), str3, list, (byte) 1, jSONObject}, null, f2507a, true, 18255, new Class[]{String.class, String.class, Context.class, Boolean.TYPE, String.class, List.class, Boolean.TYPE, JSONObject.class}, Long.TYPE)) {
            return a(str, str2, context, z, str3, list, true, true, false, false, jSONObject);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{str, str2, context, Byte.valueOf(z), str3, list, (byte) 1, jSONObject}, null, f2507a, true, 18255, new Class[]{String.class, String.class, Context.class, Boolean.TYPE, String.class, List.class, Boolean.TYPE, JSONObject.class}, Long.TYPE)).longValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x01af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long a(java.lang.String r26, java.lang.String r27, android.content.Context r28, boolean r29, java.lang.String r30, java.util.List<com.ss.android.http.a.a> r31, boolean r32, boolean r33, boolean r34, boolean r35, org.json.JSONObject r36) {
        /*
            r6 = r28
            r0 = r36
            r2 = 11
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r3 = 0
            r8[r3] = r26
            r15 = 1
            r8[r15] = r27
            r14 = 2
            r8[r14] = r6
            java.lang.Byte r9 = java.lang.Byte.valueOf(r29)
            r16 = 3
            r8[r16] = r9
            r17 = 4
            r8[r17] = r30
            r18 = 5
            r8[r18] = r31
            java.lang.Byte r9 = java.lang.Byte.valueOf(r15)
            r19 = 6
            r8[r19] = r9
            java.lang.Byte r9 = java.lang.Byte.valueOf(r15)
            r20 = 7
            r8[r20] = r9
            java.lang.Byte r9 = java.lang.Byte.valueOf(r3)
            r21 = 8
            r8[r21] = r9
            java.lang.Byte r9 = java.lang.Byte.valueOf(r3)
            r13 = 9
            r8[r13] = r9
            r22 = 10
            r8[r22] = r0
            com.meituan.robust.ChangeQuickRedirect r10 = f2507a
            java.lang.Class[] r12 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r12[r3] = r9
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r12[r15] = r9
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            r12[r14] = r9
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r12[r16] = r9
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r12[r17] = r9
            java.lang.Class<java.util.List> r9 = java.util.List.class
            r12[r18] = r9
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r12[r19] = r9
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r12[r20] = r9
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r12[r21] = r9
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r12[r13] = r9
            java.lang.Class<org.json.JSONObject> r9 = org.json.JSONObject.class
            r12[r22] = r9
            java.lang.Class r23 = java.lang.Long.TYPE
            r9 = 0
            r11 = 1
            r24 = 18256(0x4750, float:2.5582E-41)
            r25 = r12
            r12 = r24
            r13 = r25
            r14 = r23
            boolean r8 = com.meituan.robust.PatchProxy.isSupport(r8, r9, r10, r11, r12, r13, r14)
            if (r8 == 0) goto L_0x0107
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r8[r3] = r26
            r8[r15] = r27
            r9 = 2
            r8[r9] = r6
            java.lang.Byte r1 = java.lang.Byte.valueOf(r29)
            r8[r16] = r1
            r8[r17] = r30
            r8[r18] = r31
            java.lang.Byte r1 = java.lang.Byte.valueOf(r15)
            r8[r19] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r15)
            r8[r20] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r3)
            r8[r21] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r3)
            r14 = 9
            r8[r14] = r1
            r8[r22] = r0
            r0 = 0
            com.meituan.robust.ChangeQuickRedirect r1 = f2507a
            r4 = 1
            r5 = 18256(0x4750, float:2.5582E-41)
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r2[r3] = r6
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r15] = r3
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r9] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r2[r16] = r3
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r17] = r3
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r2[r18] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r2[r19] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r2[r20] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r2[r21] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r2[r14] = r3
            java.lang.Class<org.json.JSONObject> r3 = org.json.JSONObject.class
            r2[r22] = r3
            java.lang.Class r3 = java.lang.Long.TYPE
            r26 = r8
            r27 = r0
            r28 = r1
            r29 = r4
            r30 = r5
            r31 = r2
            r32 = r3
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r26, r27, r28, r29, r30, r31, r32)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L_0x0107:
            r9 = 2
            r14 = 9
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r26)
            r17 = -1
            if (r2 != 0) goto L_0x01db
            if (r6 != 0) goto L_0x0116
            goto L_0x01db
        L_0x0116:
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r2[r3] = r6
            r2[r15] = r0
            r20 = 0
            com.meituan.robust.ChangeQuickRedirect r21 = f2507a
            r22 = 1
            r23 = 18288(0x4770, float:2.5627E-41)
            java.lang.Class[] r8 = new java.lang.Class[r9]
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            r8[r3] = r10
            java.lang.Class<org.json.JSONObject> r10 = org.json.JSONObject.class
            r8[r15] = r10
            java.lang.Class r25 = java.lang.Void.TYPE
            r19 = r2
            r24 = r8
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r19, r20, r21, r22, r23, r24, r25)
            if (r2 == 0) goto L_0x015e
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r2[r3] = r6
            r2[r15] = r0
            r20 = 0
            com.meituan.robust.ChangeQuickRedirect r21 = f2507a
            r22 = 1
            r23 = 18288(0x4770, float:2.5627E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            r0[r3] = r8
            java.lang.Class<org.json.JSONObject> r3 = org.json.JSONObject.class
            r0[r15] = r3
            java.lang.Class r25 = java.lang.Void.TYPE
            r19 = r2
            r24 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r19, r20, r21, r22, r23, r24, r25)
        L_0x015b:
            r0 = 9
            goto L_0x0188
        L_0x015e:
            if (r6 == 0) goto L_0x015b
            if (r0 != 0) goto L_0x0163
            goto L_0x0175
        L_0x0163:
            java.lang.String r2 = "label"
            java.lang.String r11 = r0.optString(r2)     // Catch:{ Exception -> 0x015b }
            java.lang.String r2 = "ext_json"
            org.json.JSONObject r16 = r0.optJSONObject(r2)     // Catch:{ Exception -> 0x015b }
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r11)     // Catch:{ Exception -> 0x015b }
            if (r0 == 0) goto L_0x0176
        L_0x0175:
            goto L_0x015b
        L_0x0176:
            java.lang.String r9 = "wap_stat"
            java.lang.String r10 = "app_download"
            r12 = 0
            r2 = 0
            r8 = r28
            r0 = 9
            r14 = r2
            com.ss.android.common.lib.a.a(r8, r9, r10, r11, r12, r14, r16)     // Catch:{ Exception -> 0x0187 }
            goto L_0x0188
        L_0x0187:
        L_0x0188:
            com.ss.android.newmedia.BaseAppData r2 = com.ss.android.newmedia.BaseAppData.a()
            boolean r2 = r2.m()
            r9 = 0
            if (r2 == 0) goto L_0x01af
            r8 = 1
            r11 = 1
            r12 = 0
            r0 = r26
            r1 = r27
            r2 = r29
            r3 = r28
            r4 = r30
            r5 = r31
            r6 = r8
            r7 = r11
            r8 = r12
            long r0 = com.ss.android.newmedia.app.c.a(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 < 0) goto L_0x01da
            return r0
        L_0x01af:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r0) goto L_0x01cb
            r8 = 1
            r0 = r26
            r1 = r27
            r2 = r29
            r3 = r28
            r4 = r30
            r5 = r31
            r11 = r6
            r6 = r8
            long r0 = com.ss.android.newmedia.app.d.a(r0, r1, r2, r3, r4, r5, r6)
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 < 0) goto L_0x01cc
            return r0
        L_0x01cb:
            r11 = r6
        L_0x01cc:
            android.net.Uri r0 = android.net.Uri.parse(r26)     // Catch:{ Exception -> 0x01da }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x01da }
            java.lang.String r2 = "android.intent.action.VIEW"
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x01da }
            r11.startActivity(r1)     // Catch:{ Exception -> 0x01da }
        L_0x01da:
            return r17
        L_0x01db:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.e.a(java.lang.String, java.lang.String, android.content.Context, boolean, java.lang.String, java.util.List, boolean, boolean, boolean, boolean, org.json.JSONObject):long");
    }
}
