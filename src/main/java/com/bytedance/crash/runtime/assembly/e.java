package com.bytedance.crash.runtime.assembly;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.crash.d;
import com.bytedance.crash.e.a;
import com.bytedance.crash.e.c;
import com.bytedance.crash.j;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

public final class e {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    public static volatile e f19527a;

    /* renamed from: b  reason: collision with root package name */
    private Context f19528b;

    /* renamed from: c  reason: collision with root package name */
    private Map<d, c> f19529c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private b f19530d;

    /* renamed from: e  reason: collision with root package name */
    private BatteryWatcher f19531e;

    /* renamed from: com.bytedance.crash.runtime.assembly.e$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f19532a = new int[d.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.bytedance.crash.d[] r0 = com.bytedance.crash.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19532a = r0
                int[] r0 = f19532a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bytedance.crash.d r1 = com.bytedance.crash.d.JAVA     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f19532a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bytedance.crash.d r1 = com.bytedance.crash.d.LAUNCH     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f19532a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.bytedance.crash.d r1 = com.bytedance.crash.d.NATIVE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f19532a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.bytedance.crash.d r1 = com.bytedance.crash.d.ANR     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f19532a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.bytedance.crash.d r1 = com.bytedance.crash.d.DART     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f19532a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.bytedance.crash.d r1 = com.bytedance.crash.d.CUSTOM_JAVA     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f19532a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.bytedance.crash.d r1 = com.bytedance.crash.d.BLOCK     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f19532a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.bytedance.crash.d r1 = com.bytedance.crash.d.ENSURE     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.runtime.assembly.e.AnonymousClass1.<clinit>():void");
        }
    }

    public static e a() {
        if (f19527a != null) {
            return f19527a;
        }
        throw new IllegalArgumentException("CrashContextAssembly not init");
    }

    public e(@NonNull Context context) {
        this.f19528b = context;
        this.f19530d = new b(this.f19528b);
        this.f19531e = new BatteryWatcher(this.f19528b);
    }

    public final a a(List<a> list) {
        if (list.isEmpty()) {
            return null;
        }
        a aVar = new a();
        JSONArray jSONArray = new JSONArray();
        for (a aVar2 : list) {
            jSONArray.put(aVar2.f19417a);
        }
        aVar.a("data", (Object) jSONArray);
        c a2 = c.a(this.f19528b);
        a2.a((Map) j.a().a());
        a2.a(j.c().a());
        a2.a(j.a().f19511a.c());
        aVar.a(a2);
        return aVar;
    }

    @Nullable
    private c a(d dVar) {
        c cVar = this.f19529c.get(dVar);
        if (cVar != null) {
            return cVar;
        }
        switch (AnonymousClass1.f19532a[dVar.ordinal()]) {
            case 1:
                cVar = new i(this.f19528b, this.f19530d, this.f19531e);
                break;
            case 2:
                cVar = new j(this.f19528b, this.f19530d, this.f19531e);
                break;
            case 3:
                cVar = new k(this.f19528b, this.f19530d, this.f19531e);
                break;
            case 4:
                cVar = new a(this.f19528b, this.f19530d, this.f19531e);
                break;
            case 5:
                cVar = new g(this.f19528b, this.f19530d, this.f19531e);
                break;
            case 6:
                cVar = new f(this.f19528b, this.f19530d, this.f19531e);
                break;
            case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*?: ONE_ARG  (7 int)*/:
                cVar = new d(this.f19528b, this.f19530d, this.f19531e);
                break;
            case 8:
                cVar = new h(this.f19528b, this.f19530d, this.f19531e);
                break;
        }
        if (cVar != null) {
            this.f19529c.put(dVar, cVar);
        }
        return cVar;
    }

    public final a a(d dVar, a aVar) {
        if (dVar == null) {
            return aVar;
        }
        c a2 = a(dVar);
        if (a2 != null) {
            return a2.a(aVar);
        }
        return aVar;
    }
}
