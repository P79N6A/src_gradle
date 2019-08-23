package com.ss.android.ugc.aweme.feed.feedwidget;

import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.ui.VideoShareView;
import com.ss.android.ugc.aweme.feed.ui.e;

public class VideoShareWidget extends AbsFeedWidget {
    public static ChangeQuickRedirect k;

    @NonNull
    public final e b(View view) {
        View view2 = view;
        if (!PatchProxy.isSupport(new Object[]{view2}, this, k, false, 41157, new Class[]{View.class}, e.class)) {
            return new VideoShareView(view2);
        }
        return (e) PatchProxy.accessDispatch(new Object[]{view2}, this, k, false, 41157, new Class[]{View.class}, e.class);
    }
}
