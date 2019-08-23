package com.bytedance.android.livesdk.chatroom.presenter;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.viewmodule.al;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.model.be;
import com.bytedance.android.livesdk.message.model.bf;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayDeque;
import java.util.Queue;

public final class bt extends bx<a> implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11317a;

    /* renamed from: b  reason: collision with root package name */
    private Queue<be> f11318b;

    /* renamed from: c  reason: collision with root package name */
    private long f11319c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11320d;

    public interface a extends al {
        void a(be beVar);

        boolean b();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f11317a, false, 5313, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11317a, false, 5313, new Class[0], Void.TYPE);
            return;
        }
        if (this.f11318b != null) {
            this.f11318b.clear();
        }
        super.d();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f11317a, false, 5311, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11317a, false, 5311, new Class[0], Void.TYPE);
            return;
        }
        if (b() != null && !((a) b()).b()) {
            ((a) b()).a(this.f11318b.poll());
        }
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f11317a, false, 5312, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f11317a, false, 5312, new Class[]{a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        this.f11320d = ((Boolean) this.x.get("data_is_anchor")).booleanValue();
        this.f11319c = ((Long) this.x.get("data_room_id")).longValue();
        if (this.y != null) {
            this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.ROOM_PUSH.getIntType(), this);
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f11317a, false, 5314, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage}, this, f11317a, false, 5314, new Class[]{IMessage.class}, Void.TYPE);
            return;
        }
        be beVar = (be) iMessage;
        if (beVar.baseMessage != null && beVar.baseMessage.f18776c == this.f11319c) {
            if (this.f11318b == null) {
                this.f11318b = new ArrayDeque();
            }
            bf bfVar = beVar.f16553b;
            if (bfVar != null && !TextUtils.isEmpty(bfVar.f16559f) && bfVar.f16559f.equals("8") && (TextUtils.isEmpty((CharSequence) LiveConfigSettingKeys.LIVE_TURNTABLE_URL.a()) || this.f11320d)) {
                return;
            }
            if (bfVar == null || TextUtils.isEmpty(bfVar.f16559f) || !bfVar.f16559f.equals("10") || (!TextUtils.isEmpty((CharSequence) LiveConfigSettingKeys.LIVE_TURNTABLE_URL.a()) && !this.f11320d)) {
                this.f11318b.offer(beVar);
                a();
            }
        }
    }
}
