package com.bytedance.android.livesdk.browser.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.Keep;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.android.livesdk.browser.h.a;
import com.bytedance.android.livesdk.browser.h.b;
import com.bytedance.android.livesdk.utils.g;
import com.bytedance.android.livesdkapi.host.o;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Keep
public class SSWebView extends WebView {
    public static ChangeQuickRedirect changeQuickRedirect;
    private b clickHelper;

    public b getClickHelper() {
        return this.clickHelper;
    }

    private void init() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 3841, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 3841, new Class[0], Void.TYPE);
            return;
        }
        this.clickHelper = new a(getContext());
    }

    public boolean canGoBack() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 3850, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 3850, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            return super.canGoBack();
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean canGoForward() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 3852, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 3852, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            return super.canGoForward();
        } catch (Exception unused) {
            return false;
        }
    }

    public void clearFormData() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 3861, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 3861, new Class[0], Void.TYPE);
            return;
        }
        try {
            super.clearFormData();
        } catch (Exception unused) {
        }
    }

    public void clearHistory() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 3862, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 3862, new Class[0], Void.TYPE);
            return;
        }
        try {
            super.clearHistory();
        } catch (Exception unused) {
        }
    }

    public void computeScroll() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 3867, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 3867, new Class[0], Void.TYPE);
            return;
        }
        try {
            super.computeScroll();
        } catch (Exception unused) {
        }
    }

    public int getContentHeight() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 3859, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 3859, new Class[0], Integer.TYPE)).intValue();
        }
        try {
            return super.getContentHeight();
        } catch (Exception unused) {
            return 1;
        }
    }

    public String getOriginalUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 3857, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 3857, new Class[0], String.class);
        }
        try {
            return super.getOriginalUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    public int getProgress() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 3858, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 3858, new Class[0], Integer.TYPE)).intValue();
        }
        try {
            return super.getProgress();
        } catch (Exception unused) {
            return 100;
        }
    }

    public String getUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 3856, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 3856, new Class[0], String.class);
        }
        try {
            return super.getUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    public void goBack() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 3851, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 3851, new Class[0], Void.TYPE);
            return;
        }
        try {
            super.goBack();
        } catch (Exception unused) {
        }
    }

    public void goForward() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 3853, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 3853, new Class[0], Void.TYPE);
            return;
        }
        try {
            super.goForward();
        } catch (Exception unused) {
        }
    }

    public void reload() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 3849, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 3849, new Class[0], Void.TYPE);
            return;
        }
        try {
            super.reload();
        } catch (Exception unused) {
        }
    }

    public void stopLoading() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 3848, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 3848, new Class[0], Void.TYPE);
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception unused) {
        }
    }

    public SSWebView(Context context) {
        super(context);
        init();
    }

    public void clearCache(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 3860, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 3860, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        try {
            super.clearCache(z);
        } catch (Exception unused) {
        }
    }

    public void goBackOrForward(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 3855, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 3855, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            super.goBackOrForward(i);
        } catch (Exception unused) {
        }
    }

    public void setBackgroundColor(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 3866, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 3866, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            super.setBackgroundColor(i);
        } catch (Exception unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        if (PatchProxy.isSupport(new Object[]{downloadListener}, this, changeQuickRedirect, false, 3864, new Class[]{DownloadListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{downloadListener}, this, changeQuickRedirect, false, 3864, new Class[]{DownloadListener.class}, Void.TYPE);
            return;
        }
        try {
            super.setDownloadListener(downloadListener);
        } catch (Exception unused) {
        }
    }

    public void setNetworkAvailable(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 3842, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 3842, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        try {
            super.setNetworkAvailable(z);
        } catch (Exception unused) {
        }
    }

    public void setOverScrollMode(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 3873, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 3873, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            super.setOverScrollMode(i);
        } catch (Exception unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        if (PatchProxy.isSupport(new Object[]{webChromeClient}, this, changeQuickRedirect, false, 3865, new Class[]{WebChromeClient.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webChromeClient}, this, changeQuickRedirect, false, 3865, new Class[]{WebChromeClient.class}, Void.TYPE);
            return;
        }
        try {
            super.setWebChromeClient(webChromeClient);
        } catch (Exception unused) {
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        if (PatchProxy.isSupport(new Object[]{webViewClient}, this, changeQuickRedirect, false, 3863, new Class[]{WebViewClient.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webViewClient}, this, changeQuickRedirect, false, 3863, new Class[]{WebViewClient.class}, Void.TYPE);
            return;
        }
        try {
            super.setWebViewClient(webViewClient);
        } catch (Exception unused) {
        }
    }

    public boolean canGoBackOrForward(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 3854, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 3854, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        try {
            return super.canGoBackOrForward(i);
        } catch (Exception unused) {
            return false;
        }
    }

    public void loadUrl(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 3844, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 3844, new Class[]{String.class}, Void.TYPE);
            return;
        }
        try {
            String filterUrl = filterUrl(str);
            try {
                c.a(this, filterUrl, requestHeader(filterUrl, null));
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, changeQuickRedirect, false, 3869, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, changeQuickRedirect, false, 3869, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            if (this.clickHelper != null) {
                this.clickHelper.a(motionEvent);
            }
            return super.onTouchEvent(motionEvent);
        } catch (Throwable unused) {
            return false;
        }
    }

    private String filterUrl(String str) {
        boolean z;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 3870, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 3870, new Class[]{String.class}, String.class);
        }
        Context context = getContext();
        if (context != null) {
            if (PatchProxy.isSupport(new Object[]{str2}, null, g.f17600a, true, 13619, new Class[]{String.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, g.f17600a, true, 13619, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            } else if (StringUtils.isEmpty(str) || (!str2.startsWith("http://") && !str2.startsWith("https://"))) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (PatchProxy.isSupport(new Object[]{context, str2}, null, g.f17600a, true, 13620, new Class[]{Context.class, String.class}, String.class)) {
                    str2 = (String) PatchProxy.accessDispatch(new Object[]{context, str2}, null, g.f17600a, true, 13620, new Class[]{Context.class, String.class}, String.class);
                } else {
                    str2 = com.bytedance.ttnet.config.a.a(context).g(str2);
                }
            }
        }
        String str3 = str2;
        syncCookie(str3);
        return str3;
    }

    private void syncCookie(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 3871, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 3871, new Class[]{String.class}, Void.TYPE);
            return;
        }
        CookieManager instance = CookieManager.getInstance();
        instance.setAcceptCookie(true);
        List<String> a2 = ((o) com.bytedance.android.live.utility.b.a(o.class)).a(str2);
        Uri parse = Uri.parse(str);
        String str3 = "";
        if (parse != null) {
            str3 = parse.getHost();
        }
        if (!(a2 == null || str3 == null)) {
            for (int i = 0; i < a2.size(); i++) {
                String[] split = a2.get(i).split(";");
                for (String replace : split) {
                    instance.setCookie(str3, replace.replace(" ", ""));
                }
            }
        }
    }

    public SSWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (PatchProxy.isSupport(new Object[]{str, valueCallback}, this, changeQuickRedirect, false, 3868, new Class[]{String.class, ValueCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, valueCallback}, this, changeQuickRedirect, false, 3868, new Class[]{String.class, ValueCallback.class}, Void.TYPE);
            return;
        }
        try {
            super.evaluateJavascript(str, valueCallback);
        } catch (Exception unused) {
        }
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
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<byte[]> r4 = byte[].class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 3845(0xf05, float:5.388E-42)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0043
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r20
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = changeQuickRedirect
            r15 = 0
            r16 = 3845(0xf05, float:5.388E-42)
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
            java.lang.String r0 = r19.filterUrl(r20)     // Catch:{ Exception -> 0x004d }
            r2 = r19
            super.postUrl(r0, r1)     // Catch:{ Exception -> 0x004f }
            return
        L_0x004d:
            r2 = r19
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.view.SSWebView.postUrl(java.lang.String, byte[]):void");
    }

    private static Map<String, String> requestHeader(String str, Map<String, String> map) {
        String str2 = str;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{str2, map2}, null, changeQuickRedirect, true, 3872, new Class[]{String.class, Map.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{str2, map2}, null, changeQuickRedirect, true, 3872, new Class[]{String.class, Map.class}, Map.class);
        }
        Map<String, String> b2 = ((o) com.bytedance.android.live.utility.b.a(o.class)).b(str2);
        if (b2 == null || b2.isEmpty()) {
            return map2;
        }
        if (map2 == null || map.isEmpty()) {
            return b2;
        }
        HashMap hashMap = new HashMap(map2);
        for (Map.Entry next : b2.entrySet()) {
            hashMap.put(next.getKey(), next.getValue());
        }
        return hashMap;
    }

    @TargetApi(19)
    public void loadUrl(String str, Map<String, String> map) {
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{str, map2}, this, changeQuickRedirect, false, 3843, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, map2}, this, changeQuickRedirect, false, 3843, new Class[]{String.class, Map.class}, Void.TYPE);
            return;
        }
        try {
            String filterUrl = filterUrl(str);
            try {
                c.a(this, filterUrl, requestHeader(filterUrl, map2));
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }

    public SSWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public void loadData(String str, String str2, String str3) {
        if (PatchProxy.isSupport(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 3846, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 3846, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        try {
            super.loadData(str, str2, str3);
        } catch (Exception unused) {
        }
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (PatchProxy.isSupport(new Object[]{str, str2, str3, str4, str5}, this, changeQuickRedirect, false, 3847, new Class[]{String.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {str, str2, str3, str4, str5};
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 3847, new Class[]{String.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        try {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Exception unused) {
        }
    }
}
