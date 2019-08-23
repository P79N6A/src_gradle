package com.ss.android.ugc.aweme.music.presenter;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.api.MusicAwemeApi;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.util.d;
import java.util.List;
import java.util.concurrent.Callable;

public final class j extends a<Aweme, MusicAwemeList> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56353a;

    /* renamed from: b  reason: collision with root package name */
    private int f56354b;

    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((MusicAwemeList) this.mData).items;
    }

    public final boolean isHasMore() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f56353a, false, 60035, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f56353a, false, 60035, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mData != null && ((MusicAwemeList) this.mData).isHasMore()) {
            z = true;
        }
        return z;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length < 3) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        long j;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f56353a, false, 60032, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f56353a, false, 60032, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        String str = objArr[1];
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((MusicAwemeList) this.mData).cursor;
        }
        a(str, j, 20, objArr[2].intValue());
    }

    public final void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f56353a, false, 60031, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f56353a, false, 60031, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(objArr[1], 0, 20, objArr[2].intValue());
    }

    public final void setItems(List<Aweme> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f56353a, false, 60036, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f56353a, false, 60036, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (this.mData == null) {
            this.mData = new MusicAwemeList();
        }
        ((MusicAwemeList) this.mData).hasMore = 1;
        ((MusicAwemeList) this.mData).items = list;
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        MusicAwemeList musicAwemeList = (MusicAwemeList) obj;
        if (PatchProxy.isSupport(new Object[]{musicAwemeList}, this, f56353a, false, 60034, new Class[]{MusicAwemeList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicAwemeList}, this, f56353a, false, 60034, new Class[]{MusicAwemeList.class}, Void.TYPE);
            return;
        }
        if (musicAwemeList == null || CollectionUtils.isEmpty(musicAwemeList.items)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int size = musicAwemeList.items.size();
            for (int i = 0; i < size; i++) {
                Aweme a2 = com.ss.android.ugc.aweme.feed.a.a().a(musicAwemeList.items.get(i));
                com.ss.android.ugc.aweme.feed.a a3 = com.ss.android.ugc.aweme.feed.a.a();
                a3.a(a2.getAid() + (this.f56354b + 4000), musicAwemeList.getRequestId(), i);
                musicAwemeList.items.set(i, a2);
            }
            int i2 = this.mListQueryType;
            if (i2 == 1) {
                this.mData = musicAwemeList;
            } else if (i2 == 4) {
                ((MusicAwemeList) this.mData).items.addAll(musicAwemeList.items);
                ((MusicAwemeList) this.mData).cursor = musicAwemeList.cursor;
                ((MusicAwemeList) this.mData).hasMore = musicAwemeList.hasMore & ((MusicAwemeList) this.mData).hasMore;
            }
        } else {
            if (this.mData == null) {
                this.mData = new MusicAwemeList();
            }
            if (musicAwemeList == null) {
                ((MusicAwemeList) this.mData).hasMore = 0;
                return;
            }
            ((MusicAwemeList) this.mData).cursor = musicAwemeList.cursor;
            ((MusicAwemeList) this.mData).hasMore = musicAwemeList.hasMore;
        }
    }

    private void a(String str, long j, int i, int i2) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j2), 20, Integer.valueOf(i2)}, this, f56353a, false, 60033, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, new Long(j2), 20, Integer.valueOf(i2)}, this, f56353a, false, 60033, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f56354b = i2;
        if (!TextUtils.isEmpty(str) && str2.endsWith(" ")) {
            d.b(str);
        }
        m a2 = m.a();
        WeakHandler weakHandler = this.mHandler;
        final String str3 = str;
        final long j3 = j;
        final int i3 = i2;
        AnonymousClass1 r0 = new Callable(20) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56355a;

            public final Object call() throws Exception {
                String str;
                if (PatchProxy.isSupport(new Object[0], this, f56355a, false, 60037, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f56355a, false, 60037, new Class[0], Object.class);
                }
                String str2 = str3;
                long j = j3;
                int i = 20;
                int i2 = i3;
                Object[] objArr = {str2, new Long(j), Integer.valueOf(i), Integer.valueOf(i2)};
                if (PatchProxy.isSupport(objArr, null, MusicAwemeApi.f56296a, true, 59999, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE}, MusicAwemeList.class)) {
                    Object[] objArr2 = {str2, new Long(j), Integer.valueOf(i), Integer.valueOf(i2)};
                    return (MusicAwemeList) PatchProxy.accessDispatch(objArr2, null, MusicAwemeApi.f56296a, true, 59999, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE}, MusicAwemeList.class);
                }
                if (i2 == 0) {
                    str = "https://aweme.snssdk.com/aweme/v1/music/aweme/";
                } else {
                    str = "https://aweme.snssdk.com/aweme/v1/music/fresh/aweme/";
                }
                String str3 = str;
                MusicAwemeApi.MusicService musicService = MusicAwemeApi.f56297b;
                if (str2 != null) {
                    str2 = str2.trim();
                }
                return (MusicAwemeList) musicService.queryMusicAwemeList(str3, str2, j, i, i2).get();
            }
        };
        a2.a(weakHandler, r0, 0);
    }
}
