package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.q.d;
import org.jetbrains.annotations.NotNull;

public class SettingsReaderInitTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public f type() {
        return f.BACKGROUND;
    }

    public void run(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55304, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55304, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.a("SettingsReaderInitTask");
        SettingsManagerProxy inst = SettingsManagerProxy.inst();
        if (PatchProxy.isSupport(new Object[]{inst, (byte) 0}, null, g.f49550a, true, 47582, new Class[]{g.a.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inst, (byte) 0}, null, g.f49550a, true, 47582, new Class[]{g.a.class, Boolean.TYPE}, Void.TYPE);
        } else {
            synchronized (g.f49551b) {
                g a2 = g.a();
                a2.f49555d = false;
                if (inst == null) {
                    throw new IllegalStateException("iesSettingsProxyWrap is null!");
                } else if (a2.f49554c == null) {
                    a2.f49554c = inst;
                    g.f49551b.notifyAll();
                } else if (g.a().f49555d) {
                    throw new IllegalStateException("duplicate init be found in {@link SettingsReader}");
                }
            }
        }
        SettingsManagerProxy.inst().registerSettingsWatcher(d.f63308b, false);
    }
}
