package com.ss.android.ugc.aweme.longvideo.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/utils/TimeConversion;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f53897a = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006J\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/utils/TimeConversion$Companion;", "", "()V", "convert2TimeString", "", "time", "", "format", "getSecond", "duration", "progress2Time", "", "progress", "", "totalTime", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53898a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static int b(int i) {
            if (i <= 0) {
                return 0;
            }
            return i / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        }

        private final String c(int i) {
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f53898a, false, 56769, new Class[]{Integer.TYPE}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f53898a, false, 56769, new Class[]{Integer.TYPE}, String.class);
            } else if (i2 >= 10) {
                return String.valueOf(i);
            } else {
                return PushConstants.PUSH_TYPE_NOTIFY + i2;
            }
        }

        @NotNull
        public final String a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f53898a, false, 56768, new Class[]{Integer.TYPE}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f53898a, false, 56768, new Class[]{Integer.TYPE}, String.class);
            }
            StringBuilder sb = new StringBuilder();
            a aVar = this;
            sb.append(aVar.c(i / 60));
            sb.append(':');
            sb.append(aVar.c(i % 60));
            return sb.toString();
        }

        @Nullable
        public final CharSequence a(float f2, int i) {
            if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Integer.valueOf(i)}, this, f53898a, false, 56770, new Class[]{Float.TYPE, Integer.TYPE}, CharSequence.class)) {
                return a((int) ((((float) i) * f2) / 100.0f));
            }
            return (CharSequence) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Integer.valueOf(i)}, this, f53898a, false, 56770, new Class[]{Float.TYPE, Integer.TYPE}, CharSequence.class);
        }
    }
}
