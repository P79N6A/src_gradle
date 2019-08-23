package com.bytedance.android.livesdk.sticker;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.gift.model.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class j implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17296a;

    /* renamed from: b  reason: collision with root package name */
    private final i f17297b;

    /* renamed from: c  reason: collision with root package name */
    private final String f17298c;

    j(i iVar, String str) {
        this.f17297b = iVar;
        this.f17298c = str;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17296a, false, 13379, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17296a, false, 13379, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        i iVar = this.f17297b;
        String str = this.f17298c;
        d dVar = (d) obj;
        if (iVar.f17286b) {
            if (((a) dVar.f7871b).f15094a) {
                str = null;
            }
            iVar.a(str);
        }
    }
}
