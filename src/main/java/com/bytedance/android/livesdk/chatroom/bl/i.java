package com.bytedance.android.livesdk.chatroom.bl;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.core.model.startlive.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class i implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9814a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f9815b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9816c;

    public i(Handler handler, int i) {
        this.f9815b = handler;
        this.f9816c = i;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9814a, false, 4011, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9814a, false, 4011, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        Handler handler = this.f9815b;
        int i = this.f9816c;
        a aVar = (a) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(i);
            obtainMessage.obj = (Room) aVar.f7844b;
            handler.sendMessage(obtainMessage);
        }
    }
}