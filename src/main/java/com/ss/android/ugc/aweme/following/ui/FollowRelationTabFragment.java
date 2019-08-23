package com.ss.android.ugc.aweme.following.ui;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.base.arch.JediBaseFragment;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowRelationPagerAdapter;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationState;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.y;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\u0018\u0000 H2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001HB\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\u001fH\u0002J\u0010\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u000bH\u0002J\u0010\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u001dH\u0002J\u0010\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u000bH\u0002J\b\u0010(\u001a\u00020\u001fH\u0002J\b\u0010)\u001a\u00020\u001fH\u0002J\b\u0010*\u001a\u00020\u001fH\u0002J\b\u0010+\u001a\u00020\u001fH\u0002J\u0018\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000bH\u0002J\u0012\u0010/\u001a\u00020\u001f2\b\u00100\u001a\u0004\u0018\u000101H\u0016J&\u00102\u001a\u0004\u0018\u0001012\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0010\u00109\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u000bH\u0016J \u0010:\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u000bH\u0016J\u0010\u0010>\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u000bH\u0016J\u0018\u0010?\u001a\u00020\u001f2\u0006\u0010@\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u000bH\u0016J\b\u0010B\u001a\u00020\u0007H\u0016J\u0018\u0010C\u001a\u00020\u001f2\u0006\u0010D\u001a\u00020<2\u0006\u0010E\u001a\u00020<H\u0016J\u001a\u0010F\u001a\u00020\u001f2\u0006\u0010G\u001a\u0002012\b\u00107\u001a\u0004\u0018\u000108H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0017X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/FollowRelationTabFragment;", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseFragment;", "Lcom/ss/android/ugc/aweme/common/widget/scrollablelayout/ScrollableLayout$OnScrollListener;", "Landroid/support/v4/view/ViewPager$OnPageChangeListener;", "Landroid/view/View$OnClickListener;", "()V", "firstEnter", "", "mAdapter", "Lcom/ss/android/ugc/aweme/following/ui/adapter/FollowRelationPagerAdapter;", "mConnectedNum", "", "mEnterType", "", "mFollowRelationTabViewModel", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationTabViewModel;", "getMFollowRelationTabViewModel", "()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationTabViewModel;", "mFollowRelationTabViewModel$delegate", "Lkotlin/Lazy;", "mFollowerNum", "mFollowingNum", "mFragmentTitles", "", "mFragments", "Landroid/support/v4/app/Fragment;", "mIsSelf", "mUid", "mUser", "Lcom/ss/android/ugc/aweme/profile/model/User;", "addCommonRelationTab", "", "addFollowerRelationTab", "addFollowingRelationTab", "getTabName", "p0", "getUserFollowerCount", "user", "handleRightTv", "currentIndex", "initArguments", "initFragment", "initView", "initViewModel", "makeFragmentName", "viewId", "id", "onClick", "v", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPageScrollStateChanged", "onPageScrolled", "p1", "", "p2", "onPageSelected", "onScroll", "currentY", "maxY", "onScrollEnd", "onScrolled", "dx", "dy", "onViewCreated", "view", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FollowRelationTabFragment extends JediBaseFragment implements ViewPager.OnPageChangeListener, View.OnClickListener, ScrollableLayout.b {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f47979c;

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f47980d = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FollowRelationTabFragment.class), "mFollowRelationTabViewModel", "getMFollowRelationTabViewModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationTabViewModel;"))};
    public static final b i = new b((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public boolean f47981e;

    /* renamed from: f  reason: collision with root package name */
    public User f47982f;
    public int g;
    public final List<String> h = new ArrayList();
    private FollowRelationPagerAdapter j;
    private String k;
    private String l;
    private boolean m = true;
    private int n;
    private int o;
    private final List<Fragment> p = new ArrayList();
    private final Lazy q;
    private HashMap r;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\f\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0002\u0010\u0006*\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"<anonymous>", "VM", "T", "Landroid/support/v4/app/Fragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/arch/ExtensionsKt$activityViewModel$2"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function0<FollowRelationTabViewModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Fragment $this_activityViewModel;
        final /* synthetic */ KClass $viewModelClass;
        final /* synthetic */ KClass $viewModelClass$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment, KClass kClass, KClass kClass2) {
            super(0);
            this.$this_activityViewModel = fragment;
            this.$viewModelClass = kClass;
            this.$viewModelClass$inlined = kClass2;
        }

        /* JADX WARNING: type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r0v7, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        @NotNull
        public final FollowRelationTabViewModel invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 44909, new Class[0], JediViewModel.class)) {
                return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 44909, new Class[0], JediViewModel.class);
            }
            ViewModelProvider of = ViewModelProviders.of(this.$this_activityViewModel.requireActivity(), com.bytedance.jedi.arch.b.a());
            String name = kotlin.jvm.a.a(this.$viewModelClass$inlined).getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
            return (JediViewModel) of.get(name, kotlin.jvm.a.a(this.$viewModelClass));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/FollowRelationTabFragment$Companion;", "", "()V", "FOLLOW_RELATION_TYPE", "", "FOLLOW_RELATION_UID", "FRAGMENT_COMMON_RELATION", "FRAGMENT_FOLLOWER_RELATION", "FRAGMENT_FOLLOWING_RELATION", "TAG_FROM_CLICK", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\"\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/following/ui/FollowRelationTabFragment$initView$2", "Lcom/ss/android/ugc/aweme/views/AwemeViewPagerNavigator$OnTabSelectedListener;", "onClick", "", "tab", "Landroid/view/View;", "position", "", "onSelect", "isSetupSelected", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements AwemeViewPagerNavigator.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47983a;

        public final void a(@Nullable View view, int i, boolean z) {
        }

        c() {
        }

        public final void a(@Nullable View view, int i) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i)}, this, f47983a, false, 44910, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i)}, this, f47983a, false, 44910, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            } else if (view2 != null) {
                view2.setTag("from_click");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function2<f, Integer, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FollowRelationTabFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(FollowRelationTabFragment followRelationTabFragment) {
            super(2);
            this.this$0 = followRelationTabFragment;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((f) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull f fVar, int i) {
            if (PatchProxy.isSupport(new Object[]{fVar, Integer.valueOf(i)}, this, changeQuickRedirect, false, 44913, new Class[]{f.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, Integer.valueOf(i)}, this, changeQuickRedirect, false, 44913, new Class[]{f.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            if (i > 0 && !this.this$0.f47981e && ex.o(this.this$0.f47982f)) {
                this.this$0.g = i;
                List<String> list = this.this$0.h;
                list.set(0, GlobalContext.getContext().getString(C0906R.string.a1g) + com.ss.android.ugc.aweme.i18n.b.a((long) i));
                View a2 = ((AwemeViewPagerNavigator) this.this$0.a(C0906R.id.bq0)).a(0);
                if (a2 instanceof TextView) {
                    ((TextView) a2).setText(this.this$0.h.get(0));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationState;", "invoke", "com/ss/android/ugc/aweme/following/ui/FollowRelationTabFragment$onClick$1$1"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function1<FollowRelationState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ View $v$inlined;
        final /* synthetic */ FollowRelationTabFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(FollowRelationTabFragment followRelationTabFragment, View view) {
            super(1);
            this.this$0 = followRelationTabFragment;
            this.$v$inlined = view;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FollowRelationState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull FollowRelationState followRelationState) {
            if (PatchProxy.isSupport(new Object[]{followRelationState}, this, changeQuickRedirect, false, 44914, new Class[]{FollowRelationState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{followRelationState}, this, changeQuickRedirect, false, 44914, new Class[]{FollowRelationState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(followRelationState, AdvanceSetting.NETWORK_TYPE);
            if (followRelationState.isSearching()) {
                this.this$0.h().a(false);
            } else if (this.this$0.getActivity() instanceof FollowRelationTabActivity) {
                FragmentActivity activity = this.this$0.getActivity();
                if (activity == null) {
                    Intrinsics.throwNpe();
                }
                activity.finish();
            } else {
                this.this$0.onDestroy();
            }
        }
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f47979c, false, 44907, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f47979c, false, 44907, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.r == null) {
            this.r = new HashMap();
        }
        View view = (View) this.r.get(Integer.valueOf(i2));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i2);
            this.r.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final void a(float f2, float f3) {
    }

    public final void b(int i2, int i3) {
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f47979c, false, 44908, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47979c, false, 44908, new Class[0], Void.TYPE);
            return;
        }
        if (this.r != null) {
            this.r.clear();
        }
    }

    public final FollowRelationTabViewModel h() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f47979c, false, 44891, new Class[0], FollowRelationTabViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f47979c, false, 44891, new Class[0], FollowRelationTabViewModel.class);
        } else {
            value = this.q.getValue();
        }
        return (FollowRelationTabViewModel) value;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        g();
    }

    public final void onPageScrollStateChanged(int i2) {
    }

    public final void onPageScrolled(int i2, float f2, int i3) {
    }

    public final boolean q_() {
        return false;
    }

    public FollowRelationTabFragment() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FollowRelationTabViewModel.class);
        this.q = LazyKt.lazy(new a(this, orCreateKotlinClass, orCreateKotlinClass));
    }

    private final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f47979c, false, 44896, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f47979c, false, 44896, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f47982f != null) {
            FollowRelationPagerAdapter followRelationPagerAdapter = this.j;
            if (followRelationPagerAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            if (i2 != followRelationPagerAdapter.getCount() - 1 || !y.a(this.f47982f)) {
                DmtTextView dmtTextView = (DmtTextView) a(C0906R.id.cf0);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "right_tv");
                dmtTextView.setVisibility(4);
            } else {
                DmtTextView dmtTextView2 = (DmtTextView) a(C0906R.id.cf0);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "right_tv");
                dmtTextView2.setVisibility(0);
            }
        }
    }

    public final void onClick(@Nullable View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f47979c, false, 44903, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f47979c, false, 44903, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view != null) {
            int id = view.getId();
            if (id == C0906R.id.cf0) {
                SharePrefCache inst = SharePrefCache.inst();
                Intrinsics.checkExpressionValueIsNotNull(inst, "SharePrefCache.inst()");
                an<String> syncToTTUrl = inst.getSyncToTTUrl();
                Intrinsics.checkExpressionValueIsNotNull(syncToTTUrl, "SharePrefCache.inst().syncToTTUrl");
                Intent intent = new Intent(getActivity(), CrossPlatformActivity.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_load_dialog", true);
                intent.putExtra("hide_nav_bar", true);
                intent.putExtra("hide_status_bar", true);
                intent.putExtras(bundle);
                intent.setData(Uri.parse((String) syncToTTUrl.c()));
                startActivity(intent);
            } else if (id == C0906R.id.ix) {
                a(h(), new e(this, view));
            }
        }
    }

    public final void onPageSelected(int i2) {
        boolean z;
        String str;
        String str2;
        String str3;
        boolean z2;
        int i3 = i2;
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f47979c, false, 44902, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f47979c, false, 44902, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        View a2 = ((AwemeViewPagerNavigator) a(C0906R.id.bq0)).a(i3);
        if (a2 != null) {
            if (a2.getTag() instanceof String) {
                Object tag = a2.getTag();
                if (tag == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                } else if (TextUtils.equals((String) tag, "from_click")) {
                    z2 = true;
                    a2.setTag(null);
                    z = z2;
                }
            }
            z2 = false;
            a2.setTag(null);
            z = z2;
        } else {
            z = false;
        }
        if (!this.m) {
            com.ss.android.ugc.aweme.app.d.d a3 = com.ss.android.ugc.aweme.app.d.d.a();
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f47979c, false, 44904, new Class[]{Integer.TYPE}, String.class)) {
                switch (i3) {
                    case 0:
                        FollowRelationPagerAdapter followRelationPagerAdapter = this.j;
                        if (followRelationPagerAdapter == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                        }
                        if (followRelationPagerAdapter.getCount() != 3) {
                            str = "following";
                            break;
                        } else {
                            str = "common_relation";
                            break;
                        }
                    case 1:
                        FollowRelationPagerAdapter followRelationPagerAdapter2 = this.j;
                        if (followRelationPagerAdapter2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                        }
                        if (followRelationPagerAdapter2.getCount() != 3) {
                            str = "fans";
                            break;
                        } else {
                            str = "following";
                            break;
                        }
                    case 2:
                        str = "fans";
                        break;
                    default:
                        str = "";
                        break;
                }
            } else {
                str = (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f47979c, false, 44904, new Class[]{Integer.TYPE}, String.class);
            }
            com.ss.android.ugc.aweme.app.d.d a4 = a3.a("tab_name", str);
            if (z) {
                str2 = "click";
            } else {
                str2 = "slide";
            }
            com.ss.android.ugc.aweme.app.d.d a5 = a4.a("enter_method", str2);
            if (this.f47981e) {
                str3 = "personal_homepage";
            } else {
                str3 = "others_homepage";
            }
            r.a("change_relation_tab", (Map) a5.a("previous_page", str3).f34114b);
        } else {
            this.m = false;
        }
        b(i2);
        FollowRelationTabViewModel h2 = h();
        FollowRelationPagerAdapter followRelationPagerAdapter3 = this.j;
        if (followRelationPagerAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        if (i3 != followRelationPagerAdapter3.getCount() - 2) {
            z3 = false;
        }
        h2.b(z3);
    }

    private final String a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.duu), Integer.valueOf(i3)}, this, f47979c, false, 44906, new Class[]{Integer.TYPE, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.duu), Integer.valueOf(i3)}, this, f47979c, false, 44906, new Class[]{Integer.TYPE, Integer.TYPE}, String.class);
        }
        return "android:switcher:" + C0906R.id.duu + ':' + i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x0376  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x03a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r12, @org.jetbrains.annotations.Nullable android.os.Bundle r13) {
        /*
            r11 = this;
            r8 = 2
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r12
            r10 = 1
            r0[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f47979c
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r9] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 44893(0xaf5d, float:6.2908E-41)
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003f
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r12
            r0[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f47979c
            r3 = 0
            r4 = 44893(0xaf5d, float:6.2908E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r9] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003f:
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r12, r0)
            super.onViewCreated(r12, r13)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f47979c
            r3 = 0
            r4 = 44894(0xaf5e, float:6.291E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x006c
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f47979c
            r3 = 0
            r4 = 44894(0xaf5e, float:6.291E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00f3
        L_0x006c:
            android.os.Bundle r0 = r11.getArguments()
            if (r0 == 0) goto L_0x0082
            java.lang.String r1 = "uid"
            java.lang.String r1 = r0.getString(r1)
            r11.k = r1
            java.lang.String r1 = "follow_relation_type"
            java.lang.String r0 = r0.getString(r1)
            r11.l = r0
        L_0x0082:
            java.lang.String r0 = r11.k
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r2 = "AccountUserProxyService.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.String r1 = r1.getCurUserId()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            r11.f47981e = r0
            com.ss.android.ugc.aweme.profile.model.User r0 = com.ss.android.ugc.aweme.user.a.b.a.a()
            r11.f47982f = r0
            com.ss.android.ugc.aweme.profile.model.User r7 = r11.f47982f
            if (r7 == 0) goto L_0x00f3
            int r0 = r7.getFollowingCount()
            r11.n = r0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f47979c
            r3 = 0
            r4 = 44905(0xaf69, float:6.2925E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00e2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f47979c
            r3 = 0
            r4 = 44905(0xaf69, float:6.2925E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r11
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x00f1
        L_0x00e2:
            boolean r0 = com.ss.android.ugc.aweme.profile.ui.y.a((com.ss.android.ugc.aweme.profile.model.User) r7)
            if (r0 == 0) goto L_0x00ed
            int r0 = r7.getFansCount()
            goto L_0x00f1
        L_0x00ed:
            int r0 = r7.getFollowerCount()
        L_0x00f1:
            r11.o = r0
        L_0x00f3:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f47979c
            r3 = 0
            r4 = 44895(0xaf5f, float:6.2911E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0118
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f47979c
            r3 = 0
            r4 = 44895(0xaf5f, float:6.2911E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x03f4
        L_0x0118:
            r0 = 2131169699(0x7f0711a3, float:1.7953735E38)
            android.view.View r0 = r11.a(r0)
            com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout r0 = (com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout) r0
            r1 = r11
            com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout$b r1 = (com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b) r1
            r0.setOnScrollListener(r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r11.f47982f
            if (r0 == 0) goto L_0x0163
            java.lang.String r1 = r0.getRemarkName()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 2131170433(0x7f071481, float:1.7955224E38)
            if (r1 != 0) goto L_0x014f
            android.view.View r1 = r11.a(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = "title_tv"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.String r0 = r0.getRemarkName()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            goto L_0x0163
        L_0x014f:
            android.view.View r1 = r11.a(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = "title_tv"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.String r0 = r0.getNickname()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
        L_0x0163:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f47979c
            r3 = 0
            r4 = 44897(0xaf61, float:6.2914E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r7 = 2131171459(0x7f071883, float:1.7957305E38)
            if (r0 == 0) goto L_0x018b
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f47979c
            r3 = 0
            r4 = 44897(0xaf61, float:6.2914E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x02e0
        L_0x018b:
            java.util.List<android.support.v4.app.Fragment> r0 = r11.p
            r0.clear()
            com.ss.android.ugc.aweme.profile.model.User r0 = r11.f47982f
            if (r0 == 0) goto L_0x01fe
            boolean r1 = r11.f47981e
            if (r1 != 0) goto L_0x01fe
            boolean r0 = com.ss.android.ugc.aweme.utils.ex.o(r0)
            if (r0 == 0) goto L_0x01fe
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f47979c
            r3 = 0
            r4 = 44899(0xaf63, float:6.2917E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01c2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f47979c
            r3 = 0
            r4 = 44899(0xaf63, float:6.2917E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01fe
        L_0x01c2:
            android.support.v4.app.FragmentManager r0 = r11.getChildFragmentManager()
            java.util.List<android.support.v4.app.Fragment> r1 = r11.p
            int r1 = r1.size()
            java.lang.String r1 = r11.a((int) r7, (int) r1)
            android.support.v4.app.Fragment r0 = r0.findFragmentByTag(r1)
            if (r0 != 0) goto L_0x01dd
            com.ss.android.ugc.aweme.following.ui.ConnectedRelationFragment r0 = new com.ss.android.ugc.aweme.following.ui.ConnectedRelationFragment
            r0.<init>()
            android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
        L_0x01dd:
            android.os.Bundle r1 = r11.getArguments()
            r0.setArguments(r1)
            java.util.List<android.support.v4.app.Fragment> r1 = r11.p
            r1.add(r0)
            java.util.List<java.lang.String> r0 = r11.h
            android.content.Context r1 = com.ss.android.common.applog.GlobalContext.getContext()
            r2 = 2131559474(0x7f0d0432, float:1.8744293E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "GlobalContext.getContext….string.connect_relation)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r0.add(r1)
        L_0x01fe:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f47979c
            r3 = 0
            r4 = 44900(0xaf64, float:6.2918E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0222
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f47979c
            r3 = 0
            r4 = 44900(0xaf64, float:6.2918E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x026f
        L_0x0222:
            android.support.v4.app.FragmentManager r0 = r11.getChildFragmentManager()
            java.util.List<android.support.v4.app.Fragment> r1 = r11.p
            int r1 = r1.size()
            java.lang.String r1 = r11.a((int) r7, (int) r1)
            android.support.v4.app.Fragment r0 = r0.findFragmentByTag(r1)
            if (r0 != 0) goto L_0x023d
            com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment r0 = new com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment
            r0.<init>()
            android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
        L_0x023d:
            android.os.Bundle r1 = r11.getArguments()
            r0.setArguments(r1)
            java.util.List<android.support.v4.app.Fragment> r1 = r11.p
            r1.add(r0)
            java.util.List<java.lang.String> r0 = r11.h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.Context r2 = com.ss.android.common.applog.GlobalContext.getContext()
            r3 = 2131560084(0x7f0d0694, float:1.874553E38)
            java.lang.String r2 = r2.getString(r3)
            r1.append(r2)
            int r2 = r11.n
            long r2 = (long) r2
            java.lang.String r2 = com.ss.android.ugc.aweme.i18n.b.a(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L_0x026f:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f47979c
            r3 = 0
            r4 = 44901(0xaf65, float:6.292E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0293
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f47979c
            r3 = 0
            r4 = 44901(0xaf65, float:6.292E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x02e0
        L_0x0293:
            android.support.v4.app.FragmentManager r0 = r11.getChildFragmentManager()
            java.util.List<android.support.v4.app.Fragment> r1 = r11.p
            int r1 = r1.size()
            java.lang.String r1 = r11.a((int) r7, (int) r1)
            android.support.v4.app.Fragment r0 = r0.findFragmentByTag(r1)
            if (r0 != 0) goto L_0x02ae
            com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment r0 = new com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment
            r0.<init>()
            android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
        L_0x02ae:
            android.os.Bundle r1 = r11.getArguments()
            r0.setArguments(r1)
            java.util.List<android.support.v4.app.Fragment> r1 = r11.p
            r1.add(r0)
            java.util.List<java.lang.String> r0 = r11.h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.Context r2 = com.ss.android.common.applog.GlobalContext.getContext()
            r3 = 2131560078(0x7f0d068e, float:1.8745518E38)
            java.lang.String r2 = r2.getString(r3)
            r1.append(r2)
            int r2 = r11.o
            long r2 = (long) r2
            java.lang.String r2 = com.ss.android.ugc.aweme.i18n.b.a(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L_0x02e0:
            com.ss.android.ugc.aweme.following.ui.adapter.FollowRelationPagerAdapter r0 = new com.ss.android.ugc.aweme.following.ui.adapter.FollowRelationPagerAdapter
            android.support.v4.app.FragmentManager r1 = r11.getChildFragmentManager()
            java.lang.String r2 = "childFragmentManager"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.util.List<android.support.v4.app.Fragment> r2 = r11.p
            java.util.List<java.lang.String> r3 = r11.h
            r0.<init>(r1, r2, r3)
            r11.j = r0
            android.view.View r0 = r11.a(r7)
            com.ss.android.ugc.aweme.views.RtlViewPager r0 = (com.ss.android.ugc.aweme.views.RtlViewPager) r0
            java.lang.String r1 = "viewpager"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.following.ui.adapter.FollowRelationPagerAdapter r1 = r11.j
            if (r1 != 0) goto L_0x0308
            java.lang.String r2 = "mAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0308:
            android.support.v4.view.PagerAdapter r1 = (android.support.v4.view.PagerAdapter) r1
            r0.setAdapter(r1)
            android.view.View r0 = r11.a(r7)
            com.ss.android.ugc.aweme.views.RtlViewPager r0 = (com.ss.android.ugc.aweme.views.RtlViewPager) r0
            r1 = r11
            android.support.v4.view.ViewPager$OnPageChangeListener r1 = (android.support.v4.view.ViewPager.OnPageChangeListener) r1
            r0.addOnPageChangeListener(r1)
            android.view.View r0 = r11.a(r7)
            com.ss.android.ugc.aweme.views.RtlViewPager r0 = (com.ss.android.ugc.aweme.views.RtlViewPager) r0
            java.lang.String r1 = "viewpager"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 3
            r0.setOffscreenPageLimit(r1)
            java.lang.String r0 = r11.l
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "common_relation"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0338
        L_0x0336:
            r0 = 0
            goto L_0x0374
        L_0x0338:
            java.lang.String r0 = r11.l
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "following_relation"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0358
            com.ss.android.ugc.aweme.following.ui.adapter.FollowRelationPagerAdapter r0 = r11.j
            if (r0 != 0) goto L_0x034f
            java.lang.String r1 = "mAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x034f:
            int r0 = r0.getCount()
            if (r0 != r8) goto L_0x0356
            goto L_0x0336
        L_0x0356:
            r0 = 1
            goto L_0x0374
        L_0x0358:
            java.lang.String r0 = r11.l
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "follower_relation"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0336
            com.ss.android.ugc.aweme.following.ui.adapter.FollowRelationPagerAdapter r0 = r11.j
            if (r0 != 0) goto L_0x036f
            java.lang.String r1 = "mAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x036f:
            int r0 = r0.getCount()
            int r0 = r0 - r10
        L_0x0374:
            if (r0 == 0) goto L_0x0378
            r1 = 1
            goto L_0x0379
        L_0x0378:
            r1 = 0
        L_0x0379:
            r11.m = r1
            android.view.View r1 = r11.a(r7)
            com.ss.android.ugc.aweme.views.RtlViewPager r1 = (com.ss.android.ugc.aweme.views.RtlViewPager) r1
            java.lang.String r2 = "viewpager"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setCurrentItem(r0)
            r11.b(r0)
            com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel r1 = r11.h()
            com.ss.android.ugc.aweme.following.ui.adapter.FollowRelationPagerAdapter r2 = r11.j
            if (r2 != 0) goto L_0x0399
            java.lang.String r3 = "mAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0399:
            int r2 = r2.getCount()
            int r2 = r2 - r8
            if (r0 != r2) goto L_0x03a1
            goto L_0x03a2
        L_0x03a1:
            r10 = 0
        L_0x03a2:
            r1.b(r10)
            r1 = 2131168544(0x7f070d20, float:1.7951393E38)
            android.view.View r2 = r11.a(r1)
            com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator r2 = (com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator) r2
            android.content.res.Resources r3 = r11.getResources()
            r4 = 2131624880(0x7f0e03b0, float:1.8876952E38)
            int r3 = r3.getColor(r4)
            r2.setBackgroundColor(r3)
            android.view.View r1 = r11.a(r1)
            com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator r1 = (com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator) r1
            android.view.View r2 = r11.a(r7)
            com.ss.android.ugc.aweme.views.RtlViewPager r2 = (com.ss.android.ugc.aweme.views.RtlViewPager) r2
            com.ss.android.ugc.aweme.favorites.ui.c r3 = new com.ss.android.ugc.aweme.favorites.ui.c
            r3.<init>()
            com.ss.android.ugc.aweme.views.l r3 = (com.ss.android.ugc.aweme.views.l) r3
            com.ss.android.ugc.aweme.following.ui.FollowRelationTabFragment$c r4 = new com.ss.android.ugc.aweme.following.ui.FollowRelationTabFragment$c
            r4.<init>()
            com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator$a r4 = (com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator.a) r4
            r1.a(r2, r3, r4, r0)
            r0 = 2131165550(0x7f07016e, float:1.794532E38)
            android.view.View r0 = r11.a(r0)
            com.ss.android.ugc.aweme.views.AutoRTLImageView r0 = (com.ss.android.ugc.aweme.views.AutoRTLImageView) r0
            r1 = r11
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            r0 = 2131169506(0x7f0710e2, float:1.7953344E38)
            android.view.View r0 = r11.a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            r0.setOnClickListener(r1)
        L_0x03f4:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f47979c
            r3 = 0
            r4 = 44898(0xaf62, float:6.2915E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0418
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f47979c
            r3 = 0
            r4 = 44898(0xaf62, float:6.2915E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0418:
            com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel r0 = r11.h()
            r1 = r0
            com.bytedance.jedi.arch.JediViewModel r1 = (com.bytedance.jedi.arch.JediViewModel) r1
            kotlin.reflect.KProperty1 r2 = com.ss.android.ugc.aweme.following.ui.a.INSTANCE
            r3 = 0
            r4 = 0
            com.ss.android.ugc.aweme.following.ui.FollowRelationTabFragment$d r0 = new com.ss.android.ugc.aweme.following.ui.FollowRelationTabFragment$d
            r0.<init>(r11)
            r5 = r0
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r6 = 6
            r7 = 0
            r0 = r11
            io.reactivex.disposables.Disposable unused = r0.a(r1, r2, r0.c(), false, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.FollowRelationTabFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f47979c, false, 44892, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f47979c, false, 44892, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater2.inflate(C0906R.layout.nu, viewGroup2, false);
    }
}
