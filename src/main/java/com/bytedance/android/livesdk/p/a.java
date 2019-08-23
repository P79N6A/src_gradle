package com.bytedance.android.livesdk.p;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.kickout.b;
import com.bytedance.android.livesdk.utils.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import org.aspectj.lang.a;

public class a extends Dialog implements View.OnClickListener, b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16784a;
    private static final /* synthetic */ a.C0900a h;

    /* renamed from: b  reason: collision with root package name */
    private TextView f16785b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f16786c;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.android.livesdk.kickout.a f16787d;

    /* renamed from: e  reason: collision with root package name */
    private long f16788e;

    /* renamed from: f  reason: collision with root package name */
    private long f16789f;
    private Context g;

    public final void a() {
    }

    public final void a(com.bytedance.android.livesdk.kickout.b.a aVar, Exception exc) {
    }

    public final void b() {
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f16784a, true, 12840, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f16784a, true, 12840, new Class[0], Void.TYPE);
            return;
        }
        org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("EnsureKickOutDialog.java", a.class);
        h = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.profilevisitor.EnsureKickOutDialog", "android.view.View", "view", "", "void"), 66);
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f16784a, false, 12838, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f16784a, false, 12838, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (isShowing()) {
            dismiss();
            com.bytedance.android.livesdk.u.a.a().a((Object) new b(0));
        }
        com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.kickout.a.b(true, this.f16789f));
    }

    public void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f16784a, false, 12836, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f16784a, false, 12836, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(h, this, this, view2));
        int id = view.getId();
        if (id == C0906R.id.ddf) {
            if (PatchProxy.isSupport(new Object[0], this, f16784a, false, 12837, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f16784a, false, 12837, new Class[0], Void.TYPE);
            } else if (!NetworkUtils.isNetworkAvailable(this.g)) {
                com.bytedance.android.live.uikit.d.a.a(this.g, (int) C0906R.string.cst);
            } else {
                this.f16787d.a(true, this.f16788e, this.f16789f);
            }
            com.bytedance.android.livesdk.j.a.a().a("blacklist_toast_click", new j().b("relation").f("click").e("live_detail").g("yes"));
            return;
        }
        if (id == C0906R.id.d9y) {
            com.bytedance.android.livesdk.j.a.a().a("blacklist_toast_click", new j().b("relation").f("click").e("live_detail").g("cancel"));
            if (isShowing()) {
                dismiss();
            }
            com.bytedance.android.livesdk.u.a.a().a((Object) new b(1));
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f16784a, false, 12834, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f16784a, false, 12834, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(getContext()).inflate(C0906R.layout.agl, null));
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
            window.setLayout(-2, -2);
        }
        if (PatchProxy.isSupport(new Object[0], this, f16784a, false, 12835, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16784a, false, 12835, new Class[0], Void.TYPE);
            return;
        }
        this.f16785b = (TextView) findViewById(C0906R.id.d9y);
        this.f16786c = (TextView) findViewById(C0906R.id.ddf);
        this.f16785b.setOnClickListener(this);
        this.f16786c.setOnClickListener(this);
        this.f16787d = new com.bytedance.android.livesdk.kickout.a();
        this.f16787d.f15728b = this;
    }

    public final void a(boolean z, Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), exc2}, this, f16784a, false, 12839, new Class[]{Boolean.TYPE, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), exc2}, this, f16784a, false, 12839, new Class[]{Boolean.TYPE, Exception.class}, Void.TYPE);
            return;
        }
        l.a(getContext(), exc2);
        if (isShowing()) {
            dismiss();
            com.bytedance.android.livesdk.u.a.a().a((Object) new b(0));
        }
    }

    public a(Context context, long j, long j2) {
        super(context, C0906R.style.vy);
        this.g = context;
        this.f16788e = j;
        this.f16789f = j2;
    }
}
