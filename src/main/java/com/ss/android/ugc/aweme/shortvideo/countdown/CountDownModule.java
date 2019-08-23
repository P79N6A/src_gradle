package com.ss.android.ugc.aweme.shortvideo.countdown;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.b.a.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.internal.m;
import com.ss.android.ugc.aweme.shortvideo.countdown.CountdownFragment;
import com.ss.android.ugc.aweme.shortvideo.countdown.g;
import com.ss.android.ugc.aweme.shortvideo.countdown.h;
import com.ss.android.ugc.aweme.shortvideo.ea;
import com.ss.android.ugc.aweme.shortvideo.f;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public class CountDownModule implements LifecycleObserver, h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3897a;

    /* renamed from: b  reason: collision with root package name */
    public FragmentActivity f3898b;

    /* renamed from: c  reason: collision with root package name */
    public g f3899c;

    /* renamed from: d  reason: collision with root package name */
    public h f3900d;

    /* renamed from: e  reason: collision with root package name */
    public int f3901e;

    /* renamed from: f  reason: collision with root package name */
    public long f3902f = ea.f66827f;
    public g.a g = new g.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66035a;

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f66035a, false, 75315, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f66035a, false, 75315, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            CountdownFragment countdownFragment = (CountdownFragment) CountDownModule.this.f3898b.getSupportFragmentManager().findFragmentByTag("count_down");
            if (countdownFragment != null) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, countdownFragment, CountdownFragment.f66037a, false, 75329, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    CountdownFragment countdownFragment2 = countdownFragment;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, countdownFragment2, CountdownFragment.f66037a, false, 75329, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                countdownFragment.f66038b.setProgress(i);
            }
        }
    };
    private d<JSONObject> h;
    private CountdownFragment.a i = new CountdownFragment.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66033a;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f66033a, false, 75313, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66033a, false, 75313, new Class[0], Void.TYPE);
                return;
            }
            if (CountDownModule.this.f3899c != null) {
                CountDownModule.this.f3899c.a();
            }
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f66033a, false, 75314, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f66033a, false, 75314, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            CountDownModule.this.f3901e = (int) Math.min(CountDownModule.this.f3902f, (long) i);
            CountDownModule.this.f3900d.a();
        }

        public final void a(@Nullable String str, int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2)}, this, f66033a, false, 75312, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2)}, this, f66033a, false, 75312, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (str != null) {
                if (CountDownModule.this.f3899c != null) {
                    CountDownModule.this.f3899c.a();
                }
                CountDownModule.this.f3899c = new g(CountDownModule.this.f3898b, Uri.parse(str));
                CountDownModule.this.f3899c.f66078f = CountDownModule.this.g;
                g gVar = CountDownModule.this.f3899c;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, gVar, g.f66073a, false, 75338, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    g gVar2 = gVar;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, gVar2, g.f66073a, false, 75338, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (gVar.f66074b != null) {
                    gVar.f66074b.seekTo(i);
                    gVar.f66074b.start();
                    gVar.f66077e.post(new Runnable(i2) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f66079a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ int f66080b;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f66079a, false, 75343, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f66079a, false, 75343, new Class[0], Void.TYPE);
                                return;
                            }
                            if (!g.this.g && g.this.f66074b.isPlaying()) {
                                int currentPosition = g.this.f66074b.getCurrentPosition();
                                if (currentPosition < this.f66080b) {
                                    g gVar = g.this;
                                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(currentPosition)}, gVar, g.f66073a, false, 75341, new Class[]{Integer.TYPE}, Void.TYPE)) {
                                        g gVar2 = gVar;
                                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(currentPosition)}, gVar2, g.f66073a, false, 75341, new Class[]{Integer.TYPE}, Void.TYPE);
                                    } else if (gVar.f66078f != null) {
                                        gVar.f66078f.a(currentPosition);
                                    }
                                    g.this.f66077e.post(this);
                                    return;
                                }
                                g.this.f66074b.stop();
                                g.this.a();
                            }
                        }

                        {
                            this.f66080b = r2;
                        }
                    });
                }
            }
        }
    };

    public interface a {
        void a();

        void b();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3897a, false, 75305, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3897a, false, 75305, new Class[0], Void.TYPE);
            return;
        }
        this.f3900d.a();
    }

    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f3897a, false, 75307, new Class[0], Boolean.TYPE)) {
            return this.f3900d.b();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3897a, false, 75307, new Class[0], Boolean.TYPE)).booleanValue();
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void pause() {
        if (PatchProxy.isSupport(new Object[0], this, f3897a, false, 75309, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3897a, false, 75309, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3899c != null) {
            g gVar = this.f3899c;
            if (PatchProxy.isSupport(new Object[0], gVar, g.f66073a, false, 75339, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], gVar, g.f66073a, false, 75339, new Class[0], Void.TYPE);
            } else if (gVar.f66074b != null) {
                try {
                    gVar.f66074b.pause();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void resume() {
        if (PatchProxy.isSupport(new Object[0], this, f3897a, false, 75308, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3897a, false, 75308, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3899c != null) {
            g gVar = this.f3899c;
            if (PatchProxy.isSupport(new Object[0], gVar, g.f66073a, false, 75340, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], gVar, g.f66073a, false, 75340, new Class[0], Void.TYPE);
            } else if (gVar.f66074b != null) {
                try {
                    gVar.f66074b.start();
                } catch (Exception unused) {
                }
            }
        }
    }

    public CountDownModule(@NonNull FragmentActivity fragmentActivity, @NonNull FrameLayout frameLayout, @NonNull h.a aVar, @NonNull d<JSONObject> dVar) {
        this.f3898b = fragmentActivity;
        this.h = dVar;
        this.f3900d = new a(frameLayout, aVar);
        fragmentActivity.getLifecycle().addObserver(this);
    }

    public final void a(@Nullable String str, @Nullable UrlModel urlModel, long j, long j2, long j3, long j4, f fVar, @NonNull a aVar) {
        CountdownFragment countdownFragment;
        String str2 = str;
        UrlModel urlModel2 = urlModel;
        long j5 = j;
        long j6 = j2;
        long j7 = j3;
        a aVar2 = aVar;
        a aVar3 = aVar2;
        if (PatchProxy.isSupport(new Object[]{str2, urlModel2, new Long(j5), new Long(j6), new Long(j7), new Long(j4), fVar, aVar2}, this, f3897a, false, 75304, new Class[]{String.class, UrlModel.class, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, f.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, urlModel2, new Long(j5), new Long(j6), new Long(j7), new Long(j4), fVar, aVar3}, this, f3897a, false, 75304, new Class[]{String.class, UrlModel.class, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, f.class, a.class}, Void.TYPE);
            return;
        }
        final a aVar4 = aVar3;
        long j8 = j4;
        this.f3898b.getSupportFragmentManager().registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f66030a;

            public void onFragmentDestroyed(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment) {
                if (PatchProxy.isSupport(new Object[]{fragmentManager, fragment}, this, f66030a, false, 75311, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{fragmentManager, fragment}, this, f66030a, false, 75311, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE);
                    return;
                }
                if (fragment instanceof CountdownFragment) {
                    aVar4.b();
                    fragmentManager.unregisterFragmentLifecycleCallbacks(this);
                }
            }

            public void onFragmentCreated(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment, Bundle bundle) {
                Fragment fragment2 = fragment;
                if (PatchProxy.isSupport(new Object[]{fragmentManager, fragment2, bundle}, this, f66030a, false, 75310, new Class[]{FragmentManager.class, Fragment.class, Bundle.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{fragmentManager, fragment2, bundle}, this, f66030a, false, 75310, new Class[]{FragmentManager.class, Fragment.class, Bundle.class}, Void.TYPE);
                    return;
                }
                if (fragment2 instanceof CountdownFragment) {
                    aVar4.a();
                }
            }
        }, false);
        this.f3902f = j8;
        ((m) com.ss.android.ugc.aweme.common.g.a.a(this.f3898b, m.class)).a(false);
        f a2 = com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a().a(fVar);
        Object[] objArr = {str2, a2, urlModel2, new Long(j5), new Long(j6), new Long(j7), new Long(j8)};
        if (PatchProxy.isSupport(objArr, null, CountdownFragment.f66037a, true, 75320, new Class[]{String.class, f.class, UrlModel.class, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE}, CountdownFragment.class)) {
            countdownFragment = (CountdownFragment) PatchProxy.accessDispatch(new Object[]{str2, a2, urlModel2, new Long(j5), new Long(j6), new Long(j7), new Long(j8)}, null, CountdownFragment.f66037a, true, 75320, new Class[]{String.class, f.class, UrlModel.class, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE}, CountdownFragment.class);
        } else {
            CountdownFragment countdownFragment2 = new CountdownFragment();
            Bundle bundle = new Bundle();
            bundle.putString("path", str2);
            bundle.putSerializable("volume_taps", urlModel2);
            bundle.putLong("sdk_record_time", j5);
            bundle.putLong("start_time", j7);
            bundle.putLong("total_time", j6);
            bundle.putLong("max_duration", j8);
            bundle.putSerializable("wave_info", a2);
            countdownFragment2.setArguments(bundle);
            countdownFragment = countdownFragment2;
        }
        countdownFragment.f66039c = this.i;
        countdownFragment.show(this.f3898b.getSupportFragmentManager(), "count_down");
        r.onEvent(MobClick.obtain().setEventName("count_down").setLabelName("shoot_page").setJsonObject((JSONObject) this.h.a()));
    }
}
