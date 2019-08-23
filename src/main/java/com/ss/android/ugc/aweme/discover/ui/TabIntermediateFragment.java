package com.ss.android.ugc.aweme.discover.ui;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout;
import com.ss.android.ugc.aweme.discover.adapter.TabIntermediatePagerAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\f\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u000fH\u0002J\b\u0010\u0015\u001a\u00020\u000fH\u0002J\b\u0010\u0016\u001a\u00020\u000fH\u0002J\u0012\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010 \u001a\u00020\u000fH\u0002J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0013H\u0002J\u0006\u0010#\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006%"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/TabIntermediateFragment;", "Lcom/ss/android/ugc/aweme/base/fragment/AmeBaseFragment;", "()V", "mIntermediateViewModel", "Lcom/ss/android/ugc/aweme/discover/model/SearchIntermediateViewModel;", "mPagerAdapter", "Lcom/ss/android/ugc/aweme/discover/adapter/TabIntermediatePagerAdapter;", "mTabLayout", "Lcom/ss/android/ugc/aweme/common/widget/tablayout/CommonTabLayout;", "mViewPager", "Landroid/support/v4/view/ViewPager;", "tabSelectedListener", "com/ss/android/ugc/aweme/discover/ui/TabIntermediateFragment$tabSelectedListener$1", "Lcom/ss/android/ugc/aweme/discover/ui/TabIntermediateFragment$tabSelectedListener$1;", "findViewById", "", "view", "Landroid/view/View;", "getCurrentSelectTab", "", "initSearchTabObserver", "initTabLayout", "initViewPager", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "refreshTabIndex", "syncSearchResultTabIndex", "tabIndex", "tryResetTabIndex", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class TabIntermediateFragment extends AmeBaseFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43052a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f43053d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    ViewPager f43054b;

    /* renamed from: c  reason: collision with root package name */
    SearchIntermediateViewModel f43055c;

    /* renamed from: e  reason: collision with root package name */
    private CommonTabLayout f43056e;

    /* renamed from: f  reason: collision with root package name */
    private TabIntermediatePagerAdapter f43057f;
    private final c g = new c(this);
    private HashMap h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/TabIntermediateFragment$Companion;", "", "()V", "newInstance", "Lcom/ss/android/ugc/aweme/discover/ui/TabIntermediateFragment;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
    static final class b<T> implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43058a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TabIntermediateFragment f43059b;

        b(TabIntermediateFragment tabIntermediateFragment) {
            this.f43059b = tabIntermediateFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (PatchProxy.isSupport(new Object[]{num}, this, f43058a, false, 38115, new Class[]{Integer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{num}, this, f43058a, false, 38115, new Class[]{Integer.class}, Void.TYPE);
                return;
            }
            this.f43059b.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/discover/ui/TabIntermediateFragment$tabSelectedListener$1", "Lcom/ss/android/ugc/aweme/common/widget/tablayout/CommonTabLayout$OnTabSelectedListener;", "onTabReselected", "", "tab", "Lcom/ss/android/ugc/aweme/common/widget/tablayout/CommonTabLayout$Tab;", "onTabSelected", "onTabUnselected", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements CommonTabLayout.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43060a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TabIntermediateFragment f43061b;

        public final void b(@Nullable CommonTabLayout.e eVar) {
        }

        public final void c(@Nullable CommonTabLayout.e eVar) {
        }

        c(TabIntermediateFragment tabIntermediateFragment) {
            this.f43061b = tabIntermediateFragment;
        }

        public final void a(@NotNull CommonTabLayout.e eVar) {
            CommonTabLayout.e eVar2 = eVar;
            if (PatchProxy.isSupport(new Object[]{eVar2}, this, f43060a, false, 38116, new Class[]{CommonTabLayout.e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar2}, this, f43060a, false, 38116, new Class[]{CommonTabLayout.e.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(eVar2, "tab");
            TabIntermediateFragment tabIntermediateFragment = this.f43061b;
            int i = eVar2.f40629f;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, tabIntermediateFragment, TabIntermediateFragment.f43052a, false, 38108, new Class[]{Integer.TYPE}, Void.TYPE)) {
                TabIntermediateFragment tabIntermediateFragment2 = tabIntermediateFragment;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, tabIntermediateFragment2, TabIntermediateFragment.f43052a, false, 38108, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            SearchIntermediateViewModel searchIntermediateViewModel = tabIntermediateFragment.f43055c;
            if (searchIntermediateViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIntermediateViewModel");
            }
            searchIntermediateViewModel.getSearchTabIndex().setValue(Integer.valueOf(i));
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f43052a, false, 38112, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43052a, false, 38112, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.clear();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f43052a, false, 38107, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43052a, false, 38107, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            SearchIntermediateViewModel searchIntermediateViewModel = this.f43055c;
            if (searchIntermediateViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIntermediateViewModel");
            }
            Integer num = (Integer) searchIntermediateViewModel.getSearchTabIndex().getValue();
            if (num != null) {
                ViewPager viewPager = this.f43054b;
                if (viewPager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
                }
                if (num.intValue() != viewPager.getCurrentItem()) {
                    ViewPager viewPager2 = this.f43054b;
                    if (viewPager2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
                    }
                    viewPager2.setCurrentItem(num.intValue(), false);
                }
            }
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f43052a, false, 38100, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f43052a, false, 38100, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        ViewModel viewModel = ViewModelProviders.of(activity).get(SearchIntermediateViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders\n     …ateViewModel::class.java)");
        this.f43055c = (SearchIntermediateViewModel) viewModel;
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f43052a, false, 38102, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f43052a, false, 38102, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        super.onViewCreated(view, bundle);
        a();
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f43052a, false, 38101, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f43052a, false, 38101, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0906R.layout.qo, viewGroup2, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "root");
        if (PatchProxy.isSupport(new Object[]{inflate}, this, f43052a, false, 38103, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inflate}, this, f43052a, false, 38103, new Class[]{View.class}, Void.TYPE);
        } else {
            View findViewById = inflate.findViewById(C0906R.id.duu);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.viewpager)");
            this.f43054b = (ViewPager) findViewById;
            View findViewById2 = inflate.findViewById(C0906R.id.cyz);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.tab_layout)");
            this.f43056e = (CommonTabLayout) findViewById2;
        }
        if (PatchProxy.isSupport(new Object[0], this, f43052a, false, 38104, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43052a, false, 38104, new Class[0], Void.TYPE);
        } else {
            this.f43057f = new TabIntermediatePagerAdapter(getChildFragmentManager(), getContext());
            ViewPager viewPager = this.f43054b;
            if (viewPager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            }
            viewPager.setOffscreenPageLimit(5);
            ViewPager viewPager2 = this.f43054b;
            if (viewPager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            }
            TabIntermediatePagerAdapter tabIntermediatePagerAdapter = this.f43057f;
            if (tabIntermediatePagerAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPagerAdapter");
            }
            viewPager2.setAdapter(tabIntermediatePagerAdapter);
        }
        if (PatchProxy.isSupport(new Object[0], this, f43052a, false, 38105, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43052a, false, 38105, new Class[0], Void.TYPE);
        } else {
            CommonTabLayout commonTabLayout = this.f43056e;
            if (commonTabLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
            }
            commonTabLayout.setCustomTabViewResId(C0906R.layout.a0f);
            CommonTabLayout commonTabLayout2 = this.f43056e;
            if (commonTabLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
            }
            ViewPager viewPager3 = this.f43054b;
            if (viewPager3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            }
            commonTabLayout2.setupWithViewPager(viewPager3);
            CommonTabLayout commonTabLayout3 = this.f43056e;
            if (commonTabLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
            }
            commonTabLayout3.a((CommonTabLayout.b) this.g);
            CommonTabLayout commonTabLayout4 = this.f43056e;
            if (commonTabLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
            }
            commonTabLayout4.setTabMode(0);
            CommonTabLayout commonTabLayout5 = this.f43056e;
            if (commonTabLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
            }
            commonTabLayout5.setAutoFillWhenScrollable(true);
            CommonTabLayout commonTabLayout6 = this.f43056e;
            if (commonTabLayout6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
            }
            commonTabLayout6.a(u.a(16.0d), 0, u.a(16.0d), 0);
        }
        if (PatchProxy.isSupport(new Object[0], this, f43052a, false, 38106, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43052a, false, 38106, new Class[0], Void.TYPE);
        } else {
            SearchIntermediateViewModel searchIntermediateViewModel = this.f43055c;
            if (searchIntermediateViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIntermediateViewModel");
            }
            searchIntermediateViewModel.getSearchTabIndex().observe(this, new b(this));
        }
        return inflate;
    }
}
