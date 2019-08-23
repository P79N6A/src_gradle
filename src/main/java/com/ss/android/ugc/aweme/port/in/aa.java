package com.ss.android.ugc.aweme.port.in;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.shortvideo.e;
import java.util.List;

public interface aa {

    public interface a {
        void a(Exception exc);

        void a(String str, e eVar);
    }

    public interface b {
        void a();

        boolean a(Object... objArr);
    }

    public interface c extends o {
        void a(Exception exc, String str);

        void a(List<e> list, String str);
    }

    public interface d {
        void a(String str, int i, String str2, int i2);

        void a(String str, int i, String str2, Exception exc);

        void a(String str, int i, @Nullable String str2, @Nullable float[] fArr);
    }

    com.ss.android.ugc.a.b.d a(String str, String str2);

    UrlModel a(Object obj);

    b a(c cVar);

    e a();

    String a(String str);

    void a(Context context, String str, int i, ProgressDialog progressDialog, a aVar);

    void a(Fragment fragment, int i, String str, int i2, Object obj, boolean z, @Nullable Bundle bundle, String str2, String str3);

    void a(e eVar, d dVar);

    void a(String str, z zVar);

    boolean a(int i);

    boolean a(e eVar, Context context, boolean z);

    int b(String str);

    String b();
}
