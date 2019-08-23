package com.bytedance.ies.geckoclient;

import android.text.TextUtils;
import com.bytedance.ies.geckoclient.d.a;
import com.bytedance.ies.geckoclient.model.d;
import com.bytedance.ies.geckoclient.model.j;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;
import java.io.File;
import java.util.List;

public final class r extends a {

    /* renamed from: b  reason: collision with root package name */
    private d f20835b;

    /* renamed from: c  reason: collision with root package name */
    private String f20836c;

    /* renamed from: d  reason: collision with root package name */
    private j f20837d;

    /* renamed from: e  reason: collision with root package name */
    private int f20838e;

    /* renamed from: f  reason: collision with root package name */
    private int f20839f = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
    private boolean g;
    private f h;
    private boolean i;

    private void a(Exception exc, j jVar, int i2) {
        StringBuilder sb = new StringBuilder("patch task error:");
        sb.append(exc.toString());
        sb.append(" current status:");
        sb.append(this.f20838e);
        a(jVar);
        this.f20837d.a(this.g, this.f20838e, this.f20835b, jVar, exc, i2);
        if (c(jVar)) {
            b(jVar, 0);
        }
    }

    private void a() {
        this.f20837d.b(this.f20835b);
    }

    public final void run() {
        j jVar = this.f20835b.j;
        if (jVar != null) {
            a(jVar, 0);
        }
    }

    private static boolean e(j jVar) {
        if (jVar.f20813c == 1) {
            return false;
        }
        return jVar.c().f20810c;
    }

    private static boolean c(j jVar) {
        if (jVar.a() == null || jVar.a().f20822c.size() <= 0) {
            return false;
        }
        return true;
    }

    private static boolean d(j jVar) {
        if (jVar.b() == null || jVar.b().f20822c.size() <= 0) {
            return false;
        }
        return true;
    }

    private void b(j jVar) {
        File file = new File(this.f20836c + jVar.a().f20825f);
        if (!TextUtils.isEmpty(jVar.a().f20825f) && file.exists()) {
            d.a(file);
            StringBuilder sb = new StringBuilder("delete unzip dir:");
            sb.append(this.f20836c);
            sb.append(jVar.a().f20825f);
        }
        File file2 = new File(this.f20836c + jVar.a().f20824e);
        if (!TextUtils.isEmpty(jVar.a().f20825f) && file2.exists()) {
            file2.delete();
            StringBuilder sb2 = new StringBuilder("delete unzip:");
            sb2.append(this.f20836c);
            sb2.append(jVar.a().f20824e);
        }
    }

    private void a(j jVar) {
        File file = new File(this.f20836c + jVar.a().f20825f);
        if (!TextUtils.isEmpty(jVar.a().f20825f) && file.exists()) {
            d.a(file);
            StringBuilder sb = new StringBuilder("delete unzip dir:");
            sb.append(this.f20836c);
            sb.append(jVar.a().f20825f);
        }
        File file2 = new File(this.f20836c + jVar.f20814d);
        if (!TextUtils.isEmpty(jVar.f20814d) && file2.exists()) {
            file2.delete();
            StringBuilder sb2 = new StringBuilder("delete after patch unzip:");
            sb2.append(this.f20836c);
            sb2.append(jVar.a().f20824e);
        }
        File file3 = new File(this.f20836c + jVar.b().f20824e);
        if (!TextUtils.isEmpty(jVar.b().f20824e) && file3.exists()) {
            file3.delete();
            StringBuilder sb3 = new StringBuilder("delete patch unzip:");
            sb3.append(this.f20836c);
            sb3.append(jVar.a().f20824e);
        }
    }

    private String a(String str, String str2) throws Exception {
        this.f20837d.a(this.g, 1, this.f20835b);
        String str3 = this.f20836c + str2;
        new File(str3).getParentFile().mkdirs();
        if (a.a(str, str3)) {
            return str3;
        }
        throw new RuntimeException("download return failed");
    }

    private void b(j jVar, int i2) {
        List<String> list = jVar.a().f20822c;
        try {
            if (i2 < list.size()) {
                b(jVar, list.get(i2));
            }
        } catch (Exception e2) {
            if (this.f20838e == 1) {
                int i3 = i2 + 1;
                if (i3 < list.size()) {
                    b(jVar);
                    b(jVar, i3);
                    return;
                }
            }
            b(e2, jVar, this.f20839f);
        }
    }

    private void a(j jVar, int i2) {
        int size;
        int i3 = 0;
        try {
            if (d(jVar)) {
                List<String> list = jVar.b().f20822c;
                String str = list.get(i2);
                if (i2 < list.size()) {
                    size = list.size();
                    try {
                        a(jVar, str);
                    } catch (Exception e2) {
                        int i4 = size;
                        e = e2;
                        i3 = i4;
                    }
                }
            }
            if (c(jVar)) {
                List<String> list2 = jVar.a().f20822c;
                String str2 = list2.get(i2);
                if (i2 < list2.size()) {
                    size = list2.size();
                    b(jVar, str2);
                }
            }
        } catch (Exception e3) {
            e = e3;
            if (this.f20838e == 1) {
                int i5 = i2 + 1;
                if (i5 < i3) {
                    if (this.g) {
                        a(jVar);
                    } else {
                        b(jVar);
                    }
                    a(jVar, i5);
                    return;
                }
            }
            if (this.g) {
                a(e, jVar, this.f20839f);
            } else {
                b(e, jVar, this.f20839f);
            }
        }
    }

    private static void c(j jVar, String str) throws Exception {
        j.b a2 = jVar.a();
        if (a2 != null) {
            String str2 = a2.f20823d;
            String a3 = c.a(new File(str));
            if (!TextUtils.equals(str2, a3)) {
                throw new q("after patch md5 check failed  file:" + str + " md5 is " + a3 + ", server assigned md5 is " + str2 + ".  might be hijacked！ ");
            }
        }
    }

    private String a(String str, j jVar) throws Exception {
        String str2;
        String str3;
        GeckoBspatch geckoBspatch = new GeckoBspatch();
        String str4 = "";
        if (jVar.a() != null) {
            String str5 = "";
            List<String> list = jVar.a().f20822c;
            if (list != null && list.size() > 0) {
                str5 = list.get(0);
            }
            String[] split = str5.split("/");
            str4 = split[split.length - 1];
        }
        if (TextUtils.isEmpty(str4)) {
            str4 = "patch_" + this.f20835b.f20793e;
        }
        if (jVar.f20813c == 1) {
            str3 = this.f20836c + jVar.f20812b + "/" + this.f20835b.f20793e;
            str2 = this.f20836c + jVar.f20812b + "/" + str4;
        } else {
            str3 = this.f20836c + this.f20835b.f20793e;
            str2 = this.f20836c + str4;
        }
        jVar.f20814d = str4;
        this.f20837d.a(this.g, this.f20838e, this.f20835b);
        int bspatch = geckoBspatch.bspatch("", str3, str2, str);
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        if (bspatch == 0) {
            c(jVar, str2);
            if (!str3.equals(str2)) {
                new File(str3).delete();
            }
            return str4;
        }
        throw new q("patch file failed  status:" + bspatch + " patch file:" + str);
    }

    private void b(j jVar, String str) throws Exception {
        String str2;
        String str3;
        boolean z = false;
        this.g = false;
        this.f20837d.a(this.g, 0, this.f20835b);
        String[] split = str.split("/");
        String str4 = split[split.length - 1];
        new StringBuilder("download:").append(str);
        new StringBuilder("unzip:").append(str4);
        jVar.a().f20824e = str4;
        this.f20838e = 1;
        this.f20839f = c.f69428f;
        if (jVar.f20813c == 1) {
            str2 = jVar.f20812b + "/" + str4;
        } else {
            str2 = str4;
        }
        String a2 = a(str, str2);
        this.f20839f = 450;
        if (TextUtils.equals(this.f20835b.j.a().f20823d, c.a(new File(a2)))) {
            jVar.f20815e = new File(a2).length();
            this.f20837d.a(this.g, this.f20838e, this.f20835b, jVar);
            if (!this.i || this.h.d(jVar.f20812b)) {
                z = true;
            }
            this.f20835b.f20789a = jVar.f20811a;
            this.f20835b.f20790b = z ^ true ? 1 : 0;
            if (e(jVar)) {
                if (z) {
                    str3 = this.f20836c;
                } else {
                    str3 = this.h.f20739d;
                }
                this.f20838e = 2;
                this.f20839f = 500;
                this.f20835b.f20792d = a(a2, str3, jVar.f20812b, z);
                if (!TextUtils.equals(this.f20835b.f20793e, str4) && !TextUtils.isEmpty(this.f20835b.f20793e)) {
                    File file = new File(this.f20836c + this.f20835b.f20793e);
                    if (file.exists()) {
                        file.delete();
                    }
                }
                this.f20835b.f20793e = str4;
            } else {
                File file2 = new File(this.f20836c + jVar.f20812b + File.separator + "gecko_activate_done");
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                this.f20835b.f20792d = jVar.f20812b;
                this.f20835b.f20793e = str4;
            }
            this.f20837d.a(this.g, this.f20838e, this.f20835b, jVar);
            this.f20838e = 4;
            this.f20839f = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
            a();
            return;
        }
        throw new q("file:" + a2 + " md5 is " + r4 + ", server assigned md5 is " + r2 + ".  might be hijacked！ ");
    }

    private void a(j jVar, String str) throws Exception {
        String str2;
        boolean z = true;
        this.g = true;
        this.f20837d.a(this.g, 0, this.f20835b);
        String[] split = str.split("/");
        String str3 = split[split.length - 1];
        new StringBuilder("download patch:").append(str);
        new StringBuilder("patch:").append(str3);
        jVar.b().f20824e = str3;
        this.f20838e = 1;
        this.f20839f = 301;
        String a2 = a(str, str3);
        this.f20839f = 402;
        String str4 = this.f20835b.j.b().f20823d;
        String a3 = c.a(new File(a2));
        if (TextUtils.equals(str4, a3)) {
            jVar.f20815e = new File(a2).length();
            this.f20837d.a(this.g, this.f20838e, this.f20835b, jVar);
            this.f20839f = 403;
            this.f20838e = 3;
            String a4 = a(a2, jVar);
            if (!TextUtils.isEmpty(a4)) {
                if (this.i && !this.h.d(jVar.f20812b)) {
                    z = false;
                }
                this.f20835b.f20789a = jVar.f20811a;
                this.f20835b.f20790b = z ^ true ? 1 : 0;
                if (e(jVar)) {
                    if (z) {
                        str2 = this.f20836c;
                    } else {
                        str2 = this.h.f20739d;
                    }
                    this.f20838e = 2;
                    this.f20839f = 501;
                    this.f20835b.f20792d = a(this.f20836c + a4, str2, jVar.f20812b, z);
                    if (!TextUtils.equals(this.f20835b.f20793e, a4) && !TextUtils.isEmpty(this.f20835b.f20793e)) {
                        File file = new File(this.f20836c + this.f20835b.f20793e);
                        if (file.exists()) {
                            file.delete();
                        }
                    }
                    this.f20835b.f20793e = a4;
                } else {
                    File file2 = new File(this.f20836c + jVar.f20812b + File.separator + "gecko_activate_done");
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    this.f20835b.f20792d = jVar.f20812b;
                    this.f20835b.f20793e = a4;
                }
                this.f20837d.a(this.g, this.f20838e, this.f20835b, jVar);
                this.f20838e = 4;
                this.f20839f = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                a();
                return;
            }
            throw new q("patch file failed");
        }
        throw new q("file:" + a2 + " md5 is " + a3 + ", server assigned md5 is " + str4 + ".  might be hijacked！ ");
    }

    private void b(Exception exc, j jVar, int i2) {
        b(jVar);
        this.f20837d.a(this.g, this.f20838e, this.f20835b, jVar, exc, i2);
    }

    private String a(String str, String str2, String str3, boolean z) throws Exception {
        if (!new t().a(str)) {
            throw new q("file:" + str + " is not a archive file!");
        } else if (t.a(str, str3)) {
            if (!TextUtils.isEmpty(this.f20835b.f20792d) && z) {
                File file = new File(this.f20836c + this.f20835b.f20792d);
                if (file.exists()) {
                    boolean a2 = d.a(file);
                    StringBuilder sb = new StringBuilder("delete old package:");
                    sb.append(this.f20836c);
                    sb.append(this.f20835b.f20792d);
                    sb.append(" ");
                    sb.append(a2);
                }
            }
            if (!TextUtils.isEmpty(str3)) {
                this.f20835b.j.a().f20825f = str3;
                this.f20837d.a(this.g, 2, this.f20835b);
            }
            return t.a(str, str2, str3);
        } else {
            throw new IllegalArgumentException("zip包最外层必须有一个文件夹，并且以channel命名");
        }
    }

    r(a aVar, d dVar, String str, boolean z, f fVar) {
        super(aVar);
        this.f20835b = dVar;
        this.f20836c = str;
        this.h = fVar;
        this.f20837d = fVar;
        this.i = z;
    }
}
