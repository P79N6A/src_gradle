package com.bytedance.ies.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.LruCache;
import com.bytedance.common.utility.persistent.SharedPrefsEditorCompat;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.q.c;
import java.util.Set;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static LruCache<String, b> f20603b = null;

    /* renamed from: d  reason: collision with root package name */
    private static String f20604d = "default_app_sp";

    /* renamed from: e  reason: collision with root package name */
    private static int f20605e = 3;

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f20606a;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences.Editor f20607c;

    /* renamed from: com.bytedance.ies.e.b$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f20608a = new int[a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.bytedance.ies.e.b$a[] r0 = com.bytedance.ies.e.b.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20608a = r0
                int[] r0 = f20608a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bytedance.ies.e.b$a r1 = com.bytedance.ies.e.b.a.STRING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f20608a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bytedance.ies.e.b$a r1 = com.bytedance.ies.e.b.a.INTEGER     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f20608a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.bytedance.ies.e.b$a r1 = com.bytedance.ies.e.b.a.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f20608a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.bytedance.ies.e.b$a r1 = com.bytedance.ies.e.b.a.FLOAT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f20608a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.bytedance.ies.e.b$a r1 = com.bytedance.ies.e.b.a.LONG     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f20608a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.bytedance.ies.e.b$a r1 = com.bytedance.ies.e.b.a.STRING_SET     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f20608a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.bytedance.ies.e.b$a r1 = com.bytedance.ies.e.b.a.ALL     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.e.b.AnonymousClass1.<clinit>():void");
        }
    }

    enum a {
        STRING,
        INTEGER,
        BOOLEAN,
        FLOAT,
        LONG,
        STRING_SET,
        ALL
    }

    private void b() {
        if (this.f20607c == null) {
            this.f20607c = this.f20606a.edit();
        }
    }

    public final void a() {
        if (this.f20607c != null) {
            SharedPrefsEditorCompat.apply(this.f20607c);
        }
    }

    public static b a(Context context) {
        return a(context, f20604d);
    }

    private b(Context context, String str) {
        this.f20606a = c.a(context, str, 0);
    }

    public final String a(String str, String str2) {
        return (String) a(str, a.STRING, str2);
    }

    public final int a(String str, int i) {
        return ((Integer) a(str, a.INTEGER, Integer.valueOf(i))).intValue();
    }

    public static b a(Context context, String str) {
        if (context != null) {
            if (f20603b == null) {
                f20603b = new LruCache<>(f20605e);
            }
            b bVar = f20603b.get(str);
            if (bVar != null) {
                return bVar;
            }
            b bVar2 = new b(context, str);
            f20603b.put(str, bVar2);
            return bVar2;
        }
        throw new NullPointerException("null context!!");
    }

    public final long a(String str, long j) {
        return ((Long) a(str, a.LONG, Long.valueOf(j))).longValue();
    }

    public final b a(String str, Object obj) {
        b();
        if (obj instanceof String) {
            this.f20607c.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            this.f20607c.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            this.f20607c.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            this.f20607c.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            this.f20607c.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Set) {
            this.f20607c.putStringSet(str, (Set) obj);
        } else {
            this.f20607c.putString(str, String.valueOf(obj));
        }
        return this;
    }

    public final boolean a(String str, boolean z) {
        return ((Boolean) a(str, a.BOOLEAN, Boolean.valueOf(z))).booleanValue();
    }

    private <T> T a(String str, a aVar, Object obj) {
        switch (AnonymousClass1.f20608a[aVar.ordinal()]) {
            case 1:
                return this.f20606a.getString(str, (String) obj);
            case 2:
                return Integer.valueOf(this.f20606a.getInt(str, ((Integer) obj).intValue()));
            case 3:
                return Boolean.valueOf(this.f20606a.getBoolean(str, ((Boolean) obj).booleanValue()));
            case 4:
                return Float.valueOf(this.f20606a.getFloat(str, ((Float) obj).floatValue()));
            case 5:
                return Long.valueOf(this.f20606a.getLong(str, ((Long) obj).longValue()));
            case 6:
                return this.f20606a.getStringSet(str, (Set) obj);
            case e.l /*?: ONE_ARG  (7 int)*/:
                return this.f20606a.getAll();
            default:
                return obj;
        }
    }
}
