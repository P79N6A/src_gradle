package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.gesturehandler.b;
import com.swmansion.gesturehandler.c;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    SparseArray<int[]> f78815a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    SparseArray<int[]> f78816b = new SparseArray<>();

    public final void a(int i) {
        this.f78815a.remove(i);
        this.f78816b.remove(i);
    }

    private static int[] a(ReadableMap readableMap, String str) {
        ReadableArray array = readableMap.getArray(str);
        int[] iArr = new int[array.size()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = array.getInt(i);
        }
        return iArr;
    }

    public final boolean b(b bVar, b bVar2) {
        int[] iArr = this.f78816b.get(bVar.f78772e);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == bVar2.f78772e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(b bVar, ReadableMap readableMap) {
        bVar.q = this;
        if (readableMap.hasKey("waitFor")) {
            this.f78815a.put(bVar.f78772e, a(readableMap, "waitFor"));
        }
        if (readableMap.hasKey("simultaneousHandlers")) {
            this.f78816b.put(bVar.f78772e, a(readableMap, "simultaneousHandlers"));
        }
    }

    public final boolean a(b bVar, b bVar2) {
        int[] iArr = this.f78815a.get(bVar.f78772e);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == bVar2.f78772e) {
                    return true;
                }
            }
        }
        return false;
    }
}
