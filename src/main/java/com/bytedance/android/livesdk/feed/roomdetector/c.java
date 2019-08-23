package com.bytedance.android.livesdk.feed.roomdetector;

import android.os.Message;
import com.bytedance.android.live.core.network.response.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14372a;

    /* renamed from: b  reason: collision with root package name */
    private final b f14373b;

    c(b bVar) {
        this.f14373b = bVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14372a, false, 8868, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14372a, false, 8868, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        b bVar = this.f14373b;
        d dVar = (d) obj;
        if (bVar.f14367b != null) {
            Message obtainMessage = bVar.f14367b.obtainMessage(7);
            obtainMessage.obj = dVar.f7871b;
            bVar.f14367b.sendMessage(obtainMessage);
        }
    }
}
