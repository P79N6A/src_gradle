package tv.danmaku.ijk.media.player.misc;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class IjkTrackInfo implements ITrackInfo {
    private IjkMediaMeta.IjkStreamMeta mStreamMeta;
    private int mTrackType;

    public int getTrackType() {
        return this.mTrackType;
    }

    public IMediaFormat getFormat() {
        return new IjkMediaFormat(this.mStreamMeta);
    }

    public String getLanguage() {
        if (this.mStreamMeta == null || TextUtils.isEmpty(this.mStreamMeta.mLanguage)) {
            return "und";
        }
        return this.mStreamMeta.mLanguage;
    }

    public String toString() {
        return getClass().getSimpleName() + '{' + getInfoInline() + "}";
    }

    public String getInfoInline() {
        StringBuilder sb = new StringBuilder(SearchJediMixFeedAdapter.f42517f);
        switch (this.mTrackType) {
            case 1:
                sb.append("VIDEO");
                sb.append(", ");
                sb.append(this.mStreamMeta.getCodecShortNameInline());
                sb.append(", ");
                sb.append(this.mStreamMeta.getBitrateInline());
                sb.append(", ");
                sb.append(this.mStreamMeta.getResolutionInline());
                break;
            case 2:
                sb.append("AUDIO");
                sb.append(", ");
                sb.append(this.mStreamMeta.getCodecShortNameInline());
                sb.append(", ");
                sb.append(this.mStreamMeta.getBitrateInline());
                sb.append(", ");
                sb.append(this.mStreamMeta.getSampleRateInline());
                break;
            case 3:
                sb.append("TIMEDTEXT");
                sb.append(", ");
                sb.append(this.mStreamMeta.mLanguage);
                break;
            case 4:
                sb.append("SUBTITLE");
                break;
            default:
                sb.append("UNKNOWN");
                break;
        }
        return sb.toString();
    }

    public void setMediaMeta(IjkMediaMeta.IjkStreamMeta ijkStreamMeta) {
        this.mStreamMeta = ijkStreamMeta;
    }

    public void setTrackType(int i) {
        this.mTrackType = i;
    }

    public IjkTrackInfo(IjkMediaMeta.IjkStreamMeta ijkStreamMeta) {
        this.mStreamMeta = ijkStreamMeta;
    }
}
