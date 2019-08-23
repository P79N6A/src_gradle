package com.bytedance.android.livesdk.chatroom.end;

import com.bytedance.android.livesdk.j.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.Map;

public final /* synthetic */ class b implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10097a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f10098b;

    b(Map map) {
        this.f10098b = map;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10097a, false, 4203, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10097a, false, 4203, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        Map map = this.f10098b;
        map.putAll((Map) obj);
        a.a().a("live_show", map, new Object[0]);
    }
}
