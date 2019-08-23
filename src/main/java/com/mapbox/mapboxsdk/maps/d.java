package com.mapbox.mapboxsdk.maps;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import com.mapbox.mapboxsdk.a.d;
import com.mapbox.mapboxsdk.b;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.style.sources.Source;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class d implements DialogInterface.OnClickListener, View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final Context f26628a;

    /* renamed from: b  reason: collision with root package name */
    private final o f26629b;

    /* renamed from: c  reason: collision with root package name */
    private Set<com.mapbox.mapboxsdk.a.a> f26630c;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        final o f26634a;

        /* renamed from: b  reason: collision with root package name */
        final WeakReference<Context> f26635b;

        a(o oVar, Context context) {
            this.f26634a = oVar;
            this.f26635b = new WeakReference<>(context);
        }
    }

    private String[] a() {
        ArrayList arrayList = new ArrayList();
        for (com.mapbox.mapboxsdk.a.a aVar : this.f26630c) {
            arrayList.add(aVar.f26381a);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final void a(@NonNull String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            this.f26628a.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            e.a(Toast.makeText(this.f26628a, C0906R.string.b_a, 1));
            b.a((Exception) e2);
        }
    }

    public final void onClick(View view) {
        Set<com.mapbox.mapboxsdk.a.a> set;
        List<Source> list;
        a aVar = new a(this.f26629b, view.getContext());
        Context context = (Context) aVar.f26635b.get();
        if (context == null) {
            set = Collections.emptySet();
        } else {
            ArrayList arrayList = new ArrayList();
            NativeMapView nativeMapView = aVar.f26634a.f26695a;
            if (nativeMapView.a("getSources")) {
                list = null;
            } else {
                list = Arrays.asList(nativeMapView.nativeGetSources());
            }
            for (Source source : list) {
                if (!source.getAttribution().isEmpty()) {
                    arrayList.add(source.getAttribution());
                }
            }
            d.a a2 = new d.a().b(true).a(true);
            a2.f26406a = new WeakReference<>(context);
            a2.f26407b = true;
            set = a2.a((String[]) arrayList.toArray(new String[arrayList.size()])).a().f26400a;
        }
        this.f26630c = set;
        boolean z = false;
        if (this.f26628a instanceof Activity) {
            z = ((Activity) this.f26628a).isFinishing();
        }
        if (!z) {
            String[] a3 = a();
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f26628a);
            builder.setTitle(C0906R.string.b_g);
            builder.setAdapter(new ArrayAdapter(this.f26628a, C0906R.layout.a_x, a3), this);
            builder.show();
        }
    }

    public d(@NonNull Context context, @NonNull o oVar) {
        this.f26628a = context;
        this.f26629b = oVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z;
        if (i == a().length - 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f26628a);
            builder.setTitle(C0906R.string.b_f);
            builder.setMessage(C0906R.string.b_b);
            builder.setPositiveButton(C0906R.string.b_e, new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    aa d2 = com.mapbox.mapboxsdk.d.d();
                    if (d2 != null) {
                        d2.a(true);
                    }
                    dialogInterface.cancel();
                }
            });
            builder.setNeutralButton(C0906R.string.b_d, new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    d.this.a(d.this.f26628a.getResources().getString(C0906R.string.b_y));
                    dialogInterface.cancel();
                }
            });
            builder.setNegativeButton(C0906R.string.b_c, new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    aa d2 = com.mapbox.mapboxsdk.d.d();
                    if (d2 != null) {
                        d2.a(false);
                    }
                    dialogInterface.cancel();
                }
            });
            builder.show();
            return;
        }
        String str = ((com.mapbox.mapboxsdk.a.a[]) this.f26630c.toArray(new com.mapbox.mapboxsdk.a.a[this.f26630c.size()]))[i].f26382b;
        if (str.contains("https://www.mapbox.com/map-feedback")) {
            CameraPosition g = this.f26629b.g();
            if (g != null) {
                str = String.format(Locale.getDefault(), "https://www.mapbox.com/map-feedback/#/%f/%f/%d", new Object[]{Double.valueOf(g.target.b()), Double.valueOf(g.target.a()), Integer.valueOf((int) g.zoom)});
            } else {
                str = "https://www.mapbox.com/map-feedback";
            }
        }
        a(str);
    }
}
