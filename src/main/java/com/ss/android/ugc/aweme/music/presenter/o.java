package com.ss.android.ugc.aweme.music.presenter;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.music.api.MusicAwemeApi;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicList;
import java.util.List;
import java.util.concurrent.Callable;

public final class o extends a<Music, MusicList> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56379a;

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final List<Music> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((MusicList) this.mData).items;
    }

    public final boolean isHasMore() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f56379a, false, 60070, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f56379a, false, 60070, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mData != null && ((MusicList) this.mData).isHasMore()) {
            z = true;
        }
        return z;
    }

    public final void loadMoreList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f56379a, false, 60067, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f56379a, false, 60067, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a((long) ((MusicList) this.mData).radioCursor, 20);
    }

    public final void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f56379a, false, 60066, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f56379a, false, 60066, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(1, 20);
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        MusicList musicList = (MusicList) obj;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{musicList}, this, f56379a, false, 60069, new Class[]{MusicList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicList}, this, f56379a, false, 60069, new Class[]{MusicList.class}, Void.TYPE);
            return;
        }
        if (musicList == null || CollectionUtils.isEmpty(musicList.items)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = musicList;
            } else if (i == 4) {
                ((MusicList) this.mData).items.addAll(musicList.items);
                ((MusicList) this.mData).cursor = musicList.getCursor();
                ((MusicList) this.mData).radioCursor = musicList.radioCursor;
                MusicList musicList2 = (MusicList) this.mData;
                if (!musicList.isHasMore() || !((MusicList) this.mData).isHasMore()) {
                    z2 = false;
                }
                musicList2.setHasMore(z2);
            }
        } else {
            if (this.mData != null) {
                ((MusicList) this.mData).setHasMore(false);
            }
        }
    }

    private void a(long j, int i) {
        final long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), 20}, this, f56379a, false, 60068, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), 20}, this, f56379a, false, 60068, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        m.a().a(this.mHandler, new Callable(20) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56380a;

            public final Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f56380a, false, 60071, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f56380a, false, 60071, new Class[0], Object.class);
                }
                long j = j2;
                int i = 20;
                if (!PatchProxy.isSupport(new Object[]{new Long(j), Integer.valueOf(i)}, null, MusicAwemeApi.f56296a, true, 59990, new Class[]{Long.TYPE, Integer.TYPE}, MusicList.class)) {
                    return (MusicList) MusicAwemeApi.f56297b.fetchMusicHotList(j).get();
                }
                return (MusicList) PatchProxy.accessDispatch(new Object[]{new Long(j), Integer.valueOf(i)}, null, MusicAwemeApi.f56296a, true, 59990, new Class[]{Long.TYPE, Integer.TYPE}, MusicList.class);
            }
        }, 0);
    }
}
