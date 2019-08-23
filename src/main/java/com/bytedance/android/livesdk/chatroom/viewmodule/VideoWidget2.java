package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.LiveBroadcastFragment;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.dutygift.m;
import com.bytedance.android.livesdk.chatroom.dutygift.n;
import com.bytedance.android.livesdk.chatroom.event.s;
import com.bytedance.android.livesdk.chatroom.event.t;
import com.bytedance.android.livesdk.chatroom.interact.y;
import com.bytedance.android.livesdk.chatroom.interact.z;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.effect.LiveBeautyFragment;
import com.bytedance.android.livesdk.effect.k;
import com.bytedance.android.livesdk.j.c.e;
import com.bytedance.android.livesdk.j.c.k;
import com.bytedance.android.livesdk.live.model.Camera2AB;
import com.bytedance.android.livesdk.sticker.a.c;
import com.bytedance.android.livesdk.sticker.a.d;
import com.bytedance.android.livesdk.sticker.c.a;
import com.bytedance.android.livesdk.sticker.f;
import com.bytedance.android.livesdk.sticker.h;
import com.bytedance.android.livesdk.sticker.i;
import com.bytedance.android.livesdk.sticker.ui.LiveStickerComposerDialog;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.q;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.avframework.opengl.GlUtil;
import com.ss.render.EffectRender;
import com.ss.ugc.live.a.b;
import com.ss.ugc.live.a.d;
import com.ss.ugc.live.a.e;
import com.ss.ugc.live.a.j;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.microedition.khronos.egl.EGLContext;
import kotlin.jvm.internal.Intrinsics;
import org.aspectj.lang.a;

public class VideoWidget2 extends CaptureWidget2 implements Observer<KVData>, n, z, ak, LiveBeautyFragment.a, com.bytedance.android.livesdk.sticker.b, WeakHandler.IHandler, j {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f12879f = null;
    public static final String g = "VideoWidget2";
    public FrameLayout A;
    public FragmentManager B;
    public boolean C;
    public boolean D = false;
    com.bytedance.android.livesdk.sticker.a.b E = new com.bytedance.android.livesdk.sticker.a.b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12882a;

        public final int a() {
            if (PatchProxy.isSupport(new Object[0], this, f12882a, false, 7635, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f12882a, false, 7635, new Class[0], Integer.TYPE)).intValue();
            }
            VideoWidget2.this.k.a();
            return 1;
        }

        public final int a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f12882a, false, 7634, new Class[]{Boolean.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f12882a, false, 7634, new Class[]{Boolean.TYPE}, Integer.TYPE)).intValue();
            }
            VideoWidget2.this.k.a(z);
            return 1;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int a(java.lang.String[] r18) {
            /*
                r17 = this;
                r0 = r18
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r4 = f12882a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
                r7[r9] = r3
                java.lang.Class r8 = java.lang.Integer.TYPE
                r5 = 0
                r6 = 7632(0x1dd0, float:1.0695E-41)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x003b
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r12 = f12882a
                r13 = 0
                r14 = 7632(0x1dd0, float:1.0695E-41)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
                r15[r9] = r0
                java.lang.Class r16 = java.lang.Integer.TYPE
                r11 = r17
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                return r0
            L_0x003b:
                r2 = r17
                com.bytedance.android.livesdk.chatroom.viewmodule.VideoWidget2 r3 = com.bytedance.android.livesdk.chatroom.viewmodule.VideoWidget2.this
                com.ss.ugc.live.a.a.d r3 = r3.k
                r3.a((java.lang.String[]) r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.VideoWidget2.AnonymousClass10.a(java.lang.String[]):int");
        }

        public final int a(String str, boolean z) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f12882a, false, 7631, new Class[]{String.class, Boolean.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, f12882a, false, 7631, new Class[]{String.class, Boolean.TYPE}, Integer.TYPE)).intValue();
            }
            try {
                VideoWidget2.this.k.a(str2, z);
                return 1;
            } catch (FileNotFoundException e2) {
                com.bytedance.android.live.core.c.a.a(VideoWidget2.g, (Throwable) e2);
                return -1;
            }
        }

        public final int a(String str, String str2, float f2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4, Float.valueOf(f2)}, this, f12882a, false, 7633, new Class[]{String.class, String.class, Float.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{str3, str4, Float.valueOf(f2)}, this, f12882a, false, 7633, new Class[]{String.class, String.class, Float.TYPE}, Integer.TYPE)).intValue();
            }
            try {
                VideoWidget2.this.k.a(str3, str4, f2);
                return 1;
            } catch (FileNotFoundException e2) {
                com.bytedance.android.live.core.c.a.a(VideoWidget2.g, (Throwable) e2);
                return -1;
            }
        }
    };
    c.b F = new c.b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12891a;

        public final void a(boolean z, String str, com.bytedance.android.livesdk.sticker.b.a aVar) {
            String str2 = str;
            com.bytedance.android.livesdk.sticker.b.a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str2, aVar2}, this, f12891a, false, 7620, new Class[]{Boolean.TYPE, String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str2, aVar2}, this, f12891a, false, 7620, new Class[]{Boolean.TYPE, String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
                return;
            }
            if (com.bytedance.android.livesdk.sticker.c.a.f17261b.equals(str2)) {
                com.bytedance.android.livesdk.j.a.a().a("live_take_gesture_select", new com.bytedance.android.livesdk.j.c.j().b("live_take").f("click").a("live_take_detail"), new k(), new com.bytedance.android.livesdk.j.c.d().a(aVar2.f17252d), Room.class);
            }
            Map a2 = com.bytedance.android.livesdk.v.j.q().o().a();
            if (!a2.containsKey(com.bytedance.android.livesdk.sticker.c.a.f17262c) || ((Map) a2.get(com.bytedance.android.livesdk.sticker.c.a.f17262c)).size() <= 0) {
                VideoWidget2.this.r = false;
                VideoWidget2.this.dataCenter.lambda$put$1$DataCenter("cmd_sticker_is_selected", new f(com.bytedance.android.livesdk.sticker.c.a.f17262c, new com.bytedance.android.livesdk.sticker.b.a()));
                VideoWidget2.this.q.removeMessages(BaseLoginOrRegisterActivity.o);
                if (VideoWidget2.this.l != null) {
                    VideoWidget2.this.l.a(false);
                }
            } else {
                VideoWidget2.this.r = true;
                VideoWidget2.this.dataCenter.lambda$put$1$DataCenter("cmd_sticker_is_selected", new f(com.bytedance.android.livesdk.sticker.c.a.f17262c, (com.bytedance.android.livesdk.sticker.b.a) ((Map) a2.get(com.bytedance.android.livesdk.sticker.c.a.f17262c)).values().iterator().next()));
            }
            if (VideoWidget2.this.n == null || !VideoWidget2.this.n.isShowing()) {
                VideoWidget2.this.h();
            }
        }
    };
    c.a G = new c.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12893a;

        public final void a(String str, com.bytedance.android.livesdk.sticker.b.a aVar, String str2, float f2) {
            String str3 = str2;
            if (PatchProxy.isSupport(new Object[]{str, aVar, str3, Float.valueOf(f2)}, this, f12893a, false, 7621, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class, String.class, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, aVar, str3, Float.valueOf(f2)}, this, f12893a, false, 7621, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class, String.class, Float.TYPE}, Void.TYPE);
            } else if (!VideoWidget2.this.v.contains(str3)) {
                if (VideoWidget2.this.u.containsKey(str3)) {
                    if (f2 == 0.0f) {
                        VideoWidget2.this.q.removeCallbacks(VideoWidget2.this.u.remove(str3));
                    }
                } else if (f2 != 0.0f) {
                    ez ezVar = new ez(this, str3);
                    VideoWidget2.this.u.put(str3, ezVar);
                    VideoWidget2.this.q.postDelayed(ezVar, 30000);
                }
            }
        }
    };
    private i H;
    private LiveBroadcastFragment.b I;
    private com.bytedance.android.livesdkapi.depend.model.live.f J;
    private EffectRender.OnRefreshFaceDataListener K;
    private LinkCrossRoomDataHolder L;
    private String M = null;
    private com.ss.ugc.live.c.a.a N;
    private y O = new y() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12884a;

        /* renamed from: b  reason: collision with root package name */
        public com.bytedance.b.a.a.g.b f12885b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f12886c;

        /* renamed from: d  reason: collision with root package name */
        com.ss.ugc.live.a.i f12887d = new com.ss.ugc.live.a.i() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12889a;

            public final void a(EGLContext eGLContext, int i, int i2, int i3, int i4, long j, Bundle bundle) {
                long j2 = j;
                if (PatchProxy.isSupport(new Object[]{eGLContext, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), new Long(j2), bundle}, this, f12889a, false, 7639, new Class[]{EGLContext.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Long.TYPE, Bundle.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{eGLContext, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), new Long(j2), bundle}, this, f12889a, false, 7639, new Class[]{EGLContext.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Long.TYPE, Bundle.class}, Void.TYPE);
                    return;
                }
                if (AnonymousClass11.this.f12886c && AnonymousClass11.this.f12885b != null) {
                    AnonymousClass11.this.f12885b.a(eGLContext, null, i, i3, i4, j);
                }
            }
        };

        public final void a() {
        }

        public final void b() {
        }

        public final void c() {
        }

        public final void f() {
        }

        public final void d() {
            if (PatchProxy.isSupport(new Object[0], this, f12884a, false, 7636, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12884a, false, 7636, new Class[0], Void.TYPE);
                return;
            }
            this.f12886c = true;
            if (VideoWidget2.this.h != null) {
                VideoWidget2.this.h.a(this.f12887d);
            }
        }

        public final void e() {
            if (PatchProxy.isSupport(new Object[0], this, f12884a, false, 7637, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12884a, false, 7637, new Class[0], Void.TYPE);
                return;
            }
            if (VideoWidget2.this.h != null) {
                VideoWidget2.this.h.b(this.f12887d);
            }
            this.f12886c = false;
        }

        public final void a(com.bytedance.b.a.a.g.b bVar) {
            this.f12885b = bVar;
        }
    };
    public com.ss.ugc.live.a.a h;
    com.bytedance.android.livesdk.effect.f i;
    com.bytedance.android.livesdk.effect.a j;
    public com.ss.ugc.live.a.a.d k;
    public LiveBroadcastFragment.a l;
    public Dialog m;
    public Dialog n;
    public boolean o;
    public Room p;
    public WeakHandler q = new WeakHandler(this);
    public volatile boolean r;
    public long s;
    public List<Long> t = new ArrayList();
    public Map<String, Runnable> u = new HashMap();
    public List<String> v = new ArrayList();
    public Disposable w;
    public c x = new c(this, (byte) 0);
    public boolean y = false;
    public boolean z = false;

    class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12906a;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f12907d;

        /* renamed from: c  reason: collision with root package name */
        private View f12909c;

        public final void b(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12906a, false, 7644, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12906a, false, 7644, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        static {
            if (PatchProxy.isSupport(new Object[0], null, f12906a, true, 7643, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f12906a, true, 7643, new Class[0], Void.TYPE);
                return;
            }
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("VideoWidget2.java", a.class);
            f12907d = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.VideoWidget2$ToolbarGestureMagicBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 1083);
        }

        private a() {
        }

        public final void a(@NonNull com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f12906a, false, 7642, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f12906a, false, 7642, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
                return;
            }
            if ((aVar instanceof com.bytedance.android.livesdk.chatroom.viewmodule.a.a.a) && this.f12909c != null) {
                View view = this.f12909c;
                if (!((com.bytedance.android.livesdk.chatroom.viewmodule.a.a.a) aVar).f12946a) {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f12906a, false, 7641, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f12906a, false, 7641, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f12907d, this, this, view));
            if (VideoWidget2.this.n == null) {
                VideoWidget2.this.n = new com.bytedance.android.livesdk.sticker.ui.b(VideoWidget2.this.context, com.bytedance.android.livesdk.v.j.q().p().a(), VideoWidget2.this.dataCenter);
                VideoWidget2.this.n.setOnDismissListener(new DialogInterface.OnDismissListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f12910a;

                    public final void onDismiss(DialogInterface dialogInterface) {
                        String str;
                        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f12910a, false, 7645, new Class[]{DialogInterface.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f12910a, false, 7645, new Class[]{DialogInterface.class}, Void.TYPE);
                            return;
                        }
                        com.bytedance.android.livesdk.j.a a2 = com.bytedance.android.livesdk.j.a.a();
                        Object[] objArr = new Object[4];
                        objArr[0] = new com.bytedance.android.livesdk.j.c.j().a("live_take_detail").b("live_take");
                        if (((Boolean) com.bytedance.android.livesdk.w.b.ae.a()).booleanValue()) {
                            str = "on";
                        } else {
                            str = "off";
                        }
                        objArr[1] = new e(str);
                        objArr[2] = new k();
                        objArr[3] = Room.class;
                        a2.a("gesture_switch", objArr);
                        VideoWidget2.this.h();
                    }
                });
            }
            if (!VideoWidget2.this.n.isShowing()) {
                VideoWidget2.this.n.show();
                if (VideoWidget2.this.w != null && !VideoWidget2.this.w.isDisposed()) {
                    VideoWidget2.this.w.dispose();
                }
                com.bytedance.android.livesdk.j.a.a().a("anchor_more_function_click_gesture", new com.bytedance.android.livesdk.j.c.j().a("live_take_detail").b("live_take"), new k(), Room.class);
            }
        }

        /* synthetic */ a(VideoWidget2 videoWidget2, byte b2) {
            this();
        }

        public final void a(@NonNull View view, @NonNull DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12906a, false, 7640, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12906a, false, 7640, new Class[]{View.class, DataCenter.class}, Void.TYPE);
                return;
            }
            this.f12909c = view.findViewById(C0906R.id.cck);
            if (((Boolean) com.bytedance.android.livesdk.w.b.ac.a()).booleanValue()) {
                this.f12909c.setVisibility(0);
            }
        }
    }

    class b implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12912a;

        /* renamed from: e  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f12913e;

        /* renamed from: c  reason: collision with root package name */
        private boolean f12915c;

        /* renamed from: d  reason: collision with root package name */
        private long f12916d;

        public final void a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f12912a, false, 7650, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f12912a, false, 7650, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
            }
        }

        public final void b(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12912a, false, 7649, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12912a, false, 7649, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        static {
            if (PatchProxy.isSupport(new Object[0], null, f12912a, true, 7648, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f12912a, true, 7648, new Class[0], Void.TYPE);
                return;
            }
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("VideoWidget2.java", b.class);
            f12913e = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.VideoWidget2$ToolbarReverseCameraBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 1203);
        }

        private b() {
        }

        public void onClick(View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f12912a, false, 7647, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f12912a, false, 7647, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f12913e, this, this, view2));
            if (com.bytedance.android.live.core.utils.a.b.b()) {
                com.bytedance.android.live.uikit.d.a.a(ac.e(), (int) C0906R.string.cxg);
            }
            if (this.f12916d == 0) {
                this.f12916d = SystemClock.elapsedRealtime();
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime >= this.f12916d + 1500) {
                    this.f12916d = elapsedRealtime;
                } else {
                    return;
                }
            }
            this.f12915c = !this.f12915c;
            VideoWidget2.this.h.d();
            c cVar = VideoWidget2.this.x;
            boolean z = this.f12915c;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, cVar, c.f12917a, false, 7654, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                c cVar2 = cVar;
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, cVar2, c.f12917a, false, 7654, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else if (cVar.f12919b != null) {
                cVar.f12920c = z;
                if (!cVar.f12920c) {
                    VideoWidget2.this.o = false;
                }
                cVar.a(true);
            }
            if (VideoWidget2.this.C) {
                VideoWidget2.this.h.e();
            }
            com.bytedance.android.livesdk.w.b.g.b(Integer.valueOf(this.f12915c ? 1 : 0));
            com.bytedance.android.livesdk.j.f.a(VideoWidget2.this.getContext());
            com.bytedance.android.livesdk.j.a.a().a("pm_live_switch_camera_click", new com.bytedance.android.livesdk.j.c.j().b("live_take").f("click").a("live_take_detail"), new k());
        }

        /* synthetic */ b(VideoWidget2 videoWidget2, byte b2) {
            this();
        }

        public final void a(@NonNull View view, @NonNull DataCenter dataCenter) {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12912a, false, 7646, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12912a, false, 7646, new Class[]{View.class, DataCenter.class}, Void.TYPE);
                return;
            }
            if (((Integer) com.bytedance.android.livesdk.w.b.g.b()).intValue() == 1) {
                z = true;
            }
            this.f12915c = z;
        }
    }

    class c implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12917a;

        /* renamed from: f  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f12918f;

        /* renamed from: b  reason: collision with root package name */
        View f12919b;

        /* renamed from: c  reason: collision with root package name */
        boolean f12920c;

        /* renamed from: e  reason: collision with root package name */
        private View f12922e;

        public final void a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f12917a, false, 7658, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f12917a, false, 7658, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
            }
        }

        static {
            if (PatchProxy.isSupport(new Object[0], null, f12917a, true, 7657, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f12917a, true, 7657, new Class[0], Void.TYPE);
                return;
            }
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("VideoWidget2.java", c.class);
            f12918f = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.VideoWidget2$ToolbarReverseMirrorBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 1252);
        }

        private c() {
        }

        private void a(View... viewArr) {
            float f2;
            if (PatchProxy.isSupport(new Object[]{viewArr}, this, f12917a, false, 7656, new Class[]{View[].class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewArr}, this, f12917a, false, 7656, new Class[]{View[].class}, Void.TYPE);
                return;
            }
            for (int i = 0; i <= 0; i++) {
                View view = viewArr[0];
                float[] fArr = new float[2];
                float f3 = 1.0f;
                if (this.f12920c) {
                    f2 = 0.4f;
                } else {
                    f2 = 1.0f;
                }
                fArr[0] = f2;
                if (!this.f12920c) {
                    f3 = 0.4f;
                }
                fArr[1] = f3;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
                ofFloat.setDuration(100);
                ofFloat.start();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(boolean r10) {
            /*
                r9 = this;
                r7 = 1
                java.lang.Object[] r0 = new java.lang.Object[r7]
                java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
                r8 = 0
                r0[r8] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f12917a
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class r1 = java.lang.Boolean.TYPE
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 7655(0x1de7, float:1.0727E-41)
                r1 = r9
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0038
                java.lang.Object[] r0 = new java.lang.Object[r7]
                java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
                r0[r8] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f12917a
                r3 = 0
                r4 = 7655(0x1de7, float:1.0727E-41)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class r1 = java.lang.Boolean.TYPE
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0038:
                android.view.View r0 = r9.f12919b
                if (r0 == 0) goto L_0x0066
                com.bytedance.android.livesdk.chatroom.viewmodule.VideoWidget2 r0 = com.bytedance.android.livesdk.chatroom.viewmodule.VideoWidget2.this
                boolean r0 = r0.C
                r1 = 2130841537(0x7f020fc1, float:1.7288144E38)
                if (r0 == 0) goto L_0x004c
                boolean r0 = r9.f12920c
                if (r0 != 0) goto L_0x005b
                android.view.View r0 = r9.f12922e
                goto L_0x0058
            L_0x004c:
                android.view.View r0 = r9.f12922e
                com.bytedance.android.livesdk.chatroom.viewmodule.VideoWidget2 r2 = com.bytedance.android.livesdk.chatroom.viewmodule.VideoWidget2.this
                boolean r2 = r2.o
                if (r2 == 0) goto L_0x0055
                goto L_0x0058
            L_0x0055:
                r1 = 2130841538(0x7f020fc2, float:1.7288146E38)
            L_0x0058:
                r0.setBackgroundResource(r1)
            L_0x005b:
                if (r10 == 0) goto L_0x0066
                android.view.View[] r0 = new android.view.View[r7]
                android.view.View r1 = r9.f12922e
                r0[r8] = r1
                r9.a((android.view.View[]) r0)
            L_0x0066:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.VideoWidget2.c.a(boolean):void");
        }

        public void onClick(View view) {
            String str;
            String str2;
            String str3;
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f12917a, false, 7652, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f12917a, false, 7652, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f12918f, this, this, view2));
            if (this.f12920c) {
                VideoWidget2.this.o = !VideoWidget2.this.o;
                if (VideoWidget2.this.C) {
                    if (VideoWidget2.this.o) {
                        this.f12922e.setBackgroundResource(2130841538);
                    } else {
                        this.f12922e.setBackgroundResource(2130841537);
                    }
                }
                VideoWidget2.this.h.e();
                if (VideoWidget2.this.C) {
                    Context context = VideoWidget2.this.context;
                    if (VideoWidget2.this.o) {
                        str3 = VideoWidget2.this.context.getResources().getString(C0906R.string.dbu);
                    } else {
                        str3 = VideoWidget2.this.context.getResources().getString(C0906R.string.dbt);
                    }
                    com.bytedance.android.live.uikit.d.a.a(context, str3);
                } else {
                    Context context2 = VideoWidget2.this.context;
                    if (VideoWidget2.this.o) {
                        str2 = VideoWidget2.this.context.getResources().getString(C0906R.string.dbt);
                    } else {
                        str2 = VideoWidget2.this.context.getResources().getString(C0906R.string.dbu);
                    }
                    com.bytedance.android.live.uikit.d.a.a(context2, str2);
                }
                com.bytedance.android.livesdk.j.f a2 = com.bytedance.android.livesdk.j.f.a(VideoWidget2.this.context);
                if (VideoWidget2.this.o) {
                    str = "close_mirror_image";
                } else {
                    str = "open_mirror_image";
                }
                a2.a(str, "anchor", TTLiveSDKContext.getHostService().k().b(), VideoWidget2.this.p.getId());
                com.bytedance.android.livesdk.j.a.a().a("pm_live_mirror_click", new com.bytedance.android.livesdk.j.c.j().b("live_take").f("click").a("live_take_detail"), new k());
                a(false);
            }
        }

        /* synthetic */ c(VideoWidget2 videoWidget2, byte b2) {
            this();
        }

        public final void b(@NonNull View view, @NonNull DataCenter dataCenter) {
            this.f12919b = null;
        }

        public final void a(@NonNull View view, @NonNull DataCenter dataCenter) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12917a, false, 7651, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12917a, false, 7651, new Class[]{View.class, DataCenter.class}, Void.TYPE);
                return;
            }
            this.f12919b = view;
            this.f12922e = this.f12919b.findViewById(C0906R.id.aq8);
            if (((Integer) com.bytedance.android.livesdk.w.b.g.b()).intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f12917a, false, 7653, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f12917a, false, 7653, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else {
                this.f12920c = z;
                if (!this.f12920c) {
                    VideoWidget2.this.o = false;
                    a(true);
                } else {
                    a(false);
                }
            }
            if (VideoWidget2.this.C && !z && this.f12922e != null) {
                this.f12922e.setBackgroundResource(2130841537);
            }
        }
    }

    class d implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12923a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f12924c;

        public final void a(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12923a, false, 7661, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12923a, false, 7661, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        public final void a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f12923a, false, 7663, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f12923a, false, 7663, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
            }
        }

        public final void b(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12923a, false, 7662, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12923a, false, 7662, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        static {
            if (PatchProxy.isSupport(new Object[0], null, f12923a, true, 7660, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f12923a, true, 7660, new Class[0], Void.TYPE);
                return;
            }
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("VideoWidget2.java", d.class);
            f12924c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.VideoWidget2$ToolbarStickerBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 1125);
        }

        private d() {
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f12923a, false, 7659, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f12923a, false, 7659, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f12924c, this, this, view));
            com.bytedance.android.livesdk.sticker.c cVar = (com.bytedance.android.livesdk.sticker.c) com.bytedance.android.livesdk.v.j.q().k().a(com.bytedance.android.livesdk.sticker.c.class);
            if (cVar != null) {
                cVar.a((AppCompatActivity) VideoWidget2.this.getContext(), VideoWidget2.this.B, "livestreaming", VideoWidget2.this.A, new q() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f12926a;

                    public final void b(@NonNull com.bytedance.android.livesdkapi.depend.model.live.e eVar) {
                        if (PatchProxy.isSupport(new Object[]{eVar}, this, f12926a, false, 7666, new Class[]{com.bytedance.android.livesdkapi.depend.model.live.e.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{eVar}, this, f12926a, false, 7666, new Class[]{com.bytedance.android.livesdkapi.depend.model.live.e.class}, Void.TYPE);
                            return;
                        }
                        VideoWidget2.this.dataCenter.lambda$put$1$DataCenter("cmd_sticker_tip", "");
                        com.bytedance.android.livesdk.v.j.q().o().b(com.bytedance.android.livesdk.sticker.c.a.f17262c);
                    }

                    public final void a(@NonNull com.bytedance.android.livesdkapi.depend.model.live.e eVar) {
                        com.bytedance.android.livesdk.sticker.b.a aVar;
                        if (PatchProxy.isSupport(new Object[]{eVar}, this, f12926a, false, 7665, new Class[]{com.bytedance.android.livesdkapi.depend.model.live.e.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{eVar}, this, f12926a, false, 7665, new Class[]{com.bytedance.android.livesdkapi.depend.model.live.e.class}, Void.TYPE);
                            return;
                        }
                        VideoWidget2.this.dataCenter.lambda$put$1$DataCenter("cmd_sticker_tip", eVar.f18725f);
                        if (PatchProxy.isSupport(new Object[]{eVar}, this, f12926a, false, 7667, new Class[]{com.bytedance.android.livesdkapi.depend.model.live.e.class}, com.bytedance.android.livesdk.sticker.b.a.class)) {
                            aVar = (com.bytedance.android.livesdk.sticker.b.a) PatchProxy.accessDispatch(new Object[]{eVar}, this, f12926a, false, 7667, new Class[]{com.bytedance.android.livesdkapi.depend.model.live.e.class}, com.bytedance.android.livesdk.sticker.b.a.class);
                        } else {
                            aVar = new com.bytedance.android.livesdk.sticker.b.a();
                            if (eVar != null) {
                                aVar.f17252d = eVar.f18721b;
                                aVar.k = String.valueOf(eVar.f18721b);
                                aVar.f17253e = eVar.f18722c;
                                aVar.f17250b = eVar.f18723d;
                                aVar.f17251c = eVar.f18724e;
                                aVar.u = eVar.f18725f;
                                aVar.g = eVar.g;
                                aVar.r = eVar.h;
                                aVar.n = String.valueOf(eVar.f18721b);
                            }
                        }
                        com.bytedance.android.livesdk.v.j.q().o().b(com.bytedance.android.livesdk.sticker.c.a.f17262c);
                        com.bytedance.android.livesdk.v.j.q().o().a(com.bytedance.android.livesdk.sticker.c.a.f17262c, aVar);
                        VideoWidget2.this.dataCenter.lambda$put$1$DataCenter("cmd_sticker_is_selected", new f(com.bytedance.android.livesdk.sticker.c.a.f17262c, aVar));
                    }
                });
            } else {
                if (VideoWidget2.this.m == null) {
                    VideoWidget2.this.m = new LiveStickerComposerDialog(VideoWidget2.this.context, VideoWidget2.this.dataCenter, com.bytedance.android.livesdk.v.j.q().p().a());
                    VideoWidget2.this.m.setOnDismissListener(fb.f13265b);
                }
                if (!VideoWidget2.this.m.isShowing()) {
                    VideoWidget2.this.m.show();
                } else {
                    return;
                }
            }
            com.bytedance.android.livesdk.j.a.a().a("pm_live_sticker_click", VideoWidget2.this.a(new HashMap<>()), new com.bytedance.android.livesdk.j.c.j().b("live_take").f("click").a("live_take_detail"), new k());
        }

        /* synthetic */ d(VideoWidget2 videoWidget2, byte b2) {
            this();
        }
    }

    public final y b() {
        return this.O;
    }

    public final com.bytedance.android.livesdk.effect.f e() {
        return this.i;
    }

    public final com.bytedance.android.livesdk.effect.a f() {
        return this.j;
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f12879f, false, 7589, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f12879f, false, 7589, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        String c2 = this.i.c();
        if (this.I != null) {
            this.I.a(c2, z2);
        }
    }

    public final void a(com.bytedance.android.livesdk.sticker.b.a aVar, boolean z2) {
        com.bytedance.android.livesdk.sticker.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f12879f, false, 7594, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, Byte.valueOf(z2)}, this, f12879f, false, 7594, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.v.j.q().o().a("effect_gift", aVar2);
    }

    public final void a(String str, String str2, boolean z2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, (byte) 0}, this, f12879f, false, 7616, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, (byte) 0}, this, f12879f, false, 7616, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.k.a(str3, str4, false);
    }

    public final com.bytedance.android.livesdk.sticker.c.a a() {
        if (!PatchProxy.isSupport(new Object[0], this, f12879f, false, 7611, new Class[0], com.bytedance.android.livesdk.sticker.c.a.class)) {
            return com.bytedance.android.livesdk.v.j.q().p().a();
        }
        return (com.bytedance.android.livesdk.sticker.c.a) PatchProxy.accessDispatch(new Object[0], this, f12879f, false, 7611, new Class[0], com.bytedance.android.livesdk.sticker.c.a.class);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f12879f, false, 7588, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12879f, false, 7588, new Class[0], Void.TYPE);
            return;
        }
        if (this.H != null) {
            this.H.a();
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f12879f, false, 7595, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12879f, false, 7595, new Class[0], Void.TYPE);
            return;
        }
        if (this.L.r == LinkCrossRoomDataHolder.b.SHOW) {
            this.L.r = LinkCrossRoomDataHolder.b.HIDE;
        }
        com.bytedance.android.livesdk.v.j.q().o().b("effect_gift");
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f12879f, false, 7585, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12879f, false, 7585, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        this.h.b();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f12879f, false, 7584, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12879f, false, 7584, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.h.a();
        this.H.a();
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f12879f, false, 7599, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12879f, false, 7599, new Class[0], Void.TYPE);
            return;
        }
        if (this.w != null && !this.w.isDisposed()) {
            this.w.dispose();
        }
        this.w = Observable.timer(30, TimeUnit.SECONDS).subscribeOn(Schedulers.io()).compose(getAutoUnbindTransformer()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Long>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12903a;

            public final /* synthetic */ void accept(Object obj) throws Exception {
                Long l = (Long) obj;
                if (PatchProxy.isSupport(new Object[]{l}, this, f12903a, false, 7630, new Class[]{Long.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{l}, this, f12903a, false, 7630, new Class[]{Long.class}, Void.TYPE);
                    return;
                }
                VideoWidget2.this.y = true;
                for (com.bytedance.android.livesdk.sticker.b.a aVar : com.bytedance.android.livesdk.v.j.q().o().a(com.bytedance.android.livesdk.sticker.c.a.f17261b)) {
                    if (!VideoWidget2.this.t.contains(Long.valueOf(aVar.f17252d))) {
                        VideoWidget2.this.t.add(Long.valueOf(aVar.f17252d));
                        com.bytedance.android.livesdk.j.a.a().a("live_take_gesture_effective_use", new com.bytedance.android.livesdk.j.c.j().b("live_take").f("other").a("live_take_detail"), new k(), new com.bytedance.android.livesdk.j.c.d().a(aVar.f17252d), Room.class);
                    }
                }
            }
        }, new Consumer<Throwable>() {
            public final /* bridge */ /* synthetic */ void accept(Object obj) throws Exception {
            }
        });
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f12879f, false, 7586, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12879f, false, 7586, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.L.removeObserver(this);
        com.bytedance.android.livesdk.w.b.ah.a(0);
        this.h.c();
        this.h.b(this.K);
        this.h.f78586c = null;
        if (this.i != null) {
            this.i.d();
        }
        i iVar = this.H;
        if (PatchProxy.isSupport(new Object[0], iVar, i.f17285a, false, 13376, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], iVar, i.f17285a, false, 13376, new Class[0], Void.TYPE);
        } else {
            iVar.f17287c.removeCallbacksAndMessages(null);
            ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).removeAnimationEngine(com.bytedance.android.live.gift.b.STICKER_GIFT);
        }
        GlUtil.nativeDetachThreadToOpenGl();
        this.q.removeCallbacksAndMessages(null);
    }

    public final void c() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f12879f, false, 7587, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12879f, false, 7587, new Class[0], Void.TYPE);
            return;
        }
        super.c();
        if (this.w != null && !this.w.isDisposed()) {
            this.w.dispose();
        }
        for (Runnable removeCallbacks : this.u.values()) {
            this.q.removeCallbacks(removeCallbacks);
        }
        HashMap hashMap = new HashMap();
        if (this.y) {
            str = "use";
        } else {
            str = "unused";
        }
        hashMap.put("use_status", str);
        com.bytedance.android.livesdk.j.a.a().a("pm_live_gesture_use", hashMap, new com.bytedance.android.livesdk.j.c.j().b("live_take").f("other").a("live_take_detail"), new k(), Room.class);
        HashMap hashMap2 = new HashMap();
        if (this.z) {
            str2 = "use";
        } else {
            str2 = "unused";
        }
        hashMap2.put("use_status", str2);
        com.bytedance.android.livesdk.j.a.a().a("livesdk_live_beauty_use", hashMap2, new com.bytedance.android.livesdk.j.c.j().a("anchor_live_ending"), Room.class);
        com.bytedance.android.livesdk.v.j.q().p().c();
        com.bytedance.android.livesdk.v.j.q().o().b(this.F);
        com.bytedance.android.livesdk.v.j.q().o().b(this.G);
        com.bytedance.android.livesdk.v.j.q().o().b();
        if (this.m != null) {
            fc.a(this.m);
            this.m = null;
        }
        if (this.n != null) {
            fc.a(this.n);
            this.n = null;
        }
    }

    public void onCreate() {
        boolean z2;
        int i2;
        boolean z3;
        if (PatchProxy.isSupport(new Object[0], this, f12879f, false, 7581, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12879f, false, 7581, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        a(t.class);
        a(s.class);
        this.p = (Room) this.dataCenter.get("data_room");
        int i3 = 1;
        if (!com.bytedance.android.live.uikit.a.a.f() || 3 != ((Integer) this.dataCenter.get("data_xt_broadcast_type", -1)).intValue()) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.C = z2;
        if (PatchProxy.isSupport(new Object[0], this, f12879f, false, 7582, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12879f, false, 7582, new Class[0], Void.TYPE);
        } else {
            if (((Integer) com.bytedance.android.livesdk.w.b.g.b()).intValue() == 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            String modelFilePath = com.bytedance.android.livesdk.s.INST.getModelFilePath();
            d.a a2 = new d.a(this.context).a(modelFilePath).a(i2).a(this.J.g(), this.J.h());
            a2.f78612f = this;
            if (((Integer) LiveSettingKeys.USE_NEW_RENDER_CHAIN.a()).intValue() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            d.a a3 = a2.a(z3).a(com.bytedance.android.livesdk.s.INST.getResourceFinder(getContext()));
            if (((Camera2AB) LiveConfigSettingKeys.CAMERA_AB_SETTING_KEY.a()).getCameraType() == 2) {
                i3 = 2;
            }
            com.ss.ugc.live.a.d a4 = a3.b(i3).a();
            if (((Integer) LiveConfigSettingKeys.LIVE_USE_LIVE_CORE.a()).intValue() == 0) {
                this.h = new com.ss.ugc.live.a.b(this.f12384e, a4, new b.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f12895a;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f12895a, false, 7623, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f12895a, false, 7623, new Class[0], Void.TYPE);
                            return;
                        }
                        GlUtil.nativeAttachThreadToOpenGl();
                    }

                    public final void b() {
                        if (PatchProxy.isSupport(new Object[0], this, f12895a, false, 7624, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f12895a, false, 7624, new Class[0], Void.TYPE);
                            return;
                        }
                        GlUtil.nativeDetachThreadToOpenGl();
                    }
                });
            } else {
                this.h = new com.ss.ugc.live.a.c(this.f12384e, (com.ss.ugc.live.c.a.c) this.N);
            }
            this.h.a(this.f12383d);
            this.h.a(6);
            this.K = new EffectRender.OnRefreshFaceDataListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f12897a;

                public final void onRefreshFaceData(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f12897a, false, 7625, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f12897a, false, 7625, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (VideoWidget2.this.r && System.currentTimeMillis() - VideoWidget2.this.s > 100) {
                        VideoWidget2.this.s = System.currentTimeMillis();
                        VideoWidget2.this.q.removeMessages(BaseLoginOrRegisterActivity.o);
                        Message obtain = Message.obtain();
                        obtain.what = BaseLoginOrRegisterActivity.o;
                        obtain.obj = Integer.valueOf(i);
                        VideoWidget2.this.q.sendMessage(obtain);
                    }
                }
            };
            this.h.a(this.K);
            this.h.a((e.a) new e.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f12899a;

                /* access modifiers changed from: package-private */
                public final /* synthetic */ void a() {
                    VideoWidget2 videoWidget2 = VideoWidget2.this;
                    if (PatchProxy.isSupport(new Object[0], videoWidget2, VideoWidget2.f12879f, false, 7605, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], videoWidget2, VideoWidget2.f12879f, false, 7605, new Class[0], Void.TYPE);
                        return;
                    }
                    videoWidget2.D = true;
                    if (videoWidget2.k == null) {
                        videoWidget2.k = new com.ss.ugc.live.a.a.d();
                        videoWidget2.h.a((com.ss.ugc.live.a.a.a) videoWidget2.k);
                    }
                    com.ss.ugc.live.a.a.d dVar = videoWidget2.k;
                    int intValue = ((Integer) LiveConfigSettingKeys.LIVE_USER_NEW_COMPOSER_MODEL.a()).intValue();
                    if (intValue < 0) {
                        throw new IllegalStateException("mode is " + intValue + "order type is 0");
                    } else if (dVar.f78587a != null) {
                        dVar.f78587a.a(intValue, 0);
                        com.bytedance.android.livesdk.v.j.q().o().a(videoWidget2.F);
                        com.bytedance.android.livesdk.v.j.q().o().a(videoWidget2.G);
                        if (PatchProxy.isSupport(new Object[0], videoWidget2, VideoWidget2.f12879f, false, 7604, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], videoWidget2, VideoWidget2.f12879f, false, 7604, new Class[0], Void.TYPE);
                        } else {
                            com.bytedance.android.livesdk.sticker.a.c o = com.bytedance.android.livesdk.v.j.q().o();
                            d.a aVar = new d.a();
                            aVar.f17239c = Arrays.asList(new String[]{com.bytedance.android.livesdk.sticker.c.a.f17261b, com.bytedance.android.livesdk.sticker.c.a.f17264e, "beauty"});
                            aVar.f17240d = Collections.singletonList("effect_gift");
                            o.a(aVar.a(videoWidget2.E).a());
                        }
                        com.bytedance.android.livesdk.v.j.q().p().a().a(com.bytedance.android.livesdk.sticker.c.a.f17261b);
                        com.bytedance.android.livesdk.v.j.q().p().a().a(com.bytedance.android.livesdk.sticker.c.a.f17262c);
                        if (((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_SMALL_ITEM_BEAUTY.a()).booleanValue()) {
                            com.bytedance.android.livesdk.effect.k b2 = com.bytedance.android.livesdk.v.j.q().p().b();
                            FragmentActivity fragmentActivity = (FragmentActivity) videoWidget2.context;
                            if (PatchProxy.isSupport(new Object[]{fragmentActivity}, b2, com.bytedance.android.livesdk.effect.k.f13798a, false, 8206, new Class[]{FragmentActivity.class}, Void.TYPE)) {
                                com.bytedance.android.livesdk.effect.k kVar = b2;
                                PatchProxy.accessDispatch(new Object[]{fragmentActivity}, kVar, com.bytedance.android.livesdk.effect.k.f13798a, false, 8206, new Class[]{FragmentActivity.class}, Void.TYPE);
                            } else {
                                if (PatchProxy.isSupport(new Object[]{fragmentActivity, null}, b2, com.bytedance.android.livesdk.effect.k.f13798a, false, 8205, new Class[]{FragmentActivity.class, k.c.class}, Void.TYPE)) {
                                    com.bytedance.android.livesdk.effect.k kVar2 = b2;
                                    PatchProxy.accessDispatch(new Object[]{fragmentActivity, null}, kVar2, com.bytedance.android.livesdk.effect.k.f13798a, false, 8205, new Class[]{FragmentActivity.class, k.c.class}, Void.TYPE);
                                } else {
                                    Intrinsics.checkParameterIsNotNull(fragmentActivity, PushConstants.INTENT_ACTIVITY_NAME);
                                    com.bytedance.android.livesdk.effect.b p = com.bytedance.android.livesdk.v.j.q().p();
                                    Intrinsics.checkExpressionValueIsNotNull(p, "LiveInternalService.inst().liveEffectService()");
                                    p.a().a(com.bytedance.android.livesdk.sticker.c.a.f17264e, (a.b) new k.e(b2, null, fragmentActivity));
                                }
                            }
                            com.bytedance.android.livesdk.v.j.q().p().a().a(com.bytedance.android.livesdk.sticker.c.a.f17264e);
                        } else if (videoWidget2.j == null) {
                            videoWidget2.j = new com.bytedance.android.livesdk.effect.c();
                        }
                        if (videoWidget2.i == null) {
                            videoWidget2.i = new com.bytedance.android.livesdk.effect.f(videoWidget2.h);
                            if (videoWidget2.i.a() > 0) {
                                if (PatchProxy.isSupport(new Object[0], videoWidget2, VideoWidget2.f12879f, false, 7601, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], videoWidget2, VideoWidget2.f12879f, false, 7601, new Class[0], Void.TYPE);
                                } else {
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("filter_id", String.valueOf(videoWidget2.i.a()));
                                    com.bytedance.android.livesdk.j.a.a().a("live_take_filter_select", videoWidget2.a(hashMap), new com.bytedance.android.livesdk.j.c.j().b("live_take").a("live_take_detail").g("click").f("click"));
                                }
                                videoWidget2.b(false);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Effect is not bind");
                    }
                }

                public final void b(int i, int i2, String str) {
                    if (PatchProxy.isSupport(new Object[]{1, Integer.valueOf(i2), str}, this, f12899a, false, 7627, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{1, Integer.valueOf(i2), str}, this, f12899a, false, 7627, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                        return;
                    }
                    if (!VideoWidget2.this.D) {
                        VideoWidget2.this.q.post(new fa(this));
                    }
                }

                public final void a(int i, int i2, String str) {
                    String str2 = str;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f12899a, false, 7626, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f12899a, false, 7626, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                        return;
                    }
                    String str3 = VideoWidget2.g;
                    com.bytedance.android.live.core.c.a.c(str3, "CameraState onError status: " + i + ", ret: " + i2 + ", msg: " + str2);
                }
            });
            if (com.bytedance.android.live.core.utils.a.b.b() && com.bytedance.android.live.core.utils.a.b.a() == 0) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.contentView.getLayoutParams();
                layoutParams.width = (int) (((float) ac.b()) * 0.5625f);
                layoutParams.gravity = 17;
            }
            if (com.bytedance.android.live.uikit.a.a.d()) {
                this.h.f78586c = new ex(this);
            }
        }
        this.H = new i(this);
        this.dataCenter.lambda$put$1$DataCenter("data_sticker_message_manager", this.H);
        this.L = LinkCrossRoomDataHolder.a();
        this.L.observe("data_pk_state", this);
        com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d b2 = com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j.b();
        b2.a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f.GESTURE_MAGIC, (d.a) new a(this, (byte) 0));
        b2.a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f.STICKER, (d.a) new d(this, (byte) 0));
        b2.a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f.REVERSE_CAMERA, (d.a) new b(this, (byte) 0));
        b2.a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f.REVERSE_MIRROR, (d.a) this.x);
    }

    public final void a(LiveBroadcastFragment.a aVar) {
        this.l = aVar;
    }

    public final void a(LiveBroadcastFragment.b bVar) {
        this.I = bVar;
    }

    public final void b(m mVar) {
        if (PatchProxy.isSupport(new Object[]{mVar}, this, f12879f, false, 7614, new Class[]{m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mVar}, this, f12879f, false, 7614, new Class[]{m.class}, Void.TYPE);
            return;
        }
        c(mVar);
    }

    private <T> void a(Class<T> cls) {
        Class<T> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{cls2}, this, f12879f, false, 7580, new Class[]{Class.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls2}, this, f12879f, false, 7580, new Class[]{Class.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.u.a.a().a(cls2).compose(getAutoUnbindTransformer()).subscribe((Consumer<? super T>) new Consumer<T>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12880a;

            public final void accept(T t) throws Exception {
                if (PatchProxy.isSupport(new Object[]{t}, this, f12880a, false, 7619, new Class[]{Object.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{t}, this, f12880a, false, 7619, new Class[]{Object.class}, Void.TYPE);
                } else if (t instanceof s) {
                    VideoWidget2.this.onEvent((s) t);
                } else {
                    if (t instanceof t) {
                        VideoWidget2.this.onEvent((t) t);
                    }
                }
            }
        });
    }

    private void c(m mVar) {
        m mVar2 = mVar;
        if (PatchProxy.isSupport(new Object[]{mVar2}, this, f12879f, false, 7583, new Class[]{m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mVar2}, this, f12879f, false, 7583, new Class[]{m.class}, Void.TYPE);
            return;
        }
        this.h.a(mVar2.f10005a, mVar2.f10006b, mVar2.f10007c, mVar2.f10008d);
    }

    public final void b(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f12879f, false, 7591, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f12879f, false, 7591, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (this.j != null) {
            this.j.a(f2);
        }
    }

    public final void d(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f12879f, false, 7593, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f12879f, false, 7593, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (this.j != null) {
            this.j.c(f2);
        }
    }

    public final HashMap<String, String> a(HashMap<String, String> hashMap) {
        long j2;
        if (PatchProxy.isSupport(new Object[]{hashMap}, this, f12879f, false, 7610, new Class[]{HashMap.class}, HashMap.class)) {
            return (HashMap) PatchProxy.accessDispatch(new Object[]{hashMap}, this, f12879f, false, 7610, new Class[]{HashMap.class}, HashMap.class);
        }
        if (this.p != null) {
            j2 = this.p.getId();
        } else {
            j2 = 0;
        }
        hashMap.put("room_id", String.valueOf(j2));
        return hashMap;
    }

    public final void b(com.bytedance.android.livesdk.sticker.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f12879f, false, 7615, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f12879f, false, 7615, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
            return;
        }
        this.dataCenter.lambda$put$1$DataCenter("cmd_duty_gift_changed", Boolean.FALSE);
        this.h.g();
        com.bytedance.android.livesdk.v.j.q().o().b("livegame");
    }

    public final void c(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f12879f, false, 7592, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f12879f, false, 7592, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (this.j != null) {
            this.j.b(f2);
        }
    }

    public void handleMsg(Message message) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{message}, this, f12879f, false, 7608, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f12879f, false, 7608, new Class[]{Message.class}, Void.TYPE);
        } else if (isViewValid()) {
            if (message.what == 100) {
                String str = (String) message.obj;
                String string = message.getData().getString("action_type");
                if (PatchProxy.isSupport(new Object[]{str, string}, this, f12879f, false, 7609, new Class[]{String.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, string}, this, f12879f, false, 7609, new Class[]{String.class, String.class}, Void.TYPE);
                } else {
                    HashMap hashMap = new HashMap();
                    if (str == null) {
                        str = "";
                    }
                    hashMap.put("filter_id", str);
                    com.bytedance.android.livesdk.j.a.a().a("live_take_filter_effective_use", a(hashMap), new com.bytedance.android.livesdk.j.c.j().b("live_take").a("live_take_detail").g(string).f("click"));
                }
                this.dataCenter.lambda$put$1$DataCenter("data_has_filter_effective", Boolean.TRUE);
                return;
            }
            if (message.what == 101 && this.l != null) {
                LiveBroadcastFragment.a aVar = this.l;
                if (!(message.obj instanceof Integer) || ((Integer) message.obj).intValue() != 0) {
                    z2 = false;
                }
                aVar.a(z2);
            }
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        KVData kVData = (KVData) obj;
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f12879f, false, 7579, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f12879f, false, 7579, new Class[]{KVData.class}, Void.TYPE);
        } else if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c2 = 65535;
            if (key.hashCode() == 1505611330 && key.equals("data_pk_state")) {
                c2 = 0;
            }
            if (c2 == 0 && ((LinkCrossRoomDataHolder.d) kVData.getData()) == LinkCrossRoomDataHolder.d.PENAL && ((LinkCrossRoomDataHolder.c) this.L.get("data_pk_result")) == LinkCrossRoomDataHolder.c.RIGHT_WON) {
                if (this.m != null && this.m.isShowing()) {
                    fc.a(this.m);
                }
                if (this.n != null && this.n.isShowing()) {
                    fc.a(this.n);
                }
            }
        }
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f12879f, false, 7590, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f12879f, false, 7590, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (this.j != null) {
            this.j.d(f2);
        }
    }

    public void onEvent(s sVar) {
        String str;
        String str2;
        s sVar2 = sVar;
        if (PatchProxy.isSupport(new Object[]{sVar2}, this, f12879f, false, 7597, new Class[]{s.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sVar2}, this, f12879f, false, 7597, new Class[]{s.class}, Void.TYPE);
            return;
        }
        int i2 = sVar2.f10195a;
        if (i2 != 2) {
            if (i2 != 28) {
                switch (i2) {
                    case 21:
                        if (this.L.r == LinkCrossRoomDataHolder.b.SHOW) {
                            ai.a((int) C0906R.string.d99);
                            return;
                        }
                        if (this.m == null) {
                            this.m = new LiveStickerComposerDialog(this.context, this.dataCenter, com.bytedance.android.livesdk.v.j.q().p().a());
                            this.m.setOnDismissListener(ey.f13256b);
                        }
                        if (!this.m.isShowing()) {
                            this.m.show();
                            return;
                        }
                        return;
                    case 22:
                        this.o = !this.o;
                        this.h.e();
                        if (!this.C) {
                            Context context = this.context;
                            if (this.o) {
                                str2 = this.context.getResources().getString(C0906R.string.dbt);
                            } else {
                                str2 = this.context.getResources().getString(C0906R.string.dbu);
                            }
                            com.bytedance.android.live.uikit.d.a.a(context, str2);
                        }
                        com.bytedance.android.livesdk.j.f a2 = com.bytedance.android.livesdk.j.f.a(this.context);
                        if (this.o) {
                            str = "close_mirror_image";
                        } else {
                            str = "open_mirror_image";
                        }
                        a2.a(str, "anchor", TTLiveSDKContext.getHostService().k().b(), this.p.getId());
                        return;
                }
            } else if (this.L.r == LinkCrossRoomDataHolder.b.SHOW) {
                ai.a((int) C0906R.string.d98);
                return;
            } else {
                if (this.n == null) {
                    this.n = new com.bytedance.android.livesdk.sticker.ui.b(this.context, com.bytedance.android.livesdk.v.j.q().p().a(), this.dataCenter);
                    this.n.setOnDismissListener(new DialogInterface.OnDismissListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f12901a;

                        public final void onDismiss(DialogInterface dialogInterface) {
                            String str;
                            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f12901a, false, 7629, new Class[]{DialogInterface.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f12901a, false, 7629, new Class[]{DialogInterface.class}, Void.TYPE);
                                return;
                            }
                            com.bytedance.android.livesdk.j.a a2 = com.bytedance.android.livesdk.j.a.a();
                            Object[] objArr = new Object[4];
                            objArr[0] = new com.bytedance.android.livesdk.j.c.j().a("live_take_detail").b("live_take");
                            if (((Boolean) com.bytedance.android.livesdk.w.b.ae.a()).booleanValue()) {
                                str = "on";
                            } else {
                                str = "off";
                            }
                            objArr[1] = new com.bytedance.android.livesdk.j.c.e(str);
                            objArr[2] = new com.bytedance.android.livesdk.j.c.k();
                            objArr[3] = Room.class;
                            a2.a("gesture_switch", objArr);
                            VideoWidget2.this.h();
                        }
                    });
                }
                if (!this.n.isShowing()) {
                    this.n.show();
                    if (this.w != null && !this.w.isDisposed()) {
                        this.w.dispose();
                    }
                    com.bytedance.android.livesdk.j.a.a().a("anchor_more_function_click_gesture", new com.bytedance.android.livesdk.j.c.j().a("live_take_detail").b("live_take"), new com.bytedance.android.livesdk.j.c.k(), Room.class);
                } else {
                    return;
                }
            }
            return;
        }
        this.h.d();
        this.o = false;
    }

    public final void a(m mVar) {
        if (PatchProxy.isSupport(new Object[]{mVar}, this, f12879f, false, 7613, new Class[]{m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mVar}, this, f12879f, false, 7613, new Class[]{m.class}, Void.TYPE);
            return;
        }
        this.dataCenter.lambda$put$1$DataCenter("cmd_duty_gift_changed", Boolean.TRUE);
        c(mVar);
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z2) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f12879f, false, 7600, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f12879f, false, 7600, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.q.removeMessages(100);
        if (this.i.a() != 0) {
            Message message = new Message();
            message.what = 100;
            message.obj = this.i.b();
            Bundle bundle = new Bundle();
            if (z2) {
                str = "click";
            } else {
                str = "draw";
            }
            bundle.putString("action_type", str);
            message.setData(bundle);
            this.q.sendMessageDelayed(message, ((Long) LiveSettingKeys.LIVE_FILTER_EFFECTIVELY_USE_TIME.a()).longValue() * 1000);
        }
    }

    public void onEvent(t tVar) {
        if (PatchProxy.isSupport(new Object[]{tVar}, this, f12879f, false, 7598, new Class[]{t.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tVar}, this, f12879f, false, 7598, new Class[]{t.class}, Void.TYPE);
            return;
        }
        if (tVar.f10198a == 1) {
            this.i.b("live_take_detail", a(new HashMap<>()));
            a(true);
            b(false);
        } else if (tVar.f10198a == 2) {
            this.i.a("live_take_detail", a(new HashMap<>()));
            a(false);
            b(false);
        } else if (tVar.f10198a == 3) {
            b(true);
            return;
        }
        float a2 = com.bytedance.android.livesdk.effect.f.a(com.bytedance.android.livesdk.effect.j.a().f13785b, this.i.a());
        if (((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_SMALL_ITEM_BEAUTY.a()).booleanValue()) {
            if (!Lists.isEmpty(com.bytedance.android.livesdk.effect.j.a().f13785b) && this.i.a() >= 0 && this.i.a() < com.bytedance.android.livesdk.effect.j.a().f13785b.size()) {
                com.bytedance.android.livesdk.sticker.b.a b2 = com.bytedance.android.livesdk.v.j.q().p().a().b(h.a("beautyTag", com.bytedance.android.livesdk.effect.j.a().f13785b.get(this.i.a())));
                if (!(b2 == null || b2.h == null)) {
                    com.bytedance.android.livesdk.sticker.a.c o2 = com.bytedance.android.livesdk.v.j.q().o();
                    o2.a(com.bytedance.android.livesdk.sticker.c.a.f17264e, b2);
                    Float c2 = o2.c(b2.h.f17256b);
                    if (c2 == null) {
                        c2 = Float.valueOf(com.bytedance.android.livesdk.effect.k.a(b2, b2.h.f17255a));
                    }
                    int i2 = (int) a2;
                    if (c2.floatValue() > com.bytedance.android.livesdk.effect.k.a(b2, i2)) {
                        o2.a(b2.h.f17256b, com.bytedance.android.livesdk.effect.k.a(b2, i2));
                    }
                }
            }
        } else if (this.j.f13710e > (((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13829a.f13834a * a2) / 100.0f) {
            this.j.d(a2 / 100.0f);
        }
        com.bytedance.android.livesdk.effect.f.a(this.p.getId());
    }

    public final void a(com.bytedance.android.livesdk.sticker.b.a aVar) {
        com.bytedance.android.livesdk.sticker.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f12879f, false, 7612, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f12879f, false, 7612, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
            return;
        }
        this.h.f();
        com.bytedance.android.livesdk.v.j.q().o().a("livegame", aVar2);
    }

    public VideoWidget2(com.ss.ugc.live.a.i iVar, com.bytedance.android.livesdkapi.depend.model.live.f fVar, com.ss.ugc.live.c.a.a aVar) {
        super(iVar);
        this.J = fVar;
        this.N = aVar;
    }

    public final void b(String str, String str2, boolean z2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f12879f, false, 7596, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, Byte.valueOf(z2)}, this, f12879f, false, 7596, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{str3, str4, Byte.valueOf(z2)}, this, f12879f, false, 7602, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, Byte.valueOf(z2)}, this, f12879f, false, 7602, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.k.a(str3, str4, z2);
    }
}
