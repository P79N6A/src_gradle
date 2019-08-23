package com.ss.android.ugc.aweme.commerce.billshare;

import android.annotation.SuppressLint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.ss.android.ugc.aweme.commerce.service.models.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JU\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/billshare/BillShareModel;", "", "promotion", "Lcom/ss/android/ugc/aweme/commerce/service/models/DetailPromotion;", "enterFrom", "", "enterMethod", "originItemId", "fromSchema", "", "creationId", "userInfo", "Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "(Lcom/ss/android/ugc/aweme/commerce/service/models/DetailPromotion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;)V", "getCreationId", "()Ljava/lang/String;", "getEnterFrom", "getEnterMethod", "getFromSchema", "()Z", "getOriginItemId", "getPromotion", "()Lcom/ss/android/ugc/aweme/commerce/service/models/DetailPromotion;", "getUserInfo", "()Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"TooManyMethodParam"})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36754a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final h f36755b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final String f36756c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final String f36757d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final String f36758e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f36759f;
    @NotNull
    public final String g;
    @NotNull
    public final CommerceUser h;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f36754a, false, 28000, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f36754a, false, 28000, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (Intrinsics.areEqual((Object) this.f36755b, (Object) dVar.f36755b) && Intrinsics.areEqual((Object) this.f36756c, (Object) dVar.f36756c) && Intrinsics.areEqual((Object) this.f36757d, (Object) dVar.f36757d) && Intrinsics.areEqual((Object) this.f36758e, (Object) dVar.f36758e)) {
                    if (!(this.f36759f == dVar.f36759f) || !Intrinsics.areEqual((Object) this.g, (Object) dVar.g) || !Intrinsics.areEqual((Object) this.h, (Object) dVar.h)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f36754a, false, 27999, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f36754a, false, 27999, new Class[0], Integer.TYPE)).intValue();
        }
        h hVar = this.f36755b;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        String str = this.f36756c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f36757d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f36758e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.f36759f;
        if (z) {
            z = true;
        }
        int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
        String str4 = this.g;
        int hashCode5 = (i2 + (str4 != null ? str4.hashCode() : 0)) * 31;
        CommerceUser commerceUser = this.h;
        if (commerceUser != null) {
            i = commerceUser.hashCode();
        }
        return hashCode5 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f36754a, false, 27998, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f36754a, false, 27998, new Class[0], String.class);
        }
        return "BillShareModel(promotion=" + this.f36755b + ", enterFrom=" + this.f36756c + ", enterMethod=" + this.f36757d + ", originItemId=" + this.f36758e + ", fromSchema=" + this.f36759f + ", creationId=" + this.g + ", userInfo=" + this.h + ")";
    }

    public d(@NotNull h hVar, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, @NotNull String str4, @NotNull CommerceUser commerceUser) {
        Intrinsics.checkParameterIsNotNull(hVar, "promotion");
        Intrinsics.checkParameterIsNotNull(str4, "creationId");
        Intrinsics.checkParameterIsNotNull(commerceUser, "userInfo");
        this.f36755b = hVar;
        this.f36756c = str;
        this.f36757d = str2;
        this.f36758e = str3;
        this.f36759f = z;
        this.g = str4;
        this.h = commerceUser;
    }
}
