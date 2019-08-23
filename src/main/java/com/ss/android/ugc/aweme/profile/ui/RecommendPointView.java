package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class RecommendPointView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62330a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f62331b;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f62330a, false, 68952, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62330a, false, 68952, new Class[0], Void.TYPE);
            return;
        }
        setVisibility(8);
        this.f62331b = false;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f62330a, false, 68953, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62330a, false, 68953, new Class[0], Void.TYPE);
            return;
        }
        setVisibility(0);
    }

    public RecommendPointView(Context context) {
        super(context);
    }

    public void setShouldHide(boolean z) {
        this.f62331b = z;
    }

    public RecommendPointView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RecommendPointView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
