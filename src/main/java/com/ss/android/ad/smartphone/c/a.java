package com.ss.android.ad.smartphone.c;

import android.os.Handler;
import java.util.HashMap;

public final class a {

    /* renamed from: com.ss.android.ad.smartphone.c.a$a  reason: collision with other inner class name */
    public interface C0239a {
        void a(com.ss.android.ad.smartphone.a.a.a aVar);
    }

    public static void a(String str, HashMap<String, String> hashMap, String str2, int i, C0239a aVar) {
        final Handler handler = new Handler();
        final String str3 = str;
        final HashMap<String, String> hashMap2 = hashMap;
        final String str4 = str2;
        final int i2 = i;
        final C0239a aVar2 = aVar;
        AnonymousClass1 r0 = new Runnable() {
            public final void run() {
                final com.ss.android.ad.smartphone.a.a.a a2 = c.a(str3, hashMap2, str4, i2);
                handler.post(new Runnable() {
                    public final void run() {
                        aVar2.a(a2);
                    }
                });
            }
        };
        new Thread(r0).start();
    }
}
