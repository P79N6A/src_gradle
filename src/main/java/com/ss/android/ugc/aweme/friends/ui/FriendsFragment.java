package com.ss.android.ugc.aweme.friends.ui;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.jedi.arch.JediViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.arch.JediBaseFragment;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.ss.android.ugc.aweme.friends.AddFriendsState;
import com.ss.android.ugc.aweme.friends.AddFriendsViewModel;
import com.ss.android.ugc.aweme.friends.adapter.FriendsPagerAdapter;
import com.ss.android.ugc.aweme.music.util.ProfileListFragment;
import com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator;
import com.ss.android.ugc.aweme.views.RtlViewPager;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 72\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00017B\u0005¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\u0016J\u0006\u0010\u001a\u001a\u00020\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0002J\u0012\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u0014H\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0018H\u0016J \u0010'\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0018H\u0016J\u0010\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u0018H\u0016J\u0018\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u0018H\u0016J\b\u00100\u001a\u000201H\u0016J\u0018\u00102\u001a\u00020\u00162\u0006\u00103\u001a\u00020)2\u0006\u00104\u001a\u00020)H\u0016J\u001a\u00105\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u00142\b\u0010#\u001a\u0004\u0018\u00010$H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/ui/FriendsFragment;", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseFragment;", "Lcom/ss/android/ugc/aweme/common/widget/scrollablelayout/ScrollableLayout$OnScrollListener;", "Landroid/support/v4/view/ViewPager$OnPageChangeListener;", "Landroid/view/View$OnClickListener;", "()V", "TAG", "", "mAdapter", "Lcom/ss/android/ugc/aweme/friends/adapter/FriendsPagerAdapter;", "getMAdapter", "()Lcom/ss/android/ugc/aweme/friends/adapter/FriendsPagerAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mAddFriendsViewModel", "Lcom/ss/android/ugc/aweme/friends/AddFriendsViewModel;", "getMAddFriendsViewModel", "()Lcom/ss/android/ugc/aweme/friends/AddFriendsViewModel;", "mAddFriendsViewModel$delegate", "mRootView", "Landroid/view/View;", "back", "", "getBottomMargin", "", "initData", "initView", "initViewModel", "onClick", "v", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPageScrollStateChanged", "p0", "onPageScrolled", "p1", "", "p2", "onPageSelected", "position", "onScroll", "currentY", "maxY", "onScrollEnd", "", "onScrolled", "dx", "dy", "onViewCreated", "view", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FriendsFragment extends JediBaseFragment implements ViewPager.OnPageChangeListener, View.OnClickListener, ScrollableLayout.b {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f49299c;

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f49300d = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FriendsFragment.class), "mAdapter", "getMAdapter()Lcom/ss/android/ugc/aweme/friends/adapter/FriendsPagerAdapter;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FriendsFragment.class), "mAddFriendsViewModel", "getMAddFriendsViewModel()Lcom/ss/android/ugc/aweme/friends/AddFriendsViewModel;"))};

    /* renamed from: e  reason: collision with root package name */
    public static final b f49301e = new b((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private final String f49302f = "FriendsFragment";
    private View g;
    private final Lazy h = LazyKt.lazy(new f(this));
    private final Lazy i;
    private HashMap j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\f\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0002\u0010\u0006*\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"<anonymous>", "VM", "T", "Landroid/support/v4/app/Fragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/arch/ExtensionsKt$activityViewModel$2"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function0<AddFriendsViewModel> {
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

        /* JADX WARNING: type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.friends.AddFriendsViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r0v7, types: [com.ss.android.ugc.aweme.friends.AddFriendsViewModel, com.bytedance.jedi.arch.JediViewModel] */
        @NotNull
        public final AddFriendsViewModel invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47327, new Class[0], JediViewModel.class)) {
                return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47327, new Class[0], JediViewModel.class);
            }
            ViewModelProvider of = ViewModelProviders.of(this.$this_activityViewModel.requireActivity(), com.bytedance.jedi.arch.b.a());
            String name = kotlin.jvm.a.a(this.$viewModelClass$inlined).getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
            return (JediViewModel) of.get(name, kotlin.jvm.a.a(this.$viewModelClass));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/ui/FriendsFragment$Companion;", "", "()V", "FRIEND_LIST", "", "RECOMMEND_LIST", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function2<com.bytedance.jedi.arch.f, Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FriendsFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(FriendsFragment friendsFragment) {
            super(2);
            this.this$0 = friendsFragment;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, boolean z) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            if (PatchProxy.isSupport(new Object[]{fVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 47330, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 47330, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            if (z) {
                fVar2.a(this.this$0.i(), new Function1<AddFriendsState, Unit>(this) {
                    public static ChangeQuickRedirect changeQuickRedirect;
                    final /* synthetic */ c this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((AddFriendsState) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull AddFriendsState addFriendsState) {
                        AddFriendsState addFriendsState2 = addFriendsState;
                        if (PatchProxy.isSupport(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 47331, new Class[]{AddFriendsState.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 47331, new Class[]{AddFriendsState.class}, Void.TYPE);
                            return;
                        }
                        Intrinsics.checkParameterIsNotNull(addFriendsState2, "state");
                        this.this$0.this$0.h().a(addFriendsState.getCurrentIndex());
                    }
                });
                AddFriendsViewModel i = this.this$0.i();
                if (PatchProxy.isSupport(new Object[]{(byte) 0}, i, AddFriendsViewModel.f48668d, false, 46198, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    AddFriendsViewModel addFriendsViewModel = i;
                    PatchProxy.accessDispatch(new Object[]{(byte) 0}, addFriendsViewModel, AddFriendsViewModel.f48668d, false, 46198, new Class[]{Boolean.TYPE}, Void.TYPE);
                    return;
                }
                i.b(new AddFriendsViewModel.d(i, false));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function2<com.bytedance.jedi.arch.f, Integer, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FriendsFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(FriendsFragment friendsFragment) {
            super(2);
            this.this$0 = friendsFragment;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, int i) {
            if (PatchProxy.isSupport(new Object[]{fVar, Integer.valueOf(i)}, this, changeQuickRedirect, false, 47334, new Class[]{com.bytedance.jedi.arch.f.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, Integer.valueOf(i)}, this, changeQuickRedirect, false, 47334, new Class[]{com.bytedance.jedi.arch.f.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            RtlViewPager rtlViewPager = (RtlViewPager) this.this$0.a(C0906R.id.duu);
            Intrinsics.checkExpressionValueIsNotNull(rtlViewPager, "viewpager");
            rtlViewPager.setCurrentItem(i);
            this.this$0.h().b(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function2<com.bytedance.jedi.arch.f, Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FriendsFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(FriendsFragment friendsFragment) {
            super(2);
            this.this$0 = friendsFragment;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, boolean z) {
            if (PatchProxy.isSupport(new Object[]{fVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 47337, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, Byte.valueOf(z)}, this, changeQuickRedirect, false, 47337, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            if (z) {
                AutoRTLImageView autoRTLImageView = (AutoRTLImageView) this.this$0.a(C0906R.id.ceh);
                Intrinsics.checkExpressionValueIsNotNull(autoRTLImageView, "right_btn");
                autoRTLImageView.setVisibility(8);
                return;
            }
            AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) this.this$0.a(C0906R.id.ceh);
            Intrinsics.checkExpressionValueIsNotNull(autoRTLImageView2, "right_btn");
            autoRTLImageView2.setVisibility(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/adapter/FriendsPagerAdapter;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function0<FriendsPagerAdapter> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FriendsFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(FriendsFragment friendsFragment) {
            super(0);
            this.this$0 = friendsFragment;
        }

        @NotNull
        public final FriendsPagerAdapter invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47338, new Class[0], FriendsPagerAdapter.class)) {
                return new FriendsPagerAdapter(this.this$0.getChildFragmentManager(), this.this$0.getActivity());
            }
            return (FriendsPagerAdapter) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47338, new Class[0], FriendsPagerAdapter.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/friends/AddFriendsState;", "invoke", "com/ss/android/ugc/aweme/friends/ui/FriendsFragment$onClick$1$1"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function1<AddFriendsState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ View $v$inlined;
        final /* synthetic */ FriendsFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(FriendsFragment friendsFragment, View view) {
            super(1);
            this.this$0 = friendsFragment;
            this.$v$inlined = view;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AddFriendsState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull AddFriendsState addFriendsState) {
            AddFriendsState addFriendsState2 = addFriendsState;
            if (PatchProxy.isSupport(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 47339, new Class[]{AddFriendsState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 47339, new Class[]{AddFriendsState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(addFriendsState2, AdvanceSetting.NETWORK_TYPE);
            if (addFriendsState.isSearching()) {
                this.this$0.i().a(false);
            } else if (this.this$0.getActivity() instanceof AddFriendsActivity) {
                AddFriendsViewModel i = this.this$0.i();
                if (PatchProxy.isSupport(new Object[]{(byte) 1}, i, AddFriendsViewModel.f48668d, false, 46200, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    AddFriendsViewModel addFriendsViewModel = i;
                    PatchProxy.accessDispatch(new Object[]{(byte) 1}, addFriendsViewModel, AddFriendsViewModel.f48668d, false, 46200, new Class[]{Boolean.TYPE}, Void.TYPE);
                } else {
                    i.c(new AddFriendsViewModel.b(true));
                }
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/friends/AddFriendsState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function1<AddFriendsState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FriendsFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(FriendsFragment friendsFragment) {
            super(1);
            this.this$0 = friendsFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AddFriendsState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull AddFriendsState addFriendsState) {
            String str;
            AddFriendsState addFriendsState2 = addFriendsState;
            if (PatchProxy.isSupport(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 47340, new Class[]{AddFriendsState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 47340, new Class[]{AddFriendsState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(addFriendsState2, AdvanceSetting.NETWORK_TYPE);
            if (!addFriendsState.getHadShowedFriendList()) {
                AddFriendsViewModel i = this.this$0.i();
                if (PatchProxy.isSupport(new Object[]{(byte) 1}, i, AddFriendsViewModel.f48668d, false, 46201, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    AddFriendsViewModel addFriendsViewModel = i;
                    PatchProxy.accessDispatch(new Object[]{(byte) 1}, addFriendsViewModel, AddFriendsViewModel.f48668d, false, 46201, new Class[]{Boolean.TYPE}, Void.TYPE);
                } else {
                    i.c(new AddFriendsViewModel.f(true));
                }
                Bundle arguments = this.this$0.getArguments();
                if (arguments != null) {
                    Intrinsics.checkExpressionValueIsNotNull(arguments, "arguments ?: return@withState");
                    if (Intrinsics.areEqual((Object) arguments.getString("index"), (Object) PushConstants.PUSH_TYPE_THROUGH_MESSAGE)) {
                        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "friends_list");
                        if (arguments.getInt("bundle_recommend_count", 0) <= 0 || arguments.getInt("bundle_recommend_user_type", -1) != 1) {
                            str = "";
                        } else {
                            AbTestManager a3 = AbTestManager.a();
                            Intrinsics.checkExpressionValueIsNotNull(a3, "AbTestManager.getInstance()");
                            if (a3.n() == 1) {
                                str = "number_dot";
                            } else {
                                str = "yellow_dot";
                            }
                        }
                        r.a("enter_find_friends_list", (Map) a2.a("notice_type", str).f34114b);
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/friends/AddFriendsState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function1<AddFriendsState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FriendsFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(FriendsFragment friendsFragment) {
            super(1);
            this.this$0 = friendsFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AddFriendsState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull AddFriendsState addFriendsState) {
            String str;
            AddFriendsState addFriendsState2 = addFriendsState;
            if (PatchProxy.isSupport(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 47341, new Class[]{AddFriendsState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 47341, new Class[]{AddFriendsState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(addFriendsState2, AdvanceSetting.NETWORK_TYPE);
            if (!addFriendsState.getHadShowedFindFriend()) {
                AddFriendsViewModel i = this.this$0.i();
                if (PatchProxy.isSupport(new Object[]{(byte) 1}, i, AddFriendsViewModel.f48668d, false, 46202, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    AddFriendsViewModel addFriendsViewModel = i;
                    PatchProxy.accessDispatch(new Object[]{(byte) 1}, addFriendsViewModel, AddFriendsViewModel.f48668d, false, 46202, new Class[]{Boolean.TYPE}, Void.TYPE);
                } else {
                    i.c(new AddFriendsViewModel.e(true));
                }
                Bundle arguments = this.this$0.getArguments();
                if (arguments != null) {
                    Intrinsics.checkExpressionValueIsNotNull(arguments, "arguments ?: return@withState");
                    com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", arguments.getString("enter_from"));
                    if (arguments.getInt("bundle_recommend_count", 0) <= 0 || arguments.getInt("bundle_recommend_user_type", -1) != 1) {
                        str = "";
                    } else {
                        AbTestManager a3 = AbTestManager.a();
                        Intrinsics.checkExpressionValueIsNotNull(a3, "AbTestManager.getInstance()");
                        if (a3.n() == 1) {
                            str = "number_dot";
                        } else {
                            str = "yellow_dot";
                        }
                    }
                    r.a("enter_find_friends_list", (Map) a2.a("notice_type", str).f34114b);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/friends/AddFriendsState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function1<AddFriendsState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FriendsFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(FriendsFragment friendsFragment) {
            super(1);
            this.this$0 = friendsFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AddFriendsState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull AddFriendsState addFriendsState) {
            int i;
            AddFriendsState addFriendsState2 = addFriendsState;
            if (PatchProxy.isSupport(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 47342, new Class[]{AddFriendsState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 47342, new Class[]{AddFriendsState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(addFriendsState2, AdvanceSetting.NETWORK_TYPE);
            if (this.this$0.isViewValid() && this.this$0.h().getCount() != 0 && (this.this$0.h().getItem(addFriendsState.getCurrentIndex()) instanceof ProfileListFragment)) {
                Fragment item = this.this$0.h().getItem(addFriendsState.getCurrentIndex());
                if (item != null) {
                    View f2 = ((ProfileListFragment) item).f();
                    if (f2 != null) {
                        RecyclerView recyclerView = (RecyclerView) f2;
                        if (recyclerView.getChildCount() == 0) {
                            ((ScrollableLayout) this.this$0.a(C0906R.id.ck9)).setCanScrollUp(false);
                            return;
                        }
                        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                        if (layoutManager != null) {
                            View childAt = layoutManager.getChildAt(recyclerView.getChildCount() - 1);
                            if (childAt != null) {
                                int screenHeight = UIUtils.getScreenHeight(this.this$0.getContext());
                                Intrinsics.checkExpressionValueIsNotNull(childAt, "lastView");
                                int bottom = childAt.getBottom();
                                RtlViewPager rtlViewPager = (RtlViewPager) this.this$0.a(C0906R.id.duu);
                                Intrinsics.checkExpressionValueIsNotNull(rtlViewPager, "viewpager");
                                int top = bottom + rtlViewPager.getTop();
                                FriendsFragment friendsFragment = this.this$0;
                                if (PatchProxy.isSupport(new Object[0], friendsFragment, FriendsFragment.f49299c, false, 47322, new Class[0], Integer.TYPE)) {
                                    i = ((Integer) PatchProxy.accessDispatch(new Object[0], friendsFragment, FriendsFragment.f49299c, false, 47322, new Class[0], Integer.TYPE)).intValue();
                                } else {
                                    i = (int) friendsFragment.getResources().getDimension(C0906R.dimen.lv);
                                }
                                ((ScrollableLayout) this.this$0.a(C0906R.id.ck9)).setMaxScrollHeight((top + i) - screenHeight);
                            }
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.RecyclerView");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.music.util.ProfileListFragment");
                }
            }
        }
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f49299c, false, 47325, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f49299c, false, 47325, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.j == null) {
            this.j = new HashMap();
        }
        View view = (View) this.j.get(Integer.valueOf(i2));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i2);
            this.j.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final void b(int i2, int i3) {
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f49299c, false, 47326, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49299c, false, 47326, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.clear();
        }
    }

    public final FriendsPagerAdapter h() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f49299c, false, 47313, new Class[0], FriendsPagerAdapter.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f49299c, false, 47313, new Class[0], FriendsPagerAdapter.class);
        } else {
            value = this.h.getValue();
        }
        return (FriendsPagerAdapter) value;
    }

    public final AddFriendsViewModel i() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f49299c, false, 47314, new Class[0], AddFriendsViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f49299c, false, 47314, new Class[0], AddFriendsViewModel.class);
        } else {
            value = this.i.getValue();
        }
        return (AddFriendsViewModel) value;
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

    public FriendsFragment() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AddFriendsViewModel.class);
        this.i = LazyKt.lazy(new a(this, orCreateKotlinClass, orCreateKotlinClass));
    }

    public final void onClick(@Nullable View view) {
        String str;
        if (PatchProxy.isSupport(new Object[]{view}, this, f49299c, false, 47320, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f49299c, false, 47320, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view != null) {
            int id = view.getId();
            if (id == C0906R.id.ix) {
                a(i(), new g(this, view));
            } else if (id == C0906R.id.ceh) {
                QRCodePermissionActivity.a(getActivity(), false);
                com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
                RtlViewPager rtlViewPager = (RtlViewPager) a(C0906R.id.duu);
                Intrinsics.checkExpressionValueIsNotNull(rtlViewPager, "viewpager");
                if (rtlViewPager.getCurrentItem() == 0) {
                    str = "friends_list";
                } else {
                    str = "find_friends";
                }
                r.a("qr_code_scan_enter", (Map) a2.a("enter_from", str).f34114b);
            }
        }
    }

    public final void onPageSelected(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f49299c, false, 47323, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f49299c, false, 47323, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 >= 0 && i2 < h().getCount()) {
            i().a(i2);
            if (i2 == 0) {
                r.a("enter_friends_list", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", "friends_list").f34114b);
                a(i(), new h(this));
                return;
            }
            if (i2 == 1) {
                r.a("click_add_friends", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", "friends_list").f34114b);
                a(i(), new i(this));
            }
        }
    }

    public final void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f49299c, false, 47321, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f49299c, false, 47321, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        a(i(), new j(this));
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f49299c, false, 47316, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f49299c, false, 47316, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f49299c, false, 47317, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49299c, false, 47317, new Class[0], Void.TYPE);
        } else {
            ScrollableLayout scrollableLayout = (ScrollableLayout) a(C0906R.id.ck9);
            if (scrollableLayout != null) {
                scrollableLayout.setOnScrollListener(this);
            }
            RtlViewPager rtlViewPager = (RtlViewPager) a(C0906R.id.duu);
            if (rtlViewPager != null) {
                rtlViewPager.setAdapter(h());
                rtlViewPager.setOffscreenPageLimit(3);
                rtlViewPager.addOnPageChangeListener(this);
            }
            AwemeViewPagerNavigator awemeViewPagerNavigator = (AwemeViewPagerNavigator) a(C0906R.id.bq0);
            if (awemeViewPagerNavigator != null) {
                awemeViewPagerNavigator.setBackgroundColor(awemeViewPagerNavigator.getResources().getColor(C0906R.color.yx));
                Context context = awemeViewPagerNavigator.getContext();
                if (context == null) {
                    Intrinsics.throwNpe();
                }
                awemeViewPagerNavigator.setAllTabWidth((int) UIUtils.dip2Px(context, 240.0f));
                awemeViewPagerNavigator.a((RtlViewPager) a(C0906R.id.duu), new com.ss.android.ugc.aweme.friends.adapter.g());
            }
            View.OnClickListener onClickListener = this;
            ((ImageView) a(C0906R.id.ix)).setOnClickListener(onClickListener);
            ((AutoRTLImageView) a(C0906R.id.ceh)).setOnClickListener(onClickListener);
        }
        if (PatchProxy.isSupport(new Object[0], this, f49299c, false, 47318, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49299c, false, 47318, new Class[0], Void.TYPE);
        } else {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                Intent intent = activity.getIntent();
                if (intent != null && activity.getIntent().hasExtra("index")) {
                    Integer valueOf = Integer.valueOf(intent.getStringExtra("index"));
                    if (Intrinsics.compare(valueOf.intValue(), 0) > 0 && Intrinsics.compare(valueOf.intValue(), h().getCount()) < 0) {
                        AddFriendsViewModel i2 = i();
                        Intrinsics.checkExpressionValueIsNotNull(valueOf, "index");
                        i2.a(valueOf.intValue());
                    }
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f49299c, false, 47319, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49299c, false, 47319, new Class[0], Void.TYPE);
            return;
        }
        Disposable unused = a(i(), aa.INSTANCE, c(), false, new c(this));
        Disposable unused2 = a(i(), ab.INSTANCE, c(), false, new d(this));
        Disposable unused3 = a(i(), ac.INSTANCE, c(), false, new e(this));
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f49299c, false, 47315, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f49299c, false, 47315, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(C0906R.layout.o2, viewGroup2, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…riends, container, false)");
        this.g = inflate;
        View view = this.g;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return view;
    }
}
