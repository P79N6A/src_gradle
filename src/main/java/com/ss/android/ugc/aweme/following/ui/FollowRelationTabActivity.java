package com.ss.android.ugc.aweme.following.ui;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.n;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.arch.JediBaseActivity;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationState;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.a.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\nH\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/FollowRelationTabActivity;", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseActivity;", "()V", "mFollowRelationTabViewModel", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationTabViewModel;", "getMFollowRelationTabViewModel", "()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationTabViewModel;", "mFollowRelationTabViewModel$delegate", "Lcom/bytedance/jedi/arch/lifecycleAwareLazy;", "addFragment", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setStatusBarColor", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FollowRelationTabActivity extends JediBaseActivity {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f47974c;

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f47975d = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FollowRelationTabActivity.class), "mFollowRelationTabViewModel", "getMFollowRelationTabViewModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationTabViewModel;"))};

    /* renamed from: e  reason: collision with root package name */
    public static final c f47976e = new c((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private final lifecycleAwareLazy f47977f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0014\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0006\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0007\"\b\b\u0002\u0010\u0001*\u00020\b*\u0002H\u00012\b\u0010\t\u001a\u0004\u0018\u00010\nH\n¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"<anonymous>", "S", "T", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "VM", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/bytedance/jedi/arch/State;", "it", "Landroid/os/Bundle;", "invoke", "(Lcom/bytedance/jedi/arch/State;Landroid/os/Bundle;)Lcom/bytedance/jedi/arch/State;", "com/bytedance/jedi/arch/ExtensionsKt$viewModel$2"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function2<FollowRelationState, Bundle, FollowRelationState> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        public a() {
            super(2);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationState, com.bytedance.jedi.arch.x] */
        @NotNull
        public final FollowRelationState invoke(@NotNull FollowRelationState followRelationState, @Nullable Bundle bundle) {
            FollowRelationState followRelationState2 = followRelationState;
            if (PatchProxy.isSupport(new Object[]{followRelationState2, bundle}, this, changeQuickRedirect, false, 44886, new Class[]{x.class, Bundle.class}, x.class)) {
                return (x) PatchProxy.accessDispatch(new Object[]{followRelationState2, bundle}, this, changeQuickRedirect, false, 44886, new Class[]{x.class, Bundle.class}, x.class);
            }
            Intrinsics.checkParameterIsNotNull(followRelationState2, "$receiver");
            return followRelationState2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0014\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0002\u0010\u0007*\u00020\bH\n¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"<anonymous>", "VM", "T", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/arch/ExtensionsKt$viewModel$3"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function0<FollowRelationTabViewModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Function2 $argumentsAcceptor;
        final /* synthetic */ AppCompatActivity $this_viewModel;
        final /* synthetic */ KClass $viewModelClass;
        final /* synthetic */ KClass $viewModelClass$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(AppCompatActivity appCompatActivity, KClass kClass, Function2 function2, KClass kClass2) {
            super(0);
            this.$this_viewModel = appCompatActivity;
            this.$viewModelClass = kClass;
            this.$argumentsAcceptor = function2;
            this.$viewModelClass$inlined = kClass2;
        }

        /* JADX WARNING: type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r0v7, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        @NotNull
        public final FollowRelationTabViewModel invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 44887, new Class[0], JediViewModel.class)) {
                return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 44887, new Class[0], JediViewModel.class);
            }
            ViewModelProvider of = ViewModelProviders.of(this.$this_viewModel, ((ae) this.$this_viewModel).r_());
            String name = kotlin.jvm.a.a(this.$viewModelClass$inlined).getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
            ? r0 = (JediViewModel) of.get(name, kotlin.jvm.a.a(this.$viewModelClass));
            n a2 = r0.f2282c.a(FollowRelationTabViewModel.class);
            if (a2 != null) {
                Intrinsics.checkExpressionValueIsNotNull(r0, "this");
                a2.binding(r0);
            }
            r0.a(new Function1<FollowRelationState, FollowRelationState>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ b this$0;

                {
                    this.this$0 = r1;
                }

                /* JADX WARNING: type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationState, com.bytedance.jedi.arch.x] */
                /* JADX WARNING: type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationState, com.bytedance.jedi.arch.x] */
                @NotNull
                public final FollowRelationState invoke(@NotNull FollowRelationState followRelationState) {
                    if (PatchProxy.isSupport(new Object[]{followRelationState}, this, changeQuickRedirect, false, 44888, new Class[]{x.class}, x.class)) {
                        return (x) PatchProxy.accessDispatch(new Object[]{followRelationState}, this, changeQuickRedirect, false, 44888, new Class[]{x.class}, x.class);
                    }
                    Intrinsics.checkParameterIsNotNull(followRelationState, "$this$initialize");
                    Function2 function2 = this.this$0.$argumentsAcceptor;
                    Intent intent = this.this$0.$this_viewModel.getIntent();
                    Intrinsics.checkExpressionValueIsNotNull(intent, "this@viewModel.intent");
                    return (x) function2.invoke(followRelationState, intent.getExtras());
                }
            });
            return r0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/FollowRelationTabActivity$Companion;", "", "()V", "FRAGMENT_FOLLOW_RELATION_TAB", "", "startActivity", "", "context", "Landroid/content/Context;", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "relationType", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47978a;

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }

        @JvmStatic
        public final void a(@NotNull Context context, @Nullable User user, @NotNull String str) {
            Context context2 = context;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{context2, user, str2}, this, f47978a, false, 44889, new Class[]{Context.class, User.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, user, str2}, this, f47978a, false, 44889, new Class[]{Context.class, User.class, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(context2, "context");
            Intrinsics.checkParameterIsNotNull(str2, "relationType");
            if (user != null) {
                b.a.a(user);
                Intent intent = new Intent(context2, FollowRelationTabActivity.class);
                intent.putExtra("uid", user.getUid());
                intent.putExtra("follow_relation_type", str2);
                context2.startActivity(intent);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function1<FollowRelationState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FollowRelationTabActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(FollowRelationTabActivity followRelationTabActivity) {
            super(1);
            this.this$0 = followRelationTabActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FollowRelationState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull FollowRelationState followRelationState) {
            if (PatchProxy.isSupport(new Object[]{followRelationState}, this, changeQuickRedirect, false, 44890, new Class[]{FollowRelationState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{followRelationState}, this, changeQuickRedirect, false, 44890, new Class[]{FollowRelationState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(followRelationState, AdvanceSetting.NETWORK_TYPE);
            if (!followRelationState.isSearching() || !followRelationState.isFollowingTab()) {
                FollowRelationTabActivity.super.onBackPressed();
            } else {
                this.this$0.g().a(false);
            }
        }
    }

    @JvmStatic
    public static final void a(@NotNull Context context, @Nullable User user, @NotNull String str) {
        Context context2 = context;
        User user2 = user;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, user2, str2}, null, f47974c, true, 44883, new Class[]{Context.class, User.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, user2, str2}, null, f47974c, true, 44883, new Class[]{Context.class, User.class, String.class}, Void.TYPE);
            return;
        }
        f47976e.a(context2, user2, str2);
    }

    public final FollowRelationTabViewModel g() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f47974c, false, 44876, new Class[0], FollowRelationTabViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f47974c, false, 44876, new Class[0], FollowRelationTabViewModel.class);
        } else {
            value = this.f47977f.getValue();
        }
        return (FollowRelationTabViewModel) value;
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f47974c, false, 44884, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47974c, false, 44884, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f47974c, false, 44885, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f47974c, false, 44885, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public FollowRelationTabActivity() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FollowRelationTabViewModel.class);
        this.f47977f = new lifecycleAwareLazy(this, new b(this, orCreateKotlinClass, a.INSTANCE, orCreateKotlinClass));
    }

    public final void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f47974c, false, 44880, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47974c, false, 44880, new Class[0], Void.TYPE);
            return;
        }
        a(g(), new d(this));
    }

    public final void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f47974c, false, 44879, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47974c, false, 44879, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f47974c, false, 44877, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f47974c, false, 44877, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.bi);
        if (PatchProxy.isSupport(new Object[0], this, f47974c, false, 44878, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47974c, false, 44878, new Class[0], Void.TYPE);
        } else {
            Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("follow_relation_tab");
            if (findFragmentByTag == null) {
                findFragmentByTag = new FollowRelationTabFragment();
            }
            Intent intent = getIntent();
            Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
            findFragmentByTag.setArguments(intent.getExtras());
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
            beginTransaction.replace(C0906R.id.aic, findFragmentByTag, "follow_relation_tab").commitAllowingStateLoss();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity", "onCreate", false);
    }
}
