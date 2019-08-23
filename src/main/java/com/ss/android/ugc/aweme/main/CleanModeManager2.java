package com.ss.android.ugc.aweme.main;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/main/CleanModeManager2;", "Landroid/arch/lifecycle/ViewModel;", "()V", "durationTime", "", "getDurationTime", "()J", "setDurationTime", "(J)V", "isEnable", "", "()Z", "setEnable", "(Z)V", "mData", "Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CleanModeManager2 extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54119a;

    /* renamed from: e  reason: collision with root package name */
    public static final a f54120e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final b<Boolean> f54121b = new b<>();

    /* renamed from: c  reason: collision with root package name */
    public long f54122c = 200;

    /* renamed from: d  reason: collision with root package name */
    public boolean f54123d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\nH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0014H\u0007J\u0012\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0014H\u0007J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u000bH\u0007¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/main/CleanModeManager2$Companion;", "", "()V", "addCleanModeListener", "", "context", "Landroid/support/v4/app/FragmentActivity;", "owner", "Landroid/arch/lifecycle/LifecycleOwner;", "listener", "Lkotlin/Function1;", "", "from", "Lcom/ss/android/ugc/aweme/main/CleanModeManager2;", "view", "Landroid/view/View;", "getCurrentChangeLiveData", "Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;", "getManager", "isEnable", "Landroid/content/Context;", "isInCleanMode", "setCleanMode", "cleanMode", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54124a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "isCleanMode", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.main.CleanModeManager2$a$a  reason: collision with other inner class name */
        public static final class C0627a<T> implements Observer<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54125a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Function1 f54126b;

            public C0627a(Function1 function1) {
                this.f54126b = function1;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                Boolean bool = (Boolean) obj;
                if (PatchProxy.isSupport(new Object[]{bool}, this, f54125a, false, 57033, new Class[]{Boolean.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bool}, this, f54125a, false, 57033, new Class[]{Boolean.class}, Void.TYPE);
                } else if (bool != null) {
                    this.f54126b.invoke(bool);
                }
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final b<Boolean> a(FragmentActivity fragmentActivity) {
            FragmentActivity fragmentActivity2 = fragmentActivity;
            if (!PatchProxy.isSupport(new Object[]{fragmentActivity2}, this, f54124a, false, 57026, new Class[]{FragmentActivity.class}, b.class)) {
                return b(fragmentActivity2).f54121b;
            }
            return (b) PatchProxy.accessDispatch(new Object[]{fragmentActivity2}, this, f54124a, false, 57026, new Class[]{FragmentActivity.class}, b.class);
        }

        @JvmStatic
        @NotNull
        public final CleanModeManager2 b(@NotNull FragmentActivity fragmentActivity) {
            FragmentActivity fragmentActivity2 = fragmentActivity;
            if (PatchProxy.isSupport(new Object[]{fragmentActivity2}, this, f54124a, false, 57029, new Class[]{FragmentActivity.class}, CleanModeManager2.class)) {
                return (CleanModeManager2) PatchProxy.accessDispatch(new Object[]{fragmentActivity2}, this, f54124a, false, 57029, new Class[]{FragmentActivity.class}, CleanModeManager2.class);
            }
            Intrinsics.checkParameterIsNotNull(fragmentActivity2, "context");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(CleanModeManager2.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders\n     …ModeManager2::class.java)");
            return (CleanModeManager2) viewModel;
        }

        @JvmStatic
        public final boolean a(@Nullable Context context) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2}, this, f54124a, false, 57031, new Class[]{Context.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, this, f54124a, false, 57031, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
            } else if (context2 instanceof FragmentActivity) {
                return b((FragmentActivity) context2).f54123d;
            } else {
                return false;
            }
        }

        @JvmStatic
        public final boolean b(@Nullable Context context) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2}, this, f54124a, false, 57032, new Class[]{Context.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, this, f54124a, false, 57032, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
            } else if (!(context2 instanceof FragmentActivity)) {
                return false;
            } else {
                Boolean bool = (Boolean) a((FragmentActivity) context2).getValue();
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            }
        }
    }

    @JvmStatic
    public static final boolean a(@Nullable Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f54119a, true, 57024, new Class[]{Context.class}, Boolean.TYPE)) {
            return f54120e.a(context2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f54119a, true, 57024, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
    }

    @JvmStatic
    public static final boolean b(@Nullable Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f54119a, true, 57025, new Class[]{Context.class}, Boolean.TYPE)) {
            return f54120e.b(context2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f54119a, true, 57025, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
    }
}
