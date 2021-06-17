package MyTestingDemo;

import hotel.IData;
import hotel.InHotel;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InHotelMockTestDemo {

	
    private Mockery context=new Mockery();
    private IData iData=null;
    private InHotel ih=null;
	
    @Before
    public void setUp() throws Exception{
   	 iData=context.mock(IData.class);
   	 ih=new InHotel(iData);
  
   	 context.checking(new Expectations(){{
   		allowing(iData).in_Out_Room(901, "Marry");
   		will(onConsecutiveCalls(returnValue("Marry成功入住901房间！"),returnValue("该房间已经有人入住")));
   		 }});
     }
    @Test
	public void testIn() {
        
		assertEquals("Marry成功入住901房间！",ih.in(901, "Marry"));
		assertEquals("该房间已经有人入住",ih.in(901, "Marry"));
	}
}
