package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.net.cronet.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.requesttask.b.b;
import com.ss.android.ugc.aweme.requesttask.b.d;
import com.ss.android.ugc.aweme.requesttask.idle.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/legoImp/task/FetchCombineSettingsTask;", "Lcom/ss/android/ugc/aweme/lego/LegoTask;", "()V", "run", "", "context", "Landroid/content/Context;", "type", "Lcom/ss/android/ugc/aweme/lego/WorkType;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FetchCombineSettingsTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public final f type() {
        return f.BOOT_FINISH;
    }

    public final void run(@NotNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 55259, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 55259, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        if (c.a(context)) {
            a.a("FetchCombineSettingsTask");
            if (com.ss.android.ugc.aweme.requestcombine.a.f63567e.a()) {
                com.ss.android.ugc.aweme.lego.a.i.d().a(new d()).a();
                return;
            }
            com.ss.android.ugc.aweme.lego.a.i.d().a(new com.ss.android.ugc.aweme.requesttask.b.c()).a(new b()).a(new g()).a(new com.ss.android.ugc.aweme.requesttask.a.d(1)).a(new com.ss.android.ugc.aweme.requesttask.a.b()).a();
        }
    }
}
