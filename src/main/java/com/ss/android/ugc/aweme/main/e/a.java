package com.ss.android.ugc.aweme.main.e;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.main.dialogmanager.b;
import com.ss.android.ugc.aweme.utils.cy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/main/guidemanager/NotificationDialog;", "Lcom/ss/android/ugc/aweme/main/dialogmanager/IHomeDialog;", "()V", "getLevel", "", "shouldShow", "", "activity", "Landroid/app/Activity;", "show", "", "dismisListener", "Lcom/ss/android/ugc/aweme/main/dialogmanager/IHomeDialog$DialogDismissListener;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54724a;

    public final int a() {
        return 350;
    }

    public final boolean a(@NotNull Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, f54724a, false, 58115, new Class[]{Activity.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2}, this, f54724a, false, 58115, new Class[]{Activity.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
        return cy.a(activity2, false);
    }

    public final void a(@NotNull Activity activity, @NotNull b.a aVar) {
        Activity activity2 = activity;
        b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{activity2, aVar2}, this, f54724a, false, 58116, new Class[]{Activity.class, b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, aVar2}, this, f54724a, false, 58116, new Class[]{Activity.class, b.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(aVar2, "dismisListener");
        cy.b(activity2, false);
    }
}