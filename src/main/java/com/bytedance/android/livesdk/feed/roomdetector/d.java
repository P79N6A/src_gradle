package com.bytedance.android.livesdk.feed.roomdetector;

import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class d implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14374a;

    /* renamed from: b  reason: collision with root package name */
    private final b f14375b;

    d(b bVar) {
        this.f14375b = bVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14374a, false, 8869, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14374a, false, 8869, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        b bVar = this.f14375b;
        Throwable th = (Throwable) obj;
        if (bVar.f14367b != null) {
            Message obtainMessage = bVar.f14367b.obtainMessage(7);
            obtainMessage.obj = th;
            bVar.f14367b.sendMessage(obtainMessage);
        }
    }
}
