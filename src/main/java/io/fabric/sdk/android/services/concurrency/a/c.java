package io.fabric.sdk.android.services.concurrency.a;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final long f83248a = 1000;

    /* renamed from: b  reason: collision with root package name */
    private final int f83249b = 8;

    public final long getDelayMillis(int i) {
        double d2 = (double) this.f83248a;
        double pow = Math.pow((double) this.f83249b, (double) i);
        Double.isNaN(d2);
        return (long) (d2 * pow);
    }

    public c(long j, int i) {
    }
}
