package com.ss.android.ugc.aweme.commerce.service.models;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0006\u0010\u0019\u001a\u00020\u0014J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/TaobaoCouponInfo;", "Ljava/io/Serializable;", "couponAmount", "", "couponWebUrl", "couponOpenUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCouponAmount", "()Ljava/lang/String;", "setCouponAmount", "(Ljava/lang/String;)V", "getCouponOpenUrl", "setCouponOpenUrl", "getCouponWebUrl", "setCouponWebUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "isValid", "toString", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class ae implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("coupon_amount")
    @Nullable
    private String couponAmount;
    @SerializedName("coupon_open_url")
    @Nullable
    private String couponOpenUrl;
    @SerializedName("coupon_web_url")
    @Nullable
    private String couponWebUrl;

    public ae() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ae copy$default(ae aeVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aeVar.couponAmount;
        }
        if ((i & 2) != 0) {
            str2 = aeVar.couponWebUrl;
        }
        if ((i & 4) != 0) {
            str3 = aeVar.couponOpenUrl;
        }
        return aeVar.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.couponAmount;
    }

    @Nullable
    public final String component2() {
        return this.couponWebUrl;
    }

    @Nullable
    public final String component3() {
        return this.couponOpenUrl;
    }

    @NotNull
    public final ae copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (!PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, changeQuickRedirect, false, 29905, new Class[]{String.class, String.class, String.class}, ae.class)) {
            return new ae(str4, str5, str6);
        }
        return (ae) PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, changeQuickRedirect, false, 29905, new Class[]{String.class, String.class, String.class}, ae.class);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 29908, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 29908, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof ae) {
                ae aeVar = (ae) obj;
                if (!Intrinsics.areEqual((Object) this.couponAmount, (Object) aeVar.couponAmount) || !Intrinsics.areEqual((Object) this.couponWebUrl, (Object) aeVar.couponWebUrl) || !Intrinsics.areEqual((Object) this.couponOpenUrl, (Object) aeVar.couponOpenUrl)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29907, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29907, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.couponAmount;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.couponWebUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.couponOpenUrl;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29906, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29906, new Class[0], String.class);
        }
        return "TaobaoCouponInfo(couponAmount=" + this.couponAmount + ", couponWebUrl=" + this.couponWebUrl + ", couponOpenUrl=" + this.couponOpenUrl + ")";
    }

    @Nullable
    public final String getCouponAmount() {
        return this.couponAmount;
    }

    @Nullable
    public final String getCouponOpenUrl() {
        return this.couponOpenUrl;
    }

    @Nullable
    public final String getCouponWebUrl() {
        return this.couponWebUrl;
    }

    public final boolean isValid() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29904, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29904, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(this.couponAmount) && (!TextUtils.isEmpty(this.couponWebUrl) || !TextUtils.isEmpty(this.couponOpenUrl))) {
            z = true;
        }
        return z;
    }

    public final void setCouponAmount(@Nullable String str) {
        this.couponAmount = str;
    }

    public final void setCouponOpenUrl(@Nullable String str) {
        this.couponOpenUrl = str;
    }

    public final void setCouponWebUrl(@Nullable String str) {
        this.couponWebUrl = str;
    }

    public ae(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.couponAmount = str;
        this.couponWebUrl = str2;
        this.couponOpenUrl = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ae(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
