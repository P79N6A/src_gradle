package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.SurfaceView;
import com.bytedance.android.livesdk.chatroom.interact.y;
import com.bytedance.android.livesdk.chatroom.widget.k;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.effect.a;
import com.bytedance.android.livesdk.effect.c;
import com.bytedance.android.livesdk.live.model.Camera2AB;
import com.bytedance.android.livesdk.s;
import com.bytedance.android.livesdk.sticker.a.d;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.b.a.a.g.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.a.a.d;
import com.ss.ugc.live.a.b;
import com.ss.ugc.live.a.d;
import com.ss.ugc.live.a.i;
import java.io.FileNotFoundException;
import javax.microedition.khronos.egl.EGLContext;

public class LinkVideo2View extends SurfaceView implements y, k, i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13382a;

    /* renamed from: b  reason: collision with root package name */
    public d f13383b;

    /* renamed from: c  reason: collision with root package name */
    private a f13384c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.ugc.live.a.a f13385d;

    /* renamed from: e  reason: collision with root package name */
    private b f13386e;

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.android.livesdk.sticker.a.b f13387f;

    public final void c() {
    }

    public final void d() {
    }

    public final void e() {
    }

    public final void f() {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f13382a, false, 7890, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13382a, false, 7890, new Class[0], Void.TYPE);
            return;
        }
        try {
            this.f13385d.b();
        } catch (NullPointerException e2) {
            com.bytedance.android.live.core.c.a.a(6, "LinkVideo2View", e2.getStackTrace());
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f13382a, false, 7891, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13382a, false, 7891, new Class[0], Void.TYPE);
            return;
        }
        try {
            this.f13385d.a();
        } catch (NullPointerException e2) {
            com.bytedance.android.live.core.c.a.a(6, "LinkVideo2View", e2.getStackTrace());
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f13382a, false, 7888, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13382a, false, 7888, new Class[0], Void.TYPE);
            return;
        }
        this.f13385d.d();
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f13382a, false, 7886, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13382a, false, 7886, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.f13385d.a();
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f13382a, false, 7887, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13382a, false, 7887, new Class[0], Void.TYPE);
            return;
        }
        this.f13385d.b();
        this.f13385d.c();
        super.onDetachedFromWindow();
        j.q().o().b();
    }

    public final void a(b bVar) {
        this.f13386e = bVar;
    }

    public LinkVideo2View(Context context) {
        this(context, null, null);
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f13382a, false, 7889, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f13382a, false, 7889, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f13384c.a(i);
    }

    public LinkVideo2View(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null);
    }

    public LinkVideo2View(Context context, k.a aVar) {
        this(context, null, aVar);
    }

    public LinkVideo2View(Context context, AttributeSet attributeSet, k.a aVar) {
        super(context, attributeSet);
        int i;
        boolean z;
        int i2;
        this.f13387f = new com.bytedance.android.livesdk.sticker.a.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f13389a;

            public final int a() {
                if (PatchProxy.isSupport(new Object[0], this, f13389a, false, 7899, new Class[0], Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f13389a, false, 7899, new Class[0], Integer.TYPE)).intValue();
                }
                LinkVideo2View.this.f13383b.a();
                return 1;
            }

            public final int a(boolean z) {
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f13389a, false, 7898, new Class[]{Boolean.TYPE}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f13389a, false, 7898, new Class[]{Boolean.TYPE}, Integer.TYPE)).intValue();
                }
                LinkVideo2View.this.f13383b.a(z);
                return 1;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final int a(java.lang.String[] r18) {
                /*
                    r17 = this;
                    r0 = r18
                    r1 = 1
                    java.lang.Object[] r2 = new java.lang.Object[r1]
                    r9 = 0
                    r2[r9] = r0
                    com.meituan.robust.ChangeQuickRedirect r4 = f13389a
                    java.lang.Class[] r7 = new java.lang.Class[r1]
                    java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
                    r7[r9] = r3
                    java.lang.Class r8 = java.lang.Integer.TYPE
                    r5 = 0
                    r6 = 7896(0x1ed8, float:1.1065E-41)
                    r3 = r17
                    boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                    if (r2 == 0) goto L_0x003b
                    java.lang.Object[] r10 = new java.lang.Object[r1]
                    r10[r9] = r0
                    com.meituan.robust.ChangeQuickRedirect r12 = f13389a
                    r13 = 0
                    r14 = 7896(0x1ed8, float:1.1065E-41)
                    java.lang.Class[] r15 = new java.lang.Class[r1]
                    java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
                    r15[r9] = r0
                    java.lang.Class r16 = java.lang.Integer.TYPE
                    r11 = r17
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                    java.lang.Integer r0 = (java.lang.Integer) r0
                    int r0 = r0.intValue()
                    return r0
                L_0x003b:
                    r2 = r17
                    com.bytedance.android.livesdk.chatroom.widget.LinkVideo2View r3 = com.bytedance.android.livesdk.chatroom.widget.LinkVideo2View.this
                    com.ss.ugc.live.a.a.d r3 = r3.f13383b
                    r3.a((java.lang.String[]) r0)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.widget.LinkVideo2View.AnonymousClass2.a(java.lang.String[]):int");
            }

            public final int a(String str, boolean z) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f13389a, false, 7895, new Class[]{String.class, Boolean.TYPE}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, f13389a, false, 7895, new Class[]{String.class, Boolean.TYPE}, Integer.TYPE)).intValue();
                }
                try {
                    LinkVideo2View.this.f13383b.a(str2, z);
                    return 1;
                } catch (FileNotFoundException e2) {
                    com.bytedance.android.live.core.c.a.a("LinkVideo2View", (Throwable) e2);
                    return -1;
                }
            }

            public final int a(String str, String str2, float f2) {
                String str3 = str;
                String str4 = str2;
                if (PatchProxy.isSupport(new Object[]{str3, str4, Float.valueOf(f2)}, this, f13389a, false, 7897, new Class[]{String.class, String.class, Float.TYPE}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{str3, str4, Float.valueOf(f2)}, this, f13389a, false, 7897, new Class[]{String.class, String.class, Float.TYPE}, Integer.TYPE)).intValue();
                }
                try {
                    LinkVideo2View.this.f13383b.a(str3, str4, f2);
                    return 1;
                } catch (FileNotFoundException e2) {
                    com.bytedance.android.live.core.c.a.a("LinkVideo2View", (Throwable) e2);
                    return -1;
                }
            }
        };
        String modelFilePath = s.INST.getModelFilePath();
        int i3 = 1;
        if (aVar == null) {
            i = 1;
        } else {
            i = aVar.f13502c;
        }
        d.a a2 = new d.a(getContext()).a(i).a(modelFilePath).a(240, 320);
        if (((Integer) LiveSettingKeys.USE_NEW_RENDER_CHAIN.a()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f13385d = new com.ss.ugc.live.a.b(this, a2.a(z).b(((Camera2AB) LiveConfigSettingKeys.CAMERA_AB_SETTING_KEY.a()).getCameraType() == 2 ? 2 : i3).a(s.INST.getResourceFinder(getContext())).a(), new b.a() {
            public final void a() {
            }

            public final void b() {
            }
        });
        if (PatchProxy.isSupport(new Object[0], this, f13382a, false, 7894, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13382a, false, 7894, new Class[0], Void.TYPE);
        } else {
            j.q().o().a(new d.a().a(this.f13387f).a());
        }
        this.f13383b = new com.ss.ugc.live.a.a.d();
        this.f13385d.a((com.ss.ugc.live.a.a.a) this.f13383b);
        this.f13384c = new c();
        if (aVar == null) {
            i2 = this.f13384c.g;
        } else {
            i2 = aVar.f13500a;
        }
        this.f13384c.a(i2);
        if (!(aVar == null || aVar.f13501b == null)) {
            j.q().o().a(com.bytedance.android.livesdk.sticker.c.a.f17263d, aVar.f13501b);
        }
        this.f13385d.a((i) this);
    }

    public final void a(EGLContext eGLContext, int i, int i2, int i3, int i4, long j, Bundle bundle) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{eGLContext, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), new Long(j2), bundle}, this, f13382a, false, 7893, new Class[]{EGLContext.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Long.TYPE, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eGLContext, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), new Long(j2), bundle}, this, f13382a, false, 7893, new Class[]{EGLContext.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Long.TYPE, Bundle.class}, Void.TYPE);
        } else if (this.f13386e != null) {
            this.f13386e.a(eGLContext, null, i, i3, i4, j);
        }
    }
}
