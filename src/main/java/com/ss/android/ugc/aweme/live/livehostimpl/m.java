package com.ss.android.ugc.aweme.live.livehostimpl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdkapi.host.i;
import com.bytedance.android.livesdkapi.j.a;
import com.bytedance.common.utility.tools.SafelyLibraryLoader;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.plugin.d.f;
import org.json.JSONObject;

public final class m implements i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53456a;

    public m() {
        b.a(i.class, this);
    }

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f53456a, false, 55817, new Class[0], String.class)) {
            return GlobalContext.getContext().getPackageName();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f53456a, false, 55817, new Class[0], String.class);
    }

    public final boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f53456a, false, 55814, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f53456a, false, 55814, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
        if (iPluginService != null && iPluginService.needUpgradePlugin(d.a(), str2)) {
            return false;
        }
        if (!TextUtils.equals(str2, a.LiveResource.getPackageName()) || com.ss.android.ugc.aweme.plugin.g.b.b(str) >= 4) {
            return true;
        }
        return false;
    }

    public final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f53456a, false, 55815, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f53456a, false, 55815, new Class[]{String.class}, Void.TYPE);
            return;
        }
        IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
        if (iPluginService != null) {
            iPluginService.preload(str2);
        }
    }

    @SuppressLint({"AnonymousInnerClass"})
    public final void a(Context context, @NonNull a aVar, String str, i.a aVar2) {
        final i.a aVar3 = aVar2;
        if (PatchProxy.isSupport(new Object[]{context, aVar, str, aVar3}, this, f53456a, false, 55813, new Class[]{Context.class, a.class, String.class, i.a.class}, Void.TYPE)) {
            Object[] objArr = {context, aVar, str, aVar3};
            PatchProxy.accessDispatch(objArr, this, f53456a, false, 55813, new Class[]{Context.class, a.class, String.class, i.a.class}, Void.TYPE);
            return;
        }
        IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
        if (iPluginService != null) {
            aVar.getType();
            iPluginService.check(context, null, aVar.getPackageName(), true, new IPluginService.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f53457a;

                public final void a(String str) {
                    String str2 = str;
                    if (PatchProxy.isSupport(new Object[]{str2}, this, f53457a, false, 55818, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str2}, this, f53457a, false, 55818, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    aVar3.a(str2);
                }

                public final void b(String str) {
                    String str2 = str;
                    if (PatchProxy.isSupport(new Object[]{str2}, this, f53457a, false, 55819, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str2}, this, f53457a, false, 55819, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    aVar3.b(str2);
                }
            });
        }
    }

    public final boolean a(int i, Context context, @Nullable String str, String str2, ClassLoader classLoader) {
        JSONObject jSONObject;
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), context2, str3, str4, classLoader}, this, f53456a, false, 55816, new Class[]{Integer.TYPE, Context.class, String.class, String.class, ClassLoader.class}, Boolean.TYPE)) {
            Object[] objArr = {Integer.valueOf(i), context2, str3, str4, classLoader};
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, f53456a, false, 55816, new Class[]{Integer.TYPE, Context.class, String.class, String.class, ClassLoader.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            if (!com.ss.android.g.a.a()) {
                if (i != 1) {
                    return f.a(str, str2);
                }
            }
            return SafelyLibraryLoader.loadLibrary(context2, str4);
        } catch (Throwable unused) {
        }
        MonitorUtils.monitorStatusRate("plugin_bug_track", 1, jSONObject);
        return false;
    }
}
