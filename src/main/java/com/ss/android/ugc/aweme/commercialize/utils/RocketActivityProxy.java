package com.ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.ies.uikit.base.AppHooks;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\"\u0010\n\u001a\u00020\u0004*\u0004\u0018\u00010\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\fH\u0002¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/RocketActivityProxy;", "", "()V", "onActivityPaused", "", "activity", "Landroid/app/Activity;", "onActivityResumed", "onActivityStart", "onActivityStop", "onRocketActivity", "f", "Lkotlin/Function1;", "ActivityProxy", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RocketActivityProxy {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39620a;

    /* renamed from: b  reason: collision with root package name */
    public static final RocketActivityProxy f39621b = new RocketActivityProxy();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/RocketActivityProxy$ActivityProxy;", "Lcom/bytedance/ies/uikit/base/AbsActivity;", "()V", "proxyPause", "", "activity", "Landroid/app/Activity;", "proxyResume", "proxyStart", "proxyStop", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class ActivityProxy extends AbsActivity {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39622a;

        /* renamed from: b  reason: collision with root package name */
        public static final ActivityProxy f39623b = new ActivityProxy();

        private ActivityProxy() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Landroid/app/Activity;", "Lkotlin/ParameterName;", "name", "activity", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final /* synthetic */ class a extends FunctionReference implements Function1<Activity, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public a(ActivityProxy activityProxy) {
            super(1, activityProxy);
        }

        public final String getName() {
            return "proxyPause";
        }

        public final KDeclarationContainer getOwner() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 32552, new Class[0], KDeclarationContainer.class)) {
                return Reflection.getOrCreateKotlinClass(ActivityProxy.class);
            }
            return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 32552, new Class[0], KDeclarationContainer.class);
        }

        public final String getSignature() {
            return "proxyPause(Landroid/app/Activity;)V";
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Activity) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Activity activity) {
            Activity activity2 = activity;
            if (PatchProxy.isSupport(new Object[]{activity2}, this, changeQuickRedirect, false, 32551, new Class[]{Activity.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2}, this, changeQuickRedirect, false, 32551, new Class[]{Activity.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity2, "p1");
            if (PatchProxy.isSupport(new Object[]{activity2}, null, ActivityProxy.f39622a, true, 32547, new Class[]{Activity.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2}, null, ActivityProxy.f39622a, true, 32547, new Class[]{Activity.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            AppHooks.ActivityLifeCycleHook activityHook = AppHooks.getActivityHook();
            if (activityHook != null) {
                activityHook.onActivityPaused(activity2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Landroid/app/Activity;", "Lkotlin/ParameterName;", "name", "activity", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final /* synthetic */ class b extends FunctionReference implements Function1<Activity, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public b(ActivityProxy activityProxy) {
            super(1, activityProxy);
        }

        public final String getName() {
            return "proxyResume";
        }

        public final KDeclarationContainer getOwner() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 32554, new Class[0], KDeclarationContainer.class)) {
                return Reflection.getOrCreateKotlinClass(ActivityProxy.class);
            }
            return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 32554, new Class[0], KDeclarationContainer.class);
        }

        public final String getSignature() {
            return "proxyResume(Landroid/app/Activity;)V";
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Activity) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Activity activity) {
            Activity activity2 = activity;
            if (PatchProxy.isSupport(new Object[]{activity2}, this, changeQuickRedirect, false, 32553, new Class[]{Activity.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2}, this, changeQuickRedirect, false, 32553, new Class[]{Activity.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity2, "p1");
            if (PatchProxy.isSupport(new Object[]{activity2}, null, ActivityProxy.f39622a, true, 32548, new Class[]{Activity.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2}, null, ActivityProxy.f39622a, true, 32548, new Class[]{Activity.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            AppHooks.ActivityLifeCycleHook activityHook = AppHooks.getActivityHook();
            if (activityHook != null) {
                activityHook.onActivityResumed(activity2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Landroid/app/Activity;", "Lkotlin/ParameterName;", "name", "activity", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final /* synthetic */ class c extends FunctionReference implements Function1<Activity, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public c(ActivityProxy activityProxy) {
            super(1, activityProxy);
        }

        public final String getName() {
            return "proxyStart";
        }

        public final KDeclarationContainer getOwner() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 32556, new Class[0], KDeclarationContainer.class)) {
                return Reflection.getOrCreateKotlinClass(ActivityProxy.class);
            }
            return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 32556, new Class[0], KDeclarationContainer.class);
        }

        public final String getSignature() {
            return "proxyStart(Landroid/app/Activity;)V";
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Activity) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Activity activity) {
            Activity activity2 = activity;
            if (PatchProxy.isSupport(new Object[]{activity2}, this, changeQuickRedirect, false, 32555, new Class[]{Activity.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2}, this, changeQuickRedirect, false, 32555, new Class[]{Activity.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity2, "p1");
            if (PatchProxy.isSupport(new Object[]{activity2}, null, ActivityProxy.f39622a, true, 32549, new Class[]{Activity.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2}, null, ActivityProxy.f39622a, true, 32549, new Class[]{Activity.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            if (AbsActivity.mStartNum == 0) {
                AppHooks.AppBackgroundHook appBackgroundHook = AppHooks.getAppBackgroundHook();
                if (appBackgroundHook != null) {
                    appBackgroundHook.onAppBackgoundSwitch(false);
                }
            }
            AbsActivity.mStartNum++;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Landroid/app/Activity;", "Lkotlin/ParameterName;", "name", "activity", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final /* synthetic */ class d extends FunctionReference implements Function1<Activity, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public d(ActivityProxy activityProxy) {
            super(1, activityProxy);
        }

        public final String getName() {
            return "proxyStop";
        }

        public final KDeclarationContainer getOwner() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 32558, new Class[0], KDeclarationContainer.class)) {
                return Reflection.getOrCreateKotlinClass(ActivityProxy.class);
            }
            return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 32558, new Class[0], KDeclarationContainer.class);
        }

        public final String getSignature() {
            return "proxyStop(Landroid/app/Activity;)V";
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Activity) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Activity activity) {
            Activity activity2 = activity;
            if (PatchProxy.isSupport(new Object[]{activity2}, this, changeQuickRedirect, false, 32557, new Class[]{Activity.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2}, this, changeQuickRedirect, false, 32557, new Class[]{Activity.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity2, "p1");
            if (PatchProxy.isSupport(new Object[]{activity2}, null, ActivityProxy.f39622a, true, 32550, new Class[]{Activity.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2}, null, ActivityProxy.f39622a, true, 32550, new Class[]{Activity.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            int i = AbsActivity.mStartNum - 1;
            AbsActivity.mStartNum = i;
            if (i == 0) {
                AppHooks.AppBackgroundHook appBackgroundHook = AppHooks.getAppBackgroundHook();
                if (appBackgroundHook != null) {
                    appBackgroundHook.onAppBackgoundSwitch(true);
                }
            }
        }
    }

    private RocketActivityProxy() {
    }

    public final void a(@Nullable Activity activity, Function1<? super Activity, Unit> function1) {
        Activity activity2 = activity;
        Function1<? super Activity, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{activity2, function12}, this, f39620a, false, 32546, new Class[]{Activity.class, Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, function12}, this, f39620a, false, 32546, new Class[]{Activity.class, Function1.class}, Void.TYPE);
            return;
        }
        if (!(activity2 instanceof AbsActivity) && activity2 != null) {
            Class<?> cls = activity.getClass();
            if (cls != null) {
                String canonicalName = cls.getCanonicalName();
                if (canonicalName != null && StringsKt.startsWith$default(canonicalName, "com.rocket.", false, 2, null)) {
                    function12.invoke(activity2);
                }
            }
        }
    }
}
