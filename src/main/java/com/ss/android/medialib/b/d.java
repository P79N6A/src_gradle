package com.ss.android.medialib.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.b.a;
import com.ss.android.medialib.b.c;

public class d extends a {
    public static ChangeQuickRedirect m;
    public c n;

    public interface a {
        void a(boolean z);
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 17428, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 17428, new Class[0], Void.TYPE);
            return;
        }
        setEGLContextClientVersion(2);
        this.n = new c();
        setRenderer(this.n);
        setRenderMode(0);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 17429, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 17429, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        AnonymousClass1 r9 = new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f29395a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f29395a, false, 17436, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f29395a, false, 17436, new Class[0], Void.TYPE);
                    return;
                }
                d.this.n.a();
            }
        };
        if (PatchProxy.isSupport(new Object[]{r9}, this, a.f2485a, false, 17368, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{r9}, this, a.f2485a, false, 17368, new Class[]{Runnable.class}, Void.TYPE);
            return;
        }
        a.i iVar = this.f2488d;
        if (PatchProxy.isSupport(new Object[]{r9}, iVar, a.i.f29365a, false, 17404, new Class[]{Runnable.class}, Void.TYPE)) {
            Object[] objArr = {r9};
            a.i iVar2 = iVar;
            PatchProxy.accessDispatch(objArr, iVar2, a.i.f29365a, false, 17404, new Class[]{Runnable.class}, Void.TYPE);
            return;
        }
        synchronized (a.f2486c) {
            iVar.i.add(r9);
            a.f2486c.notifyAll();
        }
    }

    public d(Context context) {
        super(context);
        d();
    }

    public void setDrawFrameCallback(c.b bVar) {
        this.n.f29389e = bVar;
    }

    public void setImage(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{bitmap2}, this, m, false, 17431, new Class[]{Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap2}, this, m, false, 17431, new Class[]{Bitmap.class}, Void.TYPE);
            return;
        }
        if (bitmap2 != null) {
            this.n.a(bitmap2);
            a();
        }
    }

    public void setImage(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, m, false, 17430, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, m, false, 17430, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        if (decodeFile != null) {
            this.n.a(decodeFile);
            a();
        }
    }

    public void setIntensity(float f2) {
        float f3 = f2;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, m, false, 17433, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, m, false, 17433, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        c cVar = this.n;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, cVar, c.f29385a, false, 17418, new Class[]{Float.TYPE}, Void.TYPE)) {
            c cVar2 = cVar;
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, cVar2, c.f29385a, false, 17418, new Class[]{Float.TYPE}, Void.TYPE);
        } else {
            if (cVar.f29386b.a()) {
                cVar.f29386b.a(cVar.f29390f.f29391a, cVar.f29390f.f29393c, cVar.f29390f.f29394d, f3);
            }
            cVar.f29390f.f29392b = f3;
        }
        a();
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    public final void a(String str, float f2) {
        String str2 = str;
        float f3 = f2;
        if (PatchProxy.isSupport(new Object[]{str2, Float.valueOf(f2)}, this, m, false, 17432, new Class[]{String.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Float.valueOf(f2)}, this, m, false, 17432, new Class[]{String.class, Float.TYPE}, Void.TYPE);
            return;
        }
        c cVar = this.n;
        if (PatchProxy.isSupport(new Object[]{str2, Float.valueOf(f2)}, cVar, c.f29385a, false, 17419, new Class[]{String.class, Float.TYPE}, Void.TYPE)) {
            c cVar2 = cVar;
            PatchProxy.accessDispatch(new Object[]{str2, Float.valueOf(f2)}, cVar2, c.f29385a, false, 17419, new Class[]{String.class, Float.TYPE}, Void.TYPE);
        } else {
            if (cVar.f29386b.a()) {
                cVar.f29386b.a(str2, str2, 1.0f, f3);
            }
            cVar.f29390f.f29391a = str2;
            cVar.f29390f.f29392b = f3;
            cVar.f29390f.f29393c = str2;
            cVar.f29390f.f29394d = 1.0f;
        }
        a();
    }
}
