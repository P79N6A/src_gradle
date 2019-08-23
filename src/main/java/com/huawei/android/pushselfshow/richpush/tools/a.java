package com.huawei.android.pushselfshow.richpush.tools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushselfshow.utils.a.c;
import com.huawei.android.pushselfshow.utils.d;
import com.ss.android.ugc.aweme.utils.eq;
import java.io.File;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public Resources f25356a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f25357b;

    /* renamed from: c  reason: collision with root package name */
    private com.huawei.android.pushselfshow.b.a f25358c;

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
            if (Build.VERSION.SDK_INT == 25) {
                eq.a(toast);
            }
            toast.show();
        }
    }

    public a(Activity activity) {
        this.f25357b = activity;
        this.f25356a = activity.getResources();
    }

    public void a() {
        try {
            e.a("PushSelfShowLog", "creat shortcut");
            Intent intent = new Intent();
            intent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
            Bitmap decodeResource = BitmapFactory.decodeResource(this.f25357b.getResources(), d.g(this.f25357b, "hwpush_main_icon"));
            intent.putExtra("android.intent.extra.shortcut.NAME", this.f25357b.getResources().getString(d.a(this.f25357b, "hwpush_msg_collect")));
            intent.putExtra("android.intent.extra.shortcut.ICON", decodeResource);
            intent.putExtra("duplicate", false);
            Intent intent2 = new Intent("com.huawei.android.push.intent.RICHPUSH");
            intent2.putExtra("type", "favorite");
            intent2.addFlags(1476395008);
            String str = "com.huawei.android.pushagent";
            if (!com.huawei.android.pushselfshow.utils.a.b((Context) this.f25357b, str)) {
                str = this.f25357b.getPackageName();
            }
            intent2.setPackage(str);
            intent.putExtra("android.intent.extra.shortcut.INTENT", intent2);
            this.f25357b.sendBroadcast(intent);
        } catch (Exception e2) {
            e.d("PushSelfShowLog", "creat shortcut error", e2);
        }
    }

    public void a(com.huawei.android.pushselfshow.b.a aVar) {
        this.f25358c = aVar;
    }

    public void b() {
        try {
            if (this.f25358c == null || this.f25358c.D == null) {
                _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(this.f25357b, com.huawei.android.pushselfshow.utils.a.a((Context) this.f25357b, "内容保存失败", "Save Failed"), 0));
            } else {
                e.e("PushSelfShowLog", "the rpl is " + this.f25358c.D);
                String substring = this.f25358c.D.startsWith("file://") ? this.f25358c.D.substring(7) : this.f25358c.D;
                e.e("PushSelfShowLog", "filePath is " + substring);
                if ("text/html_local".equals(this.f25358c.F)) {
                    File parentFile = new File(substring).getParentFile();
                    if (parentFile != null && parentFile.isDirectory() && this.f25358c.D.contains("richpush")) {
                        String absolutePath = parentFile.getAbsolutePath();
                        String replace = absolutePath.replace("richpush", "shotcut");
                        e.b("PushSelfShowLog", "srcDir is %s ,destDir is %s", absolutePath, replace);
                        if (com.huawei.android.pushselfshow.utils.a.a(absolutePath, replace)) {
                            this.f25358c.D = Uri.fromFile(new File(replace + File.separator + "index.html")).toString();
                        } else {
                            _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(this.f25357b, com.huawei.android.pushselfshow.utils.a.a((Context) this.f25357b, "内容保存失败", "Save Failed"), 0));
                            return;
                        }
                    }
                }
                e.a("PushSelfShowLog", "insert data into db");
                a();
                boolean a2 = c.a(this.f25357b, this.f25358c.r, this.f25358c);
                e.e("PushSelfShowLog", "insert result is " + a2);
                if (a2) {
                    com.huawei.android.pushselfshow.utils.a.a((Context) this.f25357b, "14", this.f25358c);
                } else {
                    e.d("PushSelfShowLog", "save icon fail");
                }
            }
        } catch (Exception e2) {
            e.c("PushSelfShowLog", "SaveBtnClickListener error ", e2);
        }
    }
}
