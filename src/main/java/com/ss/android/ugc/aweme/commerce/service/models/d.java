package com.ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BS\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J[\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R&\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006."}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/CardPromotion;", "", "elasticTitle", "", "title", "elasticImages", "", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "image", "labels", "visitor", "Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionVisitor;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/ss/android/ugc/aweme/base/model/UrlModel;Ljava/util/List;Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionVisitor;)V", "getElasticImages", "()Ljava/util/List;", "setElasticImages", "(Ljava/util/List;)V", "getElasticTitle", "()Ljava/lang/String;", "setElasticTitle", "(Ljava/lang/String;)V", "getImage", "()Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "setImage", "(Lcom/ss/android/ugc/aweme/base/model/UrlModel;)V", "getLabels", "setLabels", "getTitle", "setTitle", "getVisitor", "()Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionVisitor;", "setVisitor", "(Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionVisitor;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38200a;
    @SerializedName("elastic_title")
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public String f38201b;
    @SerializedName("title")
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public String f38202c;
    @SerializedName("elastic_img")
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public List<? extends UrlModel> f38203d;
    @SerializedName("image")
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public UrlModel f38204e = null;
    @SerializedName("label")
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public List<String> f38205f;
    @SerializedName("visitor")
    @Nullable
    public PromotionVisitor g;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f38200a, false, 29810, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f38200a, false, 29810, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (!Intrinsics.areEqual((Object) this.f38201b, (Object) dVar.f38201b) || !Intrinsics.areEqual((Object) this.f38202c, (Object) dVar.f38202c) || !Intrinsics.areEqual((Object) this.f38203d, (Object) dVar.f38203d) || !Intrinsics.areEqual((Object) this.f38204e, (Object) dVar.f38204e) || !Intrinsics.areEqual((Object) this.f38205f, (Object) dVar.f38205f) || !Intrinsics.areEqual((Object) this.g, (Object) dVar.g)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f38200a, false, 29809, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f38200a, false, 29809, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.f38201b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f38202c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<? extends UrlModel> list = this.f38203d;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        UrlModel urlModel = this.f38204e;
        int hashCode4 = (hashCode3 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        List<String> list2 = this.f38205f;
        int hashCode5 = (hashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31;
        PromotionVisitor promotionVisitor = this.g;
        if (promotionVisitor != null) {
            i = promotionVisitor.hashCode();
        }
        return hashCode5 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f38200a, false, 29808, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f38200a, false, 29808, new Class[0], String.class);
        }
        return "CardPromotion(elasticTitle=" + this.f38201b + ", title=" + this.f38202c + ", elasticImages=" + this.f38203d + ", image=" + this.f38204e + ", labels=" + this.f38205f + ", visitor=" + this.g + ")";
    }

    public d(@Nullable String str, @Nullable String str2, @Nullable List<? extends UrlModel> list, @Nullable UrlModel urlModel, @NotNull List<String> list2, @Nullable PromotionVisitor promotionVisitor) {
        Intrinsics.checkParameterIsNotNull(list2, "labels");
        this.f38201b = str;
        this.f38202c = str2;
        this.f38203d = list;
        this.f38205f = list2;
        this.g = promotionVisitor;
    }
}
