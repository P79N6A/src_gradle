package com.ss.android.ugc.aweme.feed.h;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.feed.api.UserPreferApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public final class af extends a<Aweme, FeedItemList> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45466a;

    public final List<Aweme> getItems() {
        if (PatchProxy.isSupport(new Object[0], this, f45466a, false, 42095, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f45466a, false, 42095, new Class[0], List.class);
        } else if (this.mData == null) {
            return Collections.emptyList();
        } else {
            return ((FeedItemList) getData()).items;
        }
    }

    public final boolean isDataEmpty() {
        if (PatchProxy.isSupport(new Object[0], this, f45466a, false, 42096, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f45466a, false, 42096, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mData == null) {
            return true;
        } else {
            return CollectionUtils.isEmpty(((FeedItemList) this.mData).items);
        }
    }

    public final boolean isHasMore() {
        if (!PatchProxy.isSupport(new Object[0], this, f45466a, false, 42094, new Class[0], Boolean.TYPE)) {
            return ((FeedItemList) this.mData).isHasMore();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f45466a, false, 42094, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr.length < 2) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f45466a, false, 42092, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f45466a, false, 42092, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(objArr[1], ((FeedItemList) this.mData).pageId);
    }

    public final void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f45466a, false, 42091, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f45466a, false, 42091, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(objArr[1], 0);
    }

    public final /* synthetic */ void handleData(Object obj) {
        FeedItemList feedItemList = (FeedItemList) obj;
        if (PatchProxy.isSupport(new Object[]{feedItemList}, this, f45466a, false, 42093, new Class[]{FeedItemList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItemList}, this, f45466a, false, 42093, new Class[]{FeedItemList.class}, Void.TYPE);
            return;
        }
        int i = this.mListQueryType;
        if (i != 1) {
            if (!(i != 4 || feedItemList == null || feedItemList.items == null)) {
                ((FeedItemList) this.mData).items.addAll(feedItemList.items);
                ((FeedItemList) this.mData).hasMore = feedItemList.hasMore;
                ((FeedItemList) this.mData).pageId = feedItemList.pageId;
            }
            return;
        }
        this.mData = feedItemList;
    }

    private void a(final String str, final int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f45466a, false, 42097, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f45466a, false, 42097, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        m.a().a(this.mHandler, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f45467a;

            public final Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f45467a, false, 42098, new Class[0], Object.class)) {
                    return UserPreferApi.a(str, i);
                }
                return PatchProxy.accessDispatch(new Object[0], this, f45467a, false, 42098, new Class[0], Object.class);
            }
        }, 0);
    }
}
