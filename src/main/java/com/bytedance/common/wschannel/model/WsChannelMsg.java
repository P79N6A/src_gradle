package com.bytedance.common.wschannel.model;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WsChannelMsg implements Parcelable {
    public static final Parcelable.Creator<WsChannelMsg> CREATOR = new Parcelable.Creator<WsChannelMsg>() {
        public final WsChannelMsg[] newArray(int i) {
            return new WsChannelMsg[i];
        }

        public final WsChannelMsg createFromParcel(Parcel parcel) {
            WsChannelMsg wsChannelMsg = new WsChannelMsg();
            wsChannelMsg.logId = parcel.readLong();
            wsChannelMsg.service = parcel.readInt();
            wsChannelMsg.method = parcel.readInt();
            wsChannelMsg.msgHeaders = parcel.createTypedArrayList(MsgHeader.CREATOR);
            wsChannelMsg.payloadEncoding = parcel.readString();
            wsChannelMsg.payloadType = parcel.readString();
            wsChannelMsg.payload = parcel.createByteArray();
            wsChannelMsg.replayToComponentName = (ComponentName) parcel.readParcelable(getClass().getClassLoader());
            wsChannelMsg.channelId = parcel.readInt();
            return wsChannelMsg;
        }
    };
    public static WsChannelMsg EMPTY = new WsChannelMsg();
    int channelId;
    long logId;
    int method;
    List<MsgHeader> msgHeaders;
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

        public final WsChannelMsg build() {
            if (this.mChannelId <= 0) {
                throw new IllegalArgumentException("illegal channelId");
            } else if (this.service <= 0) {
                throw new IllegalArgumentException("illegal service");
            } else if (this.method <= 0) {
                throw new IllegalArgumentException("illegal method");
            } else if (this.payload != null) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry next : this.headers.entrySet()) {
                    MsgHeader msgHeader = new MsgHeader();
                    msgHeader.setKey((String) next.getKey());
                    msgHeader.setValue((String) next.getValue());
                    arrayList.add(msgHeader);
                }
                WsChannelMsg wsChannelMsg = new WsChannelMsg(this.mChannelId, this.seqId, this.logId, this.service, this.method, arrayList, this.payloadEncoding, this.payloadType, this.payload, this.replyComponentName);
                return wsChannelMsg;
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

    public static class MsgHeader implements Parcelable {
        public static final Parcelable.Creator<MsgHeader> CREATOR = new Parcelable.Creator<MsgHeader>() {
            public final MsgHeader[] newArray(int i) {
                return new MsgHeader[i];
            }

            public final MsgHeader createFromParcel(Parcel parcel) {
                MsgHeader msgHeader = new MsgHeader();
                msgHeader.key = parcel.readString();
                msgHeader.value = parcel.readString();
                return msgHeader;
            }
        };
        String key;
        String value;

        public int describeContents() {
            return 0;
        }

        public String getKey() {
            return this.key;
        }

        public String getValue() {
            return this.value;
        }

        public String toString() {
            return "MsgHeader{key='" + this.key + '\'' + ", value='" + this.value + '\'' + '}';
        }

        public void setKey(String str) {
            this.key = str;
        }

        public void setValue(String str) {
            this.value = str;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.key);
            parcel.writeString(this.value);
        }
    }

    public int describeContents() {
        return 0;
    }

    @Deprecated
    public WsChannelMsg() {
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

    public List<MsgHeader> getMsgHeaders() {
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
        return "WsChannelMsg{, channelId = " + this.channelId + ", logId=" + this.logId + ", service=" + this.service + ", method=" + this.method + ", msgHeaders=" + this.msgHeaders + ", payloadEncoding='" + this.payloadEncoding + '\'' + ", payloadType='" + this.payloadType + '\'' + ", payload=" + Arrays.toString(this.payload) + ", replayToComponentName=" + this.replayToComponentName + '}';
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

    public void setMsgHeaders(List<MsgHeader> list) {
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

    public WsChannelMsg(int i, long j, long j2, int i2, int i3, List<MsgHeader> list, String str, String str2, byte[] bArr, ComponentName componentName) {
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
