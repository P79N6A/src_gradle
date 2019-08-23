package com.ss.android.ugc.aweme.shortvideo.local;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.Space;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.mediachoose.i;
import com.ss.android.ugc.aweme.mediachoose.k;
import com.ss.android.ugc.aweme.music.b.a.a;
import com.ss.android.ugc.aweme.photo.local.MediaChooseFragment;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.shortvideo.ff;
import com.ss.android.ugc.aweme.shortvideo.local.LocalViewPagerBottomSheetBehavior;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

public class ChooseMediaActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68292a;

    /* renamed from: b  reason: collision with root package name */
    int f68293b;

    /* renamed from: c  reason: collision with root package name */
    public PhotoMovieContext f68294c;

    /* renamed from: d  reason: collision with root package name */
    public List<a> f68295d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f68296e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f68297f;
    private TextView g;
    private ImageView h;
    private TextView i;
    private MediaChooseFragment j;
    private com.ss.android.ugc.aweme.music.b.a k = new com.ss.android.ugc.aweme.music.b.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68312a;

        public final void a(a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f68312a, false, 77576, new Class[]{a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f68312a, false, 77576, new Class[]{a.class}, Void.TYPE);
            } else if ((ChooseMediaActivity.this.f68293b & 1) > 0) {
                i.a(false, false);
                Intent intent = new Intent();
                intent.putExtra("image_file", aVar.f56315e);
                ChooseMediaActivity.this.setResult(-1, intent);
                ChooseMediaActivity.this.finish();
            } else {
                UIUtils.displayToast((Context) ChooseMediaActivity.this, (int) C0906R.string.ait);
            }
        }

        public final void a(PhotoMovieContext photoMovieContext) {
            int i;
            if (PatchProxy.isSupport(new Object[]{photoMovieContext}, this, f68312a, false, 77575, new Class[]{PhotoMovieContext.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{photoMovieContext}, this, f68312a, false, 77575, new Class[]{PhotoMovieContext.class}, Void.TYPE);
                return;
            }
            if (photoMovieContext == null) {
                i = 0;
            } else {
                i = photoMovieContext.getImageCount();
            }
            ChooseMediaActivity.this.f68294c = photoMovieContext;
            ChooseMediaActivity.this.a(i, false);
        }
    };
    private k l = new k() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68314a;

        public final void a(List<a> list) {
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{list}, this, f68314a, false, 77577, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f68314a, false, 77577, new Class[]{List.class}, Void.TYPE);
                return;
            }
            ChooseMediaActivity.this.f68295d = list;
            if (list != null) {
                i = list.size();
            }
            ChooseMediaActivity.this.a(i, true);
        }
    };

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f68292a, false, 77568, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f68292a, false, 77568, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.local.ChooseMediaActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: package-private */
    public final MediaChooseFragment a() {
        if (!PatchProxy.isSupport(new Object[0], this, f68292a, false, 77566, new Class[0], MediaChooseFragment.class)) {
            return (MediaChooseFragment) getSupportFragmentManager().findFragmentById(C0906R.id.aic);
        }
        return (MediaChooseFragment) PatchProxy.accessDispatch(new Object[0], this, f68292a, false, 77566, new Class[0], MediaChooseFragment.class);
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f68292a, false, 77561, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68292a, false, 77561, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(0, C0906R.anim.s);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f68292a, false, 77559, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68292a, false, 77559, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.local.ChooseMediaActivity", "onResume", true);
        super.onResume();
        final MediaChooseFragment a2 = a();
        if (!this.f68297f && a2 != null) {
            if (PatchProxy.isSupport(new Object[0], this, f68292a, false, 77560, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f68292a, false, 77560, new Class[0], Void.TYPE);
            } else {
                a().a().addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f68310a;

                    public void onPageScrollStateChanged(int i) {
                    }

                    public void onPageScrolled(int i, float f2, int i2) {
                    }

                    public void onPageSelected(int i) {
                        int i2;
                        int i3 = 0;
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f68310a, false, 77574, new Class[]{Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f68310a, false, 77574, new Class[]{Integer.TYPE}, Void.TYPE);
                        } else if (i == 0) {
                            ChooseMediaActivity chooseMediaActivity = ChooseMediaActivity.this;
                            if (ChooseMediaActivity.this.f68295d != null) {
                                i3 = ChooseMediaActivity.this.f68295d.size();
                            }
                            chooseMediaActivity.a(i3, true);
                        } else {
                            ChooseMediaActivity chooseMediaActivity2 = ChooseMediaActivity.this;
                            if (ChooseMediaActivity.this.f68294c == null) {
                                i2 = 0;
                            } else {
                                i2 = ChooseMediaActivity.this.f68294c.getImageCount();
                            }
                            chooseMediaActivity2.a(i2, false);
                        }
                    }
                });
            }
            a2.a().post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f68307a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f68307a, false, 77573, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f68307a, false, 77573, new Class[0], Void.TYPE);
                        return;
                    }
                    a2.b();
                    a2.c();
                }
            });
            this.f68297f = true;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.local.ChooseMediaActivity", "onResume", false);
    }

    public void onCreate(Bundle bundle) {
        final LocalViewPagerBottomSheetBehavior localViewPagerBottomSheetBehavior;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f68292a, false, 77558, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f68292a, false, 77558, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.local.ChooseMediaActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(C0906R.anim.r, 0);
        setContentView((int) C0906R.layout.c9);
        this.f68293b = getIntent().getIntExtra("ARG_SUPPORT_FLAGS", 0);
        this.f68296e = getIntent().getBooleanExtra("ARG_MULTI_VIDEO_ENABLE", true);
        this.g = (TextView) findViewById(C0906R.id.d8x);
        this.h = (ImageView) findViewById(C0906R.id.ix);
        this.i = (TextView) findViewById(C0906R.id.dkk);
        this.i.getPaint().setFakeBoldText(true);
        this.h.setOnClickListener(com.ss.android.ugc.aweme.base.widget.b.a.a(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f68298a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f68298a, false, 77569, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f68298a, false, 77569, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                ChooseMediaActivity.this.finish();
            }
        }));
        this.g.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f68300a;

            public final void onClick(View view) {
                int i;
                String str;
                if (PatchProxy.isSupport(new Object[]{view}, this, f68300a, false, 77570, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f68300a, false, 77570, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                ChooseMediaActivity chooseMediaActivity = ChooseMediaActivity.this;
                if (PatchProxy.isSupport(new Object[0], chooseMediaActivity, ChooseMediaActivity.f68292a, false, 77563, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], chooseMediaActivity, ChooseMediaActivity.f68292a, false, 77563, new Class[0], Void.TYPE);
                    return;
                }
                MediaChooseFragment a2 = chooseMediaActivity.a();
                boolean d2 = a2.d();
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(d2 ? (byte) 1 : 0)}, null, i.f55301a, true, 58547, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(d2)}, null, i.f55301a, true, 58547, new Class[]{Boolean.TYPE}, Void.TYPE);
                } else {
                    d a3 = d.a();
                    if (d2) {
                        str = "video";
                    } else {
                        str = "photo";
                    }
                    r.a("upload_content_next", (Map) a3.a("content_type", str).f34114b);
                }
                if (a2.d()) {
                    if (PatchProxy.isSupport(new Object[0], chooseMediaActivity, ChooseMediaActivity.f68292a, false, 77564, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], chooseMediaActivity, ChooseMediaActivity.f68292a, false, 77564, new Class[0], Void.TYPE);
                    } else {
                        MediaChooseFragment a4 = chooseMediaActivity.a();
                        if (!Lists.isEmpty(chooseMediaActivity.f68295d)) {
                            a4.a(chooseMediaActivity.f68295d);
                        }
                    }
                } else {
                    if (PatchProxy.isSupport(new Object[0], chooseMediaActivity, ChooseMediaActivity.f68292a, false, 77565, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], chooseMediaActivity, ChooseMediaActivity.f68292a, false, 77565, new Class[0], Void.TYPE);
                        return;
                    }
                    if (chooseMediaActivity.f68294c == null) {
                        i = 0;
                    } else {
                        i = chooseMediaActivity.f68294c.getImageCount();
                    }
                    if (i == 1) {
                        if ((1 & chooseMediaActivity.f68293b) > 0) {
                            Intent intent = new Intent();
                            intent.putExtra("image_file", chooseMediaActivity.f68294c.mImageList.get(0));
                            intent.putExtra("image_poidata", chooseMediaActivity.f68294c.poiData);
                            chooseMediaActivity.setResult(-1, intent);
                            chooseMediaActivity.finish();
                            return;
                        }
                        com.bytedance.ies.dmt.ui.d.a.b((Context) chooseMediaActivity, (int) C0906R.string.ait).a();
                    } else if (i > 1) {
                        Intent intent2 = new Intent();
                        intent2.putExtra("photo_movie_context", chooseMediaActivity.f68294c);
                        chooseMediaActivity.setResult(-1, intent2);
                        chooseMediaActivity.finish();
                    }
                }
            }
        });
        ((Space) findViewById(C0906R.id.css)).setMinimumHeight(p.c());
        LocalViewPagerBottomSheetBehavior.a aVar = LocalViewPagerBottomSheetBehavior.q;
        View findViewById = findViewById(C0906R.id.a3z);
        if (PatchProxy.isSupport(new Object[]{findViewById}, aVar, LocalViewPagerBottomSheetBehavior.a.f68325a, false, 77588, new Class[]{View.class}, LocalViewPagerBottomSheetBehavior.class)) {
            localViewPagerBottomSheetBehavior = (LocalViewPagerBottomSheetBehavior) PatchProxy.accessDispatch(new Object[]{findViewById}, aVar, LocalViewPagerBottomSheetBehavior.a.f68325a, false, 77588, new Class[]{View.class}, LocalViewPagerBottomSheetBehavior.class);
        } else {
            Intrinsics.checkParameterIsNotNull(findViewById, "view");
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
                layoutParams = null;
            }
            CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                CoordinatorLayout.Behavior behavior = layoutParams2.getBehavior();
                if (!(behavior instanceof LocalViewPagerBottomSheetBehavior)) {
                    behavior = null;
                }
                localViewPagerBottomSheetBehavior = (LocalViewPagerBottomSheetBehavior) behavior;
                if (localViewPagerBottomSheetBehavior == null) {
                    throw new IllegalArgumentException("The view is not associated with LocalViewPagerBottomSheetBehavior");
                } else if (localViewPagerBottomSheetBehavior == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.local.LocalViewPagerBottomSheetBehavior<V>");
                }
            } else {
                throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
            }
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.d5i)}, localViewPagerBottomSheetBehavior, LocalViewPagerBottomSheetBehavior.o, false, 77586, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.d5i)}, localViewPagerBottomSheetBehavior, LocalViewPagerBottomSheetBehavior.o, false, 77586, new Class[]{Integer.TYPE}, Void.TYPE);
        } else {
            localViewPagerBottomSheetBehavior.p = Integer.valueOf(C0906R.id.d5i);
        }
        getSupportFragmentManager().registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f68302a;

            public void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
                Fragment fragment2 = fragment;
                if (PatchProxy.isSupport(new Object[]{fragmentManager, fragment2, bundle}, this, f68302a, false, 77571, new Class[]{FragmentManager.class, Fragment.class, Bundle.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{fragmentManager, fragment2, bundle}, this, f68302a, false, 77571, new Class[]{FragmentManager.class, Fragment.class, Bundle.class}, Void.TYPE);
                    return;
                }
                super.onFragmentActivityCreated(fragmentManager, fragment, bundle);
                if (fragment2 instanceof MediaChooseFragment) {
                    localViewPagerBottomSheetBehavior.a(((MediaChooseFragment) fragment2).a());
                }
            }
        }, false);
        localViewPagerBottomSheetBehavior.l = new ViewPagerBottomSheetBehavior.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f68305a;

            public final void a(@NonNull View view, float f2) {
            }

            public final void a(@NonNull View view, int i) {
                if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f68305a, false, 77572, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f68305a, false, 77572, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (i == 5) {
                    ChooseMediaActivity chooseMediaActivity = ChooseMediaActivity.this;
                    if (PatchProxy.isSupport(new Object[0], chooseMediaActivity, ChooseMediaActivity.f68292a, false, 77567, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], chooseMediaActivity, ChooseMediaActivity.f68292a, false, 77567, new Class[0], Void.TYPE);
                        return;
                    }
                    chooseMediaActivity.finish();
                    chooseMediaActivity.overridePendingTransition(0, 0);
                }
            }
        };
        localViewPagerBottomSheetBehavior.f34776e = true;
        localViewPagerBottomSheetBehavior.a(p.a(this) + p.d(this));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        this.j = (MediaChooseFragment) supportFragmentManager.findFragmentById(C0906R.id.aic);
        if (this.j == null) {
            this.j = MediaChooseFragment.a(null, this.f68293b, this.f68296e, this.k, this.l);
            supportFragmentManager.beginTransaction().add((int) C0906R.id.aic, (Fragment) this.j).commitAllowingStateLoss();
            this.j.f58588d = true;
            this.j.h = getIntent().getLongExtra("ARG_MIN_DURATION", ff.a());
        } else {
            this.j.f58586b = this.k;
            this.j.f58587c = this.l;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.local.ChooseMediaActivity", "onCreate", false);
    }

    public final void a(int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f68292a, false, 77562, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z)}, this, f68292a, false, 77562, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (i2 <= 0) {
            this.g.setVisibility(8);
        } else {
            if (this.g.getVisibility() == 8) {
                this.g.setVisibility(0);
                this.g.setAlpha(0.0f);
            }
            if (i2 == 1) {
                if ((this.f68293b & 1) > 0 || z) {
                    this.g.setText(String.format(getString(C0906R.string.bgx), new Object[]{Integer.valueOf(i2)}));
                    this.g.animate().alpha(1.0f).setDuration(200).start();
                    return;
                }
                this.g.setText(String.format(getString(C0906R.string.ais), new Object[]{Integer.valueOf(i2)}));
                this.g.animate().alpha(0.5f).setDuration(200).start();
            } else if (i2 == 2) {
                if (z) {
                    this.g.setText(String.format(getString(C0906R.string.bgx), new Object[]{Integer.valueOf(i2)}));
                } else {
                    this.g.setText(String.format(getString(C0906R.string.ais), new Object[]{Integer.valueOf(i2)}));
                }
                this.g.animate().alpha(1.0f).setDuration(200).start();
            } else {
                if (z) {
                    this.g.setText(String.format(getString(C0906R.string.bgx), new Object[]{Integer.valueOf(i2)}));
                } else {
                    this.g.setText(String.format(getString(C0906R.string.ais), new Object[]{Integer.valueOf(i2)}));
                }
                this.g.setAlpha(1.0f);
            }
        }
    }
}
