package com.ss.android.ugc.aweme.livewallpaper.c;

import android.app.Activity;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.utils.bk;
import com.ss.android.ugc.aweme.utils.imm.RomUtils;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53685a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f53686b;

    public static void a(String str, String str2, boolean z) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Byte.valueOf(z ? (byte) 1 : 0)}, null, f53685a, true, 56274, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, Byte.valueOf(z)}, null, f53685a, true, 56274, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE);
        } else if (a.a()) {
            r.a(z ? "wall_paper_success" : "wall_paper_fail", (Map) d.a().a("group_id", str3).a("enter_from", str4).f34114b);
        } else {
            r.onEvent(MobClick.obtain().setEventName(z ? "set_success" : "set_fail").setLabelName("wall_paper").setValue(str3).setJsonObject(c.a().a("enter_from", str4).b()));
        }
    }

    private static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f53685a, true, 56275, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f53685a, true, 56275, new Class[]{String.class}, Void.TYPE);
            return;
        }
        r.a("wallpaper_plugin_alert", (Map) d.a().a("group_id", str2).f34114b);
    }

    public static boolean a(Context context, String str) {
        WallpaperInfo wallpaperInfo;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, f53685a, true, 56277, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str2}, null, f53685a, true, 56277, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            wallpaperInfo = WallpaperManager.getInstance(context).getWallpaperInfo();
        } catch (Exception unused) {
            wallpaperInfo = null;
        }
        if (wallpaperInfo == null) {
            return false;
        }
        String packageName = wallpaperInfo.getPackageName();
        if (d()) {
            return "com.ss.android.ugc.aweme.livewallpaper".equals(packageName);
        }
        return packageName.equals(str2);
    }

    public static boolean a(Aweme aweme) {
        if (!PatchProxy.isSupport(new Object[]{aweme}, null, f53685a, true, 56280, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return c() || b(aweme);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f53685a, true, 56280, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
    }

    private static void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f53685a, true, 56286, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f53685a, true, 56286, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!f53686b && !z && !RomUtils.a()) {
            f53686b = true;
            n.a("livewall_not_use_plugin", "", c.a().a("message", "not use plugin").b());
        }
    }

    public static boolean a(Activity activity, String str) {
        Activity activity2 = activity;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity2, str2}, null, f53685a, true, 56291, new Class[]{Activity.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, str2}, null, f53685a, true, 56291, new Class[]{Activity.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (!d() || activity2 == null || activity.isFinishing()) {
            return false;
        } else {
            boolean a2 = com.ss.android.ugc.aweme.utils.n.a(activity2, "com.ss.android.ugc.aweme.livewallpaper");
            if (a2 && !b(activity)) {
                return false;
            }
            a(activity2, a2, str2);
            return true;
        }
    }

    public static String b() {
        if (PatchProxy.isSupport(new Object[0], null, f53685a, true, 56279, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f53685a, true, 56279, new Class[0], String.class);
        }
        return a() + "fallback.mp4";
    }

    private static boolean e() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f53685a, true, 56285, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f53685a, true, 56285, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (RomUtils.a() && Build.VERSION.SDK_INT >= 26) {
            z = true;
        }
        return z;
    }

    public static String a() {
        if (PatchProxy.isSupport(new Object[0], null, f53685a, true, 56278, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f53685a, true, 56278, new Class[0], String.class);
        }
        File filesDir = k.a().getFilesDir();
        if (filesDir == null) {
            return "";
        }
        return filesDir + "/LiveWallpaper/";
    }

    public static boolean c() {
        if (PatchProxy.isSupport(new Object[0], null, f53685a, true, 56281, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f53685a, true, 56281, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (AbTestManager.a().ad() == 0 || ((Integer) SharePrefCache.inst().getUseLiveWallpaper().c()).intValue() == 0) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], null, f53685a, true, 56284, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f53685a, true, 56284, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (AbTestManager.a().ad() == 2) {
            z = true;
        } else {
            z = false;
        }
        a(z);
        if (!z || e()) {
            return false;
        }
        return true;
    }

    private static boolean b(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, null, f53685a, true, 56292, new Class[]{Activity.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2}, null, f53685a, true, 56292, new Class[]{Activity.class}, Boolean.TYPE)).booleanValue();
        } else if (9 > com.ss.android.ugc.aweme.utils.n.b(activity2, "com.ss.android.ugc.aweme.livewallpaper")) {
            return true;
        } else {
            return false;
        }
    }

    public static void a(Activity activity) {
        Intent intent;
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, null, f53685a, true, 56294, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, null, f53685a, true, 56294, new Class[]{Activity.class}, Void.TYPE);
        } else if (activity2 != null) {
            if (a.a()) {
                if (PatchProxy.isSupport(new Object[]{activity2}, null, f53685a, true, 56295, new Class[]{Activity.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{activity2}, null, f53685a, true, 56295, new Class[]{Activity.class}, Void.TYPE);
                    return;
                }
                if (!ToolUtils.isInstalledApp((Context) activity2, "com.android.vending")) {
                    intent = new Intent(activity2, CrossPlatformActivity.class);
                    intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.ss.android.ugc.aweme.livewallpaper"));
                    intent.putExtra("hide_nav_bar", true);
                    intent.putExtra("hide_status_bar", true);
                } else {
                    intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.ss.android.ugc.aweme.livewallpaper"));
                    intent.setPackage("com.android.vending");
                    intent.addFlags(268435456);
                }
                try {
                    activity2.startActivity(intent);
                } catch (Exception unused) {
                }
            } else {
                b.c(Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "livewallpaper-release");
                String a2 = bk.a((Context) activity2, "livewallpaper-release", Environment.getExternalStorageDirectory().getAbsolutePath());
                if (a2 != null) {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setFlags(268435456);
                    intent2.setFlags(1);
                    intent2.setDataAndType(com.ss.android.newmedia.e.a((Context) activity2, new File(a2)), "application/vnd.android.package-archive");
                    activity2.startActivity(intent2);
                }
            }
        }
    }

    public static boolean b(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f53685a, true, 56290, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f53685a, true, 56290, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null) {
            return true;
        } else {
            Video video = aweme.getVideo();
            if (video == null) {
                return true;
            }
            int width = video.getWidth();
            int height = video.getHeight();
            if (width == 0 || height == 0 || aweme.getAwemeType() == 2) {
                return true;
            }
            return false;
        }
    }

    public static void b(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, null, f53685a, true, 56289, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, null, f53685a, true, 56289, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        n.a("livewall_paper_download", i, c.a().a("message", str2).b());
        if (!TextUtils.isEmpty(str)) {
            n.a("type_livewall_paper_download", "", c.a().a("message", str2).b());
        }
    }

    public static void a(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, null, f53685a, true, 56287, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, null, f53685a, true, 56287, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        n.a("livewall_paper_setting", i, c.a().a("message", str2).b());
        if (!TextUtils.isEmpty(str)) {
            n.a("type_livewallpaper_setting", "", c.a().a("message", str2).b());
        }
    }

    public static void a(Aweme aweme, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aweme, str2}, null, f53685a, true, 56271, new Class[]{Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, str2}, null, f53685a, true, 56271, new Class[]{Aweme.class, String.class}, Void.TYPE);
        } else if (a.a()) {
            r.a("wall_paper_click", (Map) d.a().a("group_id", aweme.getAid()).a("request_id", aweme.getRequestId()).a("enter_from", str2).f34114b);
        } else {
            r.onEvent(MobClick.obtain().setEventName("share_video_tab").setLabelName("wall_paper").setValue(aweme.getAid()).setJsonObject(c.a().a("request_id", aweme.getRequestId()).a("enter_from", str2).b()));
            d a2 = d.a().a("group_id", aweme.getAid()).a("request_id", aweme.getRequestId()).a("author_id", aweme.getAuthorUid()).a("enter_from", str2);
            if (aa.d(str)) {
                a2.a("log_pb", ai.a().a(aa.c(aweme)));
                r.a("wall_paper_click", aa.a(a2.f34114b));
                return;
            }
            r.a("wall_paper_click", (Map) a2.f34114b);
        }
    }

    private static void a(Activity activity, boolean z, String str) {
        int i;
        int i2;
        int i3;
        final Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, Byte.valueOf(z ? (byte) 1 : 0), str}, null, f53685a, true, 56293, new Class[]{Activity.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, Byte.valueOf(z), str}, null, f53685a, true, 56293, new Class[]{Activity.class, Boolean.TYPE, String.class}, Void.TYPE);
        } else if (activity2 != null && !activity.isFinishing()) {
            if (z) {
                i = C0906R.string.dok;
            } else {
                i = C0906R.string.b1v;
            }
            if (z) {
                i2 = C0906R.string.dol;
            } else {
                i2 = C0906R.string.b1w;
            }
            if (z) {
                i3 = C0906R.string.doj;
            } else {
                i3 = C0906R.string.b1u;
            }
            if (a.b()) {
                new a.C0185a(activity2).a(i2).b(i).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) null).a(i3, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f53687a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f53687a, false, 56296, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f53687a, false, 56296, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        e.a(activity2);
                    }
                }).a().a();
            } else {
                new a.C0185a(activity2).c(2130839097).a(activity2.getString(i2)).b(activity2.getString(i)).a(activity2.getString(i3), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f53689a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f53689a, false, 56297, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f53689a, false, 56297, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        e.a(activity2);
                    }
                }).b(activity2.getString(C0906R.string.pm), (DialogInterface.OnClickListener) null).a().b();
            }
            a(str);
        }
    }
}
