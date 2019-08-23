package com.ss.android.ugc.aweme.story.shootvideo.textrecord;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.shootvideo.textfont.f;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74270a;

    /* renamed from: b  reason: collision with root package name */
    private final StoryTextRecordLayout f74271b;

    p(StoryTextRecordLayout storyTextRecordLayout) {
        this.f74271b = storyTextRecordLayout;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f74270a, false, 86239, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74270a, false, 86239, new Class[0], Void.TYPE);
            return;
        }
        StoryTextRecordLayout storyTextRecordLayout = this.f74271b;
        storyTextRecordLayout.f74216b.removeAllViews();
        storyTextRecordLayout.f74218d.setVisibility(0);
        storyTextRecordLayout.k.setVisibility(8);
        storyTextRecordLayout.f74219e = null;
        StoryTextRecordTextInputLayout storyTextRecordTextInputLayout = storyTextRecordLayout.v;
        if (PatchProxy.isSupport(new Object[0], storyTextRecordTextInputLayout, TextStickerInputLayout.f74318b, false, 86391, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], storyTextRecordTextInputLayout, TextStickerInputLayout.f74318b, false, 86391, new Class[0], Void.TYPE);
        } else if (storyTextRecordTextInputLayout.k != null) {
            f fVar = storyTextRecordTextInputLayout.k;
            if (PatchProxy.isSupport(new Object[0], fVar, f.f74186a, false, 86117, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], fVar, f.f74186a, false, 86117, new Class[0], Void.TYPE);
            } else {
                if (fVar.f74187b != null) {
                    fVar.f74187b.clear();
                }
                if (fVar.f74190e != null) {
                    fVar.f74190e.removeAllViews();
                }
            }
        }
        j.a().f74258b = 0;
        storyTextRecordLayout.a(true);
        storyTextRecordLayout.r = false;
        storyTextRecordLayout.t = 0;
        storyTextRecordLayout.u = true;
    }
}
