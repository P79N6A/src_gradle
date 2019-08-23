package com.ss.android.ugc.aweme.shortvideo.cut;

import a.g;
import a.i;
import a.j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.design.widget.CheckableImageButton;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v4.util.Pair;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.medialib.FFMpegManager;
import com.ss.android.medialib.player.IESMediaPlayer;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.t;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.common.w;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.a.d;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.cut.al;
import com.ss.android.ugc.aweme.shortvideo.cut.model.h;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cv;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.cg;
import com.ss.android.ugc.aweme.shortvideo.edit.q;
import com.ss.android.ugc.aweme.shortvideo.ej;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.shortvideo.ff;
import com.ss.android.ugc.aweme.shortvideo.hm;
import com.ss.android.ugc.aweme.shortvideo.record.n;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import com.ss.android.ugc.aweme.utils.bc;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;
import com.tt.appbrandimpl.PublishExtra;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;

public class CutMultiVideoActivity extends AmeActivity implements TextureView.SurfaceTextureListener, View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66139a = null;

    /* renamed from: b  reason: collision with root package name */
    public static int f66140b = 1;
    public boolean A;
    public boolean B;
    boolean C;
    boolean D;
    public long E;
    j<Integer> F;
    boolean G;
    boolean H;
    public boolean I;
    boolean J = true;
    public Handler K = new Handler(Looper.getMainLooper()) {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66145a;

        public final void handleMessage(Message message) {
            if (PatchProxy.isSupport(new Object[]{message}, this, f66145a, false, 75467, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message}, this, f66145a, false, 75467, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            super.handleMessage(message);
            if (message.what == 0) {
                CutMultiVideoActivity.this.u.a(((Long) message.obj).longValue(), CutMultiVideoActivity.this.v.b());
            }
        }
    };
    public Runnable L = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66147a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f66147a, false, 75468, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66147a, false, 75468, new Class[0], Void.TYPE);
            } else if (CutMultiVideoActivity.this.w != null) {
                CutMultiVideoActivity.this.K.obtainMessage(0, Long.valueOf(CutMultiVideoActivity.this.w.getCurrentPosition())).sendToTarget();
                CutMultiVideoActivity.this.K.postDelayed(CutMultiVideoActivity.this.L, 30);
            }
        }
    };
    private Serializable M;
    private al N;
    private RelativeLayout O;
    private RelativeLayout P;
    @Nullable
    @BindView(2131492900)
    View animDot;
    @BindView(2131493299)
    AutoRTLImageView back;

    /* renamed from: c  reason: collision with root package name */
    n f66141c;
    @Nullable
    @BindView(2131493300)
    ImageView cancelIcon;

    /* renamed from: d  reason: collision with root package name */
    d f66142d;
    @BindView(2131493301)
    ImageView deleteBtn;

    /* renamed from: e  reason: collision with root package name */
    List<String> f66143e;
    @Nullable
    @BindView(2131493302)
    RemoteImageView editVideoCover;

    /* renamed from: f  reason: collision with root package name */
    VideoSegmentAdapter f66144f;
    @Nullable
    @BindView(2131493169)
    View flVideoCover;
    float g;
    float h;
    float i;
    Rect j;
    Pair<Integer, Integer> k;
    View l;
    @Nullable
    @BindView(2131492954)
    RelativeLayout layoutBottom;
    @Nullable
    @BindView(2131493595)
    RelativeLayout layoutTop;
    boolean m;
    boolean n;
    @BindView(2131493822)
    View next;
    boolean o;
    public int p;
    @BindView(2131493505)
    ImageView playIcon;
    c q;
    boolean r;
    @BindView(2131493304)
    ImageView rotateBtn;
    public int s;
    @Nullable
    @BindView(2131493305)
    ImageView saveIcon;
    @Nullable
    @BindView(2131493675)
    View singleEditLayout;
    @BindView(2131493688)
    ViewStub speedBarStub;
    @BindView(2131493306)
    CheckableImageButton speedBtn;
    public int t;
    @BindView(2131493736)
    TextureView textureView;
    @BindView(2131493824)
    TextView tvTimeSelected;
    @Nullable
    @BindView(2131493826)
    TextView tvVideoSegDes;
    public CutMultiVideoViewModel u;
    public VideoEditViewModel v;
    @BindView(2131493903)
    VideoEditView videoEditView;
    @Nullable
    @BindView(2131493910)
    RelativeLayout videoEditViewWrapper;
    @Nullable
    @BindView(2131493905)
    RecyclerView videoRecyclerView;
    public IESMediaPlayer w;
    String x;
    q y;
    int z;

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void onWindowFocusChanged(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f66139a, false, 75441, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f66139a, false, 75441, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f66139a, false, 75430, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66139a, false, 75430, new Class[0], Void.TYPE);
            return;
        }
        this.K.removeCallbacks(this.L);
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f66139a, false, 75429, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66139a, false, 75429, new Class[0], Void.TYPE);
            return;
        }
        this.K.post(this.L);
    }

    public int getStatusBarColor() {
        if (!PatchProxy.isSupport(new Object[0], this, f66139a, false, 75407, new Class[0], Integer.TYPE)) {
            return getResources().getColor(C0906R.color.ano);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f66139a, false, 75407, new Class[0], Integer.TYPE)).intValue();
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f66139a, false, 75417, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66139a, false, 75417, new Class[0], Void.TYPE);
            return;
        }
        f();
    }

    public void onRestart() {
        if (PatchProxy.isSupport(new Object[0], this, f66139a, false, 75409, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66139a, false, 75409, new Class[0], Void.TYPE);
            return;
        }
        super.onRestart();
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f66139a, false, 75412, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66139a, false, 75412, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        if (this.z == 2) {
            this.videoEditView.j();
        }
        h();
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f66139a, false, 75418, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66139a, false, 75418, new Class[0], Void.TYPE);
            return;
        }
        w wVar = (w) getIntent().getSerializableExtra("extra_share_context");
        if (a.v.a(wVar)) {
            a.v.a(this, wVar, "", 20013);
        }
        n nVar = new n(this);
        if (!this.C || (this.f66144f != null && this.f66144f.getItemCount() == 1)) {
            nVar.run(null);
        } else {
            a((com.ss.android.ugc.aweme.base.a<Void>) nVar);
        }
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f66139a, false, 75431, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66139a, false, 75431, new Class[0], Void.TYPE);
            return;
        }
        if (this.playIcon.getVisibility() == 8) {
            this.playIcon.setVisibility(0);
        }
        if (this.w != null) {
            this.w.pause();
        }
        g();
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f66139a, false, 75432, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66139a, false, 75432, new Class[0], Void.TYPE);
            return;
        }
        if (this.w != null && !this.w.isPlaying()) {
            this.playIcon.setVisibility(8);
            this.w.resume();
            d();
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f66139a, false, 75397, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66139a, false, 75397, new Class[0], Void.TYPE);
        } else if (fc.a()) {
            switch (fb.f67663b) {
                case 1:
                    c(true);
                    d(true);
                    return;
                case 2:
                    c(false);
                    d(true);
                    return;
                case 3:
                    c(true);
                    d(false);
                    return;
                case 4:
                    c(true);
                    d(true);
                    return;
                case 5:
                    c(false);
                    d(true);
                    return;
                case 6:
                    c(true);
                    d(false);
                    return;
                case e.l:
                    c(false);
                    d(false);
                    return;
                default:
                    c(false);
                    d(false);
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (PatchProxy.isSupport(new Object[0], this, f66139a, false, 75433, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66139a, false, 75433, new Class[0], Void.TYPE);
            return;
        }
        if (com.ss.android.g.a.a()) {
            if (this.F != null) {
                this.F.f1091a.a((g<TResult, TContinuationResult>) new p<TResult,TContinuationResult>(this));
            }
        } else if (this.w != null) {
            this.w.pause();
            this.w.stop();
            this.w.release();
            this.w = null;
            this.H = true;
        }
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f66139a, false, 75440, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66139a, false, 75440, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        if (PatchProxy.isSupport(new Object[0], this, f66139a, false, 75438, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66139a, false, 75438, new Class[0], Void.TYPE);
            return;
        }
        if (this.M != null) {
            startActivity(new Intent(this, (Class) this.M));
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f66139a, false, 75414, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66139a, false, 75414, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        a.i.f().f();
        if (this.N != null) {
            al alVar = this.N;
            if (PatchProxy.isSupport(new Object[0], alVar, al.f66362a, false, 75531, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], alVar, al.f66362a, false, 75531, new Class[0], Void.TYPE);
            } else {
                alVar.f66363b = null;
                FFMpegManager.a().a((com.ss.android.medialib.e) null);
            }
        }
        e();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f66139a, false, 75413, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66139a, false, 75413, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoActivity", "onResume", true);
        super.onResume();
        if (!this.o) {
            this.playIcon.setVisibility(8);
            i();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoActivity", "onResume", false);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f66139a, false, 75394, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66139a, false, 75394, new Class[0], Void.TYPE);
            return;
        }
        String format = String.format(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(this.videoEditView.getSelectedTime())});
        this.tvTimeSelected.setText(getResources().getString(C0906R.string.bd9, new Object[]{format}));
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"RestrictedApi"})
    public void c() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f66139a, false, 75423, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66139a, false, 75423, new Class[0], Void.TYPE);
            return;
        }
        this.back.setVisibility(0);
        this.next.setVisibility(0);
        this.rotateBtn.setVisibility(8);
        this.deleteBtn.setVisibility(8);
        this.tvVideoSegDes.setVisibility(0);
        this.speedBtn.setVisibility(4);
        this.speedBtn.setChecked(this.m);
        if (this.f66141c != null) {
            n nVar = this.f66141c;
            if (!this.m) {
                i2 = 8;
            }
            nVar.a(i2);
            if (this.m) {
                this.f66141c.a(ak.a(this.v.d()));
            }
        }
    }

    public final void b(boolean z2) {
        if (this.f66141c != null) {
            this.f66141c.f69120b = z2;
        }
    }

    private void a(com.ss.android.ugc.aweme.base.a<Void> aVar) {
        com.ss.android.ugc.aweme.base.a<Void> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f66139a, false, 75436, new Class[]{com.ss.android.ugc.aweme.base.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f66139a, false, 75436, new Class[]{com.ss.android.ugc.aweme.base.a.class}, Void.TYPE);
            return;
        }
        Dialog a2 = new a.C0185a(this).b((int) C0906R.string.bux).b((int) C0906R.string.bd7, (DialogInterface.OnClickListener) null).a((int) C0906R.string.aja, (DialogInterface.OnClickListener) new s(aVar2)).a().a();
        if (!fc.a() && !com.ss.android.ugc.aweme.app.a.a.a((Activity) this)) {
            cg.a(a2);
        }
        a2.show();
    }

    private void c(boolean z2) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f66139a, false, 75398, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f66139a, false, 75398, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.O != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.O.getLayoutParams();
            if (z2) {
                i2 = fc.c(this);
            }
            layoutParams.topMargin = i2;
            this.O.setLayoutParams(layoutParams);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f66139a, false, 75408, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f66139a, false, 75408, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        bundle2.putParcelable("workspace", this.f66142d);
        super.onSaveInstanceState(bundle);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (PatchProxy.isSupport(new Object[]{surfaceTexture}, this, f66139a, false, 75411, new Class[]{SurfaceTexture.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{surfaceTexture}, this, f66139a, false, 75411, new Class[]{SurfaceTexture.class}, Boolean.TYPE)).booleanValue();
        }
        surfaceTexture.release();
        if (this.w != null) {
            this.w.stop();
        }
        return false;
    }

    private void d(boolean z2) {
        float f2;
        int i2;
        int i3;
        int i4;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f66139a, false, 75399, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f66139a, false, 75399, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0906R.dimen.cf);
        if (this.C) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.layoutBottom.getLayoutParams();
            if (z2) {
                i4 = dimensionPixelSize;
            } else {
                i4 = (int) UIUtils.dip2Px(this, 132.0f);
            }
            layoutParams.height = i4;
            this.layoutBottom.setLayoutParams(layoutParams);
        } else {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.layoutBottom.getLayoutParams();
            if (z2) {
                i2 = dimensionPixelSize;
            } else {
                i2 = (int) UIUtils.dip2Px(this, 132.0f);
            }
            layoutParams2.height = i2;
            if (z2) {
                i3 = 0;
            } else {
                i3 = (int) UIUtils.dip2Px(this, 106.0f);
            }
            layoutParams2.bottomMargin = i3;
            this.layoutBottom.setLayoutParams(layoutParams2);
        }
        if (this.videoEditViewWrapper != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.videoEditViewWrapper.getLayoutParams();
            if (z2) {
                f2 = UIUtils.dip2Px(this, 5.5f) + ((float) dimensionPixelSize);
            } else {
                f2 = 0.0f;
            }
            layoutParams3.bottomMargin = (int) f2;
            this.videoEditViewWrapper.setLayoutParams(layoutParams3);
        }
        if (this.P != null) {
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.P.getLayoutParams();
            if (!z2) {
                dimensionPixelSize = 0;
            }
            layoutParams4.bottomMargin = dimensionPixelSize;
            this.P.setLayoutParams(layoutParams4);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(final boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f66139a, false, 75427, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f66139a, false, 75427, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.saveIcon.setVisibility(8);
        this.cancelIcon.setVisibility(8);
        this.singleEditLayout.setVisibility(8);
        this.videoRecyclerView.setVisibility(0);
        this.flVideoCover.setVisibility(4);
        if (this.l != null && this.k != null) {
            this.videoRecyclerView.getRootView().getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f66163a;

                public final boolean onPreDraw() {
                    if (PatchProxy.isSupport(new Object[0], this, f66163a, false, 75479, new Class[0], Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f66163a, false, 75479, new Class[0], Boolean.TYPE)).booleanValue();
                    }
                    CutMultiVideoActivity.this.videoRecyclerView.getRootView().getViewTreeObserver().removeOnPreDrawListener(this);
                    ArrayList arrayList = new ArrayList();
                    for (int intValue = ((Integer) CutMultiVideoActivity.this.k.first).intValue(); intValue < CutMultiVideoActivity.this.s; intValue++) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        RecyclerView.ViewHolder findViewHolderForAdapterPosition = CutMultiVideoActivity.this.videoRecyclerView.findViewHolderForAdapterPosition(intValue);
                        if (findViewHolderForAdapterPosition != null) {
                            animatorSet.play(ObjectAnimator.ofFloat(findViewHolderForAdapterPosition.itemView, "translationX", new float[]{findViewHolderForAdapterPosition.itemView.getTranslationX(), 0.0f}));
                            animatorSet.setDuration(300);
                            arrayList.add(animatorSet);
                        }
                    }
                    for (int i = CutMultiVideoActivity.this.s + 1; i <= ((Integer) CutMultiVideoActivity.this.k.second).intValue(); i++) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = CutMultiVideoActivity.this.videoRecyclerView.findViewHolderForAdapterPosition(i);
                        if (findViewHolderForAdapterPosition2 != null) {
                            animatorSet2.play(ObjectAnimator.ofFloat(findViewHolderForAdapterPosition2.itemView, "translationX", new float[]{findViewHolderForAdapterPosition2.itemView.getTranslationX(), 0.0f}));
                            animatorSet2.setDuration(300);
                            arrayList.add(animatorSet2);
                        }
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    animatorSet3.play(ObjectAnimator.ofFloat(CutMultiVideoActivity.this.l, "translationX", new float[]{CutMultiVideoActivity.this.l.getTranslationX(), 0.0f})).with(ObjectAnimator.ofFloat(CutMultiVideoActivity.this.l, "translationY", new float[]{CutMultiVideoActivity.this.l.getTranslationY(), 0.0f})).with(ObjectAnimator.ofFloat(CutMultiVideoActivity.this.l, "scaleX", new float[]{CutMultiVideoActivity.this.l.getScaleX(), 1.0f})).with(ObjectAnimator.ofFloat(CutMultiVideoActivity.this.l, "scaleY", new float[]{CutMultiVideoActivity.this.l.getScaleY(), 1.0f}));
                    animatorSet3.setDuration(300);
                    arrayList.add(animatorSet3);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    animatorSet4.playTogether(arrayList);
                    animatorSet4.addListener(new AnimatorListenerAdapter() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f66166a;

                        public final void onAnimationEnd(Animator animator) {
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f66166a, false, 75480, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f66166a, false, 75480, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            super.onAnimationEnd(animator);
                            CutMultiVideoActivity.this.b(true);
                            CutMultiVideoActivity.this.flVideoCover.setVisibility(8);
                            if (z2) {
                                CutMultiVideoActivity.this.v.b(CutMultiVideoActivity.this.v.c().get(CutMultiVideoActivity.this.t).f66495b);
                                CutMultiVideoActivity.this.textureView.postDelayed(new Runnable() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f66168a;

                                    public final void run() {
                                        if (PatchProxy.isSupport(new Object[0], this, f66168a, false, 75481, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], this, f66168a, false, 75481, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        CutMultiVideoActivity.this.f66144f.f66330e = true;
                                        CutMultiVideoActivity.this.animDot.setVisibility(0);
                                        CutMultiVideoActivity.this.u.a();
                                        if (!CutMultiVideoActivity.this.o && CutMultiVideoActivity.this.w != null && !CutMultiVideoActivity.this.w.isPlaying()) {
                                            CutMultiVideoActivity.this.w.resume();
                                        }
                                    }
                                }, 500);
                            } else {
                                CutMultiVideoActivity.this.f66144f.f66330e = true;
                                CutMultiVideoActivity.this.animDot.setVisibility(0);
                            }
                            CutMultiVideoActivity.this.a();
                            CutMultiVideoActivity.this.B = false;
                        }
                    });
                    animatorSet4.start();
                    return false;
                }
            });
        }
    }

    public void onClick(View view) {
        int i2;
        int i3;
        float f2;
        if (PatchProxy.isSupport(new Object[]{view}, this, f66139a, false, 75415, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f66139a, false, 75415, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id != C0906R.id.cxe) {
            if (id == C0906R.id.ayf) {
                if (PatchProxy.isSupport(new Object[0], this, f66139a, false, 75434, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f66139a, false, 75434, new Class[0], Void.TYPE);
                } else {
                    this.speedBtn.toggle();
                    if (this.z == 2) {
                        this.n = this.speedBtn.isChecked();
                    } else {
                        this.m = this.speedBtn.isChecked();
                    }
                    if (this.speedBtn.isChecked()) {
                        if (this.f66141c == null) {
                            this.f66141c = new n((RadioGroup) this.speedBarStub.inflate(), new q(this));
                        }
                        this.f66141c.a(ak.a(this.videoEditView.getCurrentSpeed()));
                        this.f66141c.a(0);
                    } else {
                        if (this.f66141c != null) {
                            this.f66141c.a(8);
                        }
                    }
                }
            } else if (id == C0906R.id.ayd) {
                ak.b();
                float rotation = this.textureView.getRotation() % 360.0f;
                if (rotation == 0.0f || rotation == 90.0f || rotation == 180.0f || rotation == 270.0f || rotation == 360.0f) {
                    if (PatchProxy.isSupport(new Object[0], this, f66139a, false, 75435, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f66139a, false, 75435, new Class[0], Void.TYPE);
                    } else {
                        this.rotateBtn.setEnabled(false);
                        if (this.z == 0) {
                            i3 = this.v.c().get(this.t).g;
                            i2 = this.v.c().get(this.t).h;
                        } else {
                            i3 = this.textureView.getMeasuredWidth();
                            i2 = this.textureView.getMeasuredHeight();
                        }
                        float f3 = 1.0f;
                        if (this.videoEditView.getCurrentRotate() % 180 == 0) {
                            f2 = (((float) i3) * 1.0f) / ((float) i2);
                        } else {
                            f3 = (((float) i3) * 1.0f) / ((float) i2);
                            f2 = 1.0f;
                        }
                        float rotation2 = this.textureView.getRotation() % 360.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                        ofFloat.addUpdateListener(new r(this, rotation2, f3, f2 - f3));
                        ofFloat.addListener(new AnimatorListenerAdapter() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f66175a;

                            public final void onAnimationEnd(Animator animator) {
                                if (PatchProxy.isSupport(new Object[]{animator}, this, f66175a, false, 75484, new Class[]{Animator.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{animator}, this, f66175a, false, 75484, new Class[]{Animator.class}, Void.TYPE);
                                    return;
                                }
                                super.onAnimationEnd(animator);
                                CutMultiVideoActivity.this.u.b();
                                CutMultiVideoActivity.this.rotateBtn.setEnabled(true);
                            }
                        });
                        ofFloat.setDuration(300);
                        ofFloat.start();
                    }
                }
            } else if (id == C0906R.id.aya) {
                m mVar = new m(this);
                if (PatchProxy.isSupport(new Object[]{mVar}, this, f66139a, false, 75437, new Class[]{com.ss.android.ugc.aweme.base.a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{mVar}, this, f66139a, false, 75437, new Class[]{com.ss.android.ugc.aweme.base.a.class}, Void.TYPE);
                } else {
                    Dialog a2 = new a.C0185a(this).b((int) C0906R.string.a4v).b((int) C0906R.string.bd1, (DialogInterface.OnClickListener) null).a((int) C0906R.string.a4f, (DialogInterface.OnClickListener) new t(mVar)).a().a();
                    if (!fc.a() && !com.ss.android.ugc.aweme.app.a.a.a((Activity) this)) {
                        cg.a(a2);
                    }
                    a2.show();
                }
            } else if (id == C0906R.id.ay_) {
                if (!this.B) {
                    this.B = true;
                    ak.c();
                    this.u.c();
                }
            } else if (id == C0906R.id.aye) {
                if (!this.B) {
                    this.B = true;
                    ak.d();
                    this.u.d();
                }
            } else if (id == C0906R.id.ay9) {
                f();
            } else if (id == C0906R.id.d8h) {
                if (PatchProxy.isSupport(new Object[0], this, f66139a, false, 75416, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f66139a, false, 75416, new Class[0], Void.TYPE);
                } else if (!this.I) {
                    this.I = true;
                    Pair<Long, Long> multiVideoPlayBoundary = this.videoEditView.getMultiVideoPlayBoundary();
                    List<String> finalPathes = this.videoEditView.getFinalPathes();
                    h();
                    final com.ss.android.ugc.aweme.shortvideo.view.d b2 = com.ss.android.ugc.aweme.shortvideo.view.d.b(this, getResources().getString(C0906R.string.c83));
                    b2.setIndeterminate(false);
                    al alVar = new al((com.ss.android.ugc.aweme.shortvideo.cut.model.a) this.v.r.getValue(), this.f66142d, multiVideoPlayBoundary, finalPathes, new com.ss.android.medialib.e() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f66153a;

                        /* renamed from: b  reason: collision with root package name */
                        int f66154b;

                        public final void a(int i) {
                            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f66153a, false, 75473, new Class[]{Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f66153a, false, 75473, new Class[]{Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            if (i != this.f66154b) {
                                this.f66154b = i;
                                com.ss.android.b.a.a.a.b(new ab(this, b2, i));
                            }
                        }
                    });
                    this.N = alVar;
                    this.N.f66365d = this.E;
                    this.N.f66364c = new al.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f66157a;

                        public final void a(final int i) {
                            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f66157a, false, 75475, new Class[]{Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f66157a, false, 75475, new Class[]{Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            com.ss.android.b.a.a.a.b(new Runnable() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f66160a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f66160a, false, 75478, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f66160a, false, 75478, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    com.ss.android.ugc.aweme.port.in.a.a(new hm().a());
                                    bc.b(b2);
                                    if (i == 0) {
                                        CutMultiVideoActivity cutMultiVideoActivity = CutMultiVideoActivity.this;
                                        if (PatchProxy.isSupport(new Object[0], cutMultiVideoActivity, CutMultiVideoActivity.f66139a, false, 75419, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], cutMultiVideoActivity, CutMultiVideoActivity.f66139a, false, 75419, new Class[0], Void.TYPE);
                                        } else {
                                            Intent intent = new Intent();
                                            intent.putExtra("send_to_user_head", cutMultiVideoActivity.getIntent().getSerializableExtra("send_to_user_head"));
                                            intent.putExtra("enter_from", cutMultiVideoActivity.getIntent().getStringExtra("enter_from"));
                                            intent.putExtra("workspace", cutMultiVideoActivity.f66142d);
                                            intent.putExtra("mp4", cutMultiVideoActivity.f66142d.c().getAbsolutePath());
                                            intent.putExtra("dir", ff.f67717f);
                                            intent.putExtra("wav", cutMultiVideoActivity.f66142d.d().getPath());
                                            intent.putExtra("shoot_way", cutMultiVideoActivity.getIntent().getStringExtra("shoot_way"));
                                            intent.putExtra("enable_music_path_check", false);
                                            intent.putExtra("fromMultiCut", true);
                                            intent.putExtra("origin", 0);
                                            String stringExtra = cutMultiVideoActivity.getIntent().getStringExtra("creation_id");
                                            intent.putExtra("creation_id", stringExtra);
                                            intent.putExtra("poi_struct_in_tools_line", cutMultiVideoActivity.getIntent().getStringExtra("poi_struct_in_tools_line"));
                                            com.ss.android.ugc.aweme.tools.a.g.a(cutMultiVideoActivity.getIntent(), intent, com.ss.android.ugc.aweme.tools.a.e.CUT, com.ss.android.ugc.aweme.tools.a.e.EDIT);
                                            List<h> b2 = cutMultiVideoActivity.v.b();
                                            if (b2 != null) {
                                                StringBuilder sb = new StringBuilder();
                                                for (h next : b2) {
                                                    if (!TextUtils.isEmpty(next.n)) {
                                                        sb.append(next.n);
                                                        sb.append(";");
                                                    }
                                                }
                                                String sb2 = sb.toString();
                                                if (!TextUtils.isEmpty(sb2)) {
                                                    intent.putExtra("poi_data_in_tools_line", sb2.substring(0, sb2.length() - 1));
                                                }
                                            }
                                            if (cutMultiVideoActivity.q != null) {
                                                intent.putExtra("challenge", (Serializable) Collections.singletonList(cutMultiVideoActivity.q));
                                            }
                                            intent.putExtra("origin", 0);
                                            intent.putExtra("upload_video_type", cutMultiVideoActivity.C);
                                            intent.putExtra("micro_app_id", cutMultiVideoActivity.x);
                                            intent.putExtra("micro_app_info", cutMultiVideoActivity.y);
                                            intent.putExtra("av_et_parameter", cutMultiVideoActivity.getIntent().getSerializableExtra("av_et_parameter"));
                                            intent.putExtra("shoot_mode", cutMultiVideoActivity.getIntent().getIntExtra("shoot_mode", -1));
                                            intent.putExtra("story_mediaType", 1);
                                            intent.putExtra("enter_record_from_other_platform", cutMultiVideoActivity.D);
                                            if (cutMultiVideoActivity.y != null && !TextUtils.isEmpty(cutMultiVideoActivity.y.getExtra())) {
                                                PublishExtra publishExtra = (PublishExtra) com.ss.android.ugc.aweme.port.in.a.f61120c.fromJson(cutMultiVideoActivity.y.getExtra(), PublishExtra.class);
                                                if (publishExtra != null && !CollectionUtils.isEmpty(publishExtra.getVideoTopics())) {
                                                    StringBuilder sb3 = new StringBuilder();
                                                    for (String append : publishExtra.getVideoTopics()) {
                                                        sb3.append("#");
                                                        sb3.append(append);
                                                        sb3.append(" ");
                                                    }
                                                    intent.putExtra("video_title", sb3.toString());
                                                }
                                            }
                                            intent.putExtra("extra_share_context", cutMultiVideoActivity.getIntent().getSerializableExtra("extra_share_context"));
                                            intent.putExtra("extra_share_app_name", cutMultiVideoActivity.getIntent().getStringExtra("extra_share_app_name"));
                                            List<h> b3 = cutMultiVideoActivity.v.b();
                                            if (b3 != null) {
                                                StringBuilder sb4 = new StringBuilder();
                                                for (h next2 : b3) {
                                                    if (!TextUtils.isEmpty(next2.o)) {
                                                        sb4.append(next2.o);
                                                        sb4.append(",");
                                                    }
                                                }
                                                String sb5 = sb4.toString();
                                                if (!TextUtils.isEmpty(sb5)) {
                                                    intent.putExtra("md5", sb5.substring(0, sb5.length() - 1));
                                                }
                                            }
                                            if (!cutMultiVideoActivity.r) {
                                                cutMultiVideoActivity.f66142d.f();
                                                ej.a().a((com.ss.android.ugc.aweme.shortvideo.e) null);
                                            }
                                            com.ss.android.ugc.aweme.port.in.a.i.f().a(cutMultiVideoActivity.f66142d.c().getAbsolutePath(), stringExtra);
                                            if (cutMultiVideoActivity.D || TextUtils.equals(cutMultiVideoActivity.getIntent().getStringExtra("enter_from"), "from_chat")) {
                                                if (TextUtils.equals(cutMultiVideoActivity.getIntent().getStringExtra("enter_from"), "from_chat")) {
                                                    intent.putExtra("extra_request_code", 4);
                                                }
                                                if (com.ss.android.ugc.aweme.story.shootvideo.d.a(intent.getIntExtra("shoot_mode", -1))) {
                                                    ((IAVService) ServiceManager.get().getService(IAVService.class)).startStoryEditActivity(cutMultiVideoActivity, intent);
                                                } else {
                                                    VEVideoPublishEditActivity.a((Activity) cutMultiVideoActivity, intent, 1);
                                                }
                                            } else if (com.ss.android.ugc.aweme.story.shootvideo.d.a(intent.getIntExtra("shoot_mode", -1))) {
                                                ((IAVService) ServiceManager.get().getService(IAVService.class)).startStoryEditActivity(cutMultiVideoActivity, intent);
                                            } else {
                                                VEVideoPublishEditActivity.a((Context) cutMultiVideoActivity, intent, 1);
                                            }
                                        }
                                    } else {
                                        CutMultiVideoActivity cutMultiVideoActivity2 = CutMultiVideoActivity.this;
                                        com.bytedance.ies.dmt.ui.d.a.b((Context) cutMultiVideoActivity2, "合成失败 " + i).a();
                                    }
                                }
                            });
                            CutMultiVideoActivity.this.I = false;
                        }

                        public final void b(int i) {
                            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f66157a, false, 75476, new Class[]{Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f66157a, false, 75476, new Class[]{Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            CutMultiVideoActivity.this.I = false;
                            t.a().post(new ac(this, b2, i));
                        }
                    };
                    com.ss.android.b.a.a.a.a(this.N);
                }
            }
        } else if (this.playIcon.getVisibility() == 0) {
            this.o = false;
            i();
        } else {
            this.o = true;
            h();
        }
    }

    public void onCreate(Bundle bundle) {
        List list;
        boolean z2;
        ExecutorService executorService;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        boolean z5;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f66139a, false, 75392, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f66139a, false, 75392, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoActivity", "onCreate", true);
        super.onCreate(bundle);
        if (getIntent() == null) {
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoActivity", "onCreate", false);
            return;
        }
        List<com.ss.android.ugc.aweme.music.b.a.a> list2 = null;
        if (com.ss.android.ugc.aweme.mediachoose.a.d.a() == null) {
            list = null;
        } else {
            list = com.ss.android.ugc.aweme.mediachoose.a.d.a().c();
        }
        String stringExtra = getIntent().getStringExtra("file_path");
        if (getIntent().hasExtra("open_sdk_import_media_list")) {
            list = getIntent().getParcelableArrayListExtra("open_sdk_import_media_list");
        }
        List list3 = list;
        if (!Lists.isEmpty(list3) || !TextUtils.isEmpty(stringExtra)) {
            if (list3 != null && list3.size() > 1) {
                this.C = true;
                setContentView((int) C0906R.layout.ay);
            } else if (fc.a()) {
                setContentView((int) C0906R.layout.b0);
            } else {
                setContentView((int) C0906R.layout.az);
            }
            if (fc.a()) {
                getWindow().clearFlags(1024);
                if (ToolUtils.isFlyme()) {
                    StatusBarUtils.setTranslucent(this);
                } else {
                    StatusBarUtils.setTransparent(this);
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    getWindow().setNavigationBarColor(-16777216);
                }
            } else if (getIntent() == null || com.ss.android.ugc.aweme.story.shootvideo.d.a(getIntent().getIntExtra("shoot_mode", -1))) {
                getWindow().clearFlags(1024);
            } else if (!com.ss.android.ugc.aweme.app.a.a.a((Activity) this)) {
                if (PatchProxy.isSupport(new Object[]{this}, null, cg.f67167a, true, 76586, new Class[]{Activity.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{this}, null, cg.f67167a, true, 76586, new Class[]{Activity.class}, Void.TYPE);
                } else {
                    cg.a(getWindow());
                }
            }
            this.p = fc.b(this);
            if (bundle2 == null) {
                this.f66142d = d.a();
            } else {
                this.f66142d = (d) bundle2.getParcelable("workspace");
            }
            Intent intent = getIntent();
            if (PatchProxy.isSupport(new Object[]{intent}, this, f66139a, false, 75395, new Class[]{Intent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{intent}, this, f66139a, false, 75395, new Class[]{Intent.class}, Void.TYPE);
            } else {
                this.f66143e = new ArrayList();
                this.u = (CutMultiVideoViewModel) ViewModelProviders.of((FragmentActivity) this).get(CutMultiVideoViewModel.class);
                this.v = (VideoEditViewModel) ViewModelProviders.of((FragmentActivity) this).get(VideoEditViewModel.class);
                this.x = intent.getStringExtra("micro_app_id");
                this.y = (q) intent.getSerializableExtra("micro_app_info");
                this.M = intent.getSerializableExtra("micro_app_class");
                if (intent.getBooleanExtra("enter_record_from_other_platform", false) || this.y != null || !TextUtils.isEmpty(this.x)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.D = z5;
                this.E = intent.getLongExtra("min_duration", ff.a());
                if (com.ss.android.g.a.b()) {
                    this.videoEditView.setMaxVideoLength(60000);
                }
                if (com.ss.android.ugc.aweme.mediachoose.a.d.a() != null) {
                    list2 = com.ss.android.ugc.aweme.mediachoose.a.d.a().c();
                }
                String stringExtra2 = getIntent().getStringExtra("file_path");
                if (getIntent().hasExtra("open_sdk_import_media_list")) {
                    list2 = getIntent().getParcelableArrayListExtra("open_sdk_import_media_list");
                }
                if (TextUtils.isEmpty(stringExtra2)) {
                    for (com.ss.android.ugc.aweme.music.b.a.a aVar : list2) {
                        this.f66143e.add(aVar.f56315e);
                    }
                } else if (FFMpegManager.a().a(stringExtra2)[0] == 0) {
                    this.f66143e.add(stringExtra2);
                    FFMpegManager.a().b();
                } else {
                    FFMpegManager.a().b();
                }
                String stringExtra3 = intent.getStringExtra("path");
                if (!TextUtils.isEmpty(stringExtra3)) {
                    this.f66142d.a(new File(stringExtra3));
                }
                if (intent.hasExtra("av_challenge")) {
                    this.q = (c) intent.getSerializableExtra("av_challenge");
                }
                this.r = intent.getBooleanExtra("from_music_detail", false);
            }
            if (Lists.isEmpty(this.f66143e)) {
                finish();
                ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoActivity", "onCreate", false);
                return;
            }
            if (PatchProxy.isSupport(new Object[]{list3, stringExtra}, this, f66139a, false, 75396, new Class[]{List.class, String.class}, Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{list3, stringExtra}, this, f66139a, false, 75396, new Class[]{List.class, String.class}, Boolean.TYPE)).booleanValue();
            } else {
                if (getIntent() != null && com.ss.android.ugc.aweme.story.shootvideo.d.a(getIntent().getIntExtra("shoot_mode", -1))) {
                    this.videoEditView.setMinVideoLength(1000);
                    this.videoEditView.setMaxVideoLength(10000);
                    this.next.setBackgroundResource(2130838236);
                    if (this.next instanceof TextView) {
                        ((TextView) this.next).setTextColor(ContextCompat.getColor(this, C0906R.color.a6j));
                    }
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    z3 = this.videoEditView.a((FragmentActivity) this, this.u, list3);
                } else {
                    z3 = this.videoEditView.a((FragmentActivity) this, this.u, stringExtra);
                }
                if (!z3) {
                    z2 = false;
                } else {
                    if (getIntent() == null || !com.ss.android.ugc.aweme.story.shootvideo.d.a(getIntent().getIntExtra("shoot_mode", -1))) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.J = z4;
                    this.v = this.videoEditView.getVideoEditViewModel();
                    this.s = 0;
                    this.t = 0;
                    this.z = this.videoEditView.getEditState();
                    findViewById(C0906R.id.ay9).setOnClickListener(this);
                    findViewById(C0906R.id.d8h).setOnClickListener(this);
                    this.textureView.setOnClickListener(this);
                    this.speedBtn.setOnClickListener(this);
                    this.rotateBtn.setOnClickListener(this);
                    this.deleteBtn.setOnClickListener(this);
                    this.textureView.setSurfaceTextureListener(this);
                    this.cancelIcon.setOnClickListener(this);
                    this.saveIcon.setOnClickListener(this);
                    ImageView imageView = this.rotateBtn;
                    if (this.z == 0) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    imageView.setVisibility(i2);
                    this.deleteBtn.setVisibility(8);
                    this.tvTimeSelected.setText(getResources().getString(C0906R.string.bd9, new Object[]{Double.valueOf(0.0d)}));
                    if (com.ss.android.g.a.b() && this.z != 0) {
                        this.back.setImageResource(2130839698);
                    }
                    CheckableImageButton checkableImageButton = this.speedBtn;
                    if (this.J) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    checkableImageButton.setVisibility(i3);
                    ak.a((View) this.editVideoCover);
                    if (PatchProxy.isSupport(new Object[0], this, f66139a, false, 75401, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f66139a, false, 75401, new Class[0], Void.TYPE);
                    } else if (this.z == 0) {
                        this.tvVideoSegDes.setVisibility(8);
                        findViewById(C0906R.id.drn).setVisibility(8);
                    } else {
                        this.tvVideoSegDes.setVisibility(0);
                        findViewById(C0906R.id.drn).setVisibility(0);
                        this.tvVideoSegDes.setShadowLayer(2.0f, 0.0f, 0.0f, getResources().getColor(C0906R.color.a2f));
                        this.f66144f = new VideoSegmentAdapter(this.v, this.u, this.v.b());
                        this.videoRecyclerView.setLayoutManager(new LinearLayoutManager(this, 0, false));
                        this.videoRecyclerView.setAdapter(this.f66144f);
                        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
                        defaultItemAnimator.setRemoveDuration(300);
                        defaultItemAnimator.setChangeDuration(300);
                        defaultItemAnimator.setMoveDuration(300);
                        defaultItemAnimator.setAddDuration(300);
                        this.videoRecyclerView.setItemAnimator(defaultItemAnimator);
                        this.f66144f.notifyDataSetChanged();
                        this.f66144f.f66329d = new o(this);
                        this.videoRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f66149a;

                            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f66149a, false, 75469, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f66149a, false, 75469, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                super.onScrollStateChanged(recyclerView, i);
                            }

                            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f66149a, false, 75470, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f66149a, false, 75470, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                super.onScrolled(recyclerView, i, i2);
                                if (i != 0) {
                                    int a2 = CutMultiVideoActivity.this.f66144f.a(CutMultiVideoActivity.this.videoRecyclerView, CutMultiVideoActivity.this.f66144f.f66328c);
                                    if (a2 == -1) {
                                        CutMultiVideoActivity.this.animDot.setVisibility(4);
                                        return;
                                    }
                                    CutMultiVideoActivity.this.animDot.setVisibility(0);
                                    CutMultiVideoActivity.this.animDot.setX((float) a2);
                                }
                            }
                        });
                    }
                    if (PatchProxy.isSupport(new Object[0], this, f66139a, false, 75400, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f66139a, false, 75400, new Class[0], Void.TYPE);
                    } else if (this.z == 0) {
                        int[] a2 = FFMpegManager.a().a(this.v.c().get(0).f66495b);
                        if (a2[0] == 0) {
                            this.v.c().get(0).g = a2[2];
                            this.v.c().get(0).h = a2[3];
                            if (fc.a()) {
                                fb.a((View) this.textureView, (Context) this, a2[2], a2[3]);
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.layoutBottom.getLayoutParams();
                                layoutParams.height = (int) UIUtils.dip2Px(this, 58.0f);
                                this.layoutBottom.setLayoutParams(layoutParams);
                                b();
                            } else {
                                fb.b(this.textureView, this.v.c().get(0).g, this.v.c().get(0).h);
                            }
                        } else {
                            finish();
                        }
                        FFMpegManager.a().b();
                    }
                    if (fc.a()) {
                        this.O = (RelativeLayout) findViewById(C0906R.id.a07);
                        this.P = (RelativeLayout) findViewById(C0906R.id.a06);
                        if (!(this.P == null && this.O == null)) {
                            this.P.setVisibility(0);
                            this.O.setVisibility(0);
                        }
                        if (this.layoutTop != null) {
                            if (this.C) {
                                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.layoutTop.getLayoutParams();
                                layoutParams2.topMargin = fc.c(this);
                                this.layoutTop.setLayoutParams(layoutParams2);
                            } else {
                                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.layoutTop.getLayoutParams();
                                layoutParams3.topMargin = ((int) UIUtils.dip2Px(this, 25.0f)) + fc.c(this);
                                this.layoutTop.setLayoutParams(layoutParams3);
                            }
                        }
                    }
                    new cv(this).a(new d(this));
                    z2 = true;
                }
            }
            if (!z2) {
                finish();
                ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoActivity", "onCreate", false);
                return;
            }
            if (PatchProxy.isSupport(new Object[0], this, f66139a, false, 75393, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66139a, false, 75393, new Class[0], Void.TYPE);
            } else {
                this.F = new j<>();
                this.w = new IESMediaPlayer(getApplicationContext());
                if (PatchProxy.isSupport(new Object[0], null, ad.f66348a, true, 75485, new Class[0], ExecutorService.class)) {
                    executorService = (ExecutorService) PatchProxy.accessDispatch(new Object[0], null, ad.f66348a, true, 75485, new Class[0], ExecutorService.class);
                } else {
                    executorService = com.ss.android.ugc.aweme.thread.h.a(m.a(p.FIXED).a(1).a());
                }
                executorService.execute(new c(this));
            }
            if (PatchProxy.isSupport(new Object[0], this, f66139a, false, 75402, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66139a, false, 75402, new Class[0], Void.TYPE);
            } else {
                if (this.z != 0) {
                    this.u.f66180b.observe(this, new u(this));
                    this.v.s = new VideoEditViewModel.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f66151a;

                        public final void a(h hVar) {
                            h hVar2 = hVar;
                            if (PatchProxy.isSupport(new Object[]{hVar2}, this, f66151a, false, 75471, new Class[]{h.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{hVar2}, this, f66151a, false, 75471, new Class[]{h.class}, Void.TYPE);
                                return;
                            }
                            CutMultiVideoActivity.this.f66144f.a(hVar2);
                        }

                        public final void b(h hVar) {
                            h hVar2 = hVar;
                            if (PatchProxy.isSupport(new Object[]{hVar2}, this, f66151a, false, 75472, new Class[]{h.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{hVar2}, this, f66151a, false, 75472, new Class[]{h.class}, Void.TYPE);
                                return;
                            }
                            CutMultiVideoActivity.this.f66144f.b(hVar2);
                        }
                    };
                }
                this.v.f66561b.observe(this, new v(this));
                this.v.f66562c.observe(this, new w(this));
                this.v.f66564e.observe(this, new x(this));
                this.v.f66563d.observe(this, new y(this));
                this.v.f66565f.observe(this, new z(this));
                this.v.g.observe(this, new aa(this));
                this.v.k.observe(this, new e(this));
                this.v.m.observe(this, new f(this));
                this.v.n.observe(this, new g(this));
                this.v.o.observe(this, new h(this));
                this.v.p.observe(this, new i(this));
                this.v.q.observe(this, new j(this));
            }
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoActivity", "onCreate", false);
            return;
        }
        finish();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoActivity", "onCreate", false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i2, String str) {
        if (this.z != 2) {
            this.A = true;
            this.s = i2;
            this.t = this.v.a(str);
            this.u.a(this.s, this.t);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        int i4 = i2;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f66139a, false, 75439, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f66139a, false, 75439, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        if (i4 == 1002) {
            Intent intent3 = new Intent();
            if (!(intent2 == null || intent.getExtras() == null)) {
                String string = intent.getExtras().getString("edit result");
                intent3.putExtra("record result", "RecordActivity return success " + string);
            }
            setResult(-1, intent3);
            finish();
            return;
        }
        if (i4 == 4 && i3 == 7) {
            setResult(7, intent2);
            finish();
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        SurfaceTexture surfaceTexture2 = surfaceTexture;
        if (PatchProxy.isSupport(new Object[]{surfaceTexture2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f66139a, false, 75410, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceTexture2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f66139a, false, 75410, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.G) {
            this.w.start(new Surface(surfaceTexture));
            this.w.seek(this.w.getCurrentPosition());
            if (this.o) {
                this.w.pause();
            }
        } else {
            this.F.f1091a.a((g<TResult, TContinuationResult>) new l<TResult,TContinuationResult>(this, surfaceTexture), i.f1052b);
        }
    }
}
