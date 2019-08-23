package com.bytedance.android.livesdk.bgbroadcast;

import android.app.Activity;
import android.support.annotation.CallSuper;
import android.view.View;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.s;
import com.bytedance.android.livesdk.chatroom.ui.ah;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import java.util.HashMap;
import org.aspectj.lang.a;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9171a;

    /* renamed from: b  reason: collision with root package name */
    protected final Room f9172b;

    /* renamed from: c  reason: collision with root package name */
    public final n f9173c;

    /* renamed from: d  reason: collision with root package name */
    public final Activity f9174d;

    /* renamed from: e  reason: collision with root package name */
    public ah f9175e;

    class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f9176a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f9177c;

        public final void a(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f9176a, false, 3210, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f9176a, false, 3210, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        public final void a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f9176a, false, 3212, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f9176a, false, 3212, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
            }
        }

        public final void b(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f9176a, false, 3211, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f9176a, false, 3211, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        static {
            if (PatchProxy.isSupport(new Object[0], null, f9176a, true, 3209, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f9176a, true, 3209, new Class[0], Void.TYPE);
                return;
            }
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("AbsUiStrategy.java", a.class);
            f9177c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.bgbroadcast.AbsUiStrategy$ToolbarAutoReplyBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 79);
        }

        private a() {
        }

        public void onClick(View view) {
            long j;
            if (PatchProxy.isSupport(new Object[]{view}, this, f9176a, false, 3208, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f9176a, false, 3208, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f9177c, this, this, view));
            if (b.this.f9175e == null) {
                b.this.f9175e = new ah(b.this.f9174d);
            }
            if (!b.this.f9175e.isShowing()) {
                b.this.f9175e.show();
            }
            Room a2 = TTLiveSDKContext.getLiveService().d().a();
            if (a2 != null) {
                j = a2.getId();
            } else {
                j = -1;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live_function");
            hashMap.put("event_type", "show");
            hashMap.put("event_page", "live_take_detail");
            if (j != -1) {
                hashMap.put("room_id", String.valueOf(j));
            }
            com.bytedance.android.livesdk.j.a.a().a("auto_reply_show", hashMap, new Object[0]);
        }

        /* synthetic */ a(b bVar, byte b2) {
            this();
        }
    }

    public abstract void b();

    public abstract void c();

    public abstract void e();

    public abstract void f();

    public abstract boolean g();

    public abstract boolean h();

    public void i() {
    }

    public abstract void onEvent(s sVar);

    @CallSuper
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f9171a, false, 3206, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9171a, false, 3206, new Class[0], Void.TYPE);
            return;
        }
        j.b().a(f.AUTO_REPLY, (d.a) new a(this, (byte) 0));
    }

    @CallSuper
    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f9171a, false, 3207, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9171a, false, 3207, new Class[0], Void.TYPE);
            return;
        }
        if (this.f9175e != null) {
            this.f9175e.dismiss();
        }
    }

    public b(Room room, n nVar) {
        this.f9172b = room;
        this.f9173c = nVar;
        if (nVar != null) {
            this.f9174d = nVar.n();
        } else {
            this.f9174d = null;
        }
    }
}
