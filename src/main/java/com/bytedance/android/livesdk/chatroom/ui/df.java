package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.k;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.admin.b.c;
import com.bytedance.android.livesdk.admin.d.a;
import com.bytedance.android.livesdk.b.f;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class df extends Dialog implements View.OnClickListener, a, f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12067a;
    private static final /* synthetic */ a.C0900a k;

    /* renamed from: b  reason: collision with root package name */
    private Room f12068b;

    /* renamed from: c  reason: collision with root package name */
    private User f12069c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12070d;

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.android.livesdk.b.a f12071e = new com.bytedance.android.livesdk.b.a();

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.android.livesdk.admin.c.a f12072f;
    private TextView g;
    private TextView h;
    private boolean i;
    private boolean j;

    public final void a(c cVar, Exception exc) {
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f12067a, false, 6183, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12067a, false, 6183, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.f12070d = true;
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f12067a, false, 6184, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12067a, false, 6184, new Class[0], Void.TYPE);
            return;
        }
        this.f12070d = false;
        this.f12071e.f9083b = null;
        super.onDetachedFromWindow();
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f12067a, true, 6185, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f12067a, true, 6185, new Class[0], Void.TYPE);
            return;
        }
        b bVar = new b("LiveProfileManageDialog.java", df.class);
        k = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.LiveProfileManageDialog", "android.view.View", NotifyType.VIBRATE, "", "void"), SearchJediMixFeedAdapter.f42516e);
    }

    public final void a(boolean z) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f12067a, false, 6179, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f12067a, false, 6179, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f12070d) {
            if (this.f12069c.getUserAttr() == null) {
                this.f12069c.setUserAttr(new k());
            }
            this.f12069c.getUserAttr().f7773b = z;
            TextView textView = this.h;
            if (z) {
                i2 = C0906R.string.d9u;
            } else {
                i2 = C0906R.string.d9w;
            }
            textView.setText(i2);
        }
    }

    public void onClick(View view) {
        boolean z;
        boolean z2;
        long j2;
        long j3;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f12067a, false, 6178, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f12067a, false, 6178, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(k, this, this, view2));
        int id = view.getId();
        if (id == C0906R.id.bl_) {
            if (this.f12069c.getUserAttr() == null || !this.f12069c.getUserAttr().f7774c) {
                z2 = true;
            } else {
                z2 = false;
            }
            com.bytedance.android.livesdk.admin.c.a aVar = this.f12072f;
            long id2 = this.f12069c.getId();
            if (this.f12068b == null || this.f12068b.getOwner() == null) {
                j2 = 0;
            } else {
                j2 = this.f12068b.getOwner().getId();
            }
            if (this.f12068b != null) {
                j3 = this.f12068b.getId();
            } else {
                j3 = 0;
            }
            aVar.a(z2, id2, j2, j3);
        } else if (id == C0906R.id.b75) {
            dismiss();
            com.bytedance.android.livesdk.p.a aVar2 = new com.bytedance.android.livesdk.p.a(getContext(), this.f12068b.getId(), this.f12069c.getId());
            aVar2.show();
            com.bytedance.android.livesdk.j.a.a().a("blacklist_click", new j().b("relation").f("click").a("live_detail"));
        } else if (id == C0906R.id.bp3) {
            if (this.f12069c.getUserAttr() == null || !this.f12069c.getUserAttr().f7773b) {
                z = true;
            } else {
                z = false;
            }
            this.f12071e.a(z, this.f12068b.getId(), this.f12069c.getId());
        } else if (id == C0906R.id.blb) {
            com.bytedance.android.livesdk.roommanage.a aVar3 = new com.bytedance.android.livesdk.roommanage.a(getContext(), 1, this.f12068b.getId(), this.f12068b.getOwner().getId(), this.j);
            aVar3.show();
            com.bytedance.android.livesdk.j.f.a(getContext());
            dismiss();
        } else if (id == C0906R.id.bp4) {
            com.bytedance.android.livesdk.roommanage.a aVar4 = new com.bytedance.android.livesdk.roommanage.a(getContext(), 2, this.f12068b.getId(), this.f12068b.getOwner().getId(), this.j);
            aVar4.show();
            dismiss();
        } else if (id == C0906R.id.b76) {
            com.bytedance.android.livesdk.roommanage.a aVar5 = new com.bytedance.android.livesdk.roommanage.a(getContext(), 3, this.f12068b.getId(), this.f12068b.getOwner().getId(), this.j);
            aVar5.show();
            dismiss();
        } else {
            if (id == C0906R.id.q2) {
                dismiss();
                com.bytedance.android.livesdk.j.f.a(getContext());
            }
        }
    }

    public void onCreate(Bundle bundle) {
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f12067a, false, 6177, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f12067a, false, 6177, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        setContentView(LayoutInflater.from(getContext()).inflate(C0906R.layout.agt, null));
        if (window != null) {
            if (!com.bytedance.android.live.uikit.a.a.d() || ac.f()) {
                window.setLayout(-1, -2);
            } else {
                getWindow().setLayout(ac.a(376.0f), -2);
                getWindow().setGravity(8388693);
            }
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(C0906R.id.y9);
        findViewById(C0906R.id.q2).setOnClickListener(this);
        if (this.i || this.f12069c == null || this.f12068b.getOwner().getId() == this.f12069c.getId()) {
            viewGroup.removeViews(5, 5);
            viewGroup.findViewById(C0906R.id.blb).setOnClickListener(this);
            viewGroup.findViewById(C0906R.id.bp4).setOnClickListener(this);
            viewGroup.findViewById(C0906R.id.b76).setOnClickListener(this);
            if (com.bytedance.android.live.uikit.a.a.j()) {
                viewGroup.findViewById(C0906R.id.blb).setVisibility(8);
            }
        } else {
            viewGroup.removeViews(0, 5);
            this.g = (TextView) viewGroup.findViewById(C0906R.id.bl_);
            this.g.setOnClickListener(this);
            viewGroup.findViewById(C0906R.id.b75).setOnClickListener(this);
            this.h = (TextView) viewGroup.findViewById(C0906R.id.bp3);
            this.h.setOnClickListener(this);
            k userAttr = this.f12069c.getUserAttr();
            if (userAttr != null) {
                TextView textView = this.g;
                if (userAttr.f7774c) {
                    i2 = C0906R.string.d9t;
                } else {
                    i2 = C0906R.string.d9y;
                }
                textView.setText(i2);
                TextView textView2 = this.h;
                if (userAttr.f7773b) {
                    i3 = C0906R.string.d9u;
                } else {
                    i3 = C0906R.string.d9w;
                }
                textView2.setText(i3);
            }
            if (com.bytedance.android.live.uikit.a.a.j()) {
                this.g.setVisibility(8);
            }
        }
    }

    public final void b(boolean z, Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), exc2}, this, f12067a, false, 6180, new Class[]{Boolean.TYPE, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), exc2}, this, f12067a, false, 6180, new Class[]{Boolean.TYPE, Exception.class}, Void.TYPE);
        } else if (this.f12070d) {
            l.a(getContext(), (Throwable) exc2, (int) C0906R.string.d9g);
        }
    }

    public final void a(boolean z, User user) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), user}, this, f12067a, false, 6181, new Class[]{Boolean.TYPE, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), user}, this, f12067a, false, 6181, new Class[]{Boolean.TYPE, User.class}, Void.TYPE);
        } else if (this.f12070d) {
            if (this.f12069c.getUserAttr() == null) {
                this.f12069c.setUserAttr(new k());
            }
            this.f12069c.getUserAttr().f7774c = z;
            TextView textView = this.g;
            if (z) {
                i2 = C0906R.string.d9t;
            } else {
                i2 = C0906R.string.d9y;
            }
            textView.setText(i2);
        }
    }

    public final void a(boolean z, Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), exc2}, this, f12067a, false, 6182, new Class[]{Boolean.TYPE, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), exc2}, this, f12067a, false, 6182, new Class[]{Boolean.TYPE, Exception.class}, Void.TYPE);
        } else if (this.f12070d) {
            l.a(getContext(), (Throwable) exc2, (int) C0906R.string.d9g);
        }
    }

    public df(@NonNull Context context, Room room, @Nullable User user, boolean z, boolean z2) {
        super(context, C0906R.style.v5);
        this.f12068b = room;
        this.f12069c = user;
        this.i = z;
        this.j = z2;
        this.f12071e.f9083b = this;
        this.f12072f = new com.bytedance.android.livesdk.admin.c.a(this);
    }
}
