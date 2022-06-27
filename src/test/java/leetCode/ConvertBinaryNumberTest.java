package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertBinaryNumberTest {

    @Test
    public void getDecimalValue() {
        var listNode = new ConvertBinaryNumber.ListNode(
                1, new ConvertBinaryNumber.ListNode(0, new ConvertBinaryNumber.ListNode(1)));
        var result = ConvertBinaryNumber.getDecimalValue(listNode);
        assertEquals(5, result);
    }

    //[10100111011000000001]
    @Test
    public void getDecimalValueFromLongList() {
        var listNode = new ConvertBinaryNumber.ListNode(
                1, new ConvertBinaryNumber.ListNode(0, new ConvertBinaryNumber.ListNode(1,
                new ConvertBinaryNumber.ListNode(0, new ConvertBinaryNumber.ListNode(0,
                new ConvertBinaryNumber.ListNode(1,new ConvertBinaryNumber.ListNode(1,
                new ConvertBinaryNumber.ListNode(1, new ConvertBinaryNumber.ListNode(0,
                new ConvertBinaryNumber.ListNode(1, new ConvertBinaryNumber.ListNode(1,
                new ConvertBinaryNumber.ListNode(0,new ConvertBinaryNumber.ListNode(0,
                new ConvertBinaryNumber.ListNode(0,new ConvertBinaryNumber.ListNode(0,
                new ConvertBinaryNumber.ListNode(0,new ConvertBinaryNumber.ListNode(0,
                new ConvertBinaryNumber.ListNode(0,new ConvertBinaryNumber.ListNode(0,
                new ConvertBinaryNumber.ListNode(1))))))))))))))))))));
        var result = ConvertBinaryNumber.getDecimalValue(listNode);
        assertEquals(685569, result);
    }

}