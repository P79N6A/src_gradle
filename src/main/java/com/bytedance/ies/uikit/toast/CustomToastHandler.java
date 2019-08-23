package com.bytedance.ies.uikit.toast;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.LinkedList;
import java.util.Queue;

public class CustomToastHandler extends Handler {
    private static CustomToastHandler mToastHandler;
    private final Queue<CustomToast> mQueue = new LinkedList();

    public static synchronized CustomToastHandler getInstance() {
        synchronized (CustomToastHandler.class) {
            if (mToastHandler != null) {
                CustomToastHandler customToastHandler = mToastHandler;
                return customToastHandler;
            }
            CustomToastHandler customToastHandler2 = new CustomToastHandler(Looper.getMainLooper());
            mToastHandler = customToastHandler2;
            return customToastHandler2;
        }
    }

    public void showNextToast() {
        if (!this.mQueue.isEmpty()) {
            CustomToast peek = this.mQueue.peek();
            if (peek.isToastRelease()) {
                peek.dismiss();
                this.mQueue.poll();
                showNextToast();
                return;
            }
            if (!peek.isShowing()) {
                Message obtain = Message.obtain();
                obtain.what = 291;
                obtain.obj = peek;
                sendMessage(obtain);
            }
        }
    }

    private CustomToastHandler(Looper looper) {
        super(looper);
    }

    public void add(CustomToast customToast) {
        this.mQueue.offer(customToast);
        showNextToast();
    }

    public void handleMessage(Message message) {
        CustomToast customToast = (CustomToast) message.obj;
        int i = message.what;
        if (i == 291) {
            showToast(customToast);
        } else if (i != 1110) {
            if (i == 1929) {
                showNextToast();
            }
        } else {
            hideToast(customToast);
        }
    }

    public void remove(CustomToast customToast) {
        this.mQueue.remove(customToast);
        while (this.mQueue.contains(customToast)) {
            this.mQueue.remove(customToast);
        }
    }

    private void showToast(CustomToast customToast) {
        if (!customToast.isShowing()) {
            customToast.show();
            customToast.getShowAnimatorSet().start();
            Message obtain = Message.obtain();
            obtain.what = 1110;
            obtain.obj = customToast;
            sendMessageDelayed(obtain, customToast.getDuration());
        }
    }

    public void hideToast(final CustomToast customToast) {
        if (!customToast.isShowing() || customToast.isToastRelease()) {
            customToast.dismiss();
            this.mQueue.remove(customToast);
            sendEmptyMessage(1929);
        } else if (!this.mQueue.contains(customToast)) {
            sendEmptyMessage(1929);
        } else {
            AnimatorSet hideAnimatorSet = customToast.getHideAnimatorSet();
            hideAnimatorSet.addListener(new Animator.AnimatorListener() {
                public void onAnimationCancel(Animator animator) {
                }

                public void onAnimationRepeat(Animator animator) {
                }

                public void onAnimationStart(Animator animator) {
                }

                public void onAnimationEnd(Animator animator) {
                    customToast.dismiss();
                    CustomToastHandler.this.sendEmptyMessage(1929);
                }
            });
            hideAnimatorSet.start();
            this.mQueue.poll();
        }
    }
}
