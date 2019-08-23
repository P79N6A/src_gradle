package com.ss.android.ugc.aweme.miniapp.d;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.e.d;
import com.ss.android.ugc.aweme.miniapp.h;
import com.ss.android.ugc.aweme.miniapp.j;
import com.ss.android.ugc.aweme.miniapp.views.a;
import com.tt.miniapphost.AppbrandApplication;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.permission.AppbrandPermissionType;
import com.tt.miniapphost.permission.IPermissionsResultAction;
import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.option.ui.AbstractHostOptionUiDepend;

public final class i extends AbstractHostOptionUiDepend {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55684a;

    /* renamed from: b  reason: collision with root package name */
    private d f55685b;

    public final void hideToast() {
        if (PatchProxy.isSupport(new Object[0], this, f55684a, false, 59394, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55684a, false, 59394, new Class[0], Void.TYPE);
            return;
        }
        if (this.f55685b != null) {
            this.f55685b.d();
            this.f55685b = null;
        }
    }

    @Nullable
    @AnyProcess
    public final Dialog showPermissionDialog(@NonNull Activity activity, @NonNull AppbrandPermissionType appbrandPermissionType, @NonNull String str, @NonNull IPermissionsResultAction iPermissionsResultAction) {
        Activity activity2 = activity;
        String str2 = str;
        IPermissionsResultAction iPermissionsResultAction2 = iPermissionsResultAction;
        if (PatchProxy.isSupport(new Object[]{activity2, appbrandPermissionType, str2, iPermissionsResultAction2}, this, f55684a, false, 59395, new Class[]{Activity.class, AppbrandPermissionType.class, String.class, IPermissionsResultAction.class}, Dialog.class)) {
            Object[] objArr = {activity2, appbrandPermissionType, str2, iPermissionsResultAction2};
            return (Dialog) PatchProxy.accessDispatch(objArr, this, f55684a, false, 59395, new Class[]{Activity.class, AppbrandPermissionType.class, String.class, IPermissionsResultAction.class}, Dialog.class);
        }
        if (PatchProxy.isSupport(new Object[]{activity2, str2, iPermissionsResultAction2}, null, h.f55769a, true, 59021, new Class[]{Activity.class, String.class, IPermissionsResultAction.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{activity2, str2, iPermissionsResultAction2}, null, h.f55769a, true, 59021, new Class[]{Activity.class, String.class, IPermissionsResultAction.class}, Dialog.class);
        }
        a.C0641a a2 = new a.C0641a().a(activity2.getString(C0906R.string.a79), a.b.f55958d);
        String string = activity2.getString(C0906R.string.aj3, new Object[]{AppbrandApplication.getInst().getAppInfo().appName});
        a.b bVar = a.b.f55958d;
        a2.f55954c = string;
        a2.k = bVar;
        a.C0641a d2 = a2.b(str2, a.b.f55958d).c(activity2.getString(C0906R.string.byq), a.b.f55958d).d(activity2.getString(C0906R.string.b7e), a.b.f55958d);
        d2.f55957f = AppbrandApplication.getInst().getAppInfo().icon;
        a a3 = d2.a((Context) activity2);
        a3.b(new com.ss.android.ugc.aweme.miniapp.i(iPermissionsResultAction2, str2, a3));
        a3.a(new j(iPermissionsResultAction2, a3));
        a3.setCancelable(false);
        return a3;
    }

    public final void showToast(@NonNull Context context, @Nullable String str, @Nullable String str2, long j, @Nullable String str3) {
        String str4 = str2;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context, str, str4, new Long(j2), str3}, this, f55684a, false, 59393, new Class[]{Context.class, String.class, String.class, Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str4, new Long(j2), str3}, this, f55684a, false, 59393, new Class[]{Context.class, String.class, String.class, Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        Activity currentActivity = AppbrandContext.getInst().getCurrentActivity();
        hideToast();
        if (currentActivity != null) {
            this.f55685b = new d(currentActivity);
            this.f55685b.a(str4, (int) j2, 17);
        }
    }
}
