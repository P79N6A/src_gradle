package com.ss.android.pushmanager.setting;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.pushmanager.i;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import com.ss.android.ugc.aweme.q.c;
import java.util.HashMap;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30585a;

    /* renamed from: c  reason: collision with root package name */
    private static a f30586c;

    /* renamed from: b  reason: collision with root package name */
    public SharedPreferences f30587b;

    /* renamed from: d  reason: collision with root package name */
    private PushMultiProcessSharedProvider.b f30588d;

    private a() {
        Application a2 = com.ss.android.message.a.a();
        this.f30588d = PushMultiProcessSharedProvider.a((Context) a2);
        this.f30587b = c.a(a2, "push_multi_process_config", 4);
    }

    private String d() {
        if (!PatchProxy.isSupport(new Object[0], this, f30585a, false, 19120, new Class[0], String.class)) {
            return this.f30588d.a("ssids", "");
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f30585a, false, 19120, new Class[0], String.class);
    }

    public final String b() {
        if (PatchProxy.isSupport(new Object[0], this, f30585a, false, 19122, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f30585a, false, 19122, new Class[0], String.class);
        }
        HashMap hashMap = new HashMap();
        b(hashMap);
        return (String) hashMap.get(i.f30562a);
    }

    public final boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, f30585a, false, 19139, new Class[0], Boolean.TYPE)) {
            return this.f30588d.b();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f30585a, false, 19139, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public static synchronized a a() {
        synchronized (a.class) {
            if (PatchProxy.isSupport(new Object[0], null, f30585a, true, 19118, new Class[0], a.class)) {
                a aVar = (a) PatchProxy.accessDispatch(new Object[0], null, f30585a, true, 19118, new Class[0], a.class);
                return aVar;
            }
            if (f30586c == null) {
                synchronized (a.class) {
                    if (f30586c == null) {
                        f30586c = new a();
                    }
                }
            }
            a aVar2 = f30586c;
            return aVar2;
        }
    }

    public final void b(Map<String, String> map) {
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{map2}, this, f30585a, false, 19121, new Class[]{Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map2}, this, f30585a, false, 19121, new Class[]{Map.class}, Void.TYPE);
        } else if (map2 != null) {
            Logger.debug();
            try {
                String d2 = d();
                if (!StringUtils.isEmpty(d2)) {
                    StringUtils.stringToMap(d2, map2);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void a(Map<String, String> map) {
        if (PatchProxy.isSupport(new Object[]{map}, this, f30585a, false, 19119, new Class[]{Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map}, this, f30585a, false, 19119, new Class[]{Map.class}, Void.TYPE);
        } else if (map != null) {
            Logger.debug();
            try {
                try {
                    this.f30588d.a().a("ssids", StringUtils.mapToString(map)).a();
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
            }
        }
    }

    public final boolean a(String str, Boolean bool) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2, bool}, this, f30585a, false, 19129, new Class[]{String.class, Boolean.class}, Boolean.TYPE)) {
            return this.f30587b.getBoolean(str2, bool.booleanValue());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, bool}, this, f30585a, false, 19129, new Class[]{String.class, Boolean.class}, Boolean.TYPE)).booleanValue();
    }
}
