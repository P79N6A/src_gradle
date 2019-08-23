package com.bytedance.ies.dmt.ui.widget.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    static volatile Map<String, Integer> f20586a;
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f20587c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile SparseArray<String> f20588d;

    /* renamed from: b  reason: collision with root package name */
    Map<String, String> f20589b = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private SparseArray<Typeface> f20590e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    private Context f20591f;

    private a() {
    }

    public static a a() {
        if (f20587c == null) {
            synchronized (a.class) {
                if (f20587c == null) {
                    f20587c = new a();
                }
            }
        }
        return f20587c;
    }

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        f20588d = sparseArray;
        sparseArray.put(1, c.f20594a);
        f20588d.put(2, c.f20595b);
        f20588d.put(3, c.f20596c);
        f20588d.put(4, c.f20597d);
        f20588d.put(5, c.f20598e);
        f20588d.put(6, c.f20599f);
        f20588d.put(7, c.g);
        f20588d.put(8, c.h);
        HashMap hashMap = new HashMap();
        f20586a = hashMap;
        hashMap.put(c.f20594a, 1);
        f20586a.put(c.f20595b, 2);
        f20586a.put(c.f20596c, 3);
        f20586a.put(c.f20597d, 4);
        f20586a.put(c.f20598e, 5);
        f20586a.put(c.f20599f, 6);
        f20586a.put(c.g, 7);
        f20586a.put(c.h, 8);
    }

    private Typeface b(int i) {
        String str = this.f20589b.get(f20588d.get(i));
        if (this.f20591f != null) {
            try {
                return Typeface.createFromAsset(this.f20591f.getAssets(), str);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final Typeface a(int i) {
        Typeface typeface = this.f20590e.get(i, null);
        if (typeface != null) {
            return typeface;
        }
        Typeface b2 = b(i);
        this.f20590e.put(i, b2);
        return b2;
    }
}
