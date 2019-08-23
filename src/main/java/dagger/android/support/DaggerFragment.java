package dagger.android.support;

import android.content.Context;
import android.support.v4.app.Fragment;

public abstract class DaggerFragment extends Fragment implements b {
    public void onAttach(Context context) {
        a.a(this);
        super.onAttach(context);
    }
}
