package com.ss.android.ugc.aweme.requestcombine.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.setting.serverpush.a.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/requestcombine/model/UserSettingCombineModel;", "Lcom/ss/android/ugc/aweme/requestcombine/model/BaseCombineMode;", "userSetting", "Lcom/ss/android/ugc/aweme/setting/serverpush/model/PushSettings;", "(Lcom/ss/android/ugc/aweme/setting/serverpush/model/PushSettings;)V", "getUserSetting", "()Lcom/ss/android/ugc/aweme/setting/serverpush/model/PushSettings;", "setUserSetting", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UserSettingCombineModel extends BaseCombineMode {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("body")
    @NotNull
    private c userSetting;

    public static /* synthetic */ UserSettingCombineModel copy$default(UserSettingCombineModel userSettingCombineModel, c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = userSettingCombineModel.userSetting;
        }
        return userSettingCombineModel.copy(cVar);
    }

    @NotNull
    public final c component1() {
        return this.userSetting;
    }

    @NotNull
    public final UserSettingCombineModel copy(@NotNull c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, changeQuickRedirect, false, 70774, new Class[]{c.class}, UserSettingCombineModel.class)) {
            return (UserSettingCombineModel) PatchProxy.accessDispatch(new Object[]{cVar2}, this, changeQuickRedirect, false, 70774, new Class[]{c.class}, UserSettingCombineModel.class);
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "userSetting");
        return new UserSettingCombineModel(cVar2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 70777, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof UserSettingCombineModel) && Intrinsics.areEqual((Object) this.userSetting, (Object) ((UserSettingCombineModel) obj).userSetting));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 70777, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70776, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70776, new Class[0], Integer.TYPE)).intValue();
        }
        c cVar = this.userSetting;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70775, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70775, new Class[0], String.class);
        }
        return "UserSettingCombineModel(userSetting=" + this.userSetting + ")";
    }

    @NotNull
    public final c getUserSetting() {
        return this.userSetting;
    }

    public UserSettingCombineModel(@NotNull c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "userSetting");
        this.userSetting = cVar;
    }

    public final void setUserSetting(@NotNull c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, changeQuickRedirect, false, 70773, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, changeQuickRedirect, false, 70773, new Class[]{c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "<set-?>");
        this.userSetting = cVar2;
    }
}
