package com.bytedance.android.livesdk.widget;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class k implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18494a;

    /* renamed from: b  reason: collision with root package name */
    private final i f18495b;

    k(i iVar) {
        this.f18495b = iVar;
    }

    public final void accept(Object obj) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f18494a, false, 14422, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f18494a, false, 14422, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        i iVar = this.f18495b;
        d dVar = (d) obj;
        if (!(dVar == null || dVar.f7871b == null)) {
            switch (((a) dVar.f7871b).f11015a) {
                case 0:
                    iVar.f18485c.setText(iVar.f18486d.getString(C0906R.string.d12));
                    iVar.f18485c.setAlpha(1.0f);
                    com.bytedance.android.live.core.utils.k.a(iVar.f18484b, ((a) dVar.f7871b).f11017c);
                    break;
                case 1:
                    iVar.f18485c.setText(iVar.f18486d.getString(C0906R.string.d11));
                    iVar.f18485c.setAlpha(1.0f);
                    com.bytedance.android.live.core.utils.k.a(iVar.f18484b, ((a) dVar.f7871b).f11016b);
                    break;
                default:
                    iVar.f18485c.setText(iVar.f18486d.getString(C0906R.string.d10));
                    iVar.f18485c.setAlpha(0.64f);
                    z = false;
                    break;
            }
            com.bytedance.android.livesdk.g.d dVar2 = new com.bytedance.android.livesdk.g.d();
            dVar2.f14634a = 2;
            dVar2.f14635b = z;
            com.bytedance.android.livesdk.u.a.a().a((Object) dVar2);
        }
    }
}
