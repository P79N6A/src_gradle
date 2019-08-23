package com.bytedance.android.livesdk.feed.viewmodel;

import com.bytedance.android.livesdk.feed.d.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

public final /* synthetic */ class t implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14511a;

    /* renamed from: b  reason: collision with root package name */
    static final Function f14512b = new t();

    private t() {
    }

    public final Object apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14511a, false, 9021, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f14511a, false, 9021, new Class[]{Object.class}, Object.class);
        }
        ArrayList arrayList = new ArrayList();
        for (g gVar : (List) obj) {
            if (gVar != null && gVar.b()) {
                arrayList.add(gVar);
            }
        }
        return arrayList;
    }
}
