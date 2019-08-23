package anet.channel.request;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.io.OutputStream;

public class ByteArrayEntry implements BodyEntry {
    public static final Parcelable.Creator<ByteArrayEntry> CREATOR = new a();
    public byte[] bytes;
    private String contentType;
    public int count;
    public int offset;

    public int describeContents() {
        return 0;
    }

    private ByteArrayEntry() {
    }

    public String getContentType() {
        return this.contentType;
    }

    public void setContentType(String str) {
        this.contentType = str;
    }

    /* synthetic */ ByteArrayEntry(a aVar) {
        this();
    }

    public ByteArrayEntry(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public int writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.bytes, this.offset, this.count);
        return this.count;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.bytes.length);
        parcel.writeByteArray(this.bytes);
        parcel.writeInt(this.offset);
        parcel.writeInt(this.count);
    }

    public ByteArrayEntry(byte[] bArr, int i, int i2) {
        this.bytes = bArr;
        this.offset = i;
        this.count = i2;
    }
}
