package com.huawei.android.pushselfshow.richpush.html;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushagent.utils.a.h;
import com.huawei.android.pushselfshow.richpush.html.api.ExposedJsApi;
import com.huawei.android.pushselfshow.richpush.tools.Console;
import com.huawei.android.pushselfshow.richpush.tools.a;
import com.huawei.android.pushselfshow.utils.b.b;
import com.huawei.android.pushselfshow.utils.c;
import com.huawei.android.pushselfshow.utils.d;
import java.io.File;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class HtmlViewer implements c.a {

    /* renamed from: a  reason: collision with root package name */
    PageProgressView f25257a;

    /* renamed from: b  reason: collision with root package name */
    c f25258b = new c(this);

    /* renamed from: c  reason: collision with root package name */
    c f25259c = new c(this);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Activity f25260d;
    public b dtl;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public WebView f25261e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public a f25262f;
    /* access modifiers changed from: private */
    public com.huawei.android.pushselfshow.b.a g;
    private String h;
    private ExposedJsApi i;
    /* access modifiers changed from: private */
    public MenuItem j;
    /* access modifiers changed from: private */
    public MenuItem k;
    /* access modifiers changed from: private */
    public MenuItem l;
    private boolean m;
    private boolean n;
    /* access modifiers changed from: private */
    public boolean o;
    private AlertDialog p = null;
    private AlertDialog q = null;
    /* access modifiers changed from: private */
    public boolean r = false;

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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.SecurityException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.lang.NoSuchMethodException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: java.lang.IllegalArgumentException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: java.lang.IllegalAccessException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: java.lang.reflect.InvocationTargetException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.lang.InstantiationException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: java.lang.SecurityException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: java.lang.SecurityException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: java.lang.SecurityException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: java.lang.SecurityException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: java.lang.SecurityException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: java.lang.SecurityException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View a(android.content.Context r13) {
        /*
            r12 = this;
            java.lang.String r0 = "layout_inflater"
            java.lang.Object r0 = r13.getSystemService(r0)
            android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
            java.lang.String r1 = "hwpush_collect_tip_image"
            int r1 = com.huawei.android.pushselfshow.utils.d.c(r13, r1)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            java.lang.String r1 = "huawei.android.widget.DialogContentHelper"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            r3 = 3
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            r6 = 0
            r4[r6] = r5     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            r7 = 1
            r4[r7] = r5     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r8 = 2
            r4[r8] = r5     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            java.lang.reflect.Constructor r4 = r1.getDeclaredConstructor(r4)     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            r3[r6] = r5     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            r3[r7] = r5     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            r3[r8] = r13     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            java.lang.Object r3 = r4.newInstance(r3)     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            java.lang.String r4 = "beginLayout"
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            java.lang.reflect.Method r4 = r1.getDeclaredMethod(r4, r5)     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            java.lang.String r5 = "insertView"
            java.lang.Class[] r9 = new java.lang.Class[r8]     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            java.lang.Class<android.view.View> r10 = android.view.View.class
            r9[r6] = r10     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            java.lang.Class<android.view.View$OnClickListener> r10 = android.view.View.OnClickListener.class
            r9[r7] = r10     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            java.lang.reflect.Method r5 = r1.getDeclaredMethod(r5, r9)     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            java.lang.String r9 = "insertBodyText"
            java.lang.Class[] r10 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            java.lang.Class<java.lang.CharSequence> r11 = java.lang.CharSequence.class
            r10[r6] = r11     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            java.lang.reflect.Method r9 = r1.getDeclaredMethod(r9, r10)     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            java.lang.String r10 = "endLayout"
            java.lang.Class[] r11 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r10, r11)     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            r4.invoke(r3, r10)     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            r4[r6] = r0     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            r4[r7] = r2     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            r5.invoke(r3, r4)     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            android.app.Activity r0 = r12.f25260d     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            java.lang.String r4 = "hwpush_collect_tip"
            int r13 = com.huawei.android.pushselfshow.utils.d.a(r13, r4)     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            java.lang.String r13 = r0.getString(r13)     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            r0[r6] = r13     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            r9.invoke(r3, r0)     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            java.lang.Object r13 = r1.invoke(r3, r13)     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            android.view.View r13 = (android.view.View) r13     // Catch:{ ClassNotFoundException -> 0x00c8, SecurityException -> 0x00bd, NoSuchMethodException -> 0x00b5, IllegalArgumentException -> 0x00ad, IllegalAccessException -> 0x00a5, InvocationTargetException -> 0x009d, InstantiationException -> 0x0095 }
            goto L_0x00d0
        L_0x0095:
            r13 = move-exception
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.String r1 = r13.toString()
            goto L_0x00c4
        L_0x009d:
            r13 = move-exception
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.String r1 = r13.toString()
            goto L_0x00c4
        L_0x00a5:
            r13 = move-exception
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.String r1 = r13.toString()
            goto L_0x00c4
        L_0x00ad:
            r13 = move-exception
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.String r1 = r13.toString()
            goto L_0x00c4
        L_0x00b5:
            r13 = move-exception
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.String r1 = r13.toString()
            goto L_0x00c4
        L_0x00bd:
            r13 = move-exception
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.String r1 = r13.toString()
        L_0x00c4:
            com.huawei.android.pushagent.utils.a.e.c(r0, r1, r13)
            goto L_0x00cf
        L_0x00c8:
            java.lang.String r13 = "PushSelfShowLog"
            java.lang.String r0 = "DialogContentHelper ClassNotFoundException"
            com.huawei.android.pushagent.utils.a.e.d(r13, r0)
        L_0x00cf:
            r13 = r2
        L_0x00d0:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushselfshow.richpush.html.HtmlViewer.a(android.content.Context):android.view.View");
    }

    private void a() {
        this.f25261e.getSettings().setJavaScriptEnabled(true);
        if (Build.VERSION.SDK_INT >= 11 && Build.VERSION.SDK_INT <= 16) {
            this.f25261e.removeJavascriptInterface("searchBoxJavaBridge_");
            this.f25261e.removeJavascriptInterface("accessibility");
            this.f25261e.removeJavascriptInterface("accessibilityTraversal");
        }
        if (Build.VERSION.SDK_INT <= 18) {
            this.f25261e.getSettings().setSavePassword(false);
        }
        this.f25261e.getSettings().setPluginState(WebSettings.PluginState.ON);
        this.f25261e.getSettings().setLoadsImagesAutomatically(true);
        this.f25261e.getSettings().setDomStorageEnabled(true);
        this.f25261e.getSettings().setSupportZoom(true);
        this.f25261e.setScrollBarStyle(0);
        this.f25261e.setHorizontalScrollBarEnabled(false);
        this.f25261e.setVerticalScrollBarEnabled(false);
        this.f25261e.getSettings().setSupportMultipleWindows(true);
        this.f25261e.setDownloadListener(new a(this));
        this.f25261e.setOnTouchListener(new c(this));
        this.f25261e.setWebChromeClient(new d(this));
        this.f25261e.setWebViewClient(new e(this));
    }

    /* access modifiers changed from: private */
    public void a(Activity activity) {
        if (activity != null) {
            this.l.setEnabled(false);
            this.r = true;
            if (Build.VERSION.SDK_INT < 23 || com.huawei.android.pushselfshow.utils.a.e(activity) || !com.huawei.android.pushselfshow.utils.a.f(activity) || activity.checkSelfPermission("com.huawei.pushagent.permission.RICHMEDIA_PROVIDER") == 0) {
                new Thread(new h(this, activity)).start();
                return;
            }
            a(new String[]{"com.huawei.pushagent.permission.RICHMEDIA_PROVIDER"}, 10003);
        }
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        ActionBar actionBar = this.f25260d.getActionBar();
        if (actionBar != null) {
            actionBar.setTitle(str);
        }
    }

    private void a(String[] strArr, int i2) {
        try {
            Intent intent = new Intent("huawei.intent.action.REQUEST_PERMISSIONS");
            intent.setPackage("com.huawei.systemmanager");
            intent.putExtra("KEY_HW_PERMISSION_ARRAY", strArr);
            intent.putExtra("KEY_HW_PERMISSION_PKG", this.f25260d.getPackageName());
            if (com.huawei.android.pushselfshow.utils.a.a((Context) this.f25260d, "com.huawei.systemmanager", intent).booleanValue()) {
                try {
                    e.b("PushSelfShowLog", "checkAndRequestPermission: systemmanager permission activity is exist");
                    this.f25260d.startActivityForResult(intent, i2);
                } catch (Exception e2) {
                    e.c("PushSelfShowLog", "checkAndRequestPermission: Exception", e2);
                    this.f25260d.requestPermissions(strArr, i2);
                }
                return;
            }
            e.b("PushSelfShowLog", "checkAndRequestPermission: systemmanager permission activity is not exist");
            this.f25260d.requestPermissions(strArr, i2);
        } catch (Exception e3) {
            e.c("PushSelfShowLog", e3.toString(), e3);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int b(android.app.Activity r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "SELECT pushmsg._id,pushmsg.msg,pushmsg.token,pushmsg.url,notify.bmp FROM pushmsg LEFT OUTER JOIN notify ON pushmsg.url = notify.url order by pushmsg._id desc limit 1000;"
            r2 = 0
            com.huawei.android.pushselfshow.richpush.a.b r3 = com.huawei.android.pushselfshow.richpush.a.b.a()     // Catch:{ Exception -> 0x0027 }
            android.net.Uri r4 = com.huawei.android.pushselfshow.richpush.provider.RichMediaProvider.a.f25355f     // Catch:{ Exception -> 0x0027 }
            android.database.Cursor r6 = r3.a((android.content.Context) r6, (android.net.Uri) r4, (java.lang.String) r1, (java.lang.String[]) r2)     // Catch:{ Exception -> 0x0027 }
            if (r6 == 0) goto L_0x001f
            int r1 = r6.getCount()     // Catch:{ Exception -> 0x001c, all -> 0x0019 }
            r0 = r1
            goto L_0x001f
        L_0x0019:
            r0 = move-exception
            r2 = r6
            goto L_0x004a
        L_0x001c:
            r1 = move-exception
            r2 = r6
            goto L_0x0028
        L_0x001f:
            if (r6 == 0) goto L_0x0036
            r6.close()
            goto L_0x0036
        L_0x0025:
            r0 = move-exception
            goto L_0x004a
        L_0x0027:
            r1 = move-exception
        L_0x0028:
            java.lang.String r6 = "PushSelfShowLog"
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x0025 }
            com.huawei.android.pushagent.utils.a.e.c(r6, r3, r1)     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0036
            r2.close()
        L_0x0036:
            java.lang.String r6 = "PushSelfShowLog"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "currentExistCount:"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.huawei.android.pushagent.utils.a.e.a(r6, r1)
            return r0
        L_0x004a:
            if (r2 == 0) goto L_0x004f
            r2.close()
        L_0x004f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushselfshow.richpush.html.HtmlViewer.b(android.app.Activity):int");
    }

    private void c(Activity activity) {
        this.q = new AlertDialog.Builder(activity, com.huawei.android.pushselfshow.utils.a.h(activity)).setTitle(d.a(activity, "hwpush_dialog_limit_title")).setMessage(d.a(activity, "hwpush_dialog_limit_message")).setNegativeButton(17039360, null).setPositiveButton(d.a(activity, "hwpush_dialog_limit_ok"), new j(this)).setOnDismissListener(new i(this, activity)).create();
        this.q.show();
    }

    /* access modifiers changed from: private */
    public void d(Activity activity) {
        if (activity != null) {
            Intent intent = new Intent("com.huawei.android.push.intent.RICHPUSH");
            intent.putExtra("type", "favorite");
            if (this.g != null) {
                intent.putExtra("selfshow_info", this.g.c());
                intent.putExtra("selfshow_token", this.g.d());
            }
            intent.setFlags(268468240);
            intent.putExtra("selfshowMsgOutOfBound", true);
            intent.setPackage(activity.getPackageName());
            activity.finish();
            activity.startActivity(intent);
        }
    }

    public void downLoadFailed() {
        e.a("PushSelfShowLog", "downLoadFailed:");
        this.f25259c = null;
        showErrorHtmlURI(com.huawei.android.pushselfshow.utils.a.a((Context) this.f25260d, "富媒体文件下载失败", "Failed to load the message."));
    }

    public void downLoadSuccess(String str) {
        try {
            e.a("PushSelfShowLog", "downLoadSuccess:" + str + "，and start loadLocalZip");
            loadLocalZip(str);
        } catch (Exception e2) {
            e.c("PushSelfShowLog", "downLoadSuccess failed", e2);
        }
    }

    public void enableJavaJS(String str) {
        ExposedJsApi exposedJsApi;
        try {
            e.a("PushSelfShowLog", "enable JavaJs support and indexFileUrl is " + str);
            String str2 = null;
            if (str != null) {
                str2 = str.substring(0, str.lastIndexOf("/"));
            }
            e.a("PushSelfShowLog", "m_activity is " + this.f25260d);
            e.a("PushSelfShowLog", "webView is " + this.f25261e);
            e.a("PushSelfShowLog", "localPath is " + str2);
            if (this.g.H != 0) {
                e.a("PushSelfShowLog", "pushmsg.needUserId true");
                exposedJsApi = new ExposedJsApi(this.f25260d, this.f25261e, str2, true);
            } else {
                e.a("PushSelfShowLog", "pushmsg.needUserId false");
                exposedJsApi = new ExposedJsApi(this.f25260d, this.f25261e, str2, false);
            }
            this.i = exposedJsApi;
            this.f25261e.addJavascriptInterface(new Console(), "console");
            this.f25261e.addJavascriptInterface(this.i, "_nativeApi");
        } catch (Exception e2) {
            e.c("PushSelfShowLog", "enable JavaJs support failed ", e2);
        }
    }

    public void handleMessage(Message message) {
        e.a("PushSelfShowLog", "handleMessage " + message.what + "," + message.toString());
        int i2 = message.what;
        if (i2 != 1000) {
            switch (i2) {
                case 1:
                    downLoadSuccess((String) message.obj);
                    return;
                case 2:
                    downLoadFailed();
                    return;
                case 3:
                    return;
            }
        } else {
            c(this.f25260d);
        }
    }

    public void loadLocalZip(String str) {
        if (str != null && str.length() > 0) {
            this.h = com.huawei.android.pushselfshow.richpush.tools.d.a(this.f25260d, str);
            if (this.h == null || this.h.length() <= 0) {
                e.d("PushSelfShowLog", "check index.html file failed");
                this.f25259c = null;
            } else {
                Uri fromFile = Uri.fromFile(new File(this.h));
                enableJavaJS(this.h);
                this.g.D = fromFile.toString();
                this.g.F = "text/html_local";
                this.f25262f.a(this.g);
                _lancet.com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(this.f25261e, fromFile.toString());
                return;
            }
        }
        showErrorHtmlURI(com.huawei.android.pushselfshow.utils.a.a((Context) this.f25260d, "富媒体内容不正确", "Invalid content."));
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        try {
            e.a("PushSelfShowLog", "run HtmlViewer onActivityResult");
            if (this.i != null) {
                this.i.onActivityResult(i2, i3, intent);
            }
            if (10003 == i2) {
                if (i3 == 0) {
                    e.b("PushSelfShowLog", "onActivityResult: RESULT_CANCELED");
                    this.l.setEnabled(true);
                } else if (-1 == i3) {
                    e.b("PushSelfShowLog", "onActivityResult: RESULT_OK");
                    if (this.f25260d.checkSelfPermission("com.huawei.pushagent.permission.RICHMEDIA_PROVIDER") == 0) {
                        e.b("PushSelfShowLog", "onActivityResult: Permission is granted");
                        new Thread(new f(this)).start();
                    }
                    this.l.setEnabled(true);
                }
                this.r = false;
            } else if (10004 == i2) {
                if (!(this.g == null || this.f25259c == null)) {
                    this.dtl = new b(this.f25259c, this.f25260d, this.g.D, com.huawei.android.pushselfshow.richpush.tools.b.a("application/zip"));
                    this.dtl.b();
                }
            } else if (10005 == i2 && this.g != null) {
                loadLocalZip(this.g.D);
            }
        } catch (Exception e2) {
            e.c("PushSelfShowLog", e2.toString(), e2);
        }
    }

    public void onCreate(Intent intent) {
        e.b("PushSelfShowLog", "HtmlViewer onCreate");
        if (intent == null) {
            e.b("PushSelfShowLog", "onCreate, intent is null");
            return;
        }
        try {
            this.m = intent.getBooleanExtra("selfshow_from_list", false);
            this.r = intent.getBooleanExtra("collect_img_disable", false);
            e.a("PushSelfShowLog", "mCollectImgDisable:" + this.r);
            this.f25262f = new a(this.f25260d);
            ActionBar actionBar = this.f25260d.getActionBar();
            if (actionBar != null) {
                actionBar.setDisplayHomeAsUpEnabled(true);
            }
            this.f25260d.setRequestedOrientation(5);
            RelativeLayout relativeLayout = new RelativeLayout(this.f25260d);
            String str = null;
            RelativeLayout relativeLayout2 = (RelativeLayout) this.f25260d.getLayoutInflater().inflate(d.c(this.f25260d, "hwpush_msg_show"), null);
            relativeLayout.addView(relativeLayout2);
            this.f25260d.setContentView(relativeLayout);
            this.f25257a = (PageProgressView) relativeLayout2.findViewById(d.e(this.f25260d, "hwpush_progressbar"));
            this.f25261e = (WebView) relativeLayout2.findViewById(d.e(this.f25260d, "hwpush_msg_show_view"));
            a();
            if (intent.hasExtra("selfshow_info")) {
                this.g = new com.huawei.android.pushselfshow.b.a(intent.getByteArrayExtra("selfshow_info"), intent.getByteArrayExtra("selfshow_token"));
                if (!this.g.b()) {
                    e.a("PushSelfShowLog", "parseMessage failed");
                    return;
                }
                e.a("PushSelfShowLog", "pushmsg.rpct:" + this.g.F);
                this.f25262f.a(this.g);
            } else {
                e.a("PushSelfShowLog", "pushmsg is null");
                showErrorHtmlURI(com.huawei.android.pushselfshow.utils.a.a((Context) this.f25260d, "富媒体内容不正确", "Invalid content."));
            }
            if (this.g != null) {
                e.a("PushSelfShowLog", "fileurl :" + this.g.D + ", the pushmsg is " + this.g.toString());
            } else {
                e.a("PushSelfShowLog", "pushmsg is null :");
                this.g = new com.huawei.android.pushselfshow.b.a();
            }
            e.b("PushSelfShowLog", "pushmsg.rpct:" + this.g.F);
            if ("application/zip".equals(this.g.F)) {
                if (-1 == com.huawei.android.pushagent.utils.a.b.a((Context) this.f25260d)) {
                    e.a("PushSelfShowLog", "no network. can not load message");
                } else {
                    this.dtl = new b(this.f25259c, this.f25260d, this.g.D, com.huawei.android.pushselfshow.richpush.tools.b.a("application/zip"));
                    this.dtl.b();
                }
            } else if ("application/zip_local".equals(this.g.F)) {
                loadLocalZip(this.g.D);
            } else {
                if (!"text/html".equals(this.g.F)) {
                    if (!"text/html_local".equals(this.g.F)) {
                        showErrorHtmlURI(com.huawei.android.pushselfshow.utils.a.a((Context) this.f25260d, "富媒体内容不正确", "Invalid content."));
                        return;
                    }
                }
                if ("text/html_local".equals(this.g.F)) {
                    str = this.g.D;
                }
                enableJavaJS(str);
                _lancet.com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(this.f25261e, this.g.D);
            }
        } catch (RuntimeException e2) {
            e.c("PushSelfShowLog", "call" + HtmlViewer.class.getName() + " onCreate(Intent intent) err: " + e2.toString(), e2);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        e.b("PushSelfShowLog", "HtmlViewer onCreateOptionsMenu:" + menu);
        this.f25260d.getMenuInflater().inflate(d.d(this.f25260d, "hwpush_msg_show_menu"), menu);
        return true;
    }

    public void onDestroy() {
        try {
            if (this.p != null && this.p.isShowing()) {
                this.p.dismiss();
            }
            if (this.q != null && this.q.isShowing()) {
                this.q.dismiss();
            }
            if (this.i != null) {
                this.i.onDestroy();
            }
            if (this.h != null && !this.o) {
                String substring = this.h.substring(0, this.h.lastIndexOf("/"));
                e.a("PushSelfShowLog", "try to remove dir " + substring);
                com.huawei.android.pushselfshow.utils.a.a(new File(substring));
            }
            if (this.dtl != null && this.dtl.f25378e) {
                e.a("PushSelfShowLog", "cancel ProgressDialog loading dialog when richpush file is downloading");
                this.dtl.a();
                this.f25259c = null;
            }
            this.f25261e.stopLoading();
            this.f25261e = null;
        } catch (Exception | IndexOutOfBoundsException unused) {
            e.a("PushSelfShowLog", "remove unsuccess ,maybe removed before");
        }
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 4 && keyEvent.getAction() == 0) {
            if (this.m) {
                Intent intent = new Intent("com.huawei.android.push.intent.RICHPUSH");
                intent.putExtra("type", "favorite");
                intent.setPackage(this.f25260d.getPackageName());
                this.f25260d.finish();
                this.f25260d.startActivity(intent);
            } else {
                this.f25260d.finish();
            }
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        e.b("PushSelfShowLog", "HtmlViewer onOptionsItemSelected:" + menuItem);
        if (menuItem == null) {
            e.d("PushSelfShowLog", "onOptionsItemSelected, item is null");
            return false;
        }
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onKeyDown(4, new KeyEvent(0, 4));
        } else if (itemId == d.e(this.f25260d, "hwpush_menu_back")) {
            if (this.f25261e != null && this.f25261e.canGoBack()) {
                e.a("PushSelfShowLog", "can go back " + this.f25261e.canGoBack());
                this.f25261e.goBack();
            }
        } else if (itemId == d.e(this.f25260d, "hwpush_menu_forward")) {
            if (this.f25261e != null && this.f25261e.canGoForward()) {
                e.a("PushSelfShowLog", " can Go Forward " + this.f25261e.canGoForward());
                this.f25261e.goForward();
            }
        } else if (itemId == d.e(this.f25260d, "hwpush_menu_refresh")) {
            setProgress(0);
            this.f25261e.reload();
        } else if (itemId == d.e(this.f25260d, "hwpush_menu_collect")) {
            h hVar = new h(this.f25260d, "push_client_self_info");
            if (!hVar.e("isFirstCollect")) {
                this.p = new AlertDialog.Builder(this.f25260d).setPositiveButton(d.a(this.f25260d, "hwpush_collect_tip_known"), new b(this, hVar)).create();
                if (com.huawei.android.pushagent.utils.a.b.a() > 9) {
                    View a2 = a((Context) this.f25260d);
                    if (a2 != null) {
                        this.p.setView(a2);
                        this.p.show();
                    }
                }
                this.p.setTitle(d.a(this.f25260d, "hwpush_msg_collect"));
                this.p.setMessage(this.f25260d.getString(d.a(this.f25260d, "hwpush_collect_tip")));
                this.p.show();
            } else {
                a(this.f25260d);
            }
        }
        return true;
    }

    public void onPause() {
        if (this.i != null) {
            this.i.onPause();
        }
        try {
            this.f25261e.getClass().getMethod("onPause", new Class[0]).invoke(this.f25261e, null);
        } catch (Exception e2) {
            e.c("PushSelfShowLog", "htmlviewer onpause error", e2);
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        e.b("PushSelfShowLog", "HtmlViewer onPrepareOptionsMenu:" + menu);
        this.j = menu.findItem(d.e(this.f25260d, "hwpush_menu_back"));
        this.k = menu.findItem(d.e(this.f25260d, "hwpush_menu_forward"));
        this.l = menu.findItem(d.e(this.f25260d, "hwpush_menu_collect"));
        if (this.f25261e != null) {
            if (this.f25261e.canGoBack()) {
                this.j.setEnabled(true);
            } else {
                this.j.setEnabled(false);
            }
            if (this.f25261e.canGoForward()) {
                this.k.setEnabled(true);
            } else {
                this.k.setEnabled(false);
            }
        }
        if (this.m || this.r) {
            this.l.setEnabled(false);
            this.r = true;
        }
        return true;
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        e.a("PushSelfShowLog", "enter HtmlViewer onRequestPermissionsResult");
        if (10003 != i2) {
            if (10004 == i2) {
                if (!(this.g == null || this.f25259c == null)) {
                    this.dtl = new b(this.f25259c, this.f25260d, this.g.D, com.huawei.android.pushselfshow.richpush.tools.b.a("application/zip"));
                    this.dtl.b();
                }
            } else if (10005 == i2 && this.g != null) {
                loadLocalZip(this.g.D);
            }
        } else if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
            this.l.setEnabled(true);
            this.r = false;
        } else {
            new Thread(new g(this)).start();
        }
    }

    public void onResume() {
        e.b("PushSelfShowLog", "HtmlViewer onResume");
        if (this.i != null) {
            this.i.onResume();
        }
        try {
            this.f25261e.getClass().getMethod("onResume", new Class[0]).invoke(this.f25261e, null);
        } catch (Exception e2) {
            e.c("PushSelfShowLog", "htmlviewer onResume error", e2);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("collect_img_disable", this.r);
    }

    public void onStop() {
        if (this.i != null) {
            this.i.onPause();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0110 A[Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0161 A[Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0187 A[Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01ae A[Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String prepareJS(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r0.<init>()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            android.app.Activity r1 = r9.f25260d     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r1 = com.huawei.android.pushselfshow.utils.b.b.b(r1)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r0.append(r1)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r1 = java.io.File.separator     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r0.append(r1)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            android.app.Activity r1 = r9.f25260d     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r2 = "."
            java.lang.String r3 = ""
            java.lang.String r1 = r1.replace(r2, r3)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r0.append(r1)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.io.File r1 = new java.io.File     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r1.<init>(r0)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            boolean r1 = r1.exists()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            if (r1 != 0) goto L_0x0045
            java.io.File r1 = new java.io.File     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r1.<init>(r0)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            boolean r1 = r1.mkdirs()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            if (r1 == 0) goto L_0x0045
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.String r2 = "mkdir true"
            com.huawei.android.pushagent.utils.a.e.e(r1, r2)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
        L_0x0045:
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r3 = "prepareJS fileHeader is "
            r2.<init>(r3)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r2.append(r0)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            com.huawei.android.pushagent.utils.a.e.e(r1, r2)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r2.<init>()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r2.append(r0)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r3 = java.io.File.separator     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r2.append(r3)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r3 = "newpush.js"
            r2.append(r3)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.io.File r3 = new java.io.File     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r3.<init>(r2)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            boolean r4 = r3.exists()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r5 = -1
            if (r4 == 0) goto L_0x00da
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            long r3 = r3.lastModified()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r8 = 0
            long r6 = r6 - r3
            r3 = 1300000000(0x4d7c6d00, double:6.422853396E-315)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x00c9
            java.lang.String r3 = "PushSelfShowLog"
            java.lang.String r4 = "new push.js may be out of date ,or try to update"
            com.huawei.android.pushagent.utils.a.e.a(r3, r4)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            android.app.Activity r3 = r9.f25260d     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            int r3 = com.huawei.android.pushagent.utils.a.b.a((android.content.Context) r3)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            if (r3 == r5) goto L_0x010e
            com.huawei.android.pushselfshow.utils.b.b r3 = new com.huawei.android.pushselfshow.utils.b.b     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r3.<init>()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            android.app.Activity r4 = r9.f25260d     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r5 = "http://open.hicloud.com/android/push1.0.js"
            boolean r3 = r3.b(r4, r5, r2)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            if (r3 == 0) goto L_0x010e
            java.io.File r3 = new java.io.File     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r3.<init>(r2)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            boolean r3 = r3.exists()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            if (r3 == 0) goto L_0x010e
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r4 = "prepareJS dlUtil.downLoadSgThread  pushUrl is "
            r3.<init>(r4)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r3.append(r2)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
        L_0x00c5:
            com.huawei.android.pushagent.utils.a.e.e(r1, r3)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            goto L_0x010d
        L_0x00c9:
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r4 = "prepareJS  not arrival update  pushUrl is "
            r3.<init>(r4)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r3.append(r2)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            goto L_0x00c5
        L_0x00da:
            android.app.Activity r3 = r9.f25260d     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            int r3 = com.huawei.android.pushagent.utils.a.b.a((android.content.Context) r3)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            if (r3 == r5) goto L_0x010e
            com.huawei.android.pushselfshow.utils.b.b r3 = new com.huawei.android.pushselfshow.utils.b.b     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r3.<init>()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            android.app.Activity r4 = r9.f25260d     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r5 = "http://open.hicloud.com/android/push1.0.js"
            boolean r3 = r3.b(r4, r5, r2)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            if (r3 == 0) goto L_0x010e
            java.io.File r3 = new java.io.File     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r3.<init>(r2)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            boolean r3 = r3.exists()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            if (r3 == 0) goto L_0x010e
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r4 = "prepareJS new js isnot exist, so  downloaded  pushUrl is "
            r3.<init>(r4)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r3.append(r2)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            goto L_0x00c5
        L_0x010d:
            r1 = r2
        L_0x010e:
            if (r1 == 0) goto L_0x011a
            int r2 = r1.length()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            if (r2 != 0) goto L_0x0117
            goto L_0x011a
        L_0x0117:
            r0 = r1
            goto L_0x01a8
        L_0x011a:
            java.lang.String r2 = "PushSelfShowLog"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r4 = "  pushUrl is "
            r3.<init>(r4)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r3.append(r1)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            com.huawei.android.pushagent.utils.a.e.e(r2, r3)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r2.<init>()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r2.append(r0)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r0 = java.io.File.separator     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r2.append(r0)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r0 = "push1.0.js"
            r2.append(r0)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r2 = "PushSelfShowLog"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r4 = "  pushjsPath is "
            r3.<init>(r4)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r3.append(r0)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            com.huawei.android.pushagent.utils.a.e.e(r2, r3)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.io.File r2 = new java.io.File     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r2.<init>(r0)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            boolean r2 = r2.exists()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            if (r2 == 0) goto L_0x0187
            java.io.File r2 = new java.io.File     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r2.<init>(r0)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            boolean r2 = r2.delete()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            if (r2 == 0) goto L_0x0173
            java.lang.String r2 = "PushSelfShowLog"
            java.lang.String r3 = "delete pushjsPath success"
            com.huawei.android.pushagent.utils.a.e.a(r2, r3)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
        L_0x0173:
            java.lang.String r2 = "PushSelfShowLog"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r4 = "prepareJS new js  is not prepared so use local  pushUrl is "
            r3.<init>(r4)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r3.append(r1)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            com.huawei.android.pushagent.utils.a.e.e(r2, r1)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            goto L_0x018e
        L_0x0187:
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.String r2 = " new File(pushjsPath) not exists() "
            com.huawei.android.pushagent.utils.a.e.e(r1, r2)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
        L_0x018e:
            android.app.Activity r1 = r9.f25260d     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r3 = "pushresources"
            r2.<init>(r3)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r3 = java.io.File.separator     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r2.append(r3)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r3 = "push1.0.js"
            r2.append(r3)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            com.huawei.android.pushselfshow.utils.a.b(r1, r2, r0)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
        L_0x01a8:
            int r1 = r0.length()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            if (r1 <= 0) goto L_0x0219
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r3 = "  pushUrl is "
            r2.<init>(r3)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r2.append(r0)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            com.huawei.android.pushagent.utils.a.e.e(r1, r2)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r1 = "/"
            int r1 = r0.lastIndexOf(r1)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r1 = r0.substring(r1)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r2.<init>()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r3 = 7
            java.lang.String r4 = "/"
            int r4 = r10.lastIndexOf(r4)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r10 = r10.substring(r3, r4)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r2.append(r10)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r2.append(r1)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r10 = r2.toString()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r2 = "PushSelfShowLog"
            java.lang.String r3 = " pushUrlName is %s,destPath is %s "
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r5 = 0
            r4[r5] = r1     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r5 = 1
            r4[r5] = r10     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            com.huawei.android.pushagent.utils.a.e.a((java.lang.String) r2, (java.lang.String) r3, (java.lang.Object[]) r4)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.io.File r2 = new java.io.File     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r2.<init>(r0)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.io.File r0 = new java.io.File     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r0.<init>(r10)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            com.huawei.android.pushselfshow.utils.a.a((java.io.File) r2, (java.io.File) r0)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r0 = "."
            r10.<init>(r0)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            r10.append(r1)     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception | IndexOutOfBoundsException -> 0x0211 }
            return r10
        L_0x0211:
            r10 = move-exception
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.String r1 = "prepareJS"
            com.huawei.android.pushagent.utils.a.e.d(r0, r1, r10)
        L_0x0219:
            java.lang.String r10 = "http://open.hicloud.com/android/push1.0.js"
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushselfshow.richpush.html.HtmlViewer.prepareJS(java.lang.String):java.lang.String");
    }

    public void setActivity(Activity activity) {
        this.f25260d = activity;
    }

    public void setProgress(int i2) {
        if (i2 >= 100) {
            this.f25257a.a(10000);
            this.f25257a.setVisibility(4);
            this.n = false;
            return;
        }
        if (!this.n) {
            this.f25257a.setVisibility(0);
            this.n = true;
        }
        this.f25257a.a((i2 * 10000) / 100);
    }

    public void showErrorHtmlURI(String str) {
        Activity activity;
        String str2;
        try {
            String a2 = new com.huawei.android.pushselfshow.richpush.tools.c(this.f25260d, str).a();
            e.a("PushSelfShowLog", "showErrorHtmlURI,filePath is " + a2);
            if (a2 != null && a2.length() > 0) {
                Uri fromFile = Uri.fromFile(new File(a2));
                enableJavaJS(null);
                _lancet.com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(this.f25261e, fromFile.toString());
            }
        } catch (Exception e2) {
            e.c("PushSelfShowLog", "showErrorHtmlURI failed", e2);
        }
        if (com.huawei.android.pushselfshow.utils.a.a((Context) this.f25260d, "富媒体文件下载失败", "Failed to load the message.").equals(str)) {
            activity = this.f25260d;
            str2 = "12";
        } else {
            activity = this.f25260d;
            str2 = "6";
        }
        com.huawei.android.pushselfshow.utils.a.a((Context) activity, str2, this.g);
    }
}
