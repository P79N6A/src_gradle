package com.bytedance.android.livesdk.viewmodel;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.List;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17748a;

    /* renamed from: b  reason: collision with root package name */
    private final FansClubAutoLightViewModel f17749b;

    c(FansClubAutoLightViewModel fansClubAutoLightViewModel) {
        this.f17749b = fansClubAutoLightViewModel;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17748a, false, 13860, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17748a, false, 13860, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        FansClubAutoLightViewModel fansClubAutoLightViewModel = this.f17749b;
        d dVar = (d) obj;
        if (!(dVar == null || dVar.f7871b == null)) {
            List<k.a> list = ((k) dVar.f7871b).f11130b;
            if (list != null) {
                fansClubAutoLightViewModel.l += list.size();
            }
        }
    }
}
