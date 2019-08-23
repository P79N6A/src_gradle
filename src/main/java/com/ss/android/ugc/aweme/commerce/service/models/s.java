package com.ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010*\u001a\u00020+R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001e\u0010\u001e\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001e\u0010!\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\u001e\u0010$\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR \u0010'\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000e¨\u0006,"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/SeckillInfo;", "Ljava/io/Serializable;", "()V", "beginTime", "", "getBeginTime", "()J", "setBeginTime", "(J)V", "cardTitle", "", "getCardTitle", "()Ljava/lang/String;", "setCardTitle", "(Ljava/lang/String;)V", "currentTime", "getCurrentTime", "setCurrentTime", "endTime", "getEndTime", "setEndTime", "leftStock", "", "getLeftStock", "()I", "setLeftStock", "(I)V", "preBeginTime", "getPreBeginTime", "setPreBeginTime", "skuMaxPrice", "getSkuMaxPrice", "setSkuMaxPrice", "skuMinPrice", "getSkuMinPrice", "setSkuMinPrice", "stock", "getStock", "setStock", "title", "getTitle", "setTitle", "canBeShow", "", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class s implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("begin_time")
    private long beginTime;
    @SerializedName("card_title")
    @Nullable
    private String cardTitle = "";
    @SerializedName("current_time")
    private long currentTime;
    @SerializedName("end_time")
    private long endTime;
    @SerializedName("left_stock")
    private int leftStock;
    @SerializedName("pre_begin_time")
    private long preBeginTime;
    @SerializedName("sku_max_price")
    private int skuMaxPrice;
    @SerializedName("sku_min_price")
    private int skuMinPrice;
    @SerializedName("stock")
    private int stock;
    @SerializedName("title")
    @Nullable
    private String title = "";

    public final long getBeginTime() {
        return this.beginTime;
    }

    @Nullable
    public final String getCardTitle() {
        return this.cardTitle;
    }

    public final long getCurrentTime() {
        return this.currentTime;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getLeftStock() {
        return this.leftStock;
    }

    public final long getPreBeginTime() {
        return this.preBeginTime;
    }

    public final int getSkuMaxPrice() {
        return this.skuMaxPrice;
    }

    public final int getSkuMinPrice() {
        return this.skuMinPrice;
    }

    public final int getStock() {
        return this.stock;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final boolean canBeShow() {
        if (this.currentTime != 0) {
            return true;
        }
        return false;
    }

    public final void setBeginTime(long j) {
        this.beginTime = j;
    }

    public final void setCardTitle(@Nullable String str) {
        this.cardTitle = str;
    }

    public final void setCurrentTime(long j) {
        this.currentTime = j;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setLeftStock(int i) {
        this.leftStock = i;
    }

    public final void setPreBeginTime(long j) {
        this.preBeginTime = j;
    }

    public final void setSkuMaxPrice(int i) {
        this.skuMaxPrice = i;
    }

    public final void setSkuMinPrice(int i) {
        this.skuMinPrice = i;
    }

    public final void setStock(int i) {
        this.stock = i;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
