package com.umeng.message.inapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.entity.UInAppMessage;
import com.umeng.message.proguard.h;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class UImageLoadTask extends AsyncTask<String, Void, Bitmap[]> {

    /* renamed from: a  reason: collision with root package name */
    private static final String f81195a = "com.umeng.message.inapp.UImageLoadTask";

    /* renamed from: b  reason: collision with root package name */
    private ImageLoaderCallback f81196b;

    /* renamed from: c  reason: collision with root package name */
    private String f81197c;

    /* renamed from: d  reason: collision with root package name */
    private BitmapFactory.Options f81198d;

    interface ImageLoaderCallback {
        void onLoadImage(Bitmap[] bitmapArr);
    }

    public void a(ImageLoaderCallback imageLoaderCallback) {
        this.f81196b = imageLoaderCallback;
    }

    private boolean a(String str) {
        return new File(this.f81197c, str.hashCode()).exists();
    }

    private Bitmap b(String str) {
        try {
            String str2 = str.hashCode();
            Bitmap decodeFile = BitmapFactory.decodeFile(this.f81197c + str2);
            try {
                UMLog.mutlInfo(f81195a, 2, "load from local");
                return decodeFile;
            } catch (Exception unused) {
                return decodeFile;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    private Bitmap c(String str) throws IOException {
        Bitmap bitmap;
        UMLog.mutlInfo(f81195a, 2, "Downloading image start");
        URLConnection openConnection = new URL(str).openConnection();
        openConnection.connect();
        InputStream inputStream = openConnection.getInputStream();
        if (this.f81198d == null) {
            bitmap = BitmapFactory.decodeStream(inputStream);
        } else {
            UMLog.mutlInfo(f81195a, 2, "decode options");
            bitmap = BitmapFactory.decodeStream(inputStream, null, this.f81198d);
        }
        inputStream.close();
        UMLog.mutlInfo(f81195a, 2, "Downloading image finish");
        return bitmap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Bitmap[] bitmapArr) {
        super.onPostExecute(bitmapArr);
        int length = bitmapArr.length;
        int i = 0;
        while (i < length) {
            if (bitmapArr[i] != null) {
                i++;
            } else {
                return;
            }
        }
        if (this.f81196b != null) {
            this.f81196b.onLoadImage(bitmapArr);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap[] doInBackground(String... strArr) {
        Bitmap[] bitmapArr = new Bitmap[strArr.length];
        int i = 0;
        while (i < strArr.length) {
            try {
                if (!a(strArr[i])) {
                    bitmapArr[i] = b(strArr[i]);
                    if (bitmapArr[i] == null) {
                        bitmapArr[i] = c(strArr[i]);
                        a(bitmapArr[i], strArr[i]);
                    }
                } else {
                    bitmapArr[i] = b(strArr[i]);
                }
                i++;
            } catch (IOException unused) {
            }
        }
        return bitmapArr;
    }

    public UImageLoadTask(Context context, UInAppMessage uInAppMessage) {
        this.f81197c = h.d(context, uInAppMessage.msg_id);
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            this.f81198d = new BitmapFactory.Options();
            this.f81198d.inSampleSize = a(uInAppMessage, i, i2);
        } catch (Exception unused) {
        }
    }

    private void a(Bitmap bitmap, String str) {
        boolean z;
        if (bitmap != null) {
            try {
                File file = new File(this.f81197c);
                if (!file.exists()) {
                    file.mkdirs();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f81197c, str.hashCode()));
                z = bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                try {
                    fileOutputStream.close();
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                z = false;
            }
            String str2 = f81195a;
            UMLog.mutlInfo(str2, 2, "store bitmap" + z);
        }
    }

    private static int a(UInAppMessage uInAppMessage, int i, int i2) {
        int i3 = uInAppMessage.height;
        int i4 = uInAppMessage.width;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }
}
