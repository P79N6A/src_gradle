package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.PoiStruct;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.StoryStickerGestureLayout;
import java.io.File;
import java.util.HashMap;
import java.util.UUID;

public final class a extends b {
    public static ChangeQuickRedirect u;
    public String v;
    private PoiStruct w;

    public final boolean a(c cVar) {
        c cVar2 = cVar;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, u, false, 76988, new Class[]{c.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar2}, this, u, false, 76988, new Class[]{c.class}, Boolean.TYPE)).booleanValue();
        }
        if (cVar2 instanceof c) {
            z = super.a(cVar);
            this.w = null;
        }
        return z;
    }

    public final boolean g() {
        if (this.w != null) {
            return true;
        }
        return false;
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 76992, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 76992, new Class[0], Void.TYPE);
            return;
        }
        super.h();
        this.w = null;
    }

    private String j() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 76994, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, u, false, 76994, new Class[0], String.class);
        }
        return "pi_start" + UUID.randomUUID().toString() + "pi_end";
    }

    public final InteractStickerStruct i() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 76989, new Class[0], InteractStickerStruct.class)) {
            return (InteractStickerStruct) PatchProxy.accessDispatch(new Object[0], this, u, false, 76989, new Class[0], InteractStickerStruct.class);
        }
        InteractStickerStruct a2 = super.a(1);
        if (a2 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("poi_sticker_id", this.v);
        a2.setAttr(com.ss.android.ugc.aweme.port.in.a.D.getRetrofitFactoryGson().toJson((Object) hashMap));
        a2.setIndex(0);
        a2.setPoiStruct(this.w);
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(InteractStickerStruct interactStickerStruct) {
        super.a(interactStickerStruct);
        this.j.setVisibility(0);
    }

    public final void a(PoiStruct poiStruct) {
        PoiStruct poiStruct2 = poiStruct;
        if (PatchProxy.isSupport(new Object[]{poiStruct2}, this, u, false, 76986, new Class[]{PoiStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiStruct2}, this, u, false, 76986, new Class[]{PoiStruct.class}, Void.TYPE);
            return;
        }
        a(poiStruct2, true);
    }

    public final c a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, u, false, 76985, new Class[]{Context.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{context2}, this, u, false, 76985, new Class[]{Context.class}, c.class);
        }
        if (PatchProxy.isSupport(new Object[]{context2}, null, c.f67287a, true, 76997, new Class[]{Context.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{context2}, null, c.f67287a, true, 76997, new Class[]{Context.class}, c.class);
        }
        c cVar = new c(context2);
        cVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return cVar;
    }

    public final void a(InteractStickerStruct interactStickerStruct) {
        if (PatchProxy.isSupport(new Object[]{interactStickerStruct}, this, u, false, 76990, new Class[]{InteractStickerStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{interactStickerStruct}, this, u, false, 76990, new Class[]{InteractStickerStruct.class}, Void.TYPE);
            return;
        }
        if (interactStickerStruct != null) {
            this.w = interactStickerStruct.getPoiStruct();
            a(this.w, false);
        }
        if (this.j != null) {
            this.j.postDelayed(new b(this, interactStickerStruct), 300);
        }
    }

    public final void a(String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, this, u, false, 76991, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, u, false, 76991, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!StringUtils.isEmpty(str)) {
            if (str.contains("pi_start") && str.contains("pi_end")) {
                if (PatchProxy.isSupport(new Object[]{str}, this, u, false, 76993, new Class[]{String.class}, String.class)) {
                    str2 = (String) PatchProxy.accessDispatch(new Object[]{str}, this, u, false, 76993, new Class[]{String.class}, String.class);
                } else {
                    str2 = str.replaceAll("pi_start(.*?)pi_end", j());
                }
                super.a(str2);
            } else if (str.endsWith(File.separator)) {
                super.a(str + j());
            } else {
                super.a(str + j());
            }
        }
    }

    private void a(PoiStruct poiStruct, boolean z) {
        if (PatchProxy.isSupport(new Object[]{poiStruct, Byte.valueOf(z ? (byte) 1 : 0)}, this, u, false, 76987, new Class[]{PoiStruct.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiStruct, Byte.valueOf(z)}, this, u, false, 76987, new Class[]{PoiStruct.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.w = poiStruct;
        if (!TextUtils.isEmpty(poiStruct.getPoiName())) {
            d();
            if (this.j instanceof c) {
                ((c) this.j).setPoiContentTxt(poiStruct.getPoiName());
            }
            if (this.l != null) {
                this.l.b();
            }
            if (z) {
                this.j.setVisibility(0);
            }
        }
    }

    public final void a(Context context, View view, StoryStickerGestureLayout storyStickerGestureLayout, FrameLayout frameLayout) {
        if (PatchProxy.isSupport(new Object[]{context, view, storyStickerGestureLayout, frameLayout}, this, u, false, 76984, new Class[]{Context.class, View.class, StoryStickerGestureLayout.class, FrameLayout.class}, Void.TYPE)) {
            Object[] objArr = {context, view, storyStickerGestureLayout, frameLayout};
            PatchProxy.accessDispatch(objArr, this, u, false, 76984, new Class[]{Context.class, View.class, StoryStickerGestureLayout.class, FrameLayout.class}, Void.TYPE);
            return;
        }
        super.a(context, view, storyStickerGestureLayout, frameLayout);
    }
}
