package com.ss.android.socialbase.appdownloader.view;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.ss.android.socialbase.appdownloader.AppDownloader;
import com.ss.android.socialbase.appdownloader.a.a;
import com.ss.android.socialbase.appdownloader.d;
import com.ss.android.socialbase.appdownloader.depend.IAppDownloadDepend;
import com.ss.android.socialbase.appdownloader.depend.IAppDownloadEventHandler;
import com.ss.android.socialbase.appdownloader.depend.IDownloadAlertDialog;
import com.ss.android.socialbase.appdownloader.depend.IDownloadAlertDialogBuilder;
import com.ss.android.socialbase.downloader.depend.u;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.b;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.C0906R;

public class DownloadTaskDeleteActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private IDownloadAlertDialog f30795a;

    /* renamed from: b  reason: collision with root package name */
    private Intent f30796b;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity", "onResume", true);
        super.onResume();
        this.f30796b = getIntent();
        if (this.f30795a == null && this.f30796b != null) {
            try {
                final int intExtra = this.f30796b.getIntExtra("extra_click_download_ids", 0);
                final DownloadInfo downloadInfo = Downloader.getInstance(getApplicationContext()).getDownloadInfo(intExtra);
                if (downloadInfo != null) {
                    String title = downloadInfo.getTitle();
                    if (!TextUtils.isEmpty(title)) {
                        int i = C0906R.string.appdownloader_notification_download_delete;
                        if (AppDownloader.getInstance().useReflectParseRes()) {
                            i = d.b(this, "appdownloader_notification_download_delete");
                        }
                        String format = String.format(getString(i), new Object[]{title});
                        IAppDownloadDepend appDownloadDepend = AppDownloader.getInstance().getAppDownloadDepend();
                        IDownloadAlertDialogBuilder iDownloadAlertDialogBuilder = null;
                        if (appDownloadDepend != null) {
                            iDownloadAlertDialogBuilder = appDownloadDepend.getThemedAlertDlgBuilder(this);
                        }
                        if (iDownloadAlertDialogBuilder == null) {
                            iDownloadAlertDialogBuilder = new a(this);
                        }
                        if (iDownloadAlertDialogBuilder != null) {
                            int i2 = C0906R.string.appdownloader_tip;
                            if (AppDownloader.getInstance().useReflectParseRes()) {
                                i2 = d.b(this, "appdownloader_tip");
                            }
                            int i3 = C0906R.string.appdownloader_label_ok;
                            if (AppDownloader.getInstance().useReflectParseRes()) {
                                i3 = d.b(this, "appdownloader_label_ok");
                            }
                            int i4 = C0906R.string.appdownloader_label_cancel;
                            if (AppDownloader.getInstance().useReflectParseRes()) {
                                i4 = d.b(this, "appdownloader_label_cancel");
                            }
                            iDownloadAlertDialogBuilder.setTitle(i2).setMessage(format).setPositiveButton(i3, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    IAppDownloadEventHandler appDownloadEventHandler = AppDownloader.getInstance().getAppDownloadEventHandler();
                                    if (appDownloadEventHandler != null) {
                                        appDownloadEventHandler.handleDownloadCancel(downloadInfo);
                                    }
                                    u downloadNotificationEventListener = Downloader.getInstance(b.q()).getDownloadNotificationEventListener(intExtra);
                                    if (downloadNotificationEventListener != null) {
                                        downloadNotificationEventListener.a(10, downloadInfo, "", "");
                                    }
                                    if (b.q() != null) {
                                        Downloader.getInstance(b.q()).cancel(intExtra);
                                    }
                                    DownloadTaskDeleteActivity.this.finish();
                                }
                            }).setNegativeButton(i4, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    DownloadTaskDeleteActivity.this.finish();
                                }
                            }).setOnCancelListener(new DialogInterface.OnCancelListener() {
                                public final void onCancel(DialogInterface dialogInterface) {
                                    DownloadTaskDeleteActivity.this.finish();
                                }
                            });
                            this.f30795a = iDownloadAlertDialogBuilder.show();
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        if (this.f30795a != null && !this.f30795a.isShowing()) {
            this.f30795a.show();
        } else if (this.f30795a == null) {
            finish();
        }
        ActivityInstrumentation.onTrace("com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity", "onResume", false);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity", "onCreate", true);
        super.onCreate(bundle);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
        ActivityInstrumentation.onTrace("com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity", "onCreate", false);
    }
}
