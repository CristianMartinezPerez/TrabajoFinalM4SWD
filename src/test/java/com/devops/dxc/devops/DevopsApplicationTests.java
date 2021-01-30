package com.devops.dxc.devops;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.devops.dxc.devops.model.Dxc;
import com.devops.dxc.devops.model.Util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.web.reactive.server.WebTestClient.ResponseSpec;

@SpringBootTest
class DevopsApplicationTests {

	 @Test
	 void contextLoads() {
		 return;
	 }

    @DisplayName("ahorro = 5000000, sueldo 1000000")
	@Test
	void Retirar150UF() {

		Dxc res = new Dxc(5000000, 1000000);
		int mi10 = res.getDxc();

		int esperado = 150* Util.getUf();

		assertEquals(esperado, mi10);
		return;
	}

	@DisplayName("ahorro = 6000000, sueldo 2500000, paga Impuesto")
	@Test
	void PagaImpuesoCaso1() {

		Dxc res = new Dxc(6000000, 2500000);
		int mi10 = res.getDxc();
		
		
		int imp = res.getImpuesto();

		System.out.println("impuesto=" + imp);
		assertTrue("Error en Impuesto", imp > 0);
		return;
	}

	

}
