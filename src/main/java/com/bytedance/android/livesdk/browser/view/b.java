package com.bytedance.android.livesdk.browser.view;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.livesdk.utils.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements View.OnLongClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9650a;

    /* renamed from: b  reason: collision with root package name */
    static final View.OnLongClickListener f9651b = new b();

    private b() {
    }

    public final boolean onLongClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f9650a, false, 3840, new Class[]{View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2}, this, f9650a, false, 3840, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
        }
        if (view2 instanceof WebView) {
            WebView webView = (WebView) view2;
            WebView.HitTestResult hitTestResult = webView.getHitTestResult();
            if (hitTestResult == null || webView.getSettings() == null) {
                return false;
            }
            if (hitTestResult.getType() == 5 || hitTestResult.getType() == 8) {
                String extra = hitTestResult.getExtra();
                return (extra == null || webView.getContext() == null || !a.a(extra)) ? false : true;
            }
        }
    }
}
