package com.ss.android.ugc.aweme.photo.publish;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;

public final /* synthetic */ class d implements IAVPublishExtension.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58701a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoPublishFragment f58702b;

    d(PhotoPublishFragment photoPublishFragment) {
        this.f58702b = photoPublishFragment;
    }

    public final void onContentModified() {
        if (PatchProxy.isSupport(new Object[0], this, f58701a, false, 63746, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58701a, false, 63746, new Class[0], Void.TYPE);
            return;
        }
        this.f58702b.f58645d = true;
    }
}
