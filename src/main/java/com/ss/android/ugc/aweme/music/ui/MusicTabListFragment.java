package com.ss.android.ugc.aweme.music.ui;

import a.g;
import a.i;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ac.b;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.choosemusic.view.PreloadRecyclerViewConverter;
import com.ss.android.ugc.aweme.common.f.b;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.music.a.f;
import com.ss.android.ugc.aweme.music.adapter.MusicMixAdapter;
import com.ss.android.ugc.aweme.music.adapter.MusicUnitViewHolder;
import com.ss.android.ugc.aweme.music.adapter.type.d;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.music.presenter.k;
import com.ss.android.ugc.aweme.music.presenter.l;
import com.ss.android.ugc.aweme.music.presenter.o;
import com.ss.android.ugc.aweme.music.ui.MusicListFragment;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.u.aj;
import com.ss.android.ugc.aweme.u.ak;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.bm;
import com.ss.android.ugc.aweme.utils.ey;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.Subscribe;

public class MusicTabListFragment extends MusicListFragment implements c<Music>, com.ss.android.ugc.aweme.music.adapter.c, com.ss.android.ugc.aweme.music.presenter.c, MusicListFragment.b {
    public static ChangeQuickRedirect j = null;
    private static final String v = "com.ss.android.ugc.aweme.music.ui.MusicTabListFragment";
    private l A;
    private int B;
    private List<Music> C = new ArrayList();
    private List<d> D = new ArrayList();
    private List<d> E = new ArrayList();
    private List<d> F = new ArrayList();
    private GridLayoutManager G;
    public int k;
    public String l;
    MusicTabView m;
    public List<d> n = new ArrayList();
    public Map<String, List<d>> o = new LinkedHashMap();
    public boolean p = false;
    int q = -1;
    boolean r = false;
    public Music s;
    i<ChallengeDetail> t;
    i<Music> u;
    private b<o> w;
    private b<k> x;
    private boolean y;
    private boolean z;

    public final int b() {
        return C0906R.layout.qn;
    }

    public final void c(List<Music> list, boolean z2) {
    }

    public final void d(Exception exc) {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public final void n_() {
    }

    public final void z_() {
    }

    public final void a(List<Music> list, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, j, false, 60463, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z2)}, this, j, false, 60463, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(true);
        if (isViewValid()) {
            d(list, z2);
        }
    }

    public final void a(List<MusicCollectionItem> list) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{list}, this, j, false, 60478, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, j, false, 60478, new Class[]{List.class}, Void.TYPE);
        } else if (isViewValid()) {
            MusicMixAdapter musicMixAdapter = this.f3625c;
            if (musicMixAdapter != null) {
                this.F.clear();
                if (!CollectionUtils.isEmpty(list)) {
                    this.F.addAll(list);
                }
                this.o.put("collection", this.F);
                if (list != null && list.size() > 8) {
                    z2 = false;
                }
                if (!CollectionUtils.isEmpty(list)) {
                    musicMixAdapter.a(list, z2);
                }
                i<ChallengeDetail> p2 = p();
                if (p2.b() && !p2.d()) {
                    Challenge challenge = null;
                    if (p2.e() != null) {
                        challenge = ((ChallengeDetail) p2.e()).challenge;
                    }
                    a(challenge);
                }
                q();
            }
        }
    }

    public final boolean n() {
        if (this.k == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 60471, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 60471, new Class[0], Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new Callable<List<MusicModel>>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56624a;

            public final /* synthetic */ Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f56624a, false, 60496, new Class[0], List.class)) {
                    return (List) PatchProxy.accessDispatch(new Object[0], this, f56624a, false, 60496, new Class[0], List.class);
                }
                ArrayList arrayList = new ArrayList();
                com.ss.android.ugc.aweme.music.util.d.a((Context) MusicTabListFragment.this.getActivity(), (List<MusicModel>) arrayList);
                return arrayList;
            }
        }).a((g<TResult, TContinuationResult>) new g<List<MusicModel>, Void>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56618a;

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void then(i<List<MusicModel>> iVar) throws Exception {
                if (PatchProxy.isSupport(new Object[]{iVar}, this, f56618a, false, 60505, new Class[]{i.class}, Void.class)) {
                    return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f56618a, false, 60505, new Class[]{i.class}, Void.class);
                } else if (MusicTabListFragment.this.getActivity() == null || iVar.d() || !iVar.b() || MusicTabListFragment.this.k != 2) {
                    return null;
                } else {
                    List list = (List) iVar.e();
                    MusicMixAdapter musicMixAdapter = MusicTabListFragment.this.f3625c;
                    if (CollectionUtils.isEmpty(list)) {
                        if (musicMixAdapter != null) {
                            musicMixAdapter.setLoadEmptyTextResId(C0906R.string.bhh);
                            musicMixAdapter.showLoadMoreEmpty();
                        }
                    } else if (musicMixAdapter != null) {
                        musicMixAdapter.setLoadEmptyTextResId(C0906R.string.a3f);
                    }
                    MusicTabListFragment.this.n.clear();
                    MusicTabListFragment.this.n.add(new com.ss.android.ugc.aweme.music.adapter.type.b());
                    MusicTabListFragment.this.n.add(new com.ss.android.ugc.aweme.music.adapter.type.g());
                    MusicTabListFragment.this.n.addAll(list);
                    MusicTabListFragment.this.o.put("tab_data", MusicTabListFragment.this.n);
                    MusicTabListFragment.this.a(MusicTabListFragment.this.o, MusicTabListFragment.this.n() ^ true ? 1 : 0);
                    return null;
                }
            }
        }, i.f1052b);
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 60466, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 60466, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && this.f3625c != null) {
            this.f3625c.showLoadMoreLoading();
        }
    }

    private i<ChallengeDetail> p() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 60456, new Class[0], i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[0], this, j, false, 60456, new Class[0], i.class);
        }
        if (this.t == null) {
            if (this.l != null) {
                this.t = i.a((Callable<TResult>) new Callable<ChallengeDetail>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f56637a;

                    public final /* synthetic */ Object call() throws Exception {
                        if (!PatchProxy.isSupport(new Object[0], this, f56637a, false, 60503, new Class[0], ChallengeDetail.class)) {
                            return ChallengeApi.a(MusicTabListFragment.this.l, 0, false);
                        }
                        return (ChallengeDetail) PatchProxy.accessDispatch(new Object[0], this, f56637a, false, 60503, new Class[0], ChallengeDetail.class);
                    }
                });
            } else {
                this.t = i.a(null);
            }
        }
        return this.t;
    }

    private void q() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 60473, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 60473, new Class[0], Void.TYPE);
            return;
        }
        f();
        r();
        if (!this.y) {
            m().a(1);
            return;
        }
        d(((o) this.w.i()).getItems(), ((o) this.w.i()).isHasMore());
    }

    private void r() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 60474, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 60474, new Class[0], Void.TYPE);
            return;
        }
        for (Music next : this.C) {
            if (((k) l().i()).getItems().contains(next) && next.getCollectStatus() != 1) {
                l().a((Object) next);
            }
        }
    }

    public final void j() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, j, false, 60455, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 60455, new Class[0], Void.TYPE);
            return;
        }
        if (this.k == 0) {
            z2 = ((o) m().i()).isHasMore();
        } else if (this.k == 1) {
            z2 = ((k) l().i()).isHasMore();
        }
        if (z2) {
            super.j();
        }
    }

    public final b<k> l() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 60459, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, j, false, 60459, new Class[0], b.class);
        }
        if (this.x == null) {
            this.x = new b<>();
            this.x.a(this);
            this.x.a(new k());
        }
        return this.x;
    }

    public final b<o> m() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 60460, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, j, false, 60460, new Class[0], b.class);
        }
        if (this.w == null) {
            this.w = new b<>();
            this.w.a(this);
            this.w.a(new o());
        }
        return this.w;
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 60462, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 60462, new Class[0], Void.TYPE);
            return;
        }
        a(true);
        MusicMixAdapter musicMixAdapter = this.f3625c;
        d(new ArrayList(), false);
        if (musicMixAdapter != null) {
            if (this.k != 1) {
                musicMixAdapter.setLoadEmptyTextResId(C0906R.string.a3f);
                musicMixAdapter.showLoadMoreEmpty();
            } else if (a.a()) {
                this.D.clear();
                this.D.add(new com.ss.android.ugc.aweme.music.adapter.type.c());
                this.o.put("favorite_empty_data", this.D);
                a(this.o, 1);
                musicMixAdapter.setLoadEmptyTextResId(C0906R.string.c9j);
            } else {
                musicMixAdapter.setLoadEmptyTextResId(C0906R.string.bh7);
                musicMixAdapter.showLoadMoreEmpty();
            }
        }
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 60485, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 60485, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        if (PatchProxy.isSupport(new Object[0], this, j, false, 60486, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 60486, new Class[0], Void.TYPE);
            return;
        }
        MusicModel g = g();
        if (this.f3625c != null) {
            for (int i = 0; i < this.mListView.getChildCount(); i++) {
                RecyclerView.ViewHolder childViewHolder = this.mListView.getChildViewHolder(this.mListView.getChildAt(i));
                if (childViewHolder instanceof MusicUnitViewHolder) {
                    MusicUnitViewHolder musicUnitViewHolder = (MusicUnitViewHolder) childViewHolder;
                    if (PatchProxy.isSupport(new Object[]{g}, musicUnitViewHolder, MusicUnitViewHolder.f56211a, false, 59917, new Class[]{MusicModel.class}, Void.TYPE)) {
                        MusicUnitViewHolder musicUnitViewHolder2 = musicUnitViewHolder;
                        PatchProxy.accessDispatch(new Object[]{g}, musicUnitViewHolder2, MusicUnitViewHolder.f56211a, false, 59917, new Class[]{MusicModel.class}, Void.TYPE);
                    } else if (!(musicUnitViewHolder.f56213b == null || musicUnitViewHolder.mPlayView == null || g == null || !TextUtils.equals(musicUnitViewHolder.f56213b.getPath(), g.getPath()))) {
                        musicUnitViewHolder.mPlayView.setImageResource(2130839141);
                    }
                }
            }
        }
    }

    private void a(boolean z2) {
        if (this.k == 0) {
            this.y = z2;
            return;
        }
        if (this.k == 1) {
            this.z = z2;
        }
    }

    public final void c_(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, j, false, 60479, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, j, false, 60479, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.api.a.a.a(getContext(), (Throwable) exc2);
    }

    public void onAttach(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, j, false, 60452, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, j, false, 60452, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        super.onAttach(context);
        this.f3627e = this;
    }

    private void a(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, j, false, 60493, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, j, false, 60493, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 != -1) {
            this.G.scrollToPositionWithOffset(i2, 0);
        }
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, j, false, 60461, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, j, false, 60461, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        a(false);
        if (this.k == 1 && this.mStatusView != null) {
            this.mListView.setVisibility(4);
            this.mStatusView.f();
        }
    }

    public final void c(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, j, false, 60467, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, j, false, 60467, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (isViewValid() && this.f3625c != null) {
            this.f3625c.showLoadMoreError();
        }
    }

    @Subscribe
    public void onCheckLoginStateEvent(com.ss.android.ugc.aweme.music.a.b bVar) {
        Bundle bundle;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, j, false, 60469, new Class[]{com.ss.android.ugc.aweme.music.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, j, false, 60469, new Class[]{com.ss.android.ugc.aweme.music.a.b.class}, Void.TYPE);
            return;
        }
        if (bVar != null && bVar.f56166a) {
            String string = getString(C0906R.string.ads);
            if (com.ss.android.ugc.aweme.i18n.c.a()) {
                bundle = null;
            } else {
                bundle = ad.a().a("login_title", string).f75487b;
            }
            e.a((Fragment) this, "", "click_my_music", bundle);
        }
    }

    public void onCreate(Bundle bundle) {
        Music music;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, j, false, 60453, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, j, false, 60453, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("challenge")) {
            this.l = arguments.getString("challenge");
        }
        if (arguments != null) {
            i = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
        }
        this.B = i;
        if (arguments != null) {
            music = (Music) arguments.getSerializable("sticker_music");
        } else {
            music = null;
        }
        this.s = music;
    }

    private void a(MusicMixAdapter musicMixAdapter) {
        if (PatchProxy.isSupport(new Object[]{musicMixAdapter}, this, j, false, 60492, new Class[]{MusicMixAdapter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicMixAdapter}, this, j, false, 60492, new Class[]{MusicMixAdapter.class}, Void.TYPE);
            return;
        }
        if (this.p && this.r) {
            int i = -1;
            if (this.k == 1) {
                i = musicMixAdapter.m;
            } else if (this.k == 0) {
                i = Math.max(musicMixAdapter.m, this.q);
            }
            a(i);
        }
        this.r = false;
    }

    public final void b(@Nullable List<Music> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, j, false, 60481, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, j, false, 60481, new Class[]{List.class}, Void.TYPE);
        } else if (!Lists.isEmpty(list)) {
            MusicMixAdapter musicMixAdapter = this.f3625c;
            this.E.clear();
            if (musicMixAdapter != null) {
                for (Music next : list) {
                    if (next != null) {
                        MusicModel a2 = com.ss.android.ugc.aweme.music.util.c.f56796b.a(next);
                        a2.setChallengeUserCount(next.getUserCount());
                        a2.setChallengeMusic(true);
                        a2.setDataType(0);
                        this.E.add(a2);
                    }
                }
            }
        }
    }

    @Subscribe
    public void onSwitchMusicFragmentEvent(com.ss.android.ugc.aweme.music.a.i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, j, false, 60470, new Class[]{com.ss.android.ugc.aweme.music.a.i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar}, this, j, false, 60470, new Class[]{com.ss.android.ugc.aweme.music.a.i.class}, Void.TYPE);
            return;
        }
        this.o.put("favorite_empty_data", new ArrayList());
        this.k = iVar.f56176a;
        this.m.a(this.k);
        this.r = true;
        if (this.f3625c != null) {
            this.f3625c.b();
        }
        if (this.h != null) {
            PreloadRecyclerViewConverter preloadRecyclerViewConverter = this.h;
            preloadRecyclerViewConverter.f36030b = 0;
            preloadRecyclerViewConverter.f36034f = 0;
            preloadRecyclerViewConverter.g = 0;
        }
        if (iVar.f56176a == 0) {
            m().a(this);
            l().a(null);
            q();
            return;
        }
        if (iVar.f56176a == 1) {
            m().a(null);
            l().a(this);
            if (PatchProxy.isSupport(new Object[0], this, j, false, 60475, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, j, false, 60475, new Class[0], Void.TYPE);
            } else {
                f();
                if (!com.ss.android.ugc.aweme.i18n.c.a() || com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                    l().a(1);
                    return;
                }
                y_();
            }
        } else if (iVar.f56176a == 2) {
            if (ContextCompat.checkSelfPermission(getActivity(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                o();
                return;
            }
            com.ss.android.ugc.aweme.ac.b.a(getActivity(), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new b.C0400b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f56616a;

                public final void a(String[] strArr, int[] iArr) {
                    if (PatchProxy.isSupport(new Object[]{strArr, iArr}, this, f56616a, false, 60504, new Class[]{String[].class, int[].class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{strArr, iArr}, this, f56616a, false, 60504, new Class[]{String[].class, int[].class}, Void.TYPE);
                    } else if (iArr[0] == 0) {
                        MusicTabListFragment.this.o();
                    } else {
                        MusicMixAdapter musicMixAdapter = MusicTabListFragment.this.f3625c;
                        if (musicMixAdapter != null) {
                            musicMixAdapter.setLoadEmptyTextResId(C0906R.string.bhh);
                            musicMixAdapter.showLoadMoreEmpty();
                        }
                    }
                }
            });
        }
    }

    public final void a(Challenge challenge) {
        if (PatchProxy.isSupport(new Object[]{challenge}, this, j, false, 60480, new Class[]{Challenge.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{challenge}, this, j, false, 60480, new Class[]{Challenge.class}, Void.TYPE);
        } else if (challenge != null) {
            MusicMixAdapter musicMixAdapter = this.f3625c;
            this.E.clear();
            this.E.add(new com.ss.android.ugc.aweme.music.adapter.type.a());
            if (musicMixAdapter != null) {
                musicMixAdapter.f56194e = challenge;
                if (!(challenge.getConnectMusics() == null || challenge.getConnectMusics().size() == 0)) {
                    for (Music next : challenge.getConnectMusics()) {
                        MusicModel a2 = com.ss.android.ugc.aweme.music.util.c.f56796b.a(next);
                        a2.setChallengeUserCount(next.getUserCount());
                        a2.setChallengeMusic(true);
                        a2.setDataType(0);
                        this.E.add(a2);
                    }
                }
            }
        }
    }

    public final void a(f fVar) {
        String str;
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, j, false, 60489, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, j, false, 60489, new Class[]{f.class}, Void.TYPE);
            return;
        }
        super.a(fVar);
        MusicModel musicModel = fVar2.f56172a;
        String str2 = fVar2.f56173b;
        switch (this.k) {
            case 0:
                str = "songchart";
                break;
            case 1:
                str = "favorite_song";
                break;
            case 2:
                str = "save_local";
                break;
            default:
                str = null;
                break;
        }
        if (str != null) {
            if ("follow_type".equals(str2)) {
                r.a("favourite_song", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", str).a("music_id", com.ss.android.ugc.aweme.music.util.c.f56796b.a(musicModel)).f34114b);
            } else if ("unfollow_type".equals(str2)) {
                r.a("cancel_favourite_song", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", str).a("music_id", com.ss.android.ugc.aweme.music.util.c.f56796b.a(musicModel)).f34114b);
            }
        }
    }

    @Subscribe
    public void onMusicCollectEvent(com.ss.android.ugc.aweme.music.a.e eVar) {
        com.ss.android.ugc.aweme.music.a.e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, j, false, 60472, new Class[]{com.ss.android.ugc.aweme.music.a.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, j, false, 60472, new Class[]{com.ss.android.ugc.aweme.music.a.e.class}, Void.TYPE);
        } else if (isViewValid()) {
            MusicModel musicModel = eVar2.f56170b;
            if (musicModel != null) {
                Music music = musicModel.getMusic();
                if (music != null) {
                    int i = eVar2.f56169a;
                    music.setCollectStatus(i);
                    if (p().b() && !p().d()) {
                        Challenge challenge = null;
                        if (p().e() != null) {
                            challenge = ((ChallengeDetail) p().e()).challenge;
                        }
                        Challenge challenge2 = challenge;
                        if (PatchProxy.isSupport(new Object[]{challenge2, music, Integer.valueOf(i)}, this, j, false, 60482, new Class[]{Challenge.class, Music.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{challenge2, music, Integer.valueOf(i)}, this, j, false, 60482, new Class[]{Challenge.class, Music.class, Integer.TYPE}, Void.TYPE);
                        } else if (!(challenge2 == null || challenge2.getConnectMusics() == null)) {
                            Music a2 = com.ss.android.ugc.aweme.music.util.d.a(challenge2.getConnectMusics(), music.getMid());
                            if (!(challenge2 == null || challenge2.getConnectMusics() == null || a2 == null)) {
                                a2.setCollectStatus(i);
                                a(challenge2);
                            }
                        }
                    }
                    if (PatchProxy.isSupport(new Object[]{music, Integer.valueOf(i)}, this, j, false, 60483, new Class[]{Music.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{music, Integer.valueOf(i)}, this, j, false, 60483, new Class[]{Music.class, Integer.TYPE}, Void.TYPE);
                    } else {
                        List<Music> items = ((k) l().i()).getItems();
                        Music a3 = com.ss.android.ugc.aweme.music.util.d.a(items, music.getMid());
                        int indexOf = items.indexOf(music);
                        int a4 = this.f3625c.a();
                        if (i == 1) {
                            if (a3 == null) {
                                music.setCollectStatus(i);
                                items.add(0, music);
                            } else {
                                a3.setCollectStatus(i);
                            }
                            if (!n()) {
                                this.f3625c.notifyDataSetChanged();
                            }
                        } else if (a3 != null) {
                            a3.setCollectStatus(i);
                            if (!n()) {
                                this.C.add(a3);
                            } else {
                                l().a((Object) a3);
                            }
                            this.f3625c.notifyItemChanged(a4 + indexOf);
                        }
                    }
                    if (PatchProxy.isSupport(new Object[]{music, Integer.valueOf(i)}, this, j, false, 60484, new Class[]{Music.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{music, Integer.valueOf(i)}, this, j, false, 60484, new Class[]{Music.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    List items2 = ((o) m().i()).getItems();
                    Music a5 = com.ss.android.ugc.aweme.music.util.d.a(items2, music.getMid());
                    int indexOf2 = items2.indexOf(music);
                    int a6 = this.f3625c.a();
                    if (a5 != null) {
                        a5.setCollectStatus(i);
                        if (n()) {
                            this.f3625c.notifyItemChanged(a6 + indexOf2);
                        }
                    }
                }
            }
        }
    }

    public final void a(MusicCollectionItem musicCollectionItem) {
        MusicCollectionItem musicCollectionItem2 = musicCollectionItem;
        if (PatchProxy.isSupport(new Object[]{musicCollectionItem2}, this, j, false, 60476, new Class[]{MusicCollectionItem.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicCollectionItem2}, this, j, false, 60476, new Class[]{MusicCollectionItem.class}, Void.TYPE);
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent(activity, MusicListActivity.class);
            intent.putExtra("mc_id", musicCollectionItem2.mcId);
            intent.putExtra("title_name", musicCollectionItem2.mcName);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", this.B);
            intent.putExtra("translation_type", 3);
            bg.b(new com.ss.android.ugc.aweme.music.a.d("song_category"));
            startActivityForResult(intent, 1);
            r.a((Context) getActivity(), "click_category", "popular_song", musicCollectionItem2.mcId, 0);
        }
    }

    private void d(List<Music> list, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, j, false, 60465, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z2)}, this, j, false, 60465, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.n.clear();
        this.n.add(new com.ss.android.ugc.aweme.music.adapter.type.b());
        this.n.add(new com.ss.android.ugc.aweme.music.adapter.type.g());
        if (n()) {
            this.n.addAll(this.E);
        }
        this.n = com.ss.android.ugc.aweme.music.util.d.a(list, this.n);
        this.o.put("tab_data", this.n);
        a(list, n() ^ true ? 1 : 0);
        MusicMixAdapter musicMixAdapter = this.f3625c;
        if (a.a()) {
            musicMixAdapter.mTextColor = getResources().getColor(C0906R.color.h5);
        }
        if (musicMixAdapter != null) {
            a(this.o, n() ^ true ? 1 : 0);
            if (!z2) {
                musicMixAdapter.showLoadMoreEmpty();
                musicMixAdapter.setLoadEmptyTextResId(C0906R.string.a3f);
            } else {
                musicMixAdapter.resetLoadMoreState();
            }
            a(musicMixAdapter);
        }
    }

    public final void b(List<Music> list, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, j, false, 60468, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z2)}, this, j, false, 60468, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            d(list, z2);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        l lVar;
        i<Music> iVar;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, j, false, 60454, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, j, false, 60454, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, j, false, 60458, new Class[0], l.class)) {
            lVar = (l) PatchProxy.accessDispatch(new Object[0], this, j, false, 60458, new Class[0], l.class);
        } else {
            if (this.A == null) {
                this.A = new l();
                this.A.a(this);
            }
            lVar = this.A;
        }
        lVar.a(new Object[0]);
        this.G = new WrapGridLayoutManager(getContext(), 4);
        this.mListView.setLayoutManager(this.G);
        this.G.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56614a;

            public int getSpanSize(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f56614a, false, 60495, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f56614a, false, 60495, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
                }
                MusicMixAdapter musicMixAdapter = MusicTabListFragment.this.f3625c;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, musicMixAdapter, MusicMixAdapter.f56190a, false, 59885, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, musicMixAdapter, MusicMixAdapter.f56190a, false, 59885, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
                }
                int basicItemViewType = musicMixAdapter.getBasicItemViewType(i);
                if (basicItemViewType == 2 || basicItemViewType == 3) {
                    return 1;
                }
                return 4;
            }
        });
        this.m = new MusicTabView(view.findViewById(C0906R.id.ba6));
        this.m.a(0);
        this.mListView.addOnScrollListener(new RecyclerView.OnScrollListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56620a;

            public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
                RecyclerView recyclerView2 = recyclerView;
                if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f56620a, false, 60498, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f56620a, false, 60498, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(0));
                if (MusicTabListFragment.this.p && MusicTabListFragment.this.k == 0) {
                    MusicTabListFragment.this.q = childAdapterPosition;
                }
            }
        });
        this.mListView.addItemDecoration(new RecyclerView.ItemDecoration() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56622a;

            public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
                boolean z;
                RecyclerView recyclerView2 = recyclerView;
                if (PatchProxy.isSupport(new Object[]{canvas, recyclerView2, state}, this, f56622a, false, 60499, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{canvas, recyclerView2, state}, this, f56622a, false, 60499, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
                    return;
                }
                super.onDrawOver(canvas, recyclerView, state);
                int childAdapterPosition = recyclerView2.getChildAdapterPosition(recyclerView2.getChildAt(0));
                if (childAdapterPosition != -1) {
                    int i = MusicTabListFragment.this.f3625c.m;
                    if (i == -1 || childAdapterPosition < i) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        MusicTabListFragment musicTabListFragment = MusicTabListFragment.this;
                        if (PatchProxy.isSupport(new Object[0], musicTabListFragment, MusicTabListFragment.j, false, 60490, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], musicTabListFragment, MusicTabListFragment.j, false, 60490, new Class[0], Void.TYPE);
                        } else {
                            MusicTabView musicTabView = musicTabListFragment.m;
                            if (PatchProxy.isSupport(new Object[0], musicTabView, MusicTabView.f56639a, false, 60518, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], musicTabView, MusicTabView.f56639a, false, 60518, new Class[0], Void.TYPE);
                            } else {
                                musicTabView.f56641c.setVisibility(0);
                            }
                            musicTabListFragment.p = true;
                        }
                    } else {
                        MusicTabListFragment musicTabListFragment2 = MusicTabListFragment.this;
                        if (PatchProxy.isSupport(new Object[0], musicTabListFragment2, MusicTabListFragment.j, false, 60491, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], musicTabListFragment2, MusicTabListFragment.j, false, 60491, new Class[0], Void.TYPE);
                            return;
                        }
                        MusicTabView musicTabView2 = musicTabListFragment2.m;
                        if (PatchProxy.isSupport(new Object[0], musicTabView2, MusicTabView.f56639a, false, 60519, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], musicTabView2, MusicTabView.f56639a, false, 60519, new Class[0], Void.TYPE);
                        } else {
                            musicTabView2.f56641c.setVisibility(8);
                        }
                        musicTabListFragment2.p = false;
                    }
                }
            }
        });
        this.o.put("collection", new ArrayList());
        this.o.put("showless_data", new ArrayList());
        this.o.put("tab_data", new ArrayList());
        this.o.put("favorite_empty_data", new ArrayList());
        this.i = new MusicListFragment.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56631a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f56631a, false, 60500, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f56631a, false, 60500, new Class[0], Void.TYPE);
                    return;
                }
                if (MusicTabListFragment.this.isViewValid()) {
                    if (MusicTabListFragment.this.k == 0) {
                        MusicTabListFragment.this.m().a(4);
                    } else if (MusicTabListFragment.this.k == 1) {
                        MusicTabListFragment.this.l().a(4);
                    }
                }
            }
        };
        p().a((g<TResult, TContinuationResult>) new g<ChallengeDetail, Void>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56633a;

            public final /* synthetic */ Object then(i iVar) throws Exception {
                Challenge challenge;
                AnonymousClass7 r0;
                if (PatchProxy.isSupport(new Object[]{iVar}, this, f56633a, false, 60501, new Class[]{i.class}, Void.class)) {
                    return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f56633a, false, 60501, new Class[]{i.class}, Void.class);
                }
                if (!iVar.d()) {
                    if (iVar.e() != null) {
                        challenge = ((ChallengeDetail) iVar.e()).challenge;
                        r0 = this;
                    } else {
                        r0 = this;
                        challenge = null;
                    }
                    MusicTabListFragment.this.a(challenge);
                }
                return null;
            }
        }, i.f1052b);
        if (PatchProxy.isSupport(new Object[0], this, j, false, 60457, new Class[0], i.class)) {
            iVar = (i) PatchProxy.accessDispatch(new Object[0], this, j, false, 60457, new Class[0], i.class);
        } else {
            if (this.u == null) {
                if (this.s != null) {
                    if (TextUtils.isEmpty(this.s.getMid())) {
                        com.ss.android.ugc.aweme.music.util.d.b();
                    }
                    this.u = i.a((Callable<TResult>) new y<TResult>(this));
                } else {
                    this.u = i.a(null);
                }
            }
            iVar = this.u;
        }
        iVar.a((g<TResult, TContinuationResult>) new g<Music, Void>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56635a;

            public final /* synthetic */ Object then(i iVar) throws Exception {
                if (PatchProxy.isSupport(new Object[]{iVar}, this, f56635a, false, 60502, new Class[]{i.class}, Void.class)) {
                    return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f56635a, false, 60502, new Class[]{i.class}, Void.class);
                }
                if (!iVar.d()) {
                    Music music = MusicTabListFragment.this.s;
                    if (iVar.e() != null) {
                        music = (Music) iVar.e();
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(music);
                    MusicTabListFragment.this.b((List<Music>) arrayList);
                }
                return null;
            }
        }, i.f1052b);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, j, false, 60477, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, j, false, 60477, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1) {
            getActivity().setResult(-1, intent2);
            getActivity().finish();
        }
    }

    public final void a(MusicListFragment musicListFragment, String str, MusicModel musicModel, String str2) {
        final String str3 = str;
        final MusicModel musicModel2 = musicModel;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{musicListFragment, str3, musicModel2, str4}, this, j, false, 60487, new Class[]{MusicListFragment.class, String.class, MusicModel.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicListFragment, str3, musicModel2, str4}, this, j, false, 60487, new Class[]{MusicListFragment.class, String.class, MusicModel.class, String.class}, Void.TYPE);
            return;
        }
        FragmentActivity activity = getActivity();
        if (!bm.a(str) || musicModel2 == null) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) activity, (int) C0906R.string.bei).a();
            n.a("aweme_music_download_error_rate", 3, com.ss.android.ugc.aweme.app.d.c.a().a("use_sdk", Integer.valueOf(AbTestManager.a().ap() ? 1 : 0)).a("musicPath", str3).b());
            return;
        }
        final int checkAudioFile = ((IAVService) ServiceManager.get().getService(IAVService.class)).getSDKService().checkAudioFile(str3);
        if (checkAudioFile < 0) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) activity, (int) C0906R.string.bei).a();
            i.a((Callable<TResult>) new Callable<Void>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f56626a;

                public final /* synthetic */ Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f56626a, false, 60497, new Class[0], Void.class)) {
                        return (Void) PatchProxy.accessDispatch(new Object[0], this, f56626a, false, 60497, new Class[0], Void.class);
                    }
                    n.a("aweme_music_download_error_rate", 4, com.ss.android.ugc.aweme.app.d.c.a().a("use_sdk", Integer.valueOf(AbTestManager.a().ap() ? 1 : 0)).a("musicPath", str3).a("fileLength", String.valueOf(new File(str3).length())).a("fileUri", musicModel2.getPath()).a("fileMagic", ey.a(str3)).a("code", String.valueOf(checkAudioFile)).b());
                    return null;
                }
            });
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("path", str3);
        intent.putExtra("music_model", musicModel2);
        intent.putExtra("music_origin", str4);
        if (!TextUtils.isEmpty(this.l)) {
            i<ChallengeDetail> p2 = p();
            if (p2.b() && !p2.d()) {
                Challenge challenge = null;
                if (p2.e() != null) {
                    challenge = ((ChallengeDetail) p2.e()).challenge;
                }
                if (challenge != null) {
                    ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().addChallenge(com.ss.android.ugc.aweme.shortvideo.o.a.b(challenge));
                }
            }
        }
        if (k() == 0 || k() == 2) {
            activity.setResult(-1, intent);
            activity.finish();
            return;
        }
        String string = getArguments().getString("shoot_way");
        if (string == null) {
            if (n()) {
                string = "popular_song";
            } else {
                string = "collection_music";
            }
        }
        if (this.k != 2) {
            ak a2 = new ak().a(string);
            a2.f75038b = musicModel.getMusicId();
            a2.f75040d = aj.a();
            a2.e();
        }
        intent.putExtra("shoot_way", string);
        intent.putExtra("creation_id", UUID.randomUUID().toString());
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) activity, intent);
    }
}
