package io.reactivex.schedulers;

import io.reactivex.annotations.NonNull;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.TimeUnit;

public final class Timed<T> {
    final long time;
    final TimeUnit unit;
    final T value;

    public final long time() {
        return this.time;
    }

    @NonNull
    public final TimeUnit unit() {
        return this.unit;
    }

    @NonNull
    public final T value() {
        return this.value;
    }

    public final int hashCode() {
        int i;
        if (this.value != null) {
            i = this.value.hashCode();
        } else {
            i = 0;
        }
        return (((i * 31) + ((int) ((this.time >>> 31) ^ this.time))) * 31) + this.unit.hashCode();
    }

    public final String toString() {
        return "Timed[time=" + this.time + ", unit=" + this.unit + ", value=" + this.value + "]";
    }

    public final long time(@NonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.time, this.unit);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Timed)) {
            return false;
        }
        Timed timed = (Timed) obj;
        if (!ObjectHelper.equals(this.value, timed.value) || this.time != timed.time || !ObjectHelper.equals(this.unit, timed.unit)) {
            return false;
        }
        return true;
    }

    public Timed(@NonNull T t, long j, @NonNull TimeUnit timeUnit) {
        this.value = t;
        this.time = j;
        this.unit = (TimeUnit) ObjectHelper.requireNonNull(timeUnit, "unit is null");
    }
}
