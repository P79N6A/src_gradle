package com.bytedance.android.livesdk.chatroom.interact.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import com.bytedance.android.live.core.rxutils.autodispose.e;
import com.bytedance.android.livesdk.chatroom.event.aa;
import com.bytedance.android.livesdk.chatroom.interact.c.ar;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKTypeContract;
import com.bytedance.android.livesdk.chatroom.interact.contract.b;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.android.livesdk.w.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.aspectj.lang.a;

public class InteractPKTypeFragment extends InteractDialogPKTypeContract.View implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    public static ChangeQuickRedirect j;
    private static final String l;
    private static final /* synthetic */ a.C0900a q;
    Switch k;
    private DataCenter m;
    private TextView n;
    private TextView o;
    private View p;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        b.aE.a(Boolean.FALSE);
        if (com.bytedance.android.live.uikit.a.a.f()) {
            this.f10827b.a(InteractSettingsFragment.a(this.f10827b));
        } else {
            this.f10827b.a(InteractPKSettingFragment.a(this.f10827b));
        }
    }

    public final String c() {
        if (!PatchProxy.isSupport(new Object[0], this, j, false, 4569, new Class[0], String.class)) {
            return getString(C0906R.string.d7q);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, j, false, 4569, new Class[0], String.class);
    }

    static {
        String str;
        if (PatchProxy.isSupport(new Object[0], null, j, true, 4574, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, j, true, 4574, new Class[0], Void.TYPE);
        } else {
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("InteractPKTypeFragment.java", InteractPKTypeFragment.class);
            q = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.interact.fragment.InteractPKTypeFragment", "android.view.View", NotifyType.VIBRATE, "", "void"), 130);
        }
        if (com.bytedance.android.livesdkapi.a.a.f18616d) {
            str = "https://api.hypstar.com/hotsoon/in_app/touta_rule/";
        } else {
            str = "https://hotsoon.snssdk.com/hotsoon/in_app/common_live/touta_rule/";
        }
        l = str;
    }

    public final float d() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 4568, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, j, false, 4568, new Class[0], Float.TYPE)).floatValue();
        } else if (com.bytedance.android.live.uikit.a.a.f()) {
            return 176.0f;
        } else {
            if (com.bytedance.android.live.uikit.a.a.d() || com.bytedance.android.live.uikit.a.a.g()) {
                return 216.0f;
            }
            return 176.0f;
        }
    }

    public final View f() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, j, false, 4570, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, j, false, 4570, new Class[0], View.class);
        }
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.amp, (ViewGroup) getView(), false);
        View findViewById = inflate.findViewById(C0906R.id.b53);
        if (!((Boolean) b.aE.a()).booleanValue()) {
            i = 8;
        }
        findViewById.setVisibility(i);
        inflate.setOnClickListener(new k(this));
        return inflate;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, j, false, 4573, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, j, false, 4573, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i > 1 && com.bytedance.android.live.uikit.a.a.d()) {
            this.n.setText(String.valueOf(i));
            this.n.setVisibility(0);
            this.o.setVisibility(0);
            this.p.setVisibility(0);
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, j, false, 4566, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, j, false, 4566, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(q, this, this, view));
        if (view.getId() == C0906R.id.b36 || view.getId() == C0906R.id.def) {
            this.f10827b.a(InteractPKMatchFragment.a(this.f10827b, this.m));
        } else if (view.getId() == C0906R.id.b35 || view.getId() == C0906R.id.ded) {
            this.f10827b.a(InteractPKUserListFragment.a(this.f10827b, 1, this.m));
        } else {
            if (view.getId() == C0906R.id.b5f && com.bytedance.android.live.uikit.a.a.d()) {
                com.bytedance.android.livesdk.u.a.a().a((Object) new aa(l, ""));
            }
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, j, false, 4571, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, j, false, 4571, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (com.bytedance.android.live.uikit.a.a.d() || com.bytedance.android.live.uikit.a.a.g()) {
            this.k.setChecked(z);
        }
    }

    public static InteractPKTypeFragment a(b.C0088b bVar, DataCenter dataCenter) {
        b.C0088b bVar2 = bVar;
        DataCenter dataCenter2 = dataCenter;
        if (PatchProxy.isSupport(new Object[]{bVar2, dataCenter2}, null, j, true, 4563, new Class[]{b.C0088b.class, DataCenter.class}, InteractPKTypeFragment.class)) {
            return (InteractPKTypeFragment) PatchProxy.accessDispatch(new Object[]{bVar2, dataCenter2}, null, j, true, 4563, new Class[]{b.C0088b.class, DataCenter.class}, InteractPKTypeFragment.class);
        }
        InteractPKTypeFragment interactPKTypeFragment = new InteractPKTypeFragment();
        interactPKTypeFragment.h = new ar(interactPKTypeFragment);
        interactPKTypeFragment.f10827b = bVar2;
        interactPKTypeFragment.m = dataCenter2;
        return interactPKTypeFragment;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (PatchProxy.isSupport(new Object[]{compoundButton, Byte.valueOf(z ? (byte) 1 : 0)}, this, j, false, 4567, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{compoundButton, Byte.valueOf(z)}, this, j, false, 4567, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (compoundButton.getId() == C0906R.id.cyc && com.bytedance.android.live.uikit.a.a.d()) {
            ((InteractDialogPKTypeContract.a) this.h).a(z);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, j, false, 4565, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, j, false, 4565, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        view.findViewById(C0906R.id.b36).setOnClickListener(this);
        view.findViewById(C0906R.id.def).setOnClickListener(this);
        view.findViewById(C0906R.id.b35).setOnClickListener(this);
        view.findViewById(C0906R.id.ded).setOnClickListener(this);
        if (com.bytedance.android.live.uikit.a.a.d()) {
            view.findViewById(C0906R.id.b5f).setOnClickListener(this);
        }
        if (com.bytedance.android.live.uikit.a.a.d() || com.bytedance.android.live.uikit.a.a.g()) {
            this.k = (Switch) view.findViewById(C0906R.id.cyc);
            this.k.setOnCheckedChangeListener(this);
            ((InteractDialogPKTypeContract.a) this.h).c();
        }
        this.n = (TextView) view.findViewById(C0906R.id.da5);
        this.o = (TextView) view.findViewById(C0906R.id.da6);
        this.p = view.findViewById(C0906R.id.kd);
        if (com.bytedance.android.live.uikit.a.a.d() || com.bytedance.android.live.uikit.a.a.g()) {
            ((com.bytedance.android.live.core.rxutils.autodispose.aa) Single.timer(500, TimeUnit.MILLISECONDS).filter(h.f10946b).observeOn(AndroidSchedulers.mainThread()).as(e.a((Fragment) this))).a(new i(this), j.f10950b);
        }
        if (!com.bytedance.android.livesdkapi.a.a.f18614b) {
            ((InteractDialogPKTypeContract.a) this.h).a(((Room) this.m.get("data_room")).getOwner().getId());
        }
        HashMap hashMap = new HashMap();
        hashMap.put("connection_type", PushConstants.URI_PACKAGE_NAME);
        com.bytedance.android.livesdk.j.a.a().a("connection_click", hashMap, new j().b("live").f("click").a("live_detail"), Room.class);
    }

    public final void a(boolean z, Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), th2}, this, j, false, 4572, new Class[]{Boolean.TYPE, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), th2}, this, j, false, 4572, new Class[]{Boolean.TYPE, Throwable.class}, Void.TYPE);
            return;
        }
        if (com.bytedance.android.live.uikit.a.a.d() || com.bytedance.android.live.uikit.a.a.g()) {
            this.k.setChecked(z);
        }
        l.a(getContext(), th2);
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, j, false, 4564, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.ai5, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, j, false, 4564, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
