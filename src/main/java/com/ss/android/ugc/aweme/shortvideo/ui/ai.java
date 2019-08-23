package com.ss.android.ugc.aweme.shortvideo.ui;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.n.b;
import java.io.File;

public final /* synthetic */ class ai implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70756a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoPublishFragment f70757b;

    ai(VideoPublishFragment videoPublishFragment) {
        this.f70757b = videoPublishFragment;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f70756a, false, 80471, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f70756a, false, 80471, new Class[]{i.class}, Object.class);
        }
        VideoPublishFragment videoPublishFragment = this.f70757b;
        if (PatchProxy.isSupport(new Object[0], videoPublishFragment, VideoPublishFragment.f70600a, false, 80442, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], videoPublishFragment, VideoPublishFragment.f70600a, false, 80442, new Class[0], Void.TYPE);
        } else {
            String str = videoPublishFragment.n.infoStickerModel.infoStickerDraftDir;
            if (videoPublishFragment.n.hasInfoStickers()) {
                for (b next : videoPublishFragment.n.infoStickerModel.stickers) {
                    String str2 = str + File.separator + new File(next.path).getName();
                    if (!next.isInfoSticker()) {
                        com.ss.android.ugc.aweme.video.b.c(next.path, str2);
                    } else if (!com.ss.android.ugc.aweme.video.b.b(str2)) {
                        String str3 = next.path;
                        String str4 = str2 + File.separator;
                        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, com.ss.android.ugc.aweme.video.b.f4305a, true, 88903, new Class[]{String.class, String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, com.ss.android.ugc.aweme.video.b.f4305a, true, 88903, new Class[]{String.class, String.class}, Void.TYPE);
                        } else {
                            com.ss.android.ugc.aweme.video.b.a(str3, str4, true);
                        }
                    }
                }
            }
        }
        return null;
    }
}
