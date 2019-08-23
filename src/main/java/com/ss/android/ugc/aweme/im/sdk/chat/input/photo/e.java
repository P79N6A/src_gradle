package com.ss.android.ugc.aweme.im.sdk.chat.input.photo;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import f.a.a.a.c;

public final /* synthetic */ class e implements c.d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50838a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoDetailActivity f50839b;

    e(PhotoDetailActivity photoDetailActivity) {
        this.f50839b = photoDetailActivity;
    }

    public final void a(View view, float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3)}, this, f50838a, false, 50982, new Class[]{View.class, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3)}, this, f50838a, false, 50982, new Class[]{View.class, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.f50839b.b();
    }
}
