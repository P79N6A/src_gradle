package com.bytedance.android.livesdk.message.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class FansclubRecruit extends Message<FansclubRecruit, Builder> {
    public static final ProtoAdapter<FansclubRecruit> ADAPTER = new ProtoAdapter_FansclubRecruit();
    public static final Integer DEFAULT_TYPE = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.FansclubRecruit$Progress#ADAPTER", tag = 3)
    public final Progress progress;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer type;

    public static final class Progress extends Message<Progress, Builder> {
        public static final ProtoAdapter<Progress> ADAPTER = new ProtoAdapter_Progress();
        public static final Long DEFAULT_CURRENT = 0L;
        public static final Long DEFAULT_FIRST_GIFT_TODAY = 0L;
        public static final Long DEFAULT_TARGET = 0L;
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final long serialVersionUID = 0;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
        public final Long current;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
        public final Long first_gift_today;
        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
        public final Long target;

        public static final class Builder extends Message.Builder<Progress, Builder> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public Long current;
            public Long first_gift_today;
            public Long target;

            public final Progress build() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11392, new Class[0], Progress.class)) {
                    return new Progress(this.target, this.current, this.first_gift_today, super.buildUnknownFields());
                }
                return (Progress) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11392, new Class[0], Progress.class);
            }

            public final Builder current(Long l) {
                this.current = l;
                return this;
            }

            public final Builder first_gift_today(Long l) {
                this.first_gift_today = l;
                return this;
            }

            public final Builder target(Long l) {
                this.target = l;
                return this;
            }
        }

        static final class ProtoAdapter_Progress extends ProtoAdapter<Progress> {
            public static ChangeQuickRedirect changeQuickRedirect;

            ProtoAdapter_Progress() {
                super(FieldEncoding.LENGTH_DELIMITED, Progress.class);
            }

            public final int encodedSize(Progress progress) {
                int i;
                int i2;
                Progress progress2 = progress;
                int i3 = 0;
                if (PatchProxy.isSupport(new Object[]{progress2}, this, changeQuickRedirect, false, 11393, new Class[]{Progress.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{progress2}, this, changeQuickRedirect, false, 11393, new Class[]{Progress.class}, Integer.TYPE)).intValue();
                }
                if (progress2.target != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, progress2.target);
                } else {
                    i = 0;
                }
                if (progress2.current != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, progress2.current);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (progress2.first_gift_today != null) {
                    i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, progress2.first_gift_today);
                }
                return i4 + i3 + progress.unknownFields().size();
            }

            public final Progress redact(Progress progress) {
                if (PatchProxy.isSupport(new Object[]{progress}, this, changeQuickRedirect, false, 11396, new Class[]{Progress.class}, Progress.class)) {
                    return (Progress) PatchProxy.accessDispatch(new Object[]{progress}, this, changeQuickRedirect, false, 11396, new Class[]{Progress.class}, Progress.class);
                }
                Builder newBuilder = progress.newBuilder();
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }

            public final Progress decode(ProtoReader protoReader) throws IOException {
                ProtoReader protoReader2 = protoReader;
                if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11395, new Class[]{ProtoReader.class}, Progress.class)) {
                    return (Progress) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11395, new Class[]{ProtoReader.class}, Progress.class);
                }
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.target((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 2:
                                builder.current((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            case 3:
                                builder.first_gift_today((Long) ProtoAdapter.INT64.decode(protoReader2));
                                break;
                            default:
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                        }
                    } else {
                        protoReader2.endMessage(beginMessage);
                        return builder.build();
                    }
                }
            }

            public final void encode(ProtoWriter protoWriter, Progress progress) throws IOException {
                ProtoWriter protoWriter2 = protoWriter;
                Progress progress2 = progress;
                if (PatchProxy.isSupport(new Object[]{protoWriter2, progress2}, this, changeQuickRedirect, false, 11394, new Class[]{ProtoWriter.class, Progress.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{protoWriter2, progress2}, this, changeQuickRedirect, false, 11394, new Class[]{ProtoWriter.class, Progress.class}, Void.TYPE);
                    return;
                }
                if (progress2.target != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 1, progress2.target);
                }
                if (progress2.current != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 2, progress2.current);
                }
                if (progress2.first_gift_today != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, progress2.first_gift_today);
                }
                protoWriter2.writeBytes(progress.unknownFields());
            }
        }

        public final Builder newBuilder() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11388, new Class[0], Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11388, new Class[0], Builder.class);
            }
            Builder builder = new Builder();
            builder.target = this.target;
            builder.current = this.current;
            builder.first_gift_today = this.first_gift_today;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11390, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11390, new Class[0], Integer.TYPE)).intValue();
            }
            int i4 = this.hashCode;
            if (i4 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                if (this.target != null) {
                    i = this.target.hashCode();
                } else {
                    i = 0;
                }
                int i5 = (hashCode + i) * 37;
                if (this.current != null) {
                    i2 = this.current.hashCode();
                } else {
                    i2 = 0;
                }
                int i6 = (i5 + i2) * 37;
                if (this.first_gift_today != null) {
                    i3 = this.first_gift_today.hashCode();
                }
                i4 = i6 + i3;
                this.hashCode = i4;
            }
            return i4;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11391, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11391, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            if (this.target != null) {
                sb.append(", target=");
                sb.append(this.target);
            }
            if (this.current != null) {
                sb.append(", current=");
                sb.append(this.current);
            }
            if (this.first_gift_today != null) {
                sb.append(", first_gift_today=");
                sb.append(this.first_gift_today);
            }
            StringBuilder replace = sb.replace(0, 2, "Progress{");
            replace.append('}');
            return replace.toString();
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11389, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11389, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (obj == this) {
                return true;
            } else {
                if (!(obj instanceof Progress)) {
                    return false;
                }
                Progress progress = (Progress) obj;
                if (!unknownFields().equals(progress.unknownFields()) || !Internal.equals(this.target, progress.target) || !Internal.equals(this.current, progress.current) || !Internal.equals(this.first_gift_today, progress.first_gift_today)) {
                    return false;
                }
                return true;
            }
        }

        public Progress(Long l, Long l2, Long l3) {
            this(l, l2, l3, ByteString.EMPTY);
        }

        public Progress(Long l, Long l2, Long l3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.target = l;
            this.current = l2;
            this.first_gift_today = l3;
        }
    }

    public static final class Builder extends Message.Builder<FansclubRecruit, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Common common;
        public Progress progress;
        public Integer type;

        public final FansclubRecruit build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11387, new Class[0], FansclubRecruit.class)) {
                return new FansclubRecruit(this.common, this.type, this.progress, super.buildUnknownFields());
            }
            return (FansclubRecruit) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11387, new Class[0], FansclubRecruit.class);
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder progress(Progress progress2) {
            this.progress = progress2;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }
    }

    static final class ProtoAdapter_FansclubRecruit extends ProtoAdapter<FansclubRecruit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_FansclubRecruit() {
            super(FieldEncoding.LENGTH_DELIMITED, FansclubRecruit.class);
        }

        public final int encodedSize(FansclubRecruit fansclubRecruit) {
            int i;
            int i2;
            FansclubRecruit fansclubRecruit2 = fansclubRecruit;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[]{fansclubRecruit2}, this, changeQuickRedirect, false, 11397, new Class[]{FansclubRecruit.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{fansclubRecruit2}, this, changeQuickRedirect, false, 11397, new Class[]{FansclubRecruit.class}, Integer.TYPE)).intValue();
            }
            if (fansclubRecruit2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, fansclubRecruit2.common);
            } else {
                i = 0;
            }
            if (fansclubRecruit2.type != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, fansclubRecruit2.type);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (fansclubRecruit2.progress != null) {
                i3 = Progress.ADAPTER.encodedSizeWithTag(3, fansclubRecruit2.progress);
            }
            return i4 + i3 + fansclubRecruit.unknownFields().size();
        }

        public final FansclubRecruit redact(FansclubRecruit fansclubRecruit) {
            if (PatchProxy.isSupport(new Object[]{fansclubRecruit}, this, changeQuickRedirect, false, 11400, new Class[]{FansclubRecruit.class}, FansclubRecruit.class)) {
                return (FansclubRecruit) PatchProxy.accessDispatch(new Object[]{fansclubRecruit}, this, changeQuickRedirect, false, 11400, new Class[]{FansclubRecruit.class}, FansclubRecruit.class);
            }
            Builder newBuilder = fansclubRecruit.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            if (newBuilder.progress != null) {
                newBuilder.progress = (Progress) Progress.ADAPTER.redact(newBuilder.progress);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final FansclubRecruit decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11399, new Class[]{ProtoReader.class}, FansclubRecruit.class)) {
                return (FansclubRecruit) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 11399, new Class[]{ProtoReader.class}, FansclubRecruit.class);
            }
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.common((Common) Common.ADAPTER.decode(protoReader2));
                            break;
                        case 2:
                            builder.type((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 3:
                            builder.progress((Progress) Progress.ADAPTER.decode(protoReader2));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                            break;
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, FansclubRecruit fansclubRecruit) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            FansclubRecruit fansclubRecruit2 = fansclubRecruit;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, fansclubRecruit2}, this, changeQuickRedirect, false, 11398, new Class[]{ProtoWriter.class, FansclubRecruit.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, fansclubRecruit2}, this, changeQuickRedirect, false, 11398, new Class[]{ProtoWriter.class, FansclubRecruit.class}, Void.TYPE);
                return;
            }
            if (fansclubRecruit2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, fansclubRecruit2.common);
            }
            if (fansclubRecruit2.type != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, fansclubRecruit2.type);
            }
            if (fansclubRecruit2.progress != null) {
                Progress.ADAPTER.encodeWithTag(protoWriter2, 3, fansclubRecruit2.progress);
            }
            protoWriter2.writeBytes(fansclubRecruit.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11383, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11383, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.type = this.type;
        builder.progress = this.progress;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11385, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11385, new Class[0], Integer.TYPE)).intValue();
        }
        int i4 = this.hashCode;
        if (i4 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i5 = (hashCode + i) * 37;
            if (this.type != null) {
                i2 = this.type.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            if (this.progress != null) {
                i3 = this.progress.hashCode();
            }
            i4 = i6 + i3;
            this.hashCode = i4;
        }
        return i4;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11386, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11386, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.progress != null) {
            sb.append(", progress=");
            sb.append(this.progress);
        }
        StringBuilder replace = sb.replace(0, 2, "FansclubRecruit{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 11384, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 11384, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof FansclubRecruit)) {
                return false;
            }
            FansclubRecruit fansclubRecruit = (FansclubRecruit) obj;
            if (!unknownFields().equals(fansclubRecruit.unknownFields()) || !Internal.equals(this.common, fansclubRecruit.common) || !Internal.equals(this.type, fansclubRecruit.type) || !Internal.equals(this.progress, fansclubRecruit.progress)) {
                return false;
            }
            return true;
        }
    }

    public FansclubRecruit(Common common2, Integer num, Progress progress2) {
        this(common2, num, progress2, ByteString.EMPTY);
    }

    public FansclubRecruit(Common common2, Integer num, Progress progress2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.type = num;
        this.progress = progress2;
    }
}
