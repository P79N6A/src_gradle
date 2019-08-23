package com.ss.android.ugc.aweme.shortvideo.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.Space;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.google.common.collect.az;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ac.b;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.anim.a;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.l;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.q;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.j;
import com.ss.android.ugc.aweme.mediachoose.k;
import com.ss.android.ugc.aweme.music.adapter.MusicMixAdapter;
import com.ss.android.ugc.aweme.music.b.a;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.ui.FlyChangeView;
import com.ss.android.ugc.aweme.music.ui.MusicListFragment;
import com.ss.android.ugc.aweme.music.ui.MusicTabListFragment;
import com.ss.android.ugc.aweme.music.ui.e;
import com.ss.android.ugc.aweme.music.ui.p;
import com.ss.android.ugc.aweme.music.util.b;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.photo.IPhotoService;
import com.ss.android.ugc.aweme.shortvideo.fragment.OnlineMusicFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicListModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.presenter.c;
import com.ss.android.ugc.aweme.shortvideo.presenter.d;
import com.ss.android.ugc.aweme.shortvideo.util.ah;
import com.ss.android.ugc.aweme.u.aj;
import com.ss.android.ugc.aweme.u.ak;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.greenrobot.eventbus.Subscribe;

public class ChooseMusicActivity extends AmeActivity implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4025a;

    /* renamed from: b  reason: collision with root package name */
    int f4026b;
    @BindView(2131493223)
    FrameLayout background;

    /* renamed from: c  reason: collision with root package name */
    Challenge f4027c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4028d;
    @BindView(2131498502)
    View dividerView;

    /* renamed from: e  reason: collision with root package name */
    public PhotoMovieContext f4029e;

    /* renamed from: f  reason: collision with root package name */
    a f4030f = new a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70456a;

        public final void a(com.ss.android.ugc.aweme.music.b.a.a aVar) {
            com.ss.android.ugc.aweme.music.b.a.a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{aVar2}, this, f70456a, false, 80181, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar2}, this, f70456a, false, 80181, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE);
                return;
            }
            ChooseMusicActivity.this.a(aVar2.f56315e);
        }

        public final void a(PhotoMovieContext photoMovieContext) {
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{photoMovieContext}, this, f70456a, false, 80180, new Class[]{PhotoMovieContext.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{photoMovieContext}, this, f70456a, false, 80180, new Class[]{PhotoMovieContext.class}, Void.TYPE);
                return;
            }
            if (photoMovieContext != null) {
                i = photoMovieContext.getImageCount();
            }
            ChooseMusicActivity.this.f4029e = photoMovieContext;
            ChooseMusicActivity.this.a(i);
        }
    };
    k g = new k() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70458a;

        public final void a(List<com.ss.android.ugc.aweme.music.b.a.a> list) {
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{list}, this, f70458a, false, 80168, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f70458a, false, 80168, new Class[]{List.class}, Void.TYPE);
                return;
            }
            if (list != null) {
                i = list.size();
            }
            ChooseMusicActivity.this.a(i);
        }
    };
    private boolean h = true;
    private boolean i = true;
    private d j;
    private com.ss.android.ugc.aweme.common.widget.a k;
    private int l;
    @BindView(2131498537)
    AwemeMusicViewPager mAwemeMusicViewPager;
    @BindView(2131493392)
    FlyChangeView mBtnLiveRecord;
    @BindView(2131496545)
    CoordinatorLayout pullLayout;
    @BindView(2131497206)
    Space space;
    @BindView(2131497663)
    LinearLayout topLayout;
    @BindView(2131497785)
    TextView tvAdd;
    @BindView(2131497822)
    TextView tvCancel;
    @BindView(2131498213)
    TextView tvSelectVideo;
    @BindView(2131498122)
    TextView tvSelelctMusic;
    @BindView(2131498329)
    View uploadRedPoint;

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f4025a, false, 80163, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f4025a, false, 80163, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.ChooseMusicActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void a(@NonNull final String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f4025a, false, 80160, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f4025a, false, 80160, new Class[]{String.class}, Void.TYPE);
            return;
        }
        final com.ss.android.ugc.aweme.shortvideo.view.d b2 = com.ss.android.ugc.aweme.shortvideo.view.d.b(this, "");
        b2.setIndeterminate(true);
        v.a((Dialog) b2);
        com.ss.android.b.a.a.a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70470a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f70470a, false, 80170, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f70470a, false, 80170, new Class[0], Void.TYPE);
                    return;
                }
                final PhotoContext compress = ((IAVService) ServiceManager.get().getService(IAVService.class)).photoService().compress(str, new com.ss.android.ugc.aweme.photo.c());
                com.ss.android.b.a.a.a.b(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f70474a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f70474a, false, 80171, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f70474a, false, 80171, new Class[0], Void.TYPE);
                            return;
                        }
                        b2.dismiss();
                        if (compress == null) {
                            com.bytedance.ies.dmt.ui.d.a.b((Context) ChooseMusicActivity.this, (int) C0906R.string.b0w).a();
                            return;
                        }
                        compress.mShootWay = "upload";
                        r.onEvent(MobClick.obtain().setEventName("upload_next").setLabelName("photo").setExtValueLong(1));
                        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
                        if (iAVService != null) {
                            iAVService.photoService().toPhotoEditActivity(ChooseMusicActivity.this, compress);
                        }
                    }
                });
            }
        });
    }

    public final void a(MusicList musicList, String str) {
        if (PatchProxy.isSupport(new Object[]{musicList, str}, this, f4025a, false, 80161, new Class[]{MusicList.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicList, str}, this, f4025a, false, 80161, new Class[]{MusicList.class, String.class}, Void.TYPE);
            return;
        }
        if (this.k != null) {
            this.k.dismiss();
        }
        ArrayList arrayList = new ArrayList();
        if (musicList != null) {
            arrayList.addAll(musicList.musicList);
        } else {
            this.f4029e.mMusicList = null;
        }
        this.f4029e.mMusicPath = str;
        r.onEvent(MobClick.obtain().setEventName("upload_next").setLabelName("photo").setExtValueLong((long) this.f4029e.mImageList.size()));
        List a2 = az.a(arrayList, d.f70884b);
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        if (iAVService != null) {
            iAVService.photoMovieService().toPhotoMovieEditActivity(this, this.f4029e, a2, "upload");
        }
    }

    public final void a(Exception exc, String str) {
        if (PatchProxy.isSupport(new Object[]{exc, str}, this, f4025a, false, 80162, new Class[]{Exception.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, str}, this, f4025a, false, 80162, new Class[]{Exception.class, String.class}, Void.TYPE);
            return;
        }
        Music a2 = com.ss.android.ugc.aweme.photomovie.a.a();
        this.f4029e.mMusicPath = com.ss.android.ugc.aweme.photomovie.a.f58869b;
        if (this.k != null) {
            this.k.dismiss();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(a2);
        r.onEvent(MobClick.obtain().setEventName("upload_next").setLabelName("photo").setExtValueLong((long) this.f4029e.mImageList.size()));
        List a3 = az.a(arrayList, e.f70886b);
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        if (iAVService != null) {
            iAVService.photoMovieService().toPhotoMovieEditActivity(this, this.f4029e, a3, "upload");
        }
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f4025a, false, 80138, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4025a, false, 80138, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(0, C0906R.anim.s);
    }

    public Analysis getAnalysis() {
        if (!PatchProxy.isSupport(new Object[0], this, f4025a, false, 80153, new Class[0], Analysis.class)) {
            return new Analysis().setLabelName("music_homepage");
        }
        return (Analysis) PatchProxy.accessDispatch(new Object[0], this, f4025a, false, 80153, new Class[0], Analysis.class);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f4025a, false, 80156, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4025a, false, 80156, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        b.b();
        if (this.j != null) {
            this.j.j();
            this.j.k();
        }
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f4025a, false, 80137, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4025a, false, 80137, new Class[0], Void.TYPE);
            return;
        }
        Fragment a2 = a((ViewPager) this.mAwemeMusicViewPager, 1);
        if (a2 == null) {
            super.onBackPressed();
            return;
        }
        try {
            if (!a2.getChildFragmentManager().popBackStackImmediate()) {
                super.onBackPressed();
            }
        } catch (IllegalStateException unused) {
            super.onBackPressed();
        }
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f4025a, false, 80135, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4025a, false, 80135, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        if (this.h) {
            if (PatchProxy.isSupport(new Object[0], this, f4025a, false, 80141, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f4025a, false, 80141, new Class[0], Void.TYPE);
            } else {
                this.tvCancel.setVisibility(0);
            }
            this.h = false;
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f4025a, false, 80157, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4025a, false, 80157, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.ChooseMusicActivity", "onResume", true);
        super.onResume();
        if (this.f4028d) {
            View findViewById = findViewById(C0906R.id.c92);
            AnonymousClass11 r11 = new a.C0424a() {
                public final void onAnimationEnd(Animation animation) {
                    ChooseMusicActivity.this.f4028d = false;
                }
            };
            if (PatchProxy.isSupport(new Object[]{this, findViewById, Float.valueOf(-90.0f), Float.valueOf(0.0f), r11}, null, com.ss.android.ugc.aweme.anim.a.f33324a, true, 21616, new Class[]{Activity.class, View.class, Float.TYPE, Float.TYPE, a.C0424a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{this, findViewById, Float.valueOf(-90.0f), Float.valueOf(0.0f), r11}, null, com.ss.android.ugc.aweme.anim.a.f33324a, true, 21616, new Class[]{Activity.class, View.class, Float.TYPE, Float.TYPE, a.C0424a.class}, Void.TYPE);
            } else {
                WindowManager windowManager = getWindowManager();
                com.ss.android.ugc.aweme.anim.a.a aVar = new com.ss.android.ugc.aweme.anim.a.a(this, -90.0f, 0.0f, (float) (windowManager.getDefaultDisplay().getWidth() / 2), (float) (windowManager.getDefaultDisplay().getHeight() / 2), 0.0f);
                aVar.setDuration(200);
                aVar.setFillAfter(true);
                aVar.setInterpolator(new LinearInterpolator());
                aVar.setAnimationListener(r11);
                findViewById.setAnimation(aVar);
                findViewById.startAnimation(aVar);
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.ChooseMusicActivity", "onResume", false);
    }

    private void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f4025a, false, 80140, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f4025a, false, 80140, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mAwemeMusicViewPager.getLayoutParams();
        layoutParams.setMargins(0, 0, 0, i2);
        this.mAwemeMusicViewPager.setLayoutParams(layoutParams);
    }

    private void d(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f4025a, false, 80151, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f4025a, false, 80151, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mAwemeMusicViewPager != null) {
            this.mAwemeMusicViewPager.setCurrentItem(i2);
        }
    }

    @Subscribe
    public void onHideCancelButtonEvent(com.ss.android.ugc.aweme.music.a.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f4025a, false, 80139, new Class[]{com.ss.android.ugc.aweme.music.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f4025a, false, 80139, new Class[]{com.ss.android.ugc.aweme.music.a.c.class}, Void.TYPE);
            return;
        }
        if (this.tvCancel != null) {
            if (cVar.f56167a) {
                this.tvCancel.setVisibility(0);
                c((int) UIUtils.dip2Px(this, 0.0f));
                return;
            }
            this.tvCancel.setVisibility(8);
            c((int) UIUtils.dip2Px(this, 0.0f));
        }
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f4025a, false, 80159, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f4025a, false, 80159, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 <= 0) {
            this.tvAdd.setTextColor(getResources().getColor(C0906R.color.a18));
            Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130839851);
            a2.setBounds(0, 0, (int) UIUtils.dip2Px(this, 9.0f), (int) UIUtils.dip2Px(this, 21.0f));
            this.tvAdd.setCompoundDrawables(null, null, a2, null);
            this.tvSelelctMusic.setVisibility(0);
            this.tvAdd.setText(C0906R.string.be_);
        } else {
            this.tvAdd.setTextColor(getResources().getColor(C0906R.color.a1z));
            Drawable a3 = com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130839797);
            a3.setBounds(0, 0, (int) UIUtils.dip2Px(this, 9.0f), (int) UIUtils.dip2Px(this, 21.0f));
            this.tvAdd.setCompoundDrawables(null, null, a3, null);
            if (i2 == 1) {
                this.tvAdd.setText(C0906R.string.bgw);
                this.tvSelelctMusic.setVisibility(8);
            } else if (i2 > 1) {
                this.tvAdd.setText(String.format(getString(C0906R.string.ais), new Object[]{Integer.valueOf(i2)}));
                this.tvSelelctMusic.setVisibility(8);
            }
        }
        this.tvAdd.setTextSize(16.0f);
    }

    public static boolean a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f4025a, true, 80150, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f4025a, true, 80150, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (!((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isPublishing()) {
            return true;
        } else {
            com.bytedance.ies.dmt.ui.d.a.c(context2, (int) C0906R.string.es).a();
            return false;
        }
    }

    @OnClick({2131497785, 2131498213, 2131498122, 2131497822})
    public void click(View view) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{view}, this, f4025a, false, 80148, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f4025a, false, 80148, new Class[]{View.class}, Void.TYPE);
        } else if (view.getId() != C0906R.id.dib) {
            if (view.getId() == C0906R.id.d8x) {
                if (PatchProxy.isSupport(new Object[0], this, f4025a, false, 80149, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f4025a, false, 80149, new Class[0], Void.TYPE);
                } else {
                    if (this.f4029e == null) {
                        i2 = 0;
                    } else {
                        i2 = this.f4029e.getImageCount();
                    }
                    if (i2 <= 0) {
                        Fragment a2 = a((ViewPager) this.mAwemeMusicViewPager, 1);
                        if (a2 != null && (a2 instanceof OnlineMusicFragment)) {
                            MusicTabListFragment musicTabListFragment = ((OnlineMusicFragment) a2).f67782c;
                            if (musicTabListFragment != null) {
                                p pVar = musicTabListFragment.f3626d;
                                if (pVar != null) {
                                    pVar.o = true;
                                }
                            }
                        }
                        ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setCurMusic(null);
                        q.a(this, "shoot", "direct_shoot", 0, 0, new t().a("record_mode", "direct").a());
                        String uuid = UUID.randomUUID().toString();
                        r.a("shoot", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", uuid).a("shoot_way", "direct_shoot").a("group_id", aj.a()).a("_staging_flag", com.ss.android.g.a.b() ^ true ? 1 : 0).f34114b);
                        Intent intent = new Intent(this, ((IAVService) ServiceManager.get().getService(IAVService.class)).getRecordPermissionActivity());
                        if (getIntent().hasExtra("shoot_way")) {
                            intent.putExtra("shoot_way", getIntent().getStringExtra("shoot_way"));
                        } else {
                            intent.putExtra("shoot_way", "direct_shoot");
                        }
                        intent.putExtra("creation_id", uuid);
                        startActivity(intent);
                    } else if (i2 == 1) {
                        a(this.f4029e.mImageList.get(0));
                        new ak().a("upload").b("photo").a(1).e();
                    } else {
                        if (i2 > 1) {
                            if (this.j == null) {
                                this.j = new d();
                                this.j.a(new MusicListModel());
                                this.j.a(this);
                            }
                            new ak().a("upload").b("video").a(i2).e();
                            this.j.a(new Object[0]);
                            this.k = com.ss.android.ugc.aweme.common.widget.a.a(this, getString(C0906R.string.a0t), "compress_photo_movie_loading.json");
                        }
                    }
                }
            } else if (view.getId() == C0906R.id.dl8) {
                if (ah.a()) {
                    this.uploadRedPoint.setVisibility(8);
                    if (PatchProxy.isSupport(new Object[]{(byte) 0}, null, ah.f71104a, true, 81040, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{(byte) 0}, null, ah.f71104a, true, 81040, new Class[]{Boolean.TYPE}, Void.TYPE);
                    } else {
                        com.ss.android.ugc.aweme.q.c.a(com.ss.android.ugc.aweme.app.k.a(), "sp_upload_red_point", 0).edit().putBoolean("show_upload_red_point", false).apply();
                    }
                }
                this.mBtnLiveRecord.setVisibility(8);
                this.tvAdd.setVisibility(0);
                d(0);
                r.a((Context) this, "record", "upload", 0, 0);
                a(this.tvSelectVideo, this.tvSelelctMusic);
                this.tvSelectVideo.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2130839875, 0);
                this.dividerView.setVisibility(0);
            } else if (view.getId() == C0906R.id.d9y) {
                finish();
            }
        } else if (this.mAwemeMusicViewPager.getCurrentItem() != 1) {
            d(1);
            a(this.tvSelelctMusic, this.tvSelectVideo);
            if (((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).needLiveInRecord()) {
                this.mBtnLiveRecord.setVisibility(0);
                this.tvAdd.setVisibility(8);
            } else {
                this.mBtnLiveRecord.setVisibility(8);
                this.tvAdd.setVisibility(0);
            }
            this.dividerView.setVisibility(8);
            this.tvSelectVideo.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2130839874, 0);
        }
    }

    public void onCreate(Bundle bundle) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f4025a, false, 80134, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f4025a, false, 80134, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.ChooseMusicActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(C0906R.anim.r, 0);
        setContentView((int) C0906R.layout.an);
        this.space.setMinimumHeight(com.ss.android.ugc.aweme.base.utils.p.c());
        this.i = getIntent().getBooleanExtra("show_video", true);
        this.f4027c = (Challenge) getIntent().getSerializableExtra("challenge");
        if (!this.i) {
            this.tvSelectVideo.setVisibility(4);
            this.tvAdd.setVisibility(4);
            this.tvSelelctMusic.setText(getString(C0906R.string.rw));
        }
        View view = this.uploadRedPoint;
        if (ah.a()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        if (PatchProxy.isSupport(new Object[0], this, f4025a, false, 80136, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4025a, false, 80136, new Class[0], Void.TYPE);
        } else {
            ViewPagerBottomSheetBehavior a2 = ViewPagerBottomSheetBehavior.a(findViewById(C0906R.id.d5g));
            a2.l = new ViewPagerBottomSheetBehavior.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f70450a;

                public final void a(@NonNull View view, float f2) {
                    if (PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2)}, this, f70450a, false, 80167, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2)}, this, f70450a, false, 80167, new Class[]{View.class, Float.TYPE}, Void.TYPE);
                        return;
                    }
                    ChooseMusicActivity.this.background.setAlpha((f2 + 1.0f) / 2.0f);
                }

                public final void a(@NonNull View view, int i) {
                    if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f70450a, false, 80166, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f70450a, false, 80166, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (i == 5) {
                        if (ChooseMusicActivity.this.pullLayout != null) {
                            KeyboardUtils.c(ChooseMusicActivity.this.pullLayout);
                        }
                        ChooseMusicActivity.this.finish();
                    }
                }
            };
            a2.f34776e = true;
            a2.b(3);
            a2.f34777f = true;
            a2.a((ViewPager) this.mAwemeMusicViewPager);
        }
        if (PatchProxy.isSupport(new Object[0], this, f4025a, false, 80143, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4025a, false, 80143, new Class[0], Void.TYPE);
        } else {
            this.f4026b = getIntent().getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 0);
            this.mAwemeMusicViewPager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f70460a;

                public void onPageSelected(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f70460a, false, 80173, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f70460a, false, 80173, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    super.onPageSelected(i);
                    ViewPagerBottomSheetBehavior a2 = ViewPagerBottomSheetBehavior.a(ChooseMusicActivity.this.findViewById(C0906R.id.d5g));
                    if (i == 0) {
                        Fragment a3 = ChooseMusicActivity.this.a((ViewPager) ChooseMusicActivity.this.mAwemeMusicViewPager, 0);
                        if (a3 instanceof j) {
                            a2.a(((j) a3).a());
                            q.a(ChooseMusicActivity.this, "show_upload_photo_entrance", "upload");
                        }
                        return;
                    }
                    if (i == 1) {
                        a2.a((ViewPager) ChooseMusicActivity.this.mAwemeMusicViewPager);
                    }
                }

                public void onPageScrollStateChanged(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f70460a, false, 80174, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f70460a, false, 80174, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (i == 0 && ChooseMusicActivity.this.mAwemeMusicViewPager.getCurrentItem() == 0) {
                        OnlineMusicFragment onlineMusicFragment = (OnlineMusicFragment) ChooseMusicActivity.this.a((ViewPager) ChooseMusicActivity.this.mAwemeMusicViewPager, 1);
                        if (onlineMusicFragment != null) {
                            if (PatchProxy.isSupport(new Object[0], onlineMusicFragment, OnlineMusicFragment.f67780a, false, 77334, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], onlineMusicFragment, OnlineMusicFragment.f67780a, false, 77334, new Class[0], Void.TYPE);
                            } else {
                                if (onlineMusicFragment.f67782c != null) {
                                    onlineMusicFragment.f67782c.f();
                                }
                                MusicListFragment musicListFragment = (MusicListFragment) onlineMusicFragment.getChildFragmentManager().findFragmentById(C0906R.id.z2);
                                if (musicListFragment != null) {
                                    musicListFragment.f();
                                }
                            }
                        }
                        final Fragment a2 = ChooseMusicActivity.this.a((ViewPager) ChooseMusicActivity.this.mAwemeMusicViewPager, 0);
                        if (a2 != null) {
                            l.a(ChooseMusicActivity.this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new b.C0400b() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f70462a;

                                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
                                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object[]} */
                                /* JADX WARNING: Multi-variable type inference failed */
                                /* Code decompiled incorrectly, please refer to instructions dump. */
                                public final void a(java.lang.String[] r20, int[] r21) {
                                    /*
                                        r19 = this;
                                        r7 = r19
                                        r8 = r21
                                        r9 = 2
                                        java.lang.Object[] r0 = new java.lang.Object[r9]
                                        r10 = 0
                                        r0[r10] = r20
                                        r11 = 1
                                        r0[r11] = r8
                                        com.meituan.robust.ChangeQuickRedirect r2 = f70462a
                                        java.lang.Class[] r5 = new java.lang.Class[r9]
                                        java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
                                        r5[r10] = r1
                                        java.lang.Class<int[]> r1 = int[].class
                                        r5[r11] = r1
                                        java.lang.Class r6 = java.lang.Void.TYPE
                                        r3 = 0
                                        r4 = 80175(0x1392f, float:1.12349E-40)
                                        r1 = r19
                                        boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                                        if (r0 == 0) goto L_0x0045
                                        java.lang.Object[] r0 = new java.lang.Object[r9]
                                        r0[r10] = r20
                                        r0[r11] = r8
                                        com.meituan.robust.ChangeQuickRedirect r2 = f70462a
                                        r3 = 0
                                        r4 = 80175(0x1392f, float:1.12349E-40)
                                        java.lang.Class[] r5 = new java.lang.Class[r9]
                                        java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
                                        r5[r10] = r1
                                        java.lang.Class<int[]> r1 = int[].class
                                        r5[r11] = r1
                                        java.lang.Class r6 = java.lang.Void.TYPE
                                        r1 = r19
                                        com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                                        return
                                    L_0x0045:
                                        if (r8 == 0) goto L_0x00eb
                                        int r0 = r8.length
                                        if (r0 != 0) goto L_0x004c
                                        goto L_0x00eb
                                    L_0x004c:
                                        r0 = r8[r10]
                                        if (r0 != 0) goto L_0x007a
                                        android.support.v4.app.Fragment r0 = r0
                                        boolean r0 = r0 instanceof com.ss.android.ugc.aweme.mediachoose.v
                                        if (r0 == 0) goto L_0x0065
                                        android.support.v4.app.Fragment r0 = r0
                                        com.ss.android.ugc.aweme.mediachoose.v r0 = (com.ss.android.ugc.aweme.mediachoose.v) r0
                                        r0.a()
                                        android.support.v4.app.Fragment r0 = r0
                                        com.ss.android.ugc.aweme.mediachoose.v r0 = (com.ss.android.ugc.aweme.mediachoose.v) r0
                                        r0.b()
                                        return
                                    L_0x0065:
                                        android.support.v4.app.Fragment r0 = r0
                                        boolean r0 = r0 instanceof com.ss.android.ugc.aweme.mediachoose.j
                                        if (r0 == 0) goto L_0x00ea
                                        android.support.v4.app.Fragment r0 = r0
                                        com.ss.android.ugc.aweme.mediachoose.j r0 = (com.ss.android.ugc.aweme.mediachoose.j) r0
                                        r0.b()
                                        android.support.v4.app.Fragment r0 = r0
                                        com.ss.android.ugc.aweme.mediachoose.j r0 = (com.ss.android.ugc.aweme.mediachoose.j) r0
                                        r0.c()
                                        return
                                    L_0x007a:
                                        com.ss.android.ugc.aweme.shortvideo.ui.ChooseMusicActivity$3 r0 = com.ss.android.ugc.aweme.shortvideo.ui.ChooseMusicActivity.AnonymousClass3.this
                                        com.ss.android.ugc.aweme.shortvideo.ui.ChooseMusicActivity r0 = com.ss.android.ugc.aweme.shortvideo.ui.ChooseMusicActivity.this
                                        android.support.v4.app.Fragment r1 = r0
                                        java.lang.Object[] r12 = new java.lang.Object[r11]
                                        r12[r10] = r1
                                        com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.ui.ChooseMusicActivity.f4025a
                                        r15 = 0
                                        r16 = 80145(0x13911, float:1.12307E-40)
                                        java.lang.Class[] r2 = new java.lang.Class[r11]
                                        java.lang.Class<android.support.v4.app.Fragment> r3 = android.support.v4.app.Fragment.class
                                        r2[r10] = r3
                                        java.lang.Class r18 = java.lang.Void.TYPE
                                        r13 = r0
                                        r17 = r2
                                        boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
                                        if (r2 == 0) goto L_0x00b4
                                        java.lang.Object[] r12 = new java.lang.Object[r11]
                                        r12[r10] = r1
                                        com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.ui.ChooseMusicActivity.f4025a
                                        r15 = 0
                                        r16 = 80145(0x13911, float:1.12307E-40)
                                        java.lang.Class[] r1 = new java.lang.Class[r11]
                                        java.lang.Class<android.support.v4.app.Fragment> r2 = android.support.v4.app.Fragment.class
                                        r1[r10] = r2
                                        java.lang.Class r18 = java.lang.Void.TYPE
                                        r13 = r0
                                        r17 = r1
                                        com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                                        return
                                    L_0x00b4:
                                        android.support.v7.app.AlertDialog$Builder r2 = new android.support.v7.app.AlertDialog$Builder
                                        r3 = 2131493316(0x7f0c01c4, float:1.8610109E38)
                                        r2.<init>(r0, r3)
                                        r3 = 2131558675(0x7f0d0113, float:1.8742673E38)
                                        android.support.v7.app.AlertDialog$Builder r2 = r2.setMessage((int) r3)
                                        r3 = 2131559036(0x7f0d027c, float:1.8743405E38)
                                        com.ss.android.ugc.aweme.shortvideo.ui.ChooseMusicActivity$9 r4 = new com.ss.android.ugc.aweme.shortvideo.ui.ChooseMusicActivity$9
                                        r4.<init>(r1)
                                        android.support.v7.app.AlertDialog$Builder r2 = r2.setNegativeButton((int) r3, (android.content.DialogInterface.OnClickListener) r4)
                                        r3 = 2131559454(0x7f0d041e, float:1.8744253E38)
                                        com.ss.android.ugc.aweme.shortvideo.ui.ChooseMusicActivity$8 r4 = new com.ss.android.ugc.aweme.shortvideo.ui.ChooseMusicActivity$8
                                        r4.<init>()
                                        android.support.v7.app.AlertDialog$Builder r2 = r2.setPositiveButton((int) r3, (android.content.DialogInterface.OnClickListener) r4)
                                        android.support.v7.app.AlertDialog r2 = r2.create()
                                        com.ss.android.ugc.aweme.shortvideo.ui.ChooseMusicActivity$10 r3 = new com.ss.android.ugc.aweme.shortvideo.ui.ChooseMusicActivity$10
                                        r3.<init>(r1)
                                        r2.setOnDismissListener(r3)
                                        r2.show()
                                    L_0x00ea:
                                        return
                                    L_0x00eb:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.ChooseMusicActivity.AnonymousClass3.AnonymousClass1.a(java.lang.String[], int[]):void");
                                }
                            });
                        }
                    }
                }
            });
            this.mAwemeMusicViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f70465a;

                public int getCount() {
                    return 2;
                }

                public Fragment getItem(int i) {
                    int i2 = i;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f70465a, false, 80176, new Class[]{Integer.TYPE}, Fragment.class)) {
                        return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f70465a, false, 80176, new Class[]{Integer.TYPE}, Fragment.class);
                    }
                    com.ss.android.ugc.aweme.shortvideo.c cVar = null;
                    if (i2 == 0) {
                        ChooseMusicActivity chooseMusicActivity = ChooseMusicActivity.this;
                        if (PatchProxy.isSupport(new Object[0], chooseMusicActivity, ChooseMusicActivity.f4025a, false, 80147, new Class[0], Fragment.class)) {
                            return (Fragment) PatchProxy.accessDispatch(new Object[0], chooseMusicActivity, ChooseMusicActivity.f4025a, false, 80147, new Class[0], Fragment.class);
                        }
                        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
                        IPhotoService photoService = ((IAVService) ServiceManager.get().getService(IAVService.class)).photoService();
                        if (chooseMusicActivity.f4027c != null) {
                            cVar = new com.ss.android.ugc.aweme.shortvideo.o.a().apply(chooseMusicActivity.f4027c);
                        }
                        com.ss.android.ugc.aweme.shortvideo.c cVar2 = cVar;
                        if (!photoService.isPhotoEditEnabled()) {
                            return iAVService.newVideoChooseFragmentInstance(3, o.a(C0906R.color.a3n), o.a(C0906R.color.a2p), cVar2, chooseMusicActivity.g);
                        }
                        return iAVService.createMediaChooseFragment(cVar2, 0, true, chooseMusicActivity.f4030f, chooseMusicActivity.g);
                    } else if (i2 == 1) {
                        ChooseMusicActivity chooseMusicActivity2 = ChooseMusicActivity.this;
                        if (PatchProxy.isSupport(new Object[0], chooseMusicActivity2, ChooseMusicActivity.f4025a, false, 80146, new Class[0], Fragment.class)) {
                            return (Fragment) PatchProxy.accessDispatch(new Object[0], chooseMusicActivity2, ChooseMusicActivity.f4025a, false, 80146, new Class[0], Fragment.class);
                        }
                        int i3 = chooseMusicActivity2.f4026b;
                        Challenge challenge = chooseMusicActivity2.f4027c;
                        MusicMixAdapter.a aVar = MusicMixAdapter.a.BtnConfirmAndShoot;
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3), challenge, null, aVar, (byte) 0, null}, null, OnlineMusicFragment.f67780a, true, 77318, new Class[]{Integer.TYPE, Challenge.class, MusicModel.class, MusicMixAdapter.a.class, Boolean.TYPE, Bundle.class}, OnlineMusicFragment.class)) {
                            return (OnlineMusicFragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3), challenge, null, aVar, (byte) 0, null}, null, OnlineMusicFragment.f67780a, true, 77318, new Class[]{Integer.TYPE, Challenge.class, MusicModel.class, MusicMixAdapter.a.class, Boolean.TYPE, Bundle.class}, OnlineMusicFragment.class);
                        }
                        String str = null;
                        if (challenge != null) {
                            str = challenge.getCid();
                        }
                        return OnlineMusicFragment.a(i3, str, null, aVar, false, null, "");
                    } else {
                        throw new AssertionError("ViewPager index out of range: " + i2);
                    }
                }
            });
            this.mAwemeMusicViewPager.setCurrentItem(1);
        }
        if (PatchProxy.isSupport(new Object[0], this, f4025a, false, 80142, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4025a, false, 80142, new Class[0], Void.TYPE);
        } else if (!((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).needLiveInRecord() || getIntent().getStringExtra("shoot_way") != null) {
            this.mBtnLiveRecord.setVisibility(8);
        } else {
            e eVar = new e(this);
            if (PatchProxy.isSupport(new Object[0], eVar, e.f56696a, false, 60135, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], eVar, e.f56696a, false, 60135, new Class[0], Void.TYPE);
            } else {
                eVar.f56697b.setVisibility(8);
            }
            e eVar2 = new e(this);
            if (PatchProxy.isSupport(new Object[0], eVar2, e.f56696a, false, 60134, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], eVar2, e.f56696a, false, 60134, new Class[0], Void.TYPE);
            } else {
                eVar2.f56698c.setVisibility(8);
                eVar2.f56699d.setVisibility(8);
            }
            this.mBtnLiveRecord.a(eVar2);
            this.mBtnLiveRecord.a(eVar);
            this.tvAdd.setVisibility(8);
            this.mBtnLiveRecord.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f70477a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f70477a, false, 80172, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f70477a, false, 80172, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    ChooseMusicActivity.this.tvAdd.performClick();
                }
            });
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.ChooseMusicActivity", "onCreate", false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(final int r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f4025a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 80158(0x1391e, float:1.12325E-40)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003a
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f4025a
            r3 = 0
            r4 = 80158(0x1391e, float:1.12325E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003a:
            if (r10 > 0) goto L_0x003e
        L_0x003c:
            r7 = 0
            goto L_0x0044
        L_0x003e:
            if (r10 != r7) goto L_0x0041
            goto L_0x0044
        L_0x0041:
            if (r10 <= r7) goto L_0x003c
            r7 = 2
        L_0x0044:
            int r0 = r9.l
            if (r0 == r7) goto L_0x0066
            android.widget.TextView r0 = r9.tvAdd
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 0
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            r1 = 100
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            com.ss.android.ugc.aweme.shortvideo.ui.ChooseMusicActivity$5 r1 = new com.ss.android.ugc.aweme.shortvideo.ui.ChooseMusicActivity$5
            r1.<init>(r10)
            android.view.ViewPropertyAnimator r0 = r0.withEndAction(r1)
            r0.start()
            goto L_0x0069
        L_0x0066:
            r9.b(r10)
        L_0x0069:
            r9.l = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.ChooseMusicActivity.a(int):void");
    }

    public final void a(Fragment fragment) {
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragment2}, this, f4025a, false, 80144, new Class[]{Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2}, this, f4025a, false, 80144, new Class[]{Fragment.class}, Void.TYPE);
        } else if (fragment2 instanceof com.ss.android.ugc.aweme.mediachoose.v) {
            ((com.ss.android.ugc.aweme.mediachoose.v) fragment2).b();
        } else {
            if (fragment2 instanceof j) {
                ((j) fragment2).c();
            }
        }
    }

    private static String a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, f4025a, true, 80155, new Class[]{Integer.TYPE, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, f4025a, true, 80155, new Class[]{Integer.TYPE, Integer.TYPE}, String.class);
        }
        return "android:switcher:" + i2 + ":" + i3;
    }

    private void a(TextView textView, TextView textView2) {
        TextView textView3 = textView;
        TextView textView4 = textView2;
        if (PatchProxy.isSupport(new Object[]{textView3, textView4}, this, f4025a, false, 80152, new Class[]{TextView.class, TextView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView3, textView4}, this, f4025a, false, 80152, new Class[]{TextView.class, TextView.class}, Void.TYPE);
            return;
        }
        m.a(textView3, 16, 17, com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f, getResources().getColor(C0906R.color.a17));
        m.a(textView4, 17, 16, com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f, getResources().getColor(C0906R.color.a18));
    }

    public final Fragment a(ViewPager viewPager, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewPager, Integer.valueOf(i2)}, this, f4025a, false, 80154, new Class[]{ViewPager.class, Integer.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{viewPager, Integer.valueOf(i2)}, this, f4025a, false, 80154, new Class[]{ViewPager.class, Integer.TYPE}, Fragment.class);
        }
        return getSupportFragmentManager().findFragmentByTag(a(viewPager.getId(), i2));
    }
}
