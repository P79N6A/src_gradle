package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.livesdk.chatroom.event.o;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKMatchInviteContract;
import com.bytedance.android.livesdk.chatroom.model.a.l;
import com.bytedance.android.livesdk.j.c;
import com.bytedance.android.livesdk.utils.b.b;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class x extends InteractDialogPKMatchInviteContract.a {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f10820e;

    /* renamed from: f  reason: collision with root package name */
    private Disposable f10821f;
    private DataCenter g;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(Throwable th) {
        a(th);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d() throws Exception {
        this.f10832d.c();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f10820e, false, 4657, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10820e, false, 4657, new Class[0], Void.TYPE);
            return;
        }
        if (this.f10821f != null) {
            this.f10821f.dispose();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Long l) throws Exception {
        ((InteractDialogPKMatchInviteContract.View) this.f10831c).a(l.intValue());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(Throwable th) throws Exception {
        a(th);
        this.f10832d.c();
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f10820e, false, 4656, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f10820e, false, 4656, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f10821f = ((ab) b.a(0, 1, TimeUnit.SECONDS).take((long) (i + 1)).map(new y(i)).observeOn(AndroidSchedulers.mainThread()).as(a())).a(new z(this), new aa(this));
    }

    public x(InteractDialogPKMatchInviteContract.View view, DataCenter dataCenter) {
        super(view);
        this.g = dataCenter;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i, long j, d dVar) throws Exception {
        l lVar = (l) dVar.f7871b;
        if (i != 1) {
            this.f10832d.c();
        } else {
            this.f10832d.m = lVar.f11057a;
            this.f10832d.n = lVar.f11058b;
            if (this.g != null) {
                this.g.lambda$put$1$DataCenter("cmd_pk_state_change", new o(4));
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "REPLY_SUCCEED");
        hashMap.put(PushConstants.CONTENT, lVar);
        hashMap.put("accesskey", lVar.f11057a);
        hashMap.put("link_mic_id", Integer.valueOf(lVar.f11058b));
        hashMap.put("channel_id", Long.valueOf(j));
        c.b().a("ttlive_pk", (Map<String, Object>) hashMap);
    }

    public final void a(int i, long j, long j2, long j3) {
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j4), new Long(j5), new Long(j6)}, this, f10820e, false, 4658, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j4), new Long(j5), new Long(j6)}, this, f10820e, false, 4658, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        ((ab) j.q().d().a().reply(j, j2, i, j3).as(b())).a(new ab(this, i, j4), new ac(this));
    }

    public final void a(long j, long j2, long j3, long j4) {
        long j5 = j;
        long j6 = j2;
        long j7 = j3;
        if (PatchProxy.isSupport(new Object[]{new Long(j5), new Long(j6), new Long(j7), new Long(j4)}, this, f10820e, false, 4659, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j5), new Long(j6), new Long(j7), new Long(j4)}, this, f10820e, false, 4659, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        long j8 = j4;
        ((ab) j.q().d().a().cancel(j, j2, j4, j3).as(b())).a(new ad(this), new ae(this));
    }
}
