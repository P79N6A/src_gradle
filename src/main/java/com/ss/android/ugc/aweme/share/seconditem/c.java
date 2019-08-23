package com.ss.android.ugc.aweme.share.seconditem;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.component.f;

public final /* synthetic */ class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65277a;

    /* renamed from: b  reason: collision with root package name */
    private final b f65278b;

    c(b bVar) {
        this.f65278b = bVar;
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f65277a, false, 73699, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f65277a, false, 73699, new Class[]{Bundle.class}, Void.TYPE);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f65277a, false, 73698, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65277a, false, 73698, new Class[0], Void.TYPE);
            return;
        }
        this.f65278b.b();
    }
}
