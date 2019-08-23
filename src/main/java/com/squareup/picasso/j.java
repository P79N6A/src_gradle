package com.squareup.picasso;

import android.content.Context;
import android.media.ExifInterface;
import com.squareup.picasso.s;
import com.squareup.picasso.x;
import java.io.IOException;
import java.io.InputStream;

public final class j extends g {
    j(Context context) {
        super(context);
    }

    public final boolean a(v vVar) {
        return "file".equals(vVar.f27464d.getScheme());
    }

    public final x.a b(v vVar) throws IOException {
        int i;
        InputStream c2 = c(vVar);
        s.d dVar = s.d.DISK;
        int attributeInt = new ExifInterface(vVar.f27464d.getPath()).getAttributeInt("Orientation", 1);
        if (attributeInt == 3) {
            i = 180;
        } else if (attributeInt == 6) {
            i = 90;
        } else if (attributeInt != 8) {
            i = 0;
        } else {
            i = 270;
        }
        return new x.a(null, c2, dVar, i);
    }
}
