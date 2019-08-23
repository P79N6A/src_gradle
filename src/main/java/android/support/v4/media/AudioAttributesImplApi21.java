package android.support.v4.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(21)
public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    static Method sAudioAttributesToLegacyStreamType;
    AudioAttributes mAudioAttributes;
    int mLegacyStreamType;

    public Object getAudioAttributes() {
        return this.mAudioAttributes;
    }

    public int getRawLegacyStreamType() {
        return this.mLegacyStreamType;
    }

    AudioAttributesImplApi21() {
        this.mLegacyStreamType = -1;
    }

    public int getContentType() {
        return this.mAudioAttributes.getContentType();
    }

    public int getFlags() {
        return this.mAudioAttributes.getFlags();
    }

    public int getUsage() {
        return this.mAudioAttributes.getUsage();
    }

    public int hashCode() {
        return this.mAudioAttributes.hashCode();
    }

    static Method getAudioAttributesToLegacyStreamTypeMethod() {
        try {
            if (sAudioAttributesToLegacyStreamType == null) {
                sAudioAttributesToLegacyStreamType = AudioAttributes.class.getMethod("toLegacyStreamType", new Class[]{AudioAttributes.class});
            }
            return sAudioAttributesToLegacyStreamType;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public int getVolumeControlStream() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.mAudioAttributes.getVolumeControlStream();
        }
        return AudioAttributesCompat.toVolumeStreamType(true, getFlags(), getUsage());
    }

    @NonNull
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.v4.media.audio_attrs.FRAMEWORKS", this.mAudioAttributes);
        if (this.mLegacyStreamType != -1) {
            bundle.putInt("android.support.v4.media.audio_attrs.LEGACY_STREAM_TYPE", this.mLegacyStreamType);
        }
        return bundle;
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.mAudioAttributes;
    }

    public int getLegacyStreamType() {
        if (this.mLegacyStreamType != -1) {
            return this.mLegacyStreamType;
        }
        Method audioAttributesToLegacyStreamTypeMethod = getAudioAttributesToLegacyStreamTypeMethod();
        if (audioAttributesToLegacyStreamTypeMethod == null) {
            return -1;
        }
        try {
            return ((Integer) audioAttributesToLegacyStreamTypeMethod.invoke(null, new Object[]{this.mAudioAttributes})).intValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return -1;
        }
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    public static AudioAttributesImpl fromBundle(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        AudioAttributes audioAttributes = (AudioAttributes) bundle.getParcelable("android.support.v4.media.audio_attrs.FRAMEWORKS");
        if (audioAttributes == null) {
            return null;
        }
        return new AudioAttributesImplApi21(audioAttributes, bundle.getInt("android.support.v4.media.audio_attrs.LEGACY_STREAM_TYPE", -1));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.mAudioAttributes.equals(((AudioAttributesImplApi21) obj).mAudioAttributes);
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.mLegacyStreamType = -1;
        this.mAudioAttributes = audioAttributes;
        this.mLegacyStreamType = i;
    }
}
