package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.livesdk.chatroom.interact.a.a;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKMatchContract;
import com.bytedance.android.livesdk.j.c;
import com.bytedance.android.livesdk.utils.b.b;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class af extends InteractDialogPKMatchContract.a {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f10367e;

    /* renamed from: f  reason: collision with root package name */
    private Disposable f10368f;
    private boolean g;
    private Room h;

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f10367e, false, 4668, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10367e, false, 4668, new Class[0], Void.TYPE);
            return;
        }
        a.a().b();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f10367e, false, 4670, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10367e, false, 4670, new Class[0], Void.TYPE);
            return;
        }
        if (this.f10368f != null) {
            this.f10368f.dispose();
            this.f10368f = null;
        }
    }

    public final boolean e() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f10367e, false, 4672, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f10367e, false, 4672, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f10368f != null && !this.f10368f.isDisposed()) {
            z = true;
        }
        return z;
    }

    public af(InteractDialogPKMatchContract.View view) {
        super(view);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Long l) throws Exception {
        ((InteractDialogPKMatchContract.View) this.f10831c).a(l.intValue());
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{3}, this, f10367e, false, 4669, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{3}, this, f10367e, false, 4669, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f10368f = ((ab) b.a(1, TimeUnit.SECONDS).take(4).map(new ag(3)).observeOn(AndroidSchedulers.mainThread()).as(a())).a(new ah(this), ai.f10374b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r19) {
        /*
            r18 = this;
            r0 = r19
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r0)
            r10 = 0
            r3[r10] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = f10367e
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class r4 = java.lang.Long.TYPE
            r8[r10] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 4667(0x123b, float:6.54E-42)
            r4 = r18
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0040
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r0)
            r11[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r13 = f10367e
            r14 = 0
            r15 = 4667(0x123b, float:6.54E-42)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class r1 = java.lang.Long.TYPE
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r18
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x0040:
            com.bytedance.android.livesdk.w.c<java.lang.String> r3 = com.bytedance.android.livesdk.w.b.k
            java.lang.Object r3 = r3.a()
            java.lang.String r3 = (java.lang.String) r3
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = com.bytedance.android.livesdk.utils.ah.b(r4)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0066
            com.bytedance.android.livesdk.w.c<java.lang.Integer> r3 = com.bytedance.android.livesdk.w.b.aw
            java.lang.Object r3 = r3.a()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 > 0) goto L_0x0088
            r3 = 0
            goto L_0x0089
        L_0x0066:
            com.bytedance.android.livesdk.w.c<java.lang.Integer> r3 = com.bytedance.android.livesdk.w.b.j
            java.lang.Object r3 = r3.a()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            com.bytedance.android.livesdk.w.c<java.lang.Integer> r4 = com.bytedance.android.livesdk.w.b.aw
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.a(r3)
            com.bytedance.android.livesdk.w.c<java.lang.String> r3 = com.bytedance.android.livesdk.w.b.k
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = com.bytedance.android.livesdk.utils.ah.b(r4)
            r3.a(r4)
        L_0x0088:
            r3 = 1
        L_0x0089:
            if (r3 == 0) goto L_0x0093
            com.bytedance.android.livesdk.chatroom.interact.a.a r2 = com.bytedance.android.livesdk.chatroom.interact.a.a.a()
            r2.a((long) r0)
            return
        L_0x0093:
            r0 = r18
            com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract$View r1 = r0.f10831c
            com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKMatchContract$View r1 = (com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKMatchContract.View) r1
            r3 = 2131563699(0x7f0d14b3, float:1.8752862E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.bytedance.android.livesdk.w.c<java.lang.Integer> r4 = com.bytedance.android.livesdk.w.b.i
            java.lang.Object r4 = r4.a()
            r2[r10] = r4
            java.lang.String r2 = com.bytedance.android.live.core.utils.ac.a((int) r3, (java.lang.Object[]) r2)
            r1.a((java.lang.String) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.interact.c.af.a(long):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(d dVar) throws Exception {
        this.f10832d.l = ((com.bytedance.android.livesdk.chatroom.interact.model.b) dVar.f7871b).f10975b;
        this.f10832d.f9030d = ((com.bytedance.android.livesdk.chatroom.interact.model.b) dVar.f7871b).f10974a;
        ((InteractDialogPKMatchContract.View) this.f10831c).a(this.h);
        this.g = false;
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "INVITE_BATTLE_SUCCEED");
        hashMap.put("vendor", Integer.valueOf(((com.bytedance.android.livesdk.chatroom.interact.model.b) dVar.f7871b).f10975b));
        hashMap.put("channel_id", Long.valueOf(((com.bytedance.android.livesdk.chatroom.interact.model.b) dVar.f7871b).f10974a));
        c.b().a("ttlive_pk", (Map<String, Object>) hashMap);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Room room, Throwable th) throws Exception {
        a(th);
        ((InteractDialogPKMatchContract.View) this.f10831c).a(th);
        this.f10832d.c();
        this.g = false;
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "INVITE_BATTLE_FAILED");
        hashMap.put("target_room_id", Long.valueOf(room.getId()));
        c.b().a("ttlive_pk", (Map<String, Object>) hashMap);
    }

    public final void a(Room room, long j, String str, int i) {
        Room room2 = room;
        long j2 = j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{room2, new Long(j2), str2, Integer.valueOf(com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f)}, this, f10367e, false, 4671, new Class[]{Room.class, Long.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{room2, new Long(j2), str2, Integer.valueOf(com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f)}, this, f10367e, false, 4671, new Class[]{Room.class, Long.TYPE, String.class, Integer.TYPE}, Void.TYPE);
        } else if (!this.g) {
            this.g = true;
            this.h = room2;
            this.f10832d.i = com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f;
            this.f10832d.j = str2;
            this.f10832d.f9032f = room.getOwner().getId();
            ((ab) j.q().d().a().inviteWithBattleOn(4, com.bytedance.android.livesdk.chatroom.interact.data.b.f10870f, room.getId(), room.getOwner().getId(), j, str, com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f, 1).as(b())).a(new aj(this), new ak(this, room2));
        }
    }
}
