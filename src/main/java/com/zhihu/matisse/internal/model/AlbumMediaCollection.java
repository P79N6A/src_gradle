package com.zhihu.matisse.internal.model;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.zhihu.matisse.internal.entity.d;
import com.zhihu.matisse.internal.loader.AlbumMediaLoader;
import java.lang.ref.WeakReference;

public class AlbumMediaCollection implements LoaderManager.LoaderCallbacks<Cursor> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Context> f82666a;

    /* renamed from: b  reason: collision with root package name */
    private LoaderManager f82667b;

    /* renamed from: c  reason: collision with root package name */
    private a f82668c;

    public interface a {
        void a();

        void a(Cursor cursor);
    }

    public final void a() {
        if (this.f82667b != null) {
            this.f82667b.destroyLoader(2);
        }
        this.f82668c = null;
    }

    public void onLoaderReset(Loader<Cursor> loader) {
        if (((Context) this.f82666a.get()) != null) {
            this.f82668c.a();
        }
    }

    public final void a(@NonNull FragmentActivity fragmentActivity, @NonNull a aVar) {
        this.f82666a = new WeakReference<>(fragmentActivity);
        this.f82667b = fragmentActivity.getSupportLoaderManager();
        this.f82668c = aVar;
    }

    public /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (((Context) this.f82666a.get()) != null) {
            this.f82668c.a(cursor);
        }
    }

    public final void a(@Nullable com.zhihu.matisse.internal.entity.a aVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("args_album", aVar);
        bundle.putBoolean("args_enable_capture", z);
        this.f82667b.initLoader(2, bundle, this);
    }

    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        boolean z;
        String[] strArr;
        String str;
        String str2;
        String[] a2;
        Context context = (Context) this.f82666a.get();
        if (context == null) {
            return null;
        }
        com.zhihu.matisse.internal.entity.a aVar = (com.zhihu.matisse.internal.entity.a) bundle.getParcelable("args_album");
        if (aVar == null) {
            return null;
        }
        if (!aVar.b() || !bundle.getBoolean("args_enable_capture", false)) {
            z = false;
        } else {
            z = true;
        }
        if (!aVar.b()) {
            if (d.a().d()) {
                str2 = "media_type=? AND  bucket_id=? AND _size>0";
                a2 = AlbumMediaLoader.a(1, aVar.f82634b);
            } else if (d.a().e()) {
                str2 = "media_type=? AND  bucket_id=? AND _size>0";
                a2 = AlbumMediaLoader.a(3, aVar.f82634b);
            } else {
                str2 = "(media_type=? OR media_type=?) AND  bucket_id=? AND _size>0";
                strArr = new String[]{PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "3", aVar.f82634b};
                str = str2;
                z = false;
            }
            strArr = a2;
            str = str2;
            z = false;
        } else if (d.a().d()) {
            str = "media_type=? AND _size>0";
            strArr = AlbumMediaLoader.a(1);
        } else if (d.a().e()) {
            str = "media_type=? AND _size>0";
            strArr = AlbumMediaLoader.a(3);
        } else {
            str = "(media_type=? OR media_type=?) AND _size>0";
            strArr = AlbumMediaLoader.f82657a;
        }
        return new AlbumMediaLoader(context, str, strArr, z);
    }
}
