package com.ss.android.socialbase.appdownloader.view;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import com.ss.android.socialbase.appdownloader.c;
import com.ss.android.socialbase.downloader.downloader.b;

public final class a extends Fragment {
    public Context a() {
        Context q = b.q();
        if (q != null || getActivity() == null || getActivity().isFinishing()) {
            return q;
        }
        return getActivity().getApplicationContext();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (c.a()) {
            c.a(true);
        } else {
            c.a(false);
        }
    }
}
