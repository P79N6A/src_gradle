package com.ss.android.ugc.aweme.music;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.FragmentActivity;
import android.support.v7.view.ContextThemeWrapper;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.b;
import com.ss.android.ugc.aweme.favorites.c.a;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.a.f;
import com.ss.android.ugc.aweme.music.adapter.OriginMusicAdapter;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.presenter.g;
import com.ss.android.ugc.aweme.music.ui.p;
import com.ss.android.ugc.aweme.music.util.ProfileListFragment;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;

public class OriginMusicListFragment extends ProfileListFragment implements LoadMoreRecyclerViewAdapter.a, c<Music>, b.a, com.ss.android.ugc.aweme.favorites.c.b, aa<f>, g, com.ss.android.ugc.aweme.music.ui.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3613a;

    /* renamed from: b  reason: collision with root package name */
    protected p f3614b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3615c = true;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.common.f.b f3616d;

    /* renamed from: e  reason: collision with root package name */
    public String f3617e;

    /* renamed from: f  reason: collision with root package name */
    protected ViewStub f3618f;
    protected View g;
    protected boolean h;
    private String l = "popular_song";
    private OriginMusicAdapter m;
    @BindView(2131496883)
    public RecyclerView mListView;
    @BindView(2131497340)
    DmtStatusView mStatusView;
    private MusicModel n;
    private a o;
    private int p = 7;
    private boolean q = true;
    private boolean r;

    public final void a(BaseResponse baseResponse) {
    }

    public final void a(MusicModel musicModel, Exception exc) {
        if (PatchProxy.isSupport(new Object[]{musicModel, exc}, this, f3613a, false, 59847, new Class[]{MusicModel.class, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel, exc}, this, f3613a, false, 59847, new Class[]{MusicModel.class, Exception.class}, Void.TYPE);
        }
    }

    public final void c(List<Music> list, boolean z) {
    }

    public final void d(Exception exc) {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public final void l() {
    }

    public void loadMore() {
    }

    public final void z_() {
    }

    public final MusicModel g() {
        return this.n;
    }

    public final boolean j() {
        return this.q;
    }

    public final /* synthetic */ void a(Object obj) {
        f fVar = (f) obj;
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f3613a, false, 59821, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, f3613a, false, 59821, new Class[]{f.class}, Void.TYPE);
        } else if (fVar != null && fVar.f56172a != null) {
            if ("follow_type".equals(fVar.f56173b)) {
                this.o.a(1, fVar.f56172a.getMusicId(), 1);
                return;
            }
            if ("unfollow_type".equals(fVar.f56173b)) {
                this.o.a(1, fVar.f56172a.getMusicId(), 0);
            }
        }
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f3613a, false, 59818, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f3613a, false, 59818, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f3617e = str2;
        b();
    }

    public final void a(String str, MusicModel musicModel, String str2) {
        String str3 = str;
        MusicModel musicModel2 = musicModel;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, musicModel2, str4}, this, f3613a, false, 59828, new Class[]{String.class, MusicModel.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, musicModel2, str4}, this, f3613a, false, 59828, new Class[]{String.class, MusicModel.class, String.class}, Void.TYPE);
            return;
        }
        FragmentActivity activity = getActivity();
        if (musicModel.getMusic() == null || musicModel.getMusic().getChallenge() == null) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().removeChallenges();
        } else {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().addChallenge(com.ss.android.ugc.aweme.shortvideo.o.a.b(musicModel.getMusic().getChallenge()));
        }
        Intent intent = new Intent();
        intent.putExtra("path", str3);
        intent.putExtra("music_model", musicModel2);
        intent.putExtra("music_origin", str4);
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) activity, intent);
    }

    public final void a(List<Music> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3613a, false, 59837, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f3613a, false, 59837, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            this.mStatusView.b();
            this.mStatusView.k();
            this.m.resetLoadMoreState();
            a(list);
            this.m.setShowFooter(true);
        }
    }

    public final void J_() {
        if (PatchProxy.isSupport(new Object[0], this, f3613a, false, 59833, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3613a, false, 59833, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && this.mListView.getChildCount() > 0) {
            this.mListView.smoothScrollToPosition(0);
        }
    }

    public final View f() {
        if (PatchProxy.isSupport(new Object[0], this, f3613a, false, 59831, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f3613a, false, 59831, new Class[0], View.class);
        } else if (!isViewValid()) {
            return null;
        } else {
            return this.mListView;
        }
    }

    public final Activity h() {
        if (!PatchProxy.isSupport(new Object[0], this, f3613a, false, 59826, new Class[0], Activity.class)) {
            return getActivity();
        }
        return (Activity) PatchProxy.accessDispatch(new Object[0], this, f3613a, false, 59826, new Class[0], Activity.class);
    }

    public final boolean i() {
        if (!PatchProxy.isSupport(new Object[0], this, f3613a, false, 59827, new Class[0], Boolean.TYPE)) {
            return isViewValid();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3613a, false, 59827, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f3613a, false, 59829, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3613a, false, 59829, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3614b != null) {
            this.f3614b.a();
        }
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f3613a, false, 59834, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3613a, false, 59834, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.g.setVisibility(4);
            this.mStatusView.d();
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3613a, false, 59822, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3613a, false, 59822, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f3613a, false, 59830, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3613a, false, 59830, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        m();
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3613a, false, 59819, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3613a, false, 59819, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.f3614b != null) {
            this.f3614b.a();
            this.f3614b.o = true;
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3613a, false, 59820, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3613a, false, 59820, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.f3614b.o = false;
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f3613a, false, 59839, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3613a, false, 59839, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.m.showLoadMoreLoading();
        }
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f3613a, false, 59836, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3613a, false, 59836, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.g.setVisibility(4);
            this.mStatusView.e();
        }
    }

    private void n() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f3613a, false, 59844, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3613a, false, 59844, new Class[0], Void.TYPE);
        } else if (getContext() != null) {
            DmtStatusView.a a2 = DmtStatusView.a.a(getContext());
            try {
                DmtTextView a3 = a((int) C0906R.string.b6z);
                if (this.r) {
                    i = C0906R.string.bhr;
                } else {
                    i = C0906R.string.bhq;
                }
                DmtTextView a4 = a(i);
                a3.setOnClickListener(new f(this));
                a2.b((View) a4).c((View) a3);
            } catch (Exception unused) {
            }
            this.mStatusView.setBuilder(a2);
        }
    }

    public final void H_() {
        if (PatchProxy.isSupport(new Object[0], this, f3613a, false, 59842, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3613a, false, 59842, new Class[0], Void.TYPE);
        } else if (this.mStatusView == null || (!this.h && !TimeLockRuler.isTeenModeON())) {
            b();
        } else {
            this.mStatusView.setVisibility(4);
            this.g.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3613a, false, 59817, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3613a, false, 59817, new Class[0], Void.TYPE);
        } else if (isViewValid() && !TimeLockRuler.isTeenModeON() && getActivity() != null) {
            if (!NetworkUtils.isNetworkAvailable(getActivity())) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
                this.mStatusView.f();
                this.q = true;
                return;
            }
            if (this.f3616d != null && !TextUtils.isEmpty(this.f3617e)) {
                this.f3616d.a(1, this.f3617e);
                this.q = false;
            }
        }
    }

    public final boolean k() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3613a, false, 59832, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3613a, false, 59832, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!isViewValid() || this.m == null) {
            return false;
        } else {
            if (this.m.getItemCount() == 0) {
                z = true;
            }
            return z;
        }
    }

    public final void a(boolean z) {
        this.h = z;
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3613a, false, 59846, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3613a, false, 59846, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) exc);
    }

    public final void b(MusicModel musicModel) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f3613a, false, 59824, new Class[]{MusicModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f3613a, false, 59824, new Class[]{MusicModel.class}, Void.TYPE);
            return;
        }
        super.onPause();
        if (this.f3614b != null) {
            this.f3614b.a();
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3613a, false, 59815, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3613a, false, 59815, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3613a, false, 59813, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3613a, false, 59813, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.music.a.g gVar) {
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f3613a, false, 59843, new Class[]{com.ss.android.ugc.aweme.music.a.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, f3613a, false, 59843, new Class[]{com.ss.android.ugc.aweme.music.a.g.class}, Void.TYPE);
            return;
        }
        m();
    }

    private DmtTextView a(@StringRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f3613a, false, 59845, new Class[]{Integer.TYPE}, DmtTextView.class)) {
            return (DmtTextView) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f3613a, false, 59845, new Class[]{Integer.TYPE}, DmtTextView.class);
        }
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), (int) C0906R.style.r5));
        dmtTextView.setTextColor(getContext().getResources().getColor(C0906R.color.zv));
        dmtTextView.setText(i);
        return dmtTextView;
    }

    public final void c(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3613a, false, 59840, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3613a, false, 59840, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            this.m.showPullUpLoadMore();
        }
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3613a, false, 59835, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3613a, false, 59835, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            this.q = true;
            this.mStatusView.f();
        }
    }

    private void a(List<Music> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f3613a, false, 59838, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f3613a, false, 59838, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Music next : list) {
                if (next != null) {
                    arrayList.add(com.ss.android.ugc.aweme.music.util.c.f56796b.a(next));
                }
            }
            this.mListView.setVisibility(0);
            this.m.a(arrayList);
        }
    }

    public final void a(MusicModel musicModel) {
        if (PatchProxy.isSupport(new Object[]{musicModel}, this, f3613a, false, 59823, new Class[]{MusicModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel}, this, f3613a, false, 59823, new Class[]{MusicModel.class}, Void.TYPE);
        } else if (musicModel != null) {
            this.n = musicModel;
            if (this.f3615c) {
                this.f3614b.a(musicModel, this.p);
            } else {
                this.f3614b.b(musicModel, this.p);
            }
        }
    }

    public final void a(String str, String str2) {
        this.f3617e = str;
    }

    public static OriginMusicListFragment a(String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f3613a, true, 59811, new Class[]{String.class, Boolean.TYPE}, OriginMusicListFragment.class)) {
            return (OriginMusicListFragment) PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, null, f3613a, true, 59811, new Class[]{String.class, Boolean.TYPE}, OriginMusicListFragment.class);
        }
        OriginMusicListFragment originMusicListFragment = new OriginMusicListFragment();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str2);
        bundle.putBoolean("is_me", z);
        originMusicListFragment.setArguments(bundle);
        return originMusicListFragment;
    }

    public final void b(List<Music> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3613a, false, 59841, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f3613a, false, 59841, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            if (z) {
                this.m.resetLoadMoreState();
            } else {
                this.m.showLoadMoreEmpty();
            }
            if (!AbTestManager.a().d().useRecyclerPartialUpdate) {
                a(list);
            } else if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Music next : list) {
                    if (next != null) {
                        arrayList.add(com.ss.android.ugc.aweme.music.util.c.f56796b.a(next));
                    }
                }
                this.mListView.setVisibility(0);
                OriginMusicAdapter originMusicAdapter = this.m;
                if (PatchProxy.isSupport(new Object[]{arrayList}, originMusicAdapter, OriginMusicAdapter.f56242a, false, 59933, new Class[]{List.class}, Void.TYPE)) {
                    OriginMusicAdapter originMusicAdapter2 = originMusicAdapter;
                    PatchProxy.accessDispatch(new Object[]{arrayList}, originMusicAdapter2, OriginMusicAdapter.f56242a, false, 59933, new Class[]{List.class}, Void.TYPE);
                } else {
                    originMusicAdapter.f56245d.clear();
                    originMusicAdapter.f56245d.addAll(arrayList);
                    if (originMusicAdapter.mShowFooter) {
                        originMusicAdapter.notifyItemRangeChanged(originMusicAdapter.f56247f - 1, originMusicAdapter.getItemCount() - originMusicAdapter.f56247f);
                        originMusicAdapter.notifyItemChanged(originMusicAdapter.getItemCount() - 1);
                    } else {
                        originMusicAdapter.notifyItemRangeChanged(originMusicAdapter.f56247f, originMusicAdapter.getItemCount() - originMusicAdapter.f56247f);
                    }
                }
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f3613a, false, 59814, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f3613a, false, 59814, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f3613a, false, 59816, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3613a, false, 59816, new Class[0], Void.TYPE);
            return;
        }
        Bundle arguments = getArguments();
        this.f3617e = arguments.getString("user_id");
        this.r = arguments.getBoolean("is_me", false);
        n();
        this.f3616d = new com.ss.android.ugc.aweme.common.f.b();
        this.f3616d.a(new com.ss.android.ugc.aweme.music.ui.b.b());
        this.f3616d.a(this);
        this.o = new a();
        this.o.a(this);
        this.m = new OriginMusicAdapter(this, this, this.f3617e);
        this.m.setShowFooter(true);
        this.f3614b.c();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.setOrientation(1);
        this.mListView.setLayoutManager(wrapLinearLayoutManager);
        this.m.setLoadMoreListener(this);
        this.mListView.setAdapter(this.m);
        this.m.a(new ArrayList());
        if (!NetworkUtils.isNetworkAvailable(getActivity())) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
        } else if (this.j) {
            b();
        }
        this.m.setShowFooter(true);
        this.m.setLoadMoreListener(new LoadMoreRecyclerViewAdapter.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56137a;

            public final void loadMore() {
                if (PatchProxy.isSupport(new Object[0], this, f56137a, false, 59849, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f56137a, false, 59849, new Class[0], Void.TYPE);
                    return;
                }
                if (OriginMusicListFragment.this.f3616d != null && !TextUtils.isEmpty(OriginMusicListFragment.this.f3617e)) {
                    OriginMusicListFragment.this.f3616d.a(4, OriginMusicListFragment.this.f3617e);
                }
            }
        });
    }

    public final void a(MusicModel musicModel, int i) {
        if (PatchProxy.isSupport(new Object[]{musicModel, Integer.valueOf(i)}, this, f3613a, false, 59825, new Class[]{MusicModel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel, Integer.valueOf(i)}, this, f3613a, false, 59825, new Class[]{MusicModel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f3614b.l = this.l;
        this.f3614b.n = i;
        this.f3614b.b(musicModel, this.p);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3613a, false, 59812, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3613a, false, 59812, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.abh, viewGroup2, false);
        this.f3614b = new p(this);
        this.f3618f = (ViewStub) inflate.findViewById(C0906R.id.cx0);
        this.g = this.f3618f.inflate();
        if (TimeLockRuler.isTeenModeON()) {
            ((TextView) this.g.findViewById(C0906R.id.title)).setText(C0906R.string.cit);
            ((TextView) this.g.findViewById(C0906R.id.yp)).setText(C0906R.string.cii);
        }
        this.g.setVisibility(4);
        return inflate;
    }
}
