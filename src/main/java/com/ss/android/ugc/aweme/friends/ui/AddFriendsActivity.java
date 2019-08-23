package com.ss.android.ugc.aweme.friends.ui;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.monitor.annotation.AddPageTrace;
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
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.base.arch.JediBaseActivity;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.friends.AddFriendsState;
import com.ss.android.ugc.aweme.friends.AddFriendsViewModel;
import com.ss.android.ugc.aweme.newfollow.util.k;
import java.util.Map;
import kotlin.Metadata;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0006\u0010\u000f\u001a\u00020\u000eJ\"\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\u0012\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u000eH\u0014J+\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0016¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u000eH\u0014J\b\u0010#\u001a\u00020\u000eH\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006%"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/ui/AddFriendsActivity;", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseActivity;", "()V", "mAddFriendsViewModel", "Lcom/ss/android/ugc/aweme/friends/AddFriendsViewModel;", "getMAddFriendsViewModel", "()Lcom/ss/android/ugc/aweme/friends/AddFriendsViewModel;", "mAddFriendsViewModel$delegate", "Lcom/bytedance/jedi/arch/lifecycleAwareLazy;", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "finish", "", "init", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onStop", "setStatusBarColor", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
@AddPageTrace
public final class AddFriendsActivity extends JediBaseActivity {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f49133c;

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f49134d = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(AddFriendsActivity.class), "mAddFriendsViewModel", "getMAddFriendsViewModel()Lcom/ss/android/ugc/aweme/friends/AddFriendsViewModel;"))};

    /* renamed from: e  reason: collision with root package name */
    public static final b f49135e = new b((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private final lifecycleAwareLazy f49136f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0014\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0002\u0010\u0007*\u00020\bH\n¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"<anonymous>", "VM", "T", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/arch/ExtensionsKt$viewModel$3"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function0<AddFriendsViewModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Function2 $argumentsAcceptor;
        final /* synthetic */ AppCompatActivity $this_viewModel;
        final /* synthetic */ KClass $viewModelClass;
        final /* synthetic */ KClass $viewModelClass$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AppCompatActivity appCompatActivity, KClass kClass, Function2 function2, KClass kClass2) {
            super(0);
            this.$this_viewModel = appCompatActivity;
            this.$viewModelClass = kClass;
            this.$argumentsAcceptor = function2;
            this.$viewModelClass$inlined = kClass2;
        }

        /* JADX WARNING: type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.friends.AddFriendsViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r0v7, types: [com.ss.android.ugc.aweme.friends.AddFriendsViewModel, com.bytedance.jedi.arch.JediViewModel] */
        @NotNull
        public final AddFriendsViewModel invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47022, new Class[0], JediViewModel.class)) {
                return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47022, new Class[0], JediViewModel.class);
            }
            ViewModelProvider of = ViewModelProviders.of(this.$this_viewModel, ((ae) this.$this_viewModel).r_());
            String name = kotlin.jvm.a.a(this.$viewModelClass$inlined).getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
            ? r0 = (JediViewModel) of.get(name, kotlin.jvm.a.a(this.$viewModelClass));
            n a2 = r0.f2282c.a(AddFriendsViewModel.class);
            if (a2 != null) {
                Intrinsics.checkExpressionValueIsNotNull(r0, "this");
                a2.binding(r0);
            }
            r0.a(new Function1<AddFriendsState, AddFriendsState>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ a this$0;

                {
                    this.this$0 = r1;
                }

                /* JADX WARNING: type inference failed for: r0v6, types: [com.bytedance.jedi.arch.x, com.ss.android.ugc.aweme.friends.AddFriendsState] */
                /* JADX WARNING: type inference failed for: r0v9, types: [com.bytedance.jedi.arch.x, com.ss.android.ugc.aweme.friends.AddFriendsState] */
                @NotNull
                public final AddFriendsState invoke(@NotNull AddFriendsState addFriendsState) {
                    if (PatchProxy.isSupport(new Object[]{addFriendsState}, this, changeQuickRedirect, false, 47023, new Class[]{x.class}, x.class)) {
                        return (x) PatchProxy.accessDispatch(new Object[]{addFriendsState}, this, changeQuickRedirect, false, 47023, new Class[]{x.class}, x.class);
                    }
                    Intrinsics.checkParameterIsNotNull(addFriendsState, "$this$initialize");
                    Function2 function2 = this.this$0.$argumentsAcceptor;
                    Intent intent = this.this$0.$this_viewModel.getIntent();
                    Intrinsics.checkExpressionValueIsNotNull(intent, "this@viewModel.intent");
                    return (x) function2.invoke(addFriendsState, intent.getExtras());
                }
            });
            return r0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/ui/AddFriendsActivity$Companion;", "", "()V", "FRIENDS_FRAGMENT_TAG", "", "startActivity", "", "context", "Landroid/content/Context;", "enterFrom", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/friends/AddFriendsState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<AddFriendsState, Unit> {
        public static final c INSTANCE = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AddFriendsState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull AddFriendsState addFriendsState) {
            AddFriendsState addFriendsState2 = addFriendsState;
            int i = 1;
            if (PatchProxy.isSupport(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 47025, new Class[]{AddFriendsState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 47025, new Class[]{AddFriendsState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(addFriendsState2, AdvanceSetting.NETWORK_TYPE);
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
            if (addFriendsState.getEventActionUpCount() <= 1 && (addFriendsState.getEventActionUpCount() != 1 || addFriendsState.getClickBackBtn())) {
                i = 0;
            }
            r.a("exit_find_friends_list", (Map) a2.a("action_flag", i).f34114b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/AddFriendsState;", "it", "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function2<AddFriendsState, Bundle, AddFriendsState> {
        public static final d INSTANCE = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
            super(2);
        }

        @NotNull
        public final AddFriendsState invoke(@NotNull AddFriendsState addFriendsState, @Nullable Bundle bundle) {
            AddFriendsState addFriendsState2 = addFriendsState;
            if (PatchProxy.isSupport(new Object[]{addFriendsState2, bundle}, this, changeQuickRedirect, false, 47026, new Class[]{AddFriendsState.class, Bundle.class}, AddFriendsState.class)) {
                return (AddFriendsState) PatchProxy.accessDispatch(new Object[]{addFriendsState2, bundle}, this, changeQuickRedirect, false, 47026, new Class[]{AddFriendsState.class, Bundle.class}, AddFriendsState.class);
            }
            Intrinsics.checkParameterIsNotNull(addFriendsState2, "$receiver");
            SharePrefCache inst = SharePrefCache.inst();
            Intrinsics.checkExpressionValueIsNotNull(inst, "SharePrefCache.inst()");
            an enableFace2Face = inst.getEnableFace2Face();
            Intrinsics.checkExpressionValueIsNotNull(enableFace2Face, "SharePrefCache.inst().enableFace2Face");
            Object c2 = enableFace2Face.c();
            Intrinsics.checkExpressionValueIsNotNull(c2, "SharePrefCache.inst().enableFace2Face.cache");
            return AddFriendsState.copy$default(addFriendsState, true, false, false, false, 0, false, 0, ((Boolean) c2).booleanValue(), 126, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/friends/AddFriendsState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function1<AddFriendsState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ AddFriendsActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AddFriendsActivity addFriendsActivity) {
            super(1);
            this.this$0 = addFriendsActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AddFriendsState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull AddFriendsState addFriendsState) {
            if (PatchProxy.isSupport(new Object[]{addFriendsState}, this, changeQuickRedirect, false, 47027, new Class[]{AddFriendsState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{addFriendsState}, this, changeQuickRedirect, false, 47027, new Class[]{AddFriendsState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(addFriendsState, AdvanceSetting.NETWORK_TYPE);
            if (addFriendsState.isSearching()) {
                this.this$0.g().a(false);
            } else {
                AddFriendsActivity.super.onBackPressed();
            }
        }
    }

    public final AddFriendsViewModel g() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f49133c, false, 47006, new Class[0], AddFriendsViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f49133c, false, 47006, new Class[0], AddFriendsViewModel.class);
        } else {
            value = this.f49136f.getValue();
        }
        return (AddFriendsViewModel) value;
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f49133c, false, 47020, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49133c, false, 47020, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.AddFriendsActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.AddFriendsActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f49133c, false, 47021, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f49133c, false, 47021, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.AddFriendsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public AddFriendsActivity() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AddFriendsViewModel.class);
        this.f49136f = new lifecycleAwareLazy(this, new a(this, orCreateKotlinClass, d.INSTANCE, orCreateKotlinClass));
    }

    public final void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f49133c, false, 47011, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49133c, false, 47011, new Class[0], Void.TYPE);
            return;
        }
        a(g(), new e(this));
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f49133c, false, 47013, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49133c, false, 47013, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
    }

    public final void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f49133c, false, 47012, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49133c, false, 47012, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        k.a().d();
    }

    public final void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f49133c, false, 47010, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49133c, false, 47010, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
    }

    public final void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f49133c, false, 47015, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49133c, false, 47015, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        com.ss.android.ugc.aweme.base.activity.c.b(this, 0);
        if (getIntent().getIntExtra("bundle_recommend_user_type", -1) == 1) {
            a(g(), c.INSTANCE);
        }
    }

    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f49133c, false, 47014, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f49133c, false, 47014, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (motionEvent != null && motionEvent.getAction() == 1) {
            AddFriendsViewModel g = g();
            if (PatchProxy.isSupport(new Object[0], g, AddFriendsViewModel.f48668d, false, 46199, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], g, AddFriendsViewModel.f48668d, false, 46199, new Class[0], Void.TYPE);
            } else {
                g.c(AddFriendsViewModel.a.INSTANCE);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void onCreate(@Nullable Bundle bundle) {
        Bundle bundle2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f49133c, false, 47007, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f49133c, false, 47007, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.AddFriendsActivity", "onCreate", true);
        super.onCreate(bundle);
        com.ss.android.ugc.aweme.base.activity.c.a(this, 0);
        setTheme(C0906R.style.m);
        getWindow().setSoftInputMode(2);
        setContentView((int) C0906R.layout.bn);
        if (PatchProxy.isSupport(new Object[0], this, f49133c, false, 47008, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49133c, false, 47008, new Class[0], Void.TYPE);
        } else {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("friends_fragment_tag");
            if (findFragmentByTag == null) {
                findFragmentByTag = new FriendsFragment();
                FriendsFragment friendsFragment = (FriendsFragment) findFragmentByTag;
                Intent intent = getIntent();
                Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
                if (intent.getExtras() == null) {
                    bundle2 = new Bundle();
                } else {
                    Intent intent2 = getIntent();
                    Intrinsics.checkExpressionValueIsNotNull(intent2, "intent");
                    bundle2 = new Bundle(intent2.getExtras());
                }
                friendsFragment.setArguments(bundle2);
            }
            beginTransaction.replace(C0906R.id.y9, findFragmentByTag, "friends_fragment_tag");
            beginTransaction.commit();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.AddFriendsActivity", "onCreate", false);
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f49133c, false, 47009, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f49133c, false, 47009, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRequestPermissionsResult(int r21, @org.jetbrains.annotations.NotNull java.lang.String[] r22, @org.jetbrains.annotations.NotNull int[] r23) {
        /*
            r20 = this;
            r0 = r22
            r1 = r23
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
            r10 = 0
            r3[r10] = r4
            r11 = 1
            r3[r11] = r0
            r12 = 2
            r3[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f49133c
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r10] = r4
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r11] = r4
            java.lang.Class<int[]> r4 = int[].class
            r8[r12] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 47016(0xb7a8, float:6.5883E-41)
            r4 = r20
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x005d
            java.lang.Object[] r13 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            r13[r10] = r3
            r13[r11] = r0
            r13[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r15 = f49133c
            r16 = 0
            r17 = 47016(0xb7a8, float:6.5883E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r11] = r1
            java.lang.Class<int[]> r1 = int[].class
            r0[r12] = r1
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r20
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x005d:
            java.lang.String r2 = "permissions"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
            java.lang.String r2 = "grantResults"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
            r3 = r20
            android.app.Activity r3 = (android.app.Activity) r3
            r4 = r21
            com.ss.android.ugc.aweme.utils.permission.a.a((android.app.Activity) r3, (int) r4, (java.lang.String[]) r0, (int[]) r1)
            super.onRequestPermissionsResult(r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.ui.AddFriendsActivity.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }
}
