package com.ss.ugc.live.a;

import com.ss.render.EffectRender;
import com.ss.ugc.live.a.e;
import java.util.ArrayList;
import java.util.List;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected List<i> f78584a;

    /* renamed from: b  reason: collision with root package name */
    protected List<EffectRender.OnRefreshFaceDataListener> f78585b;

    /* renamed from: c  reason: collision with root package name */
    public h f78586c;

    public abstract int a(int i);

    public abstract int a(int i, int i2, int i3, String str);

    public abstract void a();

    public abstract void a(com.ss.ugc.live.a.a.a aVar);

    public abstract void a(e.a aVar);

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract int f();

    public abstract int g();

    public final synchronized void a(EffectRender.OnRefreshFaceDataListener onRefreshFaceDataListener) {
        if (this.f78585b == null) {
            this.f78585b = new ArrayList();
        }
        this.f78585b.add(onRefreshFaceDataListener);
    }

    public final synchronized void b(EffectRender.OnRefreshFaceDataListener onRefreshFaceDataListener) {
        if (this.f78585b != null) {
            for (int size = this.f78585b.size() - 1; size > 0; size--) {
                if (this.f78585b.get(size) == onRefreshFaceDataListener) {
                    this.f78585b.remove(size);
                }
            }
        }
    }

    public final synchronized void b(i iVar) {
        if (this.f78584a != null) {
            for (int size = this.f78584a.size() - 1; size > 0; size--) {
                if (this.f78584a.get(size) == iVar) {
                    this.f78584a.remove(size);
                }
            }
        }
    }

    public final synchronized void a(i iVar) {
        if (this.f78584a == null) {
            this.f78584a = new ArrayList();
        }
        this.f78584a.add(iVar);
    }
}
