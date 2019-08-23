package com.bytedance.android.livesdk.viewmodel;

import android.util.Pair;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.livesdk.chatroom.model.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;
import java.util.ArrayList;

public final /* synthetic */ class d implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17750a;

    /* renamed from: b  reason: collision with root package name */
    static final Function f17751b = new d();

    private d() {
    }

    public final Object apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17750a, false, 13861, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f17750a, false, 13861, new Class[]{Object.class}, Object.class);
        }
        com.bytedance.android.live.core.network.response.d dVar = (com.bytedance.android.live.core.network.response.d) obj;
        if (dVar == null || dVar.f7872c == null || dVar.f7871b == null) {
            return Pair.create(new ArrayList(), new Extra());
        }
        dVar.f7872c.hasMore = ((k) dVar.f7871b).f11129a;
        return Pair.create(((k) dVar.f7871b).f11130b, dVar.f7872c);
    }
}
