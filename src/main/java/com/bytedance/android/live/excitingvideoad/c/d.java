package com.bytedance.android.live.excitingvideoad.c;

import android.os.Handler;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;

public final class d extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8392a;

    /* renamed from: b  reason: collision with root package name */
    WeakReference<a> f8393b;

    public interface a {
        void a(Message message);
    }

    public d(a aVar) {
        this.f8393b = new WeakReference<>(aVar);
    }

    public final void handleMessage(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f8392a, false, 1650, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f8392a, false, 1650, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        a aVar = (a) this.f8393b.get();
        if (!(aVar == null || message2 == null)) {
            aVar.a(message2);
        }
    }
}
