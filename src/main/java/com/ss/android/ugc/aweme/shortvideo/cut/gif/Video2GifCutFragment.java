package com.ss.android.ugc.aweme.shortvideo.cut.gif;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.util.Pair;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.FFMpegManager;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.mediaplayer.MediaPlayerModule;
import com.ss.android.ugc.aweme.mediaplayer.MediaPlayerState;
import com.ss.android.ugc.aweme.mediaplayer.b;
import com.ss.android.ugc.aweme.mediaplayer.h;
import com.ss.android.ugc.aweme.share.b.a;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.ea;
import com.ss.android.ugc.aweme.tools.am;
import com.ss.android.ugc.aweme.utils.dp;
import java.util.Locale;

public class Video2GifCutFragment extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66407a;
    private static final double i = ((double) am.FAST.value());

    /* renamed from: b  reason: collision with root package name */
    boolean f66408b;

    /* renamed from: c  reason: collision with root package name */
    public MediaPlayerModule f66409c;

    /* renamed from: d  reason: collision with root package name */
    public CutMultiVideoViewModel f66410d;

    /* renamed from: e  reason: collision with root package name */
    public VideoEditViewModel f66411e;

    /* renamed from: f  reason: collision with root package name */
    public a f66412f;
    @BindView(2131493177)
    FrameLayout flVideoContainer;
    public Handler g = new Handler(Looper.getMainLooper()) {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66413a;

        public final void handleMessage(Message message) {
            if (PatchProxy.isSupport(new Object[]{message}, this, f66413a, false, 75827, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message}, this, f66413a, false, 75827, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            super.handleMessage(message);
            if (message.what == 0) {
                Video2GifCutFragment.this.f66410d.a(((Long) message.obj).longValue(), Video2GifCutFragment.this.f66411e.b());
            }
        }
    };
    public Runnable h = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66415a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f66415a, false, 75828, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66415a, false, 75828, new Class[0], Void.TYPE);
            } else if (Video2GifCutFragment.this.f66409c != null) {
                Video2GifCutFragment.this.g.obtainMessage(0, Long.valueOf(Video2GifCutFragment.this.f66409c.f3566c.f())).sendToTarget();
                Video2GifCutFragment.this.g.postDelayed(Video2GifCutFragment.this.h, 30);
            }
        }
    };
    @BindView(2131493505)
    ImageView ivPlay;
    private Observer<MediaPlayerState> j = new a(this);
    @BindView(2131493782)
    TextureView textureVideoView;
    @BindView(2131493885)
    DmtTextView tvSelectedTime;
    @BindView(2131493909)
    VideoEditView videoEditView;

    public void onHiddenChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f66407a, false, 75816, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f66407a, false, 75816, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f66407a, false, 75818, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66407a, false, 75818, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f66407a, false, 75817, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66407a, false, 75817, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f66407a, false, 75819, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f66407a, false, 75819, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f66407a, false, 75815, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66407a, false, 75815, new Class[0], Void.TYPE);
            return;
        }
        if (getActivity() != null) {
            UIUtils.displayToast((Context) getActivity(), (int) C0906R.string.bn3);
            getActivity().finish();
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f66407a, false, 75811, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66407a, false, 75811, new Class[0], Void.TYPE);
            return;
        }
        this.tvSelectedTime.setText(getString(C0906R.string.bd9, String.format(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(this.videoEditView.getSelectedTime())})));
        Pair<Long, Long> singleVideoPlayBoundary = this.videoEditView.getSingleVideoPlayBoundary();
        if (!(singleVideoPlayBoundary == null || singleVideoPlayBoundary.first == null || singleVideoPlayBoundary.second == null)) {
            this.f66412f.n = ((Long) singleVideoPlayBoundary.first).longValue();
            this.f66412f.o = ((Long) singleVideoPlayBoundary.second).longValue();
        }
    }

    public static Video2GifCutFragment a(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f66407a, true, 75799, new Class[]{a.class}, Video2GifCutFragment.class)) {
            return (Video2GifCutFragment) PatchProxy.accessDispatch(new Object[]{aVar2}, null, f66407a, true, 75799, new Class[]{a.class}, Video2GifCutFragment.class);
        }
        Video2GifCutFragment video2GifCutFragment = new Video2GifCutFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_edit_context", aVar2);
        video2GifCutFragment.setArguments(bundle);
        return video2GifCutFragment;
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131493782})
    public void resolveUiClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f66407a, false, 75803, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f66407a, false, 75803, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view.getId() == C0906R.id.d28) {
            MediaPlayerModule mediaPlayerModule = this.f66409c;
            if (PatchProxy.isSupport(new Object[0], mediaPlayerModule, MediaPlayerModule.f3564a, false, 58674, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], mediaPlayerModule, MediaPlayerModule.f3564a, false, 58674, new Class[0], Void.TYPE);
            } else if (mediaPlayerModule.f3568e) {
                mediaPlayerModule.f3567d = true;
                mediaPlayerModule.b();
            } else {
                mediaPlayerModule.f3567d = false;
                mediaPlayerModule.a();
            }
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f66407a, false, 75800, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f66407a, false, 75800, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (PatchProxy.isSupport(new Object[0], this, f66407a, false, 75804, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66407a, false, 75804, new Class[0], Void.TYPE);
        } else if (getActivity() == null) {
            b();
        } else {
            this.f66410d = (CutMultiVideoViewModel) ViewModelProviders.of(getActivity()).get(CutMultiVideoViewModel.class);
            this.f66411e = (VideoEditViewModel) ViewModelProviders.of(getActivity()).get(VideoEditViewModel.class);
            this.f66412f = (a) getArguments().getParcelable("extra_edit_context");
            if (this.f66412f == null) {
                b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Boolean bool) {
        boolean z;
        if (bool == null || !bool.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        this.f66408b = z;
        if (bool == null || !bool.booleanValue()) {
            MediaPlayerModule mediaPlayerModule = this.f66409c;
            if (PatchProxy.isSupport(new Object[0], mediaPlayerModule, MediaPlayerModule.f3564a, false, 58676, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], mediaPlayerModule, MediaPlayerModule.f3564a, false, 58676, new Class[0], Void.TYPE);
                return;
            }
            mediaPlayerModule.a();
        } else {
            MediaPlayerModule mediaPlayerModule2 = this.f66409c;
            if (PatchProxy.isSupport(new Object[0], mediaPlayerModule2, MediaPlayerModule.f3564a, false, 58675, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], mediaPlayerModule2, MediaPlayerModule.f3564a, false, 58675, new Class[0], Void.TYPE);
            } else {
                mediaPlayerModule2.b();
            }
        }
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        h hVar;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f66407a, false, 75802, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f66407a, false, 75802, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        ButterKnife.bind((Object) this, view);
        if (PatchProxy.isSupport(new Object[0], this, f66407a, false, 75805, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66407a, false, 75805, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.textureVideoView.setClipToOutline(true);
            this.textureVideoView.setOutlineProvider(new dp(u.a(4.0d)));
        }
        if (PatchProxy.isSupport(new Object[0], this, f66407a, false, 75814, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66407a, false, 75814, new Class[0], Void.TYPE);
        } else {
            this.flVideoContainer.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f66417a;

                public final void onGlobalLayout() {
                    int i;
                    if (PatchProxy.isSupport(new Object[0], this, f66417a, false, 75829, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f66417a, false, 75829, new Class[0], Void.TYPE);
                    } else if (Video2GifCutFragment.this.f66412f != null) {
                        Video2GifCutFragment.this.flVideoContainer.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        int height = Video2GifCutFragment.this.flVideoContainer.getHeight();
                        int width = Video2GifCutFragment.this.flVideoContainer.getWidth();
                        int[] a2 = FFMpegManager.a().a(Video2GifCutFragment.this.f66412f.f64703b);
                        if (a2[0] == 0) {
                            int i2 = a2[2];
                            int i3 = a2[3];
                            Video2GifCutFragment.this.f66412f.h = i2;
                            Video2GifCutFragment.this.f66412f.i = i3;
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                            if (i2 < i3) {
                                layoutParams.width = (i2 * height) / i3;
                                layoutParams.height = height;
                                layoutParams.leftMargin = (width - layoutParams.width) / 2;
                                layoutParams.topMargin = 0;
                            } else {
                                layoutParams.width = width;
                                layoutParams.height = (i3 * width) / i2;
                                layoutParams.topMargin = (height - layoutParams.height) / 2;
                                if (layoutParams.topMargin >= 0) {
                                    i = layoutParams.topMargin;
                                } else {
                                    i = 0;
                                }
                                layoutParams.topMargin = i;
                                layoutParams.leftMargin = 0;
                            }
                            if (Build.VERSION.SDK_INT >= 17) {
                                layoutParams.setMarginStart(layoutParams.leftMargin);
                            }
                            Video2GifCutFragment.this.f66412f.j = layoutParams.width;
                            Video2GifCutFragment.this.f66412f.k = layoutParams.height;
                            Video2GifCutFragment.this.flVideoContainer.setLayoutParams(layoutParams);
                        }
                        FFMpegManager.a().b();
                    }
                }
            });
        }
        this.videoEditView.setMinVideoLength(2000);
        this.videoEditView.setMaxVideoLength(ea.f66827f);
        if (this.videoEditView.a(getActivity(), this.f66410d, this.f66412f.f64703b) || getActivity() == null) {
            if (PatchProxy.isSupport(new Object[0], this, f66407a, false, 75807, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66407a, false, 75807, new Class[0], Void.TYPE);
            } else {
                this.f66411e.f66562c.observe(this, new b(this));
                this.f66411e.f66564e.observe(this, new c(this));
                this.f66411e.f66563d.observe(this, new d(this));
                this.f66411e.f66565f.observe(this, new e(this));
                this.f66411e.g.observe(this, new f(this));
                this.f66411e.k.observe(this, new g(this));
            }
            try {
                b bVar = new b(getActivity());
                if (PatchProxy.isSupport(new Object[0], this, f66407a, false, 75806, new Class[0], h.class)) {
                    hVar = (h) PatchProxy.accessDispatch(new Object[0], this, f66407a, false, 75806, new Class[0], h.class);
                } else {
                    hVar = new h();
                    hVar.f55348c = true;
                    hVar.f55346a = (float) i;
                    hVar.f55347b = 0.0f;
                    hVar.f55350e = this.videoEditView.getMaxCutDuration();
                }
                this.f66409c = new MediaPlayerModule(bVar, hVar);
                this.f66409c.f3565b = this.f66412f.f64703b;
                this.f66409c.i.observe(this, this.j);
                MediaPlayerModule mediaPlayerModule = this.f66409c;
                TextureView textureView = this.textureVideoView;
                if (PatchProxy.isSupport(new Object[]{textureView, (byte) 0}, mediaPlayerModule, MediaPlayerModule.f3564a, false, 58673, new Class[]{TextureView.class, Boolean.TYPE}, Void.TYPE)) {
                    MediaPlayerModule mediaPlayerModule2 = mediaPlayerModule;
                    PatchProxy.accessDispatch(new Object[]{textureView, (byte) 0}, mediaPlayerModule2, MediaPlayerModule.f3564a, false, 58673, new Class[]{TextureView.class, Boolean.TYPE}, Void.TYPE);
                } else {
                    mediaPlayerModule.h = textureView.getSurfaceTextureListener();
                    textureView.setSurfaceTextureListener(mediaPlayerModule);
                }
                getLifecycle().addObserver(this.f66409c);
            } catch (Exception unused) {
                b();
            }
        } else {
            getActivity().finish();
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f66407a, false, 75801, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.r9, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f66407a, false, 75801, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
