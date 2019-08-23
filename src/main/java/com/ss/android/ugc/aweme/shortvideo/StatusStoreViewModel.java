package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.ViewModel;
import android.support.v4.util.ArrayMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public class StatusStoreViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65419a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, Object> f65420b = new ArrayMap();

    public void onCleared() {
        if (PatchProxy.isSupport(new Object[0], this, f65419a, false, 74728, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65419a, false, 74728, new Class[0], Void.TYPE);
            return;
        }
        super.onCleared();
        this.f65420b.clear();
    }

    public final <T> T a(String str, T t) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, t}, this, f65419a, false, 74726, new Class[]{String.class, Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{str2, t}, this, f65419a, false, 74726, new Class[]{String.class, Object.class}, Object.class);
        }
        T t2 = this.f65420b.get(str2);
        if (t2 == null) {
            return t;
        }
        return t2;
    }

    public final <T> void b(String str, T t) {
        String str2 = str;
        T t2 = t;
        if (PatchProxy.isSupport(new Object[]{str2, t2}, this, f65419a, false, 74727, new Class[]{String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, t2}, this, f65419a, false, 74727, new Class[]{String.class, Object.class}, Void.TYPE);
            return;
        }
        this.f65420b.put(str2, t2);
    }
}
