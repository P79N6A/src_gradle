package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.live.a.a.b.a;
import com.bytedance.android.livesdk.gift.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bb implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11909a;

    /* renamed from: b  reason: collision with root package name */
    private final az f11910b;

    bb(az azVar) {
        this.f11910b = azVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11909a, false, 5745, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11909a, false, 5745, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        az azVar = this.f11910b;
        Throwable th = (Throwable) obj;
        azVar.f11902e = false;
        o.a(azVar.f11900c, azVar.f11899b.getId(), th);
        if (azVar.f11901d != null) {
            if (th instanceof a) {
                a aVar = (a) th;
                if (40001 == aVar.getErrorCode()) {
                    azVar.f11901d.a();
                } else {
                    azVar.f11901d.a(aVar.getPrompt());
                }
            } else {
                azVar.f11901d.b();
            }
        }
    }
}
