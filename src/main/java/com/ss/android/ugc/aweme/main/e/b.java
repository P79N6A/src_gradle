package com.ss.android.ugc.aweme.main.e;

import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.sharedpref.c;
import com.ss.android.ugc.aweme.main.bm;
import com.ss.android.ugc.aweme.main.dialogmanager.b;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.permission.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/main/guidemanager/PermissionDialog;", "Lcom/ss/android/ugc/aweme/main/dialogmanager/IHomeDialog;", "useOldStyle", "", "(Z)V", "mUseOldStyle", "getLevel", "", "shouldShow", "activity", "Landroid/app/Activity;", "show", "", "dismisListener", "Lcom/ss/android/ugc/aweme/main/dialogmanager/IHomeDialog$DialogDismissListener;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements com.ss.android.ugc.aweme.main.dialogmanager.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54725a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f54726b;

    public final int a() {
        if (!this.f54726b) {
            return 150;
        }
        return 25;
    }

    public b(boolean z) {
        this.f54726b = z;
    }

    public final boolean a(@NotNull Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, f54725a, false, 58117, new Class[]{Activity.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2}, this, f54725a, false, 58117, new Class[]{Activity.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
        Context context = activity2;
        bm bmVar = (bm) c.a(context, bm.class);
        if (f.d(context) == 0 || bmVar.a()) {
            return false;
        }
        return true;
    }

    public final void a(@NotNull Activity activity, @NotNull b.a aVar) {
        Activity activity2 = activity;
        b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{activity2, aVar2}, this, f54725a, false, 58118, new Class[]{Activity.class, b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, aVar2}, this, f54725a, false, 58118, new Class[]{Activity.class, b.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(aVar2, "dismisListener");
        bg.b(new com.ss.android.ugc.aweme.main.dialogmanager.c());
    }
}
