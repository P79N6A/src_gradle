package com.ss.android.ugc.aweme.account.login;

import android.content.Context;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B?\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eBI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0010HÆ\u0003JY\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0005HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00060"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/ErrorInfo;", "", "context", "Landroid/content/Context;", "errorCode", "", "json", "Lorg/json/JSONObject;", "loginMethod", "Lcom/ss/android/ugc/aweme/account/login/model/BaseLoginMethod;", "loginFinishCallback", "Lcom/ss/android/ugc/aweme/account/login/ILoginFinish;", "loginBundle", "Landroid/os/Bundle;", "(Landroid/content/Context;ILorg/json/JSONObject;Lcom/ss/android/ugc/aweme/account/login/model/BaseLoginMethod;Lcom/ss/android/ugc/aweme/account/login/ILoginFinish;Landroid/os/Bundle;)V", "onActionCompleted", "Ljava/lang/Runnable;", "(Landroid/content/Context;ILorg/json/JSONObject;Lcom/ss/android/ugc/aweme/account/login/model/BaseLoginMethod;Lcom/ss/android/ugc/aweme/account/login/ILoginFinish;Landroid/os/Bundle;Ljava/lang/Runnable;)V", "getContext", "()Landroid/content/Context;", "getErrorCode", "()I", "getJson", "()Lorg/json/JSONObject;", "getLoginBundle", "()Landroid/os/Bundle;", "getLoginFinishCallback", "()Lcom/ss/android/ugc/aweme/account/login/ILoginFinish;", "getLoginMethod", "()Lcom/ss/android/ugc/aweme/account/login/model/BaseLoginMethod;", "setLoginMethod", "(Lcom/ss/android/ugc/aweme/account/login/model/BaseLoginMethod;)V", "getOnActionCompleted", "()Ljava/lang/Runnable;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32035a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final Context f32036b;

    /* renamed from: c  reason: collision with root package name */
    public final int f32037c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final JSONObject f32038d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public BaseLoginMethod f32039e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final b f32040f;
    @NotNull
    public final Bundle g;
    @Nullable
    public final Runnable h;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f32035a, false, 20073, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f32035a, false, 20073, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (Intrinsics.areEqual((Object) this.f32036b, (Object) aVar.f32036b)) {
                    if (!(this.f32037c == aVar.f32037c) || !Intrinsics.areEqual((Object) this.f32038d, (Object) aVar.f32038d) || !Intrinsics.areEqual((Object) this.f32039e, (Object) aVar.f32039e) || !Intrinsics.areEqual((Object) this.f32040f, (Object) aVar.f32040f) || !Intrinsics.areEqual((Object) this.g, (Object) aVar.g) || !Intrinsics.areEqual((Object) this.h, (Object) aVar.h)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f32035a, false, 20072, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f32035a, false, 20072, new Class[0], Integer.TYPE)).intValue();
        }
        Context context = this.f32036b;
        int hashCode = (((context != null ? context.hashCode() : 0) * 31) + this.f32037c) * 31;
        JSONObject jSONObject = this.f32038d;
        int hashCode2 = (hashCode + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31;
        BaseLoginMethod baseLoginMethod = this.f32039e;
        int hashCode3 = (hashCode2 + (baseLoginMethod != null ? baseLoginMethod.hashCode() : 0)) * 31;
        b bVar = this.f32040f;
        int hashCode4 = (hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        Bundle bundle = this.g;
        int hashCode5 = (hashCode4 + (bundle != null ? bundle.hashCode() : 0)) * 31;
        Runnable runnable = this.h;
        if (runnable != null) {
            i = runnable.hashCode();
        }
        return hashCode5 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f32035a, false, 20071, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f32035a, false, 20071, new Class[0], String.class);
        }
        return "ErrorInfo(context=" + this.f32036b + ", errorCode=" + this.f32037c + ", json=" + this.f32038d + ", loginMethod=" + this.f32039e + ", loginFinishCallback=" + this.f32040f + ", loginBundle=" + this.g + ", onActionCompleted=" + this.h + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(@Nullable Context context, int i, @Nullable JSONObject jSONObject, @Nullable BaseLoginMethod baseLoginMethod, @Nullable b bVar, @NotNull Bundle bundle) {
        this(context, i, jSONObject, baseLoginMethod, bVar, bundle, null);
        Intrinsics.checkParameterIsNotNull(bundle, "loginBundle");
    }

    public a(@Nullable Context context, int i, @Nullable JSONObject jSONObject, @Nullable BaseLoginMethod baseLoginMethod, @Nullable b bVar, @NotNull Bundle bundle, @Nullable Runnable runnable) {
        Intrinsics.checkParameterIsNotNull(bundle, "loginBundle");
        this.f32036b = context;
        this.f32037c = i;
        this.f32038d = jSONObject;
        this.f32039e = baseLoginMethod;
        this.f32040f = bVar;
        this.g = bundle;
        this.h = runnable;
    }
}
