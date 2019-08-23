package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKSettingContract;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.w.b;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final class al extends InteractDialogPKSettingContract.a {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f10380e;

    /* renamed from: f  reason: collision with root package name */
    private int f10381f = ((Integer) b.aC.a()).intValue();
    private int g = ((Integer) b.aD.a()).intValue();
    private String h;

    public final int c() {
        return this.f10381f;
    }

    public final int d() {
        return this.g;
    }

    public final String e() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f() throws Exception {
        ((InteractDialogPKSettingContract.View) this.f10831c).i();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g() throws Exception {
        ((InteractDialogPKSettingContract.View) this.f10831c).b();
    }

    public al(InteractDialogPKSettingContract.View view) {
        super(view);
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f10380e, false, 4679, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f10380e, false, 4679, new Class[]{String.class}, Void.TYPE);
        } else if (!StringUtils.isEmpty(str)) {
            this.h = str2;
        }
    }

    public final void a(boolean z) {
        Consumer consumer;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f10380e, false, 4680, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f10380e, false, 4680, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ab abVar = (ab) j.q().d().a().settings(z ? 1 : 0).as(b());
        am amVar = new am(this);
        InteractDialogPKSettingContract.View view = (InteractDialogPKSettingContract.View) this.f10831c;
        view.getClass();
        if (PatchProxy.isSupport(new Object[]{view}, null, an.f10384a, true, 4683, new Class[]{InteractDialogPKSettingContract.View.class}, Consumer.class)) {
            consumer = (Consumer) PatchProxy.accessDispatch(new Object[]{view}, null, an.f10384a, true, 4683, new Class[]{InteractDialogPKSettingContract.View.class}, Consumer.class);
        } else {
            consumer = new an(view);
        }
        abVar.a(amVar, consumer);
    }

    public final void b(boolean z) {
        int i;
        Consumer consumer;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f10380e, false, 4681, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f10380e, false, 4681, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        LinkApi a2 = j.q().d().a();
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        ab abVar = (ab) a2.settings(i).as(b());
        ao aoVar = new ao(this);
        InteractDialogPKSettingContract.View view = (InteractDialogPKSettingContract.View) this.f10831c;
        view.getClass();
        if (PatchProxy.isSupport(new Object[]{view}, null, ap.f10388a, true, 4686, new Class[]{InteractDialogPKSettingContract.View.class}, Consumer.class)) {
            consumer = (Consumer) PatchProxy.accessDispatch(new Object[]{view}, null, ap.f10388a, true, 4686, new Class[]{InteractDialogPKSettingContract.View.class}, Consumer.class);
        } else {
            consumer = new ap(view);
        }
        abVar.a(aoVar, consumer);
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f10380e, false, 4678, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f10380e, false, 4678, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f10381f = i;
        this.g = i2;
        b.aC.a(Integer.valueOf(this.f10381f));
        b.aD.a(Integer.valueOf(i2));
        ((InteractDialogPKSettingContract.View) this.f10831c).a(this.f10381f);
    }
}
