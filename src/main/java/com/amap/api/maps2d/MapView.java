package com.amap.api.maps2d;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.amap.api.a.a;
import com.amap.api.a.d;
import com.amap.api.mapcore2d.ar;
import com.amap.api.mapcore2d.cm;
import com.amap.api.mapcore2d.eb;
import com.amap.api.maps2d.model.RuntimeRemoteException;

public class MapView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private d f6321a;

    /* renamed from: b  reason: collision with root package name */
    private AMap f6322b;

    public final void onDestroy() {
        try {
            getMapFragmentDelegate().onDestroy();
        } catch (RemoteException e2) {
            cm.a(e2, "MapView", "onDestroy");
        }
    }

    public final void onLowMemory() {
        try {
            getMapFragmentDelegate().onLowMemory();
        } catch (RemoteException e2) {
            cm.a(e2, "MapView", "onLowMemory");
        }
    }

    public final void onPause() {
        try {
            getMapFragmentDelegate().onPause();
        } catch (RemoteException e2) {
            cm.a(e2, "MapView", "onPause");
        }
    }

    public final void onResume() {
        try {
            getMapFragmentDelegate().onResume();
        } catch (RemoteException e2) {
            cm.a(e2, "MapView", "onResume");
        }
    }

    public AMap getMap() {
        d mapFragmentDelegate = getMapFragmentDelegate();
        if (mapFragmentDelegate == null) {
            return null;
        }
        try {
            a map = mapFragmentDelegate.getMap();
            if (map == null) {
                return null;
            }
            if (this.f6322b == null) {
                this.f6322b = new AMap(map);
            }
            return this.f6322b;
        } catch (RemoteException e2) {
            cm.a(e2, "MapView", "getMap");
            throw new RuntimeRemoteException(e2);
        }
    }

    /* access modifiers changed from: protected */
    public d getMapFragmentDelegate() {
        try {
            if (this.f6321a == null) {
                this.f6321a = (d) eb.a(getContext(), cm.a(), "com.amap.api.wrapper.MapFragmentDelegateWrapper", ar.class, null, null);
            }
        } catch (Throwable unused) {
        }
        if (this.f6321a == null) {
            this.f6321a = new ar();
        }
        return this.f6321a;
    }

    public MapView(Context context) {
        super(context);
        getMapFragmentDelegate().setContext(context);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        try {
            getMapFragmentDelegate().onSaveInstanceState(bundle);
        } catch (RemoteException e2) {
            cm.a(e2, "MapView", "onSaveInstanceState");
        }
    }

    public final void onCreate(Bundle bundle) {
        try {
            addView(getMapFragmentDelegate().onCreateView(null, null, bundle), new ViewGroup.LayoutParams(-1, -1));
        } catch (RemoteException e2) {
            cm.a(e2, "MapView", "onCreate");
        } catch (Throwable th) {
            cm.a(th, "MapView", "onCreate");
        }
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getMapFragmentDelegate().setContext(context);
    }

    public MapView(Context context, AMapOptions aMapOptions) {
        super(context);
        getMapFragmentDelegate().setContext(context);
        getMapFragmentDelegate().setOptions(aMapOptions);
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getMapFragmentDelegate().setContext(context);
    }
}
