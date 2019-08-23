package com.ss.android.ugc.aweme.commerce.service.models;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/AwemeParams;", "", "awemeId", "", "triggerId", "originUserId", "originMediaId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAwemeId", "()Ljava/lang/String;", "setAwemeId", "(Ljava/lang/String;)V", "getOriginMediaId", "setOriginMediaId", "getOriginUserId", "setOriginUserId", "getTriggerId", "setTriggerId", "toString", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38193a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public String f38194b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public String f38195c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public String f38196d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public String f38197e;

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f38193a, false, 29778, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f38193a, false, 29778, new Class[0], String.class);
        }
        return "AwemeParams(awemeId='" + this.f38194b + "', triggerId='" + this.f38195c + "', originUserId=" + this.f38196d + ", originMediaId=" + this.f38197e + ')';
    }

    public b(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkParameterIsNotNull(str, "awemeId");
        Intrinsics.checkParameterIsNotNull(str2, "triggerId");
        this.f38194b = str;
        this.f38195c = str2;
        this.f38196d = str3;
        this.f38197e = str4;
    }
}
