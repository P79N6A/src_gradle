package com.ss.android.ugc.aweme.choosemusic.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.choosemusic.adapter.MusicAdapter;
import com.ss.android.ugc.aweme.choosemusic.adapter.MusicSearchHistoryAdapter;
import com.ss.android.ugc.aweme.choosemusic.view.PreloadRecyclerViewConverter;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.music.a.e;
import com.ss.android.ugc.aweme.music.adapter.f;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.music.ui.p;
import com.ss.android.ugc.aweme.music.util.f;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;

public class NewMusicListFragment extends AmeBaseFragment implements com.ss.android.ugc.aweme.choosemusic.b.b, LoadMoreRecyclerViewAdapter.a, com.ss.android.ugc.aweme.favorites.c.b, com.ss.android.ugc.aweme.music.adapter.c, f<com.ss.android.ugc.aweme.choosemusic.a.b>, com.ss.android.ugc.aweme.music.ui.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2837a = null;
    private static final String l = "com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicListFragment";

    /* renamed from: b  reason: collision with root package name */
    public MusicAdapter f2838b;

    /* renamed from: c  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.choosemusic.f.a f2839c;

    /* renamed from: d  reason: collision with root package name */
    public b f2840d;

    /* renamed from: e  reason: collision with root package name */
    public int f2841e;

    /* renamed from: f  reason: collision with root package name */
    List<MusicModel> f2842f = new ArrayList();
    boolean g = false;
    String h = "";
    public c i;
    public a j;
    public View.OnClickListener k;
    private String m = "popular_song";
    @BindView(2131495557)
    View mBackgroundView;
    @BindView(2131495399)
    public RecyclerView mListView;
    @BindView(2131497340)
    DmtStatusView mStatusView;
    private String n;
    private int o;
    private com.ss.android.ugc.aweme.favorites.c.a p;
    private MusicSearchHistoryAdapter q;
    private boolean r = true;
    private MusicModel s;

    public interface b {
        void a(NewMusicListFragment newMusicListFragment, String str, MusicModel musicModel, String str2);
    }

    public interface a {
        void a();
    }

    public interface c {
        void a();
    }

    public final void a(BaseResponse baseResponse) {
    }

    public final void a(MusicCollectionItem musicCollectionItem) {
    }

    public final void a(MusicModel musicModel, Exception exc) {
        if (PatchProxy.isSupport(new Object[]{musicModel, exc}, this, f2837a, false, 26658, new Class[]{MusicModel.class, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel, exc}, this, f2837a, false, 26658, new Class[]{MusicModel.class, Exception.class}, Void.TYPE);
        }
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public final MusicModel g() {
        return this.s;
    }

    public final int j() {
        return this.o;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f2837a, false, 26637, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2837a, false, 26637, new Class[0], Void.TYPE);
            return;
        }
        this.mStatusView.d();
        this.mListView.setVisibility(4);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f2837a, false, 26639, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2837a, false, 26639, new Class[0], Void.TYPE);
            return;
        }
        this.mStatusView.f();
        this.mListView.setVisibility(4);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f2837a, false, 26647, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2837a, false, 26647, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2838b != null) {
            this.f2838b.a();
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f2837a, false, 26649, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2837a, false, 26649, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2839c != null) {
            this.f2839c.a();
        }
    }

    public Analysis getAnalysis() {
        if (!PatchProxy.isSupport(new Object[0], this, f2837a, false, 26641, new Class[0], Analysis.class)) {
            return new Analysis().setLabelName("music_library_list");
        }
        return (Analysis) PatchProxy.accessDispatch(new Object[0], this, f2837a, false, 26641, new Class[0], Analysis.class);
    }

    public final Activity h() {
        if (!PatchProxy.isSupport(new Object[0], this, f2837a, false, 26653, new Class[0], Activity.class)) {
            return getActivity();
        }
        return (Activity) PatchProxy.accessDispatch(new Object[0], this, f2837a, false, 26653, new Class[0], Activity.class);
    }

    public final boolean i() {
        if (!PatchProxy.isSupport(new Object[0], this, f2837a, false, 26654, new Class[0], Boolean.TYPE)) {
            return isViewValid();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2837a, false, 26654, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f2837a, false, 26652, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2837a, false, 26652, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.a();
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f2837a, false, 26648, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2837a, false, 26648, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        f();
        this.f2839c.d();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f2837a, false, 26651, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2837a, false, 26651, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.f2839c != null) {
            this.f2839c.o = false;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f2837a, false, 26635, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2837a, false, 26635, new Class[0], Void.TYPE);
            return;
        }
        this.mStatusView.b();
        e();
        List<MusicSearchHistory> b2 = com.ss.android.ugc.aweme.choosemusic.c.c.c().b();
        if (b2 == null || b2.size() <= 0) {
            this.mListView.setVisibility(8);
            return;
        }
        this.mListView.setVisibility(0);
        if (this.q == null) {
            this.q = new MusicSearchHistoryAdapter();
        }
        this.mListView.setAdapter(this.q);
        this.q.a(b2);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f2837a, false, 26638, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2837a, false, 26638, new Class[0], Void.TYPE);
            return;
        }
        r.a("music_search_feedback_show", (Map) d.a().a("enter_from", "video_shoot_page").f34114b);
        this.mStatusView.e();
        this.mListView.setVisibility(4);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f2837a, false, 26650, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2837a, false, 26650, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.f2838b != null) {
            this.f2838b.a();
        }
        if (this.f2839c != null) {
            this.f2839c.a();
            this.f2839c.o = true;
        }
        com.ss.android.ugc.aweme.music.util.b.a().pause();
    }

    private View k() {
        if (PatchProxy.isSupport(new Object[0], this, f2837a, false, 26634, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f2837a, false, 26634, new Class[0], View.class);
        }
        try {
            this.g = g.b().bM().booleanValue();
        } catch (Exception unused) {
        }
        if (com.ss.android.g.a.a()) {
            MtEmptyView a2 = MtEmptyView.a(getContext());
            a2.setStatus(new c.a(getContext()).b((int) C0906R.string.f4486dmt).c(C0906R.string.beu).a(2130839718).f20493a);
            return a2;
        } else if (this.g) {
            try {
                this.h = g.b().O().getMusicFaq().getSchema();
            } catch (Exception unused2) {
            }
            SpannableString spannableString = new SpannableString(getContext().getString(C0906R.string.c2g));
            n.a(spannableString, new ClickableSpan() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f35944a;

                public final void updateDrawState(TextPaint textPaint) {
                    TextPaint textPaint2 = textPaint;
                    if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f35944a, false, 26663, new Class[]{TextPaint.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f35944a, false, 26663, new Class[]{TextPaint.class}, Void.TYPE);
                        return;
                    }
                    super.updateDrawState(textPaint);
                    textPaint2.setUnderlineText(false);
                }

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f35944a, false, 26662, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f35944a, false, 26662, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    f.a a2 = com.ss.android.ugc.aweme.music.util.f.a(NewMusicListFragment.this.h);
                    a2.a("enter_from", "video_shoot_page");
                    h.a().a(a2.a().toString());
                    r.a("music_search_feedback_click", (Map) d.a().a("enter_from", "video_shoot_page").f34114b);
                }
            }, 8, spannableString.length(), 33);
            n.a(spannableString, new ForegroundColorSpan(ContextCompat.getColor(getContext(), C0906R.color.zm)), 8, spannableString.length(), 33);
            n.a(spannableString, new ForegroundColorSpan(ContextCompat.getColor(getContext(), C0906R.color.p3)), 0, 9, 33);
            DmtDefaultView dmtDefaultView = new DmtDefaultView(getContext());
            dmtDefaultView.setStatus(new c.a(getContext()).b((int) C0906R.string.f4486dmt).a(true).a((CharSequence) spannableString).f20493a);
            return dmtDefaultView;
        } else {
            DmtDefaultView dmtDefaultView2 = new DmtDefaultView(getContext());
            dmtDefaultView2.setStatus(new c.a(getContext()).b((int) C0906R.string.f4486dmt).c(C0906R.string.beu).f20493a);
            return dmtDefaultView2;
        }
    }

    public final void a(p.a aVar) {
        this.f2839c.k = aVar;
    }

    @Subscribe(b = true)
    public void onMobMusicTypeEvent(com.ss.android.ugc.aweme.music.a.d dVar) {
        String str = dVar.f56168a;
        if (str == null) {
            this.m = this.n;
        } else if (this.n == null) {
            this.m = str;
            this.n = this.m;
        } else {
            this.n = this.m;
            this.m = str;
        }
    }

    public final void a(MusicModel musicModel) {
        if (PatchProxy.isSupport(new Object[]{musicModel}, this, f2837a, false, 26643, new Class[]{MusicModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel}, this, f2837a, false, 26643, new Class[]{MusicModel.class}, Void.TYPE);
            return;
        }
        f();
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f2837a, false, 26631, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f2837a, false, 26631, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
    }

    public final void b(MusicModel musicModel) {
        if (PatchProxy.isSupport(new Object[]{musicModel}, this, f2837a, false, 26644, new Class[]{MusicModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel}, this, f2837a, false, 26644, new Class[]{MusicModel.class}, Void.TYPE);
            return;
        }
        this.f2839c.l = this.m;
        this.f2839c.b(musicModel, this.f2841e);
    }

    @Subscribe(b = true)
    public void onMusicCollectEvent(e eVar) {
        MusicModel.CollectionType collectionType;
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f2837a, false, 26645, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f2837a, false, 26645, new Class[]{e.class}, Void.TYPE);
            return;
        }
        MusicModel musicModel = eVar.f56170b;
        if (musicModel != null && !CollectionUtils.isEmpty(this.f2842f)) {
            MusicModel a2 = com.ss.android.ugc.aweme.choosemusic.f.d.a(this.f2842f, musicModel.getMusicId());
            if (a2 != null) {
                if (eVar.f56169a == 1) {
                    collectionType = MusicModel.CollectionType.COLLECTED;
                } else {
                    collectionType = MusicModel.CollectionType.NOT_COLLECTED;
                }
                a2.setCollectionType(collectionType);
                int indexOf = this.f2842f.indexOf(a2);
                MusicAdapter musicAdapter = this.f2838b;
                if (musicAdapter != null && indexOf >= 0 && indexOf < this.f2842f.size()) {
                    musicAdapter.notifyItemChanged(indexOf);
                }
            }
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f2837a, false, 26657, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f2837a, false, 26657, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) exc);
    }

    public final /* synthetic */ void a(Object obj) {
        String str;
        String str2;
        com.ss.android.ugc.aweme.choosemusic.a.b bVar = (com.ss.android.ugc.aweme.choosemusic.a.b) obj;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f2837a, false, 26656, new Class[]{com.ss.android.ugc.aweme.choosemusic.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f2837a, false, 26656, new Class[]{com.ss.android.ugc.aweme.choosemusic.a.b.class}, Void.TYPE);
            return;
        }
        String str3 = bVar.f35743b;
        MusicModel musicModel = bVar.f35742a;
        if (musicModel != null) {
            FragmentActivity activity = getActivity();
            if (activity != null && "upload_local_music".equals(str3)) {
                Intent intent = new Intent();
                if (bVar.f35742a == null) {
                    str = "";
                } else {
                    str = bVar.f35742a.getName();
                }
                intent.putExtra("local_music_name", str);
                if (bVar.f35742a == null) {
                    str2 = "";
                } else {
                    str2 = bVar.f35742a.getPath();
                }
                intent.putExtra("local_music_path", str2);
                activity.setResult(-1, intent);
                activity.finish();
            } else if ("follow_type".equals(str3)) {
                this.p.a(1, musicModel.getMusicId(), 1);
            } else if ("unfollow_type".equals(str3)) {
                this.p.a(1, musicModel.getMusicId(), 0);
            }
        }
    }

    public final void a(MusicModel musicModel, com.ss.android.ugc.aweme.choosemusic.a aVar) {
        if (PatchProxy.isSupport(new Object[]{musicModel, aVar}, this, f2837a, false, 26642, new Class[]{MusicModel.class, com.ss.android.ugc.aweme.choosemusic.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel, aVar}, this, f2837a, false, 26642, new Class[]{MusicModel.class, com.ss.android.ugc.aweme.choosemusic.a.class}, Void.TYPE);
            return;
        }
        this.s = musicModel;
        if (this.r) {
            this.f2839c.f35883d = aVar;
            this.f2839c.a(musicModel, this.f2841e);
            return;
        }
        this.f2839c.b(musicModel, this.f2841e);
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f2837a, false, 26632, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f2837a, false, 26632, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f2837a, false, 26633, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2837a, false, 26633, new Class[0], Void.TYPE);
            return;
        }
        this.f2838b = new MusicAdapter(this, true);
        this.f2838b.i = this.o;
        this.mListView.setVisibility(8);
        this.f2838b.setShowFooter(true);
        this.f2838b.mTextColor = getResources().getColor(C0906R.color.i3);
        this.f2838b.mLabel = "music_list";
        this.f2838b.f35768f = new com.ss.android.ugc.aweme.choosemusic.a("search_music", "", "", com.ss.android.ugc.aweme.choosemusic.f.c.a());
        this.f2838b.f35764b = this;
        this.f2839c.c();
        this.f2839c.k = new k(this);
        this.f2839c.b(this.o);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.setOrientation(1);
        this.mListView.setLayoutManager(wrapLinearLayoutManager);
        this.f2838b.setLoadMoreListener(this);
        new PreloadRecyclerViewConverter(new l(this), 10).a(this.mListView);
        this.p = new com.ss.android.ugc.aweme.favorites.c.a();
        this.p.a(this);
        this.mStatusView.setBuilder(DmtStatusView.a.a(getContext()).a(C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new m(this)).b(k()).c(0));
        this.mBackgroundView.setOnClickListener(this.k);
        a();
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f2837a, false, 26630, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f2837a, false, 26630, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.or, viewGroup2, false);
        this.f2839c = new com.ss.android.ugc.aweme.choosemusic.f.a(this);
        if (getArguments() != null) {
            this.o = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
        } else {
            this.o = 0;
        }
        return inflate;
    }

    public final void a(String str, MusicModel musicModel, String str2) {
        String str3 = str;
        MusicModel musicModel2 = musicModel;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, musicModel2, str4}, this, f2837a, false, 26655, new Class[]{String.class, MusicModel.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, musicModel2, str4}, this, f2837a, false, 26655, new Class[]{String.class, MusicModel.class, String.class}, Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.f2840d.a(this, str3, musicModel2, str4);
        }
    }
}
