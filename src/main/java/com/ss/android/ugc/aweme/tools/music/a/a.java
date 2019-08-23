package com.ss.android.ugc.aweme.tools.music.a;

import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74779a;

    /* renamed from: b  reason: collision with root package name */
    public static SharedPreferences f74780b = c.a(((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getApplication(), "ai_music", 0);

    public static long b() {
        if (PatchProxy.isSupport(new Object[0], null, f74779a, true, 87135, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], null, f74779a, true, 87135, new Class[0], Long.TYPE)).longValue();
        }
        return f74780b.getLong("ai_music_time", 0);
    }

    public static String c() {
        if (PatchProxy.isSupport(new Object[0], null, f74779a, true, 87136, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f74779a, true, 87136, new Class[0], String.class);
        }
        return f74780b.getString("ai_music_url", "");
    }

    public static String d() {
        if (PatchProxy.isSupport(new Object[0], null, f74779a, true, 87138, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f74779a, true, 87138, new Class[0], String.class);
        }
        return f74780b.getString("ai_music_list", "");
    }

    public static void e() {
        if (PatchProxy.isSupport(new Object[0], null, f74779a, true, 87142, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f74779a, true, 87142, new Class[0], Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = f74780b.edit();
        edit.remove("ai_music_time");
        edit.remove("ai_music_list");
        edit.remove("ai_music_url");
        edit.commit();
    }

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f74779a, true, 87133, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f74779a, true, 87133, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().getEditPagePrompt()) {
            return ((IAVService) ServiceManager.get().getService(IAVService.class)).promptService().hasPromptShownMusic();
        }
        return f74780b.getBoolean("ai_music_guide_show", false);
    }

    public static void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f74779a, true, 87134, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f74779a, true, 87134, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().getEditPagePrompt()) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).promptService().editPromptShownMusic(true);
        } else {
            SharedPreferences.Editor edit = f74780b.edit();
            edit.putBoolean("ai_music_guide_show", z);
            edit.commit();
        }
    }

    public static void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f74779a, true, 87141, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f74779a, true, 87141, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = f74780b.edit();
        edit.putLong("ai_music_time", System.currentTimeMillis());
        edit.putString("ai_music_list", str3);
        edit.putString("ai_music_url", str4);
        edit.commit();
    }
}
