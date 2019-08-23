package com.bytedance.ies.x2c;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.x2c.a;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static SparseArray<a> f20874a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private static SparseArray<b> f20875b = new SparseArray<>();

    public static int a(Context context) {
        return context.hashCode();
    }

    private static View a(Context context, int i) {
        a aVar = f20874a.get(a(context));
        if (aVar == null) {
            return null;
        }
        a.C0191a aVar2 = aVar.f20870a.get(String.valueOf(i));
        if (aVar2 == null || aVar2 == null) {
            return null;
        }
        if (aVar.f20870a.containsValue(aVar2)) {
            aVar.f20870a.remove(aVar2);
        }
        return aVar2.a();
    }

    @NonNull
    private static b b(Context context, int i) {
        b bVar;
        b bVar2;
        synchronized (d.class) {
            bVar = f20875b.get(i);
        }
        if (bVar == null) {
            try {
                String resourceName = context.getResources().getResourceName(i);
                String substring = resourceName.substring(resourceName.lastIndexOf("/") + 1);
                bVar2 = (b) context.getClassLoader().loadClass(("com.bytedance.ies.x2c.generate.X2C" + (i >> 24)) + "_" + substring).newInstance();
            } catch (Exception unused) {
                bVar2 = bVar;
            }
            if (bVar2 == null) {
                bVar2 = new b() {
                    public final c getCreator() {
                        return null;
                    }
                };
            }
            bVar = bVar2;
            synchronized (d.class) {
                f20875b.put(i, bVar);
            }
        }
        return bVar;
    }

    public static View a(Context context, int i, ViewGroup viewGroup, boolean z) {
        View a2 = a(context, i);
        if (a2 != null) {
            return a2;
        }
        return b(context, i, viewGroup, z);
    }

    @Nullable
    private static View b(Context context, int i, ViewGroup viewGroup, boolean z) {
        View view;
        try {
            view = b(context, i).getCreator().a(context, viewGroup, z);
        } catch (Exception unused) {
            view = null;
        }
        if (view == null) {
            return LayoutInflater.from(context).inflate(i, viewGroup, z);
        }
        return view;
    }
}
