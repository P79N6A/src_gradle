package com.bytedance.android.livesdk.chatroom.viewmodule.toolbar;

import android.arch.lifecycle.Observer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d;
import com.bytedance.android.livesdk.utils.j;
import com.bytedance.android.livesdkapi.d.c;
import com.bytedance.android.livesdkapi.d.f;
import com.bytedance.android.livesdkapi.d.h;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class g implements Observer<KVData>, d.a, OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13317a;

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ a.C0900a f13318f;

    /* renamed from: b  reason: collision with root package name */
    private Room f13319b;

    /* renamed from: c  reason: collision with root package name */
    private IMessageManager f13320c;

    /* renamed from: d  reason: collision with root package name */
    private DataCenter f13321d;

    /* renamed from: e  reason: collision with root package name */
    private View f13322e;

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f13317a, false, 7718, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f13317a, false, 7718, new Class[]{a.class}, Void.TYPE);
        }
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f13317a, true, 7717, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f13317a, true, 7717, new Class[0], Void.TYPE);
            return;
        }
        b bVar = new b("ToolbarCommerceBehavior.java", g.class);
        f13318f = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarCommerceBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 61);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13317a, false, 7714, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13317a, false, 7714, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(f13318f, this, this, view));
        if (j.b(this.f13321d)) {
            ((com.bytedance.android.livesdkapi.c.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.c.a.class)).a(true, "live_ad", "slidecart_click", j.c(this.f13321d));
        }
    }

    public void onMessage(IMessage iMessage) {
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f13317a, false, 7715, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage}, this, f13317a, false, 7715, new Class[]{IMessage.class}, Void.TYPE);
            return;
        }
        if (iMessage != null && iMessage.getIntType() == com.bytedance.android.livesdkapi.depend.f.a.LIVE_SHOPPING.getIntType()) {
            f n = TTLiveSDKContext.getHostService().n();
            if (n != null) {
                n.a((h) iMessage);
            }
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        KVData kVData = (KVData) obj;
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f13317a, false, 7716, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f13317a, false, 7716, new Class[]{KVData.class}, Void.TYPE);
            return;
        }
        if (kVData != null && "cmd_douyin_commerce_ready".equals(kVData.getKey()) && (kVData.getData() instanceof c) && this.f13319b != null && (this.f13322e instanceof ViewGroup)) {
            c cVar = (c) kVData.getData();
            if (cVar != null) {
                if (cVar.a() && this.f13321d != null) {
                    this.f13320c = (IMessageManager) this.f13321d.get("data_message_manager", null);
                    if (this.f13320c != null) {
                        this.f13320c.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.LIVE_SHOPPING.getIntType(), this);
                    }
                }
                f n = TTLiveSDKContext.getHostService().n();
                if (n != null) {
                    if (cVar.b()) {
                        if (((ViewGroup) this.f13322e).getChildCount() == 0) {
                            com.bytedance.android.livesdkapi.d.b a2 = n.a(this.f13322e.getContext());
                            if (a2 != null) {
                                a2.a(this);
                                ((ViewGroup) this.f13322e).addView(a2.getView());
                            }
                        }
                        this.f13322e.setVisibility(0);
                        return;
                    }
                    this.f13322e.setVisibility(8);
                }
            }
        }
    }

    public final void a(@NonNull View view, @NonNull DataCenter dataCenter) {
        if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f13317a, false, 7712, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f13317a, false, 7712, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            return;
        }
        view.setVisibility(8);
        this.f13322e = view;
        this.f13319b = (Room) dataCenter.get("data_room", null);
        dataCenter.observeForever("cmd_douyin_commerce_ready", this);
        this.f13321d = dataCenter;
    }

    public final void b(@NonNull View view, @NonNull DataCenter dataCenter) {
        if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f13317a, false, 7713, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f13317a, false, 7713, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            return;
        }
        if (this.f13320c != null) {
            this.f13320c.removeMessageListener(this);
            this.f13320c = null;
        }
        dataCenter.removeObserver(this);
        this.f13319b = null;
    }
}
