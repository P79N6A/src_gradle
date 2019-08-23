package com.ss.android.ugc.aweme.motion;

import a.i;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.language.I18nManagerService;
import com.ss.android.ugc.aweme.language.e;
import com.ss.android.ugc.aweme.motion.b;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB'\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/motion/DecorRelativeLayout;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "style", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dispatchTouchEvent", "", "event", "Landroid/view/MotionEvent;", "onTouchEvent", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DecorRelativeLayout extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56115a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DecorRelativeLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f56115a, false, 59773, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f56115a, false, 59773, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(motionEvent2, "event");
        a aVar = a.f56118c;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, aVar, a.f56116a, false, 59778, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, aVar, a.f56116a, false, 59778, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(motionEvent2, "event");
        return true;
    }

    public final boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f56115a, false, 59772, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f56115a, false, 59772, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(motionEvent2, "event");
        a aVar = a.f56118c;
        if (!PatchProxy.isSupport(new Object[]{motionEvent2}, aVar, a.f56116a, false, 59776, new Class[]{MotionEvent.class}, Void.TYPE)) {
            Intrinsics.checkParameterIsNotNull(motionEvent2, "event");
            b bVar = b.f56130f;
            if (PatchProxy.isSupport(new Object[0], bVar, b.f56125a, false, 59780, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], bVar, b.f56125a, false, 59780, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                if (b.f56127c && b.f56128d) {
                    if (PatchProxy.isSupport(new Object[0], bVar, b.f56125a, false, 59785, new Class[0], Boolean.TYPE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], bVar, b.f56125a, false, 59785, new Class[0], Boolean.TYPE)).booleanValue();
                    } else {
                        String a2 = e.a();
                        if (TextUtils.isEmpty(a2)) {
                            Object service = ServiceManager.get().getService(I18nManagerService.class);
                            Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…nagerService::class.java)");
                            a2 = ((I18nManagerService) service).getSysRegion();
                        }
                        if (StringsKt.equals(b.f56129e, a2, true)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        if (PatchProxy.isSupport(new Object[0], bVar, b.f56125a, false, 59784, new Class[0], Boolean.TYPE)) {
                            z3 = ((Boolean) PatchProxy.accessDispatch(new Object[0], bVar, b.f56125a, false, 59784, new Class[0], Boolean.TYPE)).booleanValue();
                        } else {
                            AbTestManager a3 = AbTestManager.a();
                            Intrinsics.checkExpressionValueIsNotNull(a3, "AbTestManager.getInstance()");
                            if (SystemClock.elapsedRealtime() - b.f56126b < ((long) a3.bW()) * 60000) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        }
                        if (z3) {
                            z = true;
                        }
                    }
                }
                z = false;
            }
            if (z) {
                int actionIndex = motionEvent.getActionIndex();
                int pointerId = motionEvent2.getPointerId(actionIndex);
                switch (motionEvent.getActionMasked()) {
                    case 0:
                        aVar.a(0, motionEvent2, pointerId, actionIndex);
                        break;
                    case 1:
                    case 3:
                        aVar.a(1, motionEvent2, pointerId, actionIndex);
                        b bVar2 = b.f56130f;
                        Map map = a.f56117b;
                        if (!PatchProxy.isSupport(new Object[]{map}, bVar2, b.f56125a, false, 59781, new Class[]{Map.class}, Void.TYPE)) {
                            Intrinsics.checkParameterIsNotNull(map, "recordMap");
                            HashMap hashMap = new HashMap(map);
                            map.clear();
                            i.a((Callable<TResult>) new b.a<TResult>(hashMap));
                            break;
                        } else {
                            b bVar3 = bVar2;
                            PatchProxy.accessDispatch(new Object[]{map}, bVar3, b.f56125a, false, 59781, new Class[]{Map.class}, Void.TYPE);
                            break;
                        }
                    case 2:
                        int pointerCount = motionEvent.getPointerCount();
                        for (int i = 0; i < pointerCount; i++) {
                            aVar.a(2, motionEvent2, motionEvent2.getPointerId(i), i);
                        }
                        break;
                    case 5:
                        aVar.a(0, motionEvent2, pointerId, actionIndex);
                        break;
                    case 6:
                        aVar.a(1, motionEvent2, pointerId, actionIndex);
                        break;
                }
            }
        } else {
            a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{motionEvent2}, aVar2, a.f56116a, false, 59776, new Class[]{MotionEvent.class}, Void.TYPE);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DecorRelativeLayout(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attr");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public DecorRelativeLayout(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attr");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public DecorRelativeLayout(@NotNull Context context, @NotNull AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attr");
    }
}
