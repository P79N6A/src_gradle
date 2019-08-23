package com.ss.android.agilelogger.e;

import com.ss.android.agilelogger.f.b;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    protected SimpleDateFormat f27915a = new SimpleDateFormat("yyyy-MM-dd z HH:mm:ss.SSS", Locale.getDefault());

    /* renamed from: com.ss.android.agilelogger.e.b$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27916a = new int[b.a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.ss.android.agilelogger.f.b$a[] r0 = com.ss.android.agilelogger.f.b.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27916a = r0
                int[] r0 = f27916a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.android.agilelogger.f.b$a r1 = com.ss.android.agilelogger.f.b.a.MSG     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f27916a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.android.agilelogger.f.b$a r1 = com.ss.android.agilelogger.f.b.a.STACKTRACE_STR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f27916a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.ss.android.agilelogger.f.b$a r1 = com.ss.android.agilelogger.f.b.a.BORDER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f27916a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.ss.android.agilelogger.f.b$a r1 = com.ss.android.agilelogger.f.b.a.JSON     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f27916a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.ss.android.agilelogger.f.b$a r1 = com.ss.android.agilelogger.f.b.a.BUNDLE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f27916a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.ss.android.agilelogger.f.b$a r1 = com.ss.android.agilelogger.f.b.a.INTENT     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f27916a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.ss.android.agilelogger.f.b$a r1 = com.ss.android.agilelogger.f.b.a.THROWABLE     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f27916a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.ss.android.agilelogger.f.b$a r1 = com.ss.android.agilelogger.f.b.a.THREAD     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f27916a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.ss.android.agilelogger.f.b$a r1 = com.ss.android.agilelogger.f.b.a.STACKTRACE     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.agilelogger.e.b.AnonymousClass1.<clinit>():void");
        }
    }
}
