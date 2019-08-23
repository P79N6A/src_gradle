package com.ss.android.ugc.aweme.commerce.preview.footprint;

import android.annotation.SuppressLint;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b4\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t¢\u0006\u0002\u0010\u0012J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fHÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030\fHÆ\u0003J\t\u00106\u001a\u00020\tHÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010:\u001a\u00020\tHÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fHÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\b\b\u0002\u0010\u0011\u001a\u00020\tHÆ\u0001J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010CHÖ\u0003J\t\u0010D\u001a\u00020\tHÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0011\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R&\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R&\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001e\u0010\n\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001aR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001c\"\u0004\b,\u0010\u001eR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001eR\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u0010\u001e¨\u0006F"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/footprint/TracePromotion;", "Ljava/io/Serializable;", "promotionId", "", "gid", "title", "image", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "price", "", "itemType", "images", "", "traceAuthorId", "traceAwemeId", "elasticImages", "labels", "commodityType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/ugc/aweme/base/model/UrlModel;IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;I)V", "getCommodityType", "()I", "setCommodityType", "(I)V", "getElasticImages", "()Ljava/util/List;", "setElasticImages", "(Ljava/util/List;)V", "getGid", "()Ljava/lang/String;", "setGid", "(Ljava/lang/String;)V", "getImage", "()Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "setImage", "(Lcom/ss/android/ugc/aweme/base/model/UrlModel;)V", "getImages", "setImages", "getItemType", "setItemType", "getLabels", "setLabels", "getPrice", "setPrice", "getPromotionId", "setPromotionId", "getTitle", "setTitle", "getTraceAuthorId", "setTraceAuthorId", "getTraceAwemeId", "setTraceAwemeId", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"TooManyMethodParam"})
public final class f implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("promotion_source")
    private int commodityType;
    @SerializedName("elastic_img")
    @Nullable
    private List<? extends UrlModel> elasticImages;
    @SerializedName("gid")
    @NotNull
    private String gid;
    @SerializedName("image")
    @Nullable
    private UrlModel image;
    @SerializedName("imgs")
    @Nullable
    private List<? extends UrlModel> images;
    @SerializedName("item_type")
    private int itemType;
    @SerializedName("label")
    @NotNull
    private List<String> labels;
    @SerializedName("price")
    private int price;
    @SerializedName("promotion_id")
    @NotNull
    private String promotionId;
    @SerializedName("title")
    @NotNull
    private String title;
    @SerializedName("trace_author_id")
    @NotNull
    private String traceAuthorId;
    @SerializedName("trace_aweme_id")
    @NotNull
    private String traceAwemeId;

    public static /* synthetic */ f copy$default(f fVar, String str, String str2, String str3, UrlModel urlModel, int i, int i2, List list, String str4, String str5, List list2, List list3, int i3, int i4, Object obj) {
        f fVar2 = fVar;
        int i5 = i4;
        return fVar.copy((i5 & 1) != 0 ? fVar2.promotionId : str, (i5 & 2) != 0 ? fVar2.gid : str2, (i5 & 4) != 0 ? fVar2.title : str3, (i5 & 8) != 0 ? fVar2.image : urlModel, (i5 & 16) != 0 ? fVar2.price : i, (i5 & 32) != 0 ? fVar2.itemType : i2, (i5 & 64) != 0 ? fVar2.images : list, (i5 & SearchJediMixFeedAdapter.f42517f) != 0 ? fVar2.traceAuthorId : str4, (i5 & 256) != 0 ? fVar2.traceAwemeId : str5, (i5 & 512) != 0 ? fVar2.elasticImages : list2, (i5 & 1024) != 0 ? fVar2.labels : list3, (i5 & 2048) != 0 ? fVar2.commodityType : i3);
    }

    @NotNull
    public final String component1() {
        return this.promotionId;
    }

    @Nullable
    public final List<UrlModel> component10() {
        return this.elasticImages;
    }

    @NotNull
    public final List<String> component11() {
        return this.labels;
    }

    public final int component12() {
        return this.commodityType;
    }

    @NotNull
    public final String component2() {
        return this.gid;
    }

    @NotNull
    public final String component3() {
        return this.title;
    }

    @Nullable
    public final UrlModel component4() {
        return this.image;
    }

    public final int component5() {
        return this.price;
    }

    public final int component6() {
        return this.itemType;
    }

    @Nullable
    public final List<UrlModel> component7() {
        return this.images;
    }

    @NotNull
    public final String component8() {
        return this.traceAuthorId;
    }

    @NotNull
    public final String component9() {
        return this.traceAwemeId;
    }

    @NotNull
    public final f copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable UrlModel urlModel, int i, int i2, @Nullable List<? extends UrlModel> list, @NotNull String str4, @NotNull String str5, @Nullable List<? extends UrlModel> list2, @NotNull List<String> list3, int i3) {
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        List<String> list4 = list3;
        if (PatchProxy.isSupport(new Object[]{str6, str7, str8, urlModel, Integer.valueOf(i), Integer.valueOf(i2), list, str9, str10, list2, list4, Integer.valueOf(i3)}, this, changeQuickRedirect, false, 28994, new Class[]{String.class, String.class, String.class, UrlModel.class, Integer.TYPE, Integer.TYPE, List.class, String.class, String.class, List.class, List.class, Integer.TYPE}, f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[]{str6, str7, str8, urlModel, Integer.valueOf(i), Integer.valueOf(i2), list, str9, str10, list2, list4, Integer.valueOf(i3)}, this, changeQuickRedirect, false, 28994, new Class[]{String.class, String.class, String.class, UrlModel.class, Integer.TYPE, Integer.TYPE, List.class, String.class, String.class, List.class, List.class, Integer.TYPE}, f.class);
        }
        Intrinsics.checkParameterIsNotNull(str6, "promotionId");
        Intrinsics.checkParameterIsNotNull(str7, "gid");
        Intrinsics.checkParameterIsNotNull(str8, PushConstants.TITLE);
        Intrinsics.checkParameterIsNotNull(str9, "traceAuthorId");
        Intrinsics.checkParameterIsNotNull(str10, "traceAwemeId");
        Intrinsics.checkParameterIsNotNull(list4, "labels");
        f fVar = new f(str, str2, str3, urlModel, i, i2, list, str4, str5, list2, list3, i3);
        return fVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 28997, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 28997, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (Intrinsics.areEqual((Object) this.promotionId, (Object) fVar.promotionId) && Intrinsics.areEqual((Object) this.gid, (Object) fVar.gid) && Intrinsics.areEqual((Object) this.title, (Object) fVar.title) && Intrinsics.areEqual((Object) this.image, (Object) fVar.image)) {
                    if (this.price == fVar.price) {
                        if ((this.itemType == fVar.itemType) && Intrinsics.areEqual((Object) this.images, (Object) fVar.images) && Intrinsics.areEqual((Object) this.traceAuthorId, (Object) fVar.traceAuthorId) && Intrinsics.areEqual((Object) this.traceAwemeId, (Object) fVar.traceAwemeId) && Intrinsics.areEqual((Object) this.elasticImages, (Object) fVar.elasticImages) && Intrinsics.areEqual((Object) this.labels, (Object) fVar.labels)) {
                            if (this.commodityType == fVar.commodityType) {
                                return true;
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
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28996, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28996, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.promotionId;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.gid;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.title;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        UrlModel urlModel = this.image;
        int hashCode4 = (((((hashCode3 + (urlModel != null ? urlModel.hashCode() : 0)) * 31) + this.price) * 31) + this.itemType) * 31;
        List<? extends UrlModel> list = this.images;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        String str4 = this.traceAuthorId;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.traceAwemeId;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<? extends UrlModel> list2 = this.elasticImages;
        int hashCode8 = (hashCode7 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.labels;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return ((hashCode8 + i) * 31) + this.commodityType;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28995, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28995, new Class[0], String.class);
        }
        return "TracePromotion(promotionId=" + this.promotionId + ", gid=" + this.gid + ", title=" + this.title + ", image=" + this.image + ", price=" + this.price + ", itemType=" + this.itemType + ", images=" + this.images + ", traceAuthorId=" + this.traceAuthorId + ", traceAwemeId=" + this.traceAwemeId + ", elasticImages=" + this.elasticImages + ", labels=" + this.labels + ", commodityType=" + this.commodityType + ")";
    }

    public final int getCommodityType() {
        return this.commodityType;
    }

    @Nullable
    public final List<UrlModel> getElasticImages() {
        return this.elasticImages;
    }

    @NotNull
    public final String getGid() {
        return this.gid;
    }

    @Nullable
    public final UrlModel getImage() {
        return this.image;
    }

    @Nullable
    public final List<UrlModel> getImages() {
        return this.images;
    }

    public final int getItemType() {
        return this.itemType;
    }

    @NotNull
    public final List<String> getLabels() {
        return this.labels;
    }

    public final int getPrice() {
        return this.price;
    }

    @NotNull
    public final String getPromotionId() {
        return this.promotionId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getTraceAuthorId() {
        return this.traceAuthorId;
    }

    @NotNull
    public final String getTraceAwemeId() {
        return this.traceAwemeId;
    }

    public final void setCommodityType(int i) {
        this.commodityType = i;
    }

    public final void setElasticImages(@Nullable List<? extends UrlModel> list) {
        this.elasticImages = list;
    }

    public final void setImage(@Nullable UrlModel urlModel) {
        this.image = urlModel;
    }

    public final void setImages(@Nullable List<? extends UrlModel> list) {
        this.images = list;
    }

    public final void setItemType(int i) {
        this.itemType = i;
    }

    public final void setPrice(int i) {
        this.price = i;
    }

    public final void setGid(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 28989, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 28989, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.gid = str2;
    }

    public final void setLabels(@NotNull List<String> list) {
        List<String> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, changeQuickRedirect, false, 28993, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, changeQuickRedirect, false, 28993, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "<set-?>");
        this.labels = list2;
    }

    public final void setPromotionId(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 28988, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 28988, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.promotionId = str2;
    }

    public final void setTitle(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 28990, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 28990, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.title = str2;
    }

    public final void setTraceAuthorId(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 28991, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 28991, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.traceAuthorId = str2;
    }

    public final void setTraceAwemeId(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 28992, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 28992, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.traceAwemeId = str2;
    }

    public f(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable UrlModel urlModel, int i, int i2, @Nullable List<? extends UrlModel> list, @NotNull String str4, @NotNull String str5, @Nullable List<? extends UrlModel> list2, @NotNull List<String> list3, int i3) {
        Intrinsics.checkParameterIsNotNull(str, "promotionId");
        Intrinsics.checkParameterIsNotNull(str2, "gid");
        Intrinsics.checkParameterIsNotNull(str3, PushConstants.TITLE);
        Intrinsics.checkParameterIsNotNull(str4, "traceAuthorId");
        Intrinsics.checkParameterIsNotNull(str5, "traceAwemeId");
        Intrinsics.checkParameterIsNotNull(list3, "labels");
        this.promotionId = str;
        this.gid = str2;
        this.title = str3;
        this.image = urlModel;
        this.price = i;
        this.itemType = i2;
        this.images = list;
        this.traceAuthorId = str4;
        this.traceAwemeId = str5;
        this.elasticImages = list2;
        this.labels = list3;
        this.commodityType = i3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ f(java.lang.String r16, java.lang.String r17, java.lang.String r18, com.ss.android.ugc.aweme.base.model.UrlModel r19, int r20, int r21, java.util.List r22, java.lang.String r23, java.lang.String r24, java.util.List r25, java.util.List r26, int r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r15 = this;
            r0 = r28
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000a
            java.lang.String r1 = ""
            r3 = r1
            goto L_0x000c
        L_0x000a:
            r3 = r16
        L_0x000c:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0014
            java.lang.String r1 = ""
            r4 = r1
            goto L_0x0016
        L_0x0014:
            r4 = r17
        L_0x0016:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x001e
            java.lang.String r1 = ""
            r5 = r1
            goto L_0x0020
        L_0x001e:
            r5 = r18
        L_0x0020:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002a
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            r9 = r1
            goto L_0x002c
        L_0x002a:
            r9 = r22
        L_0x002c:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0034
            java.lang.String r1 = ""
            r10 = r1
            goto L_0x0036
        L_0x0034:
            r10 = r23
        L_0x0036:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003e
            java.lang.String r1 = ""
            r11 = r1
            goto L_0x0040
        L_0x003e:
            r11 = r24
        L_0x0040:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x004a
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            r12 = r1
            goto L_0x004c
        L_0x004a:
            r12 = r25
        L_0x004c:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0056
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            r13 = r1
            goto L_0x0058
        L_0x0056:
            r13 = r26
        L_0x0058:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x005f
            r0 = -1
            r14 = -1
            goto L_0x0061
        L_0x005f:
            r14 = r27
        L_0x0061:
            r2 = r15
            r6 = r19
            r7 = r20
            r8 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.footprint.f.<init>(java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.base.model.UrlModel, int, int, java.util.List, java.lang.String, java.lang.String, java.util.List, java.util.List, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
