package com.bytedance.android.livesdk.gift.effect.normal.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.effect.normal.b.a;
import com.bytedance.android.livesdk.gift.effect.normal.d.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class NormalGiftAnimationView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14935a;

    /* renamed from: b  reason: collision with root package name */
    public List<a> f14936b;

    /* renamed from: c  reason: collision with root package name */
    private Context f14937c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, b> f14938d;

    /* renamed from: e  reason: collision with root package name */
    private Queue<b> f14939e;

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.android.livesdk.gift.effect.entry.d.a f14940f;
    private int g;
    private com.bytedance.android.livesdk.gift.effect.normal.c.b h;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f14935a, false, 9576, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14935a, false, 9576, new Class[0], Void.TYPE);
            return;
        }
        if (this.f14938d != null) {
            this.f14938d.clear();
        }
        if (this.f14939e != null) {
            this.f14939e.clear();
        }
    }

    private void c() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f14935a, false, 9569, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14935a, false, 9569, new Class[0], Void.TYPE);
            return;
        }
        this.f14936b = new ArrayList();
        while (i < 2) {
            i++;
            a aVar = new a(this.f14937c, this, i);
            aVar.h = this.h;
            this.f14936b.add(aVar);
        }
        this.f14938d = new LinkedHashMap();
        this.f14939e = new ArrayDeque();
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f14935a, false, 9574, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14935a, false, 9574, new Class[0], Void.TYPE);
            return;
        }
        b bVar = null;
        if (this.f14939e.size() > this.g) {
            Iterator it2 = this.f14939e.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                b bVar2 = (b) it2.next();
                if (bVar2.g) {
                    bVar = bVar2;
                    break;
                }
            }
        }
        if (bVar != null && this.f14939e.contains(bVar)) {
            this.f14938d.remove(bVar.a());
            this.f14939e.remove(bVar);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f14935a, false, 9575, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14935a, false, 9575, new Class[0], Void.TYPE);
        } else if (!this.f14939e.isEmpty()) {
            b peek = this.f14939e.peek();
            for (a next : this.f14936b) {
                if (next.f14901c) {
                    this.f14939e.poll();
                    this.f14938d.remove(peek.a());
                    next.b(peek);
                    return;
                }
            }
        }
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f14935a, false, 9577, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14935a, false, 9577, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.f14938d.clear();
        this.f14939e.clear();
        for (a next : this.f14936b) {
            if (next.h != null) {
                next.h = null;
            }
            if (next.i != null) {
                next.i = null;
            }
            if (PatchProxy.isSupport(new Object[0], next, a.f14899a, false, 9533, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], next, a.f14899a, false, 9533, new Class[0], Void.TYPE);
            } else {
                if (next.g != null) {
                    next.f14904f.removeView(next.g);
                    next.g.b();
                }
                next.f14901c = true;
            }
        }
    }

    public NormalGiftAnimationView(@NonNull Context context) {
        this(context, null);
    }

    public void setNormalGiftEventListener(com.bytedance.android.livesdk.gift.effect.entry.d.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f14935a, false, 9570, new Class[]{com.bytedance.android.livesdk.gift.effect.entry.d.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f14935a, false, 9570, new Class[]{com.bytedance.android.livesdk.gift.effect.entry.d.a.class}, Void.TYPE);
            return;
        }
        this.f14940f = aVar;
        for (a aVar2 : this.f14936b) {
            aVar2.i = aVar;
        }
    }

    public void setOrientation(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f14935a, false, 9572, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f14935a, false, 9572, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        for (a next : this.f14936b) {
            if (next != null) {
                next.j = i;
            } else {
                int i2 = i;
            }
        }
    }

    public NormalGiftAnimationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(com.bytedance.android.livesdk.gift.effect.normal.a.a aVar, Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{aVar, objArr}, this, f14935a, false, 9573, new Class[]{com.bytedance.android.livesdk.gift.effect.normal.a.a.class, Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, objArr}, this, f14935a, false, 9573, new Class[]{com.bytedance.android.livesdk.gift.effect.normal.a.a.class, Object[].class}, Void.TYPE);
            return;
        }
        b a2 = aVar.a(objArr);
        for (a a3 : this.f14936b) {
            if (a3.a(a2)) {
                return;
            }
        }
        if (this.f14938d.containsKey(a2.a())) {
            b bVar = this.f14938d.get(a2.a());
            if (bVar.g) {
                this.f14938d.remove(bVar.a());
                if (!a2.g && a2.f14909c != bVar.f14909c) {
                    this.f14938d.put(a2.a(), a2);
                    this.f14939e.add(a2);
                    d();
                }
            } else if (a2.g) {
                bVar.g = true;
                bVar.h = a2.h;
                bVar.r = a2.r;
            } else {
                bVar.a(a2);
            }
        } else if (!a2.g) {
            this.f14938d.put(a2.a(), a2);
            this.f14939e.add(a2);
            d();
        } else if (this.f14940f != null) {
            this.f14940f.a(a2.l, a2.h, a2.j, a2.r);
        }
        a();
    }

    public NormalGiftAnimationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = ((Integer) LiveSettingKeys.LIVE_MESSAGE_QUEUE_MAX_LENGTH.a()).intValue();
        this.h = new com.bytedance.android.livesdk.gift.effect.normal.c.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14941a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f14941a, false, 9578, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f14941a, false, 9578, new Class[0], Void.TYPE);
                    return;
                }
                NormalGiftAnimationView.this.a();
            }
        };
        this.f14937c = context;
        c();
    }
}
