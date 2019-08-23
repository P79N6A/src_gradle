package com.bytedance.crash.runtime;

import android.content.Context;
import android.support.annotation.Nullable;
import com.bytedance.crash.e.c;
import com.bytedance.crash.i.d;
import com.bytedance.crash.i.h;
import com.bytedance.crash.nativecrash.b;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private Context f19556a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, Object> f19557b;

    public final void a() {
        Context context = this.f19556a;
        String str = b.a(context).f19495b;
        File file = new File(h.b(context), str);
        File file2 = new File(file, str + ".header");
        c cVar = new c(this.f19556a);
        cVar.a((Map) this.f19557b);
        try {
            d.a(file2, cVar.f19421a.toString(), false);
        } catch (IOException unused) {
        }
    }

    @Nullable
    public static JSONObject a(File file) {
        try {
            File a2 = h.a(file, ".header");
            if (a2.exists()) {
                return new JSONObject(d.b(a2.getAbsolutePath()));
            }
        } catch (IOException | JSONException unused) {
        }
        return null;
    }

    private j(Context context, Map<String, Object> map) {
        this.f19556a = context;
        this.f19557b = map;
    }

    public static j a(Context context, Map<String, Object> map) {
        return new j(context, map);
    }
}
