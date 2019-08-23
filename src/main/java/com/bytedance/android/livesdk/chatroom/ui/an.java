package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.widget.e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class an extends e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11839a;

    /* renamed from: c  reason: collision with root package name */
    private static final String f11840c = ((String) LiveConfigSettingKeys.LIVE_OBS_HELPER_URL.a());

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ a.C0900a f11841e;

    /* renamed from: b  reason: collision with root package name */
    public Room f11842b;

    /* renamed from: d  reason: collision with root package name */
    private String f11843d;

    class a extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11844a;

        /* renamed from: b  reason: collision with root package name */
        final int f11845b;

        /* renamed from: c  reason: collision with root package name */
        String f11846c;

        public final void updateDrawState(TextPaint textPaint) {
            TextPaint textPaint2 = textPaint;
            if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f11844a, false, 5673, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f11844a, false, 5673, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            textPaint2.setUnderlineText(false);
            textPaint2.setColor(this.f11845b);
        }

        public final void onClick(@NonNull View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f11844a, false, 5672, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f11844a, false, 5672, new Class[]{View.class}, Void.TYPE);
                return;
            }
            an.this.a(this.f11846c);
            if (an.this.f11842b != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("room_id", String.valueOf(an.this.f11842b.getId()));
                hashMap.put("anchor_id", String.valueOf(an.this.f11842b.getOwnerUserId()));
                com.bytedance.android.livesdk.j.a.a().a("livesdk_liveassistant_url_click", hashMap, Room.class);
            }
        }

        public a(int i, String str) {
            this.f11845b = i;
            this.f11846c = str;
        }
    }

    public final int a() {
        return C0906R.layout.afs;
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f11839a, true, 5671, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f11839a, true, 5671, new Class[0], Void.TYPE);
        } else {
            b bVar = new b("CopyPushUrlDialog.java", an.class);
            f11841e = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.CopyPushUrlDialog", "android.view.View", NotifyType.VIBRATE, "", "void"), 92);
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f11839a, false, 5670, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f11839a, false, 5670, new Class[]{String.class}, Void.TYPE);
            return;
        }
        try {
            c.a(str);
            ai.a((int) C0906R.string.d0r);
        } catch (Exception unused) {
            ai.a((int) C0906R.string.d0p);
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f11839a, false, 5669, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f11839a, false, 5669, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(f11841e, this, this, view));
        int id = view.getId();
        if (id == C0906R.id.dcp) {
            j.q().f().a(getContext(), com.bytedance.android.livesdk.browser.c.c.b(f11840c).a(ac.a((int) C0906R.string.d8x)));
            com.bytedance.android.livesdk.j.a.a().a("thirdparty_take_guide", new com.bytedance.android.livesdk.j.c.j().b("live").f("click").a("live_take_page"));
        } else if (id == C0906R.id.zr || id == C0906R.id.dop) {
            a(this.f11843d);
        } else {
            if (id == C0906R.id.a7k || id == C0906R.id.a72) {
                a(ac.a((int) C0906R.string.dg4));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11839a, false, 5668, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f11839a, false, 5668, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        View findViewById = findViewById(C0906R.id.zr);
        TextView textView = (TextView) findViewById(C0906R.id.dop);
        findViewById.setOnClickListener(this);
        textView.setOnClickListener(this);
        ((TextView) findViewById(C0906R.id.dcp)).setOnClickListener(this);
        textView.setText(this.f11843d);
        View findViewById2 = findViewById(C0906R.id.a7k);
        View findViewById3 = findViewById(C0906R.id.a72);
        findViewById2.setOnClickListener(this);
        findViewById3.setOnClickListener(this);
        if (com.bytedance.android.live.uikit.a.a.a()) {
            TextView textView2 = (TextView) findViewById(C0906R.id.bdh);
            String string = getContext().getString(C0906R.string.d0v);
            String string2 = getContext().getString(C0906R.string.d0w);
            SpannableString spannableString = new SpannableString(string + string2);
            spannableString.setSpan(new a(getContext().getResources().getColor(C0906R.color.agd), string2), string.length(), spannableString.length(), 18);
            textView2.setText(spannableString);
            textView2.setClickable(true);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public an(@NonNull Context context, String str, Room room) {
        super(context);
        this.f11843d = str;
        this.f11842b = room;
        int indexOf = this.f11843d.indexOf("signature");
        if (indexOf != -1) {
            int indexOf2 = this.f11843d.indexOf(61, indexOf) + 1;
            int indexOf3 = this.f11843d.indexOf(38, indexOf2);
            indexOf3 = indexOf3 == -1 ? this.f11843d.length() : indexOf3;
            String substring = this.f11843d.substring(indexOf2, indexOf3);
            StringBuilder sb = new StringBuilder(this.f11843d);
            sb.replace(indexOf2, indexOf3, substring.replace("%", "%25"));
            this.f11843d = sb.toString();
        }
    }
}
