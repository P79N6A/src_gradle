package com.bytedance.android.livesdk.chatroom.interact;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Message;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.e;
import com.bytedance.android.livesdk.chatroom.event.p;
import com.bytedance.android.livesdk.chatroom.event.q;
import com.bytedance.android.livesdk.chatroom.interact.c.es;
import com.bytedance.android.livesdk.chatroom.interact.c.ff;
import com.bytedance.android.livesdk.chatroom.interact.c.fg;
import com.bytedance.android.livesdk.chatroom.interact.c.h;
import com.bytedance.android.livesdk.chatroom.interact.d.a;
import com.bytedance.android.livesdk.chatroom.interact.e.g;
import com.bytedance.android.livesdk.chatroom.model.a.i;
import com.bytedance.android.livesdk.chatroom.model.a.j;
import com.bytedance.android.livesdk.chatroom.ui.bf;
import com.bytedance.android.livesdk.chatroom.ui.cc;
import com.bytedance.android.livesdk.chatroom.ui.eo;
import com.bytedance.android.livesdk.chatroom.viewmodule.am;
import com.bytedance.android.livesdk.chatroom.widget.LinkVideo2View;
import com.bytedance.android.livesdk.chatroom.widget.k;
import com.bytedance.android.livesdk.chatroom.widget.l;
import com.bytedance.android.livesdk.j.f;
import com.bytedance.android.livesdk.utils.aa;
import com.bytedance.android.livesdk.utils.ah;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.b.a.a.b.b;
import com.bytedance.b.a.a.b.c;
import com.bytedance.b.a.a.b.d;
import com.bytedance.b.a.a.f.a;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class LinkInRoomVideoGuestWidget extends LiveWidget implements es.b, b, c, d, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10253a;

    /* renamed from: b  reason: collision with root package name */
    cc f10254b;

    /* renamed from: c  reason: collision with root package name */
    public es f10255c;

    /* renamed from: d  reason: collision with root package name */
    public a f10256d;

    /* renamed from: e  reason: collision with root package name */
    public g f10257e;

    /* renamed from: f  reason: collision with root package name */
    public y f10258f;
    Runnable g;
    private bf h;
    private com.bytedance.b.a.a.c.c i;
    private WeakHandler j;
    private com.bytedance.b.a.a.g.d k;
    private FrameLayout l;

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f10253a, false, 4412, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f10253a, false, 4412, new Class[0], String.class);
    }

    public final void a(long j2, long j3) {
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f10253a, false, 4413, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f10253a, false, 4413, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    public final void d(int i2) {
    }

    public int getLayoutId() {
        return C0906R.layout.an1;
    }

    public final void a(List<i> list, String str) {
        List<i> list2 = list;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{list2, str2}, this, f10253a, false, 4390, new Class[]{List.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, str2}, this, f10253a, false, 4390, new Class[]{List.class, String.class}, Void.TYPE);
        } else if (list2 == null || list.isEmpty()) {
            ai.a((int) C0906R.string.czk);
        } else {
            a(true, list2, str2);
        }
    }

    public final void a(List<j> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f10253a, false, 4393, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f10253a, false, 4393, new Class[]{List.class}, Void.TYPE);
        } else if (isViewValid() && this.f10254b == null) {
            this.f10254b = new cc(this.context, this.f10255c.j, list, this.f10255c);
            this.f10254b.setOnDismissListener(new l(this));
            this.f10254b.show();
            aa.a(this.f10255c.j, "show_connection_management", "guest_connection", false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String[] r20, boolean[] r21) {
        /*
            r19 = this;
            r0 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r21
            com.meituan.robust.ChangeQuickRedirect r5 = f10253a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r10] = r4
            java.lang.Class<boolean[]> r4 = boolean[].class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 4411(0x113b, float:6.181E-42)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0043
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r21
            com.meituan.robust.ChangeQuickRedirect r14 = f10253a
            r15 = 0
            r16 = 4411(0x113b, float:6.181E-42)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r10] = r1
            java.lang.Class<boolean[]> r1 = boolean[].class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0043:
            int r2 = r0.length
            com.bytedance.android.livesdk.app.dataholder.d r3 = com.bytedance.android.livesdk.app.dataholder.d.a()
            int r3 = r3.h
            java.lang.String r3 = java.lang.String.valueOf(r3)
        L_0x004e:
            if (r10 >= r2) goto L_0x0069
            r4 = r0[r10]
            boolean r4 = android.text.TextUtils.equals(r4, r3)
            if (r4 == 0) goto L_0x0064
            boolean r4 = r21[r10]
            if (r4 == 0) goto L_0x0064
            r4 = r19
            com.bytedance.android.livesdk.chatroom.interact.y r0 = r4.f10258f
            r0.c()
            return
        L_0x0064:
            r4 = r19
            int r10 = r10 + 1
            goto L_0x004e
        L_0x0069:
            r4 = r19
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.interact.LinkInRoomVideoGuestWidget.a(java.lang.String[], boolean[]):void");
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f10253a, false, 4392, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10253a, false, 4392, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid()) {
            ai.a((int) C0906R.string.d56);
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f10253a, false, 4395, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10253a, false, 4395, new Class[0], Void.TYPE);
        } else if (this.i != null) {
            this.i.g();
        } else {
            this.f10255c.h_();
        }
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f10253a, false, 4400, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10253a, false, 4400, new Class[0], Void.TYPE);
            return;
        }
        this.f10257e.b(true);
        if (this.g != null) {
            this.g.run();
            this.g = null;
        }
    }

    public final void e_() {
        if (PatchProxy.isSupport(new Object[0], this, f10253a, false, 4403, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10253a, false, 4403, new Class[0], Void.TYPE);
            return;
        }
        this.i.b((c) this);
        this.i.b((d) this);
        this.i.b((b) this);
        this.i = null;
        this.f10255c.h_();
        this.dataCenter.lambda$put$1$DataCenter("data_interact_debug_info", new p(false, null));
        t.a(0, 0, null, "audience", "normal", this.f10255c.k().toString(), this.f10255c.j());
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f10253a, false, 4396, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10253a, false, 4396, new Class[0], Void.TYPE);
            return;
        }
        new m.a(this.context).c((int) C0906R.string.d5d).b(0, (int) C0906R.string.dg_, m.f10971b).a().show();
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f10253a, false, 4398, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10253a, false, 4398, new Class[0], Void.TYPE);
            return;
        }
        new m.a(this.context, 0).c((int) C0906R.string.d5o).b(0, (int) C0906R.string.dg_, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f10260a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f10260a, false, 4419, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f10260a, false, 4419, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                dialogInterface.dismiss();
            }
        }).a().show();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f10253a, false, 4381, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10253a, false, 4381, new Class[0], Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.app.dataholder.d.a().a(Boolean.FALSE);
        this.f10255c.d();
        this.f10257e.a();
        this.f10256d.b();
        if (this.i != null) {
            this.i.b((c) this);
            this.i.b((d) this);
            this.i.b((b) this);
            this.i.g();
        }
        if (this.h != null && this.h.isShowing()) {
            this.h.dismiss();
        }
        super.onDestroy();
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f10253a, false, 4383, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10253a, false, 4383, new Class[0], Void.TYPE);
            return;
        }
        if (this.f10255c.h) {
            this.i.a(false);
            if (this.f10258f != null) {
                this.f10258f.a();
            }
            this.f10256d.e();
            this.j.sendEmptyMessageDelayed(140000, 180000);
        }
        super.onPause();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f10253a, false, 4382, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10253a, false, 4382, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.j.removeCallbacksAndMessages(null);
        if (this.f10255c.h) {
            if (this.f10258f != null) {
                this.f10258f.b();
            }
            this.f10256d.f();
            this.i.a(true);
            this.dataCenter.lambda$put$1$DataCenter("cmd_interact_state_change", new q(3));
        }
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f10253a, false, 4380, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10253a, false, 4380, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        Room room = (Room) this.dataCenter.get("data_room");
        this.f10256d = new a(room, this.dataCenter);
        this.f10255c = new es(room, this.dataCenter);
        this.k = new com.bytedance.b.a.a.g.d() {
            public final com.bytedance.b.a.a.g.c a() {
                return LinkInRoomVideoGuestWidget.this.f10258f;
            }
        };
        this.j = new WeakHandler(this);
        this.f10256d.a();
        g gVar = new g(this.f10255c.j, false, this.l, (FrameLayout) this.contentView, this.f10256d);
        this.f10257e = gVar;
        this.f10257e.n = this.dataCenter;
        this.f10257e.a(true);
        this.f10255c.a((es.b) this);
        e.a().a((Integer) 0);
    }

    public final void c() {
        int i2;
        long j2;
        int i3;
        a.f fVar;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f10253a, false, 4394, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10253a, false, 4394, new Class[0], Void.TYPE);
            return;
        }
        if (e.a().o == 2) {
            this.f10258f = new l(this.context);
        } else {
            k.a aVar = new k.a();
            aVar.f13500a = e.a().i;
            aVar.f13501b = e.a().j;
            aVar.f13502c = e.a().h ^ true ? 1 : 0;
            this.f10258f = new LinkVideo2View(this.context, aVar);
        }
        e.a().g = SystemClock.currentThreadTimeMillis();
        a.c cVar = a.c.TEXTURE_2D;
        if (e.a().o == 2) {
            ((l) this.f10258f).setOutputFormat(3553);
            i2 = com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f;
        } else {
            i2 = 0;
        }
        com.bytedance.b.a.a.f.a e2 = new com.bytedance.b.a.a.f.a().a(this.context).b(com.bytedance.android.livesdk.chatroom.interact.data.c.a()).c(com.bytedance.android.livesdk.app.dataholder.d.a().g).b(com.bytedance.android.livesdk.chatroom.interact.data.b.f10866b).a(com.bytedance.android.livesdk.chatroom.interact.data.b.f10869e).d("d926522026314752bb721d08").e(com.bytedance.android.livesdk.app.dataholder.d.a().g);
        es esVar = this.f10255c;
        if (PatchProxy.isSupport(new Object[0], esVar, es.f10638a, false, 4908, new Class[0], Long.TYPE)) {
            j2 = ((Long) PatchProxy.accessDispatch(new Object[0], esVar, es.f10638a, false, 4908, new Class[0], Long.TYPE)).longValue();
        } else {
            j2 = TTLiveSDKContext.getHostService().k().b();
        }
        com.bytedance.b.a.a.f.a a2 = e2.a(j2);
        es esVar2 = this.f10255c;
        if (PatchProxy.isSupport(new Object[0], esVar2, es.f10638a, false, 4909, new Class[0], Integer.TYPE)) {
            i3 = ((Integer) PatchProxy.accessDispatch(new Object[0], esVar2, es.f10638a, false, 4909, new Class[0], Integer.TYPE)).intValue();
        } else {
            i3 = com.bytedance.android.livesdk.app.dataholder.d.a().h;
        }
        com.bytedance.b.a.a.f.a a3 = a2.a(i3);
        es esVar3 = this.f10255c;
        if (PatchProxy.isSupport(new Object[0], esVar3, es.f10638a, false, 4911, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], esVar3, es.f10638a, false, 4911, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (esVar3.j.getStreamUrlExtraSafely().n > 0) {
            z = true;
        }
        if (z) {
            fVar = a.f.f19201c;
        } else {
            fVar = a.f.f19200b;
        }
        this.i = new com.bytedance.b.a.a.c.c(a3.a(fVar).a(this.f10255c.k()).a(this.f10255c.j()).a(a.b.GUEST).a(cVar).b(i2).a(a.d.VIDEO), this.k);
        this.i.a((c) this);
        this.i.a((d) this);
        this.i.a((b) this);
        this.i.f();
    }

    public final void e() {
        String str;
        String str2;
        String str3;
        String str4;
        if (PatchProxy.isSupport(new Object[0], this, f10253a, false, 4401, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10253a, false, 4401, new Class[0], Void.TYPE);
            return;
        }
        t.a(this.f10255c.k().toString(), 0, 0);
        es esVar = this.f10255c;
        if (PatchProxy.isSupport(new Object[0], esVar, es.f10638a, false, 4895, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], esVar, es.f10638a, false, 4895, new Class[0], Void.TYPE);
        } else {
            esVar.h = true;
            esVar.m.lambda$put$1$DataCenter("cmd_interact_state_change", new q(3));
            e.a().a((Integer) 2);
        }
        this.f10257e.b(false);
        t.a(0, 0, null, "audience", "normal", this.f10255c.k().toString());
        JSONObject jSONObject = new JSONObject();
        e a2 = e.a();
        if (a2.l) {
            str = String.valueOf(a2.m) + "-" + a2.n;
        } else {
            str = "";
        }
        try {
            jSONObject.put("type", str);
            if (e.a().o == 2) {
                str4 = "voice_type";
            } else {
                str4 = "live_type";
            }
            jSONObject.put("connection_type", str4);
            f.a(this.context).a("guest_connection_success", "guest_connection", this.f10255c.j.getOwner().getId(), this.f10255c.j.getId(), jSONObject);
        } catch (JSONException unused) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(this.f10255c.j.getId()));
        if (a2.l) {
            str2 = String.valueOf(a2.m);
        } else {
            str2 = PushConstants.PUSH_TYPE_NOTIFY;
        }
        hashMap.put("money", str2);
        if (a2.l) {
            str3 = String.valueOf(ah.a(a2.n));
        } else {
            str3 = "1440";
        }
        hashMap.put("time", str3);
        com.bytedance.android.livesdk.j.a.a().a("guest_connection_success", hashMap, new com.bytedance.android.livesdk.j.c.j().b("live_function").a("live_detail"));
        this.f10257e.a(com.bytedance.android.livesdk.app.dataholder.d.a().h, (SurfaceView) this.f10258f);
        this.dataCenter.lambda$put$1$DataCenter("data_interact_debug_info", new p(true, this.f10255c.k().name()));
    }

    public LinkInRoomVideoGuestWidget(FrameLayout frameLayout) {
        this.l = frameLayout;
    }

    public final void c(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f10253a, false, 4399, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f10253a, false, 4399, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.utils.l.a(this.context, th2);
    }

    public final void e(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f10253a, false, 4408, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f10253a, false, 4408, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f10256d.a(i2);
        this.f10257e.a(0, i2);
    }

    public final void f(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f10253a, false, 4409, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f10253a, false, 4409, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        t.a((long) i2, "normal", this.f10255c.k().toString());
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f10253a, false, 4387, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f10253a, false, 4387, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (isViewValid() && 140000 == message.what && this.f10255c != null) {
            this.f10255c.g();
        }
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f10253a, false, 4406, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f10253a, false, 4406, new Class[]{String.class}, Void.TYPE);
            return;
        }
        ai.a((int) C0906R.string.d7w);
        es esVar = this.f10255c;
        if (PatchProxy.isSupport(new Object[0], esVar, es.f10638a, false, 4906, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], esVar, es.f10638a, false, 4906, new Class[0], Void.TYPE);
        } else {
            esVar.i = true;
            esVar.g();
        }
        t.a(this.f10255c.j.getId(), this.f10255c.j(), this.f10255c.k().toString(), 401, str);
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f10253a, false, 4405, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f10253a, false, 4405, new Class[]{String.class}, Void.TYPE);
            return;
        }
        long id = this.f10255c.j.getId();
        String j2 = this.f10255c.j();
        String eVar = this.f10255c.k().toString();
        t.a(id, j2, eVar, 402, "onWarn:" + str);
    }

    public final void b(Throwable th) {
        com.bytedance.android.live.base.model.e.a aVar;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f10253a, false, 4388, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f10253a, false, 4388, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        if (th2 instanceof com.bytedance.android.live.a.a.b.a) {
            com.bytedance.android.live.a.a.b.a aVar2 = (com.bytedance.android.live.a.a.b.a) th2;
            int errorCode = aVar2.getErrorCode();
            if (30010 == errorCode) {
                if (PatchProxy.isSupport(new Object[]{aVar2}, this, f10253a, false, 4389, new Class[]{com.bytedance.android.live.a.a.b.a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aVar2}, this, f10253a, false, 4389, new Class[]{com.bytedance.android.live.a.a.b.a.class}, Void.TYPE);
                    return;
                }
                try {
                    aVar = (com.bytedance.android.live.base.model.e.a) com.bytedance.android.live.a.a().fromJson(aVar2.getExtra(), com.bytedance.android.live.base.model.e.a.class);
                } catch (Exception e2) {
                    com.bytedance.android.live.core.c.a.a("LinkInRoomVideoGuestWid", (Throwable) e2);
                    com.bytedance.android.live.core.c.a.a("LinkInRoomVideoGuestWid", aVar2.getExtra());
                    aVar = null;
                }
                Activity a2 = com.bytedance.android.live.core.utils.d.a(this.context);
                if (PatchProxy.isSupport(new Object[]{a2, 111, aVar}, null, com.bytedance.android.livesdk.verify.d.f17692a, true, 13842, new Class[]{Activity.class, Integer.TYPE, com.bytedance.android.live.base.model.e.a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{a2, 111, aVar}, null, com.bytedance.android.livesdk.verify.d.f17692a, true, 13842, new Class[]{Activity.class, Integer.TYPE, com.bytedance.android.live.base.model.e.a.class}, Void.TYPE);
                    return;
                }
                if (a2 != null) {
                    SpannableString spannableString = new SpannableString(ac.a((int) C0906R.string.dl_));
                    spannableString.setSpan(new ForegroundColorSpan(ac.b((int) C0906R.color.a_t)), 0, spannableString.length(), 33);
                    eo.a b2 = new eo.a(a2, 2).a(false).a((int) C0906R.string.dlb).b((int) C0906R.string.dla).a(ac.a((int) C0906R.string.cpz), new DialogInterface.OnClickListener(a2) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f17699a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ Activity f17700b;

                        {
                            this.f17700b = r1;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f17699a, false, 13847, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f17699a, false, 13847, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            f.a((Context) this.f17700b);
                            dialogInterface.dismiss();
                        }
                    }).b(spannableString, new DialogInterface.OnClickListener(aVar, a2, 111) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f17695a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ com.bytedance.android.live.base.model.e.a f17696b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ Activity f17697c;

                        /* renamed from: d  reason: collision with root package name */
                        final /* synthetic */ int f17698d;

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f17695a, false, 13846, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f17695a, false, 13846, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            dialogInterface.dismiss();
                            if (this.f17696b == null || this.f17696b.f7708b != 5) {
                                if (this.f17696b == null || this.f17696b.f7708b != 2) {
                                    TTLiveSDKContext.getHostService().o().a(this.f17697c, this.f17698d, null);
                                } else {
                                    Activity activity = this.f17697c;
                                    int i2 = this.f17698d;
                                    com.bytedance.android.live.base.model.e.a aVar = this.f17696b;
                                    if (PatchProxy.isSupport(new Object[]{activity, Integer.valueOf(i2), aVar}, null, d.f17692a, true, 13843, new Class[]{Activity.class, Integer.TYPE, com.bytedance.android.live.base.model.e.a.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{activity, Integer.valueOf(i2), aVar}, null, d.f17692a, true, 13843, new Class[]{Activity.class, Integer.TYPE, com.bytedance.android.live.base.model.e.a.class}, Void.TYPE);
                                    } else {
                                        String str = "";
                                        if (aVar != null) {
                                            str = aVar.f7707a;
                                        }
                                        SpannableString spannableString = new SpannableString(ac.a((int) C0906R.string.dly));
                                        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ff4e33")), 0, spannableString.length(), 33);
                                        new eo.a(activity, 2).a((CharSequence) ac.a((int) C0906R.string.dm0, str)).b((CharSequence) ac.a((int) C0906R.string.dlz, str)).a(spannableString, new DialogInterface.OnClickListener(activity, i2) {

                                            /* renamed from: a  reason: collision with root package name */
                                            public static ChangeQuickRedirect f17704a;

                                            /* renamed from: b  reason: collision with root package name */
                                            final /* synthetic */ Activity f17705b;

                                            /* renamed from: c  reason: collision with root package name */
                                            final /* synthetic */ int f17706c;

                                            {
                                                this.f17705b = r1;
                                                this.f17706c = r2;
                                            }

                                            public final void onClick(DialogInterface dialogInterface, int i) {
                                                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f17704a, false, 13849, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f17704a, false, 13849, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                                    return;
                                                }
                                                dialogInterface.dismiss();
                                                TTLiveSDKContext.getHostService().o().a(this.f17705b, this.f17706c, PushConstants.PUSH_TYPE_UPLOAD_LOG);
                                            }
                                        }).b(ac.a((int) C0906R.string.dlx), new DialogInterface.OnClickListener(activity, i2) {

                                            /* renamed from: a  reason: collision with root package name */
                                            public static ChangeQuickRedirect f17701a;

                                            /* renamed from: b  reason: collision with root package name */
                                            final /* synthetic */ Activity f17702b;

                                            /* renamed from: c  reason: collision with root package name */
                                            final /* synthetic */ int f17703c;

                                            {
                                                this.f17702b = r1;
                                                this.f17703c = r2;
                                            }

                                            public final void onClick(DialogInterface dialogInterface, int i) {
                                                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f17701a, false, 13848, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f17701a, false, 13848, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                                    return;
                                                }
                                                dialogInterface.dismiss();
                                                Activity activity = this.f17702b;
                                                int i2 = this.f17703c;
                                                if (PatchProxy.isSupport(new Object[]{activity, Integer.valueOf(i2), "use_withdraw"}, null, d.f17692a, true, 13844, new Class[]{Activity.class, Integer.TYPE, String.class}, Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[]{activity, Integer.valueOf(i2), "use_withdraw"}, null, d.f17692a, true, 13844, new Class[]{Activity.class, Integer.TYPE, String.class}, Void.TYPE);
                                                    return;
                                                }
                                                ProgressDialog a2 = com.bytedance.android.livesdk.utils.am.a(activity);
                                                a2.setCancelable(false);
                                                a2.setCanceledOnTouchOutside(false);
                                                ((HotsoonVerifyApi) com.bytedance.android.livesdk.v.j.q().d().a(HotsoonVerifyApi.class)).unbindOldWithdrawAccount("use_withdraw").subscribe(new Consumer<com.bytedance.android.live.core.network.response.d<Void>>(a2, activity, i2) {

                                                    /* renamed from: a  reason: collision with root package name */
                                                    public static ChangeQuickRedirect f17707a;

                                                    /* renamed from: b  reason: collision with root package name */
                                                    final /* synthetic */ ProgressDialog f17708b;

                                                    /* renamed from: c  reason: collision with root package name */
                                                    final /* synthetic */ Activity f17709c;

                                                    /* renamed from: d  reason: collision with root package name */
                                                    final /* synthetic */ int f17710d;

                                                    public final /* synthetic */ void accept(Object obj) throws Exception {
                                                        com.bytedance.android.live.core.network.response.d dVar = (com.bytedance.android.live.core.network.response.d) obj;
                                                        if (PatchProxy.isSupport(new Object[]{dVar}, this, f17707a, false, 13850, new Class[]{com.bytedance.android.live.core.network.response.d.class}, Void.TYPE)) {
                                                            PatchProxy.accessDispatch(new Object[]{dVar}, this, f17707a, false, 13850, new Class[]{com.bytedance.android.live.core.network.response.d.class}, Void.TYPE);
                                                            return;
                                                        }
                                                        if (this.f17708b.isShowing()) {
                                                            this.f17708b.dismiss();
                                                        }
                                                        TTLiveSDKContext.getHostService().o().a(this.f17709c, this.f17710d, PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                                                    }

                                                    {
                                                        this.f17708b = r1;
                                                        this.f17709c = r2;
                                                        this.f17710d = r3;
                                                    }
                                                }, new Consumer<Throwable>(a2, activity) {

                                                    /* renamed from: a  reason: collision with root package name */
                                                    public static ChangeQuickRedirect f17711a;

                                                    /* renamed from: b  reason: collision with root package name */
                                                    final /* synthetic */ ProgressDialog f17712b;

                                                    /* renamed from: c  reason: collision with root package name */
                                                    final /* synthetic */ Activity f17713c;

                                                    public final /* synthetic */ void accept(Object obj) throws Exception {
                                                        Throwable th = (Throwable) obj;
                                                        if (PatchProxy.isSupport(new Object[]{th}, this, f17711a, false, 13851, new Class[]{Throwable.class}, Void.TYPE)) {
                                                            PatchProxy.accessDispatch(new Object[]{th}, this, f17711a, false, 13851, new Class[]{Throwable.class}, Void.TYPE);
                                                            return;
                                                        }
                                                        if (this.f17712b.isShowing()) {
                                                            this.f17712b.dismiss();
                                                        }
                                                        com.bytedance.android.livesdk.utils.l.a(this.f17713c, th);
                                                    }

                                                    {
                                                        this.f17712b = r1;
                                                        this.f17713c = r2;
                                                    }
                                                });
                                            }
                                        }).b();
                                        return;
                                    }
                                }
                                return;
                            }
                            TTLiveSDKContext.getHostService().o().a(this.f17697c, this.f17698d, PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                        }

                        {
                            this.f17696b = r1;
                            this.f17697c = r2;
                            this.f17698d = r3;
                        }
                    });
                    b2.f12205b.o = new DialogInterface.OnCancelListener(a2) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f17693a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ Activity f17694b;

                        {
                            this.f17694b = r1;
                        }

                        public final void onCancel(DialogInterface dialogInterface) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f17693a, false, 13845, new Class[]{DialogInterface.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f17693a, false, 13845, new Class[]{DialogInterface.class}, Void.TYPE);
                                return;
                            }
                            f.a((Context) this.f17694b);
                        }
                    };
                    b2.b();
                    f.a((Context) a2);
                }
                return;
            } else if (31002 == errorCode) {
                aa.a(this.f10255c.j);
            }
        }
        com.bytedance.android.livesdk.utils.l.a(this.context, th2);
    }

    public final void a(int i2, SurfaceView surfaceView) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), surfaceView}, this, f10253a, false, 4407, new Class[]{Integer.TYPE, SurfaceView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), surfaceView}, this, f10253a, false, 4407, new Class[]{Integer.TYPE, SurfaceView.class}, Void.TYPE);
            return;
        }
        long j2 = e.a().g;
        if (i2 == com.bytedance.android.livesdk.app.dataholder.d.a().f9052f && j2 > 0) {
            t.a(SystemClock.currentThreadTimeMillis() - j2, 1, this.f10255c.k().toString());
            e.a().g = 0;
        }
        this.f10257e.a(i2, surfaceView);
    }

    public final void b(List<i> list, String str) {
        List<i> list2 = list;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{list2, str2}, this, f10253a, false, 4397, new Class[]{List.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, str2}, this, f10253a, false, 4397, new Class[]{List.class, String.class}, Void.TYPE);
            return;
        }
        a(false, list2, str2);
    }

    public final void b(int i2, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str2}, this, f10253a, false, 4404, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str2}, this, f10253a, false, 4404, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        es esVar = this.f10255c;
        if (PatchProxy.isSupport(new Object[0], esVar, es.f10638a, false, 4898, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], esVar, es.f10638a, false, 4898, new Class[0], Void.TYPE);
        } else {
            esVar.g = false;
            esVar.h = false;
            esVar.h();
        }
        t.a(1, 301, "code: " + i2 + ", desc: " + str2, "audience", "normal", this.f10255c.k().toString(), this.f10255c.j());
    }

    public final void a(int i2, String str) {
        int i3 = i2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str2}, this, f10253a, false, 4402, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str2}, this, f10253a, false, 4402, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        t.a(this.f10255c.k().toString(), 1, i3);
        es esVar = this.f10255c;
        if (PatchProxy.isSupport(new Object[0], esVar, es.f10638a, false, 4896, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], esVar, es.f10638a, false, 4896, new Class[0], Void.TYPE);
        } else {
            ((ab) com.bytedance.android.livesdk.v.j.q().d().a().leave(esVar.j.getId()).as(esVar.p())).a(ff.f10675b, new fg(esVar));
        }
        ai.a((int) C0906R.string.d7v);
        t.a(1, 107, "code: " + i3 + ", desc: " + str2, "audience", "normal", this.f10255c.k().toString());
    }

    private void a(boolean z, List<i> list, String str) {
        List<i> list2 = list;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), list2, str2}, this, f10253a, false, 4391, new Class[]{Boolean.TYPE, List.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), list2, str2}, this, f10253a, false, 4391, new Class[]{Boolean.TYPE, List.class, String.class}, Void.TYPE);
        } else if (this.h == null || !this.h.isShowing()) {
            boolean z2 = z;
            this.h = new bf((Activity) this.context, new h(this.f10255c.j, z, list2, str2), this.dataCenter);
            this.h.show();
        }
    }
}
