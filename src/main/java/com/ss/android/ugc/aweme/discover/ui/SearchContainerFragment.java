package com.ss.android.ugc.aweme.discover.ui;

import android.arch.lifecycle.ViewModelProviders;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ah.a;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.discover.a.h;
import com.ss.android.ugc.aweme.discover.adapter.SearchPagerAdapter;
import com.ss.android.ugc.aweme.discover.helper.b;
import com.ss.android.ugc.aweme.discover.mob.SearchParamProvider;
import com.ss.android.ugc.aweme.discover.mob.e;
import com.ss.android.ugc.aweme.discover.mob.i;
import com.ss.android.ugc.aweme.discover.mob.j;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchPreventSuicide;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.utils.ae;
import org.greenrobot.eventbus.Subscribe;

public class SearchContainerFragment extends AmeBaseFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3056a;

    /* renamed from: b  reason: collision with root package name */
    ViewPager f3057b;

    /* renamed from: c  reason: collision with root package name */
    SearchIntermediateViewModel f3058c;

    /* renamed from: d  reason: collision with root package name */
    public int f3059d;

    /* renamed from: e  reason: collision with root package name */
    public CommonTabLayout.b f3060e;

    /* renamed from: f  reason: collision with root package name */
    private SearchResultParam f3061f;
    private SearchPagerAdapter<SearchFragment> g;
    private CommonTabLayout h;
    private ViewGroup i;
    private ax j;
    private ViewPager.OnPageChangeListener k;
    private AnalysisStayTimeFragmentComponent l;

    public boolean isRegisterEventBus() {
        return true;
    }

    private String c() {
        if (PatchProxy.isSupport(new Object[0], this, f3056a, false, 37836, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f3056a, false, 37836, new Class[0], String.class);
        } else if (this.f3061f != null) {
            return this.f3061f.getKeyword();
        } else {
            return "";
        }
    }

    public final int a() {
        if (PatchProxy.isSupport(new Object[0], this, f3056a, false, 37833, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3056a, false, 37833, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f3057b != null) {
            return this.f3057b.getCurrentItem();
        } else {
            return 0;
        }
    }

    public Analysis getAnalysis() {
        if (!PatchProxy.isSupport(new Object[0], this, f3056a, false, 37835, new Class[0], Analysis.class)) {
            return new Analysis().setLabelName("search");
        }
        return (Analysis) PatchProxy.accessDispatch(new Object[0], this, f3056a, false, 37835, new Class[0], Analysis.class);
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f3056a, false, 37823, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3056a, false, 37823, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        a(this.f3059d);
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3056a, false, 37829, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3056a, false, 37829, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            for (SearchFragment a2 : this.g.a()) {
                a2.a(this.f3061f);
            }
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3056a, false, 37822, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3056a, false, 37822, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        this.l = new AnalysisStayTimeFragmentComponent(this, true);
    }

    public static SearchContainerFragment a(SearchResultParam searchResultParam) {
        SearchResultParam searchResultParam2 = searchResultParam;
        if (PatchProxy.isSupport(new Object[]{searchResultParam2}, null, f3056a, true, 37818, new Class[]{SearchResultParam.class}, SearchContainerFragment.class)) {
            return (SearchContainerFragment) PatchProxy.accessDispatch(new Object[]{searchResultParam2}, null, f3056a, true, 37818, new Class[]{SearchResultParam.class}, SearchContainerFragment.class);
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("search_param", searchResultParam2);
        SearchContainerFragment searchContainerFragment = new SearchContainerFragment();
        searchContainerFragment.setArguments(bundle);
        return searchContainerFragment;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3056a, false, 37819, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3056a, false, 37819, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (this.f3061f == null && getArguments() != null) {
            this.f3061f = (SearchResultParam) getArguments().getSerializable("search_param");
            SearchParamProvider.f42643b.a(getActivity(), this.f3061f);
        }
        this.f3058c = (SearchIntermediateViewModel) ViewModelProviders.of(getActivity()).get(SearchIntermediateViewModel.class);
    }

    @Subscribe
    public void onSearchViewAllEvent(h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f3056a, false, 37830, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f3056a, false, 37830, new Class[]{h.class}, Void.TYPE);
        } else if (this.f3057b != null) {
            e.a().f42661b = true;
            this.f3057b.setCurrentItem(hVar.f41494a);
        }
    }

    public final void a(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3056a, false, 37837, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3056a, false, 37837, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i3 >= 0) {
            Fragment a2 = this.g.a(i3);
            if (a2 instanceof SearchFragment) {
                j.f42669b.a(((SearchFragment) a2).i(), c());
            }
        }
    }

    public final void b(SearchResultParam searchResultParam) {
        if (PatchProxy.isSupport(new Object[]{searchResultParam}, this, f3056a, false, 37828, new Class[]{SearchResultParam.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchResultParam}, this, f3056a, false, 37828, new Class[]{SearchResultParam.class}, Void.TYPE);
            return;
        }
        this.f3061f = searchResultParam;
        if (isViewValid()) {
            SearchParamProvider.f42643b.a(getContext(), searchResultParam);
            this.g.a(this.f3061f);
            if (this.j != null) {
                this.j.a();
            }
            b();
        }
    }

    @Subscribe
    public void onSearchPreventSuicideEvent(SearchPreventSuicide searchPreventSuicide) {
        SearchPreventSuicide searchPreventSuicide2 = searchPreventSuicide;
        if (PatchProxy.isSupport(new Object[]{searchPreventSuicide2}, this, f3056a, false, 37831, new Class[]{SearchPreventSuicide.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchPreventSuicide2}, this, f3056a, false, 37831, new Class[]{SearchPreventSuicide.class}, Void.TYPE);
            return;
        }
        this.j = new ax(getActivity(), this.i);
        ax axVar = this.j;
        if (PatchProxy.isSupport(new Object[]{searchPreventSuicide2}, axVar, ax.f43139a, false, 38035, new Class[]{SearchPreventSuicide.class}, Void.TYPE)) {
            ax axVar2 = axVar;
            PatchProxy.accessDispatch(new Object[]{searchPreventSuicide2}, axVar2, ax.f43139a, false, 38035, new Class[]{SearchPreventSuicide.class}, Void.TYPE);
            return;
        }
        axVar.g.setVisibility(0);
        if (TextUtils.isEmpty(searchPreventSuicide2.phone)) {
            axVar.f43140b.setVisibility(8);
        }
        axVar.f43141c.setText(searchPreventSuicide2.phone);
        if (!TextUtils.isEmpty(searchPreventSuicide2.agent)) {
            axVar.f43143e.setText(searchPreventSuicide2.agent);
        }
        axVar.f43140b.setOnClickListener(new View.OnClickListener(searchPreventSuicide2) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f43145a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ SearchPreventSuicide f43146b;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f43145a, false, 38036, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f43145a, false, 38036, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                new a.C0185a(ax.this.f43144f).b(this.f43146b.phone).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) null).a((int) C0906R.string.p9, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f43148a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f43148a, false, 38037, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f43148a, false, 38037, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        if (dialogInterface != null) {
                            dialogInterface.dismiss();
                            ax.this.h = new ae(ax.this.f43144f, AnonymousClass1.this.f43146b.phone, ax.this.f43144f.getString(C0906R.string.p_));
                            ax.this.h.a();
                        }
                    }
                }).a().a();
            }

            {
                this.f43146b = r2;
            }
        });
        axVar.f43142d.setOnClickListener(new View.OnClickListener(searchPreventSuicide2) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f43150a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ SearchPreventSuicide f43151b;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f43150a, false, 38038, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f43150a, false, 38038, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                Intent intent = new Intent(ax.this.f43144f, CrossPlatformActivity.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_load_dialog", true);
                intent.putExtra("hide_status_bar", true);
                if (!com.ss.android.g.a.a()) {
                    intent.putExtra("hide_nav_bar", true);
                }
                intent.putExtra(PushConstants.TITLE, ax.this.f43144f.getString(C0906R.string.bqf));
                intent.putExtras(bundle);
                intent.setData(Uri.parse(this.f43151b.url));
                ax.this.f43144f.startActivity(intent);
            }

            {
                this.f43151b = r2;
            }
        });
    }

    public final void a(ViewPager.OnPageChangeListener onPageChangeListener) {
        if (PatchProxy.isSupport(new Object[]{onPageChangeListener}, this, f3056a, false, 37832, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onPageChangeListener}, this, f3056a, false, 37832, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE);
            return;
        }
        this.k = onPageChangeListener;
        if (this.f3057b != null) {
            this.f3057b.addOnPageChangeListener(onPageChangeListener);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f3056a, false, 37821, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f3056a, false, 37821, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[]{view}, this, f3056a, false, 37824, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3056a, false, 37824, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.g = new SearchPagerAdapter<>(getChildFragmentManager(), getContext());
        this.g.a(this.f3061f);
        this.f3057b = (ViewPager) view.findViewById(C0906R.id.duy);
        this.f3057b.setOffscreenPageLimit(6);
        this.f3057b.setAdapter(this.g);
        if (this.k != null) {
            this.f3057b.addOnPageChangeListener(this.k);
        }
        this.i = (ViewGroup) view.findViewById(C0906R.id.b_g);
        this.h = (CommonTabLayout) view.findViewById(C0906R.id.cyz);
        if (PatchProxy.isSupport(new Object[0], this, f3056a, false, 37825, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3056a, false, 37825, new Class[0], Void.TYPE);
        } else {
            this.h.setCustomTabViewResId(C0906R.layout.a0f);
            this.h.setupWithViewPager(this.f3057b);
            this.h.a((CommonTabLayout.b) new CommonTabLayout.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f42979a;

                public final void b(CommonTabLayout.e eVar) {
                }

                public final void c(CommonTabLayout.e eVar) {
                }

                public final void a(CommonTabLayout.e eVar) {
                    String str;
                    CommonTabLayout.e eVar2 = eVar;
                    if (PatchProxy.isSupport(new Object[]{eVar2}, this, f42979a, false, 37839, new Class[]{CommonTabLayout.e.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{eVar2}, this, f42979a, false, 37839, new Class[]{CommonTabLayout.e.class}, Void.TYPE);
                        return;
                    }
                    int i = eVar2.f40629f;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, i.f42666a, true, 36972, new Class[]{Integer.TYPE}, String.class)) {
                        str = (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, i.f42666a, true, 36972, new Class[]{Integer.TYPE}, String.class);
                    } else {
                        if (!com.ss.android.g.a.a()) {
                            if (i == aw.f43134b) {
                                str = "general_search";
                            } else if (i == aw.f43135c) {
                                str = "search_result";
                            }
                        }
                        str = null;
                    }
                    a.c.f33269a = str;
                    SearchContainerFragment.this.a(SearchContainerFragment.this.f3059d);
                    SearchContainerFragment.this.f3059d = i;
                    SearchContainerFragment searchContainerFragment = SearchContainerFragment.this;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, searchContainerFragment, SearchContainerFragment.f3056a, false, 37827, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        SearchContainerFragment searchContainerFragment2 = searchContainerFragment;
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, searchContainerFragment2, SearchContainerFragment.f3056a, false, 37827, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    searchContainerFragment.f3058c.getSearchTabIndex().setValue(Integer.valueOf(i));
                }
            });
            if (this.f3060e != null) {
                this.h.a(this.f3060e);
            }
            this.h.setTabMode(0);
            this.h.setAutoFillWhenScrollable(true);
            this.h.a(u.a(16.0d), 0, u.a(16.0d), 0);
        }
        if (PatchProxy.isSupport(new Object[0], this, f3056a, false, 37826, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3056a, false, 37826, new Class[0], Void.TYPE);
        } else if (b.c()) {
            this.f3058c.getSearchTabIndex().observe(this, new al(this));
        }
        if (this.f3061f != null) {
            int intermediatePageIndex = this.f3061f.getIntermediatePageIndex();
            if (intermediatePageIndex > 0) {
                this.f3057b.setCurrentItem(intermediatePageIndex, false);
            }
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3056a, false, 37820, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.q1, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3056a, false, 37820, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
