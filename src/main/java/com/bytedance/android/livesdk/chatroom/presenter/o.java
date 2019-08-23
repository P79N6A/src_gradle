package com.bytedance.android.livesdk.chatroom.presenter;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.f.b;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.chatroom.presenter.n;
import com.bytedance.android.livesdk.gift.model.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class o implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11382a;

    /* renamed from: b  reason: collision with root package name */
    private final n f11383b;

    /* renamed from: c  reason: collision with root package name */
    private final long f11384c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f11385d;

    o(n nVar, long j, Context context) {
        this.f11383b = nVar;
        this.f11384c = j;
        this.f11385d = context;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11382a, false, 5185, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11382a, false, 5185, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        n nVar = this.f11383b;
        long j = this.f11384c;
        Context context = this.f11385d;
        d dVar = (d) obj;
        com.bytedance.android.livesdk.gift.o.a(nVar.f11376c.f15105d, nVar.f11379f.getId(), SystemClock.uptimeMillis() - j);
        if (nVar.b() != null) {
            if (a.d()) {
                com.bytedance.android.livesdk.r.a.a(context, nVar.f11379f, nVar.f11376c);
            }
            i iVar = (i) dVar.f7871b;
            ((n.a) nVar.b()).a(iVar);
            ((b) com.bytedance.android.live.utility.b.a(b.class)).walletCenter().a(iVar.f15131c);
        }
    }
}
