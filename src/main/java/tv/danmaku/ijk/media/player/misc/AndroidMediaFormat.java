package tv.danmaku.ijk.media.player.misc;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

public class AndroidMediaFormat implements IMediaFormat {
    private final MediaFormat mMediaFormat;

    @TargetApi(16)
    public String toString() {
        StringBuilder sb = new StringBuilder(SearchJediMixFeedAdapter.f42517f);
        sb.append(getClass().getName());
        sb.append('{');
        if (this.mMediaFormat != null) {
            sb.append(this.mMediaFormat.toString());
        } else {
            sb.append("null");
        }
        sb.append('}');
        return sb.toString();
    }

    public AndroidMediaFormat(MediaFormat mediaFormat) {
        this.mMediaFormat = mediaFormat;
    }

    @TargetApi(16)
    public int getInteger(String str) {
        if (this.mMediaFormat == null) {
            return 0;
        }
        return this.mMediaFormat.getInteger(str);
    }

    @TargetApi(16)
    public String getString(String str) {
        if (this.mMediaFormat == null) {
            return null;
        }
        return this.mMediaFormat.getString(str);
    }
}
