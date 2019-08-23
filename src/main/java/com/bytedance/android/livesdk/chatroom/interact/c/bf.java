package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.contract.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.disposables.CompositeDisposable;

public class bf implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10423a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f10424b = "bf";

    /* renamed from: c  reason: collision with root package name */
    private final CompositeDisposable f10425c = new CompositeDisposable();

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f10423a, false, 4706, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10423a, false, 4706, new Class[0], Void.TYPE);
            return;
        }
        this.f10425c.clear();
    }
}
