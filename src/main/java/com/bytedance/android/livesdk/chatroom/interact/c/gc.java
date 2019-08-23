package com.bytedance.android.livesdk.chatroom.interact.c;

import android.arch.lifecycle.Observer;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.model.a.h;
import com.bytedance.android.livesdk.chatroom.model.g;
import com.bytedance.android.livesdk.chatroom.presenter.bx;
import com.bytedance.android.livesdk.chatroom.viewmodule.al;
import com.bytedance.android.livesdk.message.model.aj;
import com.bytedance.android.livesdk.message.model.be;
import com.bytedance.android.livesdk.utils.b.b;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;

public final class gc extends bx<a> implements Observer<KVData>, OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10730a;

    /* renamed from: f  reason: collision with root package name */
    private static final int[][] f10731f = {new int[]{120, 10}, new int[]{c.f69428f, 25}, new int[]{600, 50}, new int[]{900, 75}};

    /* renamed from: b  reason: collision with root package name */
    boolean f10732b;

    /* renamed from: c  reason: collision with root package name */
    LinkCrossRoomDataHolder f10733c;

    /* renamed from: d  reason: collision with root package name */
    Disposable f10734d;

    /* renamed from: e  reason: collision with root package name */
    Disposable f10735e;
    private boolean g;
    private Room h;
    private int i = Integer.MAX_VALUE;
    private int j = Integer.MAX_VALUE;
    private int k;
    private Disposable l;
    private Disposable m;

    public interface a extends al {
        void a(int i);

        void a(int i, int i2);

        void b(int i);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Throwable th) {
        b(th);
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f10730a, false, 4985, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f10730a, false, 4985, new Class[]{String.class}, Void.TYPE);
            return;
        }
        be a2 = com.bytedance.android.livesdk.chatroom.bl.c.a(this.h.getId(), null, "", 3, str, "#FF8533", this.g ? "cmd_pk_mvp_show_list" : "5", "");
        a2.f16553b.k = 2130841305;
        this.y.insertMessage(a2, true);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f10730a, false, 4970, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10730a, false, 4970, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        h();
        this.f10733c.removeObserver(this);
    }

    private boolean e() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f10730a, false, 4979, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f10730a, false, 4979, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (g() >= this.f10733c.s.f9037e - this.f10733c.s.f9036d) {
            a();
        }
        if (g() >= this.f10733c.s.f9037e - this.f10733c.s.f9036d) {
            z = true;
        }
        return z;
    }

    private int g() {
        if (PatchProxy.isSupport(new Object[0], this, f10730a, false, 4980, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f10730a, false, 4980, new Class[0], Integer.TYPE)).intValue();
        }
        int intValue = ((Integer) this.f10733c.get("data_pk_anchor_score", 0)).intValue();
        int intValue2 = ((Integer) this.f10733c.get("data_pk_guest_score", 0)).intValue();
        if (this.f10733c.s.f9034b) {
            return (intValue - intValue2) - this.f10733c.s.f9036d;
        }
        return (intValue2 - intValue) - this.f10733c.s.f9036d;
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f10730a, false, 4981, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10730a, false, 4981, new Class[0], Void.TYPE);
            return;
        }
        if (this.f10734d != null) {
            this.f10734d.dispose();
        }
        if (this.f10735e != null) {
            this.f10735e.dispose();
        }
        if (this.l != null) {
            this.l.dispose();
        }
        if (this.m != null) {
            this.m.dispose();
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f10730a, false, 4976, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10730a, false, 4976, new Class[0], Void.TYPE);
        } else if (b() != null && !this.f10732b) {
            this.f10732b = true;
            if (this.l != null) {
                this.l.dispose();
                this.l = null;
            }
            ((ab) j.q().d().b().finishMode(1, this.f10733c.f9030d).as(p())).a(new gr(this), new gf(this));
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f10730a, false, 4978, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10730a, false, 4978, new Class[0], Void.TYPE);
        } else if (b() != null) {
            if (this.k <= 5) {
                if (this.m != null) {
                    this.m.dispose();
                    this.m = null;
                }
                this.m = ((ab) Observable.timer(1, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).as(o())).a(new gg(this), new gh(this));
                this.k++;
                return;
            }
            this.f10732b = false;
            a((com.bytedance.android.livesdk.chatroom.interact.data.a) null);
            if (this.m != null) {
                this.m.dispose();
            }
        }
    }

    public gc(DataCenter dataCenter) {
        this.g = ((Boolean) dataCenter.get("data_is_anchor")).booleanValue();
        this.h = (Room) dataCenter.get("data_room");
    }

    private boolean a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f10730a, false, 4986, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f10730a, false, 4986, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (com.bytedance.android.live.uikit.a.a.f() || ((LinkCrossRoomDataHolder.d) this.f10733c.get("data_pk_state")) != LinkCrossRoomDataHolder.d.PK || i2 <= this.f10733c.s.f9035c + 5 + 5) {
            return false;
        } else {
            ((ab) j.q().d().b().startMode(1, this.f10733c.f9030d).as(p())).a(gi.f10747b, new gj(this));
            return true;
        }
    }

    private void b(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f10730a, false, 4973, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f10730a, false, 4973, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (b() != null) {
            this.y.removeMessageListener(com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC.getIntType(), this);
            this.i += this.j + this.f10733c.s.f9035c + 5;
            if (this.i + this.f10733c.s.f9035c + 5 >= this.f10733c.i || this.f10733c.s.g >= 3) {
                this.i = Integer.MAX_VALUE;
            }
            this.f10733c.s.h = false;
            this.f10733c.lambda$put$1$DataCenter("data_pk_battle_mode", 1);
            c(j2);
            if (this.g) {
                com.bytedance.android.livesdk.j.a.a().a("start_backdoor", new com.bytedance.android.livesdk.j.c.j().a("live_detail").b("live_function"), LinkCrossRoomDataHolder.a().b(), Room.class);
            }
        }
    }

    public final void onMessage(IMessage iMessage) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f10730a, false, 4972, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage}, this, f10730a, false, 4972, new Class[]{IMessage.class}, Void.TYPE);
        } else if (iMessage instanceof h) {
            h hVar = (h) iMessage;
            com.bytedance.android.livesdk.chatroom.model.a.a aVar = hVar.f11043b;
            if (aVar.f11018a == 1 && aVar.f11019b != null) {
                LinkCrossRoomDataHolder.f fVar = this.f10733c.s;
                if (this.h.getOwner().getId() != aVar.f11019b.f11025f) {
                    z = false;
                }
                fVar.f9034b = z;
                this.f10733c.s.f9037e = aVar.f11019b.f11024e;
                this.f10733c.s.f9036d = aVar.f11019b.f11023d;
                this.f10733c.s.g = aVar.f11019b.j;
                this.f10733c.s.f9035c = aVar.f11019b.f11022c;
                this.f10733c.s.f9033a = aVar.f11019b.f11020a;
                b(hVar.timestamp);
            }
        } else if (iMessage instanceof aj) {
            aj ajVar = (aj) iMessage;
            if (!(ajVar.f16456c == null || ajVar.f16456c.f11018a != 1 || ajVar.f16456c.f11019b == null)) {
                this.i = ajVar.f16456c.f11019b.i;
            }
        } else {
            if (iMessage instanceof com.bytedance.android.livesdk.message.model.al) {
                com.bytedance.android.livesdk.message.model.al alVar = (com.bytedance.android.livesdk.message.model.al) iMessage;
                if (alVar.f16462b != null && alVar.f16462b.f16463a == 202) {
                    a(((Integer) this.f10733c.get("data_pk_time_left")).intValue());
                }
            }
        }
    }

    private void c(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f10730a, false, 4974, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f10730a, false, 4974, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (b() != null) {
            long j3 = this.f10733c.s.f9033a - j2;
            int i2 = ((int) j3) / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
            int i3 = (int) (j3 % 1000);
            this.f10733c.lambda$put$1$DataCenter("data_pk_steal_tower_state", LinkCrossRoomDataHolder.e.READY);
            int i4 = i2 + 1;
            ((a) b()).a(i4);
            ((a) b()).a(1, 1);
            if (j3 <= 0) {
                if (this.f10734d != null) {
                    this.f10734d.dispose();
                    this.f10734d = null;
                }
                if (this.f10735e != null) {
                    this.f10735e.dispose();
                    this.f10735e = null;
                }
                a(j2);
                return;
            }
            if (this.f10734d != null) {
                this.f10734d.dispose();
                this.f10734d = null;
            }
            if (this.f10735e != null) {
                this.f10735e.dispose();
                this.f10735e = null;
            }
            this.f10734d = ((ab) b.a(0, 1, TimeUnit.SECONDS).take((long) i4).delay((long) i3, TimeUnit.MILLISECONDS).map(new gd(i2)).observeOn(AndroidSchedulers.mainThread()).as(o())).a(new ge(this), new gk(this));
            int i5 = ((i2 * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE) / 50) + 1;
            this.f10735e = b.a(0, 50, TimeUnit.MILLISECONDS).take((long) i5).compose(((a) b()).getAutoUnbindTransformer()).map(new gl(i5)).observeOn(AndroidSchedulers.mainThread()).subscribe(new gm(this), new gn(this));
        }
    }

    /* access modifiers changed from: package-private */
    public void a(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f10730a, false, 4975, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f10730a, false, 4975, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (b() != null) {
            long j3 = (this.f10733c.s.f9033a - j2) + ((long) (this.f10733c.s.f9035c * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
            int i2 = ((int) j3) / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
            int i3 = (int) (j3 % 1000);
            this.f10733c.lambda$put$1$DataCenter("data_pk_steal_tower_state", LinkCrossRoomDataHolder.e.IN_PROCESS);
            int i4 = i2 + 1;
            ((a) b()).b(i4);
            if (!e()) {
                this.f10733c.observeForever("data_pk_anchor_score", this, true).observeForever("data_pk_guest_score", this, true);
                if (j3 < 0) {
                    if (this.l != null) {
                        this.l.dispose();
                        this.l = null;
                    }
                    a();
                    return;
                }
                if (this.l != null) {
                    this.l.dispose();
                    this.l = null;
                }
                this.l = ((ab) b.a(0, 1, TimeUnit.SECONDS).take((long) i4).delay((long) i3, TimeUnit.MILLISECONDS).map(new go(i2)).observeOn(AndroidSchedulers.mainThread()).as(o())).a(new gp(this), new gq(this));
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r11) {
        /*
            r10 = this;
            r7 = r11
            com.bytedance.ies.sdk.widgets.KVData r7 = (com.bytedance.ies.sdk.widgets.KVData) r7
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f10730a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.ies.sdk.widgets.KVData> r1 = com.bytedance.ies.sdk.widgets.KVData.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 4971(0x136b, float:6.966E-42)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0033
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f10730a
            r3 = 0
            r4 = 4971(0x136b, float:6.966E-42)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.ies.sdk.widgets.KVData> r1 = com.bytedance.ies.sdk.widgets.KVData.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0033:
            if (r7 == 0) goto L_0x01ae
            java.lang.String r0 = r7.getKey()
            if (r0 == 0) goto L_0x01ae
            java.lang.Object r0 = r7.getData()
            if (r0 != 0) goto L_0x0043
            goto L_0x01ae
        L_0x0043:
            java.lang.String r0 = r7.getKey()
            r1 = -1
            int r2 = r0.hashCode()
            switch(r2) {
                case -1692693464: goto L_0x0078;
                case -717118025: goto L_0x006e;
                case -471511460: goto L_0x0064;
                case 208701290: goto L_0x005a;
                case 1505611330: goto L_0x0050;
                default: goto L_0x004f;
            }
        L_0x004f:
            goto L_0x0082
        L_0x0050:
            java.lang.String r2 = "data_pk_state"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0082
            r0 = 4
            goto L_0x0083
        L_0x005a:
            java.lang.String r2 = "data_pk_time_left"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0082
            r0 = 3
            goto L_0x0083
        L_0x0064:
            java.lang.String r2 = "data_pk_guest_score"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0082
            r0 = 2
            goto L_0x0083
        L_0x006e:
            java.lang.String r2 = "data_pk_anchor_score"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0082
            r0 = 1
            goto L_0x0083
        L_0x0078:
            java.lang.String r2 = "data_pk_current_room_interact_info"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0082
            r0 = 0
            goto L_0x0083
        L_0x0082:
            r0 = -1
        L_0x0083:
            switch(r0) {
                case 0: goto L_0x0148;
                case 1: goto L_0x010c;
                case 2: goto L_0x00d0;
                case 3: goto L_0x00a1;
                case 4: goto L_0x0088;
                default: goto L_0x0086;
            }
        L_0x0086:
            goto L_0x01ad
        L_0x0088:
            java.lang.Object r0 = r7.getData()
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$d r1 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.d.PENAL
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01ad
            com.ss.ugc.live.sdk.message.interfaces.IMessageManager r0 = r10.y
            com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC
            int r1 = r1.getIntType()
            r0.removeMessageListener(r1, r10)
            goto L_0x01ad
        L_0x00a1:
            java.lang.Object r0 = r7.getData()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r1 = r10.f10733c
            int r1 = r1.i
            int r1 = r1 - r0
            int r0 = r10.i
            if (r1 != r0) goto L_0x01ad
            java.lang.Object r0 = r7.getData()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            boolean r0 = r10.a((int) r0)
            if (r0 == 0) goto L_0x01ad
            com.ss.ugc.live.sdk.message.interfaces.IMessageManager r0 = r10.y
            com.bytedance.android.livesdkapi.depend.f.a r1 = com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC
            int r1 = r1.getIntType()
            r0.addMessageListener(r1, r10)
            return
        L_0x00d0:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f10730a
            r3 = 0
            r4 = 4984(0x1378, float:6.984E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00f3
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f10730a
            r3 = 0
            r4 = 4984(0x1378, float:6.984E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01ad
        L_0x00f3:
            com.bytedance.ies.a.a r0 = r10.b()
            if (r0 == 0) goto L_0x010b
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r0 = r10.f10733c
            java.lang.String r1 = "data_pk_steal_tower_score"
            int r2 = r10.g()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.lambda$put$1$DataCenter(r1, r2)
            r10.e()
        L_0x010b:
            return
        L_0x010c:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f10730a
            r3 = 0
            r4 = 4983(0x1377, float:6.983E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x012f
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f10730a
            r3 = 0
            r4 = 4983(0x1377, float:6.983E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01ad
        L_0x012f:
            com.bytedance.ies.a.a r0 = r10.b()
            if (r0 == 0) goto L_0x0147
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r0 = r10.f10733c
            java.lang.String r1 = "data_pk_steal_tower_score"
            int r2 = r10.g()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.lambda$put$1$DataCenter(r1, r2)
            r10.e()
        L_0x0147:
            return
        L_0x0148:
            java.lang.Object r0 = r7.getData()
            r7 = r0
            com.bytedance.android.live.core.network.response.d r7 = (com.bytedance.android.live.core.network.response.d) r7
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f10730a
            r3 = 0
            r4 = 4982(0x1376, float:6.981E-42)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.android.live.core.network.response.d> r1 = com.bytedance.android.live.core.network.response.d.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x017d
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f10730a
            r3 = 0
            r4 = 4982(0x1376, float:6.981E-42)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.android.live.core.network.response.d> r1 = com.bytedance.android.live.core.network.response.d.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01ad
        L_0x017d:
            java.lang.Object r0 = r7.f7871b
            com.bytedance.android.livesdk.chatroom.model.a.p r0 = (com.bytedance.android.livesdk.chatroom.model.a.p) r0
            com.bytedance.android.livesdk.chatroom.model.a.a r1 = r0.f11074e
            if (r1 == 0) goto L_0x01ac
            com.bytedance.android.livesdk.chatroom.model.a.a r1 = r0.f11074e
            int r1 = r1.f11018a
            if (r1 != r8) goto L_0x01ac
            com.bytedance.android.livesdk.chatroom.model.a.a r1 = r0.f11074e
            com.bytedance.android.livesdk.chatroom.model.a.a$a r1 = r1.f11019b
            if (r1 == 0) goto L_0x01ac
            com.bytedance.android.livesdk.chatroom.model.a.a r1 = r0.f11074e
            com.bytedance.android.livesdk.chatroom.model.a.a$a r1 = r1.f11019b
            long r1 = r1.f11020a
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x01ac
            com.bytedance.android.livesdk.chatroom.model.a.a r0 = r0.f11074e
            com.bytedance.android.livesdk.chatroom.model.a.a$a r0 = r0.f11019b
            boolean r0 = r0.g
            if (r0 != 0) goto L_0x01ac
            com.bytedance.android.live.base.model.Extra r0 = r7.f7872c
            long r0 = r0.now
            r10.b(r0)
        L_0x01ac:
            return
        L_0x01ad:
            return
        L_0x01ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.interact.c.gc.onChanged(java.lang.Object):void");
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f10730a, false, 4969, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f10730a, false, 4969, new Class[]{a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        if (this.y != null) {
            this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC_BATTLE.getIntType(), this);
            this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.BATTLE_MODE.getIntType(), this);
        }
        this.f10733c = LinkCrossRoomDataHolder.a();
        this.f10733c.lambda$put$1$DataCenter("data_pk_steal_tower_state", LinkCrossRoomDataHolder.e.DISABLED);
        if (this.f10733c != LinkCrossRoomDataHolder.f9028b) {
            this.f10733c.observeForever("data_pk_current_room_interact_info", this).observeForever("data_pk_state", this);
        }
        if (this.g) {
            this.f10733c.observeForever("data_pk_time_left", this);
        }
        for (int[] iArr : f10731f) {
            if (iArr[0] == this.f10733c.i) {
                this.j = iArr[1];
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(com.bytedance.android.livesdk.chatroom.interact.data.a aVar) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f10730a, false, 4977, new Class[]{com.bytedance.android.livesdk.chatroom.interact.data.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f10730a, false, 4977, new Class[]{com.bytedance.android.livesdk.chatroom.interact.data.a.class}, Void.TYPE);
            return;
        }
        this.f10733c.lambda$put$1$DataCenter("data_pk_steal_tower_state", LinkCrossRoomDataHolder.e.ENDED).removeObserver("data_pk_anchor_score", this).removeObserver("data_pk_guest_score", this);
        h();
        if (b() == null || aVar == null || aVar.f10863a == null || aVar.f10863a.f11019b == null || aVar.f10864b == null) {
            this.f10733c.s.f9038f = false;
            this.f10733c.s.h = true;
            this.f10733c.lambda$put$1$DataCenter("data_pk_battle_mode", 0);
            return;
        }
        LinkCrossRoomDataHolder.f fVar = this.f10733c.s;
        if (aVar.f10863a.f11019b.h != 0) {
            z = true;
        } else {
            z = false;
        }
        fVar.f9038f = z;
        this.f10733c.lambda$put$1$DataCenter("data_pk_steal_tower_score", Integer.valueOf(g())).lambda$put$1$DataCenter("data_pk_battle_mode", 0);
        if (this.f10733c.s.f9038f) {
            this.f10733c.lambda$put$1$DataCenter("cmd_pk_finish", new g());
        }
        if (this.g && this.f10733c.s.f9038f) {
            com.bytedance.android.livesdk.j.a.a().a("backdoor_success", new com.bytedance.android.livesdk.j.c.j().a("live_detail").b("live_function"), LinkCrossRoomDataHolder.a().b(), Room.class);
        }
    }
}
