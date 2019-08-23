package com.ss.android.ugc.aweme.im.sdk.chat.input.photo;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.utils.cd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50858a = null;

    /* renamed from: b  reason: collision with root package name */
    public static int f50859b = 9;

    /* renamed from: e  reason: collision with root package name */
    private static int f50860e = 2000;
    private static m h = new m();

    /* renamed from: c  reason: collision with root package name */
    public boolean f50861c;

    /* renamed from: d  reason: collision with root package name */
    public List<i> f50862d = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private LinkedHashMap<String, i> f50863f = new LinkedHashMap<>();
    private long g = 0;

    public static m a() {
        return h;
    }

    public final List<i> b() {
        if (!PatchProxy.isSupport(new Object[0], this, f50858a, false, 51075, new Class[0], List.class)) {
            return new ArrayList(this.f50863f.values());
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, f50858a, false, 51075, new Class[0], List.class);
    }

    public final int c() {
        if (!PatchProxy.isSupport(new Object[0], this, f50858a, false, 51079, new Class[0], Integer.TYPE)) {
            return this.f50863f.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50858a, false, 51079, new Class[0], Integer.TYPE)).intValue();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f50858a, false, 51085, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50858a, false, 51085, new Class[0], Void.TYPE);
            return;
        }
        this.f50863f.clear();
        this.f50861c = false;
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f50858a, false, 51086, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50858a, false, 51086, new Class[0], Void.TYPE);
            return;
        }
        this.f50863f.clear();
        this.f50862d.clear();
        this.f50861c = false;
    }

    public final String d() {
        if (PatchProxy.isSupport(new Object[0], this, f50858a, false, 51080, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f50858a, false, 51080, new Class[0], String.class);
        } else if (this.f50863f.size() <= 0) {
            return GlobalContext.getContext().getString(C0906R.string.axc);
        } else {
            return GlobalContext.getContext().getString(C0906R.string.axe, new Object[]{Integer.valueOf(this.f50863f.size())});
        }
    }

    private int c(String str) {
        String str2 = str;
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f50858a, false, 51082, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, f50858a, false, 51082, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        for (String equals : this.f50863f.keySet()) {
            if (str2.equals(equals)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void a(i iVar) {
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{iVar2}, this, f50858a, false, 51076, new Class[]{i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar2}, this, f50858a, false, 51076, new Class[]{i.class}, Void.TYPE);
            return;
        }
        if (iVar2 != null) {
            this.f50863f.put(iVar2.f50847b.f27990b, iVar2);
        }
    }

    public final i b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f50858a, false, 51081, new Class[]{String.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str}, this, f50858a, false, 51081, new Class[]{String.class}, i.class);
        }
        if (!j.a((Collection<T>) this.f50862d)) {
            for (i next : this.f50862d) {
                if (next.f50847b.f27990b.equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    public final void b(i iVar) {
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{iVar2}, this, f50858a, false, 51077, new Class[]{i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar2}, this, f50858a, false, 51077, new Class[]{i.class}, Void.TYPE);
            return;
        }
        if (iVar2 != null) {
            this.f50863f.remove(iVar2.f50847b.f27990b);
        }
    }

    public final boolean a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f50858a, false, 51078, new Class[]{String.class}, Boolean.TYPE)) {
            return this.f50863f.containsKey(str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f50858a, false, 51078, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public final void a(TextView textView, ImageView imageView, View view, String str) {
        TextView textView2 = textView;
        ImageView imageView2 = imageView;
        View view2 = view;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{textView2, imageView2, view2, str2}, this, f50858a, false, 51083, new Class[]{TextView.class, ImageView.class, View.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, imageView2, view2, str2}, this, f50858a, false, 51083, new Class[]{TextView.class, ImageView.class, View.class, String.class}, Void.TYPE);
        } else if (textView2 != null && imageView2 != null && !TextUtils.isEmpty(str)) {
            if (a(str2)) {
                imageView2.setSelected(true);
                textView2.setText(String.valueOf(c(str2)));
                imageView2.setImageResource(2130839657);
                if (view2 != null) {
                    view2.setBackgroundResource(C0906R.color.r2);
                    view2.setVisibility(0);
                }
            } else {
                imageView2.setSelected(false);
                textView2.setText("");
                imageView2.setImageResource(2130840088);
                if (view2 != null) {
                    if (c() >= f50859b) {
                        view2.setBackgroundResource(C0906R.color.a1b);
                        view2.setVisibility(0);
                        return;
                    }
                    view2.setVisibility(8);
                }
            }
        }
    }

    public final void a(View view, View view2, TextView textView, ImageView imageView, View view3, String str) {
        View view4 = view2;
        if (PatchProxy.isSupport(new Object[]{view, view4, textView, imageView, view3, str}, this, f50858a, false, 51084, new Class[]{View.class, View.class, TextView.class, ImageView.class, View.class, String.class}, Void.TYPE)) {
            Object[] objArr = {view, view4, textView, imageView, view3, str};
            PatchProxy.accessDispatch(objArr, this, f50858a, false, 51084, new Class[]{View.class, View.class, TextView.class, ImageView.class, View.class, String.class}, Void.TYPE);
            return;
        }
        view2.clearAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view4, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view4, "scaleX", new float[]{1.0f, 0.3f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view4, "scaleY", new float[]{1.0f, 0.3f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        animatorSet.setDuration(50);
        final TextView textView2 = textView;
        final ImageView imageView2 = imageView;
        final View view5 = view3;
        final String str2 = str;
        final View view6 = view2;
        final View view7 = view;
        AnonymousClass1 r0 = new Animator.AnimatorListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f50864a;

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationCancel(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f50864a, false, 51088, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f50864a, false, 51088, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                m.this.a(textView2, imageView2, view5, str2);
            }

            public final void onAnimationEnd(Animator animator) {
                ObjectAnimator objectAnimator;
                ObjectAnimator objectAnimator2;
                if (PatchProxy.isSupport(new Object[]{animator}, this, f50864a, false, 51087, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f50864a, false, 51087, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                m.this.a(textView2, imageView2, view5, str2);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view6, "alpha", new float[]{0.0f, 1.0f});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view6, "scaleX", new float[]{0.3f, 1.0f});
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view6, "scaleY", new float[]{0.3f, 1.0f});
                ObjectAnimator objectAnimator3 = null;
                if (view7 == null || view5 == null) {
                    objectAnimator2 = null;
                    objectAnimator = null;
                } else {
                    view7.clearAnimation();
                    view5.clearAnimation();
                    if (m.this.a(str2)) {
                        objectAnimator3 = ObjectAnimator.ofFloat(view7, "scaleX", new float[]{1.0f, 1.1f});
                        objectAnimator2 = ObjectAnimator.ofFloat(view7, "scaleY", new float[]{1.0f, 1.1f});
                        objectAnimator = ObjectAnimator.ofFloat(view5, "alpha", new float[]{0.0f, 1.0f});
                    } else {
                        objectAnimator3 = ObjectAnimator.ofFloat(view7, "scaleX", new float[]{1.1f, 1.0f});
                        objectAnimator2 = ObjectAnimator.ofFloat(view7, "scaleY", new float[]{1.1f, 1.0f});
                        objectAnimator = ObjectAnimator.ofFloat(view5, "alpha", new float[]{1.0f, 0.0f});
                    }
                }
                AnimatorSet animatorSet = new AnimatorSet();
                if (objectAnimator3 == null || objectAnimator2 == null || objectAnimator == null) {
                    animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
                } else {
                    animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, objectAnimator3, objectAnimator2, objectAnimator});
                }
                animatorSet.setInterpolator(cd.a(2, 0.32f, 0.94f, 0.6f, 1.0f));
                animatorSet.setDuration(300);
                animatorSet.start();
            }
        };
        animatorSet.addListener(r0);
        animatorSet.start();
    }
}
