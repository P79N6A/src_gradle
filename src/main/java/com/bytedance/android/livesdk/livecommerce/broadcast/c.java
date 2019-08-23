package com.bytedance.android.livesdk.livecommerce.broadcast;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livecommerce.c.e;
import com.bytedance.android.livesdk.livecommerce.c.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16030a;

    /* renamed from: b  reason: collision with root package name */
    public List<f> f16031b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List<e> f16032c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public String f16033d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16034e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f16035f = true;
    public int g = 100;
    public int h = 0;

    public final List<e> a() {
        if (PatchProxy.isSupport(new Object[0], this, f16030a, false, 10483, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f16030a, false, 10483, new Class[0], List.class);
        }
        Collections.sort(this.f16032c, new Comparator<e>() {
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                return ((e) obj).h - ((e) obj2).h;
            }
        });
        return this.f16032c;
    }

    public final int c() {
        if (PatchProxy.isSupport(new Object[0], this, f16030a, false, 10489, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f16030a, false, 10489, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f16032c != null) {
            return this.f16032c.size();
        } else {
            return 0;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f16030a, false, 10487, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16030a, false, 10487, new Class[0], Void.TYPE);
            return;
        }
        this.f16032c.clear();
        for (f next : this.f16031b) {
            if (next instanceof e) {
                a((e) next);
            }
        }
    }

    private static void a(e eVar) {
        if (eVar != null) {
            eVar.h = 0;
        }
    }

    public void a(List<e> list) {
        List<e> list2 = list;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f16030a, false, 10482, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f16030a, false, 10482, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (list2 != null) {
            while (i < list.size()) {
                e eVar = list2.get(i);
                i++;
                eVar.h = i;
                this.f16032c.add(eVar);
            }
        }
    }

    public final void a(String str) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{str}, this, f16030a, false, 10485, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f16030a, false, 10485, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Iterator<f> it2 = this.f16031b.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            f next = it2.next();
            if (next instanceof e) {
                e eVar = (e) next;
                if (TextUtils.equals(str, eVar.m)) {
                    a(eVar);
                    break;
                }
            }
        }
        Iterator<e> it3 = this.f16032c.iterator();
        while (true) {
            if (it3.hasNext()) {
                if (TextUtils.equals(str, it3.next().m)) {
                    it3.remove();
                    break;
                }
            } else {
                break;
            }
        }
        List<e> list = this.f16032c;
        if (PatchProxy.isSupport(new Object[]{list}, this, f16030a, false, 10486, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f16030a, false, 10486, new Class[]{List.class}, Void.TYPE);
            return;
        }
        int size = list.size();
        while (i < size) {
            i++;
            list.get(i).h = i;
        }
    }

    public final void a(int i, boolean z) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f16030a, false, 10484, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, this, f16030a, false, 10484, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (i >= 0 && i < this.f16031b.size()) {
            f fVar = this.f16031b.get(i);
            if (fVar instanceof e) {
                e eVar = (e) fVar;
                if ((eVar.h > 0 && z) || (eVar.h == 0 && !z)) {
                    return;
                }
                if (z) {
                    if (PatchProxy.isSupport(new Object[0], this, f16030a, false, 10488, new Class[0], Integer.TYPE)) {
                        i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f16030a, false, 10488, new Class[0], Integer.TYPE)).intValue();
                    } else {
                        i2 = c() + 1;
                    }
                    eVar.h = i2;
                    this.f16032c.add(eVar);
                    return;
                }
                int i3 = eVar.h;
                a(eVar);
                for (f next : this.f16031b) {
                    if (next instanceof e) {
                        e eVar2 = (e) next;
                        if (eVar2.h > i3) {
                            eVar2.h--;
                        }
                    }
                }
                this.f16032c.remove(eVar);
            }
        }
    }

    public final void a(int i, String str, boolean z) {
        int i2;
        int i3 = i;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f16030a, false, 10495, new Class[]{Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, Byte.valueOf(z)}, this, f16030a, false, 10495, new Class[]{Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (i3 < this.f16032c.size()) {
            List<e> list = this.f16032c;
            if (z) {
                i2 = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
            Collections.swap(list, i, i2);
            int size = this.f16032c.size();
            while (i4 < size) {
                i4++;
                this.f16032c.get(i4).h = i4;
            }
        }
    }
}
