package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.viewmodule.al;
import com.bytedance.android.livesdk.message.model.at;
import com.bytedance.android.livesdk.message.model.au;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

public class bn extends bx<a> implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11301a;

    /* renamed from: b  reason: collision with root package name */
    public int f11302b;

    /* renamed from: c  reason: collision with root package name */
    public int f11303c;

    /* renamed from: d  reason: collision with root package name */
    private b f11304d = b.IDLE;

    /* renamed from: e  reason: collision with root package name */
    private long f11305e;

    /* renamed from: f  reason: collision with root package name */
    private int f11306f;
    private int g;

    public interface a extends al {
        void a(int i, int i2);

        void a(b bVar, long j);
    }

    public enum b {
        IDLE,
        IN_PROGRESS,
        FINISHED;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f11301a, false, 5294, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11301a, false, 5294, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        this.f11305e = 0;
        this.f11302b = 0;
        this.f11306f = 0;
        this.f11303c = 0;
    }

    public bn(int i) {
        this.g = i;
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f11301a, false, 5293, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f11301a, false, 5293, new Class[]{a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.PROMOTION_CARD_MESSAGE.getIntType(), this);
        this.f11305e = ((Long) this.x.get("data_room_id")).longValue();
    }

    public void onMessage(IMessage iMessage) {
        b bVar;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f11301a, false, 5295, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage}, this, f11301a, false, 5295, new Class[]{IMessage.class}, Void.TYPE);
        } else if (b() != null && (iMessage instanceof at) && (!((Boolean) com.bytedance.android.livesdk.config.a.Z.a()).booleanValue() || this.g != 1)) {
            au auVar = ((at) iMessage).f16497b;
            if (auVar != null && auVar.f16503f == this.g) {
                String str = auVar.f16498a;
                char c2 = 65535;
                if (str.hashCode() == -1422071172 && str.equals("card_progress")) {
                    c2 = 0;
                }
                if (c2 == 0) {
                    if (!auVar.f16502e && auVar.f16501d < auVar.f16500c) {
                        z = false;
                    }
                    if (z) {
                        bVar = b.FINISHED;
                    } else {
                        bVar = b.IN_PROGRESS;
                    }
                    this.f11303c = auVar.g;
                    if (this.f11304d != bVar) {
                        this.f11304d = bVar;
                        ((a) b()).a(bVar, this.f11305e);
                        this.f11302b = 0;
                        this.f11306f = 0;
                    }
                    if (this.f11304d == b.IN_PROGRESS && (this.f11302b < auVar.f16501d || this.f11306f != auVar.f16500c)) {
                        if (this.f11306f != auVar.f16500c) {
                            j.q().n().e();
                        }
                        this.f11302b = auVar.f16501d;
                        this.f11306f = auVar.f16500c;
                        ((a) b()).a(this.f11302b, this.f11306f);
                    }
                }
            }
        }
    }
}
