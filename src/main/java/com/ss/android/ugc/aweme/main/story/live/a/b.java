package com.ss.android.ugc.aweme.main.story.live.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;
import com.ss.android.ugc.aweme.main.story.live.view.AbsLiveStoryItemView;
import java.util.ArrayList;
import java.util.List;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54955a;

    /* renamed from: b  reason: collision with root package name */
    public List<AvatarWithBorderView> f54956b;

    /* renamed from: c  reason: collision with root package name */
    public int f54957c;

    /* renamed from: d  reason: collision with root package name */
    public List<UrlModel> f54958d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public boolean f54959e;

    /* renamed from: f  reason: collision with root package name */
    private ValueAnimator f54960f;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f54955a, false, 58275, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54955a, false, 58275, new Class[0], Void.TYPE);
            return;
        }
        if (this.f54960f != null) {
            this.f54960f.cancel();
            this.f54960f = null;
        }
        this.f54959e = false;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f54955a, false, 58276, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54955a, false, 58276, new Class[0], Void.TYPE);
            return;
        }
        if (this.f54960f != null) {
            this.f54960f.cancel();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f54955a, false, 58277, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54955a, false, 58277, new Class[0], Void.TYPE);
        } else if (this.f54956b != null && this.f54958d != null && this.f54958d.size() != 0 && !this.f54959e) {
            if (this.f54960f != null) {
                this.f54960f.start();
                return;
            }
            this.f54957c = 0;
            this.f54960f = ValueAnimator.ofInt(new int[]{0, 2500});
            this.f54960f.setRepeatCount(-1);
            this.f54960f.setRepeatMode(1);
            this.f54960f.setDuration(2500);
            this.f54960f.start();
            this.f54960f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54961a;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54961a, false, 58278, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54961a, false, 58278, new Class[]{ValueAnimator.class}, Void.TYPE);
                        return;
                    }
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (intValue >= 0 && intValue <= 510) {
                        float f2 = (((float) intValue) * 1.0f) / 500.0f;
                        if (f2 > 1.0f) {
                            f2 = 1.0f;
                        }
                        b.this.f54956b.get(0).setAlpha(f2);
                        b.this.f54956b.get(0).setScaleX(f2);
                        b.this.f54956b.get(0).setScaleY(f2);
                        b.this.f54956b.get(1).setTranslationX(UIUtils.dip2Px(GlobalContext.getContext(), 21.0f) * f2);
                        b.this.f54956b.get(2).setTranslationX(UIUtils.dip2Px(GlobalContext.getContext(), 21.0f) * f2);
                        b.this.f54956b.get(3).setAlpha(1.0f - f2);
                    }
                }
            });
            this.f54960f.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54963a;

                public final void onAnimationCancel(Animator animator) {
                    b.this.f54959e = false;
                }

                public final void onAnimationStart(Animator animator) {
                    b.this.f54959e = true;
                }

                public final void onAnimationRepeat(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f54963a, false, 58279, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f54963a, false, 58279, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    b.this.f54957c = (b.this.f54957c + 1) % b.this.f54958d.size();
                    for (int i = 0; i < b.this.f54956b.size(); i++) {
                        c.b(b.this.f54956b.get(3 - i), b.this.f54958d.get((b.this.f54957c + i) % b.this.f54958d.size()));
                    }
                }
            });
            this.f54959e = true;
        }
    }

    public final void a(List<UrlModel> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f54955a, false, 58274, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f54955a, false, 58274, new Class[]{List.class}, Void.TYPE);
        } else if (list != null && list.size() != 0) {
            this.f54958d.addAll(list);
            for (int i = 0; i < this.f54956b.size(); i++) {
                c.b(this.f54956b.get(i), this.f54958d.get(i));
            }
        }
    }

    public final void a(AbsLiveStoryItemView absLiveStoryItemView) {
        if (PatchProxy.isSupport(new Object[]{absLiveStoryItemView}, this, f54955a, false, 58273, new Class[]{AbsLiveStoryItemView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{absLiveStoryItemView}, this, f54955a, false, 58273, new Class[]{AbsLiveStoryItemView.class}, Void.TYPE);
            return;
        }
        View rootView = absLiveStoryItemView.getRootView();
        ArrayList<AvatarWithBorderView> arrayList = new ArrayList<>();
        arrayList.add(rootView.findViewById(C0906R.id.awd));
        arrayList.add(rootView.findViewById(C0906R.id.awe));
        arrayList.add(rootView.findViewById(C0906R.id.awf));
        arrayList.add(rootView.findViewById(C0906R.id.awg));
        for (AvatarWithBorderView borderColor : arrayList) {
            borderColor.setBorderColor(C0906R.color.a1z);
        }
        this.f54956b = arrayList;
    }
}
