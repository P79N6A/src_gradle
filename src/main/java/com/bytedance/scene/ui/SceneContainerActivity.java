package com.bytedance.scene.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.a.c;
import com.bytedance.scene.a.d;
import com.bytedance.scene.b.f;
import com.bytedance.scene.e;
import com.bytedance.scene.g;
import com.bytedance.scene.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SceneContainerActivity extends AppCompatActivity {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<d> f22207a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public static final List<SceneContainerActivity> f22208b = new ArrayList();
    @StyleRes

    /* renamed from: c  reason: collision with root package name */
    public int f22209c = -1;

    /* renamed from: d  reason: collision with root package name */
    private g f22210d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f22211e;

    public static class a extends e {
        public final void f(@Nullable Bundle bundle) {
            super.f(bundle);
            f<? extends Class<? extends e>, Bundle> a2 = SceneContainerActivity.a(s().getIntent());
            c.a a3 = new c.a().a((com.bytedance.scene.animation.c) new b((byte) 0));
            a3.f21982a = new d() {
                public final void a(@Nullable Object obj) {
                    k a2 = k.a(a.this.s().getIntent());
                    Message obtain = Message.obtain();
                    obtain.obj = obj;
                    try {
                        a2.f22145a.send(obtain);
                    } catch (RemoteException unused) {
                    }
                    a.this.s().finish();
                }
            };
            this.f22097e.a((Class) a2.f22083a, (Bundle) a2.f22084b, a3.a());
        }

        @NonNull
        public final View a(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
            return new View(s());
        }
    }

    static class b extends com.bytedance.scene.animation.c {
        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public final void a(@NonNull com.bytedance.scene.animation.a aVar, @NonNull com.bytedance.scene.animation.a aVar2, @NonNull Runnable runnable, @NonNull com.bytedance.scene.b.b bVar) {
            runnable.run();
        }

        public final void b(@NonNull com.bytedance.scene.animation.a aVar, @NonNull com.bytedance.scene.animation.a aVar2, @NonNull Runnable runnable, @NonNull com.bytedance.scene.b.b bVar) {
            View view = aVar.f21987b;
            View view2 = aVar2.f21987b;
            com.bytedance.scene.b.a.a(view);
            com.bytedance.scene.b.a.a(view2);
            view.setVisibility(0);
            if (Build.VERSION.SDK_INT >= 18) {
                this.f21995a.getOverlay().add(view);
            } else {
                this.f21995a.addView(view);
            }
            runnable.run();
        }
    }

    public void onStart() {
        super.onStart();
        this.f22211e = true;
    }

    public void onStop() {
        super.onStop();
        this.f22211e = false;
    }

    public void onBackPressed() {
        if (!this.f22210d.a()) {
            super.onBackPressed();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        f22208b.remove(this);
    }

    @NonNull
    public static f<? extends Class<? extends e>, Bundle> a(Intent intent) {
        try {
            return f.a(Class.forName(intent.getStringExtra("class_name")), intent.getBundleExtra("arguments"));
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("theme", -1);
        if (intExtra != -1) {
            setTheme(intExtra);
        }
        this.f22209c = intExtra;
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 1024);
        }
        f22208b.add(this);
        if (k.a(getIntent()) != null) {
            this.f22210d = com.bytedance.scene.d.a(this, bundle, new com.bytedance.scene.navigation.g(a.class, (Bundle) null), false);
            return;
        }
        f<? extends Class<? extends e>, Bundle> a2 = a(getIntent());
        this.f22210d = com.bytedance.scene.d.a(this, bundle, new com.bytedance.scene.navigation.g((Class) a2.f22083a, (Bundle) a2.f22084b), false);
    }
}
