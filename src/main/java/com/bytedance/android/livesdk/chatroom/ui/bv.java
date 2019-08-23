package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.interact.c.a;
import com.bytedance.android.livesdk.chatroom.interact.c.f;
import com.bytedance.android.livesdk.chatroom.interact.c.g;
import com.bytedance.android.livesdk.chatroom.model.a.j;
import com.bytedance.android.livesdk.common.c;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class bv extends c implements View.OnClickListener, a.C0086a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11962a;
    private static final /* synthetic */ a.C0900a p;

    /* renamed from: b  reason: collision with root package name */
    public j f11963b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.livesdk.chatroom.interact.c.a f11964c;

    /* renamed from: d  reason: collision with root package name */
    private DataCenter f11965d;

    /* renamed from: e  reason: collision with root package name */
    private Room f11966e = ((Room) this.f11965d.get("data_room"));

    /* renamed from: f  reason: collision with root package name */
    private Context f11967f;
    private m i;
    private TextView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private TextView o;

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f11962a, false, 5874, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11962a, false, 5874, new Class[0], Void.TYPE);
            return;
        }
        if (this.i != null && this.i.isShowing()) {
            this.i.dismiss();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f11962a, false, 5877, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11962a, false, 5877, new Class[0], Void.TYPE);
            return;
        }
        d();
        dismiss();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f11962a, false, 5879, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11962a, false, 5879, new Class[0], Void.TYPE);
            return;
        }
        d();
        dismiss();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f11962a, false, 5881, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11962a, false, 5881, new Class[0], Void.TYPE);
            return;
        }
        d();
        dismiss();
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f11962a, false, 5865, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11962a, false, 5865, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.f11964c.a(this);
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f11962a, false, 5866, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11962a, false, 5866, new Class[0], Void.TYPE);
            return;
        }
        this.f11964c.d();
        super.onDetachedFromWindow();
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f11962a, true, 5882, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f11962a, true, 5882, new Class[0], Void.TYPE);
            return;
        }
        b bVar = new b("LinkInRoomGuestManageDialog.java", bv.class);
        p = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.LinkInRoomGuestManageDialog", "android.view.View", NotifyType.VIBRATE, "", "void"), 111);
    }

    public final void a(@StringRes int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f11962a, false, 5873, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f11962a, false, 5873, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.i == null) {
            this.i = new m.a(getContext(), 2).c(i2).a(false).a();
        }
        if (!this.i.isShowing()) {
            this.i.show();
        }
    }

    public final void b(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f11962a, false, 5878, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f11962a, false, 5878, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        d();
        l.a(getContext(), th2, (int) C0906R.string.d5j);
    }

    public final void c(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f11962a, false, 5880, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f11962a, false, 5880, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        d();
        l.a(getContext(), th2, (int) C0906R.string.d5l);
    }

    public final void a(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f11962a, false, 5876, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f11962a, false, 5876, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        d();
        l.a(getContext(), th2, (int) C0906R.string.d5h);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f11962a, false, 5868, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f11962a, false, 5868, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(p, this, this, view));
        int id = view.getId();
        if (id == C0906R.id.crh) {
            if (PatchProxy.isSupport(new Object[0], this, f11962a, false, 5870, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f11962a, false, 5870, new Class[0], Void.TYPE);
            } else {
                a((int) C0906R.string.d_x);
                this.f11964c.a(this.f11963b.f11052e.getId());
            }
        } else if (id == C0906R.id.qa) {
            if (PatchProxy.isSupport(new Object[0], this, f11962a, false, 5869, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f11962a, false, 5869, new Class[0], Void.TYPE);
            } else {
                a((int) C0906R.string.da0);
                this.f11964c.b(this.f11963b.f11052e.getId());
            }
        } else if (id == C0906R.id.a5d) {
            if (PatchProxy.isSupport(new Object[0], this, f11962a, false, 5872, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f11962a, false, 5872, new Class[0], Void.TYPE);
            } else {
                new m.a(this.f11967f).c((int) C0906R.string.d_s).a(false).b(0, (int) C0906R.string.cqy, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f11970a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11970a, false, 5884, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11970a, false, 5884, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        dialogInterface.dismiss();
                        bv.this.a((int) C0906R.string.d5c);
                        com.bytedance.android.livesdk.chatroom.interact.c.a aVar = bv.this.f11964c;
                        long id = bv.this.f11963b.f11052e.getId();
                        if (PatchProxy.isSupport(new Object[]{new Long(id)}, aVar, com.bytedance.android.livesdk.chatroom.interact.c.a.f10349a, false, 4623, new Class[]{Long.TYPE}, Void.TYPE)) {
                            com.bytedance.android.livesdk.chatroom.interact.c.a aVar2 = aVar;
                            PatchProxy.accessDispatch(new Object[]{new Long(id)}, aVar2, com.bytedance.android.livesdk.chatroom.interact.c.a.f10349a, false, 4623, new Class[]{Long.TYPE}, Void.TYPE);
                            return;
                        }
                        if (!aVar.f10351c) {
                            aVar.f10351c = true;
                            aVar.f10350b.add(com.bytedance.android.livesdk.v.j.q().d().a().kickOut(aVar.f10354f.getId(), id).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new f(aVar), new g(aVar)));
                        }
                    }
                }).b(1, (int) C0906R.string.cpz, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f11968a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11968a, false, 5883, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11968a, false, 5883, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        dialogInterface.dismiss();
                    }
                }).c();
            }
        } else if (id == C0906R.id.cns) {
            if (PatchProxy.isSupport(new Object[0], this, f11962a, false, 5875, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f11962a, false, 5875, new Class[0], Void.TYPE);
            } else {
                dismiss();
                if (this.f11965d != null) {
                    this.f11965d.lambda$put$1$DataCenter("cmd_send_gift", this.f11963b.f11052e);
                }
            }
        } else if (id == C0906R.id.cr9) {
            if (PatchProxy.isSupport(new Object[0], this, f11962a, false, 5871, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f11962a, false, 5871, new Class[0], Void.TYPE);
            } else {
                dismiss();
                com.bytedance.android.livesdk.u.a.a().a((Object) new UserProfileEvent(this.f11963b.f11052e));
            }
        } else if (id == C0906R.id.q2) {
            dismiss();
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11962a, false, 5864, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f11962a, false, 5864, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(getContext()).inflate(C0906R.layout.agh, null));
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
        }
        if (PatchProxy.isSupport(new Object[0], this, f11962a, false, 5867, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11962a, false, 5867, new Class[0], Void.TYPE);
            return;
        }
        this.j = (TextView) findViewById(C0906R.id.crh);
        this.k = (TextView) findViewById(C0906R.id.qa);
        this.l = (TextView) findViewById(C0906R.id.a5d);
        this.m = (TextView) findViewById(C0906R.id.cns);
        this.n = (TextView) findViewById(C0906R.id.cr9);
        this.o = (TextView) findViewById(C0906R.id.q2);
        this.j.setOnClickListener(this);
        this.k.setOnClickListener(this);
        this.l.setOnClickListener(this);
        this.m.setOnClickListener(this);
        this.n.setOnClickListener(this);
        this.o.setOnClickListener(this);
        if (this.f11963b.m == 0) {
            this.j.setVisibility(0);
            this.k.setVisibility(8);
        } else if (this.f11963b.m == 1) {
            this.j.setVisibility(8);
            this.k.setVisibility(8);
        } else {
            if (this.f11963b.m == 2) {
                this.j.setVisibility(8);
                this.k.setVisibility(0);
            }
        }
    }

    public bv(@NonNull Context context, DataCenter dataCenter, @Nullable j jVar, com.bytedance.android.livesdk.chatroom.interact.c.a aVar) {
        super(context, true);
        this.f11965d = dataCenter;
        this.f11967f = context;
        this.f11963b = jVar;
        this.f11964c = aVar;
    }
}
