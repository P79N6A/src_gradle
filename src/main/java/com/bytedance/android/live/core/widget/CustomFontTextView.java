package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.disposables.Disposable;

public class CustomFontTextView extends LiveTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8343a;

    /* renamed from: e  reason: collision with root package name */
    private Disposable f8344e;

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f8343a, false, 1495, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8343a, false, 1495, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        if (this.f8344e != null) {
            this.f8344e.dispose();
        }
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f8343a, false, 1494, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8343a, false, 1494, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        if (PatchProxy.isSupport(new Object[0], this, f8343a, false, 1496, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8343a, false, 1496, new Class[0], Void.TYPE);
            return;
        }
        try {
            if (f8352c != null) {
                this.f8344e = f8352c.b().subscribe(new b(this), c.f8360b);
            }
        } catch (Throwable th) {
            a.a("font_text_view", th);
        }
    }

    public CustomFontTextView(Context context) {
        super(context);
    }

    public CustomFontTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomFontTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
