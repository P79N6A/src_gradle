package pl.droidsonroids.gif;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public final class g extends h {
    public final void a() {
        long a2 = this.f84212c.f84203f.a(this.f84212c.f84202e);
        if (a2 >= 0) {
            this.f84212c.f84200c = SystemClock.uptimeMillis() + a2;
            if (this.f84212c.isVisible() && this.f84212c.f84199b && !this.f84212c.h) {
                this.f84212c.f84198a.remove(this);
                this.f84212c.j = this.f84212c.f84198a.schedule(this, a2, TimeUnit.MILLISECONDS);
            }
            if (!this.f84212c.g.isEmpty() && this.f84212c.d() == this.f84212c.f84203f.n() - 1) {
                this.f84212c.i.sendEmptyMessageAtTime(this.f84212c.e(), this.f84212c.f84200c);
            }
        } else {
            this.f84212c.f84200c = Long.MIN_VALUE;
            this.f84212c.f84199b = false;
        }
        if (this.f84212c.isVisible() && !this.f84212c.i.hasMessages(-1)) {
            this.f84212c.i.sendEmptyMessageAtTime(-1, 0);
        }
    }

    g(a aVar) {
        super(aVar);
    }
}
