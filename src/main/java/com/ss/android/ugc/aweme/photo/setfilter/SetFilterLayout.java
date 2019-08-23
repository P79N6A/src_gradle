package com.ss.android.ugc.aweme.photo.setfilter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.filter.CenterLayoutManager;
import com.ss.android.ugc.aweme.filter.FilterAdapter;
import com.ss.android.ugc.aweme.filter.PhotoEditFilterAdapter;
import com.ss.android.ugc.aweme.filter.aw;
import com.ss.android.ugc.aweme.filter.base.SpaceItemDecoration;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.filter.w;
import com.ss.android.ugc.aweme.framework.e.b;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import java.util.List;

public class SetFilterLayout extends FrameLayout implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58772a;

    /* renamed from: b  reason: collision with root package name */
    public FilterAdapter f58773b;

    /* renamed from: c  reason: collision with root package name */
    public RelativeLayout f58774c;

    /* renamed from: d  reason: collision with root package name */
    FilterRateSeekBar f58775d;

    /* renamed from: e  reason: collision with root package name */
    public int f58776e;

    /* renamed from: f  reason: collision with root package name */
    public float f58777f;
    public f g;
    public PhotoContext h;
    private RecyclerView i;
    private ImageView j;
    private ImageView k;
    private TextView l;
    private TextView m;
    private int n;
    private float o;
    private RelativeLayout p;

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f58772a, false, 63876, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58772a, false, 63876, new Class[0], Void.TYPE);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f58774c, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58778a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f58778a, false, 63890, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f58778a, false, 63890, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                SetFilterLayout.this.f58774c.setVisibility(8);
            }
        });
        ofFloat.setDuration(150);
        ofFloat.start();
    }

    public SetFilterLayout(@NonNull Context context) {
        this(context, null);
    }

    public void setPhotoContext(PhotoContext photoContext) {
        this.h = photoContext;
        if (this.h != null) {
            this.n = this.h.mFilterIndex;
            this.o = this.h.mFilterRate;
        }
    }

    public void setData(List<h> list) {
        List<h> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f58772a, false, 63889, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f58772a, false, 63889, new Class[]{List.class}, Void.TYPE);
        } else if (!Lists.isEmpty(list)) {
            this.f58773b.submitList(list2);
        }
    }

    public void setOnFilterChangeListener(f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f58772a, false, 63886, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, f58772a, false, 63886, new Class[]{f.class}, Void.TYPE);
            return;
        }
        this.g = fVar;
        if (this.f58773b != null) {
            this.f58773b.f47342e = new aw() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58780a;

                public final void a(h hVar) {
                    h hVar2 = hVar;
                    if (PatchProxy.isSupport(new Object[]{hVar2}, this, f58780a, false, 63891, new Class[]{h.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{hVar2}, this, f58780a, false, 63891, new Class[]{h.class}, Void.TYPE);
                        return;
                    }
                    if (SetFilterLayout.this.f58776e != hVar2.f47602f) {
                        SetFilterLayout.this.f58773b.a(hVar2);
                        SetFilterLayout.this.f58776e = hVar2.f47602f;
                        SetFilterLayout.this.f58777f = 0.8f;
                        SetFilterLayout.this.a(hVar2.f47602f, SetFilterLayout.this.f58777f);
                        if (SetFilterLayout.this.g != null) {
                            SetFilterLayout.this.g.a(SetFilterLayout.this.h, 5);
                        }
                    } else {
                        SetFilterLayout setFilterLayout = SetFilterLayout.this;
                        if (PatchProxy.isSupport(new Object[0], setFilterLayout, SetFilterLayout.f58772a, false, 63877, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], setFilterLayout, SetFilterLayout.f58772a, false, 63877, new Class[0], Void.TYPE);
                            return;
                        }
                        setFilterLayout.f58774c.setVisibility(0);
                        ObjectAnimator.ofFloat(setFilterLayout.f58774c, "alpha", new float[]{0.0f, 1.0f}).setDuration(150).start();
                        if (PatchProxy.isSupport(new Object[0], setFilterLayout, SetFilterLayout.f58772a, false, 63878, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], setFilterLayout, SetFilterLayout.f58772a, false, 63878, new Class[0], Void.TYPE);
                        } else if (setFilterLayout.f58775d != null) {
                            setFilterLayout.f58775d.setProgress((int) (setFilterLayout.f58777f * 100.0f));
                        }
                    }
                }
            };
        }
    }

    public void setFilterIndex(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f58772a, false, 63887, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f58772a, false, 63887, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f58776e = i2;
        int i3 = this.f58776e;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3)}, this, f58772a, false, 63888, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3)}, this, f58772a, false, 63888, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f58777f = 0.8f;
        this.f58773b.b(this.f58776e);
        if (i3 != 0) {
            a(i3, this.f58777f);
            if (this.g != null) {
                this.g.a(this.h, 5);
            }
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f58772a, false, 63875, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f58772a, false, 63875, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.adj) {
            if (PatchProxy.isSupport(new Object[0], this, f58772a, false, 63879, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f58772a, false, 63879, new Class[0], Void.TYPE);
            } else {
                a(this.n, this.o);
                if (this.i != null) {
                    this.i.stopScroll();
                }
                if (this.g != null) {
                    this.g.a(this.h, 0);
                }
            }
        } else if (id == C0906R.id.adl) {
            if (PatchProxy.isSupport(new Object[0], this, f58772a, false, 63880, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f58772a, false, 63880, new Class[0], Void.TYPE);
            } else {
                a(this.f58776e, this.f58777f);
                if (this.g != null) {
                    this.g.a(this.h, 1);
                }
            }
        } else if (id == C0906R.id.adx) {
            if (PatchProxy.isSupport(new Object[0], this, f58772a, false, 63881, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f58772a, false, 63881, new Class[0], Void.TYPE);
            } else {
                this.f58777f = 0.8f;
                if (this.f58776e == this.n) {
                    this.f58777f = this.o;
                }
                a(this.f58776e, this.f58777f);
                if (this.g != null) {
                    this.g.a(this.h, 3);
                }
                a();
            }
        } else if (id == C0906R.id.ady) {
            if (PatchProxy.isSupport(new Object[0], this, f58772a, false, 63882, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f58772a, false, 63882, new Class[0], Void.TYPE);
                return;
            }
            a(this.f58776e, this.f58777f);
            if (this.g != null) {
                this.g.a(this.h, 2);
            }
            a();
        }
    }

    public SetFilterLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(int i2, float f2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Float.valueOf(f2)}, this, f58772a, false, 63883, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Float.valueOf(f2)}, this, f58772a, false, 63883, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.h.mFilterIndex = i2;
        h a2 = w.a(i2);
        if (a2 != null) {
            this.h.mFilterName = a2.f47600d;
            this.h.mFilterId = a2.f47598b;
        }
        this.h.mFilterRate = f2;
    }

    public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{seekBar, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f58772a, false, 63884, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{seekBar, Integer.valueOf(i2), Byte.valueOf(z)}, this, f58772a, false, 63884, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f58777f = (((float) i2) * 1.0f) / 100.0f;
        a(this.f58776e, this.f58777f);
        if (this.g != null) {
            this.g.a(this.h, 4);
        }
    }

    public SetFilterLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f58777f = 0.8f;
        if (PatchProxy.isSupport(new Object[0], this, f58772a, false, 63874, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58772a, false, 63874, new Class[0], Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.a76, this, true);
        this.p = (RelativeLayout) inflate.findViewById(C0906R.id.adm);
        this.i = (RecyclerView) inflate.findViewById(C0906R.id.ae0);
        this.i.setLayoutManager(new CenterLayoutManager(getContext(), 0, false));
        this.i.addItemDecoration(new SpaceItemDecoration(getContext(), b.a(getContext(), 16.0f)));
        this.j = (ImageView) inflate.findViewById(C0906R.id.adj);
        this.j.setOnClickListener(this);
        this.k = (ImageView) inflate.findViewById(C0906R.id.adl);
        this.k.setOnClickListener(this);
        this.f58774c = (RelativeLayout) inflate.findViewById(C0906R.id.adz);
        this.f58775d = (FilterRateSeekBar) inflate.findViewById(C0906R.id.cms);
        this.f58775d.setOnSeekBarChangeListener(this);
        this.l = (TextView) inflate.findViewById(C0906R.id.adx);
        this.l.setOnClickListener(this);
        this.m = (TextView) inflate.findViewById(C0906R.id.ady);
        this.m.setOnClickListener(this);
        if (PatchProxy.isSupport(new Object[0], this, f58772a, false, 63885, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58772a, false, 63885, new Class[0], Void.TYPE);
        } else {
            this.f58773b = new PhotoEditFilterAdapter(getContext());
            setOnFilterChangeListener(this.g);
            this.i.setAdapter(this.f58773b);
        }
        this.f58774c.setVisibility(8);
    }
}
