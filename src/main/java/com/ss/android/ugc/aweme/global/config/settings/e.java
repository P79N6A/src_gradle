package com.ss.android.ugc.aweme.global.config.settings;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import com.bytedance.ies.b;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.global.config.settings.SettingsUtil;
import com.ss.android.ugc.aweme.global.config.settings._default.AVEnvSettingsGroup;
import com.ss.android.ugc.aweme.global.config.settings._default.LiveEnvSettingsGroup;
import com.ss.android.ugc.aweme.global.config.settings._default.SettingsGroup;
import com.ss.android.ugc.aweme.global.config.settings.d;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;
import com.ss.android.ugc.aweme.global.config.settings.pojo.a;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49538a;

    /* renamed from: b  reason: collision with root package name */
    final Object f49539b = new Object();

    /* renamed from: c  reason: collision with root package name */
    final CopyOnWriteArrayList<d> f49540c = new CopyOnWriteArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public a f49541d;

    /* renamed from: e  reason: collision with root package name */
    final IESSettings f49542e;

    /* renamed from: f  reason: collision with root package name */
    Gson f49543f;
    private final f g = new f();

    e(Application application) {
        IESSettings iESSettings;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add(new AVEnvSettingsGroup());
        copyOnWriteArrayList.add(new SettingsGroup());
        copyOnWriteArrayList.add(new LiveEnvSettingsGroup());
        SettingsUtil.a aVar = new SettingsUtil.a();
        IESSettings a2 = aVar.a(copyOnWriteArrayList);
        if (PatchProxy.isSupport(new Object[]{a2, copyOnWriteArrayList}, this, f49538a, false, 47564, new Class[]{IESSettings.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{a2, copyOnWriteArrayList}, this, f49538a, false, 47564, new Class[]{IESSettings.class, List.class}, Void.TYPE);
        } else {
            this.f49543f = new SettingsUtil.b(a2, copyOnWriteArrayList).f49527b;
        }
        IESSettings iESSettings2 = a2;
        SettingsUtil.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{application, a2}, aVar, SettingsUtil.a.f49525a, false, 47595, new Class[]{Context.class, IESSettings.class}, IESSettings.class)) {
            SettingsUtil.a aVar3 = aVar2;
            iESSettings = (IESSettings) PatchProxy.accessDispatch(new Object[]{application, iESSettings2}, aVar3, SettingsUtil.a.f49525a, false, 47595, new Class[]{Context.class, IESSettings.class}, IESSettings.class);
        } else {
            b bVar = new b(application, IESSettings.ADAPTER, new j(iESSettings2), null, false);
            iESSettings = (IESSettings) bVar.a();
        }
        this.f49542e = iESSettings;
        a(this.f49542e);
    }

    /* access modifiers changed from: package-private */
    public void a(@NonNull IESSettings iESSettings) {
        if (PatchProxy.isSupport(new Object[]{iESSettings}, this, f49538a, false, 47563, new Class[]{IESSettings.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iESSettings}, this, f49538a, false, 47563, new Class[]{IESSettings.class}, Void.TYPE);
            return;
        }
        synchronized (this.f49539b) {
            if (iESSettings == null) {
                try {
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                this.f49541d = new a(iESSettings, this.g);
                Iterator<d> it2 = this.f49540c.iterator();
                while (it2.hasNext()) {
                    d next = it2.next();
                    next.a(this.f49541d);
                    if (next instanceof d.a) {
                        this.f49540c.remove(next);
                    }
                }
            }
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f49538a, false, 47558, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f49538a, false, 47558, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        f fVar = this.g;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, fVar, f.f49544a, false, 47575, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            f fVar2 = fVar;
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, fVar2, f.f49544a, false, 47575, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        fVar.f49545b = z;
        fVar.b();
    }

    public final void a(d dVar, boolean z) {
        d.a aVar;
        if (PatchProxy.isSupport(new Object[]{dVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f49538a, false, 47559, new Class[]{d.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar, Byte.valueOf(z)}, this, f49538a, false, 47559, new Class[]{d.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        synchronized (this.f49539b) {
            CopyOnWriteArrayList<d> copyOnWriteArrayList = this.f49540c;
            if (z) {
                aVar = new d.a(dVar);
            } else {
                aVar = dVar;
            }
            copyOnWriteArrayList.add(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final <T> void a(String str, Class<T> cls, T t) {
        String str2 = str;
        T t2 = t;
        if (PatchProxy.isSupport(new Object[]{str2, cls, t2}, this, f49538a, false, 47561, new Class[]{String.class, Class.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, cls, t2}, this, f49538a, false, 47561, new Class[]{String.class, Class.class, Object.class}, Void.TYPE);
            return;
        }
        f fVar = this.g;
        if (PatchProxy.isSupport(new Object[]{str2, cls, t2}, fVar, f.f49544a, false, 47576, new Class[]{String.class, Class.class, Object.class}, Void.TYPE)) {
            f fVar2 = fVar;
            PatchProxy.accessDispatch(new Object[]{str2, cls, t2}, fVar2, f.f49544a, false, 47576, new Class[]{String.class, Class.class, Object.class}, Void.TYPE);
            return;
        }
        fVar.f49546c.put(str2, t2);
        if (PatchProxy.isSupport(new Object[]{str2, cls, t2}, fVar, f.f49544a, false, 47579, new Class[]{String.class, Class.class, Object.class}, Void.TYPE)) {
            f fVar3 = fVar;
            PatchProxy.accessDispatch(new Object[]{str2, cls, t2}, fVar3, f.f49544a, false, 47579, new Class[]{String.class, Class.class, Object.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = fVar.a().edit();
        if (t2 instanceof String) {
            edit.putString(str2, (String) t2);
        } else if (t2 instanceof Integer) {
            edit.putInt(str2, ((Integer) t2).intValue());
        } else if (t2 instanceof Float) {
            edit.putFloat(str2, ((Float) t2).floatValue());
        } else if (t2 instanceof Long) {
            edit.putLong(str2, ((Long) t2).longValue());
        } else if (t2 instanceof Boolean) {
            edit.putBoolean(str2, ((Boolean) t2).booleanValue());
        } else if (t2 instanceof Set) {
            edit.putStringSet(str2, (Set) t2);
        }
        edit.apply();
    }
}
