package com.ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionOtherInfo;", "Ljava/io/Serializable;", "()V", "cardPredictDuration", "", "getCardPredictDuration", "()I", "setCardPredictDuration", "(I)V", "isOrderShareRecommend", "", "()Z", "setOrderShareRecommend", "(Z)V", "recallReason", "", "getRecallReason", "()Ljava/lang/String;", "setRecallReason", "(Ljava/lang/String;)V", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class q implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("card_predict_duration")
    public int cardPredictDuration;
    @SerializedName("order_share_recommend")
    public boolean isOrderShareRecommend;
    @SerializedName("recall_reason")
    @Nullable
    public String recallReason = "";

    public final int getCardPredictDuration() {
        return this.cardPredictDuration;
    }

    @Nullable
    public final String getRecallReason() {
        return this.recallReason;
    }

    public final boolean isOrderShareRecommend() {
        return this.isOrderShareRecommend;
    }

    public final void setCardPredictDuration(int i) {
        this.cardPredictDuration = i;
    }

    public final void setOrderShareRecommend(boolean z) {
        this.isOrderShareRecommend = z;
    }

    public final void setRecallReason(@Nullable String str) {
        this.recallReason = str;
    }
}
