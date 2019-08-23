package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.frameworks.plugin.pm.c;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.player.b;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.bh;
import com.ss.ttvideoengine.TTVideoEngine;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public class PlayerInitTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public f type() {
        return f.BOOT_FINISH;
    }

    public void run(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55289, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55289, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.a("PlayerInitTask");
        if (PatchProxy.isSupport(new Object[0], null, b.f59105a, true, 64193, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, b.f59105a, true, 64193, new Class[0], Void.TYPE);
            return;
        }
        if (AbTestManager.a().d().isTTPlayerPluginEnabled) {
            b.a(d.a());
            IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
            if (iPluginService != null) {
                iPluginService.check(d.a(), "start_player_plugin", "com.ss.android.ugc.aweme.player_pluginv3", false, new IPluginService.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f59108a;

                    public final void b(String str) {
                        String str2 = str;
                        if (PatchProxy.isSupport(new Object[]{str2}, this, f59108a, false, 64197, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str2}, this, f59108a, false, 64197, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        JSONObject b2 = bh.a().a("errorCode", (Integer) 1).a("packageName", str2).b();
                        n.a("player_pluginv3", "player_pluginv3", b2);
                        r.a("player_plugin_status", b2);
                    }

                    public final void a(String str) {
                        boolean z;
                        boolean z2;
                        String str2 = str;
                        int i = 1;
                        if (PatchProxy.isSupport(new Object[]{str2}, this, f59108a, false, 64196, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str2}, this, f59108a, false, 64196, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        boolean a2 = com.ss.android.ugc.aweme.plugin.g.b.a("com.ss.android.ugc.aweme.player_pluginv3");
                        boolean b2 = c.b("com.ss.android.ugc.aweme.player_pluginv3");
                        if (PatchProxy.isSupport(new Object[0], null, b.f59105a, true, 64191, new Class[0], Boolean.TYPE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, b.f59105a, true, 64191, new Class[0], Boolean.TYPE)).booleanValue();
                        } else {
                            if (AbTestManager.a().d().isTTPlayerPluginEnabled) {
                                if (PatchProxy.isSupport(new Object[0], null, b.f59105a, true, 64192, new Class[0], Boolean.TYPE)) {
                                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, b.f59105a, true, 64192, new Class[0], Boolean.TYPE)).booleanValue();
                                } else {
                                    z2 = com.ss.android.ugc.aweme.plugin.g.b.a("com.ss.android.ugc.aweme.player_pluginv3");
                                }
                                if (z2) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        if (z) {
                            TTVideoEngine.setForceUsePluginPlayer(true);
                            b.f59106b = true;
                        } else {
                            TTVideoEngine.setForceUsePluginPlayer(false);
                            b.f59106b = false;
                        }
                        bh a3 = bh.a().a("errorCode", (Integer) 0);
                        if (!z) {
                            i = 0;
                        }
                        JSONObject b3 = a3.a("usePlugin", Integer.valueOf(i)).a("packageName", str2).a("installed", Boolean.valueOf(a2)).a("pInstalled", Boolean.valueOf(b2)).b();
                        n.a("player_pluginv3", "player_pluginv3", b3);
                        r.a("player_plugin_status", b3);
                    }
                });
            }
        }
    }
}
