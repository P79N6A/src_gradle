package com.ss.android.ugc.aweme.main.e;

import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.feed.f.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.bm;
import com.ss.android.ugc.aweme.main.bq;
import com.ss.android.ugc.aweme.main.bt;
import com.ss.android.ugc.aweme.main.dialogmanager.b;
import com.ss.android.ugc.aweme.setting.a.d;
import com.ss.android.ugc.aweme.utils.bg;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001%B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0007J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010#\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\nH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00060\rR\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/main/guidemanager/PrivacyDialog;", "Lcom/ss/android/ugc/aweme/main/dialogmanager/IHomeDialog;", "activity", "Landroid/app/Activity;", "useOldStyle", "", "(Landroid/app/Activity;Z)V", "mActivityReference", "Ljava/lang/ref/WeakReference;", "mDismissListener", "Lcom/ss/android/ugc/aweme/main/dialogmanager/IHomeDialog$DialogDismissListener;", "mOnVideoPageChangeEventRequest", "mOnVideoPageChangeEventSubscriber", "Lcom/ss/android/ugc/aweme/main/guidemanager/PrivacyDialog$OnVideoPageChangeEventSubscriber;", "mSafeMainTabPreferences", "Lcom/ss/android/ugc/aweme/main/SafeMainTabPreferences;", "getMSafeMainTabPreferences", "()Lcom/ss/android/ugc/aweme/main/SafeMainTabPreferences;", "setMSafeMainTabPreferences", "(Lcom/ss/android/ugc/aweme/main/SafeMainTabPreferences;)V", "mSettingSyncDoneAndShouldShowPrivacyDialog", "mSettingSyncTimeOutOrPrivacyPolicyDialogHasShowed", "mUseOldStyle", "mainTabPreferences", "Lcom/ss/android/ugc/aweme/main/MainTabPreferences;", "kotlin.jvm.PlatformType", "getMainTabPreferences", "()Lcom/ss/android/ugc/aweme/main/MainTabPreferences;", "getLevel", "", "onSettingSyncDone", "", "event", "Lcom/ss/android/ugc/aweme/setting/event/SettingSyncDone;", "shouldShow", "show", "dismisListener", "OnVideoPageChangeEventSubscriber", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3538a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3539b;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference<Activity> f3540c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public bt f3541d = new bt();

    /* renamed from: e  reason: collision with root package name */
    public final bm f3542e = ((bm) com.ss.android.ugc.aweme.base.sharedpref.c.a((Context) this.f3540c.get(), bm.class));

    /* renamed from: f  reason: collision with root package name */
    private boolean f3543f;
    private boolean g;
    private final boolean h;
    private final a i = new a();
    private b.a j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/main/guidemanager/PrivacyDialog$OnVideoPageChangeEventSubscriber;", "", "(Lcom/ss/android/ugc/aweme/main/guidemanager/PrivacyDialog;)V", "onVideoPageChangeEvent", "", "event", "Lcom/ss/android/ugc/aweme/feed/event/OnVideoPageChangeEvent;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f3544a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/main/guidemanager/PrivacyDialog$OnVideoPageChangeEventSubscriber$onVideoPageChangeEvent$1", "Lcom/ss/android/ugc/aweme/main/dialogmanager/IHomeDialog$DialogDismissListener;", "onDialogDismiss", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.main.e.c$a$a  reason: collision with other inner class name */
        public static final class C0630a implements b.a {
            C0630a() {
            }
        }

        public a() {
        }

        @Subscribe
        public final void onVideoPageChangeEvent(@NotNull ac acVar) {
            if (PatchProxy.isSupport(new Object[]{acVar}, this, f3544a, false, 58123, new Class[]{ac.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{acVar}, this, f3544a, false, 58123, new Class[]{ac.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(acVar, "event");
            c.this.f3539b = true;
            bg.d(this);
            if (acVar.f45277a != null) {
                Aweme aweme = acVar.f45277a;
                Intrinsics.checkExpressionValueIsNotNull(aweme, "event.mAweme");
                if (aweme.getAuthor() != null) {
                    Activity activity = (Activity) c.this.f3540c.get();
                    if (activity != null) {
                        Intrinsics.checkExpressionValueIsNotNull(activity, "mActivityReference.get() ?: return");
                        if (!com.ss.android.ugc.aweme.commercialize.utils.c.Q(acVar.f45277a) && c.this.a(activity)) {
                            c.this.a(activity, new C0630a());
                        }
                    }
                }
            }
        }
    }

    public final int a() {
        if (!this.h) {
            return 25;
        }
        return 150;
    }

    @Subscribe(a = ThreadMode.MAIN, b = true)
    public final void onSettingSyncDone(@NotNull d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f3538a, false, 58122, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f3538a, false, 58122, new Class[]{d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar, "event");
        bg.d(this);
        Activity activity = (Activity) this.f3540c.get();
        if (activity != null) {
            Intrinsics.checkExpressionValueIsNotNull(activity, "mActivityReference.get() ?: return");
            if (bq.a(dVar.f63793a, activity) && !this.f3543f && !this.g) {
                this.g = true;
            }
            if (!activity.isFinishing()) {
                b.a aVar = this.j;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDismissListener");
                }
                a(activity, aVar);
            }
        }
    }

    public final boolean a(@NotNull Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f3538a, false, 58120, new Class[]{Activity.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity}, this, f3538a, false, 58120, new Class[]{Activity.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
        if (!this.f3542e.p(true) || this.f3543f) {
            return false;
        }
        return true;
    }

    public c(@NotNull Activity activity, boolean z) {
        Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
        this.f3540c = new WeakReference<>(activity);
        this.h = z;
        bg.c(this.i);
    }

    public final void a(@NotNull Activity activity, @NotNull b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{activity, aVar}, this, f3538a, false, 58121, new Class[]{Activity.class, b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, aVar}, this, f3538a, false, 58121, new Class[]{Activity.class, b.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(aVar, "dismisListener");
        this.j = aVar;
        if (this.f3542e.p(true) && !this.f3543f) {
            c cVar = this;
            if (cVar.g || !cVar.h || cVar.f3539b) {
                bq bqVar = new bq(activity, !cVar.f3541d.b(true));
                cVar.f3543f = true;
                cVar.f3539b = false;
                bqVar.show();
                return;
            }
            bg.c(cVar);
        }
    }
}
