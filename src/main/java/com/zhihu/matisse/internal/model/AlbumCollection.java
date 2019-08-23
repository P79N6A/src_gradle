package com.zhihu.matisse.internal.model;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import com.zhihu.matisse.internal.entity.d;
import com.zhihu.matisse.internal.loader.AlbumLoader;
import java.lang.ref.WeakReference;

public class AlbumCollection implements LoaderManager.LoaderCallbacks<Cursor> {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Context> f82661a;

    /* renamed from: b  reason: collision with root package name */
    public LoaderManager f82662b;

    /* renamed from: c  reason: collision with root package name */
    public a f82663c;

    /* renamed from: d  reason: collision with root package name */
    public int f82664d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f82665e;

    public interface a {
        void a();

        void a(Cursor cursor);
    }

    public void onLoaderReset(Loader<Cursor> loader) {
        if (((Context) this.f82661a.get()) != null) {
            this.f82663c.a();
        }
    }

    public /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (((Context) this.f82661a.get()) != null && !this.f82665e) {
            this.f82665e = true;
            this.f82663c.a(cursor);
        }
    }

    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        String str;
        String[] strArr;
        Context context = (Context) this.f82661a.get();
        if (context == null) {
            return null;
        }
        this.f82665e = false;
        if (d.a().d()) {
            str = "media_type=? AND _size>0) GROUP BY (bucket_id";
            strArr = AlbumLoader.a(1);
        } else if (d.a().e()) {
            str = "media_type=? AND _size>0) GROUP BY (bucket_id";
            strArr = AlbumLoader.a(3);
        } else {
            str = "(media_type=? OR media_type=?) AND _size>0) GROUP BY (bucket_id";
            strArr = AlbumLoader.f82653a;
        }
        return new AlbumLoader(context, str, strArr);
    }
}
