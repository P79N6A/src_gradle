package com.bytedance.android.livesdk.chatroom.bl;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.core.network.response.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ai implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9780a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f9781b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9782c;

    ai(Handler handler, int i) {
        this.f9781b = handler;
        this.f9782c = i;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9780a, false, 4038, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9780a, false, 4038, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        Handler handler = this.f9781b;
        int i = this.f9782c;
        d dVar = (d) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(i);
            obtainMessage.obj = dVar.f7871b;
            handler.sendMessage(obtainMessage);
        }
    }
}
