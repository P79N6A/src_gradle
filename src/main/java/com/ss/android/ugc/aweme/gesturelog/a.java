package com.ss.android.ugc.aweme.gesturelog;

import android.graphics.Point;
import android.os.Build;
import android.support.v4.view.ViewConfigurationCompat;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.bytedance.common.utility.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.app.constants.Constants;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.language.e;
import java.util.ArrayList;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49505a = null;
    private static a h = null;
    private static String i = "GestureLogHelper";

    /* renamed from: b  reason: collision with root package name */
    public int f49506b;

    /* renamed from: c  reason: collision with root package name */
    public GenericData f49507c;

    /* renamed from: d  reason: collision with root package name */
    public Gson f49508d;

    /* renamed from: e  reason: collision with root package name */
    public int f49509e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f49510f;
    public VelocityTracker g;
    private int j = 3;
    private int k;
    private List<TouchData> l = new ArrayList(100);

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f49505a, true, 47529, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f49505a, true, 47529, new Class[0], a.class);
        }
        if (h == null) {
            synchronized (a.class) {
                h = new a();
            }
        }
        return h;
    }

    public final boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f49505a, false, 47538, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f49505a, false, 47538, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (c() && ((Integer) SharePrefCache.inst().getTapDataCount().c()).intValue() < 1000) {
            z = true;
        }
        return z;
    }

    private a() {
        int i2;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(k.a());
        this.k = ViewConfigurationCompat.getScaledPagingTouchSlop(viewConfiguration);
        this.f49506b = viewConfiguration.getScaledMaximumFlingVelocity();
        WindowManager windowManager = (WindowManager) k.a().getSystemService("window");
        int i3 = 0;
        if (windowManager != null) {
            Point point = new Point();
            if (Build.VERSION.SDK_INT >= 17) {
                windowManager.getDefaultDisplay().getRealSize(point);
            } else {
                windowManager.getDefaultDisplay().getSize(point);
            }
            i2 = point.x;
            i3 = point.y;
        } else {
            i2 = 0;
        }
        DisplayMetrics displayMetrics = k.a().getResources().getDisplayMetrics();
        if (i2 == 0 && i3 == 0) {
            i2 = displayMetrics.widthPixels;
            i3 = displayMetrics.heightPixels;
        }
        String str = Build.BRAND;
        String str2 = Build.MODEL;
        String uid = d.a().getCurUser().getUid();
        String b2 = e.b();
        int i4 = Build.VERSION.SDK_INT;
        int i5 = Constants.f34102a;
        GenericData genericData = new GenericData(str, str2, uid, b2, i4, i5, i2, i3, displayMetrics.xdpi, displayMetrics.ydpi);
        this.f49507c = genericData;
        this.f49508d = new GsonBuilder().serializeNulls().create();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0087 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean c() {
        /*
            r10 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f49505a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 47536(0xb9b0, float:6.6612E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f49505a
            r5 = 0
            r6 = 47536(0xb9b0, float:6.6612E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002c:
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            boolean r1 = r1.isLogin()
            r2 = 1
            if (r1 == 0) goto L_0x0078
            com.ss.android.ugc.aweme.setting.AbTestManager r1 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r6 = 0
            r7 = 71814(0x11886, float:1.00633E-40)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r4 = r1
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0066
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r6 = 0
            r7 = 71814(0x11886, float:1.00633E-40)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r4 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x0074
        L_0x0066:
            com.ss.android.ugc.aweme.setting.AbTestManager r1 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            com.ss.android.ugc.aweme.setting.model.AbTestModel r1 = r1.d()
            if (r1 == 0) goto L_0x0073
            boolean r1 = r1.needUploadGestureData
            goto L_0x0074
        L_0x0073:
            r1 = 0
        L_0x0074:
            if (r1 == 0) goto L_0x0078
            r1 = 1
            goto L_0x0079
        L_0x0078:
            r1 = 0
        L_0x0079:
            if (r1 == 0) goto L_0x0087
            boolean r0 = com.ss.android.g.a.a()
            if (r0 == 0) goto L_0x0086
            boolean r0 = com.ss.android.g.a.b()
            return r0
        L_0x0086:
            return r2
        L_0x0087:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.gesturelog.a.c():boolean");
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f49505a, false, 47535, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f49505a, false, 47535, new Class[]{View.class}, Void.TYPE);
            return;
        }
        final ArrayList arrayList = new ArrayList();
        final GestureDetector gestureDetector = new GestureDetector(new GestureDetector.SimpleOnGestureListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49511a;

            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f49511a, false, 47540, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f49511a, false, 47540, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
                }
                if (!Lists.isEmpty(arrayList)) {
                    ArrayList arrayList = new ArrayList(arrayList);
                    a aVar = a.this;
                    GestureInfo gestureInfo = new GestureInfo(a.this.f49507c, arrayList);
                    if (PatchProxy.isSupport(new Object[]{"tap_touch_data", gestureInfo}, aVar, a.f49505a, false, 47539, new Class[]{String.class, GestureInfo.class}, Void.TYPE)) {
                        a aVar2 = aVar;
                        PatchProxy.accessDispatch(new Object[]{"tap_touch_data", gestureInfo}, aVar2, a.f49505a, false, 47539, new Class[]{String.class, GestureInfo.class}, Void.TYPE);
                    } else {
                        com.ss.android.b.a.a.a.a(new Runnable(gestureInfo, "tap_touch_data") {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f49518a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ GestureInfo f49519b;

                            /* renamed from: c  reason: collision with root package name */
                            final /* synthetic */ String f49520c;

                            public final void run() {
                                an<Integer> anVar;
                                if (PatchProxy.isSupport(new Object[0], this, f49518a, false, 47542, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f49518a, false, 47542, new Class[0], Void.TYPE);
                                    return;
                                }
                                this.f49519b.data.userId = d.a().getCurUserId();
                                if (this.f49520c.equals("swipe_touch_data")) {
                                    anVar = SharePrefCache.inst().getSwipeDataCount();
                                } else {
                                    anVar = SharePrefCache.inst().getTapDataCount();
                                }
                                int intValue = ((Integer) anVar.c()).intValue();
                                if (intValue < 1000) {
                                    n.a(this.f49520c, c.a().a("errorDesc", a.this.f49508d.toJson((Object) this.f49519b)).b());
                                    anVar.a(Integer.valueOf(intValue + 1));
                                }
                            }

                            {
                                this.f49519b = r2;
                                this.f49520c = r3;
                            }
                        });
                    }
                    arrayList.clear();
                }
                return false;
            }
        });
        view.setOnTouchListener(new View.OnTouchListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49514a;

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                int i = 1;
                if (PatchProxy.isSupport(new Object[]{view, motionEvent2}, this, f49514a, false, 47541, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent2}, this, f49514a, false, 47541, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                }
                int action = motionEvent.getAction() & 255;
                if (action == 0 && a.this.g != null) {
                    a.this.g.recycle();
                    a.this.g = VelocityTracker.obtain();
                }
                if (a.this.g == null) {
                    a.this.g = VelocityTracker.obtain();
                }
                a.this.g.addMovement(motionEvent2);
                switch (action) {
                    case 0:
                        a.this.f49509e = motionEvent2.getPointerId(0);
                        arrayList.clear();
                        a aVar = a.this;
                        if (k.a().getResources().getConfiguration().orientation != 2) {
                            i = 0;
                        }
                        aVar.f49510f = i;
                        List list = arrayList;
                        int i2 = action;
                        TouchData touchData = new TouchData(System.currentTimeMillis(), i2, motionEvent.getOrientation(), a.this.f49510f, motionEvent.getRawX(), motionEvent.getRawY(), motionEvent.getPressure(), motionEvent.getSize(), 0.0f, 0.0f);
                        list.add(touchData);
                        break;
                    case 1:
                        a.this.g.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, (float) a.this.f49506b);
                        List list2 = arrayList;
                        int i3 = action;
                        TouchData touchData2 = new TouchData(System.currentTimeMillis(), i3, motionEvent.getOrientation(), a.this.f49510f, motionEvent.getRawX(), motionEvent.getRawY(), motionEvent.getPressure(), motionEvent.getSize(), a.this.g.getXVelocity(a.this.f49509e), a.this.g.getYVelocity(a.this.f49509e));
                        list2.add(touchData2);
                        a.this.g.recycle();
                        a.this.g = null;
                        break;
                    case 2:
                        int i4 = a.this.f49509e;
                        if (i4 != -1) {
                            a.this.g.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, (float) a.this.f49506b);
                            List list3 = arrayList;
                            int i5 = action;
                            TouchData touchData3 = new TouchData(System.currentTimeMillis(), i5, motionEvent.getOrientation(), a.this.f49510f, motionEvent.getRawX(), motionEvent.getRawY(), motionEvent.getPressure(), motionEvent.getSize(), a.this.g.getXVelocity(i4), a.this.g.getYVelocity(i4));
                            list3.add(touchData3);
                            break;
                        }
                        break;
                    case 3:
                        arrayList.clear();
                        a.this.g.recycle();
                        a.this.g = null;
                        break;
                }
                gestureDetector.onTouchEvent(motionEvent2);
                return false;
            }
        });
    }
}
