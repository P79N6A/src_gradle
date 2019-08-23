package com.ss.android.ugc.aweme.notification.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.newfollow.util.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
final class FansRecommendModel$mReportId$2 extends Lambda implements Function0<String> {
    public static final FansRecommendModel$mReportId$2 INSTANCE = new FansRecommendModel$mReportId$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    FansRecommendModel$mReportId$2() {
        super(0);
    }

    public final String invoke() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63123, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63123, new Class[0], String.class);
        }
        k a2 = k.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "RecUserImpressionReporter.getInstance()");
        return a2.b();
    }
}
