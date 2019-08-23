package b.a.a.a;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import b.a.a.a.e;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentHashMap<String, e> f1625a = new ConcurrentHashMap<>();

    public static e a(@NonNull String str) {
        e eVar;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("param 'aid' is not allowed to assigned empty string");
        } else if (f1625a.get(str) != null) {
            return f1625a.get(str);
        } else {
            synchronized (f.class) {
                if (f1625a.get(str) != null) {
                    eVar = f1625a.get(str);
                } else {
                    throw new RuntimeException("please call init method before this");
                }
            }
            return eVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(@android.support.annotation.NonNull java.lang.String r2, @android.support.annotation.NonNull java.util.List<java.lang.String> r3) {
        /*
            java.lang.Class<b.a.a.a.f> r0 = b.a.a.a.f.class
            monitor-enter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0019 }
            if (r1 != 0) goto L_0x0017
            boolean r1 = b.a.a.a.c.a(r3)     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0010
            goto L_0x0017
        L_0x0010:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> r1 = b.a.a.a.e.h     // Catch:{ all -> 0x0019 }
            r1.put(r2, r3)     // Catch:{ all -> 0x0019 }
            monitor-exit(r0)
            return
        L_0x0017:
            monitor-exit(r0)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.f.a(java.lang.String, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void b(@android.support.annotation.NonNull java.lang.String r2, @android.support.annotation.NonNull java.util.List<java.lang.String> r3) {
        /*
            java.lang.Class<b.a.a.a.f> r0 = b.a.a.a.f.class
            monitor-enter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0019 }
            if (r1 != 0) goto L_0x0017
            boolean r1 = b.a.a.a.c.a(r3)     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0010
            goto L_0x0017
        L_0x0010:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> r1 = b.a.a.a.e.i     // Catch:{ all -> 0x0019 }
            r1.put(r2, r3)     // Catch:{ all -> 0x0019 }
            monitor-exit(r0)
            return
        L_0x0017:
            monitor-exit(r0)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.f.b(java.lang.String, java.util.List):void");
    }

    public static synchronized void a(@NonNull Context context, @NonNull String str, @NonNull JSONObject jSONObject, e.a aVar) {
        synchronized (f.class) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("param 'aid' is not allowed to assigned empty string");
            } else if (jSONObject == null) {
                throw new IllegalArgumentException("param 'headerInfo' is not allowed to be null");
            } else if (f1625a.get(str) == null) {
                f1625a.put(str, new e(context, str, jSONObject, aVar));
            }
        }
    }
}
