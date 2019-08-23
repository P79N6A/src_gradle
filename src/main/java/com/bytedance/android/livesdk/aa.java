package com.bytedance.android.livesdk;

import com.bytedance.android.livesdk.live.model.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Predicate;
import java.util.Map;

public final /* synthetic */ class aa implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8895a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f8896b;

    aa(Map map) {
        this.f8896b = map;
    }

    public final boolean test(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f8895a, false, 2718, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f8895a, false, 2718, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        Map map = this.f8896b;
        String valueOf = String.valueOf(((Room) obj).getId());
        return map.containsKey(valueOf) && !((a) map.get(valueOf)).f15857b;
    }
}
