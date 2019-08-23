package com.facebook.drawee.controller;

import android.graphics.drawable.Animatable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class c<INFO> implements ControllerListener<INFO> {

    /* renamed from: a  reason: collision with root package name */
    private final List<ControllerListener<? super INFO>> f23697a = new ArrayList(2);

    public final synchronized void a() {
        this.f23697a.clear();
    }

    public final synchronized void a(ControllerListener<? super INFO> controllerListener) {
        this.f23697a.add(controllerListener);
    }

    public final synchronized void b(ControllerListener<? super INFO> controllerListener) {
        int indexOf = this.f23697a.indexOf(controllerListener);
        if (indexOf != -1) {
            this.f23697a.set(indexOf, null);
        }
    }

    public synchronized void onRelease(String str) {
        int size = this.f23697a.size();
        for (int i = 0; i < size; i++) {
            try {
                ControllerListener controllerListener = this.f23697a.get(i);
                if (controllerListener != null) {
                    controllerListener.onRelease(str);
                }
            } catch (Exception unused) {
            }
        }
    }

    public synchronized void onFailure(String str, Throwable th) {
        int size = this.f23697a.size();
        for (int i = 0; i < size; i++) {
            try {
                ControllerListener controllerListener = this.f23697a.get(i);
                if (controllerListener != null) {
                    controllerListener.onFailure(str, th);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void onIntermediateImageFailed(String str, Throwable th) {
        int size = this.f23697a.size();
        for (int i = 0; i < size; i++) {
            try {
                ControllerListener controllerListener = this.f23697a.get(i);
                if (controllerListener != null) {
                    controllerListener.onIntermediateImageFailed(str, th);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void onIntermediateImageSet(String str, @Nullable INFO info) {
        int size = this.f23697a.size();
        for (int i = 0; i < size; i++) {
            try {
                ControllerListener controllerListener = this.f23697a.get(i);
                if (controllerListener != null) {
                    controllerListener.onIntermediateImageSet(str, info);
                }
            } catch (Exception unused) {
            }
        }
    }

    public synchronized void onSubmit(String str, Object obj) {
        int size = this.f23697a.size();
        for (int i = 0; i < size; i++) {
            try {
                ControllerListener controllerListener = this.f23697a.get(i);
                if (controllerListener != null) {
                    controllerListener.onSubmit(str, obj);
                }
            } catch (Exception unused) {
            }
        }
    }

    public synchronized void onFinalImageSet(String str, @Nullable INFO info, @Nullable Animatable animatable) {
        int size = this.f23697a.size();
        for (int i = 0; i < size; i++) {
            try {
                ControllerListener controllerListener = this.f23697a.get(i);
                if (controllerListener != null) {
                    controllerListener.onFinalImageSet(str, info, animatable);
                }
            } catch (Exception unused) {
            }
        }
    }
}
