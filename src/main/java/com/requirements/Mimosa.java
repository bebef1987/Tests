package com.requirements;

import net.thucydides.core.annotations.Feature;

public class Mimosa {

	@Feature
	public class Login {
		public class LoginValid{}
	}
	
	@Feature
	public class HomePage{
		public class Products{}
		public class Cloud{}
		public class Support{}
		public class Buy{}
	}
	@Feature
	public class Cloud{
		public class Unclock{}
		public class Design{}
		public class Manage{}
	}
}
