package explore;

import org.testng.annotations.Factory;

public class TestFactory {
	@Factory
	public Object[] aaFactory(){
		return new Object[]{new TestFactoryCase(1),new TestFactoryCase(2)};
	}
}
