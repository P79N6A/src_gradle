package com.ss.android.ugc.aweme.requestcombine.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.video.bitrate.bean.RateSettingsResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/requestcombine/model/RateSettingCombineModel;", "Lcom/ss/android/ugc/aweme/requestcombine/model/BaseCombineMode;", "rateSetting", "Lcom/ss/android/ugc/aweme/video/bitrate/bean/RateSettingsResponse;", "(Lcom/ss/android/ugc/aweme/video/bitrate/bean/RateSettingsResponse;)V", "getRateSetting", "()Lcom/ss/android/ugc/aweme/video/bitrate/bean/RateSettingsResponse;", "setRateSetting", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RateSettingCombineModel extends BaseCombineMode {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("body")
    @NotNull
    private RateSettingsResponse rateSetting;

    public static /* synthetic */ RateSettingCombineModel copy$default(RateSettingCombineModel rateSettingCombineModel, RateSettingsResponse rateSettingsResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            rateSettingsResponse = rateSettingCombineModel.rateSetting;
        }
        return rateSettingCombineModel.copy(rateSettingsResponse);
    }

    @NotNull
    public final RateSettingsResponse component1() {
        return this.rateSetting;
    }

    @NotNull
    public final RateSettingCombineModel copy(@NotNull RateSettingsResponse rateSettingsResponse) {
        RateSettingsResponse rateSettingsResponse2 = rateSettingsResponse;
        if (PatchProxy.isSupport(new Object[]{rateSettingsResponse2}, this, changeQuickRedirect, false, 70746, new Class[]{RateSettingsResponse.class}, RateSettingCombineModel.class)) {
            return (RateSettingCombineModel) PatchProxy.accessDispatch(new Object[]{rateSettingsResponse2}, this, changeQuickRedirect, false, 70746, new Class[]{RateSettingsResponse.class}, RateSettingCombineModel.class);
        }
        Intrinsics.checkParameterIsNotNull(rateSettingsResponse2, "rateSetting");
        return new RateSettingCombineModel(rateSettingsResponse2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 70749, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof RateSettingCombineModel) && Intrinsics.areEqual((Object) this.rateSetting, (Object) ((RateSettingCombineModel) obj).rateSetting));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 70749, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70748, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70748, new Class[0], Integer.TYPE)).intValue();
        }
        RateSettingsResponse rateSettingsResponse = this.rateSetting;
        if (rateSettingsResponse != null) {
            i = rateSettingsResponse.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70747, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70747, new Class[0], String.class);
        }
        return "RateSettingCombineModel(rateSetting=" + this.rateSetting + ")";
    }

    @NotNull
    public final RateSettingsResponse getRateSetting() {
        return this.rateSetting;
    }

    public RateSettingCombineModel(@NotNull RateSettingsResponse rateSettingsResponse) {
        Intrinsics.checkParameterIsNotNull(rateSettingsResponse, "rateSetting");
        this.rateSetting = rateSettingsResponse;
    }

    public final void setRateSetting(@NotNull RateSettingsResponse rateSettingsResponse) {
        RateSettingsResponse rateSettingsResponse2 = rateSettingsResponse;
        if (PatchProxy.isSupport(new Object[]{rateSettingsResponse2}, this, changeQuickRedirect, false, 70745, new Class[]{RateSettingsResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rateSettingsResponse2}, this, changeQuickRedirect, false, 70745, new Class[]{RateSettingsResponse.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(rateSettingsResponse2, "<set-?>");
        this.rateSetting = rateSettingsResponse2;
    }
}
