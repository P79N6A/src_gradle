package com.ss.android.ugc.aweme.notification.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.bean.Notice;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/notification/bean/Notice;", "call"}, k = 3, mv = {1, 1, 15})
final class FansModel$appendCachedFans$1<V> implements Callable<Notice> {
    public static ChangeQuickRedirect changeQuickRedirect;
    final /* synthetic */ FansModel this$0;

    FansModel$appendCachedFans$1(FansModel fansModel) {
        this.this$0 = fansModel;
    }

    @NotNull
    public final Notice call() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63109, new Class[0], Notice.class)) {
            return (Notice) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63109, new Class[0], Notice.class);
        }
        try {
            Notice notice = new Notice();
            Notice notice2 = (Notice) this.this$0.mData;
            Intrinsics.checkExpressionValueIsNotNull(notice2, "mData");
            notice.status_code = notice2.status_code;
            notice.hasMore = ((Notice) this.this$0.mData).hasMore;
            notice.total = ((Notice) this.this$0.mData).total;
            notice.minTime = ((Notice) this.this$0.mData).minTime;
            notice.maxTime = ((Notice) this.this$0.mData).maxTime;
            notice.logPbBean = ((Notice) this.this$0.mData).logPbBean;
            List<BaseNotice> arrayList = new ArrayList<>();
            arrayList.addAll(this.this$0.mFansList);
            notice.items = arrayList;
            this.this$0.mFansList = new ArrayList();
            return notice;
        } catch (ExecutionException e2) {
            RuntimeException a2 = m.a(e2);
            Intrinsics.checkExpressionValueIsNotNull(a2, "RetrofitFactory.getCompatibleException(e)");
            throw a2;
        }
    }
}
