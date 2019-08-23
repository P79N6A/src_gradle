package com.amap.api.maps2d;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.amap.api.a.a;
import com.amap.api.a.d;
import com.amap.api.mapcore2d.ar;
import com.amap.api.mapcore2d.cm;
import com.amap.api.maps2d.model.RuntimeRemoteException;

public class MapFragment extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    private AMap f6319a;

    /* renamed from: b  reason: collision with root package name */
    private d f6320b;

    public static MapFragment newInstance() {
        return newInstance(new AMapOptions());
    }

    /* access modifiers changed from: protected */
    public d getMapFragmentDelegate() {
        if (this.f6320b == null) {
            this.f6320b = new ar();
        }
        if (getActivity() != null) {
            this.f6320b.setContext(getActivity());
        }
        return this.f6320b;
    }

    public void onDestroy() {
        try {
            getMapFragmentDelegate().onDestroy();
        } catch (RemoteException e2) {
            cm.a(e2, "MapFragment", "onDestroy");
        }
        super.onDestroy();
    }

    public void onDestroyView() {
        try {
            getMapFragmentDelegate().onDestroyView();
        } catch (RemoteException e2) {
            cm.a(e2, "MapFragment", "onDestroyView");
        }
        super.onDestroyView();
    }

    public void onLowMemory() {
        super.onLowMemory();
        try {
            getMapFragmentDelegate().onLowMemory();
        } catch (RemoteException e2) {
            cm.a(e2, "MapFragment", "onLowMemory");
        }
    }

    public void onPause() {
        super.onPause();
        try {
            getMapFragmentDelegate().onPause();
        } catch (RemoteException e2) {
            cm.a(e2, "MapFragment", "onPause");
        }
    }

    public void onResume() {
        super.onResume();
        try {
            getMapFragmentDelegate().onResume();
        } catch (RemoteException e2) {
            cm.a(e2, "MapFragment", "onResume");
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
            if (this.f6319a == null) {
                this.f6319a = new AMap(map);
            }
            return this.f6319a;
        } catch (RemoteException e2) {
            cm.a(e2, "MapFragment", "getMap");
            throw new RuntimeRemoteException(e2);
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }

    public static MapFragment newInstance(AMapOptions aMapOptions) {
        MapFragment mapFragment = new MapFragment();
        Bundle bundle = new Bundle();
        try {
            Parcel obtain = Parcel.obtain();
            aMapOptions.writeToParcel(obtain, 0);
            bundle.putByteArray("MapOptions", obtain.marshall());
        } catch (Throwable unused) {
        }
        mapFragment.setArguments(bundle);
        return mapFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            getMapFragmentDelegate().onCreate(bundle);
        } catch (RemoteException e2) {
            cm.a(e2, "MapFragment", "onCreate");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        try {
            getMapFragmentDelegate().onSaveInstanceState(bundle);
        } catch (RemoteException e2) {
            cm.a(e2, "MapFragment", "onSaveInstanceState");
        }
        super.onSaveInstanceState(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle == null) {
            try {
                bundle = getArguments();
            } catch (RemoteException e2) {
                cm.a(e2, "MapFragment", "onCreateView");
                return null;
            }
        }
        return getMapFragmentDelegate().onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        try {
            getMapFragmentDelegate().onInflate(activity, new AMapOptions(), bundle);
        } catch (RemoteException e2) {
            cm.a(e2, "MapFragment", "onInflate");
        }
    }
}
