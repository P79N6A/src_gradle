package com.ss.android.ugc.aweme.commerce.billshare;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J%\u0010\b\u001a\u00020\t2\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\f0\u000b\"\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/billshare/BillShareListPresenter;", "Lcom/ss/android/ugc/aweme/common/presenter/BaseListPresenter;", "Lcom/ss/android/ugc/aweme/commerce/billshare/BillShareFeedModel;", "()V", "getTopAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getTotal", "", "sendRequest", "", "params", "", "", "([Ljava/lang/Object;)Z", "setNeedTopItem", "", "needShowTopItem", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c extends b<b> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36753a;

    public final int c() {
        if (this.f2978e == null) {
            return 0;
        }
        return ((b) this.f2978e).f36749b;
    }

    @Nullable
    public final Aweme d() {
        if (this.f2978e == null) {
            return null;
        }
        return ((b) this.f2978e).f36750c;
    }

    public final boolean a(@NotNull Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f36753a, false, 27996, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f36753a, false, 27996, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(objArr, "params");
        if (this.f2978e == null || !((b) this.f2978e).a(Arrays.copyOf(objArr, objArr.length))) {
            return false;
        }
        n_();
        return true;
    }
}
