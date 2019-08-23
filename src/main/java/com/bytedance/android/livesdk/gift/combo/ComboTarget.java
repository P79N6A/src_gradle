package com.bytedance.android.livesdk.gift.combo;

import android.animation.ObjectAnimator;
import android.support.annotation.Keep;
import android.view.View;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.widget.SpecialCombView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

@Keep
public class ComboTarget {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<ObjectAnimator> animators;
    private View backgroundView;
    private SpecialCombView giftCombView;

    public float getComboViewProgress() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 9358, new Class[0], Float.TYPE)) {
            return this.giftCombView.getProgress();
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 9358, new Class[0], Float.TYPE)).floatValue();
    }

    public float getComboViewScale() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 9356, new Class[0], Float.TYPE)) {
            return this.giftCombView.getScaleX();
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 9356, new Class[0], Float.TYPE)).floatValue();
    }

    public void showAll() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 9353, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 9353, new Class[0], Void.TYPE);
            return;
        }
        this.giftCombView.setVisibility(0);
        this.backgroundView.setVisibility(0);
    }

    public void hideAll() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 9354, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 9354, new Class[0], Void.TYPE);
        } else if (!CollectionUtils.isEmpty(this.animators)) {
            for (ObjectAnimator next : this.animators) {
                if (next.getTarget() == this && next.isRunning()) {
                    next.cancel();
                }
            }
            this.backgroundView.setVisibility(8);
            this.giftCombView.endScaleAnim();
            this.giftCombView.setVisibility(8);
        }
    }

    public void asTarget(ObjectAnimator objectAnimator) {
        if (PatchProxy.isSupport(new Object[]{objectAnimator}, this, changeQuickRedirect, false, 9352, new Class[]{ObjectAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objectAnimator}, this, changeQuickRedirect, false, 9352, new Class[]{ObjectAnimator.class}, Void.TYPE);
            return;
        }
        objectAnimator.setTarget(this);
        if (this.animators == null) {
            this.animators = new ArrayList(3);
        }
        if (!this.animators.contains(objectAnimator)) {
            this.animators.add(objectAnimator);
        }
    }

    public void setComboViewProgress(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, changeQuickRedirect, false, 9357, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, changeQuickRedirect, false, 9357, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.giftCombView.setProgress(f2);
    }

    public void setComboViewScale(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, changeQuickRedirect, false, 9355, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, changeQuickRedirect, false, 9355, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.giftCombView.setScaleX(f2);
        this.giftCombView.setScaleY(f2);
    }

    public void setCountDownTime(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 9359, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 9359, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.giftCombView.setCountDownTime(i);
    }

    public void startComboAnim(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 9360, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 9360, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.giftCombView.startScaleAnim(j2, null);
    }

    public ComboTarget(SpecialCombView specialCombView, View view) {
        this.giftCombView = specialCombView;
        this.backgroundView = view;
        specialCombView.setCircleBackgroundColor(ac.b((int) C0906R.color.ahn), ac.b((int) C0906R.color.ahl));
        specialCombView.setProgressColor(ac.b((int) C0906R.color.ahj), ac.b((int) C0906R.color.ahh));
    }
}
