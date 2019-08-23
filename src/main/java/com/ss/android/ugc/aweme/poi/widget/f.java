package com.ss.android.ugc.aweme.poi.widget;

import android.graphics.Outline;
import android.graphics.Rect;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@RequiresApi(api = 21)
public final class f extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61076a;

    /* renamed from: b  reason: collision with root package name */
    private float f61077b;

    /* renamed from: c  reason: collision with root package name */
    private int f61078c;

    /* renamed from: d  reason: collision with root package name */
    private int f61079d;

    public final void getOutline(View view, Outline outline) {
        if (PatchProxy.isSupport(new Object[]{view, outline}, this, f61076a, false, 67067, new Class[]{View.class, Outline.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, outline}, this, f61076a, false, 67067, new Class[]{View.class, Outline.class}, Void.TYPE);
            return;
        }
        outline.setRoundRect(new Rect(0, 0, this.f61078c, this.f61079d), this.f61077b);
    }

    public f(float f2, int i, int i2) {
        this.f61077b = f2;
        this.f61078c = i;
        this.f61079d = i2;
    }
}
