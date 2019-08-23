package com.bytedance.scene.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.scene.c;
import com.bytedance.scene.f;
import com.bytedance.scene.h;
import com.bytedance.scene.i;
import com.bytedance.scene.navigation.e;

public class LifeCycleCompatFragment extends Fragment implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public e f22200a;

    /* renamed from: b  reason: collision with root package name */
    public i.a f22201b;

    /* renamed from: c  reason: collision with root package name */
    public c f22202c;

    /* renamed from: d  reason: collision with root package name */
    public f f22203d;

    /* renamed from: e  reason: collision with root package name */
    private FrameLayout f22204e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f22205f;
    private final h g = new h();

    public final boolean a() {
        return this.f22205f;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.g.e();
    }

    public void onPause() {
        super.onPause();
        this.g.c();
    }

    public void onResume() {
        super.onResume();
        this.g.b();
    }

    public void onStart() {
        super.onStart();
        this.g.a();
    }

    public void onStop() {
        super.onStop();
        this.g.d();
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(false);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.g.a(configuration);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f22205f) {
            bundle.putString("SCENE", this.f22200a.getClass().getName());
            this.g.a(bundle);
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (a() && bundle != null) {
            this.g.b(bundle);
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        Bundle bundle2;
        super.onActivityCreated(bundle);
        this.f22205f = getArguments().getBoolean("supportRestore");
        if (bundle != null) {
            this.f22200a = (e) com.bytedance.scene.b.h.a(getActivity(), bundle.getString("SCENE"), null);
            if (this.f22202c != null) {
                this.f22202c.a(this.f22200a);
            }
        } else if (this.f22200a == null) {
            throw new IllegalStateException("mNavigationScene can't be null");
        }
        h hVar = this.g;
        FragmentActivity activity = getActivity();
        FrameLayout frameLayout = this.f22204e;
        e eVar = this.f22200a;
        i.a aVar = this.f22201b;
        f fVar = this.f22203d;
        if (this.f22205f) {
            bundle2 = bundle;
        } else {
            bundle2 = null;
        }
        hVar.a(activity, frameLayout, eVar, this, aVar, fVar, bundle2);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f22200a.a(i, i2, intent);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        this.f22204e = new FrameLayout(getActivity());
        return this.f22204e;
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.f22200a.a(i, iArr);
    }
}
