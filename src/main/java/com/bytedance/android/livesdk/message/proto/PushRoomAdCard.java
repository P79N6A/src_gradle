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
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.io.IOException;
import okio.ByteString;

public final class PushRoomAdCard extends Message<PushRoomAdCard, Builder> {
    public static final ProtoAdapter<PushRoomAdCard> ADAPTER = new ProtoAdapter_PushRoomAdCard();
    public static final Integer DEFAULT_ADCARD_TYPE = 0;
    public static final Integer DEFAULT_HOTVALUE = 0;
    public static final Boolean DEFAULT_IS_FINISHED = Boolean.FALSE;
    public static final Long DEFAULT_SHOW_NUM = 0L;
    public static final Long DEFAULT_TARGET_NUM = 0L;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String action_content;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public final Integer adcard_type;
    @WireField(adapter = "com.bytedance.android.livesdk.message.proto.Common#ADAPTER", tag = 1)
    public final Common common;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String content;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 8)
    public final Integer hotvalue;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 6)
    public final Boolean is_finished;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long show_num;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long target_num;

    public static final class Builder extends Message.Builder<PushRoomAdCard, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String action_content;
        public Integer adcard_type;
        public Common common;
        public String content;
        public Integer hotvalue;
        public Boolean is_finished;
        public Long show_num;
        public Long target_num;

        public final PushRoomAdCard build() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12021, new Class[0], PushRoomAdCard.class)) {
                return (PushRoomAdCard) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12021, new Class[0], PushRoomAdCard.class);
            }
            PushRoomAdCard pushRoomAdCard = new PushRoomAdCard(this.common, this.action_content, this.content, this.target_num, this.show_num, this.is_finished, this.adcard_type, this.hotvalue, super.buildUnknownFields());
            return pushRoomAdCard;
        }

        public final Builder action_content(String str) {
            this.action_content = str;
            return this;
        }

        public final Builder adcard_type(Integer num) {
            this.adcard_type = num;
            return this;
        }

        public final Builder common(Common common2) {
            this.common = common2;
            return this;
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder hotvalue(Integer num) {
            this.hotvalue = num;
            return this;
        }

        public final Builder is_finished(Boolean bool) {
            this.is_finished = bool;
            return this;
        }

        public final Builder show_num(Long l) {
            this.show_num = l;
            return this;
        }

        public final Builder target_num(Long l) {
            this.target_num = l;
            return this;
        }
    }

    static final class ProtoAdapter_PushRoomAdCard extends ProtoAdapter<PushRoomAdCard> {
        public static ChangeQuickRedirect changeQuickRedirect;

        ProtoAdapter_PushRoomAdCard() {
            super(FieldEncoding.LENGTH_DELIMITED, PushRoomAdCard.class);
        }

        public final PushRoomAdCard redact(PushRoomAdCard pushRoomAdCard) {
            if (PatchProxy.isSupport(new Object[]{pushRoomAdCard}, this, changeQuickRedirect, false, 12025, new Class[]{PushRoomAdCard.class}, PushRoomAdCard.class)) {
                return (PushRoomAdCard) PatchProxy.accessDispatch(new Object[]{pushRoomAdCard}, this, changeQuickRedirect, false, 12025, new Class[]{PushRoomAdCard.class}, PushRoomAdCard.class);
            }
            Builder newBuilder = pushRoomAdCard.newBuilder();
            if (newBuilder.common != null) {
                newBuilder.common = (Common) Common.ADAPTER.redact(newBuilder.common);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final PushRoomAdCard decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12024, new Class[]{ProtoReader.class}, PushRoomAdCard.class)) {
                return (PushRoomAdCard) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 12024, new Class[]{ProtoReader.class}, PushRoomAdCard.class);
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
                            builder.action_content((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 3:
                            builder.content((String) ProtoAdapter.STRING.decode(protoReader2));
                            break;
                        case 4:
                            builder.target_num((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 5:
                            builder.show_num((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        case 6:
                            builder.is_finished((Boolean) ProtoAdapter.BOOL.decode(protoReader2));
                            break;
                        case e.l /*7*/:
                            builder.adcard_type((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 8:
                            builder.hotvalue((Integer) ProtoAdapter.INT32.decode(protoReader2));
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

        public final int encodedSize(PushRoomAdCard pushRoomAdCard) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            PushRoomAdCard pushRoomAdCard2 = pushRoomAdCard;
            int i8 = 0;
            if (PatchProxy.isSupport(new Object[]{pushRoomAdCard2}, this, changeQuickRedirect, false, 12022, new Class[]{PushRoomAdCard.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{pushRoomAdCard2}, this, changeQuickRedirect, false, 12022, new Class[]{PushRoomAdCard.class}, Integer.TYPE)).intValue();
            }
            if (pushRoomAdCard2.common != null) {
                i = Common.ADAPTER.encodedSizeWithTag(1, pushRoomAdCard2.common);
            } else {
                i = 0;
            }
            if (pushRoomAdCard2.action_content != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, pushRoomAdCard2.action_content);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (pushRoomAdCard2.content != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, pushRoomAdCard2.content);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (pushRoomAdCard2.target_num != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, pushRoomAdCard2.target_num);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (pushRoomAdCard2.show_num != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, pushRoomAdCard2.show_num);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (pushRoomAdCard2.is_finished != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, pushRoomAdCard2.is_finished);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (pushRoomAdCard2.adcard_type != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(7, pushRoomAdCard2.adcard_type);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (pushRoomAdCard2.hotvalue != null) {
                i8 = ProtoAdapter.INT32.encodedSizeWithTag(8, pushRoomAdCard2.hotvalue);
            }
            return i14 + i8 + pushRoomAdCard.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, PushRoomAdCard pushRoomAdCard) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            PushRoomAdCard pushRoomAdCard2 = pushRoomAdCard;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, pushRoomAdCard2}, this, changeQuickRedirect, false, 12023, new Class[]{ProtoWriter.class, PushRoomAdCard.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, pushRoomAdCard2}, this, changeQuickRedirect, false, 12023, new Class[]{ProtoWriter.class, PushRoomAdCard.class}, Void.TYPE);
                return;
            }
            if (pushRoomAdCard2.common != null) {
                Common.ADAPTER.encodeWithTag(protoWriter2, 1, pushRoomAdCard2.common);
            }
            if (pushRoomAdCard2.action_content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 2, pushRoomAdCard2.action_content);
            }
            if (pushRoomAdCard2.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter2, 3, pushRoomAdCard2.content);
            }
            if (pushRoomAdCard2.target_num != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 4, pushRoomAdCard2.target_num);
            }
            if (pushRoomAdCard2.show_num != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter2, 5, pushRoomAdCard2.show_num);
            }
            if (pushRoomAdCard2.is_finished != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter2, 6, pushRoomAdCard2.is_finished);
            }
            if (pushRoomAdCard2.adcard_type != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 7, pushRoomAdCard2.adcard_type);
            }
            if (pushRoomAdCard2.hotvalue != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter2, 8, pushRoomAdCard2.hotvalue);
            }
            protoWriter2.writeBytes(pushRoomAdCard.unknownFields());
        }
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12017, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12017, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.common = this.common;
        builder.action_content = this.action_content;
        builder.content = this.content;
        builder.target_num = this.target_num;
        builder.show_num = this.show_num;
        builder.is_finished = this.is_finished;
        builder.adcard_type = this.adcard_type;
        builder.hotvalue = this.hotvalue;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12019, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12019, new Class[0], Integer.TYPE)).intValue();
        }
        int i9 = this.hashCode;
        if (i9 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.common != null) {
                i = this.common.hashCode();
            } else {
                i = 0;
            }
            int i10 = (hashCode + i) * 37;
            if (this.action_content != null) {
                i2 = this.action_content.hashCode();
            } else {
                i2 = 0;
            }
            int i11 = (i10 + i2) * 37;
            if (this.content != null) {
                i3 = this.content.hashCode();
            } else {
                i3 = 0;
            }
            int i12 = (i11 + i3) * 37;
            if (this.target_num != null) {
                i4 = this.target_num.hashCode();
            } else {
                i4 = 0;
            }
            int i13 = (i12 + i4) * 37;
            if (this.show_num != null) {
                i5 = this.show_num.hashCode();
            } else {
                i5 = 0;
            }
            int i14 = (i13 + i5) * 37;
            if (this.is_finished != null) {
                i6 = this.is_finished.hashCode();
            } else {
                i6 = 0;
            }
            int i15 = (i14 + i6) * 37;
            if (this.adcard_type != null) {
                i7 = this.adcard_type.hashCode();
            } else {
                i7 = 0;
            }
            int i16 = (i15 + i7) * 37;
            if (this.hotvalue != null) {
                i8 = this.hotvalue.hashCode();
            }
            i9 = i16 + i8;
            this.hashCode = i9;
        }
        return i9;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12020, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12020, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.common != null) {
            sb.append(", common=");
            sb.append(this.common);
        }
        if (this.action_content != null) {
            sb.append(", action_content=");
            sb.append(this.action_content);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.target_num != null) {
            sb.append(", target_num=");
            sb.append(this.target_num);
        }
        if (this.show_num != null) {
            sb.append(", show_num=");
            sb.append(this.show_num);
        }
        if (this.is_finished != null) {
            sb.append(", is_finished=");
            sb.append(this.is_finished);
        }
        if (this.adcard_type != null) {
            sb.append(", adcard_type=");
            sb.append(this.adcard_type);
        }
        if (this.hotvalue != null) {
            sb.append(", hotvalue=");
            sb.append(this.hotvalue);
        }
        StringBuilder replace = sb.replace(0, 2, "PushRoomAdCard{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 12018, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 12018, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof PushRoomAdCard)) {
                return false;
            }
            PushRoomAdCard pushRoomAdCard = (PushRoomAdCard) obj;
            if (!unknownFields().equals(pushRoomAdCard.unknownFields()) || !Internal.equals(this.common, pushRoomAdCard.common) || !Internal.equals(this.action_content, pushRoomAdCard.action_content) || !Internal.equals(this.content, pushRoomAdCard.content) || !Internal.equals(this.target_num, pushRoomAdCard.target_num) || !Internal.equals(this.show_num, pushRoomAdCard.show_num) || !Internal.equals(this.is_finished, pushRoomAdCard.is_finished) || !Internal.equals(this.adcard_type, pushRoomAdCard.adcard_type) || !Internal.equals(this.hotvalue, pushRoomAdCard.hotvalue)) {
                return false;
            }
            return true;
        }
    }

    public PushRoomAdCard(Common common2, String str, String str2, Long l, Long l2, Boolean bool, Integer num, Integer num2) {
        this(common2, str, str2, l, l2, bool, num, num2, ByteString.EMPTY);
    }

    public PushRoomAdCard(Common common2, String str, String str2, Long l, Long l2, Boolean bool, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common = common2;
        this.action_content = str;
        this.content = str2;
        this.target_num = l;
        this.show_num = l2;
        this.is_finished = bool;
        this.adcard_type = num;
        this.hotvalue = num2;
    }
}
