package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.view.a;
import com.bytedance.android.livesdk.message.model.j;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;
import java.util.Map;

public final class e implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11345a;

    /* renamed from: b  reason: collision with root package name */
    public a f11346b;

    /* renamed from: c  reason: collision with root package name */
    public DataCenter f11347c;

    /* renamed from: d  reason: collision with root package name */
    public IMessageManager f11348d;

    public e(DataCenter dataCenter) {
        this.f11347c = dataCenter;
    }

    public final void onMessage(IMessage iMessage) {
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f11345a, false, 5151, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage}, this, f11345a, false, 5151, new Class[]{IMessage.class}, Void.TYPE);
        } else if (this.f11346b != null) {
            this.f11346b.a((j) iMessage);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("action", Integer.valueOf(((j) iMessage).f16637b));
            com.bytedance.android.live.core.d.e.a("ttlive_control_message_status", 1, (Map<String, Object>) hashMap);
        }
    }
}
