package com.mapbox.mapboxsdk.offline;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Keep;
import com.mapbox.mapboxsdk.a;
import com.mapbox.mapboxsdk.storage.FileSource;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class OfflineRegion {

    /* renamed from: a  reason: collision with root package name */
    public long f26755a;

    /* renamed from: b  reason: collision with root package name */
    public OfflineRegionDefinition f26756b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f26757c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f26758d = new Handler(Looper.getMainLooper());

    /* renamed from: e  reason: collision with root package name */
    public boolean f26759e = false;

    /* renamed from: f  reason: collision with root package name */
    private FileSource f26760f;
    private int g = 0;
    @Keep
    private long nativePtr;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DownloadState {
    }

    @Keep
    public interface OfflineRegionDeleteCallback {
        void onDelete();

        void onError(String str);
    }

    @Keep
    public interface OfflineRegionObserver {
        void mapboxTileCountLimitExceeded(long j);

        void onError(OfflineRegionError offlineRegionError);

        void onStatusChanged(OfflineRegionStatus offlineRegionStatus);
    }

    @Keep
    public interface OfflineRegionStatusCallback {
        void onError(String str);

        void onStatus(OfflineRegionStatus offlineRegionStatus);
    }

    @Keep
    public interface OfflineRegionUpdateMetadataCallback {
        void onError(String str);

        void onUpdate(byte[] bArr);
    }

    @Keep
    private native void deleteOfflineRegion(OfflineRegionDeleteCallback offlineRegionDeleteCallback);

    @Keep
    private native void getOfflineRegionStatus(OfflineRegionStatusCallback offlineRegionStatusCallback);

    @Keep
    private native void initialize(long j, FileSource fileSource);

    @Keep
    private native void setOfflineRegionDownloadState(int i);

    @Keep
    private native void setOfflineRegionObserver(OfflineRegionObserver offlineRegionObserver);

    @Keep
    private native void updateOfflineRegionMetadata(byte[] bArr, OfflineRegionUpdateMetadataCallback offlineRegionUpdateMetadataCallback);

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize();

    static {
        a.a();
    }

    @Keep
    private OfflineRegion(long j, FileSource fileSource, long j2, OfflineRegionDefinition offlineRegionDefinition, byte[] bArr) {
        this.f26760f = fileSource;
        this.f26755a = j2;
        this.f26756b = offlineRegionDefinition;
        this.f26757c = bArr;
        initialize(j, fileSource);
    }
}
