package com.ss.android.ugc.aweme.global.config.settings;

import a.i;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;
import java.util.concurrent.Callable;

@Keep
public final class SettingsManagerProxy implements g.a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final a commonSettingsWatcher;
    private final e settingManager;

    public @interface SETTINGS_SYNC_FROM {
    }

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SettingsManagerProxy f49522a = new SettingsManagerProxy();
    }

    public static SettingsManagerProxy inst() {
        return a.f49522a;
    }

    @NonNull
    public final a getCommonSettingsWatcher() {
        return this.commonSettingsWatcher;
    }

    public final com.ss.android.ugc.aweme.global.config.settings.pojo.a get() {
        return this.settingManager.f49541d;
    }

    private SettingsManagerProxy() {
        k a2 = k.a();
        if (a2 != null) {
            this.settingManager = new e(a2);
            this.commonSettingsWatcher = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getSettingsWatcher();
            registerSettingsWatcher(this.commonSettingsWatcher, false);
            return;
        }
        throw new NullPointerException("context is null!");
    }

    public final IESSettings getDefaultSettings() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47572, new Class[0], IESSettings.class)) {
            return this.settingManager.f49542e;
        }
        return (IESSettings) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47572, new Class[0], IESSettings.class);
    }

    public final Gson getGson() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47574, new Class[0], Gson.class)) {
            return this.settingManager.f49543f;
        }
        return (Gson) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47574, new Class[0], Gson.class);
    }

    public final void registerSettingsWatcher(d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, changeQuickRedirect, false, 47569, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, changeQuickRedirect, false, 47569, new Class[]{d.class}, Void.TYPE);
            return;
        }
        this.settingManager.a(dVar2, true);
    }

    public final void removeSettingsWatcher(d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, changeQuickRedirect, false, 47571, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, changeQuickRedirect, false, 47571, new Class[]{d.class}, Void.TYPE);
            return;
        }
        e eVar = this.settingManager;
        if (PatchProxy.isSupport(new Object[]{dVar2}, eVar, e.f49538a, false, 47560, new Class[]{d.class}, Void.TYPE)) {
            e eVar2 = eVar;
            PatchProxy.accessDispatch(new Object[]{dVar2}, eVar2, e.f49538a, false, 47560, new Class[]{d.class}, Void.TYPE);
            return;
        }
        synchronized (eVar.f49539b) {
            eVar.f49540c.remove(dVar2);
        }
    }

    public final void setCanMock(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 47568, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 47568, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.settingManager.a(z);
    }

    public final void registerSettingsWatcher(d dVar, boolean z) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 47570, new Class[]{d.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 47570, new Class[]{d.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.settingManager.a(dVar2, z);
    }

    /* access modifiers changed from: package-private */
    public final <T> void setMock(String str, Class<T> cls, T t) {
        String str2 = str;
        Class<T> cls2 = cls;
        T t2 = t;
        if (PatchProxy.isSupport(new Object[]{str2, cls2, t2}, this, changeQuickRedirect, false, 47573, new Class[]{String.class, Class.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, cls2, t2}, this, changeQuickRedirect, false, 47573, new Class[]{String.class, Class.class, Object.class}, Void.TYPE);
            return;
        }
        this.settingManager.a(str2, cls2, t2);
    }

    public final void notifySettingsChange(Throwable th, @NonNull IESSettings iESSettings, String str) {
        Throwable th2 = th;
        IESSettings iESSettings2 = iESSettings;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{th2, iESSettings2, str2}, this, changeQuickRedirect, false, 47567, new Class[]{Throwable.class, IESSettings.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2, iESSettings2, str2}, this, changeQuickRedirect, false, 47567, new Class[]{Throwable.class, IESSettings.class, String.class}, Void.TYPE);
            return;
        }
        e eVar = this.settingManager;
        if (PatchProxy.isSupport(new Object[]{th2, iESSettings2, str2}, eVar, e.f49538a, false, 47562, new Class[]{Throwable.class, IESSettings.class, String.class}, Void.TYPE)) {
            e eVar2 = eVar;
            PatchProxy.accessDispatch(new Object[]{th2, iESSettings2, str2}, eVar2, e.f49538a, false, 47562, new Class[]{Throwable.class, IESSettings.class, String.class}, Void.TYPE);
            return;
        }
        if (th2 != null) {
            SettingsUtil.a(th);
        }
        if (!TextUtils.isEmpty(str)) {
            if (PatchProxy.isSupport(new Object[]{th2, iESSettings2, "SettingsManager", str2}, null, SettingsUtil.f49523a, true, 47588, new Class[]{Throwable.class, IESSettings.class, String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2, iESSettings2, "SettingsManager", str2}, null, SettingsUtil.f49523a, true, 47588, new Class[]{Throwable.class, IESSettings.class, String.class, String.class}, Void.TYPE);
            } else {
                i.a((Callable<TResult>) new h<TResult>(str2, th2, "SettingsManager", iESSettings2));
            }
        }
        eVar.a(iESSettings2);
    }
}
