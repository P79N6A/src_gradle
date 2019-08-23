package com.bytedance.apm.b;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Printer;
import com.bytedance.common.utility.LooperPrinterUtils;
import com.bytedance.services.apm.api.c;
import org.json.JSONObject;

public class a implements c, com.bytedance.services.slardar.config.a {

    /* renamed from: a  reason: collision with root package name */
    private static final Printer f1918a = new Printer() {
        public final void println(String str) {
            if (!TextUtils.isEmpty(str)) {
                if (str.startsWith(">>>>> Dispatching")) {
                    b a2 = b.a();
                    a2.f18891a.postDelayed(a2.f18893c, a2.f18894d);
                }
                if (str.startsWith("<<<<< Finished")) {
                    b.a().b();
                }
            }
        }
    };

    public final void c(Activity activity) {
    }

    public final void d(Activity activity) {
    }

    public void onReady() {
    }

    public static void a() {
        LooperPrinterUtils.addMessageLogging(f1918a);
    }

    public final void b(Activity activity) {
        a();
    }

    public final void a(Activity activity) {
        LooperPrinterUtils.removeMessageLogging(f1918a);
        b.a().b();
    }

    public void onRefresh(JSONObject jSONObject, boolean z) {
        long optLong = jSONObject.optLong("caton_interval", 1000);
        if (optLong < 70) {
            optLong = 1000;
        }
        b.a().f18894d = optLong;
    }
}
