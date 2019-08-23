package pl.droidsonroids.gif;

import android.support.annotation.NonNull;
import java.io.IOException;

public class GifIOException extends IOException {
    private static final long serialVersionUID = 13038402904505L;
    private final String mErrnoMessage;
    @NonNull
    public final b reason;

    public String getMessage() {
        if (this.mErrnoMessage == null) {
            return this.reason.getFormattedDescription();
        }
        return this.reason.getFormattedDescription() + ": " + this.mErrnoMessage;
    }

    GifIOException(int i, String str) {
        this.reason = b.fromCode(i);
        this.mErrnoMessage = str;
    }
}
