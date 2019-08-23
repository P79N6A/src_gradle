package tv.danmaku.ijk.media.player.misc;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.os.Build;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

public class AndroidTrackInfo implements ITrackInfo {
    private final MediaPlayer.TrackInfo mTrackInfo;

    @TargetApi(16)
    public String getInfoInline() {
        if (this.mTrackInfo != null) {
            return this.mTrackInfo.toString();
        }
        return "null";
    }

    @TargetApi(16)
    public String getLanguage() {
        if (this.mTrackInfo == null) {
            return "und";
        }
        return this.mTrackInfo.getLanguage();
    }

    @TargetApi(16)
    public int getTrackType() {
        if (this.mTrackInfo == null) {
            return 0;
        }
        return this.mTrackInfo.getTrackType();
    }

    @TargetApi(19)
    public IMediaFormat getFormat() {
        if (this.mTrackInfo == null || Build.VERSION.SDK_INT < 19) {
            return null;
        }
        MediaFormat format = this.mTrackInfo.getFormat();
        if (format == null) {
            return null;
        }
        return new AndroidMediaFormat(format);
    }

    @TargetApi(16)
    public String toString() {
        StringBuilder sb = new StringBuilder(SearchJediMixFeedAdapter.f42517f);
        sb.append(getClass().getSimpleName());
        sb.append('{');
        if (this.mTrackInfo != null) {
            sb.append(this.mTrackInfo.toString());
        } else {
            sb.append("null");
        }
        sb.append('}');
        return sb.toString();
    }

    private AndroidTrackInfo(MediaPlayer.TrackInfo trackInfo) {
        this.mTrackInfo = trackInfo;
    }

    public static AndroidTrackInfo[] fromMediaPlayer(MediaPlayer mediaPlayer) {
        if (Build.VERSION.SDK_INT >= 16) {
            return fromTrackInfo(mediaPlayer.getTrackInfo());
        }
        return null;
    }

    private static AndroidTrackInfo[] fromTrackInfo(MediaPlayer.TrackInfo[] trackInfoArr) {
        if (trackInfoArr == null) {
            return null;
        }
        AndroidTrackInfo[] androidTrackInfoArr = new AndroidTrackInfo[trackInfoArr.length];
        for (int i = 0; i < trackInfoArr.length; i++) {
            androidTrackInfoArr[i] = new AndroidTrackInfo(trackInfoArr[i]);
        }
        return androidTrackInfoArr;
    }
}
