package com.ss.android.ugc.aweme.comment.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.input.emoji.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.p.b;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.views.MentionTextView;
import java.util.List;

public final class f implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36582a;

    /* renamed from: b  reason: collision with root package name */
    public MentionTextView f36583b;

    /* renamed from: c  reason: collision with root package name */
    public Context f36584c;

    public final LifecycleOwner a() {
        if (!PatchProxy.isSupport(new Object[0], this, f36582a, false, 27519, new Class[0], LifecycleOwner.class)) {
            return (LifecycleOwner) v.a(this.f36584c);
        }
        return (LifecycleOwner) PatchProxy.accessDispatch(new Object[0], this, f36582a, false, 27519, new Class[0], LifecycleOwner.class);
    }

    public f(Context context, MentionTextView mentionTextView) {
        this.f36584c = context;
        this.f36583b = mentionTextView;
    }

    public final void a(final String str, final List<TextExtraStruct> list) {
        if (PatchProxy.isSupport(new Object[]{str, list}, this, f36582a, false, 27520, new Class[]{String.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, list}, this, f36582a, false, 27520, new Class[]{String.class, List.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{str, list}, this, f36582a, false, 27521, new Class[]{String.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, list}, this, f36582a, false, 27521, new Class[]{String.class, List.class}, Void.TYPE);
            return;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f36583b, "alpha", new float[]{0.0f}).setDuration(100);
        duration.setInterpolator(new b());
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f36583b, "alpha", new float[]{0.0f, 1.0f}).setDuration(100);
        duration2.setInterpolator(new b());
        duration.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36585a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f36585a, false, 27522, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f36585a, false, 27522, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                f.this.f36583b.setText(str);
                g.a((TextView) f.this.f36583b);
                MentionTextView mentionTextView = f.this.f36583b;
                List list = list;
                AbTestManager.a();
                mentionTextView.a(list, (MentionTextView.d) new com.ss.android.ugc.aweme.shortvideo.view.f(true));
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{duration, duration2});
        animatorSet.start();
    }
}
