package Sale;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SaleMachineTest {
    private SaleMachine saleMachine=new SaleMachine();



    @Test
    public void test1() {
        assertEquals("��ȡ��beer",saleMachine.sale("beer", 5));
        assertEquals("��ȡ��orange",saleMachine.sale("orange", 5));
        assertEquals("��ȡ��beer",saleMachine.sale("beer", 10));
        assertEquals("��ȡ��orange",saleMachine.sale("orange", 10));
        assertEquals("��ȡ��beer",saleMachine.sale("beer", 5));
        assertEquals("��ȡ��beer",saleMachine.sale("beer", 5));
        assertEquals("��ȡ��beer",saleMachine.sale("beer", 5));
        assertEquals("�ܱ�Ǹ��û��beer",saleMachine.sale("beer", 5));
        assertEquals("��ȡ��orange",saleMachine.sale("orange", 5));
        assertEquals("��ȡ��orange",saleMachine.sale("orange", 5));
        assertEquals("��ȡ��orange",saleMachine.sale("orange", 5));
        assertEquals("�ܱ�Ǹ��û��orange",saleMachine.sale("orange", 5));
        assertEquals("����ָ��!",saleMachine.sale("abc",10));
        assertEquals("����ָ��!",saleMachine.sale("abc", 5));

    }

    @Test
    public void test2() {
        assertEquals("û����Ǯ�ң�����10Ԫ",saleMachine.sale("beer", 10));
        assertEquals("û����Ǯ�ң�����10Ԫ",saleMachine.sale("beer", 10));
        assertEquals("û����Ǯ�ң�����10Ԫ",saleMachine.sale("beer", 10));
        assertEquals("û����Ǯ�ң�����10Ԫ",saleMachine.sale("beer", 10));
        assertEquals("û����Ǯ�ң�����10Ԫ",saleMachine.sale("orange", 10));
        assertEquals("û����Ǯ�ң�����10Ԫ",saleMachine.sale("orange", 10));

    }



}