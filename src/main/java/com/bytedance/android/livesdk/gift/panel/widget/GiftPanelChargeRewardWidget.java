package com.bytedance.android.livesdk.gift.panel.widget;

import com.bytedance.android.live.e.a;
import com.bytedance.android.live.f.b;
import com.bytedance.ies.sdk.widgets.Widget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

public class GiftPanelChargeRewardWidget extends Widget {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15295a;

    /* renamed from: b  reason: collision with root package name */
    private CompositeDisposable f15296b = new CompositeDisposable();

    /* renamed from: c  reason: collision with root package name */
    private GiftDialogViewModel f15297c;

    public int getLayoutId() {
        return C0906R.layout.ag_;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f15295a, false, 10001, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15295a, false, 10001, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f15295a, false, 9996, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15295a, false, 9996, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        ((b) com.bytedance.android.live.utility.b.a(b.class)).walletCenter().e();
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f15295a, false, 9995, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15295a, false, 9995, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.f15297c = (GiftDialogViewModel) this.dataCenter.get("data_gift_dialog_view_model");
        if (PatchProxy.isSupport(new Object[0], this, f15295a, false, 9997, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15295a, false, 9997, new Class[0], Void.TYPE);
            return;
        }
        this.f15296b.add(((a) com.bytedance.android.live.utility.b.a(a.class)).user().f().subscribe((Consumer<? super T>) new h<Object>(this)));
    }
}
