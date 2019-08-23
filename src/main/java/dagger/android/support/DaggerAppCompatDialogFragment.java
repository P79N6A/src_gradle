package dagger.android.support;

import android.content.Context;
import android.support.v7.app.AppCompatDialogFragment;

public abstract class DaggerAppCompatDialogFragment extends AppCompatDialogFragment implements b {
    public void onAttach(Context context) {
        a.a(this);
        super.onAttach(context);
    }
}
