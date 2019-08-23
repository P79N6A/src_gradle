package dagger.android.support;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import dagger.internal.e;

public final class a {
    public static void a(Fragment fragment) {
        b bVar;
        e.a(fragment, "fragment");
        Fragment fragment2 = fragment;
        while (true) {
            fragment2 = fragment2.getParentFragment();
            if (fragment2 != null) {
                if (fragment2 instanceof b) {
                    bVar = (b) fragment2;
                    break;
                }
            } else {
                FragmentActivity activity = fragment.getActivity();
                if (activity instanceof b) {
                    bVar = (b) activity;
                } else if (activity.getApplication() instanceof b) {
                    bVar = (b) activity.getApplication();
                } else {
                    throw new IllegalArgumentException(String.format("No injector was found for %s", new Object[]{fragment.getClass().getCanonicalName()}));
                }
            }
        }
        dagger.android.a<Fragment> a2 = bVar.a();
        e.a(a2, "%s.supportFragmentInjector() returned null", bVar.getClass());
        a2.a(fragment);
    }
}
