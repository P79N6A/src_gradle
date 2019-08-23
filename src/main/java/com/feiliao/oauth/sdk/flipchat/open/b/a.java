package com.feiliao.oauth.sdk.flipchat.open.b;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J(\u0010\u000b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rH\u0016J\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/rx/DispatchCallback;", "T", "Lcom/bytedance/retrofit2/Callback;", "()V", "onError", "", "t", "", "onFailure", "call", "Lcom/bytedance/retrofit2/Call;", "onResponse", "response", "Lcom/bytedance/retrofit2/SsResponse;", "onSuccess", "(Ljava/lang/Object;)V", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
public abstract class a<T> implements c<T> {
    public abstract void a(T t);

    public abstract void a(@NotNull Throwable th);

    public final void a(@Nullable Call<T> call, @NotNull Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "t");
        a(th);
    }

    public final void a(@Nullable Call<T> call, @Nullable SsResponse<T> ssResponse) {
        Object obj;
        if (ssResponse != null) {
            try {
                obj = ssResponse.body();
            } catch (Exception e2) {
                a((Throwable) e2);
                return;
            }
        } else {
            obj = null;
        }
        if (obj != null) {
            a((T) obj);
        } else {
            a(new Throwable());
        }
    }
}
