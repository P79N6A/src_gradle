package com.ss.android.ugc.aweme.motion;

import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ(\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rRJ\u0010\u0003\u001a>\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b0\u0004j\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b`\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/motion/MotionHandler;", "", "()V", "recordMap", "Ljava/util/HashMap;", "", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/motion/MotionHandler$Record;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/HashMap;", "dispatchTouchEvent", "", "event", "Landroid/view/MotionEvent;", "handleEvent", "type", "pointId", "pointIndex", "onTouchEvent", "", "Record", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56116a;

    /* renamed from: b  reason: collision with root package name */
    static final HashMap<Integer, ArrayList<C0646a>> f56117b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static final a f56118c = new a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u001a\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/motion/MotionHandler$Record;", "", "type", "", "x", "", "y", "s", "p", "t", "", "(IFFFFJ)V", "getP", "()F", "setP", "(F)V", "getS", "setS", "getT", "()J", "setT", "(J)V", "getType", "()I", "setType", "(I)V", "getX", "setX", "getY", "setY", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.motion.a$a  reason: collision with other inner class name */
    public static final class C0646a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f56119a;

        /* renamed from: b  reason: collision with root package name */
        public int f56120b;

        /* renamed from: c  reason: collision with root package name */
        public float f56121c;

        /* renamed from: d  reason: collision with root package name */
        public float f56122d;

        /* renamed from: e  reason: collision with root package name */
        public float f56123e;

        /* renamed from: f  reason: collision with root package name */
        public float f56124f;
        public long g;

        @NotNull
        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f56119a, false, 59779, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f56119a, false, 59779, new Class[0], String.class);
            }
            String format = String.format("%s|%s|%s|%s|%s", Arrays.copyOf(new Object[]{Float.valueOf(this.f56121c), Float.valueOf(this.f56122d), Float.valueOf(this.f56123e), Float.valueOf(this.f56124f), Long.valueOf(this.g)}, 5));
            Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
            return format;
        }

        public C0646a(int i, float f2, float f3, float f4, float f5, long j) {
            this.f56120b = i;
            this.f56121c = f2;
            this.f56122d = f3;
            this.f56123e = f4;
            this.f56124f = f5;
            this.g = j;
        }
    }

    private a() {
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, MotionEvent motionEvent, int i2, int i3) {
        MotionEvent motionEvent2 = motionEvent;
        int i4 = i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), motionEvent2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f56116a, false, 59777, new Class[]{Integer.TYPE, MotionEvent.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), motionEvent2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f56116a, false, 59777, new Class[]{Integer.TYPE, MotionEvent.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        ArrayList arrayList = f56117b.get(Integer.valueOf(i2));
        if (arrayList == null) {
            arrayList = new ArrayList();
            f56117b.put(Integer.valueOf(i2), arrayList);
        }
        C0646a aVar = new C0646a(i, motionEvent2.getX(i4), motionEvent2.getY(i4), motionEvent2.getSize(i4), motionEvent2.getPressure(i4), System.currentTimeMillis());
        arrayList.add(aVar);
    }
}
