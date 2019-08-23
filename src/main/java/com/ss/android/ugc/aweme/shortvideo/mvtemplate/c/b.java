package com.ss.android.ugc.aweme.shortvideo.mvtemplate.c;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.story.widget.TabHost;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68504a = null;

    /* renamed from: b  reason: collision with root package name */
    public static String f68505b = "change_mode";

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f68504a, true, 78100, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f68504a, true, 78100, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().showMvThemeRecordMode();
    }

    public static void d(String str) {
        f68505b = str;
    }

    public static int a(TabHost tabHost) {
        TabHost tabHost2 = tabHost;
        if (PatchProxy.isSupport(new Object[]{tabHost2}, null, f68504a, true, 78101, new Class[]{TabHost.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{tabHost2}, null, f68504a, true, 78101, new Class[]{TabHost.class}, Integer.TYPE)).intValue();
        }
        int i = -1;
        if (tabHost2 == null) {
            return -1;
        }
        String string = tabHost.getContext().getString(C0906R.string.bx5);
        for (int i2 = 0; i2 < tabHost.getTabCount(); i2++) {
            if (string.equals(tabHost2.a(i2))) {
                i = i2;
            }
        }
        return i;
    }

    public static String b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f68504a, true, 78104, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f68504a, true, 78104, new Class[]{String.class}, String.class);
        }
        new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
        return r1.format(time) + str2;
    }

    public static boolean c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f68504a, true, 78108, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f68504a, true, 78108, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.ugc.aweme.video.b.b(str)) {
            return true;
        } else {
            try {
                return new File(str2).delete();
            } catch (Exception unused) {
                return false;
            }
        }
    }

    private static String e(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f68504a, true, 78103, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f68504a, true, 78103, new Class[]{String.class}, String.class);
        }
        return a.f61119b.getFilesDir().getAbsolutePath() + File.separator + "mvtheme" + File.separator + str2;
    }

    public static String a(cb cbVar) {
        cb cbVar2 = cbVar;
        if (PatchProxy.isSupport(new Object[]{cbVar2}, null, f68504a, true, 78099, new Class[]{cb.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{cbVar2}, null, f68504a, true, 78099, new Class[]{cb.class}, String.class);
        } else if (cbVar2 == null) {
            return null;
        } else {
            if (cbVar.isMvThemeVideoType() || cbVar2.mFromCut || cbVar2.mFromMultiCut) {
                return "upload";
            }
            return "shoot";
        }
    }

    public static String a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f68504a, true, 78102, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, f68504a, true, 78102, new Class[]{String.class}, String.class);
        }
        String e2 = e(str);
        if (!new File(e2).exists()) {
            new File(e2).mkdirs();
        }
        return e2;
    }

    public static boolean a(String str, String str2, int i, int i2, int i3) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, f68504a, true, 78106, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, f68504a, true, 78106, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.ugc.aweme.video.b.b(str)) {
            return false;
        } else {
            Bitmap a2 = a.a(str3, i, i2, a.b(str), i3);
            if (a2 == null) {
                return false;
            }
            return a.a(a2, new File(str4), 100, Bitmap.CompressFormat.PNG);
        }
    }
}
