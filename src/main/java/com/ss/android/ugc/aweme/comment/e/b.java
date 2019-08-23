package com.ss.android.ugc.aweme.comment.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0017\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0002\u0010\u000bJ%\u0010\f\u001a\u00020\r2\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00100\u000f\"\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0002\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/comment/presenter/BaseCommentModel;", "T", "Lcom/ss/android/ugc/aweme/common/BaseModel;", "()V", "statistics", "Lcom/ss/android/ugc/aweme/comment/statistics/CommentSupportStatistics;", "getStatistics", "()Lcom/ss/android/ugc/aweme/comment/statistics/CommentSupportStatistics;", "handleData", "", "data", "(Ljava/lang/Object;)V", "sendRequest", "", "params", "", "", "([Ljava/lang/Object;)Z", "uploadStatistics", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class b<T> extends a<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36395a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.comment.f.b f36396b = new com.ss.android.ugc.aweme.comment.f.b();

    public void handleData(@Nullable T t) {
        T t2 = t;
        if (PatchProxy.isSupport(new Object[]{t2}, this, f36395a, false, 27323, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t2}, this, f36395a, false, 27323, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        super.handleData(t);
        if (t2 instanceof BaseResponse) {
            this.f36396b.a((BaseResponse) t2);
        }
    }

    public boolean sendRequest(@NotNull Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f36395a, false, 27322, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f36395a, false, 27322, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(objArr, "params");
        this.f36396b.a();
        if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
            return false;
        }
        return true;
    }
}
