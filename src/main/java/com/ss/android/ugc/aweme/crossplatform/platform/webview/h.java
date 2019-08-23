package com.ss.android.ugc.aweme.crossplatform.platform.webview;

import android.content.Context;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.ui.webview.SSWebView;
import com.ss.android.ugc.aweme.g.a;

public class h extends SSWebView {
    public static ChangeQuickRedirect g;

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 34503, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 34503, new Class[0], Void.TYPE);
            return;
        }
        try {
            super.onPause();
        } catch (Exception unused) {
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 34502, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 34502, new Class[0], Void.TYPE);
            return;
        }
        try {
            super.onResume();
        } catch (Exception unused) {
        }
    }

    public h(Context context) {
        super(context);
    }

    public void setOverScrollMode(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, g, false, 34504, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, g, false, 34504, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            super.setOverScrollMode(i);
        } catch (Throwable th) {
            Throwable th2 = th;
            if (!a.a()) {
                com.ss.android.ugc.aweme.framework.a.a.a(th2);
                return;
            }
            throw th2;
        }
    }

    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public h(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
