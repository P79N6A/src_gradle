package kotlin.comparisons;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0005\u001a5\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\u0006\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0019\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\b\u001a!\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\bH\b\u001a\u0019\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\tH\b\u001a!\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\tH\b\u001a\u0019\u0010\u0000\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\nH\b\u001a!\u0010\u0000\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\nH\b\u001a\u0019\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\b\u001a!\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000bH\b\u001a\u0019\u0010\u0000\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\fH\b\u001a!\u0010\u0000\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\fH\b\u001a\u0019\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\rH\b\u001a!\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\b\u001a-\u0010\u000e\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0005\u001a5\u0010\u000e\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\u0006\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0019\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\b\u001a!\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\bH\b\u001a\u0019\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\tH\b\u001a!\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\tH\b\u001a\u0019\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\nH\b\u001a!\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\nH\b\u001a\u0019\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\b\u001a!\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000bH\b\u001a\u0019\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\fH\b\u001a!\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\fH\b\u001a\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\rH\b\u001a!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\b¨\u0006\u000f"}, d2 = {"maxOf", "T", "", "a", "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "c", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "minOf", "kotlin-stdlib"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "kotlin/comparisons/ComparisonsKt")
public class b extends a {
    @NotNull
    @SinceKotlin
    public static final <T extends Comparable<? super T>> T maxOf(@NotNull T t, @NotNull T t2) {
        Intrinsics.checkParameterIsNotNull(t, "a");
        Intrinsics.checkParameterIsNotNull(t2, "b");
        return t.compareTo(t2) >= 0 ? t : t2;
    }

    @SinceKotlin
    @InlineOnly
    private static final short maxOf(short s, short s2) {
        return (short) Math.max(s, s2);
    }

    @NotNull
    @SinceKotlin
    public static final <T extends Comparable<? super T>> T maxOf(@NotNull T t, @NotNull T t2, @NotNull T t3) {
        Intrinsics.checkParameterIsNotNull(t, "a");
        Intrinsics.checkParameterIsNotNull(t2, "b");
        Intrinsics.checkParameterIsNotNull(t3, "c");
        return ComparisonsKt.maxOf(t, (T) ComparisonsKt.maxOf(t2, t3));
    }

    @SinceKotlin
    @InlineOnly
    private static final short maxOf(short s, short s2, short s3) {
        return (short) Math.max(s, Math.max(s2, s3));
    }

    @NotNull
    @SinceKotlin
    public static final <T extends Comparable<? super T>> T minOf(@NotNull T t, @NotNull T t2) {
        Intrinsics.checkParameterIsNotNull(t, "a");
        Intrinsics.checkParameterIsNotNull(t2, "b");
        return t.compareTo(t2) <= 0 ? t : t2;
    }

    @SinceKotlin
    @InlineOnly
    private static final short minOf(short s, short s2) {
        return (short) Math.min(s, s2);
    }

    @NotNull
    @SinceKotlin
    public static final <T extends Comparable<? super T>> T minOf(@NotNull T t, @NotNull T t2, @NotNull T t3) {
        Intrinsics.checkParameterIsNotNull(t, "a");
        Intrinsics.checkParameterIsNotNull(t2, "b");
        Intrinsics.checkParameterIsNotNull(t3, "c");
        return ComparisonsKt.minOf(t, (T) ComparisonsKt.minOf(t2, t3));
    }

    @SinceKotlin
    @InlineOnly
    private static final short minOf(short s, short s2, short s3) {
        return (short) Math.min(s, Math.min(s2, s3));
    }

    @SinceKotlin
    @InlineOnly
    private static final byte maxOf(byte b2, byte b3) {
        return (byte) Math.max(b2, b3);
    }

    @SinceKotlin
    @InlineOnly
    private static final byte minOf(byte b2, byte b3) {
        return (byte) Math.min(b2, b3);
    }

    @SinceKotlin
    @InlineOnly
    private static final double maxOf(double d2, double d3) {
        return Math.max(d2, d3);
    }

    @SinceKotlin
    @InlineOnly
    private static final double minOf(double d2, double d3) {
        return Math.min(d2, d3);
    }

    @SinceKotlin
    @InlineOnly
    private static final float maxOf(float f2, float f3) {
        return Math.max(f2, f3);
    }

    @SinceKotlin
    @InlineOnly
    private static final float minOf(float f2, float f3) {
        return Math.min(f2, f3);
    }

    @SinceKotlin
    @InlineOnly
    private static final int maxOf(int i, int i2) {
        return Math.max(i, i2);
    }

    @SinceKotlin
    @InlineOnly
    private static final int minOf(int i, int i2) {
        return Math.min(i, i2);
    }

    @SinceKotlin
    @InlineOnly
    private static final long maxOf(long j, long j2) {
        return Math.max(j, j2);
    }

    @SinceKotlin
    @InlineOnly
    private static final long minOf(long j, long j2) {
        return Math.min(j, j2);
    }

    @SinceKotlin
    @InlineOnly
    private static final byte maxOf(byte b2, byte b3, byte b4) {
        return (byte) Math.max(b2, Math.max(b3, b4));
    }

    @SinceKotlin
    @InlineOnly
    private static final byte minOf(byte b2, byte b3, byte b4) {
        return (byte) Math.min(b2, Math.min(b3, b4));
    }

    @SinceKotlin
    @InlineOnly
    private static final double maxOf(double d2, double d3, double d4) {
        return Math.max(d2, Math.max(d3, d4));
    }

    @SinceKotlin
    @InlineOnly
    private static final double minOf(double d2, double d3, double d4) {
        return Math.min(d2, Math.min(d3, d4));
    }

    @SinceKotlin
    @InlineOnly
    private static final float maxOf(float f2, float f3, float f4) {
        return Math.max(f2, Math.max(f3, f4));
    }

    @SinceKotlin
    @InlineOnly
    private static final float minOf(float f2, float f3, float f4) {
        return Math.min(f2, Math.min(f3, f4));
    }

    @SinceKotlin
    @InlineOnly
    private static final int maxOf(int i, int i2, int i3) {
        return Math.max(i, Math.max(i2, i3));
    }

    @SinceKotlin
    @InlineOnly
    private static final int minOf(int i, int i2, int i3) {
        return Math.min(i, Math.min(i2, i3));
    }

    @SinceKotlin
    @InlineOnly
    private static final long maxOf(long j, long j2, long j3) {
        return Math.max(j, Math.max(j2, j3));
    }

    @SinceKotlin
    @InlineOnly
    private static final long minOf(long j, long j2, long j3) {
        return Math.min(j, Math.min(j2, j3));
    }
}
