package com.ss.android.ugc.aweme.video.local;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.services.ILocalVideoCacheService;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/video/local/LocalVideoCacheServiceImpl;", "Lcom/ss/android/ugc/aweme/services/ILocalVideoCacheService;", "()V", "slimVideoCache", "", "slimSize", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d implements ILocalVideoCacheService {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76163a;

    public final boolean slimVideoCache(long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f76163a, false, 89140, new Class[]{Long.TYPE}, Boolean.TYPE)) {
            return LocalVideoPlayerManager.a().a(j2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f76163a, false, 89140, new Class[]{Long.TYPE}, Boolean.TYPE)).booleanValue();
    }
}
