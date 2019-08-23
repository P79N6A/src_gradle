package com.ss.android.ugc.aweme.story.shootvideo.record;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/TextureViewProvider;", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/RecordSurfaceProvider;", "context", "Landroid/content/Context;", "surfaceStateListener", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/SurfaceStateListener;", "(Landroid/content/Context;Lcom/ss/android/ugc/aweme/story/shootvideo/record/SurfaceStateListener;)V", "surface", "Landroid/view/Surface;", "textureView", "Landroid/view/TextureView;", "surfaceHolder", "Landroid/view/SurfaceHolder;", "surfaceView", "Landroid/view/View;", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class r implements d {

    /* renamed from: a  reason: collision with root package name */
    public Surface f74005a;

    /* renamed from: b  reason: collision with root package name */
    public final p f74006b;

    /* renamed from: c  reason: collision with root package name */
    private final TextureView f74007c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\r¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/story/shootvideo/record/TextureViewProvider$textureView$1$1", "Landroid/view/TextureView$SurfaceTextureListener;", "onSurfaceTextureAvailable", "", "texture", "Landroid/graphics/SurfaceTexture;", "width", "", "height", "onSurfaceTextureDestroyed", "", "onSurfaceTextureSizeChanged", "onSurfaceTextureUpdated", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements TextureView.SurfaceTextureListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74008a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f74009b;

        public final void onSurfaceTextureUpdated(@Nullable SurfaceTexture surfaceTexture) {
        }

        a(r rVar) {
            this.f74009b = rVar;
        }

        public final boolean onSurfaceTextureDestroyed(@Nullable SurfaceTexture surfaceTexture) {
            if (PatchProxy.isSupport(new Object[]{surfaceTexture}, this, f74008a, false, 85756, new Class[]{SurfaceTexture.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{surfaceTexture}, this, f74008a, false, 85756, new Class[]{SurfaceTexture.class}, Boolean.TYPE)).booleanValue();
            }
            this.f74009b.f74006b.am_();
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            if (this.f74009b.f74005a != null) {
                Surface surface = this.f74009b.f74005a;
                if (surface == null) {
                    Intrinsics.throwNpe();
                }
                surface.release();
                this.f74009b.f74005a = null;
            }
            return false;
        }

        public final void onSurfaceTextureAvailable(@Nullable SurfaceTexture surfaceTexture, int i, int i2) {
            SurfaceTexture surfaceTexture2 = surfaceTexture;
            if (PatchProxy.isSupport(new Object[]{surfaceTexture2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f74008a, false, 85757, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{surfaceTexture2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f74008a, false, 85757, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f74009b.f74005a = new Surface(surfaceTexture);
            this.f74009b.f74006b.f();
        }

        public final void onSurfaceTextureSizeChanged(@Nullable SurfaceTexture surfaceTexture, int i, int i2) {
            SurfaceTexture surfaceTexture2 = surfaceTexture;
            if (PatchProxy.isSupport(new Object[]{surfaceTexture2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f74008a, false, 85758, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{surfaceTexture2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f74008a, false, 85758, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f74009b.f74006b.a(new Surface(surfaceTexture2));
        }
    }

    @Nullable
    public final Surface b() {
        return this.f74005a;
    }

    @NotNull
    public final View a() {
        return this.f74007c;
    }

    public r(@NotNull Context context, @NotNull p pVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(pVar, "surfaceStateListener");
        this.f74006b = pVar;
        TextureView textureView = new TextureView(context);
        textureView.setSurfaceTextureListener(new a(this));
        this.f74007c = textureView;
    }
}
