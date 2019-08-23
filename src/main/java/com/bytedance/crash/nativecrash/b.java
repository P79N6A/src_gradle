package com.bytedance.crash.nativecrash;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bytedance.crash.i.h;
import java.io.File;
import java.util.UUID;

public class b {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: c  reason: collision with root package name */
    private static volatile b f19493c;

    /* renamed from: a  reason: collision with root package name */
    public Context f19494a;

    /* renamed from: b  reason: collision with root package name */
    public String f19495b;

    private b(Context context) {
        this.f19494a = context;
        a(h.b(context).getAbsolutePath());
    }

    public static b a(Context context) {
        if (f19493c == null) {
            synchronized (b.class) {
                if (f19493c == null) {
                    f19493c = new b(context);
                }
            }
        }
        return f19493c;
    }

    private void a(String str) {
        String uuid;
        do {
            uuid = UUID.randomUUID().toString();
        } while (new File(str, uuid).exists());
        this.f19495b = uuid;
    }
}
