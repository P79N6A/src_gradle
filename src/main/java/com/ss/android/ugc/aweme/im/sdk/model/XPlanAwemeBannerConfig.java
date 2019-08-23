package com.ss.android.ugc.aweme.im.sdk.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR&\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/model/XPlanAwemeBannerConfig;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "()V", "backgroundIcon", "Lcom/ss/android/ugc/aweme/im/service/model/IMXPlanUrlModel;", "getBackgroundIcon", "()Lcom/ss/android/ugc/aweme/im/service/model/IMXPlanUrlModel;", "setBackgroundIcon", "(Lcom/ss/android/ugc/aweme/im/service/model/IMXPlanUrlModel;)V", "bodyText", "", "getBodyText", "()Ljava/lang/String;", "setBodyText", "(Ljava/lang/String;)V", "logoIcon", "getLogoIcon", "setLogoIcon", "openSchema", "getOpenSchema", "setOpenSchema", "subHeadList", "", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getSubHeadList", "()Ljava/util/List;", "setSubHeadList", "(Ljava/util/List;)V", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class XPlanAwemeBannerConfig extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("background_icon")
    @Nullable
    private f backgroundIcon;
    @SerializedName("body_text")
    @NotNull
    private String bodyText = "";
    @SerializedName("logo_icon")
    @Nullable
    private f logoIcon;
    @SerializedName("open_schema")
    @NotNull
    private String openSchema = "";
    @SerializedName("sub_head_list")
    @Nullable
    private List<? extends UrlModel> subHeadList;

    @Nullable
    public final f getBackgroundIcon() {
        return this.backgroundIcon;
    }

    @NotNull
    public final String getBodyText() {
        return this.bodyText;
    }

    @Nullable
    public final f getLogoIcon() {
        return this.logoIcon;
    }

    @NotNull
    public final String getOpenSchema() {
        return this.openSchema;
    }

    @Nullable
    public final List<UrlModel> getSubHeadList() {
        return this.subHeadList;
    }

    public final void setBackgroundIcon(@Nullable f fVar) {
        this.backgroundIcon = fVar;
    }

    public final void setLogoIcon(@Nullable f fVar) {
        this.logoIcon = fVar;
    }

    public final void setSubHeadList(@Nullable List<? extends UrlModel> list) {
        this.subHeadList = list;
    }

    public final void setBodyText(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 52364, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 52364, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.bodyText = str2;
    }

    public final void setOpenSchema(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 52365, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 52365, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.openSchema = str2;
    }
}
