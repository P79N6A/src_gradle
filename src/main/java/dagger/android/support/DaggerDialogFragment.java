package dagger.android.support;

import android.content.Context;
import android.support.v4.app.DialogFragment;

public abstract class DaggerDialogFragment extends DialogFragment implements b {
    public void onAttach(Context context) {
        a.a(this);
        super.onAttach(context);
    }
}
