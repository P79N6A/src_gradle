package com.ss.android.ugc.aweme.commerce.service.i;

import android.support.v4.app.Fragment;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/preview/SkuPanelData;", "", "hostType", "", "fragment", "Landroid/support/v4/app/Fragment;", "requestCode", "(ILandroid/support/v4/app/Fragment;Ljava/lang/Integer;)V", "getFragment", "()Landroid/support/v4/app/Fragment;", "setFragment", "(Landroid/support/v4/app/Fragment;)V", "getHostType", "()I", "setHostType", "(I)V", "getRequestCode", "()Ljava/lang/Integer;", "setRequestCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C0497a f37972d = new C0497a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f37973a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public Fragment f37974b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public Integer f37975c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/preview/SkuPanelData$Companion;", "", "()V", "HOST_TYPE_DIALOG", "", "HOST_TYPE_SKU_CARD", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.service.i.a$a  reason: collision with other inner class name */
    public static final class C0497a {
        private C0497a() {
        }

        public /* synthetic */ C0497a(byte b2) {
            this();
        }
    }

    public a() {
        this(0, null, null, 7);
    }

    public a(int i, @Nullable Fragment fragment, @Nullable Integer num) {
        this.f37973a = i;
        this.f37974b = fragment;
        this.f37975c = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, Fragment fragment, Integer num, int i2) {
        this((i2 & 1) != 0 ? 1 : i, null, (i2 & 4) != 0 ? 0 : num);
    }
}
