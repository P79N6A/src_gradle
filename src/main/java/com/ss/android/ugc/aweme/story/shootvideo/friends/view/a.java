package com.ss.android.ugc.aweme.story.shootvideo.friends.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73588a;

    /* renamed from: b  reason: collision with root package name */
    private final PublishKnowFriendsLayout f73589b;

    /* renamed from: c  reason: collision with root package name */
    private final List f73590c;

    a(PublishKnowFriendsLayout publishKnowFriendsLayout, List list) {
        this.f73589b = publishKnowFriendsLayout;
        this.f73590c = list;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f73588a, false, 85344, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73588a, false, 85344, new Class[0], Void.TYPE);
            return;
        }
        this.f73589b.c(this.f73590c);
    }
}
