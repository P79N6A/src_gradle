package com.google.common.a;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

@GwtCompatible
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2357a;

    /* renamed from: b  reason: collision with root package name */
    private final v f2358b;

    /* renamed from: c  reason: collision with root package name */
    private long f2359c;

    /* renamed from: d  reason: collision with root package name */
    private long f2360d;

    /* renamed from: com.google.common.a.q$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f24416a = new int[TimeUnit.values().length];

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
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24416a = r0
                int[] r0 = f24416a     // Catch:{ NoSuchFieldError -> 0x0014 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f24416a     // Catch:{ NoSuchFieldError -> 0x001f }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f24416a     // Catch:{ NoSuchFieldError -> 0x002a }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f24416a     // Catch:{ NoSuchFieldError -> 0x0035 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f24416a     // Catch:{ NoSuchFieldError -> 0x0040 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f24416a     // Catch:{ NoSuchFieldError -> 0x004b }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.HOURS     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f24416a     // Catch:{ NoSuchFieldError -> 0x0056 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.a.q.AnonymousClass1.<clinit>():void");
        }
    }

    public static q a() {
        return new q();
    }

    @CanIgnoreReturnValue
    public final q e() {
        this.f2359c = 0;
        this.f2357a = false;
        return this;
    }

    q() {
        this.f2358b = v.b();
    }

    public static q b() {
        return new q().c();
    }

    private long f() {
        if (this.f2357a) {
            return (this.f2358b.a() - this.f2360d) + this.f2359c;
        }
        return this.f2359c;
    }

    @CanIgnoreReturnValue
    public final q c() {
        m.b(!this.f2357a, (Object) "This stopwatch is already running.");
        this.f2357a = true;
        this.f2360d = this.f2358b.a();
        return this;
    }

    @CanIgnoreReturnValue
    public final q d() {
        long a2 = this.f2358b.a();
        m.b(this.f2357a, (Object) "This stopwatch is already stopped.");
        this.f2357a = false;
        this.f2359c += a2 - this.f2360d;
        return this;
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long f2 = f();
        if (TimeUnit.DAYS.convert(f2, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (TimeUnit.HOURS.convert(f2, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (TimeUnit.MINUTES.convert(f2, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (TimeUnit.SECONDS.convert(f2, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (TimeUnit.MILLISECONDS.convert(f2, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else if (TimeUnit.MICROSECONDS.convert(f2, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MICROSECONDS;
        } else {
            timeUnit = TimeUnit.NANOSECONDS;
        }
        double d2 = (double) f2;
        double convert = (double) TimeUnit.NANOSECONDS.convert(1, timeUnit);
        Double.isNaN(d2);
        Double.isNaN(convert);
        double d3 = d2 / convert;
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(Locale.ROOT, "%.4g", new Object[]{Double.valueOf(d3)}));
        sb.append(" ");
        switch (AnonymousClass1.f24416a[timeUnit.ordinal()]) {
            case 1:
                str = NotificationStyle.NOTIFICATION_STYLE;
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = NotifyType.SOUND;
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case e.l /*7*/:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        sb.append(str);
        return sb.toString();
    }

    public static q a(v vVar) {
        return new q(vVar).c();
    }

    private q(v vVar) {
        this.f2358b = (v) m.a(vVar, (Object) "ticker");
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(f(), TimeUnit.NANOSECONDS);
    }
}
