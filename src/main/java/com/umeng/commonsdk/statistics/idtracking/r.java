package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.os.Environment;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class r extends a {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f80976c = Pattern.compile("UTDID\">([^<]+)");

    /* renamed from: d  reason: collision with root package name */
    private Context f80977d;

    private String g() {
        FileInputStream fileInputStream;
        File h = h();
        if (h == null || !h.exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(h);
            String b2 = b(HelperUtils.readStreamToString(fileInputStream));
            HelperUtils.safeClose((InputStream) fileInputStream);
            return b2;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            HelperUtils.safeClose((InputStream) fileInputStream);
            throw th;
        }
    }

    private File h() {
        if (DeviceConfig.checkPermission(this.f80977d, "android.permission.WRITE_EXTERNAL_STORAGE") && Environment.getExternalStorageState().equals("mounted")) {
            try {
                return new File(Environment.getExternalStorageDirectory().getCanonicalPath(), ".UTSystemConfig/Global/Alvin2.xml");
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public String f() {
        try {
            return (String) Class.forName("com.ut.device.UTDevice").getMethod("getUtdid", new Class[]{Context.class}).invoke(null, new Object[]{this.f80977d});
        } catch (Exception unused) {
            return g();
        }
    }

    public r(Context context) {
        super("utdid");
        this.f80977d = context;
    }

    private String b(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f80976c.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }
}
