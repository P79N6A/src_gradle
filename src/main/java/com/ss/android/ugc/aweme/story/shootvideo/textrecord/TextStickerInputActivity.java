package com.ss.android.ugc.aweme.story.shootvideo.textrecord;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.story.shootvideo.c;
import com.ss.android.ugc.aweme.story.shootvideo.textfont.d;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.f;

public class TextStickerInputActivity extends Activity implements f.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74225a;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f74226d;

    /* renamed from: e  reason: collision with root package name */
    public static String f74227e;

    /* renamed from: b  reason: collision with root package name */
    TextStickerInputLayout f74228b;

    /* renamed from: c  reason: collision with root package name */
    TextStickerData f74229c;

    /* renamed from: f  reason: collision with root package name */
    private f f74230f;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f74225a, false, 86258, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74225a, false, 86258, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerInputActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerInputActivity", "onResume", false);
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f74225a, false, 86252, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74225a, false, 86252, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(0, C0906R.anim.br);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f74225a, false, 86254, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74225a, false, 86254, new Class[0], Void.TYPE);
            return;
        }
        d.a().g();
        this.f74230f.a();
        super.onDestroy();
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f74225a, false, 86251, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74225a, false, 86251, new Class[0], Void.TYPE);
            return;
        }
        Intent intent = new Intent();
        TextStickerData textStickerData = null;
        if (c.a(this.f74228b.getTextAry())) {
            textStickerData = new TextStickerData("", this.f74228b.getCurTxtMode(), this.f74228b.getCurColor(), this.f74228b.getAlignTxt(), d.a().f74173c);
            textStickerData.mTextStrAry = this.f74228b.getTextAry();
            textStickerData.mEditCenterPoint = this.f74228b.getEditInputCenterPoint();
        }
        intent.putExtra("text_sticker_data", textStickerData);
        setResult(-1, intent);
        finish();
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f74225a, false, 86257, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f74225a, false, 86257, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a();
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74225a, false, 86255, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74225a, false, 86255, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerInputActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f74225a, false, 86256, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f74225a, false, 86256, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f74228b.a(i);
        this.f74228b.setVisibility(0);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f74225a, false, 86248, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f74225a, false, 86248, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerInputActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(C0906R.anim.bq, 0);
        setContentView(C0906R.layout.ec);
        v.b((Activity) this);
        this.f74228b = (TextStickerInputLayout) findViewById(C0906R.id.d27);
        this.f74228b.q = false;
        this.f74228b.a("", f74227e, false, true);
        this.f74228b.b(true);
        this.f74228b.setTextStickerUpdateListener(new q(this));
        this.f74230f = new f(this);
        this.f74230f.a(this);
        if (PatchProxy.isSupport(new Object[0], this, f74225a, false, 86249, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74225a, false, 86249, new Class[0], Void.TYPE);
        } else if (getIntent() == null) {
            a();
        } else {
            this.f74229c = (TextStickerData) getIntent().getParcelableExtra("text_sticker_data");
            this.f74228b.postDelayed(new r(this), 100);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerInputActivity", "onCreate", false);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent}, this, f74225a, false, 86253, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent}, this, f74225a, false, 86253, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (i != 4) {
            return false;
        } else {
            a();
            return super.onKeyDown(i, keyEvent);
        }
    }
}
