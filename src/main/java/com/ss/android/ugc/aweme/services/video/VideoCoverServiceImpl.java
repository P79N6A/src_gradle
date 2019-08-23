package com.ss.android.ugc.aweme.services.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.services.videoprocess.OnGetVideoCoverCallback;
import com.ss.android.ugc.aweme.shortvideo.presenter.g;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/services/video/VideoCoverServiceImpl;", "Lcom/ss/android/ugc/aweme/services/video/IVideoCoverService;", "()V", "getVideoCoverByCallback", "", "filePath", "", "millisecond", "", "onGetVideoCoverCallback", "Lcom/ss/android/ugc/aweme/services/videoprocess/OnGetVideoCoverCallback;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VideoCoverServiceImpl implements IVideoCoverService {
    public static ChangeQuickRedirect changeQuickRedirect;

    public final void getVideoCoverByCallback(@Nullable String str, int i, @Nullable OnGetVideoCoverCallback onGetVideoCoverCallback) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), onGetVideoCoverCallback}, this, changeQuickRedirect, false, 71624, new Class[]{String.class, Integer.TYPE, OnGetVideoCoverCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), onGetVideoCoverCallback}, this, changeQuickRedirect, false, 71624, new Class[]{String.class, Integer.TYPE, OnGetVideoCoverCallback.class}, Void.TYPE);
            return;
        }
        g.a(str, i, onGetVideoCoverCallback);
    }
}
