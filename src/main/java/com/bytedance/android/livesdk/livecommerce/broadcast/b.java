package com.bytedance.android.livesdk.livecommerce.broadcast;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livecommerce.c.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16027a;

    /* renamed from: b  reason: collision with root package name */
    public List<e> f16028b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public String f16029c;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f16027a, false, 10475, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16027a, false, 10475, new Class[0], Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(this.f16029c)) {
            for (e eVar : this.f16028b) {
                if (TextUtils.equals(this.f16029c, eVar.m)) {
                    return;
                }
            }
            this.f16029c = null;
        }
    }

    public final void a(String str) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{str}, this, f16027a, false, 10474, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f16027a, false, 10474, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Iterator<e> it2 = this.f16028b.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (TextUtils.equals(str, it2.next().m)) {
                    it2.remove();
                    break;
                }
            } else {
                break;
            }
        }
        List<e> list = this.f16028b;
        if (PatchProxy.isSupport(new Object[]{list}, this, f16027a, false, 10476, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f16027a, false, 10476, new Class[]{List.class}, Void.TYPE);
            return;
        }
        int size = list.size();
        while (i < size) {
            i++;
            list.get(i).h = i;
        }
    }

    public final void a(int i, String str, boolean z) {
        int i2;
        int i3 = i;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f16027a, false, 10479, new Class[]{Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, Byte.valueOf(z)}, this, f16027a, false, 10479, new Class[]{Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (i3 < this.f16028b.size()) {
            List<e> list = this.f16028b;
            if (z) {
                i2 = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
            Collections.swap(list, i, i2);
            int size = this.f16028b.size();
            while (i4 < size) {
                i4++;
                this.f16028b.get(i4).h = i4;
            }
        }
    }
}
