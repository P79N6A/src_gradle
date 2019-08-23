package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import java.io.File;

public class i extends a {

    /* renamed from: b  reason: collision with root package name */
    private Context f80966b;

    /* renamed from: c  reason: collision with root package name */
    private String f80967c;

    /* renamed from: d  reason: collision with root package name */
    private String f80968d;

    public String f() {
        return this.f80967c;
    }

    public boolean g() {
        return h();
    }

    public void i() {
        try {
            l();
            k();
            j();
        } catch (Exception unused) {
        }
    }

    private void j() {
        try {
            b("/data/local/tmp/.um");
            HelperUtils.writeFile(new File("/data/local/tmp/.um/sysid.dat"), this.f80968d);
        } catch (Throwable unused) {
        }
    }

    private void k() {
        try {
            b("/sdcard/Android/obj/.um");
            HelperUtils.writeFile(new File("/sdcard/Android/obj/.um/sysid.dat"), this.f80968d);
        } catch (Throwable unused) {
        }
    }

    private void l() {
        try {
            b("/sdcard/Android/data/.um");
            HelperUtils.writeFile(new File("/sdcard/Android/data/.um/sysid.dat"), this.f80968d);
        } catch (Throwable unused) {
        }
    }

    public boolean h() {
        this.f80968d = UMEnvelopeBuild.imprintProperty(this.f80966b, "umid", null);
        if (!TextUtils.isEmpty(this.f80968d)) {
            this.f80968d = DataHelper.encryptBySHA1(this.f80968d);
            String readFile = HelperUtils.readFile(new File("/sdcard/Android/data/.um/sysid.dat"));
            String readFile2 = HelperUtils.readFile(new File("/sdcard/Android/obj/.um/sysid.dat"));
            String readFile3 = HelperUtils.readFile(new File("/data/local/tmp/.um/sysid.dat"));
            if (TextUtils.isEmpty(readFile)) {
                l();
            } else if (!this.f80968d.equals(readFile)) {
                this.f80967c = readFile;
                return true;
            }
            if (TextUtils.isEmpty(readFile2)) {
                k();
            } else if (!this.f80968d.equals(readFile2)) {
                this.f80967c = readFile2;
                return true;
            }
            if (TextUtils.isEmpty(readFile3)) {
                j();
            } else if (!this.f80968d.equals(readFile3)) {
                this.f80967c = readFile3;
                return true;
            }
        }
        return false;
    }

    public i(Context context) {
        super("oldumid");
        this.f80966b = context;
    }

    private void b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
    }
}
