package com.ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

@Keep
public class VEWatermarkParam implements Parcelable {
    public static final Parcelable.Creator<VEWatermarkParam> CREATOR = new Parcelable.Creator<VEWatermarkParam>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VEWatermarkParam[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VEWatermarkParam(parcel);
        }
    };
    public long duration = -1;
    public String extFile;
    public int height;
    public String[] images;
    public int interval;
    public VEWatermarkMask mask;
    public boolean needExtFile;
    public an position = an.TL_BR;
    public String[] secondHalfImages;
    public int width;
    public int xOffset;
    public int yOffset;

    @Keep
    public static class VEWatermarkMask implements Parcelable {
        public static final Parcelable.Creator<VEWatermarkMask> CREATOR = new Parcelable.Creator<VEWatermarkMask>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new VEWatermarkMask[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new VEWatermarkMask(parcel);
            }
        };
        public int height;
        public String maskImage;
        public int width;
        public int xOffset;
        public int yOffset;

        public int describeContents() {
            return 0;
        }

        public VEWatermarkMask() {
        }

        protected VEWatermarkMask(Parcel parcel) {
            this.maskImage = parcel.readString();
            this.xOffset = parcel.readInt();
            this.yOffset = parcel.readInt();
            this.width = parcel.readInt();
            this.height = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.maskImage);
            parcel.writeInt(this.xOffset);
            parcel.writeInt(this.yOffset);
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
        }
    }

    public int describeContents() {
        return 0;
    }

    public VEWatermarkParam() {
    }

    protected VEWatermarkParam(Parcel parcel) {
        boolean z;
        an anVar;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.needExtFile = z;
        this.extFile = parcel.readString();
        this.images = parcel.createStringArray();
        this.secondHalfImages = parcel.createStringArray();
        this.interval = parcel.readInt();
        this.xOffset = parcel.readInt();
        this.yOffset = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.duration = parcel.readLong();
        int readInt = parcel.readInt();
        if (readInt == -1) {
            anVar = null;
        } else {
            anVar = an.values()[readInt];
        }
        this.position = anVar;
        this.mask = (VEWatermarkMask) parcel.readParcelable(VEWatermarkMask.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeByte(this.needExtFile ? (byte) 1 : 0);
        parcel.writeString(this.extFile);
        parcel.writeStringArray(this.images);
        parcel.writeStringArray(this.secondHalfImages);
        parcel.writeInt(this.interval);
        parcel.writeInt(this.xOffset);
        parcel.writeInt(this.yOffset);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.duration);
        if (this.position == null) {
            i2 = -1;
        } else {
            i2 = this.position.ordinal();
        }
        parcel.writeInt(i2);
        parcel.writeParcelable(this.mask, i);
    }
}
