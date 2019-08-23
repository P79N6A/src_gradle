package com.bytedance.android.livesdk.chatroom.dutygift;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.livesdk.chatroom.dutygift.f;
import com.bytedance.android.livesdk.chatroom.viewmodule.al;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9976a;

    /* renamed from: com.bytedance.android.livesdk.chatroom.dutygift.a$a  reason: collision with other inner class name */
    public interface C0084a extends f.a, al {
        void a(DutyGiftInfo dutyGiftInfo);

        void b(DutyGiftInfo dutyGiftInfo);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() throws Exception {
        b().a(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C0084a b() {
        if (!PatchProxy.isSupport(new Object[0], this, f9976a, false, 4120, new Class[0], C0084a.class)) {
            return (C0084a) super.b();
        }
        return (C0084a) PatchProxy.accessDispatch(new Object[0], this, f9976a, false, 4120, new Class[0], C0084a.class);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f9976a, false, 4118, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9976a, false, 4118, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f9989c == null || this.f9989c.getOwner() == null)) {
            j.q().d().h().dutyGiftRequest(this.f9989c.getId(), this.f9989c.getOwner().getId(), 2, false).compose(i.a()).subscribe(new b(this), new c(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(d dVar) throws Exception {
        b().a((DutyGiftInfo) dVar.f7871b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(boolean z) throws Exception {
        if (!z) {
            b().b(null);
        }
    }

    public final void a(boolean z) {
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f9976a, false, 4119, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f9976a, false, 4119, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!(this.f9989c == null || this.f9989c.getOwner() == null)) {
            boolean z3 = z2;
            j.q().d().h().dutyGiftRequest(this.f9989c.getId(), this.f9989c.getOwner().getId(), 3, z).compose(i.a()).subscribe(new d(this, z3), new e(this, z3));
        }
    }

    public a(Room room, DataCenter dataCenter) {
        super(room, dataCenter);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(boolean z, d dVar) throws Exception {
        if (!z) {
            b().b((DutyGiftInfo) dVar.f7871b);
        }
    }
}
