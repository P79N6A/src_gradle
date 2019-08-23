package com.ss.android.ugc.aweme.requestcombine.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/requestcombine/model/SettingCombineModel;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "data", "Lcom/ss/android/ugc/aweme/requestcombine/model/SettingCombineDataModel;", "(Lcom/ss/android/ugc/aweme/requestcombine/model/SettingCombineDataModel;)V", "getData", "()Lcom/ss/android/ugc/aweme/requestcombine/model/SettingCombineDataModel;", "setData", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SettingCombineModel extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("data")
    @NotNull
    private SettingCombineDataModel data;

    @NotNull
    public final SettingCombineDataModel getData() {
        return this.data;
    }

    public SettingCombineModel(@NotNull SettingCombineDataModel settingCombineDataModel) {
        Intrinsics.checkParameterIsNotNull(settingCombineDataModel, "data");
        this.data = settingCombineDataModel;
    }

    public final void setData(@NotNull SettingCombineDataModel settingCombineDataModel) {
        SettingCombineDataModel settingCombineDataModel2 = settingCombineDataModel;
        if (PatchProxy.isSupport(new Object[]{settingCombineDataModel2}, this, changeQuickRedirect, false, 70767, new Class[]{SettingCombineDataModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{settingCombineDataModel2}, this, changeQuickRedirect, false, 70767, new Class[]{SettingCombineDataModel.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(settingCombineDataModel2, "<set-?>");
        this.data = settingCombineDataModel2;
    }
}
