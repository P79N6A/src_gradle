package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaRecorder;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Surface;
import android.view.View;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.d.b;
import com.bytedance.android.livesdk.chatroom.d.g;
import com.bytedance.android.livesdk.chatroom.widget.o;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.m.b.d;
import com.bytedance.android.livesdk.m.f;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.utils.al;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import java.io.File;
import java.util.HashMap;
import org.aspectj.lang.a;
import org.json.JSONException;
import org.json.JSONObject;

@RequiresApi(api = 21)
public class co extends com.bytedance.android.livesdk.common.a implements DialogInterface.OnDismissListener, ImageReader.OnImageAvailableListener, MediaRecorder.OnErrorListener, View.OnClickListener, WeakHandler.IHandler {
    private static final /* synthetic */ a.C0900a U;

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13089a;
    private static final String p = co.class.getSimpleName();
    private TextView A;
    private View B;
    private boolean C;
    private a D;
    private boolean E;
    private DisplayMetrics F;
    private MediaRecorder G;
    private int H;
    private int I = 3;
    private int J = 60;
    private String K;
    private String L;
    private boolean M = true;
    private boolean N;
    private boolean O;
    private Activity P;
    private g Q;
    private ObjectAnimator R;
    private Room S;
    private Observer<KVData> T = new Observer<KVData>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f13096a;

        public final /* synthetic */ void onChanged(@Nullable Object obj) {
            KVData kVData = (KVData) obj;
            if (PatchProxy.isSupport(new Object[]{kVData}, this, f13096a, false, 7207, new Class[]{KVData.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{kVData}, this, f13096a, false, 7207, new Class[]{KVData.class}, Void.TYPE);
            } else if (co.this.l && kVData != null) {
                co.this.h = ((Boolean) kVData.getData()).booleanValue();
                co.this.d();
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public MediaProjectionManager f13090b;

    /* renamed from: c  reason: collision with root package name */
    public MediaProjection f13091c;

    /* renamed from: d  reason: collision with root package name */
    public int f13092d = 1;

    /* renamed from: e  reason: collision with root package name */
    public WeakHandler f13093e;

    /* renamed from: f  reason: collision with root package name */
    public ImageReader f13094f;
    public o g;
    public boolean h;
    public DataCenter i;
    public MediaProjection.Callback j = new MediaProjection.Callback() {
        public final void onStop() {
            if (co.this.l) {
                co.this.f13091c = null;
            }
        }
    };
    private int q;
    private int r;
    private View s;
    private ViewStub t;
    private View u;
    private ProgressBar v;
    private View w;
    private TextView x;
    private View y;
    private View z;

    public interface a {
        void a(Intent intent, int i);
    }

    private void j() {
        if (PatchProxy.isSupport(new Object[0], this, f13089a, false, 7197, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13089a, false, 7197, new Class[0], Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(this.K)) {
            new b().execute(new String[]{this.K});
        }
        this.K = null;
        this.L = null;
    }

    public final void d() {
        boolean z2;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f13089a, false, 7196, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13089a, false, 7196, new Class[0], Void.TYPE);
            return;
        }
        if (this.N || this.M || this.h) {
            z2 = false;
        } else {
            z2 = true;
        }
        View view = this.s;
        if (!z2) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f13089a, true, 7202, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f13089a, true, 7202, new Class[0], Void.TYPE);
        } else {
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("LiveRecordViewModule.java", co.class);
            U = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.LiveRecordViewModule", "android.view.View", NotifyType.VIBRATE, "", "void"), 293);
        }
    }

    private boolean h() {
        if (PatchProxy.isSupport(new Object[0], this, f13089a, false, 7184, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f13089a, false, 7184, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f13091c != null) {
            return false;
        } else {
            this.f13090b = (MediaProjectionManager) this.m.getSystemService("media_projection");
            this.D.a(this.f13090b.createScreenCaptureIntent(), 42342);
            return true;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f13089a, false, 7177, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13089a, false, 7177, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        if (!this.E) {
            if (this.Q == null) {
                this.Q = new g(this.m, this.f13093e, 3);
            }
            this.m.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.Q);
        }
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f13089a, false, 7188, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13089a, false, 7188, new Class[0], Void.TYPE);
            return;
        }
        f.a(this.P).a(cr.f13114b).b(cs.f13116b).a(new d() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f13105a;

            public final void a(String... strArr) {
                if (PatchProxy.isSupport(new Object[]{strArr}, this, f13105a, false, 7211, new Class[]{String[].class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{strArr}, this, f13105a, false, 7211, new Class[]{String[].class}, Void.TYPE);
                    return;
                }
                co.this.c();
            }

            public final void b(String... strArr) {
                if (PatchProxy.isSupport(new Object[]{strArr}, this, f13105a, false, 7212, new Class[]{String[].class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{strArr}, this, f13105a, false, 7212, new Class[]{String[].class}, Void.TYPE);
                    return;
                }
                co.a("android.permission.WRITE_EXTERNAL_STORAGE", al.b.CLICK, null, "cancel");
            }
        }, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public final void e() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f13089a, false, 7199, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13089a, false, 7199, new Class[0], Void.TYPE);
            return;
        }
        super.e();
        if (this.O) {
            if (this.H >= this.I) {
                z2 = true;
            }
            c(z2);
        }
        if (!this.E && this.Q != null) {
            this.m.getContentResolver().unregisterContentObserver(this.Q);
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f13089a, false, 7200, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13089a, false, 7200, new Class[0], Void.TYPE);
            return;
        }
        super.f();
        this.f13093e.removeCallbacksAndMessages(null);
        this.i.removeObserver("data_keyboard_status", this.T);
        if (this.f13091c != null) {
            this.f13091c.stop();
        }
        if (this.R != null) {
            this.R.end();
            this.R = null;
        }
        j();
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f13089a, false, 7180, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13089a, false, 7180, new Class[0], Void.TYPE);
        } else if (!this.C) {
            this.w = this.t.inflate();
            this.v = (ProgressBar) this.w.findViewById(C0906R.id.cbt);
            this.v.setMax(this.J * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
            this.u = this.w.findViewById(C0906R.id.cbu);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.u.getLayoutParams();
            layoutParams.leftMargin = (int) ((((float) this.I) / ((float) this.J)) * ((float) this.F.widthPixels));
            this.u.setLayoutParams(layoutParams);
            this.x = (TextView) this.w.findViewById(C0906R.id.cbo);
            this.A = (TextView) this.w.findViewById(C0906R.id.cbk);
            this.B = this.w.findViewById(C0906R.id.cbz);
            this.y = this.w.findViewById(C0906R.id.cbx);
            this.z = this.w.findViewById(C0906R.id.cbi);
            this.A.setOnClickListener(this);
            this.B.setOnClickListener(this);
            this.y.setOnClickListener(this);
            this.z.setOnClickListener(this);
            this.C = true;
        }
    }

    private void i() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f13089a, false, 7192, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13089a, false, 7192, new Class[0], Void.TYPE);
        } else if (this.f13092d == 1) {
            this.N = true;
            d();
            this.i.lambda$put$1$DataCenter("data_screen_record_is_open", Boolean.TRUE);
            g();
            this.v.setVisibility(8);
            this.u.setVisibility(8);
            this.y.setVisibility(0);
            this.z.setVisibility(0);
            this.x.setText(C0906R.string.daz);
            this.x.setVisibility(0);
            this.B.setVisibility(0);
            this.w.setVisibility(0);
            JSONObject jSONObject = null;
            if (!this.E) {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("request_id", this.S.getRequestId());
                    jSONObject.put("log_pb", this.S.getLog_pb());
                    jSONObject.put("source", this.S.getUserFrom());
                    jSONObject.put("is_clear", true ^ this.M ? 1 : 0);
                } catch (JSONException unused) {
                }
            }
            JSONObject jSONObject2 = jSONObject;
            com.bytedance.android.livesdk.j.f a2 = com.bytedance.android.livesdk.j.f.a(this.m);
            if (this.E) {
                str = "anchor_click";
            } else {
                str = "user_click";
            }
            a2.a("click_rec_button", str, this.S.getOwner().getId(), this.S.getId(), jSONObject2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r16 = this;
            r7 = r16
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f13089a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 7189(0x1c15, float:1.0074E-41)
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0027
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f13089a
            r3 = 0
            r4 = 7189(0x1c15, float:1.0074E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0027:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "record"
            r0.<init>(r1)
            long r1 = java.lang.System.currentTimeMillis()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.content.Context r1 = r7.m
            r2 = 2
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r9[r8] = r1
            r3 = 1
            r9[r3] = r0
            r10 = 0
            com.meituan.robust.ChangeQuickRedirect r11 = com.bytedance.android.livesdk.chatroom.d.c.f9888a
            r12 = 1
            r13 = 5346(0x14e2, float:7.491E-42)
            java.lang.Class[] r14 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r14[r8] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r14[r3] = r4
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            r5 = 0
            if (r4 == 0) goto L_0x007c
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r9[r8] = r1
            r9[r3] = r0
            r10 = 0
            com.meituan.robust.ChangeQuickRedirect r11 = com.bytedance.android.livesdk.chatroom.d.c.f9888a
            r12 = 1
            r13 = 5346(0x14e2, float:7.491E-42)
            java.lang.Class[] r14 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r14[r8] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r14[r3] = r0
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x00b4
        L_0x007c:
            java.lang.String r1 = com.bytedance.android.livesdk.chatroom.d.c.a((android.content.Context) r1)
            if (r1 != 0) goto L_0x0083
            goto L_0x00b4
        L_0x0083:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = java.io.File.separator
            r4.append(r1)
            java.lang.String r1 = "record"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            boolean r4 = com.bytedance.android.livesdk.chatroom.d.c.a((java.lang.String) r1)
            if (r4 != 0) goto L_0x00a0
            goto L_0x00b4
        L_0x00a0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = java.io.File.separator
            r4.append(r1)
            r4.append(r0)
            java.lang.String r5 = r4.toString()
        L_0x00b4:
            r7.K = r5
            java.lang.String r0 = r7.K
            if (r0 != 0) goto L_0x00c3
            r0 = 2131563945(0x7f0d15a9, float:1.8753361E38)
            com.bytedance.android.livesdk.utils.ai.a((int) r0)
            r7.f13092d = r3
            return
        L_0x00c3:
            r7.f13092d = r2
            boolean r0 = r16.h()
            if (r0 == 0) goto L_0x00cc
            return
        L_0x00cc:
            android.media.MediaRecorder r0 = new android.media.MediaRecorder
            r0.<init>()
            r7.G = r0
            boolean r0 = r7.E
            if (r0 != 0) goto L_0x00dc
            android.media.MediaRecorder r0 = r7.G
            r0.setAudioSource(r3)
        L_0x00dc:
            android.media.MediaRecorder r0 = r7.G
            r0.setVideoSource(r2)
            android.media.MediaRecorder r0 = r7.G
            r0.setOutputFormat(r2)
            android.media.MediaRecorder r0 = r7.G
            java.lang.String r1 = r7.K
            r0.setOutputFile(r1)
            boolean r0 = r7.E
            if (r0 != 0) goto L_0x00f7
            android.media.MediaRecorder r0 = r7.G
            r1 = 3
            r0.setAudioEncoder(r1)
        L_0x00f7:
            android.media.MediaRecorder r0 = r7.G
            r0.setVideoEncoder(r2)
            android.media.MediaRecorder r0 = r7.G
            r1 = 1024(0x400, float:1.435E-42)
            r4 = 576(0x240, float:8.07E-43)
            r0.setVideoSize(r4, r1)
            android.media.MediaRecorder r0 = r7.G
            r5 = 30
            r0.setVideoFrameRate(r5)
            android.media.MediaRecorder r0 = r7.G
            r5 = 1769472(0x1b0000, float:2.479558E-39)
            r0.setVideoEncodingBitRate(r5)
            android.view.View r0 = r7.B
            r5 = 8
            r0.setVisibility(r5)
            android.view.View r0 = r7.y
            r0.setVisibility(r5)
            android.view.View r0 = r7.z
            r0.setVisibility(r5)
            android.widget.TextView r0 = r7.x
            r0.setVisibility(r5)
            r7.H = r8
            android.widget.TextView r0 = r7.A
            int r5 = r7.H
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0.setText(r5)
            android.widget.ProgressBar r0 = r7.v
            r0.setVisibility(r8)
            android.view.View r0 = r7.u
            r0.setVisibility(r8)
            android.widget.ProgressBar r0 = r7.v
            r0.setProgress(r8)
            android.widget.ProgressBar r0 = r7.v
            java.lang.String r5 = "progress"
            int[] r6 = new int[r2]
            r6[r8] = r8
            int r9 = r7.J
            int r9 = r9 * 1000
            r6[r3] = r9
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r5, r6)
            r7.R = r0
            android.animation.ObjectAnimator r0 = r7.R
            int r5 = r7.J
            int r5 = r5 * 1000
            long r5 = (long) r5
            r0.setDuration(r5)
            android.animation.ObjectAnimator r0 = r7.R
            android.view.animation.LinearInterpolator r5 = new android.view.animation.LinearInterpolator
            r5.<init>()
            r0.setInterpolator(r5)
            android.media.MediaRecorder r0 = r7.G     // Catch:{ Exception -> 0x018f }
            r0.prepare()     // Catch:{ Exception -> 0x018f }
            android.media.MediaRecorder r0 = r7.G     // Catch:{ Exception -> 0x018f }
            android.view.Surface r0 = r0.getSurface()     // Catch:{ Exception -> 0x018f }
            r7.a((android.view.Surface) r0, (int) r4, (int) r1)     // Catch:{ Exception -> 0x018f }
            android.media.MediaRecorder r0 = r7.G     // Catch:{ Exception -> 0x018f }
            r0.start()     // Catch:{ Exception -> 0x018f }
            android.animation.ObjectAnimator r0 = r7.R     // Catch:{ Exception -> 0x018f }
            r0.start()     // Catch:{ Exception -> 0x018f }
            com.bytedance.common.utility.collection.WeakHandler r0 = r7.f13093e     // Catch:{ Exception -> 0x018f }
            r4 = 1000(0x3e8, double:4.94E-321)
            r0.sendEmptyMessageDelayed(r2, r4)     // Catch:{ Exception -> 0x018f }
            r7.O = r3     // Catch:{ Exception -> 0x018f }
            return
        L_0x018f:
            r7.c(r8)
            r0 = 2131563966(0x7f0d15be, float:1.8753404E38)
            com.bytedance.android.livesdk.utils.ai.a((int) r0)
            r7.f13092d = r3
            r16.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.co.c():void");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f13089a, false, 7183, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f13089a, false, 7183, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f13092d = 1;
        j();
    }

    public void onEvent(com.bytedance.android.livesdk.chatroom.event.b bVar) {
        com.bytedance.android.livesdk.chatroom.event.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f13089a, false, 7195, new Class[]{com.bytedance.android.livesdk.chatroom.event.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f13089a, false, 7195, new Class[]{com.bytedance.android.livesdk.chatroom.event.b.class}, Void.TYPE);
            return;
        }
        this.M = !bVar2.f10161a;
        d();
    }

    private void d(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f13089a, false, 7193, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f13089a, false, 7193, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2) {
            this.N = false;
            d();
            this.i.lambda$put$1$DataCenter("data_screen_record_is_open", Boolean.FALSE);
        }
        this.w.setVisibility(8);
    }

    public void onImageAvailable(ImageReader imageReader) {
        if (PatchProxy.isSupport(new Object[]{imageReader}, this, f13089a, false, 7187, new Class[]{ImageReader.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageReader}, this, f13089a, false, 7187, new Class[]{ImageReader.class}, Void.TYPE);
            return;
        }
        imageReader.setOnImageAvailableListener(null, null);
        Image acquireLatestImage = imageReader.acquireLatestImage();
        if (this.f13091c != null) {
            this.f13091c.stop();
        }
        new com.bytedance.android.livesdk.chatroom.d.f(this.F, this.f13093e, 0).execute(new Image[]{acquireLatestImage});
    }

    private void c(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f13089a, false, 7191, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f13089a, false, 7191, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        d(true);
        if (this.f13091c != null) {
            this.f13091c.stop();
        }
        if (this.G != null) {
            this.G.release();
        }
        if (this.R != null) {
            this.R.end();
            this.R = null;
        }
        this.f13093e.removeMessages(2);
        this.f13093e.removeMessages(1);
        if (z2) {
            if (this.g != null && this.g.isShowing()) {
                this.g.dismiss();
            }
            o oVar = new o(this.P, this.S, this.E, 1, this.K);
            this.g = oVar;
            this.g.setOnDismissListener(this);
            this.o.postDelayed(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f13107a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f13107a, false, 7213, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f13107a, false, 7213, new Class[0], Void.TYPE);
                    } else if (!co.this.l) {
                        co.this.f13092d = 1;
                    } else {
                        co.this.g.show();
                    }
                }
            }, 100);
        } else {
            this.f13092d = 1;
        }
        this.O = false;
    }

    public final void b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f13089a, false, 7186, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f13089a, false, 7186, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f13092d = 1;
        if (!h()) {
            this.f13094f = ImageReader.newInstance(this.F.widthPixels, this.F.heightPixels, 1, 2);
            this.f13094f.setOnImageAvailableListener(this, this.f13093e);
            d(false);
            final int i2 = this.F.widthPixels;
            final int i3 = this.F.heightPixels;
            if (z2) {
                this.f13093e.postDelayed(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f13101a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f13101a, false, 7210, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f13101a, false, 7210, new Class[0], Void.TYPE);
                        } else if (co.this.l) {
                            co.this.a(co.this.f13094f.getSurface(), i2, i3);
                        }
                    }
                }, 300);
            } else {
                a(this.f13094f.getSurface(), i2, i3);
            }
        }
    }

    public void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f13089a, false, 7182, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f13089a, false, 7182, new Class[]{Message.class}, Void.TYPE);
        } else if (this.l) {
            switch (message2.what) {
                case 0:
                    this.N = false;
                    d();
                    this.i.lambda$put$1$DataCenter("data_screen_record_is_open", Boolean.FALSE);
                    if (message2.obj instanceof Exception) {
                        ai.a((int) C0906R.string.daq);
                        this.f13092d = 1;
                        return;
                    } else if (message2.obj instanceof String) {
                        this.L = (String) message2.obj;
                        File file = new File(this.L);
                        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                        intent.setData(Uri.fromFile(file));
                        this.m.sendBroadcast(intent);
                        ai.a((int) C0906R.string.dao);
                        if (this.E) {
                            this.f13092d = 1;
                            return;
                        }
                        if (this.g != null && this.g.isShowing()) {
                            this.g.dismiss();
                        }
                        o oVar = new o(this.P, this.S, this.E, 0, this.L);
                        this.g = oVar;
                        if (!com.bytedance.android.livesdkapi.a.a.f18614b) {
                            this.g.show();
                        }
                        return;
                    }
                    break;
                case 1:
                    this.x.setVisibility(8);
                    return;
                case 2:
                    if (this.H >= this.J - 1) {
                        c(true);
                        return;
                    }
                    this.H++;
                    this.A.setText(String.valueOf(this.H));
                    this.f13093e.sendEmptyMessageDelayed(2, 1000);
                    return;
                case 3:
                    if (1 == this.f13092d && (message2.obj instanceof String)) {
                        String str = (String) message2.obj;
                        if (!TextUtils.isEmpty(str)) {
                            com.bytedance.android.livesdk.j.a.a a2 = com.bytedance.android.livesdk.j.a.a.a();
                            if (PatchProxy.isSupport(new Object[0], a2, com.bytedance.android.livesdk.j.a.a.f15643a, false, 10910, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], a2, com.bytedance.android.livesdk.j.a.a.f15643a, false, 10910, new Class[0], Void.TYPE);
                            } else {
                                JSONObject jSONObject = new JSONObject();
                                a2.a(jSONObject, "time_stamp", System.currentTimeMillis());
                                com.bytedance.android.livesdk.j.a.a.f15644b.b(com.bytedance.android.livesdk.j.a.b.Screen_Shot.info, jSONObject);
                            }
                            if (this.g == null || !this.g.isShowing()) {
                                o oVar2 = new o(this.P, this.S, this.E, 0, str);
                                this.g = oVar2;
                                if (!com.bytedance.android.livesdkapi.a.a.f18614b) {
                                    this.g.show();
                                    JSONObject jSONObject2 = new JSONObject();
                                    try {
                                        jSONObject2.put("request_id", this.S.getRequestId());
                                        jSONObject2.put("log_pb", this.S.getLog_pb());
                                        jSONObject2.put("source", this.S.getUserFrom());
                                        jSONObject2.put("is_clear", this.M ^ true ? 1 : 0);
                                    } catch (JSONException unused) {
                                    }
                                    com.bytedance.android.livesdk.j.f.a(this.m).a("show_cut_share", "show", this.S.getOwner().getId(), this.S.getId(), jSONObject2);
                                    break;
                                }
                            } else {
                                return;
                            }
                        }
                    }
                    break;
            }
        }
    }

    @RequiresApi(api = 21)
    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f13089a, false, 7181, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f13089a, false, 7181, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(U, this, this, view2));
        if (C0906R.id.cbm == view.getId()) {
            i();
        } else if (C0906R.id.cbi == view.getId()) {
            d(true);
        } else {
            JSONObject jSONObject = null;
            if (C0906R.id.cbx == view.getId() && 1 == this.f13092d) {
                a(false);
                if (!this.E) {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("request_id", this.S.getRequestId());
                        jSONObject.put("log_pb", this.S.getLog_pb());
                        jSONObject.put("source", this.S.getUserFrom());
                        jSONObject.put("is_clear", this.M ^ true ? 1 : 0);
                    } catch (JSONException unused) {
                    }
                }
                JSONObject jSONObject2 = jSONObject;
                com.bytedance.android.livesdk.j.f a2 = com.bytedance.android.livesdk.j.f.a(this.m);
                if (this.E) {
                    str3 = "anchor_click";
                } else {
                    str3 = "user_click";
                }
                a2.a("click_cut_button", str3, this.S.getOwner().getId(), this.S.getId(), jSONObject2);
            } else if (C0906R.id.cbk != view.getId()) {
                if (C0906R.id.cbz == view.getId() && 1 == this.f13092d) {
                    b();
                    if (!this.E) {
                        jSONObject = new JSONObject();
                        try {
                            jSONObject.put("request_id", this.S.getRequestId());
                            jSONObject.put("log_pb", this.S.getLog_pb());
                            jSONObject.put("source", this.S.getUserFrom());
                            jSONObject.put("is_clear", this.M ^ true ? 1 : 0);
                        } catch (JSONException unused2) {
                        }
                    }
                    JSONObject jSONObject3 = jSONObject;
                    com.bytedance.android.livesdk.j.f a3 = com.bytedance.android.livesdk.j.f.a(this.m);
                    if (this.E) {
                        str = "anchor_click";
                    } else {
                        str = "user_click";
                    }
                    a3.a("click_begin_rec", str, this.S.getOwner().getId(), this.S.getId(), jSONObject3);
                }
            } else if (this.B.getVisibility() != 0) {
                if (this.H < this.I) {
                    this.x.setText(this.m.getString(C0906R.string.dae, new Object[]{Integer.valueOf(this.I)}));
                    this.x.setVisibility(0);
                    this.f13093e.sendEmptyMessageDelayed(1, 1000);
                } else {
                    c(true);
                }
                JSONObject jSONObject4 = new JSONObject();
                try {
                    if (!this.E) {
                        jSONObject4.put("request_id", this.S.getRequestId());
                        jSONObject4.put("log_pb", this.S.getLog_pb());
                        jSONObject4.put("source", this.S.getUserFrom());
                        jSONObject4.put("is_clear", this.M ^ true ? 1 : 0);
                    }
                    jSONObject4.put("duration", this.H);
                } catch (JSONException unused3) {
                }
                com.bytedance.android.livesdk.j.f a4 = com.bytedance.android.livesdk.j.f.a(this.m);
                if (this.E) {
                    str2 = "anchor_click";
                } else {
                    str2 = "user_click";
                }
                a4.a("click_begin_rec", str2, this.S.getOwner().getId(), this.S.getId(), jSONObject4);
            }
        }
    }

    public void a(final boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f13089a, false, 7185, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f13089a, false, 7185, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        f.a(this.P).a(cp.f13110b).b(cq.f13112b).a(new d() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f13098a;

            public final void a(String... strArr) {
                if (PatchProxy.isSupport(new Object[]{strArr}, this, f13098a, false, 7208, new Class[]{String[].class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{strArr}, this, f13098a, false, 7208, new Class[]{String[].class}, Void.TYPE);
                    return;
                }
                co.this.b(z2);
            }

            public final void b(String... strArr) {
                if (PatchProxy.isSupport(new Object[]{strArr}, this, f13098a, false, 7209, new Class[]{String[].class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{strArr}, this, f13098a, false, 7209, new Class[]{String[].class}, Void.TYPE);
                    return;
                }
                co.a("android.permission.WRITE_EXTERNAL_STORAGE", al.b.CLICK, null, "cancel");
            }
        }, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public void onError(MediaRecorder mediaRecorder, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{mediaRecorder, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f13089a, false, 7190, new Class[]{MediaRecorder.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mediaRecorder, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f13089a, false, 7190, new Class[]{MediaRecorder.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        ai.a((int) C0906R.string.dai);
        this.f13092d = 1;
        c(false);
    }

    public final void a(Context context, View view, Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{context, view2, bundle}, this, f13089a, false, 7176, new Class[]{Context.class, View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, view2, bundle}, this, f13089a, false, 7176, new Class[]{Context.class, View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.a(context, view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f13089a, false, 7178, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13089a, false, 7178, new Class[0], Void.TYPE);
        } else {
            int intValue = ((Integer) com.bytedance.android.livesdk.config.a.V.a()).intValue();
            int intValue2 = ((Integer) com.bytedance.android.livesdk.config.a.W.a()).intValue();
            if (intValue > 0 && intValue <= intValue2) {
                this.I = intValue;
                this.J = intValue2;
            }
        }
        if (PatchProxy.isSupport(new Object[]{view2}, this, f13089a, false, 7179, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f13089a, false, 7179, new Class[]{View.class}, Void.TYPE);
        } else {
            this.s = view.findViewById(C0906R.id.cbm);
            this.s.setOnClickListener(this);
            this.t = (ViewStub) view.findViewById(C0906R.id.cbg);
            this.F = new DisplayMetrics();
            ((WindowManager) this.m.getSystemService("window")).getDefaultDisplay().getRealMetrics(this.F);
            this.q = 576;
            this.r = 1024;
        }
        this.i.observeForever("data_keyboard_status", this.T);
    }

    public final void a(Surface surface, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{surface, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f13089a, false, 7194, new Class[]{Surface.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f13089a, false, 7194, new Class[]{Surface.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f13091c.createVirtualDisplay(p, i2, i3, this.F.densityDpi, 16, surface, null, this.f13093e);
    }

    @RequiresApi(api = 21)
    public co(Room room, Activity activity, a aVar, boolean z2) {
        this.S = room;
        this.P = activity;
        this.D = aVar;
        this.E = z2;
        this.f13093e = new WeakHandler(this);
    }

    public static void a(String str, al.b bVar, String str2, String str3) {
        String str4;
        String str5 = str;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str5, bVar, null, str6}, null, f13089a, true, 7201, new Class[]{String.class, al.b.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str5, bVar, null, str6}, null, f13089a, true, 7201, new Class[]{String.class, al.b.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (str5.equals("android.permission.ACCESS_FINE_LOCATION")) {
            str4 = "system_position";
        } else if (str5.equals("android.permission.READ_PHONE_STATE")) {
            str4 = "call";
        } else if (str5.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
            str4 = "save";
        } else {
            str4 = null;
        }
        if (!TextUtils.isEmpty(str4)) {
            j jVar = new j();
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(null)) {
                jVar.d(null);
            }
            if (!TextUtils.isEmpty(str3)) {
                jVar.g(str6);
            }
            hashMap.put("popup_type", str4);
            com.bytedance.android.livesdk.j.a.a().a("system_popup", hashMap, jVar.b("video").f(bVar.getType()));
        }
    }
}
