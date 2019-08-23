package com.ss.android.ugc.aweme.main.e;

import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.d.c;
import com.ss.android.ugc.aweme.main.cb;
import com.ss.android.ugc.aweme.main.dialogmanager.b;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/main/guidemanager/UpLoadBindDialog;", "Lcom/ss/android/ugc/aweme/main/dialogmanager/IHomeDialog;", "()V", "getLevel", "", "shouldShow", "", "activity", "Landroid/app/Activity;", "show", "", "dismisListener", "Lcom/ss/android/ugc/aweme/main/dialogmanager/IHomeDialog$DialogDismissListener;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54732a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54733a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WeakReference f54734b;

        a(WeakReference weakReference) {
            this.f54734b = weakReference;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f54733a, false, 58136, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f54733a, false, 58136, new Class[0], Void.TYPE);
                return;
            }
            Activity activity = (Activity) this.f54734b.get();
            if (activity != null) {
                Intrinsics.checkExpressionValueIsNotNull(activity, "mActivityReference.get() ?: return@postMain");
                if (!activity.isFinishing()) {
                    c.b((Context) activity);
                }
            }
        }
    }

    public final int a() {
        return 270;
    }

    public final boolean a(@NotNull Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, f54732a, false, 58134, new Class[]{Activity.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2}, this, f54732a, false, 58134, new Class[]{Activity.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
        Context context = activity2;
        if (com.ss.android.ugc.aweme.setting.e.a.f63954b.b(context) || com.ss.android.ugc.aweme.setting.e.a.f63954b.a(context) || (!c.a(context) && !cb.a())) {
            return false;
        }
        return true;
    }

    public final void a(@NotNull Activity activity, @NotNull b.a aVar) {
        Activity activity2 = activity;
        b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{activity2, aVar2}, this, f54732a, false, 58135, new Class[]{Activity.class, b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, aVar2}, this, f54732a, false, 58135, new Class[]{Activity.class, b.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(aVar2, "dismisListener");
        if (cb.a()) {
            new cb(activity2).show();
        } else {
            com.ss.android.b.a.a.a.a(new a(new WeakReference(activity2)), (int) TimeUnit.SECONDS.toMillis(3));
        }
    }
}
