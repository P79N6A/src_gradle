package androidx.media;

import android.support.annotation.RestrictTo;
import android.support.v4.media.AudioAttributesImplBase;
import androidx.versionedparcelable.a;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.mUsage = aVar.b(audioAttributesImplBase.mUsage, 1);
        audioAttributesImplBase.mContentType = aVar.b(audioAttributesImplBase.mContentType, 2);
        audioAttributesImplBase.mFlags = aVar.b(audioAttributesImplBase.mFlags, 3);
        audioAttributesImplBase.mLegacyStream = aVar.b(audioAttributesImplBase.mLegacyStream, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.a(audioAttributesImplBase.mUsage, 1);
        aVar.a(audioAttributesImplBase.mContentType, 2);
        aVar.a(audioAttributesImplBase.mFlags, 3);
        aVar.a(audioAttributesImplBase.mLegacyStream, 4);
    }
}
