package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.f;
import java.util.Collection;
import java.util.List;

public final /* synthetic */ class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66568a;

    /* renamed from: b  reason: collision with root package name */
    private final FramesAdapter f66569b;

    a(FramesAdapter framesAdapter) {
        this.f66569b = framesAdapter;
    }

    public final void a(List list) {
        List list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f66568a, false, 75879, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f66568a, false, 75879, new Class[]{List.class}, Void.TYPE);
            return;
        }
        FramesAdapter framesAdapter = this.f66569b;
        if (PatchProxy.isSupport(new Object[]{list2}, framesAdapter, FramesAdapter.f66522a, false, 75878, new Class[]{List.class}, Void.TYPE)) {
            FramesAdapter framesAdapter2 = framesAdapter;
            PatchProxy.accessDispatch(new Object[]{list2}, framesAdapter2, FramesAdapter.f66522a, false, 75878, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (!j.a((Collection<T>) list)) {
            framesAdapter.m.clear();
            framesAdapter.m.addAll(list2);
            framesAdapter.notifyDataSetChanged();
        }
    }
}
