package com.bytedance.android.livesdk.chatroom.viewmodule.a;

import android.app.Dialog;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.e;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f;
import com.bytedance.android.livesdk.effect.j;
import com.bytedance.android.livesdk.j.c.k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Lists;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class c implements Observer<KVData>, d.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12952a;

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ a.C0900a f12953f;

    /* renamed from: b  reason: collision with root package name */
    private List<f> f12954b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private Dialog f12955c;

    /* renamed from: d  reason: collision with root package name */
    private View f12956d;

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.android.livesdkapi.depend.model.live.a f12957e;

    static {
        if (PatchProxy.isSupport(new Object[0], null, f12952a, true, 7753, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f12952a, true, 7753, new Class[0], Void.TYPE);
            return;
        }
        b bVar = new b("ToolbarMoreBehavior.java", c.class);
        f12953f = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.toolbar_behavior.ToolbarMoreBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 68);
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f12952a, false, 7752, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12952a, false, 7752, new Class[0], Void.TYPE);
        } else if (!com.bytedance.android.live.uikit.a.a.d() || this.f12957e != com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO || (!j.a().d() && !((Boolean) com.bytedance.android.livesdk.w.b.ac.a()).booleanValue())) {
            this.f12956d.setVisibility(8);
        } else {
            this.f12956d.setVisibility(0);
        }
    }

    public c(Context context) {
        this.f12955c = new e(context, this.f12954b);
    }

    public final void a(@NonNull com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
        com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f12952a, false, 7751, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f12952a, false, 7751, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
            return;
        }
        if (aVar2 instanceof com.bytedance.android.livesdk.chatroom.viewmodule.a.a.a) {
            a();
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        KVData kVData = (KVData) obj;
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f12952a, false, 7750, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f12952a, false, 7750, new Class[]{KVData.class}, Void.TYPE);
            return;
        }
        if (kVData != null) {
            if ("cmd_toolbar_click_filter".equals(kVData.getKey())) {
                a();
            } else if ("cmd_dismiss_dialog_end".equals(kVData.getKey()) && this.f12955c != null) {
                d.a(this.f12955c);
            }
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f12952a, false, 7749, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12952a, false, 7749, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(f12953f, this, this, view));
        if (!Lists.isEmpty(this.f12954b)) {
            this.f12955c.show();
        }
        com.bytedance.android.livesdk.j.a.a().a("anchor_more_function_click", new com.bytedance.android.livesdk.j.c.j().a("live_take_detail").b("live_take"), new k(), Room.class);
    }

    public final void b(@NonNull View view, @NonNull DataCenter dataCenter) {
        if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12952a, false, 7748, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12952a, false, 7748, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            return;
        }
        if (this.f12955c != null) {
            d.a(this.f12955c);
        }
        dataCenter.removeObserver(this);
    }

    public final void a(@NonNull View view, @NonNull DataCenter dataCenter) {
        if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12952a, false, 7747, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12952a, false, 7747, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            return;
        }
        this.f12956d = view.findViewById(C0906R.id.duh);
        this.f12957e = ((Room) dataCenter.get("data_room")).getStreamType();
        a();
        dataCenter.observe("cmd_toolbar_click_filter", this);
        com.bytedance.android.livesdk.v.j.q().j().b(dataCenter, this.f12954b);
    }
}
