package com.tt.appbrandimpl;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.commercialize.api.GameStationApi;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public class MicroGameVideoModel extends a<Aweme, FeedItemList> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int mPage;
    private int mType;

    public List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((FeedItemList) this.mData).items;
    }

    public boolean isHasMore() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91902, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91902, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mData != null && ((FeedItemList) this.mData).isHasMore()) {
            z = true;
        }
        return z;
    }

    public void setData(FeedItemList feedItemList) {
        this.mData = feedItemList;
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 5) {
            return false;
        }
        return true;
    }

    public void loadMoreList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, changeQuickRedirect, false, 91901, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, changeQuickRedirect, false, 91901, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        fetchVideoList(objArr[1], objArr[2], 10, ((FeedItemList) this.mData).cursor);
    }

    public void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, changeQuickRedirect, false, 91900, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, changeQuickRedirect, false, 91900, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        fetchVideoList(objArr[1], objArr[2], 10, 0);
    }

    public void handleData(FeedItemList feedItemList) {
        boolean z;
        boolean z2;
        int i;
        Aweme aweme;
        if (PatchProxy.isSupport(new Object[]{feedItemList}, this, changeQuickRedirect, false, 91903, new Class[]{FeedItemList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItemList}, this, changeQuickRedirect, false, 91903, new Class[]{FeedItemList.class}, Void.TYPE);
            return;
        }
        if (feedItemList == null || feedItemList.fetchType != 0) {
            z = false;
        } else {
            z = true;
        }
        if (feedItemList == null || CollectionUtils.isEmpty(feedItemList.items)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            int size = feedItemList.items.size();
            for (int i2 = 0; i2 < size; i2++) {
                Aweme aweme2 = feedItemList.items.get(i2);
                if (aweme2 == null) {
                    i = -1;
                } else {
                    i = aweme2.getIsTop();
                }
                if (aweme2 == null || (!aweme2.isSelfSee() && !aweme2.isProhibited())) {
                    aweme = com.ss.android.ugc.aweme.feed.a.a().a(aweme2);
                } else {
                    aweme = com.ss.android.ugc.aweme.feed.a.a().a(aweme2, this.mType);
                }
                if (z && i >= 0) {
                    aweme.setIsTop(i);
                }
                com.ss.android.ugc.aweme.feed.a a2 = com.ss.android.ugc.aweme.feed.a.a();
                a2.a(aweme.getAid() + (this.mPage + this.mType), feedItemList.getRequestId(), i2);
                feedItemList.items.set(i2, aweme);
            }
            int i3 = this.mListQueryType;
            if (i3 == 1) {
                this.mData = feedItemList;
                return;
            } else if (i3 == 4) {
                if (this.mData != null) {
                    if (CollectionUtils.isEmpty(((FeedItemList) this.mData).items)) {
                        ((FeedItemList) this.mData).items = feedItemList.items;
                    } else {
                        ((FeedItemList) this.mData).items.addAll(removeRepeat(feedItemList.items, ((FeedItemList) this.mData).items));
                    }
                    ((FeedItemList) this.mData).maxCursor = feedItemList.maxCursor;
                    ((FeedItemList) this.mData).hasMore = feedItemList.hasMore & ((FeedItemList) this.mData).hasMore;
                    ((FeedItemList) this.mData).cursor = feedItemList.cursor;
                    return;
                }
            } else {
                return;
            }
        } else if (this.mData != null) {
            if (feedItemList != null) {
                ((FeedItemList) this.mData).hasMore = feedItemList.hasMore;
                ((FeedItemList) this.mData).maxCursor = feedItemList.maxCursor;
                ((FeedItemList) this.mData).cursor = feedItemList.cursor;
                return;
            }
            ((FeedItemList) this.mData).hasMore = 0;
            return;
        } else if (feedItemList == null) {
            this.mData = new FeedItemList();
            ((FeedItemList) this.mData).hasMore = 0;
            return;
        }
        this.mData = feedItemList;
    }

    private static List<Aweme> removeRepeat(List<Aweme> list, List<Aweme> list2) {
        if (PatchProxy.isSupport(new Object[]{list, list2}, null, changeQuickRedirect, true, 91905, new Class[]{List.class, List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list, list2}, null, changeQuickRedirect, true, 91905, new Class[]{List.class, List.class}, List.class);
        } else if (list == null || list2 == null) {
            return list;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Aweme next : list) {
                arrayList.add(next);
                Iterator<Aweme> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (TextUtils.equals(next.getAid(), it2.next().getAid())) {
                            arrayList.remove(next);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            return arrayList;
        }
    }

    public void fetchVideoList(String str, String str2, int i, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, str2, Integer.valueOf(i), new Long(j2)}, this, changeQuickRedirect, false, 91904, new Class[]{String.class, String.class, Integer.TYPE, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {str, str2, Integer.valueOf(i), new Long(j2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 91904, new Class[]{String.class, String.class, Integer.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        m a2 = m.a();
        WeakHandler weakHandler = this.mHandler;
        final String str3 = str;
        final String str4 = str2;
        final int i2 = i;
        final long j3 = j;
        AnonymousClass1 r0 = new Callable() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91906, new Class[0], Object.class)) {
                    return GameStationApi.a(str3, str4, (long) i2, j3);
                }
                return PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91906, new Class[0], Object.class);
            }
        };
        a2.a(weakHandler, r0, 0);
    }
}
