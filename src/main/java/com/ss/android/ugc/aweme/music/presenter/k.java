package com.ss.android.ugc.aweme.music.presenter;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.music.api.MusicAwemeApi;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class k extends a<Music, CollectedMusicList> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56361a;

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final List<Music> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((CollectedMusicList) this.mData).items;
    }

    public k() {
        CollectedMusicList collectedMusicList = new CollectedMusicList();
        collectedMusicList.items = new ArrayList();
        collectedMusicList.setHasMore(true);
        this.mData = collectedMusicList;
    }

    public final boolean isHasMore() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f56361a, false, 60042, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f56361a, false, 60042, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mData != null && ((CollectedMusicList) this.mData).isHasMore()) {
            z = true;
        }
        return z;
    }

    public final void loadMoreList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f56361a, false, 60039, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f56361a, false, 60039, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(((CollectedMusicList) this.mData).cursor, 10);
    }

    public final void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f56361a, false, 60038, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f56361a, false, 60038, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(0, 12);
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        List list;
        CollectedMusicList collectedMusicList = (CollectedMusicList) obj;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{collectedMusicList}, this, f56361a, false, 60041, new Class[]{CollectedMusicList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{collectedMusicList}, this, f56361a, false, 60041, new Class[]{CollectedMusicList.class}, Void.TYPE);
            return;
        }
        if (collectedMusicList == null || CollectionUtils.isEmpty(collectedMusicList.items)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = collectedMusicList;
            } else if (i == 4) {
                if (this.mData == null) {
                    this.mData = collectedMusicList;
                    return;
                }
                List<Music> list2 = ((CollectedMusicList) this.mData).items;
                List<Music> list3 = collectedMusicList.items;
                List<Music> list4 = ((CollectedMusicList) this.mData).items;
                if (PatchProxy.isSupport(new Object[]{list3, list4}, null, f56361a, true, 60043, new Class[]{List.class, List.class}, List.class)) {
                    list = (List) PatchProxy.accessDispatch(new Object[]{list3, list4}, null, f56361a, true, 60043, new Class[]{List.class, List.class}, List.class);
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Music next : list3) {
                        arrayList.add(next);
                        for (Music mid : list4) {
                            if (next.getMid().equals(mid.getMid())) {
                                arrayList.remove(next);
                            }
                        }
                    }
                    list = arrayList;
                }
                list2.addAll(list);
                ((CollectedMusicList) this.mData).cursor = collectedMusicList.cursor;
                CollectedMusicList collectedMusicList2 = (CollectedMusicList) this.mData;
                if (!collectedMusicList.isHasMore() || !((CollectedMusicList) this.mData).isHasMore()) {
                    z2 = false;
                }
                collectedMusicList2.setHasMore(z2);
            }
        } else {
            if (this.mData != null) {
                ((CollectedMusicList) this.mData).setHasMore(false);
            }
        }
    }

    private void a(final int i, final int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f56361a, false, 60040, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f56361a, false, 60040, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        m.a().a(this.mHandler, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56362a;

            public final Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f56362a, false, 60044, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f56362a, false, 60044, new Class[0], Object.class);
                }
                int i = i;
                int i2 = i2;
                if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, MusicAwemeApi.f56296a, true, 59994, new Class[]{Integer.TYPE, Integer.TYPE}, CollectedMusicList.class)) {
                    return (CollectedMusicList) MusicAwemeApi.f56297b.fetchUserCollectedMusicList(i, i2).get();
                }
                return (CollectedMusicList) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, MusicAwemeApi.f56296a, true, 59994, new Class[]{Integer.TYPE, Integer.TYPE}, CollectedMusicList.class);
            }
        }, 0);
    }
}
