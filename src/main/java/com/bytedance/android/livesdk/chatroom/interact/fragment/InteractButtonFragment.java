package com.bytedance.android.livesdk.chatroom.interact.fragment;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.interact.c.k;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogButtonContract;
import com.bytedance.android.livesdk.chatroom.interact.contract.b;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.android.livesdk.w.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import org.aspectj.lang.a;

public class InteractButtonFragment extends InteractDialogButtonContract.View implements View.OnClickListener {
    public static ChangeQuickRedirect j;
    private static final /* synthetic */ a.C0900a m;
    private int k;
    private DataCenter l;

    public final float d() {
        return 160.0f;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i() {
        b.aF.a(Boolean.FALSE);
        this.f10827b.a(InteractSettingsFragment.a(this.f10827b));
    }

    public final String c() {
        if (!PatchProxy.isSupport(new Object[0], this, j, false, 4492, new Class[0], String.class)) {
            return getString(C0906R.string.d7n);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, j, false, 4492, new Class[0], String.class);
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, j, true, 4495, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, j, true, 4495, new Class[0], Void.TYPE);
            return;
        }
        org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("InteractButtonFragment.java", InteractButtonFragment.class);
        m = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.interact.fragment.InteractButtonFragment", "android.view.View", NotifyType.VIBRATE, "", "void"), 63);
    }

    public final View f() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, j, false, 4493, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, j, false, 4493, new Class[0], View.class);
        }
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.amp, (ViewGroup) getView(), false);
        View findViewById = inflate.findViewById(C0906R.id.b53);
        if (!((Boolean) b.aF.a()).booleanValue()) {
            i = 8;
        }
        findViewById.setVisibility(i);
        inflate.setOnClickListener(new a(this));
        return inflate;
    }

    public final void b() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, j, false, 4490, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 4490, new Class[0], Void.TYPE);
        } else if (this.f8193f) {
            if (this.k == C0906R.id.ayk || this.k == C0906R.id.d95) {
                if (PatchProxy.isSupport(new Object[0], this, j, false, 4494, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, j, false, 4494, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (Build.VERSION.SDK_INT < 21) {
                    ai.a((int) C0906R.string.d7l);
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    this.f10827b.a(InteractPKUserListFragment.a(this.f10827b, 2, this.l));
                }
            }
            this.k = 0;
        }
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, j, false, 4491, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, j, false, 4491, new Class[]{Throwable.class}, Void.TYPE);
        } else if (this.f8193f) {
            this.k = 0;
            l.a(getContext(), th);
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, j, false, 4489, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, j, false, 4489, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(m, this, this, view));
        if (this.k == 0) {
            this.k = view.getId();
            HashMap hashMap = new HashMap();
            if (this.k == C0906R.id.d9a || this.k == C0906R.id.ayp) {
                hashMap.put("connection_type", "audience");
            } else if (this.k == C0906R.id.d95 || this.k == C0906R.id.ayk) {
                hashMap.put("connection_type", "anchor");
            } else {
                hashMap.put("connection_type", PushConstants.URI_PACKAGE_NAME);
            }
            com.bytedance.android.livesdk.j.a.a().a("connection_click", hashMap, new j().a("live_detail").b("live").f("click"), Room.class);
            if (this.k == C0906R.id.d9a || this.k == C0906R.id.ayp) {
                this.k = 0;
                this.l.lambda$put$1$DataCenter("cmd_audience_turn_on_link", new Object());
                return;
            }
            if (!(this.f10827b == null || this.f10827b.c() == null)) {
                ((InteractDialogButtonContract.a) this.h).a(this.f10827b.c().getId());
            }
        }
    }

    public static InteractButtonFragment a(b.C0088b bVar, DataCenter dataCenter) {
        b.C0088b bVar2 = bVar;
        DataCenter dataCenter2 = dataCenter;
        if (PatchProxy.isSupport(new Object[]{bVar2, dataCenter2}, null, j, true, 4487, new Class[]{b.C0088b.class, DataCenter.class}, InteractButtonFragment.class)) {
            return (InteractButtonFragment) PatchProxy.accessDispatch(new Object[]{bVar2, dataCenter2}, null, j, true, 4487, new Class[]{b.C0088b.class, DataCenter.class}, InteractButtonFragment.class);
        }
        InteractButtonFragment interactButtonFragment = new InteractButtonFragment();
        interactButtonFragment.h = new k(interactButtonFragment);
        interactButtonFragment.f10827b = bVar2;
        interactButtonFragment.l = dataCenter2;
        return interactButtonFragment;
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, j, false, 4488, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, j, false, 4488, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.ahz, viewGroup2, false);
        View findViewById = inflate.findViewById(C0906R.id.ayk);
        View findViewById2 = inflate.findViewById(C0906R.id.ayp);
        ((TextView) inflate.findViewById(C0906R.id.d95)).setOnClickListener(this);
        ((TextView) inflate.findViewById(C0906R.id.d9a)).setOnClickListener(this);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        return inflate;
    }
}
