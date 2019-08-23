package com.ss.android.ugc.aweme.story.shootvideo.friends.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.framwork.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.story.shootvideo.friends.a.g;
import com.ss.android.ugc.aweme.story.shootvideo.friends.a.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class b extends d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73591a;
    private g j;
    private int k;
    private Set<String> l;

    public final int getLayoutType() {
        return 2;
    }

    public final String getTitleStr() {
        if (!PatchProxy.isSupport(new Object[0], this, f73591a, false, 85349, new Class[0], String.class)) {
            return getResources().getString(C0906R.string.cfp);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f73591a, false, 85349, new Class[0], String.class);
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f73591a, false, 85350, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73591a, false, 85350, new Class[0], Void.TYPE);
            return;
        }
        super.i();
        this.j.a(true);
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f73591a, false, 85355, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73591a, false, 85355, new Class[0], Void.TYPE);
            return;
        }
        this.j.a(false);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f73591a, false, 85345, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73591a, false, 85345, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        this.j = new g();
        this.j.a(this);
        WindowManager windowManager = ((Activity) this.f73600c).getWindowManager();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.k = displayMetrics.widthPixels;
        setOnClickListener(c.f73597b);
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f73591a, false, 85346, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73591a, false, 85346, new Class[0], Void.TYPE);
            return;
        }
        b(this);
        List<k> list = this.f73603f.f73561b;
        if (!a.a(list)) {
            ArrayList arrayList = new ArrayList();
            for (k next : list) {
                if (next.f73552b) {
                    arrayList.add(next);
                }
            }
            if (this.g != null) {
                this.g.a(arrayList);
            }
            return;
        }
        if (this.g != null) {
            this.g.a(null);
        }
    }

    public b(@NonNull Context context) {
        this(context, null);
    }

    private void a(List<k> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f73591a, false, 85354, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f73591a, false, 85354, new Class[]{List.class}, Void.TYPE);
        } else if (this.l != null || this.l.size() != 0) {
            for (k next : list) {
                if (!next.f73552b) {
                    next.f73552b = this.l.contains(next.f73551a.getUid());
                }
                next.f73554d = false;
            }
        }
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f73591a, false, 85351, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f73591a, false, 85351, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationX", new float[]{(float) this.k, 0.0f});
        ofFloat.setDuration(300);
        ofFloat.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f73592a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f73592a, false, 85357, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f73592a, false, 85357, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                if (a.a(b.this.f73603f.f73561b)) {
                    b.this.i();
                }
                super.onAnimationEnd(animator);
            }
        });
        ofFloat.start();
    }

    public final void b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f73591a, false, 85352, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f73591a, false, 85352, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationX", new float[]{0.0f, (float) this.k});
        ofFloat.setDuration(300);
        ofFloat.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f73594a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f73594a, false, 85358, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f73594a, false, 85358, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                b.this.setVisibility(8);
                super.onAnimationEnd(animator);
            }
        });
        ofFloat.start();
    }

    private b(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, null);
        this.l = new HashSet();
        b();
    }

    public final void a(List<k> list, int i) {
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f73591a, false, 85353, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f73591a, false, 85353, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.h = i;
        if (list.size() > 0) {
            for (k next : list) {
                if (next.f73552b) {
                    this.l.add(next.f73551a.getUid());
                }
            }
        }
    }

    public final void b(List<k> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f73591a, false, 85348, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f73591a, false, 85348, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!a.a(list)) {
            a(list);
        }
        super.b(list, z);
    }

    public final void a(List<k> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f73591a, false, 85347, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f73591a, false, 85347, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!a.a(list)) {
            a(list);
        }
        super.a(list, z);
    }
}
