package com.bytedance.common.wschannel.channel.impl.ok;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatWebSocket;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.Response;
import okio.ByteString;

public class HeartBeatProcessor {
    private long DEFAULT_PING_INTERVAL_MIN = 270000;
    private long mCurBackgroundHeart = this.DEFAULT_PING_INTERVAL_MIN;
    private final Handler mHandler;
    public final HeartBeatListener mListener;
    private long mPongTimeout = 5000;
    private Runnable mSendHeartBeatRunnable = new Runnable() {
        public void run() {
            HeartBeatProcessor.this.sendPing();
            HeartBeatProcessor.this.schedule();
        }
    };
    private long mSuccessHeart = this.mCurBackgroundHeart;
    private Runnable mTimeoutCheckRunnable = new Runnable() {
        public void run() {
            if (HeartBeatProcessor.this.mWaitingForPong.getAndSet(false)) {
                HeartBeatProcessor.this.disConnect();
                if (HeartBeatProcessor.this.mListener != null) {
                    HeartBeatProcessor.this.mListener.onHeartBeatTimeout();
                }
            }
        }
    };
    public AtomicBoolean mWaitingForPong = new AtomicBoolean(false);
    private CustomHeartBeatWebSocket mWebSocket;

    interface HeartBeatListener {
        void onHeartBeatTimeout();
    }

    /* access modifiers changed from: package-private */
    public void onAppStateChanged(boolean z) {
    }

    /* access modifiers changed from: package-private */
    public long getSuccessHeatBeatInterval() {
        return this.mSuccessHeart;
    }

    public void sendPing() {
        try {
            if (this.mWebSocket != null) {
                this.mWebSocket.sendPing(ByteString.EMPTY);
                waitingForPong();
            }
        } catch (Exception unused) {
        }
    }

    private void waitingForPong() {
        this.mWaitingForPong.set(true);
        this.mHandler.removeCallbacks(this.mTimeoutCheckRunnable);
        this.mHandler.postDelayed(this.mTimeoutCheckRunnable, this.mPongTimeout);
    }

    /* access modifiers changed from: package-private */
    public void disConnect() {
        this.mHandler.removeCallbacks(this.mTimeoutCheckRunnable);
        this.mHandler.removeCallbacks(this.mSendHeartBeatRunnable);
        this.mWaitingForPong.set(false);
    }

    public void schedule() {
        long j = this.DEFAULT_PING_INTERVAL_MIN;
        this.mHandler.removeCallbacks(this.mSendHeartBeatRunnable);
        this.mHandler.postDelayed(this.mSendHeartBeatRunnable, j);
    }

    /* access modifiers changed from: package-private */
    public void setPongTimeout(long j) {
        this.mPongTimeout = j;
    }

    private void updatePingInterval(Response response) {
        if (response != null) {
            String header = response.header("Handshake-Options");
            if (header != null) {
                for (String str : header.split(";")) {
                    if (!TextUtils.isEmpty(str)) {
                        String[] split = str.split("=");
                        if ("ping-interval".equals(split[0])) {
                            try {
                                this.DEFAULT_PING_INTERVAL_MIN = Long.parseLong(split[1]) * 1000;
                                return;
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void onOpenSuccess(CustomHeartBeatWebSocket customHeartBeatWebSocket, Response response) {
        this.mWebSocket = customHeartBeatWebSocket;
        updatePingInterval(response);
        schedule();
    }

    /* access modifiers changed from: package-private */
    public void onReceivePong(CustomHeartBeatWebSocket customHeartBeatWebSocket, ByteString byteString) {
        this.mWaitingForPong.set(false);
        this.mHandler.removeCallbacks(this.mTimeoutCheckRunnable);
    }

    HeartBeatProcessor(Handler handler, HeartBeatListener heartBeatListener) {
        this.mHandler = handler;
        this.mListener = heartBeatListener;
    }
}
