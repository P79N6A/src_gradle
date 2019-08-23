package com.ss.android.ugc.aweme.discover.model;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 %2\u00020\u0001:\u0001%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u000bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010\u0004¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/DiscoverItemData;", "Ljava/io/Serializable;", "type", "", "(I)V", "bannerList", "", "Lcom/ss/android/ugc/aweme/discover/model/Banner;", "getBannerList", "()Ljava/util/List;", "setBannerList", "(Ljava/util/List;)V", "categoryOrAd", "Lcom/ss/android/ugc/aweme/discover/model/CategoryOrAd;", "getCategoryOrAd", "()Lcom/ss/android/ugc/aweme/discover/model/CategoryOrAd;", "setCategoryOrAd", "(Lcom/ss/android/ugc/aweme/discover/model/CategoryOrAd;)V", "hotSearchResponse", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchListResponse;", "getHotSearchResponse", "()Lcom/ss/android/ugc/aweme/discover/model/HotSearchListResponse;", "setHotSearchResponse", "(Lcom/ss/android/ugc/aweme/discover/model/HotSearchListResponse;)V", "hotSearchVideos", "Lcom/ss/android/ugc/aweme/discover/model/HotVideoItem;", "getHotSearchVideos", "setHotSearchVideos", "rankingListCover", "Lcom/ss/android/ugc/aweme/discover/model/RankingListCover;", "getRankingListCover", "()Lcom/ss/android/ugc/aweme/discover/model/RankingListCover;", "setRankingListCover", "(Lcom/ss/android/ugc/aweme/discover/model/RankingListCover;)V", "getType", "()I", "setType", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DiscoverItemData implements Serializable {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 42;
    @Nullable
    private List<? extends Banner> bannerList;
    @Nullable
    private CategoryOrAd categoryOrAd;
    @Nullable
    private HotSearchListResponse hotSearchResponse;
    @Nullable
    private List<? extends HotVideoItem> hotSearchVideos;
    @Nullable
    private RankingListCover rankingListCover;
    private int type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/DiscoverItemData$Companion;", "Ljava/io/Serializable;", "()V", "TYPE_BANNER", "", "TYPE_CATEGORY_OR_AD", "TYPE_ERROR_DATA", "TYPE_HOT_SEARCH_VIDEO", "TYPE_HOT_SEARCH_WORD", "TYPE_RANKING_LIST_COVER", "serialVersionUID", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class Companion implements Serializable {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Nullable
    public final List<Banner> getBannerList() {
        return this.bannerList;
    }

    @Nullable
    public final CategoryOrAd getCategoryOrAd() {
        return this.categoryOrAd;
    }

    @Nullable
    public final HotSearchListResponse getHotSearchResponse() {
        return this.hotSearchResponse;
    }

    @Nullable
    public final List<HotVideoItem> getHotSearchVideos() {
        return this.hotSearchVideos;
    }

    @Nullable
    public final RankingListCover getRankingListCover() {
        return this.rankingListCover;
    }

    public final int getType() {
        return this.type;
    }

    public final void setBannerList(@Nullable List<? extends Banner> list) {
        this.bannerList = list;
    }

    public final void setCategoryOrAd(@Nullable CategoryOrAd categoryOrAd2) {
        this.categoryOrAd = categoryOrAd2;
    }

    public final void setHotSearchResponse(@Nullable HotSearchListResponse hotSearchListResponse) {
        this.hotSearchResponse = hotSearchListResponse;
    }

    public final void setHotSearchVideos(@Nullable List<? extends HotVideoItem> list) {
        this.hotSearchVideos = list;
    }

    public final void setRankingListCover(@Nullable RankingListCover rankingListCover2) {
        this.rankingListCover = rankingListCover2;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public DiscoverItemData(int i) {
        this.type = i;
    }
}
