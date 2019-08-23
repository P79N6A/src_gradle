package android.support.transition;

import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.view.WindowId;

@RequiresApi(18)
public class WindowIdApi18 implements WindowIdImpl {
    private final WindowId mWindowId;

    public int hashCode() {
        return this.mWindowId.hashCode();
    }

    WindowIdApi18(@NonNull View view) {
        this.mWindowId = view.getWindowId();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WindowIdApi18) || !((WindowIdApi18) obj).mWindowId.equals(this.mWindowId)) {
            return false;
        }
        return true;
    }
}
