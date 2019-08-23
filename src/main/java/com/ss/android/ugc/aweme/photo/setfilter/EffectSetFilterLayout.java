package com.ss.android.ugc.aweme.photo.setfilter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.effect.c.a.a;
import com.ss.android.ugc.aweme.filter.EffectCenterLayoutManager;
import com.ss.android.ugc.aweme.filter.EffectFilterAdapter;
import com.ss.android.ugc.aweme.filter.EffectFilterDiff;
import com.ss.android.ugc.aweme.filter.aa;
import com.ss.android.ugc.aweme.filter.f;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.filter.w;
import com.ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.shortvideo.bj;
import com.ss.android.ugc.aweme.shortvideo.filter.b;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.ss.android.ugc.aweme.themechange.base.AVDmtPanelFrameLayout;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EffectSetFilterLayout extends AVDmtPanelFrameLayout implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58738a;

    /* renamed from: b  reason: collision with root package name */
    public EffectFilterAdapter f58739b;

    /* renamed from: c  reason: collision with root package name */
    public RelativeLayout f58740c;

    /* renamed from: d  reason: collision with root package name */
    public PhotoContext f58741d;

    /* renamed from: e  reason: collision with root package name */
    AVDmtTabLayout f58742e;

    /* renamed from: f  reason: collision with root package name */
    public LinearLayoutManager f58743f;
    public List<EffectCategoryResponse> g;
    public h h;
    Map<h, a<h, Void>> i;
    private RecyclerView j;
    private ImageView k;
    private ImageView l;
    private FilterBeautySeekBar m;
    private TextView n;
    private TextView o;
    private int p;
    private float q;
    private int r;
    private float s;
    private f t;
    private a<h, Void> u;

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f58738a, false, 63820, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58738a, false, 63820, new Class[0], Void.TYPE);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f58740c, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58746a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f58746a, false, 63847, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f58746a, false, 63847, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                EffectSetFilterLayout.this.f58740c.setVisibility(8);
            }
        });
        ofFloat.setDuration(150);
        ofFloat.start();
    }

    public EffectSetFilterLayout(@NonNull Context context) {
        this(context, null);
    }

    public void setPhotoContext(PhotoContext photoContext) {
        this.f58741d = photoContext;
        if (this.f58741d != null) {
            this.r = this.f58741d.mFilterIndex;
            this.s = this.f58741d.mFilterRate;
        }
    }

    private void c(h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f58738a, false, 63833, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f58738a, false, 63833, new Class[]{h.class}, Void.TYPE);
            return;
        }
        int a2 = this.f58739b.a(hVar);
        if (a2 != -1) {
            int c2 = f.c(this.f58739b, a2);
            if (this.f58742e.getSelectedTabPosition() != c2) {
                a(c2);
            }
        }
    }

    public final int b(h hVar) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, this, f58738a, false, 63840, new Class[]{h.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{hVar2}, this, f58738a, false, 63840, new Class[]{h.class}, Integer.TYPE)).intValue();
        }
        List data = this.f58739b.getData();
        if (CollectionUtils.isEmpty(data) || hVar2 == null) {
            return -1;
        }
        for (int i2 = 0; i2 < data.size(); i2++) {
            if (hVar2.equals(data.get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    public void setData(List<h> list) {
        List<h> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f58738a, false, 63838, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f58738a, false, 63838, new Class[]{List.class}, Void.TYPE);
        } else if (!Lists.isEmpty(list)) {
            this.f58739b.setData(list2);
        }
    }

    public void setOnFilterChangeListener(f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f58738a, false, 63831, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, f58738a, false, 63831, new Class[]{f.class}, Void.TYPE);
            return;
        }
        this.t = fVar;
        if (this.f58739b != null) {
            this.f58739b.f47314d = new c(this);
        }
    }

    public void setFilterIndex(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f58738a, false, 63834, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f58738a, false, 63834, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (w.b(this.f58739b.a(this.p))) {
            this.p = i2;
            int i3 = this.p;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3)}, this, f58738a, false, 63835, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3)}, this, f58738a, false, 63835, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            h a2 = this.f58739b.a(this.p);
            this.q = 0.8f;
            EffectFilterAdapter effectFilterAdapter = this.f58739b;
            int i4 = this.p;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i4)}, effectFilterAdapter, EffectFilterAdapter.f47311a, false, 44041, new Class[]{Integer.TYPE}, Void.TYPE)) {
                EffectFilterAdapter effectFilterAdapter2 = effectFilterAdapter;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i4)}, effectFilterAdapter2, EffectFilterAdapter.f47311a, false, 44041, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                effectFilterAdapter.b(effectFilterAdapter.a(i4));
            }
            c(a2);
            if (i3 != 0) {
                a(i3, this.q);
                if (this.t != null) {
                    this.t.a(this.f58741d, 5);
                }
            }
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f58738a, false, 63818, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f58738a, false, 63818, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.f58742e != null) {
            this.f58742e.a(i2, 0.0f, true);
            TabLayout.e a2 = this.f58742e.a(i2);
            if (a2 != null) {
                a2.a();
            }
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f58738a, false, 63819, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f58738a, false, 63819, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.adj) {
            if (PatchProxy.isSupport(new Object[0], this, f58738a, false, 63823, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f58738a, false, 63823, new Class[0], Void.TYPE);
            } else {
                a(this.r, this.s);
                if (this.j != null) {
                    this.j.stopScroll();
                }
                if (this.t != null) {
                    this.t.a(this.f58741d, 0);
                }
            }
        } else if (id == C0906R.id.adl) {
            if (PatchProxy.isSupport(new Object[0], this, f58738a, false, 63824, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f58738a, false, 63824, new Class[0], Void.TYPE);
            } else {
                a(this.p, this.q);
                if (this.t != null) {
                    this.t.a(this.f58741d, 1);
                }
            }
        } else if (id == C0906R.id.adx) {
            if (PatchProxy.isSupport(new Object[0], this, f58738a, false, 63825, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f58738a, false, 63825, new Class[0], Void.TYPE);
            } else {
                this.q = 0.8f;
                if (this.p == this.r) {
                    this.q = this.s;
                }
                a(this.p, this.q);
                if (this.t != null) {
                    this.t.a(this.f58741d, 3);
                }
                a();
            }
        } else if (id == C0906R.id.ady) {
            if (PatchProxy.isSupport(new Object[0], this, f58738a, false, 63826, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f58738a, false, 63826, new Class[0], Void.TYPE);
                return;
            }
            a(this.p, this.q);
            if (this.t != null) {
                this.t.a(this.f58741d, 2);
            }
            a();
        }
    }

    public void setData(@Nullable Map<EffectCategoryResponse, List<h>> map) {
        if (PatchProxy.isSupport(new Object[]{map}, this, f58738a, false, 63837, new Class[]{Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map}, this, f58738a, false, 63837, new Class[]{Map.class}, Void.TYPE);
        } else if (map != null && !map.isEmpty()) {
            Set<Map.Entry<EffectCategoryResponse, List<h>>> entrySet = map.entrySet();
            if (PatchProxy.isSupport(new Object[]{entrySet}, this, f58738a, false, 63836, new Class[]{Set.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{entrySet}, this, f58738a, false, 63836, new Class[]{Set.class}, Void.TYPE);
            } else if (this.f58742e.getTabCount() != entrySet.size()) {
                final int i2 = 0;
                for (Map.Entry next : entrySet) {
                    this.g.add(next.getKey());
                    View a2 = f.a(getContext(), i2, (EffectCategoryResponse) next.getKey(), this.f58739b.g);
                    final TabLayout.e a3 = this.f58742e.a().a(a2);
                    this.f58742e.a(a3);
                    a2.setOnClickListener(new View.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f58752a;

                        public final void onClick(View view) {
                            if (PatchProxy.isSupport(new Object[]{view}, this, f58752a, false, 63852, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view}, this, f58752a, false, 63852, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            ClickInstrumentation.onClick(view);
                            if (EffectSetFilterLayout.this.f58743f != null) {
                                EffectSetFilterLayout.this.f58743f.scrollToPositionWithOffset(f.a(EffectSetFilterLayout.this.f58739b, i2), 0);
                            }
                            a3.a();
                            EffectCategoryResponse effectCategoryResponse = EffectSetFilterLayout.this.g.get(a3.f70400f);
                            if (!(EffectSetFilterLayout.this.f58741d == null || effectCategoryResponse == null)) {
                                com.ss.android.ugc.aweme.utils.a.f75468b.a("click_filter_tab", bj.a().a("creation_id", EffectSetFilterLayout.this.f58741d.creationId).a("shoot_way", EffectSetFilterLayout.this.f58741d.mShootWay).a("tab_name", effectCategoryResponse.name).a("content_source", EffectSetFilterLayout.this.f58741d.getAvetParameter().getContentSource()).a("content_type", EffectSetFilterLayout.this.f58741d.getAvetParameter().getContentType()).a("enter_from", "video_edit_page").a("scene_id", "1002").f65805b);
                            }
                        }
                    });
                    i2++;
                }
                TabLayout.e a4 = this.f58742e.a(0);
                if (a4 != null) {
                    this.f58742e.post(new d(this, a4));
                }
            }
            List data = this.f58739b.getData();
            List<h> a5 = f.a(map);
            DiffUtil.calculateDiff(new EffectFilterDiff(data, a5), true).dispatchUpdatesTo((RecyclerView.Adapter) this.f58739b);
            this.f58739b.setData(a5);
            if (PatchProxy.isSupport(new Object[]{a5}, this, f58738a, false, 63839, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{a5}, this, f58738a, false, 63839, new Class[]{List.class}, Void.TYPE);
                return;
            }
            if (!CollectionUtils.isEmpty(a5)) {
                for (h next2 : a5) {
                    if (!this.i.containsKey(next2)) {
                        aa.a().a(next2, this.u);
                        this.i.put(next2, this.u);
                    }
                }
            }
        }
    }

    public final void a(h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f58738a, false, 63832, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f58738a, false, 63832, new Class[]{h.class}, Void.TYPE);
            return;
        }
        this.p = hVar.f47602f;
        this.q = 0.8f;
        a(hVar.f47602f, this.q);
        if (this.t != null) {
            this.t.a(this.f58741d, 5);
        }
        this.f58739b.b(hVar);
    }

    public EffectSetFilterLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(int i2, float f2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Float.valueOf(f2)}, this, f58738a, false, 63827, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Float.valueOf(f2)}, this, f58738a, false, 63827, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.f58741d.mFilterIndex = i2;
        h a2 = w.a(i2);
        if (a2 != null) {
            this.f58741d.mFilterName = a2.f47600d;
            this.f58741d.mFilterId = a2.f47598b;
        }
        this.f58741d.mFilterRate = f2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(h hVar, boolean z) {
        if (!z) {
            this.h = hVar;
            c(hVar);
            this.f58739b.c(hVar);
            return;
        }
        this.h = null;
        c(hVar);
        this.f58739b.c(hVar);
        if (this.p != hVar.f47602f) {
            a(hVar);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f58738a, false, 63821, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58738a, false, 63821, new Class[0], Void.TYPE);
            return;
        }
        this.f58740c.setVisibility(0);
        ObjectAnimator.ofFloat(this.f58740c, "alpha", new float[]{0.0f, 1.0f}).setDuration(150).start();
        if (PatchProxy.isSupport(new Object[0], this, f58738a, false, 63822, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58738a, false, 63822, new Class[0], Void.TYPE);
            return;
        }
        if (this.m != null) {
            this.m.setProgress((int) (this.q * 100.0f));
        }
    }

    public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{seekBar, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f58738a, false, 63828, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{seekBar, Integer.valueOf(i2), Byte.valueOf(z)}, this, f58738a, false, 63828, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.q = (((float) i2) * 1.0f) / 100.0f;
        a(this.p, this.q);
        if (this.t != null) {
            this.t.a(this.f58741d, 4);
        }
    }

    public EffectSetFilterLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.q = 0.8f;
        this.g = new ArrayList();
        this.i = new HashMap();
        this.u = new a<h, Void>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58744a;

            public final /* synthetic */ void a(Object obj) {
                h hVar = (h) obj;
                if (PatchProxy.isSupport(new Object[]{hVar}, this, f58744a, false, 63844, new Class[]{h.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{hVar}, this, f58744a, false, 63844, new Class[]{h.class}, Void.TYPE);
                    return;
                }
                int b2 = EffectSetFilterLayout.this.b(hVar);
                if (b2 >= 0 && b2 < EffectSetFilterLayout.this.f58739b.getData().size()) {
                    EffectSetFilterLayout.this.f58739b.notifyItemChanged(b2);
                }
            }

            public final /* synthetic */ void a(Object obj, @org.jetbrains.annotations.Nullable Object obj2) {
                h hVar = (h) obj;
                Void voidR = (Void) obj2;
                if (PatchProxy.isSupport(new Object[]{hVar, voidR}, this, f58744a, false, 63845, new Class[]{h.class, Void.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{hVar, voidR}, this, f58744a, false, 63845, new Class[]{h.class, Void.class}, Void.TYPE);
                    return;
                }
                int b2 = EffectSetFilterLayout.this.b(hVar);
                if (b2 >= 0 && b2 < EffectSetFilterLayout.this.f58739b.getData().size()) {
                    EffectSetFilterLayout.this.f58739b.notifyItemChanged(b2);
                }
                if (hVar.equals(EffectSetFilterLayout.this.h)) {
                    EffectSetFilterLayout.this.a(hVar);
                }
            }

            public final /* synthetic */ void a(Object obj, @org.jetbrains.annotations.Nullable Integer num, @org.jetbrains.annotations.Nullable String str, @org.jetbrains.annotations.Nullable Exception exc) {
                h hVar = (h) obj;
                if (PatchProxy.isSupport(new Object[]{hVar, num, str, exc}, this, f58744a, false, 63846, new Class[]{h.class, Integer.class, String.class, Exception.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{hVar, num, str, exc}, this, f58744a, false, 63846, new Class[]{h.class, Integer.class, String.class, Exception.class}, Void.TYPE);
                    return;
                }
                EffectSetFilterLayout.this.f58739b.notifyItemChanged(EffectSetFilterLayout.this.b(hVar));
            }
        };
        if (PatchProxy.isSupport(new Object[0], this, f58738a, false, 63817, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58738a, false, 63817, new Class[0], Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.a75, this, true);
        this.j = (RecyclerView) inflate.findViewById(C0906R.id.ae0);
        this.f58743f = new EffectCenterLayoutManager(getContext(), 0, false);
        this.j.setLayoutManager(this.f58743f);
        this.k = (ImageView) inflate.findViewById(C0906R.id.adj);
        this.k.setOnClickListener(this);
        this.l = (ImageView) inflate.findViewById(C0906R.id.adl);
        this.l.setOnClickListener(this);
        this.f58740c = (RelativeLayout) inflate.findViewById(C0906R.id.adz);
        this.m = (FilterBeautySeekBar) inflate.findViewById(C0906R.id.cms);
        this.m.setOnSeekBarChangeListener(this);
        this.n = (TextView) inflate.findViewById(C0906R.id.adx);
        this.n.setOnClickListener(this);
        this.o = (TextView) inflate.findViewById(C0906R.id.ady);
        this.o.setOnClickListener(this);
        this.f58742e = (AVDmtTabLayout) inflate.findViewById(C0906R.id.ae3);
        aa.a().i();
        if (PatchProxy.isSupport(new Object[0], this, f58738a, false, 63829, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58738a, false, 63829, new Class[0], Void.TYPE);
        } else {
            this.f58739b = new EffectPhotoEditFilterAdapter(new b(aa.a().f()));
            this.f58739b.setData(com.ss.android.ugc.aweme.port.in.a.d().b());
            this.f58739b.setShowFooter(false);
            this.f58739b.a();
            this.j.setAdapter(this.f58739b);
            setOnFilterChangeListener(this.t);
            this.j.addOnScrollListener(new RecyclerView.OnScrollListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58748a;

                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f58748a, false, 63848, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f58748a, false, 63848, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    if (i == 0) {
                        EffectSetFilterLayout.this.a(f.b(EffectSetFilterLayout.this.f58739b, EffectSetFilterLayout.this.f58743f.findFirstVisibleItemPosition()));
                    }
                }

                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f58748a, false, 63849, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f58748a, false, 63849, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    super.onScrolled(recyclerView, i, i2);
                }
            });
        }
        if (PatchProxy.isSupport(new Object[0], this, f58738a, false, 63830, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58738a, false, 63830, new Class[0], Void.TYPE);
        } else {
            this.f58742e.a(new TabLayout.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58750a;

                public final void b(TabLayout.e eVar) {
                }

                public final void c(TabLayout.e eVar) {
                }

                public final void a(TabLayout.e eVar) {
                    if (PatchProxy.isSupport(new Object[]{eVar}, this, f58750a, false, 63850, new Class[]{TabLayout.e.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{eVar}, this, f58750a, false, 63850, new Class[]{TabLayout.e.class}, Void.TYPE);
                    } else if (eVar != null && eVar.g != null) {
                        View view = eVar.g;
                        if (view instanceof com.ss.android.ugc.aweme.themechange.base.a) {
                            ((com.ss.android.ugc.aweme.themechange.base.a) view).b(false);
                        }
                        EffectCategoryResponse effectCategoryResponse = EffectSetFilterLayout.this.g.get(eVar.f70400f);
                        if (!(effectCategoryResponse == null || EffectSetFilterLayout.this.f58739b.g == null)) {
                            EffectSetFilterLayout.this.f58739b.g.a(effectCategoryResponse.id, effectCategoryResponse.tagsUpdateTime, e.f58792b);
                        }
                    }
                }
            });
        }
        this.f58740c.setVisibility(8);
    }
}
