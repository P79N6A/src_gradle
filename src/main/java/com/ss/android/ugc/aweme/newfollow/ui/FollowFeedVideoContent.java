package com.ss.android.ugc.aweme.newfollow.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.widget.DragView;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPlayerProgressbar;
import com.ss.android.ugc.playerkit.videoview.f;
import com.ss.android.ugc.playerkit.videoview.h;

public class FollowFeedVideoContent extends FrameLayout implements DragView.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57230a;

    /* renamed from: b  reason: collision with root package name */
    private h f57231b;

    /* renamed from: c  reason: collision with root package name */
    private DragView.c f57232c;
    @BindView(2131498485)
    public ViewGroup mContainer;
    @BindView(2131494996)
    public RemoteImageView mCover;
    @BindView(2131498465)
    public VideoPlayerProgressbar mProgressbar;

    public DragView.c getListener() {
        return this.f57232c;
    }

    public h getVideoSurfaceHolder() {
        return this.f57231b;
    }

    public void setListener(DragView.c cVar) {
        this.f57232c = cVar;
    }

    public FollowFeedVideoContent(Context context) {
        super(context);
        if (PatchProxy.isSupport(new Object[]{context}, this, f57230a, false, 61527, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f57230a, false, 61527, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        ButterKnife.bind((Object) this, LayoutInflater.from(context).inflate(C0906R.layout.un, this, true));
        ViewGroup viewGroup = this.mContainer;
        h hVar = new h();
        hVar.f77784a = new f(viewGroup);
        hVar.a().setTag(hVar);
        this.f57231b = hVar;
    }

    public final void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f57230a, false, 61528, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f57230a, false, 61528, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.f57232c != null) {
            this.f57232c.a(f2, f3);
        }
    }

    public final void a(float f2, float f3, float f4, float f5) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, this, f57230a, false, 61529, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, this, f57230a, false, 61529, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.f57232c != null) {
            float f6 = f2;
            float f7 = f3;
            this.f57232c.a(f2, f3, f4, f5);
        }
    }
}
