package com.ss.android.ugc.aweme.story.shootvideo.textrecord;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74260a;

    /* renamed from: b  reason: collision with root package name */
    private final StoryTextRecordLayout f74261b;

    k(StoryTextRecordLayout storyTextRecordLayout) {
        this.f74261b = storyTextRecordLayout;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74260a, false, 86234, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74260a, false, 86234, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f74261b.a(z);
    }
}
