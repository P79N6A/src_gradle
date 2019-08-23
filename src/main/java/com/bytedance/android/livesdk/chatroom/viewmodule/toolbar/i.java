package com.bytedance.android.livesdk.chatroom.viewmodule.toolbar;

import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.view.View;
import com.bytedance.android.live.core.c.a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d;
import com.bytedance.android.livesdk.j.c;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class i implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13325a;

    /* renamed from: b  reason: collision with root package name */
    public DataCenter f13326b;

    /* renamed from: c  reason: collision with root package name */
    public Map<f, View> f13327c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private Map<f, d.a> f13328d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private Map<String, Object> f13329e = new HashMap();

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f13325a, false, 7731, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f13325a, false, 7731, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        for (Map.Entry next : this.f13327c.entrySet()) {
            if (this.f13327c.get(next.getKey()) != null) {
                b((f) next.getKey(), (View) next.getValue());
            }
        }
        this.f13327c.clear();
        if (z) {
            this.f13328d.clear();
        }
    }

    i() {
    }

    /* access modifiers changed from: package-private */
    public final d.a a(@NonNull f fVar) {
        f fVar2 = fVar;
        if (!PatchProxy.isSupport(new Object[]{fVar2}, this, f13325a, false, 7730, new Class[]{f.class}, d.a.class)) {
            return this.f13328d.get(fVar2);
        }
        return (d.a) PatchProxy.accessDispatch(new Object[]{fVar2}, this, f13325a, false, 7730, new Class[]{f.class}, d.a.class);
    }

    private void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f13325a, false, 7724, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f13325a, false, 7724, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        this.f13329e.put("event_name", str);
        this.f13329e.put("reason", str2);
        c.b().a("ttlive_gift", this.f13329e);
    }

    /* access modifiers changed from: package-private */
    public final void b(@NonNull f fVar, @NonNull View view) {
        if (PatchProxy.isSupport(new Object[]{fVar, view}, this, f13325a, false, 7729, new Class[]{f.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar, view}, this, f13325a, false, 7729, new Class[]{f.class, View.class}, Void.TYPE);
            return;
        }
        d.a aVar = this.f13328d.get(fVar);
        if (aVar != null) {
            aVar.b(view, this.f13326b);
            view.setVisibility(8);
            view.setOnClickListener(null);
        }
    }

    public final void b(@NonNull f fVar, @NonNull d.a aVar) {
        if (PatchProxy.isSupport(new Object[]{fVar, aVar}, this, f13325a, false, 7725, new Class[]{f.class, d.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar, aVar}, this, f13325a, false, 7725, new Class[]{f.class, d.a.class}, Void.TYPE);
            return;
        }
        View view = this.f13327c.get(fVar);
        if (view != null) {
            b(fVar, view);
        }
        this.f13328d.remove(fVar);
        if (this.f13326b != null) {
            this.f13326b.lambda$put$1$DataCenter("tool_bar_button_unload", fVar);
        }
        if (fVar == f.TURNTABLE) {
            a("TOOLBAR_TURNABLE_STATUS", "unLoad");
        } else if (fVar == f.GIFT) {
            a("TOOLBAR_GIFT_STATUS", "unLoad");
        } else {
            if (fVar == f.FAST_GIFT) {
                a("TOOLBAR_FASTGIFT_STATUS", "unLoad");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(@NonNull f fVar, @NonNull View view) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{fVar, view}, this, f13325a, false, 7728, new Class[]{f.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar, view}, this, f13325a, false, 7728, new Class[]{f.class, View.class}, Void.TYPE);
            return;
        }
        d.a aVar = this.f13328d.get(fVar);
        if (aVar != null) {
            view.setVisibility(0);
            view.setOnClickListener(aVar);
            aVar.a(view, this.f13326b);
        }
        if (fVar == f.TURNTABLE) {
            StringBuilder sb = new StringBuilder("TurnTable onConfigReady(), and behavior is valid: ");
            if (aVar != null) {
                z = true;
            }
            sb.append(z);
            a.b("ToolbarManager", sb.toString());
        } else if (fVar == f.GIFT) {
            StringBuilder sb2 = new StringBuilder("Gift onConfigReady(), and behavior is valid: ");
            if (aVar != null) {
                z = true;
            }
            sb2.append(z);
            a.b("ToolbarManager", sb2.toString());
        } else {
            if (fVar == f.FAST_GIFT) {
                StringBuilder sb3 = new StringBuilder("FastGift onConfigReady(), and behavior is valid: ");
                if (aVar != null) {
                    z = true;
                }
                sb3.append(z);
                a.b("ToolbarManager", sb3.toString());
            }
        }
    }

    public final void a(@NonNull f fVar, @NonNull a aVar) {
        f fVar2 = fVar;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{fVar2, aVar2}, this, f13325a, false, 7726, new Class[]{f.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2, aVar2}, this, f13325a, false, 7726, new Class[]{f.class, a.class}, Void.TYPE);
            return;
        }
        d.a aVar3 = this.f13328d.get(fVar2);
        if (aVar3 != null) {
            aVar3.a(aVar2);
        }
    }

    public final void a(@NonNull f fVar, @NonNull d.a aVar) {
        if (PatchProxy.isSupport(new Object[]{fVar, aVar}, this, f13325a, false, 7723, new Class[]{f.class, d.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar, aVar}, this, f13325a, false, 7723, new Class[]{f.class, d.a.class}, Void.TYPE);
            return;
        }
        if (fVar == f.TURNTABLE) {
            a("TOOLBAR_TURNABLE_STATUS", "onLoad");
        } else if (fVar == f.GIFT) {
            a("TOOLBAR_GIFT_STATUS", "onLoad");
        } else if (fVar == f.FAST_GIFT) {
            a("TOOLBAR_FASTGIFT_STATUS", "onLoad");
        }
        View view = this.f13327c.get(fVar);
        if (view != null) {
            b(fVar, view);
        }
        this.f13328d.put(fVar, aVar);
        if (view != null) {
            a(fVar, view);
        }
        if (this.f13326b != null) {
            this.f13326b.lambda$put$1$DataCenter("tool_bar_button_load", fVar);
        }
    }
}
