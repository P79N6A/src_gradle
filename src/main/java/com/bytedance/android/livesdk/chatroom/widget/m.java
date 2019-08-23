package com.bytedance.android.livesdk.chatroom.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.SurfaceView;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.e;
import com.bytedance.android.livesdk.chatroom.event.q;
import com.bytedance.android.livesdk.chatroom.interact.contract.c;
import com.bytedance.android.livesdk.utils.aa;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class m extends FrameLayout implements View.OnClickListener, c.b, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13507a;
    private static final /* synthetic */ a.C0900a y;

    /* renamed from: b  reason: collision with root package name */
    public TextView f13508b;

    /* renamed from: c  reason: collision with root package name */
    public DataCenter f13509c;

    /* renamed from: d  reason: collision with root package name */
    public c.a f13510d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f13511e;

    /* renamed from: f  reason: collision with root package name */
    public int f13512f = 5;
    private ImageView g;
    private SurfaceView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private View l;
    private View m;
    private View n;
    private View o;
    private TextView p;
    private TextView q;
    private ProgressBar r;
    private View s;
    private Animator t;
    private boolean u;
    private Handler v;
    private a w;
    private int x = 5;

    public interface a {
        void a(m mVar);
    }

    public final void a() {
        this.u = true;
    }

    public c.a getPresenter() {
        return this.f13510d;
    }

    public final void a(boolean z) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f13507a, false, 7874, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f13507a, false, 7874, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        View view = this.o;
        if (z) {
            i2 = 4;
        }
        view.setVisibility(i2);
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f13507a, true, 7878, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f13507a, true, 7878, new Class[0], Void.TYPE);
            return;
        }
        b bVar = new b("LinkInRoomGuestWindow.java", m.class);
        y = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.widget.LinkInRoomGuestWindow", "android.view.View", NotifyType.VIBRATE, "", "void"), 140);
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f13507a, false, 7863, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13507a, false, 7863, new Class[0], Void.TYPE);
            return;
        }
        if (this.t != null && this.t.isRunning()) {
            this.t.cancel();
        }
        this.v.removeCallbacksAndMessages(null);
        this.f13510d.h();
        this.w = null;
        super.onDetachedFromWindow();
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f13507a, false, 7862, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13507a, false, 7862, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        inflate(getContext(), C0906R.layout.amq, this);
        setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f13513a;

            /* renamed from: c  reason: collision with root package name */
            private static final /* synthetic */ a.C0900a f13514c;

            static {
                if (PatchProxy.isSupport(new Object[0], null, f13513a, true, 7880, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], null, f13513a, true, 7880, new Class[0], Void.TYPE);
                    return;
                }
                b bVar = new b("LinkInRoomGuestWindow.java", AnonymousClass1.class);
                f13514c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.widget.LinkInRoomGuestWindow$1", "android.view.View", NotifyType.VIBRATE, "", "void"), 97);
            }

            public void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f13513a, false, 7879, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f13513a, false, 7879, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                com.bytedance.android.livesdk.a.b.a().a(b.a(f13514c, this, this, view));
                if (!(m.this.f13510d.a() == null || m.this.f13509c == null)) {
                    m.this.f13509c.lambda$put$1$DataCenter("cmd_send_gift", m.this.f13510d.a());
                }
            }
        });
        this.g = (ImageView) findViewById(C0906R.id.c57);
        this.i = (TextView) findViewById(C0906R.id.c5c);
        this.j = (TextView) findViewById(C0906R.id.c5_);
        this.k = (TextView) findViewById(C0906R.id.c5b);
        this.l = findViewById(C0906R.id.c59);
        this.m = findViewById(C0906R.id.buv);
        this.m.setOnClickListener(this);
        this.n = findViewById(C0906R.id.bup);
        this.n.setOnClickListener(this);
        this.o = findViewById(C0906R.id.bud);
        this.p = (TextView) findViewById(C0906R.id.but);
        this.q = (TextView) findViewById(C0906R.id.buw);
        this.r = (ProgressBar) findViewById(C0906R.id.buu);
        this.f13508b = (TextView) findViewById(C0906R.id.bur);
        this.s = findViewById(C0906R.id.buq);
        this.f13510d.a(this);
        a(this.u ^ true ? 1 : 0);
        if (com.bytedance.android.livesdkapi.a.a.f18614b && com.bytedance.android.live.uikit.d.c.a(getContext()) && Build.VERSION.SDK_INT >= 17) {
            this.p.setLayoutDirection(1);
            this.p.setTextDirection(4);
        }
    }

    public final void a(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f13507a, false, 7870, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f13507a, false, 7870, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (!String.valueOf(j2).equals(this.q.getText().toString())) {
            this.q.setText(e.a(j2));
        }
    }

    public final void b(boolean z) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f13507a, false, 7875, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f13507a, false, 7875, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!z || this.f13511e) {
            this.m.setVisibility(8);
            this.n.setVisibility(8);
        } else {
            View view = this.m;
            if (this.f13510d.f()) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            view.setVisibility(i2);
            this.n.setVisibility(0);
        }
    }

    public void setVisibility(boolean z) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f13507a, false, 7877, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f13507a, false, 7877, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!z) {
            i2 = 4;
        }
        setVisibility(i2);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f13507a, false, 7871, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f13507a, false, 7871, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (i2) {
            case 0:
                this.l.setVisibility(0);
                this.s.setVisibility(8);
                this.j.setVisibility(0);
                this.k.setText(C0906R.string.d89);
                this.j.setText(String.valueOf(this.x));
                this.v.sendEmptyMessageDelayed(0, 1000);
                return;
            case 1:
                this.l.setVisibility(8);
                this.s.setVisibility(0);
                return;
            case 2:
                this.l.setVisibility(0);
                this.s.setVisibility(8);
                this.j.setVisibility(4);
                this.k.setText(C0906R.string.d88);
                this.v.sendEmptyMessageDelayed(1, 1500);
                break;
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13507a, false, 7864, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13507a, false, 7864, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(y, this, this, view));
        int id = view.getId();
        if (id == C0906R.id.buv) {
            if (this.h != null && (this.h instanceof k)) {
                ((k) this.h).g();
            }
        } else if (id == C0906R.id.bup) {
            new m.a(getContext(), 0).c((int) C0906R.string.d6w).b(0, (int) C0906R.string.dg_, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f13518a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13518a, false, 7882, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13518a, false, 7882, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    m.this.a(2);
                    dialogInterface.dismiss();
                }
            }).b(1, (int) C0906R.string.cpz, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f13516a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13516a, false, 7881, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13516a, false, 7881, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    dialogInterface.dismiss();
                }
            }).c();
        }
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f13507a, false, 7867, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f13507a, false, 7867, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        switch (message.what) {
            case 0:
                this.x--;
                if (this.x < 0) {
                    a(1);
                    return;
                }
                this.j.setText(String.valueOf(this.x));
                this.v.sendEmptyMessageDelayed(0, 1000);
                return;
            case 1:
                if (this.f13510d.e()) {
                    if (PatchProxy.isSupport(new Object[0], this, f13507a, false, 7866, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f13507a, false, 7866, new Class[0], Void.TYPE);
                        break;
                    } else {
                        if (this.f13509c != null) {
                            this.f13509c.lambda$put$1$DataCenter("cmd_interact_state_change", new q(5));
                        }
                        aa.a(this.f13510d.b(), "shutdown_connection", "guest_connection", false);
                        return;
                    }
                } else {
                    this.w.a(this);
                    return;
                }
            case 2:
                if (!PatchProxy.isSupport(new Object[0], this, f13507a, false, 7873, new Class[0], Void.TYPE)) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f13508b, "scaleX", new float[]{1.0f, 2.0f, 1.0f});
                    ofFloat.setRepeatCount(5);
                    ofFloat.setDuration(1000);
                    ofFloat.addListener(new AnimatorListenerAdapter() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f13520a;

                        public final void onAnimationEnd(Animator animator) {
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f13520a, false, 7883, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f13520a, false, 7883, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            if (m.this.f13510d.e()) {
                                m.this.a(2);
                            }
                        }

                        public final void onAnimationRepeat(Animator animator) {
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f13520a, false, 7884, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f13520a, false, 7884, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            m.this.f13512f--;
                            m.this.f13508b.setText(String.valueOf(m.this.f13512f));
                        }

                        public final void onAnimationStart(Animator animator) {
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f13520a, false, 7885, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f13520a, false, 7885, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            m.this.f13508b.setText(String.valueOf(m.this.f13512f));
                            m.this.f13508b.setVisibility(0);
                        }
                    });
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f13508b, "scaleY", new float[]{1.0f, 2.0f, 1.0f});
                    ofFloat2.setRepeatCount(5);
                    ofFloat2.setDuration(1000);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                    animatorSet.start();
                    break;
                } else {
                    PatchProxy.accessDispatch(new Object[0], this, f13507a, false, 7873, new Class[0], Void.TYPE);
                    return;
                }
        }
    }

    public final void a(SurfaceView surfaceView) {
        if (PatchProxy.isSupport(new Object[]{surfaceView}, this, f13507a, false, 7868, new Class[]{SurfaceView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceView}, this, f13507a, false, 7868, new Class[]{SurfaceView.class}, Void.TYPE);
        } else if (surfaceView != null) {
            removeView(this.h);
            this.h = surfaceView;
            this.h.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            addView(this.h, 0);
        }
    }

    public final void a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f13507a, false, 7869, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f13507a, false, 7869, new Class[]{User.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.chatroom.f.b.b(this.g, user.getAvatarThumb());
        this.i.setText(user.getNickName());
        this.p.setText(user.getNickName());
    }

    public final void a(int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f13507a, false, 7872, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z)}, this, f13507a, false, 7872, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (!this.f13511e && this.u && (this.t == null || !this.t.isRunning())) {
            this.t = ObjectAnimator.ofInt(this.r, "progress", new int[]{100, 0});
            this.t.setDuration((long) (i2 * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
            this.t.setInterpolator(new LinearInterpolator());
            this.r.setVisibility(0);
            this.t.start();
            if (z) {
                this.v.sendEmptyMessageDelayed(2, (long) ((i2 - 5) * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
            }
        }
    }

    public m(Context context, c.a aVar, a aVar2, DataCenter dataCenter) {
        super(context);
        this.f13510d = aVar;
        this.w = aVar2;
        this.v = new WeakHandler(this);
        this.f13509c = dataCenter;
    }
}
