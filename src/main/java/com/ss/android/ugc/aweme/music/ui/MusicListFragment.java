package com.ss.android.ugc.aweme.music.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.choosemusic.view.PreloadRecyclerViewConverter;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.music.a.e;
import com.ss.android.ugc.aweme.music.adapter.MusicMixAdapter;
import com.ss.android.ugc.aweme.music.adapter.c;
import com.ss.android.ugc.aweme.music.adapter.f;
import com.ss.android.ugc.aweme.music.adapter.type.d;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.music.presenter.g;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;

public class MusicListFragment extends AmeBaseFragment implements LoadMoreRecyclerViewAdapter.a, com.ss.android.ugc.aweme.favorites.c.b, c, f<com.ss.android.ugc.aweme.music.a.f>, g, c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3623a = null;
    private static final String j = "com.ss.android.ugc.aweme.music.ui.MusicListFragment";

    /* renamed from: b  reason: collision with root package name */
    public String f3624b;

    /* renamed from: c  reason: collision with root package name */
    public MusicMixAdapter f3625c;

    /* renamed from: d  reason: collision with root package name */
    public p f3626d;

    /* renamed from: e  reason: collision with root package name */
    public b f3627e;

    /* renamed from: f  reason: collision with root package name */
    public int f3628f;
    public boolean g = true;
    protected PreloadRecyclerViewConverter h;
    public a i;
    private String k = "popular_song";
    private String l;
    private int m;
    @BindView(2131495399)
    public RecyclerView mListView;
    @BindView(2131497340)
    DmtStatusView mStatusView;
    private com.ss.android.ugc.aweme.favorites.c.a n;
    private MusicMixAdapter.a o;
    private List<MusicModel> p = new ArrayList();
    private List<Music> q = new ArrayList();
    private boolean r = false;
    private MusicModel s;

    public interface b {
        void a(MusicListFragment musicListFragment, String str, MusicModel musicModel, String str2);
    }

    public interface a {
        void a();
    }

    public final void a(BaseResponse baseResponse) {
    }

    public void a(MusicCollectionItem musicCollectionItem) {
    }

    public final void a(MusicModel musicModel, Exception exc) {
        if (PatchProxy.isSupport(new Object[]{musicModel, exc}, this, f3623a, false, 60414, new Class[]{MusicModel.class, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel, exc}, this, f3623a, false, 60414, new Class[]{MusicModel.class, Exception.class}, Void.TYPE);
        }
    }

    @LayoutRes
    public int b() {
        return C0906R.layout.or;
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public final MusicModel g() {
        return this.s;
    }

    public final int k() {
        return this.m;
    }

    public final void a(Map<String, List<d>> map, int i2) {
        if (PatchProxy.isSupport(new Object[]{map, Integer.valueOf(i2)}, this, f3623a, false, 60396, new Class[]{Map.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map, Integer.valueOf(i2)}, this, f3623a, false, 60396, new Class[]{Map.class, Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            if (map == null) {
                com.bytedance.ies.dmt.ui.d.a.b(getContext(), (int) C0906R.string.bga).a();
                if (a()) {
                    this.mStatusView.f();
                }
                return;
            }
            if (this.mListView != null) {
                this.mListView.setVisibility(0);
            }
            this.mStatusView.b();
            if (this.f3625c != null) {
                this.f3625c.a(map, i2);
            }
            this.f3628f = i2;
        }
    }

    public final void a(List<Music> list, int i2) {
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i2)}, this, f3623a, false, 60397, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i2)}, this, f3623a, false, 60397, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            if (list == null) {
                com.bytedance.ies.dmt.ui.d.a.b(getContext(), (int) C0906R.string.bga).a();
                if (a()) {
                    this.mStatusView.f();
                }
                return;
            }
            this.q = list;
            if (this.mListView != null) {
                this.mListView.setVisibility(0);
            }
            this.mStatusView.b();
            this.p.clear();
            this.q = list;
            for (Music next : list) {
                if (next != null) {
                    MusicModel a2 = com.ss.android.ugc.aweme.music.util.c.f56796b.a(next);
                    a2.setDataType(1);
                    this.p.add(a2);
                }
            }
            if (this.f3625c != null) {
                this.f3625c.a(this.p, i2);
            }
            this.f3628f = i2;
        }
    }

    public final void a(String str, MusicModel musicModel, String str2) {
        String str3 = str;
        MusicModel musicModel2 = musicModel;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, musicModel2, str4}, this, f3623a, false, 60409, new Class[]{String.class, MusicModel.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, musicModel2, str4}, this, f3623a, false, 60409, new Class[]{String.class, MusicModel.class, String.class}, Void.TYPE);
            return;
        }
        if (this.i != null) {
            this.f3627e.a(this, str3, musicModel2, str4);
        }
    }

    private boolean a() {
        if (this.f3628f != 2) {
            return true;
        }
        return false;
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f3623a, false, 60402, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3623a, false, 60402, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3626d != null) {
            this.f3626d.a();
        }
    }

    public Analysis getAnalysis() {
        if (!PatchProxy.isSupport(new Object[0], this, f3623a, false, 60391, new Class[0], Analysis.class)) {
            return new Analysis().setLabelName("music_library_list");
        }
        return (Analysis) PatchProxy.accessDispatch(new Object[0], this, f3623a, false, 60391, new Class[0], Analysis.class);
    }

    public final Activity h() {
        if (!PatchProxy.isSupport(new Object[0], this, f3623a, false, 60407, new Class[0], Activity.class)) {
            return getActivity();
        }
        return (Activity) PatchProxy.accessDispatch(new Object[0], this, f3623a, false, 60407, new Class[0], Activity.class);
    }

    public final boolean i() {
        if (!PatchProxy.isSupport(new Object[0], this, f3623a, false, 60408, new Class[0], Boolean.TYPE)) {
            return isViewValid();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3623a, false, 60408, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void j() {
        if (PatchProxy.isSupport(new Object[0], this, f3623a, false, 60406, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3623a, false, 60406, new Class[0], Void.TYPE);
            return;
        }
        if (this.i != null) {
            this.i.a();
        }
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f3623a, false, 60405, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3623a, false, 60405, new Class[0], Void.TYPE);
            return;
        }
        if (!this.r) {
            j();
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3623a, false, 60411, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3623a, false, 60411, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f3623a, false, 60400, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3623a, false, 60400, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        f();
        this.f3626d.d();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3623a, false, 60404, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3623a, false, 60404, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.f3626d.o = false;
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3623a, false, 60403, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3623a, false, 60403, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.f3625c != null) {
            this.f3625c.b();
        }
        if (this.f3626d != null) {
            this.f3626d.a();
        }
        com.ss.android.ugc.aweme.music.util.b.a().pause();
        this.f3626d.o = true;
    }

    @Subscribe(b = true)
    public void onMobMusicTypeEvent(com.ss.android.ugc.aweme.music.a.d dVar) {
        String str = dVar.f56168a;
        if (str == null) {
            this.k = this.l;
        } else if (this.l == null) {
            this.k = str;
            this.l = this.k;
        } else {
            this.l = this.k;
            this.k = str;
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3623a, false, 60413, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3623a, false, 60413, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) exc);
    }

    public final void b(MusicModel musicModel) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f3623a, false, 60394, new Class[]{MusicModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f3623a, false, 60394, new Class[]{MusicModel.class}, Void.TYPE);
            return;
        }
        f();
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3623a, false, 60386, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3623a, false, 60386, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
    }

    private com.bytedance.ies.dmt.ui.widget.c b(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f3623a, false, 60390, new Class[]{String.class}, com.bytedance.ies.dmt.ui.widget.c.class)) {
            return new c.a(getActivity()).b((int) C0906R.string.b5r).b(str2).f20493a;
        }
        return (com.bytedance.ies.dmt.ui.widget.c) PatchProxy.accessDispatch(new Object[]{str2}, this, f3623a, false, 60390, new Class[]{String.class}, com.bytedance.ies.dmt.ui.widget.c.class);
    }

    @Subscribe(b = true)
    public void onMusicCollectEvent(e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f3623a, false, 60398, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f3623a, false, 60398, new Class[]{e.class}, Void.TYPE);
            return;
        }
        MusicModel musicModel = eVar.f56170b;
        if (musicModel != null) {
            Music a2 = com.ss.android.ugc.aweme.music.util.d.a(this.q, musicModel.getMusicId());
            if (a2 != null) {
                a2.setCollectStatus(eVar.f56169a);
                int indexOf = this.q.indexOf(a2);
                MusicMixAdapter musicMixAdapter = this.f3625c;
                if (musicMixAdapter != null) {
                    musicMixAdapter.notifyItemChanged(indexOf);
                }
            }
        }
    }

    public final void a(MusicModel musicModel) {
        if (PatchProxy.isSupport(new Object[]{musicModel}, this, f3623a, false, 60393, new Class[]{MusicModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel}, this, f3623a, false, 60393, new Class[]{MusicModel.class}, Void.TYPE);
            return;
        }
        this.s = musicModel;
        if (this.g) {
            this.f3626d.a(musicModel, this.f3628f);
        } else {
            this.f3626d.b(musicModel, this.f3628f);
        }
    }

    public void a(com.ss.android.ugc.aweme.music.a.f fVar) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f3623a, false, 60410, new Class[]{com.ss.android.ugc.aweme.music.a.f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, f3623a, false, 60410, new Class[]{com.ss.android.ugc.aweme.music.a.f.class}, Void.TYPE);
            return;
        }
        String str3 = fVar.f56173b;
        MusicModel musicModel = fVar.f56172a;
        if (musicModel != null) {
            FragmentActivity activity = getActivity();
            if (activity == null || !"upload_local_music".equals(str3)) {
                String str4 = null;
                String tag = getTag();
                String str5 = "";
                if (tag != null) {
                    if (tag.equals("album_list_tag")) {
                        str4 = "album";
                    } else if (tag.equals("search_result_list_tag")) {
                        str4 = "search_music";
                    }
                }
                if ("follow_type".equals(str3)) {
                    str5 = "favourite_song";
                    this.n.a(1, musicModel.getMusicId(), 1);
                } else if ("unfollow_type".equals(str3)) {
                    str5 = "cancel_favourite_song";
                    this.n.a(1, musicModel.getMusicId(), 0);
                }
                if (str4 != null && !TextUtils.isEmpty(str5)) {
                    if (TextUtils.equals(str4, "search_music")) {
                        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
                        a2.a("music_id", musicModel.getMusicId()).a("enter_from", "search_music").a("search_keyword", com.ss.android.ugc.aweme.music.util.d.a()).a("log_pb", new Gson().toJson((Object) musicModel.getLogPb()));
                        r.a(str5, v.a(a2.f34114b));
                        return;
                    }
                    r.a(str5, (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", str4).a("music_id", com.ss.android.ugc.aweme.music.util.c.f56796b.a(musicModel)).f34114b);
                }
                return;
            }
            Intent intent = new Intent();
            if (fVar.f56172a == null) {
                str = "";
            } else {
                str = fVar.f56172a.getName();
            }
            intent.putExtra("local_music_name", str);
            if (fVar.f56172a == null) {
                str2 = "";
            } else {
                str2 = fVar.f56172a.getPath();
            }
            intent.putExtra("local_music_path", str2);
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3623a, false, 60412, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3623a, false, 60412, new Class[]{String.class}, Void.TYPE);
        } else if (this.mStatusView != null && a()) {
            this.mStatusView.setBuilder(this.mStatusView.a().a(b(str)));
            this.mStatusView.e();
        }
    }

    public static MusicListFragment a(int i2, MusicMixAdapter.a aVar) {
        MusicMixAdapter.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), aVar2}, null, f3623a, true, 60384, new Class[]{Integer.TYPE, MusicMixAdapter.a.class}, MusicListFragment.class)) {
            return (MusicListFragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), aVar2}, null, f3623a, true, 60384, new Class[]{Integer.TYPE, MusicMixAdapter.a.class}, MusicListFragment.class);
        }
        MusicListFragment musicListFragment = new MusicListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
        bundle.putSerializable("music_style", aVar2);
        musicListFragment.setArguments(bundle);
        return musicListFragment;
    }

    public final void b(List<MusicModel> list, int i2) {
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i2)}, this, f3623a, false, 60399, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i2)}, this, f3623a, false, 60399, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (isViewValid() && this.f3625c != null) {
            this.f3625c.a(list, i2);
            this.f3628f = i2;
            this.mListView.setVisibility(0);
            if (a()) {
                if (Lists.isEmpty(list)) {
                    this.mStatusView.e();
                } else {
                    this.mStatusView.b();
                }
            }
            this.f3625c.notifyDataSetChanged();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f3623a, false, 60387, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f3623a, false, 60387, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f3623a, false, 60388, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3623a, false, 60388, new Class[0], Void.TYPE);
            return;
        }
        this.f3625c = new MusicMixAdapter(this, this, this, this.m);
        this.f3625c.p = this.o;
        this.mListView.setVisibility(8);
        this.f3625c.setShowFooter(true);
        if (com.ss.android.g.a.a()) {
            this.f3625c.mTextColor = getResources().getColor(C0906R.color.h5);
        } else {
            this.f3625c.mTextColor = getResources().getColor(C0906R.color.i3);
        }
        this.f3625c.mLabel = "music_list";
        this.f3626d.c();
        this.f3626d.b(this.m);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.setOrientation(1);
        this.mListView.setLayoutManager(wrapLinearLayoutManager);
        this.f3625c.setLoadMoreListener(this);
        this.mListView.setAdapter(this.f3625c);
        if (PatchProxy.isSupport(new Object[0], this, f3623a, false, 60389, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3623a, false, 60389, new Class[0], Void.TYPE);
        } else {
            this.r = true;
            this.h = new PreloadRecyclerViewConverter(new u(this), 10);
            this.h.a(this.mListView);
        }
        this.n = new com.ss.android.ugc.aweme.favorites.c.a();
        this.n.a(this);
        this.mStatusView.setBuilder(DmtStatusView.a.a((Context) getActivity()).b(new c.a(getActivity()).b((int) C0906R.string.dmm).c(C0906R.string.dml).f20493a).a(b(getActivity().getString(C0906R.string.dmu))).c(0));
        if (!a()) {
            this.mStatusView.b();
        } else if (NetworkUtils.isNetworkAvailable(getActivity())) {
            this.mStatusView.d();
        } else {
            this.mStatusView.f();
        }
    }

    public final void a(MusicModel musicModel, int i2) {
        if (PatchProxy.isSupport(new Object[]{musicModel, Integer.valueOf(i2)}, this, f3623a, false, 60395, new Class[]{MusicModel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel, Integer.valueOf(i2)}, this, f3623a, false, 60395, new Class[]{MusicModel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f3626d.l = this.k;
        this.f3626d.n = i2;
        this.f3626d.m = this.f3624b;
        this.f3626d.b(musicModel, this.f3628f);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3623a, false, 60385, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3623a, false, 60385, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(b(), viewGroup2, false);
        this.f3626d = new p(this);
        if (getArguments() != null) {
            this.m = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
            this.o = (MusicMixAdapter.a) getArguments().getSerializable("music_style");
        } else {
            this.m = 0;
        }
        return inflate;
    }
}
