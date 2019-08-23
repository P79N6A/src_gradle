package com.ss.android.ugc.aweme.commercialize.utils;

import android.graphics.drawable.Animatable;
import com.facebook.drawee.controller.ControllerListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B)\u0012\"\u0010\u0003\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u0004\"\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002¢\u0006\u0002\u0010\u0005J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J+\u0010\r\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00018\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J!\u0010\u0013\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0014J\u0012\u0010\u0015\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\u0016\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\"\u0010\u0003\u001a\u0014\u0012\u000e\b\u0001\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\u0018\u00010\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/ControllerListenerProxy;", "INFO", "Lcom/facebook/drawee/controller/ControllerListener;", "listener", "", "([Lcom/facebook/drawee/controller/ControllerListener;)V", "[Lcom/facebook/drawee/controller/ControllerListener;", "onFailure", "", "id", "", "throwable", "", "onFinalImageSet", "imageInfo", "animatable", "Landroid/graphics/drawable/Animatable;", "(Ljava/lang/String;Ljava/lang/Object;Landroid/graphics/drawable/Animatable;)V", "onIntermediateImageFailed", "onIntermediateImageSet", "(Ljava/lang/String;Ljava/lang/Object;)V", "onRelease", "onSubmit", "callerContext", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class v<INFO> implements ControllerListener<INFO> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39835a;

    /* renamed from: b  reason: collision with root package name */
    private final ControllerListener<INFO>[] f39836b;

    public v(@NotNull ControllerListener<INFO>... controllerListenerArr) {
        Intrinsics.checkParameterIsNotNull(controllerListenerArr, "listener");
        this.f39836b = controllerListenerArr;
    }

    public final void onRelease(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f39835a, false, 32487, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f39835a, false, 32487, new Class[]{String.class}, Void.TYPE);
            return;
        }
        ControllerListener<INFO>[] controllerListenerArr = this.f39836b;
        if (controllerListenerArr != null) {
            for (ControllerListener<INFO> controllerListener : controllerListenerArr) {
                if (controllerListener != null) {
                    controllerListener.onRelease(str2);
                }
            }
        }
    }

    public final void onFailure(@Nullable String str, @Nullable Throwable th) {
        String str2 = str;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{str2, th2}, this, f39835a, false, 32486, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, th2}, this, f39835a, false, 32486, new Class[]{String.class, Throwable.class}, Void.TYPE);
            return;
        }
        ControllerListener<INFO>[] controllerListenerArr = this.f39836b;
        if (controllerListenerArr != null) {
            for (ControllerListener<INFO> controllerListener : controllerListenerArr) {
                if (controllerListener != null) {
                    controllerListener.onFailure(str2, th2);
                }
            }
        }
    }

    public final void onIntermediateImageFailed(@Nullable String str, @Nullable Throwable th) {
        String str2 = str;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{str2, th2}, this, f39835a, false, 32485, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, th2}, this, f39835a, false, 32485, new Class[]{String.class, Throwable.class}, Void.TYPE);
            return;
        }
        ControllerListener<INFO>[] controllerListenerArr = this.f39836b;
        if (controllerListenerArr != null) {
            for (ControllerListener<INFO> controllerListener : controllerListenerArr) {
                if (controllerListener != null) {
                    controllerListener.onIntermediateImageFailed(str2, th2);
                }
            }
        }
    }

    public final void onIntermediateImageSet(@Nullable String str, @Nullable INFO info) {
        String str2 = str;
        INFO info2 = info;
        if (PatchProxy.isSupport(new Object[]{str2, info2}, this, f39835a, false, 32484, new Class[]{String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, info2}, this, f39835a, false, 32484, new Class[]{String.class, Object.class}, Void.TYPE);
            return;
        }
        ControllerListener<INFO>[] controllerListenerArr = this.f39836b;
        if (controllerListenerArr != null) {
            for (ControllerListener<INFO> controllerListener : controllerListenerArr) {
                if (controllerListener != null) {
                    controllerListener.onIntermediateImageSet(str2, info2);
                }
            }
        }
    }

    public final void onSubmit(@Nullable String str, @Nullable Object obj) {
        String str2 = str;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{str2, obj2}, this, f39835a, false, 32482, new Class[]{String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, obj2}, this, f39835a, false, 32482, new Class[]{String.class, Object.class}, Void.TYPE);
            return;
        }
        ControllerListener<INFO>[] controllerListenerArr = this.f39836b;
        if (controllerListenerArr != null) {
            for (ControllerListener<INFO> controllerListener : controllerListenerArr) {
                if (controllerListener != null) {
                    controllerListener.onSubmit(str2, obj2);
                }
            }
        }
    }

    public final void onFinalImageSet(@Nullable String str, @Nullable INFO info, @Nullable Animatable animatable) {
        String str2 = str;
        INFO info2 = info;
        Animatable animatable2 = animatable;
        if (PatchProxy.isSupport(new Object[]{str2, info2, animatable2}, this, f39835a, false, 32483, new Class[]{String.class, Object.class, Animatable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, info2, animatable2}, this, f39835a, false, 32483, new Class[]{String.class, Object.class, Animatable.class}, Void.TYPE);
            return;
        }
        ControllerListener<INFO>[] controllerListenerArr = this.f39836b;
        if (controllerListenerArr != null) {
            for (ControllerListener<INFO> controllerListener : controllerListenerArr) {
                if (controllerListener != null) {
                    controllerListener.onFinalImageSet(str2, info2, animatable2);
                }
            }
        }
    }
}
