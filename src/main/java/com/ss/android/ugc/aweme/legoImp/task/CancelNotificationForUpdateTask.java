package com.ss.android.ugc.aweme.legoImp.task;

import android.app.NotificationManager;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import org.jetbrains.annotations.NotNull;

public class CancelNotificationForUpdateTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;
    private NotificationManager notificationManager;

    @NotNull
    public f type() {
        return f.BACKGROUND;
    }

    public CancelNotificationForUpdateTask(NotificationManager notificationManager2) {
        this.notificationManager = notificationManager2;
    }

    public void run(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55244, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55244, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.a("CancelNotificationForUpdateTask");
        try {
            this.notificationManager.cancel(C0906R.id.cu6);
        } catch (Exception unused) {
        }
    }
}
