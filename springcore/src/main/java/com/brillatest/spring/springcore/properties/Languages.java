package com.brillatest.spring.springcore.properties;

import java.util.Properties;

public class Languages {
	private Properties languages;

	public Properties getLanguages() {
		return languages;
	}

	public void setLanguages(Properties languages) {
		this.languages = languages;
	}

	@Override
	public String toString() {
		return "Languages [languages=" + languages + "]";
	}
}
