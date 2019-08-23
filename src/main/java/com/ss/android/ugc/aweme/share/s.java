package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.widget.PullUpLayout;
import com.ss.android.ugc.aweme.framework.services.IShareService;

public abstract class s extends IShareService.ShareWindow implements com.ss.android.ugc.aweme.common.widget.scrollablelayout.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65230a;

    /* renamed from: b  reason: collision with root package name */
    public View f65231b;

    /* renamed from: c  reason: collision with root package name */
    public RemoteImageView f65232c;

    /* renamed from: d  reason: collision with root package name */
    public Activity f65233d;

    /* renamed from: e  reason: collision with root package name */
    public LinearLayout f65234e;

    /* renamed from: f  reason: collision with root package name */
    public HorizontalScrollView f65235f;
    public a g;
    public int h = 4000;
    public boolean i;
    public LinearLayout j;
    public View k;
    public RemoteImageView l;
    public TextView m;
    public View n;
    public int o = 49;
    public int p = 59;
    public int q = 23;
    public int r = 23;
    public long s;
    private PullUpLayout t;
    private LinearLayout u;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65243a;

        /* renamed from: b  reason: collision with root package name */
        boolean f65244b;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f65243a, false, 72989, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f65243a, false, 72989, new Class[0], Void.TYPE);
                return;
            }
            if (!this.f65244b && System.currentTimeMillis() >= s.this.s) {
                s.this.onDismiss();
            }
        }

        private a() {
        }

        /* synthetic */ a(s sVar, byte b2) {
            this();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f65230a, false, 72983, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65230a, false, 72983, new Class[0], Void.TYPE);
            return;
        }
        this.i = false;
        onDismiss();
    }

    public void onDismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f65230a, false, 72982, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65230a, false, 72982, new Class[0], Void.TYPE);
            return;
        }
        if (isShowing() && !this.i) {
            try {
                if (this.f65233d != null && !this.f65233d.isFinishing()) {
                    this.t.a(0.0f, true);
                    dismiss();
                }
            } catch (Exception unused) {
            }
        }
    }

    public void show() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f65230a, false, 72980, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65230a, false, 72980, new Class[0], Void.TYPE);
            return;
        }
        this.t.a();
        if (this.f65233d != null && !this.f65233d.isFinishing() && !isShowing()) {
            this.f65235f.scrollTo(0, 0);
            this.s = System.currentTimeMillis() + ((long) this.h);
            this.t.postDelayed(this.g, (long) this.h);
            if (this.f65231b.getParent() != null) {
                ((ViewGroup) this.f65231b.getParent()).removeView(this.f65231b);
            }
            try {
                View decorView = this.f65233d.getWindow().getDecorView();
                if (Build.VERSION.SDK_INT >= 19) {
                    i2 = -UIUtils.getStatusBarHeight(this.f65233d);
                } else {
                    i2 = UIUtils.getStatusBarHeight(this.f65233d);
                }
                showAtLocation(decorView, 48, 0, i2);
            } catch (WindowManager.BadTokenException unused) {
            }
        }
    }

    public void setShowDuration(int i2) {
        this.h = i2;
    }

    public s(Activity activity) {
        super(activity);
        this.f65233d = activity;
        this.f65231b = LayoutInflater.from(activity).inflate(C0906R.layout.abu, null);
        View view = this.f65231b;
        if (PatchProxy.isSupport(new Object[]{view}, this, f65230a, false, 72975, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f65230a, false, 72975, new Class[]{View.class}, Void.TYPE);
        } else {
            this.f65232c = (RemoteImageView) view.findViewById(C0906R.id.b2f);
            this.f65234e = (LinearLayout) view.findViewById(C0906R.id.cgb);
            this.t = (PullUpLayout) view.findViewById(C0906R.id.c92);
            this.j = (LinearLayout) view.findViewById(C0906R.id.dom);
            this.l = (RemoteImageView) view.findViewById(C0906R.id.b03);
            this.m = (TextView) view.findViewById(C0906R.id.d_t);
            this.k = view.findViewById(C0906R.id.bg1);
            this.n = view.findViewById(C0906R.id.bbs);
            this.u = (LinearLayout) view.findViewById(C0906R.id.bfj);
            this.t.a((View) this.f65234e, false);
            this.t.setPullUpListener(this);
            this.f65235f = (HorizontalScrollView) view.findViewById(C0906R.id.aor);
            this.f65234e.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            this.f65232c.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65236a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f65236a, false, 72986, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f65236a, false, 72986, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    s.this.mActionHandler.onAction(s.this.mShareStruct, "image");
                }
            });
            this.t.setInternalTouchEventListener(new PullUpLayout.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65238a;

                public final void a(MotionEvent motionEvent) {
                    if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f65238a, false, 72987, new Class[]{MotionEvent.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f65238a, false, 72987, new Class[]{MotionEvent.class}, Void.TYPE);
                        return;
                    }
                    switch (motionEvent.getAction()) {
                        case 0:
                            s.this.i = true;
                            if (s.this.g != null) {
                                s.this.g.f65244b = true;
                                return;
                            }
                            break;
                        case 1:
                            s.this.i = false;
                            s.this.s = System.currentTimeMillis() + ((long) s.this.h);
                            s.this.g.f65244b = false;
                            s.this.f65234e.postDelayed(s.this.g, (long) s.this.h);
                            break;
                        case 2:
                            s.this.i = true;
                            return;
                    }
                }
            });
            if (com.ss.android.g.a.b()) {
                this.u.setBackgroundColor(this.f65233d.getResources().getColor(C0906R.color.h5));
            } else {
                this.u.setBackgroundResource(2130838269);
            }
        }
        this.g = new a(this, (byte) 0);
        setBackgroundDrawable(new ColorDrawable(0));
        if (PatchProxy.isSupport(new Object[0], this, f65230a, false, 72979, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65230a, false, 72979, new Class[0], Void.TYPE);
            return;
        }
        setContentView(this.f65231b);
        setWidth(UIUtils.getScreenWidth(this.f65233d));
        setHeight(-2);
        update();
        setAnimationStyle(C0906R.style.tw);
    }
}
