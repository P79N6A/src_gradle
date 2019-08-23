package com.ss.android.ugc.aweme.commerce.preview;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.b;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0007\"\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/PreviewListPresenter;", "Lcom/ss/android/ugc/aweme/common/presenter/BaseListPresenter;", "Lcom/ss/android/ugc/aweme/commerce/preview/PreviewFeedModel;", "()V", "sendRequest", "", "params", "", "", "([Ljava/lang/Object;)Z", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class j extends b<i> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37509a;

    public final boolean a(@NotNull Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f37509a, false, 28787, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f37509a, false, 28787, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(objArr, "params");
        if (this.f2978e == null || !((i) this.f2978e).a(Arrays.copyOf(objArr, objArr.length))) {
            return false;
        }
        n_();
        return true;
    }
}
