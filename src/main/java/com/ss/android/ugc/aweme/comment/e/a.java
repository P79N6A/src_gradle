package com.ss.android.ugc.aweme.comment.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.f.b;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0017\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0002\u0010\fJ%\u0010\r\u001a\u00020\u000e2\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0010\"\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0002\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00018\u0001H&¢\u0006\u0002\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/comment/presenter/BaseCommentListModel;", "Item", "Response", "Lcom/ss/android/ugc/aweme/common/presenter/BaseListModel;", "()V", "statistics", "Lcom/ss/android/ugc/aweme/comment/statistics/CommentSupportStatistics;", "getStatistics", "()Lcom/ss/android/ugc/aweme/comment/statistics/CommentSupportStatistics;", "handleData", "", "data", "(Ljava/lang/Object;)V", "sendRequest", "", "params", "", "", "([Ljava/lang/Object;)Z", "uploadStatistics", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class a<Item, Response> extends com.ss.android.ugc.aweme.common.f.a<Item, Response> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36393a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final b f36394b = new b();

    public abstract void a(@Nullable Response response);

    public void handleData(@Nullable Response response) {
        Response response2 = response;
        if (PatchProxy.isSupport(new Object[]{response2}, this, f36393a, false, 27321, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{response2}, this, f36393a, false, 27321, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        super.handleData(response);
        if (response2 instanceof BaseResponse) {
            this.f36394b.a((BaseResponse) response2);
        }
        a(response);
    }

    public boolean sendRequest(@NotNull Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f36393a, false, 27320, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f36393a, false, 27320, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(objArr, "params");
        this.f36394b.a();
        if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
            return false;
        }
        return true;
    }
}
