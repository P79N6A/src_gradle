package com.ss.android.ugc.aweme.favorites.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003Je\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006,"}, d2 = {"Lcom/ss/android/ugc/aweme/favorites/bean/WillingListItem;", "", "promotionId", "", "productId", "authorId", "title", "cover", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "price", "", "favoriteCount", "onSale", "", "schema", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/ugc/aweme/base/model/UrlModel;JJZLjava/lang/String;)V", "getAuthorId", "()Ljava/lang/String;", "getCover", "()Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getFavoriteCount", "()J", "getOnSale", "()Z", "getPrice", "getProductId", "getPromotionId", "getSchema", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44229a;
    @SerializedName("promotion_id")
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final String f44230b;
    @SerializedName("product_id")
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final String f44231c;
    @SerializedName("author_id")
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final String f44232d;
    @SerializedName("title")
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final String f44233e;
    @SerializedName("cover")
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final UrlModel f44234f;
    @SerializedName("price")
    public final long g;
    @SerializedName("favorite_count")
    public final long h;
    @SerializedName("on_sale")
    public final boolean i;
    @SerializedName("schema")
    @Nullable
    public final String j;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f44229a, false, 39466, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f44229a, false, 39466, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof k) {
                k kVar = (k) obj;
                if (Intrinsics.areEqual((Object) this.f44230b, (Object) kVar.f44230b) && Intrinsics.areEqual((Object) this.f44231c, (Object) kVar.f44231c) && Intrinsics.areEqual((Object) this.f44232d, (Object) kVar.f44232d) && Intrinsics.areEqual((Object) this.f44233e, (Object) kVar.f44233e) && Intrinsics.areEqual((Object) this.f44234f, (Object) kVar.f44234f)) {
                    if (this.g == kVar.g) {
                        if (this.h == kVar.h) {
                            if (!(this.i == kVar.i) || !Intrinsics.areEqual((Object) this.j, (Object) kVar.j)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f44229a, false, 39465, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f44229a, false, 39465, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.f44230b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f44231c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f44232d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f44233e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        UrlModel urlModel = this.f44234f;
        int hashCode5 = urlModel != null ? urlModel.hashCode() : 0;
        long j2 = this.g;
        long j3 = this.h;
        int i3 = (((((hashCode4 + hashCode5) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        boolean z = this.i;
        if (z) {
            z = true;
        }
        int i4 = (i3 + (z ? 1 : 0)) * 31;
        String str5 = this.j;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return i4 + i2;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f44229a, false, 39464, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f44229a, false, 39464, new Class[0], String.class);
        }
        return "WillingListItem(promotionId=" + this.f44230b + ", productId=" + this.f44231c + ", authorId=" + this.f44232d + ", title=" + this.f44233e + ", cover=" + this.f44234f + ", price=" + this.g + ", favoriteCount=" + this.h + ", onSale=" + this.i + ", schema=" + this.j + ")";
    }
}
