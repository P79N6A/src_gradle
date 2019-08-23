package com.ss.android.ugc.aweme.shortvideo;

import android.os.Environment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class fg {
    public static final String A = (f67717f + "music-effect/");
    public static final String B = (f67717f + "face_track.model");

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f67716e;

    /* renamed from: f  reason: collision with root package name */
    public static final String f67717f;
    public static final String g = (f67717f + "tmp/");
    public static final String h = (f67717f + "draft/");
    public static final String i = (f67717f + "import/");
    public static final String j = (f67717f + "origin_sound/");
    public static final String k = (f67717f + "tmp_video/");
    public static final String l = (f67717f + "parallel_upload/");
    public static final String m = (f67717f + "files/share/out/");
    public static final String n = (f67717f + "record_work_space");
    public static final String o = (Environment.getExternalStorageDirectory().getPath() + "/aweme/draft/");
    public static final String p = (f67717f + "cache/");
    public static final String q = (f67717f + "download/");
    public static final String r = (f67717f + "model/");
    public static final String s = (f67717f + "filters/");
    public static final String t = (f67717f + "audio-effect/");
    public static final String u = (f67717f + "music/");
    public static final String v = (f67717f + "patch/");
    public static final String w = (f67717f + "beauty-face/");
    public static final String x = (f67717f + "noCopyDraft/");
    public static final String y = (f67717f + "file/share/out/");
    public static final String z = (f67717f + "compat_draft_track/");

    public static String b() {
        if (PatchProxy.isSupport(new Object[0], null, f67716e, true, 74574, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f67716e, true, 74574, new Class[0], String.class);
        }
        return k + d(".mp4");
    }

    static {
        String str;
        StringBuilder sb;
        boolean z2;
        if (a.a()) {
            if (PatchProxy.isSupport(new Object[0], null, f67716e, true, 74568, new Class[0], Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f67716e, true, 74568, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                z2 = c.a(com.ss.android.ugc.aweme.framework.e.a.a(), "test_data", 0).getBoolean("sp_key_tools_dir_external", false);
            }
            if (z2) {
                sb = new StringBuilder();
                sb.append(Environment.getExternalStorageDirectory().getPath());
                str = "/aweme/";
                sb.append(str);
                f67717f = sb.toString();
                b.a(new File(f67717f));
            }
        }
        sb = new StringBuilder();
        sb.append(b.e());
        str = "/";
        sb.append(str);
        f67717f = sb.toString();
        b.a(new File(f67717f));
    }

    public static String c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f67716e, true, 74571, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, f67716e, true, 74571, new Class[]{String.class}, String.class);
        }
        return f67717f + d(str);
    }

    public static String d(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f67716e, true, 74575, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f67716e, true, 74575, new Class[]{String.class}, String.class);
        }
        new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
        return r1.format(time) + str2;
    }
}
