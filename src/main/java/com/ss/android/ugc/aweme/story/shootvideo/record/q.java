package com.ss.android.ugc.aweme.story.shootvideo.record;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0007\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/SurfaceViewProvider;", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/RecordSurfaceProvider;", "context", "Landroid/content/Context;", "surfaceStateListener", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/SurfaceStateListener;", "(Landroid/content/Context;Lcom/ss/android/ugc/aweme/story/shootvideo/record/SurfaceStateListener;)V", "surfaceView", "Landroid/view/SurfaceView;", "surface", "Landroid/view/Surface;", "surfaceHolder", "Landroid/view/SurfaceHolder;", "Landroid/view/View;", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class q implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74000a;

    /* renamed from: b  reason: collision with root package name */
    public final p f74001b;

    /* renamed from: c  reason: collision with root package name */
    private final SurfaceView f74002c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\f¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/story/shootvideo/record/SurfaceViewProvider$surfaceView$1$1", "Landroid/view/SurfaceHolder$Callback;", "surfaceChanged", "", "holder", "Landroid/view/SurfaceHolder;", "format", "", "width", "height", "surfaceCreated", "surfaceDestroyed", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements SurfaceHolder.Callback {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74003a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f74004b;

        a(q qVar) {
            this.f74004b = qVar;
        }

        public final void surfaceCreated(@Nullable SurfaceHolder surfaceHolder) {
            if (PatchProxy.isSupport(new Object[]{surfaceHolder}, this, f74003a, false, 85755, new Class[]{SurfaceHolder.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{surfaceHolder}, this, f74003a, false, 85755, new Class[]{SurfaceHolder.class}, Void.TYPE);
                return;
            }
            this.f74004b.f74001b.f();
        }

        public final void surfaceDestroyed(@Nullable SurfaceHolder surfaceHolder) {
            if (PatchProxy.isSupport(new Object[]{surfaceHolder}, this, f74003a, false, 85754, new Class[]{SurfaceHolder.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{surfaceHolder}, this, f74003a, false, 85754, new Class[]{SurfaceHolder.class}, Void.TYPE);
                return;
            }
            this.f74004b.f74001b.am_();
        }

        public final void surfaceChanged(@Nullable SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            if (PatchProxy.isSupport(new Object[]{surfaceHolder, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f74003a, false, 85753, new Class[]{SurfaceHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{surfaceHolder, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f74003a, false, 85753, new Class[]{SurfaceHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            p pVar = this.f74004b.f74001b;
            if (surfaceHolder == null) {
                Intrinsics.throwNpe();
            }
            Surface surface = surfaceHolder.getSurface();
            Intrinsics.checkExpressionValueIsNotNull(surface, "holder!!.surface");
            pVar.a(surface);
        }
    }

    @NotNull
    public final View a() {
        return this.f74002c;
    }

    @Nullable
    public final Surface b() {
        if (PatchProxy.isSupport(new Object[0], this, f74000a, false, 85751, new Class[0], Surface.class)) {
            return (Surface) PatchProxy.accessDispatch(new Object[0], this, f74000a, false, 85751, new Class[0], Surface.class);
        }
        SurfaceHolder holder = this.f74002c.getHolder();
        Intrinsics.checkExpressionValueIsNotNull(holder, "surfaceView.holder");
        return holder.getSurface();
    }

    public q(@NotNull Context context, @NotNull p pVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(pVar, "surfaceStateListener");
        this.f74001b = pVar;
        SurfaceView surfaceView = new SurfaceView(context);
        surfaceView.getHolder().addCallback(new a(this));
        this.f74002c = surfaceView;
    }
}
