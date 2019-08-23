package com.ss.android.ugc.aweme.music.ui.b;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.music.api.MusicAwemeApi;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.OriginalMusicList;
import java.util.List;
import java.util.concurrent.Callable;

public final class b extends a<Music, OriginalMusicList> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56668a;

    public final List<Music> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((OriginalMusicList) this.mData).musicList;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((OriginalMusicList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 2) {
            return false;
        }
        return true;
    }

    public final void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f56668a, false, 60571, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f56668a, false, 60571, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(objArr[1], 0, 10);
    }

    public final void loadMoreList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f56668a, false, 60572, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f56668a, false, 60572, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(objArr[1], ((OriginalMusicList) this.mData).cursor, 10);
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        OriginalMusicList originalMusicList = (OriginalMusicList) obj;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{originalMusicList}, this, f56668a, false, 60573, new Class[]{OriginalMusicList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{originalMusicList}, this, f56668a, false, 60573, new Class[]{OriginalMusicList.class}, Void.TYPE);
            return;
        }
        if (originalMusicList == null || CollectionUtils.isEmpty(originalMusicList.musicList)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = originalMusicList;
            } else if (i == 4) {
                ((OriginalMusicList) this.mData).musicList.addAll(originalMusicList.musicList);
                ((OriginalMusicList) this.mData).cursor = originalMusicList.cursor;
                OriginalMusicList originalMusicList2 = (OriginalMusicList) this.mData;
                if (!originalMusicList.hasMore || !((OriginalMusicList) this.mData).hasMore) {
                    z2 = false;
                }
                originalMusicList2.hasMore = z2;
            }
        } else {
            if (this.mData != null) {
                ((OriginalMusicList) this.mData).hasMore = false;
            }
        }
    }

    private void a(final String str, int i, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), 10}, this, f56668a, false, 60574, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), 10}, this, f56668a, false, 60574, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        final int i3 = i;
        m.a().a(this.mHandler, new Callable(10) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56669a;

            public final Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f56669a, false, 60575, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f56669a, false, 60575, new Class[0], Object.class);
                }
                String str = str;
                int i = i3;
                int i2 = 10;
                if (!PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2)}, null, MusicAwemeApi.f56296a, true, 59998, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, OriginalMusicList.class)) {
                    return (OriginalMusicList) MusicAwemeApi.f56297b.fetchOriginalMusicList(str, i, i2).get();
                }
                return (OriginalMusicList) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2)}, null, MusicAwemeApi.f56296a, true, 59998, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, OriginalMusicList.class);
            }
        }, 0);
    }
}
