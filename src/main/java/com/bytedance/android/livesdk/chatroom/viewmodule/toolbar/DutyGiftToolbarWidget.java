package com.bytedance.android.livesdk.chatroom.viewmodule.toolbar;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class DutyGiftToolbarWidget extends LiveRecyclableWidget implements Observer<KVData>, View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13296a;

    /* renamed from: b  reason: collision with root package name */
    static final int f13297b = C0906R.layout.ao5;

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ a.C0900a f13298f;

    /* renamed from: c  reason: collision with root package name */
    private i f13299c;

    /* renamed from: d  reason: collision with root package name */
    private ViewGroup f13300d;

    /* renamed from: e  reason: collision with root package name */
    private View f13301e;

    public int getLayoutId() {
        return C0906R.layout.am8;
    }

    public void onUnload() {
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f13296a, true, 7692, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f13296a, true, 7692, new Class[0], Void.TYPE);
        } else {
            b bVar = new b("DutyGiftToolbarWidget.java", DutyGiftToolbarWidget.class);
            f13298f = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.DutyGiftToolbarWidget", "android.view.View", NotifyType.VIBRATE, "", "void"), 86);
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        KVData kVData = (KVData) obj;
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f13296a, false, 7687, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f13296a, false, 7687, new Class[]{KVData.class}, Void.TYPE);
            return;
        }
        if (!(kVData == null || kVData.getKey() == null || kVData.getData() == null || !"tool_bar_button_load".equals(kVData.getKey()) || !((f) kVData.getData()).equals(f.GIFT))) {
            d.a a2 = this.f13299c.a(f.GIFT);
            if (a2 != null) {
                this.f13301e.setVisibility(0);
                this.f13301e.setOnClickListener(a2);
            }
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13296a, false, 7691, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13296a, false, 7691, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(f13298f, this, this, view));
        if (view.getId() == C0906R.id.a_) {
            this.dataCenter.lambda$put$1$DataCenter("cmd_stop_duty_gift", Boolean.TRUE);
        }
    }

    public void onInit(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f13296a, false, 7688, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f13296a, false, 7688, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f13300d = (ViewGroup) this.contentView.findViewById(C0906R.id.aa);
        this.contentView.findViewById(C0906R.id.a_).setOnClickListener(this);
    }

    public void onLoad(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f13296a, false, 7689, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f13296a, false, 7689, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f13299c = (i) j.a();
        this.dataCenter.observeForever("tool_bar_button_load", this).observeForever("tool_bar_button_unload", this);
        f fVar = f.GIFT;
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f13296a, false, 7690, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, f13296a, false, 7690, new Class[]{f.class}, Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(this.context).inflate(fVar.getLayoutId(), this.f13300d, false);
        inflate.setTag(fVar);
        if (fVar.getLayoutId() == f13297b) {
            inflate.setBackgroundResource(fVar.getDrawableUnfolded());
        }
        inflate.setVisibility(8);
        ViewParent parent = inflate.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(inflate);
        }
        this.f13300d.addView(inflate);
        this.f13299c.a(fVar, inflate);
        this.f13301e = inflate;
    }
}
