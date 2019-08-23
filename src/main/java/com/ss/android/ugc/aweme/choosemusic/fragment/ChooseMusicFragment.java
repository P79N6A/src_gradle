package com.ss.android.ugc.aweme.choosemusic.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.annotation.Nullable;
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
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.lib.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ac.b;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicListFragment;
import com.ss.android.ugc.aweme.choosemusic.view.ChooseMusicFragmentView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.x;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.a.c;
import com.ss.android.ugc.aweme.music.a.d;
import com.ss.android.ugc.aweme.music.adapter.MusicMixAdapter;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.music.presenter.e;
import com.ss.android.ugc.aweme.music.presenter.q;
import com.ss.android.ugc.aweme.music.ui.v;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.ex;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;

public class ChooseMusicFragment extends AmeBaseFragment implements FragmentManager.OnBackStackChangedListener, View.OnClickListener, TextView.OnEditorActionListener, WeakHandler.IHandler, NewMusicListFragment.b, e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2831a;

    /* renamed from: b  reason: collision with root package name */
    public q f2832b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2833c;

    /* renamed from: d  reason: collision with root package name */
    ChooseMusicFragmentView f2834d;

    /* renamed from: e  reason: collision with root package name */
    public View f2835e;

    /* renamed from: f  reason: collision with root package name */
    TextView f2836f;
    View g;
    boolean h;
    public WeakHandler i = new WeakHandler(this);
    public String j;
    public String k;
    TextWatcher l = new TextWatcher() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35924a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            if (PatchProxy.isSupport(new Object[]{editable}, this, f35924a, false, 26555, new Class[]{Editable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{editable}, this, f35924a, false, 26555, new Class[]{Editable.class}, Void.TYPE);
                return;
            }
            String obj = editable.toString();
            if (StringUtils.isEmpty(obj)) {
                ChooseMusicFragment chooseMusicFragment = ChooseMusicFragment.this;
                if (PatchProxy.isSupport(new Object[0], chooseMusicFragment, ChooseMusicFragment.f2831a, false, 26541, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], chooseMusicFragment, ChooseMusicFragment.f2831a, false, 26541, new Class[0], Void.TYPE);
                } else {
                    NewMusicListFragment newMusicListFragment = (NewMusicListFragment) chooseMusicFragment.getChildFragmentManager().findFragmentById(C0906R.id.z2);
                    if (newMusicListFragment != null) {
                        newMusicListFragment.a();
                    }
                }
                ChooseMusicFragmentView chooseMusicFragmentView = ChooseMusicFragment.this.f2834d;
                if (PatchProxy.isSupport(new Object[0], chooseMusicFragmentView, ChooseMusicFragmentView.f36021a, false, 26832, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], chooseMusicFragmentView, ChooseMusicFragmentView.f36021a, false, 26832, new Class[0], Void.TYPE);
                } else {
                    chooseMusicFragmentView.mCancelSearch.setVisibility(0);
                    chooseMusicFragmentView.mSearchTextView.setVisibility(4);
                }
            } else {
                if (ChooseMusicFragment.this.m) {
                    ChooseMusicFragment.this.m = false;
                    ChooseMusicFragment.this.a(obj);
                } else if (AbTestManager.a().aO()) {
                    ChooseMusicFragment.this.i.removeMessages(1);
                    Message obtain = Message.obtain();
                    obtain.what = 1;
                    obtain.obj = obj;
                    ChooseMusicFragment.this.i.sendMessageDelayed(obtain, 200);
                    return;
                }
                ChooseMusicFragment.this.f2834d.a();
            }
        }
    };
    public boolean m;
    private int n;
    private String o;
    private MusicMixAdapter.a p;
    private NewMusicTabFragment q;
    private Music r;
    private String s;
    private String t;
    private MusicModel u;

    public boolean isRegisterEventBus() {
        return true;
    }

    private NewMusicListFragment a() {
        if (!PatchProxy.isSupport(new Object[0], this, f2831a, false, 26531, new Class[0], NewMusicListFragment.class)) {
            return (NewMusicListFragment) getChildFragmentManager().findFragmentById(C0906R.id.z2);
        }
        return (NewMusicListFragment) PatchProxy.accessDispatch(new Object[0], this, f2831a, false, 26531, new Class[0], NewMusicListFragment.class);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f2831a, false, 26544, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2831a, false, 26544, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.i.removeCallbacksAndMessages(null);
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f2831a, false, 26537, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2831a, false, 26537, new Class[0], Void.TYPE);
            return;
        }
        getChildFragmentManager().removeOnBackStackChangedListener(this);
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f2831a, false, 26538, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2831a, false, 26538, new Class[0], Void.TYPE);
            return;
        }
        this.f2832b.b();
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f2831a, false, 26535, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2831a, false, 26535, new Class[0], Void.TYPE);
            return;
        }
        this.f2833c = false;
        ChooseMusicFragmentView chooseMusicFragmentView = this.f2834d;
        if (PatchProxy.isSupport(new Object[0], chooseMusicFragmentView, ChooseMusicFragmentView.f36021a, false, 26837, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], chooseMusicFragmentView, ChooseMusicFragmentView.f36021a, false, 26837, new Class[0], Void.TYPE);
        } else {
            chooseMusicFragmentView.mSearchEditView.setText("");
            chooseMusicFragmentView.mMainLayout.setVisibility(0);
            chooseMusicFragmentView.mSearchLayout.setVisibility(8);
            chooseMusicFragmentView.mSearchTextView.setVisibility(0);
            chooseMusicFragmentView.mCancelSearch.setVisibility(4);
            KeyboardUtils.c(chooseMusicFragmentView.mSearchEditView);
        }
        bg.a(new c(true));
        NewMusicListFragment newMusicListFragment = (NewMusicListFragment) getChildFragmentManager().findFragmentById(C0906R.id.z2);
        if (newMusicListFragment != null) {
            newMusicListFragment.f();
        }
        try {
            getChildFragmentManager().popBackStackImmediate();
        } catch (Exception unused) {
        }
        bg.b(new d(null));
    }

    public void onBackStackChanged() {
        if (PatchProxy.isSupport(new Object[0], this, f2831a, false, 26540, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2831a, false, 26540, new Class[0], Void.TYPE);
            return;
        }
        Fragment findFragmentById = getChildFragmentManager().findFragmentById(C0906R.id.z2);
        ChooseMusicFragmentView chooseMusicFragmentView = this.f2834d;
        if (PatchProxy.isSupport(new Object[]{findFragmentById}, chooseMusicFragmentView, ChooseMusicFragmentView.f36021a, false, 26838, new Class[]{Fragment.class}, Void.TYPE)) {
            ChooseMusicFragmentView chooseMusicFragmentView2 = chooseMusicFragmentView;
            PatchProxy.accessDispatch(new Object[]{findFragmentById}, chooseMusicFragmentView2, ChooseMusicFragmentView.f36021a, false, 26838, new Class[]{Fragment.class}, Void.TYPE);
            return;
        }
        ViewGroup a2 = chooseMusicFragmentView.a(chooseMusicFragmentView.f36022b.getView());
        if (findFragmentById != null) {
            chooseMusicFragmentView.mLinearSearch.setVisibility(0);
            chooseMusicFragmentView.mRelativeSearch.setVisibility(8);
            if (a2 != null) {
                ViewPagerBottomSheetBehavior.a(a2).b(findFragmentById.getView());
            }
        } else {
            chooseMusicFragmentView.mLinearSearch.setVisibility(8);
            chooseMusicFragmentView.mRelativeSearch.setVisibility(0);
            if (a2 != null) {
                ViewPagerBottomSheetBehavior.a(a2).b((View) null);
            }
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f2831a, false, 26533, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f2831a, false, 26533, new Class[]{String.class}, Void.TYPE);
            return;
        }
        KeyboardUtils.c(this.g);
        a(str, false);
    }

    public void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f2831a, false, 26545, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f2831a, false, 26545, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message2.what == 1) {
            a((String) message2.obj, true);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f2831a, false, 26524, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f2831a, false, 26524, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.n = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            this.o = getArguments().getString("challenge");
            this.j = getArguments().getString("creation_id");
            this.k = getArguments().getString("shoot_way");
            this.p = (MusicMixAdapter.a) getArguments().getSerializable("music_style");
            this.r = (Music) getArguments().getSerializable("sticker_music");
            this.s = getArguments().getString("first_sticker_music_ids", null);
            this.t = getArguments().getString("first_sticker_id", null);
            this.u = (MusicModel) getArguments().getSerializable("music_model");
            this.h = getArguments().getBoolean("music_allow_clear", false);
        }
    }

    @Subscribe
    public void onSearchHistoryClick(com.ss.android.ugc.aweme.choosemusic.a.c cVar) {
        com.ss.android.ugc.aweme.choosemusic.a.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f2831a, false, 26542, new Class[]{com.ss.android.ugc.aweme.choosemusic.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f2831a, false, 26542, new Class[]{com.ss.android.ugc.aweme.choosemusic.a.c.class}, Void.TYPE);
            return;
        }
        this.m = true;
        ChooseMusicFragmentView chooseMusicFragmentView = this.f2834d;
        String str = cVar2.f35746a;
        if (PatchProxy.isSupport(new Object[]{str}, chooseMusicFragmentView, ChooseMusicFragmentView.f36021a, false, 26842, new Class[]{CharSequence.class}, Void.TYPE)) {
            Object[] objArr = {str};
            ChooseMusicFragmentView chooseMusicFragmentView2 = chooseMusicFragmentView;
            ChangeQuickRedirect changeQuickRedirect = ChooseMusicFragmentView.f36021a;
            PatchProxy.accessDispatch(objArr, chooseMusicFragmentView2, changeQuickRedirect, false, 26842, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            chooseMusicFragmentView.mSearchEditView.setText(str);
            chooseMusicFragmentView.mSearchEditView.setSelection(str.length());
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f2831a, false, 26532, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f2831a, false, 26532, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view.getId() == C0906R.id.cgc) {
            if (!ex.c()) {
                if (PatchProxy.isSupport(new Object[0], this, f2831a, false, 26530, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f2831a, false, 26530, new Class[0], Void.TYPE);
                } else {
                    this.f2833c = true;
                    FragmentManager childFragmentManager = getChildFragmentManager();
                    final NewMusicListFragment newMusicListFragment = (NewMusicListFragment) childFragmentManager.findFragmentById(C0906R.id.z2);
                    if (newMusicListFragment == null) {
                        int i2 = this.n;
                        MusicMixAdapter.a aVar = this.p;
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), aVar}, null, NewMusicListFragment.f2837a, true, 26629, new Class[]{Integer.TYPE, MusicMixAdapter.a.class}, NewMusicListFragment.class)) {
                            newMusicListFragment = (NewMusicListFragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), aVar}, null, NewMusicListFragment.f2837a, true, 26629, new Class[]{Integer.TYPE, MusicMixAdapter.a.class}, NewMusicListFragment.class);
                        } else {
                            NewMusicListFragment newMusicListFragment2 = new NewMusicListFragment();
                            Bundle bundle = new Bundle();
                            bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
                            bundle.putSerializable("music_style", aVar);
                            newMusicListFragment2.setArguments(bundle);
                            newMusicListFragment = newMusicListFragment2;
                        }
                        newMusicListFragment.f2841e = 2;
                        newMusicListFragment.k = new a(this);
                        newMusicListFragment.i = new b(this);
                        FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
                        beginTransaction.add(C0906R.id.z2, newMusicListFragment, "search_result_list_tag");
                        beginTransaction.addToBackStack(null);
                        beginTransaction.commitAllowingStateLoss();
                    }
                    newMusicListFragment.j = new NewMusicListFragment.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f35921a;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f35921a, false, 26554, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f35921a, false, 26554, new Class[0], Void.TYPE);
                                return;
                            }
                            if (ChooseMusicFragment.this.f2832b.a()) {
                                if (newMusicListFragment.f2838b != null) {
                                    newMusicListFragment.f2838b.showLoadMoreLoading();
                                }
                                ChooseMusicFragment.this.f2832b.a("video_music");
                            }
                        }
                    };
                    newMusicListFragment.f2840d = this;
                }
                this.f2834d.b();
                ChooseMusicFragmentView chooseMusicFragmentView = this.f2834d;
                if (PatchProxy.isSupport(new Object[0], chooseMusicFragmentView, ChooseMusicFragmentView.f36021a, false, 26830, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], chooseMusicFragmentView, ChooseMusicFragmentView.f36021a, false, 26830, new Class[0], Void.TYPE);
                } else if (chooseMusicFragmentView.mSearchLayout != null) {
                    chooseMusicFragmentView.mSearchLayout.setVisibility(0);
                    chooseMusicFragmentView.mMainLayout.setVisibility(8);
                    chooseMusicFragmentView.mCancelSearch.setVisibility(0);
                    chooseMusicFragmentView.mSearchTextView.setVisibility(4);
                }
                this.q.a();
            }
        } else if (view.getId() == C0906R.id.di2) {
            a(this.f2834d.c());
        } else if (view.getId() == C0906R.id.di4) {
            dismiss();
        } else if (view.getId() == C0906R.id.cge) {
            this.f2834d.b();
        } else if (view.getId() == C0906R.id.ix) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        } else if (view.getId() == C0906R.id.crs) {
            FragmentActivity activity2 = getActivity();
            if (this.n == 0) {
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
                FragmentActivity activity3 = getActivity();
                if (activity3 != null) {
                    b.a(activity3, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new c(activity3));
                }
            }
        }
    }

    private void a(String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f2831a, false, 26534, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, f2831a, false, 26534, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
        } else if (getActivity() != null && !StringUtils.isEmpty(str)) {
            NewMusicListFragment a2 = a();
            if (!z) {
                if (a2 != null) {
                    a().b();
                }
                com.ss.android.ugc.aweme.choosemusic.c.c.c().b(new MusicSearchHistory(str2));
            }
            if (a2 != null) {
                a2.e();
            }
            this.f2832b.a(str2, "video_music");
            bg.b(new d("search_result"));
            com.ss.android.ugc.aweme.choosemusic.f.c.c();
        }
    }

    public final void a(List<MusicModel> list, boolean z) {
        String str;
        String str2;
        LogPbBean logPbBean;
        List<MusicModel> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f2831a, false, 26536, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z)}, this, f2831a, false, 26536, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid() && !TextUtils.isEmpty(this.f2834d.c())) {
            NewMusicListFragment a2 = a();
            if (list2 != null) {
                com.ss.android.ugc.aweme.app.d.d a3 = com.ss.android.ugc.aweme.app.d.d.a().a("search_type", "music").a("enter_method", "creation");
                ChooseMusicFragmentView chooseMusicFragmentView = this.f2834d;
                if (PatchProxy.isSupport(new Object[0], chooseMusicFragmentView, ChooseMusicFragmentView.f36021a, false, 26841, new Class[0], String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[0], chooseMusicFragmentView, ChooseMusicFragmentView.f36021a, false, 26841, new Class[0], String.class);
                } else if (chooseMusicFragmentView.mSearchEditView == null) {
                    str = "";
                } else {
                    str = chooseMusicFragmentView.mSearchEditView.getText().toString();
                }
                com.ss.android.ugc.aweme.app.d.d a4 = a3.a("search_keyword", str);
                if (this.n == 0) {
                    str2 = "video_edit_page";
                } else {
                    str2 = "video_shoot_page";
                }
                com.ss.android.ugc.aweme.app.d.d a5 = a4.a("enter_from", str2).a("trigger_reason", "cold_launch");
                if (CollectionUtils.isEmpty(list)) {
                    logPbBean = null;
                } else {
                    logPbBean = list2.get(0).getLogPb();
                }
                r.a("search_music", v.a(a5.a("log_pb", logPbBean).f34114b));
                if (list.size() > 0) {
                    for (MusicModel next : list) {
                        next.setDataType(1);
                        if (next.getMusic() == null) {
                            next.setMusic(com.ss.android.ugc.aweme.music.util.c.f56796b.b(next));
                        }
                    }
                    if (!(a2 == null || a2.f2838b == null)) {
                        a2.f2838b.f35767e = this.f2834d.c();
                        if (PatchProxy.isSupport(new Object[]{list2, 2, Byte.valueOf(z)}, a2, NewMusicListFragment.f2837a, false, 26646, new Class[]{List.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                            NewMusicListFragment newMusicListFragment = a2;
                            PatchProxy.accessDispatch(new Object[]{list2, 2, Byte.valueOf(z)}, newMusicListFragment, NewMusicListFragment.f2837a, false, 26646, new Class[]{List.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                        } else {
                            if (a2.f2838b != null) {
                                a2.f2838b.a();
                            }
                            if (a2.isViewValid() && a2.f2838b != null) {
                                if (z) {
                                    a2.f2838b.setDataAfterLoadMore(list2);
                                } else {
                                    a2.f2838b.setData(list2);
                                }
                                if (a2.mListView.getAdapter() != a2.f2838b) {
                                    a2.mListView.setAdapter(a2.f2838b);
                                }
                                a2.f2842f = list2;
                                a2.f2841e = 2;
                                if (Lists.isEmpty(list)) {
                                    a2.c();
                                } else {
                                    if (PatchProxy.isSupport(new Object[0], a2, NewMusicListFragment.f2837a, false, 26636, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], a2, NewMusicListFragment.f2837a, false, 26636, new Class[0], Void.TYPE);
                                    } else {
                                        a2.mStatusView.b();
                                        a2.mListView.setVisibility(0);
                                    }
                                }
                            }
                        }
                        com.ss.android.ugc.aweme.choosemusic.f.c.f35898c = this.f2834d.c();
                        if (this.f2832b.a()) {
                            a2.f2838b.resetLoadMoreState();
                        } else {
                            a2.f2838b.showLoadMoreEmpty();
                        }
                    }
                } else if (getActivity() != null) {
                    if (!AbTestManager.a().aO()) {
                        ChooseMusicFragmentView chooseMusicFragmentView2 = this.f2834d;
                        if (PatchProxy.isSupport(new Object[0], chooseMusicFragmentView2, ChooseMusicFragmentView.f36021a, false, 26840, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], chooseMusicFragmentView2, ChooseMusicFragmentView.f36021a, false, 26840, new Class[0], Void.TYPE);
                        } else {
                            com.ss.android.ugc.aweme.common.ui.b.a((Activity) chooseMusicFragmentView2.f36022b.getActivity(), (View) chooseMusicFragmentView2.mSearchEditView);
                        }
                    }
                    if (a2 != null) {
                        if (NetworkUtils.isNetworkAvailable(getContext())) {
                            a2.c();
                        } else {
                            a2.d();
                        }
                    }
                }
            } else if (a2 != null) {
                a2.d();
            }
        }
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        NewMusicTabFragment newMusicTabFragment;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f2831a, false, 26526, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f2831a, false, 26526, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f2832b = new q(this);
        if (PatchProxy.isSupport(new Object[0], this, f2831a, false, 26527, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2831a, false, 26527, new Class[0], Void.TYPE);
        } else {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Fragment findFragmentById = childFragmentManager.findFragmentById(C0906R.id.z3);
            if (findFragmentById != null) {
                this.q = (NewMusicTabFragment) findFragmentById;
            } else {
                int i2 = this.n;
                String str = this.o;
                Music music = this.r;
                String str2 = this.s;
                String str3 = this.t;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str, music, str2, str3}, null, NewMusicTabFragment.f2843a, true, 26666, new Class[]{Integer.TYPE, String.class, Music.class, String.class, String.class}, NewMusicTabFragment.class)) {
                    newMusicTabFragment = (NewMusicTabFragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str, music, str2, str3}, null, NewMusicTabFragment.f2843a, true, 26666, new Class[]{Integer.TYPE, String.class, Music.class, String.class, String.class}, NewMusicTabFragment.class);
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
                    if (!TextUtils.isEmpty(str)) {
                        bundle2.putString("challenge", str);
                    }
                    if (music != null) {
                        bundle2.putSerializable("sticker_music", music);
                    }
                    if (str2 != null) {
                        bundle2.putString("first_sticker_music_ids", str2);
                    }
                    if (str3 != null) {
                        bundle2.putString("first_sticker_id", str3);
                    }
                    NewMusicTabFragment newMusicTabFragment2 = new NewMusicTabFragment();
                    newMusicTabFragment2.setArguments(bundle2);
                    newMusicTabFragment = newMusicTabFragment2;
                }
                this.q = newMusicTabFragment;
                this.q.f2848f = 0;
                if (this.u != null && this.u.isMvThemeMusic()) {
                    this.q.l = true;
                }
                FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
                beginTransaction.add((int) C0906R.id.z3, (Fragment) this.q);
                beginTransaction.commitAllowingStateLoss();
            }
        }
        if (PatchProxy.isSupport(new Object[]{view2}, this, f2831a, false, 26528, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f2831a, false, 26528, new Class[]{View.class}, Void.TYPE);
        } else if (this.h) {
            this.f2835e = view2.findViewById(C0906R.id.q7);
            this.f2836f = (TextView) view2.findViewById(C0906R.id.a1s);
            this.g = view2.findViewById(C0906R.id.q8);
        }
        getChildFragmentManager().addOnBackStackChangedListener(this);
        ChooseMusicFragmentView chooseMusicFragmentView = this.f2834d;
        if (PatchProxy.isSupport(new Object[0], chooseMusicFragmentView, ChooseMusicFragmentView.f36021a, false, 26829, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], chooseMusicFragmentView, ChooseMusicFragmentView.f36021a, false, 26829, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], chooseMusicFragmentView, ChooseMusicFragmentView.f36021a, false, 26834, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], chooseMusicFragmentView, ChooseMusicFragmentView.f36021a, false, 26834, new Class[0], Void.TYPE);
        } else {
            chooseMusicFragmentView.mRelativeSearch.setOnClickListener(chooseMusicFragmentView.f36022b);
        }
        if (chooseMusicFragmentView.f36023c == 0) {
            chooseMusicFragmentView.mSkipView.setVisibility(8);
        }
        chooseMusicFragmentView.mSearchEditView.setOnEditorActionListener(chooseMusicFragmentView.f36022b);
        chooseMusicFragmentView.mSearchEditView.addTextChangedListener(chooseMusicFragmentView.f36024d);
        if (com.ss.android.g.a.a()) {
            chooseMusicFragmentView.mSearchEditView.setFilters(new InputFilter[]{new x()});
        }
        chooseMusicFragmentView.mSearchEditTextContainer.setOnClickListener(chooseMusicFragmentView.f36022b);
        chooseMusicFragmentView.mSearchTextView.setOnClickListener(chooseMusicFragmentView.f36022b);
        chooseMusicFragmentView.mCancelSearch.setOnClickListener(chooseMusicFragmentView.f36022b);
        chooseMusicFragmentView.mBackView.setOnClickListener(chooseMusicFragmentView.f36022b);
        chooseMusicFragmentView.mSkipView.setOnClickListener(chooseMusicFragmentView.f36022b);
        chooseMusicFragmentView.txtClickRecommend.setOnClickListener(chooseMusicFragmentView.f36022b);
        chooseMusicFragmentView.mClearView.setOnClickListener(new com.ss.android.ugc.aweme.choosemusic.view.c(chooseMusicFragmentView));
        chooseMusicFragmentView.mSearchEditView.addTextChangedListener(new TextWatcher() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36025a;

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                if (PatchProxy.isSupport(new Object[]{editable}, this, f36025a, false, 26845, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable}, this, f36025a, false, 26845, new Class[]{Editable.class}, Void.TYPE);
                } else if (TextUtils.isEmpty(editable.toString())) {
                    ChooseMusicFragmentView.this.mClearView.setVisibility(8);
                } else {
                    ChooseMusicFragmentView.this.mClearView.setVisibility(0);
                }
            }
        });
        ((ViewGroup.MarginLayoutParams) chooseMusicFragmentView.mSearchLayout.getLayoutParams()).topMargin = 0;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f2831a, false, 26525, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f2831a, false, 26525, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.p_, viewGroup2, false);
        this.f2834d = new ChooseMusicFragmentView(inflate, this, this.n, this.l);
        return inflate;
    }

    public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        if (PatchProxy.isSupport(new Object[]{textView, Integer.valueOf(i2), keyEvent}, this, f2831a, false, 26543, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{textView, Integer.valueOf(i2), keyEvent}, this, f2831a, false, 26543, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (i2 != 3) {
            return false;
        } else {
            a(this.f2834d.c());
            return true;
        }
    }

    public final void a(NewMusicListFragment newMusicListFragment, String str, MusicModel musicModel, String str2) {
        String str3 = str;
        MusicModel musicModel2 = musicModel;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{newMusicListFragment, str3, musicModel2, str4}, this, f2831a, false, 26539, new Class[]{NewMusicListFragment.class, String.class, MusicModel.class, String.class}, Void.TYPE)) {
            Object[] objArr = {newMusicListFragment, str3, musicModel2, str4};
            PatchProxy.accessDispatch(objArr, this, f2831a, false, 26539, new Class[]{NewMusicListFragment.class, String.class, MusicModel.class, String.class}, Void.TYPE);
            return;
        }
        FragmentActivity activity = getActivity();
        Intent intent = new Intent();
        intent.putExtra("path", str3);
        intent.putExtra("music_model", musicModel2);
        intent.putExtra("music_origin", str4);
        if (newMusicListFragment.j() == 0 || newMusicListFragment.j() == 2) {
            activity.setResult(-1, intent);
            activity.finish();
            return;
        }
        if (musicModel.getMusic() == null || musicModel.getMusic().getChallenge() == null) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().removeChallenges();
        } else {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().addChallenge(com.ss.android.ugc.aweme.shortvideo.o.a.b(musicModel.getMusic().getChallenge()));
        }
        r.a("shoot", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("shoot_way", "search_result").f34114b);
        intent.putExtra("shoot_way", "search_result");
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) activity, intent);
    }
}
