package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anetwork.channel.Response;
import anetwork.channel.statist.StatisticData;
import java.util.List;
import java.util.Map;

public class NetworkResponse implements Parcelable, Response {
    public static final Parcelable.Creator<NetworkResponse> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    int f1467a;

    /* renamed from: b  reason: collision with root package name */
    byte[] f1468b;

    /* renamed from: c  reason: collision with root package name */
    private String f1469c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, List<String>> f1470d;

    /* renamed from: e  reason: collision with root package name */
    private Throwable f1471e;

    /* renamed from: f  reason: collision with root package name */
    private StatisticData f1472f;

    public int describeContents() {
        return 0;
    }

    public NetworkResponse() {
    }

    public byte[] getBytedata() {
        return this.f1468b;
    }

    public Map<String, List<String>> getConnHeadFields() {
        return this.f1470d;
    }

    public String getDesc() {
        return this.f1469c;
    }

    public Throwable getError() {
        return this.f1471e;
    }

    public StatisticData getStatisticData() {
        return this.f1472f;
    }

    public int getStatusCode() {
        return this.f1467a;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("NetworkResponse [");
        sb.append("statusCode=");
        sb.append(this.f1467a);
        sb.append(", desc=");
        sb.append(this.f1469c);
        sb.append(", connHeadFields=");
        sb.append(this.f1470d);
        sb.append(", bytedata=");
        if (this.f1468b != null) {
            str = new String(this.f1468b);
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(", error=");
        sb.append(this.f1471e);
        sb.append(", statisticData=");
        sb.append(this.f1472f);
        sb.append("]");
        return sb.toString();
    }

    public void setBytedata(byte[] bArr) {
        this.f1468b = bArr;
    }

    public void setConnHeadFields(Map<String, List<String>> map) {
        this.f1470d = map;
    }

    public void setDesc(String str) {
        this.f1469c = str;
    }

    public void setError(Throwable th) {
        this.f1471e = th;
    }

    public void setStatisticData(StatisticData statisticData) {
        this.f1472f = statisticData;
    }

    public NetworkResponse(int i) {
        this.f1467a = i;
        this.f1469c = ErrorConstant.getErrMsg(i);
    }

    public void setStatusCode(int i) {
        this.f1467a = i;
        this.f1469c = ErrorConstant.getErrMsg(i);
    }

    public static NetworkResponse readFromParcel(Parcel parcel) {
        NetworkResponse networkResponse = new NetworkResponse();
        try {
            networkResponse.f1467a = parcel.readInt();
            networkResponse.f1469c = parcel.readString();
            int readInt = parcel.readInt();
            if (readInt > 0) {
                networkResponse.f1468b = new byte[readInt];
                parcel.readByteArray(networkResponse.f1468b);
            }
            networkResponse.f1470d = parcel.readHashMap(NetworkResponse.class.getClassLoader());
            try {
                networkResponse.f1472f = (StatisticData) parcel.readSerializable();
            } catch (Throwable unused) {
                ALog.i("anet.NetworkResponse", "[readFromParcel] source.readSerializable() error", null, new Object[0]);
            }
        } catch (Exception e2) {
            ALog.w("anet.NetworkResponse", "[readFromParcel]", null, e2, new Object[0]);
        }
        return networkResponse;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.f1467a);
        parcel.writeString(this.f1469c);
        if (this.f1468b != null) {
            i2 = this.f1468b.length;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (i2 > 0) {
            parcel.writeByteArray(this.f1468b);
        }
        parcel.writeMap(this.f1470d);
        if (this.f1472f != null) {
            parcel.writeSerializable(this.f1472f);
        }
    }
}
