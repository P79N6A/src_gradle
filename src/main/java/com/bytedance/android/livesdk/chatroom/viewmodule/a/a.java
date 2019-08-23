package com.bytedance.android.livesdk.chatroom.viewmodule.a;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.event.s;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class a implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12944a;

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ a.C0900a f12945b;

    public final void a(View view, DataCenter dataCenter) {
        if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12944a, false, 7739, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12944a, false, 7739, new Class[]{View.class, DataCenter.class}, Void.TYPE);
        }
    }

    public final void a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f12944a, false, 7741, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f12944a, false, 7741, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
        }
    }

    public final void b(View view, DataCenter dataCenter) {
        if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12944a, false, 7740, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12944a, false, 7740, new Class[]{View.class, DataCenter.class}, Void.TYPE);
        }
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f12944a, true, 7738, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f12944a, true, 7738, new Class[0], Void.TYPE);
            return;
        }
        b bVar = new b("ToolbarCloseRoomBehavior.java", a.class);
        f12945b = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.toolbar_behavior.ToolbarCloseRoomBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 14);
    }

    public void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f12944a, false, 7737, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f12944a, false, 7737, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(f12945b, this, this, view2));
        com.bytedance.android.livesdk.u.a.a().a((Object) new s(6));
    }
}
