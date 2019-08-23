package pl.droidsonroids.gif;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public final class d extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<a> f84208a;

    public d(a aVar) {
        super(Looper.getMainLooper());
        this.f84208a = new WeakReference<>(aVar);
    }

    public final void handleMessage(Message message) {
        a aVar = (a) this.f84208a.get();
        if (aVar != null) {
            if (message.what == -1) {
                aVar.invalidateSelf();
                return;
            }
            Iterator<Object> it2 = aVar.g.iterator();
            while (it2.hasNext()) {
                it2.next();
                int i = message.what;
            }
        }
    }
}
