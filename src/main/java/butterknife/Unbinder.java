package butterknife;

import android.support.annotation.UiThread;

public interface Unbinder {
    public static final Unbinder EMPTY = Unbinder$$Lambda$0.$instance;

    @UiThread
    void unbind();
}
