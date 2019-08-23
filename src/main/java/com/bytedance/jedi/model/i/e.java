package com.bytedance.jedi.model.i;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.c.a.c;
import com.c.a.d;

public final class e implements com.c.a.a {
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    private final c f21715a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final String f21716b;

    public static class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        c f21717a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        String f21718b;

        private a() {
            this.f21718b = "PRETTY_LOGGER";
        }

        @NonNull
        public final e a() {
            if (this.f21717a == null) {
                this.f21717a = new d();
            }
            return new e(this, (byte) 0);
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        @NonNull
        public final a a(@Nullable String str) {
            this.f21718b = str;
            return this;
        }
    }

    @NonNull
    public static a a() {
        return new a((byte) 0);
    }

    private e(@NonNull a aVar) {
        a(aVar);
        this.f21715a = aVar.f21717a;
        this.f21716b = aVar.f21718b;
    }

    @NonNull
    private static <T> T a(@Nullable T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* synthetic */ e(a aVar, byte b2) {
        this(aVar);
    }

    private void a(int i, @Nullable String str) {
        c(i, str, "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
    }

    private void c(int i, @Nullable String str, @NonNull String str2) {
        a(str2);
        this.f21715a.a(i, str, str2);
    }

    private void b(int i, @Nullable String str, @NonNull String str2) {
        a(str2);
        for (String str3 : str2.split(System.getProperty("line.separator"))) {
            c(i, str, "│ " + str3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0074 A[LOOP:1: B:31:0x0074->B:32:0x0076, LOOP_START, PHI: r0 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:28:0x006b, B:32:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r8, @android.support.annotation.Nullable java.lang.String r9, @android.support.annotation.NonNull java.lang.String r10) {
        /*
            r7 = this;
            a(r10)
            r0 = 0
            r1 = 1
            if (r9 == 0) goto L_0x0010
            int r2 = r9.length()
            if (r2 != 0) goto L_0x000e
            goto L_0x0010
        L_0x000e:
            r2 = 0
            goto L_0x0011
        L_0x0010:
            r2 = 1
        L_0x0011:
            if (r2 != 0) goto L_0x005d
            java.lang.String r2 = r7.f21716b
            if (r2 != r9) goto L_0x0018
            goto L_0x0044
        L_0x0018:
            if (r2 == 0) goto L_0x0043
            if (r9 == 0) goto L_0x0043
            int r3 = r2.length()
            int r4 = r9.length()
            if (r3 != r4) goto L_0x0043
            boolean r4 = r2 instanceof java.lang.String
            if (r4 == 0) goto L_0x0033
            boolean r4 = r9 instanceof java.lang.String
            if (r4 == 0) goto L_0x0033
            boolean r1 = r2.equals(r9)
            goto L_0x0044
        L_0x0033:
            r4 = 0
        L_0x0034:
            if (r4 >= r3) goto L_0x0044
            char r5 = r2.charAt(r4)
            char r6 = r9.charAt(r4)
            if (r5 != r6) goto L_0x0043
            int r4 = r4 + 1
            goto L_0x0034
        L_0x0043:
            r1 = 0
        L_0x0044:
            if (r1 != 0) goto L_0x005d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r7.f21716b
            r1.append(r2)
            java.lang.String r2 = "-"
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            goto L_0x005f
        L_0x005d:
            java.lang.String r9 = r7.f21716b
        L_0x005f:
            java.lang.String r1 = "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────"
            r7.c(r8, r9, r1)
            byte[] r1 = r10.getBytes()
            int r2 = r1.length
            r3 = 4000(0xfa0, float:5.605E-42)
            if (r2 > r3) goto L_0x0074
            r7.b(r8, r9, r10)
            r7.a(r8, r9)
            return
        L_0x0074:
            if (r0 >= r2) goto L_0x0087
            int r10 = r2 - r0
            int r10 = java.lang.Math.min(r10, r3)
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1, r0, r10)
            r7.b(r8, r9, r4)
            int r0 = r0 + 4000
            goto L_0x0074
        L_0x0087:
            r7.a(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.model.i.e.a(int, java.lang.String, java.lang.String):void");
    }
}
