package com.sina.weibo.sdk.api.share;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.sina.weibo.sdk.utils.Utility;

public class WeiboDownloader {
    public static void downloadWeibo(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(268435456);
        intent.setData(Uri.parse("http://app.sina.cn/appdetail.php?appID=84560"));
        try {
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static Dialog createDownloadConfirmDialog(final Context context, final IWeiboDownloadListener iWeiboDownloadListener) {
        String str = "提示";
        String str2 = "未安装微博客户端，是否现在去下载？";
        String str3 = "现在下载";
        String str4 = "以后再说";
        if (!Utility.isChineseLocale(context.getApplicationContext())) {
            str = "Notice";
            str2 = "Sina Weibo client is not installed, download now?";
            str3 = "Download Now";
            str4 = "Download Later";
        }
        return new AlertDialog.Builder(context).setMessage(str2).setTitle(str).setPositiveButton(str3, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                WeiboDownloader.downloadWeibo(context);
            }
        }).setNegativeButton(str4, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                if (IWeiboDownloadListener.this != null) {
                    IWeiboDownloadListener.this.onCancel();
                }
            }
        }).create();
    }
}
