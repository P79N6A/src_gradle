package com.ss.android.ugc.aweme.requestcombine.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.setting.model.ShareSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/requestcombine/model/ShareSettingCombineModel;", "Lcom/ss/android/ugc/aweme/requestcombine/model/BaseCombineMode;", "shareSetting", "Lcom/ss/android/ugc/aweme/setting/model/ShareSettings;", "(Lcom/ss/android/ugc/aweme/setting/model/ShareSettings;)V", "getShareSetting", "()Lcom/ss/android/ugc/aweme/setting/model/ShareSettings;", "setShareSetting", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ShareSettingCombineModel extends BaseCombineMode {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("body")
    @NotNull
    private ShareSettings shareSetting;

    public static /* synthetic */ ShareSettingCombineModel copy$default(ShareSettingCombineModel shareSettingCombineModel, ShareSettings shareSettings, int i, Object obj) {
        if ((i & 1) != 0) {
            shareSettings = shareSettingCombineModel.shareSetting;
        }
        return shareSettingCombineModel.copy(shareSettings);
    }

    @NotNull
    public final ShareSettings component1() {
        return this.shareSetting;
    }

    @NotNull
    public final ShareSettingCombineModel copy(@NotNull ShareSettings shareSettings) {
        ShareSettings shareSettings2 = shareSettings;
        if (PatchProxy.isSupport(new Object[]{shareSettings2}, this, changeQuickRedirect, false, 70769, new Class[]{ShareSettings.class}, ShareSettingCombineModel.class)) {
            return (ShareSettingCombineModel) PatchProxy.accessDispatch(new Object[]{shareSettings2}, this, changeQuickRedirect, false, 70769, new Class[]{ShareSettings.class}, ShareSettingCombineModel.class);
        }
        Intrinsics.checkParameterIsNotNull(shareSettings2, "shareSetting");
        return new ShareSettingCombineModel(shareSettings2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 70772, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof ShareSettingCombineModel) && Intrinsics.areEqual((Object) this.shareSetting, (Object) ((ShareSettingCombineModel) obj).shareSetting));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 70772, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70771, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70771, new Class[0], Integer.TYPE)).intValue();
        }
        ShareSettings shareSettings = this.shareSetting;
        if (shareSettings != null) {
            i = shareSettings.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70770, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70770, new Class[0], String.class);
        }
        return "ShareSettingCombineModel(shareSetting=" + this.shareSetting + ")";
    }

    @NotNull
    public final ShareSettings getShareSetting() {
        return this.shareSetting;
    }

    public ShareSettingCombineModel(@NotNull ShareSettings shareSettings) {
        Intrinsics.checkParameterIsNotNull(shareSettings, "shareSetting");
        this.shareSetting = shareSettings;
    }

    public final void setShareSetting(@NotNull ShareSettings shareSettings) {
        ShareSettings shareSettings2 = shareSettings;
        if (PatchProxy.isSupport(new Object[]{shareSettings2}, this, changeQuickRedirect, false, 70768, new Class[]{ShareSettings.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareSettings2}, this, changeQuickRedirect, false, 70768, new Class[]{ShareSettings.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(shareSettings2, "<set-?>");
        this.shareSetting = shareSettings2;
    }
}
