package com.ss.android.ugc.aweme.framework.services;

import android.app.Activity;
import android.net.Uri;

public interface IReportService {

    public interface IReportCallback {
        void onReportEnd();

        void onReportStart();
    }

    void showReportDialog(Activity activity, String str, Uri.Builder builder, IReportCallback iReportCallback);

    void showReportDialog(Activity activity, String str, String str2, String str3, IReportCallback iReportCallback);

    void showReportDialog(Activity activity, String str, String str2, String str3, String str4, IReportCallback iReportCallback);
}
