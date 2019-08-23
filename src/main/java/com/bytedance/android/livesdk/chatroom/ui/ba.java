package com.bytedance.android.livesdk.chatroom.ui;

import android.os.SystemClock;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.f.b;
import com.bytedance.android.livesdk.gift.model.i;
import com.bytedance.android.livesdk.gift.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ba implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11906a;

    /* renamed from: b  reason: collision with root package name */
    private final az f11907b;

    /* renamed from: c  reason: collision with root package name */
    private final long f11908c;

    ba(az azVar, long j) {
        this.f11907b = azVar;
        this.f11908c = j;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11906a, false, 5744, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11906a, false, 5744, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        az azVar = this.f11907b;
        long j = this.f11908c;
        i iVar = (i) ((d) obj).f7871b;
        o.a(azVar.f11900c, azVar.f11899b.getId(), SystemClock.uptimeMillis() - j);
        if (azVar.f11901d != null) {
            azVar.f11901d.a(iVar);
            ((b) com.bytedance.android.live.utility.b.a(b.class)).walletCenter().a(iVar.f15131c);
        }
    }
}
