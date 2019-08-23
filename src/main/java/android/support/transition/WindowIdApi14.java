package android.support.transition;

import android.os.IBinder;

public class WindowIdApi14 implements WindowIdImpl {
    private final IBinder mToken;

    public int hashCode() {
        return this.mToken.hashCode();
    }

    WindowIdApi14(IBinder iBinder) {
        this.mToken = iBinder;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WindowIdApi14) || !((WindowIdApi14) obj).mToken.equals(this.mToken)) {
            return false;
        }
        return true;
    }
}
