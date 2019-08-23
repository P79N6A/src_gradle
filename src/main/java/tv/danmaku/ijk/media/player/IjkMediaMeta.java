package tv.danmaku.ijk.media.player;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class IjkMediaMeta {
    public IjkStreamMeta mAudioStream;
    public long mBitrate;
    public long mDurationUS;
    public String mFormat;
    public Bundle mMediaMeta;
    public long mStartUS;
    public final ArrayList<IjkStreamMeta> mStreams = new ArrayList<>();
    public IjkStreamMeta mVideoStream;

    public static class IjkStreamMeta {
        public long mBitrate;
        public long mChannelLayout;
        public String mCodecLongName;
        public String mCodecName;
        public String mCodecProfile;
        public int mFpsDen;
        public int mFpsNum;
        public int mHeight;
        public final int mIndex;
        public String mLanguage;
        public Bundle mMeta;
        public int mSampleRate;
        public int mSarDen;
        public int mSarNum;
        public int mTbrDen;
        public int mTbrNum;
        public String mType;
        public int mWidth;

        public String getCodecShortNameInline() {
            if (!TextUtils.isEmpty(this.mCodecName)) {
                return this.mCodecName;
            }
            return "N/A";
        }

        public String getCodecLongNameInline() {
            if (!TextUtils.isEmpty(this.mCodecLongName)) {
                return this.mCodecLongName;
            }
            if (!TextUtils.isEmpty(this.mCodecName)) {
                return this.mCodecName;
            }
            return "N/A";
        }

        public String getFpsInline() {
            if (this.mFpsNum <= 0 || this.mFpsDen <= 0) {
                return "N/A";
            }
            return String.valueOf(((float) this.mFpsNum) / ((float) this.mFpsDen));
        }

        public String getSampleRateInline() {
            if (this.mSampleRate <= 0) {
                return "N/A";
            }
            return String.format(Locale.US, "%d Hz", new Object[]{Integer.valueOf(this.mSampleRate)});
        }

        public String getBitrateInline() {
            if (this.mBitrate <= 0) {
                return "N/A";
            }
            if (this.mBitrate < 1000) {
                return String.format(Locale.US, "%d bit/s", new Object[]{Long.valueOf(this.mBitrate)});
            }
            return String.format(Locale.US, "%d kb/s", new Object[]{Long.valueOf(this.mBitrate / 1000)});
        }

        public String getChannelLayoutInline() {
            if (this.mChannelLayout <= 0) {
                return "N/A";
            }
            if (this.mChannelLayout == 4) {
                return "mono";
            }
            if (this.mChannelLayout == 3) {
                return "stereo";
            }
            return String.format(Locale.US, "%x", new Object[]{Long.valueOf(this.mChannelLayout)});
        }

        public String getResolutionInline() {
            if (this.mWidth <= 0 || this.mHeight <= 0) {
                return "N/A";
            }
            if (this.mSarNum <= 0 || this.mSarDen <= 0) {
                return String.format(Locale.US, "%d x %d", new Object[]{Integer.valueOf(this.mWidth), Integer.valueOf(this.mHeight)});
            }
            return String.format(Locale.US, "%d x %d [SAR %d:%d]", new Object[]{Integer.valueOf(this.mWidth), Integer.valueOf(this.mHeight), Integer.valueOf(this.mSarNum), Integer.valueOf(this.mSarDen)});
        }

        public IjkStreamMeta(int i) {
            this.mIndex = i;
        }

        public int getInt(String str) {
            return getInt(str, 0);
        }

        public long getLong(String str) {
            return getLong(str, 0);
        }

        public String getString(String str) {
            return this.mMeta.getString(str);
        }

        public int getInt(String str, int i) {
            String string = getString(str);
            if (TextUtils.isEmpty(string)) {
                return i;
            }
            try {
                return Integer.parseInt(string);
            } catch (NumberFormatException unused) {
                return i;
            }
        }

        public long getLong(String str, long j) {
            String string = getString(str);
            if (TextUtils.isEmpty(string)) {
                return j;
            }
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException unused) {
                return j;
            }
        }
    }

    public String getDurationInline() {
        long j = (this.mDurationUS + 5000) / 1000000;
        long j2 = j / 60;
        return String.format(Locale.US, "%02d:%02d:%02d", new Object[]{Long.valueOf(j2 / 60), Long.valueOf(j2 % 60), Long.valueOf(j % 60)});
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public long getLong(String str) {
        return getLong(str, 0);
    }

    public ArrayList<Bundle> getParcelableArrayList(String str) {
        return this.mMediaMeta.getParcelableArrayList(str);
    }

    public String getString(String str) {
        return this.mMediaMeta.getString(str);
    }

    public static IjkMediaMeta parse(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        IjkMediaMeta ijkMediaMeta = new IjkMediaMeta();
        ijkMediaMeta.mMediaMeta = bundle;
        ijkMediaMeta.mFormat = ijkMediaMeta.getString("format");
        ijkMediaMeta.mDurationUS = ijkMediaMeta.getLong("duration_us");
        ijkMediaMeta.mStartUS = ijkMediaMeta.getLong("start_us");
        ijkMediaMeta.mBitrate = ijkMediaMeta.getLong("bitrate");
        int i = -1;
        int i2 = ijkMediaMeta.getInt("video", -1);
        int i3 = ijkMediaMeta.getInt("audio", -1);
        ijkMediaMeta.getInt("timedtext", -1);
        ArrayList<Bundle> parcelableArrayList = ijkMediaMeta.getParcelableArrayList("streams");
        if (parcelableArrayList == null) {
            return ijkMediaMeta;
        }
        Iterator<Bundle> it2 = parcelableArrayList.iterator();
        while (it2.hasNext()) {
            Bundle next = it2.next();
            i++;
            if (next != null) {
                IjkStreamMeta ijkStreamMeta = new IjkStreamMeta(i);
                ijkStreamMeta.mMeta = next;
                ijkStreamMeta.mType = ijkStreamMeta.getString("type");
                ijkStreamMeta.mLanguage = ijkStreamMeta.getString("language");
                if (!TextUtils.isEmpty(ijkStreamMeta.mType)) {
                    ijkStreamMeta.mCodecName = ijkStreamMeta.getString("codec_name");
                    ijkStreamMeta.mCodecProfile = ijkStreamMeta.getString("codec_profile");
                    ijkStreamMeta.mCodecLongName = ijkStreamMeta.getString("codec_long_name");
                    ijkStreamMeta.mBitrate = (long) ijkStreamMeta.getInt("bitrate");
                    if (ijkStreamMeta.mType.equalsIgnoreCase("video")) {
                        ijkStreamMeta.mWidth = ijkStreamMeta.getInt("width");
                        ijkStreamMeta.mHeight = ijkStreamMeta.getInt("height");
                        ijkStreamMeta.mFpsNum = ijkStreamMeta.getInt("fps_num");
                        ijkStreamMeta.mFpsDen = ijkStreamMeta.getInt("fps_den");
                        ijkStreamMeta.mTbrNum = ijkStreamMeta.getInt("tbr_num");
                        ijkStreamMeta.mTbrDen = ijkStreamMeta.getInt("tbr_den");
                        ijkStreamMeta.mSarNum = ijkStreamMeta.getInt("sar_num");
                        ijkStreamMeta.mSarDen = ijkStreamMeta.getInt("sar_den");
                        if (i2 == i) {
                            ijkMediaMeta.mVideoStream = ijkStreamMeta;
                        }
                    } else if (ijkStreamMeta.mType.equalsIgnoreCase("audio")) {
                        ijkStreamMeta.mSampleRate = ijkStreamMeta.getInt("sample_rate");
                        ijkStreamMeta.mChannelLayout = ijkStreamMeta.getLong("channel_layout");
                        if (i3 == i) {
                            ijkMediaMeta.mAudioStream = ijkStreamMeta;
                        }
                    }
                    ijkMediaMeta.mStreams.add(ijkStreamMeta);
                }
            }
        }
        return ijkMediaMeta;
    }

    public int getInt(String str, int i) {
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return i;
        }
        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public long getLong(String str, long j) {
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return j;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return j;
        }
    }
}
