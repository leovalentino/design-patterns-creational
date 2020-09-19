package br.com.factorymethod;

public class WebSiteFactory {

	public static WebSite getWebSite(WebsiteType siteType) {
		switch (siteType) {
			case BLOG: {
				return new Blog();
			}
	
			case SHOP: {
				return new Shop();
			}
			default: {
				return null;
			}
		}

	}
}
