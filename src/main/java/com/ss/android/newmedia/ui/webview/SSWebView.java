package com.ss.android.newmedia.ui.webview;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.config.AppConfig;
import com.ss.android.ugc.aweme.lancet.c;
import java.util.Map;

public class SSWebView extends WebView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2531a = null;

    /* renamed from: f  reason: collision with root package name */
    private static final String f2532f = "SSWebView";

    /* renamed from: b  reason: collision with root package name */
    public boolean f2533b = true;

    /* renamed from: c  reason: collision with root package name */
    private int f2534c = 500;

    /* renamed from: d  reason: collision with root package name */
    private long f2535d;

    /* renamed from: e  reason: collision with root package name */
    private long f2536e;

    public int getTimeInterval() {
        if (this.f2534c > 0) {
            return this.f2534c;
        }
        return 500;
    }

    public boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f2531a, false, 18917, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2531a, false, 18917, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (System.currentTimeMillis() - this.f2536e < ((long) getTimeInterval())) {
            z = true;
        }
        return z;
    }

    public boolean canGoBack() {
        if (PatchProxy.isSupport(new Object[0], this, f2531a, false, 18896, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2531a, false, 18896, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            return super.canGoBack();
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean canGoForward() {
        if (PatchProxy.isSupport(new Object[0], this, f2531a, false, 18898, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2531a, false, 18898, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            return super.canGoForward();
        } catch (Exception unused) {
            return false;
        }
    }

    public void clearFormData() {
        if (PatchProxy.isSupport(new Object[0], this, f2531a, false, 18907, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2531a, false, 18907, new Class[0], Void.TYPE);
            return;
        }
        try {
            super.clearFormData();
        } catch (Exception unused) {
        }
    }

    public void clearHistory() {
        if (PatchProxy.isSupport(new Object[0], this, f2531a, false, 18908, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2531a, false, 18908, new Class[0], Void.TYPE);
            return;
        }
        try {
            super.clearHistory();
        } catch (Exception unused) {
        }
    }

    public void computeScroll() {
        if (PatchProxy.isSupport(new Object[0], this, f2531a, false, 18913, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2531a, false, 18913, new Class[0], Void.TYPE);
            return;
        }
        try {
            super.computeScroll();
        } catch (Exception unused) {
        }
    }

    public int getContentHeight() {
        if (PatchProxy.isSupport(new Object[0], this, f2531a, false, 18905, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f2531a, false, 18905, new Class[0], Integer.TYPE)).intValue();
        }
        try {
            return super.getContentHeight();
        } catch (Exception unused) {
            return 1;
        }
    }

    public String getOriginalUrl() {
        if (PatchProxy.isSupport(new Object[0], this, f2531a, false, 18903, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f2531a, false, 18903, new Class[0], String.class);
        }
        try {
            return super.getOriginalUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    public int getProgress() {
        if (PatchProxy.isSupport(new Object[0], this, f2531a, false, 18904, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f2531a, false, 18904, new Class[0], Integer.TYPE)).intValue();
        }
        try {
            return super.getProgress();
        } catch (Exception unused) {
            return 100;
        }
    }

    public String getUrl() {
        if (PatchProxy.isSupport(new Object[0], this, f2531a, false, 18902, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f2531a, false, 18902, new Class[0], String.class);
        }
        try {
            return super.getUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    public void goBack() {
        if (PatchProxy.isSupport(new Object[0], this, f2531a, false, 18897, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2531a, false, 18897, new Class[0], Void.TYPE);
            return;
        }
        try {
            super.goBack();
        } catch (Exception unused) {
        }
    }

    public void goForward() {
        if (PatchProxy.isSupport(new Object[0], this, f2531a, false, 18899, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2531a, false, 18899, new Class[0], Void.TYPE);
            return;
        }
        try {
            super.goForward();
        } catch (Exception unused) {
        }
    }

    public void reload() {
        if (PatchProxy.isSupport(new Object[0], this, f2531a, false, 18895, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2531a, false, 18895, new Class[0], Void.TYPE);
            return;
        }
        try {
            super.reload();
        } catch (Exception unused) {
        }
    }

    public void stopLoading() {
        if (PatchProxy.isSupport(new Object[0], this, f2531a, false, 18894, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2531a, false, 18894, new Class[0], Void.TYPE);
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception unused) {
        }
    }

    public void setCanTouch(boolean z) {
        this.f2533b = z;
    }

    public void setTimeInterval(int i) {
        this.f2534c = i;
    }

    public SSWebView(Context context) {
        super(context);
    }

    public void clearCache(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2531a, false, 18906, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2531a, false, 18906, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        try {
            super.clearCache(z);
        } catch (Exception unused) {
        }
    }

    public void goBackOrForward(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f2531a, false, 18901, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f2531a, false, 18901, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            super.goBackOrForward(i);
        } catch (Exception unused) {
        }
    }

    public void setBackgroundColor(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f2531a, false, 18912, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f2531a, false, 18912, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            super.setBackgroundColor(i);
        } catch (Exception unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        if (PatchProxy.isSupport(new Object[]{downloadListener}, this, f2531a, false, 18910, new Class[]{DownloadListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{downloadListener}, this, f2531a, false, 18910, new Class[]{DownloadListener.class}, Void.TYPE);
            return;
        }
        try {
            super.setDownloadListener(downloadListener);
        } catch (Exception unused) {
        }
    }

    public void setNetworkAvailable(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2531a, false, 18888, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2531a, false, 18888, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        try {
            super.setNetworkAvailable(z);
        } catch (Exception unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        if (PatchProxy.isSupport(new Object[]{webChromeClient}, this, f2531a, false, 18911, new Class[]{WebChromeClient.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webChromeClient}, this, f2531a, false, 18911, new Class[]{WebChromeClient.class}, Void.TYPE);
            return;
        }
        try {
            super.setWebChromeClient(webChromeClient);
        } catch (Exception unused) {
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        if (PatchProxy.isSupport(new Object[]{webViewClient}, this, f2531a, false, 18909, new Class[]{WebViewClient.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webViewClient}, this, f2531a, false, 18909, new Class[]{WebViewClient.class}, Void.TYPE);
            return;
        }
        try {
            super.setWebViewClient(webViewClient);
        } catch (Exception unused) {
        }
    }

    private String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f2531a, false, 18915, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f2531a, false, 18915, new Class[]{String.class}, String.class);
        }
        Context context = getContext();
        if (context != null && b(str)) {
            str2 = AppConfig.getInstance(context).filterUrlOnUIThread(str2);
        }
        return str2;
    }

    private boolean b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f2531a, false, 18916, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f2531a, false, 18916, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (StringUtils.isEmpty(str)) {
            return false;
        } else {
            if (str2.startsWith("http://") || str2.startsWith("https://")) {
                return true;
            }
            return false;
        }
    }

    public boolean canGoBackOrForward(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f2531a, false, 18900, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f2531a, false, 18900, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        try {
            return super.canGoBackOrForward(i);
        } catch (Exception unused) {
            return false;
        }
    }

    public void loadUrl(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f2531a, false, 18890, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f2531a, false, 18890, new Class[]{String.class}, Void.TYPE);
            return;
        }
        try {
            String a2 = a(str);
            if (PatchProxy.isSupport(new Object[]{this, a2}, null, f.f30389a, true, 18919, new Class[]{WebView.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{this, a2}, null, f.f30389a, true, 18919, new Class[]{WebView.class, String.class}, Void.TYPE);
                return;
            }
            c.a(a2);
            super.loadUrl(a2);
        } catch (Exception unused) {
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f2531a, false, 18914, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f2531a, false, 18914, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!this.f2533b) {
            return false;
        } else {
            switch (motionEvent.getAction()) {
                case 0:
                    this.f2535d = System.currentTimeMillis();
                    break;
                case 1:
                    if (System.currentTimeMillis() - this.f2535d < 100) {
                        this.f2536e = System.currentTimeMillis();
                        break;
                    }
                    break;
            }
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    public SSWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void postUrl(java.lang.String r20, byte[] r21) {
        /*
            r19 = this;
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r20
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f2531a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<byte[]> r4 = byte[].class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 18891(0x49cb, float:2.6472E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0043
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r20
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f2531a
            r15 = 0
            r16 = 18891(0x49cb, float:2.6472E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<byte[]> r1 = byte[].class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0043:
            java.lang.String r0 = r19.a(r20)     // Catch:{ Exception -> 0x004d }
            r2 = r19
            super.postUrl(r0, r1)     // Catch:{ Exception -> 0x004f }
            return
        L_0x004d:
            r2 = r19
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.ui.webview.SSWebView.postUrl(java.lang.String, byte[]):void");
    }

    @TargetApi(19)
    public void loadUrl(String str, Map<String, String> map) {
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{str, map2}, this, f2531a, false, 18889, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, map2}, this, f2531a, false, 18889, new Class[]{String.class, Map.class}, Void.TYPE);
            return;
        }
        try {
            String a2 = a(str);
            if (PatchProxy.isSupport(new Object[]{this, a2, map2}, null, f.f30389a, true, 18918, new Class[]{WebView.class, String.class, Map.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{this, a2, map2}, null, f.f30389a, true, 18918, new Class[]{WebView.class, String.class, Map.class}, Void.TYPE);
                return;
            }
            c.a(a2);
            super.loadUrl(a2, map2);
        } catch (Exception unused) {
        }
    }

    public SSWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void loadData(String str, String str2, String str3) {
        if (PatchProxy.isSupport(new Object[]{str, str2, str3}, this, f2531a, false, 18892, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, str3}, this, f2531a, false, 18892, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        try {
            super.loadData(str, str2, str3);
        } catch (Exception unused) {
        }
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (PatchProxy.isSupport(new Object[]{str, str2, str3, str4, str5}, this, f2531a, false, 18893, new Class[]{String.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {str, str2, str3, str4, str5};
            PatchProxy.accessDispatch(objArr, this, f2531a, false, 18893, new Class[]{String.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        try {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Exception unused) {
        }
    }
}
