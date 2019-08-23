package com.ss.android.ugc.aweme.shortvideo.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;

public final /* synthetic */ class an implements IAVPublishExtension.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70770a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoPublishFragment f70771b;

    an(VideoPublishFragment videoPublishFragment) {
        this.f70771b = videoPublishFragment;
    }

    public final void onContentModified() {
        if (PatchProxy.isSupport(new Object[0], this, f70770a, false, 80478, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70770a, false, 80478, new Class[0], Void.TYPE);
            return;
        }
        this.f70771b.o = true;
    }
}
