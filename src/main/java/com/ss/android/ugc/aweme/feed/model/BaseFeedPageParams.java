package com.ss.android.ugc.aweme.feed.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.param.b;

public class BaseFeedPageParams {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int awemeFromPage;
    public String cid;
    public String eventType;
    public boolean isFromPostList;
    public boolean isMyProfile;
    public int pageType;
    public b param = new b();
    public boolean showVote;

    public static BaseFeedPageParams newBuilder() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 41444, new Class[0], BaseFeedPageParams.class)) {
            return (BaseFeedPageParams) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 41444, new Class[0], BaseFeedPageParams.class);
        }
        return new BaseFeedPageParams();
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41445, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41445, new Class[0], String.class);
        }
        return "BaseFeedPageParams{awemeFromPage=" + this.awemeFromPage + ", eventType='" + this.eventType + '\'' + ", isMyProfile=" + this.isMyProfile + ", isFromPostList=" + this.isFromPostList + ", pageType=" + this.pageType + '}';
    }

    public BaseFeedPageParams setAwemeFromPage(int i) {
        this.awemeFromPage = i;
        return this;
    }

    public BaseFeedPageParams setCid(String str) {
        this.cid = str;
        return this;
    }

    public BaseFeedPageParams setEventType(String str) {
        this.eventType = str;
        return this;
    }

    public BaseFeedPageParams setFromPostList(boolean z) {
        this.isFromPostList = z;
        return this;
    }

    public BaseFeedPageParams setMyProfile(boolean z) {
        this.isMyProfile = z;
        return this;
    }

    public BaseFeedPageParams setPageType(int i) {
        this.pageType = i;
        return this;
    }

    public BaseFeedPageParams setParam(b bVar) {
        this.param = bVar;
        return this;
    }

    public BaseFeedPageParams setShowVote(boolean z) {
        this.showVote = z;
        return this;
    }
}
