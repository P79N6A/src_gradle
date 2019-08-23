package com.ss.android.ugc.aweme.shortvideo.mvtemplate.viewpager;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.widget.CircularProgressView;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.j;
import com.ss.android.ugc.aweme.video.a.a;
import com.ss.android.ugc.aweme.video.b.b;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.ss.android.ugc.playerkit.videoview.h;
import com.ss.android.ugc.playerkit.videoview.i;
import java.util.ArrayList;

public class MvItemFragment extends MvItemFragmentAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68755a;

    /* renamed from: b  reason: collision with root package name */
    public AnimatedImageView f68756b;

    /* renamed from: c  reason: collision with root package name */
    public CircularProgressView f68757c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f68758d;

    /* renamed from: e  reason: collision with root package name */
    public j f68759e;

    /* renamed from: f  reason: collision with root package name */
    public VideoViewComponent f68760f;
    boolean g;
    public View h;
    private DmtLoadingLayout j;
    private KeepSurfaceTextureView k;
    private View l;
    private View m;
    private int n;
    private Video o;
    private boolean p;

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f68755a, false, 78136, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68755a, false, 78136, new Class[0], Void.TYPE);
            return;
        }
        d(false);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f68755a, false, 78140, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68755a, false, 78140, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f68760f == null || this.f68760f.c() || this.o == null)) {
            this.f68760f.a(this.o);
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f68755a, false, 78142, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68755a, false, 78142, new Class[0], Void.TYPE);
            return;
        }
        if (this.f68760f != null) {
            this.f68760f.a();
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f68755a, false, 78126, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68755a, false, 78126, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        e();
        if (this.f68760f != null) {
            this.f68760f.b((a) this);
        }
    }

    private boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f68755a, false, 78132, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f68755a, false, 78132, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f68759e != null && this.f68759e.f68724b != null && !TextUtils.isEmpty(this.f68759e.g()) && !TextUtils.isEmpty(this.f68759e.f68728f) && !TextUtils.isEmpty(this.f68759e.k())) {
            return true;
        } else {
            return false;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f68755a, false, 78128, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68755a, false, 78128, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f68756b == null || this.f68759e == null || TextUtils.isEmpty(this.f68759e.i()))) {
            c.a((RemoteImageView) this.f68756b, this.f68759e.i());
        }
        if (this.n == 0 && !this.p) {
            b();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f68755a, false, 78131, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68755a, false, 78131, new Class[0], Void.TYPE);
        } else if (this.f68760f != null && f()) {
            if (this.o == null) {
                this.o = new Video();
                VideoUrlModel videoUrlModel = new VideoUrlModel();
                videoUrlModel.setH265(false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f68759e.g());
                videoUrlModel.setUrlList(arrayList);
                videoUrlModel.setUrlKey(this.f68759e.f68728f);
                videoUrlModel.setUri(this.f68759e.f68728f);
                this.o.setPlayAddr(videoUrlModel);
                this.o.setSourceId(this.f68759e.k());
            }
            this.f68760f.a(this.o);
            this.p = true;
            if (!(this.f68758d == null || this.f68758d.getVisibility() == 0)) {
                this.f68758d.postDelayed(new b(this), 300);
            }
        }
    }

    public final void a(e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f68755a, false, 78138, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f68755a, false, 78138, new Class[]{e.class}, Void.TYPE);
            return;
        }
        a(false);
        if (this.f68756b != null) {
            this.f68756b.setVisibility(0);
        }
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f68755a, false, 78139, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f68755a, false, 78139, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f68756b != null) {
            this.f68756b.setVisibility(8);
        }
    }

    public void d(boolean z) {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f68755a, false, 78135, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f68755a, false, 78135, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        int i3 = 8;
        if (this.l != null) {
            View view = this.l;
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
        if (this.f68757c != null) {
            CircularProgressView circularProgressView = this.f68757c;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            circularProgressView.setVisibility(i);
        }
        if (this.f68758d != null) {
            TextView textView = this.f68758d;
            if (z) {
                i3 = 0;
            }
            textView.setVisibility(i3);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f68755a, false, 78130, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f68755a, false, 78130, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.n = getArguments().getInt("position");
    }

    public final void a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f68755a, false, 78137, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f68755a, false, 78137, new Class[]{b.class}, Void.TYPE);
            return;
        }
        this.g = true;
        a(false);
        if (this.f68756b != null) {
            this.f68756b.setVisibility(8);
        }
    }

    public void a(boolean z) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f68755a, false, 78134, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f68755a, false, 78134, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.j != null) {
            DmtLoadingLayout dmtLoadingLayout = this.j;
            if (!z) {
                i = 8;
            }
            dmtLoadingLayout.setVisibility(i);
        }
    }

    public static MvItemFragment a(j jVar, int i) {
        j jVar2 = jVar;
        if (PatchProxy.isSupport(new Object[]{jVar2, Integer.valueOf(i)}, null, f68755a, true, 78124, new Class[]{j.class, Integer.TYPE}, MvItemFragment.class)) {
            return (MvItemFragment) PatchProxy.accessDispatch(new Object[]{jVar2, Integer.valueOf(i)}, null, f68755a, true, 78124, new Class[]{j.class, Integer.TYPE}, MvItemFragment.class);
        }
        MvItemFragment mvItemFragment = new MvItemFragment();
        mvItemFragment.f68759e = jVar2;
        Bundle bundle = new Bundle();
        bundle.putInt("position", i);
        mvItemFragment.setArguments(bundle);
        return mvItemFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f68755a, false, 78125, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f68755a, false, 78125, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        if (this.h == null) {
            this.h = layoutInflater.inflate(C0906R.layout.y0, viewGroup2, false);
        }
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f68755a, false, 78127, new Class[]{ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f68755a, false, 78127, new Class[]{ViewGroup.class}, Void.TYPE);
        } else {
            this.f68756b = (AnimatedImageView) this.h.findViewById(C0906R.id.b2e);
            this.m = this.h.findViewById(C0906R.id.chy);
            this.k = (KeepSurfaceTextureView) this.h.findViewById(C0906R.id.dt9);
            this.j = (DmtLoadingLayout) this.h.findViewById(C0906R.id.bjl);
            this.f68757c = (CircularProgressView) this.h.findViewById(C0906R.id.b2w);
            this.l = this.h.findViewById(C0906R.id.bj9);
            this.f68758d = (TextView) this.h.findViewById(C0906R.id.c7k);
            this.f68757c.setVisibility(4);
            this.f68758d.setVisibility(4);
            this.f68757c.setColor(-1);
            this.f68757c.setThickness((int) UIUtils.dip2Px(this.m.getContext(), 2.0f));
            if (Build.VERSION.SDK_INT >= 21) {
                this.m.setOutlineProvider(new com.ss.android.ugc.aweme.shortvideo.mvtemplate.view.a((int) UIUtils.dip2Px(this.f68756b.getContext(), 8.0f)));
                this.m.setClipToOutline(true);
            }
            h a2 = h.a(this.k);
            this.f68760f = new VideoViewComponent();
            this.f68760f.a(this.k);
            this.f68760f.a((a) this);
            a2.a((i) new i() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f68761a;

                public final void a(int i, int i2) {
                }

                public final void b(int i, int i2) {
                }

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f68761a, false, 78146, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f68761a, false, 78146, new Class[0], Void.TYPE);
                        return;
                    }
                    if (MvItemFragment.this.f68756b != null) {
                        MvItemFragment.this.f68756b.setVisibility(0);
                    }
                }
            });
            this.h.setTag(Integer.valueOf(this.n));
            this.h.post(new a(this, viewGroup2));
        }
        a();
        return this.h;
    }
}
