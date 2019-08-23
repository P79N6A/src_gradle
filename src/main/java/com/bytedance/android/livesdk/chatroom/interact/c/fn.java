package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class fn implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10695a;

    /* renamed from: b  reason: collision with root package name */
    private final fl f10696b;

    fn(fl flVar) {
        this.f10696b = flVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10695a, false, 4954, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10695a, false, 4954, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        fl flVar = this.f10696b;
        Long l = (Long) obj;
        if (flVar.b() != null) {
            flVar.f10690d.lambda$put$1$DataCenter("data_pk_time_left", Integer.valueOf(l.intValue()));
            if (l.longValue() <= 0) {
                flVar.a();
            }
        }
    }
}
