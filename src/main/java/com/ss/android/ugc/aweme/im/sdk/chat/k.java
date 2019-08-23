package com.ss.android.ugc.aweme.im.sdk.chat;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.ColorInt;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.framework.services.IReportService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sdk.chat.model.GroupNoticeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SystemContent;
import com.ss.android.ugc.aweme.im.sdk.d.j;
import com.ss.android.ugc.aweme.im.sdk.group.view.GroupNameEditDialog;
import com.ss.android.ugc.aweme.im.sdk.model.BlockResponse;
import com.ss.android.ugc.aweme.im.sdk.utils.ay;
import com.ss.android.ugc.aweme.im.sdk.utils.bc;
import com.ss.android.ugc.aweme.im.sdk.utils.l;
import com.ss.android.ugc.aweme.im.sdk.utils.r;
import com.ss.android.ugc.aweme.im.sdk.utils.x;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50675a;

    public static class a extends ClickableSpan implements WeakHandler.IHandler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50684a;

        /* renamed from: b  reason: collision with root package name */
        public CharSequence f50685b;

        /* renamed from: c  reason: collision with root package name */
        public SystemContent.Key f50686c;
        @ColorInt

        /* renamed from: d  reason: collision with root package name */
        private int f50687d;

        /* renamed from: e  reason: collision with root package name */
        private WeakHandler f50688e;

        private void a() {
            if (PatchProxy.isSupport(new Object[0], this, f50684a, false, 50432, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50684a, false, 50432, new Class[0], Void.TYPE);
                return;
            }
            if (this.f50688e == null) {
                this.f50688e = new WeakHandler(Looper.getMainLooper(), this);
            }
        }

        private String a(String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f50684a, false, 50429, new Class[]{String.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f50684a, false, 50429, new Class[]{String.class}, String.class);
            }
            return j.f51270d.a(com.ss.android.ugc.aweme.im.sdk.d.e.a().b(str2), str2);
        }

        public void handleMsg(Message message) {
            if (PatchProxy.isSupport(new Object[]{message}, this, f50684a, false, 50431, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message}, this, f50684a, false, 50431, new Class[]{Message.class}, Void.TYPE);
            } else if (message.what == 1) {
                a(message.obj);
            } else {
                if (message.what == 0) {
                    a(message.obj);
                }
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            TextPaint textPaint2 = textPaint;
            if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f50684a, false, 50430, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f50684a, false, 50430, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            super.updateDrawState(textPaint);
            textPaint2.setColor(this.f50687d);
        }

        private void a(Object obj) {
            Object obj2 = obj;
            if (PatchProxy.isSupport(new Object[]{obj2}, this, f50684a, false, 50433, new Class[]{Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{obj2}, this, f50684a, false, 50433, new Class[]{Object.class}, Void.TYPE);
                return;
            }
            Context context = GlobalContext.getContext();
            if (obj2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                UIUtils.displayToast(context, ((com.ss.android.ugc.aweme.base.api.a.b.a) obj2).getErrorMsg());
            } else if (obj2 instanceof Exception) {
                UIUtils.displayToast(context, (int) C0906R.string.ara);
            } else {
                if (obj2 instanceof BlockResponse) {
                    BlockResponse blockResponse = (BlockResponse) obj2;
                    if (blockResponse.getBlockStaus() == 1) {
                        UIUtils.displayToast(context, (int) C0906R.string.apj);
                    } else if (blockResponse.getBlockStaus() == 0) {
                        UIUtils.displayToast(context, (int) C0906R.string.aza);
                    }
                }
            }
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f50684a, false, 50428, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f50684a, false, 50428, new Class[]{View.class}, Void.TYPE);
                return;
            }
            a();
            if (this.f50686c.getAction() == 1) {
                r.a(this.f50688e, this.f50685b, a(this.f50685b.toString()), 1, 1);
            } else if (this.f50686c.getAction() == 2) {
                r.a(this.f50688e, this.f50685b, a(this.f50685b.toString()), 0, 0);
            } else if (this.f50686c.getAction() == 3) {
                IReportService iReportService = (IReportService) ServiceManager.get().getService(IReportService.class);
                if (iReportService != null) {
                    iReportService.showReportDialog((Activity) view.getContext(), "im", this.f50685b.toString(), this.f50685b.toString(), null);
                }
            } else if (this.f50686c.getAction() == 4) {
                h.a().a(this.f50686c.getLink());
            } else {
                if (this.f50686c.getAction() == 5) {
                    x.a(view.getContext(), this.f50686c.getName());
                }
            }
        }

        private a(@ColorInt int i, String str) {
            this.f50687d = i;
            this.f50685b = str;
            if (this.f50685b == null) {
                this.f50685b = PushConstants.PUSH_TYPE_NOTIFY;
            }
            a();
        }

        public /* synthetic */ a(int i, String str, byte b2) {
            this(i, str);
        }
    }

    public static class b extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50689a;

        /* renamed from: b  reason: collision with root package name */
        public String f50690b;
        @ColorInt

        /* renamed from: c  reason: collision with root package name */
        private int f50691c;

        public interface a {
            void a();

            void a(View view);

            void b(View view);
        }

        public void onClick(View view) {
        }

        public b(@ColorInt int i) {
            this.f50691c = i;
        }

        public void updateDrawState(TextPaint textPaint) {
            TextPaint textPaint2 = textPaint;
            if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f50689a, false, 50434, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f50689a, false, 50434, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            super.updateDrawState(textPaint);
            textPaint2.setColor(this.f50691c);
            textPaint2.setUnderlineText(false);
        }
    }

    static class c extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50692a;

        /* renamed from: b  reason: collision with root package name */
        public String f50693b;

        /* renamed from: c  reason: collision with root package name */
        private Context f50694c;

        /* renamed from: d  reason: collision with root package name */
        private int f50695d;

        /* renamed from: e  reason: collision with root package name */
        private int f50696e;

        public final void updateDrawState(TextPaint textPaint) {
            TextPaint textPaint2 = textPaint;
            if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f50692a, false, 50435, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f50692a, false, 50435, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            textPaint2.setColor(this.f50695d);
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f50692a, false, 50436, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f50692a, false, 50436, new Class[]{View.class}, Void.TYPE);
            } else if (this.f50696e != 100121 || TextUtils.isEmpty(this.f50693b)) {
                if (!TextUtils.isEmpty(this.f50693b)) {
                    z.a().b(this.f50693b, "chat", "click_name");
                    ay.f52524b.a(this.f50693b);
                }
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("conversation_id", this.f50693b);
                z.a("group_name_quick_click", (Map<String, String>) hashMap);
                new GroupNameEditDialog(this.f50694c, this.f50693b).show();
            }
        }

        public c(Context context, int i, int i2) {
            this.f50694c = context;
            this.f50695d = i;
            this.f50696e = i2;
        }
    }

    public static class d extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50697a;

        /* renamed from: b  reason: collision with root package name */
        private Context f50698b;

        /* renamed from: c  reason: collision with root package name */
        private int f50699c;

        /* renamed from: d  reason: collision with root package name */
        private n f50700d;

        public final void updateDrawState(TextPaint textPaint) {
            TextPaint textPaint2 = textPaint;
            if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f50697a, false, 50437, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f50697a, false, 50437, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            textPaint2.setColor(this.f50699c);
        }

        public final void onClick(@NotNull View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f50697a, false, 50438, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f50697a, false, 50438, new Class[]{View.class}, Void.TYPE);
                return;
            }
            bc.a(com.ss.android.ugc.aweme.framework.core.a.b().a(), 7, (Object) this.f50700d);
        }

        private d(Context context, int i, n nVar) {
            this.f50698b = context;
            this.f50699c = i;
            this.f50700d = nVar;
        }

        public /* synthetic */ d(Context context, int i, n nVar, byte b2) {
            this(context, i, nVar);
        }
    }

    public static class e extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50701a;

        /* renamed from: b  reason: collision with root package name */
        private int f50702b;

        public e(int i) {
            this.f50702b = i;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f50701a, false, 50440, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f50701a, false, 50440, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.im.sdk.d.a.a().e().updateApk(view.getContext());
            com.ss.android.ugc.aweme.common.r.a("click_update_message", (Map) null);
        }

        public final void updateDrawState(TextPaint textPaint) {
            TextPaint textPaint2 = textPaint;
            if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f50701a, false, 50439, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f50701a, false, 50439, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            textPaint2.setColor(this.f50702b);
            textPaint2.setUnderlineText(false);
        }
    }

    public static void a(SystemContent systemContent, TextView textView, a aVar, String str) {
        TextView textView2 = textView;
        a aVar2 = aVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{systemContent, textView2, aVar2, str2}, null, f50675a, true, 50416, new Class[]{SystemContent.class, TextView.class, a.class, String.class}, Void.TYPE)) {
            Object[] objArr = {systemContent, textView2, aVar2, str2};
            PatchProxy.accessDispatch(objArr, null, f50675a, true, 50416, new Class[]{SystemContent.class, TextView.class, a.class, String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(systemContent.getGroupNoticeTips())) {
            try {
                GroupNoticeContent groupNoticeContent = (GroupNoticeContent) l.a(systemContent.getGroupNoticeTips(), GroupNoticeContent.class);
                if (groupNoticeContent != null && !TextUtils.isEmpty(groupNoticeContent.getNoticeText())) {
                    textView2.setText(groupNoticeContent.getNoticeText());
                    textView2.setVisibility(0);
                }
            } catch (Exception unused) {
            }
        } else {
            if (systemContent.getTemplate() != null && systemContent.getTemplate().length > 0) {
                SystemContent.Key key = systemContent.getTemplate()[0];
                if (key != null && !TextUtils.isEmpty(systemContent.getTemplate()[0].getName())) {
                    aVar2.f50685b = str2;
                    aVar2.f50686c = key;
                    String replace = systemContent.getTips().replace(String.format("{{%s}}", new Object[]{key.getKey()}), key.getName());
                    SpannableString spannableString = new SpannableString(replace);
                    int indexOf = replace.indexOf(key.getName());
                    if (indexOf >= 0) {
                        l.a(spannableString, aVar2, indexOf, key.getName().length() + indexOf, 33);
                        textView2.setText(spannableString);
                        textView2.setMovementMethod(LinkMovementMethod.getInstance());
                        textView2.setOnLongClickListener(new View.OnLongClickListener() {
                            public final boolean onLongClick(View view) {
                                return true;
                            }
                        });
                        textView2.setHighlightColor(-16776961);
                        textView2.setVisibility(0);
                        return;
                    }
                    return;
                }
            }
            if (TextUtils.isEmpty(systemContent.getTips())) {
                textView2.setVisibility(8);
                return;
            }
            textView2.setText(systemContent.getTips());
            textView2.setVisibility(0);
        }
    }

    public static boolean a(TextView textView, String str, String str2, b bVar, b.a aVar) {
        final TextView textView2 = textView;
        String str3 = str;
        b bVar2 = bVar;
        final b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{textView2, str3, str2, bVar2, aVar2}, null, f50675a, true, 50417, new Class[]{TextView.class, String.class, String.class, b.class, b.a.class}, Boolean.TYPE)) {
            Object[] objArr = {textView2, str3, str2, bVar2, aVar2};
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, f50675a, true, 50417, new Class[]{TextView.class, String.class, String.class, b.class, b.a.class}, Boolean.TYPE)).booleanValue();
        }
        SpannableString spannableString = new SpannableString(str3);
        int indexOf = str.indexOf(str2);
        if (indexOf < 0) {
            textView.setText(str);
            return false;
        }
        l.a(spannableString, bVar2, indexOf, str2.length() + indexOf, 33);
        textView2.setText(spannableString);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setOnTouchListener(new View.OnTouchListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f50676a;

            /* renamed from: d  reason: collision with root package name */
            private long f50679d;

            /* renamed from: e  reason: collision with root package name */
            private Handler f50680e;

            /* renamed from: f  reason: collision with root package name */
            private Runnable f50681f;

            private void a() {
                if (PatchProxy.isSupport(new Object[0], this, f50676a, false, 50425, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f50676a, false, 50425, new Class[0], Void.TYPE);
                    return;
                }
                if (!(this.f50680e == null || this.f50681f == null)) {
                    this.f50680e.removeCallbacks(this.f50681f);
                }
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f50676a, false, 50426, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f50676a, false, 50426, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                }
                int action = motionEvent.getAction();
                TextView textView = (TextView) view;
                CharSequence text = textView.getText();
                if (text instanceof SpannableString) {
                    if (action == 0) {
                        a();
                        if (PatchProxy.isSupport(new Object[0], this, f50676a, false, 50424, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f50676a, false, 50424, new Class[0], Void.TYPE);
                        } else {
                            if (this.f50680e == null) {
                                this.f50680e = new Handler(Looper.getMainLooper());
                            }
                            if (this.f50681f == null) {
                                this.f50681f = new Runnable() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f50682a;

                                    public final void run() {
                                        if (PatchProxy.isSupport(new Object[0], this, f50682a, false, 50427, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], this, f50682a, false, 50427, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        if (aVar2 != null) {
                                            aVar2.b(textView2);
                                        }
                                    }
                                };
                            }
                            this.f50680e.postDelayed(this.f50681f, (long) ViewConfiguration.getLongPressTimeout());
                        }
                        this.f50679d = System.currentTimeMillis();
                    } else if (action == 1) {
                        a();
                        int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
                        int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
                        int scrollX = x + textView.getScrollX();
                        int scrollY = y + textView.getScrollY();
                        Layout layout = textView.getLayout();
                        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), (float) scrollX);
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((SpannableString) text).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (System.currentTimeMillis() - this.f50679d < ((long) ViewConfiguration.getLongPressTimeout())) {
                            if (clickableSpanArr.length != 0) {
                                if (aVar2 != null) {
                                    aVar2.a(textView);
                                }
                            } else if (aVar2 != null) {
                                aVar2.a();
                            }
                        }
                    } else if (action == 3) {
                        a();
                    }
                }
                return true;
            }
        });
        textView2.setVisibility(0);
        return true;
    }

    public static void a(Context context, TextView textView, String str, String str2, GroupNoticeContent groupNoticeContent, int i, String str3) {
        int i2;
        Context context2 = context;
        TextView textView2 = textView;
        String str4 = str;
        GroupNoticeContent groupNoticeContent2 = groupNoticeContent;
        int i3 = i;
        String str5 = str3;
        if (PatchProxy.isSupport(new Object[]{context2, textView2, str4, str2, groupNoticeContent2, Integer.valueOf(i), str5}, null, f50675a, true, 50420, new Class[]{Context.class, TextView.class, String.class, String.class, GroupNoticeContent.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, textView2, str4, str2, groupNoticeContent2, Integer.valueOf(i), str5}, null, f50675a, true, 50420, new Class[]{Context.class, TextView.class, String.class, String.class, GroupNoticeContent.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        int color = GlobalContext.getContext().getResources().getColor(C0906R.color.ami);
        SpannableString spannableString = new SpannableString(str4);
        if (!TextUtils.isEmpty(str2) && str.contains(str2)) {
            c cVar = new c(context2, color, i3);
            int indexOf = str.indexOf(str2);
            if (i3 == 100121) {
                cVar.f50693b = str5;
            }
            l.a(spannableString, cVar, indexOf, str2.length() + indexOf, 33);
        }
        if (groupNoticeContent.isNormalOrder()) {
            SpannableString spannableString2 = spannableString;
            String str6 = str;
            GroupNoticeContent groupNoticeContent3 = groupNoticeContent;
            int i4 = i;
            i2 = 0;
            int a2 = a(context, spannableString2, str6, groupNoticeContent2.getActiveText(groupNoticeContent.isDefinedType()), groupNoticeContent.getActiveUsers(), groupNoticeContent3, i4, 0);
            a(context, spannableString2, str6, groupNoticeContent2.getPassiveText(groupNoticeContent.isDefinedType()), groupNoticeContent.getPassiveUsers(), groupNoticeContent3, i4, a2);
        } else {
            i2 = 0;
            SpannableString spannableString3 = spannableString;
            String str7 = str;
            GroupNoticeContent groupNoticeContent4 = groupNoticeContent;
            int i5 = i;
            int a3 = a(context, spannableString3, str7, groupNoticeContent2.getPassiveText(groupNoticeContent.isDefinedType()), groupNoticeContent.getPassiveUsers(), groupNoticeContent4, i5, 0);
            a(context, spannableString3, str7, groupNoticeContent2.getActiveText(groupNoticeContent.isDefinedType()), groupNoticeContent.getActiveUsers(), groupNoticeContent4, i5, a3);
        }
        if (!TextUtils.isEmpty(spannableString)) {
            textView2.setVisibility(i2);
            textView2.setText(spannableString);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    private static int a(Context context, SpannableString spannableString, String str, String str2, List<IMUser> list, GroupNoticeContent groupNoticeContent, int i, int i2) {
        int i3;
        Context context2 = context;
        SpannableString spannableString2 = spannableString;
        String str3 = str;
        String str4 = str2;
        List<IMUser> list2 = list;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{context2, spannableString2, str3, str4, list2, groupNoticeContent, Integer.valueOf(i), Integer.valueOf(i2)}, null, f50675a, true, 50421, new Class[]{Context.class, SpannableString.class, String.class, String.class, List.class, GroupNoticeContent.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2, spannableString2, str3, str4, list2, groupNoticeContent, Integer.valueOf(i), Integer.valueOf(i2)}, null, f50675a, true, 50421, new Class[]{Context.class, SpannableString.class, String.class, String.class, List.class, GroupNoticeContent.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (list2 == null || list.isEmpty()) {
            return i4;
        } else {
            int color = GlobalContext.getContext().getResources().getColor(C0906R.color.ami);
            if (!TextUtils.isEmpty(str2)) {
                i3 = str3.indexOf(str4, i4);
                if (i3 != -1) {
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        IMUser iMUser = list2.get(i5);
                        if (!groupNoticeContent.isDefinedType() || !TextUtils.equals(iMUser.getUid(), com.ss.android.ugc.aweme.im.sdk.utils.d.b().toString())) {
                            String displayName = iMUser.getDisplayName();
                            c cVar = new c(context2, color, i);
                            cVar.f50693b = iMUser.getUid();
                            l.a(spannableString2, cVar, i3, displayName.length() + i3, 17);
                            i3 += displayName.length() + 1;
                        } else {
                            int i6 = i;
                        }
                    }
                }
            } else {
                i3 = i4;
            }
            return i3;
        }
    }
}
