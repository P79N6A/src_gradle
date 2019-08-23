package com.bytedance.android.livesdk.chatroom.presenter;

import android.os.SystemClock;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.presenter.s;
import com.bytedance.android.livesdk.gift.c.a;
import com.bytedance.android.livesdk.gift.model.i;
import com.bytedance.android.livesdk.gift.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class t implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11406a;

    /* renamed from: b  reason: collision with root package name */
    private final s f11407b;

    /* renamed from: c  reason: collision with root package name */
    private final long f11408c;

    /* renamed from: d  reason: collision with root package name */
    private final long f11409d;

    /* renamed from: e  reason: collision with root package name */
    private final String f11410e;

    public t(s sVar, long j, long j2, String str) {
        this.f11407b = sVar;
        this.f11408c = j;
        this.f11409d = j2;
        this.f11410e = str;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11406a, false, 5203, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11406a, false, 5203, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        s sVar = this.f11407b;
        long j = this.f11408c;
        long j2 = this.f11409d;
        String str = this.f11410e;
        d dVar = (d) obj;
        o.a(j, sVar.f11400c.getId(), SystemClock.uptimeMillis() - j2);
        if (sVar.b() != null) {
            i iVar = (i) dVar.f7871b;
            if (iVar != null) {
                iVar.t = str;
                ((s.a) sVar.b()).a((i) dVar.f7871b);
                return;
            }
            ((s.a) sVar.b()).b(new a());
        }
    }
}
