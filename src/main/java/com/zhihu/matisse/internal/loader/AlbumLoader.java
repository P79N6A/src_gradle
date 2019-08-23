package com.zhihu.matisse.internal.loader;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MergeCursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.content.CursorLoader;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.zhihu.matisse.internal.entity.a;

public class AlbumLoader extends CursorLoader {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f82653a = {PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "3"};

    /* renamed from: b  reason: collision with root package name */
    private static final Uri f82654b = MediaStore.Files.getContentUri("external");

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f82655c = {"_id", "bucket_id", "bucket_display_name", "_data", "count"};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f82656d = {"_id", "bucket_id", "bucket_display_name", "_data", "COUNT(*) AS count"};

    public void onContentChanged() {
    }

    public Cursor loadInBackground() {
        int i;
        Cursor loadInBackground = super.loadInBackground();
        MatrixCursor matrixCursor = new MatrixCursor(f82655c);
        String str = "";
        if (loadInBackground != null) {
            i = 0;
            while (loadInBackground.moveToNext()) {
                i += loadInBackground.getInt(loadInBackground.getColumnIndex("count"));
            }
            if (loadInBackground.moveToFirst()) {
                str = loadInBackground.getString(loadInBackground.getColumnIndex("_data"));
            }
        } else {
            i = 0;
        }
        matrixCursor.addRow(new String[]{a.f82633a, a.f82633a, "All", str, String.valueOf(i)});
        return new MergeCursor(new Cursor[]{matrixCursor, loadInBackground});
    }

    public static String[] a(int i) {
        return new String[]{String.valueOf(i)};
    }

    public AlbumLoader(Context context, String str, String[] strArr) {
        super(context, f82654b, f82656d, str, strArr, "datetaken DESC");
    }
}
