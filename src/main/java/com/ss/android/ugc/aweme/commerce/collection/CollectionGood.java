package com.ss.android.ugc.aweme.commerce.collection;

import android.annotation.SuppressLint;
import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b4\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0012J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010>\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010?\u001a\u00020\u000fHÆ\u0003J\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\u000f2\b\u0010C\u001a\u0004\u0018\u00010DHÖ\u0003J\t\u0010E\u001a\u00020\u000bHÖ\u0001J\t\u0010F\u001a\u00020\u0003HÖ\u0001R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016R \u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016R \u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0014\"\u0004\b0\u0010\u0016R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u0010\u0016R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0014\"\u0004\b4\u0010\u0016¨\u0006G"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGood;", "Ljava/io/Serializable;", "promotionId", "", "productId", "authorId", "secAuthorId", "title", "cover", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "price", "", "favoriteCount", "", "onSale", "", "schema", "promotionSource", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/ugc/aweme/base/model/UrlModel;Ljava/lang/Integer;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/String;)V", "getAuthorId", "()Ljava/lang/String;", "setAuthorId", "(Ljava/lang/String;)V", "getCover", "()Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "setCover", "(Lcom/ss/android/ugc/aweme/base/model/UrlModel;)V", "getFavoriteCount", "()Ljava/lang/Long;", "setFavoriteCount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getOnSale", "()Z", "setOnSale", "(Z)V", "getPrice", "()Ljava/lang/Integer;", "setPrice", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getProductId", "setProductId", "getPromotionId", "setPromotionId", "getPromotionSource", "setPromotionSource", "getSchema", "setSchema", "getSecAuthorId", "setSecAuthorId", "getTitle", "setTitle", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/ugc/aweme/base/model/UrlModel;Ljava/lang/Integer;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/String;)Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGood;", "equals", "other", "", "hashCode", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"TooManyMethodParam"})
public final class CollectionGood implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("author_id")
    @Nullable
    private String authorId;
    @SerializedName("cover")
    @Nullable
    private UrlModel cover;
    @SerializedName("favorite_count")
    @Nullable
    private Long favoriteCount;
    @SerializedName("on_sale")
    private boolean onSale;
    @SerializedName("price")
    @Nullable
    private Integer price;
    @SerializedName("product_id")
    @Nullable
    private String productId;
    @SerializedName("promotion_id")
    @Nullable
    private String promotionId;
    @SerializedName("promotion_source")
    @Nullable
    private String promotionSource;
    @SerializedName("schema")
    @Nullable
    private String schema;
    @SerializedName("sec_author_id")
    @Nullable
    private String secAuthorId;
    @SerializedName("title")
    @Nullable
    private String title;

    public CollectionGood() {
        this(null, null, null, null, null, null, null, null, false, null, null, 2047, null);
    }

    public static /* synthetic */ CollectionGood copy$default(CollectionGood collectionGood, String str, String str2, String str3, String str4, String str5, UrlModel urlModel, Integer num, Long l, boolean z, String str6, String str7, int i, Object obj) {
        CollectionGood collectionGood2 = collectionGood;
        int i2 = i;
        return collectionGood.copy((i2 & 1) != 0 ? collectionGood2.promotionId : str, (i2 & 2) != 0 ? collectionGood2.productId : str2, (i2 & 4) != 0 ? collectionGood2.authorId : str3, (i2 & 8) != 0 ? collectionGood2.secAuthorId : str4, (i2 & 16) != 0 ? collectionGood2.title : str5, (i2 & 32) != 0 ? collectionGood2.cover : urlModel, (i2 & 64) != 0 ? collectionGood2.price : num, (i2 & SearchJediMixFeedAdapter.f42517f) != 0 ? collectionGood2.favoriteCount : l, (i2 & 256) != 0 ? collectionGood2.onSale : z, (i2 & 512) != 0 ? collectionGood2.schema : str6, (i2 & 1024) != 0 ? collectionGood2.promotionSource : str7);
    }

    @Nullable
    public final String component1() {
        return this.promotionId;
    }

    @Nullable
    public final String component10() {
        return this.schema;
    }

    @Nullable
    public final String component11() {
        return this.promotionSource;
    }

    @Nullable
    public final String component2() {
        return this.productId;
    }

    @Nullable
    public final String component3() {
        return this.authorId;
    }

    @Nullable
    public final String component4() {
        return this.secAuthorId;
    }

    @Nullable
    public final String component5() {
        return this.title;
    }

    @Nullable
    public final UrlModel component6() {
        return this.cover;
    }

    @Nullable
    public final Integer component7() {
        return this.price;
    }

    @Nullable
    public final Long component8() {
        return this.favoriteCount;
    }

    public final boolean component9() {
        return this.onSale;
    }

    @NotNull
    public final CollectionGood copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable UrlModel urlModel, @Nullable Integer num, @Nullable Long l, boolean z, @Nullable String str6, @Nullable String str7) {
        if (PatchProxy.isSupport(new Object[]{str, str2, str3, str4, str5, urlModel, num, l, Byte.valueOf(z ? (byte) 1 : 0), str6, str7}, this, changeQuickRedirect, false, 28057, new Class[]{String.class, String.class, String.class, String.class, String.class, UrlModel.class, Integer.class, Long.class, Boolean.TYPE, String.class, String.class}, CollectionGood.class)) {
            return (CollectionGood) PatchProxy.accessDispatch(new Object[]{str, str2, str3, str4, str5, urlModel, num, l, Byte.valueOf(z), str6, str7}, this, changeQuickRedirect, false, 28057, new Class[]{String.class, String.class, String.class, String.class, String.class, UrlModel.class, Integer.class, Long.class, Boolean.TYPE, String.class, String.class}, CollectionGood.class);
        }
        CollectionGood collectionGood = new CollectionGood(str, str2, str3, str4, str5, urlModel, num, l, z, str6, str7);
        return collectionGood;
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 28060, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 28060, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof CollectionGood) {
                CollectionGood collectionGood = (CollectionGood) obj;
                if (Intrinsics.areEqual((Object) this.promotionId, (Object) collectionGood.promotionId) && Intrinsics.areEqual((Object) this.productId, (Object) collectionGood.productId) && Intrinsics.areEqual((Object) this.authorId, (Object) collectionGood.authorId) && Intrinsics.areEqual((Object) this.secAuthorId, (Object) collectionGood.secAuthorId) && Intrinsics.areEqual((Object) this.title, (Object) collectionGood.title) && Intrinsics.areEqual((Object) this.cover, (Object) collectionGood.cover) && Intrinsics.areEqual((Object) this.price, (Object) collectionGood.price) && Intrinsics.areEqual((Object) this.favoriteCount, (Object) collectionGood.favoriteCount)) {
                    if (!(this.onSale == collectionGood.onSale) || !Intrinsics.areEqual((Object) this.schema, (Object) collectionGood.schema) || !Intrinsics.areEqual((Object) this.promotionSource, (Object) collectionGood.promotionSource)) {
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28059, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28059, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.promotionId;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.productId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.authorId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.secAuthorId;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.title;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        UrlModel urlModel = this.cover;
        int hashCode6 = (hashCode5 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        Integer num = this.price;
        int hashCode7 = (hashCode6 + (num != null ? num.hashCode() : 0)) * 31;
        Long l = this.favoriteCount;
        int hashCode8 = (hashCode7 + (l != null ? l.hashCode() : 0)) * 31;
        boolean z = this.onSale;
        if (z) {
            z = true;
        }
        int i2 = (hashCode8 + (z ? 1 : 0)) * 31;
        String str6 = this.schema;
        int hashCode9 = (i2 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.promotionSource;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode9 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28058, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28058, new Class[0], String.class);
        }
        return "CollectionGood(promotionId=" + this.promotionId + ", productId=" + this.productId + ", authorId=" + this.authorId + ", secAuthorId=" + this.secAuthorId + ", title=" + this.title + ", cover=" + this.cover + ", price=" + this.price + ", favoriteCount=" + this.favoriteCount + ", onSale=" + this.onSale + ", schema=" + this.schema + ", promotionSource=" + this.promotionSource + ")";
    }

    @Nullable
    public final String getAuthorId() {
        return this.authorId;
    }

    @Nullable
    public final UrlModel getCover() {
        return this.cover;
    }

    @Nullable
    public final Long getFavoriteCount() {
        return this.favoriteCount;
    }

    public final boolean getOnSale() {
        return this.onSale;
    }

    @Nullable
    public final Integer getPrice() {
        return this.price;
    }

    @Nullable
    public final String getProductId() {
        return this.productId;
    }

    @Nullable
    public final String getPromotionId() {
        return this.promotionId;
    }

    @Nullable
    public final String getPromotionSource() {
        return this.promotionSource;
    }

    @Nullable
    public final String getSchema() {
        return this.schema;
    }

    @Nullable
    public final String getSecAuthorId() {
        return this.secAuthorId;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setAuthorId(@Nullable String str) {
        this.authorId = str;
    }

    public final void setCover(@Nullable UrlModel urlModel) {
        this.cover = urlModel;
    }

    public final void setFavoriteCount(@Nullable Long l) {
        this.favoriteCount = l;
    }

    public final void setOnSale(boolean z) {
        this.onSale = z;
    }

    public final void setPrice(@Nullable Integer num) {
        this.price = num;
    }

    public final void setProductId(@Nullable String str) {
        this.productId = str;
    }

    public final void setPromotionId(@Nullable String str) {
        this.promotionId = str;
    }

    public final void setPromotionSource(@Nullable String str) {
        this.promotionSource = str;
    }

    public final void setSchema(@Nullable String str) {
        this.schema = str;
    }

    public final void setSecAuthorId(@Nullable String str) {
        this.secAuthorId = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public CollectionGood(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable UrlModel urlModel, @Nullable Integer num, @Nullable Long l, boolean z, @Nullable String str6, @Nullable String str7) {
        this.promotionId = str;
        this.productId = str2;
        this.authorId = str3;
        this.secAuthorId = str4;
        this.title = str5;
        this.cover = urlModel;
        this.price = num;
        this.favoriteCount = l;
        this.onSale = z;
        this.schema = str6;
        this.promotionSource = str7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CollectionGood(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, com.ss.android.ugc.aweme.base.model.UrlModel r18, java.lang.Integer r19, java.lang.Long r20, boolean r21, java.lang.String r22, java.lang.String r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r12 = this;
            r0 = r24
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r13
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r14
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r15
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x0020
        L_0x001e:
            r5 = r16
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r2
            goto L_0x0028
        L_0x0026:
            r6 = r17
        L_0x0028:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002e
            r7 = r2
            goto L_0x0030
        L_0x002e:
            r7 = r18
        L_0x0030:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0036
            r8 = r2
            goto L_0x0038
        L_0x0036:
            r8 = r19
        L_0x0038:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003e
            r9 = r2
            goto L_0x0040
        L_0x003e:
            r9 = r20
        L_0x0040:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0046
            r10 = 1
            goto L_0x0048
        L_0x0046:
            r10 = r21
        L_0x0048:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x004e
            r11 = r2
            goto L_0x0050
        L_0x004e:
            r11 = r22
        L_0x0050:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r2 = r23
        L_0x0057:
            r13 = r12
            r14 = r1
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.collection.CollectionGood.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.base.model.UrlModel, java.lang.Integer, java.lang.Long, boolean, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
