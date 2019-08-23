package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ErrorConstant;
import anetwork.channel.NetworkEvent;
import anetwork.channel.statist.StatisticData;

public class DefaultFinishEvent implements Parcelable, NetworkEvent.FinishEvent {
    public static final Parcelable.Creator<DefaultFinishEvent> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    Object f1457a;

    /* renamed from: b  reason: collision with root package name */
    int f1458b;

    /* renamed from: c  reason: collision with root package name */
    String f1459c;

    /* renamed from: d  reason: collision with root package name */
    StatisticData f1460d;
    public final RequestStatistic rs;

    public int describeContents() {
        return 0;
    }

    public Object getContext() {
        return this.f1457a;
    }

    public String getDesc() {
        return this.f1459c;
    }

    public int getHttpCode() {
        return this.f1458b;
    }

    public StatisticData getStatisticData() {
        return this.f1460d;
    }

    public String toString() {
        return "DefaultFinishEvent [" + "code=" + this.f1458b + ", desc=" + this.f1459c + ", context=" + this.f1457a + ", statisticData=" + this.f1460d + "]";
    }

    public void setContext(Object obj) {
        this.f1457a = obj;
    }

    public DefaultFinishEvent(int i) {
        this(i, null, null);
    }

    static DefaultFinishEvent a(Parcel parcel) {
        DefaultFinishEvent defaultFinishEvent = new DefaultFinishEvent(0);
        try {
            defaultFinishEvent.f1458b = parcel.readInt();
            defaultFinishEvent.f1459c = parcel.readString();
            defaultFinishEvent.f1460d = (StatisticData) parcel.readSerializable();
        } catch (Throwable unused) {
        }
        return defaultFinishEvent;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1458b);
        parcel.writeString(this.f1459c);
        if (this.f1460d != null) {
            parcel.writeSerializable(this.f1460d);
        }
    }

    public DefaultFinishEvent(int i, String str, RequestStatistic requestStatistic) {
        this.f1460d = new StatisticData();
        this.f1458b = i;
        this.f1459c = str == null ? ErrorConstant.getErrMsg(i) : str;
        this.rs = requestStatistic;
    }
}
