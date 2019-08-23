package com.ss.android.ugc.aweme.shortvideo.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.lib.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ac.b;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.l;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.ui.b;
import com.ss.android.ugc.aweme.common.x;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.adapter.MusicMixAdapter;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.presenter.e;
import com.ss.android.ugc.aweme.music.presenter.q;
import com.ss.android.ugc.aweme.music.ui.MusicListFragment;
import com.ss.android.ugc.aweme.music.ui.MusicRecommendActivity;
import com.ss.android.ugc.aweme.music.ui.MusicTabListFragment;
import com.ss.android.ugc.aweme.music.util.c;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.u.ak;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.ex;
import java.util.ArrayList;
import java.util.List;

public class OnlineMusicFragment extends AmeBaseFragment implements FragmentManager.OnBackStackChangedListener, View.OnClickListener, e, MusicListFragment.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67780a;

    /* renamed from: b  reason: collision with root package name */
    public q f67781b;

    /* renamed from: c  reason: collision with root package name */
    public MusicTabListFragment f67782c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f67783d;

    /* renamed from: e  reason: collision with root package name */
    private int f67784e;

    /* renamed from: f  reason: collision with root package name */
    private String f67785f;
    private MusicMixAdapter.a g;
    private Music h;
    @BindView(2131496645)
    View llRecommendMusic;
    @BindView(2131493213)
    View mBackView;
    @BindView(2131498114)
    TextView mCancelSearch;
    @BindView(2131495550)
    RelativeLayout mLinearGrid;
    @BindView(2131495584)
    LinearLayout mLinearSearch;
    @BindView(2131495557)
    View mListViewBackground;
    @BindView(2131493757)
    FrameLayout mMainLayout;
    @BindView(2131496798)
    LinearLayout mRelativeSearch;
    @BindView(2131496799)
    RelativeLayout mSearchBg;
    @BindView(2131496800)
    LinearLayout mSearchEditTextContainer;
    @BindView(2131498111)
    EditText mSearchEditView;
    @BindView(2131493756)
    LinearLayout mSearchLayout;
    @BindView(2131498112)
    TextView mSearchTextView;
    @BindView(2131497167)
    View mSkipView;
    @BindView(2131497340)
    DmtStatusView mStatusView;
    @BindView(2131493566)
    TextView txtClickRecommend;

    public final void a(List<MusicModel> list, boolean z) {
        LogPbBean logPbBean;
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f67780a, false, 77333, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f67780a, false, 77333, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (list == null) {
            this.mStatusView.f();
        } else if (isViewValid()) {
            d a2 = d.a().a("search_type", "music").a("enter_method", "creation").a("search_keyword", this.mSearchEditView.getText().toString()).a("enter_from", this.f67784e == 0 ? "video_edit_page" : "video_shoot_page").a("trigger_reason", "cold_launch");
            if (CollectionUtils.isEmpty(list)) {
                logPbBean = null;
            } else {
                logPbBean = list.get(0).getLogPb();
            }
            r.a("search_music", aa.a(a2.a("log_pb", logPbBean).f34114b));
            this.llRecommendMusic.setVisibility(0);
            if (list.size() > 0) {
                for (MusicModel next : list) {
                    next.setDataType(1);
                    if (next.getMusic() == null) {
                        next.setMusic(c.f56796b.b(next));
                    }
                }
                MusicListFragment musicListFragment = (MusicListFragment) getChildFragmentManager().findFragmentById(C0906R.id.z2);
                if (!(musicListFragment == null || musicListFragment.f3625c == null)) {
                    MusicMixAdapter musicMixAdapter = musicListFragment.f3625c;
                    String obj = this.mSearchEditView.getText().toString();
                    musicMixAdapter.f56191b = obj;
                    if (musicMixAdapter.r != null) {
                        musicMixAdapter.r.f56283b = obj;
                    }
                    musicListFragment.b(list, 2);
                    com.ss.android.ugc.aweme.music.util.d.f56798b = this.mSearchEditView.getText().toString();
                    if (this.f67781b.a()) {
                        musicListFragment.f3625c.resetLoadMoreState();
                    } else {
                        musicListFragment.f3625c.showLoadMoreEmpty();
                    }
                }
                this.mStatusView.b();
            } else {
                if (getActivity() != null) {
                    b.a((Activity) getActivity(), (View) this.mSearchEditView);
                    if (NetworkUtils.isNetworkAvailable(getContext())) {
                        this.mStatusView.e();
                    } else {
                        this.mStatusView.f();
                    }
                }
            }
        }
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f67780a, false, 77330, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67780a, false, 77330, new Class[0], Void.TYPE);
        } else if (getActivity() != null) {
            this.mSearchEditView.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67793a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f67793a, false, 77345, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f67793a, false, 77345, new Class[0], Void.TYPE);
                        return;
                    }
                    if (OnlineMusicFragment.this.mSearchEditView != null) {
                        OnlineMusicFragment.this.mSearchEditView.requestFocus();
                        r.a(OnlineMusicFragment.this.getContext(), "enter_search", "popular_song", 0, 0);
                        KeyboardUtils.a(OnlineMusicFragment.this.mSearchEditView);
                        bg.a(new com.ss.android.ugc.aweme.music.a.c(false));
                    }
                }
            });
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f67780a, false, 77323, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67780a, false, 77323, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f67780a, false, 77332, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67780a, false, 77332, new Class[0], Void.TYPE);
            return;
        }
        this.f67783d = false;
        this.mSearchEditView.setText("");
        this.mSearchTextView.setVisibility(0);
        this.mCancelSearch.setVisibility(4);
        KeyboardUtils.c(this.mSearchEditView);
        bg.a(new com.ss.android.ugc.aweme.music.a.c(true));
        MusicListFragment musicListFragment = (MusicListFragment) getChildFragmentManager().findFragmentById(C0906R.id.z2);
        if (musicListFragment != null) {
            musicListFragment.f();
        }
        try {
            getChildFragmentManager().popBackStackImmediate();
        } catch (Exception unused) {
        }
        bg.b(new com.ss.android.ugc.aweme.music.a.d(null));
    }

    public void onBackStackChanged() {
        if (PatchProxy.isSupport(new Object[0], this, f67780a, false, 77340, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67780a, false, 77340, new Class[0], Void.TYPE);
            return;
        }
        ViewGroup a2 = a(getView());
        Fragment findFragmentById = getChildFragmentManager().findFragmentById(C0906R.id.z2);
        if (findFragmentById != null) {
            this.mLinearSearch.setVisibility(0);
            this.mRelativeSearch.setVisibility(8);
            if (a2 != null) {
                ViewPagerBottomSheetBehavior.a(a2).b(findFragmentById.getView());
            }
        } else {
            this.mLinearSearch.setVisibility(8);
            this.llRecommendMusic.setVisibility(8);
            this.mRelativeSearch.setVisibility(0);
            if (a2 != null) {
                ViewPagerBottomSheetBehavior.a(a2).b((View) null);
            }
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f67780a, false, 77335, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67780a, false, 77335, new Class[0], Void.TYPE);
            return;
        }
        getChildFragmentManager().removeOnBackStackChangedListener(this);
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f67780a, false, 77336, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67780a, false, 77336, new Class[0], Void.TYPE);
            return;
        }
        this.f67781b.b();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f67780a, false, 77327, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67780a, false, 77327, new Class[0], Void.TYPE);
        } else if (this.mSearchLayout != null) {
            this.mSearchLayout.setVisibility(8);
            this.mMainLayout.setVisibility(0);
            this.mCancelSearch.setVisibility(0);
            this.mSearchTextView.setVisibility(4);
            this.f67782c.f();
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f67780a, false, 77322, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f67780a, false, 77322, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
    }

    private ViewGroup a(View view) {
        View view2 = view;
        while (true) {
            if (PatchProxy.isSupport(new Object[]{view2}, this, f67780a, false, 77339, new Class[]{View.class}, ViewGroup.class)) {
                return (ViewGroup) PatchProxy.accessDispatch(new Object[]{view2}, this, f67780a, false, 77339, new Class[]{View.class}, ViewGroup.class);
            } else if (view2 == null) {
                return null;
            } else {
                ViewParent parent = view2.getParent();
                if (!(parent instanceof ViewGroup)) {
                    return null;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if ((layoutParams instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof ViewPagerBottomSheetBehavior)) {
                    return viewGroup;
                }
                view2 = (View) parent;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f67780a, false, 77320, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f67780a, false, 77320, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f67784e = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 0);
            this.f67785f = getArguments().getString("challenge");
            this.h = (Music) getArguments().getSerializable("sticker_music");
            this.g = (MusicMixAdapter.a) getArguments().getSerializable("music_style");
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f67780a, false, 77331, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f67780a, false, 77331, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view.getId() == C0906R.id.cgc) {
            if (!ex.c()) {
                if (PatchProxy.isSupport(new Object[0], this, f67780a, false, 77326, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f67780a, false, 77326, new Class[0], Void.TYPE);
                } else {
                    this.f67783d = true;
                    FragmentManager childFragmentManager = getChildFragmentManager();
                    final MusicListFragment musicListFragment = (MusicListFragment) childFragmentManager.findFragmentById(C0906R.id.z2);
                    if (musicListFragment == null) {
                        musicListFragment = MusicListFragment.a(this.f67784e, this.g);
                        musicListFragment.f3628f = 2;
                        FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
                        beginTransaction.add(C0906R.id.z2, musicListFragment, "search_result_list_tag");
                        beginTransaction.addToBackStack(null);
                        beginTransaction.commitAllowingStateLoss();
                    }
                    musicListFragment.i = new MusicListFragment.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f67790a;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f67790a, false, 77344, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f67790a, false, 77344, new Class[0], Void.TYPE);
                                return;
                            }
                            if (OnlineMusicFragment.this.f67781b.a()) {
                                if (musicListFragment.f3625c != null) {
                                    musicListFragment.f3625c.showLoadMoreLoading();
                                }
                                OnlineMusicFragment.this.f67781b.a("video_music");
                            }
                        }
                    };
                    musicListFragment.f3627e = this;
                }
                b();
                a();
                this.f67782c.f();
            }
        } else if (view.getId() == C0906R.id.bgz) {
            dismiss();
        } else if (view.getId() == C0906R.id.di2) {
            a(this.mSearchEditView.getText().toString());
        } else if (view.getId() == C0906R.id.di4) {
            dismiss();
        } else if (view.getId() == C0906R.id.cge) {
            b();
        } else if (view.getId() == C0906R.id.ix) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        } else if (view.getId() == C0906R.id.crs) {
            FragmentActivity activity2 = getActivity();
            if (this.f67784e == 0) {
                activity2.onBackPressed();
                return;
            }
            a.a(getActivity(), "music_skip", "music_library");
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setCurMusic(null);
            if (activity2 != null) {
                ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) activity2, new Intent());
            }
        } else {
            if (view.getId() == C0906R.id.ta) {
                final FragmentActivity activity3 = getActivity();
                if (activity3 != null) {
                    l.a(activity3, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new b.C0400b() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f67795a;

                        public final void a(String[] strArr, int[] iArr) {
                            if (PatchProxy.isSupport(new Object[]{strArr, iArr}, this, f67795a, false, 77346, new Class[]{String[].class, int[].class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{strArr, iArr}, this, f67795a, false, 77346, new Class[]{String[].class, int[].class}, Void.TYPE);
                                return;
                            }
                            if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
                                activity3.startActivity(new Intent(activity3, MusicRecommendActivity.class));
                                r.onEvent(MobClick.obtain().setEventName("recommend_music").setLabelName("music_library_search"));
                            }
                        }
                    });
                }
            }
        }
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f67780a, false, 77328, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f67780a, false, 77328, new Class[]{String.class}, Void.TYPE);
        } else if (getActivity() != null) {
            if (StringUtils.isEmpty(str)) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.aao).a();
                return;
            }
            this.mSearchLayout.setVisibility(0);
            this.mMainLayout.setVisibility(8);
            this.mSearchTextView.setVisibility(0);
            this.mCancelSearch.setVisibility(4);
            KeyboardUtils.c(this.mSearchEditView);
            this.mStatusView.d();
            this.f67781b.a(str2, "video_music");
            this.f67782c.f();
            MusicListFragment musicListFragment = (MusicListFragment) getChildFragmentManager().findFragmentById(C0906R.id.z2);
            if (musicListFragment != null) {
                if (PatchProxy.isSupport(new Object[0], musicListFragment, MusicListFragment.f3623a, false, 60401, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], musicListFragment, MusicListFragment.f3623a, false, 60401, new Class[0], Void.TYPE);
                } else if (musicListFragment.f3625c != null) {
                    musicListFragment.f3625c.b();
                }
                musicListFragment.b(new ArrayList(), 2);
            }
            bg.b(new com.ss.android.ugc.aweme.music.a.d("search_result"));
            r.onEvent(MobClick.obtain().setEventName("search").setLabelName("popular_song").setJsonObject(new com.ss.android.ugc.aweme.app.d.c().a("keyword", str2).b()));
        }
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        MusicTabListFragment musicTabListFragment;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f67780a, false, 77324, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f67780a, false, 77324, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f67780a, false, 77325, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67780a, false, 77325, new Class[0], Void.TYPE);
        } else {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Fragment findFragmentById = childFragmentManager.findFragmentById(C0906R.id.z3);
            if (findFragmentById != null) {
                this.f67782c = (MusicTabListFragment) findFragmentById;
            } else {
                int i = this.f67784e;
                String str = this.f67785f;
                Music music = this.h;
                MusicMixAdapter.a aVar = this.g;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, music, aVar}, null, MusicTabListFragment.j, true, 60451, new Class[]{Integer.TYPE, String.class, Music.class, MusicMixAdapter.a.class}, MusicTabListFragment.class)) {
                    musicTabListFragment = (MusicTabListFragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, music, aVar}, null, MusicTabListFragment.j, true, 60451, new Class[]{Integer.TYPE, String.class, Music.class, MusicMixAdapter.a.class}, MusicTabListFragment.class);
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
                    if (!TextUtils.isEmpty(str)) {
                        bundle2.putString("challenge", str);
                    }
                    if (music != null) {
                        bundle2.putSerializable("sticker_music", music);
                    }
                    bundle2.putSerializable("music_style", aVar);
                    musicTabListFragment = new MusicTabListFragment();
                    musicTabListFragment.setArguments(bundle2);
                }
                this.f67782c = musicTabListFragment;
                FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
                beginTransaction.add((int) C0906R.id.z3, (Fragment) this.f67782c);
                beginTransaction.commitAllowingStateLoss();
            }
        }
        getChildFragmentManager().addOnBackStackChangedListener(this);
        this.f67781b = new q(this);
        if (PatchProxy.isSupport(new Object[0], this, f67780a, false, 77329, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67780a, false, 77329, new Class[0], Void.TYPE);
        } else {
            this.mRelativeSearch.setOnClickListener(this);
        }
        if (this.f67784e == 0) {
            this.mSkipView.setVisibility(8);
        }
        this.mSearchEditView.setFilters(new InputFilter[]{new x()});
        this.mSearchEditView.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f67786a;

            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (PatchProxy.isSupport(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f67786a, false, 77342, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f67786a, false, 77342, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
                } else if (i != 3) {
                    return false;
                } else {
                    OnlineMusicFragment.this.a(OnlineMusicFragment.this.mSearchEditView.getText().toString());
                    return true;
                }
            }
        });
        this.mSearchEditView.addTextChangedListener(new TextWatcher() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f67788a;

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                if (PatchProxy.isSupport(new Object[]{editable}, this, f67788a, false, 77343, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable}, this, f67788a, false, 77343, new Class[]{Editable.class}, Void.TYPE);
                } else if (StringUtils.isEmpty(editable.toString())) {
                    OnlineMusicFragment.this.a();
                } else {
                    OnlineMusicFragment.this.mCancelSearch.setVisibility(4);
                    OnlineMusicFragment.this.mSearchTextView.setVisibility(0);
                }
            }
        });
        this.mListViewBackground.setOnClickListener(this);
        this.mSearchEditTextContainer.setOnClickListener(this);
        this.mSearchTextView.setOnClickListener(this);
        this.mCancelSearch.setOnClickListener(this);
        this.mBackView.setOnClickListener(this);
        this.mSkipView.setOnClickListener(this);
        this.txtClickRecommend.setOnClickListener(this);
        this.mStatusView.setBuilder(DmtStatusView.a.a((Context) getActivity()).a(C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new a(this)).a((int) C0906R.string.f4486dmt, (int) C0906R.string.beu).c(0));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f67780a, false, 77321, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.p_, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f67780a, false, 77321, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }

    public final void a(MusicListFragment musicListFragment, String str, MusicModel musicModel, String str2) {
        String str3 = str;
        MusicModel musicModel2 = musicModel;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{musicListFragment, str3, musicModel2, str4}, this, f67780a, false, 77338, new Class[]{MusicListFragment.class, String.class, MusicModel.class, String.class}, Void.TYPE)) {
            Object[] objArr = {musicListFragment, str3, musicModel2, str4};
            PatchProxy.accessDispatch(objArr, this, f67780a, false, 77338, new Class[]{MusicListFragment.class, String.class, MusicModel.class, String.class}, Void.TYPE);
            return;
        }
        FragmentActivity activity = getActivity();
        Intent intent = new Intent();
        intent.putExtra("path", str3);
        intent.putExtra("music_model", musicModel2);
        intent.putExtra("music_origin", str4);
        if (musicListFragment.k() == 0 || musicListFragment.k() == 2) {
            activity.setResult(-1, intent);
            activity.finish();
            return;
        }
        if (musicModel.getMusic() == null || musicModel.getMusic().getChallenge() == null) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().removeChallenges();
        } else {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().addChallenge(com.ss.android.ugc.aweme.shortvideo.o.a.b(musicModel.getMusic().getChallenge()));
        }
        new ak().a("search_result").e();
        intent.putExtra("shoot_way", "search_result");
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) activity, intent);
    }

    public static OnlineMusicFragment a(int i, String str, MusicModel musicModel, MusicMixAdapter.a aVar, boolean z, @Nullable Bundle bundle, String str2) {
        String str3 = str;
        MusicModel musicModel2 = musicModel;
        MusicMixAdapter.a aVar2 = aVar;
        Bundle bundle2 = bundle;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, musicModel2, aVar2, Byte.valueOf(z ? (byte) 1 : 0), bundle2, str4}, null, f67780a, true, 77319, new Class[]{Integer.TYPE, String.class, MusicModel.class, MusicMixAdapter.a.class, Boolean.TYPE, Bundle.class, String.class}, OnlineMusicFragment.class)) {
            return (OnlineMusicFragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, musicModel2, aVar2, Byte.valueOf(z), bundle2, str4}, null, f67780a, true, 77319, new Class[]{Integer.TYPE, String.class, MusicModel.class, MusicMixAdapter.a.class, Boolean.TYPE, Bundle.class, String.class}, OnlineMusicFragment.class);
        }
        OnlineMusicFragment onlineMusicFragment = new OnlineMusicFragment();
        Bundle bundle3 = new Bundle();
        bundle3.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        bundle3.putSerializable("challenge", str3);
        bundle3.putSerializable("music_model", musicModel2);
        bundle3.putSerializable("music_style", aVar2);
        bundle3.putSerializable("music_allow_clear", Boolean.valueOf(z));
        bundle3.putSerializable("enter_from", str4);
        if (bundle2 != null) {
            bundle3.putAll(bundle2);
        }
        onlineMusicFragment.setArguments(bundle3);
        return onlineMusicFragment;
    }
}
