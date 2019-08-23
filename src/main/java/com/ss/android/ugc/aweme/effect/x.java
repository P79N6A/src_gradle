package com.ss.android.ugc.aweme.effect;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.MvChooseCoverAdapter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.f;
import java.util.List;

public final /* synthetic */ class x implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43786a;

    /* renamed from: b  reason: collision with root package name */
    private final MvChooseCoverAdapter f43787b;

    x(MvChooseCoverAdapter mvChooseCoverAdapter) {
        this.f43787b = mvChooseCoverAdapter;
    }

    public final void a(List list) {
        List list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f43786a, false, 38725, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f43786a, false, 38725, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.f43787b.a(list2);
    }
}
