package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import com.bytedance.im.core.d.n;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareGoodContent;
import com.taobao.android.dexposed.ClassUtils;
import java.text.DecimalFormat;
import java.util.Locale;

public class ShareGoodViewHolder extends ShareSimpleBaseViewHolder {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f51110b;

    public ShareGoodViewHolder(View view, int i) {
        super(view, i);
    }

    public void a(n nVar, n nVar2, BaseContent baseContent, int i) {
        BaseContent baseContent2 = baseContent;
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, baseContent2, Integer.valueOf(i)}, this, f51110b, false, 51547, new Class[]{n.class, n.class, BaseContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, baseContent2, Integer.valueOf(i)}, this, f51110b, false, 51547, new Class[]{n.class, n.class, BaseContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, baseContent, i);
        if (baseContent2 instanceof ShareGoodContent) {
            ShareGoodContent shareGoodContent = (ShareGoodContent) baseContent2;
            this.s.setText(shareGoodContent.getTitle());
            this.t.setVisibility(0);
            String valueOf = String.valueOf(shareGoodContent.getUserCount());
            if (shareGoodContent.getUserCount() >= 10000) {
                DecimalFormat decimalFormat = new DecimalFormat("0.0");
                double userCount = (double) shareGoodContent.getUserCount();
                Double.isNaN(userCount);
                String format = decimalFormat.format(userCount / 10000.0d);
                if (format.endsWith(PushConstants.PUSH_TYPE_NOTIFY) && format.contains(ClassUtils.PACKAGE_SEPARATOR)) {
                    format = format.substring(0, format.indexOf(ClassUtils.PACKAGE_SEPARATOR));
                }
                valueOf = format + "w";
            }
            this.t.setText(String.format(Locale.getDefault(), this.t.getContext().getString(C0906R.string.arx), new Object[]{valueOf}));
            this.u.setText(C0906R.string.arw);
            ((GenericDraweeHierarchy) this.r.getHierarchy()).setPlaceholderImage(2130840152);
            c.b(this.r, shareGoodContent.getAvatar());
            this.i.setTag(50331648, 34);
            this.i.setTag(67108864, shareGoodContent);
        }
    }
}
