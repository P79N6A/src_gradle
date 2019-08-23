package com.bytedance.android.livesdkapi.depend.c;

import android.os.Handler;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;

public final class a extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18621a;

    /* renamed from: b  reason: collision with root package name */
    WeakReference<C0132a> f18622b;

    /* renamed from: com.bytedance.android.livesdkapi.depend.c.a$a  reason: collision with other inner class name */
    public interface C0132a {
        void a(Message message);
    }

    public a(C0132a aVar) {
        this.f18622b = new WeakReference<>(aVar);
    }

    public final void handleMessage(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f18621a, false, 14928, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f18621a, false, 14928, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        C0132a aVar = (C0132a) this.f18622b.get();
        if (!(aVar == null || message2 == null)) {
            aVar.a(message2);
        }
    }
}
