package com.ss.android.ugc.aweme.requestcombine.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.a.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/requestcombine/model/SameCityCombineModel;", "Lcom/ss/android/ugc/aweme/requestcombine/model/BaseCombineMode;", "sameCityModel", "Lcom/ss/android/ugc/aweme/poi/bean/PoiSameCityActiveResponse;", "(Lcom/ss/android/ugc/aweme/poi/bean/PoiSameCityActiveResponse;)V", "getSameCityModel", "()Lcom/ss/android/ugc/aweme/poi/bean/PoiSameCityActiveResponse;", "setSameCityModel", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SameCityCombineModel extends BaseCombineMode {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("body")
    @NotNull
    private k sameCityModel;

    public static /* synthetic */ SameCityCombineModel copy$default(SameCityCombineModel sameCityCombineModel, k kVar, int i, Object obj) {
        if ((i & 1) != 0) {
            kVar = sameCityCombineModel.sameCityModel;
        }
        return sameCityCombineModel.copy(kVar);
    }

    @NotNull
    public final k component1() {
        return this.sameCityModel;
    }

    @NotNull
    public final SameCityCombineModel copy(@NotNull k kVar) {
        k kVar2 = kVar;
        if (PatchProxy.isSupport(new Object[]{kVar2}, this, changeQuickRedirect, false, 70751, new Class[]{k.class}, SameCityCombineModel.class)) {
            return (SameCityCombineModel) PatchProxy.accessDispatch(new Object[]{kVar2}, this, changeQuickRedirect, false, 70751, new Class[]{k.class}, SameCityCombineModel.class);
        }
        Intrinsics.checkParameterIsNotNull(kVar2, "sameCityModel");
        return new SameCityCombineModel(kVar2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 70754, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof SameCityCombineModel) && Intrinsics.areEqual((Object) this.sameCityModel, (Object) ((SameCityCombineModel) obj).sameCityModel));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 70754, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70753, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70753, new Class[0], Integer.TYPE)).intValue();
        }
        k kVar = this.sameCityModel;
        if (kVar != null) {
            i = kVar.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70752, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70752, new Class[0], String.class);
        }
        return "SameCityCombineModel(sameCityModel=" + this.sameCityModel + ")";
    }

    @NotNull
    public final k getSameCityModel() {
        return this.sameCityModel;
    }

    public SameCityCombineModel(@NotNull k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "sameCityModel");
        this.sameCityModel = kVar;
    }

    public final void setSameCityModel(@NotNull k kVar) {
        k kVar2 = kVar;
        if (PatchProxy.isSupport(new Object[]{kVar2}, this, changeQuickRedirect, false, 70750, new Class[]{k.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVar2}, this, changeQuickRedirect, false, 70750, new Class[]{k.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(kVar2, "<set-?>");
        this.sameCityModel = kVar2;
    }
}
