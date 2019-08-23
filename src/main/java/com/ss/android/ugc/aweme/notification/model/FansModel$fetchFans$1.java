package com.ss.android.ugc.aweme.notification.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.notification.api.NoticeApiManager;
import com.ss.android.ugc.aweme.notification.bean.Notice;
import com.ss.android.ugc.aweme.utils.permission.e;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/notification/bean/Notice;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 15})
final class FansModel$fetchFans$1<V> implements Callable<Notice> {
    public static ChangeQuickRedirect changeQuickRedirect;
    final /* synthetic */ long $maxTime;
    final /* synthetic */ long $minTime;

    FansModel$fetchFans$1(long j, long j2) {
        this.$maxTime = j;
        this.$minTime = j2;
    }

    public final Notice call() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63110, new Class[0], Notice.class)) {
            return (Notice) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63110, new Class[0], Notice.class);
        }
        try {
            return NoticeApiManager.a(this.$maxTime, this.$minTime, 20, 7, null, 1, e.a(), e.b());
        } catch (ExecutionException e2) {
            RuntimeException a2 = m.a(e2);
            Intrinsics.checkExpressionValueIsNotNull(a2, "RetrofitFactory.getCompatibleException(e)");
            throw a2;
        }
    }
}
