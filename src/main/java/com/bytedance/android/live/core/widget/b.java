package com.bytedance.android.live.core.widget;

import android.graphics.Typeface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class b implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8357a;

    /* renamed from: b  reason: collision with root package name */
    private final CustomFontTextView f8358b;

    b(CustomFontTextView customFontTextView) {
        this.f8358b = customFontTextView;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f8357a, false, 1497, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f8357a, false, 1497, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f8358b.setTypeface((Typeface) obj);
    }
}
