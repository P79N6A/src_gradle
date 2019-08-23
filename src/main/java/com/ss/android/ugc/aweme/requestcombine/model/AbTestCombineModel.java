package com.ss.android.ugc.aweme.requestcombine.model;

import android.support.annotation.Keep;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/requestcombine/model/AbTestCombineModel;", "Lcom/ss/android/ugc/aweme/requestcombine/model/BaseCombineMode;", "abTestResponse", "Lcom/google/gson/JsonElement;", "(Lcom/google/gson/JsonElement;)V", "getAbTestResponse", "()Lcom/google/gson/JsonElement;", "setAbTestResponse", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AbTestCombineModel extends BaseCombineMode {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("body")
    @NotNull
    private JsonElement abTestResponse;

    public static /* synthetic */ AbTestCombineModel copy$default(AbTestCombineModel abTestCombineModel, JsonElement jsonElement, int i, Object obj) {
        if ((i & 1) != 0) {
            jsonElement = abTestCombineModel.abTestResponse;
        }
        return abTestCombineModel.copy(jsonElement);
    }

    @NotNull
    public final JsonElement component1() {
        return this.abTestResponse;
    }

    @NotNull
    public final AbTestCombineModel copy(@NotNull JsonElement jsonElement) {
        JsonElement jsonElement2 = jsonElement;
        if (PatchProxy.isSupport(new Object[]{jsonElement2}, this, changeQuickRedirect, false, 70726, new Class[]{JsonElement.class}, AbTestCombineModel.class)) {
            return (AbTestCombineModel) PatchProxy.accessDispatch(new Object[]{jsonElement2}, this, changeQuickRedirect, false, 70726, new Class[]{JsonElement.class}, AbTestCombineModel.class);
        }
        Intrinsics.checkParameterIsNotNull(jsonElement2, "abTestResponse");
        return new AbTestCombineModel(jsonElement2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 70729, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof AbTestCombineModel) && Intrinsics.areEqual((Object) this.abTestResponse, (Object) ((AbTestCombineModel) obj).abTestResponse));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 70729, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70728, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70728, new Class[0], Integer.TYPE)).intValue();
        }
        JsonElement jsonElement = this.abTestResponse;
        if (jsonElement != null) {
            i = jsonElement.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70727, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70727, new Class[0], String.class);
        }
        return "AbTestCombineModel(abTestResponse=" + this.abTestResponse + ")";
    }

    @NotNull
    public final JsonElement getAbTestResponse() {
        return this.abTestResponse;
    }

    public AbTestCombineModel(@NotNull JsonElement jsonElement) {
        Intrinsics.checkParameterIsNotNull(jsonElement, "abTestResponse");
        this.abTestResponse = jsonElement;
    }

    public final void setAbTestResponse(@NotNull JsonElement jsonElement) {
        JsonElement jsonElement2 = jsonElement;
        if (PatchProxy.isSupport(new Object[]{jsonElement2}, this, changeQuickRedirect, false, 70725, new Class[]{JsonElement.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jsonElement2}, this, changeQuickRedirect, false, 70725, new Class[]{JsonElement.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(jsonElement2, "<set-?>");
        this.abTestResponse = jsonElement2;
    }
}
