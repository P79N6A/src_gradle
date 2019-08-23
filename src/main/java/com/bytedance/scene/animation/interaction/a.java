package com.bytedance.scene.animation.interaction;

import android.graphics.drawable.Drawable;
import android.support.v4.os.CancellationSignal;
import com.bytedance.scene.navigation.e;
import java.util.List;

public abstract class a {
    static CancellationSignal k;

    /* renamed from: a  reason: collision with root package name */
    e f22050a;

    /* renamed from: b  reason: collision with root package name */
    List<com.bytedance.scene.animation.interaction.a.a> f22051b;

    /* renamed from: c  reason: collision with root package name */
    boolean f22052c;

    /* renamed from: d  reason: collision with root package name */
    float f22053d;

    /* renamed from: e  reason: collision with root package name */
    com.bytedance.scene.e f22054e;

    /* renamed from: f  reason: collision with root package name */
    com.bytedance.scene.e f22055f;
    Drawable g;
    int h;
    public C0227a i;
    CancellationSignal j;

    /* renamed from: com.bytedance.scene.animation.interaction.a$a  reason: collision with other inner class name */
    public interface C0227a {
        void a();
    }

    public static void a() {
        if (k != null) {
            k.cancel();
            k = null;
        }
    }
}
