package com.ss.android.ugc.aweme.filter;

import android.content.res.AssetManager;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.utils.bm;
import com.ss.android.ugc.aweme.utils.fd;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47653a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f47654b = new File(f47656d, "make_up").getAbsolutePath();

    /* renamed from: c  reason: collision with root package name */
    public static final String f47655c = new File(f47656d, "share").getAbsolutePath();

    /* renamed from: d  reason: collision with root package name */
    private static final String f47656d = new File(a.f61119b.getFilesDir(), "filter").getAbsolutePath();

    /* renamed from: e  reason: collision with root package name */
    private static final String f47657e = new File(f47656d, "face_reshape").getAbsolutePath();

    /* renamed from: f  reason: collision with root package name */
    private static final String f47658f = new File(f47656d, "ulike_reshape").getAbsolutePath();
    private static final String g = new File(f47656d, "Qinyan").getAbsolutePath();
    private static final String h = new File(f47656d, "contour").getAbsolutePath();

    public static String b() {
        return g;
    }

    public static String a() {
        if (PatchProxy.isSupport(new Object[0], null, f47653a, true, 44186, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f47653a, true, 44186, new Class[0], String.class);
        }
        return f47657e + File.separator;
    }

    public static String c() {
        if (PatchProxy.isSupport(new Object[0], null, f47653a, true, 44188, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f47653a, true, 44188, new Class[0], String.class);
        }
        return h + "/";
    }

    private static boolean e() {
        if (PatchProxy.isSupport(new Object[0], null, f47653a, true, 44191, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f47653a, true, 44191, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (a.L.b(e.a.EffectResourceVersion) == 3 && a.L.a(e.a.ContourModelCopied)) {
            return true;
        }
        try {
            a(a.f61119b.getAssets(), "Contour_2D", c());
            a.L.a(e.a.ContourModelCopied, true);
        } catch (IOException unused) {
        }
        return false;
    }

    private static boolean f() {
        if (PatchProxy.isSupport(new Object[0], null, f47653a, true, 44192, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f47653a, true, 44192, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (a.L.b(e.a.EffectResourceVersion) == 3 && a.L.a(e.a.MakeupModelCopied)) {
            return true;
        }
        try {
            fd.a(a.f61119b.getAssets().open("Makeup.zip"), f47654b);
            a.L.a(e.a.MakeupModelCopied, true);
        } catch (IOException unused) {
        }
        return false;
    }

    private static boolean g() {
        if (PatchProxy.isSupport(new Object[0], null, f47653a, true, 44193, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f47653a, true, 44193, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (a.L.b(e.a.EffectResourceVersion) == 3 && a.L.a(e.a.EffectShareCopied)) {
            return true;
        }
        try {
            fd.a(a.f61119b.getAssets().open("share.zip"), f47655c);
            a.L.a(e.a.EffectShareCopied, true);
        } catch (IOException unused) {
        }
        return false;
    }

    private static boolean h() {
        if (PatchProxy.isSupport(new Object[0], null, f47653a, true, 44194, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f47653a, true, 44194, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (a.L.b(e.a.EffectResourceVersion) == 3 && a.L.a(e.a.UlikeReshapeCopied)) {
            return true;
        }
        try {
            fd.a(a.f61119b.getAssets().open("FaceReshape_V3.zip"), f47658f);
            a.L.a(e.a.UlikeReshapeCopied, true);
        } catch (IOException unused) {
        }
        return false;
    }

    private static boolean i() {
        if (PatchProxy.isSupport(new Object[0], null, f47653a, true, 44195, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f47653a, true, 44195, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (a.L.b(e.a.EffectResourceVersion) == 3 && a.L.a(e.a.UlikeBeautyCopied)) {
            return true;
        }
        try {
            fd.a(a.f61119b.getAssets().open("Qinyan.zip"), g);
            a.L.a(e.a.UlikeBeautyCopied, true);
        } catch (IOException unused) {
        }
        return false;
    }

    static {
        File file = new File(f47656d);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(f47657e);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File file3 = new File(f47654b);
        if (!file3.exists()) {
            file3.mkdirs();
        }
        File file4 = new File(f47658f);
        if (!file4.exists()) {
            file4.mkdirs();
        }
        File file5 = new File(g);
        if (!file5.exists()) {
            file5.mkdirs();
        }
        File file6 = new File(h);
        if (file6.exists()) {
            file6.mkdirs();
        }
        File file7 = new File(f47655c);
        if (file7.exists()) {
            file7.mkdirs();
        }
        g();
        h();
        i();
        d();
        e();
        f();
        a.L.a(e.a.EffectResourceVersion, 3);
    }

    private static boolean d() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], null, f47653a, true, 44190, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f47653a, true, 44190, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!new File(f47657e, "config.json").exists() || !new File(f47657e, "distortion.json").exists()) {
            z = false;
        } else {
            z = true;
        }
        if (a.L.a(e.a.ReshapeModelCopied) && z) {
            return true;
        }
        AssetManager assets = a.f61119b.getAssets();
        try {
            File file = new File(f47657e, "config.json");
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            if (!bm.a(assets.open("FaceReshape_V2/config.json"), (OutputStream) new FileOutputStream(file))) {
                return false;
            }
            File file2 = new File(f47657e, "distortion.json");
            if (file2.exists()) {
                file2.delete();
            }
            file2.createNewFile();
            if (!bm.a(assets.open("FaceReshape_V2/distortion.json"), (OutputStream) new FileOutputStream(file2))) {
                return false;
            }
            a.L.a(e.a.ReshapeModelCopied, true);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private static void a(AssetManager assetManager, String str, String str2) throws IOException {
        AssetManager assetManager2 = assetManager;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{assetManager2, str3, str4}, null, f47653a, true, 44196, new Class[]{AssetManager.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{assetManager2, str3, str4}, null, f47653a, true, 44196, new Class[]{AssetManager.class, String.class, String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String str5 = File.separator;
            String[] list = assetManager.list(str);
            if (list == null || list.length <= 0) {
                bm.a(assetManager.open(str), (OutputStream) new FileOutputStream(str4));
                return;
            }
            File file = new File(str4);
            if (file.exists() || file.mkdirs()) {
                for (String str6 : list) {
                    a(assetManager2, str3 + str5 + str6, str4 + str5 + str6);
                }
            }
        }
    }
}
