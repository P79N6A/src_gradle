package com.bytedance.android.livesdk.c.a;

import android.support.annotation.Nullable;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d;
import com.bytedance.android.livesdk.j.d;
import com.bytedance.android.livesdk.utils.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class a implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9671a;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ a.C0900a f9672d;

    /* renamed from: b  reason: collision with root package name */
    public DataCenter f9673b;

    /* renamed from: c  reason: collision with root package name */
    private String f9674c;

    public final void a(View view, DataCenter dataCenter) {
        if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f9671a, false, 3878, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f9671a, false, 3878, new Class[]{View.class, DataCenter.class}, Void.TYPE);
        }
    }

    public final void a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f9671a, false, 3880, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f9671a, false, 3880, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
        }
    }

    public final void b(View view, DataCenter dataCenter) {
        if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f9671a, false, 3879, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f9671a, false, 3879, new Class[]{View.class, DataCenter.class}, Void.TYPE);
        }
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f9671a, true, 3877, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f9671a, true, 3877, new Class[0], Void.TYPE);
            return;
        }
        b bVar = new b("DouPlusToolBarBehavior.java", a.class);
        f9672d = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.business.douplus.DouPlusToolBarBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 42);
    }

    public void onClick(View view) {
        long j;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f9671a, false, 3875, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f9671a, false, 3875, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(f9672d, this, this, view2));
        Room room = (Room) this.f9673b.get("data_room", null);
        com.bytedance.android.livesdkapi.c.a aVar = (com.bytedance.android.livesdkapi.c.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.c.a.class);
        d.a a2 = d.a.a().a("entrance_type", "tool_panel").a("pay_mode", "dou_not_iap").a("serving_type", "my_group");
        long j2 = 0;
        if (room == null) {
            j = 0;
        } else {
            j = room.getId();
        }
        d.a a3 = a2.a("room_id", String.valueOf(j));
        if (room != null) {
            j2 = room.author().getId();
        }
        aVar.a(false, "click_live_dou_plus", "", a3.a("anchor_id", String.valueOf(j2)).f15712b);
        ((com.bytedance.android.livesdkapi.c.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.c.a.class)).a(view.getContext(), this.f9674c, j.a(this.f9673b).douPlusEntry);
    }

    public a(String str, @Nullable DataCenter dataCenter) {
        this.f9674c = str;
        this.f9673b = dataCenter;
    }
}
