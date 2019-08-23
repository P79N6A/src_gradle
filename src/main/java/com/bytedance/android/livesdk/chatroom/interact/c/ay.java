package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKUserListContract;
import com.bytedance.android.livesdk.chatroom.interact.model.b;
import com.bytedance.android.livesdk.j.c;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

public final class ay extends InteractDialogPKUserListContract.a {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f10405e;

    /* renamed from: f  reason: collision with root package name */
    private Room f10406f;
    private boolean g;

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f10405e, false, 4697, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10405e, false, 4697, new Class[0], Void.TYPE);
            return;
        }
        ((ab) j.q().d().a().rivalsList().as(b())).a(new az(this), new ba(this));
    }

    public ay(InteractDialogPKUserListContract.View view) {
        super(view);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(Throwable th) throws Exception {
        a(th);
        ((InteractDialogPKUserListContract.View) this.f10831c).a(th);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(d dVar) throws Exception {
        ((InteractDialogPKUserListContract.View) this.f10831c).a((com.bytedance.android.livesdk.chatroom.interact.model.d) dVar.f7871b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(d dVar) throws Exception {
        this.f10832d.l = ((b) dVar.f7871b).f10975b;
        this.f10832d.f9030d = ((b) dVar.f7871b).f10974a;
        ((InteractDialogPKUserListContract.View) this.f10831c).a(this.f10406f);
        this.g = false;
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "INVITE_SUCCEED");
        hashMap.put("vendor", Integer.valueOf(((b) dVar.f7871b).f10975b));
        hashMap.put("channel_id", Long.valueOf(((b) dVar.f7871b).f10974a));
        c.b().a("ttlive_pk", (Map<String, Object>) hashMap);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(d dVar) throws Exception {
        this.f10832d.l = ((b) dVar.f7871b).f10975b;
        this.f10832d.f9030d = ((b) dVar.f7871b).f10974a;
        ((InteractDialogPKUserListContract.View) this.f10831c).a(this.f10406f);
        this.g = false;
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "INVITE_BATTLE_SUCCEED");
        hashMap.put("vendor", Integer.valueOf(((b) dVar.f7871b).f10975b));
        hashMap.put("channel_id", Long.valueOf(((b) dVar.f7871b).f10974a));
        c.b().a("ttlive_pk", (Map<String, Object>) hashMap);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Room room, Throwable th) throws Exception {
        a(th);
        ((InteractDialogPKUserListContract.View) this.f10831c).b(th);
        this.g = false;
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "INVITE_FAILED");
        hashMap.put("target_room_id", Long.valueOf(room.getId()));
        c.b().b("ttlive_pk", (Map<String, Object>) hashMap);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(Room room, Throwable th) throws Exception {
        a(th);
        ((InteractDialogPKUserListContract.View) this.f10831c).b(th);
        this.f10832d.c();
        this.g = false;
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "INVITE_BATTLE_FAILED");
        hashMap.put("target_room_id", Long.valueOf(room.getId()));
        c.b().b("ttlive_pk", (Map<String, Object>) hashMap);
    }

    public final void a(Room room, long j) {
        Room room2 = room;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{room2, new Long(j2)}, this, f10405e, false, 4699, new Class[]{Room.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{room2, new Long(j2)}, this, f10405e, false, 4699, new Class[]{Room.class, Long.TYPE}, Void.TYPE);
        } else if (!this.g) {
            this.g = true;
            this.f10406f = room2;
            this.f10832d.f9032f = room.getOwner().getId();
            ((ab) j.q().d().a().invite(com.bytedance.android.livesdk.chatroom.interact.data.b.f10870f, room.getId(), room.getOwner().getId(), j, 0).as(b())).a(new bd(this), new be(this, room2));
        }
    }

    public final void a(Room room, long j, String str, int i) {
        Room room2 = room;
        long j2 = j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{room2, new Long(j2), str2, Integer.valueOf(i)}, this, f10405e, false, 4698, new Class[]{Room.class, Long.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{room2, new Long(j2), str2, Integer.valueOf(i)}, this, f10405e, false, 4698, new Class[]{Room.class, Long.TYPE, String.class, Integer.TYPE}, Void.TYPE);
        } else if (!this.g) {
            this.g = true;
            this.f10406f = room2;
            this.f10832d.i = i;
            this.f10832d.j = str2;
            this.f10832d.f9032f = room.getOwner().getId();
            ((ab) j.q().d().a().inviteWithBattleOn(4, com.bytedance.android.livesdk.chatroom.interact.data.b.f10870f, room.getId(), room.getOwner().getId(), j, str, i, 0).as(b())).a(new bb(this), new bc(this, room2));
        }
    }
}
