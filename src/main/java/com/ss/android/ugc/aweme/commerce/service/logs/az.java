package com.ss.android.ugc.aweme.commerce.service.logs;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0004H\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0006\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\nR \u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\nR \u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\nR \u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\nR \u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/UserBehavior;", "", "()V", "appId", "", "getAppId", "()Ljava/lang/String;", "behavior", "getBehavior", "setBehavior", "(Ljava/lang/String;)V", "carrierType", "getCarrierType", "setCarrierType", "mediaId", "getMediaId", "setMediaId", "promotionId", "getPromotionId", "setPromotionId", "userId", "getUserId", "setUserId", "visitorId", "getVisitorId", "setVisitorId", "post", "", "toJsonString", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class az {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38103a;
    @SerializedName("app_id")
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final String f38104b = "1128";
    @SerializedName("user_id")
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public String f38105c;
    @SerializedName("visitor_id")
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public String f38106d;
    @SerializedName("media_id")
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public String f38107e;
    @SerializedName("promotion_id")
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public String f38108f;
    @SerializedName("carrier_type")
    @Nullable
    public String g;
    @SerializedName("behavior")
    @NotNull
    public String h = "click";

    private final String b() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f38103a, false, 29772, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f38103a, false, 29772, new Class[0], String.class);
        }
        try {
            str = new Gson().toJson((Object) this);
            Intrinsics.checkExpressionValueIsNotNull(str, "Gson().toJson(this)");
        } catch (Exception unused) {
            str = "";
        }
        return str;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f38103a, false, 29773, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38103a, false, 29773, new Class[0], Void.TYPE);
            return;
        }
        ((RealApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(RealApi.class)).post(b());
    }
}
