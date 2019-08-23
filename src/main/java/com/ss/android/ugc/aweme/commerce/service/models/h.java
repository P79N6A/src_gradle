package com.ss.android.ugc.aweme.commerce.service.models;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u00100\u001a\u00020\u000bJ\u0006\u00101\u001a\u00020\u000bR&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R \u0010'\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR \u0010*\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010\u001dR \u0010-\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001d¨\u00062"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/DetailPromotion;", "Lcom/ss/android/ugc/aweme/commerce/service/models/BaseDetailPromotion;", "()V", "activity", "Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionActivity;", "activity$annotations", "getActivity", "()Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionActivity;", "setActivity", "(Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionActivity;)V", "hasGuessULike", "", "getHasGuessULike", "()Ljava/lang/Boolean;", "setHasGuessULike", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "marketFloors", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionMarketFloor;", "getMarketFloors", "()Ljava/util/List;", "setMarketFloors", "(Ljava/util/List;)V", "originMediaId", "", "getOriginMediaId", "()Ljava/lang/String;", "setOriginMediaId", "(Ljava/lang/String;)V", "originUserId", "getOriginUserId", "setOriginUserId", "rank", "", "getRank", "()I", "setRank", "(I)V", "rankText", "getRankText", "setRankText", "rankUrl", "getRankUrl", "setRankUrl", "secOriginUserId", "getSecOriginUserId", "setSecOriginUserId", "hasGoodRankInfo", "isSelf", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class h extends c {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity")
    @Nullable
    private o activity;
    @SerializedName("has_gyl")
    @Nullable
    private Boolean hasGuessULike = Boolean.TRUE;
    @SerializedName("marketing_floors")
    @Nullable
    private List<PromotionMarketFloor> marketFloors = CollectionsKt.emptyList();
    @SerializedName("origin_media_id")
    @Nullable
    private String originMediaId = "";
    @SerializedName("origin_user_id")
    @Nullable
    private String originUserId = "";
    @SerializedName("rank")
    private int rank;
    @SerializedName("rank_text")
    @Nullable
    private String rankText = "";
    @SerializedName("rank_url")
    @Nullable
    private String rankUrl = "";
    @SerializedName("sec_origin_user_id")
    @Nullable
    private String secOriginUserId = "";

    @Deprecated(message = "use PromotionDynamicInfoResponse`s activity!")
    public static /* synthetic */ void activity$annotations() {
    }

    @Nullable
    public final o getActivity() {
        return this.activity;
    }

    @Nullable
    public final Boolean getHasGuessULike() {
        return this.hasGuessULike;
    }

    @Nullable
    public final List<PromotionMarketFloor> getMarketFloors() {
        return this.marketFloors;
    }

    @Nullable
    public final String getOriginMediaId() {
        return this.originMediaId;
    }

    @Nullable
    public final String getOriginUserId() {
        return this.originUserId;
    }

    public final int getRank() {
        return this.rank;
    }

    @Nullable
    public final String getRankText() {
        return this.rankText;
    }

    @Nullable
    public final String getRankUrl() {
        return this.rankUrl;
    }

    @Nullable
    public final String getSecOriginUserId() {
        return this.secOriginUserId;
    }

    public final boolean hasGoodRankInfo() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29832, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29832, new Class[0], Boolean.TYPE)).booleanValue();
        }
        List<PromotionMarketFloor> list = this.marketFloors;
        if (list != null && !list.isEmpty()) {
            z = true;
        }
        return z;
    }

    public final boolean isSelf() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29831, new Class[0], Boolean.TYPE)) {
            return TextUtils.isEmpty(this.originUserId);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29831, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void setActivity(@Nullable o oVar) {
        this.activity = oVar;
    }

    public final void setHasGuessULike(@Nullable Boolean bool) {
        this.hasGuessULike = bool;
    }

    public final void setMarketFloors(@Nullable List<PromotionMarketFloor> list) {
        this.marketFloors = list;
    }

    public final void setOriginMediaId(@Nullable String str) {
        this.originMediaId = str;
    }

    public final void setOriginUserId(@Nullable String str) {
        this.originUserId = str;
    }

    public final void setRank(int i) {
        this.rank = i;
    }

    public final void setRankText(@Nullable String str) {
        this.rankText = str;
    }

    public final void setRankUrl(@Nullable String str) {
        this.rankUrl = str;
    }

    public final void setSecOriginUserId(@Nullable String str) {
        this.secOriginUserId = str;
    }
}
