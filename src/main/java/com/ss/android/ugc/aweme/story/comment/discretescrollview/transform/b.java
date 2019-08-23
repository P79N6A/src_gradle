package com.ss.android.ugc.aweme.story.comment.discretescrollview.transform;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.comment.discretescrollview.transform.Pivot;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72173a;

    /* renamed from: b  reason: collision with root package name */
    public Pivot f72174b = Pivot.a.CENTER.create();

    /* renamed from: c  reason: collision with root package name */
    public Pivot f72175c = Pivot.b.CENTER.create();

    /* renamed from: d  reason: collision with root package name */
    public float f72176d = 0.8f;

    /* renamed from: e  reason: collision with root package name */
    public float f72177e = 0.2f;

    /* renamed from: f  reason: collision with root package name */
    public float f72178f = 0.75f;
    public float g = 0.25f;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public b f72179a = new b();

        /* renamed from: b  reason: collision with root package name */
        public float f72180b = 1.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f72181c = 1.0f;
    }

    public final void a(View view, float f2) {
        if (PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2)}, this, f72173a, false, 82850, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2)}, this, f72173a, false, 82850, new Class[]{View.class, Float.TYPE}, Void.TYPE);
            return;
        }
        this.f72174b.a(view);
        this.f72175c.a(view);
        float abs = 1.0f - Math.abs(f2);
        float f3 = this.f72176d + (this.f72177e * abs);
        view.setScaleX(f3);
        view.setScaleY(f3);
        view.setAlpha(this.f72178f + (this.g * abs));
    }
}
