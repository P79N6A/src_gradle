package com.ss.android.ugc.aweme.framework.services;

import android.app.Activity;

public interface ILocationService {

    public interface OnPermissionListener {
        void onPermissionDenied();

        void onPermissionGranted();
    }

    double[] getLatLng();

    void showNearByLocationDialog(Activity activity, OnPermissionListener onPermissionListener);
}
