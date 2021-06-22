package com.darrenforsythe.configurationpropertiesexample;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "properties")
public class MyProperties {



	private Map<String, Person>  someobject = new HashMap<>();

    public static class Person {
        /** Name of the Person */
        private String name;
        /** Address of the Person */
        private String address;
        /** Phone Number of the Person */
        private String phone;

		String getName() {
			return name;
		}

		void setName(String name) {
			this.name = name;
		}

		String getAddress() {
			return address;
		}

		void setAddress(String address) {
			this.address = address;
		}

		String getPhone() {
			return phone;
		}

		void setPhone(String phone) {
			this.phone = phone;
		}

		@Override
		public String toString() {
			return "Person{" +
					"name='" + name + '\'' +
					", address='" + address + '\'' +
					", phone='" + phone + '\'' +
					'}';
		}
	}

	Map<String, Person> getSomeobject() {
		return someobject;
	}

	void setSomeobject(Map<String, Person> someobject) {
		this.someobject = someobject;
	}

	@Override
	public String toString() {
		return "MyProperties{" +
				"someobject=" + someobject +
				'}';
	}
}
