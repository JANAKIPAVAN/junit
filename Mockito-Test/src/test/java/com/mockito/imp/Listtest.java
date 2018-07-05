package com.mockito.imp;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class Listtest {

	@Test
	public void LetsMockListSizeMethod() {
		List listmock =mock(List.class);
		when(listmock.size()).thenReturn(2);
		assertEquals(2,listmock.size());
		assertEquals(2,listmock.size());
		assertEquals(2,listmock.size());
	}
	@Test
	public void ReturnMultipleValues() {
		List listmock =mock(List.class);
		when(listmock.size()).thenReturn(2).thenReturn(3);
		assertEquals(2,listmock.size());
		assertEquals(3,listmock.size());
		
	}
	@Test
	public void LetsMockListGet() {
		List listmock =mock(List.class);
		when(listmock.get(0)).thenReturn("janaki_pavan");
		assertEquals("janaki_pavan",listmock.get(0));
		assertEquals(null,listmock.get(1));
		
	}


}
