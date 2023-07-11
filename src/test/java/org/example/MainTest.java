package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:testApplicationContext.xml")
public class MainTest {

	@Autowired
	SomeBo someBo;

	@Test
	public void test() {
		assertThat(someBo).isNotNull();
		System.out.println(someBo);
	}
}
