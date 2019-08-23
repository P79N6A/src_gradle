package com.ss.android.ugc.aweme.feed.feedwidget;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.ui.bv;
import com.ss.android.ugc.aweme.feed.ui.e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/feedwidget/VideoPlayCountWidget;", "Lcom/ss/android/ugc/aweme/feed/feedwidget/AbsFeedWidget;", "()V", "getBaseVideoItemView", "Lcom/ss/android/ugc/aweme/feed/ui/BaseVideoItemView;", "view", "Landroid/view/View;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VideoPlayCountWidget extends AbsFeedWidget {
    public static ChangeQuickRedirect k;

    @NotNull
    public final e b(@Nullable View view) {
        View view2 = view;
        if (!PatchProxy.isSupport(new Object[]{view2}, this, k, false, 41152, new Class[]{View.class}, e.class)) {
            return new bv(view2);
        }
        return (e) PatchProxy.accessDispatch(new Object[]{view2}, this, k, false, 41152, new Class[]{View.class}, e.class);
    }
}
