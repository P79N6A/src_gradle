package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKTypeContract;
import com.bytedance.android.livesdk.chatroom.interact.model.c;
import com.bytedance.android.livesdk.chatroom.model.ac;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.w.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final class ar extends InteractDialogPKTypeContract.a {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f10390e;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(Throwable th) {
        a(th);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f10390e, false, 4690, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10390e, false, 4690, new Class[0], Void.TYPE);
            return;
        }
        ((ab) j.q().d().b().getMode(1).as(b())).a(new aw(this), new ax(this));
    }

    public ar(InteractDialogPKTypeContract.View view) {
        super(view);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(d dVar) throws Exception {
        if (dVar.f7870a == 0 && dVar.f7871b != null) {
            ((InteractDialogPKTypeContract.View) this.f10831c).a(((ac) dVar.f7871b).f11082c);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(d dVar) throws Exception {
        if (dVar.f7870a == 0) {
            for (c cVar : (List) dVar.f7871b) {
                boolean z = true;
                if (cVar.f10976a == 1) {
                    b.ax.a(Integer.valueOf(cVar.f10977b));
                    InteractDialogPKTypeContract.View view = (InteractDialogPKTypeContract.View) this.f10831c;
                    if (cVar.f10977b != 1) {
                        z = false;
                    }
                    view.a(z);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(boolean z) throws Exception {
        b.ax.a(Integer.valueOf(z ? 1 : 0));
        ((InteractDialogPKTypeContract.View) this.f10831c).a(z);
    }

    public final void a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f10390e, false, 4689, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f10390e, false, 4689, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        ((ab) j.q().d().d().getCurrentMedal(j).as(b())).a(new au(this), new av(this));
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f10390e, false, 4688, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f10390e, false, 4688, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ((ab) j.q().d().b().setMode(1, z ? 1 : 0).as(b())).a(new as(this, z), new at(this, z));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(boolean z, Throwable th) throws Exception {
        ((InteractDialogPKTypeContract.View) this.f10831c).a(!z, th);
    }
}
