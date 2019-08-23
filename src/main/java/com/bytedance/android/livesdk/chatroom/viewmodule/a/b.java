package com.bytedance.android.livesdk.chatroom.viewmodule.a;

import android.support.annotation.NonNull;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.ui.df;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import org.aspectj.lang.a;

public class b implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12948a;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ a.C0900a f12949d;

    /* renamed from: b  reason: collision with root package name */
    private Room f12950b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12951c = true;

    public final void a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f12948a, false, 7746, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f12948a, false, 7746, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
        }
    }

    public final void b(View view, DataCenter dataCenter) {
        if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12948a, false, 7745, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12948a, false, 7745, new Class[]{View.class, DataCenter.class}, Void.TYPE);
        }
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f12948a, true, 7744, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f12948a, true, 7744, new Class[0], Void.TYPE);
            return;
        }
        org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("ToolbarManageBehavior.java", b.class);
        f12949d = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.toolbar_behavior.ToolbarManageBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 31);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f12948a, false, 7743, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12948a, false, 7743, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f12949d, this, this, view));
        if (!NetworkUtils.isNetworkAvailable(view.getContext())) {
            ai.a((int) C0906R.string.cst);
            return;
        }
        if (this.f12950b != null) {
            df dfVar = new df(view.getContext(), this.f12950b, this.f12950b.getOwner(), true, this.f12951c);
            dfVar.show();
        }
    }

    public final void a(@NonNull View view, @NonNull DataCenter dataCenter) {
        if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12948a, false, 7742, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12948a, false, 7742, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            return;
        }
        this.f12950b = (Room) dataCenter.get("data_room");
        this.f12951c = ((Boolean) dataCenter.get("data_is_portrait")).booleanValue();
    }
}
