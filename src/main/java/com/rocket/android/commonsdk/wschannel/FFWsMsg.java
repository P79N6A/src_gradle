package com.rocket.android.commonsdk.wschannel;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Keep
public class FFWsMsg implements Parcelable {
    public static final Parcelable.Creator<FFWsMsg> CREATOR = new Parcelable.Creator<FFWsMsg>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FFWsMsg[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            FFWsMsg fFWsMsg = new FFWsMsg();
            fFWsMsg.logId = parcel.readLong();
            fFWsMsg.service = parcel.readInt();
            fFWsMsg.method = parcel.readInt();
            fFWsMsg.msgHeaders = parcel.createTypedArrayList(a.CREATOR);
            fFWsMsg.payloadEncoding = parcel.readString();
            fFWsMsg.payloadType = parcel.readString();
            fFWsMsg.payload = parcel.createByteArray();
            fFWsMsg.replayToComponentName = (ComponentName) parcel.readParcelable(getClass().getClassLoader());
            fFWsMsg.channelId = parcel.readInt();
            return fFWsMsg;
        }
    };
    public static FFWsMsg EMPTY = new FFWsMsg();
    int channelId;
    long logId;
    int method;
    List<a> msgHeaders;
    byte[] payload;
    String payloadEncoding;
    String payloadType;
    ComponentName replayToComponentName;
    long seqId;
    int service;

    public static final class Builder {
        private Map<String, String> headers = new HashMap();
        private long logId;
        private final int mChannelId;
        private int method;
        private byte[] payload;
        private String payloadEncoding = "";
        private String payloadType = "";
        private ComponentName replyComponentName;
        private long seqId;
        private int service;

        public final FFWsMsg build() {
            if (this.mChannelId <= 0) {
                throw new IllegalArgumentException("illegal channelId");
            } else if (this.service <= 0) {
                throw new IllegalArgumentException("illegal service");
            } else if (this.method <= 0) {
                throw new IllegalArgumentException("illegal method");
            } else if (this.payload != null) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry next : this.headers.entrySet()) {
                    a aVar = new a();
                    aVar.f27368a = (String) next.getKey();
                    aVar.f27369b = (String) next.getValue();
                    arrayList.add(aVar);
                }
                FFWsMsg fFWsMsg = new FFWsMsg(this.mChannelId, this.seqId, this.logId, this.service, this.method, arrayList, this.payloadEncoding, this.payloadType, this.payload, this.replyComponentName);
                return fFWsMsg;
            } else {
                throw new IllegalArgumentException("illegal payload");
            }
        }

        public final Builder setLogId(long j) {
            this.logId = j;
            return this;
        }

        public final Builder setMethod(int i) {
            this.method = i;
            return this;
        }

        public final Builder setPayload(byte[] bArr) {
            this.payload = bArr;
            return this;
        }

        public final Builder setPayloadEncoding(String str) {
            this.payloadEncoding = str;
            return this;
        }

        public final Builder setPayloadType(String str) {
            this.payloadType = str;
            return this;
        }

        public final Builder setReplyComponentName(ComponentName componentName) {
            this.replyComponentName = componentName;
            return this;
        }

        public final Builder setSeqId(long j) {
            this.seqId = j;
            return this;
        }

        public final Builder setService(int i) {
            this.service = i;
            return this;
        }

        public static Builder create(int i) {
            return new Builder(i);
        }

        public Builder(int i) {
            this.mChannelId = i;
        }

        public final Builder addMsgHeader(String str, String str2) {
            this.headers.put(str, str2);
            return this;
        }
    }

    public static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                a aVar = new a();
                aVar.f27368a = parcel.readString();
                aVar.f27369b = parcel.readString();
                return aVar;
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public String f27368a;

        /* renamed from: b  reason: collision with root package name */
        public String f27369b;

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "MsgHeader{key='" + this.f27368a + '\'' + ", value='" + this.f27369b + '\'' + '}';
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f27368a);
            parcel.writeString(this.f27369b);
        }
    }

    public int describeContents() {
        return 0;
    }

    @Deprecated
    public FFWsMsg() {
    }

    public int getChannelId() {
        return this.channelId;
    }

    public long getLogId() {
        return this.logId;
    }

    public int getMethod() {
        return this.method;
    }

    public List<a> getMsgHeaders() {
        return this.msgHeaders;
    }

    public String getPayloadEncoding() {
        return this.payloadEncoding;
    }

    public String getPayloadType() {
        return this.payloadType;
    }

    public ComponentName getReplayToComponentName() {
        return this.replayToComponentName;
    }

    public long getSeqId() {
        return this.seqId;
    }

    public int getService() {
        return this.service;
    }

    public byte[] getPayload() {
        if (this.payload == null) {
            this.payload = new byte[1];
        }
        return this.payload;
    }

    public String toString() {
        return "FFWsMsg{, channelId = " + this.channelId + ", logId=" + this.logId + ", service=" + this.service + ", method=" + this.method + ", msgHeaders=" + this.msgHeaders + ", payloadEncoding='" + this.payloadEncoding + '\'' + ", payloadType='" + this.payloadType + '\'' + ", payload=" + Arrays.toString(this.payload) + ", replayToComponentName=" + this.replayToComponentName + '}';
    }

    public void setChannelId(int i) {
        this.channelId = i;
    }

    public void setLogId(long j) {
        this.logId = j;
    }

    public void setMethod(int i) {
        this.method = i;
    }

    public void setMsgHeaders(List<a> list) {
        this.msgHeaders = list;
    }

    public void setPayload(byte[] bArr) {
        this.payload = bArr;
    }

    public void setPayloadEncoding(String str) {
        this.payloadEncoding = str;
    }

    public void setPayloadType(String str) {
        this.payloadType = str;
    }

    public void setReplayToComponentName(ComponentName componentName) {
        this.replayToComponentName = componentName;
    }

    public void setSeqId(long j) {
        this.seqId = j;
    }

    public void setService(int i) {
        this.service = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.logId);
        parcel.writeInt(this.service);
        parcel.writeInt(this.method);
        parcel.writeTypedList(this.msgHeaders);
        parcel.writeString(this.payloadEncoding);
        parcel.writeString(this.payloadType);
        parcel.writeByteArray(this.payload);
        parcel.writeParcelable(this.replayToComponentName, i);
        parcel.writeInt(this.channelId);
    }

    public FFWsMsg(int i, long j, long j2, int i2, int i3, List<a> list, String str, String str2, byte[] bArr, ComponentName componentName) {
        this.channelId = i;
        this.seqId = j;
        this.logId = j2;
        this.service = i2;
        this.method = i3;
        this.msgHeaders = list;
        this.payloadEncoding = str;
        this.payloadType = str2;
        this.payload = bArr;
        this.replayToComponentName = componentName;
    }
}
