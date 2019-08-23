package org.greenrobot.eventbus;

import android.os.Looper;

public interface h {

    public static class a implements h {

        /* renamed from: a  reason: collision with root package name */
        private final Looper f84120a;

        public final boolean a() {
            if (this.f84120a == Looper.myLooper()) {
                return true;
            }
            return false;
        }

        public a(Looper looper) {
            this.f84120a = looper;
        }

        public final l a(c cVar) {
            return new f(cVar, this.f84120a, 10);
        }
    }

    l a(c cVar);

    boolean a();
}
