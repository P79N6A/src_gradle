package com.ss.android.ugc.aweme.commerce.service.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/LogParams;", "", "commodityType", "", "promotionId", "", "isSelf", "", "(JLjava/lang/String;Z)V", "getCommodityType", "()J", "setCommodityType", "(J)V", "()Z", "setSelf", "(Z)V", "getPromotionId", "()Ljava/lang/String;", "setPromotionId", "(Ljava/lang/String;)V", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public long f38206a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public String f38207b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f38208c;

    public k(long j, @NotNull String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "promotionId");
        this.f38206a = j;
        this.f38207b = str;
        this.f38208c = z;
    }
}
