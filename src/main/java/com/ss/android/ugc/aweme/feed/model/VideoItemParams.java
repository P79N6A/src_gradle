package com.ss.android.ugc.aweme.feed.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.c.b;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate;
import com.ss.android.ugc.aweme.commercialize.feed.e;
import org.json.JSONObject;

public class VideoItemParams {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Fragment fragment;
    public boolean isMyProfile;
    public b mAdOpenCallBack;
    public e mAdViewController;
    public Aweme mAweme;
    public String mEnterMethodValue;
    public String mEventType;
    public int mPageType;
    public JSONObject mRequestId;

    public static VideoItemParams newBuilder() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 41490, new Class[0], VideoItemParams.class)) {
            return (VideoItemParams) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 41490, new Class[0], VideoItemParams.class);
        }
        return new VideoItemParams();
    }

    public VideoItemParams setAdOpenCallBack(b bVar) {
        this.mAdOpenCallBack = bVar;
        return this;
    }

    public VideoItemParams setAdViewController(e eVar) {
        this.mAdViewController = eVar;
        return this;
    }

    public VideoItemParams setAweme(Aweme aweme) {
        this.mAweme = aweme;
        return this;
    }

    public VideoItemParams setEnterMethodValue(String str) {
        this.mEnterMethodValue = str;
        return this;
    }

    public VideoItemParams setEventType(String str) {
        this.mEventType = str;
        return this;
    }

    public VideoItemParams setFragment(Fragment fragment2) {
        this.fragment = fragment2;
        return this;
    }

    public VideoItemParams setMyProfile(boolean z) {
        this.isMyProfile = z;
        return this;
    }

    public VideoItemParams setPageType(int i) {
        this.mPageType = i;
        return this;
    }

    public VideoItemParams setRequestId(JSONObject jSONObject) {
        this.mRequestId = jSONObject;
        return this;
    }

    public static VideoItemParams newBuilder(@NonNull BaseFeedPageParams baseFeedPageParams, @Nullable CommerceVideoDelegate commerceVideoDelegate, @NonNull Fragment fragment2, @NonNull String str) {
        BaseFeedPageParams baseFeedPageParams2 = baseFeedPageParams;
        CommerceVideoDelegate commerceVideoDelegate2 = commerceVideoDelegate;
        Fragment fragment3 = fragment2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{baseFeedPageParams2, commerceVideoDelegate2, fragment3, str2}, null, changeQuickRedirect, true, 41491, new Class[]{BaseFeedPageParams.class, CommerceVideoDelegate.class, Fragment.class, String.class}, VideoItemParams.class)) {
            Object[] objArr = {baseFeedPageParams2, commerceVideoDelegate2, fragment3, str2};
            return (VideoItemParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, 41491, new Class[]{BaseFeedPageParams.class, CommerceVideoDelegate.class, Fragment.class, String.class}, VideoItemParams.class);
        }
        VideoItemParams enterMethodValue = new VideoItemParams().setEventType(baseFeedPageParams2.eventType).setMyProfile(baseFeedPageParams2.isMyProfile).setPageType(baseFeedPageParams2.pageType).setFragment(fragment3).setEnterMethodValue(str2);
        if (commerceVideoDelegate2 != null) {
            enterMethodValue.setAdOpenCallBack(commerceVideoDelegate2.v).setAdViewController(commerceVideoDelegate2.o);
        }
        return enterMethodValue;
    }
}
