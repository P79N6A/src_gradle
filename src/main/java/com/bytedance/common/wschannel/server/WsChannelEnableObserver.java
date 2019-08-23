package com.bytedance.common.wschannel.server;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;
import com.bytedance.common.wschannel.WsChannelSettings;

public class WsChannelEnableObserver {
    private final Context mContext;
    private final Handler mHandler;
    private final OnWsChannelEnableChangedObserver mObserver;
    private boolean mPushSdkEnabled;
    private ContentObserver mPushSdkEnabledObserver = new ContentObserver(this.mHandler) {
        public void onChange(boolean z) {
            Logger.debug();
            WsChannelEnableObserver.this.handlePushSdkEnabled();
        }
    };

    interface OnWsChannelEnableChangedObserver {
        void onWsChannelEnableChange(boolean z);
    }

    /* access modifiers changed from: package-private */
    public boolean isEnable() {
        return this.mPushSdkEnabled;
    }

    private void loadPushSdkEnabled() {
        try {
            boolean isEnable = WsChannelSettings.inst(this.mContext).isEnable();
            Logger.debug();
            if (isEnable != this.mPushSdkEnabled) {
                this.mPushSdkEnabled = isEnable;
            }
        } catch (Throwable unused) {
        }
    }

    private void registerContentObservers() {
        try {
            this.mContext.getContentResolver().registerContentObserver(WsChannelMultiProcessSharedProvider.getContentUri(this.mContext, "frontier_enabled", "boolean"), true, this.mPushSdkEnabledObserver);
        } catch (Throwable unused) {
        }
    }

    public void handlePushSdkEnabled() {
        try {
            boolean z = this.mPushSdkEnabled;
            loadPushSdkEnabled();
            if (!(z == this.mPushSdkEnabled || this.mObserver == null)) {
                this.mObserver.onWsChannelEnableChange(this.mPushSdkEnabled);
            }
        } catch (Exception unused) {
        }
    }

    WsChannelEnableObserver(Context context, Handler handler, OnWsChannelEnableChangedObserver onWsChannelEnableChangedObserver) {
        this.mHandler = handler;
        this.mContext = context;
        this.mObserver = onWsChannelEnableChangedObserver;
        loadPushSdkEnabled();
        registerContentObservers();
    }
}
