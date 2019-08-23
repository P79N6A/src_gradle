package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.Space;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.language.I18nManagerService;
import com.ss.android.ugc.aweme.photo.local.MediaTypeNavigator;
import com.ss.android.ugc.aweme.shortvideo.ff;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public class MvChoosePhotoActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68526a;
    private int A;
    private int B;
    private j C;
    private int D;
    private boolean E;
    private boolean F;
    private String G;
    private long H;
    private a I;

    /* renamed from: b  reason: collision with root package name */
    TextView f68527b;

    /* renamed from: c  reason: collision with root package name */
    DmtTextView f68528c;

    /* renamed from: d  reason: collision with root package name */
    public MvChoosePhotoFragment f68529d;

    /* renamed from: e  reason: collision with root package name */
    MvChooseAlbumFragment f68530e;

    /* renamed from: f  reason: collision with root package name */
    public ChooseVideoFragment f68531f;
    public int g;
    public int h;
    public ArrayList<com.ss.android.ugc.aweme.music.b.a.a> i = new ArrayList<>();
    public fh j;
    public int k;
    public int l = -1;
    public int m = -1;
    public int n;
    public int o;
    public List<MvImageChooseAdapter.b> p;
    public List<MvImageChooseAdapter.b> q;
    private View r;
    private ViewPager s;
    private MediaTypeNavigator t;
    private ViewPagerBottomSheetBehavior u;
    private int v;
    private int w;
    private int x;
    private int y;
    private String z;

    class ChoosePhotoAdapter extends FragmentPagerAdapter {
        public int getCount() {
            return MvChoosePhotoActivity.this.k;
        }

        public Fragment getItem(int i) {
            if (i == MvChoosePhotoActivity.this.l) {
                return MvChoosePhotoActivity.this.f68531f;
            }
            return MvChoosePhotoActivity.this.f68529d;
        }

        ChoosePhotoAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }
    }

    public interface a {
        void a(boolean z);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f68526a, false, 77962, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68526a, false, 77962, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f68526a, false, 77963, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f68526a, false, 77963, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    public final void a(boolean z2) {
        b bVar;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f68526a, false, 77956, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f68526a, false, 77956, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z2) {
            int b2 = b(this.i.size());
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(b2)}, this, f68526a, false, 77959, new Class[]{Integer.TYPE}, b.class)) {
                bVar = (b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(b2)}, this, f68526a, false, 77959, new Class[]{Integer.TYPE}, b.class);
            } else {
                if (this.o == 3) {
                    b2 = 7;
                }
                bVar = ((IMediaChosenResultProcessFactory) ServiceManager.get().getService(IMediaChosenResultProcessFactory.class)).create(this, b2, this.H);
            }
            Intent intent = new Intent();
            intent.putExtra("key_choose_media_data", this.i);
            intent.putExtra("key_mv_resource_zip_path", this.z);
            intent.putExtra("key_select_mv_data", this.C);
            intent.putExtra("key_short_video_context", this.j);
            Bundle bundle = null;
            if (this.I != null) {
                bundle = this.I.a();
            }
            if (bundle != null) {
                intent.putExtra("key_extra_info", bundle);
            }
            bVar.a(this.A, -1, intent);
        } else {
            finish();
            overridePendingTransition(0, C0906R.anim.s);
        }
    }

    private String a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f68526a, false, 77955, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f68526a, false, 77955, new Class[]{Integer.TYPE}, String.class);
        }
        return "android:switcher:" + C0906R.id.duu + ":" + i2;
    }

    private int b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f68526a, false, 77958, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f68526a, false, 77958, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (this.n != 1) {
            int currentItem = this.s.getCurrentItem();
            if (currentItem == this.l) {
                if (this.o == 1) {
                    this.n = 6;
                } else {
                    this.n = 2;
                }
            } else if (currentItem == this.m) {
                if (this.o == 1) {
                    this.n = 5;
                } else {
                    this.n = 3;
                }
            }
            if (this.n == 3 && (i2 > 1 || (this.D & 1) == 0)) {
                this.n = 4;
            }
        }
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z2) {
        int i2;
        boolean z3 = z2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f68526a, false, 77960, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f68526a, false, 77960, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z3) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.r, "rotation", new float[]{0.0f, 180.0f});
            ofFloat.setDuration(300);
            ofFloat.start();
        } else {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.r, "rotation", new float[]{180.0f, 0.0f});
            ofFloat2.setDuration(300);
            ofFloat2.start();
        }
        MvChooseAlbumFragment mvChooseAlbumFragment = this.f68530e;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2)}, mvChooseAlbumFragment, MvChooseAlbumFragment.f68518a, false, 77940, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            MvChooseAlbumFragment mvChooseAlbumFragment2 = mvChooseAlbumFragment;
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, mvChooseAlbumFragment2, MvChooseAlbumFragment.f68518a, false, 77940, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        mvChooseAlbumFragment.f68523f = z3;
        int i3 = -1;
        if (z3) {
            i2 = 0;
        } else {
            i3 = 0;
            i2 = -1;
        }
        int height = mvChooseAlbumFragment.f68521d.getHeight();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{(float) i3, (float) i2}).setDuration(500);
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.addUpdateListener(new g(mvChooseAlbumFragment, height));
        duration.start();
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f68526a, false, 77961, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f68526a, false, 77961, new Class[]{String.class}, Void.TYPE);
            return;
        }
        r.a(str2, (Map) d.a().a("content_source", "upload").a("content_type", "mv").a("upload_type", "multiple_content").f34114b);
    }

    public final void a(List<MvImageChooseAdapter.b> list) {
        String str;
        if (PatchProxy.isSupport(new Object[]{list}, this, f68526a, false, 77954, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f68526a, false, 77954, new Class[]{List.class}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.base.utils.j.a((Collection<T>) list)) {
            this.f68527b.setVisibility(8);
        } else {
            int size = list.size();
            this.f68527b.setVisibility(0);
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(size)}, this, f68526a, false, 77949, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(size)}, this, f68526a, false, 77949, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                if (b(size) == 4) {
                    if (com.ss.android.g.a.a() && !"en".equals(((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getAppLanguage())) {
                        this.f68527b.setTextSize(1, 13.0f);
                    }
                    str = getResources().getString(C0906R.string.ais);
                } else {
                    this.f68527b.setTextSize(1, 17.0f);
                    str = getResources().getString(C0906R.string.bwp);
                }
                this.f68527b.setText(String.format(str, new Object[]{Integer.valueOf(size)}));
            }
            int currentItem = this.s.getCurrentItem();
            int i2 = this.v;
            if (currentItem == this.l) {
                i2 = this.x;
            }
            if (size < i2) {
                this.f68527b.setTextColor(getResources().getColor(C0906R.color.a21));
                this.f68527b.setClickable(false);
            } else {
                this.f68527b.setTextColor(getResources().getColor(C0906R.color.a1z));
                this.f68527b.setClickable(true);
            }
            this.i.clear();
            this.i.addAll(list);
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z2;
        int i2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f68526a, false, 77948, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f68526a, false, 77948, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(C0906R.anim.r, 0);
        setContentView((int) C0906R.layout.co);
        if (PatchProxy.isSupport(new Object[0], this, f68526a, false, 77952, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68526a, false, 77952, new Class[0], Void.TYPE);
        } else {
            Intent intent = getIntent();
            if (intent != null) {
                this.j = (fh) intent.getParcelableExtra("key_short_video_context");
                this.v = intent.getIntExtra("key_photo_select_min_count", 0);
                this.w = intent.getIntExtra("key_photo_select_max_count", 0);
                this.x = intent.getIntExtra("key_video_select_min_count", 0);
                this.y = intent.getIntExtra("key_video_select_max_count", 0);
                this.h = intent.getIntExtra("upload_photo_min_height", 0);
                this.g = intent.getIntExtra("upload_photo_min_width", 0);
                this.z = intent.getStringExtra("key_mv_resource_zip_path");
                this.G = intent.getStringExtra("key_mv_hint_text");
                this.C = (j) intent.getParcelableExtra("key_select_mv_data");
                this.H = intent.getLongExtra("Key_min_duration", ff.a());
                this.o = intent.getIntExtra("key_choose_scene", -1);
                this.A = intent.getIntExtra("key_choose_request_code", -1);
                this.B = intent.getIntExtra("key_start_activity_request_code", -1);
                if (this.o == 2) {
                    this.n = 1;
                    this.I = new c();
                    String stringExtra = intent.getStringExtra("Key_challenge_id");
                    if (stringExtra != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("Key_challenge_id", stringExtra);
                        this.I.a(bundle2);
                    }
                }
                if (this.o == 3) {
                    this.n = 7;
                }
                this.D = intent.getIntExtra("key_support_flag", -1);
                this.E = intent.getBooleanExtra("Key_enable_multi_video", false);
                if ((this.D & 2) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.F = z2;
                if ((this.D & 4) != 0) {
                    this.l = 0;
                    this.k++;
                }
                if (!((this.D & 1) == 0 && (this.D & 2) == 0)) {
                    this.k++;
                    if (this.l == 0) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    this.m = i2;
                }
            }
        }
        this.f68527b = (TextView) findViewById(C0906R.id.d8x);
        this.f68528c = (DmtTextView) findViewById(C0906R.id.dkk);
        this.r = findViewById(C0906R.id.b5u);
        this.f68527b.setOnClickListener(new h(this));
        findViewById(C0906R.id.d3v).setOnClickListener(i.f68605b);
        findViewById(C0906R.id.ix).setOnClickListener(new j(this));
        if (PatchProxy.isSupport(new Object[0], this, f68526a, false, 77950, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68526a, false, 77950, new Class[0], Void.TYPE);
        } else {
            this.f68527b.setVisibility(0);
            if (com.ss.android.g.a.a() && !"en".equals(((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getAppLanguage())) {
                this.f68527b.setTextSize(1, 13.0f);
            }
            this.f68527b.setText(String.format(getString(C0906R.string.ais), new Object[]{12}));
            this.f68527b.post(new k(this));
        }
        ((Space) findViewById(C0906R.id.css)).setMinimumHeight(p.c());
        this.s = (ViewPager) findViewById(C0906R.id.duu);
        this.t = (MediaTypeNavigator) findViewById(C0906R.id.bm7);
        if (this.k == 1) {
            this.t.setVisibility(8);
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(a(this.m));
        if (findFragmentByTag == null) {
            this.f68529d = new MvChoosePhotoFragment();
        } else {
            this.f68529d = (MvChoosePhotoFragment) findFragmentByTag;
        }
        Fragment findFragmentByTag2 = supportFragmentManager.findFragmentByTag(a(this.l));
        if (findFragmentByTag2 == null) {
            this.f68531f = new ChooseVideoFragment();
        } else {
            this.f68531f = (ChooseVideoFragment) findFragmentByTag2;
        }
        this.s.setAdapter(new ChoosePhotoAdapter(getSupportFragmentManager()));
        this.s.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f68532a;

            public void onPageSelected(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f68532a, false, 77971, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f68532a, false, 77971, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                String str = "";
                if (i == MvChoosePhotoActivity.this.l) {
                    MvChoosePhotoActivity.this.a(MvChoosePhotoActivity.this.q);
                    str = "video";
                } else if (i == MvChoosePhotoActivity.this.m) {
                    MvChoosePhotoActivity.this.a(MvChoosePhotoActivity.this.p);
                    str = "photo";
                }
                if (MvChoosePhotoActivity.this.j != null) {
                    r.a("click_upload_tab", (Map) d.a().a("creation_id", MvChoosePhotoActivity.this.j.q).a("shoot_way", MvChoosePhotoActivity.this.j.r).a("tab_name", str).f34114b);
                }
            }
        });
        this.t.setupWithViewPager(this.s);
        if (PatchProxy.isSupport(new Object[0], this, f68526a, false, 77951, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68526a, false, 77951, new Class[0], Void.TYPE);
        } else {
            this.u = ViewPagerBottomSheetBehavior.a(findViewById(C0906R.id.a3z));
            this.u.l = new ViewPagerBottomSheetBehavior.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f68534a;

                public final void a(@NonNull View view, float f2) {
                }

                public final void a(@NonNull View view, int i) {
                    if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f68534a, false, 77972, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f68534a, false, 77972, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (i == 5) {
                        MvChoosePhotoActivity.this.a(false);
                    }
                }
            };
            this.u.a(p.a(this) + p.d(this));
            this.u.f34776e = true;
            this.u.a(this.s);
        }
        if (PatchProxy.isSupport(new Object[0], this, f68526a, false, 77953, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68526a, false, 77953, new Class[0], Void.TYPE);
        } else {
            this.f68529d.f68546f = this.G;
            this.f68529d.g = this.w;
            this.f68529d.h = this.F;
            this.f68531f.k = this.y;
            this.f68531f.l = this.E;
            this.f68531f.n = this.H;
            this.f68528c.setText(getResources().getString(C0906R.string.e7));
            Fragment findFragmentByTag3 = getSupportFragmentManager().findFragmentByTag("album_Fragment");
            if (findFragmentByTag3 == null) {
                this.f68530e = new MvChooseAlbumFragment();
                getSupportFragmentManager().beginTransaction().add(C0906R.id.aic, this.f68530e, "album_Fragment").commit();
            } else {
                this.f68530e = (MvChooseAlbumFragment) findFragmentByTag3;
            }
            Bundle bundle3 = new Bundle();
            bundle3.putInt("key_support_flag", this.D);
            this.f68530e.setArguments(bundle3);
            findViewById(C0906R.id.rz).setOnClickListener(new l(this));
            this.f68530e.f68522e = new m(this);
            this.f68529d.f68543c = new MvImageChooseAdapter.c() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f68536a;

                public final void a(List<MvImageChooseAdapter.b> list) {
                    if (PatchProxy.isSupport(new Object[]{list}, this, f68536a, false, 77973, new Class[]{List.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{list}, this, f68536a, false, 77973, new Class[]{List.class}, Void.TYPE);
                        return;
                    }
                    MvChoosePhotoActivity.this.p = list;
                    MvChoosePhotoActivity.this.a(list);
                    MvChoosePhotoActivity.this.a("choose_upload_content");
                }

                public final void a(com.ss.android.ugc.aweme.music.b.a.a aVar) {
                    if (PatchProxy.isSupport(new Object[]{aVar}, this, f68536a, false, 77974, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{aVar}, this, f68536a, false, 77974, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE);
                    } else if (aVar.m < MvChoosePhotoActivity.this.h || aVar.l < MvChoosePhotoActivity.this.g) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) MvChoosePhotoActivity.this, MvChoosePhotoActivity.this.getResources().getString(C0906R.string.bmt), 0).a();
                    } else if (MvChoosePhotoActivity.this.o != 3 || aVar == null || com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.f69354f.a(aVar.f56315e)) {
                        MvChoosePhotoActivity.this.i.clear();
                        MvChoosePhotoActivity.this.i.add(aVar);
                        MvChoosePhotoActivity.this.n = 3;
                        MvChoosePhotoActivity.this.a(true);
                    } else {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) MvChoosePhotoActivity.this, MvChoosePhotoActivity.this.getResources().getString(C0906R.string.baf), 0).a();
                    }
                }
            };
            ChooseVideoFragment chooseVideoFragment = this.f68531f;
            AnonymousClass4 r1 = new MvImageChooseAdapter.c() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f68538a;

                public final void a(List<MvImageChooseAdapter.b> list) {
                    if (PatchProxy.isSupport(new Object[]{list}, this, f68538a, false, 77975, new Class[]{List.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{list}, this, f68538a, false, 77975, new Class[]{List.class}, Void.TYPE);
                        return;
                    }
                    MvChoosePhotoActivity.this.q = list;
                    MvChoosePhotoActivity.this.a(list);
                }

                public final void a(com.ss.android.ugc.aweme.music.b.a.a aVar) {
                    if (PatchProxy.isSupport(new Object[]{aVar}, this, f68538a, false, 77976, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{aVar}, this, f68538a, false, 77976, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE);
                        return;
                    }
                    MvChoosePhotoActivity.this.i.clear();
                    MvChoosePhotoActivity.this.i.add(aVar);
                    MvChoosePhotoActivity.this.n = 2;
                    MvChoosePhotoActivity.this.a(true);
                }
            };
            if (PatchProxy.isSupport(new Object[]{r1}, chooseVideoFragment, ChooseVideoFragment.f68508a, false, 77915, new Class[]{MvImageChooseAdapter.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{r1}, chooseVideoFragment, ChooseVideoFragment.f68508a, false, 77915, new Class[]{MvImageChooseAdapter.c.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(r1, "onVideoChooseListener");
                chooseVideoFragment.j = r1;
            }
            ChooseVideoFragment chooseVideoFragment2 = this.f68531f;
            n nVar = new n(this);
            if (PatchProxy.isSupport(new Object[]{nVar}, chooseVideoFragment2, ChooseVideoFragment.f68508a, false, 77916, new Class[]{a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{nVar}, chooseVideoFragment2, ChooseVideoFragment.f68508a, false, 77916, new Class[]{a.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(nVar, "callback");
                chooseVideoFragment2.i = nVar;
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onCreate", false);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f68526a, false, 77957, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f68526a, false, 77957, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        if (i2 == this.B) {
            int i4 = i3;
            setResult(i3, intent2);
            finish();
        }
    }

    public static void a(Activity activity, Bundle bundle, int i2) {
        Activity activity2 = activity;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{activity2, bundle2, Integer.valueOf(i2)}, null, f68526a, true, 77946, new Class[]{Activity.class, Bundle.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, bundle2, Integer.valueOf(i2)}, null, f68526a, true, 77946, new Class[]{Activity.class, Bundle.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(activity2, MvChoosePhotoActivity.class);
        intent.putExtras(bundle2);
        intent.putExtra("key_choose_request_code", i2);
        activity2.startActivity(intent);
    }

    public static void a(Activity activity, Bundle bundle, int i2, int i3) {
        Activity activity2 = activity;
        Bundle bundle2 = bundle;
        int i4 = i3;
        if (PatchProxy.isSupport(new Object[]{activity2, bundle2, Integer.valueOf(i2), Integer.valueOf(i3)}, null, f68526a, true, 77947, new Class[]{Activity.class, Bundle.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, bundle2, Integer.valueOf(i2), Integer.valueOf(i3)}, null, f68526a, true, 77947, new Class[]{Activity.class, Bundle.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(activity2, MvChoosePhotoActivity.class);
        intent.putExtras(bundle2);
        intent.putExtra("key_choose_request_code", i2);
        intent.putExtra("key_start_activity_request_code", i4);
        activity2.startActivityForResult(intent, i4);
    }
}
