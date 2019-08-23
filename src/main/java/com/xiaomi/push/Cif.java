package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.q.c;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.ag;
import java.io.File;

/* renamed from: com.xiaomi.push.if  reason: invalid class name */
public class Cif implements XMPushService.l {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f82225a;

    /* renamed from: a  reason: collision with other field name */
    private int f527a;

    /* renamed from: a  reason: collision with other field name */
    private Context f528a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f82226b;

    public Cif(Context context) {
        this.f528a = context;
    }

    private String a(String str) {
        return "com.xiaomi.xmsf".equals(str) ? "1000271" : c.a(this.f528a, "pref_registered_pkg_names", 0).getString(str, null);
    }

    private void a(Context context) {
        this.f82226b = ag.a(context).a(ip.TinyDataUploadSwitch.a(), true);
        this.f527a = ag.a(context).a(ip.TinyDataUploadFrequency.a(), 7200);
        this.f527a = Math.max(60, this.f527a);
    }

    public static void a(boolean z) {
        f82225a = z;
    }

    private boolean a() {
        return Math.abs((System.currentTimeMillis() / 1000) - c.a(this.f528a, "mipush_extra", 4).getLong("last_tiny_data_upload_timestamp", -1)) > ((long) this.f527a);
    }

    private boolean a(ij ijVar) {
        return at.b(this.f528a) && ijVar != null && !TextUtils.isEmpty(a(this.f528a.getPackageName())) && new File(this.f528a.getFilesDir(), "tiny_data.data").exists() && !f82225a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m393a() {
        a(this.f528a);
        if (this.f82226b && a()) {
            b.a("TinyData TinyDataCacheProcessor.pingFollowUpAction ts:" + System.currentTimeMillis());
            ij a2 = ii.a(this.f528a).a();
            if (!a(a2)) {
                b.a("TinyData TinyDataCacheProcessor.pingFollowUpAction !canUpload(uploader) ts:" + System.currentTimeMillis());
                return;
            }
            f82225a = true;
            ig.a(this.f528a, a2);
        }
    }
}
