package com.ss.android.ugc.aweme.discover.api.a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0006B\u0011\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0007B\u0013\b\u0016\u0012\n\u0010\b\u001a\u00060\tj\u0002`\n¢\u0006\u0002\u0010\u000bR\u001e\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0007R\"\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/api/common/ResultModel;", "T", "", "isSuccess", "", "data", "(ZLjava/lang/Object;)V", "(Ljava/lang/Object;)V", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getData", "()Ljava/lang/Object;", "setData", "Ljava/lang/Object;", "getE", "()Ljava/lang/Exception;", "setE", "()Z", "setSuccess", "(Z)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f42102a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public T f42103b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public Exception f42104c;

    public a(@NotNull Exception exc) {
        Intrinsics.checkParameterIsNotNull(exc, "e");
        this.f42104c = exc;
        this.f42102a = false;
    }

    public a(@Nullable T t) {
        this.f42102a = true;
        this.f42103b = t;
    }

    public a(boolean z, @Nullable T t) {
        this.f42102a = z;
        this.f42103b = t;
    }
}
