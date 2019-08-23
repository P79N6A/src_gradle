package com.ss.android.ugc.aweme.requestcombine.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.model.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/requestcombine/model/CommerceSettingCombineModel;", "Lcom/ss/android/ugc/aweme/requestcombine/model/BaseCombineMode;", "combineModel", "Lcom/ss/android/ugc/aweme/commercialize/model/CommerceSettings;", "(Lcom/ss/android/ugc/aweme/commercialize/model/CommerceSettings;)V", "getCombineModel", "()Lcom/ss/android/ugc/aweme/commercialize/model/CommerceSettings;", "setCombineModel", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CommerceSettingCombineModel extends BaseCombineMode {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("body")
    @NotNull
    private f combineModel;

    public static /* synthetic */ CommerceSettingCombineModel copy$default(CommerceSettingCombineModel commerceSettingCombineModel, f fVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = commerceSettingCombineModel.combineModel;
        }
        return commerceSettingCombineModel.copy(fVar);
    }

    @NotNull
    public final f component1() {
        return this.combineModel;
    }

    @NotNull
    public final CommerceSettingCombineModel copy(@NotNull f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, changeQuickRedirect, false, 70736, new Class[]{f.class}, CommerceSettingCombineModel.class)) {
            return (CommerceSettingCombineModel) PatchProxy.accessDispatch(new Object[]{fVar2}, this, changeQuickRedirect, false, 70736, new Class[]{f.class}, CommerceSettingCombineModel.class);
        }
        Intrinsics.checkParameterIsNotNull(fVar2, "combineModel");
        return new CommerceSettingCombineModel(fVar2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 70739, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof CommerceSettingCombineModel) && Intrinsics.areEqual((Object) this.combineModel, (Object) ((CommerceSettingCombineModel) obj).combineModel));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 70739, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70738, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70738, new Class[0], Integer.TYPE)).intValue();
        }
        f fVar = this.combineModel;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70737, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70737, new Class[0], String.class);
        }
        return "CommerceSettingCombineModel(combineModel=" + this.combineModel + ")";
    }

    @NotNull
    public final f getCombineModel() {
        return this.combineModel;
    }

    public CommerceSettingCombineModel(@NotNull f fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "combineModel");
        this.combineModel = fVar;
    }

    public final void setCombineModel(@NotNull f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, changeQuickRedirect, false, 70735, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, changeQuickRedirect, false, 70735, new Class[]{f.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fVar2, "<set-?>");
        this.combineModel = fVar2;
    }
}
