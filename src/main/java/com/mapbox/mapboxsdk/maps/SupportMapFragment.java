package com.mapbox.mapboxsdk.maps;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mapbox.mapboxsdk.maps.k;
import com.mapbox.mapboxsdk.utils.d;
import java.util.ArrayList;
import java.util.List;

public class SupportMapFragment extends Fragment implements s {

    /* renamed from: a  reason: collision with root package name */
    protected MapView f26586a;

    /* renamed from: b  reason: collision with root package name */
    private final List<s> f26587b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private k.a f26588c;

    /* renamed from: d  reason: collision with root package name */
    private o f26589d;

    public void onDestroyView() {
        super.onDestroyView();
        this.f26586a.g();
        this.f26587b.clear();
    }

    public void onPause() {
        super.onPause();
        this.f26586a.e();
    }

    public void onResume() {
        super.onResume();
        this.f26586a.d();
    }

    public void onStart() {
        super.onStart();
        this.f26586a.c();
    }

    public void onStop() {
        super.onStop();
        this.f26586a.f();
    }

    public void onLowMemory() {
        super.onLowMemory();
        if (this.f26586a != null && !this.f26586a.f26553d) {
            this.f26586a.h();
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof k.a) {
            this.f26588c = (k.a) context;
        }
    }

    public final void a(o oVar) {
        this.f26589d = oVar;
        for (s a2 : this.f26587b) {
            a2.a(oVar);
        }
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f26586a != null && !this.f26586a.f26553d) {
            this.f26586a.b(bundle);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f26586a.a(bundle);
        this.f26586a.a((s) this);
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        setArguments(d.a(p.a(context, attributeSet)));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        Context context = layoutInflater.getContext();
        this.f26586a = new MapView(context, d.a(context, getArguments()));
        return this.f26586a;
    }
}
