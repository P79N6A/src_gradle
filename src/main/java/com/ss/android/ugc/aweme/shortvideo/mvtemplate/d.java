package com.ss.android.ugc.aweme.shortvideo.mvtemplate;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.b;
import com.ss.android.ugc.aweme.x.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

public final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68709a;

    /* renamed from: b  reason: collision with root package name */
    private final a f68710b;

    /* renamed from: c  reason: collision with root package name */
    private final a f68711c;

    d(a aVar, a aVar2) {
        this.f68710b = aVar;
        this.f68711c = aVar2;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f68709a, false, 77859, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f68709a, false, 77859, new Class[0], Object.class);
        }
        a aVar = this.f68710b;
        a aVar2 = this.f68711c;
        ArrayList arrayList = new ArrayList();
        String str = b.a("resize_bitmap_tmp") + File.separator;
        Iterator<String> it2 = aVar2.selectMediaList.iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            if (com.ss.android.ugc.aweme.video.b.b(next)) {
                if (com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.a.a(next) == null) {
                    arrayList.add(next);
                } else {
                    String str2 = str + b.b(".bmp");
                    if (b.a(next, str2, aVar.g, aVar.h, aVar.i)) {
                        arrayList.add(str2);
                    } else {
                        arrayList.add(next);
                    }
                }
            }
        }
        if (arrayList.size() > 0) {
            aVar2.selectMediaList.clear();
            aVar2.selectMediaList.addAll(arrayList);
        }
        return null;
    }
}
