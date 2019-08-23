package com.ss.android.ugc.aweme.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.h.g;
import com.ss.android.ugc.aweme.feed.h.m;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/FeedRefreshCacheManager;", "", "mPresenter", "Lcom/ss/android/ugc/aweme/feed/presenter/FeedFetchPresenter;", "(Lcom/ss/android/ugc/aweme/feed/presenter/FeedFetchPresenter;)V", "scrolledPostion", "", "getScrolledPostion", "()I", "setScrolledPostion", "(I)V", "needRefreshFromCache", "", "recordScrolledPosition", "", "postion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ad {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44639a;

    /* renamed from: b  reason: collision with root package name */
    public int f44640b;

    /* renamed from: c  reason: collision with root package name */
    private m f44641c;

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f44639a, false, 40144, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f44639a, false, 40144, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestManager a2 = AbTestManager.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
        if (a2.bV()) {
            int i = this.f44640b;
            g gVar = (g) this.f44641c.i();
            Intrinsics.checkExpressionValueIsNotNull(gVar, "mPresenter.model");
            if (i < gVar.getItems().size() - 1) {
                return true;
            }
        }
        return false;
    }

    public ad(@NotNull m mVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "mPresenter");
        this.f44641c = mVar;
        ((g) this.f44641c.i()).g = this;
    }
}
