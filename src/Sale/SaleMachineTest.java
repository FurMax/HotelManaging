package Sale;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SaleMachineTest {
    private SaleMachine saleMachine=new SaleMachine();



    @Test
    public void test1() {
        assertEquals("请取走beer",saleMachine.sale("beer", 5));
        assertEquals("请取走orange",saleMachine.sale("orange", 5));
        assertEquals("请取走beer",saleMachine.sale("beer", 10));
        assertEquals("请取走orange",saleMachine.sale("orange", 10));
        assertEquals("请取走beer",saleMachine.sale("beer", 5));
        assertEquals("请取走beer",saleMachine.sale("beer", 5));
        assertEquals("请取走beer",saleMachine.sale("beer", 5));
        assertEquals("很抱歉，没有beer",saleMachine.sale("beer", 5));
        assertEquals("请取走orange",saleMachine.sale("orange", 5));
        assertEquals("请取走orange",saleMachine.sale("orange", 5));
        assertEquals("请取走orange",saleMachine.sale("orange", 5));
        assertEquals("很抱歉，没有orange",saleMachine.sale("orange", 5));
        assertEquals("错误指令!",saleMachine.sale("abc",10));
        assertEquals("错误指令!",saleMachine.sale("abc", 5));

    }

    @Test
    public void test2() {
        assertEquals("没有零钱找，退您10元",saleMachine.sale("beer", 10));
        assertEquals("没有零钱找，退您10元",saleMachine.sale("beer", 10));
        assertEquals("没有零钱找，退您10元",saleMachine.sale("beer", 10));
        assertEquals("没有零钱找，退您10元",saleMachine.sale("beer", 10));
        assertEquals("没有零钱找，退您10元",saleMachine.sale("orange", 10));
        assertEquals("没有零钱找，退您10元",saleMachine.sale("orange", 10));

    }



}