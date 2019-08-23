package com.bytedance.scene.b;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;

public final class a {

    /* renamed from: com.bytedance.scene.b.a$a  reason: collision with other inner class name */
    public static class C0228a {

        /* renamed from: a  reason: collision with root package name */
        public final float f22070a;

        /* renamed from: b  reason: collision with root package name */
        public final float f22071b;

        /* renamed from: c  reason: collision with root package name */
        public final float f22072c;

        /* renamed from: d  reason: collision with root package name */
        public final float f22073d;

        /* renamed from: e  reason: collision with root package name */
        public final float f22074e;

        /* renamed from: f  reason: collision with root package name */
        public final float f22075f;
        public final float g;
        public final float h;

        public C0228a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
            this.f22070a = f2;
            this.f22071b = f3;
            this.f22072c = f4;
            this.f22073d = f5;
            this.f22074e = f6;
            this.f22075f = f7;
            this.g = f8;
            this.h = f9;
        }
    }

    public static void a(@NonNull View view) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setAlpha(1.0f);
        view.clearAnimation();
    }

    public static void c(@NonNull View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        int indexOfChild = viewGroup.indexOfChild(view);
        if (indexOfChild >= 0 && indexOfChild != childCount - 1) {
            view.bringToFront();
        }
    }

    @NonNull
    public static C0228a b(@NonNull View view) {
        C0228a aVar = new C0228a(view.getTranslationX(), view.getTranslationY(), view.getScaleX(), view.getScaleY(), view.getRotation(), view.getRotationX(), view.getRotationY(), view.getAlpha());
        return aVar;
    }

    public static void a(@NonNull View view, @NonNull C0228a aVar) {
        view.setTranslationX(aVar.f22070a);
        view.setTranslationY(aVar.f22071b);
        view.setScaleX(aVar.f22072c);
        view.setScaleY(aVar.f22073d);
        view.setRotation(aVar.f22074e);
        view.setRotationX(aVar.f22075f);
        view.setRotationY(aVar.g);
        view.setAlpha(aVar.h);
    }
}
