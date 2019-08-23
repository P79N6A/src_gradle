package com.ss.android.ugc.aweme.story.shootvideo.textrecord;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout;

public final /* synthetic */ class m implements TextStickerInputLayout.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74264a;

    /* renamed from: b  reason: collision with root package name */
    private final StoryTextRecordLayout f74265b;

    m(StoryTextRecordLayout storyTextRecordLayout) {
        this.f74265b = storyTextRecordLayout;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74264a, false, 86236, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74264a, false, 86236, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        StoryTextRecordLayout storyTextRecordLayout = this.f74265b;
        storyTextRecordLayout.r = z;
        storyTextRecordLayout.v.e();
    }
}
