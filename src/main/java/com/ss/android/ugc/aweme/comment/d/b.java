package com.ss.android.ugc.aweme.comment.d;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.model.c;
import com.ss.android.ugc.aweme.profile.model.User;

public class b extends a<b> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private c adCommentStruct;
    private String enterMethod;
    private String eventType;
    private boolean forceOpenReply;
    private boolean forceRefresh;
    private String hintCids;
    private String insertCids;
    private String insertCidsString;
    private boolean isCommentClose;
    private boolean isCommentLimited;
    private boolean isEnableComment;
    private int isLongItem;
    private boolean isMyProfile;
    private boolean isPrivateAweme;
    private String mPlayListId;
    private String mPlayListIdKey;
    private String mPlayListType;
    @Deprecated
    private int pageType;
    private String poiId;
    private String previousPage;
    private String requestId;
    private boolean scrollToTop;
    private boolean showReplyWithInsert;
    private int source;

    public String getEnterMethod() {
        return this.enterMethod;
    }

    public String getEventType() {
        return this.eventType;
    }

    public String getHintCids() {
        return this.hintCids;
    }

    public String getInsertCids() {
        return this.insertCids;
    }

    public int getIsLongItem() {
        return this.isLongItem;
    }

    @Deprecated
    public int getPageType() {
        return this.pageType;
    }

    public String getPlayListId() {
        return this.mPlayListId;
    }

    public String getPlayListIdKey() {
        return this.mPlayListIdKey;
    }

    public String getPlayListType() {
        return this.mPlayListType;
    }

    public String getPoiId() {
        return this.poiId;
    }

    public String getPreviousPage() {
        return this.previousPage;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public int getSource() {
        return this.source;
    }

    public boolean isCommentClose() {
        return this.isCommentClose;
    }

    public boolean isCommentLimited() {
        return this.isCommentLimited;
    }

    public boolean isEnableComment() {
        return this.isEnableComment;
    }

    public boolean isForceOpenReply() {
        return this.forceOpenReply;
    }

    public boolean isForceRefresh() {
        return this.forceRefresh;
    }

    public boolean isMyProfile() {
        return this.isMyProfile;
    }

    public boolean isPrivateAweme() {
        return this.isPrivateAweme;
    }

    public boolean isScrollToTop() {
        return this.scrollToTop;
    }

    public boolean showReplyWithInsertCid() {
        return this.showReplyWithInsert;
    }

    @Nullable
    public c getAdCommentStruct() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 27319, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 27319, new Class[0], c.class);
        } else if (this.adCommentStruct == null) {
            return null;
        } else {
            this.adCommentStruct.setAwemeId(this.aid);
            User user = new User();
            user.setUid(this.authorUid);
            user.setAvatarThumb(this.adCommentStruct.getAvatarIcon());
            this.adCommentStruct.setUser(user);
            this.adCommentStruct.setCommentType(10);
            return this.adCommentStruct;
        }
    }

    public b(String str) {
        super(str);
    }

    public b forceRefresh(boolean z) {
        this.forceRefresh = z;
        return this;
    }

    public b setAdCommentStruct(c cVar) {
        this.adCommentStruct = cVar;
        return this;
    }

    public b setCommentClose(boolean z) {
        this.isCommentClose = z;
        return this;
    }

    public b setCommentLimited(boolean z) {
        this.isCommentLimited = z;
        return this;
    }

    public b setEnableComment(boolean z) {
        this.isEnableComment = z;
        return this;
    }

    public b setEnterMethod(String str) {
        this.enterMethod = str;
        return this;
    }

    public b setEventType(String str) {
        this.eventType = str;
        return this;
    }

    public b setHintCids(String str) {
        this.hintCids = str;
        return this;
    }

    public b setIsLongItem(int i) {
        this.isLongItem = i;
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

    public b setPlayListId(String str) {
        this.mPlayListId = str;
        return this;
    }

    public b setPlayListIdKey(String str) {
        this.mPlayListIdKey = str;
        return this;
    }

    public b setPlayListType(String str) {
        this.mPlayListType = str;
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

    public b setPrivateAweme(boolean z) {
        this.isPrivateAweme = z;
        return this;
    }

    public b setRequestId(String str) {
        this.requestId = str;
        return this;
    }

    public b setScrollToTop(boolean z) {
        this.scrollToTop = z;
        return this;
    }

    public b setSource(int i) {
        this.source = i;
        return this;
    }

    public b setInsertCids(String str, boolean z, boolean z2) {
        this.insertCids = str;
        this.showReplyWithInsert = z;
        this.forceOpenReply = z2;
        return this;
    }
}
