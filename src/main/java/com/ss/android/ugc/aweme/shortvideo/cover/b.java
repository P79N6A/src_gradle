package com.ss.android.ugc.aweme.shortvideo.cover;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.MvChooseCoverAdapter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.f;
import java.util.List;

public final /* synthetic */ class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66108a;

    /* renamed from: b  reason: collision with root package name */
    private final MvChooseCoverAdapter f66109b;

    b(MvChooseCoverAdapter mvChooseCoverAdapter) {
        this.f66109b = mvChooseCoverAdapter;
    }

    public final void a(List list) {
        List list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f66108a, false, 75373, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f66108a, false, 75373, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.f66109b.a(list2);
    }
}
