package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.LiveDialogFragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.android.live.base.model.b;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.presenter.k;
import com.bytedance.android.livesdk.chatroom.ui.FansClubMedalAdapter;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;
import org.aspectj.lang.a;

public class LiveProfileSettingDialog extends LiveDialogFragment implements View.OnClickListener, k.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11672a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f11673b = LiveProfileSettingDialog.class.getSimpleName();
    private static final /* synthetic */ a.C0900a p;

    /* renamed from: c  reason: collision with root package name */
    boolean f11674c;

    /* renamed from: d  reason: collision with root package name */
    User f11675d;

    /* renamed from: e  reason: collision with root package name */
    DataCenter f11676e;

    /* renamed from: f  reason: collision with root package name */
    List<b> f11677f;
    FansClubData g;
    b h;
    View i;
    boolean j;
    private k k;
    private TextView l;
    private RecyclerView m;
    private FansClubMedalAdapter n;
    private FansClubMedalAdapter.a o = new dg(this);

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f11672a, false, 6192, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11672a, false, 6192, new Class[0], Void.TYPE);
        } else if (this.f11674c) {
            ai.a((int) C0906R.string.dj8);
            dismiss();
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f11672a, false, 6191, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11672a, false, 6191, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.f11674c = false;
        this.k.d();
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f11672a, true, 6196, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f11672a, true, 6196, new Class[0], Void.TYPE);
        } else {
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("LiveProfileSettingDialog.java", LiveProfileSettingDialog.class);
            p = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingDialog", "android.view.View", NotifyType.VIBRATE, "", "void"), 172);
        }
    }

    public final void a(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f11672a, false, 6194, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f11672a, false, 6194, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        if (this.f11674c) {
            if (th2 instanceof com.bytedance.android.live.a.a.b.a) {
                ai.a(((com.bytedance.android.live.a.a.b.a) th2).getPrompt());
                return;
            }
            l.a(getContext(), th2);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11672a, false, 6190, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f11672a, false, 6190, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        Dialog dialog = getDialog();
        dialog.requestWindowFeature(1);
        dialog.setCanceledOnTouchOutside(true);
        super.onActivityCreated(bundle);
        Window window = dialog.getWindow();
        if (window != null) {
            if (!this.j) {
                window.setGravity(8388613);
                window.setLayout(-2, -1);
                window.setBackgroundDrawable(new ColorDrawable(0));
                return;
            }
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public void onCreate(Bundle bundle) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11672a, false, 6187, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f11672a, false, 6187, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (this.j) {
            i2 = C0906R.style.v0;
        } else {
            i2 = C0906R.style.v1;
        }
        setStyle(1, i2);
        this.f11674c = true;
        this.k = new k();
        this.k.a(this);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f11672a, false, 6193, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f11672a, false, 6193, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        super.onDismiss(dialogInterface);
        if (this.f11676e != null) {
            this.f11676e.lambda$put$1$DataCenter("cmd_show_user_profile", new UserProfileEvent(this.f11675d));
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f11672a, false, 6195, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f11672a, false, 6195, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(p, this, this, view));
        if (view.getId() == C0906R.id.cj9) {
            if (this.g == null && this.h != null) {
                this.k.a(String.valueOf(this.h.f7694a.getId()));
            } else if (this.g != null && this.h == null) {
                this.k.a("");
            } else if (this.g == null || this.h == null || TextUtils.isEmpty(this.g.clubName) || this.g.clubName.equals(this.h.f7696c.f7692a)) {
                a();
            } else {
                this.k.a(String.valueOf(this.h.f7694a.getId()));
            }
        }
    }

    public void onViewCreated(@NonNull View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f11672a, false, 6189, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f11672a, false, 6189, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.l = (TextView) view.findViewById(C0906R.id.cj9);
        this.l.setOnClickListener(this);
        this.m = (RecyclerView) view.findViewById(C0906R.id.ac2);
        this.m.setLayoutManager(new GridLayoutManager(getContext(), 3));
        this.n = new FansClubMedalAdapter(this.f11677f, this.g, this.o);
        this.m.setAdapter(this.n);
        if (!this.j) {
            this.i.post(new dh(this));
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f11672a, false, 6188, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f11672a, false, 6188, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        this.i = layoutInflater.inflate(C0906R.layout.aif, viewGroup2, false);
        return this.i;
    }
}
