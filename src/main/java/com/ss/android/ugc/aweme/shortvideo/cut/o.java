package com.ss.android.ugc.aweme.shortvideo.cut;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.cut.VideoSegmentAdapter;

public final /* synthetic */ class o implements VideoSegmentAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66503a;

    /* renamed from: b  reason: collision with root package name */
    private final CutMultiVideoActivity f66504b;

    o(CutMultiVideoActivity cutMultiVideoActivity) {
        this.f66504b = cutMultiVideoActivity;
    }

    public final void a(View view, int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), str2}, this, f66503a, false, 75454, new Class[]{View.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), str2}, this, f66503a, false, 75454, new Class[]{View.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.f66504b.a(i, str2);
    }
}
