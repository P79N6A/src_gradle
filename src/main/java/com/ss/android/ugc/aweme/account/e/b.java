package com.ss.android.ugc.aweme.account.e;

import com.ss.android.account.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/account/event/FindAccountBackEvent;", "", "platform", "", "success", "", "userData", "Lorg/json/JSONObject;", "(Ljava/lang/String;ZLorg/json/JSONObject;)V", "getPlatform", "()Ljava/lang/String;", "setPlatform", "(Ljava/lang/String;)V", "getSuccess", "()Z", "setSuccess", "(Z)V", "getUserData", "()Lorg/json/JSONObject;", "setUserData", "(Lorg/json/JSONObject;)V", "userInfo", "Lcom/bytedance/sdk/account/user/IBDAccountUserEntity;", "getUserInfo", "()Lcom/bytedance/sdk/account/user/IBDAccountUserEntity;", "setUserInfo", "(Lcom/bytedance/sdk/account/user/IBDAccountUserEntity;)V", "accountcommon_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class b {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.sdk.account.k.b f31841a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public String f31842b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f31843c = true;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public JSONObject f31844d;

    public b(@NotNull String str, boolean z, @NotNull JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, "platform");
        Intrinsics.checkParameterIsNotNull(jSONObject, "userData");
        this.f31842b = str;
        this.f31844d = jSONObject;
        new b.a();
        this.f31841a = b.a.b(this.f31844d);
    }
}
