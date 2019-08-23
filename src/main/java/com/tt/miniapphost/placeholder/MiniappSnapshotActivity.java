package com.tt.miniapphost.placeholder;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.AppbrandApplication;
import com.tt.miniapphost.process.MiniAppProcessBridge;
import com.tt.miniapphost.process.callback.IpcCallback;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.util.FileUtil;
import java.io.File;

public class MiniappSnapshotActivity extends FragmentActivity {
    private boolean isFirstOnResume = true;
    public View mContentView;
    public IpcCallback mGetSnapshotIpcCallback;
    public Runnable mUpdateSnapshotRunnable;

    public void finish() {
        super.finish();
        if (this.mContentView != null) {
            this.mContentView.setBackgroundColor(0);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.isFirstOnResume) {
            this.isFirstOnResume = false;
            return;
        }
        if (!isFinishing()) {
            finish();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.mUpdateSnapshotRunnable != null) {
            AppbrandApplication.getInst().getMainHandler().removeCallbacks(this.mUpdateSnapshotRunnable);
        }
        if (this.mGetSnapshotIpcCallback != null) {
            this.mGetSnapshotIpcCallback.finishListenIpcCallback();
            this.mGetSnapshotIpcCallback = null;
        }
    }

    public Bitmap getBitmapFromByte(byte[] bArr) {
        if (bArr != null) {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mContentView = new View(this);
        setContentView(this.mContentView);
        String stringExtra = getIntent().getStringExtra("miniAppProcessIdentify");
        Intent intent = (Intent) getIntent().getParcelableExtra("realIntent");
        if (intent != null) {
            startActivity(intent);
            if (TextUtils.isEmpty(stringExtra)) {
                if (!isFinishing()) {
                    finish();
                }
                return;
            }
            this.mContentView.setBackgroundColor(-1);
            this.mContentView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (!MiniappSnapshotActivity.this.isFinishing()) {
                        MiniappSnapshotActivity.this.finish();
                    }
                }
            });
            this.mGetSnapshotIpcCallback = new IpcCallback() {
                public void onIpcCallback(@Nullable CrossProcessDataEntity crossProcessDataEntity) {
                    String str;
                    finishListenIpcCallback();
                    if (crossProcessDataEntity != null) {
                        str = crossProcessDataEntity.getString("snapshotFilePath");
                    } else {
                        str = null;
                    }
                    if (TextUtils.isEmpty(str)) {
                        AppBrandLogger.e("MiniappSnapshotActivity", "getSnapshot callback null snapshotFilePath");
                        return;
                    }
                    try {
                        final BitmapDrawable bitmapDrawable = new BitmapDrawable(MiniappSnapshotActivity.this.getResources(), MiniappSnapshotActivity.this.getBitmapFromByte(FileUtil.readBytes(str)));
                        FileUtil.delete(new File(str));
                        MiniappSnapshotActivity.this.mUpdateSnapshotRunnable = new Runnable() {
                            public void run() {
                                MiniappSnapshotActivity.this.mContentView.setBackground(bitmapDrawable);
                            }
                        };
                        AppbrandApplication.getInst().getMainHandler().post(MiniappSnapshotActivity.this.mUpdateSnapshotRunnable);
                    } catch (Exception e2) {
                        AppBrandLogger.eWithThrowable("MiniappSnapshotActivity", "setSnapshotAsBackground", e2);
                    }
                    MiniappSnapshotActivity.this.mGetSnapshotIpcCallback = null;
                }
            };
            MiniAppProcessBridge.getSnapshot(stringExtra, this.mGetSnapshotIpcCallback);
            return;
        }
        if (!isFinishing()) {
            finish();
        }
    }
}
