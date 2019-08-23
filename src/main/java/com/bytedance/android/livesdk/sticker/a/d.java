package com.bytedance.android.livesdk.sticker.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class d {

    /* renamed from: e  reason: collision with root package name */
    private static final List<a> f17232e;

    /* renamed from: a  reason: collision with root package name */
    public final List<a> f17233a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f17234b;

    /* renamed from: c  reason: collision with root package name */
    public final b f17235c;

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f17236d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17237a;

        /* renamed from: b  reason: collision with root package name */
        List<a> f17238b;

        /* renamed from: c  reason: collision with root package name */
        public List<String> f17239c;

        /* renamed from: d  reason: collision with root package name */
        public List<String> f17240d;

        /* renamed from: e  reason: collision with root package name */
        b f17241e;

        public final d a() {
            if (!PatchProxy.isSupport(new Object[0], this, f17237a, false, 13390, new Class[0], d.class)) {
                return new d(this);
            }
            return (d) PatchProxy.accessDispatch(new Object[0], this, f17237a, false, 13390, new Class[0], d.class);
        }

        public final a a(b bVar) {
            this.f17241e = bVar;
            return this;
        }
    }

    static {
        LinkedList linkedList = new LinkedList();
        f17232e = linkedList;
        linkedList.add(new a("beauty", Arrays.asList(new Integer[]{1, 2, 3})));
        f17232e.add(new a(com.bytedance.android.livesdk.sticker.c.a.f17264e, Arrays.asList(new Integer[]{1, 2, 3})));
        f17232e.add(new a("effect_gift", Arrays.asList(new Integer[]{1, 3})));
        f17232e.add(new a("livegame", Collections.singletonList(3)));
        f17232e.add(new a(com.bytedance.android.livesdk.sticker.c.a.f17261b, Collections.singletonList(2)));
        f17232e.add(new a(com.bytedance.android.livesdk.sticker.c.a.f17262c, Collections.singletonList(2)));
        f17232e.add(new a(com.bytedance.android.livesdk.sticker.c.a.f17263d, Collections.singletonList(2)));
    }

    public d(a aVar) {
        List<String> list;
        List<String> list2;
        List<a> list3;
        this.f17235c = aVar.f17241e;
        if (aVar.f17239c == null) {
            list = Collections.emptyList();
        } else {
            list = aVar.f17239c;
        }
        this.f17234b = list;
        if (aVar.f17240d == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = aVar.f17240d;
        }
        this.f17236d = list2;
        if (aVar.f17238b == null || aVar.f17238b.isEmpty()) {
            list3 = f17232e;
        } else {
            list3 = aVar.f17238b;
        }
        this.f17233a = list3;
    }
}
