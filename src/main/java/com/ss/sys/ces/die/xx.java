package com.ss.sys.ces.die;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.widget.Toast;
import com.ss.android.ugc.aweme.utils.eq;
import com.ss.sys.ces.b;

public class xx {

    /* renamed from: a  reason: collision with root package name */
    static Context f78512a = b.f78487a;

    public static void HelloKitty(int i) {
        final String str = "APP ERROR !!!";
        if (i == 1) {
            str = "[-] 检测到您设备环境不安全, 请勿进行异常操作";
        } else if (i == 2) {
            str = "[-] 检测到您当前安装的软件为非官方版本, 为了保证正常安全浏览请点击下载安装官方版本";
        }
        new Thread() {
            public final void run() {
                Looper.prepare();
                Toast makeText = Toast.makeText(xx.f78512a, str, 1);
                if (Build.VERSION.SDK_INT == 25) {
                    eq.a(makeText);
                }
                makeText.show();
                Looper.loop();
            }
        }.start();
    }
}
