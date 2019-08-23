package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.concurrency.a.a;
import java.util.Random;

public class RandomBackoff implements a {
    final a backoff;
    final double jitterPercent;
    final Random random;

    /* access modifiers changed from: package-private */
    public double randomJitter() {
        double d2 = 1.0d - this.jitterPercent;
        return d2 + (((this.jitterPercent + 1.0d) - d2) * this.random.nextDouble());
    }

    public long getDelayMillis(int i) {
        double randomJitter = randomJitter();
        double delayMillis = (double) this.backoff.getDelayMillis(i);
        Double.isNaN(delayMillis);
        return (long) (randomJitter * delayMillis);
    }

    public RandomBackoff(a aVar, double d2) {
        this(aVar, d2, new Random());
    }

    public RandomBackoff(a aVar, double d2, Random random2) {
        if (d2 < 0.0d || d2 > 1.0d) {
            throw new IllegalArgumentException("jitterPercent must be between 0.0 and 1.0");
        } else if (aVar == null) {
            throw new NullPointerException("backoff must not be null");
        } else if (random2 != null) {
            this.backoff = aVar;
            this.jitterPercent = d2;
            this.random = random2;
        } else {
            throw new NullPointerException("random must not be null");
        }
    }
}
