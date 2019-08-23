package com.umeng.analytics.pro;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class am extends y {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f80367c = Pattern.compile("UTDID\">([^<]+)");

    /* renamed from: d  reason: collision with root package name */
    private Context f80368d;

    private String g() {
        FileInputStream fileInputStream;
        File h = h();
        if (h == null || !h.exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(h);
            String b2 = b(bw.a((InputStream) fileInputStream));
            bw.c(fileInputStream);
            return b2;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            bw.c(fileInputStream);
            throw th;
        }
    }

    private File h() {
        if (bv.a(this.f80368d, "android.permission.WRITE_EXTERNAL_STORAGE") && Environment.getExternalStorageState().equals("mounted")) {
            try {
                return new File(Environment.getExternalStorageDirectory().getCanonicalPath(), ".UTSystemConfig/Global/Alvin2.xml");
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public String f() {
        try {
            return (String) Class.forName("com.ut.device.UTDevice").getMethod("getUtdid", new Class[]{Context.class}).invoke(null, new Object[]{this.f80368d});
        } catch (Exception unused) {
            return g();
        }
    }

    public am(Context context) {
        super("utdid");
        this.f80368d = context;
    }

    private String b(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f80367c.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }
}
