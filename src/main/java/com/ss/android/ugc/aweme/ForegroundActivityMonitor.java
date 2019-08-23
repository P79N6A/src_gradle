package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.annotation.Retention;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\n\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0007J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0007J\u0012\u0010\u0012\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0007J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/ForegroundActivityMonitor;", "", "()V", "CHECK_FOREGROUND", "", "CHECK_NOT_ACTIVITY", "CHECK_NOT_FOREGROUND", "activities", "Ljava/util/LinkedList;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "checkForeground", "context", "Landroid/content/Context;", "getTopActivity", "onActivityPaused", "", "activity", "onActivityResumed", "remove", "CheckResult", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ForegroundActivityMonitor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31557a;

    /* renamed from: b  reason: collision with root package name */
    static final LinkedList<WeakReference<Activity>> f31558b = new LinkedList<>();

    /* renamed from: c  reason: collision with root package name */
    public static final ForegroundActivityMonitor f31559c = new ForegroundActivityMonitor();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/ugc/aweme/ForegroundActivityMonitor$CheckResult;", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    @Retention
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface CheckResult {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function1<WeakReference<Activity>, Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Activity $activity;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((WeakReference) obj));
        }

        public final boolean invoke(@NotNull WeakReference<Activity> weakReference) {
            WeakReference<Activity> weakReference2 = weakReference;
            if (PatchProxy.isSupport(new Object[]{weakReference2}, this, changeQuickRedirect, false, 19462, new Class[]{WeakReference.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{weakReference2}, this, changeQuickRedirect, false, 19462, new Class[]{WeakReference.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(weakReference2, AdvanceSetting.NETWORK_TYPE);
            Activity activity = (Activity) weakReference.get();
            if (activity != null) {
                if (Intrinsics.areEqual((Object) activity, (Object) this.$activity)) {
                    return true;
                }
                return false;
            }
            return true;
        }
    }

    private ForegroundActivityMonitor() {
    }

    /* access modifiers changed from: package-private */
    public final void a(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, f31557a, false, 19461, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, f31557a, false, 19461, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        CollectionsKt.removeAll((List<T>) f31558b, (Function1<? super T, Boolean>) new a<Object,Boolean>(activity2));
    }

    @JvmStatic
    public static final int a(@Nullable Context context) {
        Activity activity;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f31557a, true, 19460, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, null, f31557a, true, 19460, new Class[]{Context.class}, Integer.TYPE)).intValue();
        } else if (!(context2 instanceof Activity)) {
            return 1;
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f31557a, true, 19459, new Class[0], Activity.class)) {
                activity = (Activity) PatchProxy.accessDispatch(new Object[0], null, f31557a, true, 19459, new Class[0], Activity.class);
            } else {
                WeakReference weakReference = (WeakReference) CollectionsKt.firstOrNull((List<? extends T>) f31558b);
                if (weakReference != null) {
                    activity = (Activity) weakReference.get();
                } else {
                    activity = null;
                }
            }
            if (!Intrinsics.areEqual((Object) activity, (Object) context2)) {
                return 2;
            }
            return 3;
        }
    }
}
