package com.ss.android.ugc.aweme.commercialize.coupon.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/coupon/model/CouponPayType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "FREE_COUPON", "PAY_COUPON", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public enum f {
    FREE_COUPON(1),
    PAY_COUPON(2);
    
    public static final a Companion = null;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/coupon/model/CouponPayType$Companion;", "", "()V", "getPayType", "Lcom/ss/android/ugc/aweme/commercialize/coupon/model/CouponPayType;", "type", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38591a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @NotNull
        public final f a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f38591a, false, 30449, new Class[]{Integer.TYPE}, f.class)) {
                return (f) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f38591a, false, 30449, new Class[]{Integer.TYPE}, f.class);
            }
            for (f fVar : f.values()) {
                if (fVar.getValue() == i) {
                    return fVar;
                }
            }
            return f.FREE_COUPON;
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        Companion = new a((byte) 0);
    }

    private f(int i) {
        this.value = i;
    }
}
