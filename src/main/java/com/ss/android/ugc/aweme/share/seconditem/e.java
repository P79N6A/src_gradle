package com.ss.android.ugc.aweme.share.seconditem;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.share.v;
import java.util.List;

public class e extends v implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65281a;

    /* renamed from: f  reason: collision with root package name */
    private Aweme f65282f;

    public void setAweme(Aweme aweme) {
        this.f65282f = aweme;
    }

    public e(Context context) {
        this(context, null);
    }

    private static boolean a(ClipData clipData) {
        ClipData clipData2 = clipData;
        if (PatchProxy.isSupport(new Object[]{clipData2}, null, f65281a, true, 73709, new Class[]{ClipData.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{clipData2}, null, f65281a, true, 73709, new Class[]{ClipData.class}, Boolean.TYPE)).booleanValue();
        } else if (clipData2 == null || clipData2.getItemAt(0) == null || clipData2.getItemAt(0).getText() == null || TextUtils.isEmpty(clipData2.getItemAt(0).getText().toString())) {
            return false;
        } else {
            return true;
        }
    }

    public static void a(FeedItemList feedItemList) {
        FeedItemList feedItemList2 = feedItemList;
        if (PatchProxy.isSupport(new Object[]{feedItemList2}, null, f65281a, true, 73708, new Class[]{FeedItemList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItemList2}, null, f65281a, true, 73708, new Class[]{FeedItemList.class}, Void.TYPE);
            return;
        }
        try {
            Activity e2 = p.a().e();
            ClipboardManager clipboardManager = (ClipboardManager) e2.getSystemService("clipboard");
            if (clipboardManager != null && a.a()) {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (a(primaryClip)) {
                    Aweme aweme = (Aweme) new Gson().fromJson(primaryClip.getItemAt(0).getText().toString(), Aweme.class);
                    if (aweme != null && c.t(aweme)) {
                        List<Aweme> list = feedItemList2.items;
                        if (!CollectionUtils.isEmpty(list) && (!list.contains(aweme) || list.indexOf(aweme) != 0)) {
                            list.add(0, aweme);
                            com.bytedance.ies.dmt.ui.d.a.a((Context) e2, (int) C0906R.string.a29).a();
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public void onClick(View view) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{view}, this, f65281a, false, 73705, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f65281a, false, 73705, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (PatchProxy.isSupport(new Object[0], this, f65281a, false, 73706, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f65281a, false, 73706, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f65282f == null || !c.t(this.f65282f) || !a.a()) {
            z = false;
        }
        if (z) {
            try {
                Context context = view.getContext();
                ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
                if (clipboardManager != null) {
                    String json = new Gson().toJson((Object) this.f65282f);
                    clipboardManager.setPrimaryClip(ClipData.newPlainText(json, json));
                    com.bytedance.ies.dmt.ui.d.a.a(context, (int) C0906R.string.a29).a();
                }
            } catch (Exception unused) {
            }
        }
    }

    private e(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private e(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        setIcon(2130837944);
        setText(getContext().getString(C0906R.string.a28));
        setOnClickListener(this);
    }
}
