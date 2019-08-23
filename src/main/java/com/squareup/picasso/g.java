package com.squareup.picasso;

import android.content.Context;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.squareup.picasso.s;
import com.squareup.picasso.x;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class g extends x {

    /* renamed from: a  reason: collision with root package name */
    final Context f27415a;

    g(Context context) {
        this.f27415a = context;
    }

    public boolean a(v vVar) {
        return PushConstants.CONTENT.equals(vVar.f27464d.getScheme());
    }

    public x.a b(v vVar) throws IOException {
        return new x.a(c(vVar), s.d.DISK);
    }

    /* access modifiers changed from: package-private */
    public final InputStream c(v vVar) throws FileNotFoundException {
        return this.f27415a.getContentResolver().openInputStream(vVar.f27464d);
    }
}
