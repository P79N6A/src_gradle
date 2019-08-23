package com.bytedance.apm.battery.c;

import android.text.TextUtils;
import com.bytedance.apm.battery.b.a;
import com.bytedance.apm.k.m;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class b implements i {

    /* renamed from: a  reason: collision with root package name */
    private String f18925a;

    /* renamed from: b  reason: collision with root package name */
    private int f18926b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f18927c;

    /* renamed from: d  reason: collision with root package name */
    private Set<String> f18928d = new HashSet(4);

    public final void b() {
        this.f18927c = false;
    }

    public final void c() {
        this.f18927c = true;
    }

    public final void d() {
        if (this.f18926b > 0 && !this.f18927c) {
            a();
        }
    }

    private void a() {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.f18927c;
        String str = this.f18925a;
        if (this.f18926b > 0) {
            z = true;
        } else {
            z = false;
        }
        com.bytedance.apm.f.b bVar = new com.bytedance.apm.f.b(z2, currentTimeMillis, str, z);
        a.a().a(bVar);
    }

    public b(String str) {
        this.f18925a = str;
    }

    public final void b(String str) {
        if (this.f18926b > 0) {
            this.f18926b--;
            if (!TextUtils.isEmpty(str)) {
                this.f18928d.remove(str);
            }
            if (this.f18926b == 0) {
                a();
            }
        }
    }

    public final void a(String str) {
        this.f18926b++;
        if (!TextUtils.isEmpty(str)) {
            this.f18928d.add(str);
        }
        if (this.f18926b == 1) {
            a();
        }
    }

    private static m<Long, Long> b(List<com.bytedance.apm.f.b> list, int i, int i2) {
        long j;
        long j2;
        com.bytedance.apm.f.b bVar = list.get(i);
        com.bytedance.apm.f.b bVar2 = list.get(i2);
        long j3 = 0;
        if (bVar.f18982b && bVar2.f18982b) {
            j2 = bVar2.f18983c - bVar.f18983c;
        } else if (!bVar.a() || !bVar2.a()) {
            if (bVar.f18982b && bVar2.a()) {
                while (true) {
                    if (i > i2) {
                        break;
                    }
                    com.bytedance.apm.f.b bVar3 = list.get(i);
                    if (bVar3.a()) {
                        j3 = bVar3.f18983c - bVar.f18983c;
                        j = bVar2.f18983c - bVar3.f18983c;
                        break;
                    }
                    i++;
                }
            } else if (bVar.a() && bVar2.f18982b) {
                while (i <= i2) {
                    com.bytedance.apm.f.b bVar4 = list.get(i);
                    if (bVar4.f18982b) {
                        j3 = bVar4.f18983c - bVar.f18983c;
                        j2 = bVar2.f18983c - bVar4.f18983c;
                    } else {
                        i++;
                    }
                }
            }
            j = 0;
            return new m<>(Long.valueOf(j3), Long.valueOf(j));
        } else {
            j = bVar2.f18983c - bVar.f18983c;
            return new m<>(Long.valueOf(j3), Long.valueOf(j));
        }
        long j4 = j2;
        j = j3;
        j3 = j4;
        return new m<>(Long.valueOf(j3), Long.valueOf(j));
    }

    /* access modifiers changed from: protected */
    public final m<Long, Long> a(List<com.bytedance.apm.f.b> list, int i, int i2) {
        new HashSet();
        String str = null;
        long j = 0;
        long j2 = 0;
        int i3 = -1;
        int i4 = -1;
        while (i <= i2) {
            com.bytedance.apm.f.b bVar = list.get(i);
            if (this.f18925a.equals(bVar.f18984d)) {
                String str2 = bVar.l;
                if (str != null && !TextUtils.equals(str, str2)) {
                    if (i3 >= 0 && i4 == -1) {
                        m<Long, Long> b2 = b(list, i3, i2);
                        j += ((Long) b2.f19039a).longValue();
                        j2 += ((Long) b2.f19040b).longValue();
                    }
                    i3 = -1;
                    i4 = -1;
                }
                if (bVar.f18985e) {
                    i3 = i;
                } else if ((!bVar.f18985e) && i > i3 && i3 >= 0) {
                    i4 = i;
                }
                if (i3 < 0 || i4 <= i3) {
                    str = str2;
                } else {
                    m<Long, Long> b3 = b(list, i3, i4);
                    j += ((Long) b3.f19039a).longValue();
                    j2 += ((Long) b3.f19040b).longValue();
                    str = str2;
                    i3 = -1;
                    i4 = -1;
                }
            }
            i++;
        }
        if (i3 >= 0 && i4 == -1) {
            m<Long, Long> b4 = b(list, i3, i2);
            j += ((Long) b4.f19039a).longValue();
            j2 += ((Long) b4.f19040b).longValue();
        }
        return new m<>(Long.valueOf(j), Long.valueOf(j2));
    }
}
