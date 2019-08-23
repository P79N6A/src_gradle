package com.ss.android.ugc.aweme.commerce.service.models;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.service.d.a;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0007R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR \u0010\"\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR\u001e\u0010%\u001a\u00020\u001a8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001eR\u001e\u0010(\u001a\u00020\u001a8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\u0013\u0010+\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b,\u0010\u0007R \u0010-\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0007\"\u0004\b/\u0010\tR \u00100\u001a\u0004\u0018\u0001018\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00066"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/SimplePromotion;", "Lcom/ss/android/ugc/aweme/commerce/service/dto/CommerceBaseResponse;", "Ljava/io/Serializable;", "()V", "cardUrl", "", "getCardUrl", "()Ljava/lang/String;", "setCardUrl", "(Ljava/lang/String;)V", "elasticImages", "", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getElasticImages", "()Ljava/util/List;", "setElasticImages", "(Ljava/util/List;)V", "elasticTitle", "getElasticTitle", "setElasticTitle", "labels", "getLabels", "setLabels", "longTitle", "getLongTitle", "price", "", "getPrice", "()I", "setPrice", "(I)V", "productId", "getProductId", "setProductId", "promotionId", "getPromotionId", "setPromotionId", "promotionSource", "getPromotionSource", "setPromotionSource", "sales", "getSales", "setSales", "shortTitle", "getShortTitle", "title", "getTitle", "setTitle", "visitor", "Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionVisitor;", "getVisitor", "()Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionVisitor;", "setVisitor", "(Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionVisitor;)V", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class x extends a implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("card_url")
    @Nullable
    private String cardUrl = "";
    @SerializedName("elastic_images")
    @Nullable
    private List<? extends UrlModel> elasticImages = CollectionsKt.emptyList();
    @SerializedName("elastic_title")
    @Nullable
    private String elasticTitle = "";
    @SerializedName("label")
    @NotNull
    private List<String> labels = CollectionsKt.emptyList();
    @SerializedName("price")
    private int price;
    @SerializedName("product_id")
    @Nullable
    private String productId = "";
    @SerializedName("promotion_id")
    @Nullable
    private String promotionId = "";
    @SerializedName("promotion_source")
    private int promotionSource;
    @SerializedName("sales")
    private int sales;
    @SerializedName("title")
    @Nullable
    private String title = "";
    @SerializedName("visitor")
    @Nullable
    private PromotionVisitor visitor;

    @Nullable
    public final String getCardUrl() {
        return this.cardUrl;
    }

    @Nullable
    public final List<UrlModel> getElasticImages() {
        return this.elasticImages;
    }

    @Nullable
    public final String getElasticTitle() {
        return this.elasticTitle;
    }

    @NotNull
    public final List<String> getLabels() {
        return this.labels;
    }

    public final int getPrice() {
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

    public final int getPromotionSource() {
        return this.promotionSource;
    }

    public final int getSales() {
        return this.sales;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final PromotionVisitor getVisitor() {
        return this.visitor;
    }

    @Nullable
    public final String getLongTitle() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29880, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29880, new Class[0], String.class);
        } else if (!TextUtils.isEmpty(this.title)) {
            return this.title;
        } else {
            return this.elasticTitle;
        }
    }

    @Nullable
    public final String getShortTitle() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29879, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29879, new Class[0], String.class);
        } else if (TextUtils.isEmpty(this.elasticTitle)) {
            return this.title;
        } else {
            return this.elasticTitle;
        }
    }

    public final void setCardUrl(@Nullable String str) {
        this.cardUrl = str;
    }

    public final void setElasticImages(@Nullable List<? extends UrlModel> list) {
        this.elasticImages = list;
    }

    public final void setElasticTitle(@Nullable String str) {
        this.elasticTitle = str;
    }

    public final void setPrice(int i) {
        this.price = i;
    }

    public final void setProductId(@Nullable String str) {
        this.productId = str;
    }

    public final void setPromotionId(@Nullable String str) {
        this.promotionId = str;
    }

    public final void setPromotionSource(int i) {
        this.promotionSource = i;
    }

    public final void setSales(int i) {
        this.sales = i;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setVisitor(@Nullable PromotionVisitor promotionVisitor) {
        this.visitor = promotionVisitor;
    }

    public final void setLabels(@NotNull List<String> list) {
        List<String> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, changeQuickRedirect, false, 29878, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, changeQuickRedirect, false, 29878, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "<set-?>");
        this.labels = list2;
    }
}
