package com.ss.android.ugc.aweme.notification.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.bean.Notice;
import com.ss.android.ugc.aweme.notification.model.FansModel;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016J\u0006\u0010\u0012\u001a\u00020\rJ\b\u0010\u0013\u001a\u00020\rH\u0014R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/notification/presenter/FansPresenter;", "Lcom/ss/android/ugc/aweme/common/BasePresenter;", "Lcom/ss/android/ugc/aweme/notification/model/FansModel;", "Lcom/ss/android/ugc/aweme/common/presenter/IBaseListView;", "Lcom/ss/android/ugc/aweme/notification/bean/BaseNotice;", "()V", "hasMore", "", "getHasMore", "()Z", "mBound", "getMBound", "loadMore", "", "onFailed", "e", "Ljava/lang/Exception;", "onSuccess", "refresh", "showLoading", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends b<FansModel, c<BaseNotice>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57960a;

    private final boolean d() {
        if (this.f2978e == null || this.f2979f == null) {
            return false;
        }
        return true;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f57960a, false, 63132, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57960a, false, 63132, new Class[0], Void.TYPE);
            return;
        }
        FansModel fansModel = (FansModel) this.f2978e;
        if (fansModel != null) {
            fansModel.loadMore();
        }
        n_();
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f57960a, false, 63133, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57960a, false, 63133, new Class[0], Void.TYPE);
        } else if (d()) {
            if (((FansModel) this.f2978e).isLoadMore) {
                ((c) this.f2979f).s_();
            } else {
                ((c) this.f2979f).n_();
            }
        }
    }

    public final void b() {
        boolean z;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f57960a, false, 63134, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57960a, false, 63134, new Class[0], Void.TYPE);
        } else if (d()) {
            if (((FansModel) this.f2978e).isLoadMore) {
                c cVar = (c) this.f2979f;
                com.ss.android.ugc.aweme.common.a aVar = this.f2978e;
                Intrinsics.checkExpressionValueIsNotNull(aVar, "mModel");
                List<BaseNotice> list = ((Notice) ((FansModel) aVar).getData()).items;
                com.ss.android.ugc.aweme.common.a aVar2 = this.f2978e;
                Intrinsics.checkExpressionValueIsNotNull(aVar2, "mModel");
                Notice notice = (Notice) ((FansModel) aVar2).getData();
                Intrinsics.checkExpressionValueIsNotNull(notice, "mModel.data");
                if (notice.hasMore) {
                    com.ss.android.ugc.aweme.common.a aVar3 = this.f2978e;
                    Intrinsics.checkExpressionValueIsNotNull(aVar3, "mModel");
                    Collection collection = ((Notice) ((FansModel) aVar3).getData()).items;
                    if (collection == null || collection.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        z2 = true;
                    }
                }
                cVar.b(list, z2);
                return;
            }
            com.ss.android.ugc.aweme.common.a aVar4 = this.f2978e;
            Intrinsics.checkExpressionValueIsNotNull(aVar4, "mModel");
            Collection collection2 = ((Notice) ((FansModel) aVar4).getData()).items;
            if (collection2 == null || collection2.isEmpty()) {
                z2 = true;
            }
            if (z2) {
                ((c) this.f2979f).y_();
                return;
            }
            com.ss.android.ugc.aweme.common.a aVar5 = this.f2978e;
            Intrinsics.checkExpressionValueIsNotNull(aVar5, "mModel");
            List<BaseNotice> list2 = ((Notice) ((FansModel) aVar5).getData()).items;
            com.ss.android.ugc.aweme.common.a aVar6 = this.f2978e;
            Intrinsics.checkExpressionValueIsNotNull(aVar6, "mModel");
            ((c) this.f2979f).a(list2, ((Notice) ((FansModel) aVar6).getData()).hasMore);
        }
    }

    public final void a(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f57960a, false, 63135, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f57960a, false, 63135, new Class[]{Exception.class}, Void.TYPE);
        } else if (d()) {
            if (((FansModel) this.f2978e).isLoadMore) {
                ((c) this.f2979f).c(exc);
            } else {
                ((c) this.f2979f).b(exc);
            }
        }
    }
}
