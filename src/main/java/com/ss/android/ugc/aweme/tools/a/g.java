package com.ss.android.ugc.aweme.tools.a;

import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.a.a.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4269a;

    /* renamed from: b  reason: collision with root package name */
    public static Map<f, c> f4270b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static boolean f4271c;

    /* renamed from: d  reason: collision with root package name */
    private static final c f4272d = new a();

    private static c a(f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, null, f4269a, true, 87039, new Class[]{f.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{fVar2}, null, f4269a, true, 87039, new Class[]{f.class}, c.class);
        }
        c cVar = f4270b.get(fVar2);
        if (cVar == null) {
            cVar = f4272d;
        }
        return cVar;
    }

    public static void a(Intent intent, a aVar) {
        Intent intent2 = intent;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{intent2, aVar2}, null, f4269a, true, 87036, new Class[]{Intent.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2, aVar2}, null, f4269a, true, 87036, new Class[]{Intent.class, a.class}, Void.TYPE);
            return;
        }
        for (f fVar : f.values()) {
            aVar2.a(fVar, intent2.getStringExtra(fVar.intentKey));
        }
    }

    public static void a(Intent intent, Intent intent2, e eVar, e eVar2) {
        Intent intent3 = intent;
        Intent intent4 = intent2;
        e eVar3 = eVar;
        e eVar4 = eVar2;
        if (PatchProxy.isSupport(new Object[]{intent3, intent4, eVar3, eVar4}, null, f4269a, true, 87034, new Class[]{Intent.class, Intent.class, e.class, e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent3, intent4, eVar3, eVar4}, null, f4269a, true, 87034, new Class[]{Intent.class, Intent.class, e.class, e.class}, Void.TYPE);
            return;
        }
        for (f fVar : f.values()) {
            intent4.putExtra(fVar.intentKey, a(fVar).a(intent3.getStringExtra(fVar.intentKey), eVar3, eVar4));
        }
    }

    public static void a(Intent intent, b bVar, e eVar, e eVar2) {
        Intent intent2 = intent;
        b bVar2 = bVar;
        e eVar3 = eVar;
        e eVar4 = eVar2;
        if (PatchProxy.isSupport(new Object[]{intent2, bVar2, eVar3, eVar4}, null, f4269a, true, 87035, new Class[]{Intent.class, b.class, e.class, e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2, bVar2, eVar3, eVar4}, null, f4269a, true, 87035, new Class[]{Intent.class, b.class, e.class, e.class}, Void.TYPE);
            return;
        }
        for (f fVar : f.values()) {
            intent2.putExtra(fVar.intentKey, a(fVar).a(bVar2.a(fVar), eVar3, eVar4));
        }
    }

    public static void a(b bVar, a aVar, e eVar, e eVar2) {
        b bVar2 = bVar;
        a aVar2 = aVar;
        e eVar3 = eVar;
        e eVar4 = eVar2;
        if (PatchProxy.isSupport(new Object[]{bVar2, aVar2, eVar3, eVar4}, null, f4269a, true, 87037, new Class[]{b.class, a.class, e.class, e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2, aVar2, eVar3, eVar4}, null, f4269a, true, 87037, new Class[]{b.class, a.class, e.class, e.class}, Void.TYPE);
            return;
        }
        for (f fVar : f.values()) {
            aVar2.a(fVar, a(fVar).a(bVar2.a(fVar), eVar3, eVar4));
        }
    }
}
