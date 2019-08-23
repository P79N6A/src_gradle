package com.bytedance.android.livesdk.chatroom.interact.c;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.presenter.bx;
import com.bytedance.android.livesdk.chatroom.viewmodule.al;
import com.bytedance.android.livesdk.j.c.g;
import com.bytedance.android.livesdk.utils.b.b;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class fl extends bx<a> implements Observer<KVData>, OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10687a;

    /* renamed from: b  reason: collision with root package name */
    public Room f10688b = ((Room) this.g.get("data_room"));

    /* renamed from: c  reason: collision with root package name */
    boolean f10689c = ((Boolean) this.g.get("data_is_anchor")).booleanValue();

    /* renamed from: d  reason: collision with root package name */
    public LinkCrossRoomDataHolder f10690d = LinkCrossRoomDataHolder.a();

    /* renamed from: e  reason: collision with root package name */
    public boolean f10691e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10692f;
    private DataCenter g;
    private Disposable h;

    public interface a extends al {
        void a(String str);

        void a(boolean z);

        void b();

        void c();

        void d();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Throwable th) {
        b(th);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f10687a, false, 4945, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10687a, false, 4945, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.dispose();
            this.h = null;
        }
        if (this.f10689c) {
            a(false);
        } else {
            b(true);
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f10687a, false, 4940, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10687a, false, 4940, new Class[0], Void.TYPE);
            return;
        }
        this.y.removeMessageListener(this);
        if (this.h != null) {
            this.h.dispose();
            this.h = null;
        }
        this.f10690d.removeObserver(this);
        super.d();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f10687a, false, 4948, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10687a, false, 4948, new Class[0], Void.TYPE);
        } else if (b() != null) {
            ((ab) j.q().d().b().openBattle(this.f10690d.f9030d, this.f10690d.i, this.f10690d.p, this.f10690d.j).as(p())).a(new fz(this), new ga(this));
        }
    }

    public fl(DataCenter dataCenter) {
        this.g = dataCenter;
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f10687a, false, 4950, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f10687a, false, 4950, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (b() != null) {
            ((ab) j.q().d().b().battleStats(this.f10690d.f9030d, this.f10688b.getOwner().getId()).as(p())).a(new fp(this, z), new fq(this));
        }
    }

    public final /* synthetic */ void onChanged(@Nullable Object obj) {
        KVData kVData = (KVData) obj;
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f10687a, false, 4938, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f10687a, false, 4938, new Class[]{KVData.class}, Void.TYPE);
        } else if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c2 = 65535;
            if (key.hashCode() == -227699054 && key.equals("cmd_pk_finish")) {
                c2 = 0;
            }
            if (c2 == 0) {
                a();
            }
        }
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f10687a, false, 4939, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f10687a, false, 4939, new Class[]{a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC.getIntType(), this);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC_BATTLE.getIntType(), this);
        this.f10690d.lambda$put$1$DataCenter("data_pk_anchor_score", 0).lambda$put$1$DataCenter("data_pk_guest_score", 0).observeForever("cmd_pk_finish", this);
        if (!this.f10689c || this.f10690d.h) {
            if (!this.f10689c && this.f10690d.f9030d > 0 && this.f10690d.i > 0) {
                this.f10690d.lambda$put$1$DataCenter("cmd_log_link", "Entered_Pk_Halfway");
                b(false);
            }
            return;
        }
        c();
    }

    /* access modifiers changed from: package-private */
    public void a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f10687a, false, 4944, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f10687a, false, 4944, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (this.f10690d.i > 0 && this.f10690d.k > 0 && b() != null) {
            this.f10690d.lambda$put$1$DataCenter("data_pk_state", LinkCrossRoomDataHolder.d.PK);
            this.f10690d.lambda$put$1$DataCenter("data_pk_result", LinkCrossRoomDataHolder.c.UNFINISHED);
            long j2 = (this.f10690d.k - j) + ((long) (this.f10690d.i * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
            int i = (int) j2;
            int i2 = i / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
            int i3 = i % PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
            if (j2 < 0) {
                if (this.h != null) {
                    this.h.dispose();
                    this.h = null;
                }
                if (((long) (this.f10690d.q * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE)) + j2 > 0) {
                    b(((long) (this.f10690d.q * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE)) + j2);
                } else {
                    this.f10690d.lambda$put$1$DataCenter("data_pk_state", LinkCrossRoomDataHolder.d.FINISHED);
                }
            } else {
                if (this.h != null) {
                    this.h.dispose();
                    this.h = null;
                }
                ((a) b()).a(this.f10689c);
                int i4 = i2 + 1;
                this.f10690d.lambda$put$1$DataCenter("data_pk_time_left", Integer.valueOf(i4));
                this.h = b.a(0, 1, TimeUnit.SECONDS).take((long) i4).delay((long) i3, TimeUnit.MILLISECONDS).map(new fm(i2)).observeOn(AndroidSchedulers.mainThread()).subscribe(new fn(this), new fu(this));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f10687a, false, 4951, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f10687a, false, 4951, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (b() != null) {
            int intValue = ((Integer) this.f10690d.get("data_pk_anchor_score")).intValue();
            int intValue2 = ((Integer) this.f10690d.get("data_pk_guest_score")).intValue();
            if (intValue > intValue2) {
                this.f10690d.lambda$put$1$DataCenter("data_pk_result", LinkCrossRoomDataHolder.c.LEFT_WON);
            } else if (intValue < intValue2) {
                this.f10690d.lambda$put$1$DataCenter("data_pk_result", LinkCrossRoomDataHolder.c.RIGHT_WON);
            } else {
                this.f10690d.lambda$put$1$DataCenter("data_pk_result", LinkCrossRoomDataHolder.c.EVEN);
            }
            this.f10690d.lambda$put$1$DataCenter("data_pk_state", LinkCrossRoomDataHolder.d.PENAL);
            if (j <= 0) {
                this.f10690d.lambda$put$1$DataCenter("data_pk_state", LinkCrossRoomDataHolder.d.FINISHED);
            }
            int i = (int) (j / 1000);
            int i2 = (int) (j % 1000);
            if (this.h != null) {
                this.h.dispose();
                this.h = null;
            }
            this.h = b.a(0, 1, TimeUnit.SECONDS).take((long) (i + 1)).delay((long) i2, TimeUnit.MILLISECONDS).map(new fr(i)).observeOn(AndroidSchedulers.mainThread()).subscribe(new fs(this), new ft(this));
            if (this.f10689c) {
                g gVar = new g();
                if (this.f10688b.getId() == this.f10690d.f9030d) {
                    gVar.a(this.f10688b.getOwner().getId());
                    gVar.b(this.f10690d.f9032f);
                } else {
                    gVar.a(this.f10690d.f9032f);
                    gVar.b(this.f10688b.getOwner().getId());
                }
                com.bytedance.android.livesdk.j.a.a().a("pk_time_out", new com.bytedance.android.livesdk.j.c.j().a("live_detail").b("live").f("other"), gVar, LinkCrossRoomDataHolder.a().b(), Room.class);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0085, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f10687a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.ugc.live.sdk.message.data.IMessage> r1 = com.ss.ugc.live.sdk.message.data.IMessage.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 4941(0x134d, float:6.924E-42)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f10687a
            r3 = 0
            r4 = 4941(0x134d, float:6.924E-42)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.ugc.live.sdk.message.data.IMessage> r1 = com.ss.ugc.live.sdk.message.data.IMessage.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            com.bytedance.ies.a.a r0 = r10.b()
            if (r0 != 0) goto L_0x0037
            return
        L_0x0037:
            boolean r0 = r11 instanceof com.bytedance.android.livesdk.message.model.al
            if (r0 == 0) goto L_0x0086
            r0 = r11
            com.bytedance.android.livesdk.message.model.al r0 = (com.bytedance.android.livesdk.message.model.al) r0
            com.bytedance.android.livesdk.message.model.am r1 = r0.f16462b
            if (r1 != 0) goto L_0x0043
            return
        L_0x0043:
            com.bytedance.android.livesdk.message.model.am r0 = r0.f16462b
            long r1 = r0.g
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0053
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r1 = r10.f10690d
            long r2 = r0.g
            r1.f9030d = r2
        L_0x0053:
            int r1 = r0.f16463a
            switch(r1) {
                case 202: goto L_0x007e;
                case 203: goto L_0x0063;
                case 204: goto L_0x0059;
                default: goto L_0x0058;
            }
        L_0x0058:
            goto L_0x0085
        L_0x0059:
            com.bytedance.ies.a.a r0 = r10.b()
            com.bytedance.android.livesdk.chatroom.interact.c.fl$a r0 = (com.bytedance.android.livesdk.chatroom.interact.c.fl.a) r0
            r0.d()
            goto L_0x0085
        L_0x0063:
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r0 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.a()
            java.lang.String r1 = "data_pk_state"
            java.lang.Object r0 = r0.get(r1)
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$d r0 = (com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.d) r0
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$d r1 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.d.PENAL
            if (r0 != r1) goto L_0x0085
            com.bytedance.ies.a.a r0 = r10.b()
            com.bytedance.android.livesdk.chatroom.interact.c.fl$a r0 = (com.bytedance.android.livesdk.chatroom.interact.c.fl.a) r0
            r0.c()
            goto L_0x01c4
        L_0x007e:
            java.util.List<com.bytedance.android.livesdk.chatroom.model.a.b> r0 = r0.p
            r10.a((java.util.List<com.bytedance.android.livesdk.chatroom.model.a.b>) r0)
            goto L_0x01c4
        L_0x0085:
            return
        L_0x0086:
            boolean r0 = r11 instanceof com.bytedance.android.livesdk.message.model.aj
            if (r0 == 0) goto L_0x01c4
            r7 = r11
            com.bytedance.android.livesdk.message.model.aj r7 = (com.bytedance.android.livesdk.message.model.aj) r7
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f10687a
            r3 = 0
            r4 = 4942(0x134e, float:6.925E-42)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.android.livesdk.message.model.aj> r1 = com.bytedance.android.livesdk.message.model.aj.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00bc
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f10687a
            r3 = 0
            r4 = 4942(0x134e, float:6.925E-42)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.android.livesdk.message.model.aj> r1 = com.bytedance.android.livesdk.message.model.aj.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01b1
        L_0x00bc:
            com.bytedance.ies.a.a r0 = r10.b()
            if (r0 == 0) goto L_0x01b1
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r0 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.a()
            java.lang.String r1 = "data_pk_state"
            java.lang.Object r0 = r0.get(r1)
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$d r0 = (com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.d) r0
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r1 = r10.f10690d
            com.bytedance.android.livesdk.chatroom.model.a.c r2 = r7.f16455b
            long r2 = r2.f11031d
            r1.k = r2
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r1 = r10.f10690d
            com.bytedance.android.livesdk.chatroom.model.a.c r2 = r7.f16455b
            int r2 = r2.f11029b
            r1.i = r2
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r1 = r10.f10690d
            com.bytedance.android.livesdk.chatroom.model.a.c r2 = r7.f16455b
            java.lang.String r2 = r2.f11030c
            r1.j = r2
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r1 = r10.f10690d
            com.bytedance.android.livesdk.chatroom.model.a.c r2 = r7.f16455b
            long r2 = r2.f11032e
            r1.f9031e = r2
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r1 = r10.f10690d
            com.bytedance.android.livesdk.chatroom.model.a.c r2 = r7.f16455b
            long r2 = r2.f11033f
            int r2 = (int) r2
            r1.p = r2
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r1 = r10.f10690d
            java.lang.String r2 = "data_pk_anchor_score"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r1.lambda$put$1$DataCenter(r2, r3)
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r1 = r10.f10690d
            java.lang.String r2 = "data_pk_guest_score"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r1.lambda$put$1$DataCenter(r2, r3)
            boolean r1 = r10.f10689c
            if (r1 != 0) goto L_0x0115
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$d r1 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.d.PENAL
            if (r0 != r1) goto L_0x0122
        L_0x0115:
            com.bytedance.ies.a.a r1 = r10.b()
            com.bytedance.android.livesdk.chatroom.interact.c.fl$a r1 = (com.bytedance.android.livesdk.chatroom.interact.c.fl.a) r1
            com.bytedance.android.livesdk.chatroom.model.a.c r2 = r7.f16455b
            java.lang.String r2 = r2.f11030c
            r1.a((java.lang.String) r2)
        L_0x0122:
            com.bytedance.ies.sdk.widgets.DataCenter r1 = r10.g
            java.lang.String r2 = "cmd_pk_state_change"
            com.bytedance.android.livesdk.chatroom.event.o r3 = new com.bytedance.android.livesdk.chatroom.event.o
            r4 = 5
            r3.<init>(r4)
            r1.lambda$put$1$DataCenter(r2, r3)
            long r1 = r7.timestamp
            r10.a((long) r1)
            boolean r1 = r10.f10689c
            if (r1 == 0) goto L_0x01b1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = "is_oncemore"
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$d r3 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.d.PENAL
            if (r0 != r3) goto L_0x0146
            java.lang.String r0 = "oncemore"
            goto L_0x0148
        L_0x0146:
            java.lang.String r0 = "not_oncemore"
        L_0x0148:
            r1.put(r2, r0)
            com.bytedance.android.livesdk.j.a r0 = com.bytedance.android.livesdk.j.a.a()
            java.lang.String r2 = "pk_start"
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.bytedance.android.livesdk.j.c.j r4 = new com.bytedance.android.livesdk.j.c.j
            r4.<init>()
            java.lang.String r5 = "live_take"
            com.bytedance.android.livesdk.j.c.j r4 = r4.b(r5)
            java.lang.String r5 = "live_detail"
            com.bytedance.android.livesdk.j.c.j r4 = r4.a(r5)
            r3[r9] = r4
            com.bytedance.android.livesdk.j.c.g r4 = new com.bytedance.android.livesdk.j.c.g
            r4.<init>()
            boolean r5 = r10.f10692f
            if (r5 == 0) goto L_0x017b
            com.bytedance.android.livesdkapi.depend.model.live.Room r5 = r10.f10688b
            com.bytedance.android.live.base.model.user.User r5 = r5.getOwner()
            long r5 = r5.getId()
            goto L_0x017f
        L_0x017b:
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r5 = r10.f10690d
            long r5 = r5.f9032f
        L_0x017f:
            com.bytedance.android.livesdk.j.c.g r4 = r4.b((long) r5)
            boolean r5 = r10.f10692f
            if (r5 == 0) goto L_0x018c
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r5 = r10.f10690d
            long r5 = r5.f9032f
            goto L_0x0196
        L_0x018c:
            com.bytedance.android.livesdkapi.depend.model.live.Room r5 = r10.f10688b
            com.bytedance.android.live.base.model.user.User r5 = r5.getOwner()
            long r5 = r5.getId()
        L_0x0196:
            com.bytedance.android.livesdk.j.c.g r4 = r4.a((long) r5)
            r3[r8] = r4
            r4 = 2
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r5 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.a()
            com.bytedance.android.livesdk.j.c.f r5 = r5.b()
            r3[r4] = r5
            r4 = 3
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r5 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r3[r4] = r5
            r0.a(r2, r1, r3)
            r10.f10692f = r9
        L_0x01b1:
            com.bytedance.android.livesdk.chatroom.model.a.d r0 = r7.f16457d
            if (r0 == 0) goto L_0x01c4
            com.bytedance.android.livesdk.chatroom.model.a.d r0 = r7.f16457d
            boolean r0 = r0.f11034a
            if (r0 == 0) goto L_0x01c4
            com.bytedance.ies.a.a r0 = r10.b()
            com.bytedance.android.livesdk.chatroom.interact.c.fl$a r0 = (com.bytedance.android.livesdk.chatroom.interact.c.fl.a) r0
            r0.b()
        L_0x01c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.interact.c.fl.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    /* access modifiers changed from: package-private */
    public void a(List<com.bytedance.android.livesdk.chatroom.model.a.b> list) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{list}, this, f10687a, false, 4943, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f10687a, false, 4943, new Class[]{List.class}, Void.TYPE);
        } else if (list != null && b() != null) {
            int i2 = 0;
            for (com.bytedance.android.livesdk.chatroom.model.a.b next : list) {
                if (next.f11026a == this.f10688b.getOwner().getId()) {
                    i = next.f11027b;
                } else if (next.f11026a == this.f10690d.f9032f) {
                    i2 = next.f11027b;
                }
            }
            if (!this.f10690d.get("data_pk_anchor_score").equals(Integer.valueOf(i))) {
                this.f10690d.lambda$put$1$DataCenter("data_pk_anchor_score", Integer.valueOf(i));
            }
            if (!this.f10690d.get("data_pk_guest_score").equals(Integer.valueOf(i2))) {
                this.f10690d.lambda$put$1$DataCenter("data_pk_guest_score", Integer.valueOf(i2));
            }
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f10687a, false, 4949, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f10687a, false, 4949, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (b() != null) {
            ((ab) j.q().d().b().finish(this.f10690d.f9030d, this.f10690d.p, z ? 1 : 0).as(p())).a(new gb(this, z), new fo(this, z));
            if (z) {
                g d2 = new g().d("initiative");
                if (this.f10688b.getId() == this.f10690d.f9030d) {
                    d2.a(this.f10688b.getOwner().getId());
                    d2.b(this.f10690d.f9032f);
                } else {
                    d2.a(this.f10690d.f9032f);
                    d2.b(this.f10688b.getOwner().getId());
                }
                com.bytedance.android.livesdk.j.a.a().a("pk_ended", new com.bytedance.android.livesdk.j.c.j().a("live_detail").b("live").f("other"), d2, LinkCrossRoomDataHolder.a().b(), Room.class);
            }
        }
    }
}
