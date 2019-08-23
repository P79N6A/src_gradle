package com.ss.android.ugc.aweme.feed.param;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;

public class b implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String accountType;
    private String aid;
    private String cellId;
    private String challengeId;
    private String challengeProfileFrom;
    private String cid;
    private String contentSource;
    private int count;
    private int cursor;
    private String enterFromRequestId;
    private String enterMethodValue = "click";
    private String eventType;
    private String feedsAwemeId;
    private String from;
    private boolean fromAdsActivity;
    private String hashTagName;
    private String hotSearch;
    private String ids;
    private int index;
    private boolean isAdSpot;
    private boolean isFromPostList;
    private boolean isMyProfile;
    private boolean isRecommend;
    private String likeEnterMethod;
    private String microAppId;
    private String musicId;
    private int pageType;
    private String poiId;
    private String previousPage;
    private String previousPagePosition = "other_places";
    private String productId;
    private String promotionId;
    private String pushParams;
    private String queryAwemeMode;
    private String relatedId;
    private String searchKeyword;
    private String shareUserId;
    private boolean showCommentAfterOpen;
    private boolean showShareAfterOpen;
    private boolean showVote;
    private String stickerId;
    private String tabName;
    private int taskType;
    private String topCommentId;
    private int type;
    private String uid;
    private long videoCurrentPosition;
    private int videoType;

    public String getAccountType() {
        return this.accountType;
    }

    public String getAid() {
        return this.aid;
    }

    public String getCellId() {
        return this.cellId;
    }

    public String getChallengeId() {
        return this.challengeId;
    }

    public String getChallengeProfileFrom() {
        return this.challengeProfileFrom;
    }

    public String getCid() {
        return this.cid;
    }

    public String getContentSource() {
        return this.contentSource;
    }

    public int getCount() {
        return this.count;
    }

    public int getCursor() {
        return this.cursor;
    }

    public String getEnterFromRequestId() {
        return this.enterFromRequestId;
    }

    public String getEnterMethodValue() {
        return this.enterMethodValue;
    }

    public String getEventType() {
        return this.eventType;
    }

    public String getFeedsAwemeId() {
        return this.feedsAwemeId;
    }

    public String getFrom() {
        return this.from;
    }

    public String getHashTagName() {
        return this.hashTagName;
    }

    public String getHotSearch() {
        return this.hotSearch;
    }

    public String getIds() {
        return this.ids;
    }

    public int getIndex() {
        return this.index;
    }

    public String getLikeEnterMethod() {
        return this.likeEnterMethod;
    }

    public String getMicroAppId() {
        return this.microAppId;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public int getPageType() {
        return this.pageType;
    }

    public String getPoiId() {
        return this.poiId;
    }

    public String getPreviousPage() {
        return this.previousPage;
    }

    public String getPreviousPagePosition() {
        return this.previousPagePosition;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getPromotionId() {
        return this.promotionId;
    }

    public String getPushParams() {
        return this.pushParams;
    }

    public String getQueryAwemeMode() {
        return this.queryAwemeMode;
    }

    public String getRelatedId() {
        return this.relatedId;
    }

    public String getSearchKeyword() {
        return this.searchKeyword;
    }

    public String getShareUserId() {
        return this.shareUserId;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public String getTabName() {
        return this.tabName;
    }

    public int getTaskType() {
        return this.taskType;
    }

    public String getTopCommentId() {
        return this.topCommentId;
    }

    public int getType() {
        return this.type;
    }

    public String getUid() {
        return this.uid;
    }

    public long getVideoCurrentPosition() {
        return this.videoCurrentPosition;
    }

    public int getVideoType() {
        return this.videoType;
    }

    public boolean isAdSpot() {
        return this.isAdSpot;
    }

    public boolean isFromAdsActivity() {
        return this.fromAdsActivity;
    }

    public boolean isFromPostList() {
        return this.isFromPostList;
    }

    public boolean isMyProfile() {
        return this.isMyProfile;
    }

    public boolean isRecommend() {
        return this.isRecommend;
    }

    public boolean isShowCommentAfterOpen() {
        return this.showCommentAfterOpen;
    }

    public boolean isShowShareAfterOpen() {
        return this.showShareAfterOpen;
    }

    public boolean isShowVote() {
        return this.showVote;
    }

    public boolean hasTask() {
        if (this.taskType != 0) {
            return true;
        }
        return false;
    }

    public boolean isHotSpot() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41955, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41955, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(this.hotSearch)) {
            z = true;
        }
        return z;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41957, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41957, new Class[0], String.class);
        }
        return "FeedParam{aid='" + this.aid + '\'' + ", ids='" + this.ids + '\'' + ", from='" + this.from + '\'' + ", cid='" + this.cid + '\'' + ", poiId='" + this.poiId + '\'' + ", enterFromRequestId='" + this.enterFromRequestId + '\'' + ", previousPage='" + this.previousPage + '\'' + ", isMyProfile=" + this.isMyProfile + ", isFromPostList=" + this.isFromPostList + ", shareUserId='" + this.shareUserId + '\'' + ", challengeProfileFrom='" + this.challengeProfileFrom + '\'' + ", likeEnterMethod='" + this.likeEnterMethod + '\'' + ", contentSource='" + this.contentSource + '\'' + ", previousPagePosition='" + this.previousPagePosition + '\'' + ", searchKeyword='" + this.searchKeyword + '\'' + ", pageType=" + this.pageType + ", eventType='" + this.eventType + '\'' + ", uid='" + this.uid + '\'' + ", musicId='" + this.musicId + '\'' + ", challengeId='" + this.challengeId + '\'' + ", enterMethodValue='" + this.enterMethodValue + '\'' + ", videoType=" + this.videoType + ", queryAwemeMode='" + this.queryAwemeMode + '\'' + ", accountType='" + this.accountType + '\'' + ", tabName='" + this.tabName + '\'' + ", pushParams='" + this.pushParams + '\'' + ", promotionId='" + this.promotionId + '\'' + ", productId='" + this.productId + '\'' + ", relatedId='" + this.relatedId + '\'' + ", videoCurrentPosition='" + this.videoCurrentPosition + '\'' + '}';
    }

    public b setAccountType(String str) {
        this.accountType = str;
        return this;
    }

    public b setAdSpot(boolean z) {
        this.isAdSpot = z;
        return this;
    }

    public b setAid(String str) {
        this.aid = str;
        return this;
    }

    public b setCellId(String str) {
        this.cellId = str;
        return this;
    }

    public b setChallengeId(String str) {
        this.challengeId = str;
        return this;
    }

    public b setChallengeProfileFrom(String str) {
        this.challengeProfileFrom = str;
        return this;
    }

    public b setCid(String str) {
        this.cid = str;
        return this;
    }

    public b setContentSource(String str) {
        this.contentSource = str;
        return this;
    }

    public b setCount(int i) {
        this.count = i;
        return this;
    }

    public b setCursor(int i) {
        this.cursor = i;
        return this;
    }

    public b setEnterFromRequestId(String str) {
        this.enterFromRequestId = str;
        return this;
    }

    public b setEventType(String str) {
        this.eventType = str;
        return this;
    }

    public b setFeedsAwemeId(String str) {
        this.feedsAwemeId = str;
        return this;
    }

    public b setFrom(String str) {
        this.from = str;
        return this;
    }

    public b setFromAdsActivity(boolean z) {
        this.fromAdsActivity = z;
        return this;
    }

    public b setFromPostList(boolean z) {
        this.isFromPostList = z;
        return this;
    }

    public b setHashTagName(String str) {
        this.hashTagName = str;
        return this;
    }

    public b setHotSearch(String str) {
        this.hotSearch = str;
        return this;
    }

    public b setIds(String str) {
        this.ids = str;
        return this;
    }

    public b setIndex(int i) {
        this.index = i;
        return this;
    }

    public b setLikeEnterMethod(String str) {
        this.likeEnterMethod = str;
        return this;
    }

    public b setMicroAppId(String str) {
        this.microAppId = str;
        return this;
    }

    public b setMusicId(String str) {
        this.musicId = str;
        return this;
    }

    public b setMyProfile(boolean z) {
        this.isMyProfile = z;
        return this;
    }

    public b setPageType(int i) {
        this.pageType = i;
        return this;
    }

    public b setPoiId(String str) {
        this.poiId = str;
        return this;
    }

    public b setPreviousPage(String str) {
        this.previousPage = str;
        return this;
    }

    public b setPreviousPagePosition(String str) {
        this.previousPagePosition = str;
        return this;
    }

    public b setProductId(String str) {
        this.productId = str;
        return this;
    }

    public b setPromotionId(String str) {
        this.promotionId = str;
        return this;
    }

    public b setPushParams(String str) {
        this.pushParams = str;
        return this;
    }

    public b setQueryAwemeMode(String str) {
        this.queryAwemeMode = str;
        return this;
    }

    public b setRecommend(boolean z) {
        this.isRecommend = z;
        return this;
    }

    public b setRelatedId(String str) {
        this.relatedId = str;
        return this;
    }

    public b setSearchKeyword(String str) {
        this.searchKeyword = str;
        return this;
    }

    public b setShareUserId(String str) {
        this.shareUserId = str;
        return this;
    }

    public b setShowCommentAfterOpen(boolean z) {
        this.showCommentAfterOpen = z;
        return this;
    }

    public b setShowShareAfterOpen(boolean z) {
        this.showShareAfterOpen = z;
        return this;
    }

    public b setShowVote(boolean z) {
        this.showVote = z;
        return this;
    }

    public b setStickerId(String str) {
        this.stickerId = str;
        return this;
    }

    public b setTabName(String str) {
        this.tabName = str;
        return this;
    }

    public b setTaskType(int i) {
        this.taskType = i;
        return this;
    }

    public b setTopCommentId(String str) {
        this.topCommentId = str;
        return this;
    }

    public b setType(int i) {
        this.type = i;
        return this;
    }

    public b setUid(String str) {
        this.uid = str;
        return this;
    }

    public b setVideoCurrentPosition(long j) {
        this.videoCurrentPosition = j;
        return this;
    }

    public b setVideoType(int i) {
        this.videoType = i;
        return this;
    }

    public b setEnterMethodValue(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 41956, new Class[]{String.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 41956, new Class[]{String.class}, b.class);
        }
        if (!TextUtils.isEmpty(str)) {
            this.enterMethodValue = str;
        }
        return this;
    }
}
