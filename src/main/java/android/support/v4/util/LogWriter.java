package android.support.v4.util;

import android.support.annotation.RestrictTo;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.Writer;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class LogWriter extends Writer {
    private StringBuilder mBuilder = new StringBuilder(SearchJediMixFeedAdapter.f42517f);
    private final String mTag;

    public void close() {
        flushBuilder();
    }

    public void flush() {
        flushBuilder();
    }

    private void flushBuilder() {
        if (this.mBuilder.length() > 0) {
            this.mBuilder.delete(0, this.mBuilder.length());
        }
    }

    public LogWriter(String str) {
        this.mTag = str;
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == 10) {
                flushBuilder();
            } else {
                this.mBuilder.append(c2);
            }
        }
    }
}
