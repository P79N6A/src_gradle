package com.ss.android.ugc.aweme.live.livehostimpl;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdkapi.host.d;
import com.bytedance.common.utility.android.ManifestData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.newmedia.e;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.framework.core.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.y;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.effectmanager.h;
import java.util.Locale;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53425a;

    /* renamed from: b  reason: collision with root package name */
    private h f53426b;

    public final String h() {
        return "aweme";
    }

    public b() {
        com.bytedance.android.live.utility.b.a(d.class, this);
    }

    public final Context a() {
        if (!PatchProxy.isSupport(new Object[0], this, f53425a, false, 55708, new Class[0], Context.class)) {
            return GlobalContext.getContext();
        }
        return (Context) PatchProxy.accessDispatch(new Object[0], this, f53425a, false, 55708, new Class[0], Context.class);
    }

    public final String b() {
        if (!PatchProxy.isSupport(new Object[0], this, f53425a, false, 55709, new Class[0], String.class)) {
            return String.valueOf(e.c(a(), a().getPackageName()));
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f53425a, false, 55709, new Class[0], String.class);
    }

    public final String c() {
        if (!PatchProxy.isSupport(new Object[0], this, f53425a, false, 55710, new Class[0], String.class)) {
            return a.b().f3304b;
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f53425a, false, 55710, new Class[0], String.class);
    }

    public final String d() {
        if (!PatchProxy.isSupport(new Object[0], this, f53425a, false, 55711, new Class[0], String.class)) {
            return com.ss.android.d.d.b();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f53425a, false, 55711, new Class[0], String.class);
    }

    public final String e() {
        if (!PatchProxy.isSupport(new Object[0], this, f53425a, false, 55712, new Class[0], String.class)) {
            return GlobalContext.getContext().getPackageName();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f53425a, false, 55712, new Class[0], String.class);
    }

    public final boolean f() {
        if (!PatchProxy.isSupport(new Object[0], this, f53425a, false, 55713, new Class[0], Boolean.TYPE)) {
            return TextUtils.equals(c(), "local_test");
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f53425a, false, 55713, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final int g() {
        if (PatchProxy.isSupport(new Object[0], this, f53425a, false, 55715, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f53425a, false, 55715, new Class[0], Integer.TYPE)).intValue();
        }
        try {
            return ManifestData.getInt(a(), "UPDATE_VERSION_CODE");
        } catch (Exception unused) {
            return 0;
        }
    }

    public final com.bef.effectsdk.b j() {
        if (!PatchProxy.isSupport(new Object[0], this, f53425a, false, 55717, new Class[0], com.bef.effectsdk.b.class)) {
            return ((IAVService) ServiceManager.get().getService(IAVService.class)).provideResourceFinder();
        }
        return (com.bef.effectsdk.b) PatchProxy.accessDispatch(new Object[0], this, f53425a, false, 55717, new Class[0], com.bef.effectsdk.b.class);
    }

    public final boolean k() {
        if (!PatchProxy.isSupport(new Object[0], this, f53425a, false, 55718, new Class[0], Boolean.TYPE)) {
            return TimeLockRuler.isContentFilterOn();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f53425a, false, 55718, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final h i() {
        if (PatchProxy.isSupport(new Object[0], this, f53425a, false, 55716, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], this, f53425a, false, 55716, new Class[0], h.class);
        }
        if (this.f53426b == null) {
            this.f53426b = ((IAVService) ServiceManager.get().getService(IAVService.class)).effectService().createEffectPlatform(a(), com.ss.android.ugc.aweme.language.e.b(), y.a().b()).f();
        }
        return this.f53426b;
    }

    public final Locale l() {
        if (PatchProxy.isSupport(new Object[0], this, f53425a, false, 55719, new Class[0], Locale.class)) {
            return (Locale) PatchProxy.accessDispatch(new Object[0], this, f53425a, false, 55719, new Class[0], Locale.class);
        } else if (ac.a() == null) {
            return Locale.getDefault();
        } else {
            if (Build.VERSION.SDK_INT >= 24) {
                return ac.a().getConfiguration().getLocales().get(0);
            }
            return ac.a().getConfiguration().locale;
        }
    }
}
