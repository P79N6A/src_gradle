package com.bytedance.android.livesdk.i18n;

import android.text.TextUtils;
import com.bytedance.android.livesdk.i18n.db.a;
import com.bytedance.android.livesdk.i18n.db.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15630a;

    /* renamed from: b  reason: collision with root package name */
    private final c f15631b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f15632c;

    /* renamed from: d  reason: collision with root package name */
    private final long f15633d;

    g(c cVar, Map map, long j) {
        this.f15631b = cVar;
        this.f15632c = map;
        this.f15633d = j;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f15630a, false, 10170, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f15630a, false, 10170, new Class[0], Object.class);
        }
        c cVar = this.f15631b;
        Map map = this.f15632c;
        long j = this.f15633d;
        Set<Map.Entry> entrySet = map.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : entrySet) {
            if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                arrayList.add(new d((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        c.f15595c.b();
        c.f15595c.a(arrayList);
        c.f15596d.a(new a("locale", cVar.f15597b));
        c.f15596d.a(new a("version", String.valueOf(j)));
        return Boolean.TRUE;
    }
}
