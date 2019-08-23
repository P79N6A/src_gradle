package com.ss.android.ugc.aweme.discover.hotspot;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.h;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.n;
import com.bytedance.jedi.arch.r;
import com.bytedance.jedi.arch.x;
import com.bytedance.widget.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.ui.DetailPageFragment;
import com.ss.android.ugc.aweme.discover.hotspot.SpotChangeCallBack;
import com.ss.android.ugc.aweme.discover.hotspot.SpotCurWordChangeCallBack;
import com.ss.android.ugc.aweme.discover.hotspot.list.HotSpotListAdapter;
import com.ss.android.ugc.aweme.discover.hotspot.list.HotSpotListDialog;
import com.ss.android.ugc.aweme.discover.hotspot.viewmodel.HotSpotMainState;
import com.ss.android.ugc.aweme.discover.hotspot.viewmodel.HotSpotMainViewModel;
import com.ss.android.ugc.aweme.discover.model.HotSearchEntity;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.aweme.discover.model.HotSearchListResponse;
import com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.ss.android.ugc.aweme.main.CleanModeManager2;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010:\u001a\u00020;H\u0014J\b\u0010<\u001a\u00020=H\u0016J\f\u0010>\u001a\u0006\u0012\u0002\b\u00030?H\u0014J&\u0010@\u001a\u0004\u0018\u00010A2\u0006\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u000e2\b\u0010E\u001a\u0004\u0018\u00010FH\u0016J\u001a\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020A2\b\u0010E\u001a\u0004\u0018\u00010FH\u0016J\u0010\u0010J\u001a\u00020H2\u0006\u0010K\u001a\u00020LH\u0016J\u0006\u0010M\u001a\u00020HR\u001a\u0010\u0007\u001a\u00020\bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001b\u0010/\u001a\u0002008FX\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b1\u00102R\u001a\u00105\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006N"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/HotSpotDetailPageFragment;", "Lcom/ss/android/ugc/aweme/detail/ui/DetailPageFragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/ss/android/ugc/aweme/base/arch/ReflectViewModelFactory;", "Lcom/ss/android/ugc/aweme/analysis/AnalysisProvider;", "()V", "bottomViewHolder", "Lcom/ss/android/ugc/aweme/discover/hotspot/SpotBottomViewHolder;", "getBottomViewHolder", "()Lcom/ss/android/ugc/aweme/discover/hotspot/SpotBottomViewHolder;", "setBottomViewHolder", "(Lcom/ss/android/ugc/aweme/discover/hotspot/SpotBottomViewHolder;)V", "infoLayout", "Landroid/view/ViewGroup;", "getInfoLayout", "()Landroid/view/ViewGroup;", "setInfoLayout", "(Landroid/view/ViewGroup;)V", "infoStub", "Landroid/view/ViewStub;", "getInfoStub", "()Landroid/view/ViewStub;", "setInfoStub", "(Landroid/view/ViewStub;)V", "infoViewHolder", "Lcom/ss/android/ugc/aweme/discover/hotspot/SpotInfoViewHolder;", "getInfoViewHolder", "()Lcom/ss/android/ugc/aweme/discover/hotspot/SpotInfoViewHolder;", "setInfoViewHolder", "(Lcom/ss/android/ugc/aweme/discover/hotspot/SpotInfoViewHolder;)V", "mListDialog", "Lcom/ss/android/ugc/aweme/discover/hotspot/list/HotSpotListDialog;", "getMListDialog", "()Lcom/ss/android/ugc/aweme/discover/hotspot/list/HotSpotListDialog;", "setMListDialog", "(Lcom/ss/android/ugc/aweme/discover/hotspot/list/HotSpotListDialog;)V", "mViewPager", "Lcom/ss/android/ugc/aweme/common/widget/VerticalViewPager;", "getMViewPager", "()Lcom/ss/android/ugc/aweme/common/widget/VerticalViewPager;", "setMViewPager", "(Lcom/ss/android/ugc/aweme/common/widget/VerticalViewPager;)V", "stayTimeFragmentComponent", "Lcom/ss/android/ugc/aweme/base/component/AnalysisStayTimeFragmentComponent;", "getStayTimeFragmentComponent", "()Lcom/ss/android/ugc/aweme/base/component/AnalysisStayTimeFragmentComponent;", "viewModel", "Lcom/ss/android/ugc/aweme/discover/hotspot/viewmodel/HotSpotMainViewModel;", "getViewModel", "()Lcom/ss/android/ugc/aweme/discover/hotspot/viewmodel/HotSpotMainViewModel;", "viewModel$delegate", "Lcom/bytedance/jedi/arch/lifecycleAwareLazy;", "viewModelFactory", "getViewModelFactory", "()Lcom/ss/android/ugc/aweme/base/arch/ReflectViewModelFactory;", "setViewModelFactory", "(Lcom/ss/android/ugc/aweme/base/arch/ReflectViewModelFactory;)V", "createFragmentPanel", "Lcom/ss/android/ugc/aweme/detail/panel/DetailFragmentPanel;", "getAnalysis", "Lcom/ss/android/ugc/aweme/analysis/Analysis;", "getJediViewModel", "Lcom/bytedance/jedi/arch/JediViewModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "setUserVisibleHint", "isVisibleToUser", "", "showSpotListFragment", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HotSpotDetailPageFragment extends DetailPageFragment implements ae<com.ss.android.ugc.aweme.base.arch.c>, com.bytedance.jedi.arch.h, com.ss.android.ugc.aweme.analysis.c {
    public static ChangeQuickRedirect g;
    static final /* synthetic */ KProperty[] h = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(HotSpotDetailPageFragment.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/discover/hotspot/viewmodel/HotSpotMainViewModel;"))};
    @NotNull
    public com.ss.android.ugc.aweme.base.arch.c i = new com.ss.android.ugc.aweme.base.arch.c();
    @NotNull
    public ViewStub j;
    @NotNull
    public ViewGroup k;
    @NotNull
    public SpotInfoViewHolder l;
    @NotNull
    public SpotBottomViewHolder m;
    @NotNull
    public VerticalViewPager n;
    @NotNull
    public final AnalysisStayTimeFragmentComponent o;
    @Nullable
    public HotSpotListDialog p;
    @NotNull
    private final lifecycleAwareLazy q;
    private HashMap r;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0014\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0006\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0007\"\b\b\u0002\u0010\u0001*\u00020\b*\u0002H\u00012\b\u0010\t\u001a\u0004\u0018\u00010\nH\n¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"<anonymous>", "S", "T", "Landroid/support/v4/app/Fragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "VM", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/bytedance/jedi/arch/State;", "it", "Landroid/os/Bundle;", "invoke", "(Lcom/bytedance/jedi/arch/State;Landroid/os/Bundle;)Lcom/bytedance/jedi/arch/State;", "com/bytedance/jedi/arch/ExtensionsKt$viewModel$5"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function2<HotSpotMainState, Bundle, HotSpotMainState> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        public a() {
            super(2);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.bytedance.jedi.arch.x, com.ss.android.ugc.aweme.discover.hotspot.viewmodel.HotSpotMainState] */
        @NotNull
        public final HotSpotMainState invoke(@NotNull HotSpotMainState hotSpotMainState, @Nullable Bundle bundle) {
            HotSpotMainState hotSpotMainState2 = hotSpotMainState;
            if (PatchProxy.isSupport(new Object[]{hotSpotMainState2, bundle}, this, changeQuickRedirect, false, 36480, new Class[]{x.class, Bundle.class}, x.class)) {
                return (x) PatchProxy.accessDispatch(new Object[]{hotSpotMainState2, bundle}, this, changeQuickRedirect, false, 36480, new Class[]{x.class, Bundle.class}, x.class);
            }
            Intrinsics.checkParameterIsNotNull(hotSpotMainState2, "$receiver");
            return hotSpotMainState2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0014\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0002\u0010\u0007*\u00020\bH\n¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"<anonymous>", "VM", "T", "Landroid/support/v4/app/Fragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/arch/ExtensionsKt$viewModel$6"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function0<HotSpotMainViewModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Function2 $argumentsAcceptor;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ KClass $viewModelClass;
        final /* synthetic */ KClass $viewModelClass$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment, KClass kClass, Function2 function2, KClass kClass2) {
            super(0);
            this.$this_viewModel = fragment;
            this.$viewModelClass = kClass;
            this.$argumentsAcceptor = function2;
            this.$viewModelClass$inlined = kClass2;
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, com.ss.android.ugc.aweme.discover.hotspot.viewmodel.HotSpotMainViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.discover.hotspot.viewmodel.HotSpotMainViewModel, com.bytedance.jedi.arch.JediViewModel] */
        @NotNull
        public final HotSpotMainViewModel invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 36481, new Class[0], JediViewModel.class)) {
                return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 36481, new Class[0], JediViewModel.class);
            }
            ViewModelProvider of = ViewModelProviders.of(this.$this_viewModel, ((ae) this.$this_viewModel).r_());
            String name = kotlin.jvm.a.a(this.$viewModelClass$inlined).getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
            ? r0 = (JediViewModel) of.get(name, kotlin.jvm.a.a(this.$viewModelClass));
            n a2 = r0.f2282c.a(HotSpotMainViewModel.class);
            if (a2 != null) {
                Intrinsics.checkExpressionValueIsNotNull(r0, "this");
                a2.binding(r0);
            }
            r0.a(new Function1<HotSpotMainState, HotSpotMainState>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ b this$0;

                {
                    this.this$0 = r1;
                }

                /* JADX WARNING: type inference failed for: r0v6, types: [com.bytedance.jedi.arch.x, com.ss.android.ugc.aweme.discover.hotspot.viewmodel.HotSpotMainState] */
                /* JADX WARNING: type inference failed for: r0v9, types: [com.bytedance.jedi.arch.x, com.ss.android.ugc.aweme.discover.hotspot.viewmodel.HotSpotMainState] */
                @NotNull
                public final HotSpotMainState invoke(@NotNull HotSpotMainState hotSpotMainState) {
                    if (PatchProxy.isSupport(new Object[]{hotSpotMainState}, this, changeQuickRedirect, false, 36482, new Class[]{x.class}, x.class)) {
                        return (x) PatchProxy.accessDispatch(new Object[]{hotSpotMainState}, this, changeQuickRedirect, false, 36482, new Class[]{x.class}, x.class);
                    }
                    Intrinsics.checkParameterIsNotNull(hotSpotMainState, "$this$initialize");
                    return (x) this.this$0.$argumentsAcceptor.invoke(hotSpotMainState, this.this$0.$this_viewModel.getArguments());
                }
            });
            return r0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ HotSpotDetailPageFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(HotSpotDetailPageFragment hotSpotDetailPageFragment) {
            super(0);
            this.this$0 = hotSpotDetailPageFragment;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 36483, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 36483, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.n();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function2<com.bytedance.jedi.arch.f, String, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ HotSpotDetailPageFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(HotSpotDetailPageFragment hotSpotDetailPageFragment) {
            super(2);
            this.this$0 = hotSpotDetailPageFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (String) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @Nullable String str) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{fVar2, str2}, this, changeQuickRedirect, false, 36487, new Class[]{com.bytedance.jedi.arch.f.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, str2}, this, changeQuickRedirect, false, 36487, new Class[]{com.bytedance.jedi.arch.f.class, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            SpotCurWordChangeCallBack.a aVar = SpotCurWordChangeCallBack.f42418b;
            FragmentActivity activity = this.this$0.getActivity();
            if (activity == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
            if (PatchProxy.isSupport(new Object[]{activity, str2}, aVar, SpotCurWordChangeCallBack.a.f42420a, false, 36549, new Class[]{FragmentActivity.class, String.class}, Void.TYPE)) {
                SpotCurWordChangeCallBack.a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{activity, str2}, aVar2, SpotCurWordChangeCallBack.a.f42420a, false, 36549, new Class[]{FragmentActivity.class, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity, "context");
            if (str2 != null) {
                aVar.a(activity).setValue(str2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function2<com.bytedance.jedi.arch.f, HotSearchItem, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ HotSpotDetailPageFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(HotSpotDetailPageFragment hotSpotDetailPageFragment) {
            super(2);
            this.this$0 = hotSpotDetailPageFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (HotSearchItem) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @Nullable HotSearchItem hotSearchItem) {
            com.ss.android.ugc.aweme.arch.widgets.base.b<HotSearchItem> bVar;
            com.bytedance.jedi.arch.f fVar2 = fVar;
            HotSearchItem hotSearchItem2 = hotSearchItem;
            if (PatchProxy.isSupport(new Object[]{fVar2, hotSearchItem2}, this, changeQuickRedirect, false, 36490, new Class[]{com.bytedance.jedi.arch.f.class, HotSearchItem.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, hotSearchItem2}, this, changeQuickRedirect, false, 36490, new Class[]{com.bytedance.jedi.arch.f.class, HotSearchItem.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            SpotChangeCallBack.a aVar = SpotChangeCallBack.f42414d;
            FragmentActivity activity = this.this$0.getActivity();
            if (activity == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
            if (PatchProxy.isSupport(new Object[]{activity, hotSearchItem2}, aVar, SpotChangeCallBack.a.f42417a, false, 36544, new Class[]{FragmentActivity.class, HotSearchItem.class}, Void.TYPE)) {
                SpotChangeCallBack.a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{activity, hotSearchItem2}, aVar2, SpotChangeCallBack.a.f42417a, false, 36544, new Class[]{FragmentActivity.class, HotSearchItem.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity, "context");
            if (hotSearchItem2 != null) {
                SpotChangeCallBack.a aVar3 = aVar;
                if (PatchProxy.isSupport(new Object[]{activity}, aVar3, SpotChangeCallBack.a.f42417a, false, 36542, new Class[]{FragmentActivity.class}, com.ss.android.ugc.aweme.arch.widgets.base.b.class)) {
                    SpotChangeCallBack.a aVar4 = aVar3;
                    bVar = (com.ss.android.ugc.aweme.arch.widgets.base.b) PatchProxy.accessDispatch(new Object[]{activity}, aVar4, SpotChangeCallBack.a.f42417a, false, 36542, new Class[]{FragmentActivity.class}, com.ss.android.ugc.aweme.arch.widgets.base.b.class);
                } else {
                    bVar = aVar3.a(activity).f42415b;
                }
                bVar.setValue(hotSearchItem2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function2<com.bytedance.jedi.arch.f, Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ HotSpotDetailPageFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(HotSpotDetailPageFragment hotSpotDetailPageFragment) {
            super(2);
            this.this$0 = hotSpotDetailPageFragment;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, boolean z) {
            float f2;
            com.bytedance.jedi.arch.f fVar2 = fVar;
            boolean z2 = z;
            if (PatchProxy.isSupport(new Object[]{fVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 36493, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 36493, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            if (com.ss.android.ugc.aweme.discover.helper.b.f()) {
                DetailFragmentPanel detailFragmentPanel = this.this$0.f3013d;
                if (detailFragmentPanel != null) {
                    ((a) detailFragmentPanel).h(z2);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.hotspot.HotSpotDetailFragmentPanel");
                }
            }
            CleanModeManager2.a aVar = CleanModeManager2.f54120e;
            FragmentActivity activity = this.this$0.getActivity();
            if (PatchProxy.isSupport(new Object[]{activity, Byte.valueOf(z)}, aVar, CleanModeManager2.a.f54124a, false, 57028, new Class[]{FragmentActivity.class, Boolean.TYPE}, Void.TYPE)) {
                Object[] objArr = {activity, Byte.valueOf(z)};
                ChangeQuickRedirect changeQuickRedirect2 = CleanModeManager2.a.f54124a;
                Object[] objArr2 = objArr;
                CleanModeManager2.a aVar2 = aVar;
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect2;
                PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect3, false, 57028, new Class[]{FragmentActivity.class, Boolean.TYPE}, Void.TYPE);
            } else if (activity != null) {
                CleanModeManager2.a aVar3 = aVar;
                aVar3.a(activity).setValue(Boolean.valueOf(z));
                aVar3.b(activity).f54123d = true;
            }
            ViewPropertyAnimator duration = this.this$0.mBackView.animate().setDuration(400);
            if (z2) {
                f2 = 0.0f;
            } else {
                f2 = 1.0f;
            }
            duration.alpha(f2).start();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function1<Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ HotSpotDetailPageFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(HotSpotDetailPageFragment hotSpotDetailPageFragment) {
            super(1);
            this.this$0 = hotSpotDetailPageFragment;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 36494, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 36494, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            this.this$0.f3013d.g(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onRefresh"}, k = 3, mv = {1, 1, 15})
    static final class h implements SwipeRefreshLayout.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42406a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HotSpotDetailPageFragment f42407b;

        h(HotSpotDetailPageFragment hotSpotDetailPageFragment) {
            this.f42407b = hotSpotDetailPageFragment;
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f42406a, false, 36495, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42406a, false, 36495, new Class[0], Void.TYPE);
            } else if (!NetworkUtils.isNetworkAvailable(this.f42407b.getActivity())) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) this.f42407b.getActivity(), (int) C0906R.string.bgf).a();
                this.f42407b.mRefreshLayout.setRefreshing(false);
            } else {
                this.f42407b.a(this.f42407b.q(), new Function1<HotSpotMainState, Unit>(this) {
                    public static ChangeQuickRedirect changeQuickRedirect;
                    final /* synthetic */ h this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HotSpotMainState) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull HotSpotMainState hotSpotMainState) {
                        HotSpotMainState hotSpotMainState2 = hotSpotMainState;
                        if (PatchProxy.isSupport(new Object[]{hotSpotMainState2}, this, changeQuickRedirect, false, 36496, new Class[]{HotSpotMainState.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{hotSpotMainState2}, this, changeQuickRedirect, false, 36496, new Class[]{HotSpotMainState.class}, Void.TYPE);
                            return;
                        }
                        Intrinsics.checkParameterIsNotNull(hotSpotMainState2, AdvanceSetting.NETWORK_TYPE);
                        this.this$0.f42407b.q().a(hotSpotMainState.getCurSpotWord(), null, true);
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchListResponse;", "invoke", "com/ss/android/ugc/aweme/discover/hotspot/HotSpotDetailPageFragment$showSpotListFragment$1$2"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function2<com.bytedance.jedi.arch.f, HotSearchListResponse, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ HotSpotListDialog $this_apply;
        final /* synthetic */ HotSpotDetailPageFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(HotSpotListDialog hotSpotListDialog, HotSpotDetailPageFragment hotSpotDetailPageFragment) {
            super(2);
            this.$this_apply = hotSpotListDialog;
            this.this$0 = hotSpotDetailPageFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (HotSearchListResponse) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull HotSearchListResponse hotSearchListResponse) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            HotSearchListResponse hotSearchListResponse2 = hotSearchListResponse;
            if (PatchProxy.isSupport(new Object[]{fVar2, hotSearchListResponse2}, this, changeQuickRedirect, false, 36497, new Class[]{com.bytedance.jedi.arch.f.class, HotSearchListResponse.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, hotSearchListResponse2}, this, changeQuickRedirect, false, 36497, new Class[]{com.bytedance.jedi.arch.f.class, HotSearchListResponse.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            Intrinsics.checkParameterIsNotNull(hotSearchListResponse2, AdvanceSetting.NETWORK_TYPE);
            if (this.this$0.getActivity() != null) {
                FragmentActivity activity = this.this$0.getActivity();
                if (activity == null) {
                    Intrinsics.throwNpe();
                }
                if (!activity.isFinishing()) {
                    HotSpotListAdapter hotSpotListAdapter = this.$this_apply.f42458c;
                    HotSearchEntity data = hotSearchListResponse.getData();
                    Intrinsics.checkExpressionValueIsNotNull(data, "it.data");
                    List<HotSearchItem> list = data.getList();
                    Intrinsics.checkExpressionValueIsNotNull(list, "it.data.list");
                    if (PatchProxy.isSupport(new Object[]{list}, hotSpotListAdapter, HotSpotListAdapter.f42451a, false, 36592, new Class[]{List.class}, Void.TYPE)) {
                        HotSpotListAdapter hotSpotListAdapter2 = hotSpotListAdapter;
                        PatchProxy.accessDispatch(new Object[]{list}, hotSpotListAdapter2, HotSpotListAdapter.f42451a, false, 36592, new Class[]{List.class}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(list, "value");
                        hotSpotListAdapter.f42452b = list;
                        hotSpotListAdapter.notifyDataSetChanged();
                    }
                    fVar2.a(this.this$0.q(), new Function1<HotSpotMainState, Unit>(this) {
                        public static ChangeQuickRedirect changeQuickRedirect;
                        final /* synthetic */ i this$0;

                        {
                            this.this$0 = r1;
                        }

                        @Nullable
                        public final Unit invoke(@NotNull HotSpotMainState hotSpotMainState) {
                            float f2;
                            HotSpotMainState hotSpotMainState2 = hotSpotMainState;
                            int i = 0;
                            if (PatchProxy.isSupport(new Object[]{hotSpotMainState2}, this, changeQuickRedirect, false, 36498, new Class[]{HotSpotMainState.class}, Unit.class)) {
                                return (Unit) PatchProxy.accessDispatch(new Object[]{hotSpotMainState2}, this, changeQuickRedirect, false, 36498, new Class[]{HotSpotMainState.class}, Unit.class);
                            }
                            Intrinsics.checkParameterIsNotNull(hotSpotMainState2, AdvanceSetting.NETWORK_TYPE);
                            HotSpotListDialog hotSpotListDialog = this.this$0.this$0.p;
                            if (hotSpotListDialog == null) {
                                return null;
                            }
                            String curSpotWord = hotSpotMainState.getCurSpotWord();
                            if (PatchProxy.isSupport(new Object[]{curSpotWord}, hotSpotListDialog, HotSpotListDialog.f42456a, false, 36600, new Class[]{String.class}, Void.TYPE)) {
                                HotSpotListDialog hotSpotListDialog2 = hotSpotListDialog;
                                PatchProxy.accessDispatch(new Object[]{curSpotWord}, hotSpotListDialog2, HotSpotListDialog.f42456a, false, 36600, new Class[]{String.class}, Void.TYPE);
                            } else {
                                Iterator<HotSearchItem> it2 = hotSpotListDialog.f42458c.f42452b.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        i = -1;
                                        break;
                                    } else if (TextUtils.equals(it2.next().getWord(), curSpotWord)) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                                if (i >= 0) {
                                    Context context = hotSpotListDialog.getContext();
                                    if (com.ss.android.ugc.aweme.discover.helper.b.f()) {
                                        f2 = 180.0f;
                                    } else {
                                        f2 = -152.0f;
                                    }
                                    int dip2Px = (int) UIUtils.dip2Px(context, f2);
                                    RecyclerView recyclerView = hotSpotListDialog.f42457b;
                                    if (recyclerView == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("listView");
                                    }
                                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                                    if (layoutManager != null) {
                                        ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i, dip2Px);
                                    } else {
                                        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
        }
    }

    @NotNull
    public final HotSpotMainViewModel q() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 36438, new Class[0], HotSpotMainViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, g, false, 36438, new Class[0], HotSpotMainViewModel.class);
        } else {
            value = this.q.getValue();
        }
        return (HotSpotMainViewModel) value;
    }

    public final /* bridge */ /* synthetic */ ViewModelProvider.Factory r_() {
        return this.i;
    }

    public HotSpotDetailPageFragment() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(HotSpotMainViewModel.class);
        this.q = new lifecycleAwareLazy(this, new b(this, orCreateKotlinClass, a.INSTANCE, orCreateKotlinClass));
        this.o = new AnalysisStayTimeFragmentComponent(this, true);
    }

    @NotNull
    public final k a() {
        if (!PatchProxy.isSupport(new Object[0], this, g, false, 36456, new Class[0], k.class)) {
            return h.a.a(this);
        }
        return (k) PatchProxy.accessDispatch(new Object[0], this, g, false, 36456, new Class[0], k.class);
    }

    @NotNull
    public final r<com.bytedance.jedi.arch.f> b() {
        if (!PatchProxy.isSupport(new Object[0], this, g, false, 36459, new Class[0], r.class)) {
            return h.a.b(this);
        }
        return (r) PatchProxy.accessDispatch(new Object[0], this, g, false, 36459, new Class[0], r.class);
    }

    public final boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, g, false, 36460, new Class[0], Boolean.TYPE)) {
            return h.a.e(this);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, g, false, 36460, new Class[0], Boolean.TYPE)).booleanValue();
    }

    @NotNull
    public final LifecycleOwner d() {
        if (!PatchProxy.isSupport(new Object[0], this, g, false, 36457, new Class[0], LifecycleOwner.class)) {
            return h.a.c(this);
        }
        return (LifecycleOwner) PatchProxy.accessDispatch(new Object[0], this, g, false, 36457, new Class[0], LifecycleOwner.class);
    }

    public final /* synthetic */ com.bytedance.jedi.arch.d e() {
        com.bytedance.jedi.arch.f fVar;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 36458, new Class[0], com.bytedance.jedi.arch.f.class)) {
            fVar = (com.bytedance.jedi.arch.f) PatchProxy.accessDispatch(new Object[0], this, g, false, 36458, new Class[0], com.bytedance.jedi.arch.f.class);
        } else {
            fVar = h.a.d(this);
        }
        return fVar;
    }

    @NotNull
    public final Analysis getAnalysis() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 36451, new Class[0], Analysis.class)) {
            return (Analysis) PatchProxy.accessDispatch(new Object[0], this, g, false, 36451, new Class[0], Analysis.class);
        }
        Analysis analysis = new Analysis();
        analysis.setLabelName("trending_page");
        return analysis;
    }

    @NotNull
    public final DetailFragmentPanel h() {
        if (!PatchProxy.isSupport(new Object[0], this, g, false, 36453, new Class[0], DetailFragmentPanel.class)) {
            return new a();
        }
        return (DetailFragmentPanel) PatchProxy.accessDispatch(new Object[0], this, g, false, 36453, new Class[0], DetailFragmentPanel.class);
    }

    @NotNull
    public final JediViewModel<?> j() {
        if (!PatchProxy.isSupport(new Object[0], this, g, false, 36454, new Class[0], JediViewModel.class)) {
            return q();
        }
        return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, g, false, 36454, new Class[0], JediViewModel.class);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, g, false, 36479, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 36479, new Class[0], Void.TYPE);
            return;
        }
        if (this.r != null) {
            this.r.clear();
        }
    }

    public final void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, g, false, 36450, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, g, false, 36450, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        this.o.b(z);
    }

    public final <VM1 extends JediViewModel<S1>, S1 extends x, R> R a(@NotNull VM1 vm1, @NotNull Function1<? super S1, ? extends R> function1) {
        VM1 vm12 = vm1;
        Function1<? super S1, ? extends R> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{vm12, function12}, this, g, false, 36461, new Class[]{JediViewModel.class, Function1.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{vm12, function12}, this, g, false, 36461, new Class[]{JediViewModel.class, Function1.class}, Object.class);
        }
        Intrinsics.checkParameterIsNotNull(vm12, "viewModel1");
        Intrinsics.checkParameterIsNotNull(function12, "block");
        return h.a.a(this, vm1, function1);
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Drawable drawable;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, g, false, 36452, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, g, false, 36452, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view2.findViewById(C0906R.id.a48);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "topBg");
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.height = (int) UIUtils.dip2Px(getContext(), 150.0f);
        Context context = getContext();
        if (context != null) {
            drawable = com.ss.android.ugc.bytex.a.a.a.a(context, 2130838573);
        } else {
            drawable = null;
        }
        findViewById.setBackground(drawable);
        findViewById.setLayoutParams(layoutParams);
        View findViewById2 = view2.findViewById(C0906R.id.duu);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.viewpager)");
        this.n = (VerticalViewPager) findViewById2;
        View findViewById3 = view2.findViewById(C0906R.id.aid);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.fragment_detail_spot_info)");
        this.j = (ViewStub) findViewById3;
        ViewStub viewStub = this.j;
        if (viewStub == null) {
            Intrinsics.throwUninitializedPropertyAccessException("infoStub");
        }
        View inflate = viewStub.inflate();
        if (inflate != null) {
            this.k = (ViewGroup) inflate;
            LifecycleOwner lifecycleOwner = this;
            ViewGroup viewGroup = this.k;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("infoLayout");
            }
            this.l = new SpotInfoViewHolder(lifecycleOwner, viewGroup);
            a.C0242a aVar = com.bytedance.widget.a.f22910e;
            Fragment fragment = this;
            ViewGroup viewGroup2 = this.k;
            if (viewGroup2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("infoLayout");
            }
            com.bytedance.widget.a a2 = aVar.a(fragment, viewGroup2);
            SpotInfoViewHolder spotInfoViewHolder = this.l;
            if (spotInfoViewHolder == null) {
                Intrinsics.throwUninitializedPropertyAccessException("infoViewHolder");
            }
            a2.a(spotInfoViewHolder);
            View findViewById4 = view2.findViewById(C0906R.id.cti);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "view.findViewById(R.id.spot_bottom)");
            View view3 = (ViewGroup) findViewById4;
            this.m = new SpotBottomViewHolder(this, view3);
            com.bytedance.widget.a a3 = com.bytedance.widget.a.f22910e.a(fragment, view3);
            SpotBottomViewHolder spotBottomViewHolder = this.m;
            if (spotBottomViewHolder == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomViewHolder");
            }
            a3.a(spotBottomViewHolder);
            HotSpotMainViewModel q2 = q();
            com.ss.android.ugc.aweme.feed.param.b bVar = this.f3012c;
            Intrinsics.checkExpressionValueIsNotNull(bVar, "param");
            if (PatchProxy.isSupport(new Object[]{bVar}, q2, HotSpotMainViewModel.f42486d, false, 36634, new Class[]{com.ss.android.ugc.aweme.feed.param.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, q2, HotSpotMainViewModel.f42486d, false, 36634, new Class[]{com.ss.android.ugc.aweme.feed.param.b.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(bVar, "<set-?>");
                q2.f42488f = bVar;
            }
            HotSpotMainViewModel q3 = q();
            Function0<Unit> cVar = new c<>(this);
            if (PatchProxy.isSupport(new Object[]{cVar}, q3, HotSpotMainViewModel.f42486d, false, 36638, new Class[]{Function0.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, q3, HotSpotMainViewModel.f42486d, false, 36638, new Class[]{Function0.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(cVar, "<set-?>");
                q3.h = cVar;
            }
            Disposable unused = a(q(), b.INSTANCE, c(), false, new d(this));
            Disposable unused2 = a(q(), c.INSTANCE, c(), false, new e(this));
            HotSpotMainViewModel q4 = q();
            com.ss.android.ugc.aweme.feed.param.b bVar2 = this.f3012c;
            Intrinsics.checkExpressionValueIsNotNull(bVar2, "param");
            HotSpotMainViewModel.a(q4, bVar2.getHotSearch(), null, false, 6);
            Disposable unused3 = a(q(), d.INSTANCE, c(), false, new f(this));
            CleanModeManager2.a aVar2 = CleanModeManager2.f54120e;
            FragmentActivity activity = getActivity();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Function1 gVar = new g(this);
            if (PatchProxy.isSupport(new Object[]{activity, viewLifecycleOwner, gVar}, aVar2, CleanModeManager2.a.f54124a, false, 57030, new Class[]{FragmentActivity.class, LifecycleOwner.class, Function1.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity, viewLifecycleOwner, gVar}, aVar2, CleanModeManager2.a.f54124a, false, 57030, new Class[]{FragmentActivity.class, LifecycleOwner.class, Function1.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(gVar, "listener");
                if (!(activity == null || viewLifecycleOwner == null)) {
                    aVar2.a(activity).a(viewLifecycleOwner, new CleanModeManager2.a.C0627a(gVar), true);
                }
            }
            FeedSwipeRefreshLayout feedSwipeRefreshLayout = this.mRefreshLayout;
            Intrinsics.checkExpressionValueIsNotNull(feedSwipeRefreshLayout, "mRefreshLayout");
            feedSwipeRefreshLayout.setEnabled(true);
            this.mRefreshLayout.setOnRefreshListener(new h(this));
            VerticalViewPager verticalViewPager = this.n;
            if (verticalViewPager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            }
            verticalViewPager.a((ViewPager.OnPageChangeListener) new HotSpotDetailPageFragment$onViewCreated$10(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, g, false, 36449, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, g, false, 36449, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        return layoutInflater2.inflate(C0906R.layout.qe, viewGroup2, false);
    }

    @NotNull
    public final <S extends x> Disposable a(@NotNull JediViewModel<S> jediViewModel, boolean z, boolean z2, @NotNull Function2<? super com.bytedance.jedi.arch.f, ? super S, Unit> function2) {
        JediViewModel<S> jediViewModel2 = jediViewModel;
        Function2<? super com.bytedance.jedi.arch.f, ? super S, Unit> function22 = function2;
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function22}, this, g, false, 36477, new Class[]{JediViewModel.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class)) {
            return (Disposable) PatchProxy.accessDispatch(new Object[]{jediViewModel2, Byte.valueOf(z), Byte.valueOf(z2), function22}, this, g, false, 36477, new Class[]{JediViewModel.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class);
        }
        Intrinsics.checkParameterIsNotNull(jediViewModel2, "$this$subscribe");
        Intrinsics.checkParameterIsNotNull(function22, "subscriber");
        return h.a.a(this, jediViewModel, z, z2, function2);
    }

    @NotNull
    public final <S extends x, A> Disposable a(@NotNull JediViewModel<S> jediViewModel, @NotNull KProperty1<S, ? extends A> kProperty1, boolean z, boolean z2, @NotNull Function2<? super com.bytedance.jedi.arch.f, ? super A, Unit> function2) {
        JediViewModel<S> jediViewModel2 = jediViewModel;
        KProperty1<S, ? extends A> kProperty12 = kProperty1;
        Function2<? super com.bytedance.jedi.arch.f, ? super A, Unit> function22 = function2;
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function22}, this, g, false, 36472, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class)) {
            Object[] objArr = {jediViewModel2, kProperty12, Byte.valueOf(z), Byte.valueOf(z2), function22};
            return (Disposable) PatchProxy.accessDispatch(objArr, this, g, false, 36472, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class);
        }
        Intrinsics.checkParameterIsNotNull(jediViewModel2, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(kProperty12, "prop1");
        Intrinsics.checkParameterIsNotNull(function22, "subscriber");
        return h.a.a(this, jediViewModel, kProperty1, z, z2, function2);
    }

    @NotNull
    public final <S extends x, T> Disposable a(@NotNull JediViewModel<S> jediViewModel, @NotNull KProperty1<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kProperty1, boolean z, boolean z2, @Nullable Function2<? super com.bytedance.jedi.arch.f, ? super Throwable, Unit> function2, @Nullable Function1<? super com.bytedance.jedi.arch.f, Unit> function1, @Nullable Function2<? super com.bytedance.jedi.arch.f, ? super T, Unit> function22) {
        JediViewModel<S> jediViewModel2 = jediViewModel;
        KProperty1<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kProperty12 = kProperty1;
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function2, function1, function22}, this, g, false, 36471, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class, Function1.class, Function2.class}, Disposable.class)) {
            return (Disposable) PatchProxy.accessDispatch(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z), Byte.valueOf(z2), function2, function1, function22}, this, g, false, 36471, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class, Function1.class, Function2.class}, Disposable.class);
        }
        Intrinsics.checkParameterIsNotNull(jediViewModel2, "$this$asyncSubscribe");
        Intrinsics.checkParameterIsNotNull(kProperty12, "prop");
        return h.a.a(this, jediViewModel, kProperty1, z, z2, function2, function1, function22);
    }
}
