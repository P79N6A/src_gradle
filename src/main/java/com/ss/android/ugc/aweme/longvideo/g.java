package com.ss.android.ugc.aweme.longvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LongVideo;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/LongVideoProvider;", "", "()V", "getLongVideo", "Lcom/ss/android/ugc/aweme/feed/model/LongVideo;", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53946a;

    /* renamed from: b  reason: collision with root package name */
    public static final g f53947b = new g();

    private g() {
    }

    @Nullable
    public final LongVideo a(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f53946a, false, 56655, new Class[]{Aweme.class}, LongVideo.class)) {
            return (LongVideo) PatchProxy.accessDispatch(new Object[]{aweme}, this, f53946a, false, 56655, new Class[]{Aweme.class}, LongVideo.class);
        } else if (aweme == null || aweme.getLongVideos() == null || aweme.getLongVideos().size() <= 0) {
            return null;
        } else {
            return aweme.getLongVideos().get(0);
        }
    }
}
