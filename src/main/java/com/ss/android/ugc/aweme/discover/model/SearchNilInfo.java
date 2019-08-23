package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0011R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/SearchNilInfo;", "Ljava/io/Serializable;", "()V", "nilItem", "", "getNilItem", "()Ljava/lang/String;", "setNilItem", "(Ljava/lang/String;)V", "textType", "", "getTextType", "()Ljava/lang/Integer;", "setTextType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "isHate", "", "isHitLimit", "isSensitive", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchNilInfo implements Serializable {
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String HIT_HEAT_SPEECH = HIT_HEAT_SPEECH;
    @NotNull
    public static final String HIT_LIMIT = HIT_LIMIT;
    public static final int HIT_TYPE_SENSITIVE = 12;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("search_nil_item")
    @Nullable
    private String nilItem;
    @SerializedName("text_type")
    @Nullable
    private Integer textType;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/SearchNilInfo$Companion;", "", "()V", "HIT_HEAT_SPEECH", "", "getHIT_HEAT_SPEECH", "()Ljava/lang/String;", "HIT_LIMIT", "getHIT_LIMIT", "HIT_TYPE_SENSITIVE", "", "getHIT_TYPE_SENSITIVE", "()I", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        @NotNull
        public final String getHIT_HEAT_SPEECH() {
            return SearchNilInfo.HIT_HEAT_SPEECH;
        }

        @NotNull
        public final String getHIT_LIMIT() {
            return SearchNilInfo.HIT_LIMIT;
        }

        public final int getHIT_TYPE_SENSITIVE() {
            return SearchNilInfo.HIT_TYPE_SENSITIVE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Nullable
    public final String getNilItem() {
        return this.nilItem;
    }

    @Nullable
    public final Integer getTextType() {
        return this.textType;
    }

    public final boolean isHate() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37114, new Class[0], Boolean.TYPE)) {
            return HIT_HEAT_SPEECH.equals(this.nilItem);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37114, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean isHitLimit() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37113, new Class[0], Boolean.TYPE)) {
            return HIT_LIMIT.equals(this.nilItem);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37113, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean isSensitive() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37115, new Class[0], Boolean.TYPE)) {
            return Integer.valueOf(HIT_TYPE_SENSITIVE).equals(this.textType);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37115, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void setNilItem(@Nullable String str) {
        this.nilItem = str;
    }

    public final void setTextType(@Nullable Integer num) {
        this.textType = num;
    }
}
