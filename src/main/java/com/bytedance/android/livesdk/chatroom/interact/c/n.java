package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.live.uikit.d.a;
import com.bytedance.android.livesdk.chatroom.event.o;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKInviteContract;
import com.bytedance.android.livesdk.chatroom.model.a.l;
import com.bytedance.android.livesdk.j.c;
import com.bytedance.android.livesdk.utils.ah;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.w.b;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class n extends InteractDialogPKInviteContract.a {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f10798e;

    /* renamed from: f  reason: collision with root package name */
    private Disposable f10799f;
    private DataCenter g;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(Throwable th) {
        a(th);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e() throws Exception {
        this.f10832d.c();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f10798e, false, 4643, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10798e, false, 4643, new Class[0], Void.TYPE);
            return;
        }
        if (this.f10799f != null) {
            this.f10799f.dispose();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f10798e, false, 4646, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10798e, false, 4646, new Class[0], Void.TYPE);
            return;
        }
        ((ab) j.q().d().a().settings(2).as(b())).a(new v(this), new w(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Long l) throws Exception {
        ((InteractDialogPKInviteContract.View) this.f10831c).a(l.intValue());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(Throwable th) throws Exception {
        a(th);
        this.f10832d.c();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(d dVar) throws Exception {
        if (dVar.f7870a == 0) {
            ((InteractDialogPKInviteContract.View) this.f10831c).a(false);
            b.q.a(2);
            a.a(((InteractDialogPKInviteContract.View) this.f10831c).getContext(), (int) C0906R.string.d6e);
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f10798e, false, 4642, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f10798e, false, 4642, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f10799f = ((ab) com.bytedance.android.livesdk.utils.b.b.a(0, 1, TimeUnit.SECONDS).take((long) (i + 1)).map(new o(i)).observeOn(AndroidSchedulers.mainThread()).as(a())).a(new p(this), new q(this));
    }

    public n(InteractDialogPKInviteContract.View view, DataCenter dataCenter) {
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

    public final void a(int i, long j, long j2, User user) {
        boolean z;
        int i2 = i;
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j3), new Long(j4), user}, this, f10798e, false, 4644, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j3), new Long(j4), user}, this, f10798e, false, 4644, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE, User.class}, Void.TYPE);
            return;
        }
        if (i2 == 2 && ((Integer) b.q.a()).intValue() != 2 && !user.isFollowing()) {
            String b2 = ah.b(System.currentTimeMillis());
            if (!((String) b.az.a()).equals(b2)) {
                b.ay.a(1);
                b.az.a(b2);
            } else {
                com.bytedance.android.livesdk.w.c<Integer> cVar = b.ay;
                cVar.a(Integer.valueOf(((Integer) cVar.a()).intValue() + 1));
                if (((Integer) b.ay.a()).intValue() > 3) {
                    b.ay.a(Integer.MIN_VALUE);
                    z = true;
                    int i3 = i2;
                    ((ab) j.q().d().a().reply(j, j2, i, user.getId()).as(b())).a(new r(this, i3, j3), new s(this));
                    ((InteractDialogPKInviteContract.View) this.f10831c).a(z);
                }
            }
        }
        z = false;
        int i32 = i2;
        ((ab) j.q().d().a().reply(j, j2, i, user.getId()).as(b())).a(new r(this, i32, j3), new s(this));
        ((InteractDialogPKInviteContract.View) this.f10831c).a(z);
    }

    public final void a(long j, long j2, long j3, long j4) {
        long j5 = j;
        long j6 = j2;
        long j7 = j3;
        if (PatchProxy.isSupport(new Object[]{new Long(j5), new Long(j6), new Long(j7), new Long(j4)}, this, f10798e, false, 4645, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j5), new Long(j6), new Long(j7), new Long(j4)}, this, f10798e, false, 4645, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        long j8 = j4;
        ((ab) j.q().d().a().cancel(j, j2, j4, j3).as(b())).a(new t(this), new u(this));
    }
}
