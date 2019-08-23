package com.ss.android.ugc.aweme.followrequest.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.followrequest.model.FollowRequestResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.j;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u0018\u0010\u0012\u001a\u00020\u00102\u000e\u0010\u0013\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\u0006\u0010\u0017\u001a\u00020\u0010J\b\u0010\u0018\u001a\u00020\u0010H\u0014R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/followrequest/presenter/FollowRequestPresenter;", "Lcom/ss/android/ugc/aweme/common/BasePresenter;", "Lcom/ss/android/ugc/aweme/profile/presenter/FollowRequestModel;", "Lcom/ss/android/ugc/aweme/followrequest/presenter/IFollowRequestView;", "()V", "hasMore", "", "getHasMore", "()Z", "mBound", "getMBound", "total", "", "getTotal", "()I", "getSummary", "", "loadMore", "onFailed", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "refresh", "showLoading", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c extends b<j, e> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48242a;

    private final boolean d() {
        if (this.f2978e == null || this.f2979f == null) {
            return false;
        }
        return true;
    }

    private boolean e() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f48242a, false, 45323, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f48242a, false, 45323, new Class[0], Boolean.TYPE)).booleanValue();
        }
        j jVar = (j) this.f2978e;
        if (jVar != null) {
            FollowRequestResponse followRequestResponse = (FollowRequestResponse) jVar.getData();
            if (followRequestResponse != null) {
                z = followRequestResponse.hasMore;
            }
        }
        return z;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f48242a, false, 45326, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48242a, false, 45326, new Class[0], Void.TYPE);
            return;
        }
        j jVar = (j) this.f2978e;
        if (jVar != null) {
            jVar.a();
        }
        n_();
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f48242a, false, 45328, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48242a, false, 45328, new Class[0], Void.TYPE);
        } else if (d()) {
            if (((j) this.f2978e).f61644d) {
                ((e) this.f2979f).a(true);
            } else {
                ((e) this.f2979f).a(false);
            }
        }
    }

    public final void b() {
        boolean z;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f48242a, false, 45329, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48242a, false, 45329, new Class[0], Void.TYPE);
        } else if (d()) {
            a aVar = this.f2978e;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "mModel");
            List<User> list = ((FollowRequestResponse) ((j) aVar).getData()).userRequestList;
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (((j) this.f2978e).f61644d) {
                e eVar = (e) this.f2979f;
                Intrinsics.checkExpressionValueIsNotNull(list, "list");
                if (e() && !z) {
                    z2 = true;
                }
                eVar.a(list, true, z2);
            } else if (z) {
                ((e) this.f2979f).c();
            } else if (((j) this.f2978e).f61645e) {
                Intrinsics.checkExpressionValueIsNotNull(list, "list");
                a aVar2 = this.f2978e;
                Intrinsics.checkExpressionValueIsNotNull(aVar2, "mModel");
                ((j) aVar2).getData();
            } else {
                Intrinsics.checkExpressionValueIsNotNull(list, "list");
                ((e) this.f2979f).a(list, false, e());
            }
        }
    }

    public final void a(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f48242a, false, 45330, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f48242a, false, 45330, new Class[]{Exception.class}, Void.TYPE);
        } else if (d()) {
            if (((j) this.f2978e).f61644d) {
                ((e) this.f2979f).a(exc, true);
            } else {
                ((e) this.f2979f).a(exc, false);
            }
        }
    }
}
