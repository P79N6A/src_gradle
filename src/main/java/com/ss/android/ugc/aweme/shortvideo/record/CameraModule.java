package com.ss.android.ugc.aweme.shortvideo.record;

import android.annotation.TargetApi;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.util.SparseIntArray;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.Lists;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.google.common.a.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.camera.IESCameraInterface;
import com.ss.android.medialib.camera.g;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.b.a.d;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.bi;
import com.ss.android.ugc.aweme.shortvideo.bj;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.l.b;
import com.ss.android.ugc.aweme.shortvideo.s.f;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.shortvideo.util.i;
import com.ss.android.ugc.aweme.shortvideo.util.j;
import dmt.av.video.b.a.c;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class CameraModule implements LifecycleObserver, View.OnClickListener, IESCameraInterface.d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3959a;
    public static SparseIntArray t = new SparseIntArray(4);
    public static SparseIntArray u = new SparseIntArray(2);
    private float A;
    private float B;
    private float C;
    private float D;
    private boolean E;
    private boolean F;
    private boolean G;
    private float H;

    /* renamed from: b  reason: collision with root package name */
    public Handler f3960b;

    /* renamed from: c  reason: collision with root package name */
    public float f3961c;

    /* renamed from: d  reason: collision with root package name */
    public float f3962d;

    /* renamed from: e  reason: collision with root package name */
    public float f3963e;

    /* renamed from: f  reason: collision with root package name */
    public float f3964f;
    public final AbsActivity g;
    public final c h;
    public final MediaRecordPresenter i;
    public final a j;
    public final d<JSONObject> k;
    public com.ss.android.ugc.aweme.shortvideo.e.c l;
    public int m;
    public boolean n;
    public f o;
    public b p;
    public dmt.av.video.b.a q;
    public int r;
    public boolean s;
    public com.ss.android.medialib.presenter.a v;
    private HandlerThread w;
    private Handler x;
    private float y;
    private List<Integer> z;

    public interface a {
        void a(int i, int i2, String str);

        void b(int i);

        void b(int i, int i2);

        void c(int i);
    }

    public final void a(int i2, float f2, boolean z2) {
    }

    public final boolean a() {
        return false;
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3959a, false, 78359, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3959a, false, 78359, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
    }

    public final boolean a(View view, float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3)}, this, f3959a, false, 78335, new Class[]{View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2), Float.valueOf(f3)}, this, f3959a, false, 78335, new Class[]{View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.h.b() == null) {
            return false;
        } else {
            return this.h.a(view.getWidth(), view.getHeight(), this.g.getResources().getDisplayMetrics().density, new float[]{f2, f3});
        }
    }

    public final boolean a(ScaleGestureDetector scaleGestureDetector) {
        if (PatchProxy.isSupport(new Object[]{scaleGestureDetector}, this, f3959a, false, 78337, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector}, this, f3959a, false, 78337, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
        }
        n.a("zoom_info_log", new bi().a("isDragEnable", Boolean.valueOf(this.n)).a("mMaxZoom", Float.valueOf(this.f3961c)).a("mCameraZoomList", Boolean.valueOf(Lists.notEmpty(this.z))).b());
        if (this.n) {
            return true;
        }
        m();
        if (n()) {
            return true;
        }
        if (this.z.isEmpty()) {
            return false;
        }
        a(((this.f3961c / 1000.0f) * (scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan())) + this.A, true);
        return true;
    }

    @TargetApi(23)
    public final synchronized void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3959a, false, 78355, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3959a, false, 78355, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.h.a(z2);
    }

    public final void f() {
        this.A = 0.0f;
        this.B = 0.0f;
        this.C = 0.0f;
        this.D = 1.0f;
    }

    public final void e() {
        this.C = this.B * (this.A / this.f3961c);
        this.E = false;
        this.n = false;
        this.D = 0.0f;
    }

    static {
        t.put(0, 2130839523);
        t.put(1, 2130839524);
        t.put(2, 2130839524);
        t.put(3, 2130839522);
        u.put(0, 2);
        u.put(2, 0);
    }

    private void p() {
        if (PatchProxy.isSupport(new Object[0], this, f3959a, false, 78361, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3959a, false, 78361, new Class[0], Void.TYPE);
            return;
        }
        if (this.w != null) {
            this.x.removeCallbacks(null);
            this.w.quit();
            this.w = null;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3959a, false, 78331, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3959a, false, 78331, new Class[0], Void.TYPE);
            return;
        }
        a((Handler) null);
    }

    public final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f3959a, false, 78334, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3959a, false, 78334, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (h() == 1) {
            return true;
        } else {
            return false;
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f3959a, false, 78343, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3959a, false, 78343, new Class[0], Void.TYPE);
            return;
        }
        a(0.0f, true);
        e();
    }

    public final int h() {
        if (!PatchProxy.isSupport(new Object[0], this, f3959a, false, 78347, new Class[0], Integer.TYPE)) {
            return this.l.a();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3959a, false, 78347, new Class[0], Integer.TYPE)).intValue();
    }

    public final int k() {
        if (!PatchProxy.isSupport(new Object[0], this, f3959a, false, 78353, new Class[0], Integer.TYPE)) {
            return this.h.c();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3959a, false, 78353, new Class[0], Integer.TYPE)).intValue();
    }

    public final int l() {
        if (!PatchProxy.isSupport(new Object[0], this, f3959a, false, 78354, new Class[0], Integer.TYPE)) {
            return this.h.d();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3959a, false, 78354, new Class[0], Integer.TYPE)).intValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f3959a, false, 78341, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3959a, false, 78341, new Class[0], Void.TYPE);
            return;
        }
        c(0);
    }

    private void m() {
        if (PatchProxy.isSupport(new Object[0], this, f3959a, false, 78339, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3959a, false, 78339, new Class[0], Void.TYPE);
            return;
        }
        switch (this.r) {
            case 0:
                if (this.f3961c == -1.0f && !this.G) {
                    this.G = true;
                    com.bytedance.ies.dmt.ui.d.a.b((Context) this.g, (int) C0906R.string.pe, 1).a();
                    return;
                }
            case 1:
                if (this.f3961c == -1.0f && !this.F) {
                    this.F = true;
                    com.bytedance.ies.dmt.ui.d.a.b((Context) this.g, (int) C0906R.string.pe, 1).a();
                    break;
                }
        }
    }

    private boolean n() {
        if (PatchProxy.isSupport(new Object[0], this, f3959a, false, 78340, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3959a, false, 78340, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!this.s || !this.o.a()) {
            return false;
        } else {
            if (!this.E) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) this.g, (int) C0906R.string.dtu, 1).a();
                this.E = true;
            }
            return true;
        }
    }

    private void o() {
        if (PatchProxy.isSupport(new Object[0], this, f3959a, false, 78360, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3959a, false, 78360, new Class[0], Void.TYPE);
            return;
        }
        if (this.w == null) {
            this.w = new HandlerThread("camera_douyin_best");
            this.w.start();
            this.x = new Handler(this.w.getLooper()) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69037a;

                public final void handleMessage(Message message) {
                    Message message2 = message;
                    if (PatchProxy.isSupport(new Object[]{message2}, this, f69037a, false, 78374, new Class[]{Message.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{message2}, this, f69037a, false, 78374, new Class[]{Message.class}, Void.TYPE);
                        return;
                    }
                    super.handleMessage(message);
                    if (message2.what == 1) {
                        CameraModule.this.h.a(((float) message2.arg1) / 1000.0f);
                    }
                }
            };
        }
    }

    public final int i() {
        if (PatchProxy.isSupport(new Object[0], this, f3959a, false, 78349, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3959a, false, 78349, new Class[0], Integer.TYPE)).intValue();
        }
        com.ss.android.ugc.aweme.shortvideo.util.b.a().b();
        com.ss.android.ugc.aweme.shortvideo.util.b.a().c();
        this.l.a(this.l.a() ^ 1);
        return j();
    }

    public final int j() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f3959a, false, 78350, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3959a, false, 78350, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = 1;
        if (h() == 0) {
            z2 = true;
        }
        if (z2) {
            i2 = this.o.f69149b.a();
        }
        this.p.b(!z2);
        a(z2, i2);
        return i2;
    }

    public final void c() {
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f3959a, false, 78333, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3959a, false, 78333, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], null, i.f71136a, true, 80865, new Class[0], Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, i.f71136a, true, 80865, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (((Integer) com.ss.android.ugc.aweme.port.in.a.o.e().a()).intValue() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            c cVar = this.h;
            if (PatchProxy.isSupport(new Object[]{cVar}, null, i.f71136a, true, 80864, new Class[]{c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, null, i.f71136a, true, 80864, new Class[]{c.class}, Void.TYPE);
            } else if (((Integer) com.ss.android.ugc.aweme.port.in.a.o.e().a()).intValue() == 0) {
                try {
                    if (com.ss.android.ugc.aweme.port.in.a.f61119b.getPackageManager().hasSystemFeature("android.hardware.camera.flash") && cVar.h()) {
                        com.ss.android.ugc.aweme.port.in.a.o.e().a(2);
                        return;
                    }
                } catch (Exception e2) {
                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                }
                com.ss.android.ugc.aweme.port.in.a.o.e().a(1);
            }
        }
    }

    @TargetApi(23)
    public final synchronized void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{100}, this, f3959a, false, 78356, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{100}, this, f3959a, false, 78356, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.h.a(100);
    }

    public final void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3959a, false, 78364, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3959a, false, 78364, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.h.b(i2);
        this.m = i2;
    }

    public final void b(@Nullable Handler handler) {
        if (PatchProxy.isSupport(new Object[]{handler}, this, f3959a, false, 78358, new Class[]{Handler.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler}, this, f3959a, false, 78358, new Class[]{Handler.class}, Void.TYPE);
            return;
        }
        p();
        ai.d("camera release");
        if (this.h.g()) {
            if (handler != null) {
                handler.post(new d(this));
            } else {
                c(0);
                this.h.j();
            }
        }
        this.h.a((com.ss.android.medialib.presenter.a) null);
        this.h.a((IESCameraInterface.d) null);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{0}, this, f3959a, false, 78336, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{0}, this, f3959a, false, 78336, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.l.a(0);
    }

    public final void a(@Nullable Handler handler) {
        final int i2 = 1;
        final boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{handler}, this, f3959a, false, 78332, new Class[]{Handler.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler}, this, f3959a, false, 78332, new Class[]{Handler.class}, Void.TYPE);
            return;
        }
        o();
        this.h.a(this.i);
        this.h.a(this.v);
        this.h.a((IESCameraInterface.d) this);
        if (h() == 0) {
            z2 = true;
        }
        if (z2) {
            i2 = this.o.f69149b.a();
        }
        this.p.a(z2);
        ai.a("CameraModule => open camera");
        AnonymousClass1 r0 = new com.ss.android.medialib.camera.c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69024a;

            public final void a(int i) {
                int i2 = i;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69024a, false, 78368, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69024a, false, 78368, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                ai.a("CameraModule => onOpenSuccess");
                com.ss.android.ugc.aweme.shortvideo.util.b.a().c();
                com.ss.android.ugc.aweme.port.in.a.u.b(!z2);
                CameraModule.this.h.a(CameraModule.this.v);
                CameraModule.this.h.a((Context) CameraModule.this.g);
                CameraModule.this.j.b(CameraModule.this.h());
                CameraModule.this.f3964f = 0.0f;
                CameraModule.this.f();
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, j.f71137a, true, 80872, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, j.f71137a, true, 80872, new Class[]{Integer.TYPE}, Void.TYPE);
                } else if (i2 == 2) {
                    com.ss.android.ugc.aweme.port.in.a.L.a(e.a.RecordUseSuccessCameraType, 1);
                } else {
                    com.ss.android.ugc.aweme.port.in.a.L.a(e.a.RecordUseSuccessCameraType, 0);
                }
                n.a("aweme_open_camera_error_rate", 0, new bi().a("useVERecoder", Boolean.valueOf(dmt.av.video.b.n.a())).b());
                CameraModule.this.r = i2;
                CameraModule.this.f3961c = CameraModule.this.h.a();
                CameraModule.this.f3962d = CameraModule.this.o.f69149b.a(CameraModule.this.f3961c, i2);
                CameraModule.this.f3963e = CameraModule.this.o.f69149b.b(0.0f, i2);
                if (CameraModule.this.o.f69149b.f69130d != null) {
                    CameraModule.this.o.f69149b.f69130d.a(i2);
                }
                MediaRecordPresenter mediaRecordPresenter = CameraModule.this.i;
                boolean a2 = com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableSoftEncodeAcc);
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(a2 ? (byte) 1 : 0)}, mediaRecordPresenter, MediaRecordPresenter.f29728a, false, 17640, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
                    MediaRecordPresenter mediaRecordPresenter2 = mediaRecordPresenter;
                    ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(a2)}, mediaRecordPresenter2, MediaRecordPresenter.f29728a, false, 17640, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
                } else {
                    mediaRecordPresenter.j.setSharedTextureStatus(a2);
                }
            }

            public final void a(int i, int i2, String str) {
                int i3 = i2;
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f69024a, false, 78369, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f69024a, false, 78369, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                    return;
                }
                CameraModule.this.j.a(i, i3, str2);
                n.a("aweme_open_camera_error_rate", i3, new bi().a("useVERecoder", Boolean.valueOf(dmt.av.video.b.n.a())).a("errorDesc", str2).b());
            }
        };
        if (handler != null) {
            handler.post(new c(this, i2, r0));
        } else {
            this.h.b(i2, r0);
        }
    }

    private void a(final boolean z2, final int i2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i2)}, this, f3959a, false, 78351, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Integer.valueOf(i2)}, this, f3959a, false, 78351, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            final q b2 = q.b();
            this.h.a(i2, new com.ss.android.medialib.camera.c() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69028a;

                public final void a(int i) {
                    String str;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69028a, false, 78370, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69028a, false, 78370, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    fh fhVar = ((ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) CameraModule.this.g).get(ShortVideoContextViewModel.class)).f65401b;
                    if (fhVar != null && b2.f2357a) {
                        b2.d();
                        String format = String.format(Locale.US, "%d", new Object[]{Long.valueOf(b2.a(TimeUnit.MILLISECONDS))});
                        com.ss.android.ugc.aweme.utils.a aVar = com.ss.android.ugc.aweme.utils.a.f75468b;
                        bj a2 = bj.a().a("creation_id", fhVar.q).a("shoot_way", fhVar.r).a("draft_id", fhVar.v);
                        if (CameraModule.this.h() == 0) {
                            str = "front";
                        } else {
                            str = "back";
                        }
                        aVar.a("flip_camera", a2.a("to_status", str).a("enter_from", "video_shoot_page").a("camera_type", j.a(i)).a("duration", format).f65805b);
                    }
                    CameraModule.this.l.a(CameraModule.this.h());
                    com.ss.android.ugc.aweme.port.in.a.u.b(!z2);
                    if (CameraModule.this.h() == 0) {
                        com.ss.android.ugc.aweme.utils.a.f75468b.onEvent(MobClick.obtain().setEventName("rear_to_back").setLabelName("shoot_page").setJsonObject((JSONObject) CameraModule.this.k.a()));
                    } else {
                        com.ss.android.ugc.aweme.utils.a.f75468b.onEvent(MobClick.obtain().setEventName("rear_to_front").setLabelName("shoot_page").setJsonObject((JSONObject) CameraModule.this.k.a()));
                    }
                    CameraModule.this.q.b().a((((float) CameraModule.this.h.c()) * 1.0f) / ((float) CameraModule.this.h.d()));
                    CameraModule.this.j.c(CameraModule.this.h());
                    CameraModule.this.f3964f = 0.0f;
                    CameraModule.this.f();
                    n.a("aweme_open_camera_error_rate", 0, new bi().a("useVERecoder", Boolean.valueOf(dmt.av.video.b.n.a())).b());
                    CameraModule.this.r = i;
                    CameraModule.this.f3961c = CameraModule.this.h.a();
                    CameraModule.this.f3962d = CameraModule.this.o.f69149b.a(CameraModule.this.f3961c, i2);
                    CameraModule.this.f3963e = CameraModule.this.o.f69149b.b(0.0f, i2);
                    if (CameraModule.this.o.f69149b.f69130d != null) {
                        CameraModule.this.o.f69149b.f69130d.a(i);
                    }
                    com.ss.android.ugc.aweme.shortvideo.util.b.a().c();
                }

                public final void a(int i, int i2, String str) {
                    String str2 = str;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f69028a, false, 78371, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f69028a, false, 78371, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                        return;
                    }
                    b2.e();
                    n.a("aweme_open_camera_error_rate", i2, new bi().a("useVERecoder", Boolean.valueOf(dmt.av.video.b.n.a())).a("errorDesc", str2).b());
                }
            });
        } catch (Exception unused) {
        }
        this.h.a((g.a) new g.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69033a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f69033a, false, 78372, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f69033a, false, 78372, new Class[0], Void.TYPE);
                    return;
                }
                CameraModule.this.f3960b.post(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f69035a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f69035a, false, 78373, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f69035a, false, 78373, new Class[0], Void.TYPE);
                            return;
                        }
                        com.ss.android.ugc.aweme.shortvideo.util.b.a().c();
                        com.ss.android.ugc.aweme.shortvideo.util.b.a().a("av_video_record_change_camera");
                    }
                });
                CameraModule.this.h.a((g.a) null);
            }
        });
    }

    private void a(float f2, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), (byte) 1}, this, f3959a, false, 78342, new Class[]{Float.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), (byte) 1}, this, f3959a, false, 78342, new Class[]{Float.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        float max = Math.max(Math.min(this.f3961c, f2), 0.0f);
        this.A = max;
        if (this.A <= this.f3962d && this.A >= this.f3963e) {
            if (this.A / this.f3961c > this.y) {
                this.y = this.A / this.f3961c;
            }
            bi biVar = new bi();
            n.a("zoom_info_log", biVar.a("camera_zoom_size", " size = " + max).b());
            if (this.x != null) {
                Message message = new Message();
                message.what = 1;
                message.arg1 = (int) (max * 1000.0f);
                this.x.sendMessage(message);
                return;
            }
            this.h.a(max);
        }
    }

    public final void a(float f2, float f3) {
        float f4;
        float f5;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f3959a, false, 78338, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f3959a, false, 78338, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.n = true;
        m();
        if (!n()) {
            float f6 = 0.0f;
            if (this.B == 0.0f) {
                this.C = (this.A / this.f3961c) * f3;
            }
            this.B = f3;
            if (!this.z.isEmpty()) {
                if (this.A >= 0.0f) {
                    f6 = this.A;
                }
                this.A = f6;
                if (((double) f2) <= 0.05d) {
                    f4 = f2 / 4.0f;
                } else {
                    f4 = f2;
                }
                if (f4 < this.D) {
                    f5 = this.A - ((((this.D - f4) * f3) / f3) * this.f3961c);
                } else {
                    f5 = this.f3961c * (((f4 * f3) + this.C) / f3);
                }
                this.D = f4;
                a(f5, true);
            }
        }
    }

    public CameraModule(AbsActivity absActivity, MediaRecordPresenter mediaRecordPresenter, a aVar, d<JSONObject> dVar) {
        this(absActivity, (dmt.av.video.b.a) new dmt.av.video.b.d(absActivity, mediaRecordPresenter), aVar, dVar);
    }

    public CameraModule(AbsActivity absActivity, dmt.av.video.b.a aVar, a aVar2, d<JSONObject> dVar) {
        this.f3960b = new Handler(Looper.getMainLooper());
        this.z = new LinkedList();
        this.l = new com.ss.android.ugc.aweme.shortvideo.e.d();
        this.m = 0;
        this.B = 0.0f;
        this.C = 0.0f;
        this.D = 1.0f;
        this.n = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.s = true;
        this.H = 0.0f;
        this.v = new com.ss.android.medialib.presenter.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69039a;

            public final void b(int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f69039a, false, 78375, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f69039a, false, 78375, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                CameraModule.this.j.b(i, i2);
            }
        };
        this.g = absActivity;
        this.q = aVar;
        this.i = aVar.f();
        this.j = aVar2;
        this.k = dVar;
        this.h = aVar.g();
        this.o = new f(absActivity, aVar.g());
        this.p = new b(absActivity, aVar.g());
    }

    public final void a(int i2, boolean z2, boolean z3, float f2, List<Integer> list) {
        String str;
        List<Integer> list2 = list;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0), Float.valueOf(f2), list2}, this, f3959a, false, 78330, new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Float.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2), Byte.valueOf(z3), Float.valueOf(f2), list2}, this, f3959a, false, 78330, new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Float.TYPE, List.class}, Void.TYPE);
            return;
        }
        this.f3961c = f2;
        if (list2 != null) {
            this.z.clear();
            this.z.addAll(list2);
        }
        bi a2 = new bi().a("cameraType", Integer.valueOf(i2)).a("supportZoom", Boolean.valueOf(z2)).a("supportSmooth", Boolean.valueOf(z3)).a("maxZoom", Float.valueOf(f2));
        if (Lists.notEmpty(list)) {
            str = list2.get(0);
        } else {
            str = " ";
        }
        n.a("zoom_info_log", a2.a("ratios", str).b());
    }
}
