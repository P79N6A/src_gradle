package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogSettingContract;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final class bg extends InteractDialogSettingContract.a {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f10426e;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() throws Exception {
        ((InteractDialogSettingContract.View) this.f10831c).i();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d() throws Exception {
        ((InteractDialogSettingContract.View) this.f10831c).b();
    }

    public bg(InteractDialogSettingContract.View view) {
        super(view);
    }

    public final void a(boolean z) {
        Consumer consumer;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f10426e, false, 4707, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f10426e, false, 4707, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ab abVar = (ab) j.q().d().a().settings(z ? 1 : 0).as(b());
        bh bhVar = new bh(this);
        InteractDialogSettingContract.View view = (InteractDialogSettingContract.View) this.f10831c;
        view.getClass();
        if (PatchProxy.isSupport(new Object[]{view}, null, bi.f10429a, true, 4710, new Class[]{InteractDialogSettingContract.View.class}, Consumer.class)) {
            consumer = (Consumer) PatchProxy.accessDispatch(new Object[]{view}, null, bi.f10429a, true, 4710, new Class[]{InteractDialogSettingContract.View.class}, Consumer.class);
        } else {
            consumer = new bi(view);
        }
        abVar.a(bhVar, consumer);
    }

    public final void b(boolean z) {
        int i;
        Consumer consumer;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f10426e, false, 4708, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f10426e, false, 4708, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        LinkApi a2 = j.q().d().a();
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        ab abVar = (ab) a2.settings(i).as(b());
        bj bjVar = new bj(this);
        InteractDialogSettingContract.View view = (InteractDialogSettingContract.View) this.f10831c;
        view.getClass();
        if (PatchProxy.isSupport(new Object[]{view}, null, bk.f10433a, true, 4713, new Class[]{InteractDialogSettingContract.View.class}, Consumer.class)) {
            consumer = (Consumer) PatchProxy.accessDispatch(new Object[]{view}, null, bk.f10433a, true, 4713, new Class[]{InteractDialogSettingContract.View.class}, Consumer.class);
        } else {
            consumer = new bk(view);
        }
        abVar.a(bjVar, consumer);
    }
}
