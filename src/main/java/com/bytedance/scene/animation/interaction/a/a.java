package com.bytedance.scene.animation.interaction.a;

import android.util.Property;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static a f22056a = new a(1.0f) {
    };

    /* renamed from: b  reason: collision with root package name */
    public static final Property<a, Float> f22057b = new Property<a, Float>(Float.class, "") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            a aVar = (a) obj;
            ((Float) obj2).floatValue();
        }
    };

    /* renamed from: c  reason: collision with root package name */
    public float f22058c;

    /* renamed from: d  reason: collision with root package name */
    public float f22059d;

    public a() {
        this(1.0f);
    }

    public a(float f2) {
        this.f22058c = f2;
    }
}
