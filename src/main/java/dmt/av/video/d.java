package dmt.av.video;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.g.a;

public class d<T> implements Observer<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82986a;

    /* renamed from: b  reason: collision with root package name */
    static boolean f82987b = a.a();

    public void onChanged(@Nullable T t) {
        String str;
        if (PatchProxy.isSupport(new Object[]{t}, this, f82986a, false, 91950, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t}, this, f82986a, false, 91950, new Class[]{Object.class}, Void.TYPE);
        } else if (!f82987b) {
            if (t == null) {
                str = "null";
            } else {
                str = t.toString();
            }
            com.ss.android.ugc.aweme.framework.a.a.a("LogObserver", str);
        }
    }
}
