package com.mapbox.mapboxsdk.maps;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mapbox.mapboxsdk.utils.d;
import java.util.List;

public final class k extends Fragment implements s {

    /* renamed from: a  reason: collision with root package name */
    private final List<s> f26658a;

    /* renamed from: b  reason: collision with root package name */
    private a f26659b;

    /* renamed from: c  reason: collision with root package name */
    private o f26660c;

    /* renamed from: d  reason: collision with root package name */
    private MapView f26661d;

    public interface a {
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f26661d.g();
        this.f26658a.clear();
    }

    public final void onPause() {
        super.onPause();
        this.f26661d.e();
    }

    public final void onResume() {
        super.onResume();
        this.f26661d.d();
    }

    public final void onStart() {
        super.onStart();
        this.f26661d.c();
    }

    public final void onStop() {
        super.onStop();
        this.f26661d.f();
    }

    public final void onLowMemory() {
        super.onLowMemory();
        if (this.f26661d != null && !this.f26661d.f26553d) {
            this.f26661d.h();
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof a) {
            this.f26659b = (a) context;
        }
    }

    public final void a(o oVar) {
        this.f26660c = oVar;
        for (s a2 : this.f26658a) {
            a2.a(oVar);
        }
    }

    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f26661d != null && !this.f26661d.f26553d) {
            this.f26661d.b(bundle);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f26661d.a(bundle);
        this.f26661d.a((s) this);
    }

    public final void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        setArguments(d.a(p.a(context, attributeSet)));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        Context context = layoutInflater.getContext();
        this.f26661d = new MapView(context, d.a(context, getArguments()));
        return this.f26661d;
    }
}
