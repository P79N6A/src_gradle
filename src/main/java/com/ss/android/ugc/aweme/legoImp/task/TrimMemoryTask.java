package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.utils.et;
import org.jetbrains.annotations.NotNull;

public class TrimMemoryTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int level;

    @NotNull
    public f type() {
        return f.BACKGROUND;
    }

    public TrimMemoryTask(int i) {
        this.level = i;
    }

    public void run(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55320, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55320, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.a("TrimMemoryTask");
        et.a(this.level);
    }
}
