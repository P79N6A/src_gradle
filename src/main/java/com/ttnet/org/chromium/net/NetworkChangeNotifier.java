package com.ttnet.org.chromium.net;

import android.content.Context;
import com.ttnet.org.chromium.base.ObserverList;
import com.ttnet.org.chromium.base.VisibleForTesting;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.base.annotations.NativeClassQualifiedName;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;
import java.util.ArrayList;
import java.util.Iterator;

@JNINamespace("net")
public class NetworkChangeNotifier {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static NetworkChangeNotifier sInstance;
    private NetworkChangeNotifierAutoDetect mAutoDetector;
    private final ObserverList<ConnectionTypeObserver> mConnectionTypeObservers;
    private final Context mContext;
    private int mCurrentConnectionType;
    private double mCurrentMaxBandwidth = Double.POSITIVE_INFINITY;
    private int mMaxBandwidthConnectionType = this.mCurrentConnectionType;
    private final ArrayList<Long> mNativeChangeNotifiers;

    public interface ConnectionTypeObserver {
        void onConnectionTypeChanged(int i);
    }

    private static native double nativeGetMaxBandwidthForConnectionSubtype(int i);

    @NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
    private native void nativeNotifyConnectionTypeChanged(long j, int i, long j2);

    @NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
    private native void nativeNotifyMaxBandwidthChanged(long j, double d2);

    @NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
    private native void nativeNotifyOfNetworkConnect(long j, long j2, int i);

    @NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
    private native void nativeNotifyOfNetworkDisconnect(long j, long j2);

    @NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
    private native void nativeNotifyOfNetworkSoonToDisconnect(long j, long j2);

    @NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
    private native void nativeNotifyPurgeActiveNetworkList(long j, long[] jArr);

    public static NetworkChangeNotifier getInstance() {
        return sInstance;
    }

    @CalledByNative
    public int getCurrentConnectionType() {
        return this.mCurrentConnectionType;
    }

    @CalledByNative
    public double getCurrentMaxBandwidthInMbps() {
        return this.mCurrentMaxBandwidth;
    }

    public static NetworkChangeNotifierAutoDetect getAutoDetectorForTest() {
        return getInstance().mAutoDetector;
    }

    public static boolean isInitialized() {
        if (sInstance != null) {
            return true;
        }
        return false;
    }

    private void destroyAutoDetector() {
        if (this.mAutoDetector != null) {
            this.mAutoDetector.destroy();
            this.mAutoDetector = null;
        }
    }

    public static boolean isOnline() {
        if (getInstance().getCurrentConnectionType() != 6) {
            return true;
        }
        return false;
    }

    public static void registerToReceiveNotificationsAlways() {
        getInstance().setAutoDetectConnectivityStateInternal(true, new RegistrationPolicyAlwaysRegister());
    }

    @CalledByNative
    public long getCurrentDefaultNetId() {
        if (this.mAutoDetector == null) {
            return -1;
        }
        return this.mAutoDetector.getDefaultNetId();
    }

    @CalledByNative
    public long[] getCurrentNetworksAndTypes() {
        if (this.mAutoDetector == null) {
            return new long[0];
        }
        return this.mAutoDetector.getNetworksAndTypes();
    }

    @CalledByNative
    public int getCurrentConnectionSubtype() {
        if (this.mAutoDetector == null) {
            return 0;
        }
        return NetworkChangeNotifierAutoDetect.convertToConnectionSubtype(this.mAutoDetector.getCurrentNetworkState());
    }

    static void resetInstanceForTests(NetworkChangeNotifier networkChangeNotifier) {
        sInstance = networkChangeNotifier;
    }

    public static void addConnectionTypeObserver(ConnectionTypeObserver connectionTypeObserver) {
        getInstance().addConnectionTypeObserverInternal(connectionTypeObserver);
    }

    private void addConnectionTypeObserverInternal(ConnectionTypeObserver connectionTypeObserver) {
        this.mConnectionTypeObservers.addObserver(connectionTypeObserver);
    }

    public static double getMaxBandwidthForConnectionSubtype(int i) {
        return nativeGetMaxBandwidthForConnectionSubtype(i);
    }

    public static void removeConnectionTypeObserver(ConnectionTypeObserver connectionTypeObserver) {
        getInstance().removeConnectionTypeObserverInternal(connectionTypeObserver);
    }

    private void removeConnectionTypeObserverInternal(ConnectionTypeObserver connectionTypeObserver) {
        this.mConnectionTypeObservers.removeObserver(connectionTypeObserver);
    }

    /* access modifiers changed from: package-private */
    public void notifyObserversOfConnectionTypeChange(int i) {
        notifyObserversOfConnectionTypeChange(i, getCurrentDefaultNetId());
    }

    public void updateCurrentConnectionType(int i) {
        this.mCurrentConnectionType = i;
        notifyObserversOfConnectionTypeChange(i);
    }

    @CalledByNative
    public static void fakeMaxBandwidthChanged(double d2) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfMaxBandwidthChange(d2);
    }

    @CalledByNative
    public static void fakeNetworkDisconnected(long j) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfNetworkDisconnect(j);
    }

    @CalledByNative
    public static void fakeNetworkSoonToBeDisconnected(long j) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfNetworkSoonToDisconnect(j);
    }

    @CalledByNative
    public static void fakePurgeActiveNetworkList(long[] jArr) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversToPurgeActiveNetworkList(jArr);
    }

    @CalledByNative
    public static void forceConnectivityState(boolean z) {
        setAutoDetectConnectivityState(false);
        getInstance().forceConnectivityStateInternal(z);
    }

    @CalledByNative
    public static NetworkChangeNotifier init(Context context) {
        if (sInstance == null) {
            sInstance = new NetworkChangeNotifier(context);
        }
        return sInstance;
    }

    public static void setAutoDetectConnectivityState(NetworkChangeNotifierAutoDetect.RegistrationPolicy registrationPolicy) {
        getInstance().setAutoDetectConnectivityStateInternal(true, registrationPolicy);
    }

    @CalledByNative
    public void addNativeObserver(long j) {
        this.mNativeChangeNotifiers.add(Long.valueOf(j));
    }

    @CalledByNative
    public void removeNativeObserver(long j) {
        this.mNativeChangeNotifiers.remove(Long.valueOf(j));
    }

    @VisibleForTesting
    protected NetworkChangeNotifier(Context context) {
        this.mContext = context.getApplicationContext();
        this.mNativeChangeNotifiers = new ArrayList<>();
        this.mConnectionTypeObservers = new ObserverList<>();
    }

    private void forceConnectivityStateInternal(boolean z) {
        boolean z2;
        double d2;
        int i = 0;
        if (this.mCurrentConnectionType != 6) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != z) {
            if (!z) {
                i = 6;
            }
            updateCurrentConnectionType(i);
            if (z) {
                d2 = Double.POSITIVE_INFINITY;
            } else {
                d2 = 0.0d;
            }
            updateCurrentMaxBandwidth(d2);
        }
    }

    public static void setAutoDetectConnectivityState(boolean z) {
        getInstance().setAutoDetectConnectivityStateInternal(z, new RegistrationPolicyApplicationStatus());
    }

    /* access modifiers changed from: package-private */
    public void notifyObserversOfMaxBandwidthChange(double d2) {
        Iterator<Long> it2 = this.mNativeChangeNotifiers.iterator();
        while (it2.hasNext()) {
            nativeNotifyMaxBandwidthChanged(it2.next().longValue(), d2);
        }
    }

    /* access modifiers changed from: package-private */
    public void notifyObserversOfNetworkDisconnect(long j) {
        Iterator<Long> it2 = this.mNativeChangeNotifiers.iterator();
        while (it2.hasNext()) {
            nativeNotifyOfNetworkDisconnect(it2.next().longValue(), j);
        }
    }

    /* access modifiers changed from: package-private */
    public void notifyObserversOfNetworkSoonToDisconnect(long j) {
        Iterator<Long> it2 = this.mNativeChangeNotifiers.iterator();
        while (it2.hasNext()) {
            nativeNotifyOfNetworkSoonToDisconnect(it2.next().longValue(), j);
        }
    }

    /* access modifiers changed from: package-private */
    public void notifyObserversToPurgeActiveNetworkList(long[] jArr) {
        Iterator<Long> it2 = this.mNativeChangeNotifiers.iterator();
        while (it2.hasNext()) {
            nativeNotifyPurgeActiveNetworkList(it2.next().longValue(), jArr);
        }
    }

    public void updateCurrentMaxBandwidth(double d2) {
        if (d2 != this.mCurrentMaxBandwidth || this.mCurrentConnectionType != this.mMaxBandwidthConnectionType) {
            this.mCurrentMaxBandwidth = d2;
            this.mMaxBandwidthConnectionType = this.mCurrentConnectionType;
            notifyObserversOfMaxBandwidthChange(d2);
        }
    }

    @CalledByNative
    public static void fakeDefaultNetwork(long j, int i) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfConnectionTypeChange(i, j);
    }

    @CalledByNative
    public static void fakeNetworkConnected(long j, int i) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfNetworkConnect(j, i);
    }

    /* access modifiers changed from: package-private */
    public void notifyObserversOfNetworkConnect(long j, int i) {
        Iterator<Long> it2 = this.mNativeChangeNotifiers.iterator();
        while (it2.hasNext()) {
            nativeNotifyOfNetworkConnect(it2.next().longValue(), j, i);
        }
    }

    private void notifyObserversOfConnectionTypeChange(int i, long j) {
        Iterator<Long> it2 = this.mNativeChangeNotifiers.iterator();
        while (it2.hasNext()) {
            nativeNotifyConnectionTypeChanged(it2.next().longValue(), i, j);
        }
        Iterator it3 = this.mConnectionTypeObservers.iterator();
        while (it3.hasNext()) {
            ((ConnectionTypeObserver) it3.next()).onConnectionTypeChanged(i);
        }
    }

    private void setAutoDetectConnectivityStateInternal(boolean z, NetworkChangeNotifierAutoDetect.RegistrationPolicy registrationPolicy) {
        if (!z) {
            destroyAutoDetector();
        } else if (this.mAutoDetector == null) {
            this.mAutoDetector = new NetworkChangeNotifierAutoDetect(new NetworkChangeNotifierAutoDetect.Observer() {
                public void onConnectionTypeChanged(int i) {
                    NetworkChangeNotifier.this.updateCurrentConnectionType(i);
                }

                public void onMaxBandwidthChanged(double d2) {
                    NetworkChangeNotifier.this.updateCurrentMaxBandwidth(d2);
                }

                public void onNetworkDisconnect(long j) {
                    NetworkChangeNotifier.this.notifyObserversOfNetworkDisconnect(j);
                }

                public void onNetworkSoonToDisconnect(long j) {
                    NetworkChangeNotifier.this.notifyObserversOfNetworkSoonToDisconnect(j);
                }

                public void purgeActiveNetworkList(long[] jArr) {
                    NetworkChangeNotifier.this.notifyObserversToPurgeActiveNetworkList(jArr);
                }

                public void onNetworkConnect(long j, int i) {
                    NetworkChangeNotifier.this.notifyObserversOfNetworkConnect(j, i);
                }
            }, this.mContext, registrationPolicy);
            NetworkChangeNotifierAutoDetect.NetworkState currentNetworkState = this.mAutoDetector.getCurrentNetworkState();
            updateCurrentConnectionType(NetworkChangeNotifierAutoDetect.convertToConnectionType(currentNetworkState));
            updateCurrentMaxBandwidth(this.mAutoDetector.getCurrentMaxBandwidthInMbps(currentNetworkState));
        }
    }
}
