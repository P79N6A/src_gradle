package com.ss.android.ugc.aweme.hotsearch.share;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/hotsearch/share/HitRankShareStruct;", "", "userId", "", "nickName", "avatarUrl", "influenceValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatarUrl", "()Ljava/lang/String;", "setAvatarUrl", "(Ljava/lang/String;)V", "getInfluenceValue", "setInfluenceValue", "getNickName", "setNickName", "getUserId", "setUserId", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public String f49814a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public String f49815b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public String f49816c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public String f49817d;

    public b(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(str2, "nickName");
        Intrinsics.checkParameterIsNotNull(str3, "avatarUrl");
        Intrinsics.checkParameterIsNotNull(str4, "influenceValue");
        this.f49814a = str;
        this.f49815b = str2;
        this.f49816c = str3;
        this.f49817d = str4;
    }
}
