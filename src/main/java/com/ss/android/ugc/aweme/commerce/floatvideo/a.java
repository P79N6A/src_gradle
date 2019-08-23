package com.ss.android.ugc.aweme.commerce.floatvideo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commerce.floatvideo.FloatVideoBrowsePresenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.longvideo.b.e;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0014J0\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u0007J:\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0001\u0010\u001e\u001a\u00020\u0007J\u0006\u0010\u001f\u001a\u00020\u0014J\u0006\u0010 \u001a\u00020\u0014J\u0006\u0010!\u001a\u00020\u0014R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/floatvideo/AwemePlayerBox;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mOutBox", "Landroid/view/View;", "mPresenter", "Lcom/ss/android/ugc/aweme/commerce/floatvideo/FloatVideoBrowsePresenter;", "getMPresenter", "()Lcom/ss/android/ugc/aweme/commerce/floatvideo/FloatVideoBrowsePresenter;", "setMPresenter", "(Lcom/ss/android/ugc/aweme/commerce/floatvideo/FloatVideoBrowsePresenter;)V", "realView", "Lcom/ss/android/ugc/playerkit/videoview/KeepSurfaceTextureView;", "init", "", "onAttachedToWindow", "play", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "mode", "width", "height", "bgColor", "playMuteVideo", "showVideoFrom", "reportDestroy", "reportPause", "reportResume", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class a extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36904a;

    /* renamed from: b  reason: collision with root package name */
    private KeepSurfaceTextureView f36905b;

    /* renamed from: c  reason: collision with root package name */
    private View f36906c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private FloatVideoBrowsePresenter f36907d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.floatvideo.a$a  reason: collision with other inner class name */
    static final class C0466a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36908a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f36909b;

        C0466a(a aVar) {
            this.f36909b = aVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f36908a, false, 28162, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f36908a, false, 28162, new Class[0], Void.TYPE);
                return;
            }
            this.f36909b.b();
        }
    }

    @Nullable
    public final FloatVideoBrowsePresenter getMPresenter() {
        return this.f36907d;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f36904a, false, 28156, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36904a, false, 28156, new Class[0], Void.TYPE);
            return;
        }
        FloatVideoBrowsePresenter floatVideoBrowsePresenter = this.f36907d;
        if (floatVideoBrowsePresenter != null) {
            floatVideoBrowsePresenter.a();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f36904a, false, 28157, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36904a, false, 28157, new Class[0], Void.TYPE);
            return;
        }
        FloatVideoBrowsePresenter floatVideoBrowsePresenter = this.f36907d;
        if (floatVideoBrowsePresenter != null) {
            floatVideoBrowsePresenter.b();
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f36904a, false, 28158, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36904a, false, 28158, new Class[0], Void.TYPE);
            return;
        }
        FloatVideoBrowsePresenter floatVideoBrowsePresenter = this.f36907d;
        if (floatVideoBrowsePresenter != null) {
            floatVideoBrowsePresenter.c();
        }
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f36904a, false, 28159, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36904a, false, 28159, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        post(new C0466a(this));
    }

    public final void setMPresenter(@Nullable FloatVideoBrowsePresenter floatVideoBrowsePresenter) {
        this.f36907d = floatVideoBrowsePresenter;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public a(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (PatchProxy.isSupport(new Object[]{context}, this, f36904a, false, 28153, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f36904a, false, 28153, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        LayoutInflater.from(context).inflate(C0906R.layout.a1k, this);
        this.f36905b = (KeepSurfaceTextureView) findViewById(C0906R.id.dt2);
        this.f36906c = findViewById(C0906R.id.bvt);
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, null, 0);
    }

    public final void a(@NotNull Aweme aweme, int i, int i2, int i3, int i4, @FloatVideoBrowsePresenter.VideoShowFrom int i5) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2, 3, Integer.valueOf(i2), Integer.valueOf(i3), 0, Integer.valueOf(i5)}, this, f36904a, false, 28155, new Class[]{Aweme.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, 3, Integer.valueOf(i2), Integer.valueOf(i3), 0, Integer.valueOf(i5)}, this, f36904a, false, 28155, new Class[]{Aweme.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aweme2, "aweme");
        FloatVideoBrowsePresenter floatVideoBrowsePresenter = new FloatVideoBrowsePresenter(o.b(), aweme, new e(i2, i3), this.f36905b, this.f36906c, 3, true, "", 0, i5);
        this.f36907d = floatVideoBrowsePresenter;
    }
}
