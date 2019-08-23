package com.ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/TaoBao;", "Ljava/io/Serializable;", "coupon", "Lcom/ss/android/ugc/aweme/commerce/service/models/TaobaoCouponInfo;", "(Lcom/ss/android/ugc/aweme/commerce/service/models/TaobaoCouponInfo;)V", "getCoupon", "()Lcom/ss/android/ugc/aweme/commerce/service/models/TaobaoCouponInfo;", "setCoupon", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class ad implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("coupon")
    @Nullable
    private ae coupon;

    public static /* synthetic */ ad copy$default(ad adVar, ae aeVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aeVar = adVar.coupon;
        }
        return adVar.copy(aeVar);
    }

    @Nullable
    public final ae component1() {
        return this.coupon;
    }

    @NotNull
    public final ad copy(@Nullable ae aeVar) {
        ae aeVar2 = aeVar;
        if (!PatchProxy.isSupport(new Object[]{aeVar2}, this, changeQuickRedirect, false, 29900, new Class[]{ae.class}, ad.class)) {
            return new ad(aeVar2);
        }
        return (ad) PatchProxy.accessDispatch(new Object[]{aeVar2}, this, changeQuickRedirect, false, 29900, new Class[]{ae.class}, ad.class);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 29903, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof ad) && Intrinsics.areEqual((Object) this.coupon, (Object) ((ad) obj).coupon));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 29903, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29902, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29902, new Class[0], Integer.TYPE)).intValue();
        }
        ae aeVar = this.coupon;
        if (aeVar != null) {
            i = aeVar.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29901, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29901, new Class[0], String.class);
        }
        return "TaoBao(coupon=" + this.coupon + ")";
    }

    @Nullable
    public final ae getCoupon() {
        return this.coupon;
    }

    public final void setCoupon(@Nullable ae aeVar) {
        this.coupon = aeVar;
    }

    public ad(@Nullable ae aeVar) {
        this.coupon = aeVar;
    }
}
