package com.douyin.share.profile.share.a;

import android.app.Activity;
import android.os.Handler;
import com.douyin.share.a.b.b.d;
import com.douyin.share.a.c.a;
import com.douyin.share.a.c.b;

public class c extends a implements com.douyin.share.a.b.c.a, com.douyin.share.a.b.c.c {
    public final boolean a(com.douyin.share.a.b.b.a aVar) {
        if (!a()) {
            return false;
        }
        b.b(this.f23137a, aVar.b(), aVar.d(), aVar.e(), aVar.g(), com.douyin.share.profile.share.a.a(aVar.h(), this.f23138b), aVar.c(), r6 + b.a(), 5);
        return true;
    }

    public final boolean a(d dVar, Handler handler) {
        if (!a()) {
            return false;
        }
        b.b(this.f23137a, dVar.b(), dVar.d(), dVar.e(), dVar.g(), com.douyin.share.profile.share.a.a(dVar.h(), this.f23138b), dVar.c(), r6 + b.a(), 1);
        return true;
    }

    public c(Activity activity, String str, String str2) {
        super(activity, str, str2);
    }
}
