package com.ss.android.ugc.thermometer;

import android.os.Bundle;
import android.os.Parcel;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class TooLarge {

    static class FragmentSavedStateLogger extends FragmentManager.FragmentLifecycleCallbacks {
        @NonNull

        /* renamed from: a  reason: collision with root package name */
        private final Map<Fragment, Bundle> f77800a;

        public void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
            if (this.f77800a.remove(fragment) != null) {
                String str = fragment.getClass().getSimpleName() + ".onSaveInstanceState wrote: " + TooLarge.a(r3);
                if (fragment.getArguments() != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("\n* fragment arguments = ");
                    sb.append(TooLarge.a(fragment.getArguments()));
                }
            }
        }

        public void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
            this.f77800a.put(fragment, bundle);
        }
    }

    private static float a(int i) {
        return ((float) i) / 1000.0f;
    }

    private static int c(@NonNull Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeBundle(bundle);
            return obtain.dataSize();
        } finally {
            obtain.recycle();
        }
    }

    private static Map<String, Integer> b(@NonNull Bundle bundle) {
        HashMap hashMap = new HashMap(bundle.size());
        Bundle bundle2 = new Bundle(bundle);
        try {
            int c2 = c(bundle);
            for (String str : bundle2.keySet()) {
                bundle.remove(str);
                int c3 = c(bundle);
                hashMap.put(str, Integer.valueOf(c2 - c3));
                c2 = c3;
            }
            return hashMap;
        } finally {
            bundle.putAll(bundle2);
        }
    }

    @NonNull
    public static String a(@NonNull Bundle bundle) {
        String format = String.format(Locale.UK, "Bundle@%d contains %d keys and measures %,.1f KB when serialized as a Parcel", new Object[]{Integer.valueOf(System.identityHashCode(bundle)), Integer.valueOf(bundle.size()), Float.valueOf(a(c(bundle)))});
        for (Map.Entry next : b(bundle).entrySet()) {
            format = format + String.format(Locale.UK, "\n* %s = %,.1f KB", new Object[]{next.getKey(), Float.valueOf(a(((Integer) next.getValue()).intValue()))});
        }
        return format;
    }
}
