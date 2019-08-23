package com.ss.android.ugc.aweme.shortvideo.cover;

import android.app.Activity;
import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.filter.w;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.photomovie.edit.cover.b;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.MvChooseCoverAdapter;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;
import com.ss.android.ugc.aweme.utils.ax;
import com.ss.android.vesdk.p;
import dmt.av.video.s;
import java.util.Map;

public class VEChooseVideoCoverFragment extends Fragment implements ChooseVideoCoverView.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66090a;

    /* renamed from: b  reason: collision with root package name */
    public ChooseVideoCoverView f66091b;

    /* renamed from: c  reason: collision with root package name */
    View f66092c;

    /* renamed from: d  reason: collision with root package name */
    View f66093d;

    /* renamed from: e  reason: collision with root package name */
    ViewGroup f66094e;

    /* renamed from: f  reason: collision with root package name */
    ViewGroup f66095f;
    ViewGroup g;
    b h;
    SafeHandler i;
    public a j;
    public float k;
    public boolean l;
    public d m;
    public MutableLiveData<Bitmap> n;
    public MutableLiveData<Boolean> o;

    public interface a {
        p a();

        MutableLiveData<s> b();

        cb c();
    }

    public void onHiddenChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f66090a, false, 75367, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f66090a, false, 75367, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f66090a, false, 75369, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66090a, false, 75369, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f66090a, false, 75368, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66090a, false, 75368, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f66090a, false, 75370, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f66090a, false, 75370, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    public final int b() {
        if (!PatchProxy.isSupport(new Object[0], this, f66090a, false, 75363, new Class[0], Integer.TYPE)) {
            return this.f66094e.getMeasuredHeight();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f66090a, false, 75363, new Class[0], Integer.TYPE)).intValue();
    }

    public final int c() {
        if (!PatchProxy.isSupport(new Object[0], this, f66090a, false, 75364, new Class[0], Integer.TYPE)) {
            return this.f66095f.getMeasuredHeight();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f66090a, false, 75364, new Class[0], Integer.TYPE)).intValue();
    }

    public final int d() {
        if (!PatchProxy.isSupport(new Object[0], this, f66090a, false, 75365, new Class[0], Integer.TYPE)) {
            return this.g.getMeasuredHeight();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f66090a, false, 75365, new Class[0], Integer.TYPE)).intValue();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f66090a, false, 75357, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66090a, false, 75357, new Class[0], Void.TYPE);
            return;
        }
        if (this.f66091b.getAdapter() instanceof ChooseVideoCoverView.Adapter) {
            ChooseVideoCoverView.Adapter adapter = (ChooseVideoCoverView.Adapter) this.f66091b.getAdapter();
            if (adapter != null) {
                adapter.a();
            }
        }
        super.onDestroy();
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f66090a, false, 75356, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f66090a, false, 75356, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.m != null) {
            this.m.dismiss();
        }
        this.i.removeCallbacksAndMessages(null);
        this.j.b().setValue(s.b());
        this.j.a().a(true);
        this.j.b().setValue(s.a());
        if (getFragmentManager() == null) {
            return false;
        }
        requireFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
        return true;
    }

    private int d(float f2) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f66090a, false, 75361, new Class[]{Float.TYPE}, Integer.TYPE)) {
            return (int) (((float) this.h.b()) * f2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f66090a, false, 75361, new Class[]{Float.TYPE}, Integer.TYPE)).intValue();
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f66090a, false, 75358, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f66090a, false, 75358, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.i.removeCallbacksAndMessages(null);
        this.j.b().setValue(s.b());
    }

    public final void b(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f66090a, false, 75359, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f66090a, false, 75359, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.l = true;
        this.j.b().setValue(s.a((long) d(f2)));
    }

    public void onAttach(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f66090a, false, 75350, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f66090a, false, 75350, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        super.onAttach(context);
        if (context2 instanceof a) {
            this.j = (a) context2;
            Activity activity = (Activity) context2;
            v.b(activity);
            if (com.ss.android.g.a.b()) {
                v.c(activity);
            }
            return;
        }
        throw new IllegalStateException("context must implement ArgumentsDependency");
    }

    /* access modifiers changed from: package-private */
    public final void a(final long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f66090a, false, 75362, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f66090a, false, 75362, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.j.b().setValue(s.b());
        this.j.b().setValue(s.a());
        this.i.postDelayed(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f66103a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f66103a, false, 75377, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f66103a, false, 75377, new Class[0], Void.TYPE);
                    return;
                }
                VEChooseVideoCoverFragment.this.l = false;
                VEChooseVideoCoverFragment.this.j.b().setValue(s.b(j2));
                VEChooseVideoCoverFragment.this.a(j2);
            }
        }, 1000);
    }

    public final void c(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f66090a, false, 75360, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f66090a, false, 75360, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.l = true;
        s b2 = s.b((long) d(f2));
        this.j.b().setValue(b2);
        r.onEvent(new MobClick().setEventName("choose_cover").setLabelName("cover_page"));
        r.a("cover_click", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.j.c().creationId).a("shoot_way", this.j.c().mShootWay).a("draft_id", this.j.c().draftId).f34114b);
        if (this.h != null) {
            a(b2.f83062c);
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        MvEffectVideoCoverGeneratorImpl mvEffectVideoCoverGeneratorImpl;
        String str;
        String str2;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f66090a, false, 75354, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f66090a, false, 75354, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        this.f66091b.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f66091b.setOnScrollListener(this);
        final cb c2 = this.j.c();
        if (PatchProxy.isSupport(new Object[]{c2}, this, f66090a, false, 75355, new Class[]{cb.class}, b.class)) {
            mvEffectVideoCoverGeneratorImpl = (b) PatchProxy.accessDispatch(new Object[]{c2}, this, f66090a, false, 75355, new Class[]{cb.class}, b.class);
        } else if (c2.isMvThemeVideoType()) {
            if (this.j.a() != null) {
                i2 = this.j.a().t();
            }
            mvEffectVideoCoverGeneratorImpl = new MvEffectVideoCoverGeneratorImpl(i2);
        } else if (((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().isEnableUseVEGetThumbs()) {
            p a2 = this.j.a();
            if (c2.isReverse()) {
                str2 = c2.mReversePath;
            } else {
                str2 = c2.mPath;
            }
            mvEffectVideoCoverGeneratorImpl = new VEVideoCoverGeneratorImpl(a2, this, str2, this.f66091b.getCoverSize());
        } else {
            if (c2.isReverse()) {
                str = c2.mReversePath;
            } else {
                str = c2.mPath;
            }
            EffectVideoCoverGeneratorImpl effectVideoCoverGeneratorImpl = new EffectVideoCoverGeneratorImpl(this, str, c2.mEffectList, w.a(c2.mSelectedId).j, this.f66091b.getCoverSize(), c2.isReverse(), c2.previewConfigure);
            mvEffectVideoCoverGeneratorImpl = effectVideoCoverGeneratorImpl;
        }
        this.h = mvEffectVideoCoverGeneratorImpl;
        this.f66091b.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f66096a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f66096a, false, 75372, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f66096a, false, 75372, new Class[0], Void.TYPE);
                    return;
                }
                int measuredHeight = VEChooseVideoCoverFragment.this.f66091b.getMeasuredHeight();
                int oneThumbWidth = (int) VEChooseVideoCoverFragment.this.f66091b.getOneThumbWidth();
                if (c2.isMvThemeVideoType()) {
                    MvChooseCoverAdapter mvChooseCoverAdapter = new MvChooseCoverAdapter(oneThumbWidth, measuredHeight);
                    VEChooseVideoCoverFragment.this.f66091b.setAdapter(mvChooseCoverAdapter);
                    new com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.a().a(oneThumbWidth, measuredHeight).a(VEChooseVideoCoverFragment.this.n).b(VEChooseVideoCoverFragment.this.o).a(VEChooseVideoCoverFragment.this.getActivity(), VEChooseVideoCoverFragment.this.j.a(), 7, new b(mvChooseCoverAdapter));
                    return;
                }
                VEChooseVideoCoverFragment.this.f66091b.setAdapter(new ChooseVideoCoverView.Adapter(VEChooseVideoCoverFragment.this.h, oneThumbWidth, measuredHeight));
            }
        });
        this.f66092c.setOnClickListener(new ax() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f66099a;

            public final void a(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f66099a, false, 75374, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f66099a, false, 75374, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                cb c2 = VEChooseVideoCoverFragment.this.j.c();
                c2.mVideoCoverStartTm = VEChooseVideoCoverFragment.this.k / 1000.0f;
                if (c2.isMvThemeVideoType()) {
                    c2.mvCreateVideoData.videoCoverStartTime = (int) VEChooseVideoCoverFragment.this.k;
                    VEChooseVideoCoverFragment.this.m = d.b(VEChooseVideoCoverFragment.this.getContext(), "");
                    VEChooseVideoCoverFragment.this.m.setIndeterminate(true);
                    new com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.a(VEChooseVideoCoverFragment.this.j.a(), c2.mvCreateVideoData.videoCoverImgPath, c2.mvCreateVideoData.videoCoverStartTime, new c(this));
                    return;
                }
                VEChooseVideoCoverFragment.this.a();
            }
        });
        this.f66093d.setOnClickListener(new ax() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f66101a;

            public final void a(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f66101a, false, 75376, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f66101a, false, 75376, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                VEChooseVideoCoverFragment.this.requireFragmentManager().beginTransaction().remove(VEChooseVideoCoverFragment.this).commitAllowingStateLoss();
            }
        });
        this.i = new SafeHandler(this);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f66090a, false, 75352, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f66090a, false, 75352, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f66091b = (ChooseVideoCoverView) ViewCompat.requireViewById(view, C0906R.id.sq);
        this.f66092c = ViewCompat.requireViewById(view, C0906R.id.d__);
        this.f66093d = ViewCompat.requireViewById(view, C0906R.id.d_9);
        this.f66095f = (ViewGroup) ViewCompat.requireViewById(view, C0906R.id.dt3);
        this.f66094e = (ViewGroup) ViewCompat.requireViewById(view, C0906R.id.anj);
        this.g = (ViewGroup) ViewCompat.requireViewById(view, C0906R.id.cc9);
        ViewCompat.requireViewById(view, C0906R.id.dui).setOnTouchListener(a.f66107b);
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f66090a, false, 75351, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.f_, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f66090a, false, 75351, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
