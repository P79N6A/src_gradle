package com.bytedance.android.livesdk.chatroom.presenter;

import android.annotation.SuppressLint;
import android.support.annotation.Nullable;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.model.t;
import com.bytedance.android.livesdk.chatroom.viewmodule.al;
import com.bytedance.android.livesdk.message.model.aq;
import com.bytedance.android.livesdk.user.b;
import com.bytedance.android.livesdk.user.f;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class au extends bx<b> implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11241a;
    private static final a h = new a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11247a;

        public final void a(com.bytedance.android.livesdkapi.depend.model.b.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f11247a, false, 5279, new Class[]{com.bytedance.android.livesdkapi.depend.model.b.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f11247a, false, 5279, new Class[]{com.bytedance.android.livesdkapi.depend.model.b.a.class}, Void.TYPE);
            }
        }

        public final void a(Throwable th) {
            if (PatchProxy.isSupport(new Object[]{th}, this, f11247a, false, 5280, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th}, this, f11247a, false, 5280, new Class[]{Throwable.class}, Void.TYPE);
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public Room f11242b;

    /* renamed from: c  reason: collision with root package name */
    boolean f11243c;

    /* renamed from: d  reason: collision with root package name */
    public String f11244d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11245e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11246f;
    public a g;
    private final int i = ((Integer) com.bytedance.android.livesdk.config.a.B.a()).intValue();
    @SuppressLint({"UseSparseArrays"})
    private Map<Long, c> j = new HashMap();
    private List<aq> k = new ArrayList();
    private List<aq> l = new ArrayList();

    public interface a {
        void a(com.bytedance.android.livesdkapi.depend.model.b.a aVar);

        void a(Throwable th);
    }

    public interface b extends al {
        void a(c cVar);

        void a(aq aqVar);

        void b();

        void b(Throwable th);

        void c();
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public aq f11248a;

        /* renamed from: b  reason: collision with root package name */
        public Observable<Integer> f11249b;
    }

    public final String f() {
        return "MagicBoxPresenter";
    }

    /* access modifiers changed from: package-private */
    public a e() {
        if (this.g == null) {
            return h;
        }
        return this.g;
    }

    public final int a() {
        if (!PatchProxy.isSupport(new Object[0], this, f11241a, false, 5258, new Class[0], Integer.TYPE)) {
            return this.l.size() + this.k.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f11241a, false, 5258, new Class[0], Integer.TYPE)).intValue();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f11241a, false, 5250, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11241a, false, 5250, new Class[0], Void.TYPE);
            return;
        }
        this.j.clear();
        this.k.clear();
        this.l.clear();
        this.g = null;
        this.f11245e = false;
        this.f11246f = false;
        super.d();
    }

    @Nullable
    public final c c() {
        if (PatchProxy.isSupport(new Object[0], this, f11241a, false, 5260, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], this, f11241a, false, 5260, new Class[0], c.class);
        } else if (this.k.size() > 0) {
            return this.j.get(Long.valueOf(this.k.get(0).f16478c));
        } else {
            if (this.l.size() > 0) {
                return this.j.get(Long.valueOf(this.l.get(0).f16478c));
            }
            return null;
        }
    }

    private void c(aq aqVar) {
        if (PatchProxy.isSupport(new Object[]{aqVar}, this, f11241a, false, 5263, new Class[]{aq.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aqVar}, this, f11241a, false, 5263, new Class[]{aq.class}, Void.TYPE);
            return;
        }
        ((ab) Observable.timer((long) this.i, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).compose(i.a()).as(o())).a(new ax(this, aqVar), new ay(this));
    }

    public final long a(aq aqVar) {
        aq aqVar2 = aqVar;
        if (!PatchProxy.isSupport(new Object[]{aqVar2}, this, f11241a, false, 5261, new Class[]{aq.class}, Long.TYPE)) {
            return (aqVar2.f16479d + ((long) (aqVar2.f16480e * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE))) - com.bytedance.android.livesdk.utils.a.a.a();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{aqVar2}, this, f11241a, false, 5261, new Class[]{aq.class}, Long.TYPE)).longValue();
    }

    public final int b(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f11241a, false, 5259, new Class[]{Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f11241a, false, 5259, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
        } else if (this.j.containsKey(Long.valueOf(j2))) {
            return a() - 1;
        } else {
            return a();
        }
    }

    public final Observable<d<t>> a(c cVar) {
        c cVar2 = cVar;
        if (!PatchProxy.isSupport(new Object[]{cVar2}, this, f11241a, false, 5255, new Class[]{c.class}, Observable.class)) {
            return ((com.bytedance.android.livesdk.utils.b.b) j.q().d().c().fetchRushedList(cVar2.f11248a.f16478c, this.f11242b.getId(), cVar2.f11248a.f16481f).compose(i.a()).as(com.bytedance.android.livesdk.utils.b.c.a())).a();
        }
        return (Observable) PatchProxy.accessDispatch(new Object[]{cVar2}, this, f11241a, false, 5255, new Class[]{c.class}, Observable.class);
    }

    /* access modifiers changed from: package-private */
    public void b(aq aqVar) {
        if (PatchProxy.isSupport(new Object[]{aqVar}, this, f11241a, false, 5262, new Class[]{aq.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aqVar}, this, f11241a, false, 5262, new Class[]{aq.class}, Void.TYPE);
            return;
        }
        this.j.remove(Long.valueOf(aqVar.f16478c));
        this.l.remove(aqVar);
        this.k.remove(aqVar);
        ((b) b()).c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0039, code lost:
        r1 = r17;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onEvent(com.bytedance.android.livesdk.chatroom.event.ab r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f11241a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.ab> r3 = com.bytedance.android.livesdk.chatroom.event.ab.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 5252(0x1484, float:7.36E-42)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f11241a
            r13 = 0
            r14 = 5252(0x1484, float:7.36E-42)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.ab> r0 = com.bytedance.android.livesdk.chatroom.event.ab.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            int r1 = r0.f10133a
            switch(r1) {
                case 0: goto L_0x006d;
                case 1: goto L_0x003c;
                default: goto L_0x0039;
            }
        L_0x0039:
            r1 = r17
            goto L_0x0079
        L_0x003c:
            java.lang.Object r0 = r0.f10134b
            com.bytedance.android.livesdk.message.model.aq r0 = (com.bytedance.android.livesdk.message.model.aq) r0
            r1 = r17
            java.util.Map<java.lang.Long, com.bytedance.android.livesdk.chatroom.presenter.au$c> r2 = r1.j
            long r3 = r0.f16478c
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r2 = r2.get(r3)
            com.bytedance.android.livesdk.chatroom.presenter.au$c r2 = (com.bytedance.android.livesdk.chatroom.presenter.au.c) r2
            if (r2 == 0) goto L_0x005c
            com.bytedance.ies.a.a r0 = r17.b()
            com.bytedance.android.livesdk.chatroom.presenter.au$b r0 = (com.bytedance.android.livesdk.chatroom.presenter.au.b) r0
            r0.a((com.bytedance.android.livesdk.chatroom.presenter.au.c) r2)
            return
        L_0x005c:
            com.bytedance.android.livesdk.chatroom.presenter.au$c r2 = new com.bytedance.android.livesdk.chatroom.presenter.au$c
            r2.<init>()
            r2.f11248a = r0
            com.bytedance.ies.a.a r0 = r17.b()
            com.bytedance.android.livesdk.chatroom.presenter.au$b r0 = (com.bytedance.android.livesdk.chatroom.presenter.au.b) r0
            r0.a((com.bytedance.android.livesdk.chatroom.presenter.au.c) r2)
            goto L_0x0079
        L_0x006d:
            r1 = r17
            com.bytedance.ies.a.a r0 = r17.b()
            com.bytedance.android.livesdk.chatroom.presenter.au$b r0 = (com.bytedance.android.livesdk.chatroom.presenter.au.b) r0
            r0.b()
            return
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.presenter.au.onEvent(com.bytedance.android.livesdk.chatroom.event.ab):void");
    }

    public final void a(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f11241a, false, 5253, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f11241a, false, 5253, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (!this.f11245e) {
            this.f11245e = true;
            ((ab) TTLiveSDKContext.getHostService().k().a(((b.C0124b) ((b.C0124b) ((b.C0124b) ((b.C0124b) ((b.C0124b) ((b.a) f.a().a(j2)).a(this.f11242b.getRequestId())).b("live_detail")).c("")).b(0)).d("live")).c()).compose(i.a()).as(o())).a(new bd(this), new be(this));
            if (com.bytedance.android.livesdk.utils.j.b(this.x) && j2 == this.f11242b.author().getId()) {
                ((com.bytedance.android.livesdkapi.c.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.c.a.class)).a(true, "live_ad", "follow", com.bytedance.android.livesdk.utils.j.c(this.x));
            }
        }
    }

    public void onMessage(IMessage iMessage) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f11241a, false, 5251, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage}, this, f11241a, false, 5251, new Class[]{IMessage.class}, Void.TYPE);
            return;
        }
        aq aqVar = (aq) iMessage;
        if (!aqVar.o && this.j.get(Long.valueOf(aqVar.f16478c)) == null) {
            if (aqVar.j && !aqVar.p) {
                ((b) b()).a(aqVar);
            }
            c cVar = new c();
            cVar.f11248a = aqVar;
            if (aqVar.f16480e <= 0 || a(aqVar) <= 0) {
                if (aqVar.i > 0) {
                    this.k.add(0, aqVar);
                } else {
                    this.k.add(aqVar);
                }
                c(aqVar);
            } else {
                if (aqVar.i > 0) {
                    this.l.add(0, aqVar);
                } else {
                    int size = this.l.size() - 1;
                    while (true) {
                        if (size < 0) {
                            z = false;
                            break;
                        } else if (a(aqVar) >= a(this.l.get(size))) {
                            this.l.add(size + 1, aqVar);
                            break;
                        } else {
                            size--;
                        }
                    }
                    if (!z) {
                        this.l.add(0, aqVar);
                    }
                }
                long a2 = a(aqVar);
                int i2 = (int) (a2 / 1000);
                cVar.f11249b = ((com.bytedance.android.livesdk.utils.b.b) com.bytedance.android.livesdk.utils.b.b.a(0, 1, TimeUnit.SECONDS).delay(a2 % 1000, TimeUnit.MILLISECONDS).take((long) (i2 + 1)).map(new aw(i2)).observeOn(AndroidSchedulers.mainThread()).as(com.bytedance.android.livesdk.utils.b.c.a())).a();
                ((ab) cVar.f11249b.as(o())).a(new bb(this, aqVar, cVar), new bc(this));
            }
            this.j.put(Long.valueOf(aqVar.f16478c), cVar);
            ((b) b()).c();
        }
    }

    public final void a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f11241a, false, 5249, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f11241a, false, 5249, new Class[]{b.class}, Void.TYPE);
            return;
        }
        super.a(bVar);
        this.f11242b = (Room) this.x.get("data_room");
        this.f11243c = ((Boolean) this.x.get("data_is_anchor")).booleanValue();
        this.f11244d = (String) this.x.get("data_enter_source");
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.LUCKY_BOX.getIntType(), this);
        ((ab) com.bytedance.android.livesdk.u.a.a().a(com.bytedance.android.livesdk.chatroom.event.ab.class).as(o())).a((Consumer<? super T>) new av<Object>(this));
        if (!this.f11243c) {
            if (PatchProxy.isSupport(new Object[0], this, f11241a, false, 5264, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f11241a, false, 5264, new Class[0], Void.TYPE);
                return;
            }
            ((ab) j.q().d().c().fetchCurrentList(this.f11242b.getId()).compose(i.a()).as(o())).a(new az(this), new ba(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(aq aqVar, c cVar, Integer num) throws Exception {
        com.bytedance.android.livesdkapi.h.b bVar;
        if (num.intValue() == 0) {
            aqVar.o = true;
            cVar.f11249b = null;
            if (aqVar.baseMessage == null) {
                long id = this.f11242b.getId();
                if (PatchProxy.isSupport(new Object[]{new Long(id), (byte) 1}, null, com.bytedance.android.livesdkapi.h.b.f18774a, true, 15070, new Class[]{Long.TYPE, Boolean.TYPE}, com.bytedance.android.livesdkapi.h.b.class)) {
                    bVar = (com.bytedance.android.livesdkapi.h.b) PatchProxy.accessDispatch(new Object[]{new Long(id), (byte) 1}, null, com.bytedance.android.livesdkapi.h.b.f18774a, true, 15070, new Class[]{Long.TYPE, Boolean.TYPE}, com.bytedance.android.livesdkapi.h.b.class);
                } else {
                    bVar = new com.bytedance.android.livesdkapi.h.b();
                    bVar.f18775b = System.currentTimeMillis();
                    bVar.f18776c = id;
                    bVar.f18777d = -1;
                    bVar.g = true;
                }
                aqVar.baseMessage = bVar;
            }
            this.y.insertMessage(aqVar, true);
            this.l.remove(aqVar);
            if (this.j.get(Long.valueOf(aqVar.f16478c)) != null) {
                this.k.add(0, aqVar);
                ((b) b()).c();
                c(aqVar);
            }
        }
    }
}
