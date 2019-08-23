package com.bytedance.android.livesdk.chatroom.interact.d;

import android.arch.lifecycle.Observer;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.interact.data.d;
import com.bytedance.android.livesdk.chatroom.model.a.j;
import com.bytedance.android.livesdk.chatroom.model.a.k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10835a;

    /* renamed from: b  reason: collision with root package name */
    boolean f10836b;

    /* renamed from: c  reason: collision with root package name */
    boolean f10837c;

    /* renamed from: d  reason: collision with root package name */
    boolean f10838d;

    /* renamed from: e  reason: collision with root package name */
    Room f10839e;

    /* renamed from: f  reason: collision with root package name */
    boolean f10840f;
    List<C0089a> g = new ArrayList();
    final CompositeDisposable h = new CompositeDisposable();
    public List<j> i = new ArrayList();
    public List<j> j = new ArrayList();
    public Map<Integer, Boolean> k = new HashMap();
    private IMessageManager l;
    private DataCenter m;
    private List<j> n = new ArrayList();
    private Observer<KVData> o = new b(this);

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.a$a  reason: collision with other inner class name */
    public interface C0089a {
        void a(long j, int i);

        void a(long j, int i, boolean z);

        void a(long j, long j2);

        void a(List<j> list);

        void b(List<j> list);

        void c(List<k> list);
    }

    /* access modifiers changed from: package-private */
    public void a(j jVar) {
        if (PatchProxy.isSupport(new Object[]{jVar}, this, f10835a, false, 5042, new Class[]{j.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar}, this, f10835a, false, 5042, new Class[]{j.class}, Void.TYPE);
            return;
        }
        if (this.n.size() >= 5) {
            this.n.remove(0);
        }
        this.n.add(jVar);
    }

    /* access modifiers changed from: package-private */
    public void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f10835a, false, 5045, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f10835a, false, 5045, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.live.core.c.a.a(6, "LinkUserInfoCenter", th.getStackTrace());
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f10835a, false, 5024, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10835a, false, 5024, new Class[0], Void.TYPE);
            return;
        }
        this.f10840f = false;
        this.m.removeObserver("cmd_interact_state_change", this.o);
        this.h.clear();
        this.l.removeMessageListener(this);
    }

    public final int d() {
        if (!PatchProxy.isSupport(new Object[0], this, f10835a, false, 5035, new Class[0], Integer.TYPE)) {
            return this.j.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f10835a, false, 5035, new Class[0], Integer.TYPE)).intValue();
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f10835a, false, 5029, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10835a, false, 5029, new Class[0], Void.TYPE);
        } else if (!this.f10836b) {
            this.f10836b = true;
            this.h.add(com.bytedance.android.livesdk.v.j.q().d().a().getList(this.f10839e.getId(), 1).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new f(this), new g(this)));
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f10835a, false, 5030, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10835a, false, 5030, new Class[0], Void.TYPE);
        } else if (!this.f10837c) {
            this.f10837c = true;
            this.h.add(com.bytedance.android.livesdk.v.j.q().d().a().getList(this.f10839e.getId(), 2).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new h(this), new i(this)));
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f10835a, false, 5040, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10835a, false, 5040, new Class[0], Void.TYPE);
            return;
        }
        d dVar = new d();
        dVar.g = 100101;
        dVar.f10875d = String.valueOf(TTLiveSDKContext.getHostService().k().b());
        dVar.f10876e = String.valueOf(com.bytedance.android.livesdk.app.dataholder.d.a().h);
        dVar.f10873b = PushConstants.PUSH_TYPE_NOTIFY;
        dVar.f10874c = PushConstants.PUSH_TYPE_NOTIFY;
        com.bytedance.android.livesdk.v.j.q().d().a().sendSignalV1(this.f10839e.getId(), com.bytedance.android.livesdk.v.j.q().c().toJson((Object) dVar), null).subscribeOn(Schedulers.io()).subscribe(j.f10858b, k.f10860b);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f10835a, false, 5041, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10835a, false, 5041, new Class[0], Void.TYPE);
            return;
        }
        d dVar = new d();
        dVar.g = 100102;
        dVar.f10875d = String.valueOf(TTLiveSDKContext.getHostService().k().b());
        dVar.f10876e = String.valueOf(com.bytedance.android.livesdk.app.dataholder.d.a().h);
        dVar.f10873b = PushConstants.PUSH_TYPE_NOTIFY;
        dVar.f10874c = PushConstants.PUSH_TYPE_NOTIFY;
        com.bytedance.android.livesdk.v.j.q().d().a().sendSignalV1(this.f10839e.getId(), com.bytedance.android.livesdk.v.j.q().c().toJson((Object) dVar), null).subscribeOn(Schedulers.io()).subscribe(l.f10862b, d.f10846b);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f10835a, false, 5023, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10835a, false, 5023, new Class[0], Void.TYPE);
            return;
        }
        this.l.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC.getIntType(), this);
        this.l.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC_SIGNAL.getIntType(), this);
        this.m.observeForever("cmd_interact_state_change", this.o);
        this.f10840f = true;
        if (this.f10839e.isWithLinkMic()) {
            c();
            g();
        }
    }

    public final void a(C0089a aVar) {
        C0089a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f10835a, false, 5025, new Class[]{C0089a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f10835a, false, 5025, new Class[]{C0089a.class}, Void.TYPE);
            return;
        }
        this.g.add(aVar2);
    }

    public final int a(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f10835a, false, 5039, new Class[]{Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f10835a, false, 5039, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
        }
        j a2 = a(j3, 0);
        if (a2 == null || a2.f11052e == null) {
            return 0;
        }
        return a2.f11051d;
    }

    public final long b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f10835a, false, 5038, new Class[]{Integer.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f10835a, false, 5038, new Class[]{Integer.TYPE}, Long.TYPE)).longValue();
        }
        long j2 = 0;
        j a2 = a(0, i2);
        if (!(a2 == null || a2.f11052e == null)) {
            j2 = a2.f11052e.getId();
        }
        return j2;
    }

    public final void b(C0089a aVar) {
        C0089a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f10835a, false, 5026, new Class[]{C0089a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f10835a, false, 5026, new Class[]{C0089a.class}, Void.TYPE);
            return;
        }
        this.g.remove(aVar2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0085, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r14) {
        /*
            r13 = this;
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r14
            com.meituan.robust.ChangeQuickRedirect r2 = f10835a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.ugc.live.sdk.message.data.IMessage> r1 = com.ss.ugc.live.sdk.message.data.IMessage.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 5027(0x13a3, float:7.044E-42)
            r1 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r14
            com.meituan.robust.ChangeQuickRedirect r2 = f10835a
            r3 = 0
            r4 = 5027(0x13a3, float:7.044E-42)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.ugc.live.sdk.message.data.IMessage> r1 = com.ss.ugc.live.sdk.message.data.IMessage.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r13
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            boolean r0 = r13.f10840f
            if (r0 != 0) goto L_0x0035
            return
        L_0x0035:
            boolean r0 = r14 instanceof com.bytedance.android.livesdk.message.model.al
            if (r0 == 0) goto L_0x0086
            r0 = r14
            com.bytedance.android.livesdk.message.model.al r0 = (com.bytedance.android.livesdk.message.model.al) r0
            com.bytedance.android.livesdk.message.model.am r0 = r0.f16462b
            if (r0 != 0) goto L_0x0041
            return
        L_0x0041:
            int r1 = r0.f16463a
            switch(r1) {
                case 5: goto L_0x0080;
                case 6: goto L_0x007b;
                case 7: goto L_0x0074;
                case 8: goto L_0x004c;
                case 9: goto L_0x0046;
                case 10: goto L_0x0047;
                case 11: goto L_0x0077;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x0085
        L_0x0047:
            r13.c()
            goto L_0x017b
        L_0x004c:
            java.util.List<com.bytedance.android.livesdk.chatroom.interact.d.a$a> r1 = r13.g
            java.util.Iterator r1 = r1.iterator()
        L_0x0052:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0066
            java.lang.Object r2 = r1.next()
            com.bytedance.android.livesdk.chatroom.interact.d.a$a r2 = (com.bytedance.android.livesdk.chatroom.interact.d.a.C0089a) r2
            long r3 = r0.f16466d
            long r5 = r0.f16467e
            r2.a((long) r3, (long) r5)
            goto L_0x0052
        L_0x0066:
            long r1 = r0.f16466d
            com.bytedance.android.livesdk.chatroom.model.a.j r1 = r13.a(r1, r9)
            if (r1 == 0) goto L_0x0085
            long r2 = r0.f16467e
            r1.f11050c = r2
            goto L_0x017b
        L_0x0074:
            r13.g()
        L_0x0077:
            r13.c()
            goto L_0x0085
        L_0x007b:
            r13.c()
            goto L_0x017b
        L_0x0080:
            r13.g()
            goto L_0x017b
        L_0x0085:
            return
        L_0x0086:
            boolean r0 = r14 instanceof com.bytedance.android.livesdk.message.model.an
            if (r0 == 0) goto L_0x017b
            r0 = r14
            com.bytedance.android.livesdk.message.model.an r0 = (com.bytedance.android.livesdk.message.model.an) r0
            com.bytedance.android.livesdk.chatroom.interact.data.d r1 = r0.a()
            if (r1 != 0) goto L_0x0094
            return
        L_0x0094:
            com.bytedance.android.livesdk.chatroom.interact.data.d r0 = r0.a()
            java.lang.String r1 = r0.f10875d     // Catch:{ NumberFormatException -> 0x017b }
            long r10 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x017b }
            java.lang.String r1 = r0.f10876e     // Catch:{ NumberFormatException -> 0x017b }
            int r7 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x017b }
            int r1 = r0.g     // Catch:{ NumberFormatException -> 0x017b }
            r2 = 101002(0x18a8a, float:1.41534E-40)
            if (r1 == r2) goto L_0x00dc
            switch(r1) {
                case 100101: goto L_0x00b0;
                case 100102: goto L_0x00b0;
                default: goto L_0x00ae;
            }     // Catch:{ NumberFormatException -> 0x017b }
        L_0x00ae:
            goto L_0x017a
        L_0x00b0:
            int r0 = r0.g     // Catch:{ NumberFormatException -> 0x017b }
            r1 = 100102(0x18706, float:1.40273E-40)
            if (r0 != r1) goto L_0x00b8
            goto L_0x00b9
        L_0x00b8:
            r8 = 0
        L_0x00b9:
            java.util.Map<java.lang.Integer, java.lang.Boolean> r0 = r13.k     // Catch:{ NumberFormatException -> 0x017b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch:{ NumberFormatException -> 0x017b }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)     // Catch:{ NumberFormatException -> 0x017b }
            r0.put(r1, r2)     // Catch:{ NumberFormatException -> 0x017b }
            java.util.List<com.bytedance.android.livesdk.chatroom.interact.d.a$a> r0 = r13.g     // Catch:{ NumberFormatException -> 0x017b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ NumberFormatException -> 0x017b }
        L_0x00cc:
            boolean r1 = r0.hasNext()     // Catch:{ NumberFormatException -> 0x017b }
            if (r1 == 0) goto L_0x017b
            java.lang.Object r1 = r0.next()     // Catch:{ NumberFormatException -> 0x017b }
            com.bytedance.android.livesdk.chatroom.interact.d.a$a r1 = (com.bytedance.android.livesdk.chatroom.interact.d.a.C0089a) r1     // Catch:{ NumberFormatException -> 0x017b }
            r1.a(r10, r7, r8)     // Catch:{ NumberFormatException -> 0x017b }
            goto L_0x00cc
        L_0x00dc:
            java.util.List<com.bytedance.android.livesdk.chatroom.interact.d.a$a> r0 = r13.g     // Catch:{ NumberFormatException -> 0x017b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ NumberFormatException -> 0x017b }
        L_0x00e2:
            boolean r1 = r0.hasNext()     // Catch:{ NumberFormatException -> 0x017b }
            if (r1 == 0) goto L_0x00f2
            java.lang.Object r1 = r0.next()     // Catch:{ NumberFormatException -> 0x017b }
            com.bytedance.android.livesdk.chatroom.interact.d.a$a r1 = (com.bytedance.android.livesdk.chatroom.interact.d.a.C0089a) r1     // Catch:{ NumberFormatException -> 0x017b }
            r1.a((long) r10, (int) r7)     // Catch:{ NumberFormatException -> 0x017b }
            goto L_0x00e2
        L_0x00f2:
            r13.a((int) r7)     // Catch:{ NumberFormatException -> 0x017b }
            r12 = 2
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ NumberFormatException -> 0x017b }
            java.lang.Long r1 = new java.lang.Long     // Catch:{ NumberFormatException -> 0x017b }
            r1.<init>(r10)     // Catch:{ NumberFormatException -> 0x017b }
            r0[r9] = r1     // Catch:{ NumberFormatException -> 0x017b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch:{ NumberFormatException -> 0x017b }
            r0[r8] = r1     // Catch:{ NumberFormatException -> 0x017b }
            com.meituan.robust.ChangeQuickRedirect r2 = f10835a     // Catch:{ NumberFormatException -> 0x017b }
            r3 = 0
            r4 = 5033(0x13a9, float:7.053E-42)
            java.lang.Class[] r5 = new java.lang.Class[r12]     // Catch:{ NumberFormatException -> 0x017b }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ NumberFormatException -> 0x017b }
            r5[r9] = r1     // Catch:{ NumberFormatException -> 0x017b }
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ NumberFormatException -> 0x017b }
            r5[r8] = r1     // Catch:{ NumberFormatException -> 0x017b }
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch:{ NumberFormatException -> 0x017b }
            r1 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ NumberFormatException -> 0x017b }
            if (r0 == 0) goto L_0x0142
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ NumberFormatException -> 0x017b }
            java.lang.Long r1 = new java.lang.Long     // Catch:{ NumberFormatException -> 0x017b }
            r1.<init>(r10)     // Catch:{ NumberFormatException -> 0x017b }
            r0[r9] = r1     // Catch:{ NumberFormatException -> 0x017b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch:{ NumberFormatException -> 0x017b }
            r0[r8] = r1     // Catch:{ NumberFormatException -> 0x017b }
            com.meituan.robust.ChangeQuickRedirect r2 = f10835a     // Catch:{ NumberFormatException -> 0x017b }
            r3 = 0
            r4 = 5033(0x13a9, float:7.053E-42)
            java.lang.Class[] r5 = new java.lang.Class[r12]     // Catch:{ NumberFormatException -> 0x017b }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ NumberFormatException -> 0x017b }
            r5[r9] = r1     // Catch:{ NumberFormatException -> 0x017b }
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ NumberFormatException -> 0x017b }
            r5[r8] = r1     // Catch:{ NumberFormatException -> 0x017b }
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch:{ NumberFormatException -> 0x017b }
            r1 = r13
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ NumberFormatException -> 0x017b }
            goto L_0x017b
        L_0x0142:
            java.util.List<com.bytedance.android.livesdk.chatroom.model.a.j> r0 = r13.i     // Catch:{ NumberFormatException -> 0x017b }
            int r0 = r0.size()     // Catch:{ NumberFormatException -> 0x017b }
        L_0x0148:
            if (r9 >= r0) goto L_0x017a
            java.util.List<com.bytedance.android.livesdk.chatroom.model.a.j> r1 = r13.i     // Catch:{ NumberFormatException -> 0x017b }
            java.lang.Object r1 = r1.get(r9)     // Catch:{ NumberFormatException -> 0x017b }
            com.bytedance.android.livesdk.chatroom.model.a.j r1 = (com.bytedance.android.livesdk.chatroom.model.a.j) r1     // Catch:{ NumberFormatException -> 0x017b }
            if (r1 == 0) goto L_0x0177
            if (r7 <= 0) goto L_0x015a
            int r2 = r1.f11051d     // Catch:{ NumberFormatException -> 0x017b }
            if (r2 == r7) goto L_0x016e
        L_0x015a:
            r2 = 0
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0177
            com.bytedance.android.live.base.model.user.User r2 = r1.f11052e     // Catch:{ NumberFormatException -> 0x017b }
            if (r2 == 0) goto L_0x0177
            com.bytedance.android.live.base.model.user.User r2 = r1.f11052e     // Catch:{ NumberFormatException -> 0x017b }
            long r2 = r2.getId()     // Catch:{ NumberFormatException -> 0x017b }
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 != 0) goto L_0x0177
        L_0x016e:
            java.util.List<com.bytedance.android.livesdk.chatroom.model.a.j> r0 = r13.i     // Catch:{ NumberFormatException -> 0x017b }
            r0.remove(r9)     // Catch:{ NumberFormatException -> 0x017b }
            r13.a((com.bytedance.android.livesdk.chatroom.model.a.j) r1)     // Catch:{ NumberFormatException -> 0x017b }
            goto L_0x017b
        L_0x0177:
            int r9 = r9 + 1
            goto L_0x0148
        L_0x017a:
            return
        L_0x017b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.interact.d.a.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f10835a, false, 5034, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f10835a, false, 5034, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.k.remove(Integer.valueOf(i2));
    }

    public a(Room room, DataCenter dataCenter) {
        this.f10839e = room;
        this.m = dataCenter;
        this.l = (IMessageManager) dataCenter.get("data_message_manager");
    }

    public final j b(long j2, int i2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i2)}, this, f10835a, false, 5032, new Class[]{Long.TYPE, Integer.TYPE}, j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i2)}, this, f10835a, false, 5032, new Class[]{Long.TYPE, Integer.TYPE}, j.class);
        }
        for (j next : this.i) {
            if (a(j2, i2, next)) {
                return next;
            }
        }
        return null;
    }

    public final j a(long j2, int i2) {
        long j3 = j2;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), Integer.valueOf(i2)}, this, f10835a, false, 5031, new Class[]{Long.TYPE, Integer.TYPE}, j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[]{new Long(j3), Integer.valueOf(i2)}, this, f10835a, false, 5031, new Class[]{Long.TYPE, Integer.TYPE}, j.class);
        }
        for (j next : this.i) {
            if (a(j3, i3, next)) {
                return next;
            }
        }
        for (j next2 : this.j) {
            if (a(j3, i3, next2)) {
                return next2;
            }
        }
        for (j next3 : this.n) {
            if (a(j3, i3, next3)) {
                return next3;
            }
        }
        return null;
    }

    private boolean a(long j2, int i2, j jVar) {
        long j3 = j2;
        int i3 = i2;
        j jVar2 = jVar;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), Integer.valueOf(i2), jVar2}, this, f10835a, false, 5043, new Class[]{Long.TYPE, Integer.TYPE, j.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j3), Integer.valueOf(i2), jVar2}, this, f10835a, false, 5043, new Class[]{Long.TYPE, Integer.TYPE, j.class}, Boolean.TYPE)).booleanValue();
        } else if ((j3 <= 0 && i3 <= 0) || jVar2 == null || jVar2.f11052e == null) {
            return false;
        } else {
            if ((j3 <= 0 || jVar2.f11052e.getId() != j3) && (i3 <= 0 || jVar2.f11051d != i3)) {
                return false;
            }
            return true;
        }
    }
}
