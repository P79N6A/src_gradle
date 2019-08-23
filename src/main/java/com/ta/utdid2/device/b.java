package com.ta.utdid2.device;

import android.content.Context;
import com.ta.utdid2.b.a.g;
import com.ta.utdid2.b.a.i;
import java.util.zip.Adler32;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static a f78874a = null;

    /* renamed from: e  reason: collision with root package name */
    static final Object f78875e = new Object();
    static String k = "d6fc3a4a06adbde89223bvefedc24fecde188aaa9161";

    public static synchronized a b(Context context) {
        synchronized (b.class) {
            if (f78874a != null) {
                a aVar = f78874a;
                return aVar;
            } else if (context == null) {
                return null;
            } else {
                a a2 = a(context);
                f78874a = a2;
                return a2;
            }
        }
    }

    static long a(a aVar) {
        if (aVar != null) {
            String format = String.format("%s%s%s%s%s", new Object[]{aVar.f(), aVar.getDeviceId(), Long.valueOf(aVar.a()), aVar.e(), aVar.d()});
            if (!i.a(format)) {
                Adler32 adler32 = new Adler32();
                adler32.reset();
                adler32.update(format.getBytes());
                return adler32.getValue();
            }
        }
        return 0;
    }

    private static a a(Context context) {
        if (context != null) {
            new a();
            synchronized (f78875e) {
                String value = c.a(context).getValue();
                if (!i.a(value)) {
                    if (value.endsWith("\n")) {
                        value = value.substring(0, value.length() - 1);
                    }
                    a aVar = new a();
                    long currentTimeMillis = System.currentTimeMillis();
                    String a2 = g.a(context);
                    String b2 = g.b(context);
                    aVar.d(a2);
                    aVar.b(a2);
                    aVar.b(currentTimeMillis);
                    aVar.c(b2);
                    aVar.e(value);
                    aVar.a(a(aVar));
                    return aVar;
                }
            }
        }
        return null;
    }
}
