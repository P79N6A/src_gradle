package com.ss.android.ugc.aweme.feed.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.video.preload.g;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45078a;

    public static void a(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, null, f45078a, true, 40909, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, null, f45078a, true, 40909, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        g.f().b();
        g.f().a(aweme2);
        if (!(aweme2 == null || aweme.getVideo() == null)) {
            aweme.getVideo().setSourceId(aweme.getAid());
            VideoUrlModel properPlayAddr = aweme.getVideo().getProperPlayAddr();
            if (properPlayAddr != null) {
                properPlayAddr.setSourceId(aweme.getAid());
            }
        }
    }
}
