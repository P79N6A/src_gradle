package com.ss.android.ugc.aweme.app;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;

public final class LogFragmentLifecycleCallbacks extends FragmentManager.FragmentLifecycleCallbacks {
    public final void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
    }

    public final void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
    }

    public final void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
    }

    public final void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
    }

    public final void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
    }

    @MeasureFunction
    public final void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
    }

    public final void onFragmentPreAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
    }

    public final void onFragmentPreCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
    }

    public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
    }

    public final void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
    }

    public final void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
    }

    public final void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
    }

    public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
    }

    public final void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
    }
}
