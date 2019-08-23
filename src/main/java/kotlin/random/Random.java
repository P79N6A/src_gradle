package kotlin.random;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.b;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b'\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0016¨\u0006\u0019"}, d2 = {"Lkotlin/random/Random;", "", "()V", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "fromIndex", "toIndex", "size", "nextDouble", "", "until", "from", "nextFloat", "", "nextInt", "nextLong", "", "Companion", "Default", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
@SinceKotlin
public abstract class Random {
    @NotNull
    @JvmField
    public static final a Companion = a.f4366a;
    public static final Default Default = new Default(null);
    public static final Random defaultRandom = b.f83544a.a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\bH\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0016J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001aH\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001aH\u0016R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u000e\u0010\u0006\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "()V", "Companion", "Lkotlin/random/Random$Companion;", "Companion$annotations", "defaultRandom", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "fromIndex", "toIndex", "size", "nextDouble", "", "until", "from", "nextFloat", "", "nextInt", "nextLong", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public static final class Default extends Random {
        @Deprecated(level = kotlin.a.HIDDEN, message = "Use Default companion object instead")
        public static /* synthetic */ void Companion$annotations() {
        }

        private Default() {
        }

        public final boolean nextBoolean() {
            return Random.defaultRandom.nextBoolean();
        }

        public final double nextDouble() {
            return Random.defaultRandom.nextDouble();
        }

        public final float nextFloat() {
            return Random.defaultRandom.nextFloat();
        }

        public final int nextInt() {
            return Random.defaultRandom.nextInt();
        }

        public final long nextLong() {
            return Random.defaultRandom.nextLong();
        }

        public /* synthetic */ Default(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int nextBits(int i) {
            return Random.defaultRandom.nextBits(i);
        }

        @NotNull
        public final byte[] nextBytes(int i) {
            return Random.defaultRandom.nextBytes(i);
        }

        @NotNull
        public final byte[] nextBytes(@NotNull byte[] bArr) {
            Intrinsics.checkParameterIsNotNull(bArr, "array");
            return Random.defaultRandom.nextBytes(bArr);
        }

        public final double nextDouble(double d2) {
            return Random.defaultRandom.nextDouble(d2);
        }

        public final int nextInt(int i) {
            return Random.defaultRandom.nextInt(i);
        }

        public final long nextLong(long j) {
            return Random.defaultRandom.nextLong(j);
        }

        public final double nextDouble(double d2, double d3) {
            return Random.defaultRandom.nextDouble(d2, d3);
        }

        public final int nextInt(int i, int i2) {
            return Random.defaultRandom.nextInt(i, i2);
        }

        public final long nextLong(long j, long j2) {
            return Random.defaultRandom.nextLong(j, j2);
        }

        @NotNull
        public final byte[] nextBytes(@NotNull byte[] bArr, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(bArr, "array");
            return Random.defaultRandom.nextBytes(bArr, i, i2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lkotlin/random/Random$Companion;", "Lkotlin/random/Random;", "()V", "nextBits", "", "bitCount", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    @Deprecated(level = kotlin.a.HIDDEN, message = "Use Default companion object instead")
    public static final class a extends Random {

        /* renamed from: a  reason: collision with root package name */
        public static final a f4366a = new a();

        private a() {
        }

        public final int nextBits(int i) {
            return Random.Default.nextBits(i);
        }
    }

    public abstract int nextBits(int i);

    public int nextInt() {
        return nextBits(32);
    }

    public boolean nextBoolean() {
        if (nextBits(1) != 0) {
            return true;
        }
        return false;
    }

    public float nextFloat() {
        return ((float) nextBits(24)) / 1.6777216E7f;
    }

    public long nextLong() {
        return (((long) nextInt()) << 32) + ((long) nextInt());
    }

    public double nextDouble() {
        double nextBits = (double) ((((long) nextBits(26)) << 27) + ((long) nextBits(27)));
        Double.isNaN(nextBits);
        return nextBits / 9.007199254740992E15d;
    }

    @NotNull
    public byte[] nextBytes(int i) {
        return nextBytes(new byte[i]);
    }

    public double nextDouble(double d2) {
        return nextDouble(0.0d, d2);
    }

    public long nextLong(long j) {
        return nextLong(0, j);
    }

    @NotNull
    public byte[] nextBytes(@NotNull byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, "array");
        return nextBytes(bArr, 0, bArr.length);
    }

    public int nextInt(int i) {
        return nextInt(0, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public double nextDouble(double r7, double r9) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0008
            r2 = 1
            goto L_0x0009
        L_0x0008:
            r2 = 0
        L_0x0009:
            if (r2 == 0) goto L_0x0055
            double r2 = r9 - r7
            boolean r4 = java.lang.Double.isInfinite(r2)
            if (r4 == 0) goto L_0x0043
            boolean r4 = java.lang.Double.isInfinite(r7)
            if (r4 != 0) goto L_0x0021
            boolean r4 = java.lang.Double.isNaN(r7)
            if (r4 != 0) goto L_0x0021
            r4 = 1
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            if (r4 == 0) goto L_0x0043
            boolean r4 = java.lang.Double.isInfinite(r9)
            if (r4 != 0) goto L_0x0031
            boolean r4 = java.lang.Double.isNaN(r9)
            if (r4 != 0) goto L_0x0031
            r0 = 1
        L_0x0031:
            if (r0 == 0) goto L_0x0043
            double r0 = r6.nextDouble()
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = r9 / r2
            double r2 = r7 / r2
            double r4 = r4 - r2
            double r0 = r0 * r4
            double r7 = r7 + r0
            double r7 = r7 + r0
            goto L_0x004a
        L_0x0043:
            double r0 = r6.nextDouble()
            double r0 = r0 * r2
            double r7 = r7 + r0
        L_0x004a:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0054
            double r7 = kotlin.jvm.internal.p.f83596a
            double r7 = java.lang.Math.nextAfter(r9, r7)
        L_0x0054:
            return r7
        L_0x0055:
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            java.lang.Double r8 = java.lang.Double.valueOf(r9)
            java.lang.String r7 = kotlin.random.d.a(r7, r8)
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.random.Random.nextDouble(double, double):double");
    }

    public int nextInt(int i, int i2) {
        boolean z;
        int i3;
        int nextInt;
        int i4;
        if (i2 > i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i5 = i2 - i;
            if (i5 > 0 || i5 == Integer.MIN_VALUE) {
                if (((-i5) & i5) == i5) {
                    i3 = nextBits(c.a(i5));
                } else {
                    do {
                        nextInt = nextInt() >>> 1;
                        i4 = nextInt % i5;
                    } while ((nextInt - i4) + (i5 - 1) < 0);
                    i3 = i4;
                }
                return i + i3;
            }
            while (true) {
                int nextInt2 = nextInt();
                if (i <= nextInt2 && i2 > nextInt2) {
                    return nextInt2;
                }
            }
        } else {
            throw new IllegalArgumentException(d.a(Integer.valueOf(i), Integer.valueOf(i2)).toString());
        }
    }

    public long nextLong(long j, long j2) {
        boolean z;
        long j3;
        long nextLong;
        long j4;
        if (j2 > j) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j5 = j2 - j;
            if (j5 > 0) {
                if (((-j5) & j5) == j5) {
                    int i = (int) j5;
                    int i2 = (int) (j5 >>> 32);
                    if (i != 0) {
                        j3 = ((long) nextBits(c.a(i))) & 4294967295L;
                    } else if (i2 == 1) {
                        j3 = ((long) nextInt()) & 4294967295L;
                    } else {
                        j3 = (((long) nextBits(c.a(i2))) << 32) + ((long) nextInt());
                    }
                } else {
                    do {
                        nextLong = nextLong() >>> 1;
                        j4 = nextLong % j5;
                    } while ((nextLong - j4) + (j5 - 1) < 0);
                    j3 = j4;
                }
                return j + j3;
            }
            while (true) {
                long nextLong2 = nextLong();
                if (j <= nextLong2 && j2 > nextLong2) {
                    return nextLong2;
                }
            }
        } else {
            throw new IllegalArgumentException(d.a(Long.valueOf(j), Long.valueOf(j2)).toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] nextBytes(@org.jetbrains.annotations.NotNull byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r7, r0)
            int r0 = r7.length
            r1 = 0
            r2 = 1
            if (r8 >= 0) goto L_0x000b
            goto L_0x0015
        L_0x000b:
            if (r0 < r8) goto L_0x0015
            int r0 = r7.length
            if (r9 >= 0) goto L_0x0011
            goto L_0x0015
        L_0x0011:
            if (r0 < r9) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x0084
            if (r8 > r9) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            if (r2 == 0) goto L_0x005d
            int r0 = r9 - r8
            int r0 = r0 / 4
            r2 = r8
            r8 = 0
        L_0x0024:
            if (r8 >= r0) goto L_0x0047
            int r3 = r6.nextInt()
            byte r4 = (byte) r3
            r7[r2] = r4
            int r4 = r2 + 1
            int r5 = r3 >>> 8
            byte r5 = (byte) r5
            r7[r4] = r5
            int r4 = r2 + 2
            int r5 = r3 >>> 16
            byte r5 = (byte) r5
            r7[r4] = r5
            int r4 = r2 + 3
            int r3 = r3 >>> 24
            byte r3 = (byte) r3
            r7[r4] = r3
            int r2 = r2 + 4
            int r8 = r8 + 1
            goto L_0x0024
        L_0x0047:
            int r9 = r9 - r2
            int r8 = r9 * 8
            int r8 = r6.nextBits(r8)
        L_0x004e:
            if (r1 >= r9) goto L_0x005c
            int r0 = r2 + r1
            int r3 = r1 * 8
            int r3 = r8 >>> r3
            byte r3 = (byte) r3
            r7[r0] = r3
            int r1 = r1 + 1
            goto L_0x004e
        L_0x005c:
            return r7
        L_0x005d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "fromIndex ("
            r7.<init>(r0)
            r7.append(r8)
            java.lang.String r8 = ") must be not greater than toIndex ("
            r7.append(r8)
            r7.append(r9)
            java.lang.String r8 = ")."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            throw r8
        L_0x0084:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "fromIndex ("
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = ") or toIndex ("
            r0.append(r8)
            r0.append(r9)
            java.lang.String r8 = ") are out of range: 0.."
            r0.append(r8)
            int r7 = r7.length
            r0.append(r7)
            r7 = 46
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.random.Random.nextBytes(byte[], int, int):byte[]");
    }

    public static /* synthetic */ byte[] nextBytes$default(Random random, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return random.nextBytes(bArr, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
    }
}
