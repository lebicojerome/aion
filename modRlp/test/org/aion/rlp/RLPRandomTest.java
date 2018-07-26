package org.aion.rlp;

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;
import static org.aion.base.util.ByteUtil.byteArrayToInt;
import static org.aion.base.util.ByteUtil.byteArrayToLong;

import java.math.BigInteger;
import org.junit.Test;

public class RLPRandomTest {

//    @Test
//    public void testEncodeByte() {
//        byte input = -1;
//        while (input < Byte.MAX_VALUE) {
//            input++;
//            assertThat(RLP.encode(input)).isEqualTo(RLP.encodeByte(input));
//            assertThat(RLP.encode(input))
//                .isEqualTo(RLP.encode(RLP.decode(RLP.encode(input), 0).getDecoded()));
//
//            Object dec = RLP.decode(RLP.encode(input), 0).getDecoded();
//            byte[] val = dec instanceof byte[] ? (byte[]) dec : new byte[0];
//            assertThat(input).isEqualTo(byteArrayToInt(val));
//        }
//    }
//
//    @Test
//    public void testEncodeShort() {
//        short input = -1;
//        while (input < Short.MAX_VALUE) {
//            input++;
//
//            Object dec = RLP.decode(RLP.encode(input), 0).getDecoded();
//            byte[] val = dec instanceof byte[] ? (byte[]) dec : new byte[0];
//            assertThat(input).isEqualTo(byteArrayToInt(val));
//
//            assertThat(RLP.encode(input))
//                .isEqualTo(RLP.encode(RLP.decode(RLP.encode(input), 0).getDecoded()));
//            assertThat(RLP.encode(input)).isEqualTo(RLP.encodeShort(input));
//        }
//    }
//
//    @Test
//    public void testEncodeInteger() {
//        int input = -1;
//        while (input < Integer.MAX_VALUE) {
//            input++;
//
//            int dec1 = RLP.decodeInt(RLP.encodeInt(input), 0);
//            assertThat(input).isEqualTo(dec1);
//
//            Object dec = RLP.decode(RLP.encode(input), 0).getDecoded();
//            byte[] val = dec instanceof byte[] ? (byte[]) dec : new byte[0];
//            assertThat(input).isEqualTo(byteArrayToInt(val));
//
//            assertThat(RLP.encode(input))
//                .isEqualTo(RLP.encode(RLP.decode(RLP.encode(input), 0).getDecoded()));
//
//            assertThat(RLP.encodeInt(input))
//                .isEqualTo(RLP.encodeInt(RLP.decodeInt(RLP.encodeInt(input), 0)));
//
//            assertThat(RLP.encode(input)).isEqualTo(RLP.encodeInt(input));
//        }
//    }
//
//    @Test
//    public void testEncodeLong() {
//        long input = 4294967295L;
//        while (input > 0) {
//            input++;
//            System.out.println(input);
//
//            Object dec2 = RLP.decode(RLP.encodeLong(input), 0).getDecoded();
//            byte[] val2 = dec2 instanceof byte[] ? (byte[]) dec2 : new byte[0];
//            assertThat(input).isEqualTo(byteArrayToLong(val2));
//
//
//            long dec1 = RLP.decodeLongInt(RLP.encodeLong(input), 0);
//            assertThat(input).isEqualTo(dec1);
//
//            Object dec = RLP.decode(RLP.encode(input), 0).getDecoded();
//            byte[] val = dec instanceof byte[] ? (byte[]) dec : new byte[0];
//            assertThat(input).isEqualTo(byteArrayToLong(val));
//
//            assertThat(RLP.encode(input))
//                .isEqualTo(RLP.encode(RLP.decode(RLP.encode(input), 0).getDecoded()));
//
//            assertThat(RLP.encodeLong(input))
//                .isEqualTo(RLP.encodeLong(RLP.decodeLongInt(RLP.encodeLong(input), 0)));
//
//            assertThat(RLP.encode(input)).isNotEqualTo(RLP.encodeLong(input));
//        }
//
//    }
//
//    @Test
//    public void testEncodeBigInteger() {
//        BigInteger input  =
//            new BigInteger(
//                "9650128800487972697726795438087510101805200020100629942070155319087371611597658887860952245483247188023303607186148645071838189546969115967896446355306572",
//                10);
//        while (true) {
//            input = input.add(BigInteger.valueOf(Long.MAX_VALUE));
//            System.out.println(input);
//
//            Object dec = RLP.decode(RLP.encode(input), 0).getDecoded();
//            byte[] val = dec instanceof byte[] ? (byte[]) dec : new byte[0];
//            assertThat(input).isEqualTo(new BigInteger(1,val));
//
//            assertThat(RLP.encode(input))
//                .isEqualTo(RLP.encode(RLP.decode(RLP.encode(input), 0).getDecoded()));
//
//            assertThat(RLP.encode(input)).isEqualTo(RLP.encodeBigInteger(input));
//        }
//    }
}
