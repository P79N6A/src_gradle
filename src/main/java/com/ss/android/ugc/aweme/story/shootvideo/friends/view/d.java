package com.ss.android.ugc.aweme.story.shootvideo.friends.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.story.shootvideo.friends.a.k;
import com.ss.android.ugc.aweme.story.shootvideo.friends.adapter.PublishSelectFriendAdapter;
import com.ss.android.ugc.aweme.story.shootvideo.friends.adapter.a;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.List;

public class d extends FrameLayout implements c<k> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f73598b;

    /* renamed from: a  reason: collision with root package name */
    private TextView f73599a;

    /* renamed from: c  reason: collision with root package name */
    protected Context f73600c;

    /* renamed from: d  reason: collision with root package name */
    protected RecyclerView f73601d;

    /* renamed from: e  reason: collision with root package name */
    protected DmtStatusView f73602e;

    /* renamed from: f  reason: collision with root package name */
    protected PublishSelectFriendAdapter f73603f;
    protected a g;
    protected int h;
    protected String i;
    private ImageView j;
    private TextView k;
    private View l;
    private int m;
    private boolean n;

    public final void b(Exception exc) {
    }

    public final void c(Exception exc) {
    }

    public final void c(List<k> list, boolean z) {
    }

    public final void d(Exception exc) {
    }

    public void f() {
    }

    public void g() {
    }

    public int getLayoutType() {
        return 1;
    }

    public String getTitleStr() {
        return "";
    }

    public void h() {
    }

    public void j() {
    }

    public void k() {
    }

    public final void n_() {
    }

    public final void s_() {
    }

    public final void y_() {
    }

    public final void z_() {
    }

    public final boolean l() {
        if (!this.n) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void m() {
        this.f73603f.showLoadMoreLoading();
        j();
    }

    public void i() {
        if (PatchProxy.isSupport(new Object[0], this, f73598b, false, 85363, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73598b, false, 85363, new Class[0], Void.TYPE);
            return;
        }
        this.f73601d.setVisibility(8);
        this.f73602e.d();
    }

    public void b() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f73598b, false, 85359, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73598b, false, 85359, new Class[0], Void.TYPE);
            return;
        }
        this.l = LayoutInflater.from(this.f73600c).inflate(C0906R.layout.a97, null);
        if (PatchProxy.isSupport(new Object[0], this, f73598b, false, 85360, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73598b, false, 85360, new Class[0], Void.TYPE);
        } else {
            this.k = (TextView) this.l.findViewById(C0906R.id.cxc);
            this.f73599a = (TextView) this.l.findViewById(C0906R.id.title);
            this.j = (ImageView) this.l.findViewById(C0906R.id.j4);
            this.f73599a.setText(getTitleStr());
            this.k.setOnClickListener(new f(this));
            this.j.setOnClickListener(new g(this));
            if (getLayoutType() == 1) {
                this.k.setVisibility(0);
                this.j.setVisibility(8);
            } else {
                this.k.setVisibility(8);
                this.j.setVisibility(0);
            }
        }
        this.f73601d = (RecyclerView) this.l.findViewById(C0906R.id.bd0);
        this.f73602e = (DmtStatusView) this.l.findViewById(C0906R.id.cvd);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(this.f73600c);
        wrapLinearLayoutManager.setOrientation(1);
        this.f73601d.setLayoutManager(wrapLinearLayoutManager);
        this.f73603f = new PublishSelectFriendAdapter();
        this.f73603f.f73563d = getLayoutType();
        this.f73603f.setLoadMoreListener(new e(this));
        this.f73603f.f73562c = new PublishSelectFriendAdapter.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f73604a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f73604a, false, 85379, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f73604a, false, 85379, new Class[0], Void.TYPE);
                    return;
                }
                d.this.f();
            }

            public final boolean a(int i, boolean z) {
                if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f73604a, false, 85378, new Class[]{Integer.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
                    return d.this.a(i, z);
                }
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, this, f73604a, false, 85378, new Class[]{Integer.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
            }
        };
        this.f73603f.setLoadEmptyTextResId(C0906R.string.a3f);
        this.f73601d.setAdapter(this.f73603f);
        addView(this.l, new FrameLayout.LayoutParams(-1, this.m));
        if (PatchProxy.isSupport(new Object[0], this, f73598b, false, 85361, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73598b, false, 85361, new Class[0], Void.TYPE);
            return;
        }
        String string = getResources().getString(C0906R.string.ceu);
        String string2 = getResources().getString(C0906R.string.cet);
        if (getLayoutType() == 2) {
            string = getResources().getString(C0906R.string.cey);
            string2 = getResources().getString(C0906R.string.cex);
            z = false;
        } else {
            z = true;
        }
        View a2 = a(string, string2, z, false);
        this.f73602e.setBuilder(DmtStatusView.a.a(this.f73600c).b(a2).c(a(this.f73600c.getResources().getString(C0906R.string.dmm), this.f73600c.getResources().getString(C0906R.string.dml), false, true)));
    }

    public void setSelectFriendListener(a aVar) {
        this.g = aVar;
    }

    public d(@NonNull Context context) {
        this(context, null);
    }

    public void setCreationId(String str) {
        this.i = str;
        if (this.f73603f != null) {
            this.f73603f.f73564e = str;
        }
    }

    public final void c(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f73598b, false, 85366, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f73598b, false, 85366, new Class[]{View.class}, Void.TYPE);
            return;
        }
        a(view);
        this.n = false;
    }

    public void dismiss(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f73598b, false, 85367, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f73598b, false, 85367, new Class[]{View.class}, Void.TYPE);
            return;
        }
        b(view);
        this.n = true;
    }

    public void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f73598b, false, 85364, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f73598b, false, 85364, new Class[]{View.class}, Void.TYPE);
            return;
        }
        view.setVisibility(0);
        setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationY", new float[]{(float) this.m, 0.0f});
        ofFloat.setDuration(300);
        ofFloat.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f73606a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f73606a, false, 85380, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f73606a, false, 85380, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                if (com.bytedance.framwork.core.c.a.a(d.this.f73603f.f73561b)) {
                    d.this.i();
                }
                super.onAnimationEnd(animator);
            }
        });
        ofFloat.start();
    }

    public void b(final View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f73598b, false, 85365, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f73598b, false, 85365, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationY", new float[]{0.0f, (float) this.m});
        ofFloat.setDuration(300);
        ofFloat.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f73608a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f73608a, false, 85381, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f73608a, false, 85381, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                if (view != null) {
                    view.setVisibility(8);
                }
                super.onAnimationEnd(animator);
            }
        });
        ofFloat.start();
    }

    public d(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = true;
        this.f73600c = context;
        this.m = (int) UIUtils.dip2Px(context, 547.0f);
    }

    public void a(List<k> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f73598b, false, 85368, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f73598b, false, 85368, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (!com.bytedance.framwork.core.c.a.a(list)) {
            this.f73601d.setVisibility(0);
            this.f73602e.b();
            this.f73603f.a(list);
            this.f73603f.resetLoadMoreState();
        } else if (NetworkUtils.isNetworkAvailable(this.f73600c) || this.f73603f.f73561b.size() != 0) {
            if (PatchProxy.isSupport(new Object[0], this, f73598b, false, 85369, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f73598b, false, 85369, new Class[0], Void.TYPE);
                return;
            }
            this.f73601d.setVisibility(8);
            this.f73602e.e();
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f73598b, false, 85370, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f73598b, false, 85370, new Class[0], Void.TYPE);
                return;
            }
            this.f73601d.setVisibility(8);
            this.f73602e.f();
        }
    }

    public void b(List<k> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f73598b, false, 85371, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f73598b, false, 85371, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (!com.bytedance.framwork.core.c.a.a(list)) {
            this.f73602e.b();
            this.f73603f.a(list);
            if (z) {
                this.f73603f.resetLoadMoreState();
            } else {
                this.f73603f.showLoadMoreEmpty();
            }
        }
    }

    public final boolean a(int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f73598b, false, 85372, new Class[]{Integer.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z)}, this, f73598b, false, 85372, new Class[]{Integer.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        k kVar = this.f73603f.f73561b.get(i2);
        if (this.g != null) {
            this.g.a(kVar, z);
        }
        if (kVar == null || !kVar.f73553c) {
            if (z) {
                this.h--;
            } else if (this.h >= 10) {
                com.bytedance.ies.dmt.ui.d.a.b(this.f73601d.getContext(), getResources().getString(C0906R.string.cew)).a();
                return false;
            } else {
                this.h++;
            }
            return true;
        }
        com.bytedance.ies.dmt.ui.d.a.b(this.f73601d.getContext(), getResources().getString(C0906R.string.c3n)).a();
        return false;
    }

    private View a(String str, String str2, boolean z, boolean z2) {
        String str3 = str;
        String str4 = str2;
        boolean z3 = z;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f73598b, false, 85362, new Class[]{String.class, String.class, Boolean.TYPE, Boolean.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{str3, str4, Byte.valueOf(z), Byte.valueOf(z2)}, this, f73598b, false, 85362, new Class[]{String.class, String.class, Boolean.TYPE, Boolean.TYPE}, View.class);
        }
        FrameLayout frameLayout = new FrameLayout(this.f73600c);
        LinearLayout linearLayout = new LinearLayout(this.f73600c);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(this.f73600c);
        textView.setTextSize(17.0f);
        textView.setText(str3);
        textView.setTextColor(-434759645);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        textView.setLayoutParams(layoutParams);
        TextView textView2 = new TextView(this.f73600c);
        textView2.setTextSize(14.0f);
        textView2.setText(str4);
        textView2.setTextColor(-1072293853);
        if (z3) {
            Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(this.f73600c.getResources(), 2130839862);
            a2.setBounds(0, 0, a2.getIntrinsicWidth(), a2.getIntrinsicHeight());
            textView2.setCompoundDrawables(null, null, a2, null);
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = (int) UIUtils.dip2Px(this.f73600c, 7.0f);
        layoutParams2.gravity = 1;
        textView2.setLayoutParams(layoutParams2);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        if (z2) {
            TextView textView3 = new TextView(this.f73600c);
            textView3.setText(C0906R.string.c02);
            textView3.setTextColor(this.f73600c.getResources().getColor(C0906R.color.aj0));
            textView3.setTextSize(15.0f);
            textView3.setBackgroundResource(2130840585);
            textView3.setGravity(17);
            textView3.setOnClickListener(new h(this));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) UIUtils.dip2Px(this.f73600c, 230.0f), (int) UIUtils.dip2Px(this.f73600c, 44.0f));
            layoutParams3.topMargin = (int) UIUtils.dip2Px(this.f73600c, 24.0f);
            layoutParams3.gravity = 1;
            textView3.setLayoutParams(layoutParams3);
            linearLayout.addView(textView3);
        }
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 17;
        linearLayout.setLayoutParams(layoutParams4);
        frameLayout.addView(linearLayout);
        linearLayout.setOnClickListener(new i(this, z3));
        return frameLayout;
    }
}
