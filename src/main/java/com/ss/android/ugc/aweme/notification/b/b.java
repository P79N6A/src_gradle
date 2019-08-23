package com.ss.android.ugc.aweme.notification.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.notification.model.FansRecommendModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\nJ\u0018\u0010\u000e\u001a\u00020\n2\u000e\u0010\u000f\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011H\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0006\u0010\u0013\u001a\u00020\nJ\u0014\u0010\u0014\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0016J\b\u0010\u0017\u001a\u00020\nH\u0014R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/notification/presenter/FansRecommendPresenter;", "Lcom/ss/android/ugc/aweme/common/BasePresenter;", "Lcom/ss/android/ugc/aweme/notification/model/FansRecommendModel;", "Lcom/ss/android/ugc/aweme/notification/view/IFansRecommendView;", "()V", "mBound", "", "getMBound", "()Z", "blockRecommend", "", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "loadMore", "onFailed", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "refresh", "setCached", "cachedList", "", "showLoading", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends com.ss.android.ugc.aweme.common.b<FansRecommendModel, com.ss.android.ugc.aweme.notification.view.b> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57961a;

    private final boolean d() {
        if (this.f2978e == null || this.f2979f == null) {
            return false;
        }
        return true;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f57961a, false, 63138, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57961a, false, 63138, new Class[0], Void.TYPE);
            return;
        }
        FansRecommendModel fansRecommendModel = (FansRecommendModel) this.f2978e;
        if (fansRecommendModel != null) {
            fansRecommendModel.loadMoreRecommendList();
        }
        n_();
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f57961a, false, 63139, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57961a, false, 63139, new Class[0], Void.TYPE);
            return;
        }
        if (d() && ((FansRecommendModel) this.f2978e).isLoadMore) {
            ((com.ss.android.ugc.aweme.notification.view.b) this.f2979f).i();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f57961a, false, 63141, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57961a, false, 63141, new Class[0], Void.TYPE);
        } else if (d()) {
            if (((FansRecommendModel) this.f2978e).isLoadMore) {
                a aVar = this.f2978e;
                Intrinsics.checkExpressionValueIsNotNull(aVar, "mModel");
                ((com.ss.android.ugc.aweme.notification.view.b) this.f2979f).b((RecommendList) ((FansRecommendModel) aVar).getData());
                return;
            }
            a aVar2 = this.f2978e;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "mModel");
            ((com.ss.android.ugc.aweme.notification.view.b) this.f2979f).a((RecommendList) ((FansRecommendModel) aVar2).getData());
        }
    }

    public final void a(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f57961a, false, 63140, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f57961a, false, 63140, new Class[]{Exception.class}, Void.TYPE);
        } else if (d()) {
            if (((FansRecommendModel) this.f2978e).isLoadMore) {
                ((com.ss.android.ugc.aweme.notification.view.b) this.f2979f).e(exc);
            } else {
                ((com.ss.android.ugc.aweme.notification.view.b) this.f2979f).a(exc);
            }
        }
    }

    public final void a(@NotNull List<? extends User> list) {
        List<? extends User> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f57961a, false, 63142, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f57961a, false, 63142, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "cachedList");
        FansRecommendModel fansRecommendModel = (FansRecommendModel) this.f2978e;
        if (fansRecommendModel != null) {
            fansRecommendModel.setCachedList(list2);
        }
    }
}
