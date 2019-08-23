package com.zhihu.matisse.internal.loader;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MergeCursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.content.CursorLoader;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class AlbumMediaLoader extends CursorLoader {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f82657a = {PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "3"};

    /* renamed from: b  reason: collision with root package name */
    private static final Uri f82658b = MediaStore.Files.getContentUri("external");

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f82659c = {"_id", "_display_name", "mime_type", "_size", "duration"};

    /* renamed from: d  reason: collision with root package name */
    private final boolean f82660d;

    public void onContentChanged() {
    }

    public Cursor loadInBackground() {
        Cursor loadInBackground = super.loadInBackground();
        if (!this.f82660d || !getContext().getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.camera")) {
            return loadInBackground;
        }
        MatrixCursor matrixCursor = new MatrixCursor(f82659c);
        matrixCursor.addRow(new Object[]{-1L, "Capture", "", 0, 0});
        return new MergeCursor(new Cursor[]{matrixCursor, loadInBackground});
    }

    public static String[] a(int i) {
        return new String[]{String.valueOf(i)};
    }

    public static String[] a(int i, String str) {
        return new String[]{String.valueOf(i), str};
    }

    public AlbumMediaLoader(Context context, String str, String[] strArr, boolean z) {
        super(context, f82658b, f82659c, str, strArr, "datetaken DESC");
        this.f82660d = z;
    }
}
