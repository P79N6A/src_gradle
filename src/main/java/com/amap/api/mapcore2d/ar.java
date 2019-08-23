package com.amap.api.mapcore2d;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.amap.api.a.a;
import com.amap.api.a.d;
import com.amap.api.maps2d.AMapOptions;
import com.amap.api.maps2d.CameraUpdate;
import com.amap.api.maps2d.UiSettings;
import com.amap.api.maps2d.model.CameraPosition;

public class ar implements d {

    /* renamed from: a  reason: collision with root package name */
    public static volatile Context f5624a;

    /* renamed from: b  reason: collision with root package name */
    private a f5625b;

    /* renamed from: c  reason: collision with root package name */
    private AMapOptions f5626c;

    public boolean isReady() throws RemoteException {
        return false;
    }

    public void onDestroyView() throws RemoteException {
    }

    public void onLowMemory() throws RemoteException {
    }

    public void onPause() throws RemoteException {
        if (this.f5625b != null) {
            this.f5625b.onPause();
        }
    }

    public void onResume() throws RemoteException {
        if (this.f5625b != null) {
            this.f5625b.onResume();
        }
    }

    public a getMap() throws RemoteException {
        if (this.f5625b == null) {
            if (f5624a != null) {
                a();
                this.f5625b = new b(f5624a);
            } else {
                throw new NullPointerException("Context 为 null 请在地图调用之前 使用 MapsInitializer.initialize(Context paramContext) 来设置Context");
            }
        }
        return this.f5625b;
    }

    public void onDestroy() throws RemoteException {
        if (getMap() != null) {
            getMap().clear();
            getMap().destroy();
        }
        setContext(null);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        int i = f5624a.getResources().getDisplayMetrics().densityDpi;
        q.l = i;
        if (i <= 320) {
            q.j = 256;
        } else if (i <= 480) {
            q.j = 384;
        } else {
            q.j = 512;
        }
        if (i <= 120) {
            q.f6266a = 0.5f;
        } else if (i <= 160) {
            q.f6266a = 0.6f;
            q.a(18);
        } else if (i <= 240) {
            q.f6266a = 0.87f;
        } else if (i <= 320) {
            q.f6266a = 1.0f;
        } else if (i <= 480) {
            q.f6266a = 1.5f;
        } else {
            q.f6266a = 1.8f;
        }
        if (q.f6266a <= 0.6f) {
            q.f6268c = 18;
        }
    }

    public void setContext(Context context) {
        a(context);
    }

    public void setOptions(AMapOptions aMapOptions) {
        this.f5626c = aMapOptions;
    }

    private void a(Context context) {
        if (context != null) {
            f5624a = context.getApplicationContext();
        }
    }

    public void onCreate(Bundle bundle) throws RemoteException {
        ck.a("MapFragmentDelegateImp", "onCreate", 113);
    }

    public void onSaveInstanceState(Bundle bundle) throws RemoteException {
        if (this.f5625b != null) {
            if (this.f5626c == null) {
                this.f5626c = new AMapOptions();
            }
            this.f5626c = this.f5626c.camera(getMap().getCameraPosition());
            if (bundle != null) {
                try {
                    Parcel obtain = Parcel.obtain();
                    this.f5626c.writeToParcel(obtain, 0);
                    bundle.putByteArray("MapOptions", obtain.marshall());
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(AMapOptions aMapOptions) throws RemoteException {
        if (aMapOptions != null && this.f5625b != null) {
            CameraPosition camera = aMapOptions.getCamera();
            if (camera != null) {
                this.f5625b.moveCamera(new CameraUpdate(m.a(camera.target, camera.zoom, camera.bearing, camera.tilt)));
            }
            UiSettings aMapUiSettings = this.f5625b.getAMapUiSettings();
            aMapUiSettings.setScrollGesturesEnabled(aMapOptions.getScrollGesturesEnabled().booleanValue());
            aMapUiSettings.setZoomControlsEnabled(aMapOptions.getZoomControlsEnabled().booleanValue());
            aMapUiSettings.setZoomGesturesEnabled(aMapOptions.getZoomGesturesEnabled().booleanValue());
            aMapUiSettings.setCompassEnabled(aMapOptions.getCompassEnabled().booleanValue());
            aMapUiSettings.setScaleControlsEnabled(aMapOptions.getScaleControlsEnabled().booleanValue());
            aMapUiSettings.setLogoPosition(aMapOptions.getLogoPosition());
            this.f5625b.setMapType(aMapOptions.getMapType());
            this.f5625b.setZOrderOnTop(aMapOptions.getZOrderOnTop().booleanValue());
        }
    }

    public void onInflate(Activity activity, AMapOptions aMapOptions, Bundle bundle) throws RemoteException {
        setContext(activity);
        this.f5626c = aMapOptions;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws RemoteException {
        if (this.f5625b == null) {
            if (f5624a == null && layoutInflater != null) {
                setContext(layoutInflater.getContext().getApplicationContext());
            }
            if (f5624a != null) {
                a();
                this.f5625b = new b(f5624a);
            } else {
                throw new NullPointerException("Context 为 null 请在地图调用之前 使用 MapsInitializer.initialize(Context paramContext) 来设置Context");
            }
        }
        try {
            if (this.f5626c == null && bundle != null) {
                byte[] byteArray = bundle.getByteArray("MapOptions");
                if (byteArray != null) {
                    Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(byteArray, 0, byteArray.length);
                    obtain.setDataPosition(0);
                    this.f5626c = AMapOptions.CREATOR.createFromParcel(obtain);
                }
            }
            a(this.f5626c);
            ck.a("MapFragmentDelegateImp", "onCreateView", 113);
        } catch (Throwable unused) {
        }
        return this.f5625b.getView();
    }
}
