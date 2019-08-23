package com.ss.android.ugc.aweme.requestcombine.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\tHÆ\u0003J\t\u00107\u001a\u00020\u000bHÆ\u0003J\t\u00108\u001a\u00020\rHÆ\u0003J\t\u00109\u001a\u00020\u000fHÆ\u0003J\t\u0010:\u001a\u00020\u0011HÆ\u0003JY\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020@HÖ\u0001J\t\u0010A\u001a\u00020BHÖ\u0001R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u0006C"}, d2 = {"Lcom/ss/android/ugc/aweme/requestcombine/model/SettingCombineDataModel;", "", "awemeSetting", "Lcom/ss/android/ugc/aweme/requestcombine/model/AwemeSettingCombineModel;", "userSettingCombineModel", "Lcom/ss/android/ugc/aweme/requestcombine/model/UserSettingCombineModel;", "commerceSettingCombineModel", "Lcom/ss/android/ugc/aweme/requestcombine/model/CommerceSettingCombineModel;", "abTestCombineModel", "Lcom/ss/android/ugc/aweme/requestcombine/model/AbTestCombineModel;", "shareSettingCombineModel", "Lcom/ss/android/ugc/aweme/requestcombine/model/ShareSettingCombineModel;", "rateSettingCombineModel", "Lcom/ss/android/ugc/aweme/requestcombine/model/RateSettingCombineModel;", "sameCityModel", "Lcom/ss/android/ugc/aweme/requestcombine/model/SameCityCombineModel;", "noticeCountModel", "Lcom/ss/android/ugc/aweme/requestcombine/model/NoticeCountCombineModel;", "(Lcom/ss/android/ugc/aweme/requestcombine/model/AwemeSettingCombineModel;Lcom/ss/android/ugc/aweme/requestcombine/model/UserSettingCombineModel;Lcom/ss/android/ugc/aweme/requestcombine/model/CommerceSettingCombineModel;Lcom/ss/android/ugc/aweme/requestcombine/model/AbTestCombineModel;Lcom/ss/android/ugc/aweme/requestcombine/model/ShareSettingCombineModel;Lcom/ss/android/ugc/aweme/requestcombine/model/RateSettingCombineModel;Lcom/ss/android/ugc/aweme/requestcombine/model/SameCityCombineModel;Lcom/ss/android/ugc/aweme/requestcombine/model/NoticeCountCombineModel;)V", "getAbTestCombineModel", "()Lcom/ss/android/ugc/aweme/requestcombine/model/AbTestCombineModel;", "setAbTestCombineModel", "(Lcom/ss/android/ugc/aweme/requestcombine/model/AbTestCombineModel;)V", "getAwemeSetting", "()Lcom/ss/android/ugc/aweme/requestcombine/model/AwemeSettingCombineModel;", "setAwemeSetting", "(Lcom/ss/android/ugc/aweme/requestcombine/model/AwemeSettingCombineModel;)V", "getCommerceSettingCombineModel", "()Lcom/ss/android/ugc/aweme/requestcombine/model/CommerceSettingCombineModel;", "setCommerceSettingCombineModel", "(Lcom/ss/android/ugc/aweme/requestcombine/model/CommerceSettingCombineModel;)V", "getNoticeCountModel", "()Lcom/ss/android/ugc/aweme/requestcombine/model/NoticeCountCombineModel;", "setNoticeCountModel", "(Lcom/ss/android/ugc/aweme/requestcombine/model/NoticeCountCombineModel;)V", "getRateSettingCombineModel", "()Lcom/ss/android/ugc/aweme/requestcombine/model/RateSettingCombineModel;", "setRateSettingCombineModel", "(Lcom/ss/android/ugc/aweme/requestcombine/model/RateSettingCombineModel;)V", "getSameCityModel", "()Lcom/ss/android/ugc/aweme/requestcombine/model/SameCityCombineModel;", "setSameCityModel", "(Lcom/ss/android/ugc/aweme/requestcombine/model/SameCityCombineModel;)V", "getShareSettingCombineModel", "()Lcom/ss/android/ugc/aweme/requestcombine/model/ShareSettingCombineModel;", "setShareSettingCombineModel", "(Lcom/ss/android/ugc/aweme/requestcombine/model/ShareSettingCombineModel;)V", "getUserSettingCombineModel", "()Lcom/ss/android/ugc/aweme/requestcombine/model/UserSettingCombineModel;", "setUserSettingCombineModel", "(Lcom/ss/android/ugc/aweme/requestcombine/model/UserSettingCombineModel;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SettingCombineDataModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("/aweme/v1/abtest/param/")
    @NotNull
    private AbTestCombineModel abTestCombineModel;
    @SerializedName("/aweme/v1/settings/")
    @NotNull
    private AwemeSettingCombineModel awemeSetting;
    @SerializedName("/aweme/v1/commerce/settings/")
    @NotNull
    private CommerceSettingCombineModel commerceSettingCombineModel;
    @SerializedName("/aweme/v1/notice/count/")
    @NotNull
    private NoticeCountCombineModel noticeCountModel;
    @SerializedName("/aweme/v1/rate/settings/")
    @NotNull
    private RateSettingCombineModel rateSettingCombineModel;
    @SerializedName("/aweme/v1/poi/samecity/active/")
    @NotNull
    private SameCityCombineModel sameCityModel;
    @SerializedName("/aweme/v2/platform/share/settings/")
    @NotNull
    private ShareSettingCombineModel shareSettingCombineModel;
    @SerializedName("/aweme/v1/user/settings/")
    @NotNull
    private UserSettingCombineModel userSettingCombineModel;

    public static /* synthetic */ SettingCombineDataModel copy$default(SettingCombineDataModel settingCombineDataModel, AwemeSettingCombineModel awemeSettingCombineModel, UserSettingCombineModel userSettingCombineModel2, CommerceSettingCombineModel commerceSettingCombineModel2, AbTestCombineModel abTestCombineModel2, ShareSettingCombineModel shareSettingCombineModel2, RateSettingCombineModel rateSettingCombineModel2, SameCityCombineModel sameCityCombineModel, NoticeCountCombineModel noticeCountCombineModel, int i, Object obj) {
        SettingCombineDataModel settingCombineDataModel2 = settingCombineDataModel;
        int i2 = i;
        return settingCombineDataModel.copy((i2 & 1) != 0 ? settingCombineDataModel2.awemeSetting : awemeSettingCombineModel, (i2 & 2) != 0 ? settingCombineDataModel2.userSettingCombineModel : userSettingCombineModel2, (i2 & 4) != 0 ? settingCombineDataModel2.commerceSettingCombineModel : commerceSettingCombineModel2, (i2 & 8) != 0 ? settingCombineDataModel2.abTestCombineModel : abTestCombineModel2, (i2 & 16) != 0 ? settingCombineDataModel2.shareSettingCombineModel : shareSettingCombineModel2, (i2 & 32) != 0 ? settingCombineDataModel2.rateSettingCombineModel : rateSettingCombineModel2, (i2 & 64) != 0 ? settingCombineDataModel2.sameCityModel : sameCityCombineModel, (i2 & SearchJediMixFeedAdapter.f42517f) != 0 ? settingCombineDataModel2.noticeCountModel : noticeCountCombineModel);
    }

    @NotNull
    public final AwemeSettingCombineModel component1() {
        return this.awemeSetting;
    }

    @NotNull
    public final UserSettingCombineModel component2() {
        return this.userSettingCombineModel;
    }

    @NotNull
    public final CommerceSettingCombineModel component3() {
        return this.commerceSettingCombineModel;
    }

    @NotNull
    public final AbTestCombineModel component4() {
        return this.abTestCombineModel;
    }

    @NotNull
    public final ShareSettingCombineModel component5() {
        return this.shareSettingCombineModel;
    }

    @NotNull
    public final RateSettingCombineModel component6() {
        return this.rateSettingCombineModel;
    }

    @NotNull
    public final SameCityCombineModel component7() {
        return this.sameCityModel;
    }

    @NotNull
    public final NoticeCountCombineModel component8() {
        return this.noticeCountModel;
    }

    @NotNull
    public final SettingCombineDataModel copy(@NotNull AwemeSettingCombineModel awemeSettingCombineModel, @NotNull UserSettingCombineModel userSettingCombineModel2, @NotNull CommerceSettingCombineModel commerceSettingCombineModel2, @NotNull AbTestCombineModel abTestCombineModel2, @NotNull ShareSettingCombineModel shareSettingCombineModel2, @NotNull RateSettingCombineModel rateSettingCombineModel2, @NotNull SameCityCombineModel sameCityCombineModel, @NotNull NoticeCountCombineModel noticeCountCombineModel) {
        AwemeSettingCombineModel awemeSettingCombineModel2 = awemeSettingCombineModel;
        UserSettingCombineModel userSettingCombineModel3 = userSettingCombineModel2;
        CommerceSettingCombineModel commerceSettingCombineModel3 = commerceSettingCombineModel2;
        AbTestCombineModel abTestCombineModel3 = abTestCombineModel2;
        ShareSettingCombineModel shareSettingCombineModel3 = shareSettingCombineModel2;
        RateSettingCombineModel rateSettingCombineModel3 = rateSettingCombineModel2;
        SameCityCombineModel sameCityCombineModel2 = sameCityCombineModel;
        NoticeCountCombineModel noticeCountCombineModel2 = noticeCountCombineModel;
        if (PatchProxy.isSupport(new Object[]{awemeSettingCombineModel2, userSettingCombineModel3, commerceSettingCombineModel3, abTestCombineModel3, shareSettingCombineModel3, rateSettingCombineModel3, sameCityCombineModel2, noticeCountCombineModel2}, this, changeQuickRedirect, false, 70763, new Class[]{AwemeSettingCombineModel.class, UserSettingCombineModel.class, CommerceSettingCombineModel.class, AbTestCombineModel.class, ShareSettingCombineModel.class, RateSettingCombineModel.class, SameCityCombineModel.class, NoticeCountCombineModel.class}, SettingCombineDataModel.class)) {
            return (SettingCombineDataModel) PatchProxy.accessDispatch(new Object[]{awemeSettingCombineModel2, userSettingCombineModel3, commerceSettingCombineModel3, abTestCombineModel3, shareSettingCombineModel3, rateSettingCombineModel3, sameCityCombineModel2, noticeCountCombineModel2}, this, changeQuickRedirect, false, 70763, new Class[]{AwemeSettingCombineModel.class, UserSettingCombineModel.class, CommerceSettingCombineModel.class, AbTestCombineModel.class, ShareSettingCombineModel.class, RateSettingCombineModel.class, SameCityCombineModel.class, NoticeCountCombineModel.class}, SettingCombineDataModel.class);
        }
        Intrinsics.checkParameterIsNotNull(awemeSettingCombineModel2, "awemeSetting");
        Intrinsics.checkParameterIsNotNull(userSettingCombineModel3, "userSettingCombineModel");
        Intrinsics.checkParameterIsNotNull(commerceSettingCombineModel3, "commerceSettingCombineModel");
        Intrinsics.checkParameterIsNotNull(abTestCombineModel3, "abTestCombineModel");
        Intrinsics.checkParameterIsNotNull(shareSettingCombineModel3, "shareSettingCombineModel");
        Intrinsics.checkParameterIsNotNull(rateSettingCombineModel3, "rateSettingCombineModel");
        Intrinsics.checkParameterIsNotNull(sameCityCombineModel2, "sameCityModel");
        Intrinsics.checkParameterIsNotNull(noticeCountCombineModel2, "noticeCountModel");
        SettingCombineDataModel settingCombineDataModel = new SettingCombineDataModel(awemeSettingCombineModel, userSettingCombineModel2, commerceSettingCombineModel2, abTestCombineModel2, shareSettingCombineModel2, rateSettingCombineModel2, sameCityCombineModel, noticeCountCombineModel);
        return settingCombineDataModel;
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 70766, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 70766, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof SettingCombineDataModel) {
                SettingCombineDataModel settingCombineDataModel = (SettingCombineDataModel) obj;
                if (!Intrinsics.areEqual((Object) this.awemeSetting, (Object) settingCombineDataModel.awemeSetting) || !Intrinsics.areEqual((Object) this.userSettingCombineModel, (Object) settingCombineDataModel.userSettingCombineModel) || !Intrinsics.areEqual((Object) this.commerceSettingCombineModel, (Object) settingCombineDataModel.commerceSettingCombineModel) || !Intrinsics.areEqual((Object) this.abTestCombineModel, (Object) settingCombineDataModel.abTestCombineModel) || !Intrinsics.areEqual((Object) this.shareSettingCombineModel, (Object) settingCombineDataModel.shareSettingCombineModel) || !Intrinsics.areEqual((Object) this.rateSettingCombineModel, (Object) settingCombineDataModel.rateSettingCombineModel) || !Intrinsics.areEqual((Object) this.sameCityModel, (Object) settingCombineDataModel.sameCityModel) || !Intrinsics.areEqual((Object) this.noticeCountModel, (Object) settingCombineDataModel.noticeCountModel)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70765, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70765, new Class[0], Integer.TYPE)).intValue();
        }
        AwemeSettingCombineModel awemeSettingCombineModel = this.awemeSetting;
        int hashCode = (awemeSettingCombineModel != null ? awemeSettingCombineModel.hashCode() : 0) * 31;
        UserSettingCombineModel userSettingCombineModel2 = this.userSettingCombineModel;
        int hashCode2 = (hashCode + (userSettingCombineModel2 != null ? userSettingCombineModel2.hashCode() : 0)) * 31;
        CommerceSettingCombineModel commerceSettingCombineModel2 = this.commerceSettingCombineModel;
        int hashCode3 = (hashCode2 + (commerceSettingCombineModel2 != null ? commerceSettingCombineModel2.hashCode() : 0)) * 31;
        AbTestCombineModel abTestCombineModel2 = this.abTestCombineModel;
        int hashCode4 = (hashCode3 + (abTestCombineModel2 != null ? abTestCombineModel2.hashCode() : 0)) * 31;
        ShareSettingCombineModel shareSettingCombineModel2 = this.shareSettingCombineModel;
        int hashCode5 = (hashCode4 + (shareSettingCombineModel2 != null ? shareSettingCombineModel2.hashCode() : 0)) * 31;
        RateSettingCombineModel rateSettingCombineModel2 = this.rateSettingCombineModel;
        int hashCode6 = (hashCode5 + (rateSettingCombineModel2 != null ? rateSettingCombineModel2.hashCode() : 0)) * 31;
        SameCityCombineModel sameCityCombineModel = this.sameCityModel;
        int hashCode7 = (hashCode6 + (sameCityCombineModel != null ? sameCityCombineModel.hashCode() : 0)) * 31;
        NoticeCountCombineModel noticeCountCombineModel = this.noticeCountModel;
        if (noticeCountCombineModel != null) {
            i = noticeCountCombineModel.hashCode();
        }
        return hashCode7 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70764, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70764, new Class[0], String.class);
        }
        return "SettingCombineDataModel(awemeSetting=" + this.awemeSetting + ", userSettingCombineModel=" + this.userSettingCombineModel + ", commerceSettingCombineModel=" + this.commerceSettingCombineModel + ", abTestCombineModel=" + this.abTestCombineModel + ", shareSettingCombineModel=" + this.shareSettingCombineModel + ", rateSettingCombineModel=" + this.rateSettingCombineModel + ", sameCityModel=" + this.sameCityModel + ", noticeCountModel=" + this.noticeCountModel + ")";
    }

    @NotNull
    public final AbTestCombineModel getAbTestCombineModel() {
        return this.abTestCombineModel;
    }

    @NotNull
    public final AwemeSettingCombineModel getAwemeSetting() {
        return this.awemeSetting;
    }

    @NotNull
    public final CommerceSettingCombineModel getCommerceSettingCombineModel() {
        return this.commerceSettingCombineModel;
    }

    @NotNull
    public final NoticeCountCombineModel getNoticeCountModel() {
        return this.noticeCountModel;
    }

    @NotNull
    public final RateSettingCombineModel getRateSettingCombineModel() {
        return this.rateSettingCombineModel;
    }

    @NotNull
    public final SameCityCombineModel getSameCityModel() {
        return this.sameCityModel;
    }

    @NotNull
    public final ShareSettingCombineModel getShareSettingCombineModel() {
        return this.shareSettingCombineModel;
    }

    @NotNull
    public final UserSettingCombineModel getUserSettingCombineModel() {
        return this.userSettingCombineModel;
    }

    public final void setAbTestCombineModel(@NotNull AbTestCombineModel abTestCombineModel2) {
        AbTestCombineModel abTestCombineModel3 = abTestCombineModel2;
        if (PatchProxy.isSupport(new Object[]{abTestCombineModel3}, this, changeQuickRedirect, false, 70758, new Class[]{AbTestCombineModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{abTestCombineModel3}, this, changeQuickRedirect, false, 70758, new Class[]{AbTestCombineModel.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(abTestCombineModel3, "<set-?>");
        this.abTestCombineModel = abTestCombineModel3;
    }

    public final void setAwemeSetting(@NotNull AwemeSettingCombineModel awemeSettingCombineModel) {
        AwemeSettingCombineModel awemeSettingCombineModel2 = awemeSettingCombineModel;
        if (PatchProxy.isSupport(new Object[]{awemeSettingCombineModel2}, this, changeQuickRedirect, false, 70755, new Class[]{AwemeSettingCombineModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awemeSettingCombineModel2}, this, changeQuickRedirect, false, 70755, new Class[]{AwemeSettingCombineModel.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(awemeSettingCombineModel2, "<set-?>");
        this.awemeSetting = awemeSettingCombineModel2;
    }

    public final void setCommerceSettingCombineModel(@NotNull CommerceSettingCombineModel commerceSettingCombineModel2) {
        CommerceSettingCombineModel commerceSettingCombineModel3 = commerceSettingCombineModel2;
        if (PatchProxy.isSupport(new Object[]{commerceSettingCombineModel3}, this, changeQuickRedirect, false, 70757, new Class[]{CommerceSettingCombineModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{commerceSettingCombineModel3}, this, changeQuickRedirect, false, 70757, new Class[]{CommerceSettingCombineModel.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(commerceSettingCombineModel3, "<set-?>");
        this.commerceSettingCombineModel = commerceSettingCombineModel3;
    }

    public final void setNoticeCountModel(@NotNull NoticeCountCombineModel noticeCountCombineModel) {
        NoticeCountCombineModel noticeCountCombineModel2 = noticeCountCombineModel;
        if (PatchProxy.isSupport(new Object[]{noticeCountCombineModel2}, this, changeQuickRedirect, false, 70762, new Class[]{NoticeCountCombineModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{noticeCountCombineModel2}, this, changeQuickRedirect, false, 70762, new Class[]{NoticeCountCombineModel.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(noticeCountCombineModel2, "<set-?>");
        this.noticeCountModel = noticeCountCombineModel2;
    }

    public final void setRateSettingCombineModel(@NotNull RateSettingCombineModel rateSettingCombineModel2) {
        RateSettingCombineModel rateSettingCombineModel3 = rateSettingCombineModel2;
        if (PatchProxy.isSupport(new Object[]{rateSettingCombineModel3}, this, changeQuickRedirect, false, 70760, new Class[]{RateSettingCombineModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rateSettingCombineModel3}, this, changeQuickRedirect, false, 70760, new Class[]{RateSettingCombineModel.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(rateSettingCombineModel3, "<set-?>");
        this.rateSettingCombineModel = rateSettingCombineModel3;
    }

    public final void setSameCityModel(@NotNull SameCityCombineModel sameCityCombineModel) {
        SameCityCombineModel sameCityCombineModel2 = sameCityCombineModel;
        if (PatchProxy.isSupport(new Object[]{sameCityCombineModel2}, this, changeQuickRedirect, false, 70761, new Class[]{SameCityCombineModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sameCityCombineModel2}, this, changeQuickRedirect, false, 70761, new Class[]{SameCityCombineModel.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(sameCityCombineModel2, "<set-?>");
        this.sameCityModel = sameCityCombineModel2;
    }

    public final void setShareSettingCombineModel(@NotNull ShareSettingCombineModel shareSettingCombineModel2) {
        ShareSettingCombineModel shareSettingCombineModel3 = shareSettingCombineModel2;
        if (PatchProxy.isSupport(new Object[]{shareSettingCombineModel3}, this, changeQuickRedirect, false, 70759, new Class[]{ShareSettingCombineModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareSettingCombineModel3}, this, changeQuickRedirect, false, 70759, new Class[]{ShareSettingCombineModel.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(shareSettingCombineModel3, "<set-?>");
        this.shareSettingCombineModel = shareSettingCombineModel3;
    }

    public final void setUserSettingCombineModel(@NotNull UserSettingCombineModel userSettingCombineModel2) {
        UserSettingCombineModel userSettingCombineModel3 = userSettingCombineModel2;
        if (PatchProxy.isSupport(new Object[]{userSettingCombineModel3}, this, changeQuickRedirect, false, 70756, new Class[]{UserSettingCombineModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{userSettingCombineModel3}, this, changeQuickRedirect, false, 70756, new Class[]{UserSettingCombineModel.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(userSettingCombineModel3, "<set-?>");
        this.userSettingCombineModel = userSettingCombineModel3;
    }

    public SettingCombineDataModel(@NotNull AwemeSettingCombineModel awemeSettingCombineModel, @NotNull UserSettingCombineModel userSettingCombineModel2, @NotNull CommerceSettingCombineModel commerceSettingCombineModel2, @NotNull AbTestCombineModel abTestCombineModel2, @NotNull ShareSettingCombineModel shareSettingCombineModel2, @NotNull RateSettingCombineModel rateSettingCombineModel2, @NotNull SameCityCombineModel sameCityCombineModel, @NotNull NoticeCountCombineModel noticeCountCombineModel) {
        Intrinsics.checkParameterIsNotNull(awemeSettingCombineModel, "awemeSetting");
        Intrinsics.checkParameterIsNotNull(userSettingCombineModel2, "userSettingCombineModel");
        Intrinsics.checkParameterIsNotNull(commerceSettingCombineModel2, "commerceSettingCombineModel");
        Intrinsics.checkParameterIsNotNull(abTestCombineModel2, "abTestCombineModel");
        Intrinsics.checkParameterIsNotNull(shareSettingCombineModel2, "shareSettingCombineModel");
        Intrinsics.checkParameterIsNotNull(rateSettingCombineModel2, "rateSettingCombineModel");
        Intrinsics.checkParameterIsNotNull(sameCityCombineModel, "sameCityModel");
        Intrinsics.checkParameterIsNotNull(noticeCountCombineModel, "noticeCountModel");
        this.awemeSetting = awemeSettingCombineModel;
        this.userSettingCombineModel = userSettingCombineModel2;
        this.commerceSettingCombineModel = commerceSettingCombineModel2;
        this.abTestCombineModel = abTestCombineModel2;
        this.shareSettingCombineModel = shareSettingCombineModel2;
        this.rateSettingCombineModel = rateSettingCombineModel2;
        this.sameCityModel = sameCityCombineModel;
        this.noticeCountModel = noticeCountCombineModel;
    }
}
