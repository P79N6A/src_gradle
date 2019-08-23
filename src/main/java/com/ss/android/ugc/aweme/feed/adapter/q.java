package com.ss.android.ugc.aweme.feed.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public abstract /* synthetic */ class q {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44957a;

    public static Aweme a(IFeedViewHolder iFeedViewHolder) {
        if (!PatchProxy.isSupport(new Object[]{iFeedViewHolder}, null, f44957a, true, 40558, new Class[]{IFeedViewHolder.class}, Aweme.class)) {
            return iFeedViewHolder.d();
        }
        return (Aweme) PatchProxy.accessDispatch(new Object[]{iFeedViewHolder}, null, f44957a, true, 40558, new Class[]{IFeedViewHolder.class}, Aweme.class);
    }

    public static void a(IFeedViewHolder iFeedViewHolder, Aweme aweme, boolean z, int i) {
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder, aweme, Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i)}, null, f44957a, true, 40559, new Class[]{IFeedViewHolder.class, Aweme.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iFeedViewHolder, aweme, Byte.valueOf(z), Integer.valueOf(i)}, null, f44957a, true, 40559, new Class[]{IFeedViewHolder.class, Aweme.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        iFeedViewHolder.a(aweme, z);
    }
}
