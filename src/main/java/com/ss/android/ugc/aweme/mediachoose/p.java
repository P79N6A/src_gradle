package com.ss.android.ugc.aweme.mediachoose;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.music.b.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final /* synthetic */ class p implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55313a;

    /* renamed from: b  reason: collision with root package name */
    private final List f55314b;

    p(List list) {
        this.f55314b = list;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f55313a, false, 58574, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f55313a, false, 58574, new Class[0], Object.class);
        }
        List list = this.f55314b;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = new ArrayList(list).iterator();
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            if (!TextUtils.isEmpty(aVar.f56315e) && "video/mp4".equalsIgnoreCase(aVar.j)) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }
}
