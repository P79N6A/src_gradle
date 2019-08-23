package com.bytedance.android.livesdk.gift.combo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.support.annotation.Keep;
import com.bytedance.android.livesdk.config.a;
import com.bytedance.android.livesdk.gift.holder.BasePanelViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Keep
public class DouyinGiftCombHelper {
    public static final int REPEAT_SEND_TIMEOUT = ((Integer) a.G.a()).intValue();
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean animatorCanceled;
    public ObjectAnimator dismissAnimator;
    public boolean isFirstClicked = true;
    private ComboTarget mCombTarget;
    public ObjectAnimator processAnimator;
    public ObjectAnimator showAnimator;

    private void startCombViewClickAnimation(ComboTarget comboTarget) {
        if (PatchProxy.isSupport(new Object[]{comboTarget}, this, changeQuickRedirect, false, 9363, new Class[]{ComboTarget.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comboTarget}, this, changeQuickRedirect, false, 9363, new Class[]{ComboTarget.class}, Void.TYPE);
        } else if (comboTarget != null) {
            this.animatorCanceled = false;
            comboTarget.showAll();
            startProcessAnimation(comboTarget);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void cancelAnimator(android.animation.Animator... r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.animation.Animator[]> r3 = android.animation.Animator[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 9366(0x2496, float:1.3125E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 0
            r14 = 9366(0x2496, float:1.3125E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.animation.Animator[]> r0 = android.animation.Animator[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            if (r0 == 0) goto L_0x0057
            int r2 = r0.length
            if (r2 > 0) goto L_0x003a
            goto L_0x0057
        L_0x003a:
            int r2 = r0.length
            if (r9 >= r2) goto L_0x0054
            r2 = r0[r9]
            if (r2 == 0) goto L_0x004f
            boolean r3 = r2.isRunning()
            if (r3 == 0) goto L_0x004f
            r3 = r17
            r3.animatorCanceled = r1
            r2.cancel()
            goto L_0x0051
        L_0x004f:
            r3 = r17
        L_0x0051:
            int r9 = r9 + 1
            goto L_0x003a
        L_0x0054:
            r3 = r17
            return
        L_0x0057:
            r3 = r17
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.combo.DouyinGiftCombHelper.cancelAnimator(android.animation.Animator[]):void");
    }

    public void dismissCombView(ComboTarget comboTarget) {
        if (PatchProxy.isSupport(new Object[]{comboTarget}, this, changeQuickRedirect, false, 9365, new Class[]{ComboTarget.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comboTarget}, this, changeQuickRedirect, false, 9365, new Class[]{ComboTarget.class}, Void.TYPE);
        } else if (comboTarget != null) {
            if (this.dismissAnimator == null) {
                this.dismissAnimator = ObjectAnimator.ofPropertyValuesHolder(comboTarget, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("ComboViewScale", new float[]{1.0f, 0.0f})});
                this.dismissAnimator.setDuration(150);
                this.dismissAnimator.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f14763a;

                    public final void onAnimationCancel(Animator animator) {
                        DouyinGiftCombHelper.this.animatorCanceled = true;
                    }

                    public final void onAnimationEnd(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f14763a, false, 9369, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f14763a, false, 9369, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        Object target = DouyinGiftCombHelper.this.dismissAnimator.getTarget();
                        if (target != null && (target instanceof ComboTarget)) {
                            DouyinGiftCombHelper.this.isFirstClicked = true;
                            ((ComboTarget) target).hideAll();
                        }
                    }
                });
            }
            comboTarget.asTarget(this.dismissAnimator);
            this.dismissAnimator.start();
        }
    }

    public void handleComboClick(BasePanelViewHolder basePanelViewHolder) {
        if (PatchProxy.isSupport(new Object[]{basePanelViewHolder}, this, changeQuickRedirect, false, 9361, new Class[]{BasePanelViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{basePanelViewHolder}, this, changeQuickRedirect, false, 9361, new Class[]{BasePanelViewHolder.class}, Void.TYPE);
            return;
        }
        cancelAnimator(this.showAnimator, this.processAnimator, this.dismissAnimator);
        if (!basePanelViewHolder.a().equals(this.mCombTarget)) {
            this.isFirstClicked = true;
        }
        if (this.isFirstClicked) {
            this.isFirstClicked = false;
            showCombView(basePanelViewHolder.a());
            return;
        }
        startCombViewClickAnimation(basePanelViewHolder.a());
    }

    public void startProcessAnimation(ComboTarget comboTarget) {
        if (PatchProxy.isSupport(new Object[]{comboTarget}, this, changeQuickRedirect, false, 9364, new Class[]{ComboTarget.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comboTarget}, this, changeQuickRedirect, false, 9364, new Class[]{ComboTarget.class}, Void.TYPE);
        } else if (comboTarget != null) {
            if (this.processAnimator == null) {
                this.processAnimator = ObjectAnimator.ofFloat(comboTarget, "ComboViewProgress", new float[]{360.0f, 0.0f});
                this.processAnimator.setDuration(((long) REPEAT_SEND_TIMEOUT) * 1000);
                this.processAnimator.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f14761a;

                    public final void onAnimationCancel(Animator animator) {
                        DouyinGiftCombHelper.this.animatorCanceled = true;
                    }

                    public final void onAnimationEnd(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f14761a, false, 9368, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f14761a, false, 9368, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        Object target = DouyinGiftCombHelper.this.processAnimator.getTarget();
                        if (target != null && (target instanceof ComboTarget)) {
                            ComboTarget comboTarget = (ComboTarget) target;
                            if (DouyinGiftCombHelper.this.animatorCanceled) {
                                comboTarget.hideAll();
                            } else {
                                DouyinGiftCombHelper.this.dismissCombView(comboTarget);
                            }
                        }
                    }
                });
            }
            comboTarget.setCountDownTime(REPEAT_SEND_TIMEOUT);
            comboTarget.asTarget(this.processAnimator);
            this.processAnimator.start();
            comboTarget.startComboAnim(((long) REPEAT_SEND_TIMEOUT) * 1000);
        }
    }

    private void showCombView(ComboTarget comboTarget) {
        if (PatchProxy.isSupport(new Object[]{comboTarget}, this, changeQuickRedirect, false, 9362, new Class[]{ComboTarget.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comboTarget}, this, changeQuickRedirect, false, 9362, new Class[]{ComboTarget.class}, Void.TYPE);
        } else if (comboTarget != null) {
            if (this.showAnimator != null && this.showAnimator.isRunning()) {
                this.showAnimator.cancel();
            }
            if (this.mCombTarget != null && !comboTarget.equals(this.mCombTarget)) {
                this.animatorCanceled = true;
                this.mCombTarget.hideAll();
            }
            this.mCombTarget = comboTarget;
            comboTarget.showAll();
            this.animatorCanceled = false;
            if (this.showAnimator == null) {
                this.showAnimator = ObjectAnimator.ofPropertyValuesHolder(comboTarget, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("ComboViewScale", new float[]{0.0f, 1.0f})});
                this.showAnimator.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f14759a;

                    public final void onAnimationCancel(Animator animator) {
                        DouyinGiftCombHelper.this.animatorCanceled = true;
                    }

                    public final void onAnimationEnd(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f14759a, false, 9367, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f14759a, false, 9367, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        Object target = DouyinGiftCombHelper.this.showAnimator.getTarget();
                        if (target != null && (target instanceof ComboTarget)) {
                            ComboTarget comboTarget = (ComboTarget) target;
                            if (DouyinGiftCombHelper.this.animatorCanceled) {
                                comboTarget.hideAll();
                            } else {
                                DouyinGiftCombHelper.this.startProcessAnimation(comboTarget);
                            }
                        }
                    }
                });
            }
            comboTarget.asTarget(this.showAnimator);
            this.showAnimator.setDuration(150);
            this.showAnimator.start();
        }
    }
}
