package anetwork.channel.aidl.adapter;

import android.os.Handler;
import android.os.RemoteException;
import anet.channel.util.ALog;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkListener;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.aidl.DefaultProgressEvent;
import anetwork.channel.aidl.ParcelableHeader;
import anetwork.channel.aidl.ParcelableInputStream;
import anetwork.channel.aidl.ParcelableNetworkListener;

public class ParcelableNetworkListenerWrapper extends ParcelableNetworkListener.Stub {
    private Handler handler;
    private NetworkListener listener;
    private Object mContext;
    private byte state;

    public NetworkListener getListener() {
        return this.listener;
    }

    public byte getListenerState() throws RemoteException {
        return this.state;
    }

    public void onDataReceived(DefaultProgressEvent defaultProgressEvent) throws RemoteException {
        if ((this.state & 2) != 0) {
            dispatch((byte) 2, defaultProgressEvent);
        }
    }

    public void onInputStreamGet(ParcelableInputStream parcelableInputStream) throws RemoteException {
        if ((this.state & 8) != 0) {
            dispatch((byte) 8, parcelableInputStream);
        }
    }

    public void onFinished(DefaultFinishEvent defaultFinishEvent) throws RemoteException {
        if ((this.state & 1) != 0) {
            dispatch((byte) 1, defaultFinishEvent);
        }
        this.listener = null;
        this.mContext = null;
        this.handler = null;
    }

    public boolean onResponseCode(int i, ParcelableHeader parcelableHeader) throws RemoteException {
        if ((this.state & 4) != 0) {
            dispatch((byte) 4, parcelableHeader);
        }
        return false;
    }

    private void dispatch(byte b2, Object obj) {
        if (this.handler == null) {
            dispatchCallback(b2, obj);
        } else {
            this.handler.post(new c(this, b2, obj));
        }
    }

    public void dispatchCallback(byte b2, Object obj) {
        if (b2 == 4) {
            try {
                ParcelableHeader parcelableHeader = (ParcelableHeader) obj;
                ((NetworkCallBack.ResponseCodeListener) this.listener).onResponseCode(parcelableHeader.getResponseCode(), parcelableHeader.getHeader(), this.mContext);
                if (ALog.isPrintLog(1)) {
                    ALog.d("anet.ParcelableNetworkListenerWrapper", "[onResponseCode]" + parcelableHeader, null, new Object[0]);
                }
            } catch (Exception unused) {
                ALog.e("anet.ParcelableNetworkListenerWrapper", "dispatchCallback error", null, new Object[0]);
            }
        } else if (b2 == 2) {
            DefaultProgressEvent defaultProgressEvent = (DefaultProgressEvent) obj;
            if (defaultProgressEvent != null) {
                defaultProgressEvent.setContext(this.mContext);
            }
            ((NetworkCallBack.ProgressListener) this.listener).onDataReceived(defaultProgressEvent, this.mContext);
            if (ALog.isPrintLog(1)) {
                ALog.d("anet.ParcelableNetworkListenerWrapper", "[onDataReceived]" + defaultProgressEvent, null, new Object[0]);
            }
        } else if (b2 == 1) {
            DefaultFinishEvent defaultFinishEvent = (DefaultFinishEvent) obj;
            if (defaultFinishEvent != null) {
                defaultFinishEvent.setContext(this.mContext);
            }
            ((NetworkCallBack.FinishListener) this.listener).onFinished(defaultFinishEvent, this.mContext);
            if (ALog.isPrintLog(1)) {
                ALog.d("anet.ParcelableNetworkListenerWrapper", "[onFinished]" + defaultFinishEvent, null, new Object[0]);
            }
        } else {
            if (b2 == 8) {
                ((NetworkCallBack.InputStreamListener) this.listener).onInputStreamGet((ParcelableInputStream) obj, this.mContext);
                if (ALog.isPrintLog(1)) {
                    ALog.d("anet.ParcelableNetworkListenerWrapper", "[onInputStreamReceived]", null, new Object[0]);
                }
            }
        }
    }

    public ParcelableNetworkListenerWrapper(NetworkListener networkListener, Handler handler2, Object obj) {
        this.listener = networkListener;
        if (networkListener != null) {
            if (NetworkCallBack.FinishListener.class.isAssignableFrom(networkListener.getClass())) {
                this.state = (byte) (this.state | 1);
            }
            if (NetworkCallBack.ProgressListener.class.isAssignableFrom(networkListener.getClass())) {
                this.state = (byte) (this.state | 2);
            }
            if (NetworkCallBack.ResponseCodeListener.class.isAssignableFrom(networkListener.getClass())) {
                this.state = (byte) (this.state | 4);
            }
            if (NetworkCallBack.InputStreamListener.class.isAssignableFrom(networkListener.getClass())) {
                this.state = (byte) (this.state | 8);
            }
        }
        this.handler = handler2;
        this.mContext = obj;
    }
}
