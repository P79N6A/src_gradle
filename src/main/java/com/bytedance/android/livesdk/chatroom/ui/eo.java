package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.widget.LiveRoundImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.disposables.Disposable;
import org.aspectj.lang.a;

public class eo extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12179a;

    /* renamed from: b  reason: collision with root package name */
    public b f12180b;

    /* renamed from: c  reason: collision with root package name */
    public c f12181c;

    /* renamed from: d  reason: collision with root package name */
    private Context f12182d;

    /* renamed from: e  reason: collision with root package name */
    private RelativeLayout f12183e;

    /* renamed from: f  reason: collision with root package name */
    private LiveRoundImageView f12184f;
    private HSImageView g;
    private View h;
    private TextView i;
    private TextView j;
    private Button k;
    private TextView l;
    private LinearLayout m;
    private Button n;
    private Button o;
    private Disposable p;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12204a;

        /* renamed from: b  reason: collision with root package name */
        public d f12205b = new d((byte) 0);

        public final eo a() {
            if (!PatchProxy.isSupport(new Object[0], this, f12204a, false, 6383, new Class[0], eo.class)) {
                return new eo(this.f12205b.f12206a, this.f12205b, (byte) 0);
            }
            return (eo) PatchProxy.accessDispatch(new Object[0], this, f12204a, false, 6383, new Class[0], eo.class);
        }

        public final eo b() {
            if (PatchProxy.isSupport(new Object[0], this, f12204a, false, 6384, new Class[0], eo.class)) {
                return (eo) PatchProxy.accessDispatch(new Object[0], this, f12204a, false, 6384, new Class[0], eo.class);
            }
            eo a2 = a();
            a2.show();
            return a2;
        }

        public final a a(CharSequence charSequence) {
            this.f12205b.f12210e = charSequence;
            return this;
        }

        public final a b(CharSequence charSequence) {
            this.f12205b.f12211f = charSequence;
            return this;
        }

        public final a a(boolean z) {
            this.f12205b.r = z;
            return this;
        }

        public final a a(int i) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f12204a, false, 6381, new Class[]{Integer.TYPE}, a.class)) {
                return a(this.f12205b.f12206a.getText(i));
            }
            return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f12204a, false, 6381, new Class[]{Integer.TYPE}, a.class);
        }

        public final a b(int i) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f12204a, false, 6382, new Class[]{Integer.TYPE}, a.class)) {
                return b(this.f12205b.f12206a.getText(i));
            }
            return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f12204a, false, 6382, new Class[]{Integer.TYPE}, a.class);
        }

        public final a a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.f12205b.i = charSequence;
            this.f12205b.j = onClickListener;
            return this;
        }

        public final a b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.f12205b.k = charSequence;
            this.f12205b.l = onClickListener;
            return this;
        }

        public a(Context context, int i) {
            this.f12205b.f12206a = context;
            this.f12205b.f12207b = i;
        }
    }

    public interface b {
        void a();
    }

    public interface c {
        void a();
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        Context f12206a;

        /* renamed from: b  reason: collision with root package name */
        int f12207b;

        /* renamed from: c  reason: collision with root package name */
        public int f12208c;

        /* renamed from: d  reason: collision with root package name */
        Drawable f12209d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f12210e;

        /* renamed from: f  reason: collision with root package name */
        CharSequence f12211f;
        CharSequence g;
        DialogInterface.OnClickListener h;
        CharSequence i;
        DialogInterface.OnClickListener j;
        CharSequence k;
        DialogInterface.OnClickListener l;
        CharSequence m;
        View.OnClickListener n;
        public DialogInterface.OnCancelListener o;
        DialogInterface.OnDismissListener p;
        DialogInterface.OnShowListener q;
        boolean r;

        private d() {
            this.r = true;
        }

        /* synthetic */ d(byte b2) {
            this();
        }
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f12179a, false, 6368, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12179a, false, 6368, new Class[0], Void.TYPE);
            return;
        }
        if (this.f12180b != null) {
            this.f12180b.a();
        }
        super.onBackPressed();
    }

    public void show() {
        if (PatchProxy.isSupport(new Object[0], this, f12179a, false, 6363, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12179a, false, 6363, new Class[0], Void.TYPE);
            return;
        }
        super.show();
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = ac.d(C0906R.dimen.px);
            layoutParams.height = -2;
            window.setAttributes(layoutParams);
        }
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f12179a, false, 6364, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12179a, false, 6364, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f12179a, false, 6365, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12179a, false, 6365, new Class[0], Void.TYPE);
        } else if (this.p != null) {
            this.p.dispose();
            this.p = null;
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, ep.f12212a, true, 6385, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, ep.f12212a, true, 6385, new Class[]{Dialog.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.g.a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            super.dismiss();
        } else {
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
    }

    public final void a(View.OnClickListener onClickListener) {
        View.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{onClickListener2}, this, f12179a, false, 6360, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener2}, this, f12179a, false, 6360, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        this.k.setOnClickListener(onClickListener2);
    }

    public final void b(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (PatchProxy.isSupport(new Object[]{charSequence2}, this, f12179a, false, 6354, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence2}, this, f12179a, false, 6354, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        this.j.setText(charSequence2);
    }

    private void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f12179a, false, 6351, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f12179a, false, 6351, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f12183e = (RelativeLayout) this.h.findViewById(C0906R.id.d5d);
        this.f12184f = (LiveRoundImageView) this.h.findViewById(C0906R.id.d5c);
        this.g = (HSImageView) this.h.findViewById(C0906R.id.d56);
        this.i = (TextView) this.h.findViewById(C0906R.id.chl);
        this.j = (TextView) this.h.findViewById(C0906R.id.chk);
        this.k = (Button) this.h.findViewById(C0906R.id.chg);
        this.l = (TextView) this.h.findViewById(C0906R.id.chf);
        this.m = (LinearLayout) this.h.findViewById(C0906R.id.chh);
        this.n = (Button) this.h.findViewById(C0906R.id.chi);
        this.o = (Button) this.h.findViewById(C0906R.id.chj);
        if (i2 == 1) {
            this.k.setVisibility(0);
            this.m.setVisibility(8);
            return;
        }
        if (i2 == 2) {
            this.k.setVisibility(8);
            this.m.setVisibility(0);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f12179a, false, 6366, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f12179a, false, 6366, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (1 == motionEvent.getAction()) {
            Context context = getContext();
            if (PatchProxy.isSupport(new Object[]{context, motionEvent}, this, f12179a, false, 6367, new Class[]{Context.class, MotionEvent.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{context, motionEvent}, this, f12179a, false, 6367, new Class[]{Context.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            } else {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                int scaledWindowTouchSlop = ViewConfiguration.get(context).getScaledWindowTouchSlop();
                if (!(getWindow() == null || getWindow().getDecorView() == null)) {
                    View decorView = getWindow().getDecorView();
                    int i2 = -scaledWindowTouchSlop;
                    if (x >= i2 && y >= i2 && x <= decorView.getWidth() + scaledWindowTouchSlop && y <= decorView.getHeight() + scaledWindowTouchSlop) {
                        z = false;
                    }
                }
            }
            if (z && this.f12181c != null) {
                this.f12181c.a();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void a(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (PatchProxy.isSupport(new Object[]{charSequence2}, this, f12179a, false, 6353, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence2}, this, f12179a, false, 6353, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        this.i.setText(charSequence2);
    }

    private eo(Context context, int i2) {
        super(context, C0906R.style.vz);
        this.f12182d = context;
        this.h = LayoutInflater.from(getContext()).inflate(C0906R.layout.ah_, null);
        setContentView(this.h);
        a(i2);
    }

    public static eo a(Context context, int i2) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2, 1}, null, f12179a, true, 6350, new Class[]{Context.class, Integer.TYPE}, eo.class)) {
            return new eo(context2, 1);
        }
        return (eo) PatchProxy.accessDispatch(new Object[]{context2, 1}, null, f12179a, true, 6350, new Class[]{Context.class, Integer.TYPE}, eo.class);
    }

    private eo(Context context, final d dVar) {
        super(context, C0906R.style.vz);
        int i2;
        this.f12182d = context;
        if (dVar.f12208c > 0) {
            i2 = dVar.f12208c;
        } else {
            i2 = C0906R.layout.ah_;
        }
        this.h = LayoutInflater.from(getContext()).inflate(i2, null);
        setContentView(this.h);
        a(dVar.f12207b);
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f12179a, false, 6352, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f12179a, false, 6352, new Class[]{d.class}, Void.TYPE);
            return;
        }
        this.i.setText(dVar.f12210e);
        this.j.setText(dVar.f12211f);
        if (TextUtils.isEmpty(dVar.f12211f)) {
            this.j.setVisibility(8);
        } else {
            this.j.setVisibility(0);
        }
        if (dVar.f12207b == 1) {
            this.k.setVisibility(0);
            this.m.setVisibility(8);
            this.k.setText(dVar.g);
            this.k.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f12185a;

                /* renamed from: d  reason: collision with root package name */
                private static final /* synthetic */ a.C0900a f12186d;

                static {
                    if (PatchProxy.isSupport(new Object[0], null, f12185a, true, 6372, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, f12185a, true, 6372, new Class[0], Void.TYPE);
                        return;
                    }
                    org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("RoomCenterDialog.java", AnonymousClass1.class);
                    f12186d = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.RoomCenterDialog$1", "android.view.View", NotifyType.VIBRATE, "", "void"), 118);
                }

                public void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f12185a, false, 6371, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f12185a, false, 6371, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f12186d, this, this, view));
                    dVar.h.onClick(eo.this, 0);
                }
            });
        } else if (dVar.f12207b == 2) {
            this.k.setVisibility(8);
            this.m.setVisibility(0);
            this.n.setText(dVar.i);
            this.o.setText(dVar.k);
            this.n.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f12189a;

                /* renamed from: d  reason: collision with root package name */
                private static final /* synthetic */ a.C0900a f12190d;

                static {
                    if (PatchProxy.isSupport(new Object[0], null, f12189a, true, 6374, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, f12189a, true, 6374, new Class[0], Void.TYPE);
                        return;
                    }
                    org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("RoomCenterDialog.java", AnonymousClass2.class);
                    f12190d = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.RoomCenterDialog$2", "android.view.View", NotifyType.VIBRATE, "", "void"), 129);
                }

                public void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f12189a, false, 6373, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f12189a, false, 6373, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f12190d, this, this, view));
                    dVar.j.onClick(eo.this, 1);
                }
            });
            this.o.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f12193a;

                /* renamed from: d  reason: collision with root package name */
                private static final /* synthetic */ a.C0900a f12194d;

                static {
                    if (PatchProxy.isSupport(new Object[0], null, f12193a, true, 6376, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, f12193a, true, 6376, new Class[0], Void.TYPE);
                        return;
                    }
                    org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("RoomCenterDialog.java", AnonymousClass3.class);
                    f12194d = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.RoomCenterDialog$3", "android.view.View", NotifyType.VIBRATE, "", "void"), 135);
                }

                public void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f12193a, false, 6375, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f12193a, false, 6375, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f12194d, this, this, view));
                    dVar.l.onClick(eo.this, 2);
                }
            });
        }
        if (dVar.f12209d != null) {
            this.f12183e.setVisibility(0);
            this.f12184f.setImageDrawable(dVar.f12209d);
            this.f12184f.setOnClickListener(dVar.n);
            this.g.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f12197a;

                /* renamed from: c  reason: collision with root package name */
                private static final /* synthetic */ a.C0900a f12198c;

                static {
                    if (PatchProxy.isSupport(new Object[0], null, f12197a, true, 6378, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, f12197a, true, 6378, new Class[0], Void.TYPE);
                        return;
                    }
                    org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("RoomCenterDialog.java", AnonymousClass4.class);
                    f12198c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.RoomCenterDialog$4", "android.view.View", NotifyType.VIBRATE, "", "void"), 146);
                }

                public void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f12197a, false, 6377, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f12197a, false, 6377, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f12198c, this, this, view));
                    eo.this.dismiss();
                }
            });
        }
        if (!TextUtils.isEmpty(dVar.m)) {
            this.l.setVisibility(0);
            this.l.setText(dVar.m);
            this.l.setOnClickListener(dVar.n);
        }
        setCancelable(dVar.r);
        setOnCancelListener(dVar.o);
        setOnDismissListener(dVar.p);
        setOnShowListener(dVar.q);
    }

    public final void a(boolean z, String str) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str}, this, f12179a, false, 6355, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str}, this, f12179a, false, 6355, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.k.setEnabled(z);
        this.k.setText(str);
    }

    /* synthetic */ eo(Context context, d dVar, byte b2) {
        this(context, dVar);
    }

    public final void a(boolean z, CharSequence charSequence, String str) {
        CharSequence charSequence2 = charSequence;
        final String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), charSequence2, str2}, this, f12179a, false, 6359, new Class[]{Boolean.TYPE, CharSequence.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), charSequence2, str2}, this, f12179a, false, 6359, new Class[]{Boolean.TYPE, CharSequence.class, String.class}, Void.TYPE);
        } else if (z) {
            this.l.setVisibility(0);
            this.l.setText(charSequence2);
            if (!TextUtils.isEmpty(str)) {
                this.l.setOnClickListener(new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f12200a;

                    /* renamed from: d  reason: collision with root package name */
                    private static final /* synthetic */ a.C0900a f12201d;

                    static {
                        if (PatchProxy.isSupport(new Object[0], null, f12200a, true, 6380, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], null, f12200a, true, 6380, new Class[0], Void.TYPE);
                            return;
                        }
                        org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("RoomCenterDialog.java", AnonymousClass5.class);
                        f12201d = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.RoomCenterDialog$5", "android.view.View", NotifyType.VIBRATE, "", "void"), 217);
                    }

                    public void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f12200a, false, 6379, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f12200a, false, 6379, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f12201d, this, this, view));
                        j.q().f().a(eo.this.getContext(), com.bytedance.android.livesdk.browser.c.c.b(str2).a(true));
                    }
                });
            }
        } else {
            this.l.setVisibility(8);
        }
    }
}
