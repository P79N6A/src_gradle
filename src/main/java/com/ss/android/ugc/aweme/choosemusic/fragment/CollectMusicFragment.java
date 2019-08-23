package com.ss.android.ugc.aweme.choosemusic.fragment;

import a.g;
import a.i;
import android.arch.lifecycle.Observer;
import android.support.annotation.CallSuper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.choosemusic.adapter.MusicAdapter;
import com.ss.android.ugc.aweme.choosemusic.b.a;
import com.ss.android.ugc.aweme.choosemusic.d.n;
import com.ss.android.ugc.aweme.choosemusic.f.c;
import com.ss.android.ugc.aweme.choosemusic.view.BaseMusicListView;
import com.ss.android.ugc.aweme.choosemusic.view.PreloadRecyclerViewConverter;
import com.ss.android.ugc.aweme.choosemusic.view.e;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.b;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.ui.p;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;

public class CollectMusicFragment extends BaseMusicListFragment implements a<Music>, LoadMoreRecyclerViewAdapter.a, b.a {
    public static ChangeQuickRedirect i;
    public com.ss.android.ugc.aweme.choosemusic.b.b j;
    private com.ss.android.ugc.aweme.choosemusic.a k;

    public final /* bridge */ /* synthetic */ void a(Object obj, int i2) {
    }

    public final String b() {
        return "user_collected_music_list";
    }

    public final String c() {
        return "refresh_status_user_collected_music";
    }

    public final String d() {
        return "loadmore_status_user_collected_music";
    }

    public final int k() {
        return 1;
    }

    public final String l() {
        return null;
    }

    public final void o() {
    }

    public final View f() {
        if (this.g == null) {
            return null;
        }
        return ((BaseMusicListView) this.g).mRecyclerView;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 26563, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 26563, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.f2829e.b(0, 20);
    }

    @CallSuper
    public final DataCenter e() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 26557, new Class[0], DataCenter.class)) {
            return (DataCenter) PatchProxy.accessDispatch(new Object[0], this, i, false, 26557, new Class[0], DataCenter.class);
        }
        this.f2830f = super.e();
        this.f2830f.a("music_collect_status", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this).a("music_index", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this);
        return this.f2830f;
    }

    /* renamed from: m */
    public final MusicAdapter j() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 26558, new Class[0], MusicAdapter.class)) {
            return (MusicAdapter) PatchProxy.accessDispatch(new Object[0], this, i, false, 26558, new Class[0], MusicAdapter.class);
        } else if (this.g != null) {
            return (MusicAdapter) this.g.d();
        } else {
            return null;
        }
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 26565, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 26565, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2829e != null) {
            this.f2829e.b(0, 20);
        }
    }

    private void p() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 26567, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 26567, new Class[0], Void.TYPE);
            return;
        }
        if (f() instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) f();
            if (recyclerView != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                BaseAdapter d2 = this.g.d();
                if (d2 != null) {
                    List data = d2.getData();
                    if (!CollectionUtils.isEmpty(data)) {
                        for (int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition(); findFirstVisibleItemPosition < findLastVisibleItemPosition; findFirstVisibleItemPosition++) {
                            if (findFirstVisibleItemPosition >= 0 && findFirstVisibleItemPosition < data.size()) {
                                MusicModel musicModel = (MusicModel) data.get(findFirstVisibleItemPosition);
                                if (musicModel != null) {
                                    c.a(this.k, musicModel.getMusicId(), findFirstVisibleItemPosition, true);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 26566, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 26566, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f2829e == null || this.f2830f == null)) {
            com.ss.android.ugc.aweme.arch.b bVar = (com.ss.android.ugc.aweme.arch.b) this.f2830f.a(b());
            if ((this.g instanceof BaseMusicListView) && ((BaseMusicListView) this.g).f36007f) {
                if (this.g != null) {
                    this.g.a();
                }
                com.ss.android.ugc.aweme.choosemusic.d.a aVar = this.f2829e;
                int intValue = ((Integer) bVar.a("list_cursor")).intValue();
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(intValue), 20}, aVar, com.ss.android.ugc.aweme.choosemusic.d.a.f35803a, false, 26734, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    com.ss.android.ugc.aweme.choosemusic.d.a aVar2 = aVar;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(intValue), 20}, aVar2, com.ss.android.ugc.aweme.choosemusic.d.a.f35803a, false, 26734, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else if (!aVar.g) {
                    aVar.g = true;
                    aVar.f35804b.userCollectedMusicList(intValue, 20).a((g<TResult, TContinuationResult>) new n<TResult,TContinuationResult>(aVar), i.f1052b);
                }
            }
        }
    }

    public final com.ss.android.ugc.aweme.arch.c b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, i, false, 26564, new Class[]{View.class}, com.ss.android.ugc.aweme.arch.c.class)) {
            return (com.ss.android.ugc.aweme.arch.c) PatchProxy.accessDispatch(new Object[]{view}, this, i, false, 26564, new Class[]{View.class}, com.ss.android.ugc.aweme.arch.c.class);
        }
        e eVar = new e(getContext(), view, this, this, this, this.h);
        eVar.a((com.ss.android.ugc.aweme.choosemusic.b.b) new com.ss.android.ugc.aweme.choosemusic.b.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35926a;

            public final void a(p.a aVar) {
                if (PatchProxy.isSupport(new Object[]{aVar}, this, f35926a, false, 26574, new Class[]{p.a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aVar}, this, f35926a, false, 26574, new Class[]{p.a.class}, Void.TYPE);
                    return;
                }
                if (CollectMusicFragment.this.j != null) {
                    CollectMusicFragment.this.j.a(aVar);
                }
            }

            public final void b(MusicModel musicModel) {
                if (PatchProxy.isSupport(new Object[]{musicModel}, this, f35926a, false, 26573, new Class[]{MusicModel.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{musicModel}, this, f35926a, false, 26573, new Class[]{MusicModel.class}, Void.TYPE);
                    return;
                }
                if (CollectMusicFragment.this.j != null) {
                    CollectMusicFragment.this.j.b(musicModel);
                }
            }

            public final void a(MusicModel musicModel) {
                if (PatchProxy.isSupport(new Object[]{musicModel}, this, f35926a, false, 26572, new Class[]{MusicModel.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{musicModel}, this, f35926a, false, 26572, new Class[]{MusicModel.class}, Void.TYPE);
                    return;
                }
                if (CollectMusicFragment.this.j != null) {
                    CollectMusicFragment.this.j.a(musicModel);
                }
            }

            public final void a(MusicModel musicModel, com.ss.android.ugc.aweme.choosemusic.a aVar) {
                if (PatchProxy.isSupport(new Object[]{musicModel, aVar}, this, f35926a, false, 26571, new Class[]{MusicModel.class, com.ss.android.ugc.aweme.choosemusic.a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{musicModel, aVar}, this, f35926a, false, 26571, new Class[]{MusicModel.class, com.ss.android.ugc.aweme.choosemusic.a.class}, Void.TYPE);
                    return;
                }
                if (CollectMusicFragment.this.j != null) {
                    CollectMusicFragment.this.j.a(musicModel, aVar);
                }
                if (((Integer) CollectMusicFragment.this.f2830f.b("music_position", -1)).intValue() == -2) {
                    CollectMusicFragment.this.f2830f.a("music_position", (Object) -1);
                    CollectMusicFragment.this.f2830f.a("music_index", (Object) -1);
                }
            }
        });
        this.k = new com.ss.android.ugc.aweme.choosemusic.a("change_music_page", "favorite_song", "", c.a());
        eVar.a(this.k);
        eVar.a(false);
        eVar.a((PreloadRecyclerViewConverter.a) new d(this), 10);
        return eVar;
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.music.a.e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, i, false, 26568, new Class[]{com.ss.android.ugc.aweme.music.a.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, i, false, 26568, new Class[]{com.ss.android.ugc.aweme.music.a.e.class}, Void.TYPE);
            return;
        }
        if (!(this.f2830f == null || eVar == null)) {
            DataCenter dataCenter = this.f2830f;
            com.ss.android.ugc.aweme.choosemusic.a.a aVar = new com.ss.android.ugc.aweme.choosemusic.a.a(0, eVar.f56169a, -1, -1, eVar.f56170b);
            dataCenter.a("music_collect_status", (Object) aVar);
        }
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 26560, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, i, false, 26560, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (z) {
            p();
        }
        if (this.g instanceof e) {
            ((e) this.g).a(z);
        }
    }

    private void c(MusicModel musicModel) {
        if (PatchProxy.isSupport(new Object[]{musicModel}, this, i, false, 26562, new Class[]{MusicModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel}, this, i, false, 26562, new Class[]{MusicModel.class}, Void.TYPE);
        } else if (this.g != null && this.g.d() != null && this.g.d().getData() != null) {
            List data = this.g.d().getData();
            for (int i2 = 0; i2 < data.size(); i2++) {
                if (musicModel.getMusicId().equals(((MusicModel) data.get(i2)).getMusicId())) {
                    data.remove(i2);
                    this.g.d().notifyItemRemoved(i2);
                    if (data.size() == 0) {
                        this.g.c();
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.arch.widgets.base.a r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = i
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r1 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 26559(0x67bf, float:3.7217E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = i
            r3 = 0
            r4 = 26559(0x67bf, float:3.7217E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r1 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            super.onChanged((com.ss.android.ugc.aweme.arch.widgets.base.a) r11)
            boolean r0 = r10.isViewValid()
            if (r0 != 0) goto L_0x003a
            return
        L_0x003a:
            java.lang.String r0 = r11.f34376a
            int r1 = r0.hashCode()
            r2 = -1635157503(0xffffffff9e897a01, float:-1.4555899E-20)
            r3 = -1
            if (r1 == r2) goto L_0x0056
            r2 = 1579846200(0x5e2a8a38, float:3.07217403E18)
            if (r1 == r2) goto L_0x004c
            goto L_0x0060
        L_0x004c:
            java.lang.String r1 = "music_index"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0060
            r0 = 0
            goto L_0x0061
        L_0x0056:
            java.lang.String r1 = "music_collect_status"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0060
            r0 = 1
            goto L_0x0061
        L_0x0060:
            r0 = -1
        L_0x0061:
            switch(r0) {
                case 0: goto L_0x011b;
                case 1: goto L_0x0066;
                default: goto L_0x0064;
            }
        L_0x0064:
            goto L_0x0138
        L_0x0066:
            java.lang.Object r0 = r11.a()
            com.ss.android.ugc.aweme.choosemusic.a.a r0 = (com.ss.android.ugc.aweme.choosemusic.a.a) r0
            int r1 = r0.f35737a
            if (r1 != 0) goto L_0x0138
            int r1 = r0.f35740d
            if (r1 != r8) goto L_0x0115
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r7 = r0.f35741e
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = i
            r3 = 0
            r4 = 26561(0x67c1, float:3.722E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r1 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00a5
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = i
            r3 = 0
            r4 = 26561(0x67c1, float:3.722E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r1 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0138
        L_0x00a5:
            com.ss.android.ugc.aweme.arch.c r0 = r10.g
            if (r0 == 0) goto L_0x0138
            com.ss.android.ugc.aweme.arch.c r0 = r10.g
            com.ss.android.ugc.aweme.common.adapter.BaseAdapter r0 = r0.d()
            if (r0 != 0) goto L_0x00b3
            goto L_0x0138
        L_0x00b3:
            com.ss.android.ugc.aweme.arch.c r0 = r10.g
            com.ss.android.ugc.aweme.common.adapter.BaseAdapter r0 = r0.d()
            java.util.List r0 = r0.getData()
            if (r0 != 0) goto L_0x00c4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x00c4:
            r1 = 0
        L_0x00c5:
            int r2 = r0.size()
            if (r1 >= r2) goto L_0x00e2
            java.lang.Object r2 = r0.get(r1)
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r2 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r2
            java.lang.String r3 = r7.getMusicId()
            java.lang.String r2 = r2.getMusicId()
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0114
            int r1 = r1 + 1
            goto L_0x00c5
        L_0x00e2:
            int r1 = r0.size()
            if (r1 != 0) goto L_0x00f1
            r0.add(r7)
            com.ss.android.ugc.aweme.arch.c r1 = r10.g
            r1.a(r0, r9)
            goto L_0x0138
        L_0x00f1:
            r0.add(r9, r7)
            com.ss.android.ugc.aweme.arch.c r0 = r10.g
            com.ss.android.ugc.aweme.common.adapter.BaseAdapter r0 = r0.d()
            r0.notifyItemInserted(r9)
            com.ss.android.ugc.aweme.arch.c r0 = r10.g
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.choosemusic.view.BaseMusicListView
            if (r0 == 0) goto L_0x0114
            com.ss.android.ugc.aweme.arch.c r0 = r10.g
            com.ss.android.ugc.aweme.choosemusic.view.BaseMusicListView r0 = (com.ss.android.ugc.aweme.choosemusic.view.BaseMusicListView) r0
            android.support.v7.widget.RecyclerView r0 = r0.mRecyclerView
            if (r0 == 0) goto L_0x0114
            com.ss.android.ugc.aweme.arch.c r0 = r10.g
            com.ss.android.ugc.aweme.choosemusic.view.BaseMusicListView r0 = (com.ss.android.ugc.aweme.choosemusic.view.BaseMusicListView) r0
            android.support.v7.widget.RecyclerView r0 = r0.mRecyclerView
            r0.scrollToPosition(r9)
        L_0x0114:
            return
        L_0x0115:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r0.f35741e
            r10.c(r0)
            goto L_0x0138
        L_0x011b:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r10.f2830f
            java.lang.String r1 = "music_position"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.b((java.lang.String) r1, r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = -2
            if (r0 != r1) goto L_0x0138
            com.ss.android.ugc.aweme.choosemusic.adapter.MusicAdapter r0 = r10.j()
            r0.a()
            return
        L_0x0138:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.fragment.CollectMusicFragment.a(com.ss.android.ugc.aweme.arch.widgets.base.a):void");
    }
}
