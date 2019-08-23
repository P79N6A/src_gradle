package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.jsbridge.a.b;
import com.bytedance.android.livesdk.g.c;
import com.bytedance.android.livesdk.wallet.RechargeDialog;
import com.bytedance.android.livesdk.wallet.a;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.Widget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

public class RechargeWidget extends Widget {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12785a;

    /* renamed from: b  reason: collision with root package name */
    a f12786b;

    /* renamed from: c  reason: collision with root package name */
    private RechargeDialog f12787c;

    /* renamed from: d  reason: collision with root package name */
    private Observer<KVData> f12788d = new eg(this);

    /* renamed from: e  reason: collision with root package name */
    private CompositeDisposable f12789e = new CompositeDisposable();

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f12785a, false, 7446, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12785a, false, 7446, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.dataCenter.observeForever("cmd_show_recharge_dialog", this.f12788d);
        this.dataCenter.observeForever("cmd_show_pay_dialog", this.f12788d);
        if (this.f12789e != null) {
            this.f12789e.clear();
        }
        a(b.class);
        a(c.class);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f12785a, false, 7448, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12785a, false, 7448, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.f12789e != null) {
            this.f12789e.clear();
        }
        this.dataCenter.removeObserver(this.f12788d);
        if (this.f12787c != null && this.f12787c.isShowing()) {
            this.f12787c.dismiss();
        }
    }

    private <T> void a(Class<T> cls) {
        if (PatchProxy.isSupport(new Object[]{cls}, this, f12785a, false, 7447, new Class[]{Class.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls}, this, f12785a, false, 7447, new Class[]{Class.class}, Void.TYPE);
            return;
        }
        this.f12789e.add(com.bytedance.android.livesdk.u.a.a().a(cls).subscribe((Consumer<? super T>) new Consumer<T>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12790a;

            public final void accept(T t) throws Exception {
                if (PatchProxy.isSupport(new Object[]{t}, this, f12790a, false, 7456, new Class[]{Object.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{t}, this, f12790a, false, 7456, new Class[]{Object.class}, Void.TYPE);
                } else if (t instanceof b) {
                    RechargeWidget.this.onEvent((b) t);
                } else {
                    if (t instanceof c) {
                        RechargeWidget.this.onEvent((c) t);
                    }
                }
            }
        }));
    }

    public void onEvent(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f12785a, false, 7449, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f12785a, false, 7449, new Class[]{b.class}, Void.TYPE);
        } else if (TextUtils.equals("in_room_dialog", bVar.f9420a)) {
            a(bVar.f9421b, bVar.f9422c, bVar.f9423d, 0);
        } else {
            a(bVar.f9421b);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f12785a, false, 7453, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f12785a, false, 7453, new Class[]{String.class}, Void.TYPE);
            return;
        }
        TTLiveSDKContext.getHostService().c().a((Activity) this.context);
    }

    public void onEvent(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f12785a, false, 7450, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f12785a, false, 7450, new Class[]{c.class}, Void.TYPE);
            return;
        }
        if (this.f12786b != null && this.f12786b.isShowing()) {
            this.f12786b.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, String str2, String str3, int i) {
        String str4 = str3;
        if (PatchProxy.isSupport(new Object[]{str, str2, str4, Integer.valueOf(i)}, this, f12785a, false, 7452, new Class[]{String.class, String.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, str4, Integer.valueOf(i)}, this, f12785a, false, 7452, new Class[]{String.class, String.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        RechargeDialog.a((FragmentActivity) this.context, ((Boolean) this.dataCenter.get("data_is_anchor", Boolean.FALSE)).booleanValue(), str4, i, this.dataCenter);
    }
}
