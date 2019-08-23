package pl.droidsonroids.gif;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

public final class c extends ScheduledThreadPoolExecutor {

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f84207a = new c((byte) 0);
    }

    private c() {
        super(1, new ThreadPoolExecutor.DiscardPolicy());
    }

    /* synthetic */ c(byte b2) {
        this();
    }
}
