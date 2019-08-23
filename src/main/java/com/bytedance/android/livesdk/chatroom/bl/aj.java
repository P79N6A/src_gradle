package com.bytedance.android.livesdk.chatroom.bl;

import android.os.Handler;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class aj implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9783a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f9784b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9785c;

    aj(Handler handler, int i) {
        this.f9784b = handler;
        this.f9785c = i;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9783a, false, 4039, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9783a, false, 4039, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        Handler handler = this.f9784b;
        int i = this.f9785c;
        Throwable th = (Throwable) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(i);
            obtainMessage.obj = th;
            handler.sendMessage(obtainMessage);
        }
    }
}
