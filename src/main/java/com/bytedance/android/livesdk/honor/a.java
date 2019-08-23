package com.bytedance.android.livesdk.honor;

import com.bytedance.android.livesdk.chatroom.presenter.bx;
import com.bytedance.android.livesdk.chatroom.viewmodule.al;
import com.bytedance.android.livesdk.message.model.ag;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.LinkedList;

public final class a extends bx<C0109a> implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15523a;

    /* renamed from: b  reason: collision with root package name */
    private LinkedList<ag> f15524b = new LinkedList<>();

    /* renamed from: c  reason: collision with root package name */
    private ag f15525c;

    /* renamed from: com.bytedance.android.livesdk.honor.a$a  reason: collision with other inner class name */
    public interface C0109a extends al {
        void a(ag agVar);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f15523a, false, 10139, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15523a, false, 10139, new Class[0], Void.TYPE);
            return;
        }
        super.d();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f15523a, false, 10141, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15523a, false, 10141, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f15524b.isEmpty() && (this.f15525c == null || !this.f15525c.f16449e)) {
            this.f15525c = this.f15524b.poll();
            if (this.f15525c != null) {
                this.f15525c.f16449e = true;
                if (b() != null) {
                    ((C0109a) b()).a(this.f15525c);
                }
            }
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f15523a, false, 10140, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage}, this, f15523a, false, 10140, new Class[]{IMessage.class}, Void.TYPE);
            return;
        }
        if (iMessage != null && iMessage.getIntType() == com.bytedance.android.livesdkapi.depend.f.a.HONOR_LEVEL_UP.getIntType()) {
            this.f15524b.offer((ag) iMessage);
            a();
        }
    }

    public final void a(C0109a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f15523a, false, 10138, new Class[]{C0109a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f15523a, false, 10138, new Class[]{C0109a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        if (this.y != null) {
            this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.HONOR_LEVEL_UP.getIntType(), this);
        }
    }
}
