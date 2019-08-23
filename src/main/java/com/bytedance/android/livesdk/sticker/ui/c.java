package com.bytedance.android.livesdk.sticker.ui;

import com.bytedance.android.livesdk.sticker.b.a;
import com.bytedance.android.livesdk.sticker.ui.LiveGestureMagicPageAdapter;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements LiveGestureMagicPageAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17383a;

    /* renamed from: b  reason: collision with root package name */
    private final b f17384b;

    c(b bVar) {
        this.f17384b = bVar;
    }

    public final void a(Boolean bool, a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{bool, aVar2}, this, f17383a, false, 13449, new Class[]{Boolean.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bool, aVar2}, this, f17383a, false, 13449, new Class[]{Boolean.class, a.class}, Void.TYPE);
            return;
        }
        b bVar = this.f17384b;
        if (!bool.booleanValue()) {
            j.q().o().b(com.bytedance.android.livesdk.sticker.c.a.f17261b, aVar2);
        } else if (bVar.f17376b.a(aVar2)) {
            j.q().o().a(com.bytedance.android.livesdk.sticker.c.a.f17261b, aVar2);
        }
    }
}
