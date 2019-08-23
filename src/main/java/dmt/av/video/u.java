package dmt.av.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.x.a;
import com.ss.android.vesdk.VECherEffectParam;
import com.ss.android.vesdk.q;
import java.io.Serializable;
import java.util.Arrays;

public class u implements Parcelable, Serializable {
    public static final Parcelable.Creator<u> CREATOR = new Parcelable.Creator<u>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f83070a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new u[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f83070a, false, 92023, new Class[]{Parcel.class}, u.class)) {
                return new u(parcel2);
            }
            return (u) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f83070a, false, 92023, new Class[]{Parcel.class}, u.class);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public int canvasHeight;
    public int canvasWidth;
    public long editorHandler;
    public q editorModel;
    public String[] mAudioPaths;
    public int mFps;
    public boolean mIsFromDraft;
    public int mMusicInPoint;
    public int mMusicOutPoint;
    public String mMusicPath;
    public float mMusicVolume;
    public int mPageType;
    public int[] mVTrimIn;
    public int[] mVTrimOut;
    public String[] mVideoPaths;
    public float mVolume;
    public String mWorkspace;
    public a mvCreateVideoData;
    public int[] rotateArray;
    public int sceneIn;
    public int sceneOut;
    public float[] speedArray;
    public AudioEffectParam veAudioEffectParam;
    public VECherEffectParam veCherEffectParam;
    public int videoEditorType;

    public int describeContents() {
        return 0;
    }

    public u() {
        this.mFps = -1;
        this.mVolume = 1.0f;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 92021, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 92021, new Class[0], String.class);
        }
        return "VEPreviewParams{mVideoPaths=" + Arrays.toString(this.mVideoPaths) + ", mAudioPaths=" + Arrays.toString(this.mAudioPaths) + ", mWorkspace='" + this.mWorkspace + '\'' + ", mVolume=" + this.mVolume + ", mFps=" + this.mFps + ", mVTrimIn=" + this.mVTrimIn + ", mVTrimOut=" + this.mVTrimOut + ", sceneIn=" + this.sceneIn + ", sceneOut=" + this.sceneOut + ", canvasWidth=" + this.canvasWidth + ", canvasHeight=" + this.canvasHeight + '}';
    }

    public u(Parcel parcel) {
        boolean z;
        this.mFps = -1;
        this.mVideoPaths = parcel.createStringArray();
        this.mAudioPaths = parcel.createStringArray();
        this.mWorkspace = parcel.readString();
        this.mVolume = parcel.readFloat();
        this.mMusicVolume = parcel.readFloat();
        this.mFps = parcel.readInt();
        this.mVTrimIn = parcel.createIntArray();
        this.mVTrimOut = parcel.createIntArray();
        this.sceneIn = parcel.readInt();
        this.sceneOut = parcel.readInt();
        this.videoEditorType = parcel.readInt();
        this.mvCreateVideoData = (a) parcel.readSerializable();
        this.speedArray = parcel.createFloatArray();
        this.rotateArray = parcel.createIntArray();
        this.veCherEffectParam = (VECherEffectParam) parcel.readParcelable(VECherEffectParam.class.getClassLoader());
        this.canvasWidth = parcel.readInt();
        this.canvasHeight = parcel.readInt();
        this.mMusicPath = parcel.readString();
        this.mMusicInPoint = parcel.readInt();
        this.mMusicOutPoint = parcel.readInt();
        this.mPageType = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mIsFromDraft = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 92022, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 92022, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeStringArray(this.mVideoPaths);
        parcel.writeStringArray(this.mAudioPaths);
        parcel.writeString(this.mWorkspace);
        parcel.writeFloat(this.mVolume);
        parcel.writeFloat(this.mMusicVolume);
        parcel.writeInt(this.mFps);
        parcel.writeIntArray(this.mVTrimIn);
        parcel.writeIntArray(this.mVTrimOut);
        parcel.writeInt(this.sceneIn);
        parcel.writeInt(this.sceneOut);
        parcel.writeInt(this.videoEditorType);
        parcel.writeSerializable(this.mvCreateVideoData);
        parcel.writeFloatArray(this.speedArray);
        parcel.writeIntArray(this.rotateArray);
        parcel.writeParcelable(this.veCherEffectParam, i);
        parcel.writeInt(this.canvasWidth);
        parcel.writeInt(this.canvasHeight);
        parcel.writeString(this.mMusicPath);
        parcel.writeInt(this.mMusicInPoint);
        parcel.writeInt(this.mMusicOutPoint);
        parcel.writeInt(this.mPageType);
        parcel.writeByte(this.mIsFromDraft ? (byte) 1 : 0);
    }
}
