package android.support.v4.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.util.SparseIntArray;
import androidx.versionedparcelable.c;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AudioAttributesCompat implements c {
    private static final int[] SDK_USAGES = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    private static final SparseIntArray SUPPRESSIBLE_USAGES;
    static boolean sForceLegacyBehavior;
    AudioAttributesImpl mImpl;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface AttributeContentType {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface AttributeUsage {
    }

    static abstract class AudioManagerHidden {
        private AudioManagerHidden() {
        }
    }

    public static class Builder {
        private int mContentType;
        private int mFlags;
        private int mLegacyStream = -1;
        private int mUsage;

        public Builder() {
        }

        public AudioAttributesCompat build() {
            AudioAttributesImpl audioAttributesImpl;
            if (AudioAttributesCompat.sForceLegacyBehavior || Build.VERSION.SDK_INT < 21) {
                audioAttributesImpl = new AudioAttributesImplBase(this.mContentType, this.mFlags, this.mUsage, this.mLegacyStream);
            } else {
                AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.mContentType).setFlags(this.mFlags).setUsage(this.mUsage);
                if (this.mLegacyStream != -1) {
                    usage.setLegacyStreamType(this.mLegacyStream);
                }
                audioAttributesImpl = new AudioAttributesImplApi21(usage.build(), this.mLegacyStream);
            }
            return new AudioAttributesCompat(audioAttributesImpl);
        }

        public Builder setFlags(int i) {
            this.mFlags = (i & 1023) | this.mFlags;
            return this;
        }

        public Builder(AudioAttributesCompat audioAttributesCompat) {
            this.mUsage = audioAttributesCompat.getUsage();
            this.mContentType = audioAttributesCompat.getContentType();
            this.mFlags = audioAttributesCompat.getFlags();
            this.mLegacyStream = audioAttributesCompat.getRawLegacyStreamType();
        }

        public Builder setContentType(int i) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    this.mContentType = i;
                    break;
                default:
                    this.mUsage = 0;
                    break;
            }
            return this;
        }

        public Builder setLegacyStreamType(int i) {
            if (i != 10) {
                this.mLegacyStream = i;
                if (Build.VERSION.SDK_INT >= 21) {
                    return setInternalLegacyStreamType(i);
                }
                return this;
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }

        /* access modifiers changed from: package-private */
        public Builder setInternalLegacyStreamType(int i) {
            switch (i) {
                case 0:
                    this.mContentType = 1;
                    break;
                case 1:
                    break;
                case 2:
                    this.mContentType = 4;
                    break;
                case 3:
                    this.mContentType = 2;
                    break;
                case 4:
                    this.mContentType = 4;
                    break;
                case 5:
                    this.mContentType = 4;
                    break;
                case 6:
                    this.mContentType = 1;
                    this.mFlags |= 4;
                    break;
                case e.l /*7*/:
                    this.mFlags = 1 | this.mFlags;
                    break;
                case 8:
                    this.mContentType = 4;
                    break;
                case 9:
                    this.mContentType = 4;
                    break;
                case 10:
                    this.mContentType = 1;
                    break;
            }
            this.mContentType = 4;
            this.mUsage = AudioAttributesCompat.usageForStreamType(i);
            return this;
        }

        public Builder setUsage(int i) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case e.l /*7*/:
                case 8:
                case 9:
                case 10:
                case 11:
                case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                case 13:
                case 14:
                case 15:
                    this.mUsage = i;
                    break;
                case SearchJediMixFeedAdapter.f42514c /*?: ONE_ARG  (16 int)*/:
                    if (!AudioAttributesCompat.sForceLegacyBehavior && Build.VERSION.SDK_INT > 25) {
                        this.mUsage = i;
                        break;
                    } else {
                        this.mUsage = 12;
                        break;
                    }
                default:
                    this.mUsage = 0;
                    break;
            }
            return this;
        }
    }

    static int usageForStreamType(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
            case e.l /*7*/:
                return 13;
            case 2:
                return 6;
            case 3:
                return 1;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 2;
            case 8:
                return 3;
            case 10:
                return 11;
            default:
                return 0;
        }
    }

    AudioAttributesCompat() {
    }

    public int getContentType() {
        return this.mImpl.getContentType();
    }

    public int getFlags() {
        return this.mImpl.getFlags();
    }

    public int getLegacyStreamType() {
        return this.mImpl.getLegacyStreamType();
    }

    /* access modifiers changed from: package-private */
    public int getRawLegacyStreamType() {
        return this.mImpl.getRawLegacyStreamType();
    }

    public int getUsage() {
        return this.mImpl.getUsage();
    }

    public int getVolumeControlStream() {
        return this.mImpl.getVolumeControlStream();
    }

    public int hashCode() {
        return this.mImpl.hashCode();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NonNull
    public Bundle toBundle() {
        return this.mImpl.toBundle();
    }

    public String toString() {
        return this.mImpl.toString();
    }

    @Nullable
    public Object unwrap() {
        return this.mImpl.getAudioAttributes();
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        SUPPRESSIBLE_USAGES = sparseIntArray;
        sparseIntArray.put(5, 1);
        SUPPRESSIBLE_USAGES.put(6, 2);
        SUPPRESSIBLE_USAGES.put(7, 2);
        SUPPRESSIBLE_USAGES.put(8, 1);
        SUPPRESSIBLE_USAGES.put(9, 1);
        SUPPRESSIBLE_USAGES.put(10, 1);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void setForceLegacyBehavior(boolean z) {
        sForceLegacyBehavior = z;
    }

    AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.mImpl = audioAttributesImpl;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static AudioAttributesCompat fromBundle(Bundle bundle) {
        AudioAttributesImpl audioAttributesImpl;
        if (Build.VERSION.SDK_INT >= 21) {
            audioAttributesImpl = AudioAttributesImplApi21.fromBundle(bundle);
        } else {
            audioAttributesImpl = AudioAttributesImplBase.fromBundle(bundle);
        }
        if (audioAttributesImpl == null) {
            return null;
        }
        return new AudioAttributesCompat(audioAttributesImpl);
    }

    @Nullable
    public static AudioAttributesCompat wrap(@NonNull Object obj) {
        if (Build.VERSION.SDK_INT < 21 || sForceLegacyBehavior) {
            return null;
        }
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21((AudioAttributes) obj);
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.mImpl = audioAttributesImplApi21;
        return audioAttributesCompat;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        if (this.mImpl != null) {
            return this.mImpl.equals(audioAttributesCompat.mImpl);
        }
        if (audioAttributesCompat.mImpl == null) {
            return true;
        }
        return false;
    }

    static String usageToString(int i) {
        switch (i) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case e.l /*7*/:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case SearchJediMixFeedAdapter.f42514c /*?: ONE_ARG  (16 int)*/:
                return "USAGE_ASSISTANT";
            default:
                return "unknown usage " + i;
        }
    }

    static int toVolumeStreamType(boolean z, AudioAttributesCompat audioAttributesCompat) {
        return toVolumeStreamType(z, audioAttributesCompat.getFlags(), audioAttributesCompat.getUsage());
    }

    static int toVolumeStreamType(boolean z, int i, int i2) {
        if ((i & 1) == 1) {
            if (z) {
                return 1;
            }
            return 7;
        } else if ((i & 4) != 4) {
            switch (i2) {
                case 0:
                    if (z) {
                        return Integer.MIN_VALUE;
                    }
                    return 3;
                case 1:
                case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                case 14:
                case SearchJediMixFeedAdapter.f42514c /*?: ONE_ARG  (16 int)*/:
                    return 3;
                case 2:
                    return 0;
                case 3:
                    if (z) {
                        return 0;
                    }
                    return 8;
                case 4:
                    return 4;
                case 5:
                case e.l /*7*/:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 11:
                    return 10;
                case 13:
                    return 1;
                default:
                    if (!z) {
                        return 3;
                    }
                    throw new IllegalArgumentException("Unknown usage value " + i2 + " in audio attributes");
            }
        } else if (z) {
            return 0;
        } else {
            return 6;
        }
    }
}
