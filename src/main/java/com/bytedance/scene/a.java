package com.bytedance.scene;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.scene.b.h;
import com.bytedance.scene.i;
import com.bytedance.scene.navigation.e;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class a extends Fragment implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public e f21972a;

    /* renamed from: b  reason: collision with root package name */
    public i.a f21973b;

    /* renamed from: c  reason: collision with root package name */
    public f f21974c;

    /* renamed from: d  reason: collision with root package name */
    private FrameLayout f21975d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f21976e;

    /* renamed from: f  reason: collision with root package name */
    private c f21977f;
    private final h g = new h();
    private boolean h = false;

    public final boolean a() {
        return this.f21976e;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        if (!this.h) {
            this.g.e();
        }
    }

    public final void onPause() {
        super.onPause();
        if (!this.h) {
            this.g.c();
        }
    }

    public final void onResume() {
        super.onResume();
        if (!this.h) {
            this.g.b();
        }
    }

    public final void onStart() {
        super.onStart();
        if (!this.h) {
            this.g.a();
        }
    }

    public final void onStop() {
        super.onStop();
        if (!this.h) {
            this.g.d();
        }
    }

    private void b() {
        getActivity().getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
        this.h = true;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(false);
    }

    public final void a(c cVar) {
        this.f21977f = cVar;
        if (this.f21972a != null) {
            this.f21977f.a(this.f21972a);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.h) {
            this.g.a(configuration);
        }
    }

    public static a a(boolean z) {
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putBoolean("supportRestore", z);
        aVar.setArguments(bundle);
        return aVar;
    }

    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (!this.h && this.f21976e && bundle != null) {
            this.g.b(bundle);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!this.h && this.f21976e) {
            bundle.putString("SCENE", this.f21972a.getClass().getName());
            this.g.a(bundle);
        }
    }

    public final void onActivityCreated(@Nullable Bundle bundle) {
        Bundle bundle2;
        super.onActivityCreated(bundle);
        this.f21976e = getArguments().getBoolean("supportRestore");
        if (bundle != null) {
            String string = bundle.getString("SCENE", null);
            if (string == null) {
                b();
                return;
            }
            this.f21972a = (e) h.a(getActivity(), string, null);
            if (this.f21977f != null) {
                this.f21977f.a(this.f21972a);
            }
        } else if (this.f21972a == null) {
            b();
            return;
        }
        h hVar = this.g;
        Activity activity = getActivity();
        FrameLayout frameLayout = this.f21975d;
        e eVar = this.f21972a;
        i.a aVar = this.f21973b;
        f fVar = this.f21974c;
        if (this.f21976e) {
            bundle2 = bundle;
        } else {
            bundle2 = null;
        }
        hVar.a(activity, frameLayout, eVar, this, aVar, fVar, bundle2);
    }

    public final void a(@NonNull e eVar, @NonNull i.a aVar) {
        if (eVar != null) {
            this.f21972a = eVar;
            this.f21973b = aVar;
            return;
        }
        throw new NullPointerException("rootScene can't be null");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f21972a.a(i, i2, intent);
    }

    @Nullable
    public final View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        this.f21975d = new FrameLayout(getActivity());
        return this.f21975d;
    }

    public final void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.f21972a.a(i, iArr);
    }
}
