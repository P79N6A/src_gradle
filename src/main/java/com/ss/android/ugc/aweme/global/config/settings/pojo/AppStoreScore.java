package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.KtNullable;
import com.bytedance.ies.c.a;
import com.bytedance.ies.c.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class AppStoreScore extends Message<AppStoreScore, Builder> {
    public static final DefaultValueProtoAdapter<AppStoreScore> ADAPTER = new ProtoAdapter_AppStoreScore();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer section;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer switch_;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer threshold;

    public static final class Builder extends Message.Builder<AppStoreScore, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer section;
        public Integer switch_;
        public Integer threshold;

        public final AppStoreScore build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47680, new Class[0], AppStoreScore.class)) {
                return new AppStoreScore(this.switch_, this.section, this.threshold, super.buildUnknownFields());
            }
            return (AppStoreScore) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47680, new Class[0], AppStoreScore.class);
        }

        public final Builder section(Integer num) {
            this.section = num;
            return this;
        }

        public final Builder switch_(Integer num) {
            this.switch_ = num;
            return this;
        }

        public final Builder threshold(Integer num) {
            this.threshold = num;
            return this;
        }
    }

    static final class ProtoAdapter_AppStoreScore extends DefaultValueProtoAdapter<AppStoreScore> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final AppStoreScore redact(AppStoreScore appStoreScore) {
            return appStoreScore;
        }

        public ProtoAdapter_AppStoreScore() {
            super(FieldEncoding.LENGTH_DELIMITED, AppStoreScore.class);
        }

        public final AppStoreScore decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47683, new Class[]{ProtoReader.class}, AppStoreScore.class)) {
                return decode(protoReader2, (AppStoreScore) null);
            }
            return (AppStoreScore) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 47683, new Class[]{ProtoReader.class}, AppStoreScore.class);
        }

        public final int encodedSize(AppStoreScore appStoreScore) {
            AppStoreScore appStoreScore2 = appStoreScore;
            if (!PatchProxy.isSupport(new Object[]{appStoreScore2}, this, changeQuickRedirect, false, 47681, new Class[]{AppStoreScore.class}, Integer.TYPE)) {
                return ProtoAdapter.INT32.encodedSizeWithTag(1, appStoreScore2.switch_) + ProtoAdapter.INT32.encodedSizeWithTag(2, appStoreScore2.section) + ProtoAdapter.INT32.encodedSizeWithTag(3, appStoreScore2.threshold) + appStoreScore.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{appStoreScore2}, this, changeQuickRedirect, false, 47681, new Class[]{AppStoreScore.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, AppStoreScore appStoreScore) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            AppStoreScore appStoreScore2 = appStoreScore;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, appStoreScore2}, this, changeQuickRedirect, false, 47682, new Class[]{ProtoWriter.class, AppStoreScore.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, appStoreScore2}, this, changeQuickRedirect, false, 47682, new Class[]{ProtoWriter.class, AppStoreScore.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1, appStoreScore2.switch_);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, appStoreScore2.section);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 3, appStoreScore2.threshold);
            protoWriter2.writeBytes(appStoreScore.unknownFields());
        }

        public final AppStoreScore decode(ProtoReader protoReader, AppStoreScore appStoreScore) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            AppStoreScore appStoreScore2 = appStoreScore;
            if (PatchProxy.isSupport(new Object[]{protoReader2, appStoreScore2}, this, changeQuickRedirect, false, 47684, new Class[]{ProtoReader.class, AppStoreScore.class}, AppStoreScore.class)) {
                return (AppStoreScore) PatchProxy.accessDispatch(new Object[]{protoReader2, appStoreScore2}, this, changeQuickRedirect, false, 47684, new Class[]{ProtoReader.class, AppStoreScore.class}, AppStoreScore.class);
            }
            AppStoreScore appStoreScore3 = (AppStoreScore) a.a().a(AppStoreScore.class, appStoreScore2);
            if (appStoreScore3 != null) {
                builder = appStoreScore3.newBuilder();
            } else {
                builder = new Builder();
            }
            Builder builder2 = builder;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder2.switch_((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 2:
                            builder2.section((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 3:
                            builder2.threshold((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (appStoreScore3 != null) {
                                    break;
                                } else {
                                    throw e2;
                                }
                            }
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    return builder2.build();
                }
            }
        }
    }

    @KtNullable
    public final Integer getSection() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47674, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47674, new Class[0], Integer.class);
        } else if (this.section != null) {
            return this.section;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getSwitch() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47673, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47673, new Class[0], Integer.class);
        } else if (this.switch_ != null) {
            return this.switch_;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getThreshold() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47675, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47675, new Class[0], Integer.class);
        } else if (this.threshold != null) {
            return this.threshold;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47678, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47678, new Class[0], Integer.TYPE)).intValue();
        }
        int i4 = this.hashCode;
        if (i4 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.switch_ != null) {
                i = this.switch_.hashCode();
            } else {
                i = 0;
            }
            int i5 = (hashCode + i) * 37;
            if (this.section != null) {
                i2 = this.section.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            if (this.threshold != null) {
                i3 = this.threshold.hashCode();
            }
            i4 = i6 + i3;
            this.hashCode = i4;
        }
        return i4;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47676, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47676, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.switch_ = this.switch_;
        builder.section = this.section;
        builder.threshold = this.threshold;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47679, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47679, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.switch_ != null) {
            sb.append(", switch=");
            sb.append(this.switch_);
        }
        if (this.section != null) {
            sb.append(", section=");
            sb.append(this.section);
        }
        if (this.threshold != null) {
            sb.append(", threshold=");
            sb.append(this.threshold);
        }
        StringBuilder replace = sb.replace(0, 2, "AppStoreScore{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 47677, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 47677, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof AppStoreScore)) {
                return false;
            }
            AppStoreScore appStoreScore = (AppStoreScore) obj;
            if (!unknownFields().equals(appStoreScore.unknownFields()) || !Internal.equals(this.switch_, appStoreScore.switch_) || !Internal.equals(this.section, appStoreScore.section) || !Internal.equals(this.threshold, appStoreScore.threshold)) {
                return false;
            }
            return true;
        }
    }

    public AppStoreScore(Integer num, Integer num2, Integer num3) {
        this(num, num2, num3, ByteString.EMPTY);
    }

    public AppStoreScore(Integer num, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.switch_ = num;
        this.section = num2;
        this.threshold = num3;
    }
}
