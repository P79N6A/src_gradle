package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.view.ViewGroup;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdkapi.depend.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.ugc.live.barrage.view.BarrageLayout;
import java.util.Arrays;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0016J\b\u0010\u001d\u001a\u00020\u0015H\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0016R\u001a\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tX\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/bytedance/android/livesdk/widget/BarrageLauncher;", "Lcom/bytedance/android/livesdkapi/depend/live/IBarrageLauncher;", "Lcom/bytedance/android/livesdkapi/depend/handler/WeakHandler$IHandler;", "mContext", "Landroid/content/Context;", "mContainer", "Landroid/view/ViewGroup;", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "mBitmaps", "", "Landroid/graphics/Bitmap;", "[Landroid/graphics/Bitmap;", "mDiggController", "Lcom/bytedance/android/livesdk/chatroom/barrage/controller/DiggController;", "mDrawables", "Landroid/content/res/TypedArray;", "mHandler", "Lcom/bytedance/android/livesdkapi/depend/handler/WeakHandler;", "random", "Ljava/util/Random;", "handleMsg", "", "msg", "Landroid/os/Message;", "initView", "isRecycled", "", "onLaunch", "release", "start", "stop", "Companion", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class b implements a.C0132a, com.bytedance.android.livesdkapi.depend.d.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18451a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f18452b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private TypedArray f18453c;

    /* renamed from: d  reason: collision with root package name */
    private Bitmap[] f18454d;

    /* renamed from: e  reason: collision with root package name */
    private final Random f18455e = new Random();

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.android.livesdk.chatroom.a.b.a f18456f;
    private final com.bytedance.android.livesdkapi.depend.c.a g = new com.bytedance.android.livesdkapi.depend.c.a(this);
    private final Context h;
    private final ViewGroup i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/android/livesdk/widget/BarrageLauncher$Companion;", "", "()V", "DIGG_DURATION", "", "DIGG_HEIGHT", "DIGG_MAX_SIZE", "DIGG_PADDING_LEFT", "DIGG_PADDING_TOP", "DIGG_PATH_SIZE", "LAUNCH_DURATION", "", "MSG_LAUNCH", "MSG_REPEAT", "TAG", "", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f18451a, false, 14309, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f18451a, false, 14309, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            TypedArray typedArray = this.f18453c;
            if (typedArray != null) {
                typedArray.length();
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f18451a, false, 14304, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18451a, false, 14304, new Class[0], Void.TYPE);
            return;
        }
        this.g.removeMessages(12);
        this.g.removeMessages(13);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f18451a, false, 14303, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18451a, false, 14303, new Class[0], Void.TYPE);
            return;
        }
        int nextInt = this.f18455e.nextInt(6) + 5;
        long[] jArr = new long[nextInt];
        for (int i2 = 0; i2 < nextInt; i2++) {
            jArr[i2] = (long) this.f18455e.nextInt(PushConstants.WORK_RECEIVER_EVENTCORE_ERROR);
            this.g.sendEmptyMessageDelayed(13, jArr[i2]);
        }
        this.g.sendEmptyMessageDelayed(12, 3000);
        StringBuilder sb = new StringBuilder("Barrage count: ");
        sb.append(nextInt);
        sb.append(", at times: ");
        Intrinsics.checkExpressionValueIsNotNull(Arrays.toString(jArr), "java.util.Arrays.toString(this)");
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f18451a, false, 14305, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18451a, false, 14305, new Class[0], Void.TYPE);
            return;
        }
        b();
        Bitmap[] bitmapArr = this.f18454d;
        if (bitmapArr != null) {
            for (Bitmap bitmap : bitmapArr) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        }
        TypedArray typedArray = this.f18453c;
        if (typedArray != null) {
            typedArray.recycle();
        }
    }

    private final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f18451a, false, 14307, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18451a, false, 14307, new Class[0], Void.TYPE);
        } else if (this.h != null && this.i != null) {
            BarrageLayout barrageLayout = new BarrageLayout(this.h, null, 0, 6, null);
            barrageLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.i.addView(barrageLayout);
            this.f18456f = new com.bytedance.android.livesdk.chatroom.a.b.a(barrageLayout, 1400);
            barrageLayout.a(this.f18456f, barrageLayout.f78710a.size());
            for (int i2 = 0; i2 < 10; i2++) {
                Path path = new Path();
                path.moveTo((float) ac.a(50.0f), (float) ac.a(220.0f));
                float f2 = (float) (((i2 - 5) * 6) + 50);
                path.quadTo((float) ac.a(f2), (float) ac.a(220.0f), (float) ac.a(f2), (float) ac.a(40.0f));
                com.bytedance.android.livesdk.chatroom.a.b.a aVar = this.f18456f;
                if (aVar != null) {
                    aVar.a(path);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        if (r0 > 0) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.NotNull android.os.Message r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f18451a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.os.Message> r1 = android.os.Message.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 14306(0x37e2, float:2.0047E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f18451a
            r3 = 0
            r4 = 14306(0x37e2, float:2.0047E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.os.Message> r1 = android.os.Message.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            java.lang.String r0 = "msg"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            int r0 = r10.what
            switch(r0) {
                case 12: goto L_0x00d2;
                case 13: goto L_0x003c;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x00d6
        L_0x003c:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f18451a
            r3 = 0
            r4 = 14308(0x37e4, float:2.005E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x005e
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f18451a
            r3 = 0
            r4 = 14308(0x37e4, float:2.005E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x005e:
            boolean r0 = r9.e()
            if (r0 != 0) goto L_0x0070
            android.content.res.TypedArray r0 = r9.f18453c
            if (r0 == 0) goto L_0x006d
            int r0 = r0.length()
            goto L_0x006e
        L_0x006d:
            r0 = 0
        L_0x006e:
            if (r0 <= 0) goto L_0x007f
        L_0x0070:
            com.bytedance.android.livesdk.chatroom.a.b.a r0 = r9.f18456f
            r1 = 24
            if (r0 == 0) goto L_0x007b
            int r0 = r0.b()
            goto L_0x007d
        L_0x007b:
            r0 = 24
        L_0x007d:
            if (r0 < r1) goto L_0x0080
        L_0x007f:
            return
        L_0x0080:
            android.graphics.Bitmap[] r0 = r9.f18454d
            if (r0 == 0) goto L_0x00d6
            java.util.Random r1 = r9.f18455e
            int r2 = r0.length
            int r1 = r1.nextInt(r2)
            r2 = r0[r1]
            r3 = 0
            if (r2 == 0) goto L_0x0096
            boolean r2 = r2.isRecycled()
            if (r2 == 0) goto L_0x00ae
        L_0x0096:
            android.content.res.TypedArray r2 = r9.f18453c
            if (r2 == 0) goto L_0x00ae
            android.content.Context r4 = r9.h
            if (r4 == 0) goto L_0x00a3
            android.content.res.Resources r4 = r4.getResources()
            goto L_0x00a4
        L_0x00a3:
            r4 = r3
        L_0x00a4:
            int r2 = r2.getResourceId(r1, r8)
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeResource(r4, r2)
            r0[r1] = r2
        L_0x00ae:
            r0 = r0[r1]
            if (r0 == 0) goto L_0x00d1
            boolean r1 = r0.isRecycled()
            r1 = r1 ^ r7
            if (r1 == 0) goto L_0x00ba
            goto L_0x00bb
        L_0x00ba:
            r0 = r3
        L_0x00bb:
            if (r0 == 0) goto L_0x00d1
            com.bytedance.android.livesdk.chatroom.a.b.a r1 = r9.f18456f
            if (r1 == 0) goto L_0x00d6
            com.bytedance.android.livesdk.chatroom.a.a.a r2 = new com.bytedance.android.livesdk.chatroom.a.a.a
            java.util.Random r3 = r9.f18455e
            double r3 = r3.nextDouble()
            r2.<init>(r0, r3)
            com.ss.ugc.live.barrage.a.a r2 = (com.ss.ugc.live.barrage.a.a) r2
            r1.a((com.ss.ugc.live.barrage.a.a) r2, (boolean) r8)
        L_0x00d1:
            return
        L_0x00d2:
            r9.a()
            return
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.b.a(android.os.Message):void");
    }

    public b(@Nullable Context context, @Nullable ViewGroup viewGroup) {
        TypedArray typedArray;
        this.h = context;
        this.i = viewGroup;
        Resources a2 = ac.a();
        if (a2 != null) {
            typedArray = a2.obtainTypedArray(C0906R.array.ab);
        } else {
            typedArray = null;
        }
        this.f18453c = typedArray;
        TypedArray typedArray2 = this.f18453c;
        if (typedArray2 != null) {
            this.f18454d = new Bitmap[typedArray2.length()];
        }
        d();
    }
}
