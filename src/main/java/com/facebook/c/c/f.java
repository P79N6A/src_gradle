package com.facebook.c.c;

import java.util.Locale;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    final a f23407a;

    /* renamed from: b  reason: collision with root package name */
    final float[] f23408b;

    /* renamed from: c  reason: collision with root package name */
    private float[] f23409c;

    /* renamed from: com.facebook.c.c.f$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f23410a = new int[C0252f.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0052 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0068 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0073 */
        static {
            /*
                com.facebook.c.c.f$a[] r0 = com.facebook.c.c.f.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23411b = r0
                r0 = 1
                int[] r1 = f23411b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.facebook.c.c.f$a r2 = com.facebook.c.c.f.a.RELATIVE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f23411b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.facebook.c.c.f$a r3 = com.facebook.c.c.f.a.ABSOLUTE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                com.facebook.c.c.f$f[] r2 = com.facebook.c.c.f.C0252f.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f23410a = r2
                int[] r2 = f23410a     // Catch:{ NoSuchFieldError -> 0x0032 }
                com.facebook.c.c.f$f r3 = com.facebook.c.c.f.C0252f.m     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f23410a     // Catch:{ NoSuchFieldError -> 0x003c }
                com.facebook.c.c.f$f r2 = com.facebook.c.c.f.C0252f.M     // Catch:{ NoSuchFieldError -> 0x003c }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                int[] r0 = f23410a     // Catch:{ NoSuchFieldError -> 0x0047 }
                com.facebook.c.c.f$f r1 = com.facebook.c.c.f.C0252f.q     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r0 = f23410a     // Catch:{ NoSuchFieldError -> 0x0052 }
                com.facebook.c.c.f$f r1 = com.facebook.c.c.f.C0252f.Q     // Catch:{ NoSuchFieldError -> 0x0052 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0052 }
            L_0x0052:
                int[] r0 = f23410a     // Catch:{ NoSuchFieldError -> 0x005d }
                com.facebook.c.c.f$f r1 = com.facebook.c.c.f.C0252f.c     // Catch:{ NoSuchFieldError -> 0x005d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                int[] r0 = f23410a     // Catch:{ NoSuchFieldError -> 0x0068 }
                com.facebook.c.c.f$f r1 = com.facebook.c.c.f.C0252f.C     // Catch:{ NoSuchFieldError -> 0x0068 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0068 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0068 }
            L_0x0068:
                int[] r0 = f23410a     // Catch:{ NoSuchFieldError -> 0x0073 }
                com.facebook.c.c.f$f r1 = com.facebook.c.c.f.C0252f.l     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r0 = f23410a     // Catch:{ NoSuchFieldError -> 0x007f }
                com.facebook.c.c.f$f r1 = com.facebook.c.c.f.C0252f.L     // Catch:{ NoSuchFieldError -> 0x007f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007f }
            L_0x007f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.c.c.f.AnonymousClass1.<clinit>():void");
        }
    }

    enum a {
        RELATIVE,
        ABSOLUTE
    }

    public static class b extends f {
        public final void a(com.facebook.c.a aVar) {
            a(aVar, this.f23407a, this.f23408b);
        }

        public b(a aVar, float[] fArr) {
            super(aVar, fArr);
        }

        /* access modifiers changed from: protected */
        public final void a(com.facebook.c.a aVar, a aVar2, float[] fArr) {
            switch (aVar2) {
                case RELATIVE:
                    aVar.b(fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5]);
                    return;
                case ABSOLUTE:
                    aVar.a(fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5]);
                    return;
                default:
                    throw new IllegalArgumentException(String.format(Locale.US, "No such argument format %s", new Object[]{aVar2}));
            }
        }
    }

    public static class c extends f {
        public final void a(com.facebook.c.a aVar) {
            a(aVar, this.f23407a, this.f23408b);
        }

        public c(a aVar, float[] fArr) {
            super(aVar, fArr);
        }

        /* access modifiers changed from: protected */
        public final void a(com.facebook.c.a aVar, a aVar2, float[] fArr) {
            switch (aVar2) {
                case RELATIVE:
                    aVar.d(fArr[0], fArr[1]);
                    return;
                case ABSOLUTE:
                    aVar.c(fArr[0], fArr[1]);
                    return;
                default:
                    throw new IllegalArgumentException(String.format(Locale.US, "No such argument format %s", new Object[]{aVar2}));
            }
        }
    }

    public static class d extends f {
        public final void a(com.facebook.c.a aVar) {
            a(aVar, this.f23407a, this.f23408b);
        }

        public d(a aVar, float[] fArr) {
            super(aVar, fArr);
        }

        public final void a(f fVar, float f2, com.facebook.c.a aVar) {
            if (fVar instanceof d) {
                f.super.a(fVar, f2, aVar);
                return;
            }
            throw new IllegalArgumentException("MoveToCommand should only be interpolated with other instances of MoveToCommand");
        }

        /* access modifiers changed from: protected */
        public final void a(com.facebook.c.a aVar, a aVar2, float[] fArr) {
            switch (aVar2) {
                case RELATIVE:
                    aVar.b(fArr[0], fArr[1]);
                    return;
                case ABSOLUTE:
                    aVar.a(fArr[0], fArr[1]);
                    return;
                default:
                    throw new IllegalArgumentException(String.format(Locale.US, "No such argument format %s", new Object[]{aVar2}));
            }
        }
    }

    public static class e extends f {
        public final void a(com.facebook.c.a aVar) {
            a(aVar, this.f23407a, this.f23408b);
        }

        public e(a aVar, float[] fArr) {
            super(aVar, fArr);
        }

        /* access modifiers changed from: protected */
        public final void a(com.facebook.c.a aVar, a aVar2, float[] fArr) {
            switch (aVar2) {
                case RELATIVE:
                    aVar.b(fArr[0], fArr[1], fArr[2], fArr[3]);
                    return;
                case ABSOLUTE:
                    aVar.a(fArr[0], fArr[1], fArr[2], fArr[3]);
                    return;
                default:
                    throw new IllegalArgumentException(String.format(Locale.US, "No such argument format %s", new Object[]{aVar2}));
            }
        }
    }

    /* renamed from: com.facebook.c.c.f$f  reason: collision with other inner class name */
    enum C0252f {
        m(a.RELATIVE, 2),
        M(a.ABSOLUTE, 2),
        q(a.RELATIVE, 4),
        Q(a.ABSOLUTE, 4),
        c(a.RELATIVE, 6),
        C(a.ABSOLUTE, 6),
        l(a.RELATIVE, 2),
        L(a.ABSOLUTE, 2);
        
        public final int argCount;
        public final a argFormat;

        private C0252f(a aVar, int i) {
            this.argFormat = aVar;
            this.argCount = i;
        }
    }

    public abstract void a(com.facebook.c.a aVar);

    /* access modifiers changed from: protected */
    public abstract void a(com.facebook.c.a aVar, a aVar2, float[] fArr);

    private int a() {
        return this.f23408b.length;
    }

    private float[] b() {
        if (this.f23409c == null) {
            this.f23409c = new float[this.f23408b.length];
        }
        return this.f23409c;
    }

    public static f a(String str) {
        C0252f valueOf = C0252f.valueOf(str.substring(0, 1));
        String[] split = str.substring(1).split(",");
        float[] fArr = new float[split.length];
        int length = split.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            fArr[i2] = Float.parseFloat(split[i]);
            i++;
            i2++;
        }
        switch (AnonymousClass1.f23410a[valueOf.ordinal()]) {
            case 1:
            case 2:
                if (a(valueOf, fArr)) {
                    return new d(valueOf.argFormat, fArr);
                }
                throw new IllegalArgumentException(String.format(Locale.US, "VectorCommand MoveTo requires two arguments, but got %s", new Object[]{fArr.toString()}));
            case 3:
            case 4:
                if (a(valueOf, fArr)) {
                    return new e(valueOf.argFormat, fArr);
                }
                throw new IllegalArgumentException(String.format(Locale.US, "VectorCommand QuadraticTo requires four arguments, but got %s", new Object[]{fArr.toString()}));
            case 5:
            case 6:
                if (a(valueOf, fArr)) {
                    return new b(valueOf.argFormat, fArr);
                }
                throw new IllegalArgumentException(String.format(Locale.US, "VectorCommand CubicTo requires six arguments, but got %s", new Object[]{fArr.toString()}));
            case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*?: ONE_ARG  (7 int)*/:
            case 8:
                if (a(valueOf, fArr)) {
                    return new c(valueOf.argFormat, fArr);
                }
                throw new IllegalArgumentException(String.format(Locale.US, "VectorCommand LineTo requires two arguments, but got %s", new Object[]{fArr.toString()}));
            default:
                throw new IllegalArgumentException(String.format(Locale.US, "Unhandled vector command: %s", new Object[]{str}));
        }
    }

    public f(a aVar, float[] fArr) {
        this.f23407a = aVar;
        this.f23408b = fArr;
    }

    private static boolean a(C0252f fVar, float[] fArr) {
        if (fVar.argCount == fArr.length) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052 A[LOOP:0: B:11:0x0050->B:12:0x0052, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.facebook.c.c.f r9, float r10, com.facebook.c.a r11) {
        /*
            r8 = this;
            com.facebook.c.c.f$a r0 = r8.f23407a
            com.facebook.c.c.f$a r1 = r9.f23407a
            if (r0 != r1) goto L_0x0065
            int r0 = r8.a()
            int r1 = r9.a()
            if (r0 <= r1) goto L_0x0024
            float[] r0 = r8.f23408b
            float[] r1 = r11.f23302b
            float[] r9 = r9.f23408b
            float[] r2 = r8.b()
            float[] r9 = a((float[]) r1, (float[]) r9, (float[]) r2)
            float[] r1 = r8.b()
        L_0x0022:
            r2 = r8
            goto L_0x004e
        L_0x0024:
            int r0 = r8.a()
            int r1 = r9.a()
            if (r0 >= r1) goto L_0x0045
            float[] r0 = r11.f23302b
            float[] r1 = r8.f23408b
            float[] r2 = r9.b()
            float[] r0 = a((float[]) r0, (float[]) r1, (float[]) r2)
            float[] r1 = r9.f23408b
            float[] r2 = r9.b()
            r7 = r2
            r2 = r9
            r9 = r1
            r1 = r7
            goto L_0x004e
        L_0x0045:
            float[] r0 = r8.f23408b
            float[] r9 = r9.f23408b
            float[] r1 = r8.b()
            goto L_0x0022
        L_0x004e:
            r3 = 0
            int r4 = r1.length
        L_0x0050:
            if (r3 >= r4) goto L_0x005f
            r5 = r0[r3]
            r6 = r9[r3]
            float r6 = r6 - r5
            float r6 = r6 * r10
            float r5 = r5 + r6
            r1[r3] = r5
            int r3 = r3 + 1
            goto L_0x0050
        L_0x005f:
            com.facebook.c.c.f$a r9 = r8.f23407a
            r2.a((com.facebook.c.a) r11, (com.facebook.c.c.f.a) r9, (float[]) r1)
            return
        L_0x0065:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Argument format must match between interpolated commands. RELATIVE and ABSOLUTE coordinates should stay consistent"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.c.c.f.a(com.facebook.c.c.f, float, com.facebook.c.a):void");
    }

    private static float[] a(float[] fArr, float[] fArr2, float[] fArr3) {
        if (fArr2.length < fArr3.length) {
            if (fArr2.length == 2) {
                if (fArr3.length == 4) {
                    fArr3[0] = (fArr[0] + fArr2[0]) / 2.0f;
                    fArr3[1] = (fArr[1] + fArr2[1]) / 2.0f;
                    fArr3[2] = fArr2[0];
                    fArr3[3] = fArr2[1];
                } else if (fArr3.length == 6) {
                    fArr3[0] = fArr[0] + ((fArr2[0] - fArr[0]) / 3.0f);
                    fArr3[1] = fArr[1] + ((fArr2[1] - fArr[1]) / 3.0f);
                    fArr3[2] = fArr2[0] + ((fArr[0] - fArr2[0]) / 3.0f);
                    fArr3[3] = fArr2[1] + ((fArr[1] - fArr2[1]) / 3.0f);
                    fArr3[4] = fArr2[0];
                    fArr3[5] = fArr2[1];
                } else {
                    throw new IllegalArgumentException(String.format("Unknown conversion from %d args to %d", new Object[]{Integer.valueOf(fArr2.length), Integer.valueOf(fArr3.length)}));
                }
            } else if (fArr2.length != 4) {
                throw new IllegalArgumentException(String.format("Unknown conversion from %d args to %d", new Object[]{Integer.valueOf(fArr2.length), Integer.valueOf(fArr3.length)}));
            } else if (fArr3.length == 6) {
                fArr3[0] = fArr[0] + ((fArr2[0] - fArr[0]) * 0.6666667f);
                fArr3[1] = fArr[1] + ((fArr2[1] - fArr[1]) * 0.6666667f);
                fArr3[2] = fArr2[2] + ((fArr2[0] - fArr2[2]) * 0.6666667f);
                fArr3[3] = fArr2[3] + ((fArr2[1] - fArr2[3]) * 0.6666667f);
                fArr3[4] = fArr2[2];
                fArr3[5] = fArr2[3];
            } else {
                throw new IllegalArgumentException(String.format("Unknown conversion from %d args to %d", new Object[]{Integer.valueOf(fArr2.length), Integer.valueOf(fArr3.length)}));
            }
            return fArr3;
        }
        throw new IllegalArgumentException("convertUp should only be called to convert a lower order argument array to a higher one.");
    }
}
