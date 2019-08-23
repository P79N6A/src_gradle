package com.facebook.react.devsupport;

import android.annotation.TargetApi;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.ChoreographerCompat;
import com.facebook.react.modules.debug.FpsDebugFrameCallback;
import com.ss.android.ugc.aweme.C0906R;
import java.util.Locale;

@TargetApi(16)
public class FpsView extends FrameLayout {
    private final FPSMonitorRunnable mFPSMonitorRunnable;
    public final FpsDebugFrameCallback mFrameCallback;
    private final TextView mTextView = ((TextView) findViewById(C0906R.id.ai2));

    class FPSMonitorRunnable implements Runnable {
        private boolean mShouldStop;
        private int mTotal4PlusFrameStutters;
        private int mTotalFramesDropped;

        public void stop() {
            this.mShouldStop = true;
        }

        public void start() {
            this.mShouldStop = false;
            FpsView.this.post(this);
        }

        public void run() {
            if (!this.mShouldStop) {
                this.mTotalFramesDropped += FpsView.this.mFrameCallback.getExpectedNumFrames() - FpsView.this.mFrameCallback.getNumFrames();
                this.mTotal4PlusFrameStutters += FpsView.this.mFrameCallback.get4PlusFrameStutters();
                FpsView.this.setCurrentFPS(FpsView.this.mFrameCallback.getFPS(), FpsView.this.mFrameCallback.getJSFPS(), this.mTotalFramesDropped, this.mTotal4PlusFrameStutters);
                FpsView.this.mFrameCallback.reset();
                FpsView.this.postDelayed(this, 500);
            }
        }

        private FPSMonitorRunnable() {
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFrameCallback.stop();
        this.mFPSMonitorRunnable.stop();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFrameCallback.reset();
        this.mFrameCallback.start();
        this.mFPSMonitorRunnable.start();
    }

    public FpsView(ReactContext reactContext) {
        super(reactContext);
        inflate(reactContext, C0906R.layout.mq, this);
        this.mFrameCallback = new FpsDebugFrameCallback(ChoreographerCompat.getInstance(), reactContext);
        this.mFPSMonitorRunnable = new FPSMonitorRunnable();
        setCurrentFPS(0.0d, 0.0d, 0, 0);
    }

    public void setCurrentFPS(double d2, double d3, int i, int i2) {
        String format = String.format(Locale.US, "UI: %.1f fps\n%d dropped so far\n%d stutters (4+) so far\nJS: %.1f fps", new Object[]{Double.valueOf(d2), Integer.valueOf(i), Integer.valueOf(i2), Double.valueOf(d3)});
        this.mTextView.setText(format);
        FLog.d("ReactNative", format);
    }
}
